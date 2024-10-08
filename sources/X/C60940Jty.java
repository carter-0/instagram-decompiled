package X;

import android.content.Context;

/* renamed from: X.Jty  reason: case insensitive filesystem */
public final class C60940Jty extends AnonymousClass0T0 {
    public final long A00;
    public final Context A01;
    public final String A02;
    public final String A03;
    public final 0sP A04;
    public final boolean A05;

    public C60940Jty(Context context, String str, String str2, 0sP r5, long j, boolean z) {
        C51973G9u.A0r(3, context, str2, r5);
        this.A00 = j;
        this.A03 = str;
        this.A01 = context;
        this.A02 = str2;
        this.A04 = r5;
        this.A05 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60940Jty) {
                C60940Jty jty = (C60940Jty) obj;
                if (this.A00 != jty.A00 || !0qQ.A0K(this.A03, jty.A03) || !0qQ.A0K(this.A01, jty.A01) || !0qQ.A0K(this.A02, jty.A02) || !0qQ.A0K(this.A04, jty.A04) || this.A05 != jty.A05) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return DbS.A06(this.A05, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A08(this.A03, C51975G9x.A03(this.A00))))));
    }
}
