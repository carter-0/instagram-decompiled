package X;

import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.TWr  reason: case insensitive filesystem */
public final class C13357TWr extends 0Yg implements 0sP {
    public static final C13357TWr A00 = new C13357TWr();

    public C13357TWr() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C226742hm r5 = (C226742hm) obj;
        0qQ.A0B(r5, 0);
        if (!(r5 instanceof C226752hn)) {
            return "";
        }
        C226902i9 r1 = ((C226752hn) r5).A0G.A04;
        if (r1 == null) {
            return "unset";
        }
        int A02 = r1.A02();
        return Pxe.A12(Locale.US, "%dx%d", Arrays.copyOf(C51968G9o.A1Z(Integer.valueOf(A02), r1.A01()), 2));
    }
}
