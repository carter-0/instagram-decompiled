package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewDebug;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* renamed from: X.WDm  reason: case insensitive filesystem */
public final class C18934WDm implements 02O {
    public char A00;
    public char A01;
    public int A02 = 16;
    public int A03 = 4096;
    public int A04 = 4096;
    public int A05;
    public Intent A06;
    public ColorStateList A07 = null;
    public PorterDuff.Mode A08 = null;
    public MenuItem.OnMenuItemClickListener A09;
    public C18932WDk A0A;
    public C14733U5v A0B;
    public AnonymousClass02c A0C;
    public boolean A0D = false;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public int A0H = 0;
    public Drawable A0I;
    public MenuItem.OnActionExpandListener A0J;
    public View A0K;
    public CharSequence A0L;
    public CharSequence A0M;
    public CharSequence A0N;
    public CharSequence A0O;
    public final int A0P;
    public final int A0Q;
    public final int A0R;
    public final int A0S;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setIcon(Drawable drawable) {
        this.A0H = 0;
        this.A0I = drawable;
        this.A0G = true;
        this.A0A.A0D(false);
        return this;
    }

    public static void A00(C18934WDm wDm) {
        wDm.A0A.A0D(false);
    }

    public final void A01(View view) {
        int i;
        this.A0K = view;
        this.A0C = null;
        if (view != null && view.getId() == -1 && (i = this.A0S) > 0) {
            view.setId(i);
        }
        C18932WDk wDk = this.A0A;
        wDk.A0A = true;
        wDk.A0D(true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WDm, android.view.MenuItem] */
    public final boolean A02() {
        AnonymousClass02c r0;
        if ((this.A05 & 8) == 0) {
            return false;
        }
        View view = this.A0K;
        if (view == null && (r0 = this.A0C) != null) {
            view = ((U7Q) r0).A01.onCreateActionView(this);
            this.A0K = view;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    public final AnonymousClass02c C35() {
        return this.A0C;
    }

    public final 02O ESj(CharSequence charSequence) {
        this.A0L = charSequence;
        A00(this);
        return this;
    }

    public final 02O Ena(AnonymousClass02c r3) {
        AnonymousClass02c r1 = this.A0C;
        if (r1 != null) {
            r1.A00 = null;
        }
        this.A0K = null;
        this.A0C = r3;
        this.A0A.A0D(true);
        AnonymousClass02c r12 = this.A0C;
        if (r12 != null) {
            U7Q u7q = (U7Q) r12;
            u7q.A00 = new C18937WDq(this);
            u7q.A01.setVisibilityListener(u7q);
        }
        return this;
    }

    public final 02O Eos(CharSequence charSequence) {
        this.A0O = charSequence;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDm, android.view.MenuItem] */
    public final boolean collapseActionView() {
        if ((this.A05 & 8) == 0) {
            return false;
        }
        if (this.A0K == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0J;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.A0A.A0J(this);
        }
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final View getActionView() {
        View view = this.A0K;
        if (view != null) {
            return view;
        }
        AnonymousClass02c r0 = this.A0C;
        if (r0 == null) {
            return null;
        }
        View onCreateActionView = ((U7Q) r0).A01.onCreateActionView(this);
        this.A0K = onCreateActionView;
        return onCreateActionView;
    }

    public final int getAlphabeticModifiers() {
        return this.A03;
    }

    public final char getAlphabeticShortcut() {
        return this.A00;
    }

    public final CharSequence getContentDescription() {
        return this.A0L;
    }

    public final int getGroupId() {
        return this.A0R;
    }

    public final Drawable getIcon() {
        Drawable drawable = this.A0I;
        if (drawable == null) {
            int i = this.A0H;
            if (i == 0) {
                return null;
            }
            drawable = C323656xt.A00(this.A0A.A0M, i);
            this.A0H = 0;
            this.A0I = drawable;
        }
        if (drawable != null && this.A0G && (this.A0D || this.A0E)) {
            drawable = drawable.mutate();
            if (this.A0D) {
                drawable.setTintList(this.A07);
            }
            if (this.A0E) {
                drawable.setTintMode(this.A08);
            }
            this.A0G = false;
        }
        return drawable;
    }

    public final ColorStateList getIconTintList() {
        return this.A07;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.A08;
    }

    public final Intent getIntent() {
        return this.A06;
    }

    @ViewDebug.CapturedViewProperty
    public final int getItemId() {
        return this.A0S;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.A04;
    }

    public final char getNumericShortcut() {
        return this.A01;
    }

    public final int getOrder() {
        return this.A0Q;
    }

    public final SubMenu getSubMenu() {
        return this.A0B;
    }

    @ViewDebug.CapturedViewProperty
    public final CharSequence getTitle() {
        return this.A0M;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0N;
        if (charSequence == null) {
            return this.A0M;
        }
        return charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.A0O;
    }

    public final boolean hasSubMenu() {
        return AnonymousClass7TF.A1V(this.A0B);
    }

    public final boolean isActionViewExpanded() {
        return this.A0F;
    }

    public final boolean isCheckable() {
        if ((this.A02 & 1) != 1) {
            return false;
        }
        return true;
    }

    public final boolean isChecked() {
        return AnonymousClass7TF.A1S(this.A02 & 2, 2);
    }

    public final boolean isEnabled() {
        return AnonymousClass7TF.A1P(this.A02 & 16);
    }

    public final boolean isVisible() {
        AnonymousClass02c r0 = this.A0C;
        if (r0 == null || !((U7Q) r0).A01.overridesItemVisibility()) {
            if ((this.A02 & 8) == 0) {
                return true;
            }
            return false;
        } else if ((this.A02 & 8) != 0 || !((U7Q) this.A0C).A01.isVisible()) {
            return false;
        } else {
            return true;
        }
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WDm, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        Context context = this.A0A.A0M;
        A01(DbT.A0C(LayoutInflater.from(context), new LinearLayout(context), i));
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setAlphabeticShortcut(char c) {
        if (this.A00 != c) {
            this.A00 = Character.toLowerCase(c);
            A00(this);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setCheckable(boolean z) {
        int i = this.A02;
        boolean z2 = z | (i & true);
        this.A02 = z2 ? 1 : 0;
        if (i != z2) {
            A00(this);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.WDm, java.lang.Object, android.view.MenuItem] */
    public final MenuItem setChecked(boolean z) {
        int i = this.A02;
        if ((i & 4) != 0) {
            C18932WDk wDk = this.A0A;
            int groupId = getGroupId();
            ArrayList arrayList = wDk.A07;
            int size = arrayList.size();
            wDk.A06();
            for (int i2 = 0; i2 < size; i2++) {
                C18934WDm wDm = (C18934WDm) arrayList.get(i2);
                if (wDm.getGroupId() == groupId && (wDm.A02 & 4) != 0 && wDm.isCheckable()) {
                    boolean A1W = AnonymousClass7TF.A1W(wDm, this);
                    int i3 = wDm.A02;
                    int i4 = i3 & -3;
                    int i5 = 0;
                    if (A1W) {
                        i5 = 2;
                    }
                    int i6 = i5 | i4;
                    wDm.A02 = i6;
                    if (i3 != i6) {
                        wDm.A0A.A0D(false);
                    }
                }
            }
            wDk.A05();
        } else {
            int i7 = i & -3;
            int i8 = 0;
            if (z) {
                i8 = 2;
            }
            int i9 = i8 | i7;
            this.A02 = i9;
            if (i != i9) {
                this.A0A.A0D(false);
                return this;
            }
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setEnabled(boolean z) {
        int i = this.A02;
        int i2 = i & -17;
        if (z) {
            i2 = i | 16;
        }
        this.A02 = i2;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A07 = colorStateList;
        this.A0D = true;
        this.A0G = true;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A08 = mode;
        this.A0E = true;
        this.A0G = true;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setIntent(Intent intent) {
        this.A06 = intent;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setNumericShortcut(char c) {
        if (this.A01 != c) {
            this.A01 = c;
            A00(this);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A0J = onActionExpandListener;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A09 = onMenuItemClickListener;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        this.A00 = Character.toLowerCase(c2);
        this.A03 = KeyEvent.normalizeMetaState(i2);
        A00(this);
        return this;
    }

    public final void setShowAsAction(int i) {
        int i2 = i & 3;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            this.A05 = i;
            C18932WDk wDk = this.A0A;
            wDk.A0A = true;
            wDk.A0D(true);
            return;
        }
        throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A0M = charSequence;
        A00(this);
        C14733U5v u5v = this.A0B;
        if (u5v != null) {
            u5v.setHeaderTitle(charSequence);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0N = charSequence;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setVisible(boolean z) {
        int i = this.A02;
        int A012 = DbW.A01(z ? 1 : 0) | (i & -9);
        this.A02 = A012;
        if (i != A012) {
            C18932WDk wDk = this.A0A;
            wDk.A0B = true;
            wDk.A0D(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.A0M;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public C18934WDm(C18932WDk wDk, CharSequence charSequence, int i, int i2, int i3, int i4, int i5) {
        this.A0A = wDk;
        this.A0S = i2;
        this.A0R = i;
        this.A0Q = i3;
        this.A0P = i4;
        this.A0M = charSequence;
        this.A05 = i5;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDm, android.view.MenuItem] */
    public final boolean expandActionView() {
        if (!A02()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A0J;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.A0A.A0K(this);
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        ESj(charSequence);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        Eos(charSequence);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDm, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        A01(view);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        if (this.A00 == c && this.A03 == i) {
            return this;
        }
        this.A00 = Character.toLowerCase(c);
        this.A03 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setIcon(int i) {
        this.A0I = null;
        this.A0H = i;
        this.A0G = true;
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setNumericShortcut(char c, int i) {
        if (this.A01 == c && this.A04 == i) {
            return this;
        }
        this.A01 = c;
        this.A04 = KeyEvent.normalizeMetaState(i);
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setShortcut(char c, char c2) {
        this.A01 = c;
        this.A00 = Character.toLowerCase(c2);
        A00(this);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final MenuItem setTitle(int i) {
        setTitle((CharSequence) this.A0A.A0M.getString(i));
        return this;
    }
}
