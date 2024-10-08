package X;

import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.U8m  reason: case insensitive filesystem */
public final class C14776U8m extends 2YL {
    public boolean A00;
    public final 2Fk A01;
    public final UserSession A02;
    public final LeadGenCustomDisclaimer A03;
    public final LeadGenPrivacyPolicy A04;
    public final String A05;
    public final Map A06;
    public final 05G A07;
    public final 05G A08;

    public C14776U8m(C319836rJ r8, UserSession userSession) {
        LinkedHashMap linkedHashMap;
        List<LeadGenCustomDisclaimerCheckbox> list;
        this.A02 = userSession;
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = (LeadGenCustomDisclaimer) r8.A00("custom_disclaimer");
        this.A03 = leadGenCustomDisclaimer;
        if (leadGenCustomDisclaimer == null || (list = leadGenCustomDisclaimer.A02) == null) {
            linkedHashMap = 0Yt.A0E();
        } else {
            linkedHashMap = new LinkedHashMap(JTT.A08(list));
            for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox : list) {
                String str = leadGenCustomDisclaimerCheckbox.A00;
                linkedHashMap.put(str, new C61046Jvk(str, leadGenCustomDisclaimerCheckbox.A02, 13));
            }
        }
        this.A06 = linkedHashMap;
        02z A012 = 106.A01(0sn.A00);
        this.A07 = A012;
        02z A10 = C51970G9q.A10(false);
        this.A08 = A10;
        this.A01 = DbT.A0G(AnonymousClass10H.A03(new C67296MlV(1, (AnonymousClass4D7) null), A012, A10));
        this.A04 = (LeadGenPrivacyPolicy) r8.A00("privacy_policy");
        String str2 = (String) r8.A00("personal_info_to_review");
        this.A05 = str2 == null ? "" : str2;
        A00(this);
    }

    public static final void A00(C14776U8m u8m) {
        ArrayList arrayList;
        List list;
        C61046Jvk jvk;
        05G r5 = u8m.A07;
        LeadGenCustomDisclaimer leadGenCustomDisclaimer = u8m.A03;
        if (leadGenCustomDisclaimer == null || (list = leadGenCustomDisclaimer.A02) == null) {
            arrayList = 0sn.A00;
        } else {
            ArrayList<LeadGenCustomDisclaimerCheckbox> arrayList2 = new ArrayList<>();
            for (Object next : list) {
                LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox = (LeadGenCustomDisclaimerCheckbox) next;
                if (leadGenCustomDisclaimerCheckbox.A03 && (jvk = (C61046Jvk) u8m.A06.get(leadGenCustomDisclaimerCheckbox.A00)) != null && !jvk.A01) {
                    arrayList2.add(next);
                }
            }
            arrayList = AnonymousClass7TG.A0r(arrayList2);
            for (LeadGenCustomDisclaimerCheckbox leadGenCustomDisclaimerCheckbox2 : arrayList2) {
                arrayList.add(leadGenCustomDisclaimerCheckbox2.A00);
            }
        }
        r5.Epw(arrayList);
    }
}
