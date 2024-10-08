package X;

import android.widget.TextView;
import com.instagram.model.direct.DirectShareTarget;
import java.util.List;

/* renamed from: X.FbL  reason: case insensitive filesystem */
public final class C50412FbL implements MXS, MV9 {
    public String A00;
    public final DirectShareTarget A01;
    public final MTF A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new Dbl(this, 42));
    public final int A04;
    public final int A05;
    public final int A06;
    public final G9Z A07;
    public final C51866G5d A08;
    public final Integer A09;
    public final boolean A0A;

    public C50412FbL(G9Z g9z, C51866G5d g5d, DirectShareTarget directShareTarget, MTF mtf, Integer num, int i, int i2, int i3, boolean z) {
        AnonymousClass7TG.A0w(2, mtf, g9z, g5d);
        0qQ.A0B(num, 10);
        this.A01 = directShareTarget;
        this.A02 = mtf;
        this.A07 = g9z;
        this.A08 = g5d;
        this.A05 = i;
        this.A04 = i2;
        this.A06 = i3;
        this.A0A = z;
        this.A09 = num;
    }

    public final int BPM(TextView textView) {
        0qQ.A0B(textView, 0);
        return C64012LIz.A00(textView, this.A09);
    }

    public final int BtD() {
        return -1;
    }

    public final boolean CKn(DirectShareTarget directShareTarget) {
        0qQ.A0B(directShareTarget, 0);
        return 0qQ.A0K(this.A01, directShareTarget);
    }

    public final List AxF() {
        return AnonymousClass7TE.A1I(this.A01);
    }

    public final void D8z() {
        this.A07.D90(this.A01);
    }

    public final void Dj4() {
        this.A00 = this.A08.BnW();
        02m.A0p.markerEnd(145754550, 2);
        this.A02.AXA().A06(this, (C61002Juy) this.A03.getValue());
        this.A07.Dj5(this.A01, this.A06, this.A05, this.A04);
    }

    public final void DuW() {
        this.A02.AXA().A07((C61002Juy) this.A03.getValue());
        this.A07.DuX(this.A01, this.A04);
    }

    public final void EM2() {
        G9Z g9z = this.A07;
        DirectShareTarget directShareTarget = this.A01;
        String str = this.A00;
        if (str == null) {
            str = "";
        }
        g9z.Dk2(directShareTarget, str, this.A05, this.A04, this.A06, false, this.A0A);
    }
}
