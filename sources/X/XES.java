package X;

import java.util.HashMap;
import java.util.List;

public final class XES extends AnonymousClass0T0 {
    public final C41913B6l A00;
    public final Integer A01;
    public final Integer A02;
    public final List A03;
    public final Boolean A04;
    public final Boolean A05;
    public final String A06;
    public final HashMap A07;
    public final List A08;

    public XES(C41913B6l b6l, Boolean bool, Boolean bool2, Integer num, Integer num2, String str, HashMap hashMap, List list, List list2) {
        0qQ.A0B(list, 1);
        0qQ.A0B(str, 3);
        0qQ.A0B(list2, 8);
        this.A03 = list;
        this.A01 = num;
        this.A06 = str;
        this.A02 = num2;
        this.A04 = bool;
        this.A07 = hashMap;
        this.A05 = bool2;
        this.A08 = list2;
        this.A00 = b6l;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof XES) {
                XES xes = (XES) obj;
                if (!0qQ.A0K(this.A03, xes.A03) || !0qQ.A0K(this.A01, xes.A01) || !0qQ.A0K(this.A06, xes.A06) || !0qQ.A0K(this.A02, xes.A02) || !0qQ.A0K(this.A04, xes.A04) || !0qQ.A0K(this.A07, xes.A07) || !0qQ.A0K(this.A05, xes.A05) || !0qQ.A0K(this.A08, xes.A08) || !0qQ.A0K(this.A00, xes.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A06;
        return AnonymousClass7TF.A07(this.A08, (((((((AnonymousClass7TF.A08(str, ((this.A03.hashCode() * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }
}
