package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: X.U5t  reason: case insensitive filesystem */
public final class C14731U5t extends C17787Vfz implements Menu {
    public final AnonymousClass02N A00;

    public final MenuItem add(int i) {
        return A00(this.A00.add(i));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2;
        MenuItem[] menuItemArr3 = menuItemArr;
        if (menuItemArr != null) {
            menuItemArr2 = new MenuItem[menuItemArr3.length];
        } else {
            menuItemArr2 = null;
        }
        int addIntentOptions = this.A00.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = A00(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(int i) {
        return this.A00.addSubMenu(i);
    }

    public final void clear() {
        01r r0 = this.A00;
        if (r0 != null) {
            r0.clear();
        }
        this.A00.clear();
    }

    public final void close() {
        this.A00.close();
    }

    public final MenuItem findItem(int i) {
        return A00(this.A00.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return A00(this.A00.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.A00.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.A00.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.A00.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.A00.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                01r r1 = this.A00;
                if (i2 >= r1.size()) {
                    break;
                }
                if (((MenuItem) r1.A05(i2)).getGroupId() == i) {
                    this.A00.A04(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.A00.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (this.A00 != null) {
            int i2 = 0;
            while (true) {
                01r r1 = this.A00;
                if (i2 >= r1.size()) {
                    break;
                } else if (((MenuItem) r1.A05(i2)).getItemId() == i) {
                    this.A00.A04(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.A00.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.A00.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.A00.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.A00.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.A00.setQwertyMode(z);
    }

    public final int size() {
        return this.A00.size();
    }

    public C14731U5t(Context context, AnonymousClass02N r4) {
        super(context);
        if (r4 != null) {
            this.A00 = r4;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return A00(this.A00.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.A00.addSubMenu(i, i2, i3, i4);
    }

    public final MenuItem add(CharSequence charSequence) {
        return A00(this.A00.add(charSequence));
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.A00.addSubMenu(charSequence);
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return A00(this.A00.add(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.A00.addSubMenu(i, i2, i3, charSequence);
    }
}
