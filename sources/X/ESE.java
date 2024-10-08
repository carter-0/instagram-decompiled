package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.android.R;
import com.instagram.api.schemas.HasPasswordState;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;

public final class ESE extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SecurityOptionsFragment";
    public UserSession A00;
    public C47093DqU A01;
    public EyI A02;

    public final String getModuleName() {
        return "security_options";
    }

    public static C50989Fmc A06(Context context, EyI eyI, int i, int i2) {
        return new C50989Fmc(context, (View.OnClickListener) new FP9(eyI, i), i2);
    }

    public final AnonymousClass0wW getSession() {
        return this.A00;
    }

    public static void A07(ESE ese) {
        FragmentActivity fragmentActivity;
        int i;
        int i2;
        User user;
        ArrayList A1C = AnonymousClass7TE.A1C();
        EyI eyI = ese.A02;
        C46448DfA.A02(A1C, 2131973390);
        UserSession userSession = eyI.A01;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36314360804542991L)) {
            fragmentActivity = eyI.A00;
            i = 2131963006;
            i2 = 60;
        } else {
            AccountFamily A09 = Dba.A09(AnonymousClass9BG.A01(userSession), userSession);
            if (A09 == null || (user = A09.A01) == null || user.A03.BBn() != HasPasswordState.FALSE || !1AW.A06(r4, 18296620810502557L)) {
                boolean A1a = DbT.A1a(DbV.A0d(), "has_one_clicked_logged_in");
                fragmentActivity = eyI.A00;
                i = 2131963006;
                i2 = 63;
                if (A1a) {
                    i2 = 62;
                }
            } else {
                fragmentActivity = eyI.A00;
                i = 2131956880;
                i2 = 61;
            }
        }
        C50989Fmc A06 = A06(fragmentActivity, eyI, i2, i);
        A06.A03 = R.drawable.instagram_key_pano_outline_24;
        A1C.add(A06);
        C50989Fmc A062 = A06(fragmentActivity, eyI, 66, 2131965558);
        A062.A03 = R.drawable.instagram_location_pano_outline_24;
        A1C.add(A062);
        C50989Fmc A063 = A06(fragmentActivity, eyI, 64, 2131965847);
        A063.A03 = R.drawable.instagram_keyhole_pano_outline_24;
        A1C.add(A063);
        C50989Fmc A064 = A06(fragmentActivity, eyI, 65, 2131965605);
        A064.A03 = R.drawable.instagram_authentication_pano_outline_24;
        A1C.add(A064);
        C50989Fmc A065 = A06(fragmentActivity, eyI, 67, 2131961576);
        A065.A03 = R.drawable.instagram_mail_pano_outline_24;
        A1C.add(A065);
        C50989Fmc A066 = A06(fragmentActivity, eyI, 58, 2131972958);
        A066.A03 = R.drawable.instagram_shield_pano_outline_24;
        A1C.add(A066);
        DbV.A1W(A1C, true);
        C46448DfA.A02(A1C, 2131973376);
        C50989Fmc A067 = A06(fragmentActivity, eyI, 59, 2131953103);
        A067.A03 = R.drawable.instagram_device_mixed_pano_outline_24;
        A1C.add(A067);
        ese.setItems(A1C);
    }

    public final void configureActionBar(2da r2) {
        C47518E6c.A04(this, r2, 2131972968);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == 7 && intent != null && intent.getExtras() != null && intent.getExtras().getBoolean("password_updated_key", false)) {
            A07(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1762878008);
        super.onCreate(bundle);
        UserSession A0U = DbX.A0U(this);
        this.A00 = A0U;
        this.A02 = new EyI(A0U, this);
        AnonymousClass0fD.A09(-608960045, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C47696EDf.A00(this, C46479Dfi.A00(new C239113Fa(C41845B3m.A04(), C47095DqW.class, "FxSettingsSecurityTransition", false), this.A00), 35);
        A07(this);
        02m r3 = 02m.A0p;
        r3.markerAnnotate(857808781, "node_identifier", "security_and_login");
        r3.markerEnd(857808781, 2);
        0xG A0O = DbS.A0O("contact_point_update");
        AnonymousClass1pc.A00().CnQ(requireContext(), A0O, this.A00, C54660HMr.SECURITY_SETTINGS);
    }
}
