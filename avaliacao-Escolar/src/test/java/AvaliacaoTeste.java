import br.com.gilmar.Avaliacao;
import br.com.gilmar.ValoresInvalidosException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AvaliacaoTeste {

    private Avaliacao avaliacao;

    @Before
    public void setup(){
        avaliacao = new Avaliacao();
    }
/*
    //CT01
    @Test
    public void testaQuantidadeParametrosMenorQuatro(){
        String resultado = avaliacao.avalia(7.0, 6.0, 5);
    }

    //CT02
    @Test
    public void testaQuantidadeParametrosMaiorQuatro(){
        String resultado = avaliacao.avalia(7.0, 6.0, 5, 96, 48);
    }
 */

    //CT03
    @Test
    public void testaNota1MenorZero(){
        try{
            String resultado = avaliacao.avalia(-7.0, 6.0, 5.0, 96.0);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }

    }

    //CT04
    @Test
    public void testaNota1MaiorDez(){
        try{
            String resultado = avaliacao.avalia(11.0, 6.0, 5.0, 96.0);
        }catch (Exception e){
            Assert.assertTrue(e instanceof ValoresInvalidosException);
        }

    }
}
