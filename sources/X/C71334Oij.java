package X;

import android.net.Uri;
import android.view.View;

/* renamed from: X.Oij  reason: case insensitive filesystem */
public final class C71334Oij implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass7EI A00;
    public final /* synthetic */ C3255473b A01;
    public final /* synthetic */ String A02;

    public C71334Oij(AnonymousClass7EI r1, C3255473b r2, String str) {
        this.A02 = str;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1684290741);
        Uri.Builder buildUpon = Uri.parse(this.A02).buildUpon();
        C3255473b r2 = this.A01;
        AnonymousClass7EI r6 = this.A00;
        buildUpon.appendQueryParameter("s", "direct_forwarding_eyebrow");
        String str = r2.A07;
        if (str != null) {
            if (182.A06(0Tu.A05, r6.A02, 36319342967856281L)) {
                buildUpon.appendQueryParameter("x", str);
            }
        }
        buildUpon.build();
        r6.A04.Cqo(DbT.A10(buildUpon), (String) null, (String) null);
        C313756gx A002 = C313746gw.A00(r6.A02);
        1Ln A0J = DbT.A0J(A002);
        if (DbT.A1Y(A0J)) {
            DbW.A17(A0J, A002);
            DbV.A1M(A0J, "thread_open");
            C66581MXm.A1J(A0J, "channel_eybrow_link");
            A0J.A0o("broadcast");
            A0J.A0s((String) null);
            C66582MXn.A1C(A0J, A002, (Long) null);
        }
        AnonymousClass0fD.A0C(1825928180, A05);
    }
}
