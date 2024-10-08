package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.model.fbusertag.FBUserTag;

/* renamed from: X.7bb  reason: invalid class name and case insensitive filesystem */
public final class C334627bb implements 1wn {
    public final /* synthetic */ C334537bS A00;

    public C334627bb(C334537bS r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(883596158);
        C240233Kc r8 = (C240233Kc) obj;
        int A032 = AnonymousClass0fD.A03(1368735359);
        0qQ.A0B(r8, 0);
        1Xj r4 = r8.A00;
        FBUserTag fBUserTag = r8.A01;
        C334537bS r0 = this.A00;
        UserSession userSession = r0.A0E;
        Fragment fragment = r0.A01;
        I6Q.A00(fragment, userSession, r4);
        if (!fBUserTag.A04) {
            LTZ.A0D(fragment, userSession, r4, fBUserTag);
        }
        AnonymousClass0fD.A0A(-1674741224, A032);
        AnonymousClass0fD.A0A(-1584920711, A03);
    }
}
