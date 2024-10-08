package com.instagram.debug.devoptions.section.igsignals;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C50989Fmc;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.intf.DeveloperOptionsSection;
import java.util.List;

public final class IgSignalsOptions implements DeveloperOptionsSection {
    public static final IgSignalsOptions INSTANCE = new Object();

    /* access modifiers changed from: private */
    public final void showCasperResult(UserSession userSession, Context context, View view, long j) {
        AnonymousClass7TF.A0D().post(new IgSignalsOptions$showCasperResult$1(context, j));
    }

    public List getItems(UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r6, AnonymousClass07i r7) {
        AnonymousClass7TG.A1N(userSession, fragmentActivity);
        return AnonymousClass7TE.A1I(new C50989Fmc((Context) fragmentActivity, (View.OnClickListener) new IgSignalsOptions$getItems$1(userSession, fragmentActivity), (CharSequence) fragmentActivity.getString(2131958032)));
    }

    public int getTitleRes() {
        return 2131958031;
    }
}
