package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.Uqd  reason: case insensitive filesystem */
public final class C16214Uqd extends C15732Uhd {
    public final C229382nI A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.bloks_section, viewGroup, false);
        C273694n2 r2 = new C273694n2(AnonymousClass7TE.A0S(inflate));
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        viewGroup2.addView(r2);
        viewGroup2.setTag(new UDU(inflate, r2));
        Object tag = inflate.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.shopping.adapter.pdp.bloks.BloksSectionViewBinder.ViewHolder");
        return (C249703kE) tag;
    }

    public final Class modelClass() {
        return WS9.class;
    }

    public C16214Uqd(C229382nI r1, C18020Vjw vjw) {
        super(vjw);
        this.A00 = r1;
    }
}
