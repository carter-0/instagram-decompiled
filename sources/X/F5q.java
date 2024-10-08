package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;

public abstract class F5q {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (X.0mk.A02(r6) == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(android.content.Context r6, android.text.SpannableStringBuilder r7, boolean r8, boolean r9, boolean r10) {
        /*
            r5 = 0
            android.graphics.drawable.Drawable r4 = A00(r6, r10)
            r3 = 0
            if (r8 != 0) goto L_0x000f
            boolean r0 = X.0mk.A02(r6)
            r2 = 1
            if (r0 != 0) goto L_0x0010
        L_0x000f:
            r2 = 0
        L_0x0010:
            if (r9 == 0) goto L_0x001a
            if (r2 == 0) goto L_0x0038
            r1 = 0
        L_0x0015:
            java.lang.String r0 = " "
            r7.insert(r1, r0)
        L_0x001a:
            java.lang.String r0 = "\r"
            if (r2 == 0) goto L_0x0030
            r7.insert(r5, r0)
        L_0x0021:
            if (r4 == 0) goto L_0x003d
            X.46l r2 = new X.46l
            r2.<init>(r4)
            int r1 = r3 + 1
            r0 = 33
            r7.setSpan(r2, r3, r1, r0)
            return
        L_0x0030:
            int r3 = r7.length()
            r7.append(r0)
            goto L_0x0021
        L_0x0038:
            int r1 = r7.length()
            goto L_0x0015
        L_0x003d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.F5q.A01(android.content.Context, android.text.SpannableStringBuilder, boolean, boolean, boolean):void");
    }

    public static final Drawable A00(Context context, boolean z) {
        Drawable mutate;
        int i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_12;
        if (z) {
            i = R.drawable.instagram_icons_exceptions_crown_badge_purple_filled_16;
        }
        Drawable drawable = context.getDrawable(i);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        mutate.setBounds(0, 0, mutate.getIntrinsicWidth(), mutate.getIntrinsicHeight());
        return mutate;
    }
}
