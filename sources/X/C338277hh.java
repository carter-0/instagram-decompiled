package X;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7hh  reason: invalid class name and case insensitive filesystem */
public final class C338277hh {
    public int A00;
    public final int A01;
    public final SparseArray A02 = new SparseArray();
    public final Map A03 = new HashMap();
    public final boolean A04;

    public C338277hh(int i) {
        this.A04 = i != 0;
        this.A01 = i;
        this.A00 = i + 1;
    }

    public final void A00(C338367hq r5) {
        int i;
        if (r5.EFI()) {
            boolean z = this.A04;
            if (!z || r5.CJi()) {
                if (!z) {
                    if (r5.CJi()) {
                        throw new IllegalStateException("You must enable custom viewTypes to provide customViewType in ViewRenderInfo.");
                    }
                } else if (this.A01 == r5.CEq()) {
                    throw new IllegalStateException("CustomViewType cannot be the same as ComponentViewType.");
                }
                C338547i8 CEh = r5.CEh();
                Map map = this.A03;
                if (map.containsKey(CEh)) {
                    i = ((Number) map.get(CEh)).intValue();
                } else {
                    if (r5.CJi()) {
                        i = r5.CEq();
                    } else {
                        i = this.A00;
                        this.A00 = i + 1;
                    }
                    this.A02.put(i, CEh);
                    map.put(CEh, Integer.valueOf(i));
                }
                if (!r5.CJi()) {
                    r5.EqZ(i);
                    return;
                }
                return;
            }
            throw new IllegalStateException("If you enable custom viewTypes, you must provide a customViewType in ViewRenderInfo.");
        }
    }
}
