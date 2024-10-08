package X;

import com.google.common.collect.ReverseNaturalOrdering;
import java.util.Comparator;

/* renamed from: X.Q1j  reason: case insensitive filesystem */
public final /* synthetic */ class C7260Q1j implements Comparator {
    public final int compare(Object obj, Object obj2) {
        AnonymousClass4XG r5 = (AnonymousClass4XG) obj;
        AnonymousClass4XG r6 = (AnonymousClass4XG) obj2;
        C7280Q2f A03 = C7280Q2f.A00.A03(r5.A0D, r6.A0D);
        Integer valueOf = Integer.valueOf(r5.A03);
        Integer valueOf2 = Integer.valueOf(r6.A03);
        ReverseNaturalOrdering reverseNaturalOrdering = ReverseNaturalOrdering.A00;
        C7280Q2f A02 = A03.A02(valueOf, valueOf2, reverseNaturalOrdering).A01(r5.A04, r6.A04).A01(r5.A06, r6.A06).A03(r5.A0A, r6.A0A).A03(r5.A0B, r6.A0B).A03(r5.A0C, r6.A0C).A02(Integer.valueOf(r5.A05), Integer.valueOf(r6.A05), reverseNaturalOrdering);
        boolean z = r5.A0F;
        C7280Q2f A032 = A02.A03(z, r6.A0F);
        boolean z2 = r5.A0E;
        C7280Q2f A033 = A032.A03(z2, r6.A0E);
        if (z && z2) {
            A033 = A033.A01(r5.A01, r6.A01);
        }
        return A033.A00();
    }
}
