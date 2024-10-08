package X;

import com.instagram.api.schemas.TrackData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.music.common.model.MusicConsumptionModel;
import com.instagram.music.common.model.MusicConsumptionModelImpl;
import com.instagram.reels.question.model.MusicQuestionResponseModel;
import java.io.IOException;

public abstract class D2E {
    public static MusicQuestionResponseModel parseFromJson(16F r7) {
        0qQ.A0B(r7, 0);
        try {
            TrackDataImpl trackDataImpl = null;
            if (r7.A11() != 16L.A0D) {
                r7.A0z();
                return null;
            }
            MusicConsumptionModelImpl musicConsumptionModelImpl = null;
            while (r7.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r7);
                if ("music_asset_info".equals(A17)) {
                    trackDataImpl = AnonymousClass3UP.parseFromJson(r7);
                } else if ("music_consumption_info".equals(A17)) {
                    musicConsumptionModelImpl = AnonymousClass3US.parseFromJson(r7);
                }
                r7.A0z();
            }
            if (trackDataImpl == null && (r7 instanceof 0c9)) {
                AnonymousClass7TF.A1L("music_asset_info", r7, "MusicQuestionResponseModel");
            } else if (musicConsumptionModelImpl != null || !(r7 instanceof 0c9)) {
                return new MusicQuestionResponseModel(trackDataImpl, musicConsumptionModelImpl);
            } else {
                AnonymousClass7TF.A1L("music_consumption_info", r7, "MusicQuestionResponseModel");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r2, MusicQuestionResponseModel musicQuestionResponseModel) {
        r2.A0c();
        TrackData trackData = musicQuestionResponseModel.A00;
        if (trackData != null) {
            r2.A0q("music_asset_info");
            AnonymousClass3UP.A00(r2, trackData.FCv());
        }
        MusicConsumptionModel musicConsumptionModel = musicQuestionResponseModel.A01;
        if (musicConsumptionModel != null) {
            AnonymousClass3US.A00(r2, musicConsumptionModel.FG7(C41846B3n.A0T(r2, "music_consumption_info")));
        }
        r2.A0Z();
    }
}
