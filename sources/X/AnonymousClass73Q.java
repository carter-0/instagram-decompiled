package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel;
import com.instagram.android.R;
import com.instagram.api.schemas.ProfileBannerType;

/* renamed from: X.73Q  reason: invalid class name */
public final class AnonymousClass73Q implements AnonymousClass73N {
    public String A00 = ProfileBannerType.AI_AGENTS.A00;
    public String A01;
    public String A02;
    public String A03;
    public final AiStudioProfileBannerPersonaModel A04;
    public final C3249270j A05;

    public AnonymousClass73Q(Context context, AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel, C3249270j r4) {
        0qQ.A0B(aiStudioProfileBannerPersonaModel, 2);
        this.A04 = aiStudioProfileBannerPersonaModel;
        this.A05 = r4;
        this.A01 = aiStudioProfileBannerPersonaModel.A00;
        this.A03 = aiStudioProfileBannerPersonaModel.A01;
        this.A02 = context.getString(2131952713);
    }

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
        return "impression_aistudio_banner";
    }

    public final boolean Bvq() {
        return false;
    }

    public final boolean CCY() {
        return false;
    }

    public final void D25(boolean z) {
        C3249270j r2 = this.A05;
        AiStudioProfileBannerPersonaModel aiStudioProfileBannerPersonaModel = this.A04;
        r2.Cuo(aiStudioProfileBannerPersonaModel.A00, z, aiStudioProfileBannerPersonaModel.A02);
    }

    public final String getId() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A02;
    }

    public final String getTitle() {
        return this.A03;
    }

    public final int BEF() {
        return R.drawable.instagram_gen_ai_pano_outline_24;
    }
}
