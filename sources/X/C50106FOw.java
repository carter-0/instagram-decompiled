package X;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.api.schemas.IgUserBioLinkTypeEnum;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.FOw  reason: case insensitive filesystem */
public final class C50106FOw implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C50106FOw(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A04 = obj3;
        this.A05 = obj2;
        this.A01 = obj;
        this.A03 = obj4;
        this.A02 = obj5;
    }

    public static C50672FgX A00(C50106FOw fOw) {
        return (C50672FgX) ((C323316xI) fOw.A02).A02.A0X.getValue();
    }

    public final void onClick(View view) {
        int i;
        int i2;
        long j;
        Long l;
        switch (this.A00) {
            case 0:
                CallerContext callerContext = C50143FRa.A00;
                ((Dialog) this.A01).dismiss();
                C50143FRa.A02((Fragment) this.A03, (UserSession) this.A04, AnonymousClass05K.A01, "edit_profile");
                return;
            case 1:
                i = AnonymousClass0fD.A05(-1976872570);
                2YL r6 = (2YL) this.A01;
                Object obj = this.A03;
                0qQ.A0B(obj, 1);
                AnonymousClass7TE.A1Z(new C66167MGe((Object) r6, obj, (AnonymousClass4D7) null, 31), C318116oQ.A00(r6));
                String BZP = ((2Er) this.A04).BZP();
                AIh.A01(C391629tO.A0P, (C391549tG) null, (UserSession) this.A05, BZP, 19);
                i2 = 175684977;
                break;
            case 2:
                i = AnonymousClass0fD.A05(139607216);
                2YL r62 = (2YL) this.A01;
                Object obj2 = this.A03;
                0qQ.A0B(obj2, 1);
                AnonymousClass7TE.A1Z(new C66167MGe((Object) r62, obj2, (AnonymousClass4D7) null, 32), C318116oQ.A00(r62));
                String BZP2 = ((2Er) this.A04).BZP();
                AIh.A01(C391629tO.A0P, (C391549tG) null, (UserSession) this.A05, BZP2, 20);
                i2 = 2018984238;
                break;
            case 3:
                i = AnonymousClass0fD.A05(1288791890);
                C49876FBa fBa = (C49876FBa) this.A03;
                fBa.A05 = true;
                ((C71662eb) this.A04).A02();
                0lg r3 = (0lg) this.A05;
                String str = fBa.A02;
                if (str == null) {
                    str = "";
                }
                String str2 = ((F3R) this.A02).A01;
                if (str2 == null) {
                    str2 = "";
                }
                C283155Gi r1 = (C283155Gi) this.A01;
                String valueOf = String.valueOf(r1.A00);
                String str3 = r1.A09;
                0qQ.A07(str3);
                String str4 = fBa.A00;
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = fBa.A03;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r3), "instagram_notification_inline_survey_dismiss");
                if (A0e.isSampled()) {
                    A0e.AAJ("extra_data_token", str4);
                    A0e.AAJ("n_pk", str3);
                    A0e.AAJ("channel", "activity_feed");
                    Long A0n = 00y.A0n(10, str);
                    if (A0n != null) {
                        j = A0n.longValue();
                    } else {
                        j = -1;
                    }
                    A0e.A9F("qp_id", Long.valueOf(j));
                    A0e.AAJ("question_id", str2);
                    A0e.AAJ("notification_type", valueOf);
                    if (str5 != null) {
                        l = 00y.A0n(10, str5);
                    } else {
                        l = null;
                    }
                    A0e.A9F("tessa_survey_config_id", l);
                    A0e.Cgf();
                }
                i2 = -104668300;
                break;
            case 4:
                i = AnonymousClass0fD.A05(1634878219);
                Object obj3 = ((C47181Drw) this.A04).A02;
                if (AnonymousClass7TF.A1W(obj3, IgUserBioLinkTypeEnum.FACEBOOK)) {
                    A00(this).A0F("user_profile_link_bottom_sheet", (AnonymousClass0iw) this.A01);
                } else if (obj3 == IgUserBioLinkTypeEnum.FACEBOOK_PAGE) {
                    A00(this).A09((AnonymousClass0iw) this.A01, (User) this.A03, "user_profile_link_bottom_sheet");
                } else if (obj3 != IgUserBioLinkTypeEnum.FACEBOOK_GROUP) {
                    A00(this).A0C((1Xj) this.A05, (User) this.A03, "user_profile_link_bottom_sheet");
                }
                i2 = 1996639119;
                break;
            case 5:
                i = AnonymousClass0fD.A05(-1377469835);
                C47181Drw drw = (C47181Drw) this.A04;
                Object obj4 = drw.A02;
                if (AnonymousClass7TF.A1W(obj4, IgUserBioLinkTypeEnum.FACEBOOK)) {
                    A00(this).A0F("user_profile_link_bottom_sheet", (AnonymousClass0iw) this.A01);
                } else if (obj4 == IgUserBioLinkTypeEnum.FACEBOOK_PAGE) {
                    A00(this).A09((AnonymousClass0iw) this.A01, (User) this.A03, "user_profile_link_bottom_sheet");
                } else if (obj4 != IgUserBioLinkTypeEnum.FACEBOOK_GROUP) {
                    C50672FgX A002 = A00(this);
                    User user = (User) this.A03;
                    1Xj r63 = (1Xj) this.A05;
                    String str6 = drw.A06;
                    String str7 = drw.A04;
                    if (str7 == null) {
                        str7 = "";
                    }
                    A002.A0D(r63, user, "user_profile_link_bottom_sheet", str6, str7, drw.A07);
                }
                i2 = 1251884920;
                break;
            case 6:
                i = AnonymousClass0fD.A05(620130701);
                C234502xy r2 = (C234502xy) this.A04;
                if (r2 != null && r2.isPlaying()) {
                    r2.pause();
                }
                0lg r7 = (0lg) this.A05;
                List list = (List) this.A02;
                0qQ.A0B(list, 2);
                E1A e1a = new E1A();
                e1a.setArguments(DbV.A0A(r7));
                e1a.A00 = (User) this.A03;
                e1a.A01 = list;
                DbW.A0T(r7).A02((Activity) this.A01, e1a);
                i2 = -1587760622;
                break;
            default:
                G6B g6b = (G6B) this.A02;
                Fragment fragment = (Fragment) this.A03;
                0hq r4 = (0hq) this.A04;
                G86 g86 = (G86) this.A05;
                Fragment r22 = new C240383Kr();
                r22.setArguments(DbV.A0A((0lg) this.A01));
                if (g6b != null) {
                    r22.A01 = g6b;
                }
                if (fragment != null) {
                    r22.setTargetFragment(fragment, 0);
                    r4 = fragment.mFragmentManager;
                    r4.getClass();
                } else {
                    17k.A07(r4, "if `targetFragment` is null then `fragmentManager` cannot be null");
                }
                r22.A0B(r4, (String) null);
                g86.Cvy();
                return;
        }
        AnonymousClass0fD.A0C(i2, i);
    }
}
