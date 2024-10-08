package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.android.maps.model.LatLng;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: X.Tzf  reason: case insensitive filesystem */
public abstract class C14633Tzf implements C20944X5n {
    public static int A0D;
    public static final Comparator A0E = new C20373WqD(1);
    public double A00;
    public double A01;
    public float A02;
    public int A03 = 1;
    public boolean A04 = true;
    public final int A05;
    public final Context A06;
    public final WFU A07;
    public final W2R A08;
    public final AnonymousClass2R4 A09 = new Object();
    public final float A0A;
    public final int A0B;
    public final float[] A0C = new float[2];

    public abstract void A0D(Canvas canvas);

    public final void A05() {
        this.A07.A0I.invalidate();
    }

    public final void A06() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (this instanceof C14959UGx) {
            C14959UGx uGx = (C14959UGx) this;
            C14723U4m u4m = uGx.A07.A0I;
            Rect rect = uGx.A03;
            Drawable drawable = uGx.A06;
            rect.set(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            int ordinal = uGx.A07.ordinal();
            if (ordinal == 0) {
                f2 = uGx.A00;
                f4 = 0.0f + f2;
                f3 = f2 + 0.0f;
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    f5 = uGx.A00;
                    f = (((float) (u4m.getWidth() - rect.width())) - f5) - 0.0f;
                } else {
                    f5 = uGx.A00;
                    f = f5 + 0.0f;
                }
                f3 = (((float) (u4m.getHeight() - rect.height())) - f5) - 0.0f;
            } else {
                float width = (float) (u4m.getWidth() - rect.width());
                f2 = uGx.A00;
                f4 = (width - f2) - 0.0f;
                f3 = f2 + 0.0f;
            }
            RectF rectF = uGx.A04;
            rectF.set(rect);
            rectF.offsetTo(f, f3);
            rect.offsetTo((int) f, (int) f3);
            float centerX = rectF.centerX();
            float centerY = rectF.centerY();
            RectF rectF2 = uGx.A05;
            float f6 = uGx.A02;
            rectF2.set(centerX - f6, centerY - f6, centerX + f6, centerY + f6);
        } else if (this instanceof UH0) {
            Iterator A16 = DbV.A16(((UH0) this).A04);
            while (A16.hasNext()) {
                ((VL7) A16.next()).A00.A06();
            }
        } else if (this instanceof C14960UGy) {
            C14960UGy uGy = (C14960UGy) this;
            float f7 = uGy.A03 + 0.0f + uGy.A02;
            uGy.A00 = f7;
            uGy.A01 = f7;
        }
    }

    public final void A07() {
        if (this instanceof UH0) {
            UH0 uh0 = (UH0) this;
            VL7 vl7 = uh0.A00;
            if (vl7 != null) {
                vl7.A00.A07();
            }
            uh0.A00 = null;
        }
    }

    public final void A08() {
        WFU wfu = this.A07;
        if (this instanceof UH0) {
            wfu.A0N.remove(this);
        }
        wfu.A0O.remove(this);
        wfu.A0I.invalidate();
    }

    public void A09(boolean z) {
        this.A04 = z;
        A05();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r8 <= (r1 + r2)) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0A(float r7, float r8) {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C14958UGw
            if (r0 == 0) goto L_0x001e
            r0 = r6
            X.UGw r0 = (X.C14958UGw) r0
            X.Gcl r0 = r0.A01
            android.graphics.Rect r2 = r0.getBounds()
            int r1 = java.lang.Math.round(r7)
            int r0 = java.lang.Math.round(r8)
            boolean r0 = r2.contains(r1, r0)
            r3 = 0
            if (r0 == 0) goto L_0x001d
        L_0x001c:
            r3 = 2
        L_0x001d:
            return r3
        L_0x001e:
            boolean r0 = r6 instanceof X.C16076Uo3
            if (r0 == 0) goto L_0x002c
            r0 = r6
            X.Uo3 r0 = (X.C16076Uo3) r0
            android.graphics.RectF r0 = r0.A0E
            boolean r3 = r0.contains(r7, r8)
            return r3
        L_0x002c:
            boolean r0 = r6 instanceof X.C14960UGy
            if (r0 == 0) goto L_0x0051
            r3 = r6
            X.UGy r3 = (X.C14960UGy) r3
            float r4 = r3.A00
            float r2 = r3.A02
            float r0 = r4 - r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x009e
            float r0 = r4 + r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            float r1 = r3.A01
            float r0 = r1 - r2
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x009e
            float r1 = r1 + r2
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x009e
            goto L_0x001c
        L_0x0051:
            boolean r0 = r6 instanceof X.C14959UGx
            if (r0 == 0) goto L_0x006b
            r1 = r6
            X.UGx r1 = (X.C14959UGx) r1
            android.graphics.RectF r0 = r1.A04
            boolean r0 = r0.contains(r7, r8)
            if (r0 != 0) goto L_0x001c
            android.graphics.RectF r0 = r1.A05
            boolean r0 = r0.contains(r7, r8)
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            return r3
        L_0x006b:
            boolean r0 = r6 instanceof X.UH0
            if (r0 == 0) goto L_0x00b9
            r5 = r6
            X.UH0 r5 = (X.UH0) r5
            r0 = 0
            r5.A01 = r0
            java.util.Map r0 = r5.A04
            java.util.Iterator r4 = X.DbV.A16(r0)
            r3 = 0
        L_0x007c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r2 = r4.next()
            X.VL7 r2 = (X.VL7) r2
            X.Tzf r1 = r2.A00
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x007c
            int r1 = r1.A0A(r7, r8)
            r0 = 2
            if (r1 != r0) goto L_0x0098
            r5.A01 = r2
            goto L_0x001c
        L_0x0098:
            if (r1 <= r3) goto L_0x007c
            r5.A01 = r2
            r3 = r1
            goto L_0x007c
        L_0x009e:
            float r2 = r3.A09
            float r0 = r4 - r2
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b9
            float r4 = r4 + r2
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x00b9
            float r1 = r3.A01
            float r0 = r1 - r2
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x00b9
            float r1 = r1 + r2
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 1
            if (r0 <= 0) goto L_0x001d
        L_0x00b9:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14633Tzf.A0A(float, float):int");
    }

    public void A0B(float f, float f2) {
        VL7 vl7;
        if ((this instanceof UH0) && (vl7 = ((UH0) this).A01) != null) {
            vl7.A00.A0B(f, f2);
        }
    }

    public void A0C(float f, float f2) {
        VL7 vl7;
        if ((this instanceof UH0) && (vl7 = ((UH0) this).A01) != null) {
            vl7.A00.A0C(f, f2);
        }
    }

    public boolean A0E(float f, float f2) {
        VL7 vl7;
        if (!(this instanceof UH0) || (vl7 = ((UH0) this).A01) == null || !vl7.A00.A0E(f, f2)) {
            return false;
        }
        return true;
    }

    public boolean A0F(float f, float f2) {
        VL7 vl7;
        if (!(this instanceof UH0) || (vl7 = ((UH0) this).A01) == null || !vl7.A00.A0F(f, f2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if (r2.A03 > 1) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d2, code lost:
        r2 = (X.UH0) r12;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0G(float r13, float r14) {
        /*
            r12 = this;
            boolean r0 = r12 instanceof X.C14958UGw
            if (r0 == 0) goto L_0x003f
            r0 = r12
            X.UGw r0 = (X.C14958UGw) r0
            X.WZ2 r4 = r0.A00
            android.app.Activity r7 = r4.A01
            com.instagram.common.session.UserSession r6 = r4.A03
            X.Uwa r11 = X.C16530Uwa.STORY_ARCHIVE_MAP
            java.lang.String r3 = "STORY_ARCHIVE_MAP"
            boolean r0 = X.1Wr.isLocationPermitted(r7, r6, r3)
            if (r0 != 0) goto L_0x003b
            X.WPU r0 = new X.WPU
            r0.<init>(r4)
            X.4O6 r2 = new X.4O6
            r2.<init>(r0, r6)
            java.lang.String r1 = "CurrentLocationHelper::onCurrentLocationButtonTap"
            X.4O7 r0 = X.VK6.A00
            r0.A05(r6, r2, r3, r1)
            r0 = 1
            r4.A00 = r0
            X.1Wr r5 = X.1Wr.A00
            r5.getClass()
            X.4cM r8 = r4.A04
            X.MTx r9 = r4.A05
            java.lang.String r10 = "MediaLocationMapMyLocationHelper"
            r5.requestLocationUpdates(r6, r7, r8, r9, r10, r11)
        L_0x0039:
            r0 = 1
            return r0
        L_0x003b:
            X.WZ2.A00(r4)
            goto L_0x0039
        L_0x003f:
            boolean r0 = r12 instanceof X.C16076Uo3
            if (r0 == 0) goto L_0x005e
            r4 = r12
            X.Uo3 r4 = (X.C16076Uo3) r4
            X.X6l r3 = r4.A06
            if (r3 == 0) goto L_0x00f9
            X.Wh8 r2 = r4.A0F
            if (r2 == 0) goto L_0x005c
            int r1 = r2.A03
            r0 = 1
            if (r1 <= r0) goto L_0x005c
        L_0x0053:
            java.lang.String r1 = r4.A08
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r3.DXJ(r2, r4, r1)
            return r0
        L_0x005c:
            r0 = 0
            goto L_0x0053
        L_0x005e:
            boolean r0 = r12 instanceof X.C14960UGy
            if (r0 == 0) goto L_0x0073
            X.WFU r3 = r12.A07
            r0 = 0
            X.VuW r2 = new X.VuW
            r2.<init>()
            r2.A00 = r0
            r1 = 1500(0x5dc, float:2.102E-42)
            r0 = 0
            r3.A09(r2, r0, r1)
            goto L_0x0039
        L_0x0073:
            boolean r0 = r12 instanceof X.C14959UGx
            if (r0 == 0) goto L_0x00ce
            r2 = r12
            X.UGx r2 = (X.C14959UGx) r2
            X.WFU r0 = r2.A07
            com.facebook.android.maps.model.CameraPosition r10 = r0.A02()
            X.U4m r1 = r0.A0I
            X.Vv1 r7 = r2.A01
            android.content.Context r6 = r2.A06
            int r8 = r1.getWidth()
            int r5 = r1.getHeight()
            android.content.Context r0 = r0.A0G
            android.content.res.Resources r4 = r0.getResources()
            java.lang.String r3 = X.2R6.A03
            X.Vuc r0 = r1.A0N
            java.lang.String r0 = r0.A06
            com.facebook.android.maps.StaticMapView$StaticMapOptions r2 = new com.facebook.android.maps.StaticMapView$StaticMapOptions
            r2.<init>(r0)
            java.lang.String r0 = "InfoButtonDrawable.java"
            r2.A04 = r0
            com.facebook.android.maps.model.LatLng r11 = r10.A03
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            double r0 = r11.A00
            r9.append(r0)
            java.lang.String r0 = ","
            r9.append(r0)
            double r0 = r11.A01
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            r2.A02 = r0
            float r0 = r10.A02
            int r0 = (int) r0
            r2.A03(r0)
            android.net.Uri r0 = com.instagram.maps.ui.IgStaticMapView.A00(r4, r2, r3, r8, r5)
            r7.A01(r6, r0)
            goto L_0x0039
        L_0x00ce:
            boolean r0 = r12 instanceof X.UH0
            if (r0 == 0) goto L_0x00f9
            r2 = r12
            X.UH0 r2 = (X.UH0) r2
            X.VL7 r0 = r2.A01
            if (r0 == 0) goto L_0x00f9
            X.Tzf r0 = r0.A00
            boolean r0 = r0.A0G(r13, r14)
            if (r0 == 0) goto L_0x00f9
            X.VL7 r1 = r2.A01
            X.VL7 r0 = r2.A00
            if (r0 == 0) goto L_0x00ee
            if (r0 == r1) goto L_0x00ee
            X.Tzf r0 = r0.A00
            r0.A07()
        L_0x00ee:
            r2.A00 = r1
            goto L_0x0039
        L_0x00f2:
            java.lang.String r0 = r4.A0G
            boolean r0 = r3.DXK(r4, r1, r0)
            return r0
        L_0x00f9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14633Tzf.A0G(float, float):boolean");
    }

    public final LatLng Bdm() {
        if (this instanceof C14961UGz) {
            return ((C14961UGz) this).A06;
        }
        return new LatLng(C13990Tnq.A00(this.A01), W2R.A02(this.A00));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.2R4, java.lang.Object] */
    public C14633Tzf(WFU wfu) {
        int i = A0D;
        A0D = i + 1;
        this.A05 = i;
        this.A07 = wfu;
        this.A08 = wfu.A0J;
        Context context = wfu.A0I.getContext();
        this.A06 = context;
        this.A0A = C13989Tnp.A03(context);
        this.A0B = wfu.A0F;
    }

    public String getId() {
        throw AnonymousClass00P.createAndThrow();
    }
}
