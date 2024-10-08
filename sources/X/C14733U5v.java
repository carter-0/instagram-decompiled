package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.U5v  reason: case insensitive filesystem */
public final class C14733U5v extends C18932WDk implements SubMenu {
    public C18932WDk A00;
    public C18934WDm A01;

    public final SubMenu setHeaderIcon(int i) {
        if (i > 0) {
            this.A01 = this.A0M.getDrawable(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        Resources resources = this.A0N;
        if (i > 0) {
            this.A05 = resources.getText(i);
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        if (view != null) {
            this.A02 = view;
            this.A05 = null;
            this.A01 = null;
        } else {
            this.A02 = null;
        }
        A0D(false);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem getItem() {
        return this.A01;
    }

    public final SubMenu setIcon(int i) {
        this.A01.setIcon(i);
        return this;
    }

    public final boolean A0H(MenuItem menuItem, C18932WDk wDk) {
        if (super.A0H(menuItem, wDk) || this.A00.A0H(menuItem, wDk)) {
            return true;
        }
        return false;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.A05 = charSequence;
        }
        this.A02 = null;
        A0D(false);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.A01.setIcon(drawable);
        return this;
    }
}
