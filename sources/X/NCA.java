package X;

import android.view.View;

public final class NCA extends C232922uf {
    public final /* synthetic */ C72286Ozv A00;

    public final void DmC(2cs r8) {
        0qQ.A0B(r8, 0);
        C72286Ozv ozv = this.A00;
        View view = ozv.A01;
        if (view == null) {
            return;
        }
        if (r8.A09.A00 == 0.0d) {
            view.setVisibility(8);
        } else {
            ozv.A0B.A01();
        }
    }

    public final void DmE(2cs r8) {
        0qQ.A0B(r8, 0);
        C72286Ozv ozv = this.A00;
        if (ozv.A01 != null) {
            C71412ct r6 = r8.A09;
            float f = (float) r6.A00;
            int i = ozv.A08;
            float f2 = (float) i;
            ozv.EpH((1.0f - f) * f2);
            if (ozv.A05) {
                int i2 = i - ozv.A09;
                C355948Rz r0 = ozv.A02;
                if (r0 != null) {
                    r0.A0K.A00().FMC(f * ((float) (-i2)));
                }
            }
            C64998Llb llb = ozv.A04;
            if (llb != null) {
                2YL A0H = DbS.A0H(llb.A08);
                AnonymousClass7TE.A1Z(new C59714JUx(A0H, (AnonymousClass4D7) null, ((float) r6.A00) * f2, 13), C318116oQ.A00(A0H));
            }
        }
    }

    public NCA(C72286Ozv ozv) {
        this.A00 = ozv;
    }
}
