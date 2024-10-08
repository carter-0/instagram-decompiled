package X;

import android.content.Context;
import androidx.compose.ui.Modifier;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.rtc.notification.instagram.IgRtcNotificationBroadcastReceiver;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import java.util.List;

/* renamed from: X.J7s  reason: case insensitive filesystem */
public final class C59136J7s extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59136J7s(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        String str;
        RtcConnectionEntity A002;
        String str2;
        Object obj3 = obj;
        Object obj4 = obj2;
        if (this.A00 != 0) {
            C286575Wy r1 = (C286575Wy) obj3;
            if (C51968G9o.A0B(obj4) != 2 || !r1.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(1468371022, "com.instagram.creation.genai.magicmod.tools.backdrop.ui.BackdropNineSixteenLayout.<anonymous> (BackdropNineSixteenLayout.kt:187)");
                }
                HMG hmg = ((C53528Gpy) this.A01).A02;
                if (hmg == HMG.GENERATED_IMAGE_SELECTION) {
                    r1.ExS(1097189059);
                    C53378Gn8 gn8 = (C53378Gn8) this.A02;
                    I12 i12 = (I12) gn8.A02;
                    if (i12 != null) {
                        str2 = i12.A04;
                    } else {
                        str2 = null;
                    }
                    List list = (List) gn8.A01;
                    r1.ExS(-380242271);
                    Object obj5 = this.A03;
                    boolean AGu = r1.AGu(obj5);
                    Object ECw = r1.ECw();
                    if (AGu || ECw == AnonymousClass5XT.A00) {
                        ECw = C51969G9p.A0z(r1, obj5, 23);
                    }
                    C51965G9l.A1X(r1, false);
                    C56573I2d.A01(r1, str2, list, (0sP) ECw, 0);
                } else if (hmg != HMG.ENTER_PROMPT || !this.A04) {
                    r1.ExS(1097677495);
                } else {
                    Modifier A022 = C287195Zj.A02(C51965G9l.A0K(r1, 1097536228));
                    AnonymousClass5RD A0a = C51966G9m.A0a(false);
                    int A003 = C287425a7.A00(r1);
                    C286565Wx r4 = (C286565Wx) r1;
                    AnonymousClass5RM A042 = C286565Wx.A04(r4);
                    Modifier A012 = C287435a8.A01(r1, A022);
                    C51973G9u.A0y(r1, r4);
                    C51971G9r.A12(r1, A0a, A042);
                    0sL r2 = C287485aD.A02;
                    if (r4.A0K || !C51972G9s.A1Q(r1, A003)) {
                        C51971G9r.A13(r1, r2, A003);
                    }
                    C51965G9l.A18(r1, A012);
                    HYD.A00(r1, 2131965780, 0);
                    r1.ASN();
                }
                if (C51970G9q.A1a(r1, false)) {
                    0fL.A00(-531721856);
                }
            } else {
                r1.Evl();
            }
        } else {
            UserSession userSession = (UserSession) obj3;
            C62320sa r3 = (C62320sa) obj4;
            boolean A1Z = AnonymousClass7TG.A1Z(userSession, r3);
            RtcConnectionEntity rtcConnectionEntity = (RtcConnectionEntity) this.A01;
            RtcIgNotification Bot = rtcConnectionEntity.Bot();
            if (Bot != null) {
                0xI A023 = 1XB.A02(Bot, ((IgRtcNotificationBroadcastReceiver) this.A03).A00.A01, AnonymousClass05K.A0N, (String) null, rtcConnectionEntity.AjW().A00, rtcConnectionEntity.C6C(), (String) null, (String) null);
                if (A023 != null) {
                    A023.A0C("reason", DialogModule.ACTION_DISMISSED);
                    DbU.A1R(A023, userSession);
                }
            } else if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity;
                String str3 = null;
                if (!C51969G9p.A1a(rtcCallConnectionEntity.A01, C69277Nid.NO_E2EE)) {
                    str = rtcCallConnectionEntity.A0J;
                } else {
                    str = null;
                    str3 = rtcCallConnectionEntity.A0E;
                }
                C331537Rj r10 = C331537Rj.MQTT_RING_NOTIFICATION;
                String str4 = rtcCallConnectionEntity.A0G;
                RtcCallKey rtcCallKey = rtcCallConnectionEntity.A03;
                String A004 = rtcCallConnectionEntity.A00();
                String str5 = rtcCallKey.A00;
                1XB r11 = ((IgRtcNotificationBroadcastReceiver) this.A03).A00.A01;
                0qQ.A0B(str4, A1Z ? 1 : 0);
                0xI A013 = 1XB.A01(r10, r11, AnonymousClass05K.A0N, str4, (String) null, str5, A004, str, str3, (String) null);
                A013.A0C("push_type", "mqtt");
                A013.A0C("reason", DialogModule.ACTION_DISMISSED);
                1XC.A00(A013, str4);
            }
            if (this.A04) {
                C73912Pln pln = new C73912Pln(r3, 20);
                AnonymousClass38Y A005 = ((IgRtcNotificationBroadcastReceiver) this.A03).A00.A00((Context) this.A02, userSession);
                if (rtcConnectionEntity.Bz4() != C69315NjG.Incoming) {
                    A005.A0A(pln);
                } else if (rtcConnectionEntity instanceof RtcConnectionEntity.RtcCallConnectionEntity) {
                    A005.A07((RtcConnectionEntity.RtcCallConnectionEntity) rtcConnectionEntity, "handleDeclineCall", pln);
                } else if (rtcConnectionEntity instanceof RtcConnectionEntity.EndCallConnectionEntity) {
                    pln.invoke();
                } else {
                    new ON9(0wj.A01).A01(002.A0R("Unsuccessfully casting connectionEntity as RtcCallConnectionEntity, the type is: ", rtcConnectionEntity.getTag()));
                }
                String A006 = C70907OQz.A00(rtcConnectionEntity);
                C69315NjG njG = C69315NjG.Ended;
                I4H i4h = I4H.A00;
                RtcConnectionEntity A007 = I4H.A00(A006);
                if (!(A007 == null || (A002 = ABG.A00(njG, A007, A007.BWc())) == null)) {
                    i4h.A01((C74562PxB) null, A002);
                }
            } else {
                r3.invoke();
            }
        }
        return C60340gF.A00;
    }
}
