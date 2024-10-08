package X;

import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class SV0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass36H A01;

    public SV0(UserSession userSession, AnonymousClass36H r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A00), "instagram_android_13_notifications_priming_event");
        if (A0e.isSampled()) {
            A0e.AAJ("experiment_group", "in_priming_test_v2");
            A0e.AAJ(TraceFieldType.AdhocEventName, "priming_screen_denied");
            A0e.Cgf();
        }
    }
}
