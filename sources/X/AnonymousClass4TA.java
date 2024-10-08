package X;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.4TA  reason: invalid class name */
public final class AnonymousClass4TA extends Timeline {
    public final int A00;
    public final int A01;
    public final int A02;
    public final AnonymousClass5N7 A03;
    public final HashMap A04 = new HashMap();
    public final int[] A05;
    public final int[] A06;
    public final Timeline[] A07;
    public final Object[] A08;

    public AnonymousClass4TA(AnonymousClass5N7 r9, Collection collection) {
        int i = 0;
        this.A03 = r9;
        this.A00 = ((AnonymousClass5N6) r9).A02.length;
        int size = collection.size();
        this.A05 = new int[size];
        this.A06 = new int[size];
        this.A07 = new Timeline[size];
        this.A08 = new Object[size];
        Iterator it = collection.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            AnonymousClass5NR r2 = (AnonymousClass5NR) it.next();
            Timeline[] timelineArr = this.A07;
            timelineArr[i3] = r2.C7T();
            this.A06[i3] = i;
            this.A05[i3] = i2;
            Timeline timeline = timelineArr[i3];
            i += timeline.A02();
            i2 += timeline.A01();
            Object[] objArr = this.A08;
            objArr[i3] = r2.CBB();
            this.A04.put(objArr[i3], Integer.valueOf(i3));
            i3++;
        }
        this.A02 = i;
        this.A01 = i2;
    }

    public static int A00(AnonymousClass4TA r1, int i, boolean z) {
        if (z) {
            AnonymousClass5N6 r12 = (AnonymousClass5N6) r1.A03;
            int i2 = r12.A01[i] + 1;
            int[] iArr = r12.A02;
            if (i2 < iArr.length) {
                return iArr[i2];
            }
            return -1;
        } else if (i < r1.A00 - 1) {
            return i + 1;
        } else {
            return -1;
        }
    }

    public final C264744Rc A0D(C264744Rc r6, int i, boolean z) {
        int[] iArr = this.A05;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] != i2);
        }
        int i3 = this.A06[binarySearch];
        this.A07[binarySearch].A0D(r6, i - iArr[binarySearch], z);
        r6.A00 += i3;
        if (z) {
            Object obj = this.A08[binarySearch];
            Object obj2 = r6.A05;
            obj2.getClass();
            r6.A05 = Pair.create(obj, obj2);
        }
        return r6;
    }

    public final AnonymousClass4RE A0E(AnonymousClass4RE r5, int i, long j) {
        int[] iArr = this.A06;
        int i2 = i + 1;
        int binarySearch = Arrays.binarySearch(iArr, i2);
        if (binarySearch < 0) {
            binarySearch = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (iArr[binarySearch] != i2);
        }
        int i3 = iArr[binarySearch];
        int i4 = this.A05[binarySearch];
        this.A07[binarySearch].A0E(r5, i - i3, j);
        Object obj = this.A08[binarySearch];
        if (!AnonymousClass4RE.A0H.equals(r5.A0C)) {
            obj = Pair.create(obj, r5.A0C);
        }
        r5.A0C = obj;
        r5.A00 += i4;
        r5.A01 += i4;
        return r5;
    }
}
