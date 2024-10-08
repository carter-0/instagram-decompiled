package X;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;

public final class Q9D extends BaseAdapter implements ListAdapter {
    public final ArrayList A00;
    public final Context A01;
    public final C13551TcN A02;

    public final long getItemId(int i) {
        return (long) i;
    }

    public final int getCount() {
        return this.A00.size();
    }

    public final Object getItem(int i) {
        return this.A00.get(i);
    }

    public Q9D(Context context, C13551TcN tcN, ArrayList arrayList) {
        this.A00 = arrayList;
        this.A01 = context;
        this.A02 = tcN;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
        if (r0 != null) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            java.lang.Object r5 = r8.getItem(r9)
            X.SOg r5 = (X.C11347SOg) r5
            java.lang.String r1 = r5.A02
            java.lang.String r0 = "navigation"
            boolean r0 = r1.equals(r0)
            r6 = 0
            if (r0 != 0) goto L_0x0071
            boolean r0 = r10 instanceof com.facebook.browser.lite.chrome.widgets.menu.MenuItemTextView
            if (r0 != 0) goto L_0x0023
            android.content.Context r0 = r8.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626024(0x7f0e0828, float:1.8879273E38)
            android.view.View r10 = r1.inflate(r0, r11, r6)
        L_0x0023:
            X.TcN r3 = r8.A02
            java.util.ArrayList r2 = r8.A00
            int r0 = r8.getCount()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            if (r0 == r5) goto L_0x0034
            r1 = 0
        L_0x0034:
            r7 = r1 ^ 1
            r0 = 2131442903(0x7f0b3cd7, float:1.850786E38)
            android.widget.TextView r2 = X.DbU.A0G(r10, r0)
            java.lang.String r0 = r5.A03
            r2.setText(r0)
            int r0 = r5.A00
            r4 = 0
            if (r0 <= 0) goto L_0x004a
            r2.setCompoundDrawablesWithIntrinsicBounds(r0, r6, r6, r6)
        L_0x004a:
            int r1 = r5.A01
            if (r1 <= 0) goto L_0x0053
            java.util.regex.Pattern r0 = X.SCX.A01
            r2.setTextAppearance(r1)
        L_0x0053:
            r1 = 1
            X.SbL r0 = new X.SbL
            r0.<init>((int) r1, (java.lang.Object) r10, (java.lang.Object) r3, (java.lang.Object) r5)
            r10.setOnClickListener(r0)
            r1 = 2131436126(0x7f0b225e, float:1.8494114E38)
            android.view.View r0 = r10.findViewById(r1)
            if (r0 == 0) goto L_0x0070
        L_0x0065:
            android.view.View r0 = r10.requireViewById(r1)
            if (r7 != 0) goto L_0x006d
            r4 = 8
        L_0x006d:
            r0.setVisibility(r4)
        L_0x0070:
            return r10
        L_0x0071:
            boolean r0 = r10 instanceof com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView
            if (r0 != 0) goto L_0x0082
            android.content.Context r0 = r8.A01
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626025(0x7f0e0829, float:1.8879275E38)
            android.view.View r10 = r1.inflate(r0, r11, r6)
        L_0x0082:
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView r10 = (com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView) r10
            X.TcN r3 = r8.A02
            java.util.ArrayList r2 = r8.A00
            int r0 = r8.getCount()
            r1 = 1
            int r0 = r0 - r1
            java.lang.Object r0 = r2.get(r0)
            if (r0 == r5) goto L_0x0095
            r1 = 0
        L_0x0095:
            r7 = r1 ^ 1
            java.util.ArrayList r2 = r5.A04
            r4 = 0
            java.lang.Object r1 = r2.get(r6)
            X.SOg r1 = (X.C11347SOg) r1
            r0 = 2131433598(0x7f0b187e, float:1.8488986E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView.A00(r0, r1, r3, r10)
            r0 = 1
            java.lang.Object r1 = r2.get(r0)
            X.SOg r1 = (X.C11347SOg) r1
            r0 = 2131433599(0x7f0b187f, float:1.8488988E38)
            android.view.View r0 = r10.requireViewById(r0)
            android.widget.ImageButton r0 = (android.widget.ImageButton) r0
            com.facebook.browser.lite.chrome.widgets.menu.MenuItemNavigationView.A00(r0, r1, r3, r10)
            r1 = 2131436126(0x7f0b225e, float:1.8494114E38)
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q9D.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
