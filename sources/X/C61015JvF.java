package X;

/* renamed from: X.JvF  reason: case insensitive filesystem */
public final class C61015JvF extends AnonymousClass0T0 {
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C61015JvF) {
                C61015JvF jvF = (C61015JvF) obj;
                if (!0qQ.A0K(this.A02, jvF.A02) || !0qQ.A0K(this.A00, jvF.A00) || !0qQ.A0K(this.A01, jvF.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        return 002.A14("StackedTimelineAction(target=", this.A02, ", action=", this.A00, ", surfaceElement=", this.A01, ')');
    }

    public static void A00(C379469Ua r2, String str, String str2) {
        r2.A01.add(new C61015JvF(str, str2, "STACKED_TIMELINE"));
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A08(this.A00, AnonymousClass7TE.A0O(this.A02)));
    }

    public C61015JvF(String str, String str2, String str3) {
        AnonymousClass7TG.A1U(str, str2, str3);
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }
}
