package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;
import com.instagram.common.session.UserSession;

/* renamed from: X.FgT  reason: case insensitive filesystem */
public final class C50668FgT implements AnonymousClass73N {
    public String A00;
    public String A01 = ProfileBannerType.THREADS.A00;
    public String A02;
    public String A03;
    public final C3249770o A04;

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A01;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return false;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_threads_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        this.A04.DrI();
    }

    public final String getId() {
        return this.A02;
    }

    public final String getSubtitle() {
        return this.A00;
    }

    public final String getTitle() {
        return this.A03;
    }

    public C50668FgT(Context context, UserSession userSession, C3249770o r4, Integer num, String str, boolean z) {
        this.A04 = r4;
        this.A02 = str;
        this.A03 = str;
        if (!z && num != null && num.intValue() > 0 && C319886rO.A06(userSession)) {
            this.A00 = DbW.A0h(context, num, 2131969980);
        }
    }

    public final int BEF() {
        return R.drawable.instagram_app_threads_pano_outline_24;
    }
}
