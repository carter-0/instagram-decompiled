package X;

/* renamed from: X.Gb8  reason: case insensitive filesystem */
public final class C52696Gb8 extends C267794cD implements AnonymousClass5VD, AnonymousClass5Qr, C268824e3 {
    public C286445Wj A00;
    public boolean A01;

    /* access modifiers changed from: private */
    /* renamed from: A00 */
    public final void Dyp() {
        if (this.A01) {
            this.A01 = false;
            if (this.A08) {
                0rm A11 = C51965G9l.A11();
                GQ7.A02(this, J6M.A00(A11, 27));
                C52696Gb8 gb8 = (C52696Gb8) A11.A00;
                if (gb8 != null) {
                    A01(gb8);
                    return;
                }
                C286405Wf r1 = (C286405Wf) C288795cU.A00(AnonymousClass5YA.A08, this);
                if (r1 != null) {
                    r1.EZO((C286445Wj) null);
                }
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object C9j() {
        return "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    public final /* synthetic */ boolean CNf() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0r1, java.lang.Object] */
    public final void DXw(C304926Ft r3, GWN gwn, long j) {
        if (gwn == GWN.Main) {
            int i = r3.A00;
            if (i == 4) {
                this.A01 = true;
                ? obj = new Object();
                obj.A00 = true;
                GQ7.A03(this, J6M.A00(obj, 28));
                if (obj.A00) {
                    A01(this);
                }
            } else if (i == 5) {
                Dyp();
            }
        }
    }

    public final /* synthetic */ boolean Era() {
        return false;
    }

    public static final void A01(C52696Gb8 gb8) {
        C286445Wj r1;
        0rm A11 = C51965G9l.A11();
        GQ7.A02(gb8, J6M.A00(A11, 30));
        C52696Gb8 gb82 = (C52696Gb8) A11.A00;
        if (gb82 == null || (r1 = gb82.A00) == null) {
            r1 = gb8.A00;
        }
        C286405Wf r0 = (C286405Wf) C288795cU.A00(AnonymousClass5YA.A08, gb8);
        if (r0 != null) {
            r0.EZO(r1);
        }
    }

    public final void A0F() {
        Dyp();
    }

    public final void D0Z() {
        Dyp();
    }
}
