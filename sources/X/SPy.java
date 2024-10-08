package X;

import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public abstract class SPy {
    public static void A03(C13725Tfv tfv, C266714aE r11, C10862RzN rzN, Map map) {
        MediaComposition mediaComposition = rzN.A08;
        mediaComposition.getClass();
        HashMap A07 = mediaComposition.A07(r11);
        if (A07 != null) {
            Iterator A0s = AnonymousClass7TF.A0s(A07);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                int A0M = AnonymousClass7TE.A0M(A1J.getKey());
                C266794aM r0 = (C266794aM) A1J.getValue();
                long A01 = Q1Z.A01(tfv, r0);
                SparseArray sparseArray = (SparseArray) map.get(r11);
                if (sparseArray == null) {
                    sparseArray = Pxe.A0L();
                    map.put(r11, sparseArray);
                }
                long j = r0.A00;
                sparseArray.put(A0M, Pxe.A0V(TimeUnit.MICROSECONDS, j, j + A01));
            }
        } else if (r11 == C266714aE.VIDEO && !rzN.A0B.A04()) {
            throw new Exception();
        }
    }

    public static C7962QeA A00(C13594TdM tdM, C13595TdN tdN, C7334Q4k q4k, Map map) {
        HashMap A1E = AnonymousClass7TE.A1E();
        SparseArray sparseArray = (SparseArray) map.get(C266714aE.VIDEO);
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                A1E.put(Integer.toString(sparseArray.keyAt(i)), sparseArray.valueAt(i));
            }
        }
        return new C7962QeA(q4k, tdM, tdN, A1E, 1);
    }

    public static C7963QeB A01(MediaComposition mediaComposition, C13592TdK tdK, C13593TdL tdL, C7334Q4k q4k) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0s = AnonymousClass7TF.A0s(mediaComposition.A06(C266714aE.VIDEO));
        int i = 0;
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            Integer num = (Integer) A1J.getKey();
            Iterator A1H = C51966G9m.A1H(A1J.getValue());
            while (A1H.hasNext()) {
                A1E.put(Integer.toString(i), new C10572RuR((SIO) A1H.next(), num));
                i++;
            }
        }
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Iterator A0s2 = AnonymousClass7TF.A0s(A1E);
        while (A0s2.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s2);
            C266724aF r6 = ((C10572RuR) A1J2.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0, r6.A03(timeUnit));
            long A02 = r6.A02(timeUnit);
            if (A02 < 0) {
                A02 = Long.MAX_VALUE;
            }
            A1E2.put(A1J2.getKey(), Pxe.A0V(timeUnit, max, A02));
        }
        return new C7963QeB(tdK, tdL, q4k, A1E2, A1E);
    }

    public static ArrayList A02(C266714aE r7, C7334Q4k q4k, Map map, long j) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        SparseArray sparseArray = (SparseArray) map.get(r7);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                valueAt.getClass();
                if (C7334Q4k.A00((C266724aF) valueAt, q4k, TimeUnit.MICROSECONDS, j)) {
                    AnonymousClass7TF.A1M(A1C, keyAt);
                }
            }
        }
        return A1C;
    }
}
