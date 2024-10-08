package X;

import java.lang.ref.WeakReference;

/* renamed from: X.51z  reason: invalid class name and case insensitive filesystem */
public final class C2804751z implements AnonymousClass520 {
    public final /* synthetic */ C2804651y A00;
    public final /* synthetic */ C250583lh A01;
    public final /* synthetic */ Object A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;

    public C2804751z(C2804651y r1, C250583lh r2, Object obj, String str, WeakReference weakReference) {
        this.A01 = r2;
        this.A02 = obj;
        this.A00 = r1;
        this.A03 = str;
        this.A04 = weakReference;
    }

    public final void DFr(boolean z) {
        C308836Vu r0;
        String str = this.A03;
        C250583lh r3 = this.A01;
        AnonymousClass1xL r2 = r3.A06;
        r2.A00.A09.A00(str, z, -1);
        11Z.A02(new C291435hH(r2));
        WeakReference weakReference = this.A04;
        if (!(weakReference == null || (r0 = (C308836Vu) weakReference.get()) == null)) {
            r0.A00(z);
        }
        C250583lh.A00(r3);
    }
}
