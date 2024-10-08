package X;

import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.JqD  reason: case insensitive filesystem */
public final class C60724JqD extends 1Vg {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60724JqD(C251983oI r1, Object obj, int i) {
        super(r1);
        this.A00 = i;
        this.A01 = obj;
    }

    public final String createQuery() {
        switch (this.A00) {
            case 0:
                return "\n    DELETE FROM security_alert WHERE id = ?\n  ";
            case 1:
                return "\n    DELETE FROM security_alert WHERE user_id = ?\n  ";
            case 2:
                return "\n    UPDATE security_alert\n    SET first_read_timestamp_ms = CURRENT_TIMESTAMP\n    WHERE user_id = ?\n      AND created_timestamp_ms >= ?\n  ";
            case 3:
                return "\n    UPDATE security_alert\n    SET activity_feed_read_timestamp_ms = CURRENT_TIMESTAMP\n    WHERE id = ?\n  ";
            case 4:
                return "\n    UPDATE security_alert\n    SET is_confirm = ?\n    WHERE id = ?\n  ";
            case 5:
                return "\n    DELETE FROM security_alert WHERE user_id = ? AND created_timestamp_ms < ?;\n      ";
            case 6:
                return "DELETE FROM suggestions WHERE suggestion_id = ?";
            case 7:
                return "DELETE FROM suggestions WHERE suggestion_mode = ?";
            case 8:
                return "UPDATE drafts SET is_uploading = ? WHERE id = ?";
            case 9:
                return "DELETE FROM drafts WHERE id = ?";
            case 10:
                return "DELETE FROM drafts";
            case 11:
                return "DELETE FROM qs_realtime_signals WHERE timestamp < ?";
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return "DELETE FROM suggested_users";
            default:
                return "DELETE FROM suggested_users WHERE CAST(last_timestamp AS LONG) < ?";
        }
    }
}
