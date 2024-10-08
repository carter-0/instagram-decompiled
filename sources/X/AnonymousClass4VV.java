package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.4VV  reason: invalid class name */
public final class AnonymousClass4VV {
    public final AnonymousClass4VM A00;
    public final String A01;
    public final Map A02;

    public AnonymousClass4VV(AnonymousClass4VM r6) {
        Map map;
        String str;
        String str2;
        0qQ.A0B(r6, 1);
        this.A00 = r6;
        List<AnonymousClass4VP> list = r6.A03;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (AnonymousClass4VP r1 : list) {
                if (r1 != null) {
                    Boolean bool = r1.A00;
                    if (bool == null || (str2 = bool.toString()) == null) {
                        str2 = r1.A03;
                        if (str2 == null) {
                            Integer num = r1.A01;
                            if (num != null) {
                                str2 = num.toString();
                            }
                        }
                        if (str2 == null) {
                        }
                    }
                    arrayList.add(new 0eP(r1.A02, str2));
                }
            }
            map = 0Yt.A08(arrayList);
        } else {
            map = 0Yt.A0E();
        }
        this.A02 = map;
        AnonymousClass4VP r2 = this.A00.A01;
        String str3 = null;
        if (r2 != null) {
            Boolean bool2 = r2.A00;
            if ((bool2 == null || (str = bool2.toString()) == null) && (str = r2.A03) == null) {
                Integer num2 = r2.A01;
                if (num2 != null) {
                    str = num2.toString();
                }
            }
            str3 = str;
        }
        this.A01 = str3;
    }
}
