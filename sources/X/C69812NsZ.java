package X;

import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.NsZ  reason: case insensitive filesystem */
public abstract class C69812NsZ {
    public static final void A00(C74547Pwg pwg, String str, Throwable th) {
        0KC.A0F("BugReporterService", str, th);
        0f9 AEf = 0wj.A01.AEf("BugReporterService", 817892340);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str);
        AEf.ERJ(th);
        AEf.report();
        pwg.AVu("upload_service_error", str);
    }
}
