package com.instagram.debug.devoptions.section.newusernux;

import X.002;
import X.0qQ;
import X.0s0;
import X.0tS;
import X.1wn;
import X.1xC;
import X.AnonymousClass07i;
import X.AnonymousClass0YZ;
import X.AnonymousClass0fD;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C50256FVn;
import X.C50989Fmc;
import X.C63040xi;
import X.DbS;
import X.Dba;
import X.PR9;
import android.content.Context;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.ArrayList;
import java.util.List;

public final class NewUserNuxOptions implements DeveloperOptionsSection {
    public static final NewUserNuxOptions INSTANCE = new Object();

    public final class OnboardingStatusEventListener implements 1wn {
        public final Context context;

        public OnboardingStatusEventListener(Context context2) {
            0qQ.A0B(context2, 1);
            this.context = context2;
        }

        public void onEvent(C50256FVn fVn) {
            int A0D = AnonymousClass7TG.A0D(fVn, 1210778336);
            Dba.A0r(this.context, 002.A0R("Onboarding steps updated:\n\n", fVn.A00));
            1xC.A01.A03(this, C50256FVn.class);
            AnonymousClass0fD.A0A(-872554896, A0D);
        }

        public /* bridge */ /* synthetic */ void onEvent(Object obj) {
            int A03 = AnonymousClass0fD.A03(1488514221);
            onEvent((C50256FVn) obj);
            AnonymousClass0fD.A0A(-1382473319, A03);
        }
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r10, AnonymousClass07i r11) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        ArrayList A1C = AnonymousClass7TE.A1C();
        C63040xi r6 = 0tS.A4E;
        0tS A00 = r6.A00();
        0s0 r1 = A00.A2Y;
        AnonymousClass0YZ[] r5 = 0tS.A4G;
        A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) NewUserNuxOptions$getItems$1.INSTANCE, (CharSequence) "Run NUX on login", AnonymousClass7TG.A1a(A00, r1, r5, 137)));
        0tS A002 = r6.A00();
        A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) NewUserNuxOptions$getItems$2.INSTANCE, (CharSequence) "Run NDX on cold start", AnonymousClass7TG.A1a(A002, A002.A2X, r5, 138)));
        0tS A003 = r6.A00();
        A1C.add(DbS.A0f(NewUserNuxOptions$getItems$3.INSTANCE, 2131958348, AnonymousClass7TG.A1a(A003, A003.A34, r5, 158)));
        C50989Fmc.A01(fragmentActivity, new NewUserNuxOptions$getItems$4(fragmentActivity, userSession), "Request NUX Plugin Steps", A1C);
        C50989Fmc.A02(fragmentActivity, new NewUserNuxOptions$getItems$5(fragmentActivity, userSession), A1C, 2131958073);
        C50989Fmc.A02(fragmentActivity, new NewUserNuxOptions$getItems$6(fragmentActivity, userSession), A1C, 2131958075);
        C50989Fmc.A02(fragmentActivity, new NewUserNuxOptions$getItems$7(fragmentActivity, userSession), A1C, 2131958074);
        C50989Fmc.A02(fragmentActivity, new NewUserNuxOptions$getItems$8(fragmentActivity, userSession), A1C, 2131958076);
        C50989Fmc.A01(fragmentActivity, new NewUserNuxOptions$getItems$9(fragmentActivity, userSession), "Open NUX Interest Picker", A1C);
        C50989Fmc.A01(fragmentActivity, new NewUserNuxOptions$getItems$10(fragmentActivity, userSession), "Launch Custom NUX Flow", A1C);
        return A1C;
    }

    public int getTitleRes() {
        return 2131958139;
    }
}
