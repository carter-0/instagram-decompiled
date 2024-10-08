package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.Tot  reason: case insensitive filesystem */
public final class C14049Tot extends GBR {
    public final Activity A00;
    public final JSx A01;
    public final UserSession A02;
    public final C51987GAk A03;

    public final boolean A02() {
        return false;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.immersive_catch_up_summary_item_layout, viewGroup, false);
        Drawable background = inflate.getBackground();
        0qQ.A0C(background, C66579MXk.A00(369));
        AnimationDrawable animationDrawable = (AnimationDrawable) background;
        animationDrawable.setEnterFadeDuration(10);
        animationDrawable.setExitFadeDuration(5000);
        animationDrawable.start();
        return new C16408UuQ(inflate);
    }

    public static final void A00(Context context, C16512UwG uwG, C14049Tot tot) {
        int i;
        K4G k4g = new K4G();
        Bundle bundle = new Bundle();
        bundle.putSerializable(AnonymousClass000.A00(1452), uwG);
        k4g.setArguments(bundle);
        C331127Pr r3 = new C331127Pr(tot.A02);
        r3.A03 = 0.9f;
        DbS.A1S(r3, true);
        int ordinal = uwG.ordinal();
        if (ordinal == 0) {
            i = 2131964154;
        } else if (ordinal == 1) {
            i = 2131964157;
        } else if (ordinal != 2) {
            i = 2131964155;
            if (ordinal != 3) {
                i = 2131964156;
            }
        } else {
            i = 2131964158;
        }
        r3.A0d = AnonymousClass7TE.A16(context, i);
        r3.A00().A02(tot.A00, k4g);
    }

    public final /* bridge */ /* synthetic */ void A03(C249703kE r5, C320876t6 r6) {
        C16408UuQ uuQ = (C16408UuQ) r5;
        AnonymousClass7TG.A1N(r6, uuQ);
        Context A07 = DbS.A07(uuQ);
        IgdsMediaButton igdsMediaButton = uuQ.A00;
        WBE.A00(igdsMediaButton, 42, A07, this);
        igdsMediaButton.setLabel(DbW.A0h(A07, String.valueOf(5), 2131964160));
        IgdsMediaButton igdsMediaButton2 = uuQ.A01;
        WBE.A00(igdsMediaButton2, 43, A07, this);
        igdsMediaButton2.setLabel(DbW.A0h(A07, String.valueOf(6), 2131964162));
        IgdsMediaButton igdsMediaButton3 = uuQ.A03;
        WBE.A00(igdsMediaButton3, 44, A07, this);
        igdsMediaButton3.setLabel(DbW.A0h(A07, String.valueOf(7), 2131964164));
        IgdsMediaButton igdsMediaButton4 = uuQ.A02;
        WBE.A00(igdsMediaButton4, 45, A07, this);
        igdsMediaButton4.setLabel(DbW.A0h(A07, String.valueOf(8), 2131964163));
        uuQ.A04.setLabel(DbW.A0h(A07, String.valueOf(9), 2131964161));
    }

    public final Class modelClass() {
        return C54577HJm.class;
    }

    public C14049Tot(Activity activity, JSx jSx, UserSession userSession, C51987GAk gAk) {
        super(jSx, gAk);
        this.A03 = gAk;
        this.A01 = jSx;
        this.A02 = userSession;
        this.A00 = activity;
    }
}
