import org.junit.Assert;
import org.junit.Test;

public class TesteJUnit {

	Cadastro cadastro = new Cadastro();
	
	
	@Test 
	public void cadastro () {
		Assert.assertEquals(cadastro.cliente(), "Marcos");
		Assert.assertEquals(cadastro.anuncio(), "Novo");
		
			
		
	}
	
	}
		 