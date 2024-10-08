package X;

import android.content.Context;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;

public final class T83 implements B2D {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AudioFilterType A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ MusicAssetModel A04;
    public final /* synthetic */ C53044Ghc A05;
    public final /* synthetic */ boolean A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.Q1d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v2, resolved type: X.Q1d} */
    /* JADX WARNING: type inference failed for: r6v5, types: [X.Tgw, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v3, types: [X.Tgv, X.Srl, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v24, types: [com.facebook.videolite.transcoder.base.composition.MediaEffect, java.lang.Object, X.Sre] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DAF(com.instagram.music.common.model.DownloadedTrack r32) {
        /*
            r31 = this;
            r15 = 0
            r1 = r32
            X.0qQ.A0B(r1, r15)
            r2 = r31
            com.instagram.common.session.UserSession r0 = r2.A03
            r21 = r0
            android.content.Context r8 = r2.A01
            java.lang.String r0 = r1.A02
            java.io.File r1 = X.AnonymousClass7TE.A0t(r0)
            com.instagram.api.schemas.AudioFilterType r0 = r2.A02
            r30 = r0
            int r5 = r2.A00
            r10 = 1
            r19 = 3
            r6 = 10000(0x2710, float:1.4013E-41)
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r1.getName()
            r3.append(r0)
            r0 = 95
            r3.append(r0)
            java.lang.String r4 = r30.name()
            r3.append(r4)
            r0 = 45
            r3.append(r0)
            r3.append(r5)
            r3.append(r0)
            java.lang.String r18 = X.Pxe.A0z(r3, r6)
            java.util.Map r17 = X.C10042Rlf.A00
            r3 = r18
            r0 = r17
            java.lang.String r0 = X.DbT.A11(r3, r0)
            if (r0 == 0) goto L_0x008a
            android.net.Uri r5 = X.JTQ.A09(r0)
        L_0x0055:
            com.instagram.music.common.model.MusicAssetModel r0 = r2.A04
            com.instagram.music.common.model.MusicDataSource r0 = r0.A05
            X.Ghc r3 = r2.A05
            java.lang.String r7 = r5.toString()
            r10 = 0
            if (r0 == 0) goto L_0x0088
            java.lang.String r8 = r0.A04
        L_0x0064:
            java.lang.String r9 = r3.A0D
            if (r0 == 0) goto L_0x0086
            java.lang.String r10 = r0.A02
            com.instagram.music.common.model.AudioType r6 = r0.A01
        L_0x006c:
            com.instagram.music.common.model.MusicDataSource r4 = new com.instagram.music.common.model.MusicDataSource
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.8IJ r0 = X.C263304Kd.A02(r30)
            float r1 = r0.A01
            boolean r0 = r2.A06
            X.C53044Ghc.A01(r4, r3, r1, r15, r0)
            X.05G r1 = r3.A0M
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)
            r1.Epw(r0)
            return
        L_0x0086:
            r6 = r10
            goto L_0x006c
        L_0x0088:
            r8 = r10
            goto L_0x0064
        L_0x008a:
            java.lang.String r0 = "tmp_audio_"
            java.lang.String r4 = X.002.A0R(r0, r4)     // Catch:{ IOException -> 0x009c }
            java.lang.String r3 = ".mp4"
            java.io.File r0 = r8.getCacheDir()     // Catch:{ IOException -> 0x009c }
            java.io.File r14 = java.io.File.createTempFile(r4, r3, r0)     // Catch:{ IOException -> 0x009c }
            goto L_0x00aa
        L_0x009c:
            r4 = move-exception
            java.lang.String r3 = "FileUtil"
            java.lang.String r0 = "failed to create temp file"
            X.0KC.A0F(r3, r0, r4)
            java.lang.String r0 = ""
            java.io.File r14 = X.AnonymousClass7TE.A0t(r0)
        L_0x00aa:
            X.8IJ r3 = X.C263304Kd.A02(r30)
            com.facebook.videolite.transcoder.base.composition.MediaEffect r13 = r3.A00(r8)
            long r6 = (long) r5
            float r0 = r3.A01
            r20 = r0
            java.lang.Float r0 = r3.A05
            r16 = r0
            r4 = 10000(0x2710, double:4.9407E-320)
            X.4aP r12 = new X.4aP
            r12.<init>()
            X.4aE r0 = X.C266714aE.AUDIO
            X.4aJ r11 = new X.4aJ
            r11.<init>(r0)
            X.4aH r9 = new X.4aH
            r9.<init>(r1)
            long r0 = r6 + r4
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r6 = X.Pxe.A0V(r3, r6, r0)
            r0 = 0
            X.4aF r3 = X.Pxe.A0V(r3, r0, r4)
            X.Pxg.A1K(r6, r11, r9)
            if (r13 == 0) goto L_0x00e4
            X.SIO.A00(r3, r13, r11)
        L_0x00e4:
            r0 = r20
            r11.A00(r0)
            if (r16 == 0) goto L_0x00f9
            float r1 = r16.floatValue()
            X.Sre r0 = new X.Sre
            r0.<init>()
            r0.A00 = r1
            X.SIO.A00(r3, r0, r11)
        L_0x00f9:
            X.Pxf.A1F(r12, r11)
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = new com.facebook.videolite.transcoder.base.composition.MediaComposition
            r1.<init>(r12)
            java.io.File r5 = r8.getCacheDir()
            X.0qQ.A07(r5)
            r4 = 0
            X.RwN r3 = new X.RwN
            r0 = r21
            r3.<init>(r0, r5, r10, r15)
            X.0qQ.A0A(r14)
            X.ThT r12 = r3.A03
            X.TdI r5 = r3.A01
            X.Q1d r16 = new X.Q1d
            r16.<init>()
            X.0wj r3 = X.0wj.A01
            boolean r6 = r13 instanceof X.C12334Srg
            X.0qQ.A0B(r14, r10)
            r0 = r19
            X.0qQ.A0B(r12, r0)
            r0 = 4
            X.DbW.A1O(r5, r0, r3)
            X.Qdt r24 = new X.Qdt
            r24.<init>()
            X.RzN r11 = X.SF8.A00(r1, r14)
            if (r6 == 0) goto L_0x015f
            com.facebook.cvat.ctvoiceeffect.CTVoiceEffectProcessor r0 = new com.facebook.cvat.ctvoiceeffect.CTVoiceEffectProcessor
            r0.<init>()
        L_0x013c:
            X.SFQ r1 = r11.A0C
            int r9 = r1.A04
            int r7 = r1.A01
            java.lang.Integer r1 = X.C9956RkB.A00
            X.SEV r6 = new X.SEV
            r6.<init>(r9, r7)
            X.RuN r1 = new X.RuN
            r1.<init>(r6, r6, r10)
            r0.configure(r1)
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            r1 = r16
            java.util.concurrent.ThreadPoolExecutor r29 = r1.A03(r9, r4)
            X.SrS r1 = new X.SrS
            r1.<init>(r8)
            goto L_0x0168
        L_0x015f:
            X.SrC r0 = new X.SrC
            r0.<init>()
            X.0qQ.A0A(r0)
            goto L_0x013c
        L_0x0168:
            X.SJL r23 = new X.SJL     // Catch:{ Exception -> 0x01cd }
            r23.<init>()     // Catch:{ Exception -> 0x01cd }
            X.RwQ r7 = new X.RwQ     // Catch:{ Exception -> 0x01cd }
            r7.<init>(r10, r4, r4, r15)     // Catch:{ Exception -> 0x01cd }
            java.lang.String r28 = r14.getPath()     // Catch:{ Exception -> 0x01cd }
            X.SrH r19 = new X.SrH     // Catch:{ Exception -> 0x01cd }
            r20 = r8
            r21 = r6
            r22 = r1
            r25 = r12
            r26 = r7
            r27 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Exception -> 0x01cd }
            X.Q1f r7 = new X.Q1f
            r7.<init>()
            X.Srz r6 = new X.Srz
            r6.<init>()
            X.SsN r10 = new X.SsN
            r10.<init>(r7, r6)
            X.Q0h r6 = X.Q12.A00
            X.Srl r7 = new X.Srl
            r7.<init>()
            r7.A00 = r6
            X.Tfu r6 = X.C9935Rjo.A00
            X.S30 r5 = X.S30.A00(r8, r1, r5, r7, r10)
            r5.A01 = r6
            X.RyG r22 = new X.RyG
            r24 = r19
            r26 = r4
            r23 = r0
            r25 = r4
            r22.<init>(r23, r24, r25, r26, r27)
            X.STM r0 = new X.STM
            r19 = r0
            r20 = r16
            r21 = r4
            r23 = r1
            r24 = r4
            r25 = r11
            r26 = r5
            r27 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            X.SAL.A01(r3, r0)
            goto L_0x01d5
        L_0x01cd:
            r1 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.String r0 = "Failed to create AudioEncoderOutputBufferConsumer for applying audio filter"
            r3.AEf(r0, r1)
        L_0x01d5:
            java.lang.String r3 = r14.getCanonicalPath()     // Catch:{ IOException -> 0x01e0 }
            r1 = r17
            r0 = r18
            r1.put(r0, r3)     // Catch:{ IOException -> 0x01e0 }
        L_0x01e0:
            android.net.Uri r5 = android.net.Uri.fromFile(r14)
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.T83.DAF(com.instagram.music.common.model.DownloadedTrack):void");
    }

    public T83(Context context, AudioFilterType audioFilterType, UserSession userSession, MusicAssetModel musicAssetModel, C53044Ghc ghc, int i, boolean z) {
        this.A05 = ghc;
        this.A03 = userSession;
        this.A01 = context;
        this.A02 = audioFilterType;
        this.A00 = i;
        this.A04 = musicAssetModel;
        this.A06 = z;
    }

    public final void DAH() {
        this.A05.A0M.Epw(AnonymousClass7TE.A0u());
    }
}
