package bootcamp;

public class FootToInchesConverter implements InchConverter {

    public Measurement convert(int length) {
        return new Measurement(length * 12, Unit.INCH);
    }
}
