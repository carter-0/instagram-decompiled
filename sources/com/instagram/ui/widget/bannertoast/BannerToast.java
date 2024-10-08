package com.instagram.ui.widget.bannertoast;

import X.2cs;
import X.AnonymousClass37Q;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C249703kE;
import X.C252203oj;
import X.C305836Jt;
import X.C62254Kco;
import X.C65780LzY;
import X.C71392co;
import X.MRE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class BannerToast extends TextView implements C252203oj {
    public 2cs A00;
    public MRE A01;
    public boolean A02;

    public BannerToast(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final void DmD(2cs r1) {
    }

    public static void A00(BannerToast bannerToast) {
        if (!bannerToast.A02) {
            2cs A0J = AnonymousClass7TF.A0J();
            A0J.A09(C71392co.A04(1.0d, 3.0d));
            A0J.A08(0.0d, true);
            A0J.A06 = true;
            bannerToast.A00 = A0J;
            A0J.A0A(bannerToast);
            bannerToast.A02 = true;
        }
    }

    public final void DmB(2cs r6) {
        if (r6.A01 == 1.0d) {
            setVisibility(0);
        }
    }

    public final void DmC(2cs r6) {
        if (r6.A09.A00 == 0.0d) {
            setVisibility(8);
        }
    }

    public final void DmE(2cs r5) {
        float A022 = (float) AnonymousClass37Q.A02(r5.A09.A00, (double) (-getHeight()));
        setTranslationY(A022);
        MRE mre = this.A01;
        if (mre != null) {
            float A03 = A022 + AnonymousClass7TE.A03(this);
            C305836Jt r1 = ((C65780LzY) mre).A00;
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            C62254Kco kco = r1.A0B;
            if (kco != null) {
                kco.A03.setTranslationY(A03);
            }
        }
    }

    public void setListener(MRE mre) {
        this.A01 = mre;
    }

    public BannerToast(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public BannerToast(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
