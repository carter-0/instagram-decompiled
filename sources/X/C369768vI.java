package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.blur.BlurUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.8vI  reason: invalid class name and case insensitive filesystem */
public class C369768vI extends Drawable implements C268684dp, C321026tS, Drawable.Callback, AnonymousClass1MK, C300645xY {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Paint A05;
    public C70439O6q A06;
    public Integer A07;
    public boolean A08;
    public int A09;
    public AnonymousClass6M4 A0A;
    public final float A0B;
    public final Context A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final RectF A0H;
    public final RingSpec A0I;
    public final UserSession A0J;
    public final C321106ta A0K;
    public final C317966o8 A0L;
    public final C318046oG A0M;
    public final AnonymousClass3ID A0N;
    public final String A0O;
    public final Map A0P;
    public final int A0Q;
    public final int A0R;
    public final Rect A0S = new Rect();
    public final Rect A0T;
    public final String A0U;
    public final CopyOnWriteArraySet A0V;

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final void DK4(C226952iF r3, int i) {
        float f = ((float) i) / 100.0f;
        this.A00 = f;
        this.A0K.A00(f);
    }

    public final int getOpacity() {
        return -3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0166 A[SYNTHETIC, Splitter:B:19:0x0166] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x01aa  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x026d  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0278  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C369768vI(android.content.Context r26, com.instagram.api.schemas.RingSpec r27, com.instagram.common.session.UserSession r28, X.C317966o8 r29, X.C318046oG r30, X.AnonymousClass3ID r31, java.lang.String r32) {
        /*
            r25 = this;
            r6 = r25
            r6.<init>()
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r6.A0T = r10
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.A0S = r0
            android.graphics.RectF r8 = new android.graphics.RectF
            r8.<init>()
            r6.A0G = r8
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            r6.A0H = r7
            r4 = 0
            r6.A08 = r4
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r6.A0V = r0
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r6.A0P = r0
            r0 = 255(0xff, float:3.57E-43)
            r6.A09 = r0
            java.lang.Integer r23 = X.AnonymousClass05K.A00
            r0 = r23
            r6.A07 = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            r6.A0U = r0
            r5 = r26
            r6.A0C = r5
            r0 = r28
            r6.A0J = r0
            android.content.res.Resources r22 = r5.getResources()
            r24 = r30
            r0 = r24
            r6.A0M = r0
            r0 = r32
            r6.A0O = r0
            r0 = r27
            r6.A0I = r0
            r0 = r31
            r6.A0N = r0
            r0 = 1059481190(0x3f266666, float:0.65)
            X.6ta r0 = X.C394019xP.A00(r5, r0)
            r6.A0K = r0
            r0.setCallback(r6)
            android.util.DisplayMetrics r16 = r22.getDisplayMetrics()
            r9 = r29
            r6.A0L = r9
            java.lang.Integer r21 = r9.A04()
            int r11 = X.AnonymousClass8XF.A01(r5)
            android.util.DisplayMetrics r3 = r22.getDisplayMetrics()
            android.graphics.RectF r0 = X.0nA.A01
            r1 = 1090519040(0x41000000, float:8.0)
            r2 = 1
            float r3 = android.util.TypedValue.applyDimension(r2, r1, r3)
            android.util.DisplayMetrics r0 = r22.getDisplayMetrics()
            float r20 = android.util.TypedValue.applyDimension(r2, r1, r0)
            android.graphics.Paint r12 = new android.graphics.Paint
            r12.<init>(r2)
            r6.A0F = r12
            X.0qq r1 = X.AnonymousClass0qo.A00(r5)
            X.0qm r0 = X.0qm.A0V
            android.graphics.Typeface r0 = r1.A02(r0)
            r12.setTypeface(r0)
            int r0 = r9.A0E
            r1 = -1
            if (r0 != r1) goto L_0x00ba
            java.lang.String r0 = r9.A0f     // Catch:{ IllegalArgumentException -> 0x00b7 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x00b7 }
            r9.A0E = r0     // Catch:{ IllegalArgumentException -> 0x00b7 }
            goto L_0x00ba
        L_0x00b7:
            r9.A0E = r1
            r0 = -1
        L_0x00ba:
            r12.setColor(r0)
            android.graphics.Paint$Align r0 = android.graphics.Paint.Align.CENTER
            r12.setTextAlign(r0)
            android.util.DisplayMetrics r0 = r22.getDisplayMetrics()
            float r0 = r0.density
            r14 = r0
            java.lang.Integer r13 = r9.A04()
            java.lang.Integer r19 = X.AnonymousClass05K.A0C
            r18 = 1073741824(0x40000000, float:2.0)
            r0 = r19
            if (r13 != r0) goto L_0x0122
            java.lang.String r13 = r9.A0d
            if (r13 != 0) goto L_0x00db
            java.lang.String r13 = ""
        L_0x00db:
            r6.A0R = r4
            r6.A0Q = r4
            int r0 = r9.A08
            float r14 = (float) r0
            r0 = r16
            float r0 = android.util.TypedValue.applyDimension(r2, r14, r0)
            r12.setTextSize(r0)
            int r0 = r13.length()
            r12.getTextBounds(r13, r4, r0, r10)
            float r11 = (float) r11
            float r0 = r9.A01()
            float r11 = r11 * r0
            int r0 = java.lang.Math.round(r11)
            float r13 = (float) r0
            int r0 = r10.width()
            float r11 = (float) r0
            float r0 = r3 * r18
            float r11 = r11 + r0
        L_0x0105:
            float r13 = r13 / r11
        L_0x0106:
            int r0 = r9.A08
            float r14 = (float) r0
            r11 = 0
            float r14 = r14 * r13
            r17 = 1
            r0 = r16
            float r0 = android.util.TypedValue.applyDimension(r2, r14, r0)
            r12.setTextSize(r0)
            android.graphics.Paint r15 = new android.graphics.Paint
            r15.<init>(r2)
            r6.A0E = r15
            int r0 = r9.A0D
            if (r0 != r1) goto L_0x0193
            goto L_0x0166
        L_0x0122:
            X.6oG r13 = X.C318046oG.CUTOUT_VIDEO
            r0 = r24
            if (r0 != r13) goto L_0x0147
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 3
            int r11 = r11 / r0
            float r0 = (float) r11
            r15 = r0
            float r14 = r9.A01
            float r0 = r9.A00
            float r14 = r14 / r0
            float r15 = r15 / r14
            int r0 = java.lang.Math.round(r15)
            int r0 = java.lang.Math.min(r11, r0)
            r6.A0Q = r0
            float r0 = (float) r0
            float r0 = r0 * r14
            int r0 = java.lang.Math.round(r0)
            r6.A0R = r0
            goto L_0x0106
        L_0x0147:
            float r13 = r9.A01()
            float r0 = (float) r11
            float r0 = r0 * r13
            int r0 = java.lang.Math.round(r0)
            r6.A0R = r0
            float r13 = (float) r0
            float r11 = r9.A01
            float r0 = r9.A00
            float r0 = r11 / r0
            float r0 = r13 / r0
            int r0 = java.lang.Math.round(r0)
            r6.A0Q = r0
            float r11 = r11 * r14
            float r11 = r11 / r18
            goto L_0x0105
        L_0x0166:
            java.lang.String r0 = r9.A0e     // Catch:{ IllegalArgumentException -> 0x016f }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x016f }
            r9.A0D = r0     // Catch:{ IllegalArgumentException -> 0x016f }
            goto L_0x0172
        L_0x016f:
            r9.A0D = r1
            r0 = -1
        L_0x0172:
            int r14 = android.graphics.Color.red(r0)
            int r0 = r9.A0D
            int r2 = android.graphics.Color.green(r0)
            int r0 = r9.A0D
            int r16 = android.graphics.Color.blue(r0)
            float r1 = r9.A04
            r0 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            r1 = r16
            int r0 = android.graphics.Color.argb(r0, r14, r2, r1)
            r9.A0D = r0
        L_0x0193:
            r15.setColor(r0)
            android.util.DisplayMetrics r14 = r22.getDisplayMetrics()
            r2 = 7
            r1 = 1088421888(0x40e00000, float:7.0)
            r0 = r17
            float r0 = android.util.TypedValue.applyDimension(r0, r1, r14)
            float r0 = r0 * r13
            r6.A0B = r0
            java.lang.String r1 = r9.A0d
            if (r1 == 0) goto L_0x01f6
            float r3 = r3 * r13
            float r20 = r20 * r13
            int r0 = r1.length()
            r12.getTextBounds(r1, r4, r0, r10)
            int r12 = r10.bottom
            int r0 = r10.top
            int r13 = java.lang.Math.abs(r0)
            r1 = r21
            r0 = r19
            if (r1 != r0) goto L_0x0285
            r6.A03 = r3
            int r0 = r10.height()
            float r1 = (float) r0
            float r1 = r1 + r20
        L_0x01cb:
            float r0 = (float) r12
            float r1 = r1 - r0
            r6.A04 = r1
            float r1 = r6.A03
            int r0 = r10.width()
            float r0 = (float) r0
            float r0 = r0 / r18
            float r1 = r1 - r0
            int r1 = (int) r1
            float r0 = r6.A04
            int r0 = (int) r0
            int r0 = r0 - r13
            r10.offsetTo(r1, r0)
            int r0 = r10.left
            float r13 = (float) r0
            float r13 = r13 - r3
            int r0 = r10.top
            float r12 = (float) r0
            float r12 = r12 - r20
            int r0 = r10.right
            float r1 = (float) r0
            float r1 = r1 + r3
            int r0 = r10.bottom
            float r0 = (float) r0
            float r0 = r0 + r20
            r7.set(r13, r12, r1, r0)
        L_0x01f6:
            int r0 = r6.A0R
            float r1 = (float) r0
            int r0 = r6.A0Q
            float r0 = (float) r0
            r8.set(r11, r11, r1, r0)
            float r1 = r7.left
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x021c
            float r0 = java.lang.Math.abs(r1)
            int r0 = java.lang.Math.round(r0)
            float r1 = (float) r0
            r7.offset(r1, r11)
            r10.offset(r0, r4)
            float r0 = r6.A03
            float r0 = r0 + r1
            r6.A03 = r0
            r8.offset(r1, r11)
        L_0x021c:
            float r1 = r7.top
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0239
            float r0 = java.lang.Math.abs(r1)
            int r0 = java.lang.Math.round(r0)
            float r1 = (float) r0
            r7.offset(r11, r1)
            r10.offset(r4, r0)
            float r0 = r6.A04
            float r0 = r0 + r1
            r6.A04 = r0
            r8.offset(r11, r1)
        L_0x0239:
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>(r2)
            r6.A0D = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r0 = r17
            r1.<init>(r0)
            r6.A05 = r1
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r0 = r5.getColor(r0)
            r1.setColor(r0)
            r0 = 1084227584(0x40a00000, float:5.0)
            float r0 = X.0nA.A00(r5, r0)
            r6.A02 = r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r0 = X.0nA.A00(r5, r0)
            r6.A01 = r0
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            java.lang.Integer r1 = r9.A04()
            r0 = r19
            if (r1 == r0) goto L_0x0278
            r2 = r23
        L_0x026f:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.6M4 r0 = X.C321156tf.A01(r5, r6, r2, r0)
            r6.A0A = r0
            return
        L_0x0278:
            X.6oG r1 = X.C318046oG.AVATAR_STATIC
            r0 = r24
            if (r0 == r1) goto L_0x0282
            X.6oG r1 = X.C318046oG.AVATAR
            if (r0 != r1) goto L_0x026f
        L_0x0282:
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            goto L_0x026f
        L_0x0285:
            int r0 = r6.A0R
            float r1 = (float) r0
            float r0 = r9.A05
            float r1 = r1 * r0
            r6.A03 = r1
            int r0 = r6.A0Q
            float r1 = (float) r0
            float r0 = r9.A06
            float r1 = r1 * r0
            int r0 = r10.height()
            float r0 = (float) r0
            float r0 = r0 / r18
            float r1 = r1 + r0
            goto L_0x01cb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369768vI.<init>(android.content.Context, com.instagram.api.schemas.RingSpec, com.instagram.common.session.UserSession, X.6o8, X.6oG, X.3ID, java.lang.String):void");
    }

    private void A00(Bitmap bitmap, int i) {
        Map map = this.A0P;
        Integer valueOf = Integer.valueOf(i);
        Bitmap bitmap2 = bitmap;
        Bitmap bitmap3 = bitmap;
        Integer num = this.A07;
        if (num == AnonymousClass05K.A01) {
            0qQ.A0B(bitmap, 0);
            Matrix matrix = new Matrix();
            matrix.preScale(-1.0f, 1.0f);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            0fO.A03(bitmap);
            bitmap3 = Bitmap.createBitmap(bitmap2, 0, 0, width, height, matrix, false);
            0qQ.A07(bitmap3);
            bitmap3.setDensity(160);
        } else if (num == AnonymousClass05K.A0C) {
            Paint paint = this.A0D;
            0qQ.A0B(bitmap, 0);
            0qQ.A0B(paint, 1);
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        } else if (num == AnonymousClass05K.A0N) {
            0qQ.A0B(bitmap, 0);
            bitmap3 = BlurUtil.blurTranslation(bitmap2, 1.0f, -1, 1, 10, 2);
        }
        map.put(valueOf, bitmap3);
        this.A0S.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (A03()) {
            Iterator it = this.A0V.iterator();
            while (it.hasNext()) {
                ((C41815B1v) it.next()).DOX();
            }
            invalidateSelf();
        }
    }

    private void A02(ImageUrl imageUrl, int i) {
        C70439O6q o6q = this.A06;
        if (o6q != null) {
            String str = this.A0U;
            0qQ.A0B(str, 0);
            o6q.A00.A06.A01(str, false);
        }
        1OO A0J2 = 1NK.A00().A0J(imageUrl, (String) null);
        A0J2.A02(this);
        A0J2.A08 = Integer.valueOf(i);
        A0J2.A0M = true;
        A0J2.A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0024 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A03() {
        /*
            r4 = this;
            X.6o8 r3 = r4.A0L
            com.google.common.collect.ImmutableList r0 = r3.A02()
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0026
            com.google.common.collect.ImmutableList r0 = r3.A02()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0026
            java.util.Map r0 = r4.A0P
            int r1 = r0.size()
            com.google.common.collect.ImmutableList r0 = r3.A02()
            int r0 = r0.size()
            if (r1 != r0) goto L_0x0025
        L_0x0024:
            r2 = 1
        L_0x0025:
            return r2
        L_0x0026:
            java.util.Map r0 = r4.A0P
            int r0 = r0.size()
            if (r0 != r1) goto L_0x0025
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369768vI.A03():boolean");
    }

    public final void A04() {
        if (this.A0P.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            C317966o8 r3 = this.A0L;
            ImmutableList A032 = r3.A03();
            if (A032 != null && !A032.isEmpty()) {
                for (int i = 0; i < A032.size(); i++) {
                    Bitmap A022 = 1MF.A02(this.A0C, Uri.fromFile(new File((String) A032.get(i))));
                    if (A022 != null) {
                        arrayList.add(A022);
                        A00(A022, i);
                    } else {
                        String A0R2 = 002.A0R("Failed to load bitmap from file. file: ", (String) A032.get(i));
                        0qQ.A0B(A0R2, 1);
                        0kD.A0E("StickerItemDrawable", A0R2, (Throwable) null);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                if (r3.A02() == null || r3.A02().isEmpty()) {
                    ImageUrl imageUrl = r3.A0H;
                    if (!C253833rU.A02(imageUrl)) {
                        A02(imageUrl, 0);
                        return;
                    }
                } else if (r3.A02() != null && !r3.A02().isEmpty()) {
                    if (!((C39638A3c) r3.A02().get(0)).A00.isEmpty()) {
                        for (int i2 = 0; i2 < r3.A02().size(); i2++) {
                            A02(new SimpleImageUrl(((C39638A3c) r3.A02().get(i2)).A00), i2);
                        }
                        return;
                    }
                }
                List list = r3.A0o;
                if (!ImmutableList.copyOf((Collection) list).isEmpty()) {
                    for (int i3 = 0; i3 < ImmutableList.copyOf((Collection) list).size(); i3++) {
                        A00((Bitmap) ImmutableList.copyOf((Collection) list).get(i3), i3);
                    }
                }
            }
        }
    }

    public final void A9D(C41815B1v b1v) {
        this.A0V.add(b1v);
    }

    public final void AHg() {
        this.A0V.clear();
    }

    public final AnonymousClass6M4 C49() {
        return this.A0A;
    }

    public final String C4F() {
        return this.A0L.A0S;
    }

    public final boolean CZ7(UserSession userSession) {
        C318046oG r3 = this.A0M;
        if (r3 == C318046oG.KEYBOARD_CONTENT_STICKER) {
            return true;
        }
        if (r3 == C318046oG.CUTOUT_PHOTO && 182.A06(0Tu.A05, userSession, 36319939967917886L)) {
            return true;
        }
        if (r3 == C318046oG.AVATAR_STATIC && 182.A06(0Tu.A05, userSession, 36319939968311108L) && this.A0L.A0i == userSession.A06 && this.A07 == AnonymousClass05K.A00) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void CyF(C226952iF r9, AnonymousClass3LX r10) {
        int i;
        Bitmap bitmap = r10.A01;
        if (bitmap != null) {
            C70439O6q o6q = this.A06;
            if (o6q != null) {
                String str = this.A0U;
                0qQ.A0B(str, 0);
                OME ome = o6q.A00.A06;
                ome.A00.markerEnd(944511429, str.hashCode(), 2);
            }
            this.A00 = 1.0f;
            this.A0K.A00(1.0f);
            if (bitmap.getWidth() > 480 && this.A0M != C318046oG.STORIES_TEMPLATE_GALLERY_OVERLAY) {
                boolean z = 1MF.A02;
                bitmap = 0fO.A00(bitmap, 480, (int) (((float) bitmap.getHeight()) * (480.0f / ((float) bitmap.getWidth()))), true);
            }
            Object C3s = r9.C3s();
            if (C3s instanceof Integer) {
                i = ((Number) C3s).intValue();
            } else {
                0kD.A0E("StickerItemDrawable", "No index tag", (Throwable) null);
                i = 0;
            }
            C317966o8 r1 = this.A0L;
            if (!(r1.A03() == null || r1.A03().isEmpty() || bitmap == null)) {
                File file = new File((String) r1.A03().get(i));
                if (!file.exists() || file.length() == 0) {
                    OX4.A00(0nY.A00(), new C41349AsW(bitmap, this.A0J, file), 205);
                }
            }
            A00(bitmap, i);
        }
    }

    public final void DJx(C226952iF r6, C254673sr r7) {
        String str;
        C70439O6q o6q = this.A06;
        if (o6q != null) {
            String str2 = this.A0U;
            if (r7 != null) {
                str = r7.A02;
            } else {
                str = null;
            }
            0qQ.A0B(str2, 0);
            OME ome = o6q.A00.A06;
            int hashCode = str2.hashCode();
            02m r2 = ome.A00;
            if (str == null) {
                str = "unknown";
            }
            r2.markerAnnotate(944511429, hashCode, "error", str);
            r2.markerEnd(944511429, hashCode, 3);
        }
    }

    public final void EE1(C41815B1v b1v) {
        this.A0V.remove(b1v);
    }

    public final void FL9(boolean z, boolean z2) {
        this.A08 = z;
        AnonymousClass6M4 r0 = this.A0A;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final boolean isLoading() {
        int intValue = this.A0L.A04().intValue();
        if (intValue == 0 || intValue == 1) {
            return !A03();
        }
        return false;
    }

    public final void onBoundsChange(Rect rect) {
        this.A0K.setBounds(0, 0, rect.width(), rect.height());
    }

    public final void setAlpha(int i) {
        if (this.A09 != i) {
            this.A09 = i;
            this.A0D.setAlpha(i);
            this.A05.setAlpha(i);
            Paint paint = this.A0F;
            if (paint.getColor() != 0) {
                paint.setAlpha(i);
            }
            Paint paint2 = this.A0E;
            if (paint2.getColor() != 0) {
                paint2.setAlpha(i);
            }
            invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        this.A05.setColorFilter(colorFilter);
        Paint paint = this.A0F;
        if (paint.getColor() != 0) {
            paint.setColorFilter(colorFilter);
        }
        Paint paint2 = this.A0E;
        if (paint2.getColor() != 0) {
            paint2.setColorFilter(colorFilter);
        }
    }

    private void A01(Canvas canvas) {
        if (isLoading()) {
            C321106ta r1 = this.A0K;
            r1.A00(this.A00);
            r1.draw(canvas);
            return;
        }
        for (Bitmap drawBitmap : this.A0P.values()) {
            canvas.drawBitmap(drawBitmap, this.A0S, this.A0G, this.A0D);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r1 != 2) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void draw(android.graphics.Canvas r5) {
        /*
            r4 = this;
            r5.save()
            android.graphics.Rect r2 = r4.getBounds()
            int r0 = r2.left
            float r1 = (float) r0
            int r0 = r2.top
            float r0 = (float) r0
            r5.translate(r1, r0)
            boolean r0 = r4.isLoading()
            if (r0 != 0) goto L_0x002e
            boolean r0 = r4.A08
            if (r0 == 0) goto L_0x002e
            android.graphics.RectF r0 = r4.A0G
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>(r0)
            float r0 = r4.A02
            float r0 = -r0
            r2.inset(r0, r0)
            float r1 = r4.A01
            android.graphics.Paint r0 = r4.A05
            r5.drawRoundRect(r2, r1, r1, r0)
        L_0x002e:
            X.6o8 r3 = r4.A0L
            java.lang.Integer r0 = r3.A04()
            int r1 = r0.intValue()
            r0 = 0
            if (r1 == r0) goto L_0x0070
            r0 = 1
            if (r1 == r0) goto L_0x004a
            r0 = 2
            if (r1 == r0) goto L_0x004d
        L_0x0041:
            r5.restore()
            X.6M4 r0 = r4.A0A
            r0.draw(r5)
            return
        L_0x004a:
            r4.A01(r5)
        L_0x004d:
            java.lang.String r0 = r3.A0d
            if (r0 == 0) goto L_0x0041
            android.graphics.Paint r2 = r4.A0E
            int r0 = r2.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 <= 0) goto L_0x0064
            android.graphics.RectF r1 = r4.A0H
            float r0 = r4.A0B
            r5.drawRoundRect(r1, r0, r0, r2)
        L_0x0064:
            java.lang.String r3 = r3.A0d
            float r2 = r4.A03
            float r1 = r4.A04
            android.graphics.Paint r0 = r4.A0F
            r5.drawText(r3, r2, r1, r0)
            goto L_0x0041
        L_0x0070:
            r4.A01(r5)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C369768vI.draw(android.graphics.Canvas):void");
    }

    public final int getIntrinsicHeight() {
        if (isLoading()) {
            return this.A0K.A03;
        }
        int intValue = this.A0L.A04().intValue();
        if (intValue == 0) {
            return this.A0Q;
        }
        if (intValue == 1) {
            RectF rectF = this.A0G;
            float f = rectF.top;
            RectF rectF2 = this.A0H;
            return Math.round(Math.max(rectF.bottom, rectF2.bottom)) - Math.round(Math.min(f, rectF2.top));
        } else if (intValue == 2) {
            return Math.round(this.A0H.height());
        } else {
            return 0;
        }
    }

    public final int getIntrinsicWidth() {
        if (isLoading()) {
            return this.A0K.A04;
        }
        int intValue = this.A0L.A04().intValue();
        if (intValue == 0) {
            return this.A0R;
        }
        if (intValue == 1) {
            RectF rectF = this.A0G;
            float f = rectF.left;
            RectF rectF2 = this.A0H;
            return Math.round(Math.max(rectF.right, rectF2.right)) - Math.round(Math.min(f, rectF2.left));
        } else if (intValue == 2) {
            return Math.round(this.A0H.width());
        } else {
            return 0;
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
