package X;

import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.instagram.maps.raster.IgRasterMapView;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

/* renamed from: X.U4m  reason: case insensitive filesystem */
public class C14723U4m extends FrameLayout implements X0M, X0N, X0O {
    public static final double A0p = Math.log(2.0d);
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public int A0D = -987675;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public WFU A0M;
    public C18585Vuc A0N;
    public C14633Tzf A0O;
    public C16732V3p A0P;
    public C20359Wpy A0Q;
    public XAA A0R;
    public Queue A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public Context A0a;
    public X0L A0b;
    public C17745VdE A0c;
    public boolean A0d;
    public boolean A0e;
    public boolean A0f;
    public final Matrix A0g = new Matrix();
    public final Matrix A0h = new Matrix();
    public final EnumSet A0i = EnumSet.of(C16503Uvz.A00);
    public final BroadcastReceiver A0j = new C67634MrN(this, 0);
    public final ComponentCallbacks A0k = A01(this);
    public final Paint A0l = new Paint(2);
    public final RectF A0m = new RectF();
    public final float[] A0n = new float[2];
    public final float[] A0o = new float[4];

    private void A02() {
        if (!this.A0d) {
            this.A0a.registerComponentCallbacks(this.A0k);
            0DH.A00(this.A0j, this.A0a, new IntentFilter(AnonymousClass000.A00(2601)));
            this.A0d = true;
        }
    }

    private void A03() {
        int i = 0;
        if (this.A0d) {
            this.A0a.unregisterComponentCallbacks(this.A0k);
            try {
                this.A0a.unregisterReceiver(this.A0j);
            } catch (IllegalArgumentException unused) {
            }
            this.A0d = false;
        }
        this.A0M.A07();
        1yR[] r4 = 1yR.A0X;
        do {
            1yR r1 = r4[i];
            if (r1.A06) {
                synchronized (r1) {
                    1yR.A01(r1);
                }
            } else {
                1yR.A01(r1);
            }
            i++;
        } while (i < 8);
    }

    public static void A0A(C14723U4m u4m) {
        u4m.A0W = false;
        W2R.A03(u4m.A0M).A01();
    }

    public static void A0D(IgRasterMapView igRasterMapView) {
        igRasterMapView.A03 = true;
        igRasterMapView.A0G(new WFO(new WIS((Object) igRasterMapView, 0), igRasterMapView));
    }

    public static final double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    public static W4U A01(C14723U4m u4m) {
        u4m.A02 = 0.5d;
        u4m.A03 = 0.5d;
        u4m.A0J = SystemClock.uptimeMillis();
        u4m.A0R = XAA.A00;
        return new W4U(u4m);
    }

    private void A04() {
        RectF rectF = this.A0m;
        rectF.left = 0.0f;
        rectF.right = (float) this.A0G;
        rectF.top = 0.0f;
        rectF.bottom = (float) this.A0E;
        Matrix matrix = this.A0h;
        matrix.mapRect(rectF);
        float[] fArr = this.A0o;
        float f = this.A04;
        fArr[0] = -f;
        float f2 = -this.A05;
        fArr[1] = f2;
        fArr[2] = f;
        fArr[3] = f2;
        matrix.mapVectors(fArr);
        float max = Math.max(Math.abs(fArr[0]), Math.abs(fArr[2]));
        float max2 = Math.max(Math.abs(fArr[1]), Math.abs(fArr[3]));
        float f3 = (float) this.A0K;
        this.A00 = (double) (max / f3);
        this.A01 = (double) (max2 / f3);
    }

    private void A05(float f, float f2, float f3, float f4) {
        float[] fArr = this.A0n;
        fArr[0] = this.A04 - f;
        fArr[1] = this.A05 - f2;
        this.A0h.mapVectors(fArr);
        long j = this.A0K;
        double d = (double) j;
        this.A02 = A00(((double) f3) + (((double) fArr[0]) / d));
        this.A03 = A0E(j, ((double) f4) + (((double) fArr[1]) / d));
    }

    private void A06(int i, float f) {
        this.A0H = i;
        this.A0C = f;
        int i2 = 1 << i;
        this.A0F = i2;
        this.A0K = (long) (i2 * this.A0M.A0F);
    }

    private void A08(Bundle bundle) {
        if (bundle != null && bundle.containsKey("zoom")) {
            WFU wfu = this.A0M;
            A06((int) Math.min(Math.max((float) bundle.getInt("zoom"), wfu.A01), wfu.A00), bundle.getFloat("scale"));
            this.A02 = bundle.getDouble("xVisibleCenter") - ((double) (0 / (this.A0K << 1)));
            this.A03 = bundle.getDouble("yVisibleCenter") - ((double) (0 / (this.A0K << 1)));
            this.A0B = bundle.getFloat("rotation");
            Matrix matrix = this.A0g;
            float f = this.A0C;
            matrix.setScale(f, f);
            matrix.postRotate(this.A0B);
            matrix.invert(this.A0h);
            this.A0Y = false;
        }
    }

    private void A09(C18585Vuc vuc) {
        String str;
        if ("FacebookMapOptions.java".equals(vuc.A05)) {
            if (this instanceof IgRasterMapView) {
                str = "AbstractRasterMapView.java";
            } else {
                str = "MapView.java";
            }
            vuc.A01(str);
        }
    }

    public static void A0B(C14723U4m u4m) {
        WFU wfu = u4m.A0M;
        W0J w0j = wfu.A0L.A09;
        if (w0j.A03 == -1) {
            w0j.A03 = 1;
        }
        u4m.A0W = true;
        wfu.A07();
        C20359Wpy wpy = u4m.A0Q;
        wpy.A0E.removeCallbacks(wpy);
        wpy.A0A = false;
        wpy.A05 = false;
        wpy.A06 = true;
        wpy.A0F.forceFinished(true);
        wpy.A01 = 0.0f;
        wpy.A00 = 0.0f;
    }

    public static void A0C(C14723U4m u4m) {
        W0J w0j = u4m.A0M.A0L.A09;
        if (w0j.A03 == -1) {
            w0j.A03 = 1;
        }
        C20359Wpy wpy = u4m.A0Q;
        View view = wpy.A0E;
        view.removeCallbacks(wpy);
        wpy.A06 = false;
        wpy.A05 = true;
        view.postOnAnimation(wpy);
    }

    public final double A0E(long j, double d) {
        double d2 = this.A01 * (((double) this.A0K) / ((double) j));
        double d3 = 1.0d - d2;
        if (d < d2) {
            return d2;
        }
        if (d > d3) {
            return d3;
        }
        return d;
    }

    public final void A0F(float f, float f2, float f3) {
        if (this.A0e) {
            W2R w2r = this.A0M.A0J;
            float[] fArr = this.A0n;
            w2r.A08(fArr, f2, f3);
            float f4 = fArr[0];
            float f5 = fArr[1];
            Matrix matrix = this.A0g;
            matrix.postRotate(f - this.A0B, f2, f3);
            matrix.invert(this.A0h);
            this.A0B = f % 360.0f;
            A04();
            A05(f2, f3, f4, f5);
        }
    }

    public final void A0G(X2E x2e) {
        Queue queue;
        if (!this.A0f || ((queue = this.A0S) != null && !queue.isEmpty())) {
            Queue queue2 = this.A0S;
            if (queue2 == null) {
                queue2 = new LinkedList();
                this.A0S = queue2;
            }
            queue2.add(x2e);
            return;
        }
        x2e.DPZ(this.A0M);
    }

    public final boolean A0I(float f, float f2, float f3) {
        W2R w2r = this.A0M.A0J;
        float[] fArr = this.A0n;
        w2r.A08(fArr, f2, f3);
        float f4 = fArr[0];
        float f5 = fArr[1];
        WFU wfu = this.A0M;
        float min = Math.min(Math.max(f, wfu.A01), wfu.A00);
        float f6 = (min % 1.0f) + 1.0f;
        int i = this.A0H;
        float f7 = f6 / this.A0C;
        this.A06 = f7;
        A06((int) min, f6);
        Matrix matrix = this.A0g;
        matrix.postScale(f7, f7, f2, f3);
        matrix.invert(this.A0h);
        A04();
        A05(f2, f3, f4, f5);
        if (this.A0H != i) {
            return true;
        }
        return false;
    }

    public final void D6V(Bundle bundle) {
        WFU wfu = new WFU(this.A0N, this);
        this.A0M = wfu;
        CameraPosition cameraPosition = this.A0N.A04;
        if (cameraPosition == null) {
            float f = wfu.A01;
            A06((int) f, (f % 1.0f) + 1.0f);
        } else {
            float min = Math.min(Math.max(cameraPosition.A02, wfu.A01), wfu.A00);
            A06((int) min, (min % 1.0f) + 1.0f);
            LatLng latLng = cameraPosition.A03;
            if (latLng != null) {
                this.A02 = W2R.A01(latLng.A01);
                this.A03 = W2R.A00(latLng.A00);
            }
            this.A0B = cameraPosition.A00;
        }
        this.A0P = wfu.A0K;
        Matrix matrix = this.A0g;
        float f2 = this.A0C;
        matrix.setScale(f2, f2);
        matrix.postRotate(this.A0B);
        matrix.invert(this.A0h);
        A08(bundle);
    }

    public EnumSet getCurrentAttribution() {
        return this.A0i;
    }

    @Deprecated
    public final WFU getMap() {
        return this.A0M;
    }

    public final C18585Vuc getMapOptions() {
        return this.A0N;
    }

    public float getPixelSize() {
        return (float) this.A0K;
    }

    public float getTileScale() {
        return this.A0C;
    }

    public float getZoom() {
        return (((float) this.A0H) + this.A0C) - 1.0f;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("zoom")) {
                if (bundle.containsKey("parentBundle")) {
                    super.onRestoreInstanceState(bundle.getParcelable("parentBundle"));
                }
                A08(bundle);
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    public final Parcelable onSaveInstanceState() {
        boolean z = this.A0Y;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (z) {
            return onSaveInstanceState;
        }
        Bundle bundle = new Bundle();
        if (!this.A0Y) {
            bundle.putDouble("xVisibleCenter", this.A02 + ((double) (0 / (this.A0K << 1))));
            bundle.putDouble("yVisibleCenter", this.A03 + ((double) (0 / (this.A0K << 1))));
            bundle.putInt("zoom", this.A0H);
            bundle.putFloat("scale", this.A0C);
            bundle.putFloat("rotation", this.A0B);
            this.A0Y = true;
        }
        bundle.putParcelable("parentBundle", onSaveInstanceState);
        return bundle;
    }

    public final void setMapEventHandler(XAA xaa) {
        if (xaa == null) {
            xaa = XAA.A00;
        }
        this.A0R = xaa;
    }

    public void setOnFirstTileLoadedCallback(X0L x0l) {
        this.A0b = x0l;
    }

    public C14723U4m(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C18585Vuc A002 = C18585Vuc.A00(attributeSet);
        A09(A002);
        A07(context, A002);
    }

    private void A07(Context context, C18585Vuc vuc) {
        this.A0I = System.nanoTime();
        setWillNotDraw(false);
        this.A0a = context;
        this.A0N = vuc;
        boolean z = vuc.A08;
        vuc.A08 = z;
        int i = -987675;
        if (z) {
            i = -15789542;
        }
        this.A0D = i;
        C17745VdE vdE = new C17745VdE(context, this);
        this.A0c = vdE;
        Matrix matrix = this.A0h;
        vdE.A0K = matrix;
        vdE.A09 = 0.87f;
        vdE.A07 = 0.85f;
        this.A0e = this.A0a.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        this.A0Z = true;
        C20359Wpy wpy = new C20359Wpy(this, this);
        this.A0Q = wpy;
        wpy.A04 = matrix;
        2R6.A08.add(new WeakReference(this));
        2R6.A01(false);
    }

    public final boolean A0H(float f, float f2, float f3) {
        if (A0I(f, f2, f3)) {
            this.A0M.A05();
        }
        return AnonymousClass7TF.A1P((this.A06 > 1.0f ? 1 : (this.A06 == 1.0f ? 0 : -1)));
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(985644278);
        super.onAttachedToWindow();
        if (this.A0M != null) {
            A02();
            this.A0L = System.nanoTime();
            if (!this.A0V) {
                UHJ uhj = this.A0M.A0L.A03;
                uhj.A01.set(0);
                uhj.A04.set(0);
                uhj.A05.set(0);
                this.A0V = true;
            }
            AnonymousClass0fD.A0D(-761523511, A062);
            return;
        }
        RuntimeException runtimeException = new RuntimeException("MapView.onCreate() must be called!");
        AnonymousClass0fD.A0D(-512979122, A062);
        throw runtimeException;
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A0M.A04();
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1407247971);
        super.onDetachedFromWindow();
        this.A0M.A04();
        Vector vector = C18636VvY.A02;
        C18796W2e.A01(new UH7());
        A03();
        AnonymousClass0fD.A0D(-1826184611, A062);
    }

    public final void onDraw(Canvas canvas) {
        long nanoTime = System.nanoTime();
        super.onDraw(canvas);
        canvas.drawColor(this.A0D);
        this.A0T = true;
        int size = this.A0M.A0O.size();
        for (int i = 0; i < size; i++) {
            C14633Tzf tzf = (C14633Tzf) this.A0M.A0O.get(i);
            if (tzf.A04) {
                tzf.A0D(canvas);
                if (tzf instanceof UH2) {
                    this.A0T &= AnonymousClass7TF.A1Q(((UH3) tzf).A00);
                }
            }
        }
        if (this.A0T) {
            WFU wfu = this.A0M;
            if (wfu.A0D != null) {
                wfu.A06();
            }
            if (this.A0V) {
                UHI uhi = this.A0M.A0L;
                1yR.A0H.A05(new C20580Wuy(uhi.A03, this.A0N.A06));
                this.A0V = false;
            }
        }
        long nanoTime2 = System.nanoTime();
        String str = this.A0N.A06;
        1yR.A0F.A02(nanoTime2 - nanoTime);
        if (this.A0I > 0) {
            1yR.A0G.A05(new C20580Wuy(this, str, 0, nanoTime2));
            this.A0I = 0;
        }
        if (this.A0L > 0) {
            1yR.A0I.A05(new C20580Wuy(this, str, 1, nanoTime2));
            this.A0L = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x00be, code lost:
        if (r1 != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
        /*
            r9 = this;
            long r2 = java.lang.System.nanoTime()
            super.onLayout(r10, r11, r12, r13, r14)
            int r0 = r9.getWidth()
            r9.A0G = r0
            int r5 = r9.getHeight()
            r9.A0E = r5
            int r4 = r9.A0G
            float r0 = (float) r4
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            r9.A04 = r0
            float r0 = (float) r5
            float r0 = r0 / r1
            r9.A05 = r0
            int r0 = java.lang.Math.max(r5, r4)
            double r4 = (double) r0
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r4 = r4 * r0
            X.WFU r6 = r9.A0M
            int r0 = r6.A0F
            double r0 = (double) r0
            int r0 = X.JTP.A01(r4, r0)
            double r0 = (double) r0
            double r4 = java.lang.Math.log(r0)
            double r0 = A0p
            double r4 = r4 / r0
            double r4 = java.lang.Math.ceil(r4)
            float r0 = (float) r4
            r9.A07 = r0
            float r1 = r6.A01
            X.U4m r0 = r6.A0I
            float r0 = r0.A07
            float r4 = java.lang.Math.max(r1, r0)
            r6.A01 = r4
            int r0 = r9.A0H
            float r1 = (float) r0
            float r0 = r9.A0C
            float r1 = r1 + r0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 - r6
            r5 = 0
            r8 = 1
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x00c1
            int r0 = (int) r4
            float r4 = r4 % r6
            float r4 = r4 + r6
            r9.A06(r0, r4)
            r1 = 1
        L_0x0061:
            r9.A04()
            boolean r0 = r9.A0f
            if (r0 != 0) goto L_0x00be
            int r0 = r9.A0H
            float r4 = (float) r0
            float r0 = r9.A0C
            float r4 = r4 + r0
            float r4 = r4 - r6
            X.WFU r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0H(r4, r1, r0)
            double r0 = r9.A02
            double r6 = r9.A03
            double r0 = A00(r0)
            r9.A02 = r0
            long r0 = r9.A0K
            double r0 = r9.A0E(r0, r6)
            r9.A03 = r0
            float r4 = r9.A0B
            X.WFU r0 = r9.A0M
            float r1 = r0.A00()
            float r0 = r0.A01()
            r9.A0F(r4, r1, r0)
            r9.A0f = r8
        L_0x009f:
            X.WFU r0 = r9.A0M
            r0.A05()
        L_0x00a4:
            X.WFU r0 = r9.A0M
            java.util.List r0 = r0.A0O
            int r1 = r0.size()
        L_0x00ac:
            if (r5 >= r1) goto L_0x00c3
            X.WFU r0 = r9.A0M
            java.util.List r0 = r0.A0O
            java.lang.Object r0 = r0.get(r5)
            X.Tzf r0 = (X.C14633Tzf) r0
            r0.A06()
            int r5 = r5 + 1
            goto L_0x00ac
        L_0x00be:
            if (r1 == 0) goto L_0x00a4
            goto L_0x009f
        L_0x00c1:
            r1 = 0
            goto L_0x0061
        L_0x00c3:
            java.util.Queue r0 = r9.A0S
            if (r0 == 0) goto L_0x00d1
            X.UH9 r1 = new X.UH9
            r1.<init>(r9)
            android.os.Handler r0 = X.C18796W2e.A01
            r0.post(r1)
        L_0x00d1:
            X.1yR r0 = X.1yR.A0L
            X.C13989Tnp.A1L(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14723U4m.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03ee, code lost:
        if (X.AnonymousClass7TE.A00(r3.A0D, r3.A0B) <= r7) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03fb, code lost:
        if (r13 != 0.0f) goto L_0x03fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007e, code lost:
        if (X.AnonymousClass7TE.A00(r7, r3.A01) <= r1) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0047, code lost:
        if (X.AnonymousClass7TE.A00(r7, r3.A0B) <= r11) goto L_0x02a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03a9 A[Catch:{ all -> 0x04f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x03f3 A[Catch:{ all -> 0x04f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x042f A[Catch:{ all -> 0x04f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013f A[Catch:{ all -> 0x04f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = -995886380(0xffffffffc4a3fad4, float:-1311.8384)
            int r18 = X.AnonymousClass0fD.A05(r0)
            long r16 = java.lang.System.nanoTime()
            r0 = r21
            X.VdE r3 = r0.A0c     // Catch:{ all -> 0x04f8 }
            r15 = r22
            int r1 = r15.getActionMasked()     // Catch:{ all -> 0x04f8 }
            int r12 = r15.getPointerCount()     // Catch:{ all -> 0x04f8 }
            long r4 = r15.getEventTime()     // Catch:{ all -> 0x04f8 }
            float r8 = r15.getX()     // Catch:{ all -> 0x04f8 }
            float r7 = r15.getY()     // Catch:{ all -> 0x04f8 }
            boolean r0 = r3.A0S     // Catch:{ all -> 0x04f8 }
            java.lang.String r10 = "longPressTimeout"
            r9 = 2
            r6 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0050
            if (r1 != r9) goto L_0x0049
            if (r12 > r2) goto L_0x0049
            float r0 = r3.A0A     // Catch:{ all -> 0x04f8 }
            float r13 = X.AnonymousClass7TE.A00(r8, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = r3.A0T     // Catch:{ all -> 0x04f8 }
            float r11 = (float) r0     // Catch:{ all -> 0x04f8 }
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0049
            float r0 = r3.A0B     // Catch:{ all -> 0x04f8 }
            float r0 = X.AnonymousClass7TE.A00(r7, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x02a0
        L_0x0049:
            r3.A0S = r6     // Catch:{ all -> 0x04f8 }
            android.os.Handler r0 = X.C18796W2e.A01     // Catch:{ all -> 0x04f8 }
            r0.removeCallbacksAndMessages(r10)     // Catch:{ all -> 0x04f8 }
        L_0x0050:
            if (r1 == r9) goto L_0x02a0
            if (r1 != 0) goto L_0x00e8
            r3.A0P = r6     // Catch:{ all -> 0x04f8 }
            r3.A0O = r6     // Catch:{ all -> 0x04f8 }
            r3.A0N = r6     // Catch:{ all -> 0x04f8 }
            boolean r0 = r3.A0Q     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0080
            long r0 = r3.A0H     // Catch:{ all -> 0x04f8 }
            long r12 = r4 - r0
            int r0 = r3.A0F     // Catch:{ all -> 0x04f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x04f8 }
            int r11 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r11 > 0) goto L_0x0080
            float r0 = r3.A00     // Catch:{ all -> 0x04f8 }
            float r11 = X.AnonymousClass7TE.A00(r8, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = r3.A0E     // Catch:{ all -> 0x04f8 }
            float r1 = (float) r0     // Catch:{ all -> 0x04f8 }
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0080
            float r0 = r3.A01     // Catch:{ all -> 0x04f8 }
            float r0 = X.AnonymousClass7TE.A00(r7, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0088
        L_0x0080:
            r3.A0Q = r6     // Catch:{ all -> 0x04f8 }
            r3.A00 = r8     // Catch:{ all -> 0x04f8 }
            r3.A01 = r7     // Catch:{ all -> 0x04f8 }
            r3.A0H = r4     // Catch:{ all -> 0x04f8 }
        L_0x0088:
            r3.A0A = r8     // Catch:{ all -> 0x04f8 }
            r3.A0B = r7     // Catch:{ all -> 0x04f8 }
            r3.A0S = r2     // Catch:{ all -> 0x04f8 }
            X.Wq8 r12 = r3.A0V     // Catch:{ all -> 0x04f8 }
            long r4 = r3.A0U     // Catch:{ all -> 0x04f8 }
            android.os.Handler r11 = X.C18796W2e.A01     // Catch:{ all -> 0x04f8 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f8 }
            long r0 = r0 + r4
            r11.postAtTime(r12, r10, r0)     // Catch:{ all -> 0x04f8 }
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x00bf
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()     // Catch:{ all -> 0x04f8 }
            r3.A0L = r0     // Catch:{ all -> 0x04f8 }
        L_0x00a6:
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            r0.addMovement(r15)     // Catch:{ all -> 0x04f8 }
            X.X0N r10 = r3.A0M     // Catch:{ all -> 0x04f8 }
            X.U4m r10 = (X.C14723U4m) r10     // Catch:{ all -> 0x04f8 }
            r10.A0U = r6     // Catch:{ all -> 0x04f8 }
            r10.A0X = r6     // Catch:{ all -> 0x04f8 }
            r0 = 0
            r10.A0A = r0     // Catch:{ all -> 0x04f8 }
            X.WFU r0 = r10.A0M     // Catch:{ all -> 0x04f8 }
            java.util.List r6 = r0.A0O     // Catch:{ all -> 0x04f8 }
            int r5 = X.C51966G9m.A06(r6)     // Catch:{ all -> 0x04f8 }
            goto L_0x00c3
        L_0x00bf:
            r0.clear()     // Catch:{ all -> 0x04f8 }
            goto L_0x00a6
        L_0x00c3:
            r4 = 0
            r3 = 0
        L_0x00c5:
            if (r5 < 0) goto L_0x00de
            java.lang.Object r1 = r6.get(r5)     // Catch:{ all -> 0x04f8 }
            X.Tzf r1 = (X.C14633Tzf) r1     // Catch:{ all -> 0x04f8 }
            boolean r0 = r1.A04     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x00db
            int r0 = r1.A0A(r8, r7)     // Catch:{ all -> 0x04f8 }
            if (r0 == r9) goto L_0x00df
            if (r0 <= r3) goto L_0x00db
            r4 = r1
            r3 = r0
        L_0x00db:
            int r5 = r5 + -1
            goto L_0x00c5
        L_0x00de:
            r1 = r4
        L_0x00df:
            r10.A0O = r1     // Catch:{ all -> 0x04f8 }
            if (r1 == 0) goto L_0x04e8
            r1.A0B(r8, r7)     // Catch:{ all -> 0x04f8 }
            goto L_0x04e8
        L_0x00e8:
            if (r1 != r2) goto L_0x0277
            r3.A0G = r6     // Catch:{ all -> 0x04f8 }
            long r0 = r3.A0J     // Catch:{ all -> 0x04f8 }
            long r10 = r4 - r0
            int r0 = android.view.ViewConfiguration.getTapTimeout()     // Catch:{ all -> 0x04f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x04f8 }
            int r9 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r9 >= 0) goto L_0x0144
            X.X0N r5 = r3.A0M     // Catch:{ all -> 0x04f8 }
            X.U4m r5 = (X.C14723U4m) r5     // Catch:{ all -> 0x04f8 }
            A0A(r5)     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r5.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x011b
            X.WFU r6 = r5.A0M     // Catch:{ all -> 0x04f8 }
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.VuW r4 = new X.VuW     // Catch:{ all -> 0x04f8 }
            r4.<init>()     // Catch:{ all -> 0x04f8 }
            r4.A04 = r0     // Catch:{ all -> 0x04f8 }
            r1 = 200(0xc8, float:2.8E-43)
            X.WFC r0 = new X.WFC     // Catch:{ all -> 0x04f8 }
            r0.<init>(r5)     // Catch:{ all -> 0x04f8 }
        L_0x0118:
            r6.A09(r4, r0, r1)     // Catch:{ all -> 0x04f8 }
        L_0x011b:
            boolean r0 = r3.A0Q     // Catch:{ all -> 0x04f8 }
            r0 = r0 ^ 1
            r3.A0Q = r0     // Catch:{ all -> 0x04f8 }
            X.X0N r5 = r3.A0M     // Catch:{ all -> 0x04f8 }
            float r4 = r3.A0A     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A0B     // Catch:{ all -> 0x04f8 }
            X.U4m r5 = (X.C14723U4m) r5     // Catch:{ all -> 0x04f8 }
            A0A(r5)     // Catch:{ all -> 0x04f8 }
            boolean r0 = r5.A0U     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x013b
            X.Wpy r0 = r5.A0Q     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A05     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x013b
            X.WFU r0 = r5.A0M     // Catch:{ all -> 0x04f8 }
            r0.A05()     // Catch:{ all -> 0x04f8 }
        L_0x013b:
            X.Tzf r0 = r5.A0O     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04e8
            r0.A0C(r4, r1)     // Catch:{ all -> 0x04f8 }
            goto L_0x04e8
        L_0x0144:
            boolean r0 = r3.A0Q     // Catch:{ all -> 0x04f8 }
            java.lang.String r9 = "clickTimeout"
            if (r0 == 0) goto L_0x01b2
            long r0 = r3.A0H     // Catch:{ all -> 0x04f8 }
            long r11 = r4 - r0
            int r0 = r3.A0F     // Catch:{ all -> 0x04f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x04f8 }
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 >= 0) goto L_0x01b2
            float r0 = r3.A00     // Catch:{ all -> 0x04f8 }
            float r8 = X.AnonymousClass7TE.A00(r8, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = r3.A0E     // Catch:{ all -> 0x04f8 }
            float r1 = (float) r0     // Catch:{ all -> 0x04f8 }
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b2
            float r0 = r3.A01     // Catch:{ all -> 0x04f8 }
            float r0 = X.AnonymousClass7TE.A00(r7, r0)     // Catch:{ all -> 0x04f8 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01b2
            android.os.Handler r0 = X.C18796W2e.A01     // Catch:{ all -> 0x04f8 }
            r0.removeCallbacksAndMessages(r9)     // Catch:{ all -> 0x04f8 }
            X.X0N r5 = r3.A0M     // Catch:{ all -> 0x04f8 }
            float r4 = r3.A00     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A01     // Catch:{ all -> 0x04f8 }
            X.U4m r5 = (X.C14723U4m) r5     // Catch:{ all -> 0x04f8 }
            A0A(r5)     // Catch:{ all -> 0x04f8 }
            X.Tzf r0 = r5.A0O     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0187
            boolean r0 = r0.A0E(r4, r1)     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0187
            goto L_0x011b
        L_0x0187:
            X.V3p r0 = r5.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x011b
            int r4 = (int) r4     // Catch:{ all -> 0x04f8 }
            int r0 = (int) r1     // Catch:{ all -> 0x04f8 }
            android.graphics.Point r1 = new android.graphics.Point     // Catch:{ all -> 0x04f8 }
            r1.<init>(r4, r0)     // Catch:{ all -> 0x04f8 }
            X.WFU r6 = r5.A0M     // Catch:{ all -> 0x04f8 }
            r0 = 1065353216(0x3f800000, float:1.0)
            X.VuW r4 = new X.VuW     // Catch:{ all -> 0x04f8 }
            r4.<init>()     // Catch:{ all -> 0x04f8 }
            r4.A04 = r0     // Catch:{ all -> 0x04f8 }
            int r0 = r1.x     // Catch:{ all -> 0x04f8 }
            float r0 = (float) r0     // Catch:{ all -> 0x04f8 }
            r4.A05 = r0     // Catch:{ all -> 0x04f8 }
            int r0 = r1.y     // Catch:{ all -> 0x04f8 }
            float r0 = (float) r0     // Catch:{ all -> 0x04f8 }
            r4.A06 = r0     // Catch:{ all -> 0x04f8 }
            r1 = 200(0xc8, float:2.8E-43)
            X.WFD r0 = new X.WFD     // Catch:{ all -> 0x04f8 }
            r0.<init>(r5)     // Catch:{ all -> 0x04f8 }
            goto L_0x0118
        L_0x01b2:
            boolean r0 = r3.A0P     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x01cb
            boolean r0 = r3.A0S     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x01cb
            X.Wq8 r7 = r3.A0W     // Catch:{ all -> 0x04f8 }
            int r0 = r3.A0F     // Catch:{ all -> 0x04f8 }
            long r4 = (long) r0     // Catch:{ all -> 0x04f8 }
            android.os.Handler r6 = X.C18796W2e.A01     // Catch:{ all -> 0x04f8 }
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f8 }
            long r0 = r0 + r4
            r6.postAtTime(r7, r9, r0)     // Catch:{ all -> 0x04f8 }
            goto L_0x011b
        L_0x01cb:
            long r0 = r3.A0I     // Catch:{ all -> 0x04f8 }
            long r4 = r4 - r0
            int r0 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x04f8 }
            long r0 = (long) r0     // Catch:{ all -> 0x04f8 }
            int r7 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0217
            boolean r0 = r3.A0N     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x01f9
            X.X0N r1 = r3.A0M     // Catch:{ all -> 0x04f8 }
            X.U4m r1 = (X.C14723U4m) r1     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r1.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r1.A0X     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x01f9
            r1.A0W = r6     // Catch:{ all -> 0x04f8 }
            X.Wpy r0 = r1.A0Q     // Catch:{ all -> 0x04f8 }
            r0.A07 = r2     // Catch:{ all -> 0x04f8 }
            A0C(r1)     // Catch:{ all -> 0x04f8 }
            X.XAA r1 = r1.A0R     // Catch:{ all -> 0x04f8 }
            java.lang.String r0 = "rotate"
            r1.ELr(r0)     // Catch:{ all -> 0x04f8 }
        L_0x01f9:
            boolean r0 = r3.A0O     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0217
            X.X0N r1 = r3.A0M     // Catch:{ all -> 0x04f8 }
            X.U4m r1 = (X.C14723U4m) r1     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r1.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0217
            r1.A0W = r6     // Catch:{ all -> 0x04f8 }
            X.Wpy r0 = r1.A0Q     // Catch:{ all -> 0x04f8 }
            r0.A08 = r2     // Catch:{ all -> 0x04f8 }
            A0C(r1)     // Catch:{ all -> 0x04f8 }
            X.XAA r1 = r1.A0R     // Catch:{ all -> 0x04f8 }
            java.lang.String r0 = "zoom"
            r1.ELr(r0)     // Catch:{ all -> 0x04f8 }
        L_0x0217:
            boolean r0 = r3.A0P     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x011b
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            r0.addMovement(r15)     // Catch:{ all -> 0x04f8 }
            android.view.VelocityTracker r1 = r3.A0L     // Catch:{ all -> 0x04f8 }
            r0 = 1000(0x3e8, float:1.401E-42)
            r1.computeCurrentVelocity(r0)     // Catch:{ all -> 0x04f8 }
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            float r5 = r0.getXVelocity()     // Catch:{ all -> 0x04f8 }
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            float r7 = r0.getYVelocity()     // Catch:{ all -> 0x04f8 }
            float r1 = java.lang.Math.abs(r5)     // Catch:{ all -> 0x04f8 }
            float r0 = java.lang.Math.abs(r7)     // Catch:{ all -> 0x04f8 }
            float r1 = java.lang.Math.max(r1, r0)     // Catch:{ all -> 0x04f8 }
            float r0 = r3.A08     // Catch:{ all -> 0x04f8 }
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x011b
            X.X0N r4 = r3.A0M     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A09     // Catch:{ all -> 0x04f8 }
            float r5 = r5 * r1
            float r1 = r1 * r7
            X.U4m r4 = (X.C14723U4m) r4     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r4.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x011b
            r4.A0W = r6     // Catch:{ all -> 0x04f8 }
            X.Wpy r0 = r4.A0Q     // Catch:{ all -> 0x04f8 }
            int r6 = r4.A0G     // Catch:{ all -> 0x04f8 }
            int r7 = r4.A0E     // Catch:{ all -> 0x04f8 }
            int r8 = (int) r5     // Catch:{ all -> 0x04f8 }
            int r9 = (int) r1     // Catch:{ all -> 0x04f8 }
            android.widget.OverScroller r5 = r0.A0F     // Catch:{ all -> 0x04f8 }
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r10
            r13 = r11
            r5.fling(r6, r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x04f8 }
            r0.A09 = r2     // Catch:{ all -> 0x04f8 }
            A0C(r4)     // Catch:{ all -> 0x04f8 }
            X.XAA r1 = r4.A0R     // Catch:{ all -> 0x04f8 }
            java.lang.String r0 = "pan"
            r1.ELr(r0)     // Catch:{ all -> 0x04f8 }
            goto L_0x011b
        L_0x0277:
            r0 = 5
            if (r1 != r0) goto L_0x027e
            r3.A0J = r4     // Catch:{ all -> 0x04f8 }
            goto L_0x04e8
        L_0x027e:
            r0 = 6
            if (r1 != r0) goto L_0x028f
            if (r12 != r9) goto L_0x04e8
            r3.A0I = r4     // Catch:{ all -> 0x04f8 }
            boolean r0 = r3.A0R     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x04e8
            r3.A0O = r6     // Catch:{ all -> 0x04f8 }
            r3.A0N = r6     // Catch:{ all -> 0x04f8 }
            goto L_0x04e8
        L_0x028f:
            r0 = 3
            if (r1 != r0) goto L_0x04e8
            r3.A0G = r6     // Catch:{ all -> 0x04f8 }
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04e8
            r0.recycle()     // Catch:{ all -> 0x04f8 }
            r0 = 0
            r3.A0L = r0     // Catch:{ all -> 0x04f8 }
            goto L_0x04e8
        L_0x02a0:
            r1 = 0
            r11 = 0
            r9 = 0
        L_0x02a3:
            if (r1 >= r12) goto L_0x02b2
            float r0 = r15.getX(r1)     // Catch:{ all -> 0x04f8 }
            float r11 = r11 + r0
            float r0 = r15.getY(r1)     // Catch:{ all -> 0x04f8 }
            float r9 = r9 + r0
            int r1 = r1 + 1
            goto L_0x02a3
        L_0x02b2:
            float r5 = (float) r12     // Catch:{ all -> 0x04f8 }
            float r11 = r11 / r5
            float r9 = r9 / r5
            r4 = 0
            r10 = 0
        L_0x02b7:
            if (r4 >= r12) goto L_0x02ce
            float r0 = r15.getX(r4)     // Catch:{ all -> 0x04f8 }
            float r0 = r0 - r11
            double r13 = (double) r0     // Catch:{ all -> 0x04f8 }
            float r0 = r15.getY(r4)     // Catch:{ all -> 0x04f8 }
            float r0 = r0 - r9
            double r0 = (double) r0     // Catch:{ all -> 0x04f8 }
            double r0 = java.lang.Math.hypot(r13, r0)     // Catch:{ all -> 0x04f8 }
            float r13 = (float) r0     // Catch:{ all -> 0x04f8 }
            float r10 = r10 + r13
            int r4 = r4 + 1
            goto L_0x02b7
        L_0x02ce:
            float r10 = r10 / r5
            r3.A0C = r11     // Catch:{ all -> 0x04f8 }
            r3.A0D = r9     // Catch:{ all -> 0x04f8 }
            android.graphics.Matrix r1 = r3.A0K     // Catch:{ all -> 0x04f8 }
            if (r1 == 0) goto L_0x02e4
            float[] r0 = r3.A0X     // Catch:{ all -> 0x04f8 }
            r0[r6] = r11     // Catch:{ all -> 0x04f8 }
            r0[r2] = r9     // Catch:{ all -> 0x04f8 }
            r1.mapPoints(r0)     // Catch:{ all -> 0x04f8 }
            r11 = r0[r6]     // Catch:{ all -> 0x04f8 }
            r9 = r0[r2]     // Catch:{ all -> 0x04f8 }
        L_0x02e4:
            int r1 = r3.A0G     // Catch:{ all -> 0x04f8 }
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r12 == r1) goto L_0x02f2
            r3.A02 = r10     // Catch:{ all -> 0x04f8 }
            r3.A06 = r0     // Catch:{ all -> 0x04f8 }
            if (r12 <= r2) goto L_0x04db
            goto L_0x04c4
        L_0x02f2:
            float r4 = r3.A06     // Catch:{ all -> 0x04f8 }
            if (r12 <= r2) goto L_0x03c1
            float r1 = r3.A02     // Catch:{ all -> 0x04f8 }
            r5 = 0
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x0300
            float r14 = r10 / r1
            goto L_0x0302
        L_0x0300:
            r14 = 1065353216(0x3f800000, float:1.0)
        L_0x0302:
            float r13 = r14 / r4
            float r0 = X.AnonymousClass7TE.A00(r13, r0)     // Catch:{ all -> 0x04f8 }
            double r0 = (double) r0
            r19 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r4 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            boolean r19 = X.AnonymousClass7TF.A1R(r4)
            boolean r0 = r3.A0R     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0357
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x04f8 }
            float r7 = r7 - r0
            double r0 = (double) r7     // Catch:{ all -> 0x04f8 }
            float r4 = r15.getX(r2)     // Catch:{ all -> 0x04f8 }
            float r8 = r8 - r4
            double r4 = (double) r8     // Catch:{ all -> 0x04f8 }
            double r0 = java.lang.Math.atan2(r0, r4)     // Catch:{ all -> 0x04f8 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x04f8 }
            float r4 = (float) r0     // Catch:{ all -> 0x04f8 }
            int r0 = r3.A0G     // Catch:{ all -> 0x04f8 }
            if (r0 == r12) goto L_0x0333
            r3.A05 = r4     // Catch:{ all -> 0x04f8 }
        L_0x0333:
            float r0 = r3.A05     // Catch:{ all -> 0x04f8 }
            float r8 = r4 - r0
            r0 = 1127481344(0x43340000, float:180.0)
            r1 = 1135869952(0x43b40000, float:360.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0341
            float r8 = r8 - r1
            goto L_0x0348
        L_0x0341:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0348
            float r8 = r8 + r1
        L_0x0348:
            r3.A05 = r4     // Catch:{ all -> 0x04f8 }
            r0 = -1041235968(0xffffffffc1f00000, float:-30.0)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x038d
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x038d
            goto L_0x035a
        L_0x0357:
            r0 = 0
            goto L_0x039c
        L_0x035a:
            X.X0N r5 = r3.A0M     // Catch:{ all -> 0x04f8 }
            float r7 = r3.A07     // Catch:{ all -> 0x04f8 }
            float r7 = r7 * r8
            float r4 = r3.A0C     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A0D     // Catch:{ all -> 0x04f8 }
            X.U4m r5 = (X.C14723U4m) r5     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r5.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A01     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x038b
            boolean r0 = r5.A0X     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x03ac
            A0B(r5)     // Catch:{ all -> 0x04f8 }
            r5.A08 = r4     // Catch:{ all -> 0x04f8 }
            r5.A09 = r1     // Catch:{ all -> 0x04f8 }
            float r0 = r5.A0B     // Catch:{ all -> 0x04f8 }
            float r0 = r0 + r7
            r5.A0F(r0, r4, r1)     // Catch:{ all -> 0x04f8 }
            boolean r0 = r5.A0Z     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x0388
            X.Wpy r4 = r5.A0Q     // Catch:{ all -> 0x04f8 }
            r4.A00 = r7     // Catch:{ all -> 0x04f8 }
            r0 = 0
            r4.A02 = r0     // Catch:{ all -> 0x04f8 }
        L_0x0388:
            r5.invalidate()     // Catch:{ all -> 0x04f8 }
        L_0x038b:
            r3.A0N = r2     // Catch:{ all -> 0x04f8 }
        L_0x038d:
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x04f8 }
            double r0 = (double) r0     // Catch:{ all -> 0x04f8 }
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x0357
            r0 = 0
            r3.A0J = r0     // Catch:{ all -> 0x04f8 }
        L_0x039c:
            float r4 = r3.A02     // Catch:{ all -> 0x04f8 }
            float r5 = X.AnonymousClass7TE.A00(r10, r4)     // Catch:{ all -> 0x04f8 }
            int r4 = r3.A0T     // Catch:{ all -> 0x04f8 }
            float r4 = (float) r4     // Catch:{ all -> 0x04f8 }
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x03be
            r3.A0J = r0     // Catch:{ all -> 0x04f8 }
            goto L_0x03be
        L_0x03ac:
            float r0 = r5.A0A     // Catch:{ all -> 0x04f8 }
            float r0 = r0 + r7
            r5.A0A = r0     // Catch:{ all -> 0x04f8 }
            float r1 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x04f8 }
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x038b
            r5.A0X = r2     // Catch:{ all -> 0x04f8 }
            goto L_0x038b
        L_0x03be:
            r0 = r13
            r4 = r14
            goto L_0x03c3
        L_0x03c1:
            r19 = 0
        L_0x03c3:
            float r1 = r3.A03     // Catch:{ all -> 0x04f8 }
            float r14 = r11 - r1
            float r1 = r3.A04     // Catch:{ all -> 0x04f8 }
            float r13 = r9 - r1
            boolean r1 = r3.A0P     // Catch:{ all -> 0x04f8 }
            if (r1 != 0) goto L_0x03e7
            float r5 = r3.A0C     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A0A     // Catch:{ all -> 0x04f8 }
            float r5 = X.AnonymousClass7TE.A00(r5, r1)     // Catch:{ all -> 0x04f8 }
            int r1 = r3.A0T     // Catch:{ all -> 0x04f8 }
            float r7 = (float) r1     // Catch:{ all -> 0x04f8 }
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x03fd
            float r5 = r3.A0D     // Catch:{ all -> 0x04f8 }
            float r1 = r3.A0B     // Catch:{ all -> 0x04f8 }
            float r1 = X.AnonymousClass7TE.A00(r5, r1)     // Catch:{ all -> 0x04f8 }
            goto L_0x03ec
        L_0x03e7:
            boolean r1 = r3.A0O     // Catch:{ all -> 0x04f8 }
            if (r1 != 0) goto L_0x03f0
            goto L_0x03f4
        L_0x03ec:
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 > 0) goto L_0x03fd
        L_0x03f0:
            r1 = 0
        L_0x03f1:
            if (r19 == 0) goto L_0x042f
            goto L_0x03ff
        L_0x03f4:
            r5 = 0
            int r1 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x03fd
            int r1 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x03f0
        L_0x03fd:
            r1 = 1
            goto L_0x03f1
        L_0x03ff:
            X.X0N r7 = r3.A0M     // Catch:{ all -> 0x04f8 }
            r15 = 1065353216(0x3f800000, float:1.0)
            float r1 = r15 * r0
            float r10 = r3.A0C     // Catch:{ all -> 0x04f8 }
            float r8 = r3.A0D     // Catch:{ all -> 0x04f8 }
            X.U4m r7 = (X.C14723U4m) r7     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r7.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A03     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04bd
            A0B(r7)     // Catch:{ all -> 0x04f8 }
            r7.A08 = r10     // Catch:{ all -> 0x04f8 }
            r7.A09 = r8     // Catch:{ all -> 0x04f8 }
            float r5 = r7.A0C     // Catch:{ all -> 0x04f8 }
            float r5 = r5 * r1
            int r0 = r7.A0H     // Catch:{ all -> 0x04f8 }
        L_0x041d:
            r14 = 1073741824(0x40000000, float:2.0)
            int r13 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r13 <= 0) goto L_0x0427
            float r5 = r5 / r14
            int r0 = r0 + 1
            goto L_0x041d
        L_0x0427:
            int r13 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r13 >= 0) goto L_0x04a4
            float r5 = r5 * r14
            int r0 = r0 + -1
            goto L_0x0427
        L_0x042f:
            r3.A0O = r6     // Catch:{ all -> 0x04f8 }
            if (r1 == 0) goto L_0x04c1
            X.X0N r10 = r3.A0M     // Catch:{ all -> 0x04f8 }
            float r8 = r3.A09     // Catch:{ all -> 0x04f8 }
            float r14 = r14 * r8
            float r8 = r8 * r13
            X.U4m r10 = (X.C14723U4m) r10     // Catch:{ all -> 0x04f8 }
            X.V3p r0 = r10.A0P     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x049a
            r10.requestDisallowInterceptTouchEvent(r2)     // Catch:{ all -> 0x04f8 }
            A0B(r10)     // Catch:{ all -> 0x04f8 }
            double r0 = r10.A02     // Catch:{ all -> 0x04f8 }
            long r4 = r10.A0K     // Catch:{ all -> 0x04f8 }
            float r13 = (float) r4     // Catch:{ all -> 0x04f8 }
            float r6 = r14 / r13
            double r6 = (double) r6     // Catch:{ all -> 0x04f8 }
            double r0 = r0 - r6
            double r0 = A00(r0)     // Catch:{ all -> 0x04f8 }
            r10.A02 = r0     // Catch:{ all -> 0x04f8 }
            double r0 = r10.A03     // Catch:{ all -> 0x04f8 }
            float r6 = r8 / r13
            double r6 = (double) r6     // Catch:{ all -> 0x04f8 }
            double r0 = r0 - r6
            double r0 = r10.A0E(r4, r0)     // Catch:{ all -> 0x04f8 }
            r10.A03 = r0     // Catch:{ all -> 0x04f8 }
            r10.invalidate()     // Catch:{ all -> 0x04f8 }
            X.WFU r6 = r10.A0M     // Catch:{ all -> 0x04f8 }
            X.X2A r0 = r6.A05     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x0473
            java.util.ArrayList r0 = r6.A0N     // Catch:{ all -> 0x04f8 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x04f8 }
            if (r0 != 0) goto L_0x0498
        L_0x0473:
            float r0 = java.lang.Math.abs(r14)     // Catch:{ all -> 0x04f8 }
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0485
            float r0 = java.lang.Math.abs(r8)     // Catch:{ all -> 0x04f8 }
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0498
        L_0x0485:
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x04f8 }
            long r0 = r10.A0J     // Catch:{ all -> 0x04f8 }
            long r13 = r4 - r0
            r7 = 200(0xc8, double:9.9E-322)
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 < 0) goto L_0x0498
            r6.A05()     // Catch:{ all -> 0x04f8 }
            r10.A0J = r4     // Catch:{ all -> 0x04f8 }
        L_0x0498:
            r10.A0U = r2     // Catch:{ all -> 0x04f8 }
        L_0x049a:
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04a1
            r0.addMovement(r15)     // Catch:{ all -> 0x04f8 }
        L_0x04a1:
            r3.A0P = r2     // Catch:{ all -> 0x04f8 }
            goto L_0x04e2
        L_0x04a4:
            float r0 = (float) r0     // Catch:{ all -> 0x04f8 }
            float r0 = r0 + r5
            float r0 = r0 - r15
            boolean r0 = r7.A0H(r0, r10, r8)     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04ba
            boolean r0 = r7.A0Z     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04ba
            X.Wpy r5 = r7.A0Q     // Catch:{ all -> 0x04f8 }
            float r1 = r1 - r15
            r5.A01 = r1     // Catch:{ all -> 0x04f8 }
            r0 = 0
            r5.A03 = r0     // Catch:{ all -> 0x04f8 }
        L_0x04ba:
            r7.invalidate()     // Catch:{ all -> 0x04f8 }
        L_0x04bd:
            r3.A06 = r4     // Catch:{ all -> 0x04f8 }
            r3.A0O = r2     // Catch:{ all -> 0x04f8 }
        L_0x04c1:
            r3.A0P = r6     // Catch:{ all -> 0x04f8 }
            goto L_0x04e2
        L_0x04c4:
            float r0 = r15.getY(r2)     // Catch:{ all -> 0x04f8 }
            float r7 = r7 - r0
            double r0 = (double) r7     // Catch:{ all -> 0x04f8 }
            float r4 = r15.getX(r2)     // Catch:{ all -> 0x04f8 }
            float r8 = r8 - r4
            double r4 = (double) r8     // Catch:{ all -> 0x04f8 }
            double r0 = java.lang.Math.atan2(r0, r4)     // Catch:{ all -> 0x04f8 }
            double r0 = java.lang.Math.toDegrees(r0)     // Catch:{ all -> 0x04f8 }
            float r4 = (float) r0     // Catch:{ all -> 0x04f8 }
            r3.A05 = r4     // Catch:{ all -> 0x04f8 }
        L_0x04db:
            android.view.VelocityTracker r0 = r3.A0L     // Catch:{ all -> 0x04f8 }
            if (r0 == 0) goto L_0x04e2
            r0.clear()     // Catch:{ all -> 0x04f8 }
        L_0x04e2:
            r3.A03 = r11     // Catch:{ all -> 0x04f8 }
            r3.A04 = r9     // Catch:{ all -> 0x04f8 }
            r3.A0G = r12     // Catch:{ all -> 0x04f8 }
        L_0x04e8:
            X.1yR r3 = X.1yR.A0V
            r0 = r16
            X.C13989Tnp.A1L(r3, r0)
            r1 = 331451852(0x13c18dcc, float:4.8859872E-27)
            r0 = r18
            X.AnonymousClass0fD.A0C(r1, r0)
            return r2
        L_0x04f8:
            r3 = move-exception
            X.1yR r2 = X.1yR.A0V
            r0 = r16
            X.C13989Tnp.A1L(r2, r0)
            r1 = -1976329213(0xffffffff8a339c03, float:-8.647879E-33)
            r0 = r18
            X.AnonymousClass0fD.A0C(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14723U4m.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onWindowVisibilityChanged(int i) {
        int A062 = AnonymousClass0fD.A06(1534762860);
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            A02();
        } else {
            A03();
        }
        AnonymousClass0fD.A0D(1664356537, A062);
    }

    public C14723U4m(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18585Vuc A002 = C18585Vuc.A00(attributeSet);
        A09(A002);
        A07(context, A002);
    }

    public C14723U4m(Context context) {
        super(context);
        C18585Vuc vuc = new C18585Vuc();
        A09(vuc);
        A07(context, vuc);
    }

    public C14723U4m(Context context, C18585Vuc vuc) {
        super(context);
        A09(vuc);
        A07(context, vuc);
    }
}
