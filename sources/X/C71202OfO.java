package X;

import android.content.DialogInterface;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.OfO  reason: case insensitive filesystem */
public final class C71202OfO implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final String A09;
    public final String A0A;

    public C71202OfO(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A01 = i;
        this.A09 = str;
        this.A0A = str2;
        this.A07 = obj2;
        this.A03 = obj4;
        this.A08 = obj6;
        this.A05 = obj7;
        this.A04 = obj;
        this.A06 = obj5;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1a8 r0;
        1aU EDT;
        C72997PSg pSg;
        if (this.A00 != 0) {
            AnonymousClass7GX r2 = (AnonymousClass7GX) this.A06;
            int i2 = this.A01;
            String str = this.A09;
            String str2 = this.A0A;
            C69871NtZ.A00(r2.A00, str, str2, "resign_moderator_attempt", "tap", "resign_moderator_dialog", "thread_details", (HashMap) null, i2);
            r0 = (1a8) this.A07;
            EDT = ((C74449Pv4) this.A02).C62().EE7(((N4P) this.A08).A0L, AnonymousClass7TE.A1I(MessagingUser.A00((User) this.A04)));
            int i3 = i2;
            pSg = new C72997PSg(this.A05, this.A03, r2, str, str2, i3, 1);
        } else {
            C313756gx r12 = (C313756gx) this.A02;
            int i4 = this.A01;
            String str3 = this.A09;
            String str4 = this.A0A;
            1Ln A0J = DbT.A0J(r12);
            if (DbT.A1Y(A0J)) {
                DbW.A17(A0J, r12);
                DbV.A1M(A0J, "resign_collaborator_attempt");
                A0J.A0p("resign_collaborator_dialog");
                A0J.A0i(DbZ.A0b(A0J, "thread_details", str3, str4, i4));
                A0J.Cgf();
            }
            r0 = (1a8) this.A07;
            EDT = ((C74449Pv4) this.A03).C62().EDT(((N4P) this.A08).A0L, AnonymousClass7TE.A1I(MessagingUser.A00((User) this.A05)));
            pSg = new C72997PSg(this.A04, r12, this.A06, str3, str4, i4, 0);
        }
        r0.A02(EDT, pSg);
    }
}
