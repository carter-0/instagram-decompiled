package X;

import android.content.Context;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.Iterator;
import java.util.List;
import org.webrtc.EglBase14Impl;

public final class OLQ {
    public final UserSession A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final C70624ODv A03;
    public final C70469O7u A04;

    public /* synthetic */ OLQ(UserSession userSession, AnonymousClass9HC r3, AnonymousClass7L2 r4, C70624ODv oDv) {
        C70469O7u o7u = new C70469O7u(userSession);
        this.A00 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = oDv;
        this.A04 = o7u;
    }

    public final C3262275x A00(Context context, C74541Pwa pwa, MessagingUser messagingUser, C74552Pwl pwl, int i) {
        List list;
        Object obj;
        C70624ODv oDv = this.A03;
        MessagingUser messagingUser2 = messagingUser;
        C74552Pwl pwl2 = pwl;
        int i2 = i;
        boolean A022 = C74552Pwl.A02(messagingUser2, pwl2, i2);
        MessageIdentifier A0i = C66580MXl.A0i(pwl2.BSF(i2), DbX.A0t(pwl2.BNc(i2)));
        C74541Pwa pwa2 = pwa;
        2FW A002 = OZ6.A00(pwa2, pwl2, i2);
        if (oDv.A01.A1X) {
            list = AnonymousClass7CX.A01;
        } else {
            list = AnonymousClass7CX.A00;
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                C70570OBs oBs = (C70570OBs) oDv.A02.get(obj);
                if (oBs != null && oBs.A01) {
                    2FW A003 = OZ6.A00(pwa2, pwl2, i2);
                    boolean A1V = AnonymousClass7TF.A1V(pwl2.Bjo(i2));
                    C70103NxJ nxJ = C70103NxJ.$redex_init_class;
                    switch (A003.ordinal()) {
                        case 0:
                        case 1:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case EglBase14Impl.EGLExt_SDK_VERSION:
                        case 19:
                        case 25:
                        case 26:
                        case 27:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case Seq.NULL_REFNUM:
                        case 43:
                        case 44:
                        case 45:
                        case 47:
                        case 48:
                        case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                        case 51:
                        case 52:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
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
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                            break;
                        case 2:
                        case 3:
                        case 11:
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 28:
                        case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                        case Seq.RefTracker.REF_OFFSET:
                        case 46:
                        case 49:
                        case 53:
                        case 54:
                            if (C51971G9r.A1b(oBs.A00) && !A022 && !A1V) {
                                break;
                            }
                        default:
                            throw AnonymousClass7TE.A1K();
                    }
                }
            } else {
                obj = null;
            }
        }
        C327627Bo r3 = (C327627Bo) obj;
        if (r3 == null) {
            r3 = C327627Bo.NUX_TYPE_NONE;
        }
        boolean Cbf = pwl2.Cbf(i2);
        0qQ.A0B(C328497Fa.NONE, 16);
        Context context2 = context;
        if (Cbf) {
            if (182.A06(0Tu.A05, this.A04.A00, 36319308607462522L)) {
                String A16 = AnonymousClass7TE.A16(context2, 2131959793);
                AnonymousClass7L2 r0 = this.A02;
                return new C3262275x((AnonymousClass9IV) null, (C327627Bo) null, (AnonymousClass7LQ) null, A0i, A16, (Integer) null, AnonymousClass05K.A15, (Integer) null, A16, (String) null, (String) null, (String) null, (List) null, r0.A00, r0.A04.A04, 8388611, 5, false, false, false);
            }
        }
        UserSession userSession = this.A04.A00;
        0Tu r4 = 0Tu.A05;
        if (!182.A06(r4, userSession, 36317792483415596L)) {
            return null;
        }
        int count = pwl2.getCount();
        while (true) {
            count--;
            if (-1 >= count) {
                count = -1;
            } else if (!C74552Pwl.A02(messagingUser2, pwl2, count)) {
            }
        }
        if (i2 != count || !O4S.A00.contains(r3)) {
            return null;
        }
        if (r3 == C327627Bo.NUX_TYPE_DOUBLE_TAP_TO_LIKE && !182.A06(r4, userSession, 36317792483546670L)) {
            return null;
        }
        if (r3 == C327627Bo.NUX_TYPE_LONG_PRESS_TO_REACT && !182.A06(r4, userSession, 36317792483481133L)) {
            return null;
        }
        return AnonymousClass7FY.A00(context2, this.A00, this.A01, r3, this.A02, A002, A0i, A022);
    }
}
