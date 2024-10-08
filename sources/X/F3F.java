package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

public final class F3F {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final F3X A02;

    public final void A01(String str, String str2, String str3) {
        Bundle A0C = DbY.A0C(C273654mx.A00(329), str3, AnonymousClass7TE.A1L("video_fbid", str2), AnonymousClass7TE.A1L(C273654mx.A00(91), str));
        FragmentActivity fragmentActivity = this.A00;
        AnonymousClass6W8 A0b = DbS.A0b(fragmentActivity, A0C, this.A01, ModalActivity.class, C273654mx.A00(2342));
        A0b.A0A = true;
        A0b.A0C(fragmentActivity);
    }

    public /* synthetic */ F3F(FragmentActivity fragmentActivity, UserSession userSession) {
        F3X A002 = FC8.A00();
        AnonymousClass7TG.A1U(userSession, fragmentActivity, A002);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = A002;
    }

    public final void A00(Context context) {
        FC8.A01();
        IgBloksScreenConfig A0N = DbS.A0N(this.A01);
        A0N.A0R = "com.bloks.www.ig_subscriptions.creator_experience.welcome_experience";
        HashMap A1E = AnonymousClass7TE.A1E();
        HashMap A1E2 = AnonymousClass7TE.A1E();
        HashMap A0v = DbX.A0v();
        C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig_subscriptions.creator_experience.welcome_experience", A1E, A1E2);
        A05.A03 = null;
        A05.A02 = null;
        A05.A04 = null;
        A05.A0H(A0v);
        A05.A0D(context, A0N);
    }
}
