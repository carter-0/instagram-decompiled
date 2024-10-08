package X;

/* renamed from: X.6sp  reason: invalid class name and case insensitive filesystem */
public final class C320716sp implements C232262tL, C320726sq {
    public boolean A00;
    public boolean A01;
    public final C52320GNm A02;
    public final C267324bN A03;
    public final C56078HsR A04;
    public final String A05;

    public C320716sp(C52320GNm gNm, C267324bN r3, C56078HsR hsR) {
        String str;
        0qQ.A0B(r3, 1);
        this.A03 = r3;
        this.A04 = hsR;
        this.A02 = gNm;
        1Xj r0 = r3.A02;
        if (r0 != null) {
            str = r0.A2n();
        } else {
            str = null;
        }
        this.A05 = str;
    }

    public final int Bry() {
        return 0;
    }

    public final boolean CbS() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C52320GNm gNm;
        C52320GNm gNm2;
        C320716sp r4 = (C320716sp) obj;
        0qQ.A0B(r4, 0);
        if (!0qQ.A0K(this.A05, r4.A05) || (((gNm = this.A02) != null && (gNm2 = r4.A02) != null && !gNm.equals(gNm2)) || !0qQ.A0K(this.A04, r4.A04) || this.A01 != r4.A01 || this.A00 != r4.A00)) {
            return false;
        }
        return true;
    }

    public final boolean isEnabled() {
        return this.A00;
    }

    public final void Ejf(boolean z, int i) {
        this.A01 = z;
    }
}
