import com.javatunes.billing.Location;
import com.javatunes.billing.TaxCalculator;
import org.junit.Test;

public class TaxCalculatorFactory {

    @Test
    public void getTaxCalculator_shouldReturnSameInstance_multipleInvocations() {
        TaxCalculator calc1 = com.javatunes.billing.TaxCalculatorFactory.getTaxCalculator(Location.ONLINE);
        TaxCalculator calc2 = com.javatunes.billing.TaxCalculatorFactory.getTaxCalculator(Location.ONLINE);

        // prove that a referance to the same object
        assertSame(calc1,calc2);
    }

    private void assertSame(TaxCalculator calc1, TaxCalculator calc2) {
    }
}
