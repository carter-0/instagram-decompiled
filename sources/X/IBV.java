package X;

import android.view.View;

public final /* synthetic */ class IBV implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass3O8 A00;
    public final /* synthetic */ C57248IUj A01;
    public final /* synthetic */ C2357130x A02;

    public /* synthetic */ IBV(AnonymousClass3O8 r1, C57248IUj iUj, C2357130x r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = iUj;
    }

    public final void onClick(View view) {
        C2357130x r6 = this.A02;
        AnonymousClass3O8 r0 = this.A00;
        C57248IUj iUj = this.A01;
        0qQ.A0B(iUj, 1);
        C57214ITb iTb = new C57214ITb(r0, iUj);
        C56525Hzw hzw = new C56525Hzw(r6.A0O, r6.A0J);
        hzw.A00 = new C55761Hmw(iTb, iUj, r6);
        C358248ab A0Y = DbS.A0Y(hzw.A02);
        A0Y.A0l(hzw.A03, hzw.A04);
        A0Y.A0e(new I8B(hzw), C56525Hzw.A00(hzw));
        AnonymousClass7TH.A0a(A0Y, true);
    }
}
