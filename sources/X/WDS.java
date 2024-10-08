package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

public final class WDS implements X9H {
    public C18932WDk A00;
    public C18934WDm A01;
    public final /* synthetic */ Toolbar A02;

    public final boolean AVm() {
        return false;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
    }

    public final boolean Dnx(C14733U5v u5v) {
        return false;
    }

    public final void EQJ(C20936X5e x5e) {
        throw AnonymousClass00P.createAndThrow();
    }

    public WDS(Toolbar toolbar) {
        this.A02 = toolbar;
    }

    public final boolean AIC(C18932WDk wDk, C18934WDm wDm) {
        Toolbar toolbar = this.A02;
        View view = toolbar.A08;
        if (view instanceof C20935X5d) {
            ((C20935X5d) view).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.A08);
        toolbar.removeView(toolbar.A09);
        toolbar.A08 = null;
        ArrayList arrayList = toolbar.A0g;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                toolbar.addView((View) arrayList.get(size));
            } else {
                arrayList.clear();
                this.A01 = null;
                toolbar.requestLayout();
                wDm.A0F = false;
                wDm.A0A.A0D(false);
                toolbar.A0F();
                return true;
            }
        }
    }

    public final boolean ATe(C18932WDk wDk, C18934WDm wDm) {
        Toolbar toolbar = this.A02;
        toolbar.A0D();
        ViewParent parent = toolbar.A09.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A09);
            }
            toolbar.addView(toolbar.A09);
        }
        View actionView = wDm.getActionView();
        toolbar.A08 = actionView;
        this.A01 = wDm;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.A08);
            }
            U5l u5l = new U5l();
            u5l.A00 = 8388611 | (toolbar.A00 & 112);
            u5l.A00 = 2;
            toolbar.A08.setLayoutParams(u5l);
            toolbar.addView(toolbar.A08);
        }
        int childCount = toolbar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            View childAt = toolbar.getChildAt(childCount);
            if (!(((U5l) childAt.getLayoutParams()).A00 == 2 || childAt == toolbar.A0E)) {
                toolbar.removeViewAt(childCount);
                toolbar.A0g.add(childAt);
            }
        }
        toolbar.requestLayout();
        wDm.A0F = true;
        C18934WDm.A00(wDm);
        View view = toolbar.A08;
        if (view instanceof C20935X5d) {
            ((C20935X5d) view).onActionViewExpanded();
        }
        toolbar.A0F();
        return true;
    }

    public final void CMm(Context context, C18932WDk wDk) {
        C18934WDm wDm;
        C18932WDk wDk2 = this.A00;
        if (!(wDk2 == null || (wDm = this.A01) == null)) {
            wDk2.A0J(wDm);
        }
        this.A00 = wDk;
    }

    public final void FKm(boolean z) {
        C18934WDm wDm = this.A01;
        if (wDm != null) {
            C18932WDk wDk = this.A00;
            if (wDk != null) {
                int size = wDk.size();
                int i = 0;
                while (i < size) {
                    if (wDk.getItem(i) != wDm) {
                        i++;
                    } else {
                        return;
                    }
                }
            }
            AIC(wDk, wDm);
        }
    }
}
