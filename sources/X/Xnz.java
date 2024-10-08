package X;

import android.media.CamcorderProfile;
import android.os.SystemClock;
import com.instagram.react.modules.base.IgReactQEModule;
import java.io.FileDescriptor;

public final class Xnz {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public long A09 = -1;
    public C21986Xoh A0A;
    public FileDescriptor A0B;
    public FileDescriptor A0C;
    public Integer A0D;
    public Integer A0E;
    public Integer A0F;
    public String A0G;
    public String A0H;
    public boolean A0I = true;

    public Xnz(FileDescriptor fileDescriptor, String str, int i, int i2, int i3, int i4) {
        if (str == null && fileDescriptor == null) {
            throw AnonymousClass7TE.A0w("Both file path or file descriptor must be not be null, one must be set.");
        } else if (i == 0) {
            throw AnonymousClass7TE.A0w("Frame width must be greater 0");
        } else if (i2 != 0) {
            this.A0G = str;
            this.A0B = fileDescriptor;
            this.A0H = null;
            this.A0C = null;
            this.A03 = i;
            this.A02 = i2;
            this.A04 = i3;
            this.A01 = i4;
        } else {
            throw AnonymousClass7TE.A0w("Frame height must be greater 0");
        }
    }

    public static C21986Xoh A00(CamcorderProfile camcorderProfile, Xnz xnz) {
        xnz.A01(C21986Xoh.A0N, Integer.valueOf(camcorderProfile.audioCodec));
        xnz.A01(C21986Xoh.A0Z, Integer.valueOf(camcorderProfile.videoCodec));
        xnz.A01(C21986Xoh.A0W, Long.valueOf(SystemClock.elapsedRealtime()));
        return new C21986Xoh(xnz);
    }

    public final void A01(XZ9 xz9, Object obj) {
        switch (xz9.A00) {
            case 6:
                this.A0I = ((Boolean) obj).booleanValue();
                return;
            case 7:
                this.A00 = AnonymousClass7TE.A0M(obj);
                return;
            case 8:
                this.A05 = AnonymousClass7TE.A0M(obj);
                return;
            case 9:
                this.A0D = (Integer) obj;
                return;
            case 10:
                this.A0E = (Integer) obj;
                return;
            case 11:
                this.A0F = (Integer) obj;
                return;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                this.A06 = AnonymousClass7TE.A0R(obj);
                return;
            case 13:
                this.A07 = AnonymousClass7TE.A0R(obj);
                return;
            case 14:
                this.A08 = AnonymousClass7TE.A0R(obj);
                return;
            case 15:
                this.A09 = AnonymousClass7TE.A0R(obj);
                return;
            default:
                this.A0A = (C21986Xoh) obj;
                return;
        }
    }
}
