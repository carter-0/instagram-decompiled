package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;
import com.instagram.direct.groupinvites.models.InviteLinkShareInfo;
import com.instagram.user.model.User;
import java.util.ArrayList;

public abstract class EK5 extends C49890FBq {
    public int A00;
    public final Context A01;
    public final EWV A02;
    public final FragmentActivity A03;
    public final 0hq A04;
    public final AnonymousClass07i A05;
    public final C48145EZn A06;
    public final UserSession A07;
    public final AnonymousClass4DU A08;
    public final AnonymousClass3W1 A09;
    public final Runnable A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public EK5(android.content.Context r8, androidx.fragment.app.FragmentActivity r9, X.0hq r10, X.AnonymousClass07i r11, X.C48145EZn r12, com.instagram.common.session.UserSession r13, X.AnonymousClass4DU r14, X.AnonymousClass3W1 r15, X.2FW r16, X.EWV r17, java.lang.Object r18, java.lang.Runnable r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, int r23, int r24) {
        /*
            r7 = this;
            r0 = r17
            java.lang.String r4 = r0.A05
            r1 = r7
            r2 = r16
            r3 = r18
            r5 = r23
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A02 = r0
            r7.A01 = r8
            r7.A07 = r13
            r7.A08 = r14
            r7.A09 = r15
            r7.A03 = r9
            r7.A04 = r10
            r7.A05 = r11
            r0 = r19
            r7.A0A = r0
            r7.A06 = r12
            r0 = r20
            r7.A0C = r0
            r0 = r21
            r7.A0D = r0
            r0 = r22
            r7.A0B = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EK5.<init>(android.content.Context, androidx.fragment.app.FragmentActivity, X.0hq, X.07i, X.EZn, com.instagram.common.session.UserSession, X.4DU, X.3W1, X.2FW, X.EWV, java.lang.Object, java.lang.Runnable, java.lang.String, java.lang.String, java.lang.String, int, int):void");
    }

    public final void A06(View view) {
        ChannelChallengeShareInfo channelChallengeShareInfo;
        InviteLinkShareInfo inviteLinkShareInfo;
        InviteLinkShareInfo inviteLinkShareInfo2;
        Uri uri;
        User user;
        String A002;
        String str;
        EJR ejr;
        C255773uh r4;
        C270194gL r3;
        C255773uh r12;
        User user2;
        EJU eju;
        1Xj r11;
        C48142EZk eZk;
        ArrayList arrayList = FF0.A07;
        UserSession userSession = this.A07;
        Context context = this.A01;
        FF0 ff0 = (FF0) userSession.A01(FF0.class, new C73667Phg(1, DbT.A05(context), userSession));
        EWV ewv = this.A02;
        String str2 = ewv.A05;
        String str3 = str2;
        ff0.A02(str2);
        String str4 = ewv.A04;
        Long l = null;
        if (str4 == null || 0oI.A0I(context.getPackageManager(), str4)) {
            2FW r5 = this.A05;
            C48850ElC elC = C48850ElC.$redex_init_class;
            View view2 = view;
            switch (r5.ordinal()) {
                case 15:
                case 16:
                case 17:
                    Object obj = this.A06;
                    if ((obj instanceof User) && (user2 = (User) obj) != null) {
                        FragmentActivity fragmentActivity = this.A03;
                        0hq r13 = this.A04;
                        AnonymousClass07i r122 = this.A05;
                        AnonymousClass4DU r15 = this.A08;
                        String A042 = A04();
                        String str5 = this.A0B;
                        Runnable runnable = this.A0A;
                        String str6 = ewv.A03;
                        if (!(str4 == null || str6 == null)) {
                            boolean z = ewv.A06;
                            Integer num = ewv.A02;
                            AnonymousClass4DU r23 = r15;
                            UserSession userSession2 = userSession;
                            String str7 = str6;
                            C47999EQi eQi = new C47999EQi(r13, fragmentActivity, user2, r23, userSession2, runnable, str3, str4, A042, str7, str5, 0, z);
                            1OC A003 = C49124Epn.A00(userSession, num, user2.getUsername(), r15.getModuleName());
                            if (A003 == null) {
                                Throwable A0o = DbZ.A0o(user2);
                                C46395DeI.A0L(fragmentActivity, r23, userSession2, user2, runnable, DbY.A0i(user2), A042, str7, str4, z);
                                C22031Xty.A0H(r15, userSession, user2.getId(), A042, str3, A0o);
                                break;
                            } else {
                                A003.A00 = eQi;
                                1ES.A00(fragmentActivity, r122, A003);
                                break;
                            }
                        }
                    }
                case 19:
                    Object obj2 = this.A06;
                    if (!(!(obj2 instanceof User) || (user = (User) obj2) == null || (A002 = C49871FAs.A00.A00(userSession, user)) == null)) {
                        C46395DeI.A0M(this.A03, this.A08, userSession, ewv, A002);
                        break;
                    }
                case 20:
                case 37:
                case 46:
                case 49:
                    Object obj3 = this.A06;
                    if ((obj3 instanceof 1Xj) && (r11 = (1Xj) obj3) != null) {
                        C46395DeI.A0F(this.A03, this.A04, this.A05, userSession, r11, this.A08, this.A09, ewv, this.A0A, A04(), this.A0B, (String) null);
                        break;
                    }
                case 28:
                    Object obj4 = this.A06;
                    if (obj4 instanceof C255773uh) {
                        r12 = (C255773uh) obj4;
                        if (r12 != null && r12.A1J()) {
                            Activity activity = this.A03;
                            0hq r20 = this.A04;
                            AnonymousClass07i r21 = this.A05;
                            String str8 = r12.A0k;
                            String str9 = r12.A0j;
                            AnonymousClass4DU r132 = this.A08;
                            String A043 = A04();
                            User user3 = r12.A0i;
                            if (user3 != null) {
                                String str10 = this.A0B;
                                Runnable runnable2 = this.A0A;
                                String str11 = ewv.A03;
                                if (!(str4 == null || str11 == null)) {
                                    boolean z2 = ewv.A06;
                                    C46395DeI.A0D(activity, r20, r21, new FTA(activity, userSession, r132, user3, str4, str11, str8, str9, A043, z2), userSession, r132, true, ewv.A02, runnable2, str8, str9, user3.getId(), A043, str3, str10, true);
                                    break;
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    } else {
                        r12 = null;
                    }
                    Activity activity2 = this.A03;
                    0hq r22 = this.A04;
                    AnonymousClass07i r133 = this.A05;
                    AnonymousClass4DU r17 = this.A08;
                    String A044 = A04();
                    String str12 = this.A0B;
                    Runnable runnable3 = this.A0A;
                    String str13 = ewv.A03;
                    if (!(str4 == null || str13 == null)) {
                        boolean z3 = ewv.A06;
                        Integer num2 = ewv.A02;
                        User user4 = r12.A0i;
                        1Xj r52 = r12.A0b;
                        if (!(user4 == null || r52 == null)) {
                            C48006EQp eQp = new C48006EQp(activity2, activity2, r22, userSession, r17, r12, user4, runnable3, A044, str3, str4, str13, str12, z3);
                            SQH.A02(r22);
                            1OC A022 = FGA.A02(userSession, num2, user4.getUsername(), r52.getId(), r17.getModuleName());
                            A022.A00 = eQp;
                            1ES.A00(activity2, r133, A022);
                            break;
                        }
                    }
                case 32:
                    Object obj5 = this.A06;
                    if (!(!(obj5 instanceof C255773uh) || (r4 = (C255773uh) obj5) == null || (r3 = r4.A0c) == null)) {
                        FragmentActivity fragmentActivity2 = this.A03;
                        0hq r9 = this.A04;
                        AnonymousClass07i r8 = this.A05;
                        User A032 = r3.A03();
                        String str14 = r3.A0X;
                        str14.getClass();
                        String str15 = r3.A0e;
                        str15.getClass();
                        C46395DeI.A05(fragmentActivity2, (View) null, r9, r8, this.A08, userSession, A032, this.A0A, str14, str15, A04(), str3, "");
                        break;
                    }
                case 47:
                    Object obj6 = this.A06;
                    if ((obj6 instanceof EJU) && (eju = (EJU) obj6) != null) {
                        FragmentActivity fragmentActivity3 = this.A03;
                        AnonymousClass4DU r112 = this.A08;
                        String str16 = eju.A01;
                        String str17 = eju.A03;
                        String A045 = A04();
                        String str18 = ewv.A03;
                        if (!(str4 == null || str18 == null || str17 == null)) {
                            C46395DeI.A0N(fragmentActivity3, (Uri) null, DbX.A0D(str17), r112, userSession, str4, str18, new C51636FxU(str17, 1), false, ewv.A06);
                            C22031Xty.A0I(r112, userSession, str16, A045, str3, str17);
                            break;
                        }
                    }
                case 58:
                    String str19 = this.A07;
                    if (str19 != null) {
                        FragmentActivity fragmentActivity4 = this.A03;
                        0hq r152 = this.A04;
                        AnonymousClass07i r123 = this.A05;
                        AnonymousClass4DU r113 = this.A08;
                        String A046 = A04();
                        Runnable runnable4 = this.A0A;
                        String str20 = ewv.A03;
                        if (!(str4 == null || str20 == null)) {
                            boolean z4 = ewv.A06;
                            Integer num3 = ewv.A02;
                            C47999EQi eQi2 = new C47999EQi(r152, fragmentActivity4, context, r113, userSession, runnable4, str4, str20, str19, A046, str3, 1, z4);
                            1OC A004 = C49116Epf.A00(userSession, num3, str19, r113.getModuleName());
                            A004.A00 = eQi2;
                            1ES.A00(fragmentActivity4, r123, A004);
                            break;
                        }
                    }
                    break;
                case 59:
                    String str21 = this.A07;
                    if (str21 != null) {
                        Activity activity3 = this.A03;
                        0hq r14 = this.A04;
                        AnonymousClass07i r114 = this.A05;
                        AnonymousClass4DU r10 = this.A08;
                        String A047 = A04();
                        Runnable runnable5 = this.A0A;
                        String str22 = ewv.A03;
                        if (!(str4 == null || str22 == null)) {
                            Integer num4 = ewv.A02;
                            C47998EQh eQh = new C47998EQh(activity3, r14, r10, userSession, runnable5, str21, str22, str4, A047, str3, ewv.A06);
                            1OC A005 = C49121Epk.A00(userSession, num4, str21, r10.getModuleName());
                            A005.A00 = eQh;
                            1ES.A00(activity3, r114, A005);
                            break;
                        }
                    }
                    break;
                case 89:
                    C48145EZn eZn = this.A06;
                    if (eZn != null) {
                        Activity activity4 = this.A03;
                        0hq r102 = this.A04;
                        AnonymousClass07i r92 = this.A05;
                        AnonymousClass4DU r82 = this.A08;
                        Runnable runnable6 = this.A0A;
                        String str23 = ewv.A03;
                        if (!(str4 == null || str23 == null)) {
                            C47996EQf eQf = new C47996EQf(activity4, r102, eZn, r82, userSession, ewv, runnable6, str4, str23);
                            1OC A006 = C49120Epj.A00((C48145EZn) null, userSession, ewv.A01);
                            A006.A00 = eQf;
                            1ES.A00(activity4, r92, A006);
                            break;
                        }
                    }
                    break;
                case 91:
                    C46395DeI.A06(this.A03, view2, this.A04, this.A05, this.A08, userSession, ewv, this.A0A, "");
                    break;
                case 97:
                    Object obj7 = this.A06;
                    if ((obj7 instanceof InviteLinkShareInfo) && (inviteLinkShareInfo = (InviteLinkShareInfo) obj7) != null) {
                        FragmentActivity fragmentActivity5 = this.A03;
                        String str24 = inviteLinkShareInfo.A06;
                        if (str24 != null) {
                            C46395DeI.A0M(fragmentActivity5, this.A08, userSession, ewv, str24);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                case 98:
                    Object obj8 = this.A06;
                    if ((obj8 instanceof ChannelChallengeShareInfo) && (channelChallengeShareInfo = (ChannelChallengeShareInfo) obj8) != null) {
                        C46395DeI.A08(this.A03, view2, this.A08, userSession, channelChallengeShareInfo, ewv, A04(), "");
                        break;
                    }
                case 101:
                    Object obj9 = this.A06;
                    if ((obj9 instanceof InviteLinkShareInfo) && (inviteLinkShareInfo2 = (InviteLinkShareInfo) obj9) != null) {
                        if (ewv == EWV.A0N || ewv == EWV.A0O) {
                            uri = inviteLinkShareInfo2.A03;
                        } else {
                            uri = null;
                        }
                        FragmentActivity fragmentActivity6 = this.A03;
                        String str25 = inviteLinkShareInfo2.A06;
                        if (str25 != null) {
                            AnonymousClass4DU r6 = this.A08;
                            String str26 = ewv.A03;
                            boolean z5 = ewv.A06;
                            if (str26 == null) {
                                str26 = "";
                            }
                            C46395DeI.A0N(fragmentActivity6, uri, DbX.A0D(str25), r6, userSession, str4, str26, DbX.A0w(str25), false, z5);
                            break;
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    break;
                case 102:
                    Object obj10 = this.A06;
                    if (!(obj10 instanceof EJR) || (ejr = (EJR) obj10) == null) {
                        str = null;
                    } else {
                        str = ejr.A01;
                    }
                    C46395DeI.A0M(this.A03, this.A08, userSession, ewv, str);
                    break;
                default:
                    throw AnonymousClass7TF.A0W("unsupported content type: ", r5.name());
            }
            this.A00 = 2;
        } else if (this.A00 == 0) {
            0Tu r103 = 0Tu.A05;
            if (182.A06(r103, userSession, 36314859024616287L)) {
                AnonymousClass4DU r53 = this.A08;
                String str27 = this.A07;
                if (str27 != null) {
                    C22031Xty.A0F(r53, userSession, str27, A04(), str3, "app_not_found");
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            C49716F3b f3b = new C49716F3b(this.A03, userSession);
            if (!f3b.A01() || !182.A06(r103, userSession, 36328675930619410L)) {
                0oI.A07(context, str4, "com.instagram.android");
            } else {
                0oI.A06(context, f3b, str4, "com.instagram.android");
            }
            this.A00 = 1;
        }
        2FW r42 = this.A05;
        C48850ElC elC2 = C48850ElC.$redex_init_class;
        int ordinal = r42.ordinal();
        if (ordinal == 28) {
            return;
        }
        if (ordinal != 89) {
            if (r42 == 2FW.A0S) {
                Object obj11 = this.A06;
                0qQ.A0C(obj11, "null cannot be cast to non-null type com.instagram.direct.groupinvites.models.InviteLinkShareInfo");
                C49754F5f.A01(userSession, (InviteLinkShareInfo) obj11, A02());
            }
            if (r42 == 2FW.A0R) {
                Object obj12 = this.A06;
                0qQ.A0C(obj12, "null cannot be cast to non-null type com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo");
                C49754F5f.A00(userSession, (ChannelChallengeShareInfo) obj12, A02());
            }
            Long l2 = this.A02;
            if (l2 == null) {
                int indexOf = ff0.A01(r42, false).indexOf(str3);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf >= 0 && valueOf != null) {
                    l = DbS.A0j(indexOf);
                }
            } else {
                l = l2;
            }
            C22031Xty.A07(this.A08, userSession, (Long) null, l, this.A01, this.A07, A04(), str3, A03(), this.A0B, this.A0C, this.A0D, A05(), this.A03);
            return;
        }
        C48145EZn eZn2 = this.A06;
        if (eZn2 != null && (eZk = ewv.A00) != null) {
            C49947FGb.A03(eZn2, eZk, userSession, C267044ar.A01(context, userSession));
        }
    }
}
