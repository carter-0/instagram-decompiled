package X;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class U2m extends ActionMode {
    public final Context A00;
    public final V4T A01;

    public final void finish() {
        this.A01.A00();
    }

    public final View getCustomView() {
        WeakReference weakReference;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            weakReference = ((C14730U5q) v4t).A04;
        } else {
            weakReference = ((U5r) v4t).A01;
        }
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final Menu getMenu() {
        C18932WDk wDk;
        Context context = this.A00;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            wDk = ((C14730U5q) v4t).A02;
        } else {
            wDk = ((U5r) v4t).A03;
        }
        return new C14731U5t(context, wDk);
    }

    public final MenuInflater getMenuInflater() {
        Context context;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            context = ((C14730U5q) v4t).A03.getContext();
        } else {
            context = ((U5r) v4t).A02;
        }
        return new C14708U2s(context);
    }

    public final CharSequence getSubtitle() {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            actionBarContextView = ((C14730U5q) v4t).A03;
        } else {
            actionBarContextView = ((U5r) v4t).A04.A09;
        }
        return actionBarContextView.A04;
    }

    public final Object getTag() {
        return this.A01.A00;
    }

    public final CharSequence getTitle() {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            actionBarContextView = ((C14730U5q) v4t).A03;
        } else {
            actionBarContextView = ((U5r) v4t).A04.A09;
        }
        return actionBarContextView.A05;
    }

    public final boolean getTitleOptionalHint() {
        return this.A01.A01;
    }

    public final void invalidate() {
        this.A01.A01();
    }

    public final boolean isTitleOptional() {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            actionBarContextView = ((C14730U5q) v4t).A03;
        } else {
            actionBarContextView = ((U5r) v4t).A04.A09;
        }
        return actionBarContextView.A07;
    }

    public final void setCustomView(View view) {
        WeakReference weakReference;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            C14730U5q u5q = (C14730U5q) v4t;
            u5q.A03.setCustomView(view);
            if (view != null) {
                weakReference = new WeakReference(view);
            } else {
                weakReference = null;
            }
            u5q.A04 = weakReference;
            return;
        }
        U5r u5r = (U5r) v4t;
        u5r.A04.A09.setCustomView(view);
        u5r.A01 = new WeakReference(view);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.U5r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.U5q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.U5r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.U5r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setSubtitle(int r4) {
        /*
            r3 = this;
            X.V4T r2 = r3.A01
            boolean r0 = r2 instanceof X.C14730U5q
            if (r0 == 0) goto L_0x0021
            X.U5q r2 = (X.C14730U5q) r2
            android.content.Context r0 = r2.A00
            java.lang.String r1 = r0.getString(r4)
        L_0x000e:
            boolean r0 = r2 instanceof X.C14730U5q
            if (r0 == 0) goto L_0x001a
            X.U5q r2 = (X.C14730U5q) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.A03
        L_0x0016:
            r0.setSubtitle(r1)
            return
        L_0x001a:
            X.U5r r2 = (X.U5r) r2
            X.U5n r0 = r2.A04
            androidx.appcompat.widget.ActionBarContextView r0 = r0.A09
            goto L_0x0016
        L_0x0021:
            X.U5r r2 = (X.U5r) r2
            X.U5n r0 = r2.A04
            android.content.Context r0 = r0.A01
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r0.getString(r4)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U2m.setSubtitle(int):void");
    }

    public final void setTag(Object obj) {
        this.A01.A00 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: X.U5r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.U5q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: X.U5r} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.U5r} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTitle(int r4) {
        /*
            r3 = this;
            X.V4T r2 = r3.A01
            boolean r0 = r2 instanceof X.C14730U5q
            if (r0 == 0) goto L_0x0021
            X.U5q r2 = (X.C14730U5q) r2
            android.content.Context r0 = r2.A00
            java.lang.String r1 = r0.getString(r4)
        L_0x000e:
            boolean r0 = r2 instanceof X.C14730U5q
            if (r0 == 0) goto L_0x001a
            X.U5q r2 = (X.C14730U5q) r2
            androidx.appcompat.widget.ActionBarContextView r0 = r2.A03
        L_0x0016:
            r0.setTitle(r1)
            return
        L_0x001a:
            X.U5r r2 = (X.U5r) r2
            X.U5n r0 = r2.A04
            androidx.appcompat.widget.ActionBarContextView r0 = r0.A09
            goto L_0x0016
        L_0x0021:
            X.U5r r2 = (X.U5r) r2
            X.U5n r0 = r2.A04
            android.content.Context r0 = r0.A01
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r0.getString(r4)
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U2m.setTitle(int):void");
    }

    public final void setTitleOptionalHint(boolean z) {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            C14730U5q u5q = (C14730U5q) v4t;
            u5q.A01 = z;
            actionBarContextView = u5q.A03;
        } else {
            U5r u5r = (U5r) v4t;
            u5r.A01 = z;
            actionBarContextView = u5r.A04.A09;
        }
        actionBarContextView.setTitleOptional(z);
    }

    public U2m(Context context, V4T v4t) {
        this.A00 = context;
        this.A01 = v4t;
    }

    public final void setSubtitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            actionBarContextView = ((C14730U5q) v4t).A03;
        } else {
            actionBarContextView = ((U5r) v4t).A04.A09;
        }
        actionBarContextView.setSubtitle(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        ActionBarContextView actionBarContextView;
        V4T v4t = this.A01;
        if (v4t instanceof C14730U5q) {
            actionBarContextView = ((C14730U5q) v4t).A03;
        } else {
            actionBarContextView = ((U5r) v4t).A04.A09;
        }
        actionBarContextView.setTitle(charSequence);
    }
}
