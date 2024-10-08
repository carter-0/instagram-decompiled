package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.FgS  reason: case insensitive filesystem */
public final class C50667FgS implements AnonymousClass73N {
    public String A00 = ProfileBannerType.SCHOOL.A00;
    public String A01;
    public final Context A02;
    public final C3249170i A03;

    public final void DJi() {
    }

    public final /* synthetic */ void DdK() {
    }

    public final String AZm() {
        return this.A00;
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
        return "impression_add_school_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return true;
    }

    public final void D25(boolean z) {
        this.A03.CuF();
    }

    public final String getId() {
        return "add_school_banner";
    }

    public final String getSubtitle() {
        return null;
    }

    public final String getTitle() {
        return this.A01;
    }

    public C50667FgS(Context context, C3249170i r3) {
        this.A02 = context;
        this.A03 = r3;
        this.A01 = AnonymousClass7TE.A16(context, 2131968792);
    }

    public final int BEF() {
        return R.drawable.instagram_add_pano_filled_24;
    }
}
