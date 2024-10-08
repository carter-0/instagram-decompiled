package X;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.3Tz  reason: invalid class name */
public final class AnonymousClass3Tz {
    public static ConcurrentHashMap A08 = new ConcurrentHashMap();
    public static final RectF A09 = new RectF();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public boolean A04 = false;
    public int[] A05 = new int[0];
    public final Context A06;
    public final TextView A07;

    public static int[] A00(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i++;
            } while (i < length);
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Number) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public AnonymousClass3Tz(TextView textView) {
        this.A07 = textView;
        this.A06 = textView.getContext();
    }
}
