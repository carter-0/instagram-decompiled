package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.VhZ  reason: case insensitive filesystem */
public final class C17882VhZ {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass07i A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;

    public final void A00(Product product, String str) {
        new C323486xZ(this.A04, new C19588WcD(), new C323476xY()).A0D(new C19585WcA(this, product, str, C228022kf.A00((Bundle) null)), product, str, (String) null);
    }

    public C17882VhZ(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r3, AnonymousClass0iw r4, UserSession userSession) {
        this.A04 = userSession;
        this.A00 = context;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = fragmentActivity;
    }
}
