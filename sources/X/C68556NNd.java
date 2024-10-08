package X;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.NNd  reason: case insensitive filesystem */
public final class C68556NNd extends C232222tE {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67936MxM(DbT.A0D(layoutInflater, viewGroup, R.layout.appreciation_text_view_layout, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        int i;
        int i2;
        int i3;
        Ou7 ou7 = (Ou7) r10;
        C67936MxM mxM = (C67936MxM) r11;
        boolean A1U = AnonymousClass7TF.A1U(0, ou7, mxM);
        IgTextView igTextView = mxM.A01;
        igTextView.setText(ou7.A01);
        igTextView.setTextAppearance(ou7.A00);
        View view = mxM.A00;
        Resources A0B = C66580MXl.A0B(view);
        int A03 = C66581MXm.A03(A0B, ou7.A07);
        int A032 = C66581MXm.A03(A0B, ou7.A02);
        Integer num = ou7.A04;
        if (num != null) {
            i = C66581MXm.A03(A0B, num);
        } else {
            i = 0;
        }
        Integer num2 = ou7.A03;
        if (num2 != null) {
            i2 = C66581MXm.A03(A0B, num2);
        } else {
            i2 = 0;
        }
        igTextView.setPadding(i, A03, i2, A032);
        Integer num3 = ou7.A06;
        if (num3 != null) {
            DbT.A17(igTextView.getContext(), igTextView, num3.intValue());
        }
        int intValue = ou7.A05.intValue();
        if (intValue != 0) {
            i3 = 6;
            if (intValue != A1U) {
                i3 = 4;
            }
        } else {
            i3 = 5;
        }
        view.setTextAlignment(i3);
    }

    public final Class modelClass() {
        return Ou7.class;
    }
}
