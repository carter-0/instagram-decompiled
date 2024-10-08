package com.facebook.smartcapture.docauth;

import com.facebook.smartcapture.diagnostic.DiagnosticInfo;

public interface DocAuthManagerDelegate {
    void onDiagnosticInfoAvailable(DiagnosticInfo diagnosticInfo);

    void onDocAuthResultAvailable(DocAuthResult docAuthResult, int i);
}
