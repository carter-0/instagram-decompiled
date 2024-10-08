package X;

import android.view.View;

/* renamed from: X.GUv  reason: case insensitive filesystem */
public final class C52493GUv extends C234532y8 {
    public final HDB A00;

    public C52493GUv(HDB hdb) {
        this.A00 = hdb;
    }

    public final void Dcw(View view, int i, Object obj, Object obj2) {
        1Xg A01;
        1Xj A0o;
        1Xg A012;
        1Xj A0o2;
        AnonymousClass7TG.A1Q(obj, obj2);
        if ((obj instanceof 1Xj) && (obj2 instanceof AnonymousClass3W1) && C51966G9m.A1Y(obj)) {
            AnonymousClass3W1 r9 = (AnonymousClass3W1) obj2;
            int position = r9.getPosition();
            int i2 = position - 1;
            String str = null;
            if (i2 >= 0) {
                HDB hdb = this.A00;
                if (!(i2 >= hdb.getItemCount() || (A012 = hdb.A01(i2)) == null || (A0o2 = C51965G9l.A0o(A012)) == null)) {
                    str = A0o2.getId();
                }
            }
            int i3 = position + 1;
            String str2 = null;
            if (i3 >= 0) {
                HDB hdb2 = this.A00;
                if (!(i3 >= hdb2.getItemCount() || (A01 = hdb2.A01(i3)) == null || (A0o = C51965G9l.A0o(A01)) == null)) {
                    str2 = A0o.getId();
                }
            }
            r9.A1S = str;
            r9.A1O = str2;
        }
    }
}
