package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.HashSet;

/* renamed from: X.SFw  reason: case insensitive filesystem */
public final class C11222SFw {
    public int A00 = -1;
    public int A01 = 0;
    public int A02 = -1;
    public MediaComposition A03;
    public final Context A04;
    public final C13588TdG A05;
    public final C13589TdH A06;
    public final C13590TdI A07;
    public final C13780Tgv A08;
    public final C13804ThT A09;
    public final C7334Q4k A0A;
    public final C13598TdQ A0B;
    public final HashSet A0C;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.Tgv} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.Tgv} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0110, code lost:
        if (r4 != null) goto L_0x009a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C7335Q4l A00(X.C11222SFw r8, X.C7232Q0d r9, X.C11354SOn r10, X.C10864RzP r11, X.RF9 r12, X.C13835TiA r13, X.REA r14, java.io.File r15, long r16, long r18, long r20, boolean r22, boolean r23) {
        /*
            X.REA r0 = X.REA.NON_SEGMENTED_TRANSCODE
            r2 = r11
            if (r14 != r0) goto L_0x0116
            java.lang.String r0 = r11.A0Q
        L_0x0007:
            X.Q4q r5 = new X.Q4q
            r3 = r8
            r5.<init>(r8, r12, r13)
            X.SQv r4 = new X.SQv
            r4.<init>()
            r4.A0F = r0
            r4.A0D = r15
            com.facebook.videolite.transcoder.base.composition.MediaComposition r7 = r8.A03
            r4.A08 = r7
            long r0 = r11.A04
            r4.A04 = r0
            long r0 = r11.A03
            r4.A00 = r0
            r4.A06 = r10
            r4.A07 = r5
            r0 = r23
            r4.A0J = r0
            X.Q4k r5 = r8.A0A
            r4.A0B = r5
            r0 = r16
            r4.A02 = r0
            r0 = r22
            r4.A0M = r0
            r0 = r18
            r4.A03 = r0
            r0 = r20
            r4.A01 = r0
            r0 = 0
            r4.A0N = r0
            java.util.HashSet r0 = r8.A0C
            r4.A0G = r0
            X.SFQ r1 = r11.A0I
            if (r1 != 0) goto L_0x0053
            X.SF8 r0 = new X.SF8
            r0.<init>()
            X.SFQ r1 = new X.SFQ
            r1.<init>(r0)
        L_0x0053:
            if (r7 == 0) goto L_0x0113
            boolean r0 = X.Q1Z.A05(r7)
            if (r0 != 0) goto L_0x0063
            X.4aE r0 = X.C266714aE.AUDIO
            boolean r0 = r7.A0B(r0)
            if (r0 == 0) goto L_0x0113
        L_0x0063:
            r0 = 1
        L_0x0064:
            r4.A0Q = r0
            if (r0 == 0) goto L_0x006a
            r4.A0C = r1
        L_0x006a:
            X.RF9 r0 = X.RF9.Mixed
            if (r12 == r0) goto L_0x0082
            X.RF9 r0 = X.RF9.Video
            r1 = 1
            boolean r0 = X.C51969G9p.A1a(r12, r0)
            r4.A0I = r0
            java.lang.String r0 = "g"
            r4.A0E = r0
            X.RF9 r0 = X.RF9.Audio
            if (r12 != r0) goto L_0x0080
            r1 = 0
        L_0x0080:
            r4.A0H = r1
        L_0x0082:
            X.RzN r15 = new X.RzN
            r15.<init>(r4)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r4 = r15.A08
            if (r4 == 0) goto L_0x010f
            boolean r0 = X.Q1Z.A05(r4)
            if (r0 != 0) goto L_0x0099
            X.4aE r0 = X.C266714aE.AUDIO
            boolean r0 = r4.A0B(r0)
            if (r0 == 0) goto L_0x010f
        L_0x0099:
            r8 = 0
        L_0x009a:
            if (r5 == 0) goto L_0x00d1
            X.4aE r1 = X.C266714aE.VIDEO
            java.util.HashMap r0 = r4.A02
            java.lang.Object r0 = r0.get(r1)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            if (r0 == 0) goto L_0x00d1
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r0)
        L_0x00ac:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r0 = X.C51971G9r.A0p(r5)
            X.4aM r0 = (X.C266794aM) r0
            java.util.List r0 = r0.A07
            java.util.Iterator r4 = X.Pxg.A16(r0)
        L_0x00be:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r4.next()
            X.4aK r0 = (X.C266774aK) r0
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x00be
        L_0x00d1:
            android.content.Context r4 = r3.A04
            X.Tfv r10 = r11.A0G
            r10.getClass()
            X.ThT r14 = r3.A09
            X.TdI r12 = r3.A07
            X.Tgv r13 = r3.A08
            boolean r0 = r15.A0I
            if (r0 != 0) goto L_0x00f1
            boolean r0 = X.SRj.A04(r15)
            if (r0 == 0) goto L_0x0103
            boolean r1 = r13.AFw()
            java.lang.String r0 = "Incompatible MediaExtractor for pass through"
            X.C266784aL.A06(r1, r0)
        L_0x00f1:
            X.TdQ r0 = r3.A0B
            X.TdG r7 = r3.A05
            X.TdH r11 = r3.A06
            X.Q1d r6 = r2.A09
            X.Tfu r5 = r2.A08
            X.Q4l r3 = new X.Q4l
            r16 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x0103:
            boolean r0 = r13.AFy()
            if (r0 != 0) goto L_0x00f1
            X.Q4U r13 = new X.Q4U
            r13.<init>()
            goto L_0x00f1
        L_0x010f:
            r8 = 0
            if (r4 == 0) goto L_0x00d1
            goto L_0x009a
        L_0x0113:
            r0 = 0
            goto L_0x0064
        L_0x0116:
            r0 = 0
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11222SFw.A00(X.SFw, X.Q0d, X.SOn, X.RzP, X.RF9, X.TiA, X.REA, java.io.File, long, long, long, boolean, boolean):X.Q4l");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.TdG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.TdG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.TdG} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11222SFw(android.content.Context r2, X.C13588TdG r3, X.C13589TdH r4, X.C13590TdI r5, X.C13780Tgv r6, X.C13804ThT r7, X.C7334Q4k r8, X.C13598TdQ r9, java.util.HashSet r10) {
        /*
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.A00 = r0
            r1.A02 = r0
            r0 = 0
            r1.A01 = r0
            r1.A04 = r2
            r1.A0C = r10
            r1.A06 = r4
            r1.A09 = r7
            r1.A07 = r5
            r1.A08 = r6
            r1.A0B = r9
            r1.A0A = r8
            if (r3 != 0) goto L_0x0022
            X.SrO r3 = new X.SrO
            r3.<init>()
        L_0x0022:
            r1.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11222SFw.<init>(android.content.Context, X.TdG, X.TdH, X.TdI, X.Tgv, X.ThT, X.Q4k, X.TdQ, java.util.HashSet):void");
    }
}
