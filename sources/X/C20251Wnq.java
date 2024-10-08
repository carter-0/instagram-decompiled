package X;

import android.view.ViewGroup;
import com.instagram.model.shopping.ProductItemWithAR;

/* renamed from: X.Wnq  reason: case insensitive filesystem */
public final class C20251Wnq implements Runnable {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ UZy A01;

    public C20251Wnq(ViewGroup viewGroup, UZy uZy) {
        this.A01 = uZy;
        this.A00 = viewGroup;
    }

    public final void run() {
        ViewGroup viewGroup;
        AnonymousClass80Q r0;
        String str;
        UZy uZy = this.A01;
        if (uZy.mView != null && (viewGroup = this.A00) != null) {
            AnonymousClass80D r5 = new AnonymousClass80D();
            C41837B2s b2s = uZy.A0F;
            b2s.getClass();
            r5.A0l = b2s;
            AnonymousClass0eM r02 = uZy.A0G;
            C13992Tns.A0u(uZy, r5, r02);
            AnonymousClass80D.A08(AnonymousClass7TE.A0l(r02), AnonymousClass80H.A02, AnonymousClass9QA.A00, r5);
            r5.A3h = true;
            r5.A0R = uZy.volumeKeyPressController;
            AnonymousClass80C r03 = uZy.A02;
            r03.getClass();
            r5.A0t = r03;
            r5.A09 = viewGroup;
            28D r04 = uZy.A00;
            if (r04 == null) {
                str = "entryPoint";
            } else {
                r5.A0B = r04;
                r5.A0O = uZy;
                r5.A3H = true;
                ProductItemWithAR productItemWithAR = uZy.A03;
                if (productItemWithAR == null) {
                    str = "productItemWithAR";
                } else {
                    r5.A2G = productItemWithAR.A00.A03;
                    r5.A3k = true;
                    r5.A3d = true;
                    AnonymousClass80D.A0A(r5);
                    r5.A3Q = false;
                    C3504784u r05 = uZy.A05;
                    r5.A1p = r05;
                    r5.A1q = r05;
                    r5.A2N = uZy.A06;
                    r5.A2f = null;
                    r5.A3H = true;
                    r5.A3G = false;
                    uZy.A01 = new AnonymousClass80Q(r5);
                    if (uZy.mLifecycleRegistry.A07().compareTo(07U.A04) >= 0 && (r0 = uZy.A01) != null) {
                        r0.A01();
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
