package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createBitmapOrJpegPhoto$1;
import com.instagram.creation.capture.quickcapture.savephoto.CapturedPhotoHelper$createYuvPhoto$1;
import com.instagram.libyuv.IgYuvColorConverter;
import java.io.File;
import java.nio.ByteBuffer;

/* renamed from: X.8kT  reason: invalid class name and case insensitive filesystem */
public abstract class C363868kT {
    public static final C352218Cl A00(Context context, Bitmap bitmap, C363848kR r33, UserSession userSession, byte[] bArr, int i, int i2, boolean z) {
        C352218Cl r0;
        AnonymousClass19S A02;
        0sL capturedPhotoHelper$createBitmapOrJpegPhoto$1;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        Context context2 = context;
        0qQ.A0B(context2, 1);
        String A00 = C363878kU.A00(System.currentTimeMillis());
        0qQ.A07(A00);
        String A03 = 2RR.A03(userSession2, A00);
        String A022 = 2RR.A02(context2, false);
        long currentTimeMillis = System.currentTimeMillis();
        C363848kR r1 = r33;
        int i3 = i;
        int i4 = i2;
        boolean z2 = z;
        if (r1 != null) {
            r0 = new C352218Cl((File) null, i3, i4, currentTimeMillis, currentTimeMillis, z2);
            A02 = 19E.A02(AnonymousClass12T.A00.CO6(159047438, 3));
            C39708A5z[] a5zArr = r1.A0B;
            if (a5zArr != null) {
                C39708A5z a5z = a5zArr[0];
                ByteBuffer byteBuffer = a5z.A02;
                if (byteBuffer != null) {
                    byteBuffer.rewind();
                    C39708A5z a5z2 = a5zArr[1];
                    ByteBuffer byteBuffer2 = a5z2.A02;
                    if (byteBuffer2 != null) {
                        byteBuffer2.rewind();
                        C39708A5z a5z3 = a5zArr[2];
                        ByteBuffer byteBuffer3 = a5z3.A02;
                        if (byteBuffer3 != null) {
                            byteBuffer3.rewind();
                            int i5 = r1.A02;
                            int i6 = r1.A00;
                            int i7 = i5 * i6;
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i7);
                            int i8 = i7 / 4;
                            ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i8);
                            ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i8);
                            int i9 = a5z.A01;
                            int i10 = a5z2.A01;
                            int i11 = a5z3.A01;
                            int i12 = a5z2.A00;
                            0qQ.A0A(allocateDirect);
                            0qQ.A0A(allocateDirect2);
                            int i13 = i5 / 2;
                            0qQ.A0A(allocateDirect3);
                            IgYuvColorConverter igYuvColorConverter = IgYuvColorConverter.INSTANCE;
                            0qQ.A0B(allocateDirect, 7);
                            0qQ.A0B(allocateDirect2, 9);
                            0qQ.A0B(allocateDirect3, 11);
                            if (!byteBuffer.isDirect()) {
                                throw new IllegalStateException("Check failed.");
                            } else if (!byteBuffer2.isDirect()) {
                                throw new IllegalStateException("Check failed.");
                            } else if (!byteBuffer3.isDirect()) {
                                throw new IllegalStateException("Check failed.");
                            } else if (!allocateDirect.isDirect()) {
                                throw new IllegalStateException("Check failed.");
                            } else if (!allocateDirect2.isDirect()) {
                                throw new IllegalStateException("Check failed.");
                            } else if (allocateDirect3.isDirect()) {
                                int i14 = i11;
                                int i15 = i12;
                                int i16 = i10;
                                ByteBuffer byteBuffer4 = byteBuffer3;
                                int i17 = i9;
                                ByteBuffer byteBuffer5 = byteBuffer2;
                                ByteBuffer byteBuffer6 = byteBuffer;
                                IgYuvColorConverter.nativeConvertAndroid420ToI420(byteBuffer6, i17, byteBuffer5, i16, byteBuffer4, i14, i15, allocateDirect, i5, allocateDirect2, i13, allocateDirect3, i13, i5, i6);
                                int remaining = allocateDirect.remaining() + allocateDirect2.remaining() + allocateDirect3.remaining();
                                ByteBuffer allocate = ByteBuffer.allocate(remaining);
                                allocate.put(allocateDirect);
                                allocate.put(allocateDirect2);
                                allocate.put(allocateDirect3);
                                allocate.rewind();
                                byte[] bArr2 = new byte[remaining];
                                allocate.get(bArr2);
                                r0.A1B = bArr2;
                                capturedPhotoHelper$createBitmapOrJpegPhoto$1 = new CapturedPhotoHelper$createYuvPhoto$1(userSession2, r0, A022, A03, (AnonymousClass4D7) null, bArr2, i3, i4);
                            } else {
                                throw new IllegalStateException("Check failed.");
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            r0 = new C352218Cl((File) null, i3, i4, currentTimeMillis, currentTimeMillis, z2);
            A02 = 19E.A02(AnonymousClass12T.A00.CO6(159047438, 3));
            capturedPhotoHelper$createBitmapOrJpegPhoto$1 = new CapturedPhotoHelper$createBitmapOrJpegPhoto$1(bitmap, userSession2, r0, A022, A03, (AnonymousClass4D7) null, bArr);
        }
        r0.A0u = 1Eo.A01(AnonymousClass05K.A00, 19B.A00, capturedPhotoHelper$createBitmapOrJpegPhoto$1, A02);
        return r0;
    }
}
