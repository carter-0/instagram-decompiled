package X;

import android.os.Build;
import com.facebook.proxygen.TraceFieldType;

public final class LNr {
    public final XZP A00;
    public volatile String A01;

    public static void A00(StringBuilder sb) {
        if (sb.length() != 1) {
            sb.append(",");
        }
    }

    public final void A01(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder("{");
        A00(sb);
        C63510KyL.A00(sb, "broadcast_transition_from");
        sb.append(":");
        C63510KyL.A00(sb, str);
        A00(sb);
        C63510KyL.A00(sb, "broadcast_transition_to");
        sb.append(":");
        C63510KyL.A00(sb, str2);
        A00(sb);
        C63510KyL.A00(sb, "broadcast_transition_reason");
        sb.append(":");
        C63510KyL.A00(sb, str3);
        if (str4 != null) {
            A00(sb);
            C63510KyL.A00(sb, "facecast_event_extra");
            sb.append(":");
            C63510KyL.A00(sb, str4);
        }
        String str5 = Build.VERSION.RELEASE;
        A00(sb);
        C63510KyL.A00(sb, "base_system_version");
        sb.append(":");
        C63510KyL.A00(sb, str5);
        String str6 = this.A01;
        if (str6 != null) {
            A00(sb);
            C63510KyL.A00(sb, TraceFieldType.BroadcastId);
            sb.append(":");
            C63510KyL.A00(sb, str6);
        }
        XZP xzp = this.A00;
        String A0l = AnonymousClass7TF.A0l("}", sb);
        sb.deleteCharAt(sb.length() - 1);
        0qQ.A07(A0l);
        xzp.A00.logEvent("facecast_broadcaster_update", A0l);
    }

    public LNr(XZP xzp) {
        this.A00 = xzp;
    }
}
