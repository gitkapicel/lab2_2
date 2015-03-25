package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.*;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class MoneyTest {

	@Test
	public void test_multiply_value_by_other_equel_expected_value() {
		Money t1 = new Money(10,"PLN");
		Money expected = new Money(100,"PLN");
		
		assertThat(t1.multiplyBy(10),is(equalTo(expected)));
	}

}
