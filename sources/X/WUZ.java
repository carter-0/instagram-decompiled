package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class WUZ implements B21, B20 {
    public C17656Vbm A00;
    public C19470WaI A01;
    public final Activity A02;
    public final Context A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C252063oV A06;
    public final AnonymousClass0eM A07;
    public final C354538Mk A08;
    public final AnonymousClass8MF A09;

    public WUZ(Activity activity, Context context, View view, AnonymousClass0iw r6, UserSession userSession, C354538Mk r8, AnonymousClass8MF r9) {
        AnonymousClass7TF.A1E(context, 2, r8);
        this.A03 = context;
        this.A09 = r9;
        this.A04 = r6;
        this.A05 = userSession;
        this.A02 = activity;
        this.A08 = r8;
        this.A06 = 2b1.A00(view.requireViewById(R.id.reaction_sticker_stub));
        this.A07 = AnonymousClass0eN.A01(new C66295MMe(view, 22));
    }

    public final void DCS(Object obj) {
        ConstraintLayout constraintLayout;
        IgSimpleImageView igSimpleImageView;
        IgSimpleImageView igSimpleImageView2;
        IgImageView igImageView;
        IgImageView igImageView2;
        IgImageView igImageView3;
        0qQ.A0B(obj, 0);
        this.A01 = ((AnonymousClass8UG) obj).A00;
        this.A08.DnE(C273654mx.A00(375));
        if (this.A00 == null) {
            C17656Vbm vbm = new C17656Vbm(this.A06);
            this.A00 = vbm;
            IgImageView igImageView4 = vbm.A03;
            if (igImageView4 != null) {
                A00(igImageView4, this, C317486nL.A04, "😍");
            }
            C17656Vbm vbm2 = this.A00;
            if (!(vbm2 == null || (igImageView3 = vbm2.A04) == null)) {
                A00(igImageView3, this, C317486nL.A04, "😂");
            }
            C17656Vbm vbm3 = this.A00;
            if (!(vbm3 == null || (igImageView2 = vbm3.A05) == null)) {
                A00(igImageView2, this, C317486nL.A04, "😮");
            }
            C17656Vbm vbm4 = this.A00;
            if (!(vbm4 == null || (igImageView = vbm4.A06) == null)) {
                A00(igImageView, this, C317486nL.A04, "😢");
            }
            C17656Vbm vbm5 = this.A00;
            if (!(vbm5 == null || (igSimpleImageView2 = vbm5.A01) == null)) {
                AnonymousClass0fU.A00(new LY0(this, 61), igSimpleImageView2);
            }
        }
        C17656Vbm vbm6 = this.A00;
        if (!(vbm6 == null || (igSimpleImageView = vbm6.A02) == null)) {
            igSimpleImageView.setImageDrawable(new C16148UpZ(this.A03, this.A01, true, false));
        }
        C17656Vbm vbm7 = this.A00;
        if (!(vbm7 == null || (constraintLayout = vbm7.A00) == null)) {
            constraintLayout.setVisibility(0);
        }
        C294975nL.A07(new View[]{AnonymousClass7TE.A0c(this.A07), this.A06.getView()}, !182.A06(0Tu.A05, this.A05, 36323302926462007L));
    }

    public final View Azx() {
        C17656Vbm vbm = this.A00;
        if (vbm != null) {
            return vbm.A02;
        }
        return null;
    }

    public final Class Bza() {
        return C16148UpZ.class;
    }

    public final void DDW() {
        if (this.A00 != null) {
            C294975nL.A05(new View[]{AnonymousClass7TE.A0c(this.A07), this.A06.getView()}, true);
        }
        C19470WaI waI = this.A01;
        if (waI == null) {
            new C283405Hn("😍", false);
            waI = new C19470WaI(new C283405Hn("😍", false));
        }
        0qQ.A0C(waI, "null cannot be cast to non-null type com.instagram.reels.reaction.model.ReactionStickerClientModel");
        AnonymousClass8MF r3 = this.A09;
        C19470WaI waI2 = this.A01;
        if (waI2 == null) {
            new C283405Hn("😍", false);
            waI2 = new C19470WaI(new C283405Hn("😍", false));
        }
        r3.Dn8(waI2, 002.A0R("emoji_reaction_", waI.A00.A00));
        this.A08.Dn9(C273654mx.A00(375));
    }

    public static void A00(IgImageView igImageView, WUZ wuz, C336957fS r4, String str) {
        igImageView.setUrl(r4.A04(str), wuz.A04);
        AnonymousClass0fU.A00(new W9h(str, wuz, 3), igImageView);
    }
}
