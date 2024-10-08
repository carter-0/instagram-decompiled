package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Ojb  reason: case insensitive filesystem */
public final class C71377Ojb implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ NKQ A04;
    public final /* synthetic */ C330957Ox A05;
    public final /* synthetic */ N4P A06;
    public final /* synthetic */ C68303N9q A07;
    public final /* synthetic */ C254793t3 A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;

    public C71377Ojb(Context context, AnonymousClass0iw r2, UserSession userSession, NKQ nkq, C330957Ox r5, N4P n4p, C68303N9q n9q, C254793t3 r8, String str, String str2, int i) {
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r2;
        this.A00 = i;
        this.A06 = n4p;
        this.A0A = str;
        this.A05 = r5;
        this.A08 = r8;
        this.A07 = n9q;
        this.A09 = str2;
        this.A04 = nkq;
    }

    public final void onClick(View view) {
        C70819OMo oMo;
        1a8 r3;
        1aU A0H;
        int i;
        int A052 = AnonymousClass0fD.A05(-797160336);
        Context context = this.A01;
        0qQ.A0C(context, Pxd.A00(0));
        if (!C71118OdC.A03((Activity) context, context, this.A02, this.A03, (2EM) null, this.A00, false)) {
            N4P n4p = this.A06;
            boolean contains = n4p.A0S.contains(this.A0A);
            C330957Ox r6 = this.A05;
            if (contains) {
                C254793t3 r7 = this.A08;
                User user = this.A07.A00;
                String str = this.A09;
                String username = user.getUsername();
                ImageUrl Bh3 = user.Bh3();
                AnonymousClass7TF.A1H(r7, user);
                AnonymousClass7ZA A002 = C330957Ox.A00(r6, r7);
                oMo = new C70819OMo(Bh3, r6, r7, str, username, 5);
                r3 = r6.A01;
                A0H = A002.AOf(r7, user).A0H();
                i = 33;
            } else {
                C254793t3 r72 = this.A08;
                User user2 = this.A07.A00;
                String str2 = this.A09;
                String username2 = user2.getUsername();
                ImageUrl Bh32 = user2.Bh3();
                AnonymousClass7TF.A1H(r72, user2);
                AnonymousClass7ZA A003 = C330957Ox.A00(r6, r72);
                oMo = new C70819OMo(Bh32, r6, r72, str2, username2, 4);
                r3 = r6.A01;
                A0H = A003.E4f(r72, user2).A0H();
                i = 34;
            }
            PU8.A00(A0H, r3, oMo, i);
        }
        AnonymousClass0fD.A0C(2097042804, A052);
    }
}
