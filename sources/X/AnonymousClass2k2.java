package X;

import android.view.KeyEvent;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.2k2  reason: invalid class name */
public final class AnonymousClass2k2 implements AnonymousClass4DM {
    public final HashSet A00 = new HashSet();

    public final void A00(AnonymousClass4DM r4) {
        0qQ.A0B(r4, 0);
        HashSet hashSet = this.A00;
        if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((Reference) it.next()).get() == r4) {
                    return;
                }
            }
        }
        hashSet.add(new WeakReference(r4));
    }

    public final boolean onVolumeKeyPressed(AnonymousClass5FQ r7, KeyEvent keyEvent) {
        0qQ.A0B(r7, 0);
        0qQ.A0B(keyEvent, 1);
        HashSet hashSet = this.A00;
        Iterator it = hashSet.iterator();
        0qQ.A07(it);
        boolean z = false;
        HashSet hashSet2 = null;
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            Reference reference = (Reference) next;
            AnonymousClass4DM r0 = (AnonymousClass4DM) reference.get();
            if (r0 != null) {
                z = r0.onVolumeKeyPressed(r7, keyEvent);
                if (z) {
                    break;
                }
            } else {
                if (hashSet2 == null) {
                    hashSet2 = new HashSet();
                }
                hashSet2.add(reference);
            }
        }
        if (hashSet2 != null) {
            Iterator it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                hashSet.remove(it2.next());
            }
        }
        return z;
    }
}
