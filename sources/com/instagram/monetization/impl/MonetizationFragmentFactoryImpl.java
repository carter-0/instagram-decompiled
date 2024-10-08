package com.instagram.monetization.impl;

import X.0Tu;
import X.182;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C273654mx;
import X.C46649DiU;
import X.C49891FBs;
import X.DbS;
import X.E2Y;
import X.JVF;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.common.session.UserSession;

public final class MonetizationFragmentFactoryImpl implements AnonymousClass0iw {
    public final String getModuleName() {
        return "com.instagram.monetization.impl.MonetizationFragmentFactoryImpl";
    }

    public final Fragment A00(UserMonetizationProductType userMonetizationProductType, UserSession userSession, String str, boolean z) {
        AnonymousClass7TG.A1N(userSession, userMonetizationProductType);
        if (userMonetizationProductType == UserMonetizationProductType.BRANDED_CONTENT) {
            boolean z2 = true;
            boolean A1P = AnonymousClass7TF.A1P("eligible_pending_opt_in".equals(str) ? 1 : 0);
            boolean equals = "not_eligible".equals(str);
            if (!equals || 182.A06(0Tu.A05, userSession, 36314687222057729L)) {
                z2 = false;
            }
            if (A1P || z2) {
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("ARGUMENT_PRODUCT_TYPE", userMonetizationProductType.A00);
                if (str != null) {
                    A0a.putString(C273654mx.A00(205), str);
                }
                A0a.putBoolean(C273654mx.A00(206), z);
                E2Y e2y = new E2Y();
                e2y.setArguments(A0a);
                return e2y;
            } else if (equals) {
                JVF.A01(this, userSession, AnonymousClass05K.A01);
            }
        }
        return C49891FBs.A02(DbS.A0N(userSession), C46649DiU.A04("com.bloks.www.ig.creator_monetization.screens.creator_monetization_status", AnonymousClass7TE.A1E()));
    }
}
