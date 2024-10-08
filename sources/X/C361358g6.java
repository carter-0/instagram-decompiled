package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;

/* renamed from: X.8g6  reason: invalid class name and case insensitive filesystem */
public final class C361358g6 {
    public static final C361358g6 A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        if (r4 == 1) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.content.Context r8, com.instagram.common.session.UserSession r9, X.1Av r10) {
        /*
            r7 = this;
            r5 = 2
            X.0qQ.A0B(r10, r5)
            X.8g7 r0 = X.C361368g7.A00
            java.lang.Integer r0 = r0.A00(r8)
            int r4 = r0.intValue()
            X.0xa r6 = r10.A01
            java.lang.String r2 = "story_camera_lockscreen_shortcut_status"
            r1 = 0
            int r0 = r6.getInt(r2, r1)
            if (r4 == r1) goto L_0x001c
            r3 = 1
            if (r4 != r3) goto L_0x0022
        L_0x001c:
            if (r0 == r1) goto L_0x0021
            r3 = 1
            if (r0 != r3) goto L_0x0022
        L_0x0021:
            return
        L_0x0022:
            if (r4 == r0) goto L_0x0021
            X.0xY r0 = r6.AR4()
            r0.E5Z(r2, r4)
            r0.apply()
            X.FA7 r1 = X.C48962En0.A00(r8, r9)
            boolean r0 = X.FA7.A00(r1)
            if (r0 == 0) goto L_0x0021
            X.0eM r0 = r1.A01
            java.lang.Object r2 = r0.getValue()
            X.0wc r2 = (X.0wc) r2
            java.lang.String r1 = "ig_lock_screen_shortcuts"
            X.0kJ r0 = r2.A00
            X.0Aj r2 = r2.A00(r0, r1)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x0021
            if (r4 == r3) goto L_0x0063
            if (r4 == r5) goto L_0x0060
            r0 = 3
            if (r4 != r0) goto L_0x0021
            java.lang.String r1 = "lss_status_updated_to_right"
        L_0x0057:
            java.lang.String r0 = "action"
            r2.AAJ(r0, r1)
            r2.Cgf()
            return
        L_0x0060:
            java.lang.String r1 = "lss_status_updated_to_left"
            goto L_0x0057
        L_0x0063:
            java.lang.String r1 = "lss_status_cleared"
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C361358g6.A00(android.content.Context, com.instagram.common.session.UserSession, X.1Av):void");
    }

    public final void A01(UserSession userSession, Context context, boolean z) {
        String str;
        0qQ.A0B(userSession, 1);
        if (C342017nu.A00(context, userSession).A00()) {
            boolean booleanValue = ((Boolean) C342017nu.A00(context, userSession).A04.getValue()).booleanValue();
            String A002 = AnonymousClass000.A00(2881);
            if (booleanValue) {
                str = "com.instagram.lockscreen.LockScreenShortcutActivity";
            } else if (((Boolean) C342017nu.A00(context, userSession).A05.getValue()).booleanValue()) {
                0oI.A08(context, A002, true);
                str = A002;
            } else {
                return;
            }
            Intent intent = new Intent();
            intent.setAction("com.samsung.dressroom.intent.action.SHOW_LOCK_SHORTCUT_PICKER");
            Intent intent2 = new Intent();
            intent2.setAction("com.samsung.dressroom.intent.action.SHOW_LOCK_SHORTCUT_PICKER");
            if (context.getApplicationContext().getPackageManager().resolveActivity(intent2, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP) != null) {
                if (((Boolean) C342017nu.A00(context, userSession).A05.getValue()).booleanValue()) {
                    userSession.A01(C40269AYi.class, new C58694Iw3(A002, context, 3));
                }
                intent.putExtra("launch_from", context.getApplicationContext().getPackageName());
                intent.putExtra("pre_selected_activity", str);
                intent.putExtra("shortcut_left_icon", z);
                0b6.A00().A0A().A0G(context, intent);
            }
        }
    }

    public final boolean A02(Context context, UserSession userSession, 1Av r6) {
        0qQ.A0B(r6, 2);
        if (!C342017nu.A00(context, userSession).A00()) {
            return false;
        }
        A00(context, userSession, r6);
        Integer A002 = C361368g7.A00.A00(context);
        if (A002 == AnonymousClass05K.A0C || A002 == AnonymousClass05K.A0N) {
            return true;
        }
        return false;
    }
}
