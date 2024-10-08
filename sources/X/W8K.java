package X;

import android.content.Context;
import android.view.View;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class W8K implements View.OnClickListener {
    public final /* synthetic */ C306146Ky A00;

    public W8K(C306146Ky r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int i;
        List list;
        List list2;
        032 A03;
        int i2;
        int A05 = AnonymousClass0fD.A05(-1557882276);
        C306146Ky r5 = this.A00;
        C306146Ky.A00(r5).A0F(C306146Ky.A01(r5).A08(), "done_button");
        U92 A01 = C306146Ky.A01(r5);
        Context context = r5.getContext();
        List list3 = A01.A09().A07;
        if (list3 != null) {
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        String str = A01.A09().A05;
        if (str != null && str.length() != 0 && A01.A09().A00 > 0 && A01.A09().A01 > 0 && (list = A01.A09().A06) != null && !list.isEmpty() && (list2 = A01.A09().A07) != null && !list2.isEmpty()) {
            boolean A1V = AnonymousClass7TF.A1V(A01.A04);
            UL0 A012 = U92.A01(A01.A00, A01.A09(), A01.A03, A01.A05);
            UserSession userSession = A012.A08;
            if (A1V) {
                String str2 = A012.A0A;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = A012.A0B;
                if (str3 == null) {
                    str3 = "";
                }
                int i3 = A012.A03;
                int i4 = A012.A02;
                0sn r12 = A012.A0H;
                if (r12 == null) {
                    r12 = 0sn.A00;
                }
                List list4 = A012.A0I;
                List list5 = A012.A0G;
                List list6 = A012.A0J;
                List list7 = A012.A0F;
                List list8 = A012.A0K;
                TargetingRelaxationConstants targetingRelaxationConstants = A012.A06;
                AdvantageAudienceData advantageAudienceData = A012.A05;
                double d = A012.A00;
                double d2 = A012.A01;
                int i5 = A012.A04;
                0sn r17 = r12;
                List list9 = list7;
                List list10 = list8;
                TargetingRelaxationConstants targetingRelaxationConstants2 = targetingRelaxationConstants;
                UserSession userSession2 = userSession;
                String str4 = str2;
                String str5 = str3;
                A03 = C18765W0j.A00(advantageAudienceData, targetingRelaxationConstants2, userSession2, str4, str5, A012.A09, r17, list4, list5, list6, list9, list10, d, d2, i3, i4, i5).A03(1391975297);
                i2 = 38;
            } else {
                String str6 = A012.A0B;
                if (str6 == null) {
                    str6 = "";
                }
                int i6 = A012.A03;
                int i7 = A012.A02;
                0sn r122 = A012.A0H;
                if (r122 == null) {
                    r122 = 0sn.A00;
                }
                List list11 = A012.A0I;
                List list12 = A012.A0G;
                List list13 = A012.A0J;
                List list14 = A012.A0F;
                List list15 = A012.A0K;
                TargetingRelaxationConstants targetingRelaxationConstants3 = A012.A06;
                AdvantageAudienceData advantageAudienceData2 = A012.A05;
                double d3 = A012.A00;
                double d4 = A012.A01;
                int i8 = A012.A04;
                String str7 = A012.A09;
                0sn r172 = r122;
                List list16 = list14;
                List list17 = list15;
                TargetingRelaxationConstants targetingRelaxationConstants4 = targetingRelaxationConstants3;
                UserSession userSession3 = userSession;
                String str8 = str6;
                String str9 = str7;
                A03 = W2V.A01(advantageAudienceData2, targetingRelaxationConstants4, userSession3, str8, str9, A012.A0C, r172, list11, list12, list13, list16, list17, d3, d4, i6, i7, i8).A03(1391975297);
                i2 = 39;
            }
            DbY.A19(A01, new MGZ(A01, (AnonymousClass4D7) null, i2), A03);
        } else if (context != null) {
            String str10 = A01.A09().A05;
            if (str10 == null || str10.length() == 0) {
                i = 2131970341;
            } else {
                List list18 = A01.A09().A07;
                if (list18 == null || list18.isEmpty()) {
                    i = 2131970340;
                }
            }
            U92.A04(A01, AnonymousClass7TE.A16(context, i));
        }
        AnonymousClass0fD.A0C(486883375, A05);
    }
}
