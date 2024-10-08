package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.mediasize.GifUrlImpl;

public final class KG1 extends C232222tE {
    public final UserSession A00;

    public KG1(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60532Jn3(DbT.A0D(layoutInflater, viewGroup, R.layout.comment_giphy_sticker_suggestion_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r19, C249703kE r20) {
        C61172JyO jyO = (C61172JyO) r19;
        C60532Jn3 jn3 = (C60532Jn3) r20;
        AnonymousClass7TG.A1N(jyO, jn3);
        IgImageView igImageView = jn3.A00;
        Context context = igImageView.getContext();
        C39746A7m a7m = jyO.A00;
        C63879LAi lAi = a7m.A00.A00;
        0qQ.A07(lAi);
        float f = lAi.A01;
        float f2 = lAi.A00;
        String A0o = JTP.A0o(lAi.A05);
        if (f != 0.0f && f2 != 0.0f && !A0o.equals("")) {
            GifUrlImpl gifUrlImpl = new GifUrlImpl(A0o, lAi.A07, f, f2);
            0qQ.A0A(context);
            UserSession userSession = this.A00;
            String str = a7m.A05;
            0qQ.A07(str);
            C321076tX A002 = C321066tW.A00(1.0f, (int) f, (int) f2, -1);
            int color = context.getColor(R.color.igds_secondary_background);
            int color2 = context.getColor(R.color.context_line_color);
            igImageView.setImageDrawable(new C321016tR(context, userSession, A002, gifUrlImpl, AnonymousClass05K.A01, str, (float) JTR.A08(context), color, color2));
            DbU.A12(context, igImageView, 2131963074);
            C61685KHt.A00(AnonymousClass7TE.A0m(igImageView), jyO, 8);
        }
    }

    public final Class modelClass() {
        return C61172JyO.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r1) {
        JTU.A0r(r1);
    }
}
