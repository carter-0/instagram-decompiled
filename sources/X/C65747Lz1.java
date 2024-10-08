package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Lz1  reason: case insensitive filesystem */
public final class C65747Lz1 implements C332277Ui {
    public final int A00;
    public final Object A01;

    public C65747Lz1(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D9V() {
        AnonymousClass8W6 r0;
        switch (this.A00) {
            case 0:
                K8G k8g = (K8G) this.A01;
                FragmentActivity requireActivity = k8g.requireActivity();
                AnonymousClass0eM r2 = k8g.A08;
                C309516Yo A0N = DbX.A0N(requireActivity, r2);
                A0N.A0B((Bundle) null, AnonymousClass2BF.A00().A02().A00(AnonymousClass7TE.A0l(r2), "REEL", (String) null, k8g.A00, true));
                A0N.A04();
                return;
            case 1:
                C312266e6 r02 = ((C19199WPf) ((C65751Lz5) this.A01).A01).A0E;
                if (r02 != null) {
                    r02.Dj6();
                    return;
                }
                return;
            case 2:
                C384909i5 r22 = (C384909i5) this.A01;
                AnonymousClass80Q r03 = r22.A00;
                if (r03 == null || (r0 = r03.A00.A0m) == null || !r0.A07()) {
                    DbX.A1I(r22);
                    return;
                }
                return;
            default:
                1IX r1 = (1IX) this.A01;
                if (r1.isActive()) {
                    r1.resumeWith(C60340gF.A00);
                    return;
                }
                return;
        }
    }

    public final void D9a() {
    }
}
