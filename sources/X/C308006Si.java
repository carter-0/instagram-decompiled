package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.Pair;
import com.facebook.rendercore.RenderTreeNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6Si  reason: invalid class name and case insensitive filesystem */
public final class C308006Si {
    public static final C307996Sh A00(C244943c0 r19, AnonymousClass2Ta r20, AnonymousClass2TS r21, Object obj, long j) {
        ArrayList arrayList;
        int length;
        AnonymousClass2Ta r8 = r20;
        0qQ.A0B(r8, 2);
        C244943c0 r3 = r19;
        Context context = r3.A04;
        C245603dB[] r6 = r3.A07;
        2Th r0 = C308226Tf.A00;
        1KZ.A01("Reducer.reduceTree");
        int i = 0;
        if (r6 == null || (length = r6.length) == 0) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(length);
            do {
                arrayList.add(new Pair(r6[i], (Object) null));
                i++;
            } while (i < length);
        }
        ArrayList arrayList2 = new ArrayList();
        Rect rect = new Rect(0, 0, r8.getWidth(), r8.getHeight());
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        RenderTreeNode A00 = C308226Tf.A00(rect, r8, (RenderTreeNode) null, C308226Tf.A00);
        arrayList2.add(A00);
        C308226Tf.A01(context, r8, A00, arrayList2, arrayList, 0, 0);
        1KZ.A00();
        return new C307996Sh(r21, new C245663dH((01c) null, A00, arrayList, (RenderTreeNode[]) arrayList2.toArray(new RenderTreeNode[0]), -1, j), obj, ((C244933bz) r3.A06.getValue()).A00);
    }

    public final C307996Sh A03(C244943c0 r9, AnonymousClass2TS r10, Object obj, long j) {
        0qQ.A0B(r9, 0);
        0qQ.A0B(r10, 1);
        1KZ.A01("RC Layout");
        AnonymousClass2Ta AEz = r10.AEz(r9, j);
        1KZ.A00();
        1KZ.A01("RC Reduce");
        C307996Sh A00 = A00(r9, AEz, r10, obj, j);
        1KZ.A00();
        r9.A01 = null;
        return A00;
    }

    public final C244943c0 A01(Context context, C307996Sh r8, Object obj, C245603dB[] r10, int i) {
        Map map;
        if (r8 != null) {
            map = r8.A03;
        } else {
            map = null;
        }
        return new C244943c0(context, new C244933bz(map), obj, r10, i);
    }

    public final C307996Sh A02(Context context, C307996Sh r21, AnonymousClass6SH r22, Object obj, C245603dB[] r24, int i, long j) {
        C307996Sh A03;
        1KZ.A01("RC Create Tree");
        C307996Sh r9 = r21;
        AnonymousClass6SH r6 = r22;
        long j2 = j;
        if (r21 != null) {
            AnonymousClass2TS r5 = r6.A00;
            0qQ.A0B(r5, 0);
            C245663dH r4 = r9.A01;
            if (r5 == r9.A00) {
                if (C245063cG.A02(j2, r4.A01, C245133cN.A00(r4.A01(), r4.A00()))) {
                    A03 = new C307996Sh(r5, r4, r6.A01, r9.A03);
                    1KZ.A00();
                    return A03;
                }
            }
        }
        A03 = A03(A01(context, r9, obj, r24, i), r6.A00, r6.A01, j2);
        1KZ.A00();
        return A03;
    }
}
