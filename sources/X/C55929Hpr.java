package X;

import androidx.activity.ComponentActivity;

/* renamed from: X.Hpr  reason: case insensitive filesystem */
public final class C55929Hpr {
    public final int A00;
    public final C55980Hql A01;

    public C55929Hpr(C55980Hql hql, int i) {
        0qQ.A0B(hql, 2);
        this.A00 = i;
        this.A01 = hql;
    }

    public final void A00() {
        C55980Hql hql = this.A01;
        ComponentActivity componentActivity = hql.A03;
        String str = hql.A04;
        if (C56190HuJ.A00(componentActivity, str) != 0) {
            00Y r0 = hql.A01;
            if (r0 != null) {
                r0.A02(str);
                return;
            }
            throw AnonymousClass7TE.A0z("Launcher has not been initialized");
        }
    }
}
