package com.instagram.inappbrowser.expandablefooter;

import X.0qQ;
import X.1Xj;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.C10310Rq8;
import X.C13674Tej;
import X.C13822Ths;
import X.C51974G9v;
import X.C68181N3w;
import X.C8944RGm;
import X.SlJ;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;
import com.facebook.graphql.enums.EnumHelper;
import com.instagram.common.session.UserSession;

public final class IGExpandableFooterManager$fetchFromGraphQL$1 extends IABExpandableFooterCallback.Stub {
    public final /* synthetic */ SlJ A00;

    public IGExpandableFooterManager$fetchFromGraphQL$1(SlJ slJ) {
        this.A00 = slJ;
        AnonymousClass0fD.A0A(-917089241, AnonymousClass0fD.A03(-1384374754));
    }

    public final void Czr(String str, String str2, double d, String str3) {
        int A03 = AnonymousClass0fD.A03(71184434);
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        C51974G9v.A1K(str4, str5, str6);
        SlJ slJ = this.A00;
        C8944RGm rGm = (C8944RGm) EnumHelper.A00(str5, C8944RGm.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        0qQ.A07(rGm);
        C13674Tej tej = (C13674Tej) slJ.A0J.get(rGm);
        if (tej != null) {
            UserSession userSession = slJ.A0B;
            String str7 = slJ.A0F;
            String str8 = slJ.A02;
            FragmentActivity fragmentActivity = slJ.A09;
            AnonymousClass0iw r7 = slJ.A0A;
            String str9 = slJ.A0H;
            String str10 = slJ.A0E;
            String str11 = slJ.A0I;
            1Xj r3 = slJ.A0C;
            String str12 = str4;
            String str13 = str6;
            C10310Rq8 rq8 = slJ.A0D;
            String str14 = str7;
            1Xj r20 = r3;
            C8944RGm rGm2 = rGm;
            AnonymousClass0iw r18 = r7;
            UserSession userSession2 = userSession;
            Bundle bundle = slJ.A07;
            FragmentActivity fragmentActivity2 = fragmentActivity;
            C13822Ths BHv = tej.BHv(new C68181N3w(bundle, fragmentActivity2, r18, userSession2, r20, rGm2, rq8, str14, str8, str9, str10, str11, str12, str13));
            slJ.A01 = BHv;
            BHv.EF2(slJ.A08);
        }
        AnonymousClass0fD.A0A(-939454660, A03);
    }
}
