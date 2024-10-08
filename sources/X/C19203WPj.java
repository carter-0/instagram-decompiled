package X;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.WindowManager;
import com.facebook.gputimer.GPUTimerImpl;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.WPj  reason: case insensitive filesystem */
public final class C19203WPj implements AnonymousClass0iw, C367448ql {
    public static final String __redex_internal_original_name = "CameraCorePostCaptureMediaPipelineController";
    public final C18660VwH A00;
    public final A9Q A01;
    public final UserSession A02;

    public final boolean CL7(String str, String str2) {
        return true;
    }

    public final void EUt(UserSession userSession, List list) {
        0qQ.A0B(list, 0);
        this.A01.A01.A07(list);
    }

    public final boolean isConnected() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.VAo, java.lang.Object] */
    public C19203WPj(Context context, C365408n3 r16, C344557s3 r17, UserSession userSession) {
        C344037rD r11;
        C20947X5q x5q;
        String A002 = AnonymousClass000.A00(4893);
        UserSession userSession2 = userSession;
        this.A02 = userSession2;
        C344227rW r9 = new C344227rW(new C343947r4(userSession2));
        HandlerThread A0J = Pxf.A0J("IgCameraRenderManagerThread", -8);
        Handler A0D = AnonymousClass7TF.A0D();
        Context context2 = context;
        Object systemService = context.getSystemService("window");
        0qQ.A0C(systemService, AnonymousClass000.A00(14));
        int rotation = ((WindowManager) systemService).getDefaultDisplay().getRotation();
        ? obj = new Object();
        WG2 wg2 = WG2.A00;
        if (182.A06(0Tu.A05, userSession2, 36316332194599143L)) {
            r11 = new C368708tC();
        } else {
            AtomicLong atomicLong = C344007rA.A03;
            r11 = new C344007rA(new C19051WId(this, userSession2), A002, 27p.A01(userSession2).A04.A0L);
        }
        C18660VwH vwH = new C18660VwH(context2, A0D, A0J, wg2, r9, r17, r11, obj, rotation);
        this.A00 = vwH;
        C365408n3 r2 = r16;
        vwH.A00 = new WG4(context, r2);
        A9Q a9q = new A9Q(vwH, vwH.A0L);
        this.A01 = a9q;
        if (r2 instanceof C20947X5q) {
            x5q = (C20947X5q) r2;
        } else {
            x5q = null;
        }
        vwH.A03(r2, x5q);
        a9q.A01();
    }

    public final void A9i(AnonymousClass8KU r2) {
        this.A01.A01.A04(r2);
    }

    public final C352718Eo ALQ() {
        C352718Eo ALQ = this.A00.A0L.ALQ();
        0qQ.A07(ALQ);
        return ALQ;
    }

    public final GPUTimerImpl B8n() {
        return this.A00.A0J.A03.A0A;
    }

    public final void EIx() {
        this.A01.A01();
    }

    public final void EMX(C344907sc r2) {
        this.A01.A01.A05(r2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        if (r4 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r5.A03(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EMY(X.C344907sc r7, X.C345237tA r8) {
        /*
            r6 = this;
            X.A9Q r0 = r6.A01
            X.VwH r1 = r0.A01
            X.VvR r0 = r1.A0K
            X.WG9 r5 = r1.A0J
            r4 = 0
            java.util.Map r3 = r0.A00
            monitor-enter(r3)
            X.7sZ r2 = r7.CAG()     // Catch:{ all -> 0x0041 }
            java.lang.ref.WeakReference r1 = X.C18633VvR.A00(r0, r8, r2)     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x001f
            java.lang.String r1 = "RendererEventHelper"
            java.lang.String r0 = "Received an event for a renderer that wasn't registered"
            X.0KC.A0D(r1, r0)     // Catch:{ all -> 0x0041 }
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            return
        L_0x001f:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0041 }
            X.7tA r0 = (X.C345237tA) r0     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0031
            X.VUX r4 = r5.A02()     // Catch:{ all -> 0x0041 }
            r4.A00 = r7     // Catch:{ all -> 0x0041 }
            r4.A01 = r0     // Catch:{ all -> 0x0041 }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x003b
        L_0x0031:
            java.lang.Object r0 = r3.get(r2)     // Catch:{ all -> 0x0041 }
            X.81j r0 = (X.C3496981j) r0     // Catch:{ all -> 0x0041 }
            r0.A02(r1)     // Catch:{ all -> 0x0041 }
            goto L_0x002f
        L_0x003b:
            if (r4 == 0) goto L_0x0040
            r5.A03(r4)
        L_0x0040:
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0041 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19203WPj.EMY(X.7sc, X.7tA):void");
    }

    public final void destroy() {
        A9Q a9q = this.A01;
        a9q.A00();
        a9q.A00 = false;
        a9q.A01.A01();
    }

    public final String getModuleName() {
        C18660VwH vwH = this.A00;
        if (vwH != null) {
            String BgN = vwH.A0L.BgN();
            0qQ.A07(BgN);
            return BgN;
        }
        0KC.A0C(__redex_internal_original_name, "mediaPipelineController is unexpectedly null");
        return "";
    }

    public final void pause() {
        this.A01.A00();
    }
}
