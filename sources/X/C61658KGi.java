package X;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;

/* renamed from: X.KGi  reason: case insensitive filesystem */
public final class C61658KGi extends C232232tF {
    public final Context A00;
    public final C63654L1q A01;

    public C61658KGi(Context context, C63654L1q l1q) {
        0qQ.A0B(l1q, 2);
        this.A00 = context;
        this.A01 = l1q;
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
        return new C60661Jp8(this.A00, inflate, this.A01);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C61167JyJ jyJ = (C61167JyJ) r5;
        C60661Jp8 jp8 = (C60661Jp8) r6;
        AnonymousClass7TG.A1N(jyJ, jp8);
        IgdsMediaButton igdsMediaButton = jp8.A01;
        Context context = jp8.A00;
        igdsMediaButton.setLabel(DbW.A0h(context, String.valueOf(jyJ.A02), 2131964160));
        jp8.A02.setLabel(DbW.A0h(context, String.valueOf(jyJ.A00), 2131964162));
        jp8.A04.setLabel(DbW.A0h(context, String.valueOf(jyJ.A03), 2131964164));
        jp8.A03.setLabel(DbW.A0h(context, String.valueOf(jyJ.A01), 2131964163));
        jp8.A05.setLabel(DbW.A0h(context, String.valueOf(jyJ.A04), 2131964161));
    }

    public final Class modelClass() {
        return C61167JyJ.class;
    }
}
