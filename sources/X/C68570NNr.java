package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NNr  reason: case insensitive filesystem */
public final class C68570NNr extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        int i;
        C71971Otw otw = (C71971Otw) r5;
        C67961Mxl mxl = (C67961Mxl) r6;
        AnonymousClass7TG.A1N(otw, mxl);
        String str = otw.A01;
        Integer num = otw.A00;
        if (num != null) {
            i = mxl.A00.getResources().getDimensionPixelSize(num.intValue());
        } else {
            i = 0;
        }
        mxl.A00.setPadding(i, 0, i, 0);
        mxl.A01.setText(str);
    }

    public final Class modelClass() {
        return C71971Otw.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A09 = DbU.A09(layoutInflater, viewGroup, R.layout.row_iglive_post_live_subtitle, false);
        A09.setTag(new C67961Mxl(A09));
        Object tag = A09.getTag();
        if (tag instanceof C67961Mxl) {
            return (C249703kE) tag;
        }
        return null;
    }
}
