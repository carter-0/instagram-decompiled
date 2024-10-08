package X;

import java.util.List;

public final class S4e {
    public final SGl A00;
    public volatile Integer A01 = AnonymousClass05K.A00;
    public volatile List A02;

    public S4e(SGl sGl) {
        0qQ.A0B(sGl, 1);
        this.A00 = sGl;
    }

    public final synchronized void A01(Object obj) {
        if (this.A01 != AnonymousClass05K.A0C) {
            if (this.A01 == AnonymousClass05K.A00) {
                if (this.A02 == null) {
                    this.A02 = AnonymousClass7TE.A1C();
                }
                List list = this.A02;
                if (list != null) {
                    list.add(obj);
                }
            } else {
                this.A00.A00(this, obj);
            }
        }
    }

    public final void A00(Integer num) {
        String str;
        String str2;
        List<Object> list;
        C245983dn.A02("Handler's active status can only be changed on the main thread");
        Integer num2 = this.A01;
        if (num2 != num) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (intValue <= intValue2) {
                synchronized (this) {
                    this.A01 = num;
                    List list2 = this.A02;
                    if (list2 != null) {
                        list = 00k.A0a(list2);
                    } else {
                        list = null;
                    }
                    List list3 = this.A02;
                    if (list3 != null) {
                        list3.clear();
                    }
                    this.A02 = null;
                }
                if (list != null && num == AnonymousClass05K.A01) {
                    for (Object A002 : list) {
                        this.A00.A00(this, A002);
                    }
                    return;
                }
                return;
            }
            String A003 = C66579MXk.A00(581);
            if (2 - intValue != 0) {
                str = "PENDING";
            } else {
                str = "INACTIVE";
            }
            if (1 - intValue2 != 0) {
                str2 = "INACTIVE";
            } else {
                str2 = "ACTIVE";
            }
            throw AnonymousClass7TE.A0z(002.A0u(A003, str, " to ", str2));
        }
    }
}
