package X;

import android.util.SparseArray;
import java.util.List;

/* renamed from: X.3Bb  reason: invalid class name and case insensitive filesystem */
public final class C238233Bb implements AnonymousClass0lh {
    public static final C238233Bb A02 = new C238233Bb();
    public final SparseArray A00 = new SparseArray();
    public final SparseArray A01 = new SparseArray();

    public final int A00(C267004ai r4, int i) {
        SparseArray sparseArray = this.A00;
        if (sparseArray.size() <= 0) {
            return -1;
        }
        int indexOfKey = sparseArray.indexOfKey(i);
        do {
            indexOfKey--;
            if (indexOfKey < 0) {
                return -1;
            }
        } while (sparseArray.valueAt(indexOfKey) != r4);
        return (i - sparseArray.keyAt(indexOfKey)) - 1;
    }

    public final int A01(List list, int i) {
        SparseArray sparseArray = this.A01;
        if (sparseArray.size() <= 0) {
            return -1;
        }
        if (!list.contains(C267004ai.PAE_MULTI_AD) && !list.contains(C267004ai.STANDALONE_MULTI_AD)) {
            return -1;
        }
        int indexOfKey = sparseArray.indexOfKey(i);
        do {
            indexOfKey--;
            if (indexOfKey < 0) {
                return -1;
            }
        } while (!list.contains(sparseArray.valueAt(indexOfKey)));
        return (i - sparseArray.keyAt(indexOfKey)) - 1;
    }

    public final C267004ai A02(List list, int i) {
        SparseArray sparseArray = this.A01;
        if (sparseArray.size() <= 0) {
            return null;
        }
        if (!list.contains(C267004ai.PAE_MULTI_AD) && !list.contains(C267004ai.STANDALONE_MULTI_AD)) {
            return null;
        }
        int indexOfKey = sparseArray.indexOfKey(i);
        do {
            indexOfKey--;
            if (indexOfKey < 0) {
                return null;
            }
        } while (!list.contains(sparseArray.valueAt(indexOfKey)));
        return (C267004ai) sparseArray.valueAt(indexOfKey);
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
