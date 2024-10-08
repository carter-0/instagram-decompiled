package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.api.schemas.BoostedActionStatus;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Mc7  reason: case insensitive filesystem */
public final class C66762Mc7 extends C392289uY {
    public View A00;
    public View A01;
    public View A02;
    public 1OC A03;
    public 1OC A04;
    public IgTextView A05;
    public IgImageView A06;
    public C3725791l A07;
    public N3P A08;
    public C74401PuH A09;
    public Integer A0A = AnonymousClass05K.A0N;
    public String A0B;
    public String A0C;
    public String A0D;
    public final FragmentActivity A0E;
    public final AnonymousClass0iw A0F;
    public final UserSession A0G;
    public final C3725891m A0H = new C3725891m(this);
    public final C3725991n A0I = new C3725991n(this);

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        View view = this.A01;
        if (view != null) {
            return view;
        }
        View inflate = View.inflate(context, R.layout.direct_thread_promote_ad_banner, (ViewGroup) null);
        DbY.A0z(inflate);
        this.A01 = inflate;
        return inflate;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r8, boolean z) {
        String str;
        String str2;
        Integer num;
        C376579In Bgc;
        0qQ.A0B(puH, 1);
        this.A09 = puH;
        String str3 = "";
        if (r8 == null || (Bgc = r8.Bgc()) == null || (str = Bgc.A00) == null) {
            str = str3;
        }
        this.A0B = str;
        if (r8 == null || (str2 = r8.C6k()) == null) {
            str2 = str3;
        }
        this.A0D = str2;
        if (r8 != null && AnonymousClass7TE.A1b(r8.BRZ())) {
            str3 = DbS.A0q(r8.BRZ().get(0));
        }
        this.A0C = str3;
        String str4 = this.A0B;
        if (str4 == null) {
            0qQ.A0F("adMediaId");
            throw AnonymousClass00P.createAndThrow();
        }
        if (!(str4.length() == 0 || str3.length() == 0 || (num = this.A0A) == AnonymousClass05K.A00 || num == AnonymousClass05K.A01)) {
            UserSession userSession = this.A0G;
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A06, userSession, 36316787461329540L)) {
                C18676VwZ.A00(this.A0E, new C71847Oro(this, 0), userSession);
                return;
            }
        }
        puH.onFailure();
    }

    public static final Integer A00(C66762Mc7 mc7) {
        N3P n3p = mc7.A08;
        if (n3p == null) {
            0qQ.A0F("activeAdModel");
            throw AnonymousClass00P.createAndThrow();
        }
        BoostedActionStatus boostedActionStatus = n3p.A09;
        if (boostedActionStatus == BoostedActionStatus.PAUSED) {
            return AnonymousClass05K.A0N;
        }
        if (boostedActionStatus == BoostedActionStatus.EXTENDABLE) {
            return AnonymousClass05K.A0C;
        }
        if (!n3p.A0F) {
            long j = ((long) n3p.A07) * 24;
            UserSession userSession = mc7.A0G;
            0qQ.A0B(userSession, 0);
            0Tu r2 = 0Tu.A06;
            double A002 = 182.A00(r2, userSession, 37161212391260331L);
            double A003 = 182.A00(r2, userSession, 37161212391325868L);
            double d = (double) (j - ((long) n3p.A04));
            double d2 = (double) j;
            if (d >= A003 * d2 && d <= d2 * A002) {
                return AnonymousClass05K.A01;
            }
        }
        return AnonymousClass05K.A00;
    }

    public static final void A01(C66762Mc7 mc7) {
        View view = mc7.A01;
        if (view != null) {
            view.setVisibility(8);
        } else {
            0qQ.A0F("bannerView");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C66762Mc7(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        this.A0G = userSession;
        this.A0F = r3;
        this.A0E = fragmentActivity;
        this.A07 = new C3725791l(r3, userSession);
    }
}
