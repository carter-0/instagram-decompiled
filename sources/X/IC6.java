package X;

import android.view.View;

public final class IC6 implements View.OnClickListener {
    public final /* synthetic */ C52672Gak A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C309686Zf A02;
    public final /* synthetic */ AnonymousClass6PP A03;

    public IC6(C52672Gak gak, C255773uh r2, C309686Zf r3, AnonymousClass6PP r4) {
        this.A00 = gak;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(572445590);
        C52672Gak.A04(this.A00, "lead_ads_stories_first_question", "lead_ads_first_question_continue_click");
        C255773uh r5 = this.A01;
        AnonymousClass6PP r4 = this.A03;
        r5.A0J = DbV.A12(AnonymousClass7TF.A0f(r4.A02()));
        this.A02.DL4(r5, 2EG.A3e, r4.A01().getPivotX(), r4.A01().getPivotY());
        AnonymousClass0fD.A0C(-1068915629, A05);
    }
}
