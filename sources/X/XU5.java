package X;

import java.util.ArrayList;
import java.util.Iterator;

public final class XU5 {
    public static int A05;
    public int A00;
    public int A01;
    public int A02;
    public ArrayList A03;
    public ArrayList A04;

    public final int A00(2dA r6, int i) {
        int A002;
        2d6 r0;
        ArrayList arrayList = this.A04;
        if (arrayList.size() == 0) {
            return 0;
        }
        2d1 r2 = ((2d3) arrayList.get(0)).A0h;
        r6.A0B();
        r2.A0O(r6, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((2d3) arrayList.get(i2)).A0O(r6, false);
        }
        if (i == 0) {
            if (r2.A00 > 0) {
                AnonymousClass3MV.A00(r6, r2, arrayList, 0);
            }
        } else if (r2.A04 > 0) {
            AnonymousClass3MV.A00(r6, r2, arrayList, 1);
        }
        try {
            r6.A0A();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.A03 = AnonymousClass7TE.A1C();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.A03.add(new C21369XZc((2d3) arrayList.get(i3), this));
        }
        if (i == 0) {
            A002 = 2dA.A00(r2.A0e);
            r0 = r2.A0f;
        } else {
            A002 = 2dA.A00(r2.A0g);
            r0 = r2.A0a;
        }
        int A003 = 2dA.A00(r0);
        r6.A0B();
        return A003 - A002;
    }

    public final void A01(XU5 xu5, int i) {
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            2d3 r2 = (2d3) it.next();
            ArrayList arrayList = xu5.A04;
            if (!arrayList.contains(r2)) {
                arrayList.add(r2);
            }
            int i2 = xu5.A00;
            if (i == 0) {
                r2.A07 = i2;
            } else {
                r2.A0X = i2;
            }
        }
        this.A01 = xu5.A00;
    }

    public final void A02(ArrayList arrayList) {
        int size = this.A04.size();
        if (this.A01 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                XU5 xu5 = (XU5) arrayList.get(i);
                if (this.A01 == xu5.A00) {
                    A01(xu5, this.A02);
                }
            }
        } else if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final String toString() {
        String str;
        int i = this.A02;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else {
            str = "Both";
        }
        String A06 = 002.A06(this.A00, str, " [", "] <");
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            A06 = 002.A0g(A06, " ", ((2d3) it.next()).A0n);
        }
        return 002.A0R(A06, " >");
    }
}
