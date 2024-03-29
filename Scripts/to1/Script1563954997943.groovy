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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://hr.aetest.bwae.org/kpi-salary-ui/#/')

WebUI.setText(findTestObject('Object Repository/kpi/duixiang/Page_/input__el-input__inner'), '526')

WebUI.click(findTestObject('Object Repository/kpi/duixiang/Page_/div_                                         010-68317777-7568 wangttbw30com'))

WebUI.click(findTestObject('Object Repository/kpi/duixiang/Page_/div_'))

WebUI.click(findTestObject('Object Repository/kpi/duixiang/Page_/a_'))

WebUI.setText(findTestObject('Object Repository/kpi/duixiang/Page_/input__el-input__inner_5'), '石鑫')

WebUI.click(findTestObject('Object Repository/kpi/duixiang/Page_/span_'))

WebUI.click(findTestObject('Object Repository/kpi/duixiang/Page_/div__1'))

WebUI.closeBrowser()

WebUI.acceptAlert()

