package X;

import com.instagram.api.schemas.ThreadHeaderStyle;

/* renamed from: X.Gp8  reason: case insensitive filesystem */
public final class C53476Gp8 extends AnonymousClass0T0 implements C299575vQ {
    public final int A00;
    public final ThreadHeaderStyle A01;
    public final C299505vJ A02;
    public final String A03;
    public final AnonymousClass9IC A04;
    public final String A05;

    public final /* synthetic */ C61082JwK CFL() {
        return C299615vU.A00();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53476Gp8) {
                C53476Gp8 gp8 = (C53476Gp8) obj;
                if (!0qQ.A0K(this.A02, gp8.A02) || !0qQ.A0K(this.A04, gp8.A04) || !0qQ.A0K(this.A03, gp8.A03) || this.A01 != gp8.A01 || this.A00 != gp8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String BK1() {
        return this.A05;
    }

    public final C299505vJ Be5() {
        return this.A02;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A03, AnonymousClass7TF.A07(this.A04, AnonymousClass7TE.A0K(this.A02))) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00;
    }

    public C53476Gp8(AnonymousClass9IC r2, ThreadHeaderStyle threadHeaderStyle, C299505vJ r4, String str, int i) {
        this.A02 = r4;
        this.A04 = r2;
        this.A03 = str;
        this.A01 = threadHeaderStyle;
        this.A00 = i;
        this.A05 = 002.A0c("threadHeader_", str, i);
    }
}
