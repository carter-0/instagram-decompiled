package X;

import android.os.Bundle;
import com.facebookpay.msc.logging.LoggingData;
import com.google.common.collect.ImmutableList;
import java.util.List;

public final class QDD extends 2YL {
    public LoggingData A00;
    public String A01;
    public String A02;
    public List A03;
    public boolean A04;
    public Integer A05;
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass2Fj A07 = JTO.A0K();
    public final AnonymousClass2Fj A08 = JTO.A0K();
    public final AnonymousClass2Fj A09 = JTO.A0K();
    public final AnonymousClass2Fj A0A = new 2Fk(new S62(C12400StQ.A00(Pxe.A1b(), 2131969245), ImmutableList.of(), true));
    public final AnonymousClass2Fj A0B = JTO.A0K();
    public final AnonymousClass2Fj A0C = JTO.A0K();
    public final AnonymousClass2gO A0D;
    public final C319836rJ A0E;
    public final AnonymousClass0eM A0F = AnonymousClass0eN.A01(C13316TUp.A00);

    public QDD(C319836rJ r5) {
        0qQ.A0B(r5, 1);
        this.A0E = r5;
        r5.A04.put("tab_index_bundle", new C11759Sfv(this, 3));
        this.A0D = C11647Sdp.A00(this, 13);
    }

    public static final String A00(QDD qdd) {
        S6L s6l;
        Number number = (Number) qdd.A08.A02();
        if (number != null) {
            int intValue = number.intValue();
            List list = (List) qdd.A06.A02();
            if (!(list == null || (s6l = (S6L) 00k.A0O(list, intValue)) == null)) {
                String str = s6l.A03;
                switch (str.hashCode()) {
                    case -1868875270:
                        if (str.equals("transactions_fragment")) {
                            return "transactions";
                        }
                        break;
                    case -966253274:
                        if (str.equals("earnings_fragment")) {
                            return "payouthub_earnings";
                        }
                        break;
                    case 48250454:
                        if (str.equals("overview_fragment")) {
                            return "overview";
                        }
                        break;
                    case 1148185282:
                        if (str.equals("payouts_fragment")) {
                            return "payouthub_payouts";
                        }
                        break;
                }
            }
        }
        return null;
    }

    public final void A02(String str, String str2) {
        int i;
        Integer num = this.A05;
        if (num != null) {
            int intValue = num.intValue();
            AnonymousClass2E0.A02();
            SQ2.A02(intValue, 0, 615);
        }
        int hashCode = str.hashCode();
        if (hashCode != -1868875270) {
            if (hashCode != -1260171540) {
                if (hashCode == 48250454 && str.equals("overview_fragment")) {
                    i = 667754853;
                } else {
                    return;
                }
            } else if (str.equals("settings_fragment")) {
                i = 667749724;
            } else {
                return;
            }
        } else if (str.equals("transactions_fragment")) {
            i = 667758015;
        } else {
            return;
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            AnonymousClass2E0.A02();
            SQ2.A03((String) null, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, intValue2, 0);
            this.A05 = valueOf;
        }
    }

    public final Bundle A01() {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        List list = this.A03;
        if (list == null) {
            str = "financialEntities";
        } else {
            C11405SSc.A04(list, A0a);
            A0a.putString("page_id", this.A02);
            A0a.putBoolean("has_container_fragment", true);
            LoggingData loggingData = this.A00;
            if (loggingData == null) {
                str = "loggingData";
            } else {
                A0a.putParcelable("logging_data", loggingData);
                A0a.putBoolean("IS_V2", this.A04);
                return A0a;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
