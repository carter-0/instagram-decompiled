package X;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.8mL  reason: invalid class name and case insensitive filesystem */
public final class C364988mL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public FilterModel A04;
    public AnonymousClass8KU A05;
    public C345087su A06;
    public C345097sv A07;
    public C346267ut A08;
    public boolean A09;
    public final C344407ro A0A;
    public final C344037rD A0B;
    public final C344727sK A0C;
    public final C365018mO A0D;
    public final C365028mP A0E;
    public final C365028mP A0F;
    public final C366518pA A0G;
    public final C346267ut A0H = new C364998mM(this);
    public final C366448ow A0I = new Object();
    public final Runnable A0J = new C365008mN(this);
    public volatile boolean A0K;

    public final Bitmap A00() {
        C345087su r0 = this.A06;
        Bitmap bitmap = null;
        if (r0 != null) {
            Exception ClT = r0.ClT();
            if (ClT != null) {
                A0D("Failed ot make current", "FilterRendererSessionImpl", ClT);
            } else {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.A01 * this.A00 * 4);
                allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
                GLES20.glFinish();
                GLES20.glReadPixels(0, 0, this.A01, this.A00, 6408, 5121, allocateDirect);
                allocateDirect.rewind();
                bitmap = Bitmap.createBitmap(this.A01, this.A00, Bitmap.Config.ARGB_8888);
                bitmap.copyPixelsFromBuffer(allocateDirect);
                C345897uG r02 = ((C344687sG) this.A0C.A00).A05.A0E;
                if (r02 != null) {
                    r02.makeCurrent();
                    return bitmap;
                }
            }
        }
        return bitmap;
    }

    public final void A02() {
        Runnable amA;
        C365028mP r1 = this.A0F;
        C344697sH r3 = this.A0C.A00;
        r1.A02(r3);
        this.A0E.A02(r3);
        AnonymousClass8KU r0 = this.A05;
        if (r0 != null) {
            this.A05 = r0;
            amA = new C365158md(r0, this);
        } else {
            C345097sv r02 = this.A07;
            if (r02 != null) {
                this.A07 = r02;
                amA = new C40964AmA(r02, this);
            } else {
                if (this.A09) {
                    A09(this.A08, this.A01, this.A00);
                    A05(this.A03, this.A02);
                }
                ((C344687sG) r3).A05.A03(this.A0D);
                r3.EZt(this.A0I, 1011);
            }
        }
        A0C(amA);
        A05(this.A03, this.A02);
        ((C344687sG) r3).A05.A03(this.A0D);
        r3.EZt(this.A0I, 1011);
    }

    public final void A03() {
        SparseArray sparseArray;
        C365028mP r1 = this.A0F;
        C344697sH r2 = this.A0C.A00;
        r2.EZt((C346287uv) null, r1.A09);
        r1.A02 = null;
        C365028mP r12 = this.A0E;
        r2.EZt((C346287uv) null, r12.A09);
        r12.A02 = null;
        C344687sG r4 = (C344687sG) r2;
        C344567s4 r5 = r4.A05;
        r5.A04(this.A0D);
        r2.EZt((C346287uv) null, 1011);
        C344707sI r3 = r4.A06;
        int i = 0;
        while (true) {
            sparseArray = r3.A00;
            if (i >= sparseArray.size()) {
                break;
            }
            Object valueAt = sparseArray.valueAt(i);
            if (valueAt instanceof C344747sM) {
                r5.A04((C344747sM) valueAt);
            }
            i++;
        }
        sparseArray.clear();
        C344717sJ r42 = r4.A07;
        int i2 = 0;
        while (true) {
            SparseArray sparseArray2 = r42.A00;
            if (i2 < sparseArray2.size()) {
                C345037sp r13 = (C345037sp) sparseArray2.valueAt(i2);
                if (r13 != null) {
                    if (r5.A07.A00.contains(r13)) {
                        r5.A04(r13);
                    }
                    for (Object next : r13.A06.A00) {
                        if (next instanceof C344747sM) {
                            r5.A04((C344747sM) next);
                        }
                    }
                }
                i2++;
            } else {
                sparseArray2.clear();
                this.A05 = null;
                this.A07 = null;
                this.A06 = null;
                return;
            }
        }
    }

    public final void A04() {
        if (!this.A0K) {
            return;
        }
        if (Build.VERSION.SDK_INT < 29 || !((C344687sG) this.A0C.A00).A05.A00.hasCallbacks(this.A0J)) {
            A0C(this.A0J);
        }
    }

    public final void A05(int i, int i2) {
        this.A03 = i;
        this.A02 = i2;
        A0C(new C365148mc(this));
        HashMap hashMap = new HashMap(1);
        AnonymousClass8KU r0 = this.A05;
        if (r0 != null) {
            hashMap.put(r0.BO5(), 002.A0P("x", i, i2));
        }
        if (this.A07 != null) {
            hashMap.put("GlOutput", 002.A0P("x", i, i2));
        }
        this.A0B.Ajt().ETZ(hashMap);
    }

    public final void A06(int i, int i2, int i3, boolean z, boolean z2) {
        StringBuilder sb;
        this.A0F.A00(i, i2, i3, z, z2);
        A0C(new C365148mc(this));
        C344107rK Ajt = this.A0B.Ajt();
        if (i3 % 180 != 0) {
            sb.append(i2);
            sb.append("x");
            sb.append(i);
        } else {
            sb = new StringBuilder();
            sb.append(i);
            sb.append("x");
            sb.append(i2);
        }
        Ajt.ETX(sb.toString());
    }

    public final void A07(FilterModel filterModel) {
        if (this.A04 != filterModel) {
            this.A04 = filterModel;
            this.A0I.A00 = this.A0G.A00(filterModel);
        }
    }

    public final void A08(C365408n3 r4) {
        C365028mP r2 = this.A0F;
        r2.A01(r4, this.A0C.A00);
        C346267ut r1 = this.A0H;
        C365418n5 r0 = r2.A02;
        if (r0 != null) {
            r0.A05 = r1;
        }
        this.A0B.Ajt().ETW(r4.BO5());
    }

    public final void A09(C346267ut r2, int i, int i2) {
        A0C(new C41198Apw(r2, this, i, i2));
    }

    public final void A0A(C346287uv r4) {
        this.A0C.A00.EZt(r4, this.A0E.A09);
    }

    public final void A0B(C346287uv r4) {
        C365028mP r2 = this.A0F;
        this.A0C.A00.EZt(r4, r2.A09);
        C346267ut r1 = this.A0H;
        C365418n5 r0 = r2.A02;
        if (r0 != null) {
            r0.A05 = r1;
        }
        this.A0B.Ajt().ETW("MediaGraphInput");
    }

    public final void A0D(String str, String str2, Throwable th) {
        this.A0B.CjI(new C391719tX(str, th, 31000), "media_pipeline_error", "FilterRendererSessionImpl", "high", str2, (Map) null, (long) hashCode());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.8ow, java.lang.Object] */
    public C364988mL(C366518pA r3, C344407ro r4, C344037rD r5, C344727sK r6, C365328mu r7) {
        this.A0C = r6;
        this.A0G = r3;
        this.A0A = r4;
        this.A0B = r5;
        this.A0D = new C365018mO(r7, this);
        this.A0F = new C365028mP(r4, 0);
        this.A0E = new C365028mP(r4, 1012);
    }

    public final Exception A01() {
        boolean z = false;
        if (Looper.myLooper() == ((C344687sG) this.A0C.A00).A05.A00.getLooper()) {
            z = true;
        }
        02V.A05(z);
        C345087su r0 = this.A06;
        if (r0 == null) {
            return new IllegalStateException("Output Frame Buffer is not set");
        }
        return r0.ClT();
    }

    public final void A0C(Runnable runnable) {
        Looper myLooper = Looper.myLooper();
        Handler handler = ((C344687sG) this.A0C.A00).A05.A00;
        if (myLooper == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
