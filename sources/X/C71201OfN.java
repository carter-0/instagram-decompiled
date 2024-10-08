package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.OfN  reason: case insensitive filesystem */
public final class C71201OfN implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Context A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ NKQ A04;
    public final /* synthetic */ C330957Ox A05;
    public final /* synthetic */ N4P A06;
    public final /* synthetic */ C68303N9q A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;

    public C71201OfN(Context context, UserSession userSession, NKQ nkq, C330957Ox r4, N4P n4p, C68303N9q n9q, String str, String str2, int i, int i2) {
        this.A03 = userSession;
        this.A00 = i;
        this.A01 = i2;
        this.A08 = str;
        this.A09 = str2;
        this.A05 = r4;
        this.A06 = n4p;
        this.A07 = n9q;
        this.A02 = context;
        this.A04 = nkq;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A03;
        int i2 = this.A00;
        C71094OcU.A03(userSession, this.A08, this.A09, i2, this.A01);
        C330957Ox r6 = this.A05;
        N4P n4p = this.A06;
        C254793t3 r7 = n4p.A0L;
        User user = this.A07.A00;
        List A1I = AnonymousClass7TE.A1I(MessagingUser.A00(user));
        String A022 = C330397Mp.A02(this.A02, userSession, n4p, false);
        String username = user.getUsername();
        ImageUrl Bh3 = user.Bh3();
        0qQ.A0B(r7, 0);
        AnonymousClass7ZA A002 = C330957Ox.A00(r6, r7);
        C70819OMo oMo = new C70819OMo(Bh3, r6, r7, A022, username, i2);
        PU8.A00(A002.AGN(r7, A1I).A0H(), r6.A01, oMo, 32);
    }
}
