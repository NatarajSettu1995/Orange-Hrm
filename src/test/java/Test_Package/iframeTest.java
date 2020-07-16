package Test_Package;

import org.testng.annotations.Test;

import BasePackage.BasePage;
import Object_Page_Package.iframeObject;

public class iframeTest{

	
BasePage b;
iframeObject i;
	public iframeTest() {
		b=new BasePage();
		i=new iframeObject();
	}

	/*@Test
	public void iframe()
	{
	b.iframeSingleM(0, null);	
	i.FirstClickButton.click();
	b.ParentFrame();
	b.iframeSingleM(1, "frame2");
	i.SecondClickButton.click();
	
	}*/
	
	/*@Test
	public void Windows()
	{
		i.MultiButton.click();
		//b.WindowsCount();
		//b.WindowSwitch(2);
		//b.WindowSwitch(1);
		b.WindowSwitchM2(2);
	}*/
	
	@Test
	public void DragAndDrop()
	{
		//b.dragANDdrop(i.Drag, i.Drop);
		//b.TextBoxWithSendKey(i.Auto, "se");
		//b.SelectValuemultiDropDownWithoutSelect(i.Selectable, 0, 1);
		//b.SelectValuemultiDropDownWithoutSelect(i.Selectable, 3, 4);
		//b.SelectValuemultiDropDownWithoutSelect(i.Selectable, 5, 6);
		//b.SelectValueMultiSelectDropDownWithoutSelect1(i.Selectable, 0, 6);
		//b.SelectValuemultiDropDownWithoutSelect(i.Selectable, 3, 6);
		b.RitrivalAllValueFromDropDownlWithoutSelect(i.Sortable);
		b.Sortable(i.Sortable, 0, 3);
		System.out.println("After change");
		b.RitrivalAllValueFromDropDownlWithoutSelect(i.Sortable);
		//b.Sortable(i.Sortable, 5, 3);
	}
	
	
}
