package X;

/* renamed from: X.7M8  reason: invalid class name */
public final class AnonymousClass7M8 implements 0xZ {
    public final /* synthetic */ AnonymousClass7WK A00;
    public final /* synthetic */ C254783t2 A01;

    public AnonymousClass7M8(AnonymousClass7WK r1, C254783t2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onChanged(0xa r7, String str) {
        C254793t3 A05;
        C254763t0 A02;
        Integer num;
        if (str != null) {
            if (str.equals("unsend_warning_banner_shown_count")) {
                C395279zV.A00(this.A00.A05);
            }
            if (00l.A0d(str, "on_device_nudity_banner_state/", false) && (A05 = AnonymousClass6W3.A05(this.A01)) != null && (A02 = C300965yF.A02(A05)) != null) {
                AnonymousClass7WK r4 = this.A00;
                C66748Mbt mbt = new C66748Mbt(r4.A05);
                String str2 = A02.A00;
                0qQ.A0B(str2, 0);
                Integer A002 = C66748Mbt.A00(mbt, str2);
                Integer A012 = C66748Mbt.A01(mbt, str2);
                Integer num2 = AnonymousClass05K.A0C;
                if (A002 != num2 && A002 != (num = AnonymousClass05K.A00) && A012 != num2 && A012 != num) {
                    return;
                }
                if (r4.A04.isResumed()) {
                    AnonymousClass7FA r0 = (AnonymousClass7FA) r4.A06.invoke();
                    if (r0 != null) {
                        r0.A05(false);
                        return;
                    }
                    return;
                }
                r4.A03 = true;
            }
        }
    }
}
