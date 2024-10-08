package X;

import com.instagram.model.reels.Reel;
import java.util.Map;

/* renamed from: X.LwP  reason: case insensitive filesystem */
public final class C65589LwP implements C311566ct {
    public final /* synthetic */ C60308Jj7 A00;
    public final /* synthetic */ C252683pV A01;

    public final void DMi(String str) {
        0qQ.A0B(str, 0);
        this.A00.A03.A03(str);
    }

    public final void DPq(String str, String str2) {
    }

    public final void DQ3(String str, String str2) {
        0qQ.A0B(str, 0);
        this.A00.A03.A05(str, AnonymousClass05K.A01);
    }

    public final void DQo(String str, String str2) {
    }

    public final void DQr(String str, String str2) {
    }

    public C65589LwP(C60308Jj7 jj7, C252683pV r2) {
        this.A00 = jj7;
        this.A01 = r2;
    }

    public final void DMh(String str) {
        this.A00.A03.A05(str, AnonymousClass05K.A00);
    }

    public final void DMj(String str, boolean z) {
        Reel A0L;
        C60308Jj7 jj7 = this.A00;
        if (((Map) ((C61056Jvu) jj7.A08.getValue()).A02).containsKey(str) && !z && (A0L = Dba.A0L(jj7.A05, str)) != null) {
            C252683pV r1 = this.A01;
            C63971LGa lGa = jj7.A03;
            lGa.A02(str);
            r1.FIG(A0L);
            lGa.A01(str);
        }
    }
}
