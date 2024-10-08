package X;

import android.view.View;

/* renamed from: X.IBu  reason: case insensitive filesystem */
public final class C56771IBu implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ C53157GjT A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ String A03;

    public C56771IBu(1Xj r1, C53157GjT gjT, AnonymousClass3W1 r3, String str) {
        this.A01 = gjT;
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1244920840);
        C53157GjT gjT = this.A01;
        C2363233h r5 = gjT.A02;
        if (r5 != null) {
            1Xj r7 = this.A00;
            String A0j = C51970G9q.A0j(r7);
            String C9L = r7.C9L();
            AnonymousClass3W1 r0 = this.A02;
            int position = r0.getPosition();
            String str = this.A03;
            r5.Ds5(r7.B5J(), r7, A0j, C9L, str, (String) null, (String) null, r0.A1V, -1, position, true, AnonymousClass7TF.A1W(r0.A0m, AnonymousClass3WA.ADS_LWNF), false);
            r0.A1H = str;
            C2363733m.A05(r7, gjT, r0);
            AnonymousClass0fD.A0C(-1641191853, A05);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A0C(-1732578323, A05);
        throw A0y;
    }
}
