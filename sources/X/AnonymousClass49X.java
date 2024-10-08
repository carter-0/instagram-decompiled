package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: X.49X  reason: invalid class name */
public final class AnonymousClass49X {
    public final AnonymousClass2oZ A00;
    public final C2613149c A01;
    public final WeakReference A02;

    /* JADX WARNING: type inference failed for: r8v0, types: [java.lang.Object, X.2oS] */
    /* JADX WARNING: type inference failed for: r10v0, types: [java.lang.Object, X.2oT] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.2oY] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.2oV] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.49a] */
    public AnonymousClass49X(String str, WeakReference weakReference) {
        this.A02 = weakReference;
        ? obj = new Object();
        ? obj2 = new Object();
        AnonymousClass2oU r9 = new AnonymousClass2oU(weakReference);
        this.A00 = new AnonymousClass2oZ(new Object(), new Object(), obj, r9, obj2);
        ArrayList arrayList = new ArrayList();
        0lg r0 = (0lg) weakReference.get();
        if (r0 != null) {
            arrayList.add(new C2613049b(new Object(), new AnonymousClass49Z(r0), str));
        }
        this.A01 = new C2613149c(arrayList, true);
    }
}
