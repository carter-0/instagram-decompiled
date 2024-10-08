package X;

/* renamed from: X.O0r  reason: case insensitive filesystem */
public abstract class C70287O0r {
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b9, code lost:
        if (X.0mp.A00(r6) <= 3) goto L_0x0044;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final com.instagram.direct.inbox.notes.ui.NoteBubbleView A00(android.content.Context r10, X.C19879Wh8 r11, com.instagram.common.session.UserSession r12, X.AnonymousClass4AB r13, java.lang.Integer r14, boolean r15) {
        /*
            r5 = 0
            X.AnonymousClass7TF.A1B(r10, r5, r12)
            r0 = 5
            X.0qQ.A0B(r14, r0)
            r4 = 0
            if (r13 == 0) goto L_0x00c3
            java.util.List r0 = r13.A0J
            java.lang.Object r0 = X.00k.A0J(r0)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x00c3
            X.4zZ r7 = r0.BWY()
            if (r7 == 0) goto L_0x00c3
            java.lang.String r6 = r7.A0J
            r3 = 1
            if (r6 == 0) goto L_0x00c3
            int r1 = r6.length()
            if (r1 == 0) goto L_0x00c3
            com.instagram.direct.inbox.notes.ui.NoteBubbleView r2 = new com.instagram.direct.inbox.notes.ui.NoteBubbleView
            r2.<init>(r10)
            r2.setVisibility(r5)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            if (r14 == r8) goto L_0x0036
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r14 != r0) goto L_0x003b
        L_0x0036:
            com.instagram.api.schemas.NoteCustomTheme r0 = r13.A06
            r2.setCustomTheme(r0)
        L_0x003b:
            if (r14 != r8) goto L_0x0092
            r0 = 2131962728(0x7f132b68, float:1.956219E38)
            java.lang.String r8 = X.AnonymousClass7TE.A16(r10, r0)
        L_0x0044:
            r7 = 1
        L_0x0045:
            if (r11 == 0) goto L_0x0054
            boolean r0 = r11 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0064
            r0 = r11
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0064
        L_0x0054:
            java.lang.String r6 = ""
        L_0x0056:
            r1 = 48
            X.Inj r0 = new X.Inj
            r0.<init>(r2, r1)
            r2.setText(r8, r7, r6, r0)
            com.instagram.direct.inbox.notes.ui.NoteBubbleView.setContentLayout$default(r2, r5, r3, r4)
            return r2
        L_0x0064:
            java.util.Iterator r1 = r11.iterator()
            r6 = 0
        L_0x0069:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0083
            X.N4t r0 = X.C66580MXl.A0f(r1)
            X.4AB r0 = r0.A05
            if (r0 == 0) goto L_0x0069
            int r6 = r6 + 1
            if (r6 >= 0) goto L_0x0069
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0083:
            if (r6 <= r3) goto L_0x0054
            r1 = 2131963205(0x7f132d45, float:1.9563157E38)
            int r6 = r6 - r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = X.DbY.A0c(r10, r0, r1)
            goto L_0x0056
        L_0x0092:
            if (r15 == 0) goto L_0x00bc
            android.text.SpannableStringBuilder r8 = X.DbS.A0C(r6)
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            r0.<init>(r3)
            r9 = 33
            r8.setSpan(r0, r5, r1, r9)
            r0 = 2131100475(0x7f06033b, float:1.7813332E38)
            int r0 = r10.getColor(r0)
            android.text.style.ForegroundColorSpan r0 = X.C66580MXl.A0E(r0)
            r8.setSpan(r0, r5, r1, r9)
        L_0x00b0:
            boolean r0 = r7.A0Q
            if (r0 == 0) goto L_0x00c1
            int r1 = X.0mp.A00(r6)
            r0 = 3
            if (r1 > r0) goto L_0x00c1
            goto L_0x0044
        L_0x00bc:
            java.lang.CharSequence r8 = X.C66889MeU.A04(r12, r6)
            goto L_0x00b0
        L_0x00c1:
            r7 = 0
            goto L_0x0045
        L_0x00c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70287O0r.A00(android.content.Context, X.Wh8, com.instagram.common.session.UserSession, X.4AB, java.lang.Integer, boolean):com.instagram.direct.inbox.notes.ui.NoteBubbleView");
    }
}
