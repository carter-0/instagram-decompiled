package X;

import com.instagram.user.model.User;

/* renamed from: X.MnW  reason: case insensitive filesystem */
public final class C67415MnW implements C250603lj {
    public final C66967Mg0 A00;
    public final C67410MnR A01;
    public final C67405MnM A02;

    public C67415MnW(C67410MnR mnR, C67405MnM mnM) {
        this.A01 = mnR;
        this.A02 = mnM;
        C66966Mfz mfz = new C66966Mfz();
        mfz.A09 = "empty_results";
        this.A00 = new C66967Mg0(mfz);
    }

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        AnonymousClass7TG.A1N(r10, r11);
        if (r11.CEk(r10) == AnonymousClass05K.A00 && this.A02.AH0(String.valueOf(((C56078HsR) r10.A03).A00))) {
            this.A01.A00(this.A00, (User) null, (Integer) null, "", "", "", "", (String) null);
        }
    }
}
