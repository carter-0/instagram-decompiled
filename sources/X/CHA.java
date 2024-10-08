package X;

import com.instagram.user.model.User;

public final class CHA extends 1P0 {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ User A01;

    public CHA(1P0 r1, User user) {
        this.A01 = user;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(1977570636);
        this.A00.onFail(AnonymousClass7BQ.A00());
        AnonymousClass0fD.A0A(227074376, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean z;
        C250663lr requiredTreeField;
        C250663lr requiredTreeField2;
        int A03 = AnonymousClass0fD.A03(1195015787);
        AnonymousClass3JC r8 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(-570412729);
        0qQ.A0B(r8, 0);
        C250663lr r3 = (C250663lr) r8.A01;
        if (r3 == null || (requiredTreeField = r3.getRequiredTreeField(0, "xdt_unmute_friend_map_user(data:$data)", Bm1.class, -747672209)) == null || (requiredTreeField2 = requiredTreeField.getRequiredTreeField(0, "friendship_status", Bm0.class, 370687074)) == null) {
            z = false;
        } else {
            z = requiredTreeField2.hasFieldValue("is_muting_friend_map");
        }
        this.A01.A15(z);
        1P0 r1 = this.A00;
        if (z) {
            r1.onSuccess(C60340gF.A00);
        } else {
            r1.onFail(AnonymousClass7BQ.A00());
        }
        AnonymousClass0fD.A0A(-1438836536, A032);
        AnonymousClass0fD.A0A(-258920792, A03);
    }
}
