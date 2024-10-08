package X;

import android.content.Context;
import com.facebook.hyperthrift.HyperThriftBase;
import com.instagram.common.session.UserSession;
import com.instagram.model.rtc.RtcCallKey;
import com.instagram.model.rtc.RtcIgNotification;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.video.common.events.IgRtcEventHeader;
import java.io.IOException;

/* renamed from: X.OdE  reason: case insensitive filesystem */
public final class C71120OdE {
    public static final C71120OdE A00 = new Object();

    public static final C71092OcE A01(Context context, String str) {
        0qQ.A0B(context, 0);
        try {
            C45321CuP parseFromJson = C45146Cr7.parseFromJson(16P.A00(str));
            0qQ.A07(parseFromJson);
            String str2 = parseFromJson.A01;
            if (str2 == null || str2.length() == 0) {
                return null;
            }
            return new C71092OcE(new OWY(context).A01(str2), str2);
        } catch (IOException unused) {
            return null;
        }
    }

    public final RtcConnectionEntity.RtcCallConnectionEntity A04(Context context, C74562PxB pxB, UserSession userSession, C71092OcE ocE) {
        int i;
        Integer num;
        Context context2 = context;
        0qQ.A0B(context2, 1);
        C71092OcE ocE2 = ocE;
        if (ocE2.A0P.getValue() != null) {
            AnonymousClass0eM r5 = ocE2.A04;
            if (r5.getValue() != null) {
                String str = userSession.A06;
                Integer num2 = AnonymousClass05K.A01;
                AnonymousClass0eM r4 = ocE2.A0G;
                boolean A1Z = AnonymousClass7TF.A1Z(r4);
                boolean A1Z2 = AnonymousClass7TF.A1Z(ocE2.A0E);
                if (A1Z) {
                    i = 2131954457;
                    if (A1Z2) {
                        i = 2131954452;
                    }
                } else {
                    i = 2131954460;
                    if (A1Z2) {
                        i = 2131954451;
                    }
                }
                String A03 = A03(context2, ocE2, DbY.A0c(context2, r5.getValue(), i));
                String A02 = A02(context2, ocE2);
                boolean A1Z3 = AnonymousClass7TF.A1Z(r4);
                Long valueOf = Long.valueOf(pxB.C8y());
                C61083JwL jwL = ocE2.A00;
                HyperThriftBase hyperThriftBase = (HyperThriftBase) jwL.A01;
                Long l = (Long) hyperThriftBase.A00(7);
                String A04 = ocE2.A04();
                String str2 = (String) hyperThriftBase.A00(16);
                Number number = (Number) hyperThriftBase.A00(3);
                if (number != null) {
                    num = Integer.valueOf(number.shortValue());
                } else {
                    num = null;
                }
                String A05 = ocE2.A05();
                HyperThriftBase hyperThriftBase2 = (HyperThriftBase) jwL.A01;
                return A00((RtcIgNotification) null, new IgRtcEventHeader(num, (Integer) hyperThriftBase2.A00(12), ocE2.A03(), l, A04, str2, A05, (String) hyperThriftBase2.A00(1)), ocE2, num2, valueOf, str, A03, A02, A1Z3);
            }
        }
        throw AnonymousClass7TE.A0w("Expecting a valid server response. Missing required information for handling notifications.");
    }

    public static final RtcConnectionEntity.RtcCallConnectionEntity A00(RtcIgNotification rtcIgNotification, IgRtcEventHeader igRtcEventHeader, C71092OcE ocE, Integer num, Long l, String str, String str2, String str3, boolean z) {
        C69315NjG njG;
        String str4;
        C71092OcE ocE2 = ocE;
        if (AnonymousClass7TF.A1Z(ocE2.A0I)) {
            njG = C69315NjG.IncomingTransfer;
        } else {
            njG = C69315NjG.Incoming;
        }
        AnonymousClass0eM r2 = ocE2.A0H;
        Integer A0l = C51967G9n.A0l(AnonymousClass7TF.A1Z(r2) ? 1 : 0);
        if (AnonymousClass7TF.A1Z(r2)) {
            str4 = ocE2.A05();
        } else {
            str4 = null;
        }
        String A0t = DbS.A0t(ocE2.A0P);
        String A0t2 = DbS.A0t(ocE2.A03);
        if (A0t2 != null) {
            String A0t3 = DbS.A0t(ocE2.A04);
            String A0t4 = DbS.A0t(ocE2.A09);
            String A0t5 = DbS.A0t(ocE2.A0J);
            boolean A1Z = AnonymousClass7TF.A1Z(ocE2.A0F);
            boolean A1Z2 = AnonymousClass7TF.A1Z(ocE2.A0E);
            String A04 = ocE2.A04();
            return new RtcConnectionEntity.RtcCallConnectionEntity((C69277Nid) ocE2.A0A.getValue(), (C69278Nie) ocE2.A0B.getValue(), new RtcCallKey(A04), rtcIgNotification, njG, igRtcEventHeader, A0l, num, l, str, str2, A04, "RtcCallConnectionEntity", A0t, str4, A0t2, A0t3, str3, A0t4, A0t5, A1Z, A1Z2, z);
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final String A02(Context context, C71092OcE ocE) {
        int i;
        Object[] objArr;
        if (!AnonymousClass7TF.A1Z(ocE.A0H)) {
            return null;
        }
        String A0t = DbS.A0t(ocE.A0O);
        if (A0t != null) {
            return A0t;
        }
        String A0t2 = DbS.A0t(ocE.A0D);
        String A0t3 = DbS.A0t(ocE.A0K);
        if (A0t2 != null && A0t2.length() != 0) {
            i = 2131954455;
            objArr = new Object[1];
        } else if (A0t3 == null || A0t3.length() == 0) {
            return null;
        } else {
            i = 2131954456;
            objArr = new Object[1];
            A0t2 = OZB.A00(A0t3);
        }
        objArr[0] = A0t2;
        return context.getString(i, objArr);
    }

    public static final String A03(Context context, C71092OcE ocE, String str) {
        int i;
        if (AnonymousClass7TF.A1Z(ocE.A0H)) {
            String A0t = DbS.A0t(ocE.A0O);
            if (A0t == null) {
                Object value = ocE.A04.getValue();
                String A0t2 = DbS.A0t(ocE.A0D);
                String A0t3 = DbS.A0t(ocE.A0K);
                boolean A1Z = AnonymousClass7TF.A1Z(ocE.A0E);
                if (A0t2 != null && A0t2.length() != 0) {
                    i = 2131954458;
                    if (A1Z) {
                        i = 2131954453;
                    }
                } else if (!(A0t3 == null || A0t3.length() == 0)) {
                    i = 2131954459;
                    if (A1Z) {
                        i = 2131954454;
                    }
                    A0t2 = OZB.A00(A0t3);
                }
                A0t = context.getString(i, new Object[]{value, A0t2});
                if (A0t == null) {
                    return str;
                }
            }
            return A0t;
        }
        return str;
    }
}
