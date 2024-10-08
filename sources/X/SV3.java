package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

public final class SV3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass36H A02;

    public SV3(Activity activity, UserSession userSession, AnonymousClass36H r3) {
        this.A02 = r3;
        this.A01 = userSession;
        this.A00 = activity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A01), "instagram_android_13_notifications_priming_event");
        if (A0e.isSampled()) {
            A0e.AAJ("experiment_group", "in_priming_test_v2");
            A0e.AAJ(TraceFieldType.AdhocEventName, "priming_screen_accepted");
            A0e.Cgf();
        }
        JTP.A11(this.A00, T7K.A00, AnonymousClass000.A00(247));
    }
}
