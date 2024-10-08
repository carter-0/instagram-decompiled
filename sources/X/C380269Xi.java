package X;

import android.util.LruCache;

/* renamed from: X.9Xi  reason: invalid class name and case insensitive filesystem */
public final class C380269Xi extends LruCache {
    public final int A00 = 1;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380269Xi(C11177SEd sEd) {
        super(99);
        this.A01 = sEd;
    }

    public final /* bridge */ /* synthetic */ void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        AnonymousClass9OB r2;
        if (this.A00 != 0) {
            C295015nP r6 = (C295015nP) obj2;
            AnonymousClass7TG.A1O(obj, r6);
            if (z && (r2 = ((AnonymousClass9OA) this.A01).A00) != null) {
                C338587iC r1 = r2.A00;
                if (!r1.A05) {
                    return;
                }
                if (AnonymousClass2VL.A01()) {
                    r6.A04();
                } else {
                    r1.A04.post(new C40950Alw(r6, r2));
                }
            }
        } else if (z) {
            C11177SEd sEd = C11177SEd.A02;
            SSR.A00().A04("IABTabs.cleanUp.Start");
            throw AnonymousClass7TE.A15(AnonymousClass000.A00(114));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380269Xi(AnonymousClass9OA r2) {
        super(4);
        this.A01 = r2;
    }
}
