package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Message;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;
import java.lang.ref.WeakReference;

/* renamed from: X.RBw  reason: case insensitive filesystem */
public final class C8836RBw extends Q7x {
    public static final double A03 = Math.toRadians(30.0d);
    public boolean A00;
    public final C11247SHh A01;
    public final WeakReference A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8836RBw(Context context, SurfaceTexture surfaceTexture, C315796kZ r12, C11247SHh sHh, C315766kW r14, int i, int i2) {
        super(context, surfaceTexture, sHh, r12.A03, r14, i, i2);
        0qQ.A0B(context, 1);
        this.A02 = C51965G9l.A0v(r12);
        this.A01 = sHh;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(X.C8836RBw r10) {
        /*
            X.7uX r5 = r10.A03
            r8 = 0
            r3 = 1
            java.lang.ref.WeakReference r7 = r10.A02
            java.lang.Object r0 = r7.get()
            X.6kZ r0 = (X.C315796kZ) r0
            if (r5 != 0) goto L_0x0013
            if (r0 == 0) goto L_0x0012
            r0.A0D = r3
        L_0x0012:
            return r8
        L_0x0013:
            if (r0 == 0) goto L_0x0017
            r0.A0D = r8
        L_0x0017:
            java.lang.Object r4 = r7.get()
            X.6kZ r4 = (X.C315796kZ) r4
            if (r4 == 0) goto L_0x00e7
            X.6kc r6 = r4.A03
            java.lang.Integer r2 = r4.A07
            if (r2 == 0) goto L_0x011e
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.6kh r1 = r6.A00
            if (r2 != r0) goto L_0x0113
            boolean r0 = r1 instanceof X.Y10
            if (r0 != 0) goto L_0x0036
            X.Y10 r1 = new X.Y10
            r1.<init>()
        L_0x0034:
            r6.A00 = r1
        L_0x0036:
            r1.EaF(r8)
            r1 = 1056964608(0x3f000000, float:0.5)
            X.6kh r0 = r6.A00
            r0.EKo(r1)
            float[] r1 = r4.A0N
            X.SHh r6 = r10.A01
            r9 = r1[r8]
            r8 = r1[r3]
            r0 = 2
            r2 = r1[r0]
            r0 = 3
            r1 = r1[r0]
            X.RqN r0 = r6.A02
            if (r0 == 0) goto L_0x005d
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.facebook.gltf.jni.GltfRenderSession r0 = (com.facebook.gltf.jni.GltfRenderSession) r0
            r0.setClearColor(r9, r8, r2, r1)
        L_0x005d:
            r6.A03 = r3
            X.RqN r0 = r6.A02
            if (r0 == 0) goto L_0x006e
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.facebook.gltf.jni.GltfRenderSession r0 = (com.facebook.gltf.jni.GltfRenderSession) r0
            r0.setFixedCamera(r3)
        L_0x006e:
            int r0 = r10.A01
            int r2 = r10.A00
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r0 = (int) r0
            r6.A01 = r0
            float r0 = (float) r2
            float r0 = r0 / r1
            int r0 = (int) r0
            r6.A00 = r0
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x0085
            X.C11247SHh.A00(r6)
        L_0x0085:
            java.lang.Object r2 = r7.get()
            X.6kZ r2 = (X.C315796kZ) r2
            if (r2 == 0) goto L_0x00e7
            java.lang.String r0 = r2.A0B
            if (r0 == 0) goto L_0x00e7
            boolean r0 = X.00l.A0W(r0)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r1 = r2.A0A
            java.lang.String r0 = r2.A09
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00e7
            java.lang.String r0 = r4.A09
            r4.A0A = r0
            r1 = -624412358(0xffffffffdac8393a, float:-2.81789583E16)
            java.lang.String r0 = "gltf_scene_glb_parsing"
            X.0fh.A01(r0, r1)
            r5.A05()
            java.lang.String r5 = r4.A0B
            X.6kW r2 = r10.A0D
            X.0qQ.A0B(r2, r3)
            X.RqN r0 = r6.A02
            java.lang.String r1 = "IgGltfSceneRenderer"
            if (r5 != 0) goto L_0x00e8
            java.lang.String r0 = "modelPath is null"
        L_0x00c0:
            r2.Ew0(r1, r0)
        L_0x00c3:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.6kT r1 = r4.A06
            if (r1 == 0) goto L_0x00d9
            java.lang.Integer r0 = r4.A08
            if (r0 == r2) goto L_0x00d9
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r1 = r1.A00
            X.PZu r0 = new X.PZu
            r0.<init>(r1, r2)
            r1.post(r0)
            r4.A08 = r2
        L_0x00d9:
            android.os.Handler r1 = r10.A02
            if (r1 == 0) goto L_0x00e1
            r0 = 6
        L_0x00de:
            r1.sendEmptyMessage(r0)
        L_0x00e1:
            r0 = 1435181263(0x558b20cf, float:1.91216285E13)
            X.0fh.A00(r0)
        L_0x00e7:
            return r3
        L_0x00e8:
            if (r0 != 0) goto L_0x00ee
            java.lang.String r0 = "renderSession is null"
            goto L_0x00c0
        L_0x00ee:
            X.0eM r0 = r0.A00
            java.lang.Object r0 = r0.getValue()
            com.facebook.gltf.jni.GltfRenderSession r0 = (com.facebook.gltf.jni.GltfRenderSession) r0
            boolean r0 = r0.loadModelAtPath(r5)
            r6.A04 = r0
            if (r0 == 0) goto L_0x010d
            X.C11247SHh.A00(r6)
        L_0x0101:
            boolean r0 = r6.A04
            if (r0 == 0) goto L_0x00c3
            r10.A00 = r3
            android.os.Handler r1 = r10.A02
            if (r1 == 0) goto L_0x00e1
            r0 = 5
            goto L_0x00de
        L_0x010d:
            java.lang.String r0 = "Model failed to load"
            r2.Ew0(r1, r0)
            goto L_0x0101
        L_0x0113:
            boolean r0 = r1 instanceof X.Y11
            if (r0 != 0) goto L_0x0036
            X.Y11 r1 = new X.Y11
            r1.<init>()
            goto L_0x0034
        L_0x011e:
            java.lang.String r0 = "assetCategory"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8836RBw.A00(X.RBw):boolean");
    }

    public final void A04() {
        WeakReference weakReference = this.A02;
        C315796kZ r6 = (C315796kZ) weakReference.get();
        if (r6 != null) {
            C315856kh r2 = r6.A03.A00;
            if (AnonymousClass05K.A01 == r6.A08 && Math.sqrt(Math.pow((double) r2.Bcb(), 2.0d) + Math.pow((double) r2.BoZ(), 2.0d)) > A03 && r6.A06 != null && !r6.A0G) {
                r6.A0G = true;
            }
        }
        if (this.A00) {
            0fh.A01("gltf_scene_gpu_upload", 213291794);
        } else {
            0fh.A01("gltf_scene_cpu_frame_time", -1336067899);
        }
        C346067uX r0 = this.A03;
        if (r0 != null) {
            r0.A05();
        }
        super.A04();
        if (this.A00) {
            C315796kZ r3 = (C315796kZ) weakReference.get();
            if (r3 != null) {
                Integer num = AnonymousClass05K.A01;
                C315746kT r1 = r3.A06;
                if (!(r1 == null || r3.A08 == num)) {
                    IgGltfSceneLayoutView igGltfSceneLayoutView = r1.A00;
                    igGltfSceneLayoutView.post(new C73276PZu(igGltfSceneLayoutView, num));
                    r3.A08 = num;
                }
            }
            this.A00 = false;
            return;
        }
        0fh.A00(-537805061);
    }

    public final void A05(C10711Rwp rwp) {
        Handler handler = this.A02;
        if (handler != null) {
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.obj = rwp;
            handler.sendMessage(obtain);
        }
    }

    public final void A03() {
        super.A03();
        C315796kZ r0 = (C315796kZ) this.A02.get();
        if (r0 != null && r0.A0D && this.A03 != null) {
            A00(this);
        }
    }
}
