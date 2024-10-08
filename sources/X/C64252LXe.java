package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.LXe  reason: case insensitive filesystem */
public final class C64252LXe implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public C64252LXe(Context context, UserSession userSession, 1Xj r3, String str, boolean z) {
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = z;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1528127820);
        Context context = this.A00;
        UserSession userSession = this.A01;
        boolean z = this.A04;
        1Xj r6 = this.A02;
        String str = this.A03;
        int i = 2131956674;
        if (z) {
            i = 2131956675;
        }
        C358248ab A0Y = DbS.A0Y(context);
        A0Y.A04();
        A0Y.A09(i);
        A0Y.A0F(new LUX(context, userSession, r6, str, 1));
        A0Y.A05();
        DbT.A1V(A0Y);
        AnonymousClass0fD.A0C(450273467, A05);
    }
}
