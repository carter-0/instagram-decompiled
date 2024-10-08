package X;

import android.content.Context;
import android.util.LongSparseArray;
import java.util.List;

/* renamed from: X.TxU  reason: case insensitive filesystem */
public abstract class C14508TxU {
    public static final AnonymousClass6TA A00(AnonymousClass6TA r1, String str) {
        0qQ.A0B(r1, 1);
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        return AnonymousClass6TA.STRETCH;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        return AnonymousClass6TA.CENTER;
                    }
                    break;
                case 100571:
                    if (str.equals("end")) {
                        return AnonymousClass6TA.FLEX_END;
                    }
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        return AnonymousClass6TA.FLEX_START;
                    }
                    break;
            }
        }
        return r1;
    }

    public static final C14538Txy A01(C14545TyA tyA, C244943c0 r16, C276544tV r17, int i, int i2) {
        AnonymousClass6SI r5;
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2;
        C276544tV r10 = r17;
        0qQ.A0B(r10, 2);
        C276694tk A00 = C276674ti.A00();
        long j = (long) r10.A03;
        LongSparseArray longSparseArray3 = tyA.A01;
        C14538Txy txy = (C14538Txy) longSparseArray3.get(j);
        int i3 = i;
        int i4 = i2;
        C244943c0 r2 = r16;
        if (A00 == null) {
            C307996Sh r13 = null;
            if (!(txy == null && ((longSparseArray2 = tyA.A00) == null || (txy = (C14538Txy) longSparseArray2.get(j)) == null))) {
                r13 = txy.A00.A01();
            }
            Context context = r2.A04;
            AnonymousClass6SH r14 = new AnonymousClass6SH(r10, (Object) null, (List) null);
            Object obj = r2.A05;
            C245603dB[] A002 = C307806Ro.A00((C307786Rm) obj);
            int i5 = r2.A03;
            long A003 = C244873bt.A00(i3, i4);
            r5 = new AnonymousClass6SI(r13, new Ty9(context, r13, r14, obj, A002, i5, A003), A003);
        } else {
            C307996Sh r7 = null;
            if (!(txy == null && ((longSparseArray = tyA.A00) == null || (txy = (C14538Txy) longSparseArray.get(j)) == null))) {
                r7 = txy.A00.A01();
            }
            C17981VjJ vjJ = null;
            C307996Sh r8 = null;
            if (r7 != null) {
                r8 = r7;
                vjJ = (C17981VjJ) r7.A02;
            }
            long A004 = C244873bt.A00(i3, i4);
            r5 = new AnonymousClass6SI(r8, new C20394Wqc(r2.A04, r8, (C307786Rm) r2.A05, r10, A00, vjJ, r2.A03, A004), A004);
        }
        C14538Txy txy2 = new C14538Txy(r5, r10);
        longSparseArray3.put(j, txy2);
        return txy2;
    }

    public static final Integer A02(C276544tV r4) {
        Integer num = AnonymousClass05K.A00;
        String A0K = r4.A0K(96);
        C276544tV A07 = r4.A07(94);
        if (A0K == null || A07 == null) {
            return num;
        }
        if (A0K.equals("grid")) {
            if (A07.A04 == 16373) {
                return AnonymousClass05K.A01;
            }
            throw new IllegalArgumentException("CollectionLayoutUtils: requested \"grid\" layout_config_type, but provided layout_config doesn't match bk.types.GridCollectionLayoutConfig");
        } else if (!A0K.equals("staggered_grid")) {
            return num;
        } else {
            if (A07.A04 == 16483) {
                return AnonymousClass05K.A0C;
            }
            throw new IllegalArgumentException("CollectionLayoutUtils: requested \"staggered_grid\" layout_config_type, but provided layout_config doesn't match bk.types.StaggeredGridCollectionLayoutConfig");
        }
    }
}
