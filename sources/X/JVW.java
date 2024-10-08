package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.TrackDataImpl;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public abstract class JVW {
    public static final JVX A01(MusicAssetModel musicAssetModel) {
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        0qQ.A0B(musicAssetModel2, 0);
        boolean z = musicAssetModel2.A0L;
        String str = musicAssetModel2.A0A;
        String str2 = musicAssetModel2.A0B;
        SimpleImageUrl A0V = DbS.A0V(musicAssetModel2.A03.getUrl());
        SimpleImageUrl A0V2 = DbS.A0V(musicAssetModel2.A02.getUrl());
        String str3 = musicAssetModel2.A0C;
        String str4 = musicAssetModel2.A0D;
        int i = musicAssetModel2.A00;
        boolean z2 = musicAssetModel2.A0O;
        List list = musicAssetModel2.A0J;
        String str5 = musicAssetModel2.A0E;
        0qQ.A07(str5);
        boolean z3 = musicAssetModel2.A0S;
        String str6 = musicAssetModel2.A0H;
        String str7 = musicAssetModel2.A0I;
        boolean z4 = musicAssetModel2.A0Q;
        boolean z5 = musicAssetModel2.A0R;
        return new JVX(new TrackDataImpl((Lyrics) null, A0V, A0V2, Boolean.valueOf(z2), Boolean.valueOf(z4), Boolean.valueOf(z5), Integer.valueOf(i), str, (String) null, str2, (String) null, str3, str4, (String) null, str5, (String) null, str6, (String) null, (String) null, (String) null, str7, (String) null, list, z, z3));
    }

    public static final C66569MWx A00(MusicAssetModel musicAssetModel) {
        C66569MWx A01;
        if (!musicAssetModel.A0U || musicAssetModel.A0G == null || musicAssetModel.A0C == null) {
            A01 = A01(musicAssetModel);
        } else {
            A01 = A02(musicAssetModel);
        }
        return A01;
    }

    public static final DHT A02(MusicAssetModel musicAssetModel) {
        MusicAssetModel musicAssetModel2 = musicAssetModel;
        User user = new User("", musicAssetModel2.A0D);
        user.A0l(musicAssetModel2.A02);
        OriginalSoundConsumptionInfo originalSoundConsumptionInfo = new OriginalSoundConsumptionInfo((MusicMuteAudioReason) null, (String) null, "", musicAssetModel2.A0P, false);
        String str = musicAssetModel2.A0E;
        ArrayList A15 = DbV.A15(str);
        ArrayList A1C = AnonymousClass7TE.A1C();
        String str2 = musicAssetModel2.A0C;
        if (str2 != null) {
            int i = musicAssetModel2.A00;
            Boolean bool = musicAssetModel2.A07;
            0qQ.A07(bool);
            boolean booleanValue = bool.booleanValue();
            boolean z = musicAssetModel2.A0S;
            OriginalAudioSubtype originalAudioSubtype = OriginalAudioSubtype.A07;
            String str3 = musicAssetModel2.A0I;
            0qQ.A07(str3);
            String str4 = musicAssetModel2.A0G;
            if (str4 != null) {
                String str5 = musicAssetModel2.A0H;
                0qQ.A07(str5);
                boolean z2 = musicAssetModel2.A0Q;
                boolean z3 = musicAssetModel2.A0R;
                return new DHT(new OriginalSoundData(originalAudioSubtype, originalSoundConsumptionInfo, (XpostOriginalSoundFBCreatorInfo) null, user, (Boolean) null, (Boolean) null, Boolean.valueOf(z2), Boolean.valueOf(z3), false, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, Integer.valueOf(i), (Integer) null, (Integer) null, (Integer) null, (Integer) null, str, str2, (String) null, (String) null, str3, str4, str5, (List) null, A15, A1C, false, false, booleanValue, z, false));
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
