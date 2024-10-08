package X;

import android.database.Observable;

/* renamed from: X.2rY  reason: invalid class name and case insensitive filesystem */
public final class C231362rY extends Observable {
    public final void A00() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C231402rc) this.mObservers.get(size)).onChanged();
            } else {
                return;
            }
        }
    }

    public final void A01() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C231402rc) this.mObservers.get(size)).onStateRestorationPolicyChanged();
            } else {
                return;
            }
        }
    }

    public final void A02(int i, int i2) {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C231402rc) this.mObservers.get(size)).onItemRangeMoved(i, i2, 1);
        }
    }

    public final void A03(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C231402rc) this.mObservers.get(size)).onItemRangeInserted(i, i2);
            } else {
                return;
            }
        }
    }

    public final void A04(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C231402rc) this.mObservers.get(size)).onItemRangeRemoved(i, i2);
            } else {
                return;
            }
        }
    }

    public final void A05(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C231402rc) this.mObservers.get(size)).onItemRangeChanged(i, i2, obj);
            } else {
                return;
            }
        }
    }

    public final boolean A06() {
        return !this.mObservers.isEmpty();
    }
}
