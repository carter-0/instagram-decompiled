package X;

import java.util.concurrent.Callable;

/* renamed from: X.Asg  reason: case insensitive filesystem */
public final class C41359Asg implements Callable {
    public final /* synthetic */ AnonymousClass7VN A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public C41359Asg(AnonymousClass7VN r1, String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = r1;
        this.A03 = str2;
        this.A02 = str3;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str = this.A01;
        if (str != null) {
            AnonymousClass7VN r0 = this.A00;
            r0.A01.A00(str, "urlless_reshare_bottom_sheet", this.A03, this.A02);
        }
        return C60340gF.A00;
    }
}
