package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.87b  reason: invalid class name and case insensitive filesystem */
public final class C3509687b implements C3509787c {
    public final /* synthetic */ C3509286x A00;

    public C3509687b(C3509286x r1) {
        this.A00 = r1;
    }

    public final void D8d(List list) {
        ArrayList arrayList = new ArrayList(list);
        C3509286x r3 = this.A00;
        if (!r3.A0A() || r3.A0B()) {
            AnonymousClass87G r2 = r3.A00;
            if (r2 != null) {
                AnonymousClass87I r1 = r2.A04;
                if (r1 == null) {
                    r1 = AnonymousClass87I.EMPTY;
                }
                if (r1 == AnonymousClass87I.END_OF_YEAR || r1 == AnonymousClass87I.BIRTHDAY_HIGHLIGHTS || r1 == AnonymousClass87I.SUPERLATIVE) {
                    arrayList.add(0, r2);
                }
            }
            r3.A0H.A06(arrayList);
            r3.A0J.A00().FK5();
            r3.A04();
        }
    }
}
