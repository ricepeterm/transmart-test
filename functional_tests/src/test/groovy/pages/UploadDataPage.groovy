package pages

import geb.Page
import geb.waiting.WaitTimeoutException
import geb.navigator.Navigator

import pages.modules.CommonHeaderModule

import static org.hamcrest.MatcherAssert.assertThat
import static org.hamcrest.Matchers.contains

//import org.openqa.selenium.WebElement

class UploadDataPage extends Page {

    public static final String HEADER_TAB_NAME = 'Upload Data'

    static url = 'uploadData/index'

    static at = {
        commonHeader.headerTab()?.text() == HEADER_TAB_NAME
    }

    static content = {
        uploadData(wait: true) { $() }

        commonHeader { module CommonHeaderModule }
    }
    
}

