package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.ESs  reason: case insensitive filesystem */
public final class C48049ESs extends C2806552w {
    public final int A00 = 0;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48049ESs(Activity activity, UserSession userSession, 2EG r4, String str, int i) {
        super(Integer.valueOf(i));
        this.A01 = activity;
        this.A02 = userSession;
        this.A04 = str;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        if (this.A00 != 0) {
            SUL A0J = Dba.A0J((Context) this.A01, (UserSession) this.A02, (2EG) this.A03, this.A04);
            A0J.A0S = AnonymousClass000.A00(4412);
            A0J.A0A();
            return;
        }
        String str = this.A04;
        Context context = (Context) this.A02;
        W3L.A07((Activity) this.A01, context, (UserSession) this.A03, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48049ESs(Activity activity, Context context, UserSession userSession, String str, int i) {
        super(Integer.valueOf(i));
        this.A04 = str;
        this.A03 = userSession;
        this.A02 = context;
        this.A01 = activity;
    }
}
