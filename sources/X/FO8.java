package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

public final class FO8 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MusicAssetModel A03;
    public final /* synthetic */ C234502xy A04;

    public FO8(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, MusicAssetModel musicAssetModel, C234502xy r5) {
        this.A02 = userSession;
        this.A00 = r1;
        this.A03 = musicAssetModel;
        this.A04 = r5;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-255766113);
        String A0j = AnonymousClass7TG.A0j();
        UserSession userSession = this.A02;
        AnonymousClass4DH r1 = this.A00;
        MusicAssetModel musicAssetModel = this.A03;
        AnonymousClass708.A07(r1, userSession, musicAssetModel, this.A04);
        String moduleName = this.A01.getModuleName();
        String str = musicAssetModel.A0E;
        0qQ.A07(str);
        long A07 = DbZ.A07(str);
        C54689HOu hOu = C54689HOu.A0z;
        String A0k = DbS.A0k();
        AnonymousClass8ZN r5 = AnonymousClass8ZN.PROFILE_MUSIC_PARTIAL_SHEET;
        String str2 = musicAssetModel.A0B;
        0qQ.A07(str2);
        C56326Hwd.A00(hOu, r5, userSession, 00y.A0n(10, str2), moduleName, A0k, A0j, A07);
        AnonymousClass0fD.A0C(-384158121, A05);
    }
}
