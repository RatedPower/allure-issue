package com;

import io.qameta.allure.Feature;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.fail;

@Feature("AAAParameterized")
class AParameterizedTests {


	private static Stream<Arguments> aaaParamTest() {
		List<ParameterizedRecord> configurators =
				List.of(new ParameterizedRecord("First Test"), new ParameterizedRecord("Second test"),
						new ParameterizedRecord("Third test"));

		return configurators.stream().map(Arguments::of);
	}

	@ParameterizedTest
	@MethodSource
	void aaaParamTest(ParameterizedRecord parameterizedRecord, TestInfo testInfo) {
		if(testInfo.getDisplayName().contains("First")) {
			fail("Big test fails");
		}

	}

	private record ParameterizedRecord(String testName) {

		@Override
		public String toString() {
			return testName;
		}
	}


}
