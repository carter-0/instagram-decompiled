package X;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediatype.ProductType;
import com.instagram.user.model.User;

public class ELE extends ED6 {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final 1Xj A02;
    public final C270394gf A03;
    public final C311526cp A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;

    public ELE(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r5, C270394gf r6, boolean z, boolean z2, boolean z3) {
        super(fragmentActivity, userSession, r5);
        this.A00 = fragmentActivity;
        this.A04 = new C311526cp(this.A01, fragmentActivity);
        this.A05 = z;
        this.A07 = r5.A5s();
        this.A08 = z2;
        this.A03 = r6;
        this.A06 = z3;
        this.A02 = r5;
        this.A01 = userSession;
    }

    public void onFail(C268654dm r5) {
        int A032 = AnonymousClass0fD.A03(-585947417);
        super.onFail(r5);
        if (this.A06) {
            C46345Dco.A00.A01(2131957515, Integer.valueOf(R.drawable.instagram_error_pano_outline_24));
            C48897Elx.A00("mutation_fail_instagram_only", this.A01, this.A02);
        }
        AnonymousClass0fD.A0A(1669701105, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(528392221);
        super.onFinish();
        if (!this.A05) {
            this.A04.A00((DialogInterface.OnDismissListener) null, false);
        }
        AnonymousClass0fD.A0A(1556853920, A032);
    }

    public void onSuccess(Object obj) {
        UserSession userSession;
        1Xj r1;
        String str;
        int A032 = AnonymousClass0fD.A03(1305000463);
        1Xj r12 = this.A02;
        1iA BR7 = r12.BR7();
        FU5 fu5 = new FU5();
        C270394gf r5 = this.A03;
        if (r5 != null) {
            Integer num = AnonymousClass05K.A01;
            UserSession userSession2 = this.A01;
            String A2n = r12.A2n();
            A2n.getClass();
            F8R.A00(fu5, userSession2, r5, num, A2n);
        } else if (BR7 == 1iA.A0Q || BR7 == 1iA.A09 || BR7 == 1iA.A0a) {
            1pZ A002 = AnonymousClass1pc.A00();
            UserSession userSession3 = this.A01;
            FragmentActivity fragmentActivity = this.A00;
            C54660HMr hMr = C54660HMr.DELETE_POST;
            String A2n2 = r12.A2n();
            A2n2.getClass();
            A002.AP8(fragmentActivity, fu5, userSession3, r12.BR7(), hMr, A2n2);
        }
        if (r12.A5x()) {
            r12.A0C.Eif((C46300DUd) null);
            UserSession userSession4 = this.A01;
            AnonymousClass1Nd.A00(userSession4).A00(new FWN(r12));
            AnonymousClass1Nd.A00(userSession4).A00(new C2371536n(r12));
            String string = this.A00.getResources().getString(2131972222);
            ImageUrl A1Q = r12.A1Q();
            A1Q.getClass();
            0qQ.A0B(string, 0);
            C310336ap A0a = DbS.A0a();
            A0a.A0D = string;
            A0a.A09 = A1Q;
            A0a.A03();
            Dbb.A1Q(A0a);
        } else {
            int i = 1;
            if (r12.A5Y()) {
                i = 3;
            }
            r12.A00 = i;
            r12.A0C.EUA(1);
            super.onSuccess(obj);
            UserSession userSession5 = this.A01;
            User A2A = r12.A2A(userSession5);
            A2A.getClass();
            if (!this.A07 && !r12.A5G()) {
                A2A.A0X();
            }
            A2A.A0d(userSession5);
            if (r12.A1v() == ProductType.CLIPS) {
                FragmentActivity fragmentActivity2 = this.A00;
                C48772Ejv.A00(userSession5, fragmentActivity2, "feed");
                if (this.A08) {
                    boolean A1S = DbW.A1S(1, fragmentActivity2, userSession5);
                    C309516Yo A0Q = DbU.A0Q(fragmentActivity2, userSession5);
                    A0Q.A0B((Bundle) null, C55243HeY.A00((C59725JVj) null, userSession5, A1S));
                    A0Q.A04();
                }
            }
        }
        if (this.A06 && (obj instanceof C61284K0v)) {
            if (((C61284K0v) obj).FH3().A01) {
                userSession = this.A01;
                r1 = this.A02;
                str = "mutation_success_instagram_only";
            } else {
                C46345Dco.A00.A01(2131957515, Integer.valueOf(R.drawable.instagram_error_pano_outline_24));
                userSession = this.A01;
                r1 = this.A02;
                str = "mutation_fail_instagram_only";
            }
            C48897Elx.A00(str, userSession, r1);
        }
        AnonymousClass0fD.A0A(1518770121, A032);
    }
}
