package ac.id.unikom.challenge;

public class MainPresenter {
    private final MainView view;
    private final Meter model;

    public MainPresenter(MainView view, Meter model) {
        this.view = view;
        this.model = model;
    }

    public void onMeterChanged(String meter) {
        double meterValue = Double.parseDouble(meter);
        model.setMeter(meterValue);

        view.showKilometer(model.toKilometer());
        view.showCentimeter(model.toCentimeter());
    }
}
