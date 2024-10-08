package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.SpannableString;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8uo  reason: invalid class name and case insensitive filesystem */
public final class C369468uo extends Drawable implements C41816B1w {
    public static final ADK A0F = new Object();
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public SpannableString A04;
    public String A05;
    public String A06;
    public final C306386Ly A07;
    public final String A08;
    public final int A09;
    public final Paint A0A;
    public final Rect A0B;
    public final Rect A0C;
    public final String A0D;
    public final String A0E;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0142, code lost:
        r7 = r13.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x015c, code lost:
        r12.A06 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x015e, code lost:
        r12.A05 = r7;
        r6.setTextSize(r12.A01);
        r1 = r12.A06;
        X.0qQ.A0A(r1);
        r6.getTextBounds(r1, 0, r1.length(), r2);
        r7 = r2.height();
        r2 = r2.width();
        r1 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x017d, code lost:
        if (r1 <= 0.0f) goto L_0x01aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x017f, code lost:
        r6.setTextSize(r1);
        r1 = r12.A05;
        X.0qQ.A0A(r1);
        r6.getTextBounds(r1, 0, r1.length(), r5);
        r12.A02 = (r7 + r4) + r5.height();
        r12.A03 = java.lang.Math.max(r2, r5.width());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x01a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x01aa, code lost:
        r12.A02 = r7;
        r12.A03 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01ae, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x00b2, code lost:
        throw new java.lang.IllegalArgumentException("Sticker does not exist");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369468uo(android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, long r17) {
        /*
            r12 = this;
            r8 = 1
            r12.<init>()
            r12.A08 = r14
            r12.A0D = r15
            r10 = r16
            r12.A0E = r10
            java.lang.String r1 = "WITH @"
            java.lang.String r2 = X.002.A0R(r1, r10)
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r2)
            r12.A04 = r0
            android.text.Spannable r0 = X.C306386Ly.A0d
            int r2 = X.AnonymousClass8XF.A01(r13)
            X.6Ly r0 = new X.6Ly
            r0.<init>(r13, r2)
            r12.A07 = r0
            android.graphics.Paint r6 = new android.graphics.Paint
            r6.<init>(r8)
            r12.A0A = r6
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r12.A0C = r2
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r12.A0B = r5
            r0 = -1
            r6.setColor(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r6.setTextAlign(r0)
            X.0qq r3 = X.AnonymousClass0qo.A00(r13)
            X.0qm r0 = X.0qm.A0V
            android.graphics.Typeface r0 = r3.A02(r0)
            r6.setTypeface(r0)
            r0 = 8
            float r0 = X.0nA.A04(r13, r0)
            int r4 = (int) r0
            r12.A09 = r4
            java.lang.String r7 = ""
            r3 = 0
            if (r15 == 0) goto L_0x01a1
            if (r16 == 0) goto L_0x01a1
            java.lang.String r0 = X.002.A0R(r1, r10)
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r0)
            r12.A04 = r11
            android.text.style.UnderlineSpan r9 = new android.text.style.UnderlineSpan
            r9.<init>()
            r1 = 6
            android.text.SpannableString r0 = r12.A04
            int r0 = r0.length()
            r11.setSpan(r9, r1, r0, r3)
            com.instagram.user.model.User r1 = new com.instagram.user.model.User
            r1.<init>(r15, r10)
            android.text.SpannableString r10 = r12.A04
            android.content.res.Resources r0 = r13.getResources()
            X.0qQ.A07(r0)
            X.91O r9 = new X.91O
            r9.<init>((android.content.res.Resources) r0, (com.instagram.user.model.User) r1)
            r1 = 5
            android.text.SpannableString r0 = r12.A04
            int r0 = r0.length()
            r10.setSpan(r9, r1, r0, r3)
        L_0x0098:
            java.util.Calendar r9 = java.util.Calendar.getInstance()
            r0 = r17
            r9.setTimeInMillis(r0)
            int r0 = r14.hashCode()
            r11 = 0
            r10 = 40
            switch(r0) {
                case -1202395993: goto L_0x00b3;
                case -669170199: goto L_0x00ec;
                case 774295986: goto L_0x011d;
                case 1822586332: goto L_0x0147;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            java.lang.String r1 = "Sticker does not exist"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x00b3:
            java.lang.String r0 = "memories_with_date"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00ab
            float r0 = X.0nA.A04(r13, r10)
            r12.A01 = r0
            java.text.DateFormat r1 = java.text.DateFormat.getDateInstance()
            java.util.Date r0 = r9.getTime()
            java.lang.String r1 = r1.format(r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r1.toUpperCase(r0)
            X.0qQ.A07(r0)
            r12.A06 = r0
            r0 = 20
            float r0 = X.0nA.A04(r13, r0)
            r12.A00 = r0
            r0 = 2131965993(0x7f133829, float:1.9568812E38)
            goto L_0x0142
        L_0x00ec:
            java.lang.String r0 = "date_sticker_tray"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00ab
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r0 = "MMM yyyy"
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            r1.<init>(r0, r8)
            float r0 = X.0nA.A04(r13, r10)
            r12.A01 = r0
            java.util.Date r0 = r9.getTime()
            java.lang.String r1 = r1.format(r0)
            X.0qQ.A07(r1)
            java.util.Locale r0 = java.util.Locale.getDefault()
            X.0qQ.A07(r0)
            java.lang.String r0 = r1.toUpperCase(r0)
            X.0qQ.A07(r0)
            goto L_0x015c
        L_0x011d:
            java.lang.String r0 = "on_this_day_with_year"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 65
            float r0 = X.0nA.A04(r13, r0)
            r12.A01 = r0
            int r0 = r9.get(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.A06 = r0
            r0 = 20
            float r0 = X.0nA.A04(r13, r0)
            r12.A00 = r0
            r0 = 2131968789(0x7f134315, float:1.9574483E38)
        L_0x0142:
            java.lang.String r7 = r13.getString(r0)
            goto L_0x015e
        L_0x0147:
            java.lang.String r0 = "on_this_day_sticker_tray"
            boolean r0 = r14.equals(r0)
            if (r0 == 0) goto L_0x00ab
            float r0 = X.0nA.A04(r13, r10)
            r12.A01 = r0
            r0 = 2131968789(0x7f134315, float:1.9574483E38)
            java.lang.String r0 = r13.getString(r0)
        L_0x015c:
            r12.A06 = r0
        L_0x015e:
            r12.A05 = r7
            float r0 = r12.A01
            r6.setTextSize(r0)
            java.lang.String r1 = r12.A06
            X.0qQ.A0A(r1)
            int r0 = r1.length()
            r6.getTextBounds(r1, r3, r0, r2)
            int r7 = r2.height()
            int r2 = r2.width()
            float r1 = r12.A00
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x01aa
            r6.setTextSize(r1)
            java.lang.String r1 = r12.A05
            X.0qQ.A0A(r1)
            int r0 = r1.length()
            r6.getTextBounds(r1, r3, r0, r5)
            int r7 = r7 + r4
            int r0 = r5.height()
            int r7 = r7 + r0
            r12.A02 = r7
            int r0 = r5.width()
            int r0 = java.lang.Math.max(r2, r0)
            r12.A03 = r0
            return
        L_0x01a1:
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r7)
            r12.A04 = r0
            goto L_0x0098
        L_0x01aa:
            r12.A02 = r7
            r12.A03 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369468uo.<init>(android.content.Context, java.lang.String, java.lang.String, java.lang.String, long):void");
    }

    public final void draw(Canvas canvas) {
        int height;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        Paint paint = this.A0A;
        paint.setTextAlign(Paint.Align.CENTER);
        int height2 = getBounds().top + this.A0C.height();
        float f = this.A00;
        if (f > 0.0f) {
            paint.setTextSize(f);
            SpannableString spannableString = this.A04;
            if (spannableString.length() > 0) {
                C306386Ly r6 = this.A07;
                r6.A0L(spannableString);
                r6.A0K(Layout.Alignment.ALIGN_CENTER);
                r6.A0A(f);
                r6.A0F(-1);
                r6.setBounds(getBounds().centerX() - (r6.A0A / 2), getBounds().top, getBounds().centerX() + (r6.A0A / 2), getBounds().top + r6.A06);
                r6.draw(canvas);
                height = r6.A06;
            } else {
                String str = this.A05;
                0qQ.A0A(str);
                0qQ.A0A(str);
                int length = str.length();
                float centerX = (float) getBounds().centerX();
                int i = getBounds().top;
                Rect rect = this.A0B;
                canvas2.drawText(str, 0, length, centerX, (float) (i + rect.height()), paint);
                height = rect.height();
            }
            height2 = height2 + height + this.A09;
        }
        paint.setTextSize(this.A01);
        String str2 = this.A06;
        0qQ.A0A(str2);
        0qQ.A0A(str2);
        canvas2.drawText(str2, 0, str2.length(), (float) getBounds().centerX(), (float) height2, paint);
    }

    public final int getOpacity() {
        return -2;
    }

    public final int BRc() {
        if (this.A0D == null || this.A0E == null) {
            return 0;
        }
        return 1;
    }

    public final List BRk() {
        String str;
        String str2 = this.A0D;
        if (str2 == null || (str = this.A0E) == null) {
            return 0sn.A00;
        }
        List singletonList = Collections.singletonList(new User(str2, str));
        0qQ.A07(singletonList);
        return singletonList;
    }

    public final int getIntrinsicHeight() {
        return this.A02;
    }

    public final int getIntrinsicWidth() {
        return this.A03;
    }

    public final void setAlpha(int i) {
        this.A0A.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0A.setColorFilter(colorFilter);
    }
}
