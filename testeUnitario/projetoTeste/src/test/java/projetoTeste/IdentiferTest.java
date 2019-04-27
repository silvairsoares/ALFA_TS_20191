package projetoTeste;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import src.Identifier;

public class IdentiferTest {

	private Identifier id;
	@Before
	public void setUp() throws Exception {
		id = new Identifier();
	}

	//testar um identificador começando com dígito.
	@Test
	public void testarIdentificadorComecandoComDigito() {
		Assert.assertFalse(id.validateIdentifier("1ABC"));
	}

}
