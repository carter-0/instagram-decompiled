package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;

public final class H69 extends C228042kh {
    public final UserSession A00;
    public final SchoolOnboardingParcelData A01;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A00;
        SchoolOnboardingParcelData schoolOnboardingParcelData = this.A01;
        0qQ.A0B(schoolOnboardingParcelData, 0);
        String str = schoolOnboardingParcelData.A06;
        String str2 = schoolOnboardingParcelData.A0A;
        HM6 hm6 = schoolOnboardingParcelData.A02;
        Integer num = schoolOnboardingParcelData.A04;
        Integer num2 = schoolOnboardingParcelData.A05;
        ImmutableList A002 = O2U.A00(schoolOnboardingParcelData.A0D);
        ImmutableList A003 = O2U.A00(schoolOnboardingParcelData.A0E);
        String str3 = schoolOnboardingParcelData.A09;
        String str4 = schoolOnboardingParcelData.A08;
        String str5 = schoolOnboardingParcelData.A07;
        boolean z = schoolOnboardingParcelData.A0F;
        HM5 hm5 = schoolOnboardingParcelData.A01;
        C54635HLs hLs = schoolOnboardingParcelData.A03;
        boolean z2 = schoolOnboardingParcelData.A0G;
        String str6 = schoolOnboardingParcelData.A0B;
        Integer num3 = num2;
        String str7 = str;
        String str8 = str2;
        String str9 = str3;
        HM5 hm52 = hm5;
        HM6 hm62 = hm6;
        C54635HLs hLs2 = hLs;
        Integer num4 = num;
        return new C53035GhR(new C56031Hrd(userSession, new C53393GnQ(schoolOnboardingParcelData.A00, A002, A003, O2U.A00(schoolOnboardingParcelData.A0C), hm52, hm62, hLs2, num4, num3, str7, str8, str9, str4, str5, str6, z, z2)));
    }

    public H69(UserSession userSession, SchoolOnboardingParcelData schoolOnboardingParcelData) {
        AnonymousClass7TG.A1O(userSession, schoolOnboardingParcelData);
        this.A00 = userSession;
        this.A01 = schoolOnboardingParcelData;
    }
}
