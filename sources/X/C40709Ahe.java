package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ahe  reason: case insensitive filesystem */
public final class C40709Ahe implements B38 {
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final void CMw(C371698yt r4) {
        C372168zr r2;
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (r4 != null) {
            r2 = r4.A02;
            if (r2 != null) {
                str = r2.A00;
            }
            str = null;
        } else {
            r2 = null;
            str = null;
        }
        this.A00 = str;
        if (r2 != null) {
            str2 = r2.A01;
        } else {
            str2 = null;
        }
        this.A01 = str2;
        if (r2 != null) {
            str3 = r2.A02;
        } else {
            str3 = null;
        }
        this.A02 = str3;
        if (r2 != null) {
            str4 = r2.A03;
        }
        this.A03 = str4;
    }

    public final List EzR() {
        return null;
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        return Q21.A00(AnonymousClass7TF.A0x("serviceType", 36), AnonymousClass7TE.A1L("detectionInitNetPath", this.A00), AnonymousClass7TE.A1L("detectionPredictNetPath", this.A01), AnonymousClass7TE.A1L("pointerInitNetPath", this.A02), AnonymousClass7TE.A1L("pointerPredictNetPath", this.A03));
    }
}
