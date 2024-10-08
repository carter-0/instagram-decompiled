package X;

import android.content.Context;
import android.graphics.ColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.MnX  reason: case insensitive filesystem */
public final class C67416MnX extends C232222tE {
    public final C14140Tqa A00;
    public final XAH A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r9, C249703kE r10) {
        IgSimpleImageView igSimpleImageView;
        int A08;
        C67441Mnw mnw = (C67441Mnw) r9;
        AnonymousClass7TG.A1N(mnw, r10);
        C66967Mg0 mg0 = mnw.A00;
        Context A06 = JTQ.A06(r10);
        C67387Mn4 mn4 = mnw.A00;
        C14140Tqa tqa = this.A00;
        XAH xah = this.A01;
        Object tag = r10.itemView.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.search.common.ui.KeywordPillViewBinder.Holder");
        OEX oex = (OEX) tag;
        C51973G9u.A0r(3, tqa, xah, oex);
        xah.ECK(oex.A01, mn4, mg0);
        if (0qQ.A0K(mn4.A01.A07, "meta_ai_suggestion")) {
            igSimpleImageView = oex.A02;
            A08 = AnonymousClass7TG.A02(igSimpleImageView.getContext());
            igSimpleImageView.setImageResource(R.drawable.instagram_icons_exceptions_genai_agent_profile_filled_24);
            igSimpleImageView.setColorFilter((ColorFilter) null);
        } else {
            igSimpleImageView = oex.A02;
            A08 = C51972G9s.A08(igSimpleImageView.getContext());
            igSimpleImageView.setImageResource(R.drawable.instagram_arrow_up_right_pano_filled_24);
            DbX.A12(A06, igSimpleImageView, 2Yu.A0H(A06, R.attr.glyphColorPrimary));
        }
        C66580MXl.A1B(igSimpleImageView, A08);
        C66580MXl.A1C(igSimpleImageView, A08);
        TextView textView = oex.A00;
        textView.setText(mn4.A01.A04);
        C71399Ojy.A00(textView, mn4, mg0, tqa, 33);
    }

    public final Class modelClass() {
        return C67441Mnw.class;
    }

    public C67416MnX(C14140Tqa tqa, XAH xah) {
        this.A00 = tqa;
        this.A01 = xah;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A0D = DbT.A0D(LayoutInflater.from(AnonymousClass7TE.A0S(viewGroup)), viewGroup, R.layout.pill_search_keyword, C66580MXl.A1Y(viewGroup));
        A0D.setTag(new OEX(A0D));
        C249703kE r1 = new C249703kE(A0D);
        if (A0D.getTag() instanceof OEX) {
            return r1;
        }
        throw DbT.A0m();
    }
}
