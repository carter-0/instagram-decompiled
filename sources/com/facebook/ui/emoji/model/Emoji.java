package com.facebook.ui.emoji.model;

import X.0l2;
import android.os.Parcelable;
import com.instagram.ui.emoji.EmojiSkinTone$createVariations$baseEmoji$1;

public abstract class Emoji implements Parcelable {
    public static final 0l2 A00 = new 0l2(2);
    public static final 0l2 A01 = new 0l2(2);

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(int[] r4, int r5, boolean r6) {
        /*
            r3 = 0
            r2 = 0
        L_0x0002:
            if (r3 >= r5) goto L_0x0022
            r1 = r4[r3]
            if (r6 == 0) goto L_0x0015
            r0 = 127995(0x1f3fb, float:1.79359E-40)
            if (r1 < r0) goto L_0x0015
            r0 = 127999(0x1f3ff, float:1.79365E-40)
            if (r1 > r0) goto L_0x001b
        L_0x0012:
            int r3 = r3 + 1
            goto L_0x0002
        L_0x0015:
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r1 != r0) goto L_0x001b
            goto L_0x0012
        L_0x001b:
            if (r2 == r3) goto L_0x001f
            r4[r2] = r1
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0022:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ui.emoji.model.Emoji.A01(int[], int, boolean):int");
    }

    public String A03() {
        return ((EmojiSkinTone$createVariations$baseEmoji$1) this).A00;
    }

    public static int[] A02() {
        int[] iArr = (int[]) A01.A7A();
        if (iArr == null) {
            return new int[11];
        }
        return iArr;
    }

    public static int A00(String str, int[] iArr) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length && i2 < iArr.length) {
            int codePointAt = Character.codePointAt(str, i);
            iArr[i2] = codePointAt;
            i2++;
            i += Character.charCount(codePointAt);
        }
        return i2;
    }

    public final String toString() {
        String A03 = A03();
        StringBuilder sb = new StringBuilder(11);
        boolean z = true;
        int i = 0;
        while (i < A03.length()) {
            if (z) {
                z = false;
            } else {
                sb.append('_');
            }
            int codePointAt = Character.codePointAt(A03, i);
            sb.append(Integer.toHexString(codePointAt));
            i += Character.charCount(codePointAt);
        }
        return sb.toString();
    }
}
