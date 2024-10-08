package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FmE implements C273414mX {
    public final /* synthetic */ long A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ Drawable A02;
    public final /* synthetic */ Fragment A03;
    public final /* synthetic */ FragmentActivity A04;
    public final /* synthetic */ 0lg A05;
    public final /* synthetic */ UserSession A06;
    public final /* synthetic */ C49431EvX A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    public final void Cyf() {
    }

    public FmE(Context context, Drawable drawable, Fragment fragment, FragmentActivity fragmentActivity, 0lg r5, UserSession userSession, C49431EvX evX, String str, long j, boolean z) {
        this.A06 = userSession;
        this.A03 = fragment;
        this.A09 = z;
        this.A01 = context;
        this.A04 = fragmentActivity;
        this.A02 = drawable;
        this.A00 = j;
        this.A05 = r5;
        this.A08 = str;
        this.A07 = evX;
    }

    public final void Cyc() {
        UserSession userSession = this.A06;
        long A052 = DbW.A05(userSession);
        if (A052 > 0 && (this.A03 instanceof C52477GUf) && !this.A09) {
            C310336ap A0a = DbS.A0a();
            Context context = this.A01;
            DbS.A19(context, A0a, 2131975009);
            2dY r0 = 2dZ.A0t;
            FragmentActivity fragmentActivity = this.A04;
            A0a.A09(r0.A03(fragmentActivity).A0Q());
            DbW.A0q(context, A0a, 2131961425);
            A0a.A0A(new FdA(6, fragmentActivity, this.A05, userSession));
            A0a.A04 = this.A02;
            A0a.A02();
            A0a.A0L = true;
            A0a.A06();
            A0a.A0I = context.getString(2131975008);
            Dbb.A1Q(A0a);
        } else if (this.A09 && A052 > 0 && this.A00 == 0) {
            FG5.A03(this.A01, this.A04, this.A05, userSession, this.A08, A052);
        }
        if ((this.A03 instanceof C52477GUf) || this.A00 == 0 || A052 == 0) {
            2Aq.A03(userSession).A0R();
        }
        C49431EvX evX = this.A07;
        if (evX != null) {
            evX.A00.invoke();
        }
    }
}
