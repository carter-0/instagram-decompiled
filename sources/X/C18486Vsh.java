package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;

/* renamed from: X.Vsh  reason: case insensitive filesystem */
public final class C18486Vsh {
    public final UserSession A00;
    public final EffectInfoBottomSheetConfiguration A01;
    public final C17216VMu A02;
    public final C19199WPf A03;
    public final C19199WPf A04;

    public C18486Vsh(UserSession userSession, EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration, C17216VMu vMu, C19199WPf wPf, C19199WPf wPf2) {
        this.A00 = userSession;
        this.A01 = effectInfoBottomSheetConfiguration;
        this.A02 = vMu;
        this.A03 = wPf;
        this.A04 = wPf2;
    }

    public static void A00(View view, float f) {
        Object tag = view.getTag(R.id.effect_info_attributions_item_view_holder);
        if (tag instanceof C17670Vc1) {
            float A022 = 0mi.A02(f, 0.75f, 1.0f, 0.0f, 1.0f);
            C17670Vc1 vc1 = (C17670Vc1) tag;
            vc1.A06.setAlpha(A022);
            vc1.A04.setAlpha(A022);
            vc1.A02.setAlpha(A022);
            vc1.A03.setAlpha(A022);
        }
    }
}
