import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

//import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.charly.j8PlusTechs.JSE8PlusBasicCodingSampleByCharlySan;


class JSE8PlusBasicCodingSampleByCharlySanTest {

    //private final ClassToTest classToTest = new ClassToTest();

	JSE8PlusBasicCodingSampleByCharlySan classToTest;
	
	@BeforeEach
	void allTestInit() {
		classToTest = new JSE8PlusBasicCodingSampleByCharlySan();
	}
	
	/*	
	@Test
	void testIsPalByCharlySan_basicCase() {
		char []cArr = {'h', 'e', 'l', 'l', 'o'}; //char []cArr = {'s','o','s'};
		assertFalse(classToTest.isPalByCharlySan(cArr));
		
	}
	*/
	
	@ParameterizedTest
	@MethodSource("casosDePrueba")
	void testIsPalByCharlySan_AllCases(char[] cArr, boolean esperado) {
	  	boolean resultado = classToTest.isPalByCharlySan(cArr);
	    assertTrue(resultado == esperado);
	 }

	 
	
	static Stream<Arguments> casosDePrueba() {
	        return Stream.of(
	            Arguments.of(new char[] {'s', 'o', 's'},  true),
	            Arguments.of(new char[] {'r', 'a', 'd', 'a', 'r'},  true),
	            Arguments.of(new char[] {'h', 'e', 'l', 'l', 'o'},  false)
	        );
	    }

	
}
