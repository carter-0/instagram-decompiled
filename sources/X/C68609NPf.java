package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.NPf  reason: case insensitive filesystem */
public final class C68609NPf extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67947MxX(DbT.A0D(layoutInflater, viewGroup, R.layout.daily_prompts_empty_state, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        NP7 np7 = (NP7) r4;
        C67947MxX mxX = (C67947MxX) r5;
        boolean A1Z = AnonymousClass7TG.A1Z(np7, mxX);
        String str = np7.A01;
        String str2 = np7.A00;
        Dba.A0j(A1Z ? 1 : 0, str, str2);
        mxX.A01.setText(str);
        mxX.A00.setText(str2);
    }

    public final Class modelClass() {
        return NP7.class;
    }
}
