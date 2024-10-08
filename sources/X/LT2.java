package X;

import com.instagram.igsignals.core.IgSignalsFeature;
import java.util.ArrayList;
import java.util.List;

public abstract class LT2 {
    public AnonymousClass565 A00;
    public final double A01;
    public final String A02;
    public final List A03;

    /* JADX WARNING: type inference failed for: r0v0, types: [X.L4b, X.KSS] */
    public static KSS A00(String str, int i) {
        return new C63717L4b(str, i);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.LsL, X.KSU] */
    public static KSU A01(KSX ksx, long j) {
        String str = ksx.A02;
        double d = ksx.A01;
        ArrayList A032 = A03(ksx);
        0qQ.A0B(A032, 3);
        ? lsL = new C65380LsL(str, A032, d, j);
        ksx.A05(lsL);
        ksx.A00 = lsL;
        return lsL;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.LsL, X.KSV] */
    public static KSV A02(C61929KSa kSa, long j) {
        String str = kSa.A02;
        double d = kSa.A01;
        ArrayList A032 = A03(kSa);
        0qQ.A0B(A032, 3);
        ? lsL = new C65380LsL(str, A032, d, j);
        kSa.A05(lsL);
        kSa.A00 = lsL;
        return lsL;
    }

    public final void A05(C65380LsL lsL) {
        AnonymousClass565 r0 = this.A00;
        if (r0 != null) {
            lsL.A00 = r0;
        } else {
            0qQ.A0F("exampleDelegate");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public /* synthetic */ LT2(String str, double d) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        this.A02 = str;
        this.A01 = d;
        this.A03 = A1C;
    }

    public static final ArrayList A03(LT2 lt2) {
        String str;
        int i;
        double d;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C63717L4b l4b : lt2.A03) {
            if (l4b instanceof KSS) {
                KSS kss = (KSS) l4b;
                str = kss.A01;
                i = kss.A00;
                d = kss.A00;
            } else if (l4b instanceof KSQ) {
                KSQ ksq = (KSQ) l4b;
                str = ksq.A01;
                i = ksq.A00;
                d = ksq.A00;
            } else {
                KSR ksr = (KSR) l4b;
                str = ksr.A01;
                i = ksr.A00;
                d = ksr.A00;
            }
            A1C.add(new IgSignalsFeature(i, str, d));
        }
        return A1C;
    }

    public static void A04(Object obj, Object obj2, Object obj3, Object obj4, List list) {
        list.add(obj);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
    }
}
