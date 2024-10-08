package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteAudience;
import com.instagram.friendmap.configs.AggregatedBannerConfig;
import com.instagram.friendmap.configs.FriendMapLaunchConfig;
import java.util.List;

/* renamed from: X.Mpx  reason: case insensitive filesystem */
public final class C67563Mpx implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass4A9 A00;
    public final /* synthetic */ AnonymousClass4AO A01;

    public C67563Mpx(AnonymousClass4A9 r1, AnonymousClass4AO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(661841200);
        AnonymousClass4AF r5 = this.A01.A03;
        AnonymousClass4A9 r1 = this.A00;
        AnonymousClass3HE.A00();
        UserSession userSession = r5.A03;
        if (AnonymousClass3HF.A05(userSession, true)) {
            C3018760k A012 = C3018660j.A01(userSession);
            A012.A01 = new C319496qh((C319746r9) null, C319726r6.POG, (C319736r8) null, (NoteAudience) null, Long.valueOf(r1.A01), (Long) null, r1.A04.getId(), (String) null, (String) null, (String) null, AnonymousClass7TE.A1I(C66947Mfg.FRIEND_MAP_ENTRYPOINT), r1.A00, false);
            A012.A0B(C69506Nmo.A0b);
            AnonymousClass3HE.A00().A02(r5.A01.requireActivity(), userSession, new FriendMapLaunchConfig((AggregatedBannerConfig) null, AnonymousClass05K.A00, (String) null, (String) null, (String) null, (List) null, false, false, false));
        }
        AnonymousClass0fD.A0C(-362583243, A05);
    }
}
