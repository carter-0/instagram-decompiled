package X;

import android.os.Bundle;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.AbstractCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.QgR  reason: case insensitive filesystem */
public final class C8073QgR extends C8115Qh7 implements C13607TdZ {
    public C7714QUd A00;
    public C11345SOd A01;
    public SUj A02 = SUj.A02();
    public String A03 = "ALL";
    public final AnonymousClass2gB A04 = Pxh.A0M();
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(C13325TUy.A00);
    public final C319836rJ A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8073QgR(C319836rJ r4) {
        super(r4);
        0qQ.A0B(r4, 1);
        this.A06 = r4;
        r4.A04.put("filter_type_bundle", new C11759Sfv(this, 4));
    }

    public static final void A06(C8073QgR qgR, String str) {
        A05(qgR, (Boolean) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (Map) null);
    }

    public final boolean A0F(Bundle bundle, Integer num) {
        boolean z;
        String str;
        boolean A1U = AnonymousClass7TF.A1U(0, bundle, num);
        boolean A0F = super.A0F(bundle, num);
        String string = bundle.getString("filter_transaction_type");
        if (string == null || 0qQ.A0K(this.A03, string)) {
            z = false;
        } else {
            this.A03 = string;
            z = true;
        }
        if (!A0F && !z) {
            return false;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == A1U) {
                str = "overview_view_details";
            }
            A03();
            if (A0F && !z) {
                return false;
            }
        }
        str = "filter";
        AnonymousClass2E0.A02();
        SQ2.A02(667758015, 0, 615);
        A07(this, (String) null, (String) null, str, string, (String) null, (String) null, 667758015, 0);
        A03();
        return A0F ? true : true;
    }

    public final void CNB(QDO qdo) {
        0qQ.A0B(qdo, 0);
        qdo.A04(AnonymousClass72Y.A01(this.A03, TXH.A00));
        Pxi.A1A(qdo.A06, this.A04, TY2.A00(this, 0), 22);
        Pxi.A1A(qdo.A08, this.A03, TY2.A00(this, 1), 22);
    }

    public static final LinkedHashMap A02(SUj sUj) {
        C250663lr A012;
        String A07;
        AbstractCollection abstractCollection = (AbstractCollection) sUj.A01;
        LinkedHashMap linkedHashMap = null;
        if (abstractCollection != null) {
            linkedHashMap = DbS.A0x(JTT.A08(abstractCollection));
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C7793QXe qXe = (C7793QXe) it.next();
                String A072 = qXe.A0E().A07("transaction_id");
                if (A072 != null) {
                    C250663lr optionalTreeField = qXe.A0E().getOptionalTreeField(6, "transaction_status", C42267BXk.class, 1599165905);
                    if (optionalTreeField == null || (A012 = optionalTreeField.A01(QXV.class, -1925217936)) == null || (A07 = A012.A07("text")) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    linkedHashMap.put(A072, A07);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
        return linkedHashMap;
    }

    private final void A03() {
        String optionalStringField;
        String optionalStringField2;
        String valueOf = String.valueOf(25);
        A05(this, (Boolean) null, "client_fetch_payouthub_init", (String) null, (String) null, (String) null, "BSC_PAYOUT_HUB_PAYOUT_TRANSACTION", "0", valueOf, (String) null, (String) null, (String) null, (Map) null);
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        AnonymousClass2gB r5 = this.A03;
        C250663lr r0 = (C250663lr) r5.A02();
        if (r0 == null || (optionalStringField = r0.getOptionalStringField(0, "financial_id")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A1H.put("financial_entity_id", optionalStringField);
        A1H.put("transaction_type_filter", this.A03);
        A1H.put("start_cursor", "0");
        A1H.put("end_cursor", valueOf);
        AnonymousClass2E0.A02();
        SQ2.A01(667758015, 0, A1H);
        this.A00 = null;
        A08("fetch_init");
        AnonymousClass2gB r2 = this.A04;
        Object value = this.A05.getValue();
        C250663lr r02 = (C250663lr) r5.A02();
        if (r02 == null || (optionalStringField2 = r02.getOptionalStringField(0, "financial_id")) == null) {
            throw AnonymousClass7TE.A0y();
        }
        String str = this.A03;
        String str2 = A0E().A00;
        0qQ.A0B(str, 2);
        SQB.A02(C8282QnO.A00(new C11550ScB(value, str2, (String) null, str, optionalStringField2, 2), AnonymousClass2E0.A06()), r2, C11647Sdp.A00(this, 17));
    }

    @OnLifecycleEvent(07T.ON_RESUME)
    public final void onResume(AnonymousClass07Z r4) {
        short s;
        Object A022 = this.A06.A02();
        if (A022 == C8882RDz.SUCCESS) {
            s = 2;
        } else if (A022 == C8882RDz.ERROR) {
            s = 3;
        } else {
            return;
        }
        AnonymousClass2E0.A02();
        SQ2.A02(667758015, 0, s);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v0, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5, types: [X.TjC] */
    /* JADX WARNING: type inference failed for: r5v7, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: type inference failed for: r2v14 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C8073QgR r25) {
        /*
            com.google.common.collect.ImmutableList$Builder r13 = com.google.common.collect.ImmutableList.builder()
            X.0qQ.A0A(r13)
            r14 = r25
            X.Qgk r4 = r14.A0D()
            X.QgW r3 = new X.QgW
            r3.<init>()
            r0 = 3
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r12 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
            X.Ssm r0 = new X.Ssm
            r0.<init>(r5, r2, r1, r1)
            r3.A02 = r0
            r0 = 13
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r21 = 0
            r2 = 2131231338(0x7f08026a, float:1.8078754E38)
            X.Ssl r1 = new X.Ssl
            r0 = r21
            r1.<init>(r5, r0, r2, r12)
            r3.A00 = r1
            java.lang.Integer r22 = X.AnonymousClass05K.A00
            X.SRP r2 = new X.SRP
            r19 = r2
            r20 = r0
            r23 = r12
            r24 = r12
            r25 = r12
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r11 = 1
            r2.A04 = r11
            java.lang.Object[] r1 = new java.lang.Object[r12]
            r0 = 2131962414(0x7f132a2e, float:1.9561552E38)
            X.SRP.A01(r2, r1, r0)
            X.SO0.A00(r2, r3)
            r0 = 15
            X.SbJ r0 = X.C11496SbJ.A00(r14, r0)
            r3.A00 = r0
            X.Qga r0 = new X.Qga
            r0.<init>(r3)
            r4.A06 = r0
            X.C11345SOd.A02(r4, r13)
            X.SOd r0 = r14.A01
            if (r0 == 0) goto L_0x0074
            r13.add(r0)
        L_0x0074:
            X.SUj r0 = r14.A02
            java.lang.Object r0 = r0.A01
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            if (r0 == 0) goto L_0x0222
            java.util.Iterator r20 = r0.iterator()
        L_0x0080:
            boolean r0 = r20.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r10 = r20.next()
            X.QXe r10 = (X.C7793QXe) r10
            X.QVm r9 = r10.A0E()
            X.0qQ.A07(r9)
            java.lang.Class<X.BXk> r3 = X.C42267BXk.class
            r2 = 6
            java.lang.String r1 = "transaction_status"
            r0 = 1599165905(0x5f5155d1, float:1.5084192E19)
            X.3lr r3 = r9.getOptionalTreeField(r2, r1, r3, r0)
            r2 = 0
            if (r3 == 0) goto L_0x021a
            java.lang.Class<X.QXV> r1 = X.QXV.class
            r0 = -1925217936(0xffffffff8d3f8170, float:-5.9012224E-31)
            X.3lr r5 = r3.A01(r1, r0)
        L_0x00ac:
            X.RG8 r3 = X.RG8.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 7
            java.lang.String r0 = "transaction_status_style"
            java.lang.Enum r1 = r9.getOptionalEnumField(r1, r0, r3)
            X.RG8 r1 = (X.RG8) r1
            java.lang.Class<X.QVj> r4 = X.C7746QVj.class
            r3 = 3
            r0 = -806265702(0xffffffffcff15c9a, float:-8.0987556E9)
            X.3lr r19 = r10.reinterpretRequired(r3, r4, r0)
            X.0qQ.A07(r19)
            java.lang.Class<X.QVk> r4 = X.C7747QVk.class
            r3 = 2
            r0 = 271775793(0x1032f831, float:3.529551E-29)
            X.3lr r18 = r10.reinterpretRequired(r3, r4, r0)
            X.0qQ.A07(r18)
            java.lang.Class<X.QVo> r3 = X.C7751QVo.class
            r0 = 1921271336(0x72844628, float:5.239915E30)
            X.3lr r15 = r10.A01(r3, r0)
            X.0qQ.A07(r15)
            java.lang.Class<X.QVn> r3 = X.C7750QVn.class
            r4 = 4
            r0 = -434343875(0xffffffffe61c703d, float:-1.846899E23)
            X.3lr r17 = r10.reinterpretRequired(r4, r3, r0)
            X.0qQ.A07(r17)
            X.RGU r3 = X.RGU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "transaction_type"
            java.lang.Enum r3 = r9.getOptionalEnumField(r11, r0, r3)
            X.RGU r0 = X.RGU.PAYOUT
            r16 = 22
            if (r3 != r0) goto L_0x00fc
            r16 = 32
        L_0x00fc:
            if (r1 == 0) goto L_0x021d
            if (r5 == 0) goto L_0x0217
            java.lang.String r0 = "text"
            java.lang.String r0 = r5.A07(r0)
        L_0x0107:
            X.StR r6 = X.C12401StR.A01(r0)
            int r3 = r1.ordinal()
            r0 = 3
            r1 = 11
            if (r3 == r0) goto L_0x0211
            r0 = 2
            if (r3 == r0) goto L_0x020b
            if (r3 == r4) goto L_0x0205
            X.RH2 r5 = X.RH2.A0U
        L_0x011b:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3 = 2131239988(0x7f082434, float:1.8096298E38)
            X.Ssl r1 = new X.Ssl
            r1.<init>(r4, r2, r3, r12)
            X.SST r8 = new X.SST
            r8.<init>(r1, r6, r5)
            java.lang.Class<X.QVl> r7 = X.C7748QVl.class
            r6 = 5
            java.lang.String r5 = "universe_info"
            r4 = -1794245734(0xffffffff950dfb9a, float:-2.8673202E-26)
            X.3lr r0 = r10.getOptionalTreeField(r6, r5, r7, r4)
            if (r0 == 0) goto L_0x016f
            X.3lr r3 = r10.getOptionalTreeField(r6, r5, r7, r4)
            if (r3 == 0) goto L_0x0202
            java.lang.Class<X.QSc> r1 = X.C7661QSc.class
            r0 = -546348433(0xffffffffdf6f626f, float:-1.7249472E19)
            X.3lr r1 = r3.reinterpretRequired(r12, r1, r0)
            if (r1 == 0) goto L_0x0202
            java.lang.String r0 = "icon_uri"
            java.lang.String r1 = r1.A09(r0)
        L_0x0152:
            X.3lr r4 = r10.getOptionalTreeField(r6, r5, r7, r4)
            if (r4 == 0) goto L_0x0169
            java.lang.Class<X.QSc> r3 = X.C7661QSc.class
            r0 = -546348433(0xffffffffdf6f626f, float:-1.7249472E19)
            X.3lr r3 = r4.reinterpretRequired(r12, r3, r0)
            if (r3 == 0) goto L_0x0169
            java.lang.String r0 = "icon_uri_dark"
            java.lang.String r2 = r3.A0A(r0)
        L_0x0169:
            X.Ssk r0 = new X.Ssk
            r0.<init>(r1, r2, r12, r11)
            r2 = r0
        L_0x016f:
            X.Qgk r1 = X.C8092Qgk.A00(r16)
            X.QgW r5 = new X.QgW
            r5.<init>()
            java.lang.String r0 = "transaction_image_uri"
            java.lang.String r4 = r15.getOptionalStringField(r12, r0)
            java.lang.String r0 = "transaction_image_uri_dark"
            java.lang.String r3 = r15.getOptionalStringField(r11, r0)
            X.Ssk r0 = new X.Ssk
            r0.<init>(r4, r3, r12, r11)
            r5.A02 = r0
            r5.A01 = r2
            X.QgY r3 = X.SIE.A02(r5, r1)
            java.lang.String r0 = "transaction_description_title"
            java.lang.String r0 = r9.A0B(r0)
            X.StR r0 = X.C12401StR.A01(r0)
            X.RH2 r4 = X.RH2.PRIMARY_TEXT
            X.SST.A02(r0, r3, r4)
            java.lang.String r2 = "transaction_date"
            r0 = r18
            X.StR r2 = X.C12401StR.A00(r0, r2, r12)
            X.RH2 r0 = X.RH2.A14
            X.Qge r0 = X.SST.A00(r2, r3, r0)
            r1.A01(r0, r11)
            X.QgY r3 = X.C8080QgY.A00()
            java.lang.String r2 = "transaction_formatted_amount"
            r0 = r19
            X.StR r0 = X.C12401StR.A00(r0, r2, r12)
            X.SST.A02(r0, r3, r4)
            r3.A02 = r8
            r3.A03 = r12
            X.Qge r0 = new X.Qge
            r0.<init>(r3)
            r1.A06 = r0
            r0 = 37
            X.SbM r0 = X.C11499SbM.A00(r10, r14, r0)
            r1.A03 = r0
            X.SRP r3 = new X.SRP
            r4 = r21
            r5 = r4
            r6 = r22
            r7 = r12
            r8 = r12
            r9 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r2 = "transaction_row_accessibility_label"
            r0 = r17
            X.StR r0 = X.C12401StR.A00(r0, r2, r12)
            r3.A01 = r0
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r0 = 2131975508(0x7f135d54, float:1.958811E38)
            X.StQ r0 = X.C12400StQ.A00(r2, r0)
            r3.A00 = r0
            r3.A04 = r11
            X.SO0.A01(r3, r1, r13)
            goto L_0x0080
        L_0x0202:
            r1 = r2
            goto L_0x0152
        L_0x0205:
            r1 = 10
            X.RH2 r5 = X.RH2.A0X
            goto L_0x011b
        L_0x020b:
            r1 = 9
            X.RH2 r5 = X.RH2.META_EMPHASIZED_NEGATIVE
            goto L_0x011b
        L_0x0211:
            r1 = 8
            X.RH2 r5 = X.RH2.META_EMPHASIZED_POSITIVE
            goto L_0x011b
        L_0x0217:
            r0 = r2
            goto L_0x0107
        L_0x021a:
            r5 = r2
            goto L_0x00ac
        L_0x021d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0222:
            X.QUd r1 = r14.A00
            if (r1 == 0) goto L_0x0247
            java.lang.String r0 = "has_next_page"
            boolean r0 = r1.getCoercedBooleanField(r12, r0)
            if (r0 != r11) goto L_0x0247
            X.2Fj r0 = r14.A06
            java.lang.Object r1 = r0.A02()
            X.RDz r0 = X.C8882RDz.LOADING
            if (r1 == r0) goto L_0x0247
            r0 = 31
            X.Qgh r1 = new X.Qgh
            r1.<init>(r0)
            X.Qgl r0 = new X.Qgl
            r0.<init>(r1)
            r13.add(r0)
        L_0x0247:
            X.2gB r1 = r14.A04
            com.google.common.collect.ImmutableList r0 = r13.build()
            r1.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8073QgR.A04(X.QgR):void");
    }

    public static final void A05(C8073QgR qgR, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, Map map) {
        String A0j;
        2FO A002 = C11426STk.A00();
        HashMap A003 = C9634ReE.A00(qgR.A0E());
        C250663lr A09 = C8115Qh7.A09(qgR);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        A003.put("financial_entity_id", A0j);
        Pxj.A1L("view_name", "transactions", str2, A003);
        if (str3 != null) {
            A003.put("batch_item_id", str3);
        }
        if (str4 != null) {
            A003.put("payout_record_id", str4);
        }
        if (str5 != null) {
            A003.put("endpoint", str5);
        }
        if (str6 != null) {
            A003.put("start_cursor", str6);
        }
        if (str7 != null) {
            A003.put("end_cursor", str7);
        }
        if (bool != null) {
            A003.put("has_next_page", bool);
        }
        if (str8 != null) {
            A003.put("error_message", str8);
        }
        if (str9 != null) {
            A003.put("error_stacktrace", str9);
        }
        if (str10 != null) {
            A003.put("exception_class", str10);
        }
        if (map != null) {
            A003.put("transactions_id_list", map);
        }
        A002.Cgl(str, A003);
    }

    public static final void A07(C8073QgR qgR, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2) {
        String A0j;
        AnonymousClass2E0.A02();
        C250663lr A09 = C8115Qh7.A09(qgR);
        if (A09 == null || (A0j = Pxh.A0j(A09)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        SQ2.A03(A0j, str3, str, str2, (String) null, (String) null, str4, str5, str6, i, i2);
    }

    public static final void A08(String str) {
        AnonymousClass2E0.A02();
        SQ2.A00(667758015, 0, str, 0Yt.A0E());
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.BaseBundle] */
    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        if (r3 != null) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r0 = r2.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r2.A03 = r0;
        A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(android.os.Bundle r3) {
        /*
            r2 = this;
            super.A0C(r3)
            X.6rJ r1 = r2.A06
            java.lang.String r0 = "filter_type_bundle"
            java.lang.Object r0 = r1.A00(r0)
            android.os.BaseBundle r0 = (android.os.BaseBundle) r0
            if (r0 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x0019
        L_0x0011:
            java.lang.String r0 = "filter_transaction_type"
            java.lang.String r0 = r3.getString(r0)
            if (r0 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r0 = r2.A03
        L_0x001b:
            r2.A03 = r0
            r2.A03()
            return
        L_0x0021:
            r3 = r0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8073QgR.A0C(android.os.Bundle):void");
    }
}
