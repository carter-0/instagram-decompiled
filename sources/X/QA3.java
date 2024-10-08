package X;

import android.content.Context;
import android.widget.ListPopupWindow;
import java.util.ArrayList;

public final class QA3 extends ListPopupWindow {
    public Context A00;
    public C13551TcN A01;
    public ArrayList A02;
    public boolean A03;
    public Q9D A04;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0083, code lost:
        if (r4 < r0) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r9) {
        /*
            r8 = this;
            r0 = 1
            r8.setModal(r0)
            android.content.Context r3 = r8.A00
            android.content.res.Resources r0 = r3.getResources()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r9)
            r8.setBackgroundDrawable(r0)
            r0 = 2
            r8.setInputMethodMode(r0)
            java.util.ArrayList r2 = r8.A02
            X.TcN r1 = r8.A01
            X.Q9D r0 = new X.Q9D
            r0.<init>(r3, r1, r2)
            r8.A04 = r0
            r8.setAdapter(r0)
            X.Q9D r7 = r8.A04
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x003f
            android.content.Context r2 = r8.A00
            r1 = 1131413504(0x43700000, float:240.0)
            java.util.regex.Pattern r0 = X.SCX.A01
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r2)
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r4 = (int) r1
        L_0x003a:
            r0 = r4
        L_0x003b:
            r8.setContentWidth(r0)
            return
        L_0x003f:
            r6 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r6)
            int r2 = r7.getCount()
            r4 = 0
        L_0x004d:
            if (r6 >= r2) goto L_0x0064
            r0 = 0
            android.view.View r1 = r7.getView(r6, r0, r0)
            r1.measure(r5, r3)
            int r0 = r1.getMeasuredWidth()
            if (r0 <= r4) goto L_0x0061
            int r4 = r1.getMeasuredWidth()
        L_0x0061:
            int r6 = r6 + 1
            goto L_0x004d
        L_0x0064:
            android.content.Context r3 = r8.A00
            int r0 = X.C51972G9s.A08(r3)
            int r1 = r0 * 2
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r3)
            int r2 = r0.widthPixels
            int r2 = r2 - r1
            int r4 = r4 + r1
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165283(0x7f070063, float:1.7944779E38)
            int r0 = r1.getDimensionPixelSize(r0)
            if (r4 <= r2) goto L_0x0083
            r0 = r2
            goto L_0x003b
        L_0x0083:
            if (r4 >= r0) goto L_0x003a
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QA3.A01(int):void");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.QA3, android.widget.ListPopupWindow] */
    public static QA3 A00(Context context, C13551TcN tcN, ArrayList arrayList, boolean z) {
        ? listPopupWindow = new ListPopupWindow(context);
        listPopupWindow.A02 = arrayList;
        listPopupWindow.A00 = context;
        listPopupWindow.A01 = tcN;
        listPopupWindow.A03 = z;
        return listPopupWindow;
    }
}
