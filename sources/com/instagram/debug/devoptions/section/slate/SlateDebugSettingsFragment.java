package com.instagram.debug.devoptions.section.slate;

import X.09i;
import X.0qQ;
import X.0tS;
import X.2da;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.AnonymousClass0wW;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C47518E6c;
import X.DbS;
import X.DbT;
import X.DbW;
import X.PR9;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import java.util.ArrayList;

public final class SlateDebugSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public AnonymousClass0wW session;

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1C(r2, "SLATE Debug Settings");
    }

    public String getModuleName() {
        return "slate_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        0tS A0h = DbT.A0h();
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.add(new PR9((CompoundButton.OnCheckedChangeListener) new SlateDebugSettingsFragment$onViewCreated$1(A0h), (CharSequence) "Included images overlay", AnonymousClass7TG.A1a(A0h, A0h.A0p, 0tS.A4G, 251)));
        setItems(A1C);
    }

    public void setSession(AnonymousClass0wW r2) {
        0qQ.A0B(r2, 0);
        this.session = r2;
    }

    public AnonymousClass0wW getSession() {
        AnonymousClass0wW r0 = this.session;
        if (r0 != null) {
            return r0;
        }
        DbS.A14();
        throw AnonymousClass00P.createAndThrow();
    }

    public void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(814721217);
        super.onCreate(bundle);
        setSession(09i.A0A.A04(requireArguments()));
        AnonymousClass0fD.A09(753369747, A02);
    }
}
