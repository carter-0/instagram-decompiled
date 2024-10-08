package X;

/* renamed from: X.Gp9  reason: case insensitive filesystem */
public final class C53477Gp9 extends AnonymousClass0T0 implements C299575vQ {
    public final C299505vJ A00;
    public final Integer A01;
    public final boolean A02;
    public final AnonymousClass9IC A03;
    public final C61082JwK A04 = new C61082JwK((N49) null, 2, true);
    public final String A05;

    public C53477Gp9(AnonymousClass9IC r6, C299505vJ r7, Integer num, boolean z) {
        this.A00 = r7;
        this.A03 = r6;
        this.A02 = z;
        this.A01 = num;
        this.A05 = C299615vU.A01(this, "tombstone", r7.A03);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53477Gp9) {
                C53477Gp9 gp9 = (C53477Gp9) obj;
                if (!0qQ.A0K(this.A00, gp9.A00) || !0qQ.A0K(this.A03, gp9.A03) || this.A02 != gp9.A02 || this.A01 != gp9.A01) {
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
        return this.A00;
    }

    public final C61082JwK CFL() {
        return this.A04;
    }

    public final int hashCode() {
        String str;
        int A09 = AnonymousClass7TF.A09(this.A02, AnonymousClass7TF.A07(this.A03, AnonymousClass7TE.A0K(this.A00)));
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "ReplyNotAvailable";
                break;
            case 2:
                str = "PostHidden";
                break;
            case 3:
                str = "PostHiddenTifu";
                break;
            case 4:
                str = "PostReportedTifu";
                break;
            case 5:
                str = "PostHiddenTifu1x1";
                break;
            case 6:
                str = "PostReportedTifu1x1";
                break;
            case 7:
                str = "ReplyHushed";
                break;
            default:
                str = "PostNotAvailable";
                break;
        }
        return A09 + C51966G9m.A04(str, intValue);
    }
}
