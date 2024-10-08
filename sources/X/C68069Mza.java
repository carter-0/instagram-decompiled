package X;

import android.app.Activity;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Mza  reason: case insensitive filesystem */
public final class C68069Mza extends C249703kE implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final C252063oV A01;
    public final C252063oV A02;
    public final List A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final ImageView A06;

    public final ImageView Afl() {
        return this.A06;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public C68069Mza(Activity activity, View view, UserSession userSession) {
        super(view);
        this.A06 = DbX.A0J(view, R.id.doubletap_heart);
        this.A02 = 2b1.A01(view.requireViewById(R.id.prompt_xma_stub), false, false);
        this.A03 = 0sr.A1P(new OFB[]{new OFB(activity, AnonymousClass7TF.A0G(view, R.id.first_image), userSession), new OFB(activity, AnonymousClass7TF.A0G(view, R.id.second_image), userSession), new OFB(activity, AnonymousClass7TF.A0G(view, R.id.third_image), userSession), new OFB(activity, AnonymousClass7TF.A0G(view, R.id.fourth_image), userSession)});
        this.A01 = DbV.A0T(view, R.id.footer_container_stub, false);
        this.A04 = C73916Plr.A00(view, this, 32);
        this.A05 = C73916Plr.A00(view, this, 33);
    }

    public final View BJd() {
        return JTO.A0F(this);
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
