package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.PHa  reason: case insensitive filesystem */
public final class C72720PHa implements C66491MTu {
    public final /* synthetic */ C270194gL A00;
    public final /* synthetic */ Reel A01;
    public final /* synthetic */ User A02;
    public final /* synthetic */ C239413Gj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public final void D1x(Context context) {
        Integer num;
        Context context2 = context;
        0qQ.A0B(context, 0);
        C239413Gj r7 = this.A03;
        String str = this.A00.A0e;
        str.getClass();
        Reel reel = this.A01;
        String A0r = JTP.A0r(reel);
        User user = this.A02;
        C239413Gj.A06(r7, str, A0r, user.getId());
        String str2 = this.A04;
        C313626gk r0 = r7.A02;
        if (r0 != null) {
            num = r0.Bdi(str2);
        } else {
            num = null;
        }
        if (num == AnonymousClass05K.A0N) {
            String str3 = this.A06;
            String str4 = this.A05;
            FragmentActivity A002 = C239403Gi.A00();
            if (A002 != null) {
                C358248ab A0X = DbS.A0X(A002);
                A0X.A05 = DbY.A0b(context, user, 2131965463);
                A0X.A08(2131965461);
                A0X.A0n(user.Bh3(), C239413Gj.A08);
                A0X.A0I(new C71193OfE(context2, reel, r7, str3, str4, 2), 2131965460);
                A0X.A0H(new C49991FIa(reel, r7, str4, str3, 2), 2131965462);
                A0X.A0r(true);
                DbT.A1V(A0X);
                return;
            }
            return;
        }
        C239413Gj.A02(reel, AnonymousClass3BQ.IN_APP_NOTIFICATION, r7, this.A06, this.A05);
    }

    public C72720PHa(C270194gL r1, Reel reel, User user, C239413Gj r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = reel;
        this.A02 = user;
        this.A04 = str;
        this.A06 = str2;
        this.A05 = str3;
    }

    public final void onDismiss() {
        C239413Gj.A04(this.A01, this.A03, this.A05);
    }
}
