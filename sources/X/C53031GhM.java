package X;

import com.instagram.api.schemas.AchievementButtonInfo;
import com.instagram.api.schemas.AchievementIntf;
import com.instagram.api.schemas.EarnedOnMediaState;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.GhM  reason: case insensitive filesystem */
public final class C53031GhM extends 2YL {
    public final UserSession A00;
    public final C56005HrB A01;
    public final String A02;
    public final String A03;
    public final 0V2 A04;
    public final 0V2 A05;
    public final C61770pa A06;
    public final C61770pa A07;
    public final AnonymousClass0iw A08;

    public C53031GhM(AnonymousClass0iw r7, UserSession userSession, C56005HrB hrB, String str, String str2) {
        DbZ.A0t(1, userSession, r7, str);
        this.A00 = userSession;
        this.A08 = r7;
        this.A02 = str;
        this.A01 = hrB;
        this.A03 = str2;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 1, 0);
        this.A05 = A012;
        this.A07 = new 0V1((C262204Co) null, A012);
        05D A013 = 10D.A01(num, 1, 0);
        this.A04 = A013;
        this.A06 = new 0V1((C262204Co) null, A013);
    }

    public static final void A00(C53031GhM ghM, String str, String str2, String str3, String str4, String str5, List list, List list2) {
        C318136oS A002;
        0sL imO;
        List list3 = list;
        if (AnonymousClass7TE.A1b(list) && 00l.A0d(str, "instagram://view-grouped-achievement", false)) {
            A002 = C318116oQ.A00(ghM);
            imO = new C66171MGi(list2, list3, ghM, (AnonymousClass4D7) null, 14);
        } else if (00l.A0d(str, AnonymousClass000.A00(1469), false)) {
            A002 = C318116oQ.A00(ghM);
            imO = new C58102ImO(ghM, (AnonymousClass4D7) null, 4);
        } else if (00l.A0d(str, "instagram://share-achievement", false) && str3 != null) {
            C48898Ely.A00(ghM.A00, 1ES.A01(), new C57206ISt(ghM, str4, str5, str2), str3);
            return;
        } else if (str != null) {
            AnonymousClass7TE.A1Z(new MFW(ghM, str, (AnonymousClass4D7) null, 6), C318116oQ.A00(ghM));
            return;
        } else {
            return;
        }
        AnonymousClass7TE.A1Z(imO, A002);
    }

    public final void A01(JV7 jv7, C53327GmD gmD, String str) {
        String str2 = null;
        LinkedHashMap A0p = DbY.A0p("button_text", jv7.A01, AnonymousClass7TE.A1L("button_url", jv7.A02));
        I6J i6j = I6J.A00;
        UserSession userSession = this.A00;
        String str3 = this.A03;
        C53375Gn5 gn5 = gmD.A03;
        if (gn5 != null) {
            str2 = gn5.A05;
        }
        i6j.A08(userSession, "achievement_details", str, str3, str2, AnonymousClass7TE.A1I(this.A02), (List) null, (List) null, A0p);
    }

    public final void A03(EarnedOnMediaState earnedOnMediaState, String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        EarnedOnMediaState earnedOnMediaState2 = earnedOnMediaState;
        C48898Ely.A00(this.A00, 1ES.A01(), new C57208ISv(earnedOnMediaState2, this, str, str2, str3), str);
    }

    public final void A02(AchievementButtonInfo achievementButtonInfo, AchievementIntf achievementIntf, String str) {
        String str2 = str;
        I6J.A00.A08(this.A00, "achievement_details", str2, this.A03, achievementIntf.Azq(), AnonymousClass7TE.A1I(this.A02), AnonymousClass7TE.A1I(achievementIntf), (List) null, DbY.A0p("button_text", achievementButtonInfo.Air(), AnonymousClass7TE.A1L("button_url", achievementButtonInfo.Avk())));
    }
}
