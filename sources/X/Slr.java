package X;

import android.graphics.Rect;

public final class Slr implements C13554TcQ {
    public final /* synthetic */ C11254SHo A00;

    public Slr(C11254SHo sHo) {
        this.A00 = sHo;
    }

    public final void onPreviewFrame(C10843Rz3 rz3) {
        C11254SHo sHo = this.A00;
        if (sHo.A04) {
            C12060Sln sln = sHo.A01;
            if (sln != null && !sln.A02) {
                sln.A02 = true;
                L36 l36 = sln.A05.A06;
                C62961KpD.A00(l36.A00, l36.A01, "autogen_finished", 38);
                byte[] bArr = C9574RdE.A00(rz3).A0A;
                if (bArr != null) {
                    int i = rz3.A03;
                    int i2 = rz3.A00;
                    Rect rect = new Rect(0, 0, i, i2);
                    int i3 = rz3.A02;
                    AnonymousClass7TE.A1Z(new C66175MGm(rect, sln, (AnonymousClass4D7) null, bArr, i, i2, i3), 19E.A02(AnonymousClass12W.A01));
                    return;
                }
                return;
            }
            return;
        }
        C13554TcQ tcQ = sHo.A02;
        if (tcQ != null) {
            tcQ.onPreviewFrame(rz3);
        }
    }
}
