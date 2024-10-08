package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.H6l  reason: case insensitive filesystem */
public final class C54294H6l extends C228042kh {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;

    public C54294H6l(Activity activity, Context context, AnonymousClass07i r3, AnonymousClass0iw r4, UserSession userSession, String str, int i) {
        this.A00 = i;
        this.A01 = activity;
        this.A05 = userSession;
        this.A06 = str;
        this.A02 = context;
        this.A04 = r4;
        this.A03 = r3;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        int i = this.A00;
        Activity activity = (Activity) this.A01;
        if (i != 0) {
            Application application = activity.getApplication();
            0qQ.A07(application);
            UserSession userSession = (UserSession) this.A05;
            return new C52958GgB(application, C51967G9n.A0Y(userSession), new C55874Hov((Context) this.A02, (AnonymousClass07i) this.A03, (AnonymousClass0iw) this.A04, userSession), this.A06);
        }
        Application application2 = activity.getApplication();
        0qQ.A07(application2);
        UserSession userSession2 = (UserSession) this.A05;
        return new C52957GgA(application2, C51967G9n.A0Y(userSession2), new C55857Hoe((Context) this.A02, (AnonymousClass07i) this.A03, (AnonymousClass0iw) this.A04, userSession2), this.A06);
    }
}
