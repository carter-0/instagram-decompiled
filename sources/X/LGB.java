package X;

import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;

public final class LGB {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final WebPEncoderImpl A04;
    public final QuickPerformanceLogger A05;
    public final File A06;
    public final Integer A07;
    public final Integer A08;
    public final boolean A09;

    public LGB(WebPEncoderImpl webPEncoderImpl, QuickPerformanceLogger quickPerformanceLogger, File file, Integer num, Integer num2, int i, int i2, int i3, int i4, boolean z) {
        0qQ.A0B(webPEncoderImpl, 2);
        this.A05 = quickPerformanceLogger;
        this.A04 = webPEncoderImpl;
        this.A06 = file;
        this.A08 = num;
        this.A07 = num2;
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
        this.A09 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LGB) {
                LGB lgb = (LGB) obj;
                if (!0qQ.A0K(this.A05, lgb.A05) || !0qQ.A0K(this.A04, lgb.A04) || !0qQ.A0K(this.A06, lgb.A06) || !0qQ.A0K(this.A08, lgb.A08) || !0qQ.A0K(this.A07, lgb.A07) || this.A01 != lgb.A01 || this.A03 != lgb.A03 || this.A02 != lgb.A02 || this.A00 != lgb.A00 || this.A09 != lgb.A09) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A05);
        return DbS.A06(this.A09, (((((((((((((AnonymousClass7TF.A07(this.A04, A0K) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TE.A0L(this.A07)) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31) + this.A00) * 31);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("OdrParams(perfLogger=");
        A1A.append(this.A05);
        A1A.append(", webPEncoder=");
        A1A.append(this.A04);
        A1A.append(", destFile=");
        A1A.append(this.A06);
        A1A.append(", snapshotWidth=");
        A1A.append(this.A08);
        A1A.append(", snapshotHeight=");
        A1A.append(this.A07);
        A1A.append(", frameCount=");
        A1A.append(this.A01);
        A1A.append(", outputValidationStepSize=");
        A1A.append(this.A03);
        A1A.append(", frameCountBeforeCapture=");
        A1A.append(this.A02);
        A1A.append(", encodingQueueCapacity=");
        A1A.append(this.A00);
        A1A.append(", isAvatarLoadSelfEnabled=");
        return G9t.A1C(A1A, this.A09);
    }
}
