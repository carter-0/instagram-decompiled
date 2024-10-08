package X;

import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class OZx {
    public OFZ A00;
    public OH9 A01;
    public final UserSession A02;
    public final C71078Oax A03;
    public final OKY A04;

    public static final Integer A01(C74438Put put, Integer num) {
        int intValue;
        if (put instanceof N53) {
            return AnonymousClass05K.A0u;
        }
        if (put instanceof N54) {
            N54 n54 = (N54) put;
            List list = n54.A08;
            if (list == null || !AnonymousClass7TE.A1b(list)) {
                if (n54.A04 == AnonymousClass05K.A01) {
                    return AnonymousClass05K.A0j;
                }
            } else if (num == null || (intValue = num.intValue()) >= list.size() || intValue < 0) {
                return AnonymousClass05K.A0C;
            } else {
                int intValue2 = ((N54) list.get(intValue)).A03.intValue();
                if (intValue2 == 0) {
                    return AnonymousClass05K.A0N;
                }
                if (intValue2 != 1) {
                    return AnonymousClass05K.A15;
                }
                return AnonymousClass05K.A0Y;
            }
        }
        boolean CeS = put.CeS();
        if (CeS) {
            return AnonymousClass05K.A01;
        }
        if (!CeS) {
            return AnonymousClass05K.A00;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void A02() {
        boolean z;
        long j;
        long j2;
        OH9 oh9 = this.A01;
        if (oh9 != null) {
            C74438Put put = oh9.A03;
            if (!(put instanceof N4z)) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if ((put instanceof N51) || (put instanceof N50)) {
                    z = true;
                    j = 0;
                } else {
                    z = false;
                    j = elapsedRealtime - oh9.A02;
                }
                Long l = oh9.A01;
                if (l != null) {
                    j2 = elapsedRealtime - l.longValue();
                } else {
                    j2 = 0;
                }
                long j3 = j2 + oh9.A00;
                if (z) {
                    j3 = 0;
                }
                C71070Oap oap = N2H.A00;
                Integer num = oh9.A04;
                this.A04.A00(new PKJ(A00(put), A01(put, num), C71070Oap.A02(put, num), oh9.A05, j, j3));
                C71078Oax oax = this.A03;
                C69502Nmk nmk = C69502Nmk.A0D;
                String A022 = C71070Oap.A02(put, num);
                String A0L = 00l.A0L(A022, "_", A022);
                C69449Nlt A002 = C71070Oap.A00(put.Aqk());
                C69485NmT A032 = oap.A03(put, num);
                1Ln A003 = C71078Oax.A00(oax);
                if (DbT.A1Y(A003)) {
                    C66582MXn.A17(nmk, A003, (Map) null);
                    A003.A0R("server_info", C71078Oax.A01((AnonymousClass0Ac) null, A003, oax));
                    C71078Oax.A02(A002, A032, A003, oax, A0L);
                }
                this.A01 = null;
            }
        }
    }

    public final void A03() {
        Long l;
        OH9 oh9 = this.A01;
        if (oh9 != null && (l = oh9.A01) != null) {
            oh9.A00 += SystemClock.elapsedRealtime() - l.longValue();
            oh9.A01 = null;
        }
    }

    public final void A04(C74438Put put) {
        OFZ ofz = this.A00;
        if (ofz != null) {
            C71070Oap oap = N2H.A00;
            C74438Put put2 = put;
            String A022 = C71070Oap.A02(put2, ofz.A01);
            if (0qQ.A0K(ofz.A02, A022)) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - ofz.A00;
                OKY oky = this.A04;
                Integer A002 = A00(put2);
                String str = ofz.A03;
                oky.A00(new PKG(A002, A022, str, elapsedRealtime));
                HashMap A0e = Dbb.A0e("stack_name", O20.A00(A00(put2)), AnonymousClass7TE.A1L("load_time_ms", String.valueOf(elapsedRealtime)));
                C69502Nmk nmk = C69502Nmk.A0A;
                Integer num = ofz.A01;
                C69496Nme A012 = C71070Oap.A01(C70321O1z.A00(str));
                String A023 = C71070Oap.A02(put2, num);
                String A0L = 00l.A0L(A023, "_", A023);
                C69449Nlt A003 = C71070Oap.A00(put2.Aqk());
                C69485NmT A032 = oap.A03(put2, num);
                C71078Oax oax = this.A03;
                1Ln A004 = C71078Oax.A00(oax);
                if (DbT.A1Y(A004)) {
                    C66582MXn.A17(nmk, A004, A0e);
                    A004.A0R("server_info", C71078Oax.A01(A012, A004, oax));
                    C71078Oax.A02(A003, A032, A004, oax, A0L);
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                this.A01 = new OH9(put2, num, Long.valueOf(elapsedRealtime2), str, elapsedRealtime2);
                this.A00 = null;
            }
        }
    }

    public /* synthetic */ OZx(UserSession userSession, OKY oky) {
        C71078Oax A002 = C69830Nsr.A00(userSession);
        0qQ.A0B(A002, 3);
        this.A02 = userSession;
        this.A04 = oky;
        this.A03 = A002;
    }

    public static final Integer A00(C74438Put put) {
        int intValue = put.Aqk().intValue();
        if (intValue == 0) {
            return AnonymousClass05K.A0N;
        }
        if (intValue == 1) {
            return AnonymousClass05K.A01;
        }
        if (intValue == 2) {
            return AnonymousClass05K.A00;
        }
        if (intValue == 3) {
            return AnonymousClass05K.A0C;
        }
        throw AnonymousClass7TE.A1K();
    }

    public final void A05(String str, int i) {
        this.A03.A03(C69502Nmk.A0E, str, DbY.A0q(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, RealtimeConstants.SEND_SUCCESS, AnonymousClass7TE.A1L(C273654mx.A00(173), String.valueOf(i)), AnonymousClass7TE.A1L("request_type", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT)));
    }
}
