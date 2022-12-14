package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.HowToUseLocators;
import util.screens.BaseScreen;

import static io.appium.java_client.pagefactory.LocatorGroupStrategy.ALL_POSSIBLE;


public class AddPlanScreen extends BaseScreen {

    /**
     * Constructor method.
     * @author Hans.Marquez
     * @param driver : AndroidDriver
     */

    public AddPlanScreen(AndroidDriver<AndroidElement> driver) {
        super(driver);
    }

    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"com.disney.wdpro.dlr:id/tab_animated_icon\")")
    private AndroidElement addPlanButton;
    @AndroidFindBy(uiAutomator = "UiSelector().resourceId(\"com.disney.wdpro.dlr:id/actionSheetListView\")")
    private AndroidElement listOfPlanOptions;
    @AndroidFindBy(uiAutomator = "UiSelector().className(\"android.widget.FrameLayout\").descriptionContains(\"Check Dining Availability\")")
    private AndroidElement diningAvailability;

    /**
     * @author Zeus.Vargas
     * Click button to Add Plan when if it is displayed in the screen.
     */
    public void clickAddPlan(){
        click(addPlanButton);
    }
    /**
     * @author Zeus.Vargas
     * return true if List Of Plan Options element is displayed in screen, otherwise false.
     */
    public boolean isListOfPlanOptionsDisplayed(){
        return this.isElementAvailable(listOfPlanOptions);
    }
    /**
     * @author Zeus.Vargas
     * return true if Dining Availability element is displayed in screen, otherwise false.
     */
    public boolean isDiningAvailabilityDisplayed(){
        return this.isElementAvailable(diningAvailability);
    }


}


