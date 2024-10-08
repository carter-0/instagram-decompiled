package X;

import com.instagram.user.model.User;

/* renamed from: X.MnO  reason: case insensitive filesystem */
public final class C67407MnO implements C250603lj {
    public final C67410MnR A00;
    public final C67405MnM A01;

    public C67407MnO(C67410MnR mnR, C67405MnM mnM) {
        this.A00 = mnR;
        this.A01 = mnM;
    }

    public final void ATF(AnonymousClass30Y r10, C252093oY r11) {
        AnonymousClass7TG.A1N(r10, r11);
        if (r11.CEk(r10) != AnonymousClass05K.A0C) {
            C67405MnM mnM = this.A01;
            String str = ((C71969Otu) r10.A03).A01;
            if (mnM.AH0(str)) {
                C67410MnR mnR = this.A00;
                Object obj = r10.A04;
                0qQ.A06(obj);
                mnR.A00((C66967Mg0) obj, (User) null, (Integer) null, "KEYWORD", "", str, "", (String) null);
            }
        }
    }
}
