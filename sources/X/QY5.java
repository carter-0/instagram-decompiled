package X;

import com.facebook.papaya.log.LogSink;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import java.util.Map;

public final class QY5 extends LogSink {
    public final 0wc A00;
    public final UserSession A01;

    public final void event(long j, long j2, long j3, int i, Map map, String str) {
    }

    public final void log(long j, long j2, long j3, int i, String str, int i2, String str2) {
        DbW.A1O(str, 4, str2);
        0Aj A0e = AnonymousClass7TE.A0e(this.A00, "mldw_client_debug");
        if (A0e.isSampled()) {
            A0e.A9F("counter", Long.valueOf(j));
            A0e.A9F("timestamp", Long.valueOf(j2));
            A0e.A9F(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, Long.valueOf(j3));
            A0e.A9F("level", DbS.A0j(i));
            A0e.AAJ("file_name", str);
            A0e.A9F("file_line", DbS.A0j(i2));
            A0e.AAJ(DialogModule.KEY_MESSAGE, str2);
            A0e.Cgf();
        }
    }

    public QY5(UserSession userSession) {
        this.A01 = userSession;
        this.A00 = AnonymousClass0kN.A02(userSession);
    }
}
