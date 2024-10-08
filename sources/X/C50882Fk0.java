package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Fk0  reason: case insensitive filesystem */
public final class C50882Fk0 implements G6H {
    public final Context A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final FragmentActivity A02;
    public final AnonymousClass07i A03;
    public final UserSession A04;
    public final boolean A05;

    public final void CI0(Uri uri, Bundle bundle) {
        String queryParameter;
        Context context;
        AnonymousClass07i r3;
        1OC A042;
        int i;
        0qQ.A0B(uri, 0);
        if (bundle != null) {
            queryParameter = bundle.getString("custom_param_phone_number");
        } else {
            queryParameter = uri.getQueryParameter("phone");
        }
        if (!uri.getBooleanQueryParameter("autoconfirm", false) || !this.A05) {
            context = this.A00;
            r3 = this.A03;
            A042 = C318486p2.A04(this.A04, queryParameter);
            i = 7;
        } else {
            context = this.A00;
            r3 = this.A03;
            A042 = C318486p2.A02(context, this.A04, AnonymousClass05K.A01, queryParameter);
            i = 6;
        }
        A042.A00 = new C47690ECz(queryParameter, this, i);
        1ES.A00(context, r3, A042);
    }

    public C50882Fk0(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r4, UserSession userSession) {
        this.A02 = fragmentActivity;
        this.A00 = context;
        this.A03 = r4;
        this.A04 = userSession;
        this.A05 = AnonymousClass1G3.A04(context);
    }
}
