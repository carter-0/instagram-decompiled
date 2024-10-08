package X;

import com.facebook.rsys.audio.gen.AudioOutputRoute;

/* renamed from: X.NfD  reason: case insensitive filesystem */
public final class C69132NfD extends OTZ {
    public boolean A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final C71937OtN A08 = new C71937OtN(this);
    public final C69134NfF A09;
    public final O9S A0A;
    public final AnonymousClass0eM A0B;
    public final 05G A0C;

    public C69132NfD(C69134NfF nfF, O9R o9r, O9S o9s, C62320sa r6) {
        super(o9r);
        this.A0A = o9s;
        this.A09 = nfF;
        this.A0B = C73925Pm5.A00(r6, 14);
        AudioOutputRoute audioOutputRoute = AudioOutputRoute.EARPIECE;
        0qQ.A08(audioOutputRoute);
        this.A0C = DbS.A10(new C72833PLv(audioOutputRoute));
    }

    public static final void A00(C69132NfD nfD) {
        boolean z;
        if (!nfD.A01 || nfD.A05 || nfD.A07 || (nfD.A02 && nfD.A06)) {
            z = true;
        } else {
            z = false;
        }
        C70811OMg oMg = (C70811OMg) nfD.A0B.getValue();
        if (z) {
            oMg.A01(false);
        } else {
            oMg.A00(0);
        }
    }
}
