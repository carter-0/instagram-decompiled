package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.FgR  reason: case insensitive filesystem */
public final class C50666FgR implements AnonymousClass73N {
    public String A00 = ProfileBannerType.WHATSAPP_PROFILE.A00;
    public String A01;
    public final Context A02;

    public final void D25(boolean z) {
    }

    public final void DJi() {
    }

    public final void DdK() {
    }

    public final String AZm() {
        return this.A00;
    }

    public final long B2g() {
        return 0;
    }

    public final boolean BDG() {
        return true;
    }

    public final Drawable BEC() {
        return null;
    }

    public final String BGa() {
        return "impression_whatsapp_profile_banner";
    }

    public final boolean Bvq() {
        return true;
    }

    public final boolean CCY() {
        return false;
    }

    public final String getId() {
        return "whatsapp_profile";
    }

    public final String getSubtitle() {
        return "Whatsapp";
    }

    public final String getTitle() {
        return this.A01;
    }

    public C50666FgR(Context context) {
        this.A02 = context;
        this.A01 = AnonymousClass7TE.A16(context, 2131970032);
    }

    public final int BEF() {
        return R.drawable.instagram_app_whatsapp_pano_outline_24;
    }
}
