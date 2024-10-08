package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.facebook.ui.emoji.FacebookTypefaceEmojiSpan;

/* renamed from: X.33w  reason: invalid class name and case insensitive filesystem */
public final class C2364733w implements C2364933y {
    public final boolean A01(Spannable spannable, int i, int i2, int i3) {
        boolean z = false;
        while (true) {
            int i4 = i3;
            if (i2 >= i3) {
                return z;
            }
            C253133qG r4 = C253123qF.A00;
            if (r4 != null) {
                int i5 = -1;
                int i6 = i2;
                while (true) {
                    i6 = r4.A02(spannable, r4.A01, 0, r4.A00, i6, i4);
                    if (i6 < 0) {
                        break;
                    }
                    i5 = i6;
                }
                if (i5 != -1) {
                    FacebookTypefaceEmojiSpan facebookTypefaceEmojiSpan = new FacebookTypefaceEmojiSpan(AnonymousClass5B7.A00);
                    if (i5 <= i) {
                        spannable.setSpan(facebookTypefaceEmojiSpan, i2, i5, 33);
                        z = true;
                    }
                    i2 = i5;
                }
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (A01(r11, r6, 0, r6) == false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A8I(android.text.Spannable r11, int r12) {
        /*
            r10 = this;
            r7 = 0
            int r6 = r11.length()
            boolean r0 = A00(r11, r7, r6)
            r9 = 1
            if (r0 == 0) goto L_0x0013
            boolean r0 = r10.A01(r11, r6, r7, r6)
            r8 = 1
            if (r0 != 0) goto L_0x0014
        L_0x0013:
            r8 = 0
        L_0x0014:
            r1 = 0
        L_0x0015:
            r3 = 1
        L_0x0016:
            if (r1 >= r6) goto L_0x0075
            int r2 = java.lang.Character.codePointAt(r11, r1)
            boolean r0 = java.lang.Character.isWhitespace(r2)
            if (r0 == 0) goto L_0x0028
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
            goto L_0x0015
        L_0x0028:
            if (r3 != 0) goto L_0x0030
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
            goto L_0x0016
        L_0x0030:
            X.3qG r0 = X.AnonymousClass6M1.A00
            int r5 = r0.A01(r11, r1, r6)
            if (r5 > r1) goto L_0x003f
            int r0 = java.lang.Character.charCount(r2)
            int r1 = r1 + r0
        L_0x003d:
            r3 = 0
            goto L_0x0016
        L_0x003f:
            if (r5 >= r6) goto L_0x0051
            int r4 = java.lang.Character.codePointAt(r11, r5)
        L_0x0045:
            boolean r0 = java.lang.Character.isWhitespace(r4)
            if (r0 != 0) goto L_0x0054
            int r1 = java.lang.Character.charCount(r4)
            int r1 = r1 + r5
            goto L_0x003d
        L_0x0051:
            r4 = 32
            goto L_0x0045
        L_0x0054:
            X.0l2 r3 = com.facebook.ui.emoji.model.Emoji.A00
            java.lang.Object r2 = r3.A7A()
            char[] r2 = (char[]) r2
            if (r2 != 0) goto L_0x0062
            r0 = 19
            char[] r2 = new char[r0]
        L_0x0062:
            android.text.TextUtils.getChars(r11, r1, r5, r2, r7)
            int r1 = r5 - r1
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2, r7, r1)
            r3.ECR(r2)
            int r1 = java.lang.Character.charCount(r4)
            int r1 = r1 + r5
            goto L_0x0015
        L_0x0075:
            if (r8 != 0) goto L_0x0078
            r9 = 0
        L_0x0078:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2364733w.A8I(android.text.Spannable, int):boolean");
    }

    public final boolean A8K(Spannable spannable, int i, boolean z) {
        int length = spannable.length();
        if (!A00(spannable, 0, length) || !A01(spannable, length, 0, length)) {
            return false;
        }
        return true;
    }

    public final CharSequence Cmk(int i, CharSequence charSequence) {
        if (!(charSequence instanceof Spannable) || (charSequence instanceof Editable)) {
            int length = charSequence.length();
            if (A00(charSequence, 0, length)) {
                SpannableString spannableString = new SpannableString(charSequence);
                if (spannableString.length() != length) {
                    0KC.A0B(C2364733w.class, "Background modification: %d -> %d", new Object[]{Integer.valueOf(length), Integer.valueOf(spannableString.length())});
                    length = spannableString.length();
                }
                A01(spannableString, length, 0, length);
                return spannableString;
            }
        } else {
            Spannable spannable = (Spannable) charSequence;
            int length2 = spannable.length();
            if (A00(spannable, 0, length2)) {
                A01(spannable, length2, 0, length2);
            }
        }
        return charSequence;
    }

    public final Typeface B76(String str) {
        C253133qG r2 = C253123qF.A00;
        if (r2 == null) {
            return null;
        }
        int length = str.length();
        if (r2.A01(str, 0, length) == length) {
            return AnonymousClass5B7.A00;
        }
        return null;
    }

    public final boolean CSY() {
        C253133qG r2 = C253123qF.A00;
        boolean z = false;
        if (r2 == null) {
            z = true;
        }
        if (z || (r2 != null && AnonymousClass5B7.A00 != null)) {
            return true;
        }
        return false;
    }

    public static boolean A00(CharSequence charSequence, int i, int i2) {
        int i3;
        int length = charSequence.length();
        if (i2 > length) {
            0KC.A0Q("TypefaceEmojiUtilBase", "Invalid start: %d and stop value: %d passed for text: %s", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), charSequence});
        }
        if (i2 > length) {
            i2 = length;
        }
        while (i < i2) {
            int codePointAt = Character.codePointAt(charSequence, i);
            if (codePointAt >= 169) {
                if (codePointAt >= 8252) {
                    if (codePointAt < 126980) {
                        i3 = 12953;
                    } else {
                        i3 = 983042;
                        if (codePointAt < 983040) {
                            i3 = 129791;
                        }
                    }
                    if (codePointAt <= i3) {
                        return true;
                    }
                } else if (codePointAt == 169 || codePointAt == 174) {
                    return true;
                }
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    public final boolean A8J(Spannable spannable, int i, int i2, int i3) {
        int length = spannable.length();
        int i4 = i3 + i2;
        if (i3 == -1) {
            i4 = length;
        }
        if (!A00(spannable, i2, i4) || !A01(spannable, length, i2, i4)) {
            return false;
        }
        return true;
    }

    public final InputConnection AMD(EditorInfo editorInfo, InputConnection inputConnection, EditText editText) {
        if (CSY()) {
            editText.addTextChangedListener(new AnonymousClass6UI(this));
        }
        return inputConnection;
    }

    public final KeyListener AMI(KeyListener keyListener, EditText editText) {
        if (CSY()) {
            editText.addTextChangedListener(new AnonymousClass6UI(this));
        }
        return keyListener;
    }

    public final Drawable B0r(String str, int i) {
        Typeface typeface = null;
        if (!C337107fh.A02(str)) {
            return null;
        }
        int length = str.length();
        C253133qG r2 = C253123qF.A00;
        if (r2 != null && r2.A01(str, 0, length) == length) {
            typeface = AnonymousClass5B7.A00;
        }
        return new C59989Jcy(typeface, str, i);
    }

    public final void CMS(Context context, 0lg r2, int i) {
        AnonymousClass5B7.A00(context);
    }
}
