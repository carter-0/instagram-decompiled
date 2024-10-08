package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Ja4  reason: case insensitive filesystem */
public final class C59829Ja4 extends C232222tE {
    public final UserSession A00;
    public final C66526MVe A01;
    public final C66458MSm A02;
    public final XAH A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public C59829Ja4(UserSession userSession, C66526MVe mVe, C66458MSm mSm, XAH xah, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = mVe;
        this.A03 = xah;
        this.A05 = z;
        this.A04 = z2;
        this.A02 = mSm;
        this.A06 = z3;
        this.A07 = z4;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r24, C249703kE r25) {
        ImageUrl As5;
        LYA lya;
        C69168Nfr nfr = (C69168Nfr) r24;
        C60576Jnl jnl = (C60576Jnl) r25;
        AnonymousClass7TF.A1H(nfr, jnl);
        C66967Mg0 mg0 = nfr.A00;
        UserSession userSession = this.A00;
        C69159Nfi nfi = nfr.A00;
        C66526MVe mVe = this.A01;
        XAH xah = this.A03;
        Object tag = jnl.A00.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.AudioRowViewBinder.Holder");
        LBD lbd = (LBD) tag;
        boolean A1P = AnonymousClass7TF.A1P(mg0.A0F ? 1 : 0);
        boolean z = this.A07;
        boolean z2 = this.A05;
        boolean z3 = this.A04;
        C66458MSm mSm = this.A02;
        boolean z4 = this.A06;
        DbW.A1N(userSession, 0, lbd);
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
                if (z4) {
                    str = A062.getFormattedClipsMediaCount();
                }
                LJQ.A01(l6r, displayArtist, str, (String) null, A062.Cdd(), z);
            }
            View A012 = lbd.A0A.A01();
            0qQ.A07(A012);
            int i = 8;
            if (A1P) {
                i = 0;
            }
            A012.setVisibility(i);
            if (A1P) {
                lya = LYA.A00(mVe, nfi, mg0, 32);
            } else {
                lya = null;
            }
            AnonymousClass0fU.A00(lya, A012);
            if (A1P) {
                C67434Mnp.A00(A012);
            }
            View view = lbd.A06;
            LYA.A01(view, mVe, nfi, mg0, 33);
            if (z) {
                int dimensionPixelSize = DbU.A05(view).getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
                imageView.getLayoutParams().height = dimensionPixelSize;
                imageView.getLayoutParams().width = dimensionPixelSize;
                C67434Mnp.A01(view);
            }
            if (z2) {
                lbd.A05 = z3;
                C64157LQy.A00(A062, mVe, lbd, mSm);
            }
        }
    }

    public final Class modelClass() {
        return C69168Nfr.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        DbS.A1W(viewGroup);
        return new C60576Jnl(C64157LQy.A00.A01(viewGroup, this.A05, this.A04));
    }
}
