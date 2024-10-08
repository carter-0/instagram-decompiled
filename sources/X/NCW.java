package X;

import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationApi;
import com.facebook.rsys.avatarcommunication.gen.AvatarCommunicationProxy;
import com.instagram.rtc.rsys.models.EngineModel;
import com.instagram.rtc.rsys.models.IgCallModel;

public final class NCW extends AvatarCommunicationProxy {
    public AvatarCommunicationApi A00;
    public final O9Y A01;

    public final void fetchAvatarPresetAssets() {
    }

    public final void fetchCodecAvatarSurveyEligibility() {
    }

    public final void setApi(AvatarCommunicationApi avatarCommunicationApi) {
        0qQ.A0B(avatarCommunicationApi, 0);
        this.A00 = avatarCommunicationApi;
    }

    public final void onAvatarsUsedInCall() {
        String str;
        EngineModel engineModel;
        IgCallModel igCallModel;
        OHZ ohz = this.A01.A00.A0O;
        N4R n4r = (N4R) C66583MXo.A0h(ohz.A01.A00.A0Z.A0Z);
        if (n4r == null || (engineModel = (EngineModel) n4r.A00) == null || (igCallModel = engineModel.callModel) == null) {
            str = null;
        } else {
            str = igCallModel.localCallId;
        }
        0xa r1 = ohz.A00.A00;
        if (!r1.getBoolean("has_seen_end_call_avatar_promo_upsell", false) && str != null) {
            0xY AR4 = r1.AR4();
            AR4.E5g("call_id_end_call_avatar_promo_upsell", str);
            AR4.apply();
        }
    }

    public NCW(O9Y o9y) {
        this.A01 = o9y;
    }
}
