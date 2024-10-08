package X;

import com.facebook.proxygen.HTTPClient;

/* renamed from: X.Som  reason: case insensitive filesystem */
public final /* synthetic */ class C12197Som implements HTTPClient.UnexpectedErrorReporter {
    public final /* synthetic */ SRB A00;

    public /* synthetic */ C12197Som(SRB srb) {
        this.A00 = srb;
    }

    public final void report(String str, String str2) {
        0f9 AEf = 0wj.A01.AEf(str, 879363050);
        AEf.ABQ("error", str2);
        AEf.report();
    }
}
