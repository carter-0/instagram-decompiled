package X;

import android.os.Handler;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;

/* renamed from: X.Tzh  reason: case insensitive filesystem */
public final class C14635Tzh {
    public static C14636Tzi A0K;
    public static final C18636VvY A0L = new C18636VvY(64);
    public static final Object A0M = new Object();
    public static final ArrayList A0N = new ArrayList();
    public static final ArrayList A0O = new ArrayList();
    public static final ArrayList A0P = new ArrayList();
    public static final ArrayList A0Q = new ArrayList();
    public static final ArrayList A0R = new ArrayList();
    public static final Interpolator A0S = new AccelerateDecelerateInterpolator();
    public float A00;
    public float A01;
    public int A02 = 0;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06;
    public long A07 = 300;
    public long A08 = -1;
    public long A09;
    public Interpolator A0A = A0S;
    public ArrayList A0B = null;
    public ArrayList A0C = null;
    public boolean A0D = true;
    public boolean A0E = false;
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public float[] A0I = new float[2];
    public float[] A0J = new float[2];

    /* JADX WARNING: type inference failed for: r0v8, types: [X.Tzi, android.os.Handler] */
    public final void A05() {
        long j;
        C14636Tzi tzi;
        if (Looper.myLooper() != null) {
            this.A02 = 0;
            this.A04 = 0;
            this.A0G = true;
            this.A0H = false;
            A0Q.add(this);
            if (!this.A0E || this.A04 == 0) {
                j = 0;
            } else {
                j = AnimationUtils.currentAnimationTimeMillis() - this.A09;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (this.A04 != 1) {
                this.A08 = j;
                int i = 0;
                if (this.A0E) {
                    i = 2;
                }
                this.A04 = i;
            }
            this.A09 = currentAnimationTimeMillis - j;
            this.A0E = true;
            A02(this, currentAnimationTimeMillis);
            this.A0F = true;
            ArrayList arrayList = this.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((X7N) arrayList.get(i2)).CvN(this);
                }
            }
            synchronized (A0M) {
                C14636Tzi tzi2 = A0K;
                tzi = tzi2;
                if (tzi2 == null) {
                    ? handler = new Handler();
                    A0K = handler;
                    tzi = handler;
                }
            }
            tzi.sendEmptyMessage(0);
            return;
        }
        throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }

    public static C14635Tzh A00(float f, float f2) {
        C14635Tzh tzh = (C14635Tzh) A0L.A00();
        if (tzh == null) {
            tzh = new C14635Tzh();
        }
        tzh.A03 = 2;
        float[] fArr = tzh.A0I;
        fArr[0] = 0.0f;
        float[] fArr2 = tzh.A0J;
        fArr2[0] = f;
        fArr[1] = 1.0f;
        fArr2[1] = f2;
        tzh.A0E = false;
        return tzh;
    }

    public static void A01(C14635Tzh tzh) {
        A0N.remove(tzh);
        A0Q.remove(tzh);
        A0O.remove(tzh);
        tzh.A04 = 0;
        tzh.A0G = false;
        if (tzh.A0F) {
            tzh.A0F = false;
            ArrayList arrayList = tzh.A0B;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((X7N) tzh.A0B.get(i)).CvF(tzh);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r1 >= 1.0f) goto L_0x0034;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A02(X.C14635Tzh r10, long r11) {
        /*
            int r6 = r10.A04
            r8 = 0
            r4 = 1
            if (r6 != 0) goto L_0x0012
            r10.A04 = r4
            r6 = 1
            long r2 = r10.A08
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0019
            r10.A09 = r11
        L_0x0012:
            r7 = 2
            r5 = 0
            if (r6 == r4) goto L_0x0022
            if (r6 == r7) goto L_0x0022
            return r5
        L_0x0019:
            long r0 = r11 - r2
            r10.A09 = r0
            r0 = -1
            r10.A08 = r0
            goto L_0x0012
        L_0x0022:
            long r2 = r10.A07
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x010e
            long r0 = r10.A09
            long r11 = r11 - r0
            float r1 = (float) r11
            float r0 = (float) r2
            float r1 = r1 / r0
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x010b
        L_0x0034:
            int r9 = r10.A02
            int r8 = r10.A05
            if (r9 < r8) goto L_0x00f0
            r0 = -1
            if (r8 == r0) goto L_0x00f0
            float r1 = java.lang.Math.min(r1, r6)
        L_0x0041:
            int r2 = r10.A03
            r8 = 1
            if (r2 != r7) goto L_0x007e
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0055
            r10.A0D = r5
            float[] r0 = r10.A0J
            r2 = r0[r8]
            r0 = r0[r5]
            float r2 = r2 - r0
            r10.A01 = r2
        L_0x0055:
            android.view.animation.Interpolator r0 = r10.A0A
            float r1 = r0.getInterpolation(r1)
            float[] r0 = r10.A0J
            r2 = r0[r5]
            float r0 = r10.A01
            float r1 = r1 * r0
            float r2 = r2 + r1
        L_0x0063:
            r10.A00 = r2
            java.util.ArrayList r0 = r10.A0C
            if (r0 == 0) goto L_0x0112
            r2 = 0
            int r1 = r0.size()
        L_0x006e:
            if (r2 >= r1) goto L_0x0112
            java.util.ArrayList r0 = r10.A0C
            java.lang.Object r0 = r0.get(r2)
            X.X2F r0 = (X.X2F) r0
            r0.CvQ(r10)
            int r2 = r2 + 1
            goto L_0x006e
        L_0x007e:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009c
            android.view.animation.Interpolator r0 = r10.A0A
            float r3 = r0.getInterpolation(r1)
            float[] r0 = r10.A0I
            r1 = r0[r5]
            float r3 = r3 - r1
            r0 = r0[r8]
            float r0 = r0 - r1
            float r3 = r3 / r0
            float[] r0 = r10.A0J
            r2 = r0[r5]
            r0 = r0[r8]
            float r0 = r0 - r2
        L_0x0099:
            float r3 = r3 * r0
            float r2 = r2 + r3
            goto L_0x0063
        L_0x009c:
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x00c2
            android.view.animation.Interpolator r0 = r10.A0A
            float r6 = r0.getInterpolation(r1)
            float[] r0 = r10.A0I
            int r5 = r10.A03
            int r3 = r5 + -2
            r2 = r0[r3]
            float r6 = r6 - r2
            int r1 = r5 + -1
            r0 = r0[r1]
            float r0 = r0 - r2
            float r6 = r6 / r0
            float[] r0 = r10.A0J
            r2 = r0[r3]
            r1 = r0[r1]
            int r5 = r5 - r7
            r0 = r0[r5]
            float r1 = r1 - r0
            float r6 = r6 * r1
            float r2 = r2 + r6
            goto L_0x0063
        L_0x00c2:
            r5 = 1
        L_0x00c3:
            if (r5 >= r2) goto L_0x00e9
            float[] r0 = r10.A0I
            r0 = r0[r5]
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00e6
            android.view.animation.Interpolator r0 = r10.A0A
            float r3 = r0.getInterpolation(r1)
            float[] r0 = r10.A0I
            int r2 = r5 + -1
            r1 = r0[r2]
            float r3 = r3 - r1
            r0 = r0[r5]
            float r0 = r0 - r1
            float r3 = r3 / r0
            float[] r0 = r10.A0J
            r2 = r0[r2]
            r0 = r0[r5]
            float r0 = r0 - r2
            goto L_0x0099
        L_0x00e6:
            int r5 = r5 + 1
            goto L_0x00c3
        L_0x00e9:
            float[] r0 = r10.A0J
            int r2 = r2 - r8
            r2 = r0[r2]
            goto L_0x0063
        L_0x00f0:
            java.util.ArrayList r8 = r10.A0B
            if (r8 == 0) goto L_0x0101
            int r4 = r8.size()
            r0 = 0
        L_0x00f9:
            if (r0 >= r4) goto L_0x0101
            r8.get(r0)
            int r0 = r0 + 1
            goto L_0x00f9
        L_0x0101:
            int r0 = (int) r1
            int r9 = r9 + r0
            r10.A02 = r9
            float r1 = r1 % r6
            long r8 = r10.A09
            long r8 = r8 + r2
            r10.A09 = r8
        L_0x010b:
            r4 = 0
            goto L_0x0041
        L_0x010e:
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0034
        L_0x0112:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14635Tzh.A02(X.Tzh, long):boolean");
    }

    public final void A03() {
        ArrayList arrayList;
        if (this.A04 != 0 || A0Q.contains(this) || A0O.contains(this)) {
            if (this.A0F && (arrayList = this.A0B) != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((X7N) this.A0B.get(i)).CvB(this);
                }
            }
            A01(this);
        }
    }

    public final void A04() {
        ArrayList arrayList = this.A0B;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList arrayList2 = this.A0C;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        this.A09 = 0;
        this.A08 = -1;
        this.A02 = 0;
        this.A0H = false;
        this.A06 = 0;
        this.A04 = 0;
        this.A0F = false;
        this.A0G = false;
        this.A0E = false;
        this.A07 = 300;
        this.A05 = 0;
        this.A0A = A0S;
        this.A00 = 0.0f;
        this.A0D = true;
        A0L.A02(this);
    }

    public final void A06(long j) {
        if (j >= 0) {
            this.A07 = j;
            return;
        }
        throw new IllegalArgumentException(002.A0Q("Animators cannot have negative duration: ", j));
    }

    public final void A07(X7N x7n) {
        ArrayList arrayList = this.A0B;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0B = arrayList;
        }
        arrayList.add(x7n);
    }

    public final void A08(X2F x2f) {
        ArrayList arrayList = this.A0C;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0C = arrayList;
        }
        arrayList.add(x2f);
    }
}
