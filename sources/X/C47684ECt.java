package X;

import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.ECt  reason: case insensitive filesystem */
public final class C47684ECt extends 1P0 {
    public final String A00;
    public final /* synthetic */ E6U A01;

    public C47684ECt(E6U e6u, String str) {
        this.A01 = e6u;
        this.A00 = str;
    }

    public final void onFail(C268654dm r15) {
        int A03 = AnonymousClass0fD.A03(-1494645674);
        C47684ECt.super.onFail(r15);
        E6U e6u = this.A01;
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e6u.A01;
        if (businessFlowAnalyticsLogger != null) {
            String str = e6u.A06;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("query_string", e6u.A05);
            businessFlowAnalyticsLogger.Ci6(new C22030Xtl("page_import_info_city_town", str, ServerW3CShippingAddressConstants.CITY, C319126q5.A00(r15), C319126q5.A00(r15), (Map) null, A1E, (Map) null));
        }
        if (this.A00.equals(e6u.A05)) {
            C47578E8q e8q = e6u.A00;
            e8q.A06();
            e8q.A08(e8q.A01, e8q.A00.getString(2131968420));
            e8q.A07();
        }
        AnonymousClass0fD.A0A(2049869640, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(1573861363);
        C47684ECt.super.onFinish();
        Dbb.A0x(this.A01);
        AnonymousClass0fD.A0A(1137543786, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(585718026);
        C47684ECt.super.onStart();
        Dbb.A0y(this.A01);
        AnonymousClass0fD.A0A(665526257, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Eu4 eu4;
        List list;
        int A03 = AnonymousClass0fD.A03(989789841);
        C47703EDm eDm = (C47703EDm) obj;
        int A032 = AnonymousClass0fD.A03(2131385073);
        C47684ECt.super.onSuccess(eDm);
        String str = this.A00;
        E6U e6u = this.A01;
        if (str.equals(e6u.A05)) {
            if (eDm == null || (eu4 = eDm.A00) == null || (list = eu4.A00) == null) {
                C47578E8q e8q = e6u.A00;
                e8q.A06();
                e8q.A08(e8q.A01, e8q.A00.getString(2131968420));
                e8q.A07();
            } else {
                C47578E8q e8q2 = e6u.A00;
                List list2 = e8q2.A02;
                list2.clear();
                list2.addAll(list);
                C47578E8q.A00(e8q2);
            }
        }
        BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = e6u.A01;
        if (businessFlowAnalyticsLogger != null) {
            String str2 = e6u.A06;
            HashMap A1E = AnonymousClass7TE.A1E();
            A1E.put("query_string", e6u.A05);
            businessFlowAnalyticsLogger.Ci5(new C22030Xtl("page_import_info_city_town", str2, ServerW3CShippingAddressConstants.CITY, (String) null, (String) null, (Map) null, A1E, (Map) null));
        }
        AnonymousClass0fD.A0A(1559339809, A032);
        AnonymousClass0fD.A0A(1079472510, A03);
    }
}
