package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import com.instagram.direct.securityalert.data.SecurityAlertRepository$insertOrUpdateSecurityAlert$1;

public abstract class LLR {
    public static C63250Ktv A00;

    public static final boolean A01(UserSession userSession, Number number, Number number2, Number number3, String str, String str2, String str3, int i, int i2, int i3) {
        Long l;
        Double d;
        C60340gF r2;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        C62154KbC A002 = C59838JaD.A00(userSession2);
        int i4 = i;
        Integer valueOf = Integer.valueOf(i4);
        0eP A1L = AnonymousClass7TE.A1L("update_change_type", valueOf);
        int i5 = i2;
        Integer valueOf2 = Integer.valueOf(i5);
        0eP A1L2 = AnonymousClass7TE.A1L("device_change_type", valueOf2);
        int i6 = i3;
        Integer valueOf3 = Integer.valueOf(i6);
        String A01 = C66955Mfo.A01();
        0eP A1L3 = AnonymousClass7TE.A1L(A01, valueOf3);
        String str4 = str;
        0eP A1L4 = AnonymousClass7TE.A1L("device_model", str4);
        String str5 = str2;
        0eP A1L5 = AnonymousClass7TE.A1L("device_platform", str5);
        String str6 = str3;
        0eP A1L6 = AnonymousClass7TE.A1L("device_location", str6);
        Double d2 = null;
        Number number4 = number;
        if (number != null) {
            l = C51968G9o.A0v(number4);
        } else {
            l = null;
        }
        0eP A1L7 = AnonymousClass7TE.A1L("created_timestamp_ms", l);
        Number number5 = number2;
        if (number2 != null) {
            d = Double.valueOf(number5.doubleValue());
        } else {
            d = null;
        }
        0eP A1L8 = AnonymousClass7TE.A1L("device_latitude", d);
        Number number6 = number3;
        if (number3 != null) {
            d2 = Double.valueOf(number6.doubleValue());
        }
        int i7 = (i3 * 100) + (i2 * 10) + i;
        A002.A02(959381505, i7, 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, AnonymousClass7TE.A1L("device_longitude", d2)}));
        try {
            SecurityAlertRepository A003 = SecurityAlertRepository.A04.A00(userSession2);
            C62154KbC kbC = A003.A01;
            String A16 = C51968G9o.A16(A003.A02);
            0qQ.A07(A16);
            kbC.A01(959381505, i7, "UPDATE_IN_REPOSITORY", 0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("source", "repository.insertOrUpdate"), AnonymousClass7TE.A1L("datasource", A16), AnonymousClass7TE.A1L("update_change_type", valueOf), AnonymousClass7TE.A1L("device_change_type", valueOf2), AnonymousClass7TE.A1L(A01, valueOf3)}));
            AnonymousClass7TE.A1Z(new SecurityAlertRepository$insertOrUpdateSecurityAlert$1(A003, number4, number5, number6, str4, str5, str6, (AnonymousClass4D7) null, i4, i5, i6), A003.A01);
            r2 = C60340gF.A00;
        } catch (Throwable th) {
            r2 = JTO.A1B(th);
        }
        Throwable A004 = 0eR.A00(r2);
        if (A004 != null) {
            C59838JaD.A00(userSession2).A03(A004, 959381505, i7);
        }
        return !(r2 instanceof 0eQ);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Ktv, java.lang.Object] */
    public static final void A00() {
        if (A00 == null) {
            A00 = new Object();
        }
    }
}
