package com.instagram.creation.capture.quickcapture.savephoto;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C352218Cl;
import X.C364678lo;
import X.C60340gF;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createBitmapOrJpegPhoto$1", f = "CapturedPhotoHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CapturedPhotoHelper$createBitmapOrJpegPhoto$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C352218Cl A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapturedPhotoHelper$createBitmapOrJpegPhoto$1(Bitmap bitmap, UserSession userSession, C352218Cl r4, String str, String str2, AnonymousClass4D7 r7, byte[] bArr) {
        super(2, r7);
        this.A01 = userSession;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = bitmap;
        this.A05 = bArr;
        this.A02 = r4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createBitmapOrJpegPhoto$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        UserSession userSession = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        return new CapturedPhotoHelper$createBitmapOrJpegPhoto$1(this.A00, userSession, this.A02, str, str2, r10, this.A05);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CapturedPhotoHelper$createBitmapOrJpegPhoto$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        String absolutePath = C364678lo.A04(this.A00, this.A01, this.A03, this.A04, this.A05).getAbsolutePath();
        C352218Cl r0 = this.A02;
        r0.A0k = absolutePath;
        r0.A0D(absolutePath);
        return absolutePath;
    }
}
