package io.github.asw.i3a.agentWebClient.types;

import static org.junit.Assert.assertTrue;
import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import TestKit.UnitTest;
import io.github.asw.i3a.agentsWebClient.types.Operator;
import pl.pojo.tester.api.assertion.Method;

@Category(UnitTest.class)
public class OperatorTest {

	@Test
	public void allPropertiesTest() {
		assertPojoMethodsFor(Operator.class).testing(Method.GETTER, Method.SETTER, Method.EQUALS, Method.HASH_CODE,
				Method.TO_STRING, Method.CONSTRUCTOR).areWellImplemented();
	}

	@Test
	public void extraTest() {
		Operator op = new Operator();
		Operator op2 = new Operator();
		assertTrue(op.canEquals(op2));
	}

}
