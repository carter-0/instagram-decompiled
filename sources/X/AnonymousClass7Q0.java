package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.UUID;

/* renamed from: X.7Q0  reason: invalid class name */
public final class AnonymousClass7Q0 {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final C69670Nps A02;
    public final C331207Pz A03;
    public final C329327Il A04;
    public final List A05;

    public final void A00(Activity activity) {
        Bundle bundle = new Bundle();
        UserSession userSession = this.A01;
        C69670Nps nps = this.A02;
        String str = nps.A01;
        0qQ.A07(str);
        String str2 = nps.A02;
        0qQ.A07(str2);
        List list = this.A05;
        0xI A012 = C3265677h.A01(this.A00, "thread_reply_tap", str, str2);
        A012.A0D("recipient_ids", list);
        C60510iO.A00(userSession).EFq(A012);
        nps.A00(bundle);
        AnonymousClass0Dg.A00(bundle, userSession);
        P42 p42 = new P42(this);
        Fragment r2 = new AnonymousClass4DH();
        r2.A02 = p42;
        r2.setArguments(bundle);
        C331127Pr r1 = new C331127Pr(userSession);
        r1.A0a = true;
        r1.A03 = 0.6f;
        r1.A0U = new C72953PQl(r2, this);
        r1.A00().A02(activity, r2);
        this.A03.A00.A16();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Nps, java.lang.Object] */
    public AnonymousClass7Q0(AnonymousClass0iw r5, UserSession userSession, C331207Pz r7, C329327Il r8, List list) {
        this.A01 = userSession;
        this.A03 = r7;
        this.A05 = list;
        this.A00 = r5;
        this.A04 = r8;
        String obj = UUID.randomUUID().toString();
        ? obj2 = new Object();
        obj2.A01 = "direct_thread";
        obj2.A02 = obj;
        obj2.A00 = null;
        this.A02 = obj2;
    }
}
