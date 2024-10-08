package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.sundial.template.suggestion.ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1;
import com.instagram.music.common.model.MusicAssetModel;

/* renamed from: X.8I6  reason: invalid class name */
public final class AnonymousClass8I6 extends 2YL {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 41));
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public AnonymousClass8I6(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        02z A012 = 106.A01(AnonymousClass8I7.A00);
        this.A02 = A012;
        this.A03 = A012;
    }

    public final void A00(MusicAssetModel musicAssetModel, boolean z) {
        String str;
        05G r1 = this.A02;
        r1.Epw(AnonymousClass8I7.A00);
        String str2 = musicAssetModel.A0B;
        if (str2 == null || 00l.A0W(str2)) {
            str = musicAssetModel.A0E;
        } else {
            str = musicAssetModel.A0B;
        }
        if (str == null || 00l.A0W(str)) {
            r1.Epw(AnonymousClass8IE.A00);
            return;
        }
        ImageUrl imageUrl = musicAssetModel.A03;
        C318136oS A002 = C318116oQ.A00(this);
        ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 clipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1 = new ClipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1(imageUrl, this, str, (AnonymousClass4D7) null, z);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, clipsTemplateSuggestionViewModel$setTemplateSuggestionByAudioTrack$1, A002);
    }
}
