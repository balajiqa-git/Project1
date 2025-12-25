package a2TestLeaf;

import a2BaseforLeafGround.BaseClassforLeafGround;
import a2PageforLeafGround.PageClass;
import org.testng.annotations.Test;

public class LeafTest extends BaseClassforLeafGround {

    @Test
    public void LeafTest(){

        PageClass pageClass = new PageClass();

        pageClass.dropDownfavorite();
    }
}
