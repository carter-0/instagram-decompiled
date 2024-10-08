package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.8rv  reason: invalid class name and case insensitive filesystem */
public abstract class C368008rv {
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003b, code lost:
        r1[1] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        X.0qQ.A0B(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        return X.03t.A0K(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = java.util.Collections.singleton(r0);
        X.0qQ.A07(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004e, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.Set A01(X.AnonymousClass819 r4) {
        /*
            r3 = 0
            int r1 = r4.ordinal()
            r2 = 1
            r0 = 2
            switch(r1) {
                case 0: goto L_0x0045;
                case 1: goto L_0x002a;
                case 2: goto L_0x001e;
                case 3: goto L_0x001e;
                case 4: goto L_0x0030;
                case 5: goto L_0x0030;
                case 6: goto L_0x0030;
                case 7: goto L_0x0030;
                case 8: goto L_0x0045;
                case 9: goto L_0x0013;
                case 10: goto L_0x0045;
                case 11: goto L_0x002a;
                case 12: goto L_0x0030;
                case 13: goto L_0x0045;
                case 14: goto L_0x002a;
                case 15: goto L_0x0045;
                case 16: goto L_0x0027;
                case 17: goto L_0x0027;
                case 18: goto L_0x0027;
                case 19: goto L_0x0045;
                case 20: goto L_0x002d;
                case 21: goto L_0x0045;
                case 22: goto L_0x002a;
                case 23: goto L_0x002a;
                case 24: goto L_0x002a;
                case 25: goto L_0x0045;
                case 26: goto L_0x0045;
                case 27: goto L_0x0045;
                case 28: goto L_0x0033;
                case 29: goto L_0x002a;
                case 30: goto L_0x0045;
                case 31: goto L_0x002a;
                case 32: goto L_0x0045;
                case 33: goto L_0x0045;
                case 34: goto L_0x002a;
                case 35: goto L_0x001e;
                case 36: goto L_0x001e;
                case 37: goto L_0x0013;
                case 38: goto L_0x001e;
                case 39: goto L_0x0045;
                case 40: goto L_0x002a;
                case 41: goto L_0x0045;
                case 42: goto L_0x0030;
                case 43: goto L_0x0030;
                case 44: goto L_0x0030;
                case 45: goto L_0x0033;
                case 46: goto L_0x002d;
                case 47: goto L_0x002d;
                case 48: goto L_0x001e;
                case 49: goto L_0x001e;
                case 50: goto L_0x001e;
                case 51: goto L_0x0010;
                case 52: goto L_0x0010;
                case 53: goto L_0x0045;
                case 54: goto L_0x0045;
                case 55: goto L_0x002a;
                case 56: goto L_0x0045;
                case 57: goto L_0x0045;
                case 58: goto L_0x0045;
                case 59: goto L_0x001e;
                case 60: goto L_0x002a;
                case 61: goto L_0x0045;
                case 62: goto L_0x002a;
                case 63: goto L_0x0030;
                case 64: goto L_0x002d;
                case 65: goto L_0x001e;
                case 66: goto L_0x0045;
                case 67: goto L_0x0045;
                case 68: goto L_0x0045;
                case 69: goto L_0x001e;
                case 70: goto L_0x001e;
                case 71: goto L_0x0013;
                case 72: goto L_0x0013;
                case 73: goto L_0x0045;
                case 74: goto L_0x002d;
                case 75: goto L_0x002a;
                case 76: goto L_0x0030;
                case 77: goto L_0x0045;
                case 78: goto L_0x0030;
                case 79: goto L_0x001e;
                case 80: goto L_0x0013;
                case 81: goto L_0x001e;
                case 82: goto L_0x0030;
                case 83: goto L_0x0045;
                case 84: goto L_0x0010;
                case 85: goto L_0x0045;
                case 86: goto L_0x0045;
                case 87: goto L_0x002a;
                case 88: goto L_0x0045;
                case 89: goto L_0x0030;
                case 90: goto L_0x002a;
                case 91: goto L_0x0045;
                case 92: goto L_0x002d;
                case 93: goto L_0x002a;
                case 94: goto L_0x002a;
                case 95: goto L_0x002a;
                case 96: goto L_0x0045;
                case 97: goto L_0x002a;
                case 98: goto L_0x0033;
                case 99: goto L_0x0030;
                case 100: goto L_0x0045;
                case 101: goto L_0x0045;
                case 102: goto L_0x0045;
                case 103: goto L_0x0030;
                case 104: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0010:
            X.8rw r0 = X.C368018rw.CHANNEL
            goto L_0x0047
        L_0x0013:
            X.8rw r2 = X.C368018rw.STORY
            X.8rw r1 = X.C368018rw.FEED
            X.8rw r0 = X.C368018rw.REEL_CCP
            X.8rw[] r1 = new X.C368018rw[]{r2, r1, r0}
            goto L_0x003d
        L_0x001e:
            X.8rw[] r1 = new X.C368018rw[r0]
            X.8rw r0 = X.C368018rw.STORY
            r1[r3] = r0
            X.8rw r0 = X.C368018rw.FEED
            goto L_0x003b
        L_0x0027:
            X.8rw r0 = X.C368018rw.FEED_THREADS
            goto L_0x0047
        L_0x002a:
            X.8rw r0 = X.C368018rw.FEED
            goto L_0x0047
        L_0x002d:
            X.8rw r0 = X.C368018rw.REEL_XAR
            goto L_0x0047
        L_0x0030:
            X.8rw r0 = X.C368018rw.REEL_CCP
            goto L_0x0047
        L_0x0033:
            X.8rw[] r1 = new X.C368018rw[r0]
            X.8rw r0 = X.C368018rw.REEL_CCP
            r1[r3] = r0
            X.8rw r0 = X.C368018rw.REEL_XAR
        L_0x003b:
            r1[r2] = r0
        L_0x003d:
            X.0qQ.A0B(r1, r3)
            java.util.Set r0 = X.03t.A0K(r1)
            return r0
        L_0x0045:
            X.8rw r0 = X.C368018rw.STORY
        L_0x0047:
            java.util.Set r0 = java.util.Collections.singleton(r0)
            X.0qQ.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C368008rv.A01(X.819):java.util.Set");
    }

    public static final Integer A00(AnonymousClass818 r0) {
        switch (r0.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 15:
            case 16:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 68:
            case 69:
            case 90:
                return AnonymousClass05K.A0N;
            case 4:
            case 6:
            case 11:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
            case 30:
            case 31:
            case 51:
            case 54:
            case 55:
                return AnonymousClass05K.A01;
            case 8:
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
            case 38:
            case 39:
            case 40:
            case Seq.NULL_REFNUM:
            case Seq.RefTracker.REF_OFFSET:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
            case 53:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                return AnonymousClass05K.A0C;
            case 13:
            case 14:
            case 37:
            case 52:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
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
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
                return AnonymousClass05K.A00;
            default:
                throw new RuntimeException();
        }
    }
}
