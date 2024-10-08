package X;

/* renamed from: X.8P3  reason: invalid class name */
public final class AnonymousClass8P3 implements C353808Jd {
    public final /* synthetic */ C355048Oj A00;

    public final /* synthetic */ void D4c() {
    }

    public final /* synthetic */ void D4d() {
    }

    public AnonymousClass8P3(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void D4Z(int i) {
        AnonymousClass8BA r3 = this.A00.A0q.A00;
        if (r3.A14.A01.A0J) {
            ((C40317AaC) r3.A1b.get()).A05(new int[]{i}, false, false);
            return;
        }
        C352048Bm r1 = r3.A1U.A00;
        if (r1 != null) {
            r1.A02(i);
        }
        AnonymousClass8BA.A0F(r3, false);
    }

    public final void D4a(int i) {
        C355048Oj r4 = this.A00;
        AnonymousClass8BA r1 = r4.A0q.A00;
        if (r1.A14.A01.A0J) {
            ((C40317AaC) r1.A1b.get()).A05(new int[]{i}, false, true);
        } else {
            AnonymousClass8BA.A08(r1, i);
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5T("has_used_create_mode_colour_wheel", true);
            AR4.apply();
        }
        r4.A0v.setBaseDrawable(r4.A0r.A01());
    }

    public final void D4b() {
        this.A00.A0q.A00.A0e = false;
    }
}
