package X;

import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3de  reason: invalid class name and case insensitive filesystem */
public final class C245893de {
    public final 1Xj A00;
    public final AnonymousClass3W1 A01;
    public final String A02;
    public final List A03;
    public final List A04;
    public final C62320sa A05 = new AnonymousClass9LM(this, 33);
    public final boolean A06;
    public final boolean A07;

    public C245893de(1Xj r14, AnonymousClass3W1 r15) {
        boolean z;
        this.A00 = r14;
        this.A01 = r15;
        this.A07 = r14.CcK();
        this.A06 = r14.A5D();
        this.A04 = r14.A0C.BxO();
        this.A02 = r14.A2Z();
        List list = r14.A1X().A00;
        ArrayList<C247733gp> arrayList = new ArrayList<>();
        for (Object next : list) {
            C247733gp r1 = (C247733gp) next;
            if (r1.A08 != null && !r1.A03()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (C247733gp r2 : arrayList) {
            String str = r2.A0d;
            String str2 = r2.A0G;
            User user = r2.A08;
            if (user != null) {
                0sn r9 = r2.A0I;
                r9 = r9 == null ? 0sn.A00 : r9;
                boolean z2 = r2.A0j;
                AnonymousClass3W1 r0 = this.A01;
                if (r0 != null) {
                    z = true;
                    if (r0.A3b.A00 == AnonymousClass3W9.Translated) {
                        arrayList2.add(new AnonymousClass50W(user, str, str2, r9, z2, z, r2.A0O));
                    }
                }
                z = false;
                arrayList2.add(new AnonymousClass50W(user, str, str2, r9, z2, z, r2.A0O));
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        this.A03 = arrayList2;
    }
}
