package X;

import com.facebook.xanalytics.XAnalyticsAdapter;

/* renamed from: X.AVw  reason: case insensitive filesystem */
public final class C40206AVw implements XAnalyticsAdapter {
    public final /* synthetic */ C40101ARn A00;

    public final void cleanup() {
    }

    public final void flush() {
    }

    public final String getStructureSamplingConfig(String str) {
        return "";
    }

    public final void logCounter(String str, double d) {
    }

    public final void logCounter(String str, double d, String str2) {
    }

    public final void logEventBypassSampling(String str, String str2) {
        AnonymousClass7TF.A1H(str, str2);
        logEvent(str, str2, "", false, -1.0d);
    }

    public final boolean shouldLog(String str) {
        return true;
    }

    public C40206AVw(C40101ARn aRn) {
        this.A00 = aRn;
    }

    public final void logEvent(String str, String str2, String str3, boolean z, double d) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        0qQ.A0B(str3, 2);
        this.A00.A03.add(Q21.A00(AnonymousClass7TE.A1L("eventType", AnonymousClass05K.A00), AnonymousClass7TE.A1L("eventName", str), AnonymousClass7TE.A1L("extra", str2), AnonymousClass7TE.A1L("eventExtraKeys", str3), AnonymousClass7TE.A1L("isHiPri", Boolean.valueOf(z)), AnonymousClass7TE.A1L("ts", Double.valueOf(d))));
    }
}
