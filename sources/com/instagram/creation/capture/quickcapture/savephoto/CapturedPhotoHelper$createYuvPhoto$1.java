package com.instagram.creation.capture.quickcapture.savephoto;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C352218Cl;
import X.C364678lo;
import X.C60340gF;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.YuvImage;
import com.instagram.common.session.UserSession;
import com.instagram.libyuv.IgYuvColorConverter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createYuvPhoto$1", f = "CapturedPhotoHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CapturedPhotoHelper$createYuvPhoto$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C352218Cl A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ byte[] A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CapturedPhotoHelper$createYuvPhoto$1(UserSession userSession, C352218Cl r3, String str, String str2, AnonymousClass4D7 r6, byte[] bArr, int i, int i2) {
        super(2, r6);
        this.A06 = bArr;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createYuvPhoto$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        byte[] bArr = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        return new CapturedPhotoHelper$createYuvPhoto$1(this.A02, this.A03, this.A04, this.A05, r11, bArr, i, i2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CapturedPhotoHelper$createYuvPhoto$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        byte[] bArr = this.A06;
        int i = this.A01;
        int i2 = this.A00;
        0qQ.A0B(bArr, 0);
        int i3 = i * i2;
        int i4 = i3 + 1;
        int i5 = i4 / 2;
        int i6 = i3 + i5;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i6);
        allocateDirect.put(bArr);
        allocateDirect.position(i3);
        ByteBuffer slice = allocateDirect.slice();
        allocateDirect.position((i4 / 4) + i3);
        ByteBuffer slice2 = allocateDirect.slice();
        allocateDirect.rewind();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i3);
        ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i5);
        0qQ.A0A(slice);
        int i7 = i / 2;
        0qQ.A0A(slice2);
        0qQ.A0A(allocateDirect2);
        0qQ.A0A(allocateDirect3);
        IgYuvColorConverter igYuvColorConverter = IgYuvColorConverter.INSTANCE;
        AnonymousClass7TF.A1D(slice, 2, slice2);
        AnonymousClass7TF.A1F(allocateDirect2, 6, allocateDirect3);
        if (!allocateDirect.isDirect()) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (!slice.isDirect()) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (!slice2.isDirect()) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (!allocateDirect2.isDirect()) {
            throw AnonymousClass7TE.A0z("Check failed.");
        } else if (allocateDirect3.isDirect()) {
            IgYuvColorConverter.nativeConvertI420ToNV21(allocateDirect, i, slice, i7, slice2, i7, allocateDirect2, i, allocateDirect3, i, i, i2);
            allocateDirect.put(allocateDirect2);
            allocateDirect.put(allocateDirect3);
            allocateDirect.rewind();
            byte[] bArr2 = new byte[i6];
            allocateDirect.get(bArr2);
            YuvImage yuvImage = new YuvImage(bArr2, 17, i, i2, (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 90, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            0qQ.A07(byteArray);
            String absolutePath = C364678lo.A04((Bitmap) null, this.A02, this.A04, this.A05, byteArray).getAbsolutePath();
            C352218Cl r0 = this.A03;
            r0.A0k = absolutePath;
            r0.A0D(absolutePath);
            return absolutePath;
        } else {
            throw AnonymousClass7TE.A0z("Check failed.");
        }
    }
}
