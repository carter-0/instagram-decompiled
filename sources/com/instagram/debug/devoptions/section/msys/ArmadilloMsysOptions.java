package com.instagram.debug.devoptions.section.msys;

import X.0sr;
import X.0tS;
import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import X.C74278Ps6;
import X.DbT;
import X.PR9;
import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import androidx.fragment.app.FragmentActivity;
import com.facebook.advancedcryptotransport.AppInstallContext;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class ArmadilloMsysOptions implements DeveloperOptionsSection {
    public static final ArmadilloMsysOptions INSTANCE = new Object();
    public static final String TAG = "ArmadilloMsysOptions";

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r10, AnonymousClass07i r11) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        0tS A0h = DbT.A0h();
        return 0sr.A1P(new C74278Ps6[]{new PR9((CompoundButton.OnCheckedChangeListener) ArmadilloMsysOptions$getItems$1.INSTANCE, (CharSequence) "[msys] Armadillo Debug Overlay", AnonymousClass7TG.A1a(A0h, A0h.A1f, 0tS.A4G, 47)), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ArmadilloMsysOptions$getItems$2(userSession, fragmentActivity), (CharSequence) "[msys] Trigger msys mailbox initialization"), new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new ArmadilloMsysOptions$getItems$3(fragmentActivity, userSession), (CharSequence) "[msys] Show Mailbox Decoupling Settings"), new PR9((CompoundButton.OnCheckedChangeListener) new ArmadilloMsysOptions$getItems$4(userSession), (CharSequence) "[msys] Fail next send with empty device list error", AppInstallContext.sShouldFailSendWithEmptyDeviceListEncryptionError)});
    }

    public int getTitleRes() {
        return 2131957717;
    }
}
