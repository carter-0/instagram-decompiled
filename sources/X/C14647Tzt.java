package X;

import java.util.ArrayList;

/* renamed from: X.Tzt  reason: case insensitive filesystem */
public final class C14647Tzt implements Runnable {
    public final /* synthetic */ C14646Tzs A00;

    public C14647Tzt(C14646Tzs tzs) {
        this.A00 = tzs;
    }

    public final void run() {
        long j;
        C14646Tzs tzs = this.A00;
        try {
            j = ((Long) tzs.A07.invoke(tzs.A04, new Object[0])).longValue();
        } catch (Exception e) {
            C14646Tzs.A00(tzs, e);
            j = 0;
        }
        if (tzs.A00 == -1) {
            tzs.A00 = j;
            tzs.A01 = j;
        } else {
            tzs.A01 = j;
            int i = (int) (j - tzs.A01);
            AnonymousClass1JH r1 = tzs.A05.A01;
            AnonymousClass1JH.A00(r1);
            if (r1.A04) {
                AnonymousClass1JM r12 = r1.A02;
                r12.getClass();
                r12.A02.A00(i);
                r12.A01.A00(i);
                r12.A00.A00(i);
                AnonymousClass1JO r5 = r12.A03;
                long now = r12.A04.now();
                if (i >= 200) {
                    ArrayList arrayList = r5.A01;
                    if (arrayList.size() < 50) {
                        arrayList.add(Long.valueOf(now));
                        r5.A00.add(Integer.valueOf(i));
                    }
                }
            }
        }
        tzs.A03(tzs.A06);
    }
}
