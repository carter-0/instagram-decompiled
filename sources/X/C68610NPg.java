package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPg  reason: case insensitive filesystem */
public final class C68610NPg extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        return new C67956Mxg(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.meta_ai_pill_shimmer_keyword, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C71962Otn otn = (C71962Otn) r5;
        C67956Mxg mxg = (C67956Mxg) r6;
        AnonymousClass7TG.A1N(otn, mxg);
        View view = mxg.A00;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Resources A05 = DbU.A05(view);
        boolean z = otn.A00;
        int i = R.dimen.avatar_powerups_avatar_height;
        if (z) {
            i = R.dimen.search_pill_long_shimmer_width;
        }
        layoutParams.width = A05.getDimensionPixelSize(i);
        mxg.A01.A02();
    }

    public final Class modelClass() {
        return C71962Otn.class;
    }
}
