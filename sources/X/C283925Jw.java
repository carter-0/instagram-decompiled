package X;

import com.instagram.quickpromotion.intf.QuickPromotionSurface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Jw  reason: invalid class name and case insensitive filesystem */
public abstract class C283925Jw {
    public static final void A00(AnonymousClass4W5 r29, String str, 0sL r31) {
        Long l;
        long j;
        AnonymousClass4V7 r4;
        long j2;
        Long l2;
        String str2 = str;
        0qQ.A0B(str2, 0);
        AnonymousClass4W5 r14 = r29;
        0qQ.A0B(r14, 1);
        for (QuickPromotionSurface quickPromotionSurface : QuickPromotionSurface.values()) {
            List<C283795Ji> A00 = r14.A00(quickPromotionSurface);
            if (A00 != null) {
                ArrayList arrayList = new ArrayList(0Yv.A1E(A00, 10));
                for (C283795Ji r5 : A00) {
                    AnonymousClass5Jm r12 = r5.A02;
                    0qQ.A07(r12);
                    C283815Jk r1 = r5.A01;
                    if (r1 != null) {
                        l = r1.A00;
                    } else {
                        l = null;
                    }
                    long j3 = 0;
                    if (l != null) {
                        j = l.longValue();
                    } else {
                        j = 0;
                    }
                    if (!(r1 == null || (l2 = r1.A01) == null)) {
                        j3 = l2.longValue();
                    }
                    Long l3 = r5.A03;
                    List list = r12.A06;
                    if (list == null || (r4 = (AnonymousClass4V7) 00k.A0O(list, 0)) == null) {
                        throw new IOException("Unexpected null creatives");
                    }
                    C283945Jy r15 = C283935Jx.A03;
                    AnonymousClass4VB A002 = r15.A00().A00(str2, r12.A05);
                    if (A002 == null) {
                        A002 = new AnonymousClass4VB(str2, r12.A05, j);
                        C283955Jz r122 = r15.A00().A01;
                        synchronized (r122) {
                            C283955Jz.A00(A002, r122, AnonymousClass5K0.A00(A002));
                        }
                    }
                    AnonymousClass5Jm r152 = r5.A02;
                    0qQ.A07(r152);
                    if (l3 != null) {
                        j2 = l3.longValue();
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    AnonymousClass4V7 r18 = r4;
                    QuickPromotionSurface quickPromotionSurface2 = quickPromotionSurface;
                    arrayList.add(new AnonymousClass4VQ(AnonymousClass5K3.A00(quickPromotionSurface2, r18, r152, A002, str2, r5.A00, j3, j, j2, r5.A05, r5.A04)));
                }
                r31.invoke(quickPromotionSurface, arrayList);
            }
        }
    }
}
