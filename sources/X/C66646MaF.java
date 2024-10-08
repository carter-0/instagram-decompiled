package X;

import android.view.View;
import android.widget.TextView;

/* renamed from: X.MaF  reason: case insensitive filesystem */
public final class C66646MaF implements C2365734g {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass9HC A01;
    public final /* synthetic */ C328137Dq A02;
    public final /* synthetic */ GAV A03;
    public final /* synthetic */ String A04;

    public C66646MaF(AnonymousClass9HC r1, C328137Dq r2, GAV gav, String str, int i) {
        this.A02 = r2;
        this.A03 = gav;
        this.A00 = i;
        this.A04 = str;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        TextView textView = (TextView) view;
        0qQ.A0B(textView, 0);
        this.A02.A00(textView);
        GAV gav = this.A03;
        int i = this.A00;
        C66644MaD.A03(textView, gav, i);
        String str = this.A04;
        if (AnonymousClass7TF.A1Z(this.A01.A0a)) {
            textView.setVisibility(0);
        }
        if (!00l.A0W(str)) {
            textView.setText(str);
            textView.setTextColor(i);
        }
    }
}
