package X;

import android.util.LruCache;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.UuL  reason: case insensitive filesystem */
public final class C16403UuL extends WHW implements C20990X8g, X7E {
    public final C19855Wga A00;
    public final /* synthetic */ C19855Wga A01;
    public final /* synthetic */ C19855Wga A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16403UuL(LruCache lruCache, C19855Wga wga) {
        super(lruCache, wga);
        0qQ.A0B(lruCache, 2);
        this.A01 = wga;
        this.A02 = wga;
        this.A00 = wga;
    }

    public final boolean BO9() {
        return this.A01.BO9();
    }

    public final int BOz() {
        return this.A01.BOz();
    }

    public final VQB BiT() {
        return this.A02.BiT();
    }

    public final ExecutorService BsU() {
        return this.A02.BsU();
    }

    public final boolean CCO() {
        return this.A01.CCO();
    }

    public final int getMarkerId() {
        return this.A01.getMarkerId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
        if (r11.isMarkerOn(r2.BOz(), r13) != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C17705Vca r15, X.C16403UuL r16, java.lang.Integer r17) {
        /*
            r3 = r16
            X.Wga r2 = r3.A01
            boolean r0 = r2.BO9()
            if (r0 == 0) goto L_0x0078
            r0 = r15
            java.lang.String r1 = r15.A09
            if (r1 == 0) goto L_0x0078
            int r13 = r1.hashCode()
            X.Wga r1 = r3.A02
            X.VQB r1 = r1.BiT()
            int r12 = r2.getMarkerId()
            com.facebook.quicklog.QuickPerformanceLogger r11 = r1.A00
            boolean r1 = r11.isMarkerOn(r12, r13)
            if (r1 != 0) goto L_0x0030
            int r1 = r2.BOz()
            boolean r1 = r11.isMarkerOn(r1, r13)
            r10 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r10 = 1
        L_0x0031:
            r6 = r17
            int r4 = r6.intValue()
            r1 = 3
            if (r4 == r1) goto L_0x00c5
            r1 = 4
            if (r4 == r1) goto L_0x00a5
            r2 = 2
            if (r4 == r2) goto L_0x0079
            r1 = 1
            if (r4 != r1) goto L_0x004f
            long r15 = r15.A02
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.lang.String r14 = "image-requested"
        L_0x0049:
            X.0qQ.A0B(r14, r2)
            r11.markerPoint(r12, r13, r14, r15, r17)
        L_0x004f:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r6 != r1) goto L_0x0078
            if (r10 == 0) goto L_0x0078
            X.2i4 r0 = r0.A06
            java.lang.String r5 = r3.A02(r0)
            if (r5 == 0) goto L_0x0078
            android.util.LruCache r4 = r3.A00
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.Object r0 = r4.get(r5)
            if (r0 == 0) goto L_0x006a
            r1 = r0
        L_0x006a:
            long r2 = X.AnonymousClass7TE.A0R(r1)
            r0 = 1
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.put(r5, r0)
        L_0x0078:
            return
        L_0x0079:
            boolean r1 = r11.isMarkerOn(r12, r13)
            if (r1 == 0) goto L_0x004f
            java.lang.Object r4 = r15.A08
            boolean r1 = r4 instanceof X.C240493Lc
            if (r1 == 0) goto L_0x004f
            X.3Lc r4 = (X.C240493Lc) r4
            if (r4 == 0) goto L_0x004f
            X.3Lm r1 = r4.BiU()
            int r5 = r1.A00
            java.lang.String[] r4 = X.VKM.A00
            if (r5 < 0) goto L_0x009e
            r1 = 15
            if (r5 >= r1) goto L_0x009e
            r14 = r4[r5]
        L_0x0099:
            long r15 = r15.A03
            java.util.concurrent.TimeUnit r17 = java.util.concurrent.TimeUnit.MILLISECONDS
            goto L_0x0049
        L_0x009e:
            java.lang.String r1 = "quality-"
            java.lang.String r14 = X.002.A0O(r1, r5)
            goto L_0x0099
        L_0x00a5:
            long r1 = r15.A00
            long r4 = r15.A05
            long r15 = java.lang.Math.max(r1, r4)
            com.facebook.quicklog.MarkerEditor r4 = r11.withMarker(r12, r13)
            X.Vfx r7 = new X.Vfx
            r7.<init>(r4)
            r5 = 0
            java.lang.String r4 = "No image request was specified!"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x010f
            com.facebook.quicklog.MarkerEditor r1 = r7.A00
            r1.markerEditingCompleted()
            goto L_0x004f
        L_0x00c5:
            boolean r1 = r11.isMarkerOn(r12, r13)
            if (r1 == 0) goto L_0x004f
            long r1 = r15.A01
            long r4 = r15.A05
            long r15 = java.lang.Math.max(r1, r4)
            com.facebook.quicklog.MarkerEditor r4 = r11.withMarker(r12, r13)
            X.Vfx r8 = new X.Vfx
            r8.<init>(r4)
            java.lang.Object r9 = r0.A08
            boolean r4 = r9 instanceof X.C240493Lc
            if (r4 == 0) goto L_0x00fa
            X.3Lc r9 = (X.C240493Lc) r9
            if (r9 == 0) goto L_0x00fa
            int r5 = r9.getWidth()
            java.lang.String r4 = "imageWidth"
            com.facebook.quicklog.MarkerEditor r7 = r8.A00
            r7.annotate(r4, r5)
            int r5 = r9.getHeight()
            java.lang.String r4 = "imageHeight"
            r7.annotate(r4, r5)
        L_0x00fa:
            X.2i4 r5 = r0.A06
            java.lang.String r4 = r3.A02(r5)
            r3.A03(r5, r8, r4)
            java.lang.String r5 = "image-render-final"
            com.facebook.quicklog.MarkerEditor r4 = r8.A00
            r4.point(r5, r1)
            r4.markerEditingCompleted()
            r14 = 2
            goto L_0x0123
        L_0x010f:
            X.2i4 r5 = r0.A06
            java.lang.String r4 = r3.A02(r5)
            r3.A03(r5, r7, r4)
            java.lang.String r5 = "image-load-failure"
            com.facebook.quicklog.MarkerEditor r4 = r7.A00
            r4.point(r5, r1)
            r4.markerEditingCompleted()
            r14 = 3
        L_0x0123:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 4
            X.0qQ.A0B(r2, r1)
            r17 = r2
            r11.markerEnd(r12, r13, r14, r15, r17)
            goto L_0x004f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16403UuL.A00(X.Vca, X.UuL, java.lang.Integer):void");
    }

    public static final void A01(C17705Vca vca, C16403UuL uuL, Integer num, String str, String str2, int i, int i2) {
        CallerContext callerContext;
        String str3;
        ContextChain A002;
        C17705Vca vca2 = vca;
        C16403UuL uuL2 = uuL;
        int i3 = i;
        int i4 = i2;
        if (num.intValue() == 1) {
            QuickPerformanceLogger quickPerformanceLogger = uuL2.A02.BiT().A00;
            if (!quickPerformanceLogger.isMarkerOn(i3, i4)) {
                long j = vca2.A05;
                quickPerformanceLogger.markerStart(i3, i4, j, TimeUnit.MILLISECONDS);
                C18538Vtq vtq = C18538Vtq.A00;
                Object obj = vca2.A07;
                if (obj instanceof CallerContext) {
                    callerContext = (CallerContext) obj;
                } else {
                    callerContext = null;
                }
                ContextChain contextChain = null;
                if (callerContext == null || (contextChain = callerContext.A00) == null || (A002 = contextChain.A00()) == null || (str3 = A002.A04) == null) {
                    str3 = "";
                }
                C17786Vfx vfx = new C17786Vfx(quickPerformanceLogger.withMarker(i3, i4));
                MarkerEditor markerEditor = vfx.A00;
                markerEditor.annotate("schema_ver", 108);
                vfx.A00("cid", vca2.A09);
                C226722hk.A02();
                markerEditor.annotate("vito_cfg_sf", false);
                markerEditor.annotate("vito_cfg_fallback", false);
                markerEditor.point("view-appeared", j);
                if (callerContext != null) {
                    vfx.A00("callingClassName", callerContext.A02);
                    if (contextChain != null) {
                        vfx.A00("rootContextName", str3);
                        String[] split = contextChain.toString().split(String.valueOf('/'));
                        0qQ.A07(split);
                        markerEditor.annotate("contextChain", split);
                        vfx.A00("contextChainExtras", str);
                        String str4 = str2;
                        if (str2 != null) {
                            vfx.A00("contentId", str4);
                        }
                    }
                }
                AnonymousClass2i4 r0 = vca2.A06;
                if (r0 != null) {
                    vtq.A00(r0, vfx);
                    Map map = r0.A08;
                    if (map != null) {
                        vfx.A00("tag", Pxf.A0j("component_tag", map));
                    }
                }
                markerEditor.markerEditingCompleted();
            }
            long j2 = vca2.A02;
            if (j2 != -1) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                0qQ.A0B("image-requested", 2);
                quickPerformanceLogger.markerPoint(i3, i4, "image-requested", j2, timeUnit);
            }
            if (vca2.A01 == -1) {
                return;
            }
        }
        long j3 = vca2.A04;
        long max = Math.max(j3, vca2.A05);
        QuickPerformanceLogger quickPerformanceLogger2 = uuL2.A02.BiT().A00;
        C17786Vfx vfx2 = new C17786Vfx(quickPerformanceLogger2.withMarker(i3, i4));
        AnonymousClass2i4 r3 = vca2.A06;
        uuL2.A03(r3, vfx2, uuL2.A02(r3));
        MarkerEditor markerEditor2 = vfx2.A00;
        markerEditor2.point("view-disappeared", j3);
        markerEditor2.markerEditingCompleted();
        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
        0qQ.A0B(timeUnit2, 4);
        quickPerformanceLogger2.markerEnd(i3, i4, 4, max, timeUnit2);
    }
}
