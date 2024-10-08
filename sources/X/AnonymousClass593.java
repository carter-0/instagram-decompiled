package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.593  reason: invalid class name */
public final class AnonymousClass593 implements C253183qL {
    public final C333827aD A00;
    public final C334297b2 A01;

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        C334297b2 r5 = this.A01;
        C333827aD r4 = this.A00;
        if (!(r4 instanceof C335907dj)) {
            return null;
        }
        HC3 hc3 = new HC3(r5);
        C60340gF r2 = C60340gF.A00;
        String A0R = 002.A0R("comment_list_prefix", r4.A00);
        AnonymousClass30Y r0 = AnonymousClass30Y.A07;
        C2354830a r02 = new C2354830a(r4, r2, A0R);
        r02.A00(hc3);
        r5.A04.A05(view, r02.A01());
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        C333827aD r3 = (C333827aD) obj;
        C333827aD r4 = (C333827aD) obj2;
        0qQ.A0B(r3, 0);
        0qQ.A0B(r4, 1);
        return !0qQ.A0K(r3.A00, r4.A00);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        this.A01.A04.A04(view);
    }

    public AnonymousClass593(C333827aD r1, C334297b2 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }
}
