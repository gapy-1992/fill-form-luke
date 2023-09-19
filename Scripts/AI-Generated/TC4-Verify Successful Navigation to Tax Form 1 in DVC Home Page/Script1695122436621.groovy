import com.kms.katalon.core.model.FailureHandling
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

'step 1: Do navigate at Page_dvc-home_tax-form1'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/dvc-home/tax-form1')

'step 2: At Page_dvc-home_tax-form1 input on input_object'

testObj = findTestObject('Object Repository/Page_dvc-home/input_object_7')

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.verifyElementPresent(testObj, 20, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyMatch(WebUI.getUrl(), '.*/dvc-home/.*(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(testObj, var_1_input_object_7)

'step 3: Add visual checkpoint at Page_dvc-home_tax-form1'

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Verify Successful Navigation to Tax Form 1 in DVC Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}
