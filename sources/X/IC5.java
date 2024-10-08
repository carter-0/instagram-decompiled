package X;

import android.view.View;

public final class IC5 implements View.OnClickListener {
    public final /* synthetic */ C52672Gak A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C309686Zf A02;
    public final /* synthetic */ AnonymousClass6PN A03;

    public IC5(C52672Gak gak, C255773uh r2, C309686Zf r3, AnonymousClass6PN r4) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A00 = gak;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(231478830);
        C309686Zf r5 = this.A02;
        C255773uh r4 = this.A01;
        2EG r3 = 2EG.A3e;
        AnonymousClass6PN r2 = this.A03;
        r5.DL4(r4, r3, r2.A01().getPivotX(), r2.A01().getPivotY());
        C52672Gak.A04(this.A00, "lead_ads_stories_first_question", "lead_ads_first_question_continue_click");
        AnonymousClass0fD.A0C(-1711822259, A05);
    }
}
