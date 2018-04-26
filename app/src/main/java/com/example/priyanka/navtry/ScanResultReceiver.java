package com.example.priyanka.navtry;


public interface ScanResultReceiver {
    public void scanResultData(String codeFormat, String codeContent);

    public void scanResultData(NoScanResultException noScanData);
}
/*Reference: http://blog.whomeninja.in/android-barcode-scanner/. */