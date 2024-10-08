package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9jT  reason: invalid class name and case insensitive filesystem */
public final class C385749jT extends C232232tF {
    public final UserSession A00;
    public final C70423O6a A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = layoutInflater.inflate(R.layout.direct_ai_sticker_entrypoint_item, viewGroup, false);
        0qQ.A07(inflate);
        return new C380399Ya(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C380399Ya r72 = (C380399Ya) r7;
        0qQ.A0B(r72, 1);
        IgImageView igImageView = r72.A00;
        Context context = igImageView.getContext();
        igImageView.setVisibility(0);
        igImageView.setContentDescription(context.getString(2131958600));
        AIr A012 = AIr.A01(context, this.A00);
        A012.A0A(A2T.A00);
        A012.A0B = true;
        A012.A06(R.drawable.instagram_gen_ai_pano_filled_24);
        A012.A04 = -1;
        A012.A05 = AnonymousClass7TE.A16(context, 2131958601);
        igImageView.setImageDrawable(A012.A04());
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(igImageView);
        A0m.A04 = new NQx(this, 2);
        A0m.A00();
    }

    public final Class modelClass() {
        return NPM.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        C380399Ya r32 = (C380399Ya) r3;
        0qQ.A0B(r32, 0);
        r32.A00.setVisibility(8);
    }

    public C385749jT(UserSession userSession, C70423O6a o6a) {
        this.A00 = userSession;
        this.A01 = o6a;
    }
}
