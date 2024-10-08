package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.VuA  reason: case insensitive filesystem */
public final class C18558VuA {
    public final 2el A00;
    public final C229932oe A01 = new C229932oe();
    public final C15897UkL A02;

    public C18558VuA(AnonymousClass0iw r7, UserSession userSession, 2el r9, String str, String str2, String str3) {
        AnonymousClass7TG.A0w(1, userSession, r9, str);
        this.A00 = r9;
        this.A02 = new C15897UkL(r7, userSession, str, str2, str3);
    }

    public final void A01(0eP r5) {
        0qQ.A0B(r5, 0);
        C229932oe r3 = this.A01;
        String A002 = A00(r5);
        C13989Tnp.A1Q(this.A02, AnonymousClass30Y.A00(r5, C60340gF.A00, A00(r5)), r3, A002);
    }

    public static final String A00(0eP r2) {
        Long l;
        StringBuilder sb = new StringBuilder();
        sb.append("featured_product_pivot_");
        sb.append(((1Xj) r2.A00).getId());
        sb.append('_');
        C68282N8v n8v = ((C42130BIj) r2.A01).A00;
        if (n8v != null) {
            l = n8v.A02;
        } else {
            l = null;
        }
        return AnonymousClass7TF.A0i(l, sb);
    }
}
