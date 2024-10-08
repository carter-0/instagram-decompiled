package X;

import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileDescriptor;

/* renamed from: X.Xoh  reason: case insensitive filesystem */
public final class C21986Xoh {
    public static final C382589dw A0J = new XZ9(5);
    public static final C382589dw A0K = new XZ9(3);
    public static final C382589dw A0L = new XZ9(2);
    public static final C382589dw A0M = new XZ9(4);
    public static final XZ9 A0N = new XZ9(7);
    public static final XZ9 A0O = new XZ9(9);
    public static final XZ9 A0P = new XZ9(10);
    public static final XZ9 A0Q = new XZ9(11);
    public static final XZ9 A0R = new XZ9(16);
    public static final XZ9 A0S = new XZ9(0);
    public static final XZ9 A0T = new XZ9(6);
    public static final XZ9 A0U = new XZ9(17);
    public static final XZ9 A0V = new XZ9(12);
    public static final XZ9 A0W = new XZ9(13);
    public static final XZ9 A0X = new XZ9(14);
    public static final XZ9 A0Y = new XZ9(15);
    public static final XZ9 A0Z = new XZ9(8);
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C21986Xoh A0A;
    public final FileDescriptor A0B;
    public final FileDescriptor A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final String A0G;
    public final String A0H;
    public final boolean A0I;

    public final Integer A00(C382589dw r3) {
        int i;
        int i2 = r3.A00;
        if (i2 == 2) {
            i = this.A07;
        } else if (i2 == 3) {
            i = this.A06;
        } else if (i2 != 4) {
            i = this.A05;
        } else {
            i = this.A08;
        }
        return Integer.valueOf(i);
    }

    public final Object A01(XZ9 xz9) {
        long j;
        int i = xz9.A00;
        if (i == 0) {
            return this.A0G;
        }
        if (i == 1) {
            return this.A0B;
        }
        switch (i) {
            case 6:
                return Boolean.valueOf(this.A0I);
            case 7:
                return Integer.valueOf(this.A04);
            case 8:
                return Integer.valueOf(this.A09);
            case 9:
                return this.A0D;
            case 10:
                return this.A0E;
            case 11:
                return this.A0F;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                j = this.A00;
                break;
            case 13:
                j = this.A01;
                break;
            case 14:
                j = this.A02;
                break;
            case 15:
                j = this.A03;
                break;
            case 16:
                return this.A0A;
            case 17:
                return this.A0H;
            default:
                throw new RuntimeException(002.A0O("Invalid required video capture result key: ", i));
        }
        return Long.valueOf(j);
    }

    public final void A02(XZ9 xz9, Object obj) {
        String str;
        String str2;
        switch (xz9.A00) {
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                if (this.A00 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start request time was already set, cannot set it again";
                    break;
                } else {
                    this.A00 = AnonymousClass7TE.A0R(obj);
                    return;
                }
            case 13:
                if (this.A01 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Start time was already set, cannot set it again";
                    break;
                } else {
                    this.A01 = AnonymousClass7TE.A0R(obj);
                    return;
                }
            case 14:
                if (this.A02 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop request time was already set, cannot set it again";
                    break;
                } else {
                    this.A02 = AnonymousClass7TE.A0R(obj);
                    return;
                }
            default:
                if (this.A03 != -1) {
                    str = "VideoCaptureRequest";
                    str2 = "Stop time was already set, cannot set it again";
                    break;
                } else {
                    this.A03 = AnonymousClass7TE.A0R(obj);
                    return;
                }
        }
        C340577lU.A02(str, str2);
    }

    public C21986Xoh(Xnz xnz) {
        String str = xnz.A0G;
        if (str == null && xnz.A0B == null) {
            throw AnonymousClass7TE.A0w("one of file path or FileDescriptor must be set");
        }
        this.A0G = str;
        this.A0B = xnz.A0B;
        this.A0H = xnz.A0H;
        this.A0C = xnz.A0C;
        this.A07 = xnz.A03;
        this.A06 = xnz.A02;
        this.A08 = xnz.A04;
        this.A05 = xnz.A01;
        this.A0I = xnz.A0I;
        this.A04 = xnz.A00;
        this.A09 = xnz.A05;
        this.A0D = xnz.A0D;
        this.A0E = xnz.A0E;
        this.A0F = xnz.A0F;
        this.A00 = xnz.A06;
        this.A01 = xnz.A07;
        this.A02 = xnz.A08;
        this.A03 = xnz.A09;
        this.A0A = xnz.A0A;
    }
}
