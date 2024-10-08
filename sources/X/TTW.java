package X;

import com.facebookpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.List;

public final class TTW extends 0Yg implements C62320sa {
    public final /* synthetic */ LoggingContext A00;
    public final /* synthetic */ SEB A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TTW(LoggingContext loggingContext, SEB seb, String str, String str2, List list, boolean z) {
        super(0);
        this.A02 = str;
        this.A00 = loggingContext;
        this.A05 = z;
        this.A04 = list;
        this.A03 = str2;
        this.A01 = seb;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        LoggingContext loggingContext;
        0sP r1;
        1Ln r0;
        String str = this.A02;
        int hashCode = str.hashCode();
        if (hashCode != -1785516855) {
            if (hashCode != 1996002556) {
                if (hashCode == 2012838315 && str.equals("DELETE")) {
                    C12411Sto A0g = C51965G9l.A0g();
                    LoggingContext loggingContext2 = this.A00;
                    boolean z = this.A05;
                    C12411Sto.A03(C51965G9l.A0U(C51969G9p.A0d(A0g.A00, "client_remove_fbpayaccountmutation_success"), 111), loggingContext2, new C58766IxD(6, loggingContext2, this.A04, Pxj.A0x(this.A01), z));
                }
            } else if (str.equals("CREATE")) {
                C12411Sto A0g2 = C51965G9l.A0g();
                loggingContext = this.A00;
                boolean z2 = this.A05;
                List list = this.A04;
                String str2 = this.A03;
                if (str2 != null) {
                    LinkedHashMap A0x = Pxj.A0x(this.A01);
                    r0 = C51965G9l.A0U(C51969G9p.A0d(A0g2.A00, "client_add_fbpayaccountmutation_success"), 23);
                    r1 = new C7211Pzd((Object) loggingContext, (Object) list, (Object) A0x, str2, 8, z2);
                    C12411Sto.A03(r0, loggingContext, r1);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
            throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str);
        }
        if (str.equals("UPDATE")) {
            C12411Sto A0g3 = C51965G9l.A0g();
            loggingContext = this.A00;
            boolean z3 = this.A05;
            List list2 = this.A04;
            LinkedHashMap A0x2 = Pxj.A0x(this.A01);
            r0 = C51965G9l.A0U(C51969G9p.A0d(A0g3.A00, "client_edit_fbpayaccountmutation_success"), 32);
            r1 = new C58766IxD(4, loggingContext, list2, A0x2, z3);
            C12411Sto.A03(r0, loggingContext, r1);
        }
        throw AnonymousClass7TF.A0W(AnonymousClass000.A00(970), str);
        return C60340gF.A00;
    }
}
