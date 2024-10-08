package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Telephony;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

public final class ES0 extends C47518E6c implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FollowAndInviteOptionsFragment";
    public FEU A00;
    public FF7 A01;
    public boolean A02;
    public final String A03 = "settings_follow_and_invite_options";
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final String A05 = "settings_follow_and_invite_options";

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        C47518E6c.A04(this, r2, 2131962536);
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1514449706);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(754060516, A022);
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [X.0r1, java.lang.Object] */
    public final void onResume() {
        PR9 pr9;
        int A022 = AnonymousClass0fD.A02(-947963742);
        super.onResume();
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass0eM r2 = this.A04;
        FF7 ff7 = new FF7(this, this, AnonymousClass7TE.A0l(r2), this);
        this.A01 = ff7;
        UserSession userSession = ff7.A04;
        0eE r6 = AnonymousClass0t1.A01;
        if (DbS.A0h(userSession, r6).By1() != null || C49966FGz.A05(userSession)) {
            Fragment fragment = ff7.A02;
            C46448DfA dfA = new C46448DfA((CharSequence) DbV.A05(fragment).getString(2131974109));
            dfA.A0I = false;
            dfA.A0M = true;
            A1C.add(dfA);
            if (C49966FGz.A05(userSession)) {
                String A0d = AnonymousClass7TF.A0d(DbV.A05(fragment), 2131953347);
                ? obj = new Object();
                obj.A00 = true;
                PR9 pr92 = new PR9((CompoundButton.OnCheckedChangeListener) new FQ1(13, obj, ff7), (CharSequence) A0d, false);
                ff7.A01 = pr92;
                A1C.add(pr92);
                pr92.A0D = AnonymousClass7TG.A1X(DbS.A0h(userSession, r6).CP3());
                FGF fgf = new FGF((CharSequence) DbV.A05(fragment).getString(2131953346));
                fgf.A01 = R.style.PrivacyTextStyle;
                A1C.add(fgf);
            }
            Boolean By1 = DbS.A0h(userSession, r6).By1();
            if (By1 != null) {
                boolean booleanValue = By1.booleanValue();
                A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) new FQO(ff7, 23), (CharSequence) AnonymousClass7TF.A0d(DbV.A05(fragment), 2131974111), booleanValue));
                Uri A07 = DbV.A07(fragment.requireContext(), "https://help.instagram.com/1542122179895279");
                String string = Dbb.A09(fragment, A07).getString(2131964884);
                FGF fgf2 = new FGF(AnonymousClass7AV.A00(A07, string, AnonymousClass7TF.A0e(Dbb.A09(fragment, string), string, 2131974110)));
                fgf2.A01 = R.style.PrivacyTextStyle;
                A1C.add(fgf2);
            }
            C46448DfA dfA2 = new C46448DfA((CharSequence) DbV.A05(fragment).getString(2131956602));
            dfA2.A0I = true;
            A1C.add(dfA2);
        }
        Fragment fragment2 = ff7.A02;
        Context context = fragment2.getContext();
        if (context != null) {
            if (!C267044ar.A01(context, userSession)) {
                ff7.A03(A1C, AnonymousClass7TF.A0d(DbV.A05(fragment2), 2131962540));
            }
            Context requireContext = fragment2.requireContext();
            String str = 0oI.A02;
            try {
                requireContext.getPackageManager().getPackageInfo("com.whatsapp", 128);
                if (182.A06(0Tu.A05, userSession, 36312458134029434L)) {
                    ff7.A06(A1C, AnonymousClass7TF.A0d(DbV.A05(fragment2), 2131964506));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            ff7.A02(A1C, DbV.A05(fragment2).getString(2131964486));
            if (Telephony.Sms.getDefaultSmsPackage(fragment2.getContext()) != null) {
                ff7.A05(A1C, AnonymousClass7TF.A0d(DbV.A05(fragment2), 2131964487));
            }
            ff7.A04(A1C, DbV.A05(fragment2).getString(2131964485));
            setItems(A1C);
            FF7 ff72 = this.A01;
            if (!(ff72 == null || (pr9 = ff72.A01) == null)) {
                this.A02 = pr9.A0D;
                FEU feu = new FEU(new C50233FUp(this), AnonymousClass7TE.A0l(r2));
                this.A00 = feu;
                0Aj A002 = FEU.A00(feu);
                Dbb.A1A(C48138EZg.SYSTEM_SETTING, A002);
                FEU.A01(A002, feu);
            }
            AnonymousClass0fD.A09(-2025366424, A022);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onStop() {
        PR9 pr9;
        0Aj A002;
        C48139EZh eZh;
        int A022 = AnonymousClass0fD.A02(660560238);
        ES0.super.onStop();
        FF7 ff7 = this.A01;
        if (!(ff7 == null || (pr9 = ff7.A01) == null)) {
            boolean z = pr9.A0D;
            boolean z2 = this.A02;
            FEU feu = this.A00;
            if (z) {
                if (z2) {
                    if (feu != null) {
                        A002 = FEU.A00(feu);
                        A002.A8M(C48138EZg.SYSTEM_SETTING, "format");
                        eZh = C48139EZh.TOGGLE_UNCHANGED_ON;
                    }
                } else if (feu != null) {
                    0Aj A003 = FEU.A00(feu);
                    A003.A8M(C48138EZg.SYSTEM_SETTING, "format");
                    A003.A8M(C48139EZh.TOGGLE_ON, "action");
                    FEU.A01(A003, feu);
                }
            } else if (!z2) {
                if (feu != null) {
                    A002 = FEU.A00(feu);
                    A002.A8M(C48138EZg.SYSTEM_SETTING, "format");
                    eZh = C48139EZh.TOGGLE_UNCHANGED_OFF;
                }
            } else if (feu != null) {
                0Aj A004 = FEU.A00(feu);
                A004.A8M(C48138EZg.SYSTEM_SETTING, "format");
                A004.A8M(C48139EZh.TOGGLE_OFF, "action");
                FEU.A01(A004, feu);
            }
            A002.A8M(eZh, "action");
            DbS.A1K(A002, feu.A01);
            A002.Cgf();
        }
        AnonymousClass0fD.A09(-425993702, A022);
    }
}
