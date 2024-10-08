package X;

import android.util.SparseArray;
import android.util.SparseIntArray;

public final class WEY implements C59532JNe {
    public SparseIntArray A00 = new SparseIntArray(1);
    public SparseIntArray A01 = new SparseIntArray(1);
    public final C17549Va2 A02;
    public final /* synthetic */ WEZ A03;

    public WEY(C17549Va2 va2, WEZ wez) {
        this.A03 = wez;
        this.A02 = va2;
    }

    public final void dispose() {
        WEZ wez = this.A03;
        C17549Va2 va2 = this.A02;
        SparseArray sparseArray = wez.A01;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (sparseArray.valueAt(size) == va2) {
                sparseArray.removeAt(size);
            }
        }
    }
}
