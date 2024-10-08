package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;
import com.instagram.android.R;
import com.instagram.avatars.common.AvatarInfo;
import com.instagram.common.session.UserSession;
import com.instagram.giphy.webp.IgWebPAnimDecoder;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.6tR  reason: invalid class name and case insensitive filesystem */
public class C321016tR extends Drawable implements C268684dp, C321026tS, Drawable.Callback, C320986tO, Choreographer.FrameCallback, C321036tT, C321046tU, AnonymousClass5MK, C321056tV {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public Bitmap A08;
    public AvatarInfo A09;
    public C20997X8u A0A;
    public Integer A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public C62320sa A0H;
    public C62320sa A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public float A0P;
    public int A0Q;
    public int A0R;
    public boolean A0S;
    public boolean A0T;
    public final float A0U;
    public final float A0V;
    public final Context A0W;
    public final Paint A0X;
    public final Drawable A0Y;
    public final UserSession A0Z;
    public final C321106ta A0a;
    public final 0ng A0b;
    public final C321096tZ A0c;
    public final C318046oG A0d;
    public final AnonymousClass6M4 A0e;
    public final C321086tY A0f;
    public final 2Nn A0g;
    public final Integer A0h;
    public final Runnable A0i;
    public final Runnable A0j;
    public final String A0k;
    public final String A0l;
    public final String A0m;
    public final String A0n;
    public final AnonymousClass0eM A0o;
    public final AnonymousClass0eM A0p;
    public final AnonymousClass0eM A0q;
    public final AnonymousClass0eM A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final int A0u;
    public final int A0v;
    public final Paint A0w;
    public final Rect A0x;
    public final C321076tX A0y;
    public final CopyOnWriteArraySet A0z;
    public final CopyOnWriteArraySet A10;
    public final boolean A11;

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, X.6tZ] */
    public C321016tR(Context context, Drawable drawable, UserSession userSession, C41815B1v b1v, C318046oG r27, C321086tY r28, C321076tX r29, C320986tO r30, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, float f, int i, int i2, boolean z, boolean z2, boolean z3) {
        int i3;
        int i4;
        int i5;
        String str6 = str;
        0qQ.A0B(str6, 3);
        Context context2 = context;
        this.A0W = context2;
        UserSession userSession2 = userSession;
        this.A0Z = userSession2;
        this.A0l = str6;
        String str7 = str2;
        this.A0k = str7;
        C318046oG r9 = r27;
        this.A0d = r9;
        this.A0h = num;
        this.A0m = str3;
        this.A0n = str4;
        this.A0E = str5;
        C321076tX r1 = r29;
        this.A0y = r1;
        boolean z4 = z;
        this.A0s = z4;
        this.A01 = 0.0f;
        this.A11 = z2;
        Drawable drawable2 = drawable;
        this.A0Y = drawable2;
        this.A0t = z3;
        this.A0f = r28;
        this.A0R = Integer.MAX_VALUE;
        Paint paint = new Paint(1);
        paint.setColor(context2.getColor(R.color.cds_white_a20));
        this.A0X = paint;
        this.A0V = 0nA.A00(context2, 5.0f);
        this.A0U = 0nA.A00(context2, 10.0f);
        String str8 = this.A0E;
        int i6 = r1.A01;
        int i7 = r1.A02;
        int i8 = r1.A00;
        ? obj = new Object();
        obj.A08 = str7;
        obj.A09 = str6;
        obj.A07 = str8;
        float f2 = f;
        obj.A00 = f2;
        obj.A02 = i6;
        obj.A05 = i7;
        obj.A01 = i8;
        int i9 = i;
        obj.A03 = i9;
        int i10 = i2;
        obj.A04 = i10;
        obj.A0A = z4;
        Integer num3 = num2;
        obj.A06 = num3;
        this.A0c = obj;
        this.A04 = i7;
        this.A03 = i8;
        this.A0w = new Paint(2);
        if (i6 != -1) {
            i3 = i6;
        } else {
            i6 = this.A04;
            i3 = this.A03;
        }
        C321106ta r14 = new C321106ta(num3, f2, 0.65f, i6, i3, i9, i10);
        r14.setCallback(this);
        this.A0a = r14;
        if (drawable != null) {
            i4 = drawable2.getIntrinsicWidth();
        } else {
            i4 = r14.A04;
        }
        this.A0v = i4;
        if (drawable != null) {
            i5 = drawable2.getIntrinsicHeight();
        } else {
            i5 = r14.A03;
        }
        this.A0u = i5;
        this.A0x = new Rect();
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        this.A10 = copyOnWriteArraySet;
        CopyOnWriteArraySet copyOnWriteArraySet2 = new CopyOnWriteArraySet();
        this.A0z = copyOnWriteArraySet2;
        this.A0i = new C321116tb(this);
        this.A0p = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 49));
        this.A0o = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 48));
        this.A0b = new C321126tc(this, ((Boolean) this.A0p.getValue()).booleanValue() ? 1 : 3);
        this.A0j = new C321136td(this);
        this.A0T = true;
        this.A0r = AnonymousClass0eN.A01(C321146te.A00);
        this.A0g = 2Nm.A00(context2, userSession2);
        this.A0q = AnonymousClass0eN.A01(new AnonymousClass9L3(this, 0));
        C41815B1v b1v2 = b1v;
        if (b1v != null) {
            copyOnWriteArraySet.add(b1v2);
        }
        C320986tO r0 = r30;
        if (r30 != null) {
            copyOnWriteArraySet2.add(r0);
        }
        if (r9 != C318046oG.CUTOUT_VIDEO ? r9 != C318046oG.AVATAR_ANIMATED : str6.length() > 0) {
            A0C(str6);
        }
        this.A0C = str7;
        this.A0e = C321156tf.A00(context2, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r1 != true) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r1 != true) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized android.graphics.Bitmap A02(X.C321016tR r8, X.C20997X8u r9) {
        /*
            monitor-enter(r8)
            android.graphics.Bitmap r3 = r8.A08     // Catch:{ all -> 0x0098 }
            boolean r6 = r9 instanceof X.WXU     // Catch:{ all -> 0x0098 }
            r5 = 0
            if (r6 == 0) goto L_0x000c
            r0 = r9
            X.WXU r0 = (X.WXU) r0     // Catch:{ all -> 0x0098 }
            goto L_0x000d
        L_0x000c:
            r0 = r5
        L_0x000d:
            r4 = 1
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r2 = r0.A02     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r2 != r0) goto L_0x0018
            r1 = 1
        L_0x0018:
            r0 = 1
            if (r1 == r4) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r0 == 0) goto L_0x002d
            r0 = r9
            X.WXU r0 = (X.WXU) r0     // Catch:{ all -> 0x0098 }
            com.instagram.giphy.webp.IgWebPAnimDecoder r0 = r0.A05     // Catch:{ all -> 0x0098 }
            int r2 = r0.getMaxCropX()     // Catch:{ all -> 0x0098 }
            int r0 = r0.getMinCropX()     // Catch:{ all -> 0x0098 }
            int r2 = r2 - r0
            goto L_0x0031
        L_0x002d:
            int r2 = r9.getWidth()     // Catch:{ all -> 0x0098 }
        L_0x0031:
            if (r6 == 0) goto L_0x0037
            r0 = r9
            X.WXU r0 = (X.WXU) r0     // Catch:{ all -> 0x0098 }
            goto L_0x0038
        L_0x0037:
            r0 = r5
        L_0x0038:
            if (r0 == 0) goto L_0x0045
            java.lang.Integer r7 = r0.A02     // Catch:{ all -> 0x0098 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0098 }
            r1 = 0
            if (r7 != r0) goto L_0x0042
            r1 = 1
        L_0x0042:
            r0 = 1
            if (r1 == r4) goto L_0x0046
        L_0x0045:
            r0 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0057
            r0 = r9
            X.WXU r0 = (X.WXU) r0     // Catch:{ all -> 0x0098 }
            com.instagram.giphy.webp.IgWebPAnimDecoder r0 = r0.A05     // Catch:{ all -> 0x0098 }
            int r1 = r0.getMaxCropY()     // Catch:{ all -> 0x0098 }
            int r0 = r0.getMinCropY()     // Catch:{ all -> 0x0098 }
            int r1 = r1 - r0
            goto L_0x005b
        L_0x0057:
            int r1 = r9.getHeight()     // Catch:{ all -> 0x0098 }
        L_0x005b:
            if (r3 == 0) goto L_0x006a
            int r0 = r3.getWidth()     // Catch:{ all -> 0x0098 }
            if (r2 != r0) goto L_0x006a
            int r0 = r3.getHeight()     // Catch:{ all -> 0x0098 }
            if (r1 != r0) goto L_0x006a
            goto L_0x0096
        L_0x006a:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ all -> 0x0098 }
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r2, r1, r0)     // Catch:{ all -> 0x0098 }
            r8.A08 = r3     // Catch:{ all -> 0x0098 }
            if (r6 == 0) goto L_0x0077
            r5 = r9
            X.WXU r5 = (X.WXU) r5     // Catch:{ all -> 0x0098 }
        L_0x0077:
            if (r5 == 0) goto L_0x0084
            java.lang.Integer r2 = r5.A02     // Catch:{ all -> 0x0098 }
            java.lang.Integer r1 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0098 }
            r0 = 0
            if (r2 != r1) goto L_0x0081
            r0 = 1
        L_0x0081:
            if (r0 != r4) goto L_0x0084
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            if (r4 != 0) goto L_0x0093
            int r0 = r3.getHeight()     // Catch:{ all -> 0x0098 }
            float r1 = (float) r0     // Catch:{ all -> 0x0098 }
            float r0 = r8.A01()     // Catch:{ all -> 0x0098 }
            float r1 = r1 * r0
            r8.A00 = r1     // Catch:{ all -> 0x0098 }
        L_0x0093:
            X.0qQ.A07(r3)     // Catch:{ all -> 0x0098 }
        L_0x0096:
            monitor-exit(r8)
            return r3
        L_0x0098:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.A02(X.6tR, X.X8u):android.graphics.Bitmap");
    }

    public final void A08() {
        if (this.A0L) {
            this.A0L = false;
            invalidateSelf();
        }
        this.A07 = System.currentTimeMillis();
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        if (((java.util.Map) r2.A07.getValue()).containsKey(r1) != false) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C(java.lang.String r9) {
        /*
            r8 = this;
            r3 = r8
            java.lang.Integer r2 = r8.A0B
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 == r1) goto L_0x0044
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r2 == r0) goto L_0x0044
            r8.A0B = r1
            X.6tY r2 = r8.A0f
            if (r2 == 0) goto L_0x0034
            java.lang.String r1 = r8.A0k
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.0Ud r0 = r2.A08
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0034
            X.0Ud r0 = r2.A07
            java.lang.Object r0 = r0.getValue()
            java.util.Map r0 = (java.util.Map) r0
            boolean r0 = r0.containsKey(r1)
            r7 = 1
            if (r0 == 0) goto L_0x0035
        L_0x0034:
            r7 = 0
        L_0x0035:
            X.7Sw r0 = X.C331897Sw.A0A
            android.content.Context r0 = r8.A0W
            X.7Sw r2 = X.C331917Sy.A00(r0)
            r5 = 0
            boolean r6 = r8.A0t
            r4 = r9
            r2.A06(r3, r4, r5, r6, r7)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.A0C(java.lang.String):void");
    }

    public final void A9D(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A10.add(b1v);
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final boolean CZ7(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        C318046oG r2 = this.A0d;
        if ((r2 != C318046oG.GIF || !00p.A0k(this.A0k, "gif_", false)) && (r2 != C318046oG.AVATAR_ANIMATED || !182.A06(0Tu.A05, userSession, 36319939968311108L) || !0qQ.A0K(this.A0G, userSession.A06))) {
            return false;
        }
        return true;
    }

    public final /* synthetic */ void D1M(boolean z) {
    }

    public final /* synthetic */ void DH4(X9T x9t, String str, String str2) {
    }

    public void DOa(C20997X8u x8u, String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(x8u, 1);
        0qQ.A0B(str2, 2);
        A0B(x8u, str, str2);
        A09();
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C320986tO) it.next()).DOa(x8u, str, str2);
        }
        if (this.A0d == C318046oG.CUTOUT_VIDEO) {
            UserSession userSession = this.A0Z;
            0qQ.A0B(userSession, 0);
            if (!182.A06(0Tu.A06, userSession, 36323805438291484L)) {
                String absolutePath = new File(this.A0g.C4W(), 002.A0R(this.A0k, "_webp")).getAbsolutePath();
                0qQ.A07(absolutePath);
                this.A0D = null;
                A04(this, absolutePath);
            }
        }
    }

    public final void DOb(C20997X8u x8u, String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0qQ.A0B(x8u, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        DOa(x8u, str, str2);
        File C4W = this.A0g.C4W();
        String str4 = this.A0k;
        File file = new File(C4W, 002.A0R(str4, "_audio"));
        if (file.exists()) {
            C321086tY r1 = this.A0f;
            if (r1 != null) {
                r1.A03(str4, file.getAbsolutePath());
                return;
            }
            return;
        }
        0nY.A00().ATE(new KJ0(this, file, str3));
    }

    public final void DaG(String str, float f) {
        0qQ.A0B(str, 0);
        this.A0P = f;
        this.A0a.A00(f);
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C320986tO) it.next()).DaG(str, f);
        }
    }

    public final void Dg0() {
        this.A0J = true;
        A03(this);
    }

    public final void EE1(C41815B1v b1v) {
        0qQ.A0B(b1v, 0);
        this.A10.remove(b1v);
    }

    public final void Ejy(boolean z) {
        this.A0M = true;
    }

    public final void draw(Canvas canvas) {
        float A012;
        WXU wxu;
        C20997X8u x8u;
        0qQ.A0B(canvas, 0);
        if (this.A0A == null) {
            Drawable drawable = this.A0Y;
            if (drawable == null) {
                C321106ta r1 = this.A0a;
                r1.A00(this.A0P);
                r1.draw(canvas);
            } else {
                drawable.draw(canvas);
            }
        } else {
            if (!this.A0S) {
                this.A0S = true;
                Iterator it = this.A10.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    ((C41815B1v) it.next()).DXr();
                }
            }
            canvas.save();
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            C20997X8u x8u2 = this.A0A;
            if (!(x8u2 instanceof WXU) || (wxu = (WXU) x8u2) == null || wxu.A02 != AnonymousClass05K.A0C) {
                A012 = A01();
                if (A012 != 1.0f) {
                    canvas.scale(A012, A012);
                }
            } else {
                A012 = 1.0f;
            }
            Bitmap bitmap = this.A08;
            if (bitmap != null) {
                if (this.A0O) {
                    float A013 = A01();
                    RectF rectF = new RectF(getBounds());
                    float f = rectF.left;
                    float f2 = this.A0V;
                    rectF.left = (f - f2) / A013;
                    rectF.right = (rectF.right + f2) / A013;
                    rectF.top = (rectF.top - f2) / A013;
                    rectF.bottom = (rectF.bottom + f2) / A013;
                    float f3 = this.A0U;
                    canvas.drawRoundRect(rectF, f3, f3, this.A0X);
                }
                canvas.drawBitmap(bitmap, ((float) bounds.left) / A012, ((float) bounds.top) / A012, this.A0w);
            }
            canvas.restore();
        }
        if (this.A0N && !this.A0L) {
            this.A0N = false;
            long j = this.A06;
            long currentTimeMillis = j - System.currentTimeMillis();
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (j - this.A07 <= AzG() * ((long) this.A0R)) {
                if (!(!this.A0T || this.A0H == null || (x8u = this.A0A) == null)) {
                    int frameCount = x8u.getFrameCount();
                    int i = this.A0Q;
                    if (i <= frameCount) {
                        this.A0Q = i + 1;
                    } else {
                        this.A0T = false;
                        C62320sa r0 = this.A0H;
                        if (r0 != null) {
                            r0.invoke();
                        }
                    }
                }
                Choreographer.getInstance().postFrameCallbackDelayed(this, currentTimeMillis);
            } else {
                C62320sa r02 = this.A0I;
                if (r02 != null) {
                    r02.invoke();
                }
            }
        }
        this.A0e.draw(canvas);
    }

    public final int getOpacity() {
        return -3;
    }

    public final void onBoundsChange(Rect rect) {
        0qQ.A0B(rect, 0);
        Rect rect2 = this.A0x;
        rect2.set(getBounds());
        int A012 = AnonymousClass1GB.A01(((float) rect2.width()) * 0.15f);
        rect2.inset(A012, A012);
        this.A0a.setBounds(rect2);
        Drawable drawable = this.A0Y;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        0qQ.A0B(runnable, 1);
        scheduleSelf(runnable, j);
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        0qQ.A0B(runnable, 1);
        unscheduleSelf(runnable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3.A0E == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C321016tR r3) {
        /*
            java.lang.Integer r1 = r3.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r2 = 1
            if (r1 != r0) goto L_0x000c
            java.lang.String r0 = r3.A0E
            r1 = 1
            if (r0 != 0) goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            boolean r0 = r3.A0J
            if (r0 == 0) goto L_0x001f
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x001f
        L_0x0015:
            if (r1 == 0) goto L_0x001e
            if (r2 == 0) goto L_0x001e
            java.lang.String r0 = r3.A0E
            r3.A0C(r0)
        L_0x001e:
            return
        L_0x001f:
            r2 = 0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.A03(X.6tR):void");
    }

    public static final void A04(C321016tR r2, String str) {
        if (r2.A0F != null && str != null) {
            if (new File(str).exists()) {
                r2.A0D = str;
            } else {
                0nY.A00().ATE(new C61695KIl(r2, str));
            }
        }
    }

    public final void A05() {
        if (!this.A0L) {
            this.A0L = true;
            invalidateSelf();
        }
    }

    public final void A06() {
        this.A05 = 0;
        this.A02 = 0;
        this.A06 = 0;
    }

    public final void A07() {
        if (this.A0L) {
            this.A0L = false;
            invalidateSelf();
            this.A05 = System.currentTimeMillis();
            if (((Boolean) this.A0o.getValue()).booleanValue()) {
                Q01.A01.A00(this.A0b);
            } else {
                0nY.A00().ATE(this.A0b);
            }
        }
    }

    public final void A0A(int i) {
        if (this.A0R != i) {
            this.A0R = i;
            invalidateSelf();
        }
    }

    public final void A0B(C20997X8u x8u, String str, String str2) {
        Integer num;
        WXU wxu;
        this.A0P = 1.0f;
        this.A0A = x8u;
        if (this.A0d == C318046oG.CUTOUT_VIDEO && AnonymousClass8IK.A06(this.A0Z) && (x8u instanceof WXU) && (wxu = (WXU) x8u) != null) {
            wxu.A02 = AnonymousClass05K.A0C;
            wxu.A01 = -1;
            wxu.A00 = -1;
        }
        this.A0F = str2;
        if (2PP.A00(this.A0E, str)) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        this.A0B = num;
        A04(this, this.A0D);
    }

    public final void AHg() {
        this.A10.clear();
    }

    public final void AQX(Canvas canvas) {
        C20997X8u x8u = this.A0A;
        if (x8u != null) {
            canvas.save();
            Rect bounds = getBounds();
            0qQ.A07(bounds);
            float A012 = A01();
            canvas.scale(A012, A012);
            Bitmap createBitmap = Bitmap.createBitmap(x8u.getWidth(), x8u.getHeight(), Bitmap.Config.ARGB_8888);
            0qQ.A07(createBitmap);
            if (AzG() == 0) {
                Bitmap bitmap = this.A08;
                if (bitmap != null) {
                    canvas.drawBitmap(bitmap, ((float) bounds.left) / A012, ((float) bounds.top) / A012, this.A0w);
                }
            } else {
                int i = 4;
                if (this.A0d == C318046oG.CUTOUT_VIDEO) {
                    i = 1;
                }
                int i2 = 0;
                do {
                    x8u.EL4((int) (((((long) i2) * AzG()) / 4) % AzG()), createBitmap);
                    canvas.drawBitmap(createBitmap, ((float) bounds.left) / A012, ((float) bounds.top) / A012, this.A0w);
                    i2++;
                } while (i2 < i);
            }
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final long AzG() {
        C20997X8u x8u = this.A0A;
        if (x8u != null) {
            return (long) x8u.getDuration();
        }
        return 0;
    }

    public final /* synthetic */ C391369sm Bsf() {
        return C391369sm.GIPHY;
    }

    public final AnonymousClass6M4 C49() {
        return this.A0e;
    }

    public final boolean Cbg() {
        return this.A0M;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final boolean EsB() {
        String str;
        C321086tY r2 = this.A0f;
        if (r2 == null) {
            return false;
        }
        String str2 = this.A0k;
        0qQ.A0B(str2, 0);
        C376649Iu r0 = (C376649Iu) C321086tY.A00(r2).get(str2);
        if (r0 == null || (str = r0.A01) == null) {
            return true;
        }
        return !new File(str).exists();
    }

    public final void FL9(boolean z, boolean z2) {
        this.A0O = z;
        AnonymousClass6M4 r0 = this.A0e;
        if (z2) {
            r0.A01();
        } else {
            r0.A00();
        }
        invalidateSelf();
    }

    public final void doFrame(long j) {
        C20997X8u x8u;
        int i;
        if (!this.A0L && (x8u = this.A0A) != null) {
            long j2 = this.A05;
            int i2 = 0;
            if (j2 > 0) {
                i = (int) (System.currentTimeMillis() - j2);
            } else {
                i = 0;
            }
            if (x8u.getDuration() > 0) {
                i2 = (this.A02 + i) % x8u.getDuration();
            }
            this.A02 = i2;
            this.A05 = System.currentTimeMillis();
            if (((Boolean) this.A0o.getValue()).booleanValue()) {
                Q01.A01.A00(this.A0b);
            } else {
                0nY.A00().ATE(this.A0b);
            }
        }
    }

    public final int getIntrinsicHeight() {
        WXU wxu;
        C20997X8u x8u = this.A0A;
        if ((x8u instanceof WXU) && (wxu = (WXU) x8u) != null && wxu.A02 == AnonymousClass05K.A0C) {
            IgWebPAnimDecoder igWebPAnimDecoder = wxu.A05;
            int maxCropY = igWebPAnimDecoder.getMaxCropY() - igWebPAnimDecoder.getMinCropY();
            if (Integer.valueOf(maxCropY) != null) {
                return maxCropY;
            }
        }
        if (this.A0A == null) {
            return this.A0u;
        }
        return this.A03;
    }

    public final int getIntrinsicWidth() {
        WXU wxu;
        C20997X8u x8u = this.A0A;
        if ((x8u instanceof WXU) && (wxu = (WXU) x8u) != null && wxu.A02 == AnonymousClass05K.A0C) {
            IgWebPAnimDecoder igWebPAnimDecoder = wxu.A05;
            int maxCropX = igWebPAnimDecoder.getMaxCropX() - igWebPAnimDecoder.getMinCropX();
            if (Integer.valueOf(maxCropX) != null) {
                return maxCropX;
            }
        }
        if (this.A0A == null) {
            return this.A0v;
        }
        return this.A04;
    }

    public final boolean isLoading() {
        if (this.A0A == null) {
            return true;
        }
        return false;
    }

    public void onError(String str) {
        this.A0B = AnonymousClass05K.A0N;
        this.A0P = 1.0f;
        this.A0a.A00(1.0f);
        Iterator it = this.A0z.iterator();
        while (it.hasNext()) {
            ((C320986tO) it.next()).onError(str);
        }
        11Z.A02(this.A0i);
    }

    public final void setAlpha(int i) {
        this.A0w.setAlpha(i);
        this.A0X.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0w.setColorFilter(colorFilter);
        this.A0X.setColorFilter(colorFilter);
    }

    private final float A01() {
        float intrinsicWidth = (float) getIntrinsicWidth();
        C20997X8u x8u = this.A0A;
        if (x8u != null) {
            return intrinsicWidth / ((float) x8u.getWidth());
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A09() {
        this.A07 = System.currentTimeMillis();
        if (this.A11) {
            Choreographer.getInstance().postFrameCallback(this);
        }
        Iterator it = this.A10.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            ((C41815B1v) it.next()).DOX();
        }
        A03(this);
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C321016tR(android.content.Context r23, com.instagram.common.session.UserSession r24, com.instagram.common.typedurl.ImageUrl r25, com.instagram.common.typedurl.ImageUrl r26, X.C41815B1v r27, X.C321076tX r28, java.lang.Integer r29, java.lang.String r30, float r31, int r32, int r33, boolean r34) {
        /*
            r22 = this;
            r20 = 1
            r0 = 3
            r1 = r25
            X.0qQ.A0B(r1, r0)
            r0 = 4
            r12 = r30
            X.0qQ.A0B(r12, r0)
            r3 = r24
            if (r24 == 0) goto L_0x0049
            com.instagram.common.typedurl.ImageUrl r0 = X.C226972iH.A00(r1)
            java.lang.String r11 = r0.getUrl()
            X.0qQ.A07(r11)
            X.6oG r5 = X.C318046oG.GIF
            r2 = 0
            if (r26 == 0) goto L_0x0047
            com.instagram.common.typedurl.ImageUrl r0 = X.C226972iH.A00(r26)
            java.lang.String r15 = r0.getUrl()
        L_0x002a:
            r21 = 0
            r0 = r22
            r1 = r23
            r4 = r27
            r7 = r28
            r10 = r29
            r16 = r31
            r17 = r32
            r18 = r33
            r19 = r34
            r6 = r2
            r8 = r2
            r9 = r2
            r13 = r2
            r14 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0047:
            r15 = 0
            goto L_0x002a
        L_0x0049:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.<init>(android.content.Context, com.instagram.common.session.UserSession, com.instagram.common.typedurl.ImageUrl, com.instagram.common.typedurl.ImageUrl, X.B1v, X.6tX, java.lang.Integer, java.lang.String, float, int, int, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C321016tR(android.content.Context r23, com.instagram.common.session.UserSession r24, X.C321076tX r25, java.lang.Integer r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, float r30, int r31, int r32, boolean r33) {
        /*
            r22 = this;
            r2 = 0
            r0 = 3
            r11 = r27
            X.0qQ.A0B(r11, r0)
            r0 = 4
            r12 = r28
            X.0qQ.A0B(r12, r0)
            r0 = 11
            r10 = r26
            X.0qQ.A0B(r10, r0)
            r3 = r24
            if (r24 == 0) goto L_0x0038
            X.6oG r5 = X.C318046oG.GIF
            r20 = 1
            r21 = 0
            r0 = r22
            r1 = r23
            r7 = r25
            r15 = r29
            r16 = r30
            r17 = r31
            r18 = r32
            r19 = r33
            r4 = r2
            r6 = r2
            r8 = r2
            r9 = r2
            r13 = r2
            r14 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        L_0x0038:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6tX, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, float, int, int, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C321016tR(android.content.Context r25, com.instagram.common.session.UserSession r26, X.C321076tX r27, com.instagram.model.mediasize.GifUrlImpl r28, java.lang.Integer r29, java.lang.String r30, float r31, int r32, int r33) {
        /*
            r24 = this;
            r21 = 0
            r4 = 0
            r1 = 1
            r3 = r25
            X.0qQ.A0B(r3, r1)
            r0 = 3
            r2 = r28
            X.0qQ.A0B(r2, r0)
            r0 = 4
            r14 = r30
            X.0qQ.A0B(r14, r0)
            r5 = r26
            if (r26 == 0) goto L_0x0040
            X.16c r0 = X.AnonymousClass3OT.A00(r2)
            com.instagram.model.mediasize.GifUrlImpl r0 = (com.instagram.model.mediasize.GifUrlImpl) r0
            java.lang.String r13 = r0.A09
            X.6oG r7 = X.C318046oG.GIF
            r2 = r24
            r9 = r27
            r12 = r29
            r18 = r31
            r19 = r32
            r20 = r33
            r6 = r4
            r8 = r4
            r10 = r4
            r11 = r4
            r15 = r4
            r16 = r4
            r17 = r4
            r22 = r1
            r23 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0040:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C321016tR.<init>(android.content.Context, com.instagram.common.session.UserSession, X.6tX, com.instagram.model.mediasize.GifUrlImpl, java.lang.Integer, java.lang.String, float, int, int):void");
    }
}
