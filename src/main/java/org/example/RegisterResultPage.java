package org.example;

public class RegisterResultPage extends Utils{

    public void verifyUserHasBeenRegisteredSuccessfully() {
        // to verify using method wait for url to be on webpage and its wait until 10 second before that going next page
        waitForUrlToBe("https://demo.nopcommerce.com/registerresult/1?returnUrl=/", 10);

//        https://demo.nopcommerce.com/
//        "https://demo.nopcommerce.com/registerresult/1?returnUrl=/"




    }
}
