package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FLz  reason: case insensitive filesystem */
public final class C50059FLz implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass36O A01;

    public C50059FLz(Context context, AnonymousClass36O r2) {
        this.A01 = r2;
        this.A00 = context;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.ELT, X.FBc] */
    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1517187075);
        AnonymousClass36O r2 = this.A01;
        AnonymousClass36O.A0C = "manage_sync_settings";
        UserSession userSession = r2.A04;
        AnonymousClass36X r5 = AnonymousClass36O.A0B;
        00y.A0n(10, userSession.A06);
        C46653DiY.A00(r5, userSession, AnonymousClass000.A00(748), "im_settings", AnonymousClass36O.A0C, (String) null, (Map) null);
        Fragment fragment = r2.A01;
        FGS.A02(C48144EZm.EDIT_PHOTO_REMINDER, userSession, "reminder_manage_settings");
        AnonymousClass1ZD r22 = AnonymousClass1ZD.A02;
        if (r22 != null) {
            ? fBc = new C49878FBc(fragment, (0lg) userSession);
            fBc.A00 = 0;
            r22.A00 = fBc;
            fBc.A04("PHOTO_SETTINGS");
            AnonymousClass36Q.A00();
            AnonymousClass0fD.A0C(-1267774987, A05);
            return;
        }
        DbS.A15();
        throw AnonymousClass00P.createAndThrow();
    }
}
