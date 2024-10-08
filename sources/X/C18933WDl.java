package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: X.WDl  reason: case insensitive filesystem */
public final class C18933WDl implements 02O {
    public int A00;
    public int A01;
    public int A02;
    public Context A03;
    public ColorStateList A04;
    public PorterDuff.Mode A05;
    public CharSequence A06;
    public CharSequence A07;
    public CharSequence A08;
    public boolean A09;
    public boolean A0A;
    public char A0B;
    public char A0C;
    public Intent A0D;
    public Drawable A0E;
    public MenuItem.OnMenuItemClickListener A0F;
    public CharSequence A0G;

    public final AnonymousClass02c C35() {
        return null;
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final View getActionView() {
        return null;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final void setShowAsAction(int i) {
    }

    private void A00() {
        Drawable drawable = this.A0E;
        if (drawable == null) {
            return;
        }
        if (this.A09 || this.A0A) {
            this.A0E = drawable;
            Drawable mutate = drawable.mutate();
            this.A0E = mutate;
            if (this.A09) {
                mutate.setTintList(this.A04);
            }
            if (this.A0A) {
                this.A0E.setTintMode(this.A05);
            }
        }
    }

    public final 02O ESj(CharSequence charSequence) {
        this.A06 = charSequence;
        return this;
    }

    public final 02O Ena(AnonymousClass02c r2) {
        throw new UnsupportedOperationException();
    }

    public final 02O Eos(CharSequence charSequence) {
        this.A08 = charSequence;
        return this;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final int getAlphabeticModifiers() {
        return this.A01;
    }

    public final char getAlphabeticShortcut() {
        return this.A0B;
    }

    public final CharSequence getContentDescription() {
        return this.A06;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.A0E;
    }

    public final ColorStateList getIconTintList() {
        return this.A04;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.A05;
    }

    public final Intent getIntent() {
        return this.A0D;
    }

    public final int getNumericModifiers() {
        return this.A02;
    }

    public final char getNumericShortcut() {
        return this.A0C;
    }

    public final int getOrder() {
        return 0;
    }

    public final CharSequence getTitle() {
        return this.A07;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.A0G;
        if (charSequence == null) {
            return this.A07;
        }
        return charSequence;
    }

    public final CharSequence getTooltipText() {
        return this.A08;
    }

    public final boolean isCheckable() {
        if ((this.A00 & 1) == 0) {
            return false;
        }
        return true;
    }

    public final boolean isChecked() {
        return AnonymousClass7TF.A1P(this.A00 & 2);
    }

    public final boolean isEnabled() {
        return AnonymousClass7TF.A1P(this.A00 & 16);
    }

    public final boolean isVisible() {
        return AnonymousClass7TF.A1Q(this.A00 & 8);
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setCheckable(boolean z) {
        this.A00 = z | (this.A00 & true) ? 1 : 0;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setChecked(boolean z) {
        int i = this.A00 & -3;
        int i2 = 0;
        if (z) {
            i2 = 2;
        }
        this.A00 = i2 | i;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        this.A06 = charSequence;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setEnabled(boolean z) {
        int i = this.A00 & -17;
        int i2 = 0;
        if (z) {
            i2 = 16;
        }
        this.A00 = i2 | i;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setIcon(int i) {
        this.A0E = this.A03.getDrawable(i);
        A00();
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A04 = colorStateList;
        this.A09 = true;
        A00();
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.A05 = mode;
        this.A0A = true;
        A00();
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setIntent(Intent intent) {
        this.A0D = intent;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setNumericShortcut(char c) {
        this.A0C = c;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.A0F = onMenuItemClickListener;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setShortcut(char c, char c2, int i, int i2) {
        this.A0C = c;
        this.A02 = KeyEvent.normalizeMetaState(i);
        this.A0B = Character.toLowerCase(c2);
        this.A01 = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setTitle(int i) {
        this.A07 = this.A03.getResources().getString(i);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.A0G = charSequence;
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        this.A08 = charSequence;
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.A00 & 8;
        if (z) {
            i = 0;
        }
        this.A00 = i2 | i;
        return this;
    }

    public final int getItemId() {
        return 16908332;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setAlphabeticShortcut(char c) {
        this.A0B = Character.toLowerCase(c);
        return this;
    }

    public final /* bridge */ /* synthetic */ MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setAlphabeticShortcut(char c, int i) {
        this.A0B = Character.toLowerCase(c);
        this.A01 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setIcon(Drawable drawable) {
        this.A0E = drawable;
        A00();
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setNumericShortcut(char c, int i) {
        this.A0C = c;
        this.A02 = KeyEvent.normalizeMetaState(i);
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setShortcut(char c, char c2) {
        this.A0C = c;
        this.A0B = Character.toLowerCase(c2);
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.WDl, android.view.MenuItem] */
    public final MenuItem setTitle(CharSequence charSequence) {
        this.A07 = charSequence;
        return this;
    }
}
