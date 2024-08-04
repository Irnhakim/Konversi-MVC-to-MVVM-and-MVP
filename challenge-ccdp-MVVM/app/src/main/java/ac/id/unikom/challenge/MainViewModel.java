package ac.id.unikom.challenge;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private final MutableLiveData<String> kilometer = new MutableLiveData<>();
    private final MutableLiveData<String> centimeter = new MutableLiveData<>();
    private double meter;

    public LiveData<String> getKilometer() {
        return kilometer;
    }

    public LiveData<String> getCentimeter() {
        return centimeter;
    }

    public void setMeter(double meter) {
        this.meter = meter;
        convertToKilometer();
        convertToCentimeter();
    }

    private void convertToKilometer() {
        double kilometerValue = meter / 1000;
        kilometer.postValue(String.valueOf(kilometerValue));
    }

    private void convertToCentimeter() {
        double centimeterValue = meter * 100;
        centimeter.postValue(String.valueOf(centimeterValue));
    }
}
