package com.instagram.arlink.fragment;

import X.0dV;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C363848kR;
import X.C39708A5z;
import android.os.Bundle;
import com.facebook.react.modules.statusbar.StatusBarModule;
import java.nio.ByteBuffer;

public final class YUVImageData {
    public int A00;
    public int A01;
    public int A02;
    public Bundle A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;

    public YUVImageData(C363848kR r18) {
        int i;
        int i2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        int i3;
        int i4;
        int i5;
        C39708A5z[] a5zArr;
        0dV.A0C("arlink");
        C363848kR r3 = r18;
        int i6 = r3.A01;
        if (i6 == 1) {
            C39708A5z[] a5zArr2 = r3.A0B;
            if (a5zArr2 != null && a5zArr2.length == 1) {
                i = r3.A02;
                int i7 = r3.A00;
                ByteBuffer byteBuffer = a5zArr2[0].A02;
                if (byteBuffer != null) {
                    int i8 = i * i7;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i8);
                    int i9 = i8 / 4;
                    ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(i9);
                    ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(i9);
                    int i10 = a5zArr2[0].A01;
                    0qQ.A0A(allocateDirect);
                    0qQ.A0A(allocateDirect2);
                    i2 = i / 2;
                    0qQ.A0A(allocateDirect3);
                    nativeConvertARGBToI420(byteBuffer, i10, allocateDirect, i, allocateDirect2, i2, allocateDirect3, i2, i, i7);
                    byte[] bArr4 = new byte[allocateDirect.remaining()];
                    allocateDirect.get(bArr4);
                    byte[] bArr5 = new byte[allocateDirect2.remaining()];
                    allocateDirect2.get(bArr5);
                    byte[] bArr6 = new byte[allocateDirect3.remaining()];
                    allocateDirect3.get(bArr6);
                    bArr = bArr4;
                    bArr2 = bArr5;
                    bArr3 = bArr6;
                    i3 = i2;
                    i4 = i;
                    i5 = i7;
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i6 == 35 && (a5zArr = r3.A0B) != null && a5zArr.length == 3) {
            C39708A5z a5z = a5zArr[0];
            ByteBuffer byteBuffer2 = a5z.A02;
            if (byteBuffer2 != null) {
                bArr = new byte[byteBuffer2.remaining()];
                ByteBuffer byteBuffer3 = a5z.A02;
                if (byteBuffer3 != null) {
                    byteBuffer3.get(bArr);
                }
                i = a5z.A01;
                C39708A5z a5z2 = a5zArr[1];
                ByteBuffer byteBuffer4 = a5z2.A02;
                if (byteBuffer4 != null) {
                    bArr2 = new byte[byteBuffer4.remaining()];
                    ByteBuffer byteBuffer5 = a5z2.A02;
                    if (byteBuffer5 != null) {
                        byteBuffer5.get(bArr2);
                    }
                    i3 = a5z2.A01;
                    C39708A5z a5z3 = a5zArr[2];
                    ByteBuffer byteBuffer6 = a5z3.A02;
                    if (byteBuffer6 != null) {
                        bArr3 = new byte[byteBuffer6.remaining()];
                        ByteBuffer byteBuffer7 = a5z3.A02;
                        if (byteBuffer7 != null) {
                            byteBuffer7.get(bArr3);
                        }
                        i2 = a5z3.A01;
                        i4 = r3.A02;
                        i5 = r3.A00;
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            return;
        }
        A00(bArr, bArr2, bArr3, i, i3, i2, i4, i5);
    }

    private final native void nativeConvertARGBToI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, ByteBuffer byteBuffer4, int i4, int i5, int i6);

    private final void A00(byte[] bArr, byte[] bArr2, byte[] bArr3, int i, int i2, int i3, int i4, int i5) {
        this.A06 = bArr;
        this.A04 = bArr2;
        this.A05 = bArr3;
        this.A02 = i;
        this.A01 = i4;
        this.A00 = i5;
        Bundle A0a = AnonymousClass7TE.A0a();
        this.A03 = A0a;
        A0a.putByteArray("Y_DATA", bArr);
        Bundle bundle = this.A03;
        if (bundle != null) {
            bundle.putByteArray("U_DATA", bArr2);
        }
        Bundle bundle2 = this.A03;
        if (bundle2 != null) {
            bundle2.putByteArray("V_DATA", bArr3);
        }
        Bundle bundle3 = this.A03;
        if (bundle3 != null) {
            bundle3.putInt("Y_STRIDE", i);
        }
        Bundle bundle4 = this.A03;
        if (bundle4 != null) {
            bundle4.putInt("U_STRIDE", i2);
        }
        Bundle bundle5 = this.A03;
        if (bundle5 != null) {
            bundle5.putInt("V_STRIDE", i3);
        }
        Bundle bundle6 = this.A03;
        if (bundle6 != null) {
            bundle6.putInt("WIDTH", i4);
        }
        Bundle bundle7 = this.A03;
        if (bundle7 != null) {
            bundle7.putInt(StatusBarModule.HEIGHT_KEY, i5);
        }
    }
}
