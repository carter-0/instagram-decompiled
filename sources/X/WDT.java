package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;

public final class WDT implements X9H, AdapterView.OnItemClickListener {
    public int A00;
    public Context A01;
    public LayoutInflater A02;
    public ExpandedMenuView A03;
    public U4B A04;
    public C18932WDk A05;
    public C20936X5e A06;

    public final boolean AIC(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final boolean ATe(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final boolean AVm() {
        return false;
    }

    public final void CMm(Context context, C18932WDk wDk) {
        if (this.A01 != null) {
            this.A01 = context;
            if (this.A02 == null) {
                this.A02 = LayoutInflater.from(context);
            }
        }
        this.A05 = wDk;
        U4B u4b = this.A04;
        if (u4b != null) {
            0fE.A00(u4b, -31315371);
        }
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        C20936X5e x5e = this.A06;
        if (x5e != null) {
            x5e.D4F(wDk, z);
        }
    }

    public final void EQJ(C20936X5e x5e) {
        this.A06 = x5e;
    }

    public final void FKm(boolean z) {
        U4B u4b = this.A04;
        if (u4b != null) {
            0fE.A00(u4b, 397662761);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WDm, android.view.MenuItem] */
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.A05.A0I(this.A04.getItem(i), this, 0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.W5c, android.content.DialogInterface$OnClickListener, android.content.DialogInterface$OnKeyListener, java.lang.Object, X.X5e, android.content.DialogInterface$OnDismissListener] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.WDT, X.X9H] */
    public final boolean Dnx(C14733U5v u5v) {
        if (!u5v.hasVisibleItems()) {
            return false;
        }
        ? obj = new Object();
        obj.A02 = u5v;
        Context context = u5v.A0M;
        C18080Vl9 vl9 = new C18080Vl9(context);
        C17742VdB vdB = vl9.A01;
        Context context2 = vdB.A0L;
        ? obj2 = new Object();
        obj2.A00 = R.layout.abc_list_menu_item_layout;
        obj2.A01 = context2;
        obj2.A02 = LayoutInflater.from(context2);
        obj.A01 = obj2;
        obj2.A06 = obj;
        u5v.A07(context, obj2);
        WDT wdt = obj.A01;
        U4B u4b = wdt.A04;
        if (u4b == null) {
            u4b = new U4B(wdt);
            wdt.A04 = u4b;
        }
        vdB.A0B = u4b;
        vdB.A03 = obj;
        View view = u5v.A02;
        if (view != null) {
            vdB.A09 = view;
        } else {
            vdB.A08 = u5v.A01;
            vl9.A08(u5v.A05);
        }
        vdB.A06 = obj;
        C14729U5o A002 = vl9.A00();
        obj.A00 = A002;
        A002.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.A00.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        AnonymousClass0fN.A00(obj.A00);
        C20936X5e x5e = this.A06;
        if (x5e == null) {
            return true;
        }
        x5e.DVR(u5v);
        return true;
    }
}
