package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.VQw  reason: case insensitive filesystem */
public final class C17317VQw {
    public final View A00;
    public final 2Tb A01;

    public C17317VQw(View view, Fragment fragment, C3034368u r15, C277014uI r16, C277014uI r17, C277014uI r18, String str, C62320sa r20, 0sP r21) {
        C18970WEx wEx;
        C3034368u r6 = r15;
        boolean A1Y = DbW.A1Y(r15);
        this.A00 = view;
        2Tb r4 = new 2Tb(fragment.requireActivity());
        this.A01 = r4;
        boolean z = false;
        String str2 = str;
        if (str != null) {
            r4.A05(new C18969WEw(V6C.A00(str2, 0)));
            wEx = null;
        } else {
            wEx = C18970WEx.A00;
            r4.A05(wEx);
        }
        r4.A07 = wEx;
        C14597Tz1 tz1 = r4.A09;
        tz1.A03(2Tb.A02(r4.A08, wEx), r4.isShowing());
        r4.setContentView(view);
        r4.setCancelable(A1Y);
        C277014uI r7 = r16;
        tz1.A07 = AnonymousClass7TF.A1V(r7);
        C277014uI r8 = r17;
        r4.setCanceledOnTouchOutside(r17 != null ? true : z);
        r4.A06 = new C18966WEt(r6, r7, r8, r18, r20, r21);
    }
}
