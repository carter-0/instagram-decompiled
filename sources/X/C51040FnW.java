package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FnW  reason: case insensitive filesystem */
public final class C51040FnW implements AnonymousClass32I {
    public final /* synthetic */ E9K A00;

    public final void D33(SparseArray sparseArray, Integer num) {
    }

    public final void D34() {
    }

    public final void D35() {
    }

    public final void D36() {
    }

    public C51040FnW(E9K e9k) {
        this.A00 = e9k;
    }

    public final void D37(SparseArray sparseArray) {
        if (sparseArray != null) {
            int A04 = DbW.A04(sparseArray.get(2), "null cannot be cast to non-null type kotlin.Int");
            E9K e9k = this.A00;
            ArrayList arrayList = (ArrayList) DbZ.A0g(e9k.A0H, A04);
            AnonymousClass3UH r3 = (AnonymousClass3UH) DbZ.A0g(e9k.A0G, A04);
            if (DbT.A1b(arrayList)) {
                int i = e9k.A01 - 1;
                int size = arrayList.size() - 1;
                if (i > size) {
                    i = size;
                }
                List A0i = 00k.A0i(arrayList, new 2HY(0, i));
                List list = r3.A0M;
                if (list != null) {
                    list.addAll(A0i);
                }
                arrayList.removeAll(A0i);
                E9K.A02(e9k, A0i);
            }
            E9K.A00(e9k);
        }
    }
}
