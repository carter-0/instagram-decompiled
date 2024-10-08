package X;

import java.util.List;

/* renamed from: X.OzQ  reason: case insensitive filesystem */
public final class C72255OzQ implements 0mK {
    public final int A00;
    public final Object A01;

    public C72255OzQ(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onDebouncedValue(Object obj) {
        Object value;
        switch (this.A00) {
            case 0:
                C68488NKh nKh = (C68488NKh) this.A01;
                String str = (String) obj;
                C74544Pwd pwd = nKh.A04;
                if (pwd != null && !str.isEmpty()) {
                    C74544Pwd.A00(nKh, pwd, str);
                    return;
                }
                return;
            case 1:
                String A1E = C41847B3o.A1E(obj);
                C53002Ggt ggt = (C53002Ggt) this.A01;
                if (A1E.length() == 0) {
                    05G r2 = ggt.A03;
                    do {
                        value = r2.getValue();
                    } while (!r2.AIY(value, JVH.A00((JVH) value, (C317486nL) null, (String) null, (List) null, ggt.A02, 27)));
                    return;
                }
                ggt.A01.filter(A1E);
                return;
            default:
                ((OO0) this.A01).A04(C41847B3o.A1E(obj));
                return;
        }
    }
}
