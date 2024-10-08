package X;

import com.instagram.trials.model.TrialMetricsData;

/* renamed from: X.KaN  reason: case insensitive filesystem */
public final class C62115KaN extends C62872Knm {
    public final C266444Yx A00;
    public final C266444Yx A01;
    public final TrialMetricsData A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62115KaN) {
                C62115KaN kaN = (C62115KaN) obj;
                if (!0qQ.A0K(this.A00, kaN.A00) || !0qQ.A0K(this.A01, kaN.A01) || !0qQ.A0K(this.A02, kaN.A02) || !0qQ.A0K(this.A03, kaN.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A00))) + AnonymousClass7TG.A0E(this.A03);
    }

    public C62115KaN(C266444Yx r1, C266444Yx r2, TrialMetricsData trialMetricsData, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = trialMetricsData;
        this.A03 = str;
    }
}
