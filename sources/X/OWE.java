package X;

import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;

public final class OWE {
    public final C66880MeH A01(C68149N2p n2p, Integer num) {
        N8Y n8y;
        Integer num2 = num;
        0qQ.A0B(num2, 1);
        C68149N2p n2p2 = n2p;
        C70842ONt A00 = C70125Nxf.A00((AnonymousClass2Ep) null, n2p2);
        C68161N3b n3b = n2p2.A01;
        boolean z = n3b instanceof C68161N3b;
        if (z) {
            0qQ.A0B(n3b, 0);
            C74249Prd prd = n3b.A02;
            String str = null;
            if (N8Y.A00(2, prd) && (n8y = (N8Y) prd) != null) {
                str = n8y.A01;
            }
            String str2 = n3b.A07;
            String str3 = n3b.A0A;
            boolean z2 = n3b.A0C;
            C66879MeF meF = new C66879MeF(Boolean.valueOf(z2), Boolean.valueOf(n3b.A00()), str2, str3, n3b.A08, n3b.A06, str);
            C66628MZp mZp = new C66628MZp();
            mZp.A0F = A00.A03();
            String str4 = n2p2.A04;
            mZp.A09 = DbZ.A0d(str4);
            mZp.A0G = A00.A02();
            mZp.A0C = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
            mZp.A0O = z;
            mZp.A0A = DbZ.A0d(n3b.A09);
            mZp.A0D = A00.A00();
            mZp.A0E = A00.A01();
            mZp.A0K = null;
            mZp.A03 = num2;
            mZp.A0H = str3;
            Integer num3 = n2p2.A02;
            mZp.A0Q = AnonymousClass7TF.A1W(num3, AnonymousClass05K.A01);
            mZp.A02 = C66878MeE.A00(num3);
            ArrayList A1C = AnonymousClass7TE.A1C();
            if (n3b.A00()) {
                A1C.add(C69500Nmi.A04);
            }
            if (z2) {
                A1C.add(C69500Nmi.A0E);
            }
            mZp.A0N = A1C;
            mZp.A0P = C282435Db.A02(str4);
            mZp.A06 = C51972G9s.A0i(meF.A05);
            mZp.A0I = meF.A02;
            return new C66880MeH(new AnonymousClass6BJ(mZp), meF, n2p2.A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    public final C66880MeH A02(C66886MeO meO, Integer num, long j) {
        Long l;
        String str;
        Long l2 = null;
        C66886MeO meO2 = meO;
        String str2 = meO2.A0A;
        Long A0n = 00y.A0n(10, str2);
        C254703su r0 = meO2.A02;
        if (r0 == null || (str = r0.A1u) == null) {
            l = null;
        } else {
            l = 00y.A0n(10, str);
        }
        String str3 = meO2.A04.A00;
        Integer num2 = meO2.A07;
        boolean A1W = AnonymousClass7TF.A1W(num2, AnonymousClass05K.A01);
        PushChannelType A00 = C66878MeE.A00(num2);
        ArrayList A002 = A00(meO2);
        boolean A02 = C282435Db.A02(str2);
        String str4 = meO2.A09;
        if (str4 != null) {
            l2 = 00y.A0n(10, str4);
        }
        return new C66880MeH(new AnonymousClass6BJ(A00, num, l2, (Long) null, A0n, l, (String) null, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (String) null, (String) null, (String) null, (String) null, str3, meO2.A01, (String) null, (String) null, (String) null, A002, -1, true, A02, A1W), C70126Nxg.A00(meO2), j);
    }

    public final C66880MeH A03(C70572OBu oBu, Integer num, long j) {
        Long l = null;
        C70572OBu oBu2 = oBu;
        C66886MeO meO = oBu2.A01;
        String str = meO.A0A;
        Long A0n = 00y.A0n(10, str);
        Long A0n2 = 00y.A0n(10, oBu2.A00.A00());
        String str2 = meO.A04.A00;
        Integer num2 = meO.A07;
        boolean A1W = AnonymousClass7TF.A1W(num2, AnonymousClass05K.A01);
        PushChannelType A00 = C66878MeE.A00(num2);
        ArrayList A002 = A00(meO);
        boolean A02 = C282435Db.A02(str);
        String str3 = meO.A09;
        if (str3 != null) {
            l = 00y.A0n(10, str3);
        }
        return new C66880MeH(new AnonymousClass6BJ(A00, num, l, (Long) null, A0n, A0n2, (String) null, RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING, (String) null, (String) null, (String) null, (String) null, str2, meO.A01, (String) null, (String) null, (String) null, A002, -1, true, A02, A1W), C70126Nxg.A00(meO), j);
    }

    public static final ArrayList A00(C66886MeO meO) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        C254703su r1 = meO.A02;
        if (r1 != null) {
            if (r1.A1T()) {
                A1C.add(C69500Nmi.A04);
            }
            if (r1.A2P) {
                A1C.add(C69500Nmi.A0E);
            }
        }
        return A1C;
    }
}
