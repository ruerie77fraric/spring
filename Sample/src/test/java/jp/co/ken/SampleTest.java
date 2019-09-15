package jp.co.ken;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SampleTest {

	@Test
	public void test01() throws Exception {
		System.out.println("test");

		try {
			List<String> a = new ArrayList<>();
		} catch (Exception ex) {
			throw new Exception();
		}
	}
}
