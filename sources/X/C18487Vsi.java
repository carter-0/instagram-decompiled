package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.Calendar;

/* renamed from: X.Vsi  reason: case insensitive filesystem */
public final class C18487Vsi {
    public Long A00;
    public final 0wc A01;
    public final UserSession A02;
    public final 1Xj A03;
    public final AnonymousClass3W1 A04;

    public static final void A00(C18487Vsi vsi, Integer num, String str, String str2) {
        String str3;
        Long l;
        long j;
        Long l2;
        Long A10;
        0Aj A0e = AnonymousClass7TE.A0e(vsi.A01, "instagram_ad_carousel_on_demand_load");
        int hashCode = str.hashCode();
        Long l3 = null;
        if (hashCode == -1867169789) {
            str3 = RealtimeConstants.SEND_SUCCESS;
            l3 = Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue());
        } else if (hashCode == -1086574198) {
            str3 = "failure";
            if (str.equals(str3) && (l = vsi.A00) != null) {
                l3 = Long.valueOf(Calendar.getInstance().getTimeInMillis() - l.longValue());
            }
        } else if (hashCode == 109757538 && str.equals("start")) {
            vsi.A00 = Long.valueOf(Calendar.getInstance().getTimeInMillis());
        }
        1Xj r3 = vsi.A03;
        String id = r3.getId();
        1iA BR7 = r3.BR7();
        if (A0e.isSampled() && id != null) {
            C51965G9l.A1I(A0e, id);
            A0e.A9F("m_t", Long.valueOf((long) BR7.A00));
            String C9L = r3.C9L();
            if (C9L == null) {
                C9L = "";
            }
            C51965G9l.A1L(A0e, C9L);
            A0e.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
            String A07 = C231122qu.A07(vsi.A02, r3);
            if (A07 == null || (A10 = AnonymousClass7TE.A10(A07)) == null) {
                j = 0;
            } else {
                j = A10.longValue();
            }
            C51965G9l.A1D(A0e, Long.valueOf(j));
            A0e.A9F("index", Long.valueOf((long) vsi.A04.A02));
            A0e.A9F("current_size", Long.valueOf((long) r3.A0o()));
            A0e.A9F(Pxd.A00(279), Long.valueOf((long) r3.A13()));
            A0e.AAJ("error_message", str2);
            if (num != null) {
                l2 = C51969G9p.A0r(num);
            } else {
                l2 = null;
            }
            A0e.A9F(TraceFieldType.StatusCode, l2);
            A0e.A9F("latency", l3);
            A0e.Cgf();
        }
    }

    public C18487Vsi(UserSession userSession, 1Xj r3, AnonymousClass3W1 r4) {
        this.A03 = r3;
        this.A04 = r4;
        this.A02 = userSession;
        this.A01 = AnonymousClass0kN.A01((AnonymousClass0iw) null, userSession);
    }
}
