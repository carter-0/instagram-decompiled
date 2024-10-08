package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgLinearLayout;

/* renamed from: X.PBe  reason: case insensitive filesystem */
public final class C72573PBe implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final IgFrameLayout A01;
    public final C252063oV A02;
    public final C70719OHo A03;
    public final C70719OHo A04;
    public final C70719OHo A05;
    public final AnonymousClass0eM A06 = C73909Plk.A00(this, 38);
    public final IgLinearLayout A07;
    public final AnonymousClass0eM A08;

    public C72573PBe(View view, UserSession userSession) {
        0qQ.A0B(view, 1);
        this.A08 = C73909Plk.A00(view, 39);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass7TF.A0F(view, R.id.message_content_multi_media_container);
        this.A07 = igLinearLayout;
        this.A01 = (IgFrameLayout) AnonymousClass7TF.A0F(igLinearLayout, R.id.stacks_root);
        this.A03 = new C70719OHo(view, userSession, R.id.first_image);
        this.A04 = new C70719OHo(view, userSession, R.id.second_image);
        this.A05 = new C70719OHo(view, userSession, R.id.third_image);
        this.A02 = DbU.A0Z(view, R.id.message_action_log_stub);
    }

    public final ImageView Afl() {
        return (ImageView) this.A08.getValue();
    }

    public final View BJd() {
        return this.A07;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
