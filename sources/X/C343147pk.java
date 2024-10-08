package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.7pk  reason: invalid class name and case insensitive filesystem */
public final class C343147pk {
    public final double A00;
    public final double A01;
    public final double A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final int A0M;
    public final int A0N;
    public final int A0O;
    public final long A0P;
    public final long A0Q;
    public final long A0R;
    public final C343047pa A0S;
    public final C343047pa A0T;
    public final C343047pa A0U;
    public final C343047pa A0V;
    public final C343047pa A0W;
    public final String A0X;
    public final HashMap A0Y;
    public final List A0Z;
    public final List A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;
    public final boolean A0u;
    public final boolean A0v;
    public final boolean A0w;
    public final boolean A0x;
    public final boolean A0y;
    public final boolean A0z;
    public final boolean A10;
    public final boolean A11;
    public final boolean A12;
    public final boolean A13;
    public final boolean A14;
    public final boolean A15;
    public final boolean A16;
    public final boolean A17;
    public final boolean A18;
    public final boolean A19;
    public final boolean A1A;
    public final boolean A1B;
    public final boolean A1C;
    public final boolean A1D;
    public final boolean A1E;
    public final boolean A1F;
    public final boolean A1G;
    public final boolean A1H;
    public final boolean A1I;
    public final boolean A1J;
    public final boolean A1K;
    public final boolean A1L;
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final boolean A1X;
    public final boolean A1Y;
    public final boolean A1Z;
    public final boolean A1a;
    public final boolean A1b;
    public final boolean A1c;
    public final boolean A1d;
    public final boolean A1e;
    public final boolean A1f;
    public final boolean A1g;
    public final boolean A1h;
    public final boolean A1i;
    public final boolean A1j;
    public final boolean A1k;
    public final boolean A1l;
    public final float[] A1m;
    public final int[] A1n;
    public final int[] A1o;

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        if (this.A12) {
            sb.append("focusMode=");
            sb.append(this.A0C);
        }
        if (this.A1M) {
            sb.append("lensFocusDistance=");
            sb.append(this.A04);
        }
        if (this.A0j) {
            sb.append(",autoExposureEnabled=");
            sb.append(this.A0i);
        }
        if (this.A0b) {
            sb.append(",antibanding=");
            sb.append(this.A06);
        }
        if (this.A0t) {
            sb.append(",colorEffect=");
            sb.append(this.A08);
        }
        if (this.A0l) {
            sb.append(",autoExposureLock=");
            sb.append(this.A0k);
        }
        if (this.A0p) {
            sb.append(",autoWhiteBalanceLock=");
            sb.append(this.A0o);
        }
        if (this.A10) {
            sb.append(",flashMode=");
            sb.append(this.A0B);
        }
        if (this.A0w) {
            sb.append(",exposureCompensation=");
            sb.append(this.A0A);
        }
        if (this.A11) {
            sb.append(",focusAreas=");
            List list = this.A0Z;
            list.getClass();
            sb.append(C342717p3.A00(list));
        }
        if (this.A1J) {
            sb.append(",jpegQuality=");
            sb.append(this.A0E);
        }
        if (this.A1K) {
            sb.append(",jpegThumbnailQuality=");
            sb.append(this.A0F);
        }
        if (this.A1L) {
            sb.append(",jpegThumbnailSize=");
            C343047pa r1 = this.A0S;
            r1.getClass();
            sb.append(r1.A02);
            sb.append('x');
            sb.append(r1.A01);
        }
        if (this.A1O) {
            sb.append(",meteringAreas=");
            List list2 = this.A0a;
            list2.getClass();
            sb.append(C342717p3.A00(list2));
        }
        if (this.A1S) {
            sb.append(",pictureFormat=");
            sb.append(this.A0I);
        }
        if (this.A1T) {
            sb.append(",pictureSize=");
            C343047pa r12 = this.A0T;
            r12.getClass();
            sb.append(r12.A02);
            sb.append('x');
            sb.append(r12.A01);
        }
        if (this.A1k) {
            sb.append(",yuvPictureSize=");
            C343047pa r13 = this.A0W;
            r13.getClass();
            sb.append(r13.A02);
            sb.append('x');
            sb.append(r13.A01);
        }
        if (this.A1U) {
            sb.append(",previewFormat=");
            sb.append(this.A0J);
        }
        if (this.A1W) {
            sb.append(",previewFrameRate=");
            sb.append(this.A0K);
        }
        if (this.A1V) {
            sb.append(",previewFrameRateRange=");
            int[] iArr = this.A1o;
            iArr.getClass();
            sb.append(iArr[0]);
            sb.append('-');
            sb.append(iArr[1]);
        }
        if (this.A1X) {
            sb.append(",previewSize=");
            C343047pa r14 = this.A0U;
            r14.getClass();
            sb.append(r14.A02);
            sb.append('x');
            sb.append(r14.A01);
        }
        if (this.A1c) {
            sb.append(",sceneMode=");
            sb.append(this.A0L);
        }
        if (this.A1i) {
            sb.append(",videoStabilizationEnabled=");
            sb.append(this.A1h);
        }
        if (this.A1Z) {
            sb.append(",previewStabilizationEnabled=");
            sb.append(this.A1Y);
        }
        if (this.A1Q) {
            sb.append(",opticalStabilizationEnabled=");
            sb.append(this.A1P);
        }
        if (this.A1g) {
            sb.append(",videoSize=");
            C343047pa r15 = this.A0V;
            r15.getClass();
            sb.append(r15.A02);
            sb.append('x');
            sb.append(r15.A01);
        }
        if (this.A1j) {
            sb.append(",whiteBalance=");
            sb.append(this.A0N);
        }
        if (this.A1l) {
            sb.append(",zoom=");
            sb.append(this.A0O);
        }
        if (this.A1d) {
            sb.append(",smoothZoom=");
            sb.append(this.A05);
        }
        if (this.A1F) {
            sb.append(",hdrSceneModeEnabled=");
            sb.append(this.A1E);
        }
        if (this.A1b) {
            sb.append(",recordingHint=");
            sb.append(this.A1a);
        }
        if (this.A15) {
            sb.append(",gpsAltitude=");
            sb.append(this.A00);
        }
        if (this.A16) {
            sb.append(",gpsLatitude=");
            sb.append(this.A01);
        }
        if (this.A17) {
            sb.append(",gpsLongitude=");
            sb.append(this.A02);
        }
        if (this.A18) {
            sb.append(",gpsProcessingMethod=");
            sb.append(this.A0X);
        }
        if (this.A19) {
            sb.append(",gpsTimestamp=");
            sb.append(this.A0Q);
        }
        if (this.A1R) {
            sb.append(",photoRotation=");
            sb.append(this.A0H);
        }
        if (this.A1I) {
            sb.append(",isoSensitivity=");
            sb.append(this.A0D);
        }
        if (this.A0z) {
            sb.append(",exposureTime=");
            sb.append(this.A0P);
        }
        if (this.A0u) {
            sb.append(",control3aMode=");
            sb.append(this.A09);
        }
        if (this.A0c) {
            sb.append(",aperture=");
            sb.append(this.A03);
        }
        if (this.A0q) {
            sb.append(",colorCorrectionGains=");
            sb.append(this.A1m);
        }
        if (this.A0r) {
            sb.append(",colorCorrectionMode=");
            sb.append(this.A07);
        }
        if (this.A0s) {
            sb.append(",colorCorrectionTransform=");
            sb.append(this.A1n);
        }
        if (this.A14) {
            sb.append(",frameMetaDataEnabled=");
            sb.append(this.A13);
        }
        if (this.A0f) {
            sb.append(",arCoreEnabled=");
            sb.append(this.A0e);
        }
        if (this.A1N) {
            sb.append(",lowLightMode=");
            sb.append(this.A0G);
        }
        if (this.A1e) {
            sb.append(",streamUseCase=");
            sb.append(this.A0R);
        }
        if (this.A1B) {
            sb.append(",hdrHLG10CreationEnabled=");
            sb.append(this.A1A);
        }
        if (this.A1D) {
            sb.append(",hdrHLG10NativeVideoEnabled=");
            sb.append(this.A1C);
        }
        if (!this.A0v) {
            return sb.toString();
        }
        Object obj = null;
        obj.getClass();
        throw AnonymousClass00P.createAndThrow();
    }

    public C343147pk(C342757p7 r3) {
        this.A12 = r3.A12;
        this.A1M = r3.A1M;
        this.A0b = r3.A0b;
        this.A0t = r3.A0t;
        this.A0l = r3.A0l;
        this.A0p = r3.A0p;
        this.A10 = r3.A10;
        this.A0j = r3.A0j;
        this.A0w = r3.A0w;
        this.A11 = r3.A11;
        this.A1J = r3.A1J;
        this.A1K = r3.A1K;
        this.A1L = r3.A1L;
        this.A1O = r3.A1O;
        this.A1S = r3.A1S;
        this.A1T = r3.A1T;
        this.A1k = r3.A1k;
        this.A1U = r3.A1U;
        this.A1W = r3.A1W;
        this.A1V = r3.A1V;
        this.A1X = r3.A1X;
        this.A1c = r3.A1c;
        this.A1i = r3.A1i;
        this.A1Z = r3.A1Z;
        this.A1Q = r3.A1Q;
        this.A1g = r3.A1g;
        this.A1j = r3.A1j;
        this.A1l = r3.A1l;
        this.A1d = r3.A1d;
        this.A1F = r3.A1F;
        this.A1b = r3.A1b;
        this.A15 = r3.A15;
        this.A17 = r3.A17;
        this.A16 = r3.A16;
        this.A18 = r3.A18;
        this.A19 = r3.A19;
        this.A1R = r3.A1R;
        this.A1f = r3.A1f;
        this.A1I = r3.A1I;
        this.A0z = r3.A0z;
        this.A14 = r3.A14;
        this.A0f = r3.A0f;
        this.A0d = r3.A0d;
        this.A0y = r3.A0y;
        this.A0h = r3.A0h;
        this.A0u = r3.A0u;
        this.A0c = r3.A0c;
        this.A0q = r3.A0q;
        this.A0r = r3.A0r;
        this.A0s = r3.A0s;
        this.A0v = r3.A0v;
        this.A0n = r3.A0n;
        this.A1H = r3.A1H;
        this.A1N = r3.A1N;
        this.A1e = r3.A1e;
        this.A1B = r3.A1B;
        this.A1D = r3.A1D;
        this.A0C = r3.A0C;
        this.A04 = r3.A04;
        this.A06 = r3.A06;
        this.A08 = r3.A08;
        this.A0k = r3.A0k;
        this.A0o = r3.A0o;
        this.A0B = r3.A0B;
        this.A0i = r3.A0i;
        this.A0A = r3.A0A;
        this.A0Z = r3.A0Z;
        this.A0E = r3.A0E;
        this.A0F = r3.A0F;
        this.A0S = r3.A0S;
        this.A0a = r3.A0a;
        this.A0I = r3.A0I;
        this.A0T = r3.A0T;
        this.A0W = r3.A0W;
        this.A0J = r3.A0J;
        this.A0K = r3.A0K;
        this.A1o = r3.A1o;
        this.A0U = r3.A0U;
        this.A0L = r3.A0L;
        this.A1h = r3.A1h;
        this.A1Y = r3.A1Y;
        this.A1P = r3.A1P;
        this.A0V = r3.A0V;
        this.A0N = r3.A0N;
        this.A0O = r3.A0O;
        this.A05 = r3.A05;
        this.A1E = r3.A1E;
        this.A1a = r3.A1a;
        this.A00 = r3.A00;
        this.A02 = r3.A02;
        this.A01 = r3.A01;
        this.A0X = r3.A0X;
        this.A0Q = r3.A0Q;
        this.A0H = r3.A0H;
        this.A0M = r3.A0M;
        this.A0D = r3.A0D;
        this.A0P = r3.A0P;
        this.A09 = r3.A09;
        this.A13 = r3.A13;
        this.A0e = r3.A0e;
        this.A0Y = r3.A0Y;
        this.A0x = r3.A0x;
        this.A0g = r3.A0g;
        this.A03 = r3.A03;
        this.A1m = r3.A1m;
        this.A07 = r3.A07;
        this.A1n = r3.A1n;
        this.A0m = r3.A0m;
        this.A1G = r3.A1G;
        this.A0G = r3.A0G;
        this.A0R = r3.A0R;
        this.A1A = r3.A1A;
        this.A1C = r3.A1C;
    }
}
