package X;

import java.util.Collections;

/* renamed from: X.Uge  reason: case insensitive filesystem */
public final class C15673Uge extends Q42 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ U9X A02;

    public C15673Uge(U9X u9x, int i, int i2) {
        this.A02 = u9x;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ void A00(Object obj) {
        C276544tV r5 = (C276544tV) obj;
        int i = this.A00;
        int i2 = this.A01;
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                Collections.swap(r5.A0L(), i, i3);
                i = i3;
            }
            return;
        }
        while (i > i2) {
            int i4 = i - 1;
            Collections.swap(r5.A0L(), i, i4);
            i = i4;
        }
    }
}
