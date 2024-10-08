package X;

import java.util.List;

/* renamed from: X.E8u  reason: case insensitive filesystem */
public final class C47582E8u extends C331047Ph {
    public final List A00 = AnonymousClass7TE.A1C();
    public final EA8 A01;

    public final void A0C(String str, boolean z) {
        for (C49503Ewi ewi : this.A00) {
            if (0qQ.A0K(ewi.A01.getId(), str)) {
                ewi.A00 = z;
            }
        }
        A00(this);
    }

    public C47582E8u(AnonymousClass0iw r2, C46656Dib dib) {
        EA8 ea8 = new EA8(r2, dib);
        this.A01 = ea8;
        A0B(ea8);
    }

    public static final void A00(C47582E8u e8u) {
        e8u.A06();
        for (Object A08 : e8u.A00) {
            e8u.A08(e8u.A01, A08);
        }
        e8u.A07();
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
