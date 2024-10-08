package X;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class SHR {
    public final UserSession A00;
    public final Activity A01;
    public final Rect A02 = AnonymousClass7TE.A0W();
    public final Rect A03 = AnonymousClass7TE.A0W();

    public static final void A00(View view, Rect rect) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        rect.left = i;
        rect.top = iArr[1];
        rect.right = i + view.getWidth();
        rect.bottom = iArr[1] + view.getHeight();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r0 > 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0066, code lost:
        if (r7 > ((float) r1.bottom)) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(float r6, float r7) {
        /*
            r5 = this;
            android.graphics.Rect r2 = r5.A03
            boolean r0 = r2.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0017
            android.app.Activity r1 = r5.A01
            r0 = 2131430046(0x7f0b0a9e, float:1.8481782E38)
            android.view.View r0 = r1.findViewById(r0)
            if (r0 == 0) goto L_0x006e
            A00(r0, r2)
        L_0x0017:
            android.graphics.Rect r1 = r5.A02
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x002d
            android.app.Activity r3 = r5.A01
            r0 = 2131430044(0x7f0b0a9c, float:1.8481778E38)
            android.view.View r0 = r3.findViewById(r0)
            if (r0 == 0) goto L_0x006e
            A00(r0, r1)
        L_0x002d:
            int r0 = r2.left
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004a
            int r0 = r2.right
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x004a
            int r0 = r2.top
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x004a
            int r0 = r2.bottom
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r2 = 1
            if (r0 <= 0) goto L_0x004b
        L_0x004a:
            r2 = 0
        L_0x004b:
            int r0 = r1.left
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            int r0 = r1.right
            float r0 = (float) r0
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0068
            int r0 = r1.top
            float r0 = (float) r0
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0068
            int r0 = r1.bottom
            float r0 = (float) r0
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r0 = 1
            if (r1 <= 0) goto L_0x0069
        L_0x0068:
            r0 = 0
        L_0x0069:
            if (r2 != 0) goto L_0x006d
            if (r0 == 0) goto L_0x006e
        L_0x006d:
            r4 = 1
        L_0x006e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SHR.A01(float, float):boolean");
    }

    public SHR(Activity activity, UserSession userSession) {
        this.A01 = activity;
        this.A00 = userSession;
    }
}
