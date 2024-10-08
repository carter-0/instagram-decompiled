package com.instagram.creation.capture.quickcapture.immersivemedia;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C352208Cj;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1", f = "PostCaptureImmersivePhotoViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostCaptureImmersivePhotoViewModel$enabled$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C352208Cj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PostCaptureImmersivePhotoViewModel$enabled$1(C352208Cj r2, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A03 = r2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        PostCaptureImmersivePhotoViewModel$enabled$1 postCaptureImmersivePhotoViewModel$enabled$1 = new PostCaptureImmersivePhotoViewModel$enabled$1(this.A03, (AnonymousClass4D7) obj4);
        postCaptureImmersivePhotoViewModel$enabled$1.A00 = obj;
        postCaptureImmersivePhotoViewModel$enabled$1.A01 = booleanValue;
        postCaptureImmersivePhotoViewModel$enabled$1.A02 = booleanValue2;
        return postCaptureImmersivePhotoViewModel$enabled$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        if (r7 != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003a, code lost:
        r3 = r8.A03;
        r2 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (r6 == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        r5 = r6.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        X.C366698pW.A00(r5, r2, (X.C279284yO) r3.A03.A08.A00, r3.A04.A0D(), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0059, code lost:
        return java.lang.Boolean.valueOf(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C39600A1q.A00(r3.A02, (X.C279284yO) r3.A03.A08.A00, r3.A04.A0D()) == false) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.0eS.A00(r9)
            java.lang.Object r6 = r8.A00
            X.8Cl r6 = (X.C352218Cl) r6
            boolean r1 = r8.A01
            boolean r7 = r8.A02
            r5 = 0
            if (r6 == 0) goto L_0x0037
            com.instagram.common.gallery.metadata.MediaUploadMetadata r0 = r6.A01()
            com.instagram.common.gallery.metadata.ImmersiveMediaFields r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0037
            if (r1 == 0) goto L_0x0037
            if (r7 == 0) goto L_0x0037
            X.8Cj r3 = r8.A03
            com.instagram.common.session.UserSession r2 = r3.A02
            X.8Yz r0 = r3.A03
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
            X.82o r0 = r3.A04
            boolean r0 = r0.A0D()
            boolean r0 = X.C39600A1q.A00(r2, r1, r0)
            r4 = 1
            if (r0 != 0) goto L_0x003a
        L_0x0037:
            r4 = 0
            if (r7 == 0) goto L_0x0055
        L_0x003a:
            X.8Cj r3 = r8.A03
            com.instagram.common.session.UserSession r2 = r3.A02
            if (r6 == 0) goto L_0x0044
            com.instagram.common.gallery.metadata.MediaUploadMetadata r5 = r6.A01()
        L_0x0044:
            X.8Yz r0 = r3.A03
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.4yO r1 = (X.C279284yO) r1
            X.82o r0 = r3.A04
            boolean r0 = r0.A0D()
            X.C366698pW.A00(r5, r2, r1, r0, r4)
        L_0x0055:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.immersivemedia.PostCaptureImmersivePhotoViewModel$enabled$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
