package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
import com.instagram.model.people.PeopleTag;

/* renamed from: X.Vop  reason: case insensitive filesystem */
public abstract class C18274Vop {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.StringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0131  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.text.SpannableStringBuilder A00(android.content.Context r15, X.0rN r16, com.instagram.user.model.Product r17, int r18, boolean r19, boolean r20) {
        /*
            r5 = r17
            r2 = r18
            com.instagram.api.schemas.ProductReviewStatus r1 = r5.A05
            com.instagram.api.schemas.ProductReviewStatus r0 = com.instagram.api.schemas.ProductReviewStatus.APPROVED
            boolean r7 = X.AnonymousClass7TF.A1W(r1, r0)
            android.text.SpannableStringBuilder r4 = new android.text.SpannableStringBuilder
            r4.<init>()
            java.lang.String r6 = " "
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r6)
            r14 = 0
            r13 = 1
            if (r2 <= r13) goto L_0x002b
            int r2 = r18 - r13
            java.lang.Object[] r1 = X.AnonymousClass7TF.A1b(r2)
            java.lang.String r0 = "+%d"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r3.append(r0)
        L_0x002b:
            r2 = r20
            if (r19 == 0) goto L_0x0142
            r6 = 2132017748(0x7f140254, float:1.9673783E38)
            com.instagram.user.model.User r0 = r5.A0B
            if (r0 == 0) goto L_0x013e
            java.lang.String r1 = r0.getUsername()
        L_0x003a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.CharSequence r0 = X.C324476zN.A09(r15, r1, r0)
            if (r0 == 0) goto L_0x0047
            r3.append(r0)
        L_0x0047:
            boolean r0 = r5.A04()
            android.content.res.Resources r1 = r15.getResources()
            if (r0 == 0) goto L_0x0131
            r0 = 2131165200(0x7f070010, float:1.794461E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.text.SpannableStringBuilder r0 = X.W2t.A01(r15, r0)
        L_0x005c:
            r3.append(r0)
            java.lang.String r11 = r5.A0J
            java.lang.String r12 = "…"
            r7 = 2
            if (r11 != 0) goto L_0x007c
            java.lang.String r11 = ""
        L_0x0068:
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>(r11)
            X.6Jl r0 = new X.6Jl
            r0.<init>()
            X.C51971G9r.A0y(r1, r0, r14)
            r4.append(r1)
            r4.append(r3)
            return r4
        L_0x007c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r12)
            android.text.SpannableStringBuilder r6 = r0.append(r3)
            r9 = r16
            android.text.StaticLayout r1 = r9.A00(r11)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r11)
            android.text.SpannableStringBuilder r0 = r0.append(r3)
            android.text.StaticLayout r0 = r9.A00(r0)
            int r0 = r0.getLineCount()
            if (r0 <= r7) goto L_0x0068
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r3)
            android.text.StaticLayout r0 = r9.A00(r0)
            int r0 = r0.getLineCount()
            if (r0 < r7) goto L_0x00c1
            java.lang.String r10 = ""
            java.lang.CharSequence r0 = X.C252993q2.A01(r9, r10, r11, r12, r13, r14)
        L_0x00b8:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r12)
            goto L_0x0068
        L_0x00c1:
            int r0 = r1.getLineCount()
            if (r0 < r7) goto L_0x00db
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r6)
            android.text.StaticLayout r0 = r9.A00(r0)
            int r0 = r0.getLineCount()
            if (r0 != r13) goto L_0x00db
            java.lang.CharSequence r0 = X.VH5.A00(r1, r6, r9, r2, r7)
            goto L_0x00b8
        L_0x00db:
            int r8 = r2.length()
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r2)
            android.text.SpannableStringBuilder r5 = r0.append(r6)
            android.text.TextPaint r1 = r9.A04
            r1.setFakeBoldText(r13)
        L_0x00ed:
            int r0 = r2.length()
            if (r0 <= r13) goto L_0x0110
            android.text.StaticLayout r0 = r9.A00(r5)
            int r0 = r0.getLineCount()
            if (r0 <= r7) goto L_0x0110
            r0 = -1
            int r8 = r2.offsetByCodePoints(r8, r0)
            r2.setLength(r8)
            r5.clear()
            android.text.SpannableStringBuilder r0 = r5.append(r2)
            r0.append(r6)
            goto L_0x00ed
        L_0x0110:
            r1.setFakeBoldText(r14)
            int r1 = r2.length()
        L_0x0117:
            if (r1 <= 0) goto L_0x0128
            int r0 = r1 + -1
            char r0 = r2.charAt(r0)
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L_0x0128
            int r1 = r1 + -1
            goto L_0x0117
        L_0x0128:
            r2.setLength(r1)
            r2.append(r12)
            r11 = r2
            goto L_0x0068
        L_0x0131:
            r0 = 2131165230(0x7f07002e, float:1.7944671E38)
            int r0 = r1.getDimensionPixelSize(r0)
            android.text.SpannableStringBuilder r0 = X.W2t.A02(r15, r0, r2)
            goto L_0x005c
        L_0x013e:
            java.lang.String r1 = ""
            goto L_0x003a
        L_0x0142:
            if (r7 == 0) goto L_0x015e
            boolean r0 = r5.A05()
            if (r0 == 0) goto L_0x0047
            X.0qQ.A0B(r15, r14)
            r0 = 2131968786(0x7f134312, float:1.9574476E38)
            if (r20 == 0) goto L_0x0155
            r0 = 2131968788(0x7f134314, float:1.957448E38)
        L_0x0155:
            java.lang.String r1 = X.C51967G9n.A0p(r15, r0)
            r6 = 2132018054(0x7f140386, float:1.9674404E38)
            goto L_0x003a
        L_0x015e:
            java.lang.String r0 = "﻿"
            r3.append(r0)
            java.lang.String r0 = "·"
            r3.append(r0)
            r2 = 2132017748(0x7f140254, float:1.9673783E38)
            android.text.style.TextAppearanceSpan r1 = new android.text.style.TextAppearanceSpan
            r1.<init>(r15, r2)
            int r0 = r3.length()
            int r0 = r0 + -1
            X.C51971G9r.A0y(r3, r1, r0)
            r3.append(r6)
            r0 = 2132017958(0x7f140326, float:1.967421E38)
            android.text.SpannableString r0 = X.C324476zN.A01(r15, r5, r2, r0)
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C18274Vop.A00(android.content.Context, X.0rN, com.instagram.user.model.Product, int, boolean, boolean):android.text.SpannableStringBuilder");
    }

    public static SpannableStringBuilder A01(Context context, PeopleTag peopleTag) {
        String str;
        if (!peopleTag.A07().A1f() || !peopleTag.A02 || peopleTag.A08() == null) {
            str = null;
        } else {
            str = peopleTag.A08();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(peopleTag.A00.A04);
        spannableStringBuilder.setSpan(new CharacterStyle(), 0, spannableStringBuilder.length(), 33);
        if (str != null) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("\n");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append(str);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(context.getResources().getColor(2Yu.A08(context))), length, spannableStringBuilder2.length(), 0);
            spannableStringBuilder.append(spannableStringBuilder2);
        }
        return spannableStringBuilder;
    }
}
