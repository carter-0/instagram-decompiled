package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.Lh3  reason: case insensitive filesystem */
public final class C64726Lh3 implements 1DN {
    public final /* synthetic */ AnonymousClass7JI A00;

    public C64726Lh3(AnonymousClass7JI r1) {
        this.A00 = r1;
    }

    public final void DWm(Map map) {
        String str;
        AnonymousClass7JI r2 = this.A00;
        if (1DL.A07(r2.A0L, "android.permission.RECORD_AUDIO")) {
            str = "app_permission_grant";
        } else {
            str = "app_permission_deny";
        }
        UserSession userSession = r2.A0O;
        new AnonymousClass4O6(DbS.A0O("VoiceMessagingController"), userSession).A00(new AnonymousClass9JF(AnonymousClass4O9.MICROPHONE, AnonymousClass4OA.UNSPECIFIED), AnonymousClass4O7.A00(userSession), str, "VoiceMessagingController", (String) null, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
    }
}
