package X;

import com.facebook.hyperthrift.HyperThriftBase;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

/* renamed from: X.OcE  reason: case insensitive filesystem */
public final class C71092OcE {
    public final C61083JwL A00;
    public final String A01;
    public final AnonymousClass0eM A02 = A01(this, 13);
    public final AnonymousClass0eM A03 = A01(this, 14);
    public final AnonymousClass0eM A04 = A01(this, 15);
    public final AnonymousClass0eM A05 = A01(this, 16);
    public final AnonymousClass0eM A06 = A01(this, 17);
    public final AnonymousClass0eM A07 = A01(this, 18);
    public final AnonymousClass0eM A08 = A01(this, 19);
    public final AnonymousClass0eM A09 = A01(this, 20);
    public final AnonymousClass0eM A0A = A01(this, 21);
    public final AnonymousClass0eM A0B = A01(this, 22);
    public final AnonymousClass0eM A0C = A01(this, 23);
    public final AnonymousClass0eM A0D = A01(this, 24);
    public final AnonymousClass0eM A0E = A01(this, 25);
    public final AnonymousClass0eM A0F = A01(this, 26);
    public final AnonymousClass0eM A0G = A01(this, 27);
    public final AnonymousClass0eM A0H = A01(this, 28);
    public final AnonymousClass0eM A0I = A01(this, 30);
    public final AnonymousClass0eM A0J = A01(this, 31);
    public final AnonymousClass0eM A0K = A01(this, 32);
    public final AnonymousClass0eM A0L = A01(this, 33);
    public final AnonymousClass0eM A0M = A01(this, 34);
    public final AnonymousClass0eM A0N = A01(this, 35);
    public final AnonymousClass0eM A0O = A01(this, 36);
    public final AnonymousClass0eM A0P = A01(this, 38);
    public final AnonymousClass0eM A0Q = A01(this, 29);
    public final AnonymousClass0eM A0R = A01(this, 37);

    public static final String A00(C71092OcE ocE, String str) {
        return (String) C242173Sx.A06(C242173Sx.A0E(C74172PqE.A00, C242173Sx.A0A(C242173Sx.A0E(C74171PqD.A00, C242173Sx.A09(new C58729Iwc(str, 12), 00k.A0o((Iterable) ocE.A0C.getValue()))))));
    }

    public static 0t0 A01(Object obj, int i) {
        return AnonymousClass0eN.A01(new C73654PhT(obj, i));
    }

    public static final JSONObject A02(C71092OcE ocE, String str) {
        return (JSONObject) C242173Sx.A06(C242173Sx.A0E(C74170PqC.A00, C242173Sx.A0A(C242173Sx.A0E(C74169PqB.A00, C242173Sx.A09(new C58729Iwc(str, 11), 00k.A0o((Iterable) ocE.A0C.getValue()))))));
    }

    public final Integer A03() {
        return (Integer) ((HyperThriftBase) this.A00.A01).A00(0);
    }

    public final String A04() {
        String str = (String) ((HyperThriftBase) this.A00.A01).A00(4);
        if (str != null) {
            return str;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final String A05() {
        return (String) ((HyperThriftBase) this.A00.A01).A00(2);
    }

    public C71092OcE(C61083JwL jwL, String str) {
        this.A00 = jwL;
        this.A01 = str;
    }

    public final String toString() {
        Object obj;
        Integer A032 = A03();
        if (A032 == null || A032.intValue() != 4) {
            obj = null;
        } else {
            obj = this.A02.getValue();
        }
        Integer A033 = A03();
        String str = "Unknown";
        if (A033 != null) {
            switch (A033.intValue()) {
                case 0:
                    str = "JOIN";
                    break;
                case 1:
                    str = "SERVER_MEDIA_UPDATE";
                    break;
                case 2:
                    str = "HANGUP";
                    break;
                case 3:
                    str = "ICE_CANDIDATE";
                    break;
                case 4:
                    str = "RING";
                    break;
                case 5:
                    str = "DISMISS";
                    break;
                case 6:
                    str = "CONFERENCE_STATE";
                    break;
                case 7:
                    str = "ADD_PARTICIPANTS";
                    break;
                case 8:
                    str = "SUBSCRIPTION";
                    break;
                case 9:
                    str = "CLIENT_MEDIA_UPDATE";
                    break;
                case 10:
                    str = "DATA_MESSAGE";
                    break;
                case 11:
                    str = "REMOVE_PARTICIPANTS";
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    str = "PING";
                    break;
                case 19:
                    str = "P2P_PROTOCOL";
                    break;
                case 20:
                    str = "UPDATE";
                    break;
                case 21:
                    str = "NOTIFY";
                    break;
                case 22:
                    str = Pxd.A00(137);
                    break;
                case 23:
                    str = "CLIENT_EVENT";
                    break;
                case 25:
                    str = "UNSUBSCRIBE";
                    break;
                case 26:
                    str = "APPROVAL";
                    break;
                case 27:
                    str = "TRANSFER";
                    break;
                case 28:
                    str = "WAKEUP";
                    break;
            }
        }
        return 0mp.A06("RtcMWThriftPayload[broadcast=%s, videocallId=%s, type=%s, transaction=%s, serverInfoData=%s]", new Object[]{obj, null, str, A05(), A04()});
    }
}
