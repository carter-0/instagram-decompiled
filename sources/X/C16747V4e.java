package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.V4e  reason: case insensitive filesystem */
public abstract class C16747V4e {
    public final int A02() {
        C20939X5h x5h;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
        } else {
            x5h = ((U5m) this).A06;
        }
        return ((WDZ) x5h).A01;
    }

    public final Context A03() {
        if (!(this instanceof U5n)) {
            return ((WDZ) ((U5m) this).A06).A09.getContext();
        }
        U5n u5n = (U5n) this;
        Context context = u5n.A02;
        if (context == null) {
            TypedValue typedValue = new TypedValue();
            u5n.A01.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                context = new ContextThemeWrapper(u5n.A01, i);
            } else {
                context = u5n.A01;
            }
            u5n.A02 = context;
        }
        return context;
    }

    public final V4T A04(X8B x8b) {
        if (!(this instanceof U5n)) {
            return null;
        }
        U5n u5n = (U5n) this;
        U5r u5r = u5n.A04;
        if (u5r != null) {
            u5r.A00();
        }
        u5n.A0A.setHideOnContentScrollEnabled(false);
        u5n.A09.A04();
        U5r u5r2 = new U5r(u5n.A09.getContext(), u5n, x8b);
        C18932WDk wDk = u5r2.A03;
        wDk.A06();
        try {
            if (!u5r2.A00.D6a(wDk, u5r2)) {
                return null;
            }
            u5n.A04 = u5r2;
            u5r2.A01();
            u5n.A09.A05(u5r2);
            u5n.A0K(true);
            return u5r2;
        } finally {
            wDk.A05();
        }
    }

    public final void A05() {
        if (this instanceof U5n) {
            U5n u5n = (U5n) this;
            u5n.A01.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
            u5n.A08.setTabContainer((U4u) null);
            ((WDZ) u5n.A0B).A09.setCollapsible(false);
            u5n.A0A.A05 = false;
        }
    }

    public final void A06() {
        if (this instanceof U5m) {
            U5m u5m = (U5m) this;
            ((WDZ) u5m.A06).A09.removeCallbacks(u5m.A07);
        }
    }

    public final void A07() {
        C20939X5h x5h;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
        } else {
            x5h = ((U5m) this).A06;
        }
        x5h.EUP(((WDZ) x5h).A01 & -3);
    }

    public final void A08() {
        C20939X5h x5h;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
        } else {
            x5h = ((U5m) this).A06;
        }
        x5h.EUP(((WDZ) x5h).A01 & -9);
    }

    public final void A09() {
        C20939X5h x5h;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
        } else {
            x5h = ((U5m) this).A06;
        }
        x5h.EUP(((WDZ) x5h).A01 & -2);
    }

    public final void A0A(CharSequence charSequence) {
        C20939X5h x5h;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
        } else {
            x5h = ((U5m) this).A06;
        }
        x5h.setWindowTitle(charSequence);
    }

    public final void A0B(boolean z) {
        if (this instanceof U5n) {
            U5n u5n = (U5n) this;
            if (z != u5n.A0H) {
                u5n.A0H = z;
                ArrayList arrayList = u5n.A0C;
                if (0 < arrayList.size()) {
                    arrayList.get(0);
                    throw new NullPointerException("onMenuVisibilityChanged");
                }
                return;
            }
            return;
        }
        U5m u5m = (U5m) this;
        if (z != u5m.A01) {
            u5m.A01 = z;
            ArrayList arrayList2 = u5m.A00;
            if (0 < arrayList2.size()) {
                arrayList2.get(0);
                throw new NullPointerException("onMenuVisibilityChanged");
            }
        }
    }

    public final void A0C(boolean z) {
        if (this instanceof U5n) {
            U5n u5n = (U5n) this;
            if (!u5n.A0E) {
                u5n.A0D(z);
            }
        }
    }

    public final void A0D(boolean z) {
        C20939X5h x5h;
        int i;
        if (this instanceof U5n) {
            U5n u5n = (U5n) this;
            int i2 = 0;
            if (z) {
                i2 = 4;
            }
            x5h = u5n.A0B;
            int i3 = ((WDZ) x5h).A01;
            u5n.A0E = true;
            i = (i2 & 4) | (i3 & -5);
        } else {
            x5h = ((U5m) this).A06;
            i = ((WDZ) x5h).A01 & -5;
        }
        x5h.EUP(i);
    }

    public final void A0E(boolean z) {
        C18004Vjg vjg;
        if (this instanceof U5n) {
            U5n u5n = (U5n) this;
            u5n.A0I = z;
            if (!z && (vjg = u5n.A07) != null) {
                vjg.A00();
            }
        }
    }

    public final boolean A0F() {
        ActionMenuView actionMenuView;
        WDU wdu;
        if (!(this instanceof U5m) || (actionMenuView = ((WDZ) ((U5m) this).A06).A09.A0E) == null || (wdu = actionMenuView.A04) == null || !wdu.A02()) {
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        C20939X5h x5h;
        C18934WDm wDm;
        if (this instanceof U5n) {
            x5h = ((U5n) this).A0B;
            if (x5h == null) {
                return false;
            }
        } else {
            x5h = ((U5m) this).A06;
        }
        WDS wds = ((WDZ) x5h).A09.A0G;
        if (wds == null || (wDm = wds.A01) == null) {
            return false;
        }
        wDm.collapseActionView();
        return true;
    }

    public final boolean A0H() {
        if (!(this instanceof U5m)) {
            return false;
        }
        U5m u5m = (U5m) this;
        Toolbar toolbar = ((WDZ) u5m.A06).A09;
        Runnable runnable = u5m.A07;
        toolbar.removeCallbacks(runnable);
        toolbar.postOnAnimation(runnable);
        return true;
    }

    public final boolean A0I() {
        ActionMenuView actionMenuView;
        WDU wdu;
        if (!(this instanceof U5m) || (actionMenuView = ((WDZ) ((U5m) this).A06).A09.A0E) == null || (wdu = actionMenuView.A04) == null || !wdu.A04()) {
            return false;
        }
        return true;
    }

    public final boolean A0J(int i, KeyEvent keyEvent) {
        C18932WDk wDk;
        if (this instanceof U5n) {
            U5r u5r = ((U5n) this).A04;
            if (u5r == null || (wDk = u5r.A03) == null) {
                return false;
            }
            boolean z = true;
            if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
                z = false;
            }
            wDk.setQwertyMode(z);
            return wDk.performShortcut(i, keyEvent, 0);
        }
        Menu A00 = U5m.A00((U5m) this);
        if (A00 == null) {
            return false;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() == 1) {
            z2 = false;
        }
        A00.setQwertyMode(z2);
        return A00.performShortcut(i, keyEvent, 0);
    }
}
