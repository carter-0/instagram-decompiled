package com.instagram.debug.devoptions.section.survey;

import X.002;
import X.0qQ;
import X.2da;
import X.AnonymousClass0eM;
import X.AnonymousClass2yJ;
import X.AnonymousClass4DS;
import X.AnonymousClass7TE;
import X.C227642jf;
import X.C47518E6c;
import X.DbS;
import X.DbT;
import X.DbV;
import X.DbW;
import X.FGF;
import android.os.Bundle;
import android.view.View;
import com.google.common.collect.ImmutableMap;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class SessionSurveyInternalSettingsFragment extends C47518E6c implements AnonymousClass4DS {
    public final AnonymousClass0eM session$delegate = C227642jf.A02(this);

    public void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131958310);
    }

    public String getModuleName() {
        return "session_survey_debug_settings";
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImmutableMap copyOf = ImmutableMap.copyOf(AnonymousClass2yJ.A00);
        ArrayList A15 = DbV.A15(copyOf);
        if (copyOf.isEmpty()) {
            FGF.A01(A15, 2131958311);
        } else {
            Iterator it = copyOf.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                A15.add(new FGF((CharSequence) 002.A0g(DbT.A13(A1J), " = ", DbS.A0s(A1J))));
            }
        }
        setItems(A15);
    }

    public UserSession getSession() {
        return AnonymousClass7TE.A0l(this.session$delegate);
    }
}
