package X;

import com.google.common.collect.ImmutableList;
import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.ReC  reason: case insensitive filesystem */
public abstract class C9632ReC {
    /* JADX WARNING: type inference failed for: r2v2, types: [X.RwX, X.QgW] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.RwX, X.QgV] */
    public static final void A00(SUj sUj, ImmutableList.Builder builder, 0sP r22, boolean z) {
        C12398Ssm ssm;
        String str;
        String optionalStringField;
        C11499SbM sbM;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String optionalStringField2;
        SUj sUj2 = sUj;
        0qQ.A0B(sUj2, 1);
        if (z) {
            ssm = new C12398Ssm(4, 4, 2, 1);
        } else {
            ssm = null;
        }
        AbstractCollection abstractCollection = (AbstractCollection) sUj2.A01;
        if (abstractCollection != null) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(it);
                Locale A0w = Pxh.A0w();
                if (A0V != null) {
                    str = A0V.A0A("payout_record_start_date");
                } else {
                    str = null;
                }
                if (str != null) {
                    String A00 = C9644ReO.A00(Pxh.A0w(), str);
                    if (A0V == null || (optionalStringField = A0V.getOptionalStringField(4, "payout_record_end_date")) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    C12401StR A01 = C12401StR.A01(Pxe.A12(A0w, "%s - %s", Pxf.A1X(A00, C9644ReO.A00(Pxh.A0w(), optionalStringField), 2)));
                    0sP r13 = r22;
                    if (r22 != null) {
                        sbM = C11499SbM.A00(A0V, r13, 32);
                    } else {
                        sbM = null;
                    }
                    C8092Qgk A002 = C8092Qgk.A00(16);
                    ? rwX = new C10693RwX();
                    Class<QV4> cls = QV4.class;
                    C250663lr optionalTreeField = A0V.getOptionalTreeField(6, "payee", cls, -968339709);
                    if (optionalTreeField != null) {
                        str2 = optionalTreeField.getOptionalStringField(1, "payee_profile_uri");
                    } else {
                        str2 = null;
                    }
                    rwX.A02 = new C12396Ssk(str2, (String) null, true, true);
                    C8080QgY A02 = SIE.A02(rwX, A002);
                    C250663lr optionalTreeField2 = A0V.getOptionalTreeField(6, "payee", cls, -968339709);
                    if (optionalTreeField2 != null) {
                        str3 = optionalTreeField2.getOptionalStringField(0, "payee_name");
                    } else {
                        str3 = null;
                    }
                    C12401StR A012 = C12401StR.A01(str3);
                    RH2 rh2 = RH2.PRIMARY_TEXT;
                    SST.A02(A012, A02, rh2);
                    C12401StR A003 = C12401StR.A00(A0V, "payout_record_product_subtype_name", 1);
                    RH2 rh22 = RH2.A14;
                    SST.A03(A003, A02, rh22);
                    A02.A03 = new SST((C13889TjC) null, A01, rh22);
                    A02.A03 = false;
                    C8086Qge.A00(A002, A02, 1);
                    ? rwX2 = new C10693RwX();
                    Class<QV5> cls2 = QV5.class;
                    C250663lr optionalTreeField3 = A0V.getOptionalTreeField(2, "payout_record_payout_amount", cls2, -645269283);
                    if (optionalTreeField3 != null) {
                        str4 = optionalTreeField3.getOptionalStringField(0, "formatted_amount");
                    } else {
                        str4 = null;
                    }
                    rwX2.A01 = new SST((C13889TjC) null, C12401StR.A01(str4), rh2);
                    rwX2.A00 = ssm;
                    rwX2.A03 = false;
                    A002.A06 = new C8084Qgc(rwX2);
                    A002.A03 = sbM;
                    if (r22 != null) {
                        num = AnonymousClass05K.A01;
                    } else {
                        num = AnonymousClass05K.A00;
                    }
                    boolean A1V = AnonymousClass7TF.A1V(r13);
                    String str6 = "";
                    C250663lr optionalTreeField4 = A0V.getOptionalTreeField(6, "payee", cls, -968339709);
                    if (optionalTreeField4 == null || (str5 = optionalTreeField4.getOptionalStringField(0, "payee_name")) == null) {
                        str5 = str6;
                    }
                    String optionalStringField3 = A0V.getOptionalStringField(1, "payout_record_product_subtype_name");
                    if (optionalStringField3 == null) {
                        optionalStringField3 = str6;
                    }
                    C250663lr optionalTreeField5 = A0V.getOptionalTreeField(2, "payout_record_payout_amount", cls2, -645269283);
                    if (!(optionalTreeField5 == null || (optionalStringField2 = optionalTreeField5.getOptionalStringField(0, "formatted_amount")) == null)) {
                        str6 = optionalStringField2;
                    }
                    SO0.A01(new SRP(C12400StQ.A00(new Object[]{str5, optionalStringField3, A01, str6}, 2131961080), C12400StQ.A00(new Object[0], 2131961096), num, A1V, false, false), A002, builder);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
        }
    }
}
