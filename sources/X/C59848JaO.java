package X;

import android.content.Context;
import android.content.res.Resources;
import com.instagram.common.gallery.Medium;

/* renamed from: X.JaO  reason: case insensitive filesystem */
public abstract class C59848JaO {
    public static final CharSequence A00(Context context, Medium medium, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        0qQ.A0B(context, 0);
        if (z) {
            i3 = 2131962902;
        } else {
            i3 = 2131962961;
            if (z2) {
                i3 = 2131962994;
            }
        }
        String string = context.getString(i3);
        0qQ.A07(string);
        if (z3 && i >= 0) {
            String string2 = context.getString(2131962955, new Object[]{Integer.valueOf(i + 1), Integer.valueOf(i2)});
            0qQ.A07(string2);
            string = 002.A0T(string2, string, ' ');
        }
        if (medium == null) {
            return string;
        }
        StringBuilder sb = new StringBuilder(string);
        2eQ.A09(context.getString(2131957423, new Object[]{1G0.A03(context, (double) ((int) ((medium.A0C * 1000) / 1000)))}), sb, true);
        return sb;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
        if (r0.isValid() != true) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A02(com.instagram.ui.widget.mediapicker.MediaPickerItemView r10, X.C62320sa r11) {
        /*
            r9 = 0
            X.0qQ.A0B(r10, r9)
            r2 = 1
            android.content.Context r8 = X.AnonymousClass7TE.A0S(r10)
            boolean r7 = r10.A0A
            com.instagram.common.gallery.model.GalleryItem r0 = r10.A04
            if (r0 == 0) goto L_0x0055
            java.lang.Integer r1 = r0.A09
        L_0x0011:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r6 = 0
            boolean r5 = X.AnonymousClass7TF.A1W(r1, r0)
            X.5Ef r0 = r10.A03
            if (r0 == 0) goto L_0x0023
            boolean r0 = r0.isValid()
            r4 = 1
            if (r0 == r2) goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            X.5Ef r0 = r10.A03
            if (r0 == 0) goto L_0x0053
            boolean r3 = r0.CeS()
        L_0x002c:
            android.graphics.Bitmap r0 = r10.A00
            if (r0 == 0) goto L_0x0031
            r6 = 1
        L_0x0031:
            X.JbM r0 = r10.A07
            int r2 = X.DbU.A02(r0, r9)
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0051
            if (r2 == r9) goto L_0x0051
        L_0x003d:
            r0 = 0
            if (r7 != 0) goto L_0x0047
            if (r5 != 0) goto L_0x0047
            if (r4 != 0) goto L_0x0048
            A01(r8, r3)
        L_0x0047:
            return r0
        L_0x0048:
            if (r1 == 0) goto L_0x0047
            if (r6 == 0) goto L_0x0047
            boolean r0 = X.C51971G9r.A1b(r11)
            return r0
        L_0x0051:
            r1 = 0
            goto L_0x003d
        L_0x0053:
            r3 = 0
            goto L_0x002c
        L_0x0055:
            r1 = 0
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59848JaO.A02(com.instagram.ui.widget.mediapicker.MediaPickerItemView, X.0sa):boolean");
    }

    public static final void A01(Context context, boolean z) {
        int i;
        Resources A0A = AnonymousClass7TF.A0A(context);
        int i2 = 2131961945;
        if (z) {
            i2 = 2131961946;
        }
        String string = A0A.getString(i2);
        if (z) {
            i = 840;
        } else {
            i = 316;
        }
        C59689JTv.A03(context, string, C66579MXk.A00(i), 0);
    }
}
