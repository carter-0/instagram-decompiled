package X;

import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;

/* renamed from: X.Qh9  reason: case insensitive filesystem */
public final class C8117Qh9 extends QDP implements C13603TdV {
    public 2Fk A00;
    public C8115Qh7 A01;
    public LoggingData A02;
    public String A03;
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final C319836rJ A05;

    public C8117Qh9(C319836rJ r4) {
        0qQ.A0B(r4, 1);
        this.A05 = r4;
        r4.A04.put("bottom_sheet_filter_index", new C11759Sfv(this, 2));
    }

    public static final void A03(C8117Qh9 qh9, ImmutableList.Builder builder, String str) {
        SST sst = new SST((C13889TjC) null, A02(str), RH2.PRIMARY_TEXT);
        AnonymousClass2Fj r4 = qh9.A04;
        boolean A0K = 0qQ.A0K(r4.A02(), str);
        builder.add(C8090Qgi.A00(new C11484Sb7(str, qh9, 1), sst, new SO0(new SRP(A02(str), (C13883Tj6) null, AnonymousClass05K.A01, true, 0qQ.A0K(r4.A02(), str), false)), A0K));
    }

    public final void CMl(C8115Qh7 qh7) {
        this.A01 = qh7;
        this.A00 = AnonymousClass72Y.A01(this.A04, TY1.A00(this, 32));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
        if (r0 == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C12400StQ A02(java.lang.String r3) {
        /*
            int r1 = r3.hashCode()
            r0 = -68623507(0xfffffffffbe8e36d, float:-2.4184512E36)
            r2 = 0
            if (r1 == r0) goto L_0x0031
            r0 = -25097047(0xfffffffffe810ca9, float:-8.576807E37)
            if (r1 == r0) goto L_0x0027
            r0 = 64897(0xfd81, float:9.094E-41)
            if (r1 != r0) goto L_0x001f
            java.lang.String r0 = "ALL"
            boolean r0 = r3.equals(r0)
            r1 = 2131962422(0x7f132a36, float:1.9561569E38)
        L_0x001d:
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            java.lang.Object[] r0 = new java.lang.Object[r2]
            X.StQ r0 = X.C12400StQ.A00(r0, r1)
            return r0
        L_0x0027:
            java.lang.String r0 = "EARNINGS"
            boolean r0 = r3.equals(r0)
            r1 = 2131962423(0x7f132a37, float:1.956157E38)
            goto L_0x001d
        L_0x0031:
            java.lang.String r0 = "PAYOUTS"
            boolean r0 = r3.equals(r0)
            r1 = 2131962424(0x7f132a38, float:1.9561573E38)
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8117Qh9.A02(java.lang.String):X.StQ");
    }

    public static final void A04(C8117Qh9 qh9, String str, String str2) {
        String str3;
        2FO A002 = C11426STk.A00();
        LoggingData loggingData = qh9.A02;
        if (loggingData == null) {
            str3 = "loggingData";
        } else {
            HashMap A003 = C9634ReE.A00(loggingData);
            String str4 = qh9.A03;
            if (str4 == null) {
                str3 = "financialEntityID";
            } else {
                A003.put("financial_entity_id", str4);
                A003.put("view_name", "transactions");
                A003.put("target_name", str);
                A003.put("filter_type", str2);
                A002.Cgl("user_click_payouthub_atomic", A003);
                return;
            }
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [android.os.BaseBundle] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.os.Bundle r4) {
        /*
            r3 = this;
            super.A0C(r4)
            r0 = 0
            if (r4 == 0) goto L_0x000e
            java.lang.String r0 = "logging_data"
            android.os.Parcelable r0 = r4.getParcelable(r0)
            com.facebookpay.msc.logging.LoggingData r0 = (com.facebookpay.msc.logging.LoggingData) r0
        L_0x000e:
            java.lang.String r2 = "Required value was null."
            if (r0 == 0) goto L_0x0045
            r3.A02 = r0
            if (r4 == 0) goto L_0x0040
            java.lang.String r0 = "financial_entity_id"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0040
            r3.A03 = r0
            X.6rJ r1 = r3.A05
            java.lang.String r0 = "bottom_sheet_filter_index"
            java.lang.Object r0 = r1.A00(r0)
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            if (r0 == 0) goto L_0x002d
            r4 = r0
        L_0x002d:
            X.2Fj r1 = r3.A04
            java.lang.String r0 = "filter_transaction_type"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x003b
            r1.A0B(r0)
            return
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0040:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x0045:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8117Qh9.A0C(android.os.Bundle):void");
    }
}
