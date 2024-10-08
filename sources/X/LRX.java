package X;

import java.util.Arrays;
import java.util.List;

public final class LRX {
    public static final LRX A04 = new LRX(0, 0sn.A00);
    public final int A00;
    public final List A01;
    public final List A02;
    public final int[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (0qQ.A0K(getClass(), JTR.A0v(obj))) {
                0qQ.A0C(obj, "null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
                LRX lrx = (LRX) obj;
                if (!Arrays.equals(this.A03, lrx.A03) || !0qQ.A0K(this.A01, lrx.A01) || this.A00 != lrx.A00 || !0qQ.A0K(this.A02, lrx.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A01, Arrays.hashCode(this.A03) * 31) + this.A00) * 31) + C51971G9r.A0E(this.A02);
    }

    public LRX(List list, List list2, int[] iArr, int i) {
        AnonymousClass7TG.A1O(iArr, list);
        this.A03 = iArr;
        this.A01 = list;
        this.A00 = i;
        this.A02 = list2;
        if (iArr.length == 0) {
            throw AnonymousClass7TE.A0w("originalPageOffsets cannot be empty when constructing TransformablePage");
        } else if (list2 != null && list2.size() != list.size()) {
            throw AnonymousClass7TE.A0w(002.A0X("If originalIndices (size = ", ") is provided, it must be same length as data (size = ", ')', list2.size(), list.size()));
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("TransformablePage(originalPageOffsets=");
        A1A.append(Arrays.toString(this.A03));
        A1A.append(AnonymousClass000.A00(399));
        A1A.append(this.A01);
        A1A.append(", hintOriginalPageOffset=");
        A1A.append(this.A00);
        A1A.append(", hintOriginalIndices=");
        return AnonymousClass7TG.A0n(this.A02, A1A);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LRX(int i, List list) {
        this(list, (List) null, new int[]{i}, i);
        0qQ.A0B(list, 2);
    }
}
