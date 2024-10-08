package X;

import android.net.Uri;

/* renamed from: X.Sby  reason: case insensitive filesystem */
public final class C11537Sby implements 00W {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C11537Sby(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ void Cti(Object obj) {
        if (this.A00 != 0) {
            if (obj != null) {
                try {
                    Uri A09 = DbT.A09(obj.toString());
                    C10658Rvs rvs = (C10658Rvs) this.A01;
                    String A10 = DbT.A10(A09);
                    C11118SAx.A00.A00.add(A10);
                    C299275ur.A00(rvs.A00, Pxj.A0a(A10), rvs.A03);
                } catch (SecurityException e) {
                    C10658Rvs rvs2 = (C10658Rvs) this.A01;
                    C299275ur.A00(rvs2.A00, Pxj.A0a(e.toString()), rvs2.A02);
                }
            } else {
                C10658Rvs rvs3 = (C10658Rvs) this.A01;
                0qQ.A0B(C7907Qcd.A00, 0);
                C299275ur.A00(rvs3.A00, DbS.A0P().A00(), rvs3.A01);
            }
            00Y r0 = ((SET) this.A02).A00;
            if (r0 == null) {
                0qQ.A0F("activityResultLauncher");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r0.A00();
            }
        } else {
            ((C55980Hql) this.A01).A00();
            0sP r02 = (0sP) this.A02;
            if (r02 != null) {
                r02.invoke(obj);
            }
        }
    }
}
