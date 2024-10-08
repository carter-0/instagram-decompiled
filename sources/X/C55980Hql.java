package X;

import androidx.activity.ComponentActivity;

/* renamed from: X.Hql  reason: case insensitive filesystem */
public final class C55980Hql {
    public int A00;
    public 00Y A01;
    public 0sP A02 = null;
    public final ComponentActivity A03;
    public final String A04;

    public C55980Hql(ComponentActivity componentActivity, String str) {
        AnonymousClass7TG.A1O(str, componentActivity);
        this.A04 = str;
        this.A03 = componentActivity;
        this.A00 = C56190HuJ.A00(componentActivity, str);
    }

    public final void A00() {
        0sP r1;
        int A002 = C56190HuJ.A00(this.A03, this.A04);
        boolean z = !AnonymousClass7TF.A1S(this.A00, A002);
        this.A00 = A002;
        if (z && (r1 = this.A02) != null) {
            r1.invoke(new C56054Hs3(A002));
        }
    }
}
