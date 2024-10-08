package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;

public final class RAT extends 0ng {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C387389m8 A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RAT(C387389m8 r4, String str, int i, int i2) {
        super(82, 2, false, false);
        this.A02 = r4;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = str;
    }

    public final void run() {
        SOH soh;
        boolean z;
        int i;
        C387389m8 r3 = this.A02;
        try {
            soh = new SOH(0fX.A02("video/avc", 286193318), r3.A04, r3.A0F);
            int i2 = this.A01;
            int i3 = this.A00;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i2, i3);
            createVideoFormat.setInteger(TraceFieldType.Bitrate, (int) (((double) (i2 * i3 * 20 * 4)) * 0.07d));
            createVideoFormat.setInteger("i-frame-interval", 3);
            createVideoFormat.setInteger("max-input-size", 0);
            int codecCount = MediaCodecList.getCodecCount();
            int i4 = 0;
            while (true) {
                if (i4 >= codecCount) {
                    break;
                }
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i4);
                if (codecInfoAt.isEncoder()) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i5 = 0;
                    while (i5 < length) {
                        if (supportedTypes[i5].equalsIgnoreCase("video/avc")) {
                            int[] iArr = codecInfoAt.getCapabilitiesForType("video/avc").colorFormats;
                            iArr.getClass();
                            int length2 = iArr.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= length2) {
                                    break;
                                }
                                i = iArr[i6];
                                if (i == 19 || i == 21) {
                                    createVideoFormat.setInteger("color-format", i);
                                    soh.A00 = Integer.valueOf(i);
                                    int i7 = SOH.A06;
                                } else {
                                    i6++;
                                }
                            }
                            createVideoFormat.setInteger("color-format", i);
                            soh.A00 = Integer.valueOf(i);
                            int i72 = SOH.A06;
                            if (i72 == 0) {
                                int[] iArr2 = SOH.A07;
                                int i8 = 0;
                                while (true) {
                                    int i9 = iArr2[i8];
                                    createVideoFormat.setInteger("frame-rate", i9);
                                    try {
                                        0fX.A07(soh.A01, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, 389405912);
                                        SOH.A06 = i9;
                                        break;
                                    } catch (RuntimeException unused) {
                                        i8++;
                                        if (i8 >= 3) {
                                            z = false;
                                            11Z.A03(new C41209Aq7(soh, this, this.A03, z));
                                        }
                                    }
                                }
                            } else {
                                createVideoFormat.setInteger("frame-rate", i72);
                                0fX.A07(soh.A01, (MediaCrypto) null, createVideoFormat, (Surface) null, 1, -791738342);
                            }
                            z = true;
                        } else {
                            i5++;
                        }
                    }
                    continue;
                }
                i4++;
            }
        } catch (Exception e) {
            0kD.A0B("BoomerangCaptureController", "Could not create Boomerang encoder", e);
            0KC.A0F("BoomerangCaptureController", "Could not create Boomerang encoder", e);
            soh = null;
        }
        11Z.A03(new C41209Aq7(soh, this, this.A03, z));
    }
}
