package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

/* renamed from: X.EGo  reason: case insensitive filesystem */
public final class C47777EGo extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        0qQ.A0B(viewGroup, 0);
        return new C46974DoS(F8B.A00(viewGroup));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C47244DtV dtV = (C47244DtV) r6;
        C46974DoS doS = (C46974DoS) r7;
        AnonymousClass7TF.A1H(dtV, doS);
        F03 f03 = doS.A02;
        String str = dtV.A03;
        if (str == null || str.length() == 0) {
            f03.A03.setText(dtV.A04);
            f03.A04.setVisibility(8);
        } else {
            f03.A03.setText(str);
            TextView textView = f03.A04;
            textView.setText(dtV.A04);
            textView.setVisibility(0);
        }
        f03.A01.A0F((AnonymousClass9IV) null, new FU6(), dtV.A01);
        View A01 = doS.A01.A01();
        0qQ.A07(A01);
        CompoundButton compoundButton = (CompoundButton) A01;
        compoundButton.setChecked(dtV.A00);
        FPF.A00(f03.A00, 17, compoundButton, dtV);
    }

    public final Class modelClass() {
        return C47244DtV.class;
    }
}
