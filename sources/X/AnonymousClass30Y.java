package X;

import android.view.View;
import java.util.Collections;
import java.util.List;

/* renamed from: X.30Y  reason: invalid class name */
public class AnonymousClass30Y {
    public static final AnonymousClass30Y A07 = new AnonymousClass30Y((AnonymousClass30Y) null, (Object) null, (Object) null, "empty", "empty", Collections.emptyList());
    public String A00;
    public boolean A01;
    public final AnonymousClass30Y A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final List A06;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnonymousClass30Y(AnonymousClass30Y r8, Object obj, Object obj2, String str, List list) {
        this(r8, obj, obj2, str, str, list == null ? Collections.emptyList() : list);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass30Y(X.C2354830a r8) {
        /*
            r7 = this;
            java.lang.Object r2 = r8.A02
            java.lang.Object r3 = r8.A03
            java.lang.String r4 = r8.A04
            java.util.List r6 = r8.A01
            if (r6 != 0) goto L_0x000e
            java.util.List r6 = java.util.Collections.emptyList()
        L_0x000e:
            X.30Y r1 = r8.A00
            r0 = r7
            r5 = r4
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass30Y.<init>(X.30a):void");
    }

    public static C2354830a A00(Object obj, Object obj2, String str) {
        return new C2354830a(obj, obj2, str);
    }

    public void A01(C252093oY r6) {
        for (C250603lj r3 : this.A06) {
            C70552Rj r2 = C70552Rj.A01;
            int Ewe = r2.A00.Ewe(r3.getClass());
            r3.ATF(this, r6);
            r2.A00.ASG(Ewe);
        }
        if (r6.CEk(this) == AnonymousClass05K.A00) {
            this.A01 = true;
        }
    }

    public AnonymousClass30Y(AnonymousClass30Y r3, Object obj, Object obj2, String str, String str2, List list) {
        if (!(obj instanceof View)) {
            this.A03 = obj;
            this.A04 = obj2;
            this.A05 = str;
            this.A00 = str2;
            this.A02 = r3;
            this.A01 = false;
            this.A06 = list;
            return;
        }
        throw new IllegalArgumentException("ViewpointData should not contain a view as model");
    }
}
