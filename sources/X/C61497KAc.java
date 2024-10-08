package X;

import android.content.Context;
import android.content.res.Resources;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.android.R;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import com.instagram.user.model.User;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.KAc  reason: case insensitive filesystem */
public final class C61497KAc extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    public C61497KAc(int i, Object obj, Object obj2, Object obj3, boolean z) {
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = z;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onFail(C268654dm r11) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(1595597602);
                C59689JTv.A0D((Context) this.A01, AnonymousClass000.A00(3623));
                i = -1082090683;
                break;
            case 1:
                A032 = AnonymousClass7TG.A0D(r11, -2036248146);
                C49952FGh.A02((Context) this.A01, r11);
                i = 1893411611;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(1733517140);
                1P0 r0 = (1P0) this.A01;
                if (r0 != null) {
                    r0.onFail(r11);
                }
                Object A002 = r11.A00();
                if (A002 != null) {
                    C59689JTv.A03((Context) this.A02, ((1XP) A002).getErrorMessage(), "update_content_notes_mute_state_failure", 0);
                }
                i = -386387433;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(-1285355150);
                2YL r6 = (2YL) this.A03;
                AnonymousClass7TE.A1Z(new C59673JTe(this.A02, r6, (AnonymousClass4D7) null, 31, this.A04), C318116oQ.A00(r6));
                i = -944256414;
                break;
            case 4:
                A032 = AnonymousClass7TG.A0D(r11, -771558092);
                C61497KAc.super.onFail(r11);
                User user = (User) this.A02;
                user.A1J(!this.A04);
                C59689JTv.A0E((Context) this.A01, "third_party_downloads_account_level_setting_failed");
                user.A0d((0lg) this.A03);
                i = 1925997429;
                break;
            case 5:
                A032 = AnonymousClass7TG.A0D(r11, -1420549030);
                C61497KAc.super.onFail(r11);
                1Xj r2 = (1Xj) this.A02;
                r2.A0C.EoT(Boolean.valueOf(!this.A04));
                C59689JTv.A0E((Context) this.A01, "third_party_downloads_media_level_setting_failed");
                r2.AE7((0lg) this.A03);
                i = 1800057158;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-979569043);
                C59689JTv.A0E((Context) this.A01, "addMentionsTask_network_error");
                i = 237232161;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFailInBackground(C268654dm r4) {
        if (1 - this.A00 != 0) {
            C61497KAc.super.onFailInBackground(r4);
            return;
        }
        int A032 = AnonymousClass0fD.A03(196241077);
        ((User) this.A02).A0z(this.A04);
        AnonymousClass0fD.A0A(1772538940, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-415637092);
                int A032 = AnonymousClass0fD.A03(1931122250);
                C59689JTv.A07((Context) this.A01, 2131960992);
                1Xj r4 = (1Xj) this.A02;
                boolean z = this.A04;
                UserSession userSession = ((I0v) this.A03).A00;
                1Xy r1 = r4.A0C;
                if (z) {
                    r1.Eej(OpenCarouselSubmissionState.A07);
                    r4.A0C.Eeg(r4.A1j(userSession));
                } else {
                    r1.Eej(OpenCarouselSubmissionState.A06);
                }
                r4.AE7(userSession);
                AnonymousClass0fD.A0A(518903818, A032);
                i2 = -310388982;
                break;
            case 2:
                i = AnonymousClass0fD.A03(852395539);
                int A033 = AnonymousClass0fD.A03(-778948774);
                1P0 r0 = (1P0) this.A01;
                if (r0 != null) {
                    r0.onSuccess(obj);
                }
                AnonymousClass0fD.A0A(-2053641772, A033);
                i2 = 609669923;
                break;
            case 3:
                i = AnonymousClass0fD.A03(419108078);
                DwR dwR = (DwR) obj;
                int A0D = AnonymousClass7TG.A0D(dwR, 107801326);
                boolean z2 = dwR.A00().A0E;
                C313716gt r42 = ((C62289KdN) this.A03).A08;
                if (z2) {
                    if (r42 != null) {
                        r42.A00(GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, C61013JvD.A00((C61013JvD) this.A01), ((M0U) this.A02).A06);
                    }
                } else if (r42 != null) {
                    String A002 = C61013JvD.A00((C61013JvD) this.A01);
                    String str2 = ((M0U) this.A02).A06;
                    0Aj A0e = AnonymousClass7TE.A0e(r42.A08, "live_unfollow_generated");
                    JTQ.A14(A0e, r42.A03);
                    JTQ.A10(A0e, Long.parseLong(r42.A02));
                    C51965G9l.A1I(A0e, r42.A04);
                    C51969G9p.A1A(A0e, r42.A07);
                    A0e.AAJ("method", GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
                    A0e.A9F("target_user_id", DbV.A0q(A002));
                    JTO.A1R(A0e, "viewer");
                    A0e.A9F("c_pk", DbZ.A0d(str2));
                    JTQ.A16(A0e, 00k.A0a(r42.A06));
                }
                AnonymousClass0fD.A0A(1102443806, A0D);
                i2 = 1625262811;
                break;
            case 6:
                int A034 = AnonymousClass0fD.A03(-976978520);
                CEG ceg = (CEG) obj;
                int A0D2 = AnonymousClass7TG.A0D(ceg, -1933512522);
                Context context = (Context) this.A01;
                Resources resources = context.getResources();
                C51935G8d g8d = ceg.A00;
                if (g8d != null) {
                    C59689JTv.A09(context, resources.getQuantityString(R.plurals.add_mentioned_users_success_message, ((C61109JxL) g8d).A02.size()));
                    AnonymousClass6Z5 r7 = (AnonymousClass6Z5) this.A03;
                    C51935G8d g8d2 = ceg.A00;
                    if (g8d2 != null) {
                        String valueOf = String.valueOf(((C61109JxL) g8d2).A00);
                        C51935G8d g8d3 = ceg.A00;
                        if (g8d3 != null) {
                            List list = ((C61109JxL) g8d3).A01;
                            1Xj r8 = (1Xj) this.A02;
                            if (valueOf != null) {
                                UserSession userSession2 = r7.A09;
                                str = "userSession";
                                if (userSession2 != null) {
                                    0sn A003 = AnonymousClass8OY.A00(userSession2).A00(valueOf);
                                    if (A003 == null) {
                                        A003 = 0sn.A00;
                                    }
                                    1as r2 = 1as.A04;
                                    UserSession userSession3 = r7.A09;
                                    if (userSession3 != null) {
                                        r2.A0G(userSession3, "STORY", list, A003);
                                        if (list != null) {
                                            Iterator it = list.iterator();
                                            while (it.hasNext()) {
                                                User A0d = JTP.A0d(it);
                                                UserSession userSession4 = r7.A09;
                                                if (userSession4 != null) {
                                                    if (AnonymousClass8OY.A01(userSession4) || JTQ.A1T(A0d, A003)) {
                                                        1as r12 = 1as.A04;
                                                        UserSession userSession5 = r7.A09;
                                                        if (userSession5 != null) {
                                                            r12.A0C(userSession5, r8, A0d);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                0qQ.A0F(str);
                                throw AnonymousClass00P.createAndThrow();
                            }
                            AnonymousClass0fD.A0A(-1227357593, A0D2);
                            AnonymousClass0fD.A0A(-984428327, A034);
                            return;
                        }
                    }
                }
                str = PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            default:
                C61497KAc.super.onSuccess(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(2113541538);
                DwR dwR = (DwR) obj;
                int A0D = AnonymousClass7TG.A0D(dwR, 1030482948);
                C294695ms.A00(((F3J) this.A03).A01).A0C(dwR.A00(), (User) this.A02, (String) null);
                AnonymousClass0fD.A0A(1333711117, A0D);
                i2 = -1963549042;
                break;
            case 2:
                i = AnonymousClass0fD.A03(1573893363);
                int A032 = AnonymousClass0fD.A03(-1180585118);
                ((User) this.A03).A14(this.A04);
                AnonymousClass0fD.A0A(1157301023, A032);
                i2 = -507233318;
                break;
            default:
                C61497KAc.super.onSuccessInBackground(obj);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
