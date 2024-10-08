package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;

public final class WDJ implements X8B {
    public final Context A00;
    public final ActionMode.Callback A01;
    public final 01r A02 = new 01r(0);
    public final ArrayList A03 = new ArrayList();

    public final U2m A00(V4T v4t) {
        ArrayList arrayList = this.A03;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            U2m u2m = (U2m) arrayList.get(i);
            if (u2m != null && u2m.A01 == v4t) {
                return u2m;
            }
        }
        U2m u2m2 = new U2m(this.A00, v4t);
        arrayList.add(u2m2);
        return u2m2;
    }

    public final boolean CtM(MenuItem menuItem, V4T v4t) {
        return this.A01.onActionItemClicked(A00(v4t), new C14732U5u(this.A00, (02O) menuItem));
    }

    public final boolean D6a(Menu menu, V4T v4t) {
        ActionMode.Callback callback = this.A01;
        U2m A002 = A00(v4t);
        01r r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new C14731U5t(this.A00, (AnonymousClass02N) menu);
            r3.put(menu, menu2);
        }
        return callback.onCreateActionMode(A002, menu2);
    }

    public final void D8S(V4T v4t) {
        this.A01.onDestroyActionMode(A00(v4t));
    }

    public final boolean DYm(Menu menu, V4T v4t) {
        ActionMode.Callback callback = this.A01;
        U2m A002 = A00(v4t);
        01r r3 = this.A02;
        Menu menu2 = (Menu) r3.get(menu);
        if (menu2 == null) {
            menu2 = new C14731U5t(this.A00, (AnonymousClass02N) menu);
            r3.put(menu, menu2);
        }
        return callback.onPrepareActionMode(A002, menu2);
    }

    public WDJ(Context context, ActionMode.Callback callback) {
        this.A00 = context;
        this.A01 = callback;
    }
}
