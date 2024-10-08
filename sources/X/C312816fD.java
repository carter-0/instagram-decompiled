package X;

import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.6fD  reason: invalid class name and case insensitive filesystem */
public final class C312816fD {
    public final C312826fE A00;
    public final ImmutableSet A01;
    public final 0lg A02;
    public final boolean A03;

    public C312816fD(C312716f1 r6, 0lg r7) {
        0qQ.A0B(r7, 1);
        0qQ.A0B(r6, 2);
        this.A02 = r7;
        0Tu r3 = 0Tu.A05;
        List A0R = 00l.A0R(182.A04(r3, r7, 36874050877980694L), new String[]{","}, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : A0R) {
            if (!0qQ.A0K(next, "")) {
                arrayList.add(next);
            }
        }
        ImmutableSet A032 = ImmutableSet.A03(arrayList);
        0qQ.A07(A032);
        this.A01 = A032;
        182.A06(r3, this.A02, 36311100924363185L);
        this.A03 = Boolean.valueOf(182.A06(r3, this.A02, 36311100924494259L)).booleanValue();
        this.A00 = new C312826fE(r6);
    }
}
