package X;

/* renamed from: X.IEw  reason: case insensitive filesystem */
public final class C56849IEw implements C59662JSh, JLN {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final C287295Zu A04;
    public final C287325Zx A05;
    public final C291605ha A06;
    public final C56155Hti A07;
    public final 0sK A08 = C59383JHk.A00;
    public final 0sK A09 = C59384JHl.A00;
    public final 0sK A0A = C59385JHm.A00;
    public final 0sK A0B = C59382JHj.A00;

    public final /* synthetic */ long ALf(int i, int i2, int i3, int i4, boolean z) {
        if (!z) {
            return AnonymousClass5SF.A04(i, i3, 0, i4);
        }
        return C288985co.A04(i, i3, 0, i4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C56849IEw) {
                C56849IEw iEw = (C56849IEw) obj;
                if (!0qQ.A0K(this.A04, iEw.A04) || !0qQ.A0K(this.A05, iEw.A05) || !C289095d0.A01(this.A01, iEw.A01) || !0qQ.A0K(this.A06, iEw.A06) || !C289095d0.A01(this.A00, iEw.A00) || this.A02 != iEw.A02 || this.A03 != iEw.A03 || !0qQ.A0K(this.A07, iEw.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* synthetic */ C289145d6 E2o(C268004cb r13, int[] iArr, int[] iArr2, C267974cY[] r16, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i3;
        return C51969G9p.A0a(r13, new C58820Iy5(this, r13, iArr2, iArr, r16, i4, i5, i6, i7, i), i2, i7);
    }

    public final /* synthetic */ void E35(C268004cb r7, int[] iArr, int[] iArr2, int i) {
        this.A04.ACQ(r7, r7.getLayoutDirection(), iArr, iArr2, i);
    }

    public C56849IEw(C287295Zu r2, C287325Zx r3, C291605ha r4, C56155Hti hti, float f, float f2, int i, int i2) {
        this.A04 = r2;
        this.A05 = r3;
        this.A01 = f;
        this.A06 = r4;
        this.A00 = f2;
        this.A02 = i;
        this.A03 = i2;
        this.A07 = hti;
    }

    public final /* synthetic */ int ANQ(C267974cY r2) {
        return r2.A0G();
    }

    public final /* synthetic */ int ClO(C267974cY r2) {
        return r2.A0H();
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A05, AnonymousClass7TF.A07(this.A04, 38161)), this.A01);
        return AnonymousClass7TE.A0N(this.A07, (((AnonymousClass7TF.A00(AnonymousClass7TF.A07(this.A06, A002), this.A00) + this.A02) * 31) + this.A03) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FlowMeasurePolicy(isHorizontal=");
        A1A.append(true);
        A1A.append(", horizontalArrangement=");
        A1A.append(this.A04);
        A1A.append(", verticalArrangement=");
        A1A.append(this.A05);
        A1A.append(", mainAxisSpacing=");
        A1A.append(C289095d0.A00(this.A01));
        A1A.append(C273654mx.A00(1058));
        A1A.append(this.A06);
        A1A.append(", crossAxisArrangementSpacing=");
        A1A.append(C289095d0.A00(this.A00));
        A1A.append(", maxItemsInMainAxis=");
        A1A.append(this.A02);
        A1A.append(C273654mx.A00(448));
        A1A.append(this.A03);
        A1A.append(", overflow=");
        return AnonymousClass7TG.A0n(this.A07, A1A);
    }
}
