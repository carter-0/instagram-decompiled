package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.Feg  reason: case insensitive filesystem */
public final class C50571Feg implements G7C {
    public final UserSession A00;
    public final Set A01 = 0sc.A07(new C48087EVf[]{C48087EVf.SURVEY_CLOSE_BUTTON, C48087EVf.SURVEY_SECONDARY_BUTTON, C48087EVf.SURVEY_PRIMARY_BUTTON});
    public final C62320sa A02;

    public final boolean AFM(C48087EVf eVf, C283155Gi r3, int i) {
        0qQ.A0B(eVf, 1);
        return this.A01.contains(eVf);
    }

    public final void AJS(View view, JV7 jv7, C48087EVf eVf, C283155Gi r20, int i) {
        String str;
        List list;
        List unmodifiableList;
        F3R f3r;
        String str2;
        List list2;
        List unmodifiableList2;
        F36 f36;
        String str3;
        List list3;
        List unmodifiableList3;
        F36 f362;
        String str4;
        0sP r0;
        C283155Gi r1 = r20;
        0qQ.A0B(r1, 0);
        C48087EVf eVf2 = eVf;
        0qQ.A0B(eVf2, 1);
        C49876FBa fBa = r1.A01;
        if (fBa != null && (str = fBa.A02) != null && (list = fBa.A04) != null && (unmodifiableList = Collections.unmodifiableList(list)) != null && (f3r = (F3R) 00k.A0J(unmodifiableList)) != null && (str2 = f3r.A01) != null && f3r.A03 != null && (list2 = f3r.A05) != null && (unmodifiableList2 = Collections.unmodifiableList(list2)) != null && (f36 = (F36) 00k.A0O(unmodifiableList2, 0)) != null && (str3 = f36.A00) != null && f36.A01 != null && (list3 = f3r.A05) != null && (unmodifiableList3 = Collections.unmodifiableList(list3)) != null && (f362 = (F36) 00k.A0O(unmodifiableList3, 1)) != null && (str4 = f362.A00) != null && f362.A01 != null) {
            String str5 = fBa.A00;
            String str6 = "";
            if (str5 == null) {
                str5 = str6;
            }
            String str7 = fBa.A03;
            if (str7 != null) {
                str6 = str7;
            }
            int ordinal = eVf2.ordinal();
            if (ordinal == 11 || ordinal == 12) {
                if (eVf2 == C48087EVf.SURVEY_PRIMARY_BUTTON) {
                    str4 = str3;
                }
                F1Q f1q = C49285EsU.A00;
                UserSession userSession = this.A00;
                String valueOf = String.valueOf(r1.A00);
                String str8 = r1.A09;
                0qQ.A07(str8);
                f1q.A00(userSession, str, str2, "activity_feed", valueOf, str8, str5, str6, AnonymousClass7TF.A0w(str2, AnonymousClass7TE.A1I(str4)));
                r0 = C51818G3c.A00;
            } else {
                if (ordinal == 13) {
                    r0 = C51819G3d.A00;
                }
                this.A02.invoke();
            }
            C46373Ddq.A00(r1, r0);
            this.A02.invoke();
        }
    }

    public C50571Feg(UserSession userSession, C62320sa r5) {
        this.A00 = userSession;
        this.A02 = r5;
    }
}
