package ua.napps.scorekeeper.counters;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface CountersDao {

    @Query("DELETE FROM counters")
    void deleteAll();

    @Delete
    void deleteCounter(Counter counter);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Counter counter);

    @Query("SELECT * FROM counters")
    LiveData<List<Counter>> loadAllCounters();

    @Query("SELECT * FROM counters")
    List<Counter> loadAllCountersSync();

     @Query("SELECT COUNT(*) FROM counters")
    int count();

    @Query("select * from counters where id = :counterId")
    LiveData<Counter> loadCounter(int counterId);

        @Query("select * from counters where id = :counterId")
    Counter loadCounterSync(int counterId);

    @Query("UPDATE counters " + "SET color = :hex WHERE id = :counterId")
    void modifyColor(int counterId, String hex);

    @Query("UPDATE counters " + "SET defaultValue = :defaultValue WHERE id = :counterId")
    void modifyDefaultValue(int counterId, int defaultValue);

    @Query("UPDATE counters " + "SET name = :counterName WHERE id = :counterId")
    void modifyName(int counterId, String counterName);

    @Query("UPDATE counters " + "SET step = :step WHERE id = :counterId")
    void modifyStep(int counterId, int step);

    @Query("UPDATE counters SET value =(value +:difference) WHERE id ==:counterId")
    void modifyValue(int counterId, int difference);

    @Query("UPDATE counters " + "SET value = defaultValue")
    void resetValues();

    @Query("UPDATE counters " + "SET value = :value WHERE id = :counterId")
    void setValue(int counterId, int value);
}