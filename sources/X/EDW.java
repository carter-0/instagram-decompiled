package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.CategorySearchFragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class EDW extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public EDW(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    public final void onFail(C268654dm r14) {
        int i;
        int i2;
        Object obj;
        String message;
        String str;
        String str2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass7TG.A0D(r14, -611055595);
                1XR r0 = (1XR) r14.A00();
                if (r0 == null || r0.getStatusCode() != 400) {
                    obj = this.A03;
                } else {
                    obj = this.A04;
                }
                DbS.A1R((AnonymousClass6Tm) this.A01, (C277014uI) obj, this.A02);
                i2 = 688600915;
                break;
            case 1:
                i = AnonymousClass0fD.A03(233571727);
                0qQ.A0B(r14, 0);
                int A032 = AnonymousClass0fD.A03(668686201);
                Context context = (Context) this.A02;
                String A042 = C319126q5.A04(r14, context.getString(2131972232));
                0qQ.A07(A042);
                C59689JTv.A03(context, A042, (String) null, 0);
                AnonymousClass0fD.A0A(-2088558494, A032);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                CallerContext callerContext = CategorySearchFragment.A0U;
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = categorySearchFragment.A05;
                if (businessFlowAnalyticsLogger != null) {
                    String A0a = Dba.A0a(categorySearchFragment);
                    String str3 = categorySearchFragment.A0C;
                    if (str3 == null) {
                        DbS.A16();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    businessFlowAnalyticsLogger.Ckh(new C22030Xtl(A0a, str3, "save_info", (String) null, (String) null, (Map) null, (Map) this.A01, (Map) null));
                }
                i2 = -1029882795;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-920794588);
                Context context2 = (Context) this.A01;
                C59689JTv.A09(context2, C319126q5.A04(r14, context2.getString(2131972232)));
                String A022 = C319126q5.A02(r14);
                CallerContext callerContext2 = C50143FRa.A00;
                BusinessFlowAnalyticsLogger A012 = C319596qs.A01(C319586qr.EDIT_PROFILE, (0lg) this.A03, "facebook_page_claim_helper", AnonymousClass7TF.A0b());
                A012.getClass();
                A012.Ckh(new C22030Xtl("edit_page", "edit_profile", (String) null, A022, (String) null, (Map) null, (Map) null, (Map) null));
                i2 = -542855201;
                break;
            case 3:
                i = AnonymousClass7TG.A0D(r14, -923098968);
                EDW.super.onFail(r14);
                EK6 ek6 = (EK6) this.A04;
                EK6.A00((C284945Oz) this.A02, (C284945Oz) this.A01, (Y43) this.A03, ek6);
                Throwable A013 = r14.A01();
                if (!(A013 == null || (message = A013.getMessage()) == null || message.length() <= 0)) {
                    C49061Eof.A00(ek6.A01).A05(EWT.FOLLOW_USER_FLOW, "follow_failure_reason", A013.getMessage());
                }
                UserSession userSession = ek6.A01;
                C49061Eof.A00(userSession).A04(EWT.FOLLOW_USER_FLOW, r14.toString());
                C49061Eof.A00(userSession).A04(EWT.LIST_FOLLOW_USER_FLOW, r14.toString());
                i2 = 489315363;
                break;
            case 5:
                i = AnonymousClass0fD.A03(-1693983889);
                SQH.A01((0hq) this.A03);
                0wb.A03("AppStartupUtil", "SingleMediaRequest onFail");
                C59689JTv.A0C((Context) this.A02, "SingleMediaRequest onFail");
                i2 = 1513799208;
                break;
            case 6:
                i = AnonymousClass0fD.A03(1854218214);
                EDW.super.onFail(r14);
                C59689JTv.A0C((Context) this.A03, AnonymousClass000.A00(2144));
                i2 = -886229231;
                break;
            case 7:
                i = AnonymousClass0fD.A03(2029849426);
                ((C49679F1m) this.A03).A00((C268654dm) this.A02);
                i2 = 977249499;
                break;
            case 8:
                i = AnonymousClass0fD.A03(1499835712);
                0qQ.A0B(r14, 0);
                ((0sL) this.A03).invoke(false, (Object) null);
                C322326ve r1 = (C322326ve) this.A02;
                Throwable A014 = r14.A01();
                if (A014 == null || (str = A014.getMessage()) == null) {
                    str = "";
                }
                r1.A02(str);
                r1.A04("edit_profile_link");
                i2 = -875390458;
                break;
            case 9:
                i = AnonymousClass0fD.A03(420771833);
                0qQ.A0B(r14, 0);
                ((0sL) this.A03).invoke(false, (Object) null);
                C322326ve r12 = (C322326ve) this.A02;
                Throwable A015 = r14.A01();
                if (A015 == null || (str2 = A015.getMessage()) == null) {
                    str2 = "";
                }
                r12.A02(str2);
                r12.A04("edit_profile_link");
                i2 = -1765380390;
                break;
            case 10:
                i = AnonymousClass0fD.A03(-2102849427);
                T8N.A02((FragmentActivity) this.A03, (T8N) this.A01);
                i2 = 1641855008;
                break;
            case 11:
                i = AnonymousClass0fD.A03(159185637);
                SNR snr = (SNR) this.A04;
                snr.A01 = AnonymousClass7TE.A0u();
                SNR.A00((Activity) this.A02, (Intent) this.A01, (0lg) this.A03, snr);
                i2 = -1534029311;
                break;
            default:
                EDW.super.onFail(r14);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onFinish() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(1139979125);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                ActionButton actionButton = categorySearchFragment.actionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(0);
                }
                EET eet = categorySearchFragment.A08;
                if (eet != null) {
                    eet.A00 = true;
                }
                i2 = 1906981146;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-633411296);
                Dialog dialog = (Dialog) this.A02;
                dialog.requireViewById(R.id.disconnect_button_spinner).setVisibility(8);
                dialog.dismiss();
                i2 = -1407528022;
                break;
            case 4:
                i = AnonymousClass0fD.A03(-881454617);
                VN6 vn6 = (VN6) this.A02;
                if (vn6 != null) {
                    vn6.A00.A00 = false;
                }
                i2 = 1798680648;
                break;
            case 8:
                i = AnonymousClass0fD.A03(1115793485);
                Dba.A0m((Activity) this.A01, 2dZ.A0t);
                i2 = 1413517611;
                break;
            case 9:
                i = AnonymousClass0fD.A03(103350706);
                Dba.A0m((Activity) this.A01, 2dZ.A0t);
                i2 = -995826256;
                break;
            default:
                EDW.super.onFinish();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final void onStart() {
        int i;
        int i2;
        switch (this.A00) {
            case 1:
                i = AnonymousClass0fD.A03(283992559);
                CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                ActionButton actionButton = categorySearchFragment.actionButton;
                if (actionButton != null) {
                    actionButton.setDisplayedChild(1);
                }
                EET eet = categorySearchFragment.A08;
                if (eet != null) {
                    eet.A00 = false;
                }
                i2 = 919705908;
                break;
            case 2:
                i = AnonymousClass0fD.A03(169740461);
                Dialog dialog = (Dialog) this.A02;
                dialog.requireViewById(R.id.disconnect_button_spinner).setVisibility(0);
                dialog.requireViewById(R.id.disconnect_button).setVisibility(8);
                i2 = 283914326;
                break;
            case 4:
                i = AnonymousClass0fD.A03(877551030);
                VN6 vn6 = (VN6) this.A02;
                if (vn6 != null) {
                    vn6.A00.A00 = true;
                }
                i2 = -2136225446;
                break;
            case 5:
                i = AnonymousClass0fD.A03(1900181589);
                SQH.A02((0hq) this.A03);
                i2 = -1667474194;
                break;
            case 6:
                i = AnonymousClass0fD.A03(135140157);
                EDW.super.onStart();
                i2 = -1247916649;
                break;
            case 8:
                i = AnonymousClass0fD.A03(-184306193);
                Dba.A0n((Activity) this.A01, 2dZ.A0t);
                i2 = -1891495109;
                break;
            case 9:
                i = AnonymousClass0fD.A03(1888188265);
                Dba.A0n((Activity) this.A01, 2dZ.A0t);
                i2 = 1628123283;
                break;
            default:
                EDW.super.onStart();
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: type inference failed for: r4v15, types: [java.lang.Object, X.RQg] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-348541241);
                int A033 = AnonymousClass0fD.A03(-2132867932);
                DbS.A1R((AnonymousClass6Tm) this.A01, (C277014uI) this.A03, this.A02);
                AnonymousClass0fD.A0A(-2104789211, A033);
                i = 1985708574;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(344372788);
                C3727892k r12 = (C3727892k) obj;
                int A0D = AnonymousClass7TG.A0D(r12, 1654111159);
                int A034 = AnonymousClass0fD.A03(1339041065);
                C298935uH r0 = r12.A02;
                if (r0 != null) {
                    User CCd = r0.CCd();
                    if (CCd != null) {
                        CCd.A0d((0lg) this.A03);
                    }
                    AnonymousClass0fD.A0A(184991459, A034);
                    CategorySearchFragment categorySearchFragment = (CategorySearchFragment) this.A04;
                    CallerContext callerContext = CategorySearchFragment.A0U;
                    categorySearchFragment.A0K = true;
                    categorySearchFragment.A0T.post(new C51336FsU(categorySearchFragment, (Map) this.A01));
                    AnonymousClass0fD.A0A(-182168405, A0D);
                    i = -726585490;
                    break;
                } else {
                    C41845B3m.A0v();
                    throw AnonymousClass00P.createAndThrow();
                }
            case 2:
                A032 = AnonymousClass0fD.A03(2082691434);
                int A035 = AnonymousClass0fD.A03(-1245493991);
                C59689JTv.A09((Context) this.A01, "Disconnected");
                ((Fragment) this.A04).onResume();
                AnonymousClass0fD.A0A(-878741763, A035);
                i = 1175277846;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(-1695347655);
                int A0D2 = AnonymousClass7TG.A0D(obj, -1544129414);
                EDW.super.onSuccess(obj);
                EK6 ek6 = (EK6) this.A04;
                EK6.A00((C284945Oz) this.A02, (C284945Oz) this.A01, (Y43) this.A03, ek6);
                UserSession userSession = ek6.A01;
                C49061Eof.A00(userSession).A01(EWT.FOLLOW_USER_FLOW, (Integer) null);
                C49061Eof.A00(userSession).A01(EWT.LIST_FOLLOW_USER_FLOW, (Integer) null);
                AnonymousClass0fD.A0A(361202399, A0D2);
                i = -654635447;
                break;
            case 4:
                A032 = AnonymousClass0fD.A03(1858664079);
                int A036 = AnonymousClass0fD.A03(-253831646);
                ArrayList A1C = AnonymousClass7TE.A1C();
                List list = ((NH1) obj).A00;
                if (list != null) {
                    A1C.addAll(list);
                }
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    MediaMapPin mediaMapPin = (MediaMapPin) it.next();
                    ImageUrl A002 = mediaMapPin.A00();
                    if (A002 != null) {
                        ((C18062Vko) this.A01).A00.put(mediaMapPin.getId(), A002);
                    }
                    ((C18062Vko) this.A01).A02((C17896Vhn) this.A03, mediaMapPin);
                }
                AnonymousClass0fD.A0A(25631079, A036);
                i = 661474148;
                break;
            case 5:
                A032 = AnonymousClass0fD.A03(-185597492);
                int A037 = AnonymousClass0fD.A03(165868709);
                1OP.A09((Activity) this.A02, (Fragment) ((0hq) this.A03).A0U.A04().get(0), (UserSession) this.A04, (1Xj) ((1XO) obj).A06.get(0), "activity_tab", true);
                AnonymousClass0fD.A0A(1681980487, A037);
                i = 1379981444;
                break;
            case 6:
                A032 = AnonymousClass0fD.A03(1295018362);
                C54057Gyg gyg = (C54057Gyg) obj;
                int A038 = AnonymousClass0fD.A03(36968412);
                EDW.super.onSuccess(gyg);
                1Xj r4 = gyg.A00;
                ABC.A00((Bundle) this.A02, (FragmentActivity) this.A03, (UserSession) this.A04, r4);
                AnonymousClass0fD.A0A(-1415689948, A038);
                i = 758939335;
                break;
            case 7:
                A032 = AnonymousClass0fD.A03(-1458704938);
                int A039 = AnonymousClass0fD.A03(-1165056320);
                ((C50912Fkr) this.A01).A02.A01((AnonymousClass0aP) this.A04, ((EM4) obj).A00, 1Q0.A1I, false, false);
                AnonymousClass0fD.A0A(-2076849466, A039);
                i = -2114938964;
                break;
            case 8:
                A032 = AnonymousClass0fD.A03(1752852314);
                DwP dwP = (DwP) obj;
                int A0D3 = AnonymousClass7TG.A0D(dwP, -1610814156);
                17i A003 = 17h.A00((UserSession) this.A04);
                User user = dwP.A00;
                0qQ.A07(user);
                A003.A03(user);
                ((0sL) this.A03).invoke(AnonymousClass7TE.A0v(), dwP.A00);
                ((C322326ve) this.A02).A04("edit_profile_link");
                AnonymousClass0fD.A0A(-1577245074, A0D3);
                i = 55083836;
                break;
            case 9:
                A032 = AnonymousClass0fD.A03(-1537271449);
                DwP dwP2 = (DwP) obj;
                int A0D4 = AnonymousClass7TG.A0D(dwP2, 452267130);
                17i A004 = 17h.A00((UserSession) this.A04);
                User user2 = dwP2.A00;
                0qQ.A07(user2);
                A004.A03(user2);
                ((0sL) this.A03).invoke(AnonymousClass7TE.A0v(), dwP2.A00);
                ((C322326ve) this.A02).A04("edit_profile_link");
                AnonymousClass0fD.A0A(1750615280, A0D4);
                i = 2122577068;
                break;
            case 10:
                A032 = AnonymousClass0fD.A03(-548739758);
                C8748R7m r7m = (C8748R7m) obj;
                int A0310 = AnonymousClass0fD.A03(-1149707909);
                if (r7m.isOk()) {
                    0lg r8 = (0lg) this.A04;
                    if (r8 instanceof UserSession) {
                        Bundle bundle = (Bundle) this.A02;
                        String string = bundle.getString(Pxd.A00(657));
                        List list2 = r7m.A00;
                        if (list2 == null || list2.isEmpty()) {
                            T8N.A02((FragmentActivity) this.A03, (T8N) this.A01);
                            i2 = -1305263683;
                            AnonymousClass0fD.A0A(i2, A0310);
                            i = -1043057856;
                            break;
                        } else {
                            C11372SQh A005 = C11372SQh.A00();
                            synchronized (A005) {
                                if (!list2.isEmpty()) {
                                    HashSet hashSet = new HashSet(list2);
                                    ? obj2 = new Object();
                                    obj2.A02 = hashSet;
                                    obj2.A00 = 1;
                                    obj2.A01 = System.currentTimeMillis();
                                    A005.A00 = obj2;
                                    C11372SQh.A01(A005);
                                }
                            }
                            if (TextUtils.isEmpty(string) || !list2.contains(string)) {
                                T8N.A02((FragmentActivity) this.A03, (T8N) this.A01);
                                i2 = 1003326774;
                                AnonymousClass0fD.A0A(i2, A0310);
                                i = -1043057856;
                            } else {
                                T8N.A00(bundle, (FragmentActivity) this.A03, r8, string);
                                AnonymousClass6ST r2 = ((T8N) this.A01).A00;
                                if (r2 != null && r2.isShowing()) {
                                    r2.dismiss();
                                }
                                i2 = -1828354416;
                                AnonymousClass0fD.A0A(i2, A0310);
                                i = -1043057856;
                            }
                        }
                    }
                }
                T8N.A02((FragmentActivity) this.A03, (T8N) this.A01);
                i2 = 541925096;
                AnonymousClass0fD.A0A(i2, A0310);
                i = -1043057856;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-1440782089);
                C8746R7k r7k = (C8746R7k) obj;
                int A0D5 = AnonymousClass7TG.A0D(r7k, 71481095);
                SNR snr = (SNR) this.A04;
                snr.A01 = Boolean.valueOf(r7k.A03);
                snr.A00 = r7k;
                SNR.A00((Activity) this.A02, (Intent) this.A01, (0lg) this.A03, snr);
                AnonymousClass0fD.A0A(-1009836097, A0D5);
                i = -2093154451;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public EDW(Context context, CategorySearchFragment categorySearchFragment, AnonymousClass0wW r4, Map map) {
        this.A00 = 1;
        this.A04 = categorySearchFragment;
        this.A01 = map;
        0qQ.A0A(context);
        0qQ.A0B(r4, 2);
        this.A02 = context;
        this.A03 = r4;
    }
}
