package X;

import com.instagram.bugreporter.model.BugReport;
import java.io.File;

public final class OKE {
    public final OV8 A00;
    public final 0lg A01;

    public OKE(BugReport bugReport, 0lg r4) {
        0qQ.A0B(r4, 2);
        this.A01 = r4;
        this.A00 = new OV8(bugReport.A0G);
    }

    public final File A00(String str, String str2) {
        0qQ.A0B(str, 0);
        OV8 ov8 = this.A00;
        if (str2 == null) {
            str2 = "";
        }
        File A0s = JTO.A0s(ov8.A00(), 002.A0R(str, str2));
        JTR.A1O(A0s);
        return A0s;
    }
}
