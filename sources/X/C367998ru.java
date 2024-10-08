package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8ru  reason: invalid class name and case insensitive filesystem */
public final class C367998ru {
    public static final C367998ru A00 = new Object();

    public static final void A01(AnonymousClass818 r5, AnonymousClass819 r6, UserSession userSession) {
        0xY r4;
        long j;
        String str;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r6, 1);
        Integer A002 = A00.A00(r5, r6);
        if (A002 != AnonymousClass05K.A0C && A002 != AnonymousClass05K.A01) {
            2D6 A003 = 2D5.A00(userSession);
            for (C368018rw ordinal : C368008rv.A01(r6)) {
                switch (ordinal.ordinal()) {
                    case 0:
                        r4 = A003.A04.AR4();
                        j = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY";
                        break;
                    case 1:
                    case 5:
                        r4 = A003.A04.AR4();
                        j = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED";
                        break;
                    case 2:
                    case 3:
                        r4 = A003.A04.AR4();
                        j = System.currentTimeMillis() / 1000;
                        str = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL";
                        break;
                    case 4:
                        break;
                    default:
                        throw new RuntimeException();
                }
                r4.E5c(str, j);
                r4.apply();
            }
            0xY AR4 = A003.A04.AR4();
            AR4.E5c("PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL", System.currentTimeMillis() / 1000);
            AR4.apply();
        }
    }

    public static final boolean A02(long j, long j2) {
        if (j == 0) {
            return true;
        }
        if (j2 < 0) {
            return false;
        }
        return j2 == 0 || (System.currentTimeMillis() / 1000) - j > j2 * 3600;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0157, code lost:
        if (A02(r4.getLong(r5, 0), r2) != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0159, code lost:
        r3 = X.C368278sM.A05;
        r2 = new X.0bb();
        r1 = "auto_xposting_disabled_cooldown";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.AnonymousClass818 r12, X.AnonymousClass819 r13, com.instagram.common.session.UserSession r14) {
        /*
            r3 = 0
            X.0qQ.A0B(r14, r3)
            r8 = 1
            X.0qQ.A0B(r13, r8)
            X.8ru r2 = A00
            boolean r0 = A04(r13)
            r11 = 0
            if (r0 == 0) goto L_0x0067
            X.0Tu r4 = X.0Tu.A05
            r0 = 36317697994134986(0x8106c1000015ca, double:3.0307966788982225E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x0030
            X.8sM r4 = X.C368278sM.SUPPRESS
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "shared_holdout"
        L_0x0027:
            java.lang.String r0 = "suppress_reason"
            r2.A06(r0, r1)
            X.C368288sN.A00(r12, r4, r13, r2, r14)
            return r3
        L_0x0030:
            int r0 = r12.ordinal()
            switch(r0) {
                case 0: goto L_0x003d;
                case 1: goto L_0x003d;
                case 2: goto L_0x003d;
                case 3: goto L_0x003d;
                case 4: goto L_0x0052;
                case 5: goto L_0x003d;
                case 6: goto L_0x0052;
                case 7: goto L_0x003d;
                case 8: goto L_0x003d;
                case 9: goto L_0x003d;
                case 10: goto L_0x003d;
                case 11: goto L_0x0052;
                case 12: goto L_0x0052;
                case 13: goto L_0x0052;
                case 14: goto L_0x0052;
                case 15: goto L_0x003d;
                case 16: goto L_0x003d;
                case 17: goto L_0x0052;
                case 18: goto L_0x0052;
                case 19: goto L_0x0052;
                case 20: goto L_0x0052;
                case 21: goto L_0x0052;
                case 22: goto L_0x0052;
                case 23: goto L_0x0052;
                case 24: goto L_0x0052;
                case 25: goto L_0x0052;
                case 26: goto L_0x0052;
                case 27: goto L_0x0052;
                case 28: goto L_0x003d;
                case 29: goto L_0x003d;
                case 30: goto L_0x003d;
                case 31: goto L_0x0052;
                case 32: goto L_0x003d;
                case 33: goto L_0x003d;
                case 34: goto L_0x003d;
                case 35: goto L_0x003d;
                case 36: goto L_0x003d;
                case 37: goto L_0x003d;
                case 38: goto L_0x003d;
                case 39: goto L_0x003d;
                case 40: goto L_0x0052;
                case 41: goto L_0x0052;
                case 42: goto L_0x0052;
                case 43: goto L_0x0052;
                case 44: goto L_0x0052;
                case 45: goto L_0x003d;
                case 46: goto L_0x003d;
                case 47: goto L_0x0052;
                case 48: goto L_0x0052;
                case 49: goto L_0x0052;
                case 50: goto L_0x003d;
                case 51: goto L_0x003d;
                case 52: goto L_0x003d;
                case 53: goto L_0x003d;
                case 54: goto L_0x003d;
                case 55: goto L_0x003d;
                case 56: goto L_0x003d;
                case 57: goto L_0x003d;
                case 58: goto L_0x003d;
                case 59: goto L_0x003d;
                case 60: goto L_0x003d;
                case 61: goto L_0x003d;
                case 62: goto L_0x003d;
                case 63: goto L_0x003d;
                case 64: goto L_0x003d;
                case 65: goto L_0x003d;
                case 66: goto L_0x003d;
                case 67: goto L_0x003d;
                case 68: goto L_0x003d;
                case 69: goto L_0x003d;
                case 70: goto L_0x0052;
                case 71: goto L_0x0052;
                case 72: goto L_0x0052;
                case 73: goto L_0x0052;
                case 74: goto L_0x0052;
                case 75: goto L_0x0052;
                case 76: goto L_0x0052;
                case 77: goto L_0x0052;
                case 78: goto L_0x003d;
                case 79: goto L_0x003d;
                case 80: goto L_0x003d;
                case 81: goto L_0x003d;
                case 82: goto L_0x003d;
                case 83: goto L_0x0052;
                case 84: goto L_0x0052;
                case 85: goto L_0x0052;
                case 86: goto L_0x0052;
                case 87: goto L_0x003d;
                case 88: goto L_0x003d;
                case 89: goto L_0x003d;
                case 90: goto L_0x003d;
                default: goto L_0x0037;
            }
        L_0x0037:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x003d:
            r0 = 36317697994266060(0x8106c1000215cc, double:3.030796678981114E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x0067
            X.8sM r4 = X.C368278sM.SUPPRESS
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "shared_non_creation_only_holdout"
            goto L_0x0027
        L_0x0052:
            r0 = 36317697994200523(0x8106c1000115cb, double:3.0307966789396684E-306)
            boolean r0 = X.182.A06(r4, r14, r0)
            if (r0 == 0) goto L_0x0067
            X.8sM r4 = X.C368278sM.SUPPRESS
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "shared_creation_only_holdout"
            goto L_0x0027
        L_0x0067:
            java.util.Set r9 = X.C368008rv.A01(r13)
            X.2D6 r0 = X.2D5.A00(r14)
            X.0xa r7 = r0.A04
            java.lang.String r0 = "PREFERENCE_SHARED_COOLDOWN_ENABLED"
            boolean r0 = r7.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x00a4
            java.lang.Integer r1 = r2.A00(r12, r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x00a4
            X.0Tu r6 = X.0Tu.A05
            r0 = 36599065596661121(0x8206a800000d81, double:3.2087346837121464E-306)
            long r4 = X.182.A01(r6, r14, r0)
            java.lang.String r0 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_GLOBAL"
            r2 = 0
            long r0 = r7.getLong(r0, r2)
            boolean r0 = A02(r0, r4)
            if (r0 == 0) goto L_0x0169
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x017b
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x017b
        L_0x00a4:
            X.2D6 r0 = X.2D5.A00(r14)
            X.0xa r4 = r0.A04
            java.lang.String r0 = "PREFERENCE_SETTING_DISABLE_COOLDOWN_ENABLED"
            boolean r0 = r4.getBoolean(r0, r8)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = A04(r13)
            if (r0 == 0) goto L_0x00c2
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x00c4
        L_0x00c2:
            r11 = 1
            return r11
        L_0x00c4:
            java.util.Iterator r7 = r9.iterator()
        L_0x00c8:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r7.next()
            X.8rw r0 = (X.C368018rw) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x00f2;
                case 1: goto L_0x012c;
                case 2: goto L_0x013d;
                case 3: goto L_0x00e1;
                case 4: goto L_0x0159;
                case 5: goto L_0x0103;
                default: goto L_0x00db;
            }
        L_0x00db:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00e1:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599881640578696(0x82076600020e88, double:3.209250753171566E-306)
            long r2 = X.182.A01(r2, r14, r0)
            r0 = 24
            long r2 = r2 * r0
            java.lang.String r5 = "PREFERENCE_REEL_RECOMMEND_SETTING_LAST_DISABLED_SECONDS"
            goto L_0x014d
        L_0x00f2:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599881640644233(0x82076600030e89, double:3.209250753213012E-306)
            long r2 = X.182.A01(r2, r14, r0)
            r0 = 24
            long r2 = r2 * r0
            java.lang.String r5 = "PREFERENCE_STORY_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"
            goto L_0x014d
        L_0x0103:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324101790904107(0x810c9400082f2b, double:3.0348464657610345E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            r5 = 24
            if (r0 == 0) goto L_0x011f
            r0 = 36599881640775307(0x82076600050e8b, double:3.2092507532959035E-306)
            long r2 = X.182.A01(r2, r14, r0)
            long r2 = r2 * r5
            java.lang.String r5 = "PREFERENCE_THREADS_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"
            goto L_0x014d
        L_0x011f:
            r0 = 36599881640447622(0x82076600000e86, double:3.209250753088674E-306)
            long r2 = X.182.A01(r2, r14, r0)
            long r2 = r2 * r5
            java.lang.String r5 = "PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"
            goto L_0x014d
        L_0x012c:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599881640447622(0x82076600000e86, double:3.209250753088674E-306)
            long r2 = X.182.A01(r2, r14, r0)
            r0 = 24
            long r2 = r2 * r0
            java.lang.String r5 = "PREFERENCE_FEED_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"
            goto L_0x014d
        L_0x013d:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599881640513159(0x82076600010e87, double:3.20925075313012E-306)
            long r2 = X.182.A01(r2, r14, r0)
            r0 = 24
            long r2 = r2 * r0
            java.lang.String r5 = "PREFERENCE_REEL_CROSSPOST_SETTING_LAST_DISABLED_SECONDS"
        L_0x014d:
            r0 = 0
            long r0 = r4.getLong(r5, r0)
            boolean r0 = A02(r0, r2)
            if (r0 != 0) goto L_0x00c8
        L_0x0159:
            X.8sM r3 = X.C368278sM.SUPPRESS
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "auto_xposting_disabled_cooldown"
            goto L_0x0172
        L_0x0163:
            boolean r0 = A02(r4, r0)
            if (r0 != 0) goto L_0x017f
        L_0x0169:
            X.8sM r3 = X.C368278sM.SUPPRESS
            X.81A r2 = new X.81A
            r2.<init>()
            java.lang.String r1 = "shared_min_cooldowns"
        L_0x0172:
            java.lang.String r0 = "suppress_reason"
            r2.A06(r0, r1)
            X.C368288sN.A00(r12, r3, r13, r2, r14)
            return r11
        L_0x017b:
            java.util.Iterator r10 = r9.iterator()
        L_0x017f:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = r10.next()
            X.8rw r0 = (X.C368018rw) r0
            int r0 = r0.ordinal()
            switch(r0) {
                case 0: goto L_0x01a4;
                case 1: goto L_0x01b0;
                case 2: goto L_0x0198;
                case 3: goto L_0x0198;
                case 4: goto L_0x0169;
                case 5: goto L_0x01b0;
                default: goto L_0x0192;
            }
        L_0x0192:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0198:
            r0 = 36599065596857732(0x8206a800030d84, double:3.208734683836484E-306)
            long r0 = X.182.A01(r6, r14, r0)
            java.lang.String r4 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_REEL"
            goto L_0x01bb
        L_0x01a4:
            r0 = 36599065596792195(0x8206a800020d83, double:3.208734683795038E-306)
            long r0 = X.182.A01(r6, r14, r0)
            java.lang.String r4 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_STORY"
            goto L_0x01bb
        L_0x01b0:
            r0 = 36599065596726658(0x8206a800010d82, double:3.208734683753592E-306)
            long r0 = X.182.A01(r6, r14, r0)
            java.lang.String r4 = "PREFERENCE_SHARED_UPSELL_COOLDOWNS_LAST_SEEN_SECONDS_FEED"
        L_0x01bb:
            long r4 = r7.getLong(r4, r2)
            goto L_0x0163
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C367998ru.A03(X.818, X.819, com.instagram.common.session.UserSession):boolean");
    }

    private final Integer A00(AnonymousClass818 r2, AnonymousClass819 r3) {
        switch (r2.ordinal()) {
            case 21:
            case 24:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 31:
            case 35:
            case 55:
            case 63:
            case 64:
            case 71:
            case 80:
            case 82:
            case 89:
                break;
            default:
                switch (r3.ordinal()) {
                    case 0:
                    case 1:
                    case 5:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    case 13:
                    case 19:
                    case 28:
                    case 31:
                    case 32:
                    case 39:
                    case Seq.RefTracker.REF_OFFSET:
                    case 43:
                    case 44:
                    case 47:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 57:
                    case 58:
                    case 59:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 67:
                    case 82:
                    case 83:
                    case 84:
                    case 85:
                    case 86:
                    case 87:
                    case 88:
                    case 89:
                    case 90:
                    case 91:
                    case 92:
                    case 95:
                    case 102:
                    case 104:
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 6:
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case EglBase14Impl.EGLExt_SDK_VERSION:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    case 30:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 40:
                    case Seq.NULL_REFNUM:
                    case 45:
                    case 46:
                    case 48:
                    case 49:
                    case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                    case 55:
                    case 56:
                    case 60:
                    case 65:
                    case 66:
                    case 68:
                    case 69:
                    case 70:
                    case 71:
                    case 72:
                    case 73:
                    case 74:
                    case 75:
                    case 76:
                    case 77:
                    case 78:
                    case 79:
                    case 80:
                    case 81:
                    case 100:
                        return AnonymousClass05K.A00;
                    case 93:
                    case 94:
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 101:
                    case 103:
                        return AnonymousClass05K.A01;
                    default:
                        throw new RuntimeException();
                }
        }
        return AnonymousClass05K.A0C;
    }

    public static final boolean A04(AnonymousClass819 r0) {
        switch (r0.ordinal()) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 13:
            case 19:
            case 28:
            case 31:
            case 32:
            case 39:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 44:
            case 47:
            case 51:
            case 52:
            case 53:
            case 54:
            case 57:
            case 58:
            case 59:
            case 61:
            case 62:
            case 63:
            case 64:
            case 67:
            case 68:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 93:
            case 95:
            case 102:
            case 103:
            case 104:
                return false;
            case 1:
            case 2:
            case 3:
            case 4:
            case 14:
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 40:
            case Seq.NULL_REFNUM:
            case 45:
            case 46:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 55:
            case 56:
            case 60:
            case 65:
            case 66:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
            case 92:
            case 94:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return true;
            default:
                throw new RuntimeException();
        }
    }
}
