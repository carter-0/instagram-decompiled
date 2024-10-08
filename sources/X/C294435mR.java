package X;

import android.text.Editable;
import android.widget.EditText;

/* renamed from: X.5mR  reason: invalid class name and case insensitive filesystem */
public final class C294435mR {
    public static final C294435mR A00 = new Object();

    public static final CharSequence A00(EditText editText, C294425mQ r3, CharSequence charSequence, boolean z) {
        0qQ.A0B(r3, 2);
        return A01(editText, r3, charSequence, false, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0027, code lost:
        if (r1.A02(r14, r15.toString(), 0) != null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.CharSequence A01(android.widget.EditText r13, X.C294425mQ r14, java.lang.CharSequence r15, boolean r16, boolean r17) {
        /*
            r3 = 0
            r0 = 2
            X.0qQ.A0B(r14, r0)
            android.text.Editable r2 = r13.getText()
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            if (r16 != 0) goto L_0x0029
            X.5mR r1 = A00
            char r0 = r15.charAt(r3)
            boolean r0 = A05(r14, r0)
            if (r0 != 0) goto L_0x0029
            if (r17 != 0) goto L_0x0029
            java.lang.String r0 = r15.toString()
            java.lang.Integer r0 = r1.A02(r14, r0, r3)
            r5 = 1
            if (r0 == 0) goto L_0x002a
        L_0x0029:
            r5 = 0
        L_0x002a:
            X.5mR r1 = A00
            X.0qQ.A0A(r2)
            int r3 = r13.getSelectionEnd()
        L_0x0033:
            int r3 = r3 + -1
            r0 = -1
            if (r0 >= r3) goto L_0x00b2
            char r0 = r2.charAt(r3)
            boolean r0 = A05(r14, r0)
            if (r0 == 0) goto L_0x009e
            int r3 = r3 + r5
        L_0x0043:
            int r1 = r13.getSelectionEnd()
            java.lang.CharSequence r6 = r2.subSequence(r3, r1)
            android.text.SpannableStringBuilder r0 = r4.append(r2)
            r0.delete(r3, r1)
            int r1 = r13.getSelectionEnd()
            int r0 = r2.length()
            if (r1 == r0) goto L_0x008d
            int r0 = r13.getSelectionEnd()
            char r0 = r2.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x008d
            r15.length()
            r4.insert(r3, r15)
        L_0x0070:
            boolean r2 = r13 instanceof com.instagram.ui.widget.textview.IgAutoCompleteTextView
            if (r2 == 0) goto L_0x00b4
            r0 = r13
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r0
            java.util.List r1 = r0.A0C
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00b4
            java.util.Iterator r1 = r1.iterator()
        L_0x0083:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b4
            r1.next()
            goto L_0x0083
        L_0x008d:
            java.lang.String r0 = " "
            java.lang.CharSequence[] r0 = new java.lang.CharSequence[]{r15, r0}
            java.lang.CharSequence r0 = android.text.TextUtils.concat(r0)
            r0.length()
            r4.insert(r3, r0)
            goto L_0x0070
        L_0x009e:
            if (r17 == 0) goto L_0x0033
            java.lang.String r0 = r2.toString()
            java.lang.Integer r0 = r1.A02(r14, r0, r3)
            if (r0 == 0) goto L_0x0033
            int r0 = r0.intValue()
            int r3 = r3 - r0
            int r3 = r3 + 1
            goto L_0x0043
        L_0x00b2:
            r3 = 0
            goto L_0x0043
        L_0x00b4:
            r13.setText(r4)
            if (r2 == 0) goto L_0x0153
            r0 = r13
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = (com.instagram.ui.widget.textview.IgAutoCompleteTextView) r0
            java.util.List r1 = r0.A0C
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0153
            java.util.Iterator r5 = r1.iterator()
        L_0x00c8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0153
            java.lang.Object r4 = r5.next()
            X.L4E r4 = (X.L4E) r4
            X.K66 r1 = r4.A00
            X.KNs r0 = X.K66.A06(r1)
            X.3Q2 r0 = r0.A02
            if (r0 == 0) goto L_0x013c
            X.3QO r2 = r0.A1F
            X.3QO r0 = X.AnonymousClass3QO.CLOSE_FRIENDS
            if (r2 == r0) goto L_0x013c
            X.3QO r0 = X.AnonymousClass3QO.OPAL
            if (r2 == r0) goto L_0x013c
            X.3QO r0 = X.AnonymousClass3QO.FAN_CLUB
            if (r2 == r0) goto L_0x013c
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = X.K66.A01(r1)
            X.5kq r0 = r0.A03()
            X.JwI r0 = r0.A02
            if (r0 != 0) goto L_0x013c
            r10 = 0
            X.KNs r0 = X.K66.A06(r1)
            X.KOa r2 = r0.A0I
            com.instagram.user.model.User r8 = r4.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = X.K66.A01(r1)
            X.5kq r0 = r0.A03()
            java.util.List r11 = r0.A0q
            if (r11 != 0) goto L_0x010f
            X.0sn r11 = X.0sn.A00
        L_0x010f:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = X.K66.A01(r1)
            X.5kq r0 = r0.A03()
            java.util.List r12 = r0.A0n
            if (r12 != 0) goto L_0x011d
            X.0sn r12 = X.0sn.A00
        L_0x011d:
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = X.K66.A01(r1)
            X.5kq r0 = r0.A03()
            java.lang.String r9 = r0.A0U
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r0 = X.K66.A01(r1)
            X.5kq r0 = r0.A03()
            com.instagram.music.common.model.AudioOverlayTrack r0 = r0.A0N
            if (r0 == 0) goto L_0x0135
            java.lang.String r10 = r0.A0B
        L_0x0135:
            X.Lgz r7 = r2.A00
            if (r7 == 0) goto L_0x013c
            r7.A01(r8, r9, r10, r11, r12)
        L_0x013c:
            X.LBG r0 = r1.A06
            if (r0 != 0) goto L_0x014a
            java.lang.String r0 = "viewHolder"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x014a:
            com.instagram.ui.widget.textview.IgAutoCompleteTextView r0 = r0.A0A
            java.util.List r0 = r0.A0C
            r0.clear()
            goto L_0x00c8
        L_0x0153:
            android.text.Editable r2 = r13.getText()
            int r1 = r2.length()
            int r0 = r15.length()
            int r3 = r3 + r0
            int r0 = r3 + 1
            if (r0 > r1) goto L_0x0165
            r1 = r0
        L_0x0165:
            android.text.Selection.setSelection(r2, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294435mR.A01(android.widget.EditText, X.5mQ, java.lang.CharSequence, boolean, boolean):java.lang.CharSequence");
    }

    public static final String A03(EditText editText, C294425mQ r9, boolean z) {
        0qQ.A0B(r9, 1);
        String obj = editText.getText().toString();
        int selectionEnd = editText.getSelectionEnd() - 1;
        int length = obj.length();
        if (selectionEnd >= length) {
            return null;
        }
        int selectionEnd2 = editText.getSelectionEnd();
        while (selectionEnd >= 0) {
            C294435mR r1 = A00;
            if (!A05(r9, obj.charAt(selectionEnd))) {
                if (z) {
                    Integer A02 = r1.A02(r9, obj, selectionEnd);
                    if (A02 != null) {
                        selectionEnd = (selectionEnd - A02.intValue()) + 1;
                        if (selectionEnd == -1 || selectionEnd < 0) {
                            return null;
                        }
                    }
                } else if (Character.isWhitespace(obj.charAt(selectionEnd))) {
                    return null;
                }
                selectionEnd--;
            }
            if (selectionEnd2 > length) {
                return null;
            }
            String substring = obj.substring(selectionEnd, selectionEnd2);
            0qQ.A07(substring);
            return substring;
        }
        return null;
    }

    public static final boolean A04(EditText editText, C294425mQ r7, int i, boolean z) {
        int selectionEnd;
        char charAt;
        0qQ.A0B(r7, 1);
        Editable text = editText.getText();
        if (text.length() >= i && (selectionEnd = editText.getSelectionEnd()) > 0 && (z || !Character.isWhitespace(text.charAt(selectionEnd - 1)))) {
            for (int i2 = selectionEnd - 1; -1 < i2; i2--) {
                C294435mR r1 = A00;
                if (A05(r7, text.charAt(i2))) {
                    if (i2 != 0 && (charAt = text.charAt(i2 - 1)) < 128 && Character.isLetterOrDigit(charAt)) {
                    }
                    return true;
                } else if (z && r1.A02(r7, text.toString(), i2) != null) {
                    return true;
                } else {
                    if (Character.isWhitespace(text.charAt(i2))) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0060, code lost:
        if (r8.matcher(r0).matches() != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Integer A02(X.C294425mQ r12, java.lang.String r13, int r14) {
        /*
            r11 = this;
            X.5mQ r0 = X.C294425mQ.MENTION_ONLY
            r10 = 0
            if (r12 == r0) goto L_0x000e
            X.5mQ r0 = X.C294425mQ.ALL
            if (r12 == r0) goto L_0x000e
            X.5mQ r0 = X.C294425mQ.MENTION_AND_HASHTAG
            if (r12 == r0) goto L_0x000e
        L_0x000d:
            return r10
        L_0x000e:
            r0 = 4
            java.lang.Integer[] r6 = X.AnonymousClass05K.A00(r0)
            r5 = 0
            int r4 = r6.length
        L_0x0015:
            if (r5 >= r4) goto L_0x000d
            r0 = r6[r5]
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00c2;
                case 2: goto L_0x00c6;
                case 3: goto L_0x00ca;
                default: goto L_0x0020;
            }
        L_0x0020:
            java.lang.String r7 = "meta ai"
        L_0x0022:
            int r3 = r7.length()
            r2 = 32
            if (r14 < r3) goto L_0x00bf
            int r0 = r13.length()
            if (r0 == r3) goto L_0x00bf
            java.lang.String r1 = X.002.A0D(r7, r2)
        L_0x0034:
            r9 = 1
            if (r14 == 0) goto L_0x003e
            int r0 = r1.length()
            int r0 = r0 - r9
            if (r14 < r0) goto L_0x0069
        L_0x003e:
            r0 = 2
            java.util.regex.Pattern r8 = java.util.regex.Pattern.compile(r1, r0)
            int r0 = r1.length()
            int r0 = r14 - r0
            int r1 = r0 + 1
            r0 = 0
            if (r1 >= r0) goto L_0x004f
            r1 = 0
        L_0x004f:
            int r0 = r14 + 1
            java.lang.String r0 = r13.substring(r1, r0)
            X.0qQ.A07(r0)
            java.util.regex.Matcher r0 = r8.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x0069
        L_0x0062:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            if (r0 == 0) goto L_0x00bb
            return r0
        L_0x0069:
            if (r14 <= r3) goto L_0x00b5
            int r1 = r13.length()
            int r0 = r3 + 1
            if (r1 == r0) goto L_0x00b5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
        L_0x007b:
            r0.append(r7)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            if (r14 == 0) goto L_0x008e
            int r0 = r1.length()
            int r0 = r0 - r9
            if (r14 < r0) goto L_0x00bb
        L_0x008e:
            r0 = 2
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r1, r0)
            int r0 = r1.length()
            int r0 = r14 - r0
            int r1 = r0 + 1
            r0 = 0
            if (r1 >= r0) goto L_0x009f
            r1 = 0
        L_0x009f:
            int r0 = r14 + 1
            java.lang.String r0 = r13.substring(r1, r0)
            X.0qQ.A07(r0)
            java.util.regex.Matcher r0 = r2.matcher(r0)
            boolean r0 = r0.matches()
            if (r0 == 0) goto L_0x00bb
            int r3 = r3 + 1
            goto L_0x0062
        L_0x00b5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            goto L_0x007b
        L_0x00bb:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x00bf:
            r1 = r7
            goto L_0x0034
        L_0x00c2:
            java.lang.String r7 = "metaai"
            goto L_0x0022
        L_0x00c6:
            java.lang.String r7 = "meta"
            goto L_0x0022
        L_0x00ca:
            java.lang.String r7 = "ai"
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294435mR.A02(X.5mQ, java.lang.String, int):java.lang.Integer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        if (r6 != '#') goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        if (r6 != '@') goto L_0x0023;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A05(X.C294425mQ r5, char r6) {
        /*
            int r5 = r5.ordinal()
            r4 = 64
            r3 = 0
            if (r5 == r3) goto L_0x0026
            r0 = 1
            r2 = 35
            if (r5 == r0) goto L_0x0023
            r0 = 2
            r1 = 47
            if (r5 == r0) goto L_0x001d
            r0 = 3
            if (r5 == r0) goto L_0x0021
            r0 = 4
            if (r5 != r0) goto L_0x0020
            if (r6 == r4) goto L_0x001f
            if (r6 == r2) goto L_0x001f
        L_0x001d:
            if (r6 != r1) goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            return r3
        L_0x0021:
            if (r6 == r4) goto L_0x001f
        L_0x0023:
            if (r6 != r2) goto L_0x0020
            goto L_0x001f
        L_0x0026:
            if (r6 != r4) goto L_0x0020
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C294435mR.A05(X.5mQ, char):boolean");
    }
}
