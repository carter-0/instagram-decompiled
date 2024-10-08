package X;

import android.content.Context;
import android.view.View;

public final class WAD implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ X99 A02;
    public final /* synthetic */ X4C A03;
    public final /* synthetic */ C17674Vc5 A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ CharSequence[] A06;

    public WAD(Context context, X99 x99, X4C x4c, C17674Vc5 vc5, String str, CharSequence[] charSequenceArr, int i) {
        this.A03 = x4c;
        this.A01 = context;
        this.A06 = charSequenceArr;
        this.A05 = str;
        this.A02 = x99;
        this.A04 = vc5;
        this.A00 = i;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(792353839);
        X4C x4c = this.A03;
        C358248ab r3 = new C358248ab(this.A01);
        r3.A0e(new W5U(this, 21), this.A06);
        r3.A0r(true);
        r3.A0s(true);
        x4c.ALt(r3);
        DbT.A1V(r3);
        AnonymousClass0fD.A0C(-201780210, A052);
    }
}
