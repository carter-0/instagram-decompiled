package X;

import androidx.paging.PageEvent$Insert;
import java.util.ArrayList;
import java.util.List;

public final class LDo {
    public int A00;
    public int A01;
    public LP3 A02;
    public boolean A03;
    public final LGK A04 = new LGK();
    public final 01W A05 = new 01W();

    public final List A00() {
        Object jje;
        if (!this.A03) {
            return 0sn.A00;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        LP3 A012 = this.A04.A01();
        01W r1 = this.A05;
        if (DbT.A1b(r1)) {
            PageEvent$Insert pageEvent$Insert = PageEvent$Insert.A06;
            jje = C62955Kp7.A00(A012, this.A02, 00k.A0a(r1), this.A01, this.A00);
        } else {
            jje = new C60335Jje(A012, this.A02);
        }
        A1C.add(jje);
        return A1C;
    }
}
