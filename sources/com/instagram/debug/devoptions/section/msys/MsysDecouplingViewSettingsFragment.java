package com.instagram.debug.devoptions.section.msys;

import X.002;
import X.0qQ;
import X.0sr;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C46331Dbz;
import X.C47518E6c;
import X.C66612MYy;
import X.DbS;
import X.DbW;
import X.FGF;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class MsysDecouplingViewSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public final AnonymousClass0eM session$delegate = C227642jf.A01(this);
    public final AnonymousClass0eM userSession$delegate = C227642jf.A02(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "[msys] Mailbox Bootstrap Decoupling Settings");
    }

    public String getModuleName() {
        return "video_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        setItems(0sr.A1P(new FGF[]{new FGF((CharSequence) 002.A0R("ArmadilloExpressDBAwareGatingManager:\n", C66612MYy.A00.A01(AnonymousClass7TE.A0l(this.userSession$delegate)))), new FGF((CharSequence) 002.A0R("ArmadilloExpressBootstrapGatingManager:\n", C46331Dbz.A00.A00(AnonymousClass7TE.A0l(this.userSession$delegate))))}));
    }

    public AnonymousClass0wW getSession() {
        return DbS.A0T(this.session$delegate);
    }

    public final UserSession getUserSession() {
        return AnonymousClass7TE.A0l(this.userSession$delegate);
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-2056091202);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(-2018400231, A02);
    }
}
