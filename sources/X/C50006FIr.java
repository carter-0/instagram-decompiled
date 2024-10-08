package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FIr  reason: case insensitive filesystem */
public final class C50006FIr implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4AD A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C50006FIr(FragmentActivity fragmentActivity, AnonymousClass0iw r2, UserSession userSession, AnonymousClass4AD r4, User user, String str, String str2) {
        this.A00 = fragmentActivity;
        this.A02 = userSession;
        this.A04 = user;
        this.A01 = r2;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = r4;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47697EDg A002 = C47697EDg.A00(this.A03, 45);
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A02;
        User user = this.A04;
        1OC A003 = C49177Eqi.A00(userSession, user.getId(), this.A01.getModuleName(), this.A06, this.A05, true);
        A003.A00 = new C61497KAc(2, fragmentActivity, A002, user, true);
        1ES.A03(A003);
    }
}
