package X;

import android.view.View;
import com.instagram.feed.widget.IgProgressImageView;

public final class ICO implements View.OnClickListener {
    public final /* synthetic */ IgProgressImageView A00;
    public final /* synthetic */ C52672Gak A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ C309686Zf A03;
    public final /* synthetic */ AnonymousClass6PP A04;

    public ICO(IgProgressImageView igProgressImageView, C52672Gak gak, C255773uh r3, C309686Zf r4, AnonymousClass6PP r5) {
        this.A04 = r5;
        this.A00 = igProgressImageView;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = gak;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-309872403);
        AnonymousClass6PP r5 = this.A04;
        r5.A02().requestFocus();
        0nA.A0Q(r5.A02());
        C255773uh r4 = this.A02;
        C309686Zf r3 = this.A03;
        C52672Gak.A04(this.A01, C273654mx.A00(797), "lead_ads_first_question_with_saq_input_click");
        r3.Ded();
        View A002 = r5.A00();
        View view2 = r5.A01;
        if (view2 != null) {
            I7N.A07(A002, view2, r4);
            AnonymousClass0fD.A0C(1861282337, A05);
            return;
        }
        0qQ.A0F("dimmerOverlay");
        throw AnonymousClass00P.createAndThrow();
    }
}
