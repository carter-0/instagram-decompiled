package X;

import android.text.method.KeyListener;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: X.W7y  reason: case insensitive filesystem */
public final class C18853W7y implements ActionMode.Callback {
    public final /* synthetic */ U66 A00;

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return false;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public C18853W7y(U66 u66) {
        this.A00 = u66;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        U66 u66 = this.A00;
        KeyListener keyListener = U66.A0V;
        if (u66.A0E) {
            return false;
        }
        menu.removeItem(16908337);
        return true;
    }
}
