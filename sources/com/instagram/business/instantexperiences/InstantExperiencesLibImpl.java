package com.instagram.business.instantexperiences;

import X.0qQ;
import X.2EG;
import X.C51974G9v;
import X.C66580MXl;
import X.DbY;
import X.S00;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.instagram.business.instantexperiences.ui.InstantExperiencesBrowserActivity;
import com.instagram.common.session.UserSession;

public final class InstantExperiencesLibImpl extends S00 {
    public Intent getInstantExperiencesIntent(Context context, String str, UserSession userSession, String str2, String str3, 2EG r10, String str4) {
        0qQ.A0B(context, 0);
        C51974G9v.A1P(str, userSession, str2, str3);
        0qQ.A0B(r10, 5);
        Intent A0A = C66580MXl.A0A(context, InstantExperiencesBrowserActivity.class);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("business_id", str);
        A09.putString("website_url", str2);
        A09.putString("source", str3);
        A09.putString("app_id", str4);
        A09.putString("surface", r10.toString());
        A0A.putExtras(A09);
        return A0A;
    }
}
