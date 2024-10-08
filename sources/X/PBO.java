package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.ui.base.IgSimpleImageView;

public final class PBO implements C328007Db {
    public Context A00;
    public Drawable A01;
    public Drawable A02;
    public ViewGroup A03;
    public IgSimpleImageView A04;
    public final P15 A05;
    public final C71662eb A06;

    public final void A00() {
        if (this.A06.A04()) {
            ViewGroup viewGroup = this.A03;
            if (viewGroup == null) {
                0qQ.A0F("pillContainer");
                throw AnonymousClass00P.createAndThrow();
            } else {
                viewGroup.setVisibility(8);
            }
        }
    }

    public final void A01(C72581PBm pBm) {
        this.A06.A01();
        ViewGroup viewGroup = this.A03;
        String str = "pillContainer";
        if (viewGroup != null) {
            int i = 0;
            if (pBm.A00 > 0) {
                i = 8;
            }
            viewGroup.setVisibility(i);
            Drawable drawable = this.A01;
            if (drawable == null) {
                str = "pillBackgroundDrawable";
            } else {
                C329967Kx r2 = pBm.A01;
                AnonymousClass7TE.A1R(drawable, r2.A0K);
                Drawable drawable2 = this.A02;
                if (drawable2 == null) {
                    str = "pillBackgroundShadow";
                } else {
                    AnonymousClass7TE.A1R(drawable2, r2.A07);
                    IgSimpleImageView igSimpleImageView = this.A04;
                    if (igSimpleImageView == null) {
                        str = "iconView";
                    } else {
                        Context context = BJd().getContext();
                        Context context2 = this.A00;
                        if (context2 == null) {
                            str = "context";
                        } else {
                            DbU.A14(context, igSimpleImageView, 2Yu.A09(context2));
                            ViewGroup viewGroup2 = this.A03;
                            if (viewGroup2 != null) {
                                C71408Ok7.A00(viewGroup2, 53, this, pBm);
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View BJd() {
        C71662eb r1 = this.A06;
        if (r1.A04()) {
            View A012 = r1.A01();
            0qQ.A07(A012);
            return A012;
        }
        ViewStub viewStub = r1.A01;
        if (viewStub != null) {
            return viewStub;
        }
        throw AnonymousClass7TE.A0y();
    }

    public PBO(C71662eb r3, P15 p15) {
        this.A06 = r3;
        this.A05 = p15;
        r3.A02 = new C72245OzD(this, 4);
    }
}
