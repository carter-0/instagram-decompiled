package X;

import android.net.Uri;
import android.text.SpannableString;
import android.text.style.StyleSpan;

/* renamed from: X.775  reason: invalid class name */
public abstract class AnonymousClass775 {
    public static final SpannableString A00(String str, String str2) {
        StyleSpan styleSpan;
        int length;
        SpannableString spannableString = null;
        if (str != null) {
            spannableString = new SpannableString(str);
            if (str2 == null || !00l.A0b(spannableString, str2)) {
                styleSpan = new StyleSpan(1);
                length = str.length();
            } else {
                styleSpan = new StyleSpan(1);
                length = str2.length();
            }
            spannableString.setSpan(styleSpan, 0, length, 17);
        }
        return spannableString;
    }

    public static final String A03(String str, String str2) {
        if (str == null) {
            return null;
        }
        Uri A03 = 0cp.A03(str);
        0qQ.A07(A03);
        String scheme = A03.getScheme();
        if (scheme == null || !scheme.equals("instagram")) {
            return null;
        }
        return A03.getQueryParameter(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0013, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Integer A01(int r3) {
        /*
            r0 = 16
            r2 = 0
            if (r3 == r0) goto L_0x0026
            switch(r3) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0014;
                case 2: goto L_0x0018;
                case 3: goto L_0x0013;
                case 4: goto L_0x0013;
                case 5: goto L_0x001c;
                case 6: goto L_0x0020;
                case 7: goto L_0x0024;
                case 8: goto L_0x002a;
                case 9: goto L_0x0013;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.String r0 = "Invalid previewImageDecorationType: "
            java.lang.String r1 = X.002.A0O(r0, r3)
            java.lang.String r0 = "GenericXmaModelMapping_getContentAttributionResId"
            X.0wb.A03(r0, r1)
        L_0x0013:
            return r2
        L_0x0014:
            r0 = 2131237287(0x7f0819a7, float:1.809082E38)
            goto L_0x002d
        L_0x0018:
            r0 = 2131239495(0x7f082247, float:1.8095299E38)
            goto L_0x002d
        L_0x001c:
            r0 = 2131238784(0x7f081f80, float:1.8093856E38)
            goto L_0x002d
        L_0x0020:
            r0 = 2131238013(0x7f081c7d, float:1.8092293E38)
            goto L_0x002d
        L_0x0024:
            r0 = -2
            goto L_0x002d
        L_0x0026:
            r0 = 2131238928(0x7f082010, float:1.8094149E38)
            goto L_0x002d
        L_0x002a:
            r0 = 2131238689(0x7f081f21, float:1.8093664E38)
        L_0x002d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass775.A01(int):java.lang.Integer");
    }

    public static final String A02(C254793t3 r1, int i) {
        String str;
        if (r1 == null || C300965yF.A02(r1) == null || i != 29 || (str = C300965yF.A01(r1).A00) == null) {
            return "";
        }
        return 002.A0g(C66579MXk.A00(917), str, "/show_gated_channel_content_upsell");
    }
}
