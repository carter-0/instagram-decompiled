package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EQn  reason: case insensitive filesystem */
public final class C48004EQn extends EC6 {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass4DU A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48004EQn(Context context, View view, 0hq r3, UserSession userSession, AnonymousClass4DU r5, C255773uh r6, Runnable runnable, String str, boolean z) {
        super(context, view, r3, z);
        this.A03 = runnable;
        this.A00 = userSession;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = str;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String id;
        int A032 = AnonymousClass0fD.A03(-136780191);
        DvL dvL = (DvL) obj;
        int A033 = AnonymousClass0fD.A03(-1364925886);
        int A034 = AnonymousClass0fD.A03(1911547496);
        Context context = this.A00;
        0nC.A00(context, dvL.A00);
        C49118Eph.A00(context, this.A01, (String) null, this.A03);
        AnonymousClass0fD.A0A(1612674992, A034);
        String str = dvL.A00;
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A00;
        AnonymousClass4DU r5 = this.A01;
        C255773uh r0 = this.A02;
        String str2 = r0.A0j;
        String str3 = this.A04;
        C22031Xty.A0I(r5, userSession, str2, str3, "copy_link", str);
        User user = r0.A0i;
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        C46395DeI.A0W(userSession, r5, str2, str3, "copy_link", id, str);
        AnonymousClass0fD.A0A(213356805, A033);
        AnonymousClass0fD.A0A(314642188, A032);
    }

    public final void onFail(C268654dm r14) {
        String id;
        int A032 = AnonymousClass0fD.A03(1670664175);
        super.onFail(r14);
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
        UserSession userSession = this.A00;
        AnonymousClass4DU r3 = this.A01;
        C255773uh r0 = this.A02;
        String str = r0.A0j;
        String str2 = this.A04;
        C22031Xty.A0H(r3, userSession, str, str2, "copy_link", r14.A01());
        User user = r0.A0i;
        if (user == null) {
            id = null;
        } else {
            id = user.getId();
        }
        C46395DeI.A0W(userSession, r3, str, str2, "copy_link", id, (String) null);
        AnonymousClass0fD.A0A(2135845841, A032);
    }
}
