package X;

import android.content.Context;

/* renamed from: X.Glm  reason: case insensitive filesystem */
public final class C53300Glm extends AnonymousClass0T0 {
    public final int A00;
    public final Context A01;
    public final 1Xj A02;
    public final AnonymousClass4DU A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53300Glm) {
                C53300Glm glm = (C53300Glm) obj;
                if (!0qQ.A0K(this.A02, glm.A02) || !0qQ.A0K(this.A04, glm.A04) || this.A07 != glm.A07 || this.A00 != glm.A00 || !0qQ.A0K(this.A01, glm.A01) || !0qQ.A0K(this.A03, glm.A03) || !0qQ.A0K(this.A06, glm.A06) || !0qQ.A0K(this.A05, glm.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A07;
        return (((((AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A09(z, (AnonymousClass7TE.A0K(this.A02) + AnonymousClass7TG.A0E(this.A04)) * 31) + this.A00) * 31)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + C41845B3m.A00(this.A05)) * 31) + C54732HQn.A00();
    }

    public C53300Glm(Context context, 1Xj r2, AnonymousClass4DU r3, String str, String str2, String str3, int i, boolean z) {
        this.A02 = r2;
        this.A04 = str;
        this.A07 = z;
        this.A00 = i;
        this.A01 = context;
        this.A03 = r3;
        this.A06 = str2;
        this.A05 = str3;
    }
}
