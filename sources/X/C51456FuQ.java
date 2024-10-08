package X;

import android.os.Bundle;
import android.text.TextUtils;
import com.instagram.android.R;
import com.instagram.user.model.User;

/* renamed from: X.FuQ  reason: case insensitive filesystem */
public final class C51456FuQ implements Runnable {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ EM2 A01;
    public final /* synthetic */ EDD A02;

    public C51456FuQ(Bundle bundle, EM2 em2, EDD edd) {
        this.A02 = edd;
        this.A00 = bundle;
        this.A01 = em2;
    }

    public final void run() {
        String str;
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putAll(this.A00);
        EDD edd = this.A02;
        02m.A0p.markerEnd(725096125, 4);
        EM2 em2 = this.A01;
        if (TextUtils.isEmpty(em2.A03)) {
            str = edd.A07;
        } else {
            str = em2.A03;
        }
        A0a.putString("lookup_user_input", str);
        User user = em2.A00;
        if (user != null) {
            A0a.putParcelable("user_profile_pic", user.Bh3());
        }
        A0a.putBoolean("can_email_reset", em2.A06);
        A0a.putBoolean("can_sms_reset", em2.A07);
        A0a.putBoolean("can_wa_reset", em2.A08);
        A0a.putBoolean("has_fb_login_option", em2.A0A);
        A0a.putString("lookup_source", em2.A04);
        Boolean bool = em2.A01;
        if (bool != null) {
            A0a.putBoolean("is_autoconf_test_user", bool.booleanValue());
        }
        C47483E4i e4i = edd.A05;
        if (!e4i.A0K && !e4i.requireActivity().isFinishing()) {
            DbT.A15();
            AnonymousClass0aP r3 = edd.A04;
            DbU.A1C(A0a);
            C47476E4a e4a = new C47476E4a();
            e4a.setArguments(A0a);
            06p r1 = edd.A02;
            if (r1 != null) {
                r1.A0A(e4a, R.id.layout_container_main);
                r1.A0I("recovery_lookup_screen");
                r1.A00();
                return;
            }
            Dbb.A12(e4a, edd.A01, r3);
        }
    }
}
