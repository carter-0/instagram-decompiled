package X;

public final /* synthetic */ class AY7 implements 1wn {
    public final /* synthetic */ C329067Hl A00;

    public /* synthetic */ AY7(C329067Hl r1) {
        this.A00 = r1;
    }

    public final void onEvent(Object obj) {
        int i;
        C329067Hl r2 = this.A00;
        boolean contains = ((AY0) obj).A00.contains(C62587KiK.DAILY_PROMPT);
        r2.A1B = true;
        if (contains) {
            C252063oV r1 = r2.A0X.A08;
            if (r1.CVM()) {
                r1.getView().setVisibility(8);
            }
            i = 0;
        } else {
            2Er r12 = r2.A0W;
            if (r12 != null) {
                r2.A0X.A01(r12);
                AnonymousClass7L0 r0 = r2.A0U;
                if (r0 != null) {
                    i = r0.A02;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        C329067Hl.A0e(r2, i);
    }
}
