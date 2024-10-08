package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;
import org.webrtc.EglBase14Impl;

/* renamed from: X.6Cp  reason: invalid class name and case insensitive filesystem */
public final class C304216Cp {
    public static final C304216Cp A02;
    public static final C304216Cp A03;
    public static final C245253cZ A04;
    public static final String A05 = Character.toString(8206);
    public static final String A06 = Character.toString(8207);
    public final C245253cZ A00;
    public final boolean A01;

    static {
        C245253cZ r2 = C245223cW.A01;
        A04 = r2;
        A02 = new C304216Cp(r2, false);
        A03 = new C304216Cp(r2, true);
    }

    public static int A00(CharSequence charSequence) {
        int i;
        byte directionality;
        byte directionality2;
        byte[] bArr = C9888Rj1.A00;
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i2 < length) {
                if (i3 == 0) {
                    char charAt = charSequence.charAt(i2);
                    if (Character.isHighSurrogate(charAt)) {
                        int codePointAt = Character.codePointAt(charSequence, i2);
                        i2 += Character.charCount(codePointAt);
                        directionality2 = Character.getDirectionality(codePointAt);
                    } else {
                        i2++;
                        if (charAt < 1792) {
                            directionality2 = C9888Rj1.A00[charAt];
                        } else {
                            directionality2 = Character.getDirectionality(charAt);
                        }
                    }
                    if (directionality2 != 0) {
                        if (directionality2 == 1 || directionality2 == 2) {
                            if (i5 == 0) {
                                return 1;
                            }
                        } else if (directionality2 != 9) {
                            switch (directionality2) {
                                case 14:
                                case 15:
                                    i5++;
                                    i4 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i5++;
                                    i4 = 1;
                                    continue;
                                case EglBase14Impl.EGLExt_SDK_VERSION:
                                    i5--;
                                    i4 = 0;
                                    continue;
                            }
                        }
                    } else if (i5 == 0) {
                        return -1;
                    }
                    i3 = i5;
                }
            } else if (i3 == 0) {
                return 0;
            }
        }
        if (i4 != 0) {
            return i4;
        }
        while (i2 > 0) {
            int i6 = i2 - 1;
            char charAt2 = charSequence.charAt(i6);
            if (Character.isLowSurrogate(charAt2)) {
                int codePointBefore = Character.codePointBefore(charSequence, i2);
                i = i2 - Character.charCount(codePointBefore);
                directionality = Character.getDirectionality(codePointBefore);
            } else {
                i = i6;
                if (charAt2 < 1792) {
                    directionality = C9888Rj1.A00[charAt2];
                } else {
                    directionality = Character.getDirectionality(charAt2);
                }
            }
            switch (directionality) {
                case 14:
                case 15:
                    if (i3 == i5) {
                        return -1;
                    }
                    break;
                case 16:
                case 17:
                    if (i3 == i5) {
                        return 1;
                    }
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    i5++;
                    continue;
            }
            i5--;
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        r3 = r3 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A01(java.lang.CharSequence r5) {
        /*
            byte[] r0 = X.C9888Rj1.A00
            int r4 = r5.length()
            r3 = 0
            r2 = 0
        L_0x0008:
            if (r4 <= 0) goto L_0x005a
            int r0 = r4 + -1
            char r1 = r5.charAt(r0)
            boolean r0 = java.lang.Character.isLowSurrogate(r1)
            if (r0 == 0) goto L_0x004a
            int r1 = java.lang.Character.codePointBefore(r5, r4)
            int r0 = java.lang.Character.charCount(r1)
            int r4 = r4 - r0
            byte r0 = java.lang.Character.getDirectionality(r1)
        L_0x0023:
            if (r0 == 0) goto L_0x0046
            r1 = 1
            if (r0 == r1) goto L_0x0042
            r1 = 2
            if (r0 == r1) goto L_0x0042
            r1 = 9
            if (r0 == r1) goto L_0x0008
            switch(r0) {
                case 14: goto L_0x0036;
                case 15: goto L_0x0036;
                case 16: goto L_0x0039;
                case 17: goto L_0x0039;
                case 18: goto L_0x003f;
                default: goto L_0x0032;
            }
        L_0x0032:
            if (r2 != 0) goto L_0x0008
            r2 = r3
            goto L_0x0008
        L_0x0036:
            if (r2 != r3) goto L_0x003c
            goto L_0x0048
        L_0x0039:
            if (r2 != r3) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            int r3 = r3 + -1
            goto L_0x0008
        L_0x003f:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x0042:
            if (r3 != 0) goto L_0x0032
        L_0x0044:
            r0 = 1
            return r0
        L_0x0046:
            if (r3 != 0) goto L_0x0032
        L_0x0048:
            r0 = -1
            return r0
        L_0x004a:
            int r4 = r4 + -1
            r0 = 1792(0x700, float:2.511E-42)
            if (r1 >= r0) goto L_0x0055
            byte[] r0 = X.C9888Rj1.A00
            byte r0 = r0[r1]
            goto L_0x0023
        L_0x0055:
            byte r0 = java.lang.Character.getDirectionality(r1)
            goto L_0x0023
        L_0x005a:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304216Cp.A01(java.lang.CharSequence):int");
    }

    public final SpannableStringBuilder A03(C245253cZ r7, CharSequence charSequence) {
        C245253cZ r1;
        String str;
        C245253cZ r12;
        String str2;
        if (charSequence == null) {
            return null;
        }
        boolean Cb2 = r7.Cb2(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (Cb2) {
            r1 = C245223cW.A05;
        } else {
            r1 = C245223cW.A04;
        }
        boolean Cb22 = r1.Cb2(charSequence, 0, charSequence.length());
        boolean z = this.A01;
        if (!z) {
            if (Cb22 || A00(charSequence) == 1) {
                str = A05;
            }
            str = "";
        } else {
            if (!Cb22 || A00(charSequence) == -1) {
                str = A06;
            }
            str = "";
        }
        spannableStringBuilder.append(str);
        if (Cb2 != z) {
            char c = 8234;
            if (Cb2) {
                c = 8235;
            }
            spannableStringBuilder.append(c);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (Cb2) {
            r12 = C245223cW.A05;
        } else {
            r12 = C245223cW.A04;
        }
        boolean Cb23 = r12.Cb2(charSequence, 0, charSequence.length());
        if (!z) {
            if (Cb23 || A01(charSequence) == 1) {
                str2 = A05;
            }
            str2 = "";
        } else {
            if (!Cb23 || A01(charSequence) == -1) {
                str2 = A06;
            }
            str2 = "";
        }
        spannableStringBuilder.append(str2);
        return spannableStringBuilder;
    }

    public final boolean A04(String str) {
        return this.A00.Cb2(str, 0, str.length());
    }

    public C304216Cp(C245253cZ r1, boolean z) {
        this.A01 = z;
        this.A00 = r1;
    }

    public static C304216Cp A02() {
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            return A03;
        }
        return A02;
    }
}
