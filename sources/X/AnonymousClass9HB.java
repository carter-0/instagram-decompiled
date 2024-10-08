package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.9HB  reason: invalid class name */
public final class AnonymousClass9HB {
    public final HashSet A00 = new HashSet();
    public final HashSet A01 = new HashSet();

    public final void A01() {
        HashSet hashSet = this.A00;
        Iterator it = hashSet.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            ((ViewGroup) next).setClipChildren(true);
        }
        hashSet.clear();
        HashSet hashSet2 = this.A01;
        Iterator it2 = hashSet2.iterator();
        0qQ.A07(it2);
        while (it2.hasNext()) {
            Object next2 = it2.next();
            0qQ.A07(next2);
            ((ViewGroup) next2).setClipToPadding(true);
        }
        hashSet2.clear();
    }

    public final void A02(ViewGroup viewGroup) {
        if (viewGroup != null) {
            A00(viewGroup);
        }
    }

    private final void A00(ViewGroup viewGroup) {
        if (viewGroup.getClipChildren()) {
            viewGroup.setClipChildren(false);
            this.A00.add(viewGroup);
        }
        if (viewGroup.getClipToPadding()) {
            viewGroup.setClipToPadding(false);
            this.A01.add(viewGroup);
        }
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            A00((ViewGroup) parent);
        }
    }
}
