package X;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import java.net.URL;
import java.util.HashMap;

public final class SrT implements C13725Tfv {
    public C7233Q0e A00;
    public final C7235Q0h A01;
    public final C7259Q1i A02;

    /* JADX WARNING: type inference failed for: r0v16, types: [X.Tgv, java.lang.Object] */
    public final C7232Q0d AU7(Uri uri) {
        Exception e;
        C349257zq.A03("ExtendedVideoMetadataExtractor.extract");
        C7235Q0h q0h = this.A01;
        Uri uri2 = uri;
        if (q0h.A01()) {
            C7233Q0e q0e = this.A00;
            if (q0e == null) {
                q0e = new C7233Q0e(q0h);
                this.A00 = q0e;
            }
            try {
                C7232Q0d AU7 = q0e.AU7(uri2);
                C7232Q0d AU72 = this.A02.AU7(uri2);
                int i = AU7.A02;
                int i2 = AU7.A01;
                if (Build.VERSION.SDK_INT >= 30) {
                    i = AU72.A02;
                    i2 = AU72.A01;
                } else {
                    String path = uri2.getPath();
                    C266784aL.A05(path);
                    try {
                        Q4X A002 = Q4X.A00(new Object(), path);
                        if (A002 != null) {
                            i = A002.A02;
                            i2 = A002.A01;
                        }
                    } catch (Exception e2) {
                        0KC.A0F("MediaFormatUtil", "Exception while extracting video media format metadata:", e2);
                    }
                }
                long j = AU7.A07;
                int i3 = AU7.A05;
                int i4 = AU7.A03;
                int i5 = AU7.A04;
                long j2 = AU7.A06;
                long j3 = AU7.A08;
                int i6 = AU7.A00;
                SphericalMetadata sphericalMetadata = AU7.A09;
                String str = AU7.A0E;
                String str2 = AU7.A0C;
                String str3 = AU72.A0G;
                String str4 = AU72.A0F;
                String str5 = AU7.A0B;
                String str6 = AU7.A0A;
                boolean z = AU72.A0K;
                SphericalMetadata sphericalMetadata2 = sphericalMetadata;
                C7232Q0d q0d = new C7232Q0d(sphericalMetadata2, str, (String) null, str2, str3, str4, str5, str6, AU7.A0D, "VIDEO", (HashMap) null, i3, i4, i5, i, i2, i6, j, j2, j3, z);
                C349257zq.A01();
                return q0d;
            } catch (Exception e3) {
                e = e3;
            }
        } else {
            e = null;
            try {
                C7232Q0d AU73 = this.A02.AU7(uri2);
                C349257zq.A01();
                return AU73;
            } catch (Exception e4) {
                if (e != null) {
                    StackTraceElement[] stackTrace = e.getStackTrace();
                    throw Pxe.A0u(002.A18("Exception in ExtendedVideoMetadataExtractor: ", e.getMessage(), "\nstack trace: ", stackTrace[0].toString(), "\n", stackTrace[1].toString(), "\n", stackTrace[2].toString(), "\n"), e4);
                }
                throw Pxe.A0u("Exception in ExtendedVideoMetadataExtractor: ", e4);
            }
        }
    }

    public final C7232Q0d AU8(URL url) {
        C349257zq.A03("ExtendedVideoMetadataExtractor.extract");
        try {
            C7232Q0d AU8 = this.A02.AU8(url);
            C349257zq.A01();
            return AU8;
        } catch (Exception e) {
            throw Pxe.A0u("Exception in ExtendedVideoMetadataExtractor: ", e);
        }
    }

    public SrT(Context context, C7235Q0h q0h) {
        this.A01 = q0h;
        this.A02 = new C7259Q1i(context, false);
    }
}
