package X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.QgP  reason: case insensitive filesystem */
public final class C8071QgP extends C8115Qh7 implements C13607TdZ {
    public AnonymousClass2Fj A00 = Pxh.A0M();
    public QUL A01;
    public C11345SOd A02;
    public String A03;
    public boolean A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass0eM A06 = AnonymousClass0eN.A01(C13314TUn.A00);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8071QgP(C319836rJ r2) {
        super(r2);
        0qQ.A0B(r2, 1);
    }

    public static final void A04(C8071QgP qgP, String str, String str2) {
        A05(qgP, str, (String) null, str2, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null);
    }

    public final void A0C(Bundle bundle) {
        String str;
        if (bundle != null) {
            str = bundle.getString("page_id");
        } else {
            str = null;
        }
        this.A03 = str;
        if (bundle != null) {
            boolean z = bundle.getBoolean("IS_V2");
            if (Boolean.valueOf(z) != null) {
                this.A04 = z;
                this.A00 = null;
                Object obj = new Object();
                Pxi.A1A(AnonymousClass72Y.A02(this.A03, new TYA(46, (Object) this, obj)), this.A05, new TYA(47, (Object) this, obj), 17);
                super.A0C(bundle);
                return;
            }
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void CNB(QDO qdo) {
        0qQ.A0B(qdo, 0);
        qdo.A04(AnonymousClass72Y.A01(this.A03, TXF.A00));
        Pxi.A1A(qdo.A06, this.A05, TY1.A00(this, 39), 17);
        Pxi.A1A(qdo.A08, this.A03, TY1.A00(this, 40), 17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0106, code lost:
        if (r1 == null) goto L_0x0108;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C8071QgP r21) {
        /*
            com.google.common.collect.ImmutableList$Builder r13 = com.google.common.collect.ImmutableList.builder()
            r3 = r21
            X.Qgk r0 = r3.A0D()
            X.C11345SOd.A02(r0, r13)
            X.SOd r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            r13.add(r0)
        L_0x0014:
            X.QUL r5 = r3.A01
            if (r5 == 0) goto L_0x010c
            X.C11426STk.A04()
            java.lang.Class<X.QUK> r4 = X.QUK.class
            r2 = 0
            java.lang.String r1 = "payments_hub_overview(fe_id:$fe_id,input:$input,session_id:$session_id)"
            r0 = 12954690(0xc5ac42, float:1.8153387E-38)
            X.3lr r9 = r5.getOptionalTreeField(r2, r1, r4, r0)
            boolean r4 = r3.A04
            X.InT r5 = new X.InT
            r5.<init>(r3, r2)
            r0 = 0
            if (r9 == 0) goto L_0x0108
            java.lang.Class<X.QUJ> r7 = X.QUJ.class
            java.lang.String r6 = "payouts_summary"
            r1 = -1386915079(0xffffffffad555af9, float:-1.2127848E-11)
            X.3lr r7 = r9.A02(r7, r6, r1)
            if (r7 == 0) goto L_0x0122
            java.lang.Class<X.QVC> r6 = X.QVC.class
            r1 = -464193101(0xffffffffe454f9b3, float:-1.571481E22)
            X.3lr r1 = r7.reinterpretRequired(r2, r6, r1)
        L_0x0049:
            java.lang.Class<X.QUI> r8 = X.QUI.class
            java.lang.String r7 = "earnings_summary"
            r6 = -2099388650(0xffffffff82dddf16, float:-3.2601076E-37)
            X.3lr r7 = r9.getOptionalTreeField(r2, r7, r8, r6)
            if (r7 == 0) goto L_0x005f
            java.lang.Class<X.QSB> r6 = X.QSB.class
            r0 = 1460520019(0x570dc453, float:1.55874346E14)
            X.3lr r0 = r7.reinterpretRequired(r2, r6, r0)
        L_0x005f:
            if (r1 == 0) goto L_0x00b2
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r6 = 2131969266(0x7f1344f2, float:1.957545E38)
            X.StQ r9 = X.C12400StQ.A00(r7, r6)
            java.lang.Class<X.QVB> r8 = X.QVB.class
            java.lang.String r7 = "last_payout_total_amount"
            r6 = 154196798(0x930db3e, float:2.1288317E-33)
            X.3lr r7 = r1.getOptionalTreeField(r2, r7, r8, r6)
            if (r7 == 0) goto L_0x011f
            java.lang.String r6 = "formatted_amount"
            java.lang.String r6 = r7.getOptionalStringField(r2, r6)
        L_0x007d:
            X.StR r10 = X.C12401StR.A01(r6)
            java.lang.String r6 = "last_payout_paid_date"
            java.lang.String r6 = r1.A08(r6)
            X.StR r11 = X.C12401StR.A01(r6)
            java.lang.String r6 = "last_total_payouts_percentage_delta_text"
            java.lang.String r7 = r1.A09(r6)
            X.StR r12 = X.C12401StR.A01(r7)
            r8 = 3
            java.lang.String r7 = "last_total_payouts_percentage_delta"
            double r19 = r1.getCoercedDoubleField(r8, r7)
            if (r4 == 0) goto L_0x011b
            java.lang.String r14 = "transactions_fragment"
        L_0x00a1:
            r21 = 2131969121(0x7f134461, float:1.9575156E38)
            java.lang.String r16 = r1.A09(r6)
            java.lang.String r15 = "payments_overview_payout_summary_view_details"
            java.lang.String r17 = "PAYOUTS"
            r18 = r5
            X.C9638ReI.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
        L_0x00b2:
            if (r0 == 0) goto L_0x0108
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r6 = 2131961097(0x7f132509, float:1.9558881E38)
            X.StQ r9 = X.C12400StQ.A00(r7, r6)
            java.lang.Class<X.QSA> r8 = X.QSA.class
            java.lang.String r7 = "last_total_earnings"
            r6 = -227400363(0xfffffffff2722555, float:-4.7961923E30)
            X.3lr r7 = r0.A03(r8, r7, r6)
            if (r7 == 0) goto L_0x0119
            java.lang.String r6 = "formatted_amount"
            java.lang.String r2 = r7.getOptionalStringField(r2, r6)
        L_0x00d0:
            X.StR r10 = X.C12401StR.A01(r2)
            java.lang.String r2 = "last_total_earnings_date_delta_text"
            java.lang.String r2 = r0.A08(r2)
            X.StR r11 = X.C12401StR.A01(r2)
            java.lang.String r6 = "last_total_earnings_percentage_delta_text"
            java.lang.String r2 = r0.A09(r6)
            X.StR r12 = X.C12401StR.A01(r2)
            r7 = 3
            java.lang.String r2 = "last_total_earnings_percentage_delta"
            double r19 = r0.getCoercedDoubleField(r7, r2)
            if (r4 == 0) goto L_0x0116
            java.lang.String r14 = "transactions_fragment"
        L_0x00f4:
            r21 = 2131976625(0x7f1361b1, float:1.9590376E38)
            java.lang.String r16 = r0.A09(r6)
            java.lang.String r15 = "payments_overview_earnings_summary_view_details"
            java.lang.String r17 = "EARNINGS"
            r18 = r5
            X.C9638ReI.A00(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r21)
            r0 = 1
            if (r1 != 0) goto L_0x0109
        L_0x0108:
            r0 = 0
        L_0x0109:
            X.QDP.A01(r3, r0)
        L_0x010c:
            X.2gB r1 = r3.A05
            com.google.common.collect.ImmutableList r0 = r13.build()
            r1.A0B(r0)
            return
        L_0x0116:
            java.lang.String r14 = "earnings_fragment"
            goto L_0x00f4
        L_0x0119:
            r2 = 0
            goto L_0x00d0
        L_0x011b:
            java.lang.String r14 = "payouts_fragment"
            goto L_0x00a1
        L_0x011f:
            r6 = 0
            goto L_0x007d
        L_0x0122:
            r1 = r0
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8071QgP.A02(X.QgP):void");
    }

    public static final void A03(C8071QgP qgP, String str) {
        String optionalStringField;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        C250663lr A09 = C8115Qh7.A09(qgP);
        if (A09 == null || (optionalStringField = A09.getOptionalStringField(0, "financial_id")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A1H.put("financial_entity_id", optionalStringField);
        AnonymousClass2E0.A02();
        SQ2.A00(667754853, 0, str, A1H);
    }

    public static final void A05(C8071QgP qgP, String str, String str2, String str3, String str4, String str5, String str6, Map map, Map map2, Map map3) {
        String A0j;
        2FO A002 = C11426STk.A00();
        HashMap A003 = C9634ReE.A00(qgP.A0E());
        C250663lr A09 = C8115Qh7.A09(qgP);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        Pxj.A1L("financial_entity_id", A0j, str2, A003);
        A003.put("view_name", "overview");
        if (str3 != null) {
            A003.put("endpoint", str3);
        }
        if (str4 != null) {
            A003.put("error_message", str4);
        }
        if (str5 != null) {
            A003.put("error_stacktrace", str5);
        }
        if (str6 != null) {
            A003.put("exception_class", str6);
        }
        if (map != null) {
            A003.put("earning_summary", map);
        }
        if (map2 != null) {
            A003.put("earning_summary_breakdown", map2);
        }
        if (map3 != null) {
            A003.put("payout_summary", map3);
        }
        A002.Cgl(str, A003);
    }

    public final void A0G(String str, String str2, String str3) {
        A05(this, "user_click_payouthub_atomic", str, (String) null, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null);
        AnonymousClass2Fj r3 = this.A00;
        Bundle A0a = AnonymousClass7TE.A0a();
        C11405SSc.A03(A0a, (C250673ls) this.A03.A02(), "financial_entity");
        A0a.putString("filter_transaction_type", str3);
        C8115Qh7.A0A(A0a, this);
        SR4.A01(r3, new Su0(str2, A0a));
    }
}
