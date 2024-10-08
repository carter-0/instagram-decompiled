package X;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Us  reason: invalid class name and case insensitive filesystem */
public final class C379639Us implements AnonymousClass2U7 {
    public final /* synthetic */ Comparator A00;
    public final /* synthetic */ AnonymousClass2U7 A01;

    public C379639Us(Comparator comparator, AnonymousClass2U7 r2) {
        this.A01 = r2;
        this.A00 = comparator;
    }

    public final Iterator iterator() {
        List A08 = C242173Sx.A08(this.A01);
        01V.A1D(A08, this.A00);
        return A08.iterator();
    }
}
