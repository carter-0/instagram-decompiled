package X;

import java.util.List;

/* renamed from: X.7eO  reason: invalid class name and case insensitive filesystem */
public final class C336297eO implements C337257fy, C337237fw {
    public C337237fw A00;
    public Object A01;
    public Object A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass4D6 A05;
    public final C336287eN A06;
    public final C337257fy A07;
    public final boolean A08;
    public final Object A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0046, code lost:
        if (r7.CWX() == false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C336297eO(X.AnonymousClass4D6 r5, X.C336287eN r6, X.C337257fy r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            r3 = 1
            r4.<init>()
            r4.A05 = r5
            r4.A07 = r7
            r4.A06 = r6
            r4.A08 = r8
            java.lang.String r0 = r7.BiY()
            r4.A03 = r0
            java.lang.Object r0 = r6.ARG()
            r4.A02 = r0
            java.lang.Object r0 = r7.B3J()
            r4.A09 = r0
            java.lang.String r0 = r7.BjE()
            r4.A0A = r0
            java.lang.String r0 = r7.BnF()
            r4.A0B = r0
            java.util.List r0 = r7.Bqo()
            r4.A0C = r0
            r2 = 1
            boolean r1 = r7.CT5()
            r0 = 0
            if (r1 != r3) goto L_0x0039
            r0 = 1
        L_0x0039:
            r4.A0E = r0
            boolean r0 = r4.isLoading()
            if (r0 != 0) goto L_0x0048
            boolean r1 = r7.CWX()
            r0 = 1
            if (r1 != 0) goto L_0x0049
        L_0x0048:
            r0 = 0
        L_0x0049:
            r4.A0F = r0
            boolean r0 = r7.BBY()
            if (r0 == r3) goto L_0x0052
            r2 = 0
        L_0x0052:
            r4.A0D = r2
            if (r9 == 0) goto L_0x005b
            java.lang.String r0 = ""
            r4.EhX(r0)
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C336297eO.<init>(X.4D6, X.7eN, X.7fy, boolean, boolean):void");
    }

    public final void ERO(List list) {
    }

    public final String Amq() {
        return null;
    }

    public final Object B3J() {
        return this.A09;
    }

    public final boolean BBY() {
        return this.A0D;
    }

    public final String BiY() {
        return this.A03;
    }

    public final String BjE() {
        return this.A0A;
    }

    public final String BnF() {
        return this.A0B;
    }

    public final Object Bo1() {
        return this.A02;
    }

    public final List Bqo() {
        return this.A0C;
    }

    public final boolean CT5() {
        return this.A0E;
    }

    public final boolean CWX() {
        return this.A0F;
    }

    public final boolean CYL() {
        return false;
    }

    public final void DDU() {
        this.A07.DDU();
    }

    public final void Dam(C337257fy r4) {
        C337257fy r2 = this.A07;
        if (0qQ.A0K(r2.BiY(), this.A03)) {
            this.A02 = this.A06.AIL(this.A01, r2.Bo1());
            C337237fw r0 = this.A00;
            if (r0 != null) {
                r0.Dam(this);
            }
        }
    }

    public final void EJE() {
        this.A07.EJE();
    }

    public final void EcJ(C337237fw r2) {
        if (this.A00 != r2) {
            this.A00 = r2;
            if (r2 != null) {
                r2.Dam(this);
            }
        }
    }

    public final void EhX(String str) {
        this.A03 = str;
        this.A01 = null;
        if ((str == null || str.length() == 0) && !this.A08) {
            this.A07.EhX(str);
            return;
        }
        this.A04 = true;
        this.A05.schedule(new C336307eP(this, str));
    }

    public final boolean isLoading() {
        if (this.A04 || this.A07.isLoading()) {
            return true;
        }
        return false;
    }
}
