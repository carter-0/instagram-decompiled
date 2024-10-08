package X;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* renamed from: X.GdO  reason: case insensitive filesystem */
public final class C52832GdO extends ActionMode.Callback2 {
    public final AnonymousClass5VO A00;

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C62320sa r0;
        AnonymousClass5VO r2 = this.A00;
        0qQ.A0A(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            r0 = r2.A01;
        } else if (itemId == 1) {
            r0 = r2.A03;
        } else if (itemId == 2) {
            r0 = r2.A02;
        } else if (itemId != 3) {
            return false;
        } else {
            r0 = r2.A04;
        }
        if (r0 != null) {
            r0.invoke();
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass5VO r1 = this.A00;
        if (menu == null) {
            throw AnonymousClass7TE.A0w("onCreateActionMode requires a non-null menu");
        } else if (actionMode != null) {
            if (r1.A01 != null) {
                AnonymousClass5VO.A00(menu, AnonymousClass05K.A00);
            }
            if (r1.A03 != null) {
                AnonymousClass5VO.A00(menu, AnonymousClass05K.A01);
            }
            if (r1.A02 != null) {
                AnonymousClass5VO.A00(menu, AnonymousClass05K.A0C);
            }
            if (r1.A04 == null) {
                return true;
            }
            AnonymousClass5VO.A00(menu, AnonymousClass05K.A0N);
            return true;
        } else {
            throw AnonymousClass7TE.A0w("onCreateActionMode requires a non-null mode");
        }
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        C62320sa r0 = this.A00.A05;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        AnonymousClass5VN r4 = this.A00.A00;
        if (rect != null) {
            rect.set((int) r4.A01, (int) r4.A03, (int) r4.A02, (int) r4.A00);
        }
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        AnonymousClass5VO r2 = this.A00;
        if (actionMode == null || menu == null) {
            return false;
        }
        Integer num = AnonymousClass05K.A00;
        if (r2.A01 != null) {
            if (menu.findItem(0) == null) {
                AnonymousClass5VO.A00(menu, num);
            }
        } else if (menu.findItem(0) != null) {
            menu.removeItem(0);
        }
        Integer num2 = AnonymousClass05K.A01;
        if (r2.A03 != null) {
            if (menu.findItem(1) == null) {
                AnonymousClass5VO.A00(menu, num2);
            }
        } else if (menu.findItem(1) != null) {
            menu.removeItem(1);
        }
        Integer num3 = AnonymousClass05K.A0C;
        if (r2.A02 != null) {
            if (menu.findItem(2) == null) {
                AnonymousClass5VO.A00(menu, num3);
            }
        } else if (menu.findItem(2) != null) {
            menu.removeItem(2);
        }
        Integer num4 = AnonymousClass05K.A0N;
        if (r2.A04 != null) {
            if (menu.findItem(3) != null) {
                return true;
            }
            AnonymousClass5VO.A00(menu, num4);
            return true;
        } else if (menu.findItem(3) == null) {
            return true;
        } else {
            menu.removeItem(3);
            return true;
        }
    }

    public C52832GdO(AnonymousClass5VO r1) {
        this.A00 = r1;
    }
}
