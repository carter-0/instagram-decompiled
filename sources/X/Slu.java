package X;

import android.media.MediaMetadataRetriever;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.google.common.collect.ImmutableList;

public final class Slu implements B2M {
    public final /* synthetic */ S3Y A00;

    public final void Dc0(Exception exc) {
        0qQ.A0B(exc, 0);
        S4B s4b = this.A00.A02;
        if (s4b != null) {
            s4b.A01(exc);
        }
    }

    public final void Dc2(A9S a9s) {
    }

    public Slu(S3Y s3y) {
        this.A00 = s3y;
    }

    public final void Dbz(A9S a9s) {
        String str;
        String str2;
        String str3;
        String str4;
        S3Y s3y = this.A00;
        if (s3y.A02 != null) {
            String str5 = s3y.A0D;
            String str6 = s3y.A0E;
            ImmutableList immutableList = s3y.A03;
            Long l = null;
            if (str6 != null) {
                long A0F = Pxf.A0F(str6);
                Long valueOf = Long.valueOf(A0F);
                if (A0F > 0) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    mediaMetadataRetriever.setDataSource(str6);
                    str2 = mediaMetadataRetriever.extractMetadata(18);
                    str3 = mediaMetadataRetriever.extractMetadata(19);
                    str4 = mediaMetadataRetriever.extractMetadata(20);
                    str = mediaMetadataRetriever.extractMetadata(9);
                    l = valueOf;
                } else {
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    l = valueOf;
                    str = null;
                }
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
            }
            Integer num = null;
            if (str2 != null) {
                try {
                    num = Pxf.A0Z(str2);
                } catch (NumberFormatException unused) {
                }
            }
            Integer num2 = null;
            if (str3 != null) {
                try {
                    num2 = Pxf.A0Z(str3);
                } catch (NumberFormatException unused2) {
                }
            }
            Integer num3 = null;
            if (str4 != null) {
                try {
                    num3 = Pxf.A0Z(str4);
                } catch (NumberFormatException unused3) {
                }
            }
            Float f = null;
            if (str != null) {
                try {
                    f = Float.valueOf(Float.parseFloat(str) * 0.001f);
                } catch (NumberFormatException unused4) {
                }
            }
            s3y.A01 = new SelfieEvidence(immutableList, f, num3, num2, num, l, str5, str6);
            S4B s4b = s3y.A02;
            0qQ.A0A(s4b);
            SelfieEvidence selfieEvidence = s3y.A01;
            0qQ.A0A(selfieEvidence);
            s4b.A00(selfieEvidence);
        }
    }
}
