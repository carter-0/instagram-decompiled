package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

public final class LXY implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4DH A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ MusicAssetModel A03;

    public LXY(AnonymousClass4DH r1, AnonymousClass0iw r2, UserSession userSession, MusicAssetModel musicAssetModel) {
        this.A00 = r1;
        this.A02 = userSession;
        this.A01 = r2;
        this.A03 = musicAssetModel;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(361692194);
        FragmentActivity requireActivity = this.A00.requireActivity();
        UserSession userSession = this.A02;
        C309516Yo A0M = DbS.A0M(requireActivity, userSession);
        Bundle A09 = DbY.A09(userSession);
        K52 k52 = new K52();
        k52.setArguments(A09);
        Dba.A0w((Bundle) null, k52, A0M);
        String moduleName = this.A01.getModuleName();
        MusicAssetModel musicAssetModel = this.A03;
        String str = musicAssetModel.A0E;
        0qQ.A07(str);
        long A07 = DbZ.A07(str);
        C54689HOu hOu = C54689HOu.A06;
        String A0k = DbS.A0k();
        String str2 = musicAssetModel.A0B;
        0qQ.A07(str2);
        C56326Hwd.A00(hOu, (AnonymousClass8ZN) null, userSession, 00y.A0n(10, str2), moduleName, A0k, (String) null, A07);
        AnonymousClass0fD.A0C(150082162, A05);
    }
}
