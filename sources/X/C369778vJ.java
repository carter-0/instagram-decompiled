package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.UpcomingEvent;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8vJ  reason: invalid class name and case insensitive filesystem */
public class C369778vJ extends Drawable implements C268684dp, AnonymousClass1MK, C300645xY, C321036tT, C369788vK, B1L {
    public float A00;
    public float A01 = 1.0f;
    public float A02 = 1.0f;
    public float A03;
    public Bitmap A04;
    public Bitmap A05;
    public AnonymousClass9XA A06;
    public String A07;
    public String A08;
    public boolean A09;
    public float A0A;
    public int A0B;
    public Integer A0C;
    public final float A0D;
    public final float A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final Context A0J;
    public final Paint A0K;
    public final Paint A0L;
    public final Paint A0M;
    public final Paint A0N;
    public final Paint A0O;
    public final Paint A0P;
    public final Path A0Q;
    public final Path A0R;
    public final Path A0S;
    public final Rect A0T;
    public final Rect A0U;
    public final Rect A0V;
    public final RectF A0W;
    public final RectF A0X;
    public final Drawable A0Y;
    public final Layout A0Z;
    public final StaticLayout A0a;
    public final TextPaint A0b;
    public final C15904UkT A0c;
    public final 1iA A0d;
    public final ProductType A0e;
    public final C306386Ly A0f;
    public final C306386Ly A0g;
    public final Integer A0h;
    public final Runnable A0i;
    public final AnonymousClass0eM A0j;
    public final AnonymousClass0eM A0k;
    public final AnonymousClass0eM A0l;
    public final boolean A0m;
    public final int A0n;
    public final int A0o;
    public final Resources A0p;
    public final Drawable A0q;
    public final Drawable A0r;
    public final UserSession A0s;
    public final 1sw A0t;
    public final UpcomingEvent A0u;
    public final Integer A0v;
    public final CopyOnWriteArraySet A0w;

    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0510, code lost:
        if (r17 == null) goto L_0x04f5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x032a  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x035e  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x03e6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369778vJ(android.content.Context r33, android.graphics.drawable.Drawable r34, android.graphics.drawable.Drawable r35, android.text.Layout r36, com.instagram.common.session.UserSession r37, com.instagram.common.typedurl.ImageUrl r38, X.C15904UkT r39, X.1iA r40, X.1sw r41, com.instagram.model.mediatype.ProductType r42, com.instagram.user.model.UpcomingEvent r43, java.lang.Integer r44, java.lang.Integer r45, boolean r46) {
        /*
            r32 = this;
            r3 = 1
            r25 = 2
            r9 = 3
            r6 = r32
            r6.<init>()
            r4 = r39
            r6.A0c = r4
            r5 = r33
            r6.A0J = r5
            r31 = r37
            r0 = r31
            r6.A0s = r0
            r8 = r44
            r6.A0h = r8
            r0 = r40
            r6.A0d = r0
            r0 = r42
            r6.A0e = r0
            r0 = r41
            r6.A0t = r0
            r1 = r36
            r6.A0Z = r1
            r30 = r34
            r0 = r30
            r6.A0Y = r0
            r23 = r35
            r0 = r23
            r6.A0q = r0
            r0 = r45
            r6.A0v = r0
            r0 = r43
            r6.A0u = r0
            r2 = 1065353216(0x3f800000, float:1.0)
            r6.A02 = r2
            r6.A01 = r2
            android.content.res.Resources r29 = r5.getResources()
            r0 = r29
            r6.A0p = r0
            r7 = 2131165190(0x7f070006, float:1.794459E38)
            float r0 = r0.getDimension(r7)
            r6.A0E = r0
            r22 = 0
            if (r34 != 0) goto L_0x005c
            r22 = 1
        L_0x005c:
            r0 = r22
            r6.A0m = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.A0U = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r9)
            r6.A0O = r0
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>(r9)
            r6.A0P = r7
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r9)
            r6.A0M = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r3)
            r6.A0L = r0
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r9)
            r6.A0N = r0
            android.text.TextPaint r11 = new android.text.TextPaint
            r11.<init>(r3)
            r6.A0b = r11
            android.graphics.RectF r12 = new android.graphics.RectF
            r12.<init>()
            r6.A0X = r12
            android.graphics.Rect r28 = new android.graphics.Rect
            r28.<init>()
            r0 = r28
            r6.A0V = r0
            android.graphics.Rect r27 = new android.graphics.Rect
            r27.<init>()
            r0 = r27
            r6.A0T = r0
            X.Aix r24 = new X.Aix
            r0 = r24
            r0.<init>(r6)
            r6.A0i = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.A0S = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.A0R = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r6.A0Q = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r6.A0w = r0
            r0 = 6
            float r0 = X.0nA.A04(r5, r0)
            r6.A0D = r0
            r0 = 12
            float r0 = X.0nA.A04(r5, r0)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r6.A0n = r0
            r10 = 17
            X.MMT r0 = new X.MMT
            r0.<init>(r6, r10)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A0l = r0
            r20 = 16
            X.MMT r10 = new X.MMT
            r0 = r20
            r10.<init>(r6, r0)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r10)
            r6.A0k = r0
            r10 = 15
            X.MMT r0 = new X.MMT
            r0.<init>(r6, r10)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r6.A0j = r0
            r0 = 12
            float r0 = X.0nA.A04(r5, r0)
            r6.A00 = r0
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            r6.A0C = r10
            r0 = 0
            if (r36 != 0) goto L_0x011b
            r0 = 1
        L_0x011b:
            r6.A09 = r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r0)
            r0 = 1056964608(0x3f000000, float:0.5)
            float r0 = X.0nA.A00(r5, r0)
            r7.setStrokeWidth(r0)
            r0 = 1112276992(0x424c0000, float:51.0)
            int r1 = X.AnonymousClass1GB.A01(r0)
            r0 = 255(0xff, float:3.57E-43)
            int r0 = android.graphics.Color.argb(r1, r0, r0, r0)
            r7.setColor(r0)
            r26 = 1073741824(0x40000000, float:2.0)
            if (r8 != r10) goto L_0x0517
            r0 = 32
            float r0 = X.0nA.A04(r5, r0)
            int r0 = X.AnonymousClass1GB.A01(r0)
            float r0 = (float) r0
            r6.A03 = r0
            r0 = 0
            r6.A0F = r0
            r1 = 13
            float r0 = X.0nA.A04(r5, r1)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r6.A0G = r0
            float r0 = X.0nA.A04(r5, r1)
            int r0 = X.AnonymousClass1GB.A01(r0)
            r6.A0H = r0
        L_0x0164:
            int r0 = r4.A03
            r6.A0I = r0
            float r0 = r6.A03
            r7 = 0
            r12.set(r7, r7, r0, r0)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>(r9)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            int r0 = r5.getColor(r0)
            r1.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r1.setStyle(r0)
            r6.A0K = r1
            java.lang.String r0 = r4.A0I
            r19 = r0
            if (r0 == 0) goto L_0x0513
            int r18 = r19.length()
        L_0x018e:
            java.lang.String r0 = r4.A0H
            r17 = r0
            int r0 = r4.A04
            X.6Ly r1 = new X.6Ly
            r1.<init>(r5, r0)
            r6.A0g = r1
            android.text.TextPaint r0 = r1.A0b
            r13 = r0
            r0.setFakeBoldText(r3)
            java.lang.String r16 = "…"
            r0 = r16
            r1.A0N(r0, r3, r3)
            if (r46 == 0) goto L_0x04e1
            java.lang.String r0 = ""
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r0)
            r1.A0L(r12)
        L_0x01b4:
            r12 = 0
            r15 = r18
            r14 = r28
            r0 = r19
            r13.getTextBounds(r0, r12, r15, r14)
            r21 = 0
            if (r17 == 0) goto L_0x04db
            int r0 = r4.A04
            X.6Ly r14 = new X.6Ly
            r14.<init>(r5, r0)
            r6.A0f = r14
            android.text.SpannableString r13 = new android.text.SpannableString
            r0 = r17
            r13.<init>(r0)
            r14.A0L(r13)
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r13 = 2131165207(0x7f070017, float:1.7944625E38)
            if (r8 != r0) goto L_0x01df
            r13 = 2131165231(0x7f07002f, float:1.7944673E38)
        L_0x01df:
            r0 = r29
            float r0 = r0.getDimension(r13)
            r14.A0A(r0)
            r0 = r16
            r14.A0N(r0, r3, r3)
        L_0x01ed:
            boolean r0 = r6.A07()
            if (r0 == 0) goto L_0x0220
            android.content.Context r14 = r6.A0J
            r0 = 2131976628(0x7f1361b4, float:1.9590382E38)
            java.lang.String r15 = r14.getString(r0)
            X.0qQ.A07(r15)
            X.UkT r0 = r6.A0c
            int r0 = r0.A04
            X.9XA r13 = new X.9XA
            r13.<init>(r14, r15, r0)
            X.6Ly r0 = r13.A01
            r15 = r0
            android.text.TextPaint r0 = r0.A0b
            r0.setFakeBoldText(r3)
            r0 = 14
            float r14 = X.0nA.A04(r14, r0)
            r15.A0A(r14)
            X.6Ly r0 = r13.A02
            r0.A0A(r14)
            r6.A06 = r13
        L_0x0220:
            android.text.TextPaint r0 = new android.text.TextPaint
            r0.<init>(r3)
            if (r8 != r10) goto L_0x042f
            r13 = r20
            float r17 = X.0nA.A04(r5, r13)
            r13 = r17
            r0.setTextSize(r13)
            X.0qq r13 = X.AnonymousClass0qo.A00(r5)
            X.0qm r14 = X.0qm.A13
            android.graphics.Typeface r13 = r13.A02(r14)
            r0.setTypeface(r13)
            r15 = -1
            r0.setColor(r15)
            r13 = r25
            float r14 = X.0nA.A04(r5, r13)
            r16 = 1120665600(0x42cc0000, float:102.0)
            int r13 = X.AnonymousClass1GB.A01(r16)
            int r13 = android.graphics.Color.argb(r13, r12, r12, r12)
            r0.setShadowLayer(r14, r7, r7, r13)
            r13 = r17
            r11.setTextSize(r13)
            r11.setColor(r15)
            r15 = r18
            r14 = r28
            r13 = r19
            r11.getTextBounds(r13, r12, r15, r14)
            java.lang.String r15 = r4.A08
            X.UkT r13 = r6.A0c
            java.lang.String r13 = r13.A08
            if (r13 == 0) goto L_0x0534
            int r14 = r13.length()
            r13 = r27
            r11.getTextBounds(r15, r12, r14, r13)
            r13 = r25
            float r14 = X.0nA.A04(r5, r13)
            int r13 = X.AnonymousClass1GB.A01(r16)
            int r13 = android.graphics.Color.argb(r13, r12, r12, r12)
            r11.setShadowLayer(r14, r7, r7, r13)
        L_0x0289:
            X.UkT r11 = r6.A0c
            int r14 = r11.A04
            java.lang.Integer r13 = r6.A0h
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            r17 = 0
            if (r13 != r11) goto L_0x0422
            r16 = 1
            r13 = 0
        L_0x0298:
            int r15 = r6.A0I
            if (r15 <= 0) goto L_0x041f
            int r11 = r6.A0G
            int r11 = r11 + 2
            int r15 = r15 + r11
        L_0x02a1:
            X.9XA r11 = r6.A06
            if (r11 == 0) goto L_0x02a9
            int r17 = r11.getIntrinsicWidth()
        L_0x02a9:
            int r14 = r14 - r13
            int r14 = r14 - r15
            int r14 = r14 - r17
            int r11 = r6.A0G
            int r11 = r11 * 2
            int r14 = r14 - r11
            if (r16 == 0) goto L_0x02c2
            X.6Ly r11 = r6.A0f
            if (r11 == 0) goto L_0x02c2
            float r13 = (float) r14
            float r11 = r6.A0E
            float r13 = r13 - r11
            float r13 = r13 / r26
            int r14 = X.AnonymousClass1GB.A01(r13)
        L_0x02c2:
            r1.A0E(r14)
            X.6Ly r1 = r6.A0f
            if (r1 == 0) goto L_0x02cc
            r1.A0E(r14)
        L_0x02cc:
            int r1 = r4.A04
            float r11 = (float) r1
            if (r8 != r10) goto L_0x0415
            if (r34 != 0) goto L_0x0410
            r1 = 1059363750(0x3f249ba6, float:0.643)
            float r1 = r11 / r1
        L_0x02d8:
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r7, r7, r11, r1)
        L_0x02dd:
            r6.A0W = r13
            android.graphics.Path r14 = r6.A0S
            r14.reset()
            java.lang.Integer r15 = r6.A0h
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r20 = 7
            r19 = 6
            r18 = 5
            r17 = 4
            r1 = 8
            if (r15 != r11) goto L_0x03ea
            boolean r11 = r6.A09
            if (r11 == 0) goto L_0x03ea
            float r11 = r6.A00
            int r16 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r16 <= 0) goto L_0x03ea
            android.graphics.RectF r15 = r6.A0W
            float[] r1 = new float[r1]
            r1[r12] = r7
            r1[r3] = r7
            r1[r25] = r7
            r1[r9] = r7
            r1[r17] = r11
            r1[r18] = r11
            r1[r19] = r11
            r1[r20] = r11
            android.graphics.Path$Direction r9 = android.graphics.Path.Direction.CW
            r14.addRoundRect(r15, r1, r9)
        L_0x0317:
            r6.A01()
            float r9 = r13.width()
            int r1 = r6.A0G
            float r1 = (float) r1
            float r1 = r1 * r26
            float r9 = r9 - r1
            int r16 = X.AnonymousClass1GB.A01(r9)
            if (r8 != r10) goto L_0x03e6
            java.lang.String r1 = r4.A0G
            android.text.Layout$Alignment r17 = android.text.Layout.Alignment.ALIGN_NORMAL
            android.text.StaticLayout r13 = new android.text.StaticLayout
            r14 = r1
            r15 = r0
            r18 = r2
            r19 = r7
            r20 = r3
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
        L_0x033b:
            r6.A0a = r13
            r0 = 48
            float r0 = X.0nA.A04(r5, r0)
            int r7 = (int) r0
            r6.A0o = r7
            android.graphics.drawable.Drawable r0 = r6.A0Y
            r5 = 0
            if (r0 != 0) goto L_0x035a
            X.1iA r1 = r6.A0d
            X.1iA r0 = X.1iA.A0a
            if (r1 != r0) goto L_0x03c4
            android.content.Context r1 = r6.A0J
            r0 = 2131237425(0x7f081a31, float:1.80911E38)
        L_0x0356:
            android.graphics.drawable.Drawable r5 = r1.getDrawable(r0)
        L_0x035a:
            r6.A0r = r5
            if (r5 == 0) goto L_0x0361
            r5.setBounds(r12, r12, r7, r7)
        L_0x0361:
            if (r35 == 0) goto L_0x03ad
            android.graphics.Bitmap r0 = X.1MF.A0D(r23)
            r6.A05 = r0
            X.11Z.A02(r24)
        L_0x036c:
            if (r22 == 0) goto L_0x039b
            X.0Tu r1 = X.0Tu.A05
            r4 = 36326159079716417(0x810e7300003641, double:3.0361475034899764E-306)
            r0 = r31
            boolean r0 = X.182.A06(r1, r0, r4)
            java.lang.String r4 = "media"
            X.1NK r1 = X.1NK.A00()
            r5 = r38
            if (r0 == 0) goto L_0x039e
            r0 = r21
            X.1OO r0 = r1.A0J(r5, r0)
            r0.A08 = r4
            r0.A02(r6)
            r0.A0F = r3
            r0.A0G = r3
            X.2iF r0 = r0.A00()
            r0.E5t()
        L_0x039b:
            r6.A0A = r2
            return
        L_0x039e:
            r0 = r21
            X.1OO r0 = r1.A0J(r5, r0)
            r0.A08 = r4
            r0.A02(r6)
            r0.A01()
            goto L_0x039b
        L_0x03ad:
            X.1NK r5 = X.1NK.A00()
            com.instagram.common.typedurl.ImageUrl r1 = r4.A05
            r0 = r21
            X.1OO r1 = r5.A0J(r1, r0)
            java.lang.String r0 = "profile_pic"
            r1.A08 = r0
            r1.A02(r6)
            r1.A01()
            goto L_0x036c
        L_0x03c4:
            X.1iA r0 = X.1iA.A09
            if (r1 != r0) goto L_0x03ce
            android.content.Context r1 = r6.A0J
            r0 = 2131237287(0x7f0819a7, float:1.809082E38)
            goto L_0x0356
        L_0x03ce:
            X.UkT r1 = r6.A0c
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x03db
            android.content.Context r1 = r6.A0J
            r0 = 2131238784(0x7f081f80, float:1.8093856E38)
            goto L_0x0356
        L_0x03db:
            java.lang.String r0 = r1.A0D
            if (r0 == 0) goto L_0x035a
            android.content.Context r1 = r6.A0J
            r0 = 2131238218(0x7f081d4a, float:1.8092708E38)
            goto L_0x0356
        L_0x03e6:
            r13 = r21
            goto L_0x033b
        L_0x03ea:
            android.graphics.RectF r11 = r6.A0W
            if (r15 != r10) goto L_0x0409
            float[] r15 = new float[r1]
            float r1 = r6.A00
            r15[r12] = r1
            r15[r3] = r1
            r15[r25] = r1
            r15[r9] = r1
            r15[r17] = r1
            r15[r18] = r1
            r15[r19] = r1
            r15[r20] = r1
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r14.addRoundRect(r11, r15, r1)
            goto L_0x0317
        L_0x0409:
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r14.addRect(r11, r1)
            goto L_0x0317
        L_0x0410:
            int r1 = r4.A00
            float r1 = (float) r1
            goto L_0x02d8
        L_0x0415:
            int r1 = r4.A00
            float r1 = (float) r1
            android.graphics.RectF r13 = new android.graphics.RectF
            r13.<init>(r7, r7, r11, r1)
            goto L_0x02dd
        L_0x041f:
            r15 = 0
            goto L_0x02a1
        L_0x0422:
            r16 = 0
            float r11 = r6.A03
            int r13 = X.AnonymousClass1GB.A01(r11)
            int r11 = r6.A0G
            int r13 = r13 + r11
            goto L_0x0298
        L_0x042f:
            android.graphics.Path r15 = r6.A0R
            r15.reset()
            X.UkT r11 = r6.A0c
            int r11 = r11.A04
            float r13 = (float) r11
            int r11 = r6.A0F
            float r14 = (float) r11
            float r11 = r6.A02
            float r14 = r14 * r11
            int r11 = (int) r14
            float r11 = (float) r11
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r7, r7, r13, r11)
            r11 = 8
            float[] r13 = new float[r11]
            float r11 = r6.A00
            r13[r12] = r11
            r13[r3] = r11
            r13[r25] = r11
            r13[r9] = r11
            r11 = 4
            r13[r11] = r7
            r11 = 5
            r13[r11] = r7
            r11 = 6
            r13[r11] = r7
            r11 = 7
            r13[r11] = r7
            android.graphics.Path$Direction r11 = android.graphics.Path.Direction.CW
            r15.addRoundRect(r14, r13, r11)
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            android.content.Context r14 = r6.A0J
            if (r8 != r11) goto L_0x04a2
            int r11 = X.2Yu.A0A(r14)
            int r15 = r14.getColor(r11)
            X.6Ly r11 = r6.A0g
            r11.A0F(r15)
            r13 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11.A0D(r2, r7, r2, r13)
            X.6Ly r11 = r6.A0f
            if (r11 == 0) goto L_0x0487
            r11.A0F(r15)
            r11.A0D(r2, r7, r2, r13)
        L_0x0487:
            X.9XA r15 = r6.A06
            if (r15 == 0) goto L_0x0289
            r11 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r11 = X.2Yu.A0H(r14, r11)
            int r13 = r14.getColor(r11)
            X.6Ly r11 = r15.A01
            r11.A0F(r13)
            X.6Ly r11 = r15.A02
            r11.A0F(r13)
            goto L_0x0289
        L_0x04a2:
            r11 = 2130970189(0x7f04064d, float:1.7549081E38)
            int r11 = X.2Yu.A0H(r14, r11)
            int r13 = r14.getColor(r11)
            X.6Ly r11 = r6.A0g
            r11.A0F(r13)
            r11.A0D(r7, r7, r7, r12)
            X.6Ly r11 = r6.A0f
            if (r11 == 0) goto L_0x04bf
            r11.A0F(r13)
            r11.A0D(r7, r7, r7, r12)
        L_0x04bf:
            X.9XA r15 = r6.A06
            if (r15 == 0) goto L_0x04d0
            int r11 = X.2Yu.A0D(r14)
            int r14 = r14.getColor(r11)
            X.6Ly r11 = r15.A01
            r11.A0F(r14)
        L_0x04d0:
            X.9XA r11 = r6.A06
            if (r11 == 0) goto L_0x0289
            X.6Ly r11 = r11.A02
            r11.A0F(r13)
            goto L_0x0289
        L_0x04db:
            r0 = r21
            r6.A0f = r0
            goto L_0x01ed
        L_0x04e1:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r8 != r0) goto L_0x0503
            r12 = 64
            r0 = r19
            java.lang.String r0 = X.002.A0D(r0, r12)
            android.text.SpannableString r12 = new android.text.SpannableString
            r12.<init>(r0)
            r1.A0L(r12)
        L_0x04f5:
            r12 = 2131165231(0x7f07002f, float:1.7944673E38)
        L_0x04f8:
            r0 = r29
            float r0 = r0.getDimension(r12)
            r1.A0A(r0)
            goto L_0x01b4
        L_0x0503:
            android.text.SpannableString r12 = new android.text.SpannableString
            r0 = r19
            r12.<init>(r0)
            r1.A0L(r12)
            r12 = 2131165218(0x7f070022, float:1.7944647E38)
            if (r17 != 0) goto L_0x04f8
            goto L_0x04f5
        L_0x0513:
            r18 = 0
            goto L_0x018e
        L_0x0517:
            r0 = 40
            float r0 = X.0nA.A04(r5, r0)
            int r1 = X.AnonymousClass1GB.A01(r0)
            r6.A0F = r1
            int r0 = r4.A01
            r6.A0G = r0
            int r0 = r4.A02
            r6.A0H = r0
            float r1 = (float) r1
            float r0 = (float) r0
            float r0 = r0 * r26
            float r1 = r1 - r0
            r6.A03 = r1
            goto L_0x0164
        L_0x0534:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369778vJ.<init>(android.content.Context, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable, android.text.Layout, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, X.UkT, X.1iA, X.1sw, com.instagram.model.mediatype.ProductType, com.instagram.user.model.UpcomingEvent, java.lang.Integer, java.lang.Integer, boolean):void");
    }

    private final void A06(Canvas canvas, TextPaint textPaint, String str) {
        int length = str.length();
        Rect rect = this.A0U;
        textPaint.getTextBounds(str, 0, length, rect);
        canvas.translate(0.0f, ((float) rect.height()) / 2.0f);
        canvas.drawText(str, 0, length, 0.0f, -rect.exactCenterY(), textPaint);
        canvas.translate(0.0f, ((float) rect.height()) / 2.0f);
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0w.add(b1v);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa A[LOOP:0: B:20:0x00a4->B:22:0x00aa, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CyF(X.C226952iF r13, X.AnonymousClass3LX r14) {
        /*
            r12 = this;
            r4 = 0
            X.0qQ.A0B(r13, r4)
            r3 = 1
            X.0qQ.A0B(r14, r3)
            java.lang.Object r1 = r13.C3s()
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.String"
            X.0qQ.A0C(r1, r0)
            java.lang.String r0 = "media"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0082
            android.graphics.Bitmap r2 = r14.A01
            if (r2 == 0) goto L_0x009b
            X.UkT r0 = r12.A0c
            int r1 = r0.A04
            int r0 = r0.A00
            android.graphics.Bitmap r2 = X.0fO.A00(r2, r1, r0, r3)
            r12.A04 = r2
            android.graphics.Paint r1 = r12.A0M
            if (r2 != 0) goto L_0x0037
            java.lang.String r0 = "loadedMediaBitmap"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0037:
            android.graphics.Shader$TileMode r11 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.BitmapShader r0 = new android.graphics.BitmapShader
            r0.<init>(r2, r11, r11)
            r1.setShader(r0)
            java.lang.Integer r1 = r12.A0h
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0096
            android.graphics.RectF r0 = r12.A0W
            float r5 = r0.width()
            float r8 = r0.height()
            android.graphics.Paint r3 = r12.A0L
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            r0 = 1048576000(0x3e800000, float:0.25)
            float r6 = r8 * r0
            r2 = 4
            r0 = 1112276992(0x424c0000, float:51.0)
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r1 = android.graphics.Color.argb(r0, r4, r4, r4)
            r0 = 1124007936(0x42ff0000, float:127.5)
            int r0 = X.AnonymousClass1GB.A01(r0)
            int r0 = android.graphics.Color.argb(r0, r4, r4, r4)
            int[] r9 = new int[]{r1, r4, r4, r0}
            float[] r10 = new float[r2]
            r10 = {0, 1048576000, 1056964608, 1065353216} // fill-array
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            r7 = r5
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.setShader(r4)
            goto L_0x0096
        L_0x0082:
            java.lang.String r0 = "profile_pic"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x009b
            android.graphics.Bitmap r0 = r14.A01
            if (r0 == 0) goto L_0x009b
            android.graphics.Bitmap r0 = X.1MF.A05(r0)
            if (r0 == 0) goto L_0x009b
            r12.A05 = r0
        L_0x0096:
            java.lang.Runnable r0 = r12.A0i
            X.11Z.A02(r0)
        L_0x009b:
            java.util.concurrent.CopyOnWriteArraySet r0 = r12.A0w
            java.util.Iterator r1 = r0.iterator()
            X.0qQ.A07(r1)
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r0 = r1.next()
            X.B1v r0 = (X.C41815B1v) r0
            r0.DOX()
            goto L_0x00a4
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369778vJ.CyF(X.2iF, X.3LX):void");
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public final /* synthetic */ void Dg0() {
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A0w.remove(b1v);
    }

    public void draw(Canvas canvas) {
        String str;
        String str2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        if (!isLoading()) {
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            canvas2.save();
            canvas2.translate((float) bounds.left, (float) bounds.top);
            int intValue = this.A0h.intValue();
            if (intValue != 0) {
                if (intValue != 3) {
                    if (intValue == 1) {
                        Layout layout = this.A0Z;
                        if (layout != null) {
                            float f = this.A01;
                            if (((int) (((float) A00()) * f)) > 0) {
                                canvas2.save();
                                int A002 = ((int) (((float) A00()) * f)) - A00();
                                canvas2.translate(0.0f, ((float) this.A0c.A00) + ((float) this.A0F));
                                canvas2.drawPath(this.A0Q, this.A0K);
                                canvas2.translate((float) this.A0G, ((float) this.A0H) + ((float) A002));
                                layout.draw(canvas2);
                                canvas2.restore();
                            }
                        }
                        if (this.A0m) {
                            canvas2.save();
                            canvas2.translate(0.0f, (float) ((int) (((float) this.A0F) * this.A02)));
                            canvas2.drawPath(this.A0S, this.A0M);
                            canvas2.restore();
                        }
                        A03(canvas2);
                        A04(canvas2);
                        canvas2.restore();
                    } else if (intValue == 2) {
                        if (this.A0m) {
                            canvas2.save();
                            canvas2.translate(0.0f, (float) this.A0F);
                            canvas2.drawPath(this.A0S, this.A0M);
                            canvas2.restore();
                        }
                        A03(canvas2);
                        A04(canvas2);
                        canvas2.save();
                        C15904UkT ukT = this.A0c;
                        canvas2.translate(0.0f, ((float) ukT.A00) + ((float) this.A0F));
                        canvas2.drawPath(this.A0Q, this.A0K);
                        String str3 = this.A08;
                        if (!(str3 == null || (str = this.A07) == null || (str2 = ukT.A09) == null)) {
                            canvas2.save();
                            float f2 = this.A0D;
                            float f3 = f2 * 2.0f;
                            canvas2.translate(((float) getBounds().width()) / 2.0f, f3);
                            A06(canvas2, (TextPaint) this.A0l.getValue(), str3);
                            canvas2.translate(0.0f, f2);
                            A06(canvas2, (TextPaint) this.A0k.getValue(), str);
                            canvas2.translate(0.0f, f3);
                            A06(canvas2, (TextPaint) this.A0j.getValue(), str2);
                        }
                        canvas2.restore();
                        canvas2.restore();
                    } else if (intValue != 4) {
                        throw new RuntimeException();
                    }
                }
                if (this.A0m) {
                    canvas2.save();
                    canvas2.drawPath(this.A0S, this.A0M);
                    canvas2.restore();
                }
                A04(canvas2);
                canvas2.save();
                float f4 = (float) this.A0G;
                float height = (float) (this.A0c.A00 + this.A0H + this.A0V.height());
                C306386Ly r1 = this.A0g;
                float f5 = height + r1.A0b.getFontMetrics().ascent;
                canvas2.translate(f4, f5);
                r1.draw(canvas2);
                canvas2.translate((float) r1.A0A, 0.0f);
                C306386Ly r12 = this.A0f;
                if (r12 != null) {
                    canvas2.translate(this.A0E, 0.0f);
                    r12.draw(canvas2);
                    canvas2.translate((float) r12.A0A, 0.0f);
                }
                canvas2.restore();
                A05(canvas2, f4, f5);
                canvas2.restore();
            }
            RectF rectF = this.A0X;
            float height2 = rectF.height();
            float f6 = this.A03;
            float f7 = f6 / 2.0f;
            RectF rectF2 = this.A0W;
            float width = rectF2.width();
            float height3 = rectF2.height();
            Context context = this.A0J;
            float A012 = (float) AnonymousClass1GB.A01(0nA.A04(context, 20));
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), 17301540, (BitmapFactory.Options) null);
            RectF rectF3 = new RectF();
            float A013 = (float) AnonymousClass1GB.A01(0nA.A04(context, 3));
            rectF3.set((A012 + A013) * -1.0f, 0.0f, A013 * -1.0f, A012);
            canvas2.save();
            if (this.A0m) {
                Path path = this.A0S;
                canvas2.drawPath(path, this.A0M);
                canvas2.drawPath(path, this.A0L);
            }
            float f8 = (float) this.A0G;
            canvas2.translate(f8, (height3 - f8) - height2);
            Bitmap bitmap = this.A05;
            if (bitmap == null) {
                0qQ.A0F("profilePicBitmap");
                throw AnonymousClass00P.createAndThrow();
            }
            canvas2.drawBitmap(bitmap, (Rect) null, rectF, this.A0O);
            Paint paint = this.A0P;
            canvas2.drawCircle(f7, f7, (paint.getStrokeWidth() / 2.0f) + f7, paint);
            canvas2.save();
            Rect rect = this.A0V;
            canvas2.translate(f6 + f8, (f7 - ((float) rect.top)) - (((float) rect.height()) / 2.0f));
            Spannable spannable = this.A0g.A0F;
            0qQ.A07(spannable);
            String obj = spannable.toString();
            TextPaint textPaint = this.A0b;
            canvas2.drawText(obj, 0.0f, 0.0f, textPaint);
            canvas2.restore();
            canvas2.save();
            StaticLayout staticLayout = this.A0a;
            if (staticLayout != null) {
                float f9 = (float) (-staticLayout.getHeight());
                float f10 = (float) this.A0H;
                canvas2.translate(0.0f, f9 - f10);
                staticLayout.draw(canvas2);
                canvas2.restore();
                canvas2.restore();
                canvas2.save();
                Rect rect2 = this.A0T;
                canvas2.translate((width - ((float) rect2.width())) - f8, f10);
                canvas2.drawBitmap(decodeResource, (Rect) null, rectF3, this.A0N);
                canvas2.save();
                canvas2.translate(0.0f, ((A012 / 2.0f) - ((float) rect2.top)) - (((float) rect2.height()) / 2.0f));
                String str4 = this.A0c.A08;
                if (str4 != null) {
                    canvas2.drawText(str4, 0.0f, 0.0f, textPaint);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
            canvas2.restore();
            canvas2.restore();
            canvas2.restore();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void onBoundsChange(Rect rect) {
        Rect rect2;
        int i;
        int A012;
        0qQ.A0B(rect, 0);
        this.A0B = 0;
        Integer num = this.A0h;
        if (num == AnonymousClass05K.A0C) {
            A02();
        }
        A01();
        Drawable drawable = this.A0Y;
        if (drawable != null) {
            if (num != AnonymousClass05K.A0N) {
                rect2.top += (int) (((float) this.A0F) * this.A02);
                i = rect2.bottom;
                A012 = (int) (((float) A00()) * this.A01);
            } else {
                rect2 = new Rect(rect);
                i = rect2.bottom;
                int i2 = this.A0H;
                C306386Ly r1 = this.A0g;
                A012 = i2 + r1.A06 + AnonymousClass1GB.A01(r1.A0b.getFontMetrics().descent);
            }
            rect2.bottom = i - A012;
            drawable.setBounds(rect2);
        }
        invalidateSelf();
    }

    private final int A00() {
        String str;
        String str2;
        int i = this.A0B;
        if (i == 0) {
            Layout layout = this.A0Z;
            if (layout != null && this.A0h == AnonymousClass05K.A01) {
                i = layout.getHeight() + (this.A0H * 2);
            } else if (this.A0h == AnonymousClass05K.A0C) {
                A02();
                String str3 = this.A08;
                i = 0;
                if (!(str3 == null || (str = this.A07) == null || (str2 = this.A0c.A09) == null)) {
                    float f = this.A0D;
                    float f2 = f * 2.0f;
                    int length = str3.length();
                    Rect rect = this.A0U;
                    ((Paint) this.A0l.getValue()).getTextBounds(str3, 0, length, rect);
                    ((Paint) this.A0k.getValue()).getTextBounds(str, 0, str.length(), rect);
                    ((Paint) this.A0j.getValue()).getTextBounds(str2, 0, str2.length(), rect);
                    i = (int) (f2 + 0.0f + ((float) rect.height()) + f + ((float) rect.height()) + f2 + ((float) rect.height()) + f2);
                }
            } else {
                i = 0;
            }
            this.A0B = i;
        }
        return i;
    }

    private final void A01() {
        Path path = this.A0Q;
        path.reset();
        if ((this.A0Z != null && this.A0h == AnonymousClass05K.A01) || this.A0h == AnonymousClass05K.A0C) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) this.A0c.A04, (float) ((int) (((float) A00()) * this.A01)));
            float f = this.A00;
            path.addRoundRect(rectF, new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Path.Direction.CW);
        }
    }

    private final void A02() {
        String str;
        C15904UkT ukT = this.A0c;
        String str2 = ukT.A0C;
        if (str2 != null && (str = ukT.A0B) != null) {
            float width = (float) getBounds().width();
            float f = ((float) this.A0n) * 2.0f;
            float f2 = width - f;
            if (f2 < 0.0f && this.A0v == AnonymousClass05K.A01) {
                f2 = ((float) ukT.A04) - f;
            }
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String upperCase = str2.toUpperCase(locale);
            0qQ.A07(upperCase);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.A08 = TextUtils.ellipsize(upperCase, (TextPaint) this.A0l.getValue(), f2, truncateAt).toString();
            Locale locale2 = Locale.getDefault();
            0qQ.A07(locale2);
            String upperCase2 = str.toUpperCase(locale2);
            0qQ.A07(upperCase2);
            this.A07 = TextUtils.ellipsize(upperCase2, (TextPaint) this.A0k.getValue(), f2, truncateAt).toString();
        }
    }

    private final void A03(Canvas canvas) {
        boolean z;
        int i;
        int i2;
        float f;
        float f2;
        float f3;
        Canvas canvas2 = canvas;
        canvas2.drawPath(this.A0R, this.A0K);
        canvas2.save();
        float f4 = this.A02;
        if (f4 > 1.0f) {
            canvas2.scale(f4, f4);
        }
        int i3 = 0;
        if (this.A0C == AnonymousClass05K.A00) {
            z = true;
            i2 = this.A0G;
            f = (float) i2;
        } else {
            z = false;
            AnonymousClass9XA r0 = this.A06;
            if (r0 != null) {
                i = r0.getIntrinsicWidth();
            } else {
                i = 0;
            }
            float max = Math.max(1.0f, f4);
            i2 = this.A0G;
            f = (((float) this.A0c.A04) - (((((float) ((this.A0g.A0A + i2) + i2)) + this.A03) + ((float) i)) * max)) / max;
        }
        float f5 = (float) this.A0H;
        canvas2.translate(f, f5);
        if (z) {
            Bitmap bitmap = this.A05;
            if (bitmap != null) {
                canvas2.drawBitmap(bitmap, (Rect) null, this.A0X, this.A0O);
            }
            0qQ.A0F("profilePicBitmap");
            throw AnonymousClass00P.createAndThrow();
        }
        canvas2.save();
        C306386Ly r12 = this.A0f;
        if (r12 != null) {
            i3 = r12.A06;
        }
        Rect rect = this.A0V;
        int height = rect.height();
        C306386Ly r14 = this.A0g;
        int i4 = r14.A0A;
        if (!z) {
            f2 = 0.0f;
        } else {
            f2 = this.A03 + ((float) i2);
        }
        float f6 = this.A03;
        float f7 = (((f6 / 2.0f) - ((float) rect.top)) - (((float) (i3 + height)) / 2.0f)) + r14.A0b.getFontMetrics().ascent;
        canvas2.translate(f2, f7);
        r14.draw(canvas2);
        if (r12 != null) {
            int save = canvas2.save();
            try {
                float f8 = (float) r12.A0A;
                if (!z) {
                    f3 = ((float) i4) - f8;
                } else {
                    f3 = 0.0f;
                }
                canvas2.translate(f3, ((float) height) + r12.A0b.getFontMetrics().descent);
                r12.draw(canvas2);
            } finally {
                canvas2.restoreToCount(save);
            }
        }
        if (!z) {
            float f9 = (float) rect.right;
            RectF rectF = this.A0X;
            float f10 = (float) i2;
            rectF.set(f10 + f9, 0.0f, f9 + f6 + f10, f6);
            canvas2.translate(0.0f, (-f5) / 2.0f);
            Bitmap bitmap2 = this.A05;
            if (bitmap2 != null) {
                canvas2.drawBitmap(bitmap2, (Rect) null, rectF, this.A0O);
            }
            0qQ.A0F("profilePicBitmap");
            throw AnonymousClass00P.createAndThrow();
        }
        canvas2.restore();
        canvas2.restore();
        A05(canvas2, f + f6 + ((float) i2), f5 + f7);
    }

    private final void A04(Canvas canvas) {
        int i;
        Drawable drawable = this.A0r;
        if (drawable != null) {
            if (this.A0h == AnonymousClass05K.A0N) {
                i = 0;
            } else {
                i = (int) (((float) this.A0F) * this.A02);
            }
            canvas.save();
            canvas.translate(((float) (this.A0c.A04 - this.A0o)) - ((float) this.A0G), ((float) i) + ((float) this.A0H));
            drawable.draw(canvas);
            canvas.restore();
        }
    }

    private final void A05(Canvas canvas, float f, float f2) {
        AnonymousClass9XA r3 = this.A06;
        if (r3 != null) {
            canvas.save();
            canvas.translate(-((float) getBounds().left), -((float) getBounds().top));
            r3.A00(canvas, ((float) getBounds().left) + f + ((float) this.A0g.A0A), ((float) getBounds().top) + f2, 1.0f);
            canvas.restore();
        }
    }

    public final boolean A07() {
        if (this.A0c.A0D != null) {
            if (!182.A06(0Tu.A05, this.A0s, 36319175462886400L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void AHg() {
        this.A0w.clear();
    }

    public final Drawable Aco() {
        return this.A0Y;
    }

    public final 1sw BRP() {
        return this.A0t;
    }

    public final ProductType BgY() {
        return this.A0e;
    }

    public final String C4F() {
        int intValue = this.A0h.intValue();
        if (intValue == 0) {
            return 002.A0R("media_simple_", this.A0c.A0E);
        }
        if (intValue == 3) {
            return "feed_post_sticker_square";
        }
        if (intValue == 1) {
            return "feed_post_sticker_bubble";
        }
        if (intValue == 2) {
            return "feed_post_sticker_with_event_bubble";
        }
        if (intValue == 4) {
            return 002.A0R("story-reels-metadata-sticker-", this.A0c.A0E);
        }
        throw new RuntimeException();
    }

    public final void D1M(boolean z) {
        if (z && this.A0Y != null) {
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            onBoundsChange(bounds);
        }
    }

    public final int getIntrinsicHeight() {
        int i;
        int A012;
        int intValue = this.A0h.intValue();
        if (intValue == 0) {
            return AnonymousClass1GB.A01(this.A0W.height());
        }
        int i2 = this.A0c.A00;
        if (intValue != 3) {
            i = i2 + ((int) (((float) this.A0F) * this.A02));
            A012 = (int) (((float) A00()) * this.A01);
        } else {
            C306386Ly r1 = this.A0g;
            i = i2 + this.A0H + r1.A06;
            A012 = AnonymousClass1GB.A01(r1.A0b.getFontMetrics().descent);
        }
        return i + A012;
    }

    public final int getIntrinsicWidth() {
        return this.A0c.A04;
    }

    public final boolean isLoading() {
        if ((!this.A0m || this.A04 != null) && this.A05 != null) {
            return false;
        }
        return true;
    }

    public void setAlpha(int i) {
        this.A0O.setAlpha(i);
        this.A0M.setAlpha(i);
        this.A0L.setAlpha(i);
        this.A0K.setAlpha(i);
        this.A0g.setAlpha(i);
        C306386Ly r0 = this.A0f;
        if (r0 != null) {
            r0.setAlpha(i);
        }
        AnonymousClass9XA r02 = this.A06;
        if (r02 != null) {
            r02.setAlpha(i);
        }
        Drawable drawable = this.A0r;
        if (drawable != null) {
            drawable.setAlpha((int) (this.A0A * ((float) i)));
        }
        this.A0N.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A0O.setColorFilter(colorFilter);
        this.A0M.setColorFilter(colorFilter);
        this.A0L.setColorFilter(colorFilter);
        this.A0K.setColorFilter(colorFilter);
        this.A0g.setColorFilter(colorFilter);
        C306386Ly r0 = this.A0f;
        if (r0 != null) {
            r0.setColorFilter(colorFilter);
        }
        AnonymousClass9XA r02 = this.A06;
        if (r02 != null) {
            r02.setColorFilter(colorFilter);
        }
        Drawable drawable = this.A0r;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0N.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
