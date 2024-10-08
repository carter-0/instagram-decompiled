package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.Fat  reason: case insensitive filesystem */
public final class C50390Fat implements G9b {
    public final String A00;
    public final /* synthetic */ F15 A01;

    public final boolean Cdh(DirectShareTarget directShareTarget) {
        return false;
    }

    public final void D8y(DirectShareTarget directShareTarget) {
    }

    public final void Dbk(View view, DirectShareTarget directShareTarget, int i, int i2, int i3) {
    }

    public final boolean Dbl(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        0qQ.A0B(directShareTarget, 0);
        AnonymousClass37E r2 = AnonymousClass37D.A00;
        F15 f15 = this.A01;
        DbX.A14(f15.A02, r2);
        E5H e5h = f15.A06;
        e5h.A0A.A0R(DbV.A14(directShareTarget));
        e5h.Dbv();
        return false;
    }

    public final boolean Dbo(DirectShareTarget directShareTarget) {
        return true;
    }

    public final /* synthetic */ void Dbs(View view) {
    }

    public final /* synthetic */ void Dbt() {
    }

    public final void Dhj() {
    }

    public final void Dwl() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0.BiY();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C50390Fat(X.F15 r2) {
        /*
            r1 = this;
            r1.A01 = r2
            r1.<init>()
            X.7fy r0 = r2.A01
            if (r0 == 0) goto L_0x000f
            java.lang.String r0 = r0.BiY()
            if (r0 != 0) goto L_0x0011
        L_0x000f:
            java.lang.String r0 = ""
        L_0x0011:
            r1.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50390Fat.<init>(X.F15):void");
    }

    public final String BqO() {
        return this.A00;
    }

    public final boolean CbW(DirectShareTarget directShareTarget) {
        return this.A01.A0B.containsKey(directShareTarget.A09());
    }

    public final boolean Es2(DirectShareTarget directShareTarget) {
        return this.A01.A0B.containsKey(directShareTarget.A09());
    }
}
