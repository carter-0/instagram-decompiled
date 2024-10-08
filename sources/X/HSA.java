package X;

import android.view.View;

public abstract class HSA {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        View view;
        C307786Rm r2 = r7.A03;
        if (r2 != null) {
            C276544tV r72 = (C276544tV) r8.A01();
            if (r72.A04 == 16444) {
                Object A06 = C307476Qg.A06(r2, r72);
                A06.getClass();
                C56522Hzt hzt = (C56522Hzt) A06;
                AnonymousClass0eM r1 = hzt.A04;
                if (((C55979Hqk) r1.getValue()).A02.isShowing() || ((C55979Hqk) r1.getValue()).A01 || (view = hzt.A00) == null) {
                    return null;
                }
                C55979Hqk hqk = (C55979Hqk) r1.getValue();
                TYA tya = new TYA(15, (Object) hzt, (Object) r72);
                C245663dH A01 = ((C18564VuG) hqk.A04.getValue()).A01(view, r72);
                if (A01 != null) {
                    C52876GeB geB = hqk.A02;
                    View contentView = geB.getContentView();
                    0qQ.A0C(contentView, AnonymousClass000.A00(717));
                    ((C299025uS) contentView).setRenderTree(A01);
                    tya.invoke(geB);
                }
                C56522Hzt.A00(hzt, r72, true, true);
                return null;
            }
            1Kn.A02(C273654mx.A00(574), "Signature called with invalid model.");
            return null;
        }
        throw DbU.A0h();
    }
}
