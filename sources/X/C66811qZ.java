package X;

import android.database.Observable;

/* renamed from: X.1qZ  reason: invalid class name and case insensitive filesystem */
public final class C66811qZ extends Observable {
    public final void A00() {
        synchronized (this.mObservers) {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((C66831qb) this.mObservers.get(i)).Cxe();
            }
        }
    }

    public final void A01() {
        synchronized (this.mObservers) {
            int size = this.mObservers.size();
            for (int i = 0; i < size; i++) {
                ((C66831qb) this.mObservers.get(i)).DGe();
            }
        }
    }
}
