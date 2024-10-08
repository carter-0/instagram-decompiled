package X;

import java.util.Comparator;

/* renamed from: X.48b  reason: invalid class name and case insensitive filesystem */
public final class C2610548b implements Comparator {
    public final /* synthetic */ AnonymousClass2hV A00;
    public final /* synthetic */ 2Ed A01;
    public final /* synthetic */ C2610448a A02;

    public C2610548b(AnonymousClass2hV r1, 2Ed r2, C2610448a r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final int compare(Object obj, Object obj2) {
        Comparator comparator = this.A01.A02;
        AnonymousClass2hV r0 = this.A00;
        return comparator.compare(r0.apply(obj), r0.apply(obj2));
    }
}
