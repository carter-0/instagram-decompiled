package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;

/* renamed from: X.GHz  reason: case insensitive filesystem */
public final class C52183GHz {
    public static final C52183GHz A00 = new Object();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003a, code lost:
        if (r2.A05.get(r14.A0G) == null) goto L_0x003c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        if (X.C51966G9m.A1W(r3, r0.getId()) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r34 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r75 == false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014e, code lost:
        if (r7 != false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x019c, code lost:
        if (X.182.A06(r4, r3, 36321108199089263L) != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A03(android.content.Context r62, com.instagram.common.session.UserSession r63, X.C247733gp r64, X.AnonymousClass3W1 r65, X.1sy r66, X.AnonymousClass34A r67, com.instagram.search.common.analytics.SearchContext r68, java.lang.Boolean r69, java.lang.String r70, int r71, boolean r72, boolean r73, boolean r74, boolean r75) {
        /*
            r61 = this;
            r11 = 1
            r9 = 0
            r0 = 7
            r10 = r68
            X.0qQ.A0B(r10, r0)
            r5 = r62
            android.text.TextPaint r8 = A01(r5)
            android.text.Layout$Alignment r38 = android.text.Layout.Alignment.ALIGN_NORMAL
            r13 = 0
            r3 = r63
            X.0MB r2 = X.0MB.A05(r3)
            X.0qQ.A07(r2)
            r15 = r65
            if (r65 == 0) goto L_0x01a7
            boolean r7 = r15.A1q
        L_0x0020:
            r14 = r64
            boolean r0 = r14.A0h
            if (r0 == 0) goto L_0x003c
            if (r65 == 0) goto L_0x01a4
            X.3W8 r0 = r15.A3b
            java.lang.Object r1 = r0.A00
        L_0x002c:
            X.3W9 r0 = X.AnonymousClass3W9.Translated
            if (r1 != r0) goto L_0x003c
            java.lang.String r1 = r14.A0G
            android.util.LruCache r0 = r2.A05
            java.lang.Object r0 = r0.get(r1)
            r26 = 1
            if (r0 != 0) goto L_0x01a0
        L_0x003c:
            r26 = 0
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321108199023726(0x8109db000d246e, double:3.0329533062016546E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 != 0) goto L_0x018f
            X.1Xj r0 = r14.A07
            if (r0 == 0) goto L_0x018f
            com.instagram.user.model.User r0 = r0.A2A(r3)
            if (r0 == 0) goto L_0x018f
            r0.getId()
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C51966G9m.A1W(r3, r0)
            if (r0 == 0) goto L_0x018f
        L_0x0062:
            r34 = 1
        L_0x0064:
            r0 = 2130970248(0x7f040688, float:1.75492E38)
            int r1 = X.AnonymousClass7TF.A03(r5, r0)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r1)
            int r0 = X.AnonymousClass7TF.A03(r5, r0)
            java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
            r4 = r70
            if (r70 == 0) goto L_0x007e
            r1 = 1
            if (r75 != 0) goto L_0x007f
        L_0x007e:
            r1 = 0
        L_0x007f:
            r0 = 1
            if (r72 == 0) goto L_0x0164
            if (r73 != 0) goto L_0x0087
            if (r1 == 0) goto L_0x0182
            r0 = 2
        L_0x0087:
            java.lang.Integer r21 = java.lang.Integer.valueOf(r0)
            X.3pw r12 = new X.3pw
            r16 = r66
            r17 = r67
            r35 = r74
            r20 = r13
            r22 = r13
            r23 = r7
            r24 = r9
            r25 = r9
            r27 = r9
            r28 = r11
            r29 = r9
            r30 = r11
            r31 = r9
            r32 = r9
            r33 = r9
            r36 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            boolean r1 = X.0mk.A02(r5)
            boolean r0 = r14.A03()
            java.lang.String r1 = r2.A0F(r5, r12, r1, r0)
            if (r1 != 0) goto L_0x00c0
            java.lang.String r1 = " …"
        L_0x00c0:
            if (r74 == 0) goto L_0x00d6
            android.text.SpannableStringBuilder r0 = X.DbS.A0C(r1)
            X.3pw r12 = new X.3pw
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            android.text.SpannableString r1 = r2.A0C(r5, r12, r10)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L_0x00d6:
            int r0 = r1.length()
            r8.measureText(r1, r9, r0)
            if (r70 == 0) goto L_0x0162
            int r0 = r4.length()
            float r0 = r8.measureText(r4, r9, r0)
            int r0 = (int) r0
        L_0x00e8:
            int r43 = r71 - r0
            r41 = 0
            r42 = 1065353216(0x3f800000, float:1.0)
            X.0rN r37 = new X.0rN
            r39 = r8
            r40 = r13
            r44 = r9
            r37.<init>(r38, r39, r40, r41, r42, r43, r44)
            X.3pw r0 = new X.3pw
            r36 = r0
            r38 = r14
            r39 = r15
            r40 = r16
            r41 = r17
            r42 = r18
            r43 = r19
            r44 = r13
            r45 = r21
            r46 = r13
            r47 = r7
            r48 = r9
            r49 = r9
            r50 = r26
            r51 = r9
            r52 = r11
            r53 = r9
            r54 = r11
            r55 = r9
            r56 = r9
            r57 = r9
            r58 = r34
            r59 = r35
            r60 = r9
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60)
            android.text.SpannableStringBuilder r2 = X.C252923pv.A00(r5, r2, r0, r10, r11)
            X.0qQ.A07(r2)
            if (r65 == 0) goto L_0x0157
            java.lang.Boolean r0 = r15.A0y
            if (r0 != 0) goto L_0x0157
            java.lang.String r0 = r14.A0d
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = r0.toString()
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0150
            r0 = 0
            if (r7 == 0) goto L_0x0151
        L_0x0150:
            r0 = 1
        L_0x0151:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r15.A0y = r0
        L_0x0157:
            if (r70 == 0) goto L_0x0161
            java.lang.StringBuilder r0 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r2, r4, r0)
        L_0x0161:
            return r2
        L_0x0162:
            r0 = 0
            goto L_0x00e8
        L_0x0164:
            r1 = r69
            if (r69 == 0) goto L_0x017a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x017a
            X.0Tu r6 = X.0Tu.A05
            r0 = 36601251735605375(0x8208a50009107f, double:3.2101172067833676E-306)
            goto L_0x0189
        L_0x017a:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36597596718238561(0x82055200060b61, double:3.207805759083021E-306)
            goto L_0x0189
        L_0x0182:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36597596718173024(0x82055200050b60, double:3.207805759041575E-306)
        L_0x0189:
            int r0 = X.DbS.A04(r6, r3, r0)
            goto L_0x0087
        L_0x018f:
            int r0 = r14.A0R
            if (r0 == 0) goto L_0x01a0
            r0 = 36321108199089263(0x8109db000e246f, double:3.0329533062431004E-306)
            boolean r0 = X.182.A06(r4, r3, r0)
            if (r0 == 0) goto L_0x01a0
            goto L_0x0062
        L_0x01a0:
            r34 = 0
            goto L_0x0064
        L_0x01a4:
            r1 = 0
            goto L_0x002c
        L_0x01a7:
            r7 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52183GHz.A03(android.content.Context, com.instagram.common.session.UserSession, X.3gp, X.3W1, X.1sy, X.34A, com.instagram.search.common.analytics.SearchContext, java.lang.Boolean, java.lang.String, int, boolean, boolean, boolean, boolean):java.lang.CharSequence");
    }

    public static final int A00(Resources resources, int i, int i2) {
        int i3;
        int i4 = resources.getDisplayMetrics().widthPixels;
        if (2Y9.A01(resources.getConfiguration().screenWidthDp)) {
            i3 = resources.getDimensionPixelSize(R.dimen.abc_list_item_height_material);
        } else {
            i3 = 0;
        }
        return (((i4 - i3) - i) - i) - i2;
    }

    public static final TextPaint A01(Context context) {
        int color = context.getColor(R.color.design_dark_default_color_on_background);
        int color2 = context.getColor(R.color.debug_overlay_white_70_transparent);
        Resources resources = context.getResources();
        TextPaint textPaint = new TextPaint(1);
        textPaint.linkColor = color2;
        textPaint.setTextSize(resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textPaint.setColor(color);
        return textPaint;
    }

    public static final void A02(UserSession userSession, 1Xj r2, 1sy r3, AnonymousClass34A r4, SearchContext searchContext, HashMap hashMap, boolean z) {
        AnonymousClass1qK r1;
        AnonymousClass7TG.A1N(userSession, r2);
        0qQ.A0B(searchContext, 4);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        if (z) {
            r1 = new C240163Jv(r2, r3, r4);
        } else {
            r1 = new C240153Ju(r2, r3, r4, searchContext, hashMap);
        }
        A002.A00(r1);
    }
}
