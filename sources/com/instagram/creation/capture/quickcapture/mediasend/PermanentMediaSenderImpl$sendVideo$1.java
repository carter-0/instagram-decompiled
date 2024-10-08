package com.instagram.creation.capture.quickcapture.mediasend;

import X.0sL;
import X.1pK;
import X.A6R;
import X.AnonymousClass1Ek;
import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass8K7;
import X.C381779cJ;
import X.C53401GnY;
import X.C60340gF;
import X.LD4;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1", f = "PermanentMediaSenderImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PermanentMediaSenderImpl$sendVideo$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1pK A02;
    public final /* synthetic */ AnonymousClass8K7 A03;
    public final /* synthetic */ LD4 A04;
    public final /* synthetic */ C381779cJ A05;
    public final /* synthetic */ A6R A06;
    public final /* synthetic */ AnonymousClass3Q2 A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermanentMediaSenderImpl$sendVideo$1(C53401GnY gnY, UserSession userSession, 1pK r4, AnonymousClass8K7 r5, LD4 ld4, C381779cJ r7, A6R a6r, AnonymousClass3Q2 r9, String str, AnonymousClass4D7 r11) {
        super(2, r11);
        this.A02 = r4;
        this.A01 = userSession;
        this.A08 = str;
        this.A07 = r9;
        this.A04 = ld4;
        this.A05 = r7;
        this.A06 = a6r;
        this.A00 = gnY;
        this.A03 = r5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        1pK r3 = this.A02;
        UserSession userSession = this.A01;
        String str = this.A08;
        AnonymousClass3Q2 r8 = this.A07;
        return new PermanentMediaSenderImpl$sendVideo$1(this.A00, userSession, r3, this.A03, this.A04, this.A05, this.A06, r8, str, r13);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PermanentMediaSenderImpl$sendVideo$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r6 = r7;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        r8.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x007e, code lost:
        r6 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0082, code lost:
        r6 = r7;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0086, code lost:
        r0 = r6;
        r6 = r7;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0079 A[ExcHandler: all (r0v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0012] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.0eS.A00(r18)
            r2 = r17
            X.1pK r11 = r2.A02
            com.instagram.common.session.UserSession r10 = r2.A01
            java.lang.String r9 = r2.A08
            android.media.MediaMetadataRetriever r8 = new android.media.MediaMetadataRetriever
            r8.<init>()
            r4 = 0
            r6 = 0
            r8.setDataSource(r9)     // Catch:{ IllegalArgumentException -> 0x007f, all -> 0x0079 }
            r0 = 9
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x007f, all -> 0x0079 }
            if (r0 == 0) goto L_0x0028
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ IllegalArgumentException -> 0x007f, all -> 0x0079 }
            if (r0 == 0) goto L_0x0028
            int r7 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x007f, all -> 0x0079 }
            goto L_0x0029
        L_0x0028:
            r7 = 0
        L_0x0029:
            r0 = 18
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x007e, all -> 0x0079 }
            if (r0 == 0) goto L_0x003c
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ IllegalArgumentException -> 0x007e, all -> 0x0079 }
            if (r0 == 0) goto L_0x003c
            int r5 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x007e, all -> 0x0079 }
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            r0 = 19
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x0082, all -> 0x0079 }
            if (r0 == 0) goto L_0x0050
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ IllegalArgumentException -> 0x0082, all -> 0x0079 }
            if (r0 == 0) goto L_0x0050
            int r3 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0082, all -> 0x0079 }
            goto L_0x0051
        L_0x0050:
            r3 = 0
        L_0x0051:
            r0 = 24
            java.lang.String r0 = r8.extractMetadata(r0)     // Catch:{ IllegalArgumentException -> 0x0076, all -> 0x0079 }
            if (r0 == 0) goto L_0x0063
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ IllegalArgumentException -> 0x0076, all -> 0x0079 }
            if (r0 == 0) goto L_0x0063
            int r6 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0076, all -> 0x0079 }
        L_0x0063:
            android.graphics.Bitmap r1 = X.AIQ.A01(r8)     // Catch:{ all -> 0x0068 }
            goto L_0x006e
        L_0x0068:
            r0 = move-exception
            X.0eQ r1 = new X.0eQ     // Catch:{ IllegalArgumentException -> 0x0086, all -> 0x0079 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x0086, all -> 0x0079 }
        L_0x006e:
            boolean r0 = r1 instanceof X.0eQ     // Catch:{ IllegalArgumentException -> 0x0086, all -> 0x0079 }
            if (r0 == 0) goto L_0x0073
            r1 = r4
        L_0x0073:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1     // Catch:{ IllegalArgumentException -> 0x0086, all -> 0x0079 }
            goto L_0x008e
        L_0x0076:
            r6 = r7
            r0 = 0
            goto L_0x0088
        L_0x0079:
            r0 = move-exception
            r8.release()
            throw r0
        L_0x007e:
            r6 = r7
        L_0x007f:
            r0 = 0
            r5 = 0
            goto L_0x0084
        L_0x0082:
            r6 = r7
            r0 = 0
        L_0x0084:
            r3 = 0
            goto L_0x0088
        L_0x0086:
            r0 = r6
            r6 = r7
        L_0x0088:
            r8.release()
            r7 = r6
            r6 = r0
            goto L_0x0092
        L_0x008e:
            r8.release()
            r4 = r1
        L_0x0092:
            java.io.File r1 = X.AnonymousClass7TE.A0t(r9)
            r0 = 3
            com.instagram.common.gallery.Medium r9 = X.C282665Eg.A03(r1, r0, r7)
            r9.A04 = r3
            r9.A0B = r5
            r9.A07 = r6
            if (r4 == 0) goto L_0x00b5
            r1 = 1
            java.io.File r0 = X.AnonymousClass45F.A00()
            X.AEI.A02(r4, r0, r1)
            java.lang.String r0 = r0.getCanonicalPath()
            r9.A0a = r0
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r9.A0G
            r0.A0B = r1
        L_0x00b5:
            X.3Q2 r0 = r2.A07
            X.LD4 r13 = r2.A04
            X.9cJ r14 = r2.A05
            X.A6R r15 = r2.A06
            X.GnY r8 = r2.A00
            X.8K7 r12 = r2.A03
            X.Aqz r7 = new X.Aqz
            r16 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.11Z.A02(r7)
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.mediasend.PermanentMediaSenderImpl$sendVideo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
