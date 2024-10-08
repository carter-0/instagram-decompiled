package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;
import com.instagram.filterkit.filter.FilterGroup;
import java.util.List;

/* renamed from: X.LrZ  reason: case insensitive filesystem */
public final class C65334LrZ implements C66489MTs {
    public final int A00;
    public final Context A01;
    public final UserSession A02;
    public final MV7 A03;
    public final LO5 A04;
    public final SurfaceCropFilter A05;
    public final C66525MVd A06;
    public final FilterGroup A07;
    public final Integer A08;
    public final List A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final Handler A0C = AnonymousClass7TF.A0D();
    public final LNz A0D;

    public static final void A00(C62461KgB kgB, Exception exc, String str) {
        0f9 AEf = 0wj.A01.AEf("ImageRenderer#renderAllConfigs", 817892527);
        AEf.ABQ("renderTarget", kgB.toString());
        AnonymousClass7TF.A19(AEf, "errorType", str, exc);
    }

    public final LNz C3F() {
        return this.A0D;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00f0 A[Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0165 A[Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEp() {
        /*
            r29 = this;
            java.lang.String r9 = "ImageRenderer"
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            r10 = r29
            java.util.List r0 = r10.A09
            java.util.Iterator r16 = r0.iterator()
        L_0x000e:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0291
            java.lang.Object r7 = r16.next()
            X.LAM r7 = (X.LAM) r7
            android.content.Context r1 = r10.A01
            X.KgB r6 = r7.A02
            java.lang.String r3 = r6.name()
            r12 = 0
            r11 = 1
            java.lang.String r0 = "_watchdog"
            java.lang.String r0 = X.002.A0R(r3, r0)
            X.0tX r5 = X.0xn.A00(r1, r0)
            X.0xY r2 = r5.AR4()
            java.lang.String r13 = "attempt_description"
            boolean r0 = r5.contains(r13)
            if (r0 == 0) goto L_0x007d
            java.lang.String r4 = "crash_count"
            r1 = 0
            int r12 = r5.getInt(r4, r12)
            java.lang.String r0 = "skipped"
            boolean r0 = r5.getBoolean(r0, r1)
            if (r0 != 0) goto L_0x007d
            int r12 = r12 + 1
            r2.E5Z(r4, r12)
            java.lang.String r0 = "<unknown>"
            java.lang.String r14 = r5.getString(r13, r0)
            java.lang.Class<X.KmQ> r4 = X.C62788KmQ.class
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r3, r14}
            java.lang.String r0 = "Detected crash #%d for %s, %s"
            X.0KC.A0A(r4, r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.lang.String r0 = "Crash watchdog '%s'"
            java.lang.String r4 = X.0mp.A06(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r13, r14}
            java.lang.String r0 = "Crash #%d: %s"
            java.lang.String r0 = X.0mp.A06(r0, r1)
            X.0kD.A01(r4, r0)
            android.os.SystemClock.elapsedRealtime()
        L_0x007d:
            r4 = 0
            int r0 = r7.A00     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r12 >= r0) goto L_0x01c2
            X.0eK r0 = r10.A0B     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Object r0 = r0.get()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.8my r0 = (X.C365358my) r0     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r13 = r10.A05     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r13 == 0) goto L_0x0111
            android.graphics.Point r2 = r13.A0C(r11)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0wj r12 = X.0wj.A01     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r3 = 817892527(0x30c00caf, float:1.3973444E-9)
            java.lang.String r1 = "ImageRenderer_surface_crop_filter_not_supported"
            X.0f9 r12 = r12.AEf(r1, r3)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Integer r1 = r10.A08     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.String r3 = X.AB4.A01(r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.String r1 = "featureMode"
            r12.ABQ(r1, r3)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r12.report()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x00ab:
            X.MVd r1 = r10.A06     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.X98 r14 = r1.Bnh()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            com.instagram.unifiedfilter.UnifiedFilterManager r1 = r14.CBT()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.KgB r3 = X.C62461KgB.UPLOAD     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r6 != r3) goto L_0x0100
            com.instagram.common.session.UserSession r13 = r10.A02     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0qQ.A0A(r0)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r15 = r10.A00     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            boolean r12 = r7.A06     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            boolean r3 = r7.A05     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0qQ.A0B(r0, r11)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r15 = r15 % 180
            if (r15 != 0) goto L_0x00fb
            int r19 = r0.getWidth()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x00cf:
            r17 = r2
            r18 = r13
            r20 = r12
            r21 = r3
            r22 = r4
            r23 = r4
            android.graphics.Point r13 = X.LS5.A00(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x00df:
            int r12 = r13.x     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r13.y     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x00e3:
            com.instagram.filterkit.filter.FilterGroup r13 = r10.A07     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r1.getClass()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r13.A00 = r1     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Integer r15 = r10.A08     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r15 != r1) goto L_0x00f2
            r13.A01 = r11     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x00f2:
            X.Lrb r1 = new X.Lrb     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r1.<init>(r12, r3, r4)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r13.EEs(r14, r0, r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x015a
        L_0x00fb:
            int r19 = r0.getHeight()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x00cf
        L_0x0100:
            if (r13 == 0) goto L_0x0107
            int r12 = r2.x     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r2.y     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x00e3
        L_0x0107:
            int r12 = r2.x     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r2.y     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            android.graphics.Point r13 = new android.graphics.Point     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r13.<init>(r12, r3)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x00df
        L_0x0111:
            X.0eK r1 = r10.A0A     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Object r3 = r1.get()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.String r1 = "null cannot be cast to non-null type com.instagram.filterkit.resources.UnifiedOutputSurface"
            X.0qQ.A0C(r3, r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.Lrb r3 = (X.C65336Lrb) r3     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0qQ.A0A(r0)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r2 = r10.A00     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r1 = 2
            X.0qQ.A0B(r0, r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r3 == 0) goto L_0x012e
            int r12 = r3.A04     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r3.A03     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x014a
        L_0x012e:
            int r1 = r2 % 180
            if (r1 != 0) goto L_0x0151
            int r12 = r0.getWidth()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r0.getHeight()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x013a:
            X.0wj r14 = X.0wj.A01     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r2 = 817892527(0x30c00caf, float:1.3973444E-9)
            java.lang.String r15 = X.LS5.A01     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.String r1 = "_null_custom_output_surface"
            java.lang.String r1 = X.002.A0R(r15, r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.DbT.A1Q(r14, r1, r2)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x014a:
            android.graphics.Point r2 = new android.graphics.Point     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r2.<init>(r12, r3)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x00ab
        L_0x0151:
            int r12 = r0.getHeight()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            int r3 = r0.getWidth()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x013a
        L_0x015a:
            r13 = 6408(0x1908, float:8.98E-42)
            r1 = 12
            int r14 = com.instagram.util.creation.RenderBridge.readRenderResult(r12, r3, r13, r1)     // Catch:{ all -> 0x01c0 }
            r1 = -1
            if (r14 == r1) goto L_0x01b8
            X.LO5 r15 = r10.A04     // Catch:{ all -> 0x01c0 }
            r18 = 0
            int r23 = r0.getWidth()     // Catch:{ all -> 0x01c0 }
            int r24 = r0.getHeight()     // Catch:{ all -> 0x01c0 }
            com.instagram.common.session.UserSession r1 = r10.A02     // Catch:{ all -> 0x01c0 }
            X.L6Q r13 = new X.L6Q     // Catch:{ all -> 0x01c0 }
            r13.<init>(r1, r11, r4)     // Catch:{ all -> 0x01c0 }
            X.L4D r0 = new X.L4D     // Catch:{ all -> 0x01c0 }
            r0.<init>(r1, r4)     // Catch:{ all -> 0x01c0 }
            r20 = r0
            r21 = r7
            r22 = r14
            r25 = r12
            r26 = r3
            r27 = r4
            r28 = r11
            r17 = r15
            r19 = r13
            X.L6R r0 = r17.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)     // Catch:{ all -> 0x01c0 }
            int r11 = r0.A00     // Catch:{ all -> 0x01c0 }
            android.graphics.Point r4 = new android.graphics.Point     // Catch:{ all -> 0x01c0 }
            r4.<init>(r12, r3)     // Catch:{ all -> 0x01c0 }
            java.lang.Double r3 = r0.A01     // Catch:{ all -> 0x01c0 }
            java.lang.Double r1 = r0.A02     // Catch:{ all -> 0x01c0 }
            java.lang.Integer r25 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x01c0 }
            X.LEA r0 = new X.LEA     // Catch:{ all -> 0x01c0 }
            r19 = r2
            r20 = r4
            r22 = r3
            r23 = r1
            r24 = r18
            r26 = r11
            r18 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01c0 }
            r8.add(r0)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x0279
        L_0x01b8:
            java.lang.String r1 = "RenderBridge.readRenderResult failure"
            X.V1t r0 = new X.V1t     // Catch:{ all -> 0x01c0 }
            r0.<init>(r1)     // Catch:{ all -> 0x01c0 }
            throw r0     // Catch:{ all -> 0x01c0 }
        L_0x01c0:
            r0 = move-exception
            throw r0     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
        L_0x01c2:
            java.lang.String r0 = "skipped"
            r2.E5T(r0, r11)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r2.commit()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Class<X.KmQ> r2 = X.C62788KmQ.class
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0}     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            java.lang.String r0 = "Skipping %s rendering, after %d crash(es)!"
            X.0KC.A0A(r2, r0, r1)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.KgB r0 = X.C62461KgB.GALLERY     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            if (r6 != r0) goto L_0x000e
            com.instagram.common.session.UserSession r0 = r10.A02     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.1Av r3 = X.1Au.A00(r0)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0s0 r2 = r3.A7B     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0YZ[] r1 = X.1Av.A8a     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r0 = 34
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r4)     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            X.0xY r0 = r5.AR4()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r0.AHM()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            r0.commit()     // Catch:{ 8mt -> 0x0265, Kfn -> 0x0250, IOException -> 0x023b, V1t -> 0x0226, IllegalStateException -> 0x0211, Exception -> 0x01f8 }
            goto L_0x000e
        L_0x01f8:
            r2 = move-exception
            r0 = 2260(0x8d4, float:3.167E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)     // Catch:{ all -> 0x0285 }
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "Exception for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0279
        L_0x0211:
            r2 = move-exception
            java.lang.String r0 = "IllegalStateException"
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "IllegalStateException for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0279
        L_0x0226:
            r2 = move-exception
            java.lang.String r0 = "RenderException"
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "RenderException for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0279
        L_0x023b:
            r2 = move-exception
            java.lang.String r0 = "IOException"
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "IO exception for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0279
        L_0x0250:
            r2 = move-exception
            java.lang.String r0 = "NonJpgException"
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "NonJpgException for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
            goto L_0x0279
        L_0x0265:
            r2 = move-exception
            java.lang.String r0 = "CouldNotLoadFileException"
            A00(r6, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.String r1 = "CouldNotLoadFileException for %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r6}     // Catch:{ all -> 0x0285 }
            X.0KC.A0L(r9, r1, r2, r0)     // Catch:{ all -> 0x0285 }
            java.lang.Integer r0 = X.AnonymousClass05K.A01     // Catch:{ all -> 0x0285 }
            X.C63203KtA.A00(r7, r0, r8)     // Catch:{ all -> 0x0285 }
        L_0x0279:
            X.0xY r0 = r5.AR4()
            r0.AHM()
            r0.commit()
            goto L_0x000e
        L_0x0285:
            r1 = move-exception
            X.0xY r0 = r5.AR4()
            r0.AHM()
            r0.commit()
            throw r1
        L_0x0291:
            android.os.Handler r1 = r10.A0C
            X.M7B r0 = new X.M7B
            r0.<init>(r10, r8)
            r1.post(r0)
            X.LO5 r2 = r10.A04
            X.0nO r1 = X.0nY.A00()
            X.KIk r0 = new X.KIk
            r0.<init>(r2, r8)
            r1.ATE(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65334LrZ.EEp():void");
    }

    public C65334LrZ(Context context, UserSession userSession, MV7 mv7, SurfaceCropFilter surfaceCropFilter, C66525MVd mVd, LNz lNz, FilterGroup filterGroup, Integer num, List list, AnonymousClass0eK r11, AnonymousClass0eK r12, int i) {
        C51974G9v.A1P(context, userSession, mv7, mVd);
        0qQ.A0B(lNz, 12);
        this.A03 = mv7;
        this.A07 = filterGroup;
        this.A05 = surfaceCropFilter;
        this.A08 = num;
        this.A00 = i;
        this.A06 = mVd;
        this.A0B = r11;
        this.A0A = r12;
        this.A09 = list;
        this.A01 = DbT.A05(context);
        this.A0D = lNz;
        this.A02 = userSession;
        this.A04 = new LO5(context, userSession, mv7, num);
    }
}
