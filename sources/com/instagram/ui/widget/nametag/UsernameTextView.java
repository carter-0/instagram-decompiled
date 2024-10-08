package com.instagram.ui.widget.nametag;

import X.0qm;
import X.AnonymousClass0qo;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Locale;

public class UsernameTextView extends TextView {
    public String A00;
    public Drawable A01;
    public String A02;

    /* JADX WARNING: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(com.instagram.ui.widget.nametag.UsernameTextView r18, java.lang.String r19, java.lang.String[] r20, int r21, int r22) {
        /*
            if (r21 == 0) goto L_0x00b6
            r13 = r19
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00b6
            r4 = r18
            android.text.TextPaint r14 = r4.getPaint()
            android.text.Layout$Alignment r16 = android.text.Layout.Alignment.ALIGN_CENTER
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r2 = 0
            android.text.StaticLayout r12 = new android.text.StaticLayout
            r15 = r22
            r19 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5 = 0
        L_0x0026:
            int r0 = r12.getLineCount()
            if (r5 >= r0) goto L_0x003e
            int r1 = r12.getLineStart(r5)
            int r0 = r12.getLineEnd(r5)
            java.lang.String r0 = r13.substring(r1, r0)
            r8.add(r0)
            int r5 = r5 + 1
            goto L_0x0026
        L_0x003e:
            int r0 = r8.size()
            r5 = 1
            r6 = r20
            if (r0 != r5) goto L_0x004d
            r0 = 3
            int r0 = r0 - r21
            r20[r0] = r13
            return
        L_0x004d:
            java.lang.Object r10 = r8.get(r2)
            java.lang.String r10 = (java.lang.String) r10
            int r7 = r10.length()
            r12 = 95
            int r1 = r10.lastIndexOf(r12)
            r11 = 46
            int r0 = r10.lastIndexOf(r11)
            int r9 = java.lang.Math.max(r1, r0)
            if (r9 <= 0) goto L_0x008c
            r1 = r9
        L_0x006a:
            char r0 = r10.charAt(r1)
            if (r0 == r12) goto L_0x0087
            if (r0 == r11) goto L_0x0087
            int r7 = r9 + 1
        L_0x0074:
            r1 = 3
            int r1 = r1 - r21
            java.lang.String r0 = r13.substring(r2, r7)
            r20[r1] = r0
            java.lang.String r0 = r13.substring(r7)
            int r3 = r21 - r5
            A01(r4, r0, r6, r3, r15)
            return
        L_0x0087:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x008c
            goto L_0x006a
        L_0x008c:
            java.lang.String r0 = r4.A02
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00a3
            java.lang.String r0 = r4.A02
            int r1 = r10.lastIndexOf(r0)
            if (r1 < 0) goto L_0x00a3
            int r0 = r0.length()
            int r7 = r1 + r0
            goto L_0x0074
        L_0x00a3:
            int r1 = r8.size()
            r0 = 2
            if (r1 != r0) goto L_0x0074
            int r0 = r13.length()
            float r1 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            int r7 = X.JTO.A04(r1, r0)
            goto L_0x0074
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.ui.widget.nametag.UsernameTextView.A01(com.instagram.ui.widget.nametag.UsernameTextView, java.lang.String, java.lang.String[], int, int):void");
    }

    public void setName(String str, String str2) {
        this.A00 = str;
        if (!TextUtils.isEmpty(str2)) {
            String trim = str2.trim();
            int indexOf = trim.indexOf(32);
            if (indexOf > 0) {
                trim = trim.substring(0, indexOf);
            }
            this.A02 = trim;
            this.A02 = trim.toUpperCase(Locale.US);
        }
    }

    public UsernameTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        Context context = getContext();
        this.A01 = context.getDrawable(R.drawable.nametag_card_glyph);
        setTextSize(0, (float) context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width));
        setTypeface(AnonymousClass0qo.A00(context).A02(0qm.A0W));
        setAllCaps(true);
        setIncludeFontPadding(false);
        setGravity(17);
        setLetterSpacing(0.03f);
    }

    public UsernameTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public UsernameTextView(Context context) {
        super(context);
        A00();
    }
}
