package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;

public final class EN1 extends C47480E4f {
    public static final String __redex_internal_original_name = "CreatorRevshareSettingsFragment";
    public final AnonymousClass0eM A00;

    public final void configureActionBar(2da r4) {
        int i;
        0qQ.A0B(r4, 0);
        C46775Dl2 A0b = DbV.A0b(this);
        if (A0b.A00.ordinal() == 2) {
            i = 2131963625;
        } else {
            i = 2131963662;
            if (C49785F6t.A01(A0b.A02)) {
                i = 2131963703;
            }
        }
        r4.Eom(i);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_settings_pano_outline_24;
        A0K.A05 = 2131963661;
        DbX.A19(new FPD((Object) this, 44), A0K, r4);
        r4.Eu4(true);
    }

    public final String getModuleName() {
        return "creator_revshare_setting";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public EN1() {
        C51791G2a g2a = new C51791G2a(this, 26);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C51791G2a(new C51791G2a(this, 27), 28));
        this.A00 = DbS.A0I(new C51791G2a(A002, 29), g2a, new MJ4(1, (Object) null, A002), DbS.A0z(C46775Dl2.class));
    }
}
