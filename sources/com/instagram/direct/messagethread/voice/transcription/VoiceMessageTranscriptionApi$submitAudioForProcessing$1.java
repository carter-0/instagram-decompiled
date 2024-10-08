package com.instagram.direct.messagethread.voice.transcription;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass930;
import X.C3259374t;
import X.C60340gF;
import X.C66581MXm;
import X.C69239Nht;
import X.C70764OKk;
import com.meta.cal.AudioSession;
import java.util.zip.CRC32;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1", f = "VoiceMessageTranscriptionApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class VoiceMessageTranscriptionApi$submitAudioForProcessing$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ byte A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C3259374t A03;
    public final /* synthetic */ C70764OKk A04;
    public final /* synthetic */ byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VoiceMessageTranscriptionApi$submitAudioForProcessing$1(C3259374t r2, C70764OKk oKk, AnonymousClass4D7 r4, byte[] bArr, byte b, int i, int i2) {
        super(2, r4);
        this.A03 = r2;
        this.A04 = oKk;
        this.A01 = i;
        this.A02 = i2;
        this.A00 = b;
        this.A05 = bArr;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.messagethread.voice.transcription.VoiceMessageTranscriptionApi$submitAudioForProcessing$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        C3259374t r1 = this.A03;
        C70764OKk oKk = this.A04;
        int i = this.A01;
        int i2 = this.A02;
        return new VoiceMessageTranscriptionApi$submitAudioForProcessing$1(r1, oKk, r10, this.A05, this.A00, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((VoiceMessageTranscriptionApi$submitAudioForProcessing$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C3259374t r7 = this.A03;
        C70764OKk oKk = this.A04;
        int i = this.A01;
        C69239Nht A002 = C3259374t.A00(r7, oKk, i);
        AudioSession A012 = r7.A02(A002, this.A00, this.A02, i);
        if (A012 != null) {
            byte[] bArr = this.A05;
            AnonymousClass930 r0 = r7.A02;
            if (r0 != null) {
                r0.A00.markerPoint(331815788, i, "AUDIO_PROCESSING_START");
            }
            A012.submitAudioForProcessing(bArr);
            A012.complete();
            r7.A03.put(A002, A012);
        }
        CRC32 crc32 = new CRC32();
        crc32.update(this.A05);
        0qQ.A07(String.format("%x", C66581MXm.A1b(new Long(crc32.getValue()), 1)));
        return C60340gF.A00;
    }
}
