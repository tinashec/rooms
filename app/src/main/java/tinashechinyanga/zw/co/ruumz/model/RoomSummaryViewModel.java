package tinashechinyanga.zw.co.ruumz.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import tinashechinyanga.zw.co.ruumz.entity.RoomSummaryEntity;
import tinashechinyanga.zw.co.ruumz.repository.RoomSummaryRepository;

public class RoomSummaryViewModel extends AndroidViewModel {
    //variable to hold a reference to repository
    private RoomSummaryRepository roomSummaryRepository;
    //LiveData variable to cache list of words
    private LiveData<List<RoomSummaryEntity>> mAllRooms;

    public RoomSummaryViewModel(@NonNull Application application) {
        super(application);
    }
}
