package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.2hg  reason: invalid class name and case insensitive filesystem */
public final class C226682hg extends C226692hh {
    public final /* synthetic */ ImageUrl A00;
    public final /* synthetic */ C240963Ni A01;
    public final /* synthetic */ IgImageView A02;
    public final /* synthetic */ AtomicInteger A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ boolean A08;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0076 A[Catch:{ all -> 0x00e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008c A[SYNTHETIC, Splitter:B:38:0x008c] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ce A[Catch:{ all -> 0x00e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DFZ(android.graphics.drawable.Drawable r23, X.AnonymousClass2i4 r24, X.C226732hl r25, X.C240493Lc r26, int r27, long r28) {
        /*
            r22 = this;
            r4 = 1
            r0 = r22
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r0.A02
            X.0sa r10 = r0.A05
            java.util.concurrent.atomic.AtomicInteger r6 = r0.A03
            X.0sP r7 = r0.A07
            com.instagram.common.typedurl.ImageUrl r12 = r0.A00
            X.3Ni r0 = r0.A01
            r8 = 1
            boolean r2 = com.facebook.systrace.Systrace.A0E(r8)
            if (r2 == 0) goto L_0x001f
            r3 = -280476193(0xffffffffef4845df, float:-6.198147E28)
            java.lang.String r2 = "IgVitoHelper.onFinalImageSet"
            X.0fS.A01(r2, r3)
        L_0x001f:
            X.0iw r2 = r1.A07     // Catch:{ all -> 0x00e1 }
            r5 = 0
            if (r2 == 0) goto L_0x0027
            r2.getModuleName()     // Catch:{ all -> 0x00e1 }
        L_0x0027:
            r10.invoke()     // Catch:{ all -> 0x00e1 }
            r2 = -1
            r6.set(r2)     // Catch:{ all -> 0x00e1 }
            if (r26 == 0) goto L_0x00d4
            r3 = r24
            java.util.Map r6 = r3.A09     // Catch:{ all -> 0x00e1 }
            if (r6 == 0) goto L_0x0045
            java.lang.String r2 = "LOAD_SOURCE"
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x00e1 }
        L_0x003c:
            boolean r2 = r6 instanceof java.lang.String     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x0047
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00e1 }
            if (r6 != 0) goto L_0x0063
            goto L_0x0047
        L_0x0045:
            r6 = r5
            goto L_0x003c
        L_0x0047:
            r2 = 2
            r6 = r27
            if (r6 == r2) goto L_0x005e
            r2 = 3
            if (r6 == r2) goto L_0x005b
            r2 = 4
            if (r6 == r2) goto L_0x0061
            r2 = 5
            if (r6 == r2) goto L_0x0061
            r2 = 6
            if (r6 == r2) goto L_0x0061
            java.lang.String r6 = "UNKNOWN"
            goto L_0x0063
        L_0x005b:
            java.lang.String r6 = "disk"
            goto L_0x0063
        L_0x005e:
            java.lang.String r6 = "network"
            goto L_0x0063
        L_0x0061:
            java.lang.String r6 = "memory"
        L_0x0063:
            r7.invoke(r6)     // Catch:{ all -> 0x00e1 }
            X.1z9 r10 = com.instagram.common.ui.widget.imageview.IgImageView.A0d     // Catch:{ all -> 0x00e1 }
            int r14 = r1.getHeight()     // Catch:{ all -> 0x00e1 }
            int r15 = r1.getWidth()     // Catch:{ all -> 0x00e1 }
            com.instagram.common.typedurl.ImageLoggingData r2 = r12.BO8()     // Catch:{ all -> 0x00e1 }
            if (r2 == 0) goto L_0x007a
            com.instagram.analytics.ppr.loggingdata.PPRLoggingData r2 = (com.instagram.analytics.ppr.loggingdata.PPRLoggingData) r2     // Catch:{ all -> 0x00e1 }
            r2.A01 = r4     // Catch:{ all -> 0x00e1 }
        L_0x007a:
            int r16 = r26.getWidth()     // Catch:{ all -> 0x00e1 }
            int r17 = r26.getHeight()     // Catch:{ all -> 0x00e1 }
            int r18 = r26.getSizeInBytes()     // Catch:{ all -> 0x00e1 }
            java.lang.String r13 = r1.A0J     // Catch:{ all -> 0x00e1 }
            java.lang.String r2 = "Required value was null."
            if (r13 == 0) goto L_0x00ce
            X.0iw r11 = r1.A07     // Catch:{ all -> 0x00e1 }
            java.util.Map r4 = r3.A09     // Catch:{ all -> 0x00e1 }
            if (r4 == 0) goto L_0x0098
            java.lang.String r3 = "ENCODED_IMAGE_SIZE"
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x00e1 }
        L_0x0098:
            boolean r3 = r5 instanceof java.lang.Integer     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x00aa
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x00e1 }
            if (r5 == 0) goto L_0x00aa
            int r19 = r5.intValue()     // Catch:{ all -> 0x00e1 }
        L_0x00a4:
            r20 = 0
            r10.DJv(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00e1 }
            goto L_0x00ad
        L_0x00aa:
            r19 = 0
            goto L_0x00a4
        L_0x00ad:
            if (r0 == 0) goto L_0x00d4
            r17 = 0
            java.lang.String r18 = r12.getUrl()     // Catch:{ all -> 0x00e1 }
            java.lang.String r3 = r1.A0J     // Catch:{ all -> 0x00e1 }
            if (r3 == 0) goto L_0x00c8
            X.3Nk r1 = new X.3Nk     // Catch:{ all -> 0x00e1 }
            r16 = r1
            r19 = r3
            r21 = r20
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00e1 }
            r0.DO4(r1)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d4
        L_0x00c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e1 }
            goto L_0x00d3
        L_0x00ce:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00e1 }
            r0.<init>(r2)     // Catch:{ all -> 0x00e1 }
        L_0x00d3:
            throw r0     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00e0
            r0 = -484630790(0xffffffffe31d1efa, float:-2.898371E21)
            X.0fS.A00(r0)
        L_0x00e0:
            return
        L_0x00e1:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r8)
            if (r0 == 0) goto L_0x00ee
            r0 = -1422777784(0xffffffffab322248, float:-6.328588E-13)
            X.0fS.A00(r0)
        L_0x00ee:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226682hg.DFZ(android.graphics.drawable.Drawable, X.2i4, X.2hl, X.3Lc, int, long):void");
    }

    public C226682hg(ImageUrl imageUrl, C240963Ni r2, IgImageView igImageView, AtomicInteger atomicInteger, C62320sa r5, C62320sa r6, C62320sa r7, 0sP r8, boolean z) {
        this.A08 = z;
        this.A02 = igImageView;
        this.A05 = r5;
        this.A03 = atomicInteger;
        this.A07 = r8;
        this.A00 = imageUrl;
        this.A01 = r2;
        this.A06 = r6;
        this.A04 = r7;
    }

    public final boolean equals(Object obj) {
        if (this.A08) {
            return true;
        }
        return super.equals(obj);
    }

    public final int hashCode() {
        if (this.A08) {
            return 36;
        }
        return super.hashCode();
    }
}
