package X;

/* renamed from: X.47V  reason: invalid class name */
public final class AnonymousClass47V extends 19W {
    public final 0jI A00;

    public final void onRequestCallbackDone(1QS r8, 1QU r9) {
        C257523xX r6;
        0qQ.A0B(r9, 1);
        0jI r3 = this.A00;
        if (r3 != null && (r6 = r9.A0A) != null) {
            if (r6.A01 == 0) {
                r3.Ciz(r6.A07, !0qQ.A0K(r6.A04, "DASH_AUDIO"));
            } else if (r6.A00()) {
                r3.CiA(r6.A07, !0qQ.A0K(r6.A04, "DASH_AUDIO"));
            }
        }
    }

    public final void onResponseStarted(1QS r8, 1QU r9, 2ZD r10) {
        C257523xX r6;
        0qQ.A0B(r9, 1);
        0jI r3 = this.A00;
        if (r3 != null && (r6 = r9.A0A) != null) {
            if (r6.A01 == 0) {
                r3.Cj0(r6.A07, !0qQ.A0K(r6.A04, "DASH_AUDIO"));
            } else if (r6.A00()) {
                r3.CiB(r6.A07, !0qQ.A0K(r6.A04, "DASH_AUDIO"));
            }
        }
    }

    public AnonymousClass47V(0jI r1) {
        this.A00 = r1;
    }
}
