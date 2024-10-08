package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class E40 extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ConfirmationFragment";
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        r4.Eom(2131956504);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A0K = DbV.A05(this).getString(2131960992);
        DbX.A19(FPB.A00(this, 4), A0K, r4);
    }

    public final String getModuleName() {
        return "brandedcontent_violation_confirmation";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        DbT.A1I(this);
        DbT.A1I(this);
        return true;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-773200442);
        E40.super.onCreate(bundle);
        this.A04 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_TITLE");
        this.A02 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_EXTRA_MESSAGE");
        this.A00 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_ID");
        this.A03 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_NOTIF_SOURCE", "");
        this.A01 = requireArguments().getString("ConfirmationFragment.ARGUMENT_KEY_MEDIA_TYPE", "");
        AnonymousClass0fD.A09(1886571054, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(-1222965749);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        View inflate = layoutInflater2.inflate(R.layout.confirmation_fragment, viewGroup, false);
        AnonymousClass7TE.A0d(inflate, R.id.title).setText(this.A04);
        AnonymousClass7TE.A0d(inflate, R.id.message).setText(this.A02);
        UserSession A0l = AnonymousClass7TE.A0l(this.A05);
        Integer num = AnonymousClass05K.A0o;
        String str2 = this.A03;
        if (str2 == null) {
            str = "notifSource";
        } else {
            0eP A1L = AnonymousClass7TE.A1L("notif_source", str2);
            String str3 = this.A01;
            if (str3 == null) {
                str = "mediaType";
            } else {
                JVF.A03(this, A0l, num, (Integer) null, (Integer) null, (String) null, (String) null, this.A00, (Throwable) null, DbY.A0p("media_type", str3, A1L));
                AnonymousClass0fD.A09(837303151, A022);
                return inflate;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
