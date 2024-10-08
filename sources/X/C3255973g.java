package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.73g  reason: invalid class name and case insensitive filesystem */
public final class C3255973g extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        0qQ.A0B(layoutInflater, 1);
        View inflate = layoutInflater.inflate(R.layout.thread_new_message_separator, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        0qQ.A0A(inflate);
        return new C67975Mxz(inflate);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r3, C249703kE r4) {
        C66678Mal mal = (C66678Mal) r3;
        C67975Mxz mxz = (C67975Mxz) r4;
        0qQ.A0B(mal, 0);
        0qQ.A0B(mxz, 1);
        View view = mxz.A00;
        int i = mal.A00;
        view.setBackgroundColor(i);
        mxz.A01.setBackgroundColor(i);
        mxz.A02.setTextColor(i);
    }

    public final Class modelClass() {
        return C66678Mal.class;
    }
}
