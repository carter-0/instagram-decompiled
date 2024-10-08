package X;

public final class KIN extends 0lr {
    public long A00 = -1;
    public final /* synthetic */ C64300LZa A01;

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z;
        C335417cv r1;
        0qQ.A0B(charSequence, 0);
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A00;
        if (j == -1 || currentTimeMillis - j > 500) {
            this.A00 = currentTimeMillis;
        }
        boolean z2 = false;
        if (i == 0 && i2 == 0 && (i3 == 1 || i3 == 2)) {
            z = true;
        } else {
            z = false;
        }
        C60314JjH jjH = this.A01.A05;
        Object value = jjH.A0F.getValue();
        if (!(!(value instanceof C335417cv) || (r1 = (C335417cv) value) == null || r1.A00 == null)) {
            z2 = true;
        }
        C333747a3 r12 = jjH.A04;
        r12.A03.Epw(charSequence);
        r12.A02.Epw(charSequence.toString());
        if (z) {
            AnonymousClass7TE.A1Z(new C59673JTe((Object) jjH, (AnonymousClass4D7) null, 13, z2), C318116oQ.A00(jjH));
        }
    }

    public KIN(C64300LZa lZa) {
        this.A01 = lZa;
    }
}
