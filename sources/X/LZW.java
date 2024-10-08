package X;

import android.os.Bundle;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.creation.sharesheet.advancedsettings.config.ClipsAdvancedSettingsConfig;
import instagram.features.stories.fragment.ReelMoreOptionsFragment;

public final class LZW implements 06c {
    public final int A00;
    public final Object A01;

    public LZW(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DGi(String str, Bundle bundle) {
        C16343UtG utG;
        switch (this.A00) {
            case 0:
                0qQ.A0B(bundle, 1);
                if (bundle.getBoolean("result_sticker_creation_status") && (utG = ((C65075Lmv) this.A01).A04) != null) {
                    utG.A03(C62456Kg6.SAVED);
                    return;
                }
                return;
            case 1:
                0qQ.A0B(bundle, 1);
                BrandedContentGatingInfo brandedContentGatingInfo = (BrandedContentGatingInfo) bundle.getParcelable("bundle_key_gating_info");
                K53 k53 = (K53) this.A01;
                ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig = k53.A01;
                if (clipsAdvancedSettingsConfig != null) {
                    clipsAdvancedSettingsConfig.A00 = brandedContentGatingInfo;
                    QD0 qd0 = (QD0) k53.A03.getValue();
                    ClipsAdvancedSettingsConfig clipsAdvancedSettingsConfig2 = k53.A01;
                    if (clipsAdvancedSettingsConfig2 != null) {
                        qd0.A01.A01("clipsAdvancedSettingsConfig", clipsAdvancedSettingsConfig2);
                        return;
                    }
                }
                0qQ.A0F("clipsAdvancedSettingsConfig");
                throw AnonymousClass00P.createAndThrow();
            default:
                ReelMoreOptionsFragment reelMoreOptionsFragment = (ReelMoreOptionsFragment) this.A01;
                AnonymousClass8CB r0 = new AnonymousClass8CB(reelMoreOptionsFragment.A03);
                r0.A00 = (BrandedContentGatingInfo) bundle.getParcelable("bundle_key_gating_info");
                reelMoreOptionsFragment.A03 = r0.A01();
                ReelMoreOptionsFragment.A0B(reelMoreOptionsFragment);
                return;
        }
    }
}
