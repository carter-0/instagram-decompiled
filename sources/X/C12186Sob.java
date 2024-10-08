package X;

import java.util.Map;

/* renamed from: X.Sob  reason: case insensitive filesystem */
public final class C12186Sob implements C13713Tfb {
    public final /* synthetic */ Map A00;
    public final /* synthetic */ 1IX A01;

    public final void Db0(C8918RFl rFl) {
        String str;
        Map map = this.A00;
        map.put("purchase_product_status", "FAILURE");
        SEJ sej = (SEJ) C10026RlL.A00.get(rFl);
        String str2 = "";
        if (sej != null) {
            str = sej.A00;
        } else {
            str = str2;
        }
        map.put("purchase_product_status_error_code", str);
        if (sej != null) {
            str2 = sej.A01;
        }
        map.put("purchase_product_status_error_description", str2);
        1IX r1 = this.A01;
        if (r1.isActive()) {
            r1.resumeWith(false);
        }
    }

    public final void Db2(C61073JwB jwB) {
        String str;
        String str2;
        0qQ.A0B(jwB, 0);
        Map map = this.A00;
        map.put("purchase_product_status", "SUCCESS");
        SEJ sej = (SEJ) C10026RlL.A00.get(C8918RFl.SUCCESSFUL);
        String str3 = "";
        if (sej != null) {
            str = sej.A00;
        } else {
            str = str3;
        }
        map.put("purchase_product_status_error_code", str);
        if (sej != null) {
            str2 = sej.A01;
        } else {
            str2 = str3;
        }
        map.put("purchase_product_status_error_description", str2);
        String str4 = jwB.A01;
        if (str4 == null) {
            str4 = str3;
        }
        map.put("internal_transaction_id", str4);
        String str5 = jwB.A03;
        if (str5 != null) {
            str3 = str5;
        }
        map.put("external_transaction_id", str3);
        1IX r1 = this.A01;
        if (r1.isActive()) {
            r1.resumeWith(AnonymousClass7TE.A0v());
        }
    }

    public C12186Sob(Map map, 1IX r2) {
        this.A00 = map;
        this.A01 = r2;
    }
}
