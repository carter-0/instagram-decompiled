package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;

/* renamed from: X.FOa  reason: case insensitive filesystem */
public final class C50085FOa implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C67058MhZ A05;
    public final /* synthetic */ C294875nB A06;
    public final /* synthetic */ DirectShareTarget A07;
    public final /* synthetic */ String A08;

    public C50085FOa(C67058MhZ mhZ, C294875nB r2, DirectShareTarget directShareTarget, String str, int i, int i2, int i3, int i4, int i5) {
        this.A06 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A07 = directShareTarget;
        this.A08 = str;
        this.A02 = i5;
        this.A05 = mhZ;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-2133933219);
        C294875nB r2 = this.A06;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A04;
        int i4 = this.A03;
        r2.Dk6(this.A05, this.A07, this.A08, i, i2, i3, i4, this.A02);
        AnonymousClass0fD.A0C(1918726869, A052);
    }
}
