package Object_Page_Package;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BasePage;

public class iframeObject  extends BasePage  {

	public iframeObject() {
		
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//button[@id='Click']")
public WebElement FirstClickButton;
@FindBy(xpath="//button[@id='Click1']")
public WebElement SecondClickButton;


//_=============================================

//WIndows

@FindBy(xpath="//button[@onclick='openWindows()']")
public WebElement MultiButton;

//Drag Drop

@FindBy(xpath="//div[@id='draggable']")
public WebElement Drag;

@FindBy(xpath="//div[@id='droppable']")
public WebElement Drop;


//auto coplete

@FindBy(xpath="//input[@id='tags']")
public WebElement Auto;

//selectable
@FindBys(@FindBy(xpath="//ol[@id='selectable']/li"))
public List<WebElement> Selectable;

//sortable
//ul[@id='sortable']/li
@FindBys(@FindBy(xpath="//ul[@id='sortable']/li"))
public List<WebElement> Sortable;










}
