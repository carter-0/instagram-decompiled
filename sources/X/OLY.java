package X;

import android.content.Context;
import com.instagram.bugreporter.BugReportComposerViewModel;

public final class OLY {
    public String A00;
    public String A01;
    public String A02;
    public boolean A03 = true;
    public boolean A04;
    public boolean A05;

    public OLY(Context context) {
        0qQ.A0B(context, 1);
        this.A01 = AnonymousClass7TE.A16(context, 2131954333);
        String A0K = 2Yu.A0K(context);
        0qQ.A07(A0K);
        this.A02 = DbY.A0c(context, A0K, 2131954319);
        this.A00 = AnonymousClass7TE.A16(context, 2131971293);
    }

    public final BugReportComposerViewModel A00() {
        return new BugReportComposerViewModel(this.A01, this.A02, this.A00, this.A04, this.A03, this.A05);
    }
}
