package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class QFW extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final ImageView A04;
    public final /* synthetic */ C7993Qeg A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QFW(View view, C7993Qeg qeg) {
        super(view);
        this.A05 = qeg;
        ImageView A0G = DbS.A0G(view, R.id.checkmark_icon);
        this.A04 = A0G;
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.title);
        this.A03 = A0d;
        TextView A0d2 = AnonymousClass7TE.A0d(view, R.id.subtitle);
        this.A02 = A0d2;
        TextView A0d3 = AnonymousClass7TE.A0d(view, R.id.see_receipt);
        this.A01 = A0d3;
        TextView A0d4 = AnonymousClass7TE.A0d(view, R.id.pin_upsell);
        this.A00 = A0d4;
        0qQ.A05(A0G);
        C9659Red.A00((Context) null, A0G, RH3.A08);
        0qQ.A05(A0d);
        SRn.A02(A0d, RH2.A0x);
        0qQ.A05(A0d2);
        SRn.A02(A0d2, RH2.A0F);
        0qQ.A05(A0d3);
        RH2 rh2 = RH2.A0t;
        SRn.A02(A0d3, rh2);
        0qQ.A05(A0d4);
        SRn.A02(A0d4, rh2);
        C11497SbK.A01(A0d4, 65, qeg);
    }
}
