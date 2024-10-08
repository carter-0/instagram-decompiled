package X;

/* renamed from: X.Drj  reason: case insensitive filesystem */
public final class C47168Drj extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47168Drj) {
                C47168Drj drj = (C47168Drj) obj;
                if (!0qQ.A0K(this.A01, drj.A01) || this.A00 != drj.A00 || !0qQ.A0K(this.A02, drj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A02, ((AnonymousClass7TG.A0E(this.A01) * 31) + this.A00) * 31);
    }

    public C47168Drj(String str, int i, String str2) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = str2;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FeedbackFromThreadsRowModel(strippedMediaId=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(848));
        A1A.append(this.A00);
        A1A.append(", thUnifiedFeedbackRowTapTargetUrl=");
        A1A.append(this.A02);
        return AnonymousClass7TG.A0p(A1A);
    }
}
