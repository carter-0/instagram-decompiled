package X;

import com.instagram.user.model.User;

public final class FZV implements C250603lj {
    public final int A00;
    public final C47217Dt4 A01;
    public final E23 A02;
    public final Integer A03;
    public final String A04;

    public final void ATF(AnonymousClass30Y r8, C252093oY r9) {
        Integer num;
        String str;
        0qQ.A0B(r8, 0);
        String str2 = null;
        if (r9 != null) {
            num = r9.CEk(r8);
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A00) {
            User user = (User) r8.A03;
            Integer num2 = this.A03;
            if (num2 == null || num2.intValue() != 1) {
                C47217Dt4 dt4 = this.A01;
                if (dt4 != null) {
                    E23 e23 = this.A02;
                    int i = this.A00;
                    if (num2 != null && num2.intValue() == 2) {
                        str2 = "from_your_contacts";
                    }
                    User user2 = dt4.A00;
                    String str3 = dt4.A05;
                    if (user2 != null) {
                        C230012om r1 = e23.A02;
                        if (r1 == null) {
                            str = "recommendedUserLogger";
                        } else {
                            DbV.A1T(E23.A00(dt4, user2, str3, str2, i), r1);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                E23 e232 = this.A02;
                0qQ.A0A(user);
                String str4 = this.A04;
                0qQ.A0B(user, 0);
                if (str4 == null) {
                    return;
                }
                if (e232.A01 == null) {
                    str = "discoverAccountsLogger";
                } else {
                    user.getId();
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public FZV(C47217Dt4 dt4, E23 e23, Integer num, String str, int i) {
        this.A03 = num;
        this.A01 = dt4;
        this.A02 = e23;
        this.A04 = str;
        this.A00 = i;
    }
}
