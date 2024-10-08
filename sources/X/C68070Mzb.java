package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mzb  reason: case insensitive filesystem */
public final class C68070Mzb extends C249703kE implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final View A01;
    public final C252063oV A02;
    public final C252063oV A03;
    public final List A04;
    public final AnonymousClass0eM A05 = C73920Pm0.A01(this, 2);
    public final AnonymousClass0eM A06;
    public final C252063oV A07;
    public final AnonymousClass0eM A08;

    public C68070Mzb(View view, UserSession userSession) {
        super(view);
        this.A08 = C73916Plr.A00(view, userSession, 47);
        this.A02 = 2b1.A01(view.requireViewById(R.id.message_action_log_stub), !C70867OPg.A01(userSession), C70867OPg.A00(userSession));
        this.A03 = 2b1.A01(view.requireViewById(R.id.prompt_xma_stub), !C70867OPg.A01(userSession), C70867OPg.A00(userSession));
        this.A01 = AnonymousClass7TF.A0G(view, R.id.stacks_root);
        this.A04 = 0sr.A1P(new OWC[]{new OWC(AnonymousClass7TF.A0G(view, R.id.first_image), userSession), new OWC(AnonymousClass7TF.A0G(view, R.id.second_image), userSession), new OWC(AnonymousClass7TF.A0G(view, R.id.third_image), userSession), new OWC(AnonymousClass7TF.A0G(view, R.id.fourth_image), userSession)});
        this.A07 = 2b1.A01(view.requireViewById(R.id.footer_container_stub), !C70867OPg.A01(userSession), C70867OPg.A00(userSession));
        this.A06 = C73920Pm0.A01(this, 3);
    }

    public final ImageView Afl() {
        return (ImageView) this.A08.getValue();
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final View BJd() {
        return JTO.A0F(this);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
