package X;

import android.content.Intent;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

public abstract class MYX {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0065, code lost:
        if (r6.A1S != false) goto L_0x0067;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.0xI A01(X.AnonymousClass5HJ r6, java.lang.String r7, java.util.List r8) {
        /*
            r2 = 1
            java.lang.String r3 = r6.A0g
            java.lang.String r1 = r6.A1A
            java.lang.String r0 = r6.A0u
            X.0xI r4 = A03(r7, r3, r1, r0)
            com.instagram.common.notifications.push.intf.PushChannelType r3 = r6.A0B
            if (r3 != 0) goto L_0x0011
            com.instagram.common.notifications.push.intf.PushChannelType r3 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L_0x0011:
            java.lang.String r5 = r6.A12
            java.lang.String r1 = "empty-or-null-ig4a"
            if (r5 != 0) goto L_0x0018
            r5 = r1
        L_0x0018:
            java.lang.String r0 = "pi"
            r4.A0C(r0, r5)
            if (r8 != 0) goto L_0x0023
            java.util.List r8 = X.AnonymousClass7TE.A1I(r5)
        L_0x0023:
            java.lang.String r0 = "push_ids"
            r4.A0D(r0, r8)
            java.lang.String r0 = r6.A11
            if (r0 == 0) goto L_0x002d
            r1 = r0
        L_0x002d:
            java.lang.String r0 = "push_category"
            r4.A0C(r0, r1)
            java.lang.String r0 = r6.A0j
            boolean r0 = X.C282435Db.A02(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_bg_account"
            r4.A09(r0, r1)
            java.lang.String r1 = r6.A0j
            java.lang.String r0 = "recipient_id"
            r4.A0C(r0, r1)
            java.lang.String r1 = r3.name()
            java.lang.String r0 = "push_channel_type"
            r4.A0C(r0, r1)
            boolean r0 = r6.A1U
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_vm_active"
            r4.A09(r0, r1)
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0067
            boolean r1 = r6.A1S
            r0 = 0
            if (r1 == 0) goto L_0x0068
        L_0x0067:
            r0 = 1
        L_0x0068:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_e2ee"
            r4.A09(r0, r1)
            java.lang.Long r1 = r6.A0L
            java.lang.String r0 = "occamadillo_thread_id"
            if (r1 == 0) goto L_0x007a
            r4.A0B(r0, r1)
        L_0x007a:
            java.lang.String r1 = A04(r6)
            java.lang.String r0 = "thread_id"
            r4.A0C(r0, r1)
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.N4O r0 = r6.A05
            if (r0 == 0) goto L_0x0096
            boolean r0 = r0.A00()
            if (r0 != r2) goto L_0x0096
            X.Nmi r0 = X.C69500Nmi.A04
            r1.add(r0)
        L_0x0096:
            boolean r0 = r6.A1U
            if (r0 == 0) goto L_0x009f
            X.Nmi r0 = X.C69500Nmi.A0E
            r1.add(r0)
        L_0x009f:
            boolean r0 = X.DbT.A1b(r1)
            if (r0 == 0) goto L_0x00c5
            X.0xE r3 = new X.0xE
            r3.<init>()
            java.util.Iterator r2 = r1.iterator()
        L_0x00ae:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00c0
            java.lang.Object r0 = r2.next()
            X.Nmi r0 = (X.C69500Nmi) r0
            long r0 = r0.A00
            r3.A02(r0)
            goto L_0x00ae
        L_0x00c0:
            java.lang.String r0 = "feature_tags"
            r4.A06(r3, r0)
        L_0x00c5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYX.A01(X.5HJ, java.lang.String, java.util.List):X.0xI");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r6.A1S != false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(android.content.Intent r5, X.AnonymousClass5HJ r6) {
        /*
            r3 = 1
            com.instagram.common.notifications.push.intf.PushChannelType r4 = r6.A0B
            if (r4 != 0) goto L_0x0007
            com.instagram.common.notifications.push.intf.PushChannelType r4 = com.instagram.common.notifications.push.intf.PushChannelType.A0D
        L_0x0007:
            java.lang.String r1 = r4.name()
            java.lang.String r0 = "from_notification_push_channel_type"
            r5.putExtra(r0, r1)
            boolean r1 = r6.A1U
            java.lang.String r0 = "is_vm_active"
            r5.putExtra(r0, r1)
            boolean r0 = r6.A05()
            if (r0 != 0) goto L_0x0022
            boolean r0 = r6.A1S
            r1 = 0
            if (r0 == 0) goto L_0x0023
        L_0x0022:
            r1 = 1
        L_0x0023:
            java.lang.String r0 = "is_e2ee"
            r5.putExtra(r0, r1)
            boolean r1 = r6.A1S
            java.lang.String r0 = "is_instamadillo"
            r5.putExtra(r0, r1)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = "notification_in_tray_timestamp"
            r5.putExtra(r0, r1)
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = "armadillo_thread_id"
            r5.putExtra(r0, r1)
            java.util.HashMap r1 = r6.A1J
            if (r1 != 0) goto L_0x0047
            java.util.Map r1 = java.util.Collections.emptyMap()
        L_0x0047:
            java.lang.String r0 = r4.toString()
            java.lang.String r1 = X.DbT.A11(r0, r1)
            if (r1 != 0) goto L_0x0053
            java.lang.String r1 = ""
        L_0x0053:
            java.lang.String r0 = "token_fb_id"
            r5.putExtra(r0, r1)
            java.lang.String r1 = A04(r6)
            java.lang.String r0 = "thread_id"
            r5.putExtra(r0, r1)
            java.lang.Long r0 = r6.A0L
            if (r0 == 0) goto L_0x006e
            long r1 = r0.longValue()
            java.lang.String r0 = "occamadillo_thread_id"
            r5.putExtra(r0, r1)
        L_0x006e:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            X.N4O r0 = r6.A05
            if (r0 == 0) goto L_0x0081
            boolean r0 = r0.A00()
            if (r0 != r3) goto L_0x0081
            r0 = 15
            X.AnonymousClass7TE.A1Y(r2, r0)
        L_0x0081:
            boolean r0 = r6.A1U
            if (r0 == 0) goto L_0x008a
            r0 = 23
            X.AnonymousClass7TE.A1Y(r2, r0)
        L_0x008a:
            boolean r0 = X.DbT.A1b(r2)
            if (r0 == 0) goto L_0x0099
            long[] r1 = X.00k.A0y(r2)
            java.lang.String r0 = "feature_tags"
            r5.putExtra(r0, r1)
        L_0x0099:
            X.5Lz r0 = r6.A0A
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = r0.A07
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "push_infra_notification_id"
            r5.putExtra(r0, r1)
        L_0x00a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MYX.A05(android.content.Intent, X.5HJ):void");
    }

    public static final 0xI A00(Intent intent, String str, String str2) {
        0xI A03 = A03(str, intent.getStringExtra("landing_path"), intent.getStringExtra("sender_id"), (String) null);
        A03.A09("is_e2ee", Boolean.valueOf(intent.getBooleanExtra("is_e2ee", false)));
        long longExtra = intent.getLongExtra("occamadillo_thread_id", 0);
        if (longExtra != 0) {
            A03.A0B("occamadillo_thread_id", Long.valueOf(longExtra));
        }
        if (str2 != null) {
            A03.A0C("recipient_id", str2);
        }
        String stringExtra = intent.getStringExtra(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID);
        if (stringExtra != null) {
            A03.A0C(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, stringExtra);
        }
        A03.A09("is_vm_active", Boolean.valueOf(intent.getBooleanExtra("is_vm_active", false)));
        A03.A08(C66580MXl.A0q(), "render_target");
        long[] longArrayExtra = intent.getLongArrayExtra("feature_tags");
        if (longArrayExtra != null) {
            0xE r3 = new 0xE();
            for (long A02 : longArrayExtra) {
                r3.A02(A02);
            }
            A03.A06(r3, "feature_tags");
        }
        return A03;
    }

    public static final 0xI A02(String str) {
        String str2;
        "push_notification".getClass();
        0xI A01 = 0xI.A01("push_notification", (String) null);
        A01.A0C("step", str);
        A01.A0C("app_startup_type", C64031Cc.A09.toString());
        if (14i.A08()) {
            str2 = AppStateModule.APP_STATE_BACKGROUND;
        } else {
            str2 = "foreground";
        }
        A01.A0C("app_state", str2);
        return A01;
    }

    public static final String A04(AnonymousClass5HJ r4) {
        String str = r4.A1G;
        if (str == null) {
            str = r4.A1F;
        }
        if (str == null) {
            str = "";
        }
        String str2 = r4.A0g;
        if (str.length() != 0 || str2 == null || str2.length() == 0) {
            return str;
        }
        String A01 = C66630MZz.A01(DbT.A09(str2));
        if (A01 != null) {
            return A01;
        }
        return "";
    }

    public static final 0xI A03(String str, String str2, String str3, String str4) {
        0xI A02 = A02(str);
        0xF r4 = new 0xF();
        if (str2 != null) {
            0xF.A00(r4, str2, "landing_path");
        }
        if (str3 != null) {
            0xF.A00(r4, str3, "sender_id");
        }
        Long A0d = DbZ.A0d(str4);
        if (A0d != null) {
            0xF.A00(r4, A0d, "message_timestamp_ms");
        }
        Long valueOf = Long.valueOf(C51966G9m.A07(0xn.A01("direct_sync_notification_preferences").getLong("account_switch_timestamp", 0)));
        if (valueOf != null) {
            0xF.A00(r4, valueOf, "since_acct_switch_ms");
        }
        A02.A05(r4, "extra_data");
        return A02;
    }
}
