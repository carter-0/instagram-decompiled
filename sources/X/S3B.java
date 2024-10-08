package X;

import android.text.TextUtils;
import java.util.List;

public final class S3B {
    public C11232SGr A00;
    public C11232SGr A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.RQq, java.lang.Object] */
    public final RQq A00() {
        if (TextUtils.isEmpty(this.A06) || TextUtils.isEmpty(this.A05) || TextUtils.isEmpty(this.A03)) {
            throw AnonymousClass7TE.A0w("The title, subtitle and description of PIN keypad screen should NOT be empty.");
        }
        ? obj = new Object();
        obj.A06 = this.A06;
        obj.A05 = this.A05;
        obj.A03 = this.A03;
        obj.A00 = this.A00;
        obj.A02 = this.A02;
        obj.A07 = this.A07;
        obj.A04 = this.A04;
        obj.A01 = this.A01;
        return obj;
    }
}
