import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
"Open Chrome browser"
WebUI.openBrowser('')
"Go to the URL http://demo.guru99.com/v4/"
WebUI.navigateToUrl('http://demo.guru99.com/v4/')
"Input username into Username textbox"
WebUI.setText(findTestObject('Object Repository/Login GURU/Page_Guru99 Bank Home Page/input_UserID_uid'), 'thainhu')
"Input password into Password textbox"
WebUI.setEncryptedText(findTestObject('Object Repository/Login GURU/Page_Guru99 Bank Home Page/input_Password_password'), 
    'aeHFOx8jV/A=')
"Wait 5s"
WebUI.delay(5)
"Take screenshot"
WebUI.takeScreenshot()
"Click on Login  button"
WebUI.click(findTestObject('Object Repository/Login GURU/Page_Guru99 Bank Home Page/input_Password must not be blank_btnLogin'))
"wait 5s"
WebUI.delay(5)
"Take screenshot"
WebUI.takeScreenshot()
"Close browser"
WebUI.closeBrowser()

