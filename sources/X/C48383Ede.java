package X;

import android.view.View;

/* renamed from: X.Ede  reason: case insensitive filesystem */
public abstract class C48383Ede {
    public static void A00(View view, C307786Rm r7, C276544tV r8) {
        C50302FXh fXh = (C50302FXh) C307476Qg.A06(r7, r8);
        if (fXh == null) {
            1Kn.A02("IGShoppingNavBarExtensionBinderUtils", "Got null NavbarExtensionController on binding.");
            return;
        }
        0qQ.A0B(view, 0);
        C307786Rm r4 = fXh.A07;
        2dZ A00 = C16859V8o.A00(C308206Td.A03(r4), r4);
        if (A00 != null) {
            fXh.A00 = A00;
        }
        AnonymousClass3M3 A002 = C308206Td.A00(r4);
        if (A002 instanceof AnonymousClass3M3) {
            AnonymousClass3M3 r2 = A002;
            r2.A0A.A0Z = true;
            DbT.A0K(r2.A03).A0W.remove(r2);
        }
        C308206Td.A0I(r4, fXh);
        view.post(new C51332FsQ(A002, fXh));
    }
}
