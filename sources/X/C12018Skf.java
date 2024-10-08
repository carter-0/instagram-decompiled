package X;

/* renamed from: X.Skf  reason: case insensitive filesystem */
public final class C12018Skf implements C13546TcI {
    public final /* synthetic */ C10184Ro0 A00;
    public final /* synthetic */ C9220RTx A01;

    public C12018Skf(C10184Ro0 ro0, C9220RTx rTx) {
        this.A01 = rTx;
        this.A00 = ro0;
    }

    public final void onLog(String str) {
        S3A s3a;
        if (!AnonymousClass5He.A00(str) && str.startsWith("IXLoadingListenerDomContentLoaded:") && (s3a = this.A00.A00.A00) != null) {
            s3a.A00.execute(new TB3(s3a));
        }
    }
}
