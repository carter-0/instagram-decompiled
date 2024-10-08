package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MusicProduct;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.TwL  reason: case insensitive filesystem */
public final class C14437TwL {
    public AnonymousClass9B2 A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final 0wc A03;
    public final UserSession A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public /* synthetic */ C14437TwL(FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, String str, int i, boolean z) {
        String str2 = null;
        z = (i & 16) != 0 ? false : z;
        str2 = (i & 32) != 0 ? AnonymousClass7TF.A0b() : str2;
        AnonymousClass7TG.A1O(str, userSession);
        0qQ.A0B(str2, 6);
        this.A07 = str;
        this.A04 = userSession;
        this.A02 = r5;
        this.A01 = fragmentActivity;
        this.A0A = z;
        this.A06 = str2;
        this.A03 = AnonymousClass0kN.A01(r5, userSession);
        this.A05 = C3262475z.A00(userSession);
        0Tu r2 = 0Tu.A05;
        this.A08 = 182.A06(r2, userSession, 36328306563366105L);
        this.A09 = 182.A06(r2, userSession, 36328306563431642L);
    }

    public final void A04(C61062Jw0 jw0, QP5 qp5, String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        List list;
        List list2;
        String str7 = str2;
        0qQ.A0B(str7, 1);
        long A0L = JTR.A0L();
        UserSession userSession = this.A04;
        HNL hnl = HNL.NULL_STATE_PROMPT;
        QP5 qp52 = qp5;
        String str8 = qp52.A02;
        String str9 = qp52.A01;
        if (str9 == null) {
            str9 = "";
        }
        String str10 = qp52.A00;
        if (str10 == null) {
            str10 = "";
        }
        C61062Jw0 jw02 = jw0;
        if (jw0 != null) {
            str4 = jw02.A04;
            str5 = jw02.A02;
            str6 = jw02.A03;
            list = (List) jw02.A01;
            list2 = (List) jw02.A00;
        } else {
            str4 = null;
            str5 = null;
            str6 = null;
            list = null;
            list2 = null;
        }
        C53229Gkd A002 = C70273O0d.A00(str8, str9, str10, str4, str5, str6, str3, list, list2);
        C68112N1a n1a = null;
        C68112N1a A003 = C70892OQk.A00(hnl, A002, userSession, str7, (String) null);
        AnonymousClass9B2 r3 = this.A00;
        String str11 = str;
        boolean z2 = z;
        if (r3 == null) {
            AnonymousClass9B2.A04.A00(userSession, new C15828UjB(A003, this, str11, str7, A0L, z2), (AnonymousClass4D6) null, 2);
            return;
        }
        DirectShareTarget A004 = r3.A00();
        if (A004 != null) {
            String str12 = null;
            if (z) {
                str12 = str7;
                n1a = A003;
            }
            A00(n1a, A004, this, str11, str7, str12, (String) null, A0L, true);
        }
    }

    public final void A05(C15033UKm uKm, String str) {
        String str2;
        String str3;
        String str4;
        List list;
        C16614UyA uyA;
        C15033UKm uKm2 = uKm;
        if (uKm != null) {
            str3 = uKm2.A05;
            C70645OEr oEr = uKm2.A02;
            if (oEr == null || (str4 = oEr.A00) == null) {
                str4 = uKm2.A03;
            }
            str2 = uKm2.A04;
            if (oEr != null) {
                list = oEr.A01;
            }
            list = null;
        } else {
            str3 = null;
            str4 = null;
            str2 = null;
            list = null;
        }
        ArrayList arrayList = new ArrayList(list);
        String str5 = str;
        if (str3 == null || str4 == null || str2 == null) {
            C18681Vwf.A02((Bundle) null, this.A01, this.A04, MapEntryPoint.PLACES_HCM, str5);
            return;
        }
        int i = 0;
        if (arrayList.size() == 1) {
            Venue A002 = C18231Vnv.A00(((MediaMapPin) arrayList.get(0)).A09);
            String str6 = str5;
            C18681Vwf.A01((Bundle) null, this.A01, this.A04, MapEntryPoint.PLACES_HCM, C16614UyA.PLACE, str6, A002.A02(), A002.A00.getName(), arrayList, new double[]{Double.parseDouble(String.valueOf(uKm2.A01)), Double.parseDouble(String.valueOf(uKm2.A00))});
            return;
        }
        C16614UyA[] values = C16614UyA.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                uyA = C16614UyA.CATEGORY;
                break;
            }
            uyA = values[i];
            if (0qQ.A0K(uyA.toString(), str2)) {
                break;
            }
            i++;
        }
        C18681Vwf.A01((Bundle) null, this.A01, this.A04, MapEntryPoint.PLACES_HCM, uyA, str5, str3, str4, arrayList, (double[]) null);
    }

    public final void A0A(String str, String str2, String str3, String str4) {
        String str5 = str2;
        0qQ.A0B(str5, 1);
        long A0L = JTR.A0L();
        AnonymousClass9B2 r0 = this.A00;
        String str6 = str;
        String str7 = str3;
        String str8 = str4;
        if (r0 == null) {
            AnonymousClass9B2.A04.A00(this.A04, new C15827UjA(this, str6, str5, str7, str8, A0L), (AnonymousClass4D6) null, 2);
            return;
        }
        DirectShareTarget A002 = r0.A00();
        if (A002 != null) {
            A00((C68112N1a) null, A002, this, str6, str5, str7, str8, A0L, false);
        }
    }

    public final void A0B(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z) {
        String str9 = str;
        0qQ.A0B(str9, 0);
        C309516Yo A0Q = DbU.A0Q(this.A01, this.A04);
        A0Q.A0B = "search_result";
        C14398TvR.A00();
        A0Q.A0B((Bundle) null, C14452Twa.A01(this.A07, str9, str3, str4, str5, str6, str7, str8, z));
        AnonymousClass0iw r0 = this.A02;
        A0Q.A09 = r0;
        A0Q.A07 = new WNM((C18072Vl0) null, this, str2, str9, r0.getModuleName(), "echo", i);
        A0Q.A04();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002f, code lost:
        if (r0.A09 != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C68112N1a r28, com.instagram.model.direct.DirectShareTarget r29, X.C14437TwL r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, java.lang.String r34, long r35, boolean r37) {
        /*
            r9 = r28
            java.lang.String r20 = X.DbY.A0a()
            r0 = r30
            com.instagram.common.session.UserSession r5 = r0.A04
            X.VhG r3 = X.VGG.A00(r5)
            java.lang.String r1 = r0.A07
            r14 = r31
            r3.A00 = r14
            r3.A02 = r1
            r2 = r32
            r3.A01 = r2
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r7 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r7.<init>(r5)
            androidx.fragment.app.FragmentActivity r8 = r0.A01
            X.0iw r10 = r0.A02
            r19 = 0
            boolean r3 = X.C13988Tno.A1Y(r5)
            if (r3 == 0) goto L_0x0031
            boolean r3 = r0.A09
            r16 = 1
            if (r3 == 0) goto L_0x0033
        L_0x0031:
            r16 = 0
        L_0x0033:
            if (r28 != 0) goto L_0x003e
            X.HNL r4 = X.HNL.NULL_STATE_PROMPT
            r3 = 0
            r6 = r34
            X.N1a r9 = X.C70892OQk.A00(r4, r3, r5, r6, r3)
        L_0x003e:
            X.WVR r11 = new X.WVR
            r26 = r35
            r17 = r37
            r21 = r11
            r22 = r0
            r23 = r20
            r24 = r14
            r25 = r2
            r28 = r17
            r21.<init>(r22, r23, r24, r25, r26, r28)
            r3 = 24
            X.PQr r13 = new X.PQr
            r13.<init>(r0, r3)
            r18 = 1
            r12 = r29
            r15 = r33
            boolean r3 = r7.A0B(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            if (r3 != 0) goto L_0x0090
            boolean r3 = r0.A09
            if (r3 != 0) goto L_0x0090
            X.0wc r4 = r0.A03
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>()
            java.lang.String r22 = android.util.Log.getStackTraceString(r3)
            X.0qQ.A07(r22)
            java.lang.String r23 = X.C51968G9o.A16(r0)
            X.0qQ.A07(r23)
            java.lang.String r0 = r0.A05
            r19 = r12
            r21 = r14
            r24 = r0
            r25 = r1
            r26 = r2
            r18 = r4
            X.C69836Nsy.A00(r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14437TwL.A00(X.N1a, com.instagram.model.direct.DirectShareTarget, X.TwL, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, boolean):void");
    }

    public static final void A01(C267664bz r10, Reel reel, AnonymousClass3BQ r12, C230222pE r13, AnonymousClass32A r14, AnonymousClass3N3 r15, SearchContext searchContext, C14437TwL twL) {
        List A1I = AnonymousClass7TE.A1I(reel);
        C14437TwL twL2 = twL;
        r14.A0C = twL2.A06;
        r14.A05 = new C16165Upq((Activity) twL2.A01, r15.AeY(), r13);
        r14.A01 = r10;
        r14.A02 = twL2.A02;
        r14.A09 = "search_result";
        r14.A08 = searchContext;
        r14.A05(reel, r12, r15, A1I, A1I, A1I);
    }

    public final void A02() {
        UserSession userSession = this.A04;
        AnonymousClass0iw r0 = this.A02;
        new C230012om(r0, userSession).A0A(new AnonymousClass6KN(new AnonymousClass6KM("su_in_search_null_state", "", r0.getModuleName())));
        FragmentActivity fragmentActivity = this.A01;
        C309516Yo r4 = new C309516Yo(fragmentActivity, userSession);
        r4.A0B((Bundle) null, FC6.A00().A00().A01("serp_suggested_users", fragmentActivity.getString(2131960850)));
        r4.A04();
    }

    public final void A03(AnonymousClass8ZN r5, C66569MWx mWx) {
        UserSession userSession = this.A04;
        DbY.A0u(this.A01, C250563lf.A02((C54689HOu) null, r5, LT9.A04(mWx, C14245TsS.A00(MusicProduct.IG_GLOBAL_SEARCH)), AnonymousClass7TF.A0b()), userSession, "audio_page");
    }

    public final void A06(Hashtag hashtag, String str, String str2, int i) {
        AnonymousClass7TG.A1N(hashtag, str);
        AnonymousClass0iw r4 = this.A02;
        String moduleName = r4.getModuleName();
        Bundle A0B = DbY.A0B("HashtagFeedFragment.ARGUMENT_SEARCH_QUERY_TEXT", str);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A04;
        C309516Yo A0Q = DbU.A0Q(fragmentActivity, userSession);
        A0Q.A0B = "search_result";
        Fragment A012 = W0l.A01(userSession);
        A012.setArguments(W0l.A00(hashtag, moduleName, "search_result"));
        A0Q.A0B(A0B, A012);
        A0Q.A09 = r4;
        A0Q.A07 = new WNM((C18072Vl0) null, this, str2, str, moduleName, "hashtag", i);
        A0Q.A04();
    }

    public final void A07(C18072Vl0 vl0, String str, String str2, int i) {
        String str3;
        double doubleValue;
        C18072Vl0 vl02 = vl0;
        String str4 = str;
        char A1U = AnonymousClass7TF.A1U(0, vl02, str4);
        FragmentActivity fragmentActivity = this.A01;
        UserSession userSession = this.A04;
        String A052 = vl02.A00().A05();
        0qQ.A07(A052);
        new Venue().A06(A052);
        Venue A002 = vl02.A00();
        if (A002.A00.getName() != null) {
            str3 = A002.A00.getName();
        } else {
            str3 = "";
        }
        double[] dArr = new double[2];
        double d = 0.0d;
        if (A002.A00() == null) {
            doubleValue = 0.0d;
        } else {
            doubleValue = A002.A00().doubleValue();
        }
        dArr[0] = doubleValue;
        if (A002.A01() != null) {
            d = A002.A01().doubleValue();
        }
        dArr[A1U] = d;
        AnonymousClass0iw r13 = this.A02;
        C18072Vl0 vl03 = vl02;
        C16923VBa.A00(fragmentActivity, new WNM(vl03, this, str2, str4, r13.getModuleName(), "place", i), r13, userSession, A002, "search_result", str3, dArr, false);
    }

    public final void A08(MusicAttributionConfig musicAttributionConfig) {
        UserSession userSession = this.A04;
        C56044Hrt A0C = C250563lf.A0C(28D.A4F);
        String str = null;
        MusicAssetModel musicAssetModel = musicAttributionConfig.A02;
        if (musicAssetModel != null) {
            str = musicAssetModel.A0E;
        }
        A0C.A0G = str;
        A0C.A08 = musicAttributionConfig;
        FragmentActivity fragmentActivity = this.A01;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(fragmentActivity, A0C.A00(), userSession, TransparentModalActivity.class, AnonymousClass000.A00(1176));
        Dbc.A0y(A022);
        A022.A0C(fragmentActivity);
    }

    public final void A09(User user, String str, String str2, int i) {
        String str3 = str;
        AnonymousClass7TG.A1N(user, str);
        AnonymousClass0iw r3 = this.A02;
        String moduleName = r3.getModuleName();
        UserSession userSession = this.A04;
        C46474Dfc A012 = C46548Dgp.A01(userSession, user.getId(), C273654mx.A00(3285), moduleName);
        String str4 = str2;
        A012.A0H = str2;
        int i2 = i;
        if (this.A0A) {
            Bundle A0A2 = C51973G9u.A0A(userSession, A012);
            FragmentActivity fragmentActivity = this.A01;
            AnonymousClass6W8 A0Y = DbV.A0Y(fragmentActivity, A0A2, userSession, ModalActivity.class, "profile");
            A0Y.A02 = r3;
            A0Y.A01 = new WNM((C18072Vl0) null, this, str4, str3, r3.getModuleName(), PublicKeyCredentialControllerUtility.JSON_KEY_USER, i2);
            A0Y.A0C(fragmentActivity);
            return;
        }
        Fragment A002 = C46447Df9.A00(userSession, A012);
        C309516Yo A0Q = DbU.A0Q(this.A01, userSession);
        A0Q.A0B = "search_result";
        A0Q.A0B((Bundle) null, A002);
        A0Q.A09 = r3;
        A0Q.A07 = new WNM((C18072Vl0) null, this, str4, str3, moduleName, PublicKeyCredentialControllerUtility.JSON_KEY_USER, i2);
        A0Q.A04();
    }
}
