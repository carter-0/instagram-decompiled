package X;

import android.net.Uri;
import android.os.Bundle;

/* renamed from: X.La3  reason: case insensitive filesystem */
public final class C64328La3 implements 07h {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ L6E A02;
    public final /* synthetic */ C60694Jpf A03;
    public final /* synthetic */ String A04;

    public final /* bridge */ /* synthetic */ void DOK(07p r7, Object obj) {
        int i = this.A01;
        int i2 = this.A00;
        L6E l6e = this.A02;
        C342057ny.A00(new C66058M9r(l6e, this, (C59861Jad) obj, i, i2));
    }

    public C64328La3(L6E l6e, C60694Jpf jpf, String str, int i, int i2) {
        this.A03 = jpf;
        this.A04 = str;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = l6e;
    }

    public final 07p D6j(Bundle bundle, int i) {
        C60694Jpf jpf = this.A03;
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C59854JaV(jpf.A0A, JTQ.A09(this.A04), (Uri) null, jpf.A0C);
    }
}
