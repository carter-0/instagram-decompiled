package X;

import android.os.Process;
import com.instagram.common.session.UserSession;
import com.instagram.direct.armadilloexpress.transportpayload.AddMessageContent;
import com.instagram.direct.armadilloexpress.transportpayload.CommandRangeData;
import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.PowerUpsData;
import com.instagram.direct.armadilloexpress.transportpayload.Text;
import com.instagram.direct.armadilloexpress.transportpayload.TransportPayload;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;
import com.meta.foa.instagram.performancelogging.s2s.IGFOAMessagingSendToSentLogger;
import java.util.List;
import java.util.Set;

public final class OMW {
    public final UserSession A00;
    public final C282395Cx A01;

    public OMW(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        this.A01 = new C282395Cx(userSession);
    }

    public final TransportPayload A00(CommonMediaTransport commonMediaTransport, DirectForwardingParams directForwardingParams, 1cE r18) {
        1cE r14 = r18;
        int hashCode = r14.A05.hashCode();
        UserSession userSession = this.A00;
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(userSession, hashCode);
        if (A002 != null) {
            A002.onLogCreateArmadilloExpressProtobufPayloadStart();
        }
        0fh.A01("SendTextMessageMutation-createPayload", 140056978);
        String str = r14.A0L;
        0qQ.A07(str);
        Boolean bool = r14.A08;
        String str2 = r14.A0J;
        C70766OKm oKm = r14.A02;
        List<AnonymousClass9IY> list = r14.A0M;
        OCA oca = r14.A05;
        C70992OVn oVn = C70992OVn.A00;
        R4O A0I = Text.DEFAULT_INSTANCE.A0I();
        Text text = (Text) C66580MXl.A0L(A0I);
        text.bitField0_ |= 1;
        text.text_ = str;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            Text text2 = (Text) C66580MXl.A0L(A0I);
            text2.bitField0_ |= 2;
            text2.isSuggestedReply_ = booleanValue;
        }
        if (str2 != null) {
            Text text3 = (Text) C66580MXl.A0L(A0I);
            text3.bitField0_ |= 4;
            text3.postbackPayload_ = str2;
        }
        if (oKm != null) {
            R4O A0I2 = PowerUpsData.DEFAULT_INSTANCE.A0I();
            int i = oKm.A00;
            PowerUpsData powerUpsData = (PowerUpsData) C66580MXl.A0L(A0I2);
            powerUpsData.bitField0_ |= 1;
            powerUpsData.style_ = i;
            CommonMediaTransport commonMediaTransport2 = commonMediaTransport;
            if (commonMediaTransport != null) {
                PowerUpsData powerUpsData2 = (PowerUpsData) C66580MXl.A0L(A0I2);
                powerUpsData2.mediaAttachment_ = commonMediaTransport2;
                powerUpsData2.bitField0_ |= 2;
            }
            Text text4 = (Text) C66580MXl.A0L(A0I);
            PowerUpsData powerUpsData3 = (PowerUpsData) A0I2.A02();
            powerUpsData3.getClass();
            text4.powerUpData_ = powerUpsData3;
            text4.bitField0_ |= 8;
        }
        if (list != null) {
            for (AnonymousClass9IY r3 : list) {
                R4O A0I3 = CommandRangeData.DEFAULT_INSTANCE.A0I();
                int i2 = r3.A03;
                CommandRangeData commandRangeData = (CommandRangeData) C66580MXl.A0L(A0I3);
                commandRangeData.bitField0_ |= 4;
                commandRangeData.type_ = i2;
                int i3 = r3.A01;
                CommandRangeData commandRangeData2 = (CommandRangeData) C66580MXl.A0L(A0I3);
                commandRangeData2.bitField0_ |= 2;
                commandRangeData2.length_ = i3;
                int i4 = r3.A02;
                CommandRangeData commandRangeData3 = (CommandRangeData) C66580MXl.A0L(A0I3);
                commandRangeData3.bitField0_ |= 1;
                commandRangeData3.offset_ = i4;
                Number number = (Number) r3.A04;
                if (number != null) {
                    String A0x = C66581MXm.A0x(number);
                    CommandRangeData commandRangeData4 = (CommandRangeData) C66580MXl.A0L(A0I3);
                    commandRangeData4.bitField0_ |= 8;
                    commandRangeData4.fbid_ = A0x;
                }
                Number number2 = (Number) r3.A05;
                if (number2 != null) {
                    String A0x2 = C66581MXm.A0x(number2);
                    CommandRangeData commandRangeData5 = (CommandRangeData) C66580MXl.A0L(A0I3);
                    commandRangeData5.bitField0_ |= 16;
                    commandRangeData5.userOrThreadFbid_ = A0x2;
                }
                Text text5 = (Text) C66580MXl.A0L(A0I);
                R5b A02 = A0I3.A02();
                A02.getClass();
                C13982TnY tnY = text5.commands_;
                if (!((C13255TRv) tnY).A00) {
                    tnY = R5b.A06(tnY);
                    text5.commands_ = tnY;
                }
                tnY.add(A02);
            }
        }
        C68404NFl A003 = AddMessageContent.A00();
        C66582MXn.A0Q(A003, A0I).addMessageContentCase_ = 1;
        TransportPayload A012 = oVn.A01(userSession, (AddMessageContent) C66580MXl.A0M(A003), directForwardingParams, oca, r14);
        0fh.A00(-626041622);
        if (A002 != null) {
            A002.onLogCreateArmadilloExpressProtobufPayloadEnd();
        }
        return A012;
    }

    public final void A01(DirectForwardingParams directForwardingParams, C74551Pwk pwk, 1cE r25) {
        int i;
        String str;
        CommonMediaTransport A03;
        String str2;
        String str3;
        C74551Pwk pwk2 = pwk;
        1cE r3 = r25;
        int hashCode = r3.A05.hashCode();
        UserSession userSession = this.A00;
        IGFOAMessagingSendToSentLogger A002 = AnonymousClass7G0.A00(userSession, hashCode);
        if (A002 != null) {
            A002.onLogSendTextMessageMutationStart();
        }
        IGFOAMessagingSendToSentLogger A0k = C66581MXm.A0k(userSession, r3.A05);
        if (A0k != null) {
            A0k.maybeAnnotateDiskIOBlocking();
        }
        IGFOAMessagingSendToSentLogger A0k2 = C66581MXm.A0k(userSession, r3.A05);
        if (!(A0k2 == null || (str3 = C69643NpQ.A04) == null)) {
            A0k2.annotatePreviousMutation(C69643NpQ.A02, C69643NpQ.A01, str3);
        }
        C66667Maa A003 = this.A01.A00(r3);
        if (A003.A02) {
            0fh.A01(002.A0R("SendTextMessageMutation-", C70121Nxb.A00(A003.A00)), -1501268745);
        } else {
            0fh.A01("SendTextMessageMutation", 1717246555);
        }
        int A04 = DbS.A04(0Tu.A05, userSession, 36610563224442933L);
        if (A04 != 0) {
            i = Process.getThreadPriority(Process.myTid());
            Process.setThreadPriority(A04);
        } else {
            i = 0;
        }
        try {
            String A06 = r3.A06();
            String str4 = r3.A05;
            C70628ODz A004 = C70134Nxo.A00(userSession);
            Set set = A004.A01;
            if (set.contains(A06)) {
                A004.A00.markerPoint(20128010, A06.hashCode(), 002.A0R(C273654mx.A00(3196), "_end"));
            }
            if (set.contains(A06)) {
                A004.A00.markerPoint(20128010, A06.hashCode(), 002.A0R("queue_processing", "_start"));
            }
            C70178NyW.A00(userSession).A04((List) null, 1252, str4);
            AnonymousClass3Q2 r0 = r3.A07;
            AnonymousClass3Q2 r7 = null;
            if (!(r0 == null || (str2 = r0.A35) == null)) {
                r7 = 28K.A00(userSession).A03(str2);
            }
            CommonMediaTransport commonMediaTransport = null;
            if (!(r7 == null || (str = r7.A2N) == null || (A03 = C66834MdS.A03(str)) == null)) {
                C68405NFm A005 = CommonMediaTransport.A00(A03);
                A005.A06("image/gif");
                commonMediaTransport = (CommonMediaTransport) A005.A02();
            }
            TransportPayload A006 = A00(commonMediaTransport, directForwardingParams, r3);
            List C6L = r3.C6L();
            0qQ.A07(C6L);
            0qQ.A07(00k.A0I(C6L));
            C66638Ma7 A007 = C70175NyT.A00(userSession);
            DirectThreadKey directThreadKey = (DirectThreadKey) C66582MXn.A0q(r3);
            if (!(r7 == null || commonMediaTransport == null)) {
                pwk2 = OQS.A01(userSession, commonMediaTransport, pwk2, C63326Kv9.A00(r7));
            }
            A007.A02(A006, pwk2, r3, directThreadKey, 0);
            if (A002 != null) {
                A002.onLogSendTextMessageMutationEnd();
            }
        } finally {
            if (A04 != 0) {
                Process.setThreadPriority(i);
            }
            0fh.A00(380756623);
        }
    }
}
