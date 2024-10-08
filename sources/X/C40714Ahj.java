package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import java.util.List;

/* renamed from: X.Ahj  reason: case insensitive filesystem */
public final class C40714Ahj implements B38 {
    public DeviceConfig A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public String A07;

    public final List EzR() {
        return null;
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        Bundle A002 = Q21.A00(AnonymousClass7TF.A0x("serviceType", 101), AnonymousClass7TE.A1L("trackerPatchSize", this.A05), AnonymousClass7TE.A1L("trackerScales", this.A06), AnonymousClass7TE.A1L("useSimilarityTracker", this.A03), AnonymousClass7TE.A1L("setScaleByARClass", this.A01), AnonymousClass7TE.A1L("executionMode", this.A04), AnonymousClass7TE.A1L("deviceType", this.A07), AnonymousClass7TE.A1L("startPlaneTrackingOnLoad", this.A02));
        A002.putParcelable("deviceConfig", this.A00);
        return A002;
    }

    public final void CMw(C371698yt r3) {
        C372128zj r1;
        int i;
        if (r3 != null && (r1 = r3.A04) != null) {
            this.A05 = Integer.valueOf(r1.A02);
            this.A06 = Integer.valueOf(r1.A03);
            this.A03 = Boolean.valueOf(r1.A08);
            this.A01 = Boolean.valueOf(r1.A07);
            if (r1.A06.intValue() != 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.A04 = Integer.valueOf(i);
            this.A00 = r1.A04;
            this.A02 = Boolean.valueOf(r1.A01);
            this.A07 = r1.A00;
        }
    }
}
