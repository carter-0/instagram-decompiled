package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsBanner;

/* renamed from: X.McB  reason: case insensitive filesystem */
public final class C66766McB extends C392289uY implements G76 {
    public AnonymousClass2Ep A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final AnonymousClass4kA A03;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        AnonymousClass7TG.A1Q(this.A02, this.A03);
        IgdsBanner igdsBanner = new IgdsBanner(context, (AttributeSet) null, 0);
        igdsBanner.setIcon((int) R.drawable.instagram_alert_pano_outline_24);
        DbT.A1U(igdsBanner, context.getString(2131963823), false);
        igdsBanner.setAction(2131963824);
        igdsBanner.setDismissible(false);
        igdsBanner.A00 = this;
        return igdsBanner;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r8, boolean z) {
        0qQ.A0B(puH, 1);
        this.A00 = r8;
        if (r8 != null) {
            AnonymousClass4kA r3 = this.A03;
            0qQ.A0B(r3, 1);
            if (AnonymousClass7TG.A1a(r3, r3.A0F, AnonymousClass4kA.A0c, 22) || AnonymousClass7TF.A1Y(((AnonymousClass3U9) r8).A01.A1f, true)) {
                puH.DoM(this);
                return;
            }
        }
        puH.onFailure();
    }

    public final void onBannerDismissed() {
    }

    public final void onActionClicked() {
        SUL A0J = Dba.A0J(this.A01, this.A02, 2EG.A1V, "https://help.instagram.com/654906392080948");
        A0J.A0S = "igd_xac_thread_will_be_read_only_banner";
        A0J.A0A();
    }

    public C66766McB(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = AnonymousClass4k9.A00(userSession);
    }
}
