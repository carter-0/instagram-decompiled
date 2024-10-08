package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.K9p  reason: case insensitive filesystem */
public final class C61484K9p extends C231632rz {
    public final UserSession A00;
    public final C66526MVe A01;
    public final C66458MSm A02;
    public final XAH A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;

    public C61484K9p(UserSession userSession, C66526MVe mVe, C66458MSm mSm, XAH xah, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(xah, 3);
        this.A00 = userSession;
        this.A01 = mVe;
        this.A03 = xah;
        this.A05 = z;
        this.A04 = z2;
        this.A06 = z3;
        this.A02 = mSm;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        ImageUrl As5;
        LYA lya;
        Object obj3 = obj;
        Object obj4 = obj2;
        int A032 = AnonymousClass0fD.A03(1222295271);
        View view2 = view;
        0qQ.A0B(view2, 1);
        0qQ.A0C(obj4, C66579MXk.A00(17));
        C66967Mg0 mg0 = (C66967Mg0) obj4;
        UserSession userSession = this.A00;
        0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.search.common.model.AudioSearchEntry");
        C69159Nfi nfi = (C69159Nfi) obj3;
        C66526MVe mVe = this.A01;
        XAH xah = this.A03;
        Object tag = view2.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.AudioRowViewBinder.Holder");
        LBD lbd = (LBD) tag;
        boolean A1P = AnonymousClass7TF.A1P(mg0.A0F ? 1 : 0);
        boolean z = this.A05;
        boolean z2 = this.A04;
        C66458MSm mSm = this.A02;
        boolean z3 = this.A06;
        0qQ.A0B(userSession, 0);
        DbW.A1N(nfi, 1, lbd);
        C66569MWx A062 = nfi.A06();
        if (A062 != null) {
            if (xah != null) {
                xah.ECK(lbd.A06, nfi, mg0);
            }
            ImageView imageView = lbd.A07;
            String str = null;
            if (A062.CRQ()) {
                As5 = null;
            } else {
                As5 = A062.As5();
            }
            JYP.A00(imageView, As5);
            TextView textView = lbd.A09;
            GVO gvo = new GVO(textView, DbV.A01(textView.getContext()));
            lbd.A04 = gvo;
            GVM.A00((Drawable) null, gvo, A062.getTitle(), A062.isExplicit(), false);
            C63785L6r l6r = lbd.A02;
            if (l6r != null) {
                String displayArtist = A062.getDisplayArtist();
                if (z3) {
                    str = A062.getFormattedClipsMediaCount();
                }
                LJQ.A01(l6r, displayArtist, str, (String) null, A062.Cdd(), false);
            }
            View A012 = lbd.A0A.A01();
            0qQ.A07(A012);
            int i2 = 8;
            if (A1P) {
                i2 = 0;
            }
            A012.setVisibility(i2);
            if (A1P) {
                lya = LYA.A00(mVe, nfi, mg0, 32);
            } else {
                lya = null;
            }
            AnonymousClass0fU.A00(lya, A012);
            if (A1P) {
                C67434Mnp.A00(A012);
            }
            LYA.A01(lbd.A06, mVe, nfi, mg0, 33);
            if (z) {
                lbd.A05 = z2;
                C64157LQy.A00(A062, mVe, lbd, mSm);
            }
        }
        AnonymousClass0fD.A0A(-1189156343, A032);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A042 = DbX.A04(viewGroup, 594773133);
        View A012 = C64157LQy.A00.A01(viewGroup, this.A05, this.A04);
        AnonymousClass0fD.A0A(-1503430178, A042);
        return A012;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
