package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class LYI implements View.OnDragListener {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass7JA A02;
    public final /* synthetic */ C329307Ij A03;

    public LYI(Activity activity, UserSession userSession, AnonymousClass7JA r3, C329307Ij r4) {
        this.A01 = userSession;
        this.A03 = r4;
        this.A00 = activity;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onDrag(android.view.View r8, android.view.DragEvent r9) {
        /*
            r7 = this;
            r1 = 0
            if (r8 == 0) goto L_0x000d
            if (r9 == 0) goto L_0x000d
            int r0 = r9.getAction()
            r6 = 1
            switch(r0) {
                case 1: goto L_0x007a;
                case 2: goto L_0x0073;
                case 3: goto L_0x0054;
                case 4: goto L_0x0033;
                case 5: goto L_0x000e;
                case 6: goto L_0x0033;
                default: goto L_0x000d;
            }
        L_0x000d:
            return r1
        L_0x000e:
            X.7Ij r3 = r7.A03
            android.app.Activity r1 = r7.A00
            int r0 = X.2Yu.A0D(r1)
            int r2 = r1.getColor(r0)
            android.view.View r0 = r3.A0I
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            if (r1 == 0) goto L_0x0073
            r1.mutate()
            android.content.res.Resources r0 = X.DbU.A05(r0)
            int r0 = X.JTP.A04(r0)
            r1.setStroke(r0, r2)
            return r6
        L_0x0033:
            X.7Ij r1 = r7.A03
            android.view.View r0 = r1.A0I
            android.graphics.drawable.Drawable r4 = r0.getBackground()
            android.graphics.drawable.GradientDrawable r4 = (android.graphics.drawable.GradientDrawable) r4
            if (r4 == 0) goto L_0x0073
            X.7OF r0 = r1.A07
            if (r0 == 0) goto L_0x0073
            r4.mutate()
            X.7OF r0 = r1.A07
            int r3 = r0.A03
            int r2 = r0.A02
            float r1 = r0.A01
            float r0 = r0.A00
            r4.setStroke(r3, r2, r1, r0)
            return r6
        L_0x0054:
            android.content.ClipData r5 = r9.getClipData()
            android.app.Activity r4 = r7.A00
            android.view.DragAndDropPermissions r3 = r4.requestDragAndDropPermissions(r9)
            if (r5 == 0) goto L_0x0074
            if (r3 == 0) goto L_0x0074
            X.0nO r2 = X.0nY.A00()
            X.7JA r1 = r7.A02
            X.KIz r0 = new X.KIz
            r0.<init>(r4, r5, r1)
            r2.ATE(r0)
            r3.release()
        L_0x0073:
            return r6
        L_0x0074:
            X.7JA r0 = r7.A02
            X.AnonymousClass7JB.A00(r0)
            return r1
        L_0x007a:
            com.instagram.common.session.UserSession r1 = r7.A01
            r0 = 0
            X.0wc r1 = X.AnonymousClass0kN.A01(r0, r1)
            java.lang.String r0 = "ig_drag_start_direct"
            X.DbZ.A1R(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LYI.onDrag(android.view.View, android.view.DragEvent):boolean");
    }
}
