package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.Set;

/* renamed from: X.9PL  reason: invalid class name */
public final class AnonymousClass9PL extends MYU {
    public final C2366634p A00;
    public final C2366634p A01;
    public final A57 A02;
    public final C71162bE A03;

    public final int A0L() {
        return 31784974;
    }

    public final void A0Q(Context context, 2cc r3, AnonymousClass0iw r4, boolean z) {
        0qQ.A0B(context, 0);
        super.A0Q(context, r3, r4, z);
    }

    public final void A05() {
        A0J("destination", this.A02.A00);
    }

    public final void A0C(C2366634p r3, String str, long j) {
        C2366634p r1 = this.A00;
        if (r3 == r1) {
            this.A08.remove(this.A01);
        } else if (r3 == this.A01) {
            this.A08.remove(r1);
        }
        super.A0C(r3, str, j);
    }

    public final boolean A0S() {
        C71162bE r3 = this.A03;
        float f = r3.A01;
        if (this.A02.A01.getChildFragmentManager().A0P(R.id.feed_gallery_fragment_holder) != null || r3.A04.A01(f) <= 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9PL(UserSession userSession, A57 a57, C71162bE r7) {
        super(userSession);
        AnonymousClass7TG.A1Q(a57, userSession);
        this.A03 = r7;
        this.A02 = a57;
        C2366634p r3 = new C2366634p(this, "init_camera");
        this.A00 = r3;
        C2366634p r2 = new C2366634p(this, "init_gallery");
        this.A01 = r2;
        Set set = this.A07;
        set.add(r3);
        Set set2 = this.A06;
        set2.add(r3);
        set.add(r2);
        set2.add(r2);
    }
}
