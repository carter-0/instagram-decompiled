package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.effect.AttributedAREffect;

/* renamed from: X.OjE  reason: case insensitive filesystem */
public final class C71359OjE implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C317116mk A03;
    public final /* synthetic */ C316136lA A04;

    public C71359OjE(Context context, UserSession userSession, C255773uh r3, C317116mk r4, C316136lA r5) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = r3;
        this.A04 = r5;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(2129751162);
        Context context = this.A00;
        0qQ.A0A(context);
        OYT.A00(context, this.A01, 3);
        AttributedAREffect attributedAREffect = this.A02.A05;
        if (attributedAREffect != null) {
            C316136lA r0 = this.A04;
            C317116mk r4 = this.A03;
            IgSimpleImageView igSimpleImageView = (IgSimpleImageView) r0.A1f.getView();
            boolean z = !attributedAREffect.CbC();
            C309196Xh.A05(igSimpleImageView, attributedAREffect, z);
            r4.DBb(new NMG(6, attributedAREffect, igSimpleImageView, z), z);
        }
        AnonymousClass0fD.A0C(-1505883459, A05);
    }
}
