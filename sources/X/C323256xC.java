package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6xC  reason: invalid class name and case insensitive filesystem */
public final class C323256xC {
    public List A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final Context A05;
    public final FragmentActivity A06;
    public final AnonymousClass4DH A07;
    public final C2355930l A08;
    public final UserSession A09;
    public final AnonymousClass4DU A0A;
    public final C318866pf A0B;
    public final C318856pe A0C;
    public final C323336xK A0D;
    public final User A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;

    public static int A00(C323256xC r4) {
        UserSession userSession = r4.A09;
        1Av A002 = 1Au.A00(userSession);
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36324076020969210L) && 182.A06(r2, userSession, 36324076022542080L)) {
            0s0 r1 = A002.A1p;
            AnonymousClass0YZ[] r22 = 1Av.A8a;
            if (((Boolean) r1.CDM(A002, r22[451])).booleanValue() || ((Boolean) A002.A5b.CDM(A002, r22[450])).booleanValue()) {
                return 0;
            }
            return 1;
        }
        return 0;
    }

    public static void A01(C323256xC r12) {
        UserSession userSession = r12.A09;
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("barcelona_has_tapped_profile_menu_option", true);
        AR4.apply();
        C321406u6.A03(r12.A0A, userSession, (Integer) null, (Integer) null, (Integer) null, "settings", r12.A0I, (String) null, (String) null, (String) null, 0oI.A0A(r12.A05));
    }

    public final int A02() {
        Boolean Bv6;
        User user = this.A0E;
        if (user == null || (Bv6 = user.A03.Bv6()) == null || !Bv6.booleanValue() || 1Au.A00(this.A09).A01.getBoolean("has_tapped_on_favorites_profile_navbar_icon", false)) {
            return 0;
        }
        return 1;
    }

    public final int A03() {
        List<C319156q8> list = this.A00;
        int i = 0;
        if (list != null) {
            for (C319156q8 A012 : list) {
                if (A012.A01() != C50691Fgq.A00) {
                    i++;
                }
            }
        }
        return i;
    }

    public final void A05() {
        this.A0E.getClass();
        C322576w3.A00();
        Intent intent = new Intent(this.A06, BusinessConversionActivity.class);
        Bundle requireArguments = this.A07.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "setting");
        requireArguments.putInt("intro_entry_position", 0);
        C358248ab r2 = new C358248ab(this.A05);
        r2.A09(2131973991);
        r2.A08(2131973992);
        r2.A0I(new FIP(intent, requireArguments, this), 2131956706);
        r2.A0H((DialogInterface.OnClickListener) null, 2131968513);
        AnonymousClass0fN.A00(r2.A02());
    }

    public C323256xC(Context context, FragmentActivity fragmentActivity, AnonymousClass4DH r3, C2355930l r4, UserSession userSession, AnonymousClass4DU r6, C318866pf r7, C318856pe r8, C323336xK r9, User user, String str, String str2, String str3, String str4) {
        this.A05 = context;
        this.A06 = fragmentActivity;
        this.A09 = userSession;
        this.A07 = r3;
        this.A0A = r6;
        this.A0E = user;
        this.A0I = str;
        this.A0G = str2;
        this.A0H = str3;
        this.A0F = str4;
        this.A08 = r4;
        this.A0B = r7;
        this.A0C = r8;
        this.A0D = r9;
    }

    public final int A04() {
        C65001Zz.A00();
        UserSession userSession = this.A09;
        0Tu r2 = 0Tu.A05;
        if (!182.A06(r2, userSession, 36322353738688598L) || !182.A06(r2, userSession, 36322353739147357L)) {
            return 0;
        }
        C65001Zz.A00();
        1Av A002 = 1Au.A00(userSession);
        return ((Number) A002.A8R.CDM(A002, 1Av.A8a[490])).intValue();
    }

    public C323256xC(FragmentActivity fragmentActivity, AnonymousClass4DH r3, UserSession userSession, AnonymousClass4DU r5) {
        this.A05 = r3.requireContext();
        this.A06 = fragmentActivity;
        this.A09 = userSession;
        this.A07 = r3;
        this.A0A = r5;
        User A012 = AnonymousClass0t1.A01.A01(userSession);
        this.A0E = A012;
        this.A0I = A012.getId();
        this.A0G = "";
        this.A0H = "";
        this.A0F = "";
        this.A08 = new C2355930l(fragmentActivity, userSession);
        this.A0B = new C318866pf(r3, userSession);
        this.A0C = new C318856pe(fragmentActivity, r3, userSession, r3);
        this.A0D = null;
    }
}
