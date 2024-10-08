package X;

import android.os.Bundle;
import java.util.List;

/* renamed from: X.Ahi  reason: case insensitive filesystem */
public final class C40713Ahi implements B38 {
    public int A00;
    public Integer A01;
    public Integer A02;
    public String A03;
    public boolean A04;
    public String[] A05 = new String[0];
    public String[] A06 = new String[0];

    public final void CMw(C371698yt r5) {
        C372158zq r3;
        int i;
        String[] strArr;
        String[] strArr2;
        String str;
        Integer num;
        Integer num2;
        Integer num3 = null;
        if (r5 != null) {
            r3 = r5.A01;
        } else {
            r3 = null;
        }
        boolean z = false;
        if (r3 == null || (num2 = r3.A01) == null) {
            i = 0;
        } else {
            i = C368548sp.A00(num2);
        }
        this.A00 = i;
        if (r3 == null || (strArr = r3.A06) == null) {
            strArr = new String[0];
        }
        this.A06 = strArr;
        if (r3 != null) {
            strArr2 = r3.A05;
        } else {
            strArr2 = new String[0];
        }
        this.A05 = strArr2;
        if (r3 != null) {
            str = r3.A04;
        } else {
            str = null;
        }
        this.A03 = str;
        if (r3 != null) {
            z = r3.A07;
        }
        this.A04 = z;
        if (r3 != null) {
            num = r3.A02;
        } else {
            num = null;
        }
        this.A01 = num;
        if (r3 != null) {
            num3 = r3.A03;
        }
        this.A02 = num3;
    }

    public final List EzR() {
        return null;
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        Bundle A002 = Q21.A00(AnonymousClass7TF.A0x("serviceType", 24), AnonymousClass7TE.A1L("executionMode", Integer.valueOf(this.A00)), AnonymousClass7TE.A1L("modelFiles", this.A06), AnonymousClass7TE.A1L("filePaths", this.A05), AnonymousClass7TE.A1L("expressionFittingModelPath", this.A03), AnonymousClass7TE.A1L("useRandomSampling", Boolean.valueOf(this.A04)));
        Integer num = this.A01;
        if (num != null) {
            A002.putInt("maxDetectionDim", num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 != null) {
            A002.putInt("maxDetectionScales", num2.intValue());
        }
        return A002;
    }
}
