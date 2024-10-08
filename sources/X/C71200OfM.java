package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.OfM  reason: case insensitive filesystem */
public final class C71200OfM implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final String A08;
    public final String A09;

    public C71200OfM(Context context, UserSession userSession, NKQ nkq, C330957Ox r4, N4P n4p, C68303N9q n9q, String str, String str2, int i, int i2) {
        this.A00 = i2;
        this.A07 = userSession;
        this.A01 = i;
        this.A08 = str;
        this.A09 = str2;
        this.A03 = r4;
        this.A06 = n4p;
        this.A05 = n9q;
        this.A02 = context;
        this.A04 = nkq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C70819OMo oMo;
        1a8 r3;
        1aU A0H;
        int i2;
        int i3 = this.A00;
        UserSession userSession = (UserSession) this.A07;
        int i4 = this.A01;
        String str = this.A08;
        String str2 = this.A09;
        if (i3 != 0) {
            C71094OcU.A03(userSession, str, str2, 3, i4);
            C330957Ox r6 = (C330957Ox) this.A03;
            N4P n4p = (N4P) this.A06;
            C254793t3 r7 = n4p.A0L;
            User user = ((C68303N9q) this.A05).A00;
            List A1I = AnonymousClass7TE.A1I(MessagingUser.A00(user));
            String A022 = C330397Mp.A02((Context) this.A02, userSession, n4p, false);
            String username = user.getUsername();
            ImageUrl Bh3 = user.Bh3();
            0qQ.A0B(r7, 0);
            AnonymousClass7ZA A002 = C330957Ox.A00(r6, r7);
            oMo = new C70819OMo(Bh3, r6, r7, A022, username, 3);
            r3 = r6.A01;
            A0H = A002.EE7(r7, A1I).A0H();
            i2 = 37;
        } else {
            C71094OcU.A03(userSession, str, str2, 2, i4);
            C330957Ox r62 = (C330957Ox) this.A03;
            N4P n4p2 = (N4P) this.A06;
            C254793t3 r72 = n4p2.A0L;
            User user2 = ((C68303N9q) this.A05).A00;
            List A1I2 = AnonymousClass7TE.A1I(MessagingUser.A00(user2));
            String A023 = C330397Mp.A02((Context) this.A02, userSession, n4p2, false);
            String username2 = user2.getUsername();
            ImageUrl Bh32 = user2.Bh3();
            0qQ.A0B(r72, 0);
            AnonymousClass7ZA A003 = C330957Ox.A00(r62, r72);
            oMo = new C70819OMo(Bh32, r62, r72, A023, username2, 2);
            r3 = r62.A01;
            A0H = A003.EDT(r72, A1I2).A0H();
            i2 = 35;
        }
        PU8.A00(A0H, r3, oMo, i2);
    }
}
