package X;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7J9  reason: invalid class name */
public final class AnonymousClass7J9 implements ActionMode.Callback {
    public Map A00 = 0Yt.A0E();
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        0qQ.A0B(actionMode, 0);
        0qQ.A0B(menuItem, 1);
        OCC occ = (OCC) this.A00.get(menuItem);
        if (occ != null) {
            return ((Boolean) occ.A01.invoke(actionMode)).booleanValue();
        }
        return false;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        0qQ.A0B(actionMode, 0);
        0qQ.A0B(menu, 1);
        List list = this.A02;
        ArrayList<C327817Ch> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (!this.A01.contains(next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C327817Ch D6U : arrayList) {
            018.A16(D6U.D6U(actionMode), arrayList2);
        }
        int A0L = 0se.A0L(0Yv.A1E(arrayList2, 10));
        if (A0L < 16) {
            A0L = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(A0L);
        for (Object next2 : arrayList2) {
            MenuItem add = menu.add(((OCC) next2).A00);
            0qQ.A07(add);
            linkedHashMap.put(add, next2);
        }
        this.A00 = linkedHashMap;
        return true;
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return false;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.A00 = 0Yt.A0E();
    }
}
