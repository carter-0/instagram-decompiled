package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.6oy  reason: invalid class name and case insensitive filesystem */
public final class C318456oy extends 1P0 {
    public final /* synthetic */ C294705mt A00;
    public final /* synthetic */ User A01;

    public C318456oy(C294705mt r1, User user) {
        this.A00 = r1;
        this.A01 = user;
    }

    public final void onFailInBackground(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-1052888802);
        C294705mt r3 = this.A00;
        AnonymousClass2f1 A002 = AnonymousClass2f1.A00(r3.A02);
        User user = this.A01;
        if (A002.A0N(user) == FollowStatus.A04) {
            r3.A0E(user);
        }
        AnonymousClass0fD.A0A(-67160185, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A03 = AnonymousClass0fD.A03(-854529338);
        C320136rp r6 = (C320136rp) obj;
        int A032 = AnonymousClass0fD.A03(1935105997);
        0qQ.A0B(r6, 0);
        this.A00.A0C(r6, this.A01, (String) null);
        AnonymousClass0fD.A0A(663984267, A032);
        AnonymousClass0fD.A0A(-505627464, A03);
    }
}
