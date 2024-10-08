package X;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.util.LruCache;
import com.instagram.search.common.analytics.SearchContext;

/* renamed from: X.3pv  reason: invalid class name and case insensitive filesystem */
public abstract class C252923pv {
    public static SpannableStringBuilder A00(Context context, 0MB r9, C252933pw r10, SearchContext searchContext, boolean z) {
        SpannableStringBuilder A0E;
        int color;
        if (!r10.A0H) {
            if (r10.A03 == 1sy.A07) {
                String A06 = 0MB.A06(context, r10);
                Integer num = r10.A08;
                if (num != null) {
                    A06 = String.format("%s%d", new Object[]{A06, num});
                }
                if (z) {
                    A06 = String.format("%s%b", new Object[]{A06, Boolean.valueOf(z)});
                }
                LruCache lruCache = r9.A02;
                A0E = (SpannableStringBuilder) lruCache.get(A06);
                if (A0E == null) {
                    A0E = 0MB.A03(context, r9, r10, searchContext, z);
                    lruCache.put(A06, A0E);
                }
            } else {
                A0E = 0MB.A03(context, r9, r10, searchContext, z);
            }
        } else if (r10.A0C) {
            String A062 = 0MB.A06(context, r10);
            LruCache lruCache2 = r9.A02;
            A0E = (SpannableStringBuilder) lruCache2.get(A062);
            if (A0E == null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r9.A0D(context, r10));
                if (r10.A03 == 1sy.A0Y) {
                    spannableStringBuilder.setSpan(new HBG(r9, r10), 0, spannableStringBuilder.length(), 33);
                }
                if (0MB.A0A(r9, r10) && !0MB.A0B(r9, r10)) {
                    String string = context.getResources().getString(2131954761);
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append(" ");
                    spannableStringBuilder.append(string);
                    boolean z2 = r10.A0F;
                    Integer num2 = r10.A06;
                    if (num2 != null) {
                        color = num2.intValue();
                    } else {
                        color = context.getColor(2Yu.A08(context));
                    }
                    spannableStringBuilder.setSpan(new HBH(r9, r10, color, z2), length, spannableStringBuilder.length(), 33);
                }
                A0E = new SpannableStringBuilder(spannableStringBuilder);
                0MB.A07(A0E, lruCache2, A062);
            }
        } else if (z) {
            A0E = new SpannableStringBuilder(r9.A0D(context, r10));
            if (r10.A0I) {
                A0E.append(r9.A0C(context, r10, searchContext));
            }
        } else {
            A0E = r9.A0E(context, r10, searchContext);
        }
        if (!C70572Rz.A01 && (A0E instanceof Spannable)) {
            C70572Rz.A00().A8K(A0E, -1, false);
        }
        return A0E;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004b, code lost:
        if (r1 == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (r0 != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.StaticLayout A01(android.content.Context r30, com.instagram.common.session.UserSession r31, X.0rN r32, X.C247733gp r33, X.1sy r34, java.lang.Integer r35, java.lang.Integer r36, java.lang.Integer r37, int r38, boolean r39, boolean r40) {
        /*
            boolean r0 = X.2Y9.A00
            r10 = r30
            r12 = r32
            if (r0 == 0) goto L_0x0038
            android.content.res.Resources r2 = r10.getResources()
            int r1 = X.AnonymousClass0nB.A01(r10)
            r0 = 2131165231(0x7f07002f, float:1.7944673E38)
            int r0 = r2.getDimensionPixelSize(r0)
            int r0 = r0 * 2
            int r1 = r1 - r0
            r12.A00 = r1
            android.content.res.Configuration r0 = r2.getConfiguration()
            int r0 = r0.screenWidthDp
            java.lang.Integer r0 = X.AnonymousClass2YH.A00(r0)
            boolean r0 = X.2Y9.A02(r0)
            if (r0 == 0) goto L_0x0038
            r0 = 2131165209(0x7f070019, float:1.7944629E38)
            int r1 = r2.getDimensionPixelSize(r0)
            int r0 = r12.A00
            int r0 = r0 - r1
            r12.A00 = r0
        L_0x0038:
            r13 = r33
            java.lang.Integer r8 = r13.A0Z
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r3 = 1
            r2 = 0
            if (r8 != r7) goto L_0x004d
            r1 = 1
            int r0 = r38 >> r3
            r0 = r0 & 1
            if (r0 == r3) goto L_0x004a
            r1 = 0
        L_0x004a:
            r6 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r6 = 0
        L_0x004e:
            int r0 = r38 >> 2
            r4 = 1
            r0 = r0 & 1
            if (r0 == r3) goto L_0x0056
            r4 = 0
        L_0x0056:
            r5 = r31
            if (r4 != 0) goto L_0x00f6
            X.0qQ.A0B(r5, r2)
            X.0Tu r9 = X.0Tu.A05
            r0 = 36321108198761578(0x8109db0009246a, double:3.032953306035871E-306)
            boolean r0 = X.182.A06(r9, r5, r0)
            r11 = 0
            if (r0 != 0) goto L_0x0082
            X.1Xj r0 = r13.A07
            if (r0 == 0) goto L_0x0082
            com.instagram.user.model.User r0 = r0.A2A(r5)
            if (r0 == 0) goto L_0x0082
            java.lang.String r1 = r0.getId()
            java.lang.String r0 = r5.A06
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0082
            r11 = 1
        L_0x0082:
            if (r11 != 0) goto L_0x008b
            int r0 = r13.A0R
            if (r0 != 0) goto L_0x00ec
            r0 = 0
        L_0x0089:
            if (r0 == 0) goto L_0x00f6
        L_0x008b:
            r33 = 1
        L_0x008d:
            r14 = 0
            r0 = 0
            r9 = 1
            r1 = r38 & 1
            if (r1 == r3) goto L_0x0095
            r9 = 0
        L_0x0095:
            if (r8 != r7) goto L_0x009a
            if (r9 == 0) goto L_0x009a
            r2 = 1
        L_0x009a:
            if (r2 == 0) goto L_0x00a3
            if (r40 != 0) goto L_0x00a3
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00a3:
            r7 = 0
            if (r0 != 0) goto L_0x00e7
            boolean r0 = r13.A0o
            r23 = 0
            if (r0 != 0) goto L_0x00ae
            r23 = 1
        L_0x00ae:
            X.3pw r11 = new X.3pw
            r15 = r34
            r19 = r35
            r17 = r36
            r18 = r37
            r24 = r39
            r16 = r14
            r20 = r14
            r21 = r14
            r22 = r6
            r25 = r4
            r26 = r7
            r27 = r7
            r28 = r3
            r29 = r7
            r30 = r7
            r31 = r7
            r32 = r7
            r34 = r7
            r35 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            X.0MB r1 = X.0MB.A05(r5)
            com.instagram.search.common.analytics.SearchContext r0 = new com.instagram.search.common.analytics.SearchContext
            r0.<init>()
            android.text.SpannableStringBuilder r7 = A00(r10, r1, r11, r0, r7)
            goto L_0x00f9
        L_0x00e7:
            boolean r23 = r0.booleanValue()
            goto L_0x00ae
        L_0x00ec:
            r0 = 36321108198630504(0x8109db00072468, double:3.0329533059529794E-306)
            boolean r0 = X.182.A06(r9, r5, r0)
            goto L_0x0089
        L_0x00f6:
            r33 = 0
            goto L_0x008d
        L_0x00f9:
            android.text.TextPaint r11 = r12.A04     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            int r9 = r12.A00     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            android.text.Layout$Alignment r20 = android.text.Layout.Alignment.ALIGN_NORMAL     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            float r5 = r12.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            float r1 = r12.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            boolean r0 = r12.A06     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            android.text.StaticLayout r16 = new android.text.StaticLayout     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            r21 = r5
            r22 = r1
            r23 = r0
            r17 = r7
            r18 = r11
            r19 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x0117 }
            return r16
        L_0x0117:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "OutOfBounds when creating new StaticLayout for mComment text: "
            r1.append(r0)
            java.lang.String r0 = r13.A0d
            r1.append(r0)
            java.lang.String r0 = "generated mComment text:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", mComment type: "
            r1.append(r0)
            int r0 = r8.intValue()
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x017b
            java.lang.String r0 = "Normal"
        L_0x013e:
            r1.append(r0)
            java.lang.String r0 = ", media surface: "
            r1.append(r0)
            java.lang.String r0 = r15.name()
            r1.append(r0)
            java.lang.String r0 = ", mShouldExpand: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", mForceHideUsername: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", mShowTranslatedText: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", isRTL: "
            r1.append(r0)
            boolean r0 = X.0mk.A02(r10)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MediaRenderer OutOfBounds"
            X.0wb.A04(r0, r1, r3)
            throw r5
        L_0x017b:
            java.lang.String r0 = "Caption"
            goto L_0x013e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252923pv.A01(android.content.Context, com.instagram.common.session.UserSession, X.0rN, X.3gp, X.1sy, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, boolean, boolean):android.text.StaticLayout");
    }
}
