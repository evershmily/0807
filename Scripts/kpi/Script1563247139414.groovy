import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hr.aetest.bwae.org/kpi-salary-ui/#/')

WebUI.setText(findTestObject('kpi/2/Page_/input__el-input__inner'), oaid)

WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/div_                                         010-68317777-7568 wangttbw30com'))

not_run: WebUI.verifyElementPresent(findTestObject('kpi/new2/Page_/div_'), 1)

try {
    WebUI.delay(6)

    WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/div_guanli'))

    not_run: WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/div_'))

    WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/a_'))

    WebUI.setText(findTestObject('Object Repository/kpi/new2/Page_/input__el-input__inner_23'), name)

    WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/span_'))

    WebUI.verifyElementPresent(findTestObject('kpi/new2/Page_/div_yanzheng'), 0)

    WebUI.getText(findTestObject('kpi/new2/Page_/div_yanzheng'))

    WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/a__1'))

    WebUI.setEncryptedText(findTestObject('Object Repository/kpi/new2/Page_/input__el-input__inner_24'), 'aeHFOx8jV/A=')

    WebUI.click(findTestObject('Object Repository/kpi/new2/Page_/span_ (1)'))

    WebUI.closeBrowser()
}
catch (Exception e) {
    println(e)

    WebUI.closeBrowser()
} 

