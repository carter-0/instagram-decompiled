package X;

/* renamed from: X.ASb  reason: case insensitive filesystem */
public final class C40113ASb implements 2Kw {
    public final /* synthetic */ C62320sa A00;

    public C40113ASb(C62320sa r1) {
        this.A00 = r1;
    }

    public final void invoke(Throwable th) {
        0f9 AEf = 0wj.A01.AEf("Ad eligibility query ValidateNewIgMediaForAdsEligibilityQuery failed", 652426058);
        String message = th.getMessage();
        if (message == null) {
            message = "null";
        }
        AEf.ABQ("error_message", message);
        this.A00.invoke();
    }
}
