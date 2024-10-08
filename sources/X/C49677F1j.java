package X;

import android.app.Dialog;
import android.content.Context;

/* renamed from: X.F1j  reason: case insensitive filesystem */
public final class C49677F1j {
    public Dialog A00;

    public final void A00(Context context, C51928G7w g7w, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A0j(context.getDrawable(i));
        A0Y.A05 = str;
        A0Y.A0c(C50023FJi.A00(g7w, 44), str4);
        A0Y.A0b(C50023FJi.A00(g7w, 45), str5);
        A0Y.A0r(z);
        C49968FHb.A00(A0Y, g7w, 3);
        if (str3 != null) {
            A0Y.A0Z(C50023FJi.A00(g7w, 43), str2, str3);
        } else {
            A0Y.A0q(str2);
        }
        Dialog A02 = A0Y.A02();
        this.A00 = A02;
        if (A02 == null) {
            0qQ.A0F("dialog");
            throw AnonymousClass00P.createAndThrow();
        } else {
            AnonymousClass0fN.A00(A02);
        }
    }
}
