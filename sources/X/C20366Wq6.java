package X;

import android.graphics.Point;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.MotionEvent;
import com.facebook.common.dextricks.Constants;
import com.instagram.android.R;
import com.instagram.ui.widget.drawing.gl.GLDrawingView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: X.Wq6  reason: case insensitive filesystem */
public final class C20366Wq6 implements Runnable, GLSurfaceView.Renderer {
    public int A00;
    public int A01;
    public long A02;
    public AnonymousClass8O9 A03;
    public C20856X1i A04;
    public C21006X9e A05;
    public XCG A06;
    public C19725WeR A07;
    public C19725WeR A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Point A0C = new Point(0, 0);
    public final Handler A0D;
    public final AnonymousClass4XC A0E;
    public final C17872VhP A0F;
    public final List A0G = new ArrayList();
    public final List A0H = Pxf.A0v();
    public final List A0I;
    public final Set A0J = new HashSet();
    public final BlockingQueue A0K = new LinkedBlockingQueue();
    public final float[] A0L = new float[16];

    public final void A03(C18735VzF vzF) {
        synchronized (this) {
            C21006X9e x9e = this.A05;
            if (x9e != null && x9e.isValid()) {
                x9e.EPW(this.A0C);
                x9e.Ecj(this.A0L);
                this.A0J.add(x9e);
                XCG AML = x9e.AML();
                this.A06 = AML;
                if (AML != null) {
                    this.A0H.add(AML);
                    AML.Exu(vzF);
                    this.A02 = vzF.A03;
                }
                A00(vzF, AnonymousClass05K.A00, x9e, x9e.AiK(), this.A0G);
            }
        }
        this.A0A = false;
    }

    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        AnonymousClass4XC r2 = this.A0E;
        C17872VhP vhP = this.A0F;
        GLDrawingView gLDrawingView = (GLDrawingView) r2;
        gLDrawingView.A08 = true;
        AnonymousClass8OB r1 = gLDrawingView.A06;
        if (r1 != null) {
            r1.DHL(gLDrawingView.A05, vhP);
        }
        C14261Tsj A012 = C18699Vwx.A01(vhP, R.raw.vertex_position, R.raw.fragment);
        C16321Usr.A02 = A012;
        C16321Usr.A03 = VC7.A00(A012);
        C18039VkN vkN = new C18039VkN(C16321Usr.A02, 8);
        C16321Usr.A05 = vkN;
        vkN.A02(2, 5126, "aPosition", false, 0);
        float[] fArr = C16321Usr.A06;
        ByteBuffer A13 = Pxg.A13(32);
        A13.asFloatBuffer().put(fArr);
        A13.rewind();
        C16321Usr.A04 = new C16331Ut1(vhP, A13);
        GLES20.glEnable(3042);
        GLES20.glDisable(2929);
        0tS A013 = 0tS.A01(vhP.A00);
        0s0 r6 = A013.A2F;
        AnonymousClass0YZ[] r5 = 0tS.A4G;
        if (((String) Pxe.A0s(A013, r6, r5, 56)).isEmpty()) {
            try {
                String glGetString = gl10.glGetString(7936);
                String glGetString2 = gl10.glGetString(7937);
                0qQ.A0B(glGetString2, 0);
                DbS.A1a(A013, glGetString2, A013.A2E, r5, 57);
                0qQ.A0B(glGetString, 0);
                DbS.A1a(A013, glGetString, r6, r5, 56);
            } catch (Exception unused) {
                0wb.A03("AbstractDrawingRenderer", "prepareOpenGLInfo() failed when getting the GPU info");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.VZx, java.lang.Object] */
    public static void A00(C18735VzF vzF, Integer num, Object obj, String str, List list) {
        C19723WeP weP = (C19723WeP) obj;
        int i = weP.A03;
        float f = weP.A00;
        ? obj2 = new Object();
        obj2.A03 = num;
        obj2.A04 = str;
        obj2.A01 = i;
        obj2.A00 = f;
        obj2.A02 = vzF;
        list.add(obj2);
    }

    public final void A01() {
        this.A0G.clear();
        this.A0H.clear();
        C19725WeR weR = this.A07;
        if (weR != null) {
            weR.A02();
        }
        C19725WeR weR2 = this.A08;
        if (weR2 != null) {
            weR2.A02();
        }
        this.A01 = -1;
    }

    public final void A02() {
        boolean z;
        int i;
        C17544VZx vZx;
        List list = this.A0G;
        int size = list.size();
        do {
            size--;
            if (size < 0) {
                break;
            }
            Object remove = list.remove(size);
            remove.getClass();
            vZx = (C17544VZx) remove;
            if (vZx.A03 == AnonymousClass05K.A00) {
                break;
            }
        } while (vZx.A03 == AnonymousClass05K.A0N);
        List list2 = this.A0H;
        if (!list2.isEmpty()) {
            list2.remove(DbT.A02(list2, 1));
        }
        C19725WeR weR = this.A07;
        if (weR != null) {
            weR.A02();
            int i2 = 0;
            if (this.A01 == -1 || DbT.A02(list2, 1) <= (i = this.A01)) {
                z = false;
                this.A01 = -1;
                C19725WeR weR2 = this.A08;
                weR2.getClass();
                weR2.A02();
            } else {
                z = true;
                i2 = i + 1;
                C19725WeR weR3 = this.A08;
                weR3.getClass();
                weR.A03(weR3);
            }
            int A062 = C51966G9m.A06(list2) - 10;
            while (i2 < list2.size()) {
                XCG xcg = (XCG) list2.get(i2);
                xcg.E3l();
                weR.A03(xcg);
                if (!z && i2 <= A062 && list2.size() > 10) {
                    xcg.E3l();
                    C19725WeR weR4 = this.A08;
                    weR4.getClass();
                    weR4.A03(xcg);
                    this.A01 = i2;
                }
                i2++;
            }
        }
    }

    public final void A04(C18735VzF vzF) {
        XCG xcg = this.A06;
        if (xcg != null && vzF.A03 > this.A02) {
            if (vzF.A02 != -1) {
                this.A0I.add(vzF.A04);
            }
            xcg.AJn(vzF);
            this.A02 = vzF.A03;
            List list = this.A0G;
            Integer num = AnonymousClass05K.A01;
            C21006X9e x9e = this.A05;
            x9e.getClass();
            A00(vzF, num, this.A05, x9e.AiK(), list);
        }
    }

    public final void A05(C18735VzF vzF) {
        XCG xcg = this.A06;
        if (!(xcg == null || vzF == null)) {
            List list = this.A0I;
            xcg.ANT(vzF, list);
            vzF.A03 = Math.max(vzF.A03, this.A02 + 1);
            xcg.ASW(vzF);
            List list2 = this.A0G;
            Integer num = AnonymousClass05K.A0C;
            C21006X9e x9e = this.A05;
            x9e.getClass();
            A00(vzF, num, this.A05, x9e.AiK(), list2);
            list.clear();
        }
        this.A0A = true;
        if (this.A0B && this.A05 != null) {
            A02();
            C19724WeQ weQ = new C19724WeQ();
            weQ.A01(this.A05);
            this.A06 = weQ;
            this.A0H.add(weQ);
            List list3 = this.A0G;
            Integer num2 = AnonymousClass05K.A0N;
            C21006X9e x9e2 = this.A05;
            x9e2.getClass();
            A00(vzF, num2, this.A05, x9e2.AiK(), list3);
            this.A0B = false;
        }
    }

    public final void onDrawFrame(GL10 gl10) {
        XCG xcg = this.A06;
        if (xcg != null) {
            xcg.E4D();
            if (this.A0A) {
                this.A0A = false;
                C19725WeR weR = this.A07;
                weR.getClass();
                weR.A03(this.A06);
                this.A06 = null;
                List list = this.A0H;
                int A062 = C51966G9m.A06(list) - 10;
                if (A062 >= 0 && this.A01 != A062) {
                    this.A01 = A062;
                    XCG xcg2 = (XCG) list.get(A062);
                    xcg2.E3l();
                    C19725WeR weR2 = this.A08;
                    weR2.getClass();
                    weR2.A03(xcg2);
                }
            }
        }
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
        C19725WeR weR3 = this.A07;
        weR3.getClass();
        weR3.AQF();
        XCG xcg3 = this.A06;
        if (xcg3 != null) {
            xcg3.AQF();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0055, code lost:
        if (r14 == r1.A01) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r14 == r1.A01) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceChanged(javax.microedition.khronos.opengles.GL10 r12, int r13, int r14) {
        /*
            r11 = this;
            android.graphics.Point r2 = r11.A0C
            r2.set(r13, r14)
            r4 = 0
            r12.glViewport(r4, r4, r13, r14)
            float[] r3 = r11.A0L
            float r6 = (float) r13
            float r7 = (float) r14
            r5 = 0
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r10 = 1065353216(0x3f800000, float:1.0)
            r8 = r5
            android.opengl.Matrix.orthoM(r3, r4, r5, r6, r7, r8, r9, r10)
            java.util.Set r0 = r11.A0J
            java.util.Iterator r1 = r0.iterator()
        L_0x001c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r1.next()
            X.X9e r0 = (X.C21006X9e) r0
            r0.Ecj(r3)
            r0.EPW(r2)
            goto L_0x001c
        L_0x002f:
            X.WeR r2 = r11.A07
            if (r2 == 0) goto L_0x003d
            X.Tt4 r1 = r2.A05
            int r0 = r1.A03
            if (r13 != r0) goto L_0x003d
            int r0 = r1.A01
            if (r14 == r0) goto L_0x0047
        L_0x003d:
            X.VhP r0 = r11.A0F
            X.WeR r2 = new X.WeR
            r2.<init>(r0, r13, r14)
            r2.A02()
        L_0x0047:
            r11.A07 = r2
            X.WeR r2 = r11.A08
            if (r2 == 0) goto L_0x0057
            X.Tt4 r1 = r2.A05
            int r0 = r1.A03
            if (r13 != r0) goto L_0x0057
            int r0 = r1.A01
            if (r14 == r0) goto L_0x0061
        L_0x0057:
            X.VhP r0 = r11.A0F
            X.WeR r2 = new X.WeR
            r2.<init>(r0, r13, r14)
            r2.A02()
        L_0x0061:
            r11.A08 = r2
            r0 = -1
            r11.A01 = r0
            r2 = 0
        L_0x0067:
            java.util.List r1 = r11.A0H
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x0080
            java.lang.Object r1 = r1.get(r2)
            X.XCG r1 = (X.XCG) r1
            r1.E3l()
            X.WeR r0 = r11.A07
            r0.A03(r1)
            int r2 = r2 + 1
            goto L_0x0067
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20366Wq6.onSurfaceChanged(javax.microedition.khronos.opengles.GL10, int, int):void");
    }

    public final void run() {
        Handler handler;
        Runnable runnable;
        C18735VzF vzF;
        C17872VhP vhP = this.A0F;
        while (true) {
            Queue queue = vhP.A02;
            if (queue.isEmpty()) {
                break;
            }
            Runnable runnable2 = (Runnable) queue.remove();
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        while (!this.A09) {
            BlockingQueue blockingQueue = this.A0K;
            if (!blockingQueue.isEmpty()) {
                Object poll = blockingQueue.poll();
                poll.getClass();
                MotionEvent motionEvent = (MotionEvent) poll;
                if (this.A0B) {
                    motionEvent.setAction(3);
                }
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked != 0) {
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (!(actionMasked == 3 || actionMasked == 6)) {
                            }
                        } else if (this.A00 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                            int historySize = motionEvent.getHistorySize();
                            for (int i = 0; i < historySize; i++) {
                                PointF pointF = new PointF(0.0f, 0.0f);
                                vzF.A04 = pointF;
                                vzF.A02 = -1;
                                pointF.set(motionEvent.getHistoricalX(i), motionEvent.getHistoricalY(i));
                                vzF.A03 = motionEvent.getHistoricalEventTime(i);
                                vzF.A01 = motionEvent.getHistoricalSize(i);
                                vzF.A00 = motionEvent.getHistoricalPressure(i);
                                vzF.A02 = i;
                                A04(vzF);
                            }
                            vzF = new C18735VzF(motionEvent);
                            A04(vzF);
                        }
                    }
                    if (this.A00 == motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8)) {
                        A05(new C18735VzF(motionEvent));
                    }
                    if (motionEvent.getPointerCount() == 1) {
                        handler = this.A0D;
                        runnable = new C20091Wkp(this);
                        handler.post(runnable);
                    }
                } else {
                    this.A00 = motionEvent.getPointerId((motionEvent.getAction() & 65280) >> 8);
                    A03(new C18735VzF(motionEvent));
                    handler = this.A0D;
                    runnable = new C20090Wko(this);
                    handler.post(runnable);
                }
                motionEvent.recycle();
            } else {
                return;
            }
        }
    }

    public C20366Wq6(AnonymousClass4XC r3, C17872VhP vhP) {
        this.A0F = vhP;
        this.A0E = r3;
        this.A0D = AnonymousClass7TF.A0D();
        this.A0I = new ArrayList();
        this.A01 = -1;
    }
}
