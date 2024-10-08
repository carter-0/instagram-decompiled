package com.instagram.direct.messagethread.voice.transcription;

import X.0sL;
import X.1Xj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C3259374t;
import X.C60340gF;
import X.C70764OKk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1", f = "VoiceMessageTranscriptionApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceMessageTranscriptionApi$startTranscription$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C3259374t A01;
    public final /* synthetic */ C70764OKk A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionApi$startTranscription$1(C3259374t r2, C70764OKk oKk, 1Xj r4, String str, AnonymousClass4D7 r6, int i) {
        super(2, r6);
        this.A01 = r2;
        this.A02 = oKk;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        return new VoiceMessageTranscriptionApi$startTranscription$1(this.A01, this.A02, this.A03, this.A04, r9, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageTranscriptionApi$startTranscription$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bd, code lost:
        if (r1 == null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x015c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        X.1zE.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0160, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0183 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.0eS.A00(r20)
            r7 = r19
            X.74t r4 = r7.A01
            com.meta.cal.AudioSessionFactory r0 = r4.A00
            if (r0 != 0) goto L_0x0010
            X.C3259374t.A04(r4)
        L_0x0010:
            com.meta.cal.AudioSessionFactory r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x01c5
            boolean r0 = r0.isOk()
            if (r0 != r5) goto L_0x01c5
            java.lang.String r6 = r7.A04
            X.1Xj r2 = r7.A03
            int r3 = r7.A00
            X.930 r15 = r4.A02
            if (r15 == 0) goto L_0x0031
            X.02m r8 = r15.A00
            java.lang.String r1 = "FILE_LOAD_START"
            r0 = 331815788(0x13c71b6c, float:5.0261703E-27)
            r8.markerPoint(r0, r3, r1)
        L_0x0031:
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            r13 = 0
            if (r6 != 0) goto L_0x017f
            java.lang.String r8 = "VoiceMessageTranscription"
            r6 = 0
            if (r2 != 0) goto L_0x00f6
            java.lang.String r0 = "No local file path or media provided."
        L_0x003e:
            X.0KC.A0C(r8, r0)
        L_0x0041:
            X.OKk r1 = r7.A02
            if (r6 != 0) goto L_0x0051
            java.lang.String r0 = "Error loading file."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            r1.A00(r0)
        L_0x004e:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0051:
            X.B07 r7 = new X.B07
            r7.<init>(r3, r5, r1, r4)
            r0 = 12
            X.TTH r2 = new X.TTH
            r2.<init>(r1, r0)
            r12 = 0
            if (r15 == 0) goto L_0x006a
            X.02m r4 = r15.A00
            java.lang.String r1 = "AUDIO_DECODE_START"
            r0 = 331815788(0x13c71b6c, float:5.0261703E-27)
            r4.markerPoint(r0, r3, r1)
        L_0x006a:
            android.media.MediaExtractor r14 = new android.media.MediaExtractor
            r14.<init>()
            r14.setDataSource(r6)     // Catch:{ FileNotFoundException | IOException -> 0x0073 }
            goto L_0x0075
        L_0x0073:
            r1 = move-exception
            goto L_0x00b0
        L_0x0075:
            int r8 = r14.getTrackCount()
            r10 = 0
            r6 = 0
            if (r8 < 0) goto L_0x00a4
            r4 = 0
        L_0x007e:
            android.media.MediaFormat r10 = r14.getTrackFormat(r4)
            java.lang.String r0 = "mime"
            java.lang.String r1 = r10.getString(r0)
            if (r1 != 0) goto L_0x008d
            java.lang.String r1 = "empty"
        L_0x008d:
            java.lang.String r0 = "audio"
            boolean r0 = X.C66580MXl.A1a(r0, r5, r1)
            if (r0 == 0) goto L_0x00d0
            r14.selectTrack(r4)
            java.lang.String r0 = "channel-count"
            r10.getInteger(r0)
            java.lang.String r0 = "sample-rate"
            r10.getInteger(r0)
            r6 = 1
        L_0x00a4:
            boolean r0 = X.C66581MXm.A1a(r6)
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "No audio track found in the media."
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r0)
        L_0x00b0:
            r2.invoke(r1)
            goto L_0x004e
        L_0x00b4:
            if (r10 == 0) goto L_0x00bf
            java.lang.String r0 = "mime"
            java.lang.String r1 = r10.getString(r0)     // Catch:{ IOException -> 0x00c9 }
            if (r1 != 0) goto L_0x00c1
        L_0x00bf:
            java.lang.String r1 = "audio/mp4a-latm"
        L_0x00c1:
            r0 = 1517984777(0x5a7a9c09, float:1.76350767E16)
            android.media.MediaCodec r8 = X.0fX.A01(r1, r0)     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00d5
        L_0x00c9:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            goto L_0x00b0
        L_0x00d0:
            if (r4 == r8) goto L_0x00a4
            int r4 = r4 + 1
            goto L_0x007e
        L_0x00d5:
            X.0qQ.A0A(r8)
            X.Q6f r13 = new X.Q6f
            r18 = r3
            r16 = r2
            r17 = r7
            r13.<init>(r14, r15, r16, r17, r18)
            r8.setCallback(r13)
            r9 = 0
            r13 = 1451550514(0x5684e732, float:7.3064256E13)
            r11 = r9
            X.0fX.A07(r8, r9, r10, r11, r12, r13)
            r0 = -183295760(0xfffffffff51320f0, float:-1.8650774E32)
            X.0fX.A05(r8, r0)
            goto L_0x004e
        L_0x00f6:
            X.3WR r0 = r2.A2C()
            X.57m r0 = r0.A07
            if (r0 == 0) goto L_0x0110
            X.16c r0 = X.AnonymousClass3OT.A00(r0)
            X.57m r0 = (X.C2814057m) r0
            if (r0 == 0) goto L_0x0110
            java.lang.String r1 = r0.Ado()
        L_0x010a:
            if (r1 != 0) goto L_0x0112
            java.lang.String r0 = "Audio URL not found."
            goto L_0x003e
        L_0x0110:
            r1 = 0
            goto L_0x010a
        L_0x0112:
            X.0eM r0 = r4.A04     // Catch:{ IOException -> 0x0169 }
            r0.getValue()     // Catch:{ IOException -> 0x0169 }
            com.instagram.common.session.UserSession r11 = r4.A01     // Catch:{ IOException -> 0x0169 }
            int r0 = X.C353648In.A00     // Catch:{ IOException -> 0x0169 }
            r0 = 2
            X.0qQ.A0B(r11, r0)     // Catch:{ IOException -> 0x0169 }
            X.16e r0 = X.AnonymousClass2hY.A09     // Catch:{ IOException -> 0x0169 }
            X.2hY r12 = r0.E1h(r1)     // Catch:{ IOException -> 0x0169 }
            X.1QT r1 = new X.1QT     // Catch:{ IOException -> 0x0169 }
            r1.<init>()     // Catch:{ IOException -> 0x0169 }
            X.1CE r0 = X.1CE.A08     // Catch:{ IOException -> 0x0169 }
            r1.A04 = r0     // Catch:{ IOException -> 0x0169 }
            X.1Fe r0 = X.1Fe.A02     // Catch:{ IOException -> 0x0169 }
            r1.A03 = r0     // Catch:{ IOException -> 0x0169 }
            X.1QU r9 = r1.A00()     // Catch:{ IOException -> 0x0169 }
            java.lang.String r1 = "-audio"
            java.lang.String r0 = ".mp4"
            java.lang.String r0 = X.AnonymousClass457.A0D(r1, r0)     // Catch:{ IOException -> 0x0169 }
            java.io.File r10 = X.AnonymousClass7TE.A0t(r0)     // Catch:{ IOException -> 0x0169 }
            X.14G r0 = X.14G.A03()     // Catch:{ IOException -> 0x0161 }
            X.47Y r9 = r0.A08(r9, r12, r11)     // Catch:{ IOException -> 0x0161 }
            X.1Qb r1 = r9.A02     // Catch:{ all -> 0x015a }
            java.io.InputStream r0 = r1.AjD()     // Catch:{ all -> 0x015a }
            X.0mb.A09(r10, r0)     // Catch:{ all -> 0x015a }
            r1.AJg()     // Catch:{ all -> 0x015a }
            r9.close()     // Catch:{ IOException -> 0x0161 }
            goto L_0x0170
        L_0x015a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015c }
        L_0x015c:
            r0 = move-exception
            X.1zE.A00(r9, r1)     // Catch:{ IOException -> 0x0161 }
            throw r0     // Catch:{ IOException -> 0x0161 }
        L_0x0161:
            r1 = move-exception
            java.lang.String r0 = "AudioDownloadingUtil - download failed"
            java.io.IOException r0 = X.Pxe.A0c(r0, r1)     // Catch:{ IOException -> 0x0169 }
            throw r0     // Catch:{ IOException -> 0x0169 }
        L_0x0169:
            r1 = move-exception
            java.lang.String r0 = "Error downloading audio file"
            X.0KC.A0F(r8, r0, r1)
            r10 = 0
        L_0x0170:
            if (r10 == 0) goto L_0x0176
            java.lang.String r6 = r10.getPath()
        L_0x0176:
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            if (r10 == 0) goto L_0x017f
            long r9 = r10.length()
            goto L_0x0181
        L_0x017f:
            r9 = 0
        L_0x0181:
            if (r15 == 0) goto L_0x0041
            if (r2 == 0) goto L_0x0197
            X.1Xy r0 = r2.A0C
            com.instagram.feed.audio.AudioIntf r0 = r0.AdR()
            if (r0 == 0) goto L_0x0197
            java.lang.Long r0 = r0.AzI()
            if (r0 == 0) goto L_0x0197
            long r13 = r0.longValue()
        L_0x0197:
            X.02m r8 = r15.A00
            java.lang.String r1 = "FILE_LOCATION"
            int r0 = r11.intValue()
            if (r0 == 0) goto L_0x01c2
            java.lang.String r0 = "REMOTE"
        L_0x01a3:
            r2 = 331815788(0x13c71b6c, float:5.0261703E-27)
            r8.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r1 = "FILE_SIZE_BYTES"
            java.lang.String r0 = java.lang.String.valueOf(r9)
            r8.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r1 = "DURATION_MS"
            java.lang.String r0 = java.lang.String.valueOf(r13)
            r8.markerAnnotate(r2, r3, r1, r0)
            java.lang.String r0 = "FILE_LOAD_END"
            r8.markerPoint(r2, r3, r0)
            goto L_0x0041
        L_0x01c2:
            java.lang.String r0 = "LOCAL"
            goto L_0x01a3
        L_0x01c5:
            X.OKk r2 = r7.A02
            com.meta.cal.AudioSessionFactory r0 = r4.A00
            r1 = 0
            if (r0 == 0) goto L_0x01d8
            com.meta.cal.AudioSessionFactoryError r0 = r0.error()
            if (r0 == 0) goto L_0x01d8
            java.lang.String r1 = r0.toString()
        L_0x01d8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            r2.A00(r0)
            r4.A00 = null
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$startTranscription$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
