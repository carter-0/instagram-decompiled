package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESe  reason: case insensitive filesystem */
public final class C48039ESe extends AnonymousClass7AK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48039ESe(Context context, UserSession userSession, Integer num, String str, String str2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A02 = num;
        this.A03 = userSession;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = context;
    }

    public static void A00(C48039ESe eSe, Object obj, Object obj2, String str) {
        if (obj == obj2) {
            new AnonymousClass7I3((UserSession) eSe.A03).A09(str);
        } else if (obj == AnonymousClass05K.A01) {
            new AnonymousClass7I3((UserSession) eSe.A03).A0A(eSe.A05, eSe.A04, str);
        }
    }

    public final void onClick(View view) {
        SUL sul;
        Context context;
        UserSession userSession;
        String str;
        2EG r0;
        switch (this.A00) {
            case 0:
                UserSession userSession2 = (UserSession) this.A02;
                WGU.A00(userSession2).A0F(((C18654Vw9) this.A03).A01, this.A04);
                sul = Dba.A0J((Context) this.A01, userSession2, 2EG.A34, this.A05);
                sul.A0S = "promote";
                break;
            case 1:
                A00(this, this.A02, AnonymousClass05K.A00, "ai_terms");
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                str = 182.A04(0Tu.A05, userSession, 36883388139241981L);
                r0 = 2EG.A0L;
                break;
            case 2:
                A00(this, this.A02, AnonymousClass05K.A00, "ai_at_meta");
                context = (Context) this.A01;
                userSession = (UserSession) this.A03;
                str = 182.A04(0Tu.A05, userSession, 36883388139110907L);
                r0 = 2EG.A0I;
                break;
            default:
                super.onClick(view);
                return;
        }
        sul = Dba.A0J(context, userSession, r0, str);
        sul.A0A();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48039ESe(FragmentActivity fragmentActivity, C18654Vw9 vw9, UserSession userSession, String str, String str2, int i, int i2) {
        super(Integer.valueOf(i));
        this.A00 = i2;
        this.A02 = userSession;
        this.A03 = vw9;
        this.A04 = str;
        this.A01 = fragmentActivity;
        this.A05 = str2;
    }
}
