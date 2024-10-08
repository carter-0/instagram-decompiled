package X;

import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AppstoreMetadataDict;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IGCTMessagingAdsInfoDict;
import com.instagram.api.schemas.IGRFSurveyInfoDict;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.api.schemas.TestimonialDict;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public final class XPN extends 1P0 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass3DY A01;
    public final /* synthetic */ C52170GHm A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ boolean A05;

    public XPN(AnonymousClass3DY r1, C52170GHm gHm, String str, String str2, int i, boolean z) {
        this.A02 = gHm;
        this.A03 = str;
        this.A04 = str2;
        this.A00 = i;
        this.A01 = r1;
        this.A05 = z;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        C267324bN r2;
        int A032 = AnonymousClass0fD.A03(1054341315);
        C43803CDv cDv = (C43803CDv) obj;
        int A033 = AnonymousClass0fD.A03(2114544029);
        0qQ.A0B(cDv, 0);
        C52170GHm gHm = this.A02;
        UserSession userSession = gHm.A06;
        UserSession userSession2 = userSession;
        if (!182.A06(0Tu.A06, userSession, 36319239887658014L)) {
            i = -706431101;
        } else {
            XM9 xm9 = cDv.A01;
            if (xm9 == null) {
                C41845B3m.A0v();
                throw AnonymousClass00P.createAndThrow();
            }
            IntentAwareAdsInfo intentAwareAdsInfo = xm9.A00;
            XMA xma = xm9.A01;
            if (xma == null) {
                i = -1223261202;
            } else {
                List<YCC> list = xma.A01;
                boolean z = this.A05;
                C51984GAh gAh = gHm.A08;
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (YCC AZ4 : list) {
                    String AZ42 = AZ4.AZ4();
                    0qQ.A0B(AZ42, 0);
                    Long A10 = AnonymousClass7TE.A10(AZ42);
                    if (A10 != null) {
                        A1C.add(A10);
                    }
                }
                gAh.A01(intentAwareAdsInfo, Boolean.valueOf(z), A1C);
                ArrayList A0p = AnonymousClass7TF.A0p(list);
                for (YCC F0E : list) {
                    XET F0E2 = F0E.F0E(1E4.A00(userSession2));
                    0sn r22 = 0sn.A00;
                    0qQ.A0B(intentAwareAdsInfo, 0);
                    0qQ.A0B(r22, 1);
                    1E9 r5 = new 1E9(new 1hu((UserSession) null), 6, false);
                    IntentAwareAdsInfo F5F = intentAwareAdsInfo.F5F();
                    ArrayList<YCC> A0p2 = AnonymousClass7TF.A0p(r22);
                    Iterator it = r22.iterator();
                    while (it.hasNext()) {
                        A0p2.add(((YCC) it.next()).F0D(r5));
                    }
                    1E9 r4 = new 1E9(new 1hu((UserSession) null), 6, false);
                    IntentAwareAdsInfo F5F2 = F5F.F5F();
                    ArrayList A0p3 = AnonymousClass7TF.A0p(A0p2);
                    for (YCC F0D : A0p2) {
                        A0p3.add(F0D.F0D(r4));
                    }
                    BEA bea = new BEA(F5F2, A0p3);
                    String str = F0E2.A10;
                    String str2 = F0E2.A11;
                    C257533xY r56 = F0E2.A0a;
                    String str3 = F0E2.A12;
                    C257553xa r34 = F0E2.A0E;
                    String str4 = F0E2.A13;
                    C257573xc r222 = F0E2.A02;
                    String str5 = F0E2.A14;
                    C250173l1 r23 = F0E2.A03;
                    List list2 = F0E2.A1R;
                    String str6 = F0E2.A15;
                    AppstoreMetadataDict appstoreMetadataDict = F0E2.A04;
                    BrandedContentAdsPaidPartnershipLabelRemovalOption brandedContentAdsPaidPartnershipLabelRemovalOption = F0E2.A05;
                    Long l = F0E2.A0z;
                    C257603xf r26 = F0E2.A06;
                    String str7 = F0E2.A16;
                    String str8 = F0E2.A17;
                    AnonymousClass493 r28 = F0E2.A08;
                    C233492vo r60 = F0E2.A0e;
                    List list3 = F0E2.A1S;
                    List list4 = F0E2.A1T;
                    C257613xg r31 = F0E2.A0B;
                    C257633xi r32 = F0E2.A0C;
                    C257653xk r27 = F0E2.A07;
                    C250243l8 r29 = F0E2.A09;
                    IGCTMessagingAdsInfoDict iGCTMessagingAdsInfoDict = F0E2.A0H;
                    Boolean bool = F0E2.A0f;
                    String str9 = F0E2.A18;
                    Boolean bool2 = F0E2.A0g;
                    String str10 = F0E2.A19;
                    Integer num = F0E2.A0u;
                    List list5 = F0E2.A1U;
                    DynamicProductAdDisplayOption dynamicProductAdDisplayOption = F0E2.A0D;
                    Boolean bool3 = F0E2.A0h;
                    Boolean bool4 = F0E2.A0i;
                    String str11 = F0E2.A1A;
                    String str12 = F0E2.A1B;
                    AdFormatType adFormatType = F0E2.A01;
                    C257703xp r35 = F0E2.A0F;
                    1bK r54 = F0E2.A0Y;
                    int i2 = F0E2.A00;
                    String str13 = F0E2.A1C;
                    List list6 = F0E2.A1V;
                    C46229DRk dRk = F0E2.A0G;
                    C250353lJ r38 = F0E2.A0I;
                    String str14 = F0E2.A1D;
                    C257753xu r40 = F0E2.A0K;
                    IGRFSurveyInfoDict iGRFSurveyInfoDict = F0E2.A0L;
                    C257783xx r43 = F0E2.A0N;
                    String str15 = F0E2.A1E;
                    AnonymousClass3I1 r57 = F0E2.A0b;
                    List list7 = F0E2.A1W;
                    Boolean bool5 = F0E2.A0j;
                    Boolean bool6 = F0E2.A0k;
                    Boolean bool7 = F0E2.A0l;
                    boolean z2 = F0E2.A1Y;
                    Boolean bool8 = F0E2.A0m;
                    Boolean bool9 = F0E2.A0n;
                    Boolean bool10 = F0E2.A0o;
                    Boolean bool11 = F0E2.A0p;
                    Boolean bool12 = F0E2.A0q;
                    Boolean bool13 = F0E2.A0r;
                    Boolean bool14 = F0E2.A0s;
                    Integer num2 = F0E2.A0v;
                    List list8 = F0E2.A1X;
                    String str16 = F0E2.A1F;
                    C42050BFd bFd = F0E2.A0O;
                    C257813y0 r39 = F0E2.A0J;
                    String str17 = F0E2.A1G;
                    String str18 = F0E2.A1H;
                    C257793xy r49 = F0E2.A0T;
                    String str19 = F0E2.A1I;
                    Integer num3 = F0E2.A0w;
                    String str20 = F0E2.A1J;
                    C257843y3 r51 = F0E2.A0V;
                    C257863y5 r45 = F0E2.A0P;
                    String str21 = F0E2.A1K;
                    String str22 = F0E2.A1L;
                    C270134gF r46 = F0E2.A0Q;
                    String str23 = F0E2.A1M;
                    String str24 = F0E2.A1N;
                    C46230DRl dRl = F0E2.A0S;
                    C257883y7 r47 = F0E2.A0R;
                    String str25 = F0E2.A1O;
                    String str26 = F0E2.A1P;
                    C257903y9 r58 = F0E2.A0c;
                    C257923yB r59 = F0E2.A0d;
                    Boolean bool15 = F0E2.A0t;
                    boolean z3 = F0E2.A1Z;
                    C257953yE r50 = F0E2.A0U;
                    1bK r55 = F0E2.A0Z;
                    TestimonialDict testimonialDict = F0E2.A0W;
                    Integer num4 = F0E2.A0x;
                    C257983yH r42 = F0E2.A0M;
                    String str27 = F0E2.A1Q;
                    C257993yI r53 = F0E2.A0X;
                    Integer num5 = F0E2.A0y;
                    0qQ.A0B(str2, 1);
                    0qQ.A0B(str3, 3);
                    AnonymousClass7TF.A1G(str4, 5, list2);
                    0qQ.A0B(list3, 19);
                    0qQ.A0B(list6, 42);
                    0qQ.A0B(list7, 51);
                    0qQ.A0B(list8, 64);
                    0qQ.A0B(str16, 65);
                    0qQ.A0B(str17, 68);
                    0qQ.A0B(str27, 95);
                    A0p.add(C295325ny.A04(new XET(adFormatType, r222, r23, appstoreMetadataDict, brandedContentAdsPaidPartnershipLabelRemovalOption, r26, r27, r28, r29, bea, r31, r32, dynamicProductAdDisplayOption, r34, r35, dRk, iGCTMessagingAdsInfoDict, r38, r39, r40, iGRFSurveyInfoDict, r42, r43, bFd, r45, r46, r47, dRl, r49, r50, r51, testimonialDict, r53, r54, r55, r56, r57, r58, r59, r60, bool, bool2, bool3, bool4, bool5, bool6, bool7, bool8, bool9, bool10, bool11, bool12, bool13, bool14, bool15, num, num2, num3, num4, num5, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, str15, str16, str17, str18, str19, str20, str21, str22, str23, str24, str25, str26, str27, list2, list3, list4, list5, list6, list7, list8, i2, z2, z3)));
                }
                if (A0p.isEmpty()) {
                    gAh.A02(intentAwareAdsInfo, "pae_returns_zero_ads");
                    i = 393582441;
                } else if (C52170GHm.A0B) {
                    gAh.A02(intentAwareAdsInfo, AnonymousClass000.A00(2797));
                    i = -1265641713;
                } else {
                    C233492vo r0 = xma.A00;
                    if (r0 != null) {
                        C233492vo FGd = r0.FGd();
                        String BUa = intentAwareAdsInfo.BUa();
                        if (0qQ.A0K(BUa, "0") || BUa == null) {
                            BUa = UUID.randomUUID().toString();
                            0qQ.A07(BUa);
                        }
                        int size = A0p.size();
                        if (size == 1) {
                            r2 = C295375o3.A03((AnonymousClass3OA) A0p.get(0));
                        } else if (size != 4) {
                            i = -376209643;
                        } else {
                            r2 = C295375o3.A01(new C376699Iz((IntentAwareAdsInfoIntf) intentAwareAdsInfo, BUa, (List) A0p), (AnonymousClass3OA) A0p.get(0));
                        }
                        C376489Ie r02 = new C376489Ie(r2, new C233462vl((C67241sS) null, FGd, (String) null, 0, 0, 0, 0, 0, 16382, false, false, false, false));
                        C233072uu r24 = gHm.A00;
                        if (r24 != null) {
                            r24.Dlz(AnonymousClass05K.A00, AnonymousClass7TE.A1I(r02));
                        }
                        i = 1666706937;
                    } else {
                        i = -610293795;
                    }
                }
            }
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(-2111608170, A032);
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-2118693967);
        this.A02.A01 = AnonymousClass05K.A00;
        AnonymousClass0fD.A0A(496971506, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(1604625673);
        C52170GHm gHm = this.A02;
        gHm.A02.invoke();
        C51984GAh gAh = gHm.A08;
        String str = this.A03;
        String str2 = this.A04;
        int i = this.A00;
        AnonymousClass3DY r9 = this.A01;
        boolean z = C52170GHm.A0B;
        boolean z2 = this.A05;
        0qQ.A0B(r9, 3);
        0Aj A0e = AnonymousClass7TE.A0e(gAh.A01, C273654mx.A00(757));
        if (A0e.isSampled()) {
            A0e.A9F("chaining_position", C51971G9r.A0m());
            C249763kK r11 = gAh.A03;
            A0e.AAJ("chaining_session_id", r11.getSessionId());
            A0e.AAJ(C273654mx.A00(2161), r11.getSessionId());
            A0e.AAJ("contextual_ads_category", "");
            C51969G9p.A1A(A0e, gAh.A00);
            A0e.AAJ(C273654mx.A00(3440), r9.A00);
            A0e.A9F(C273654mx.A00(3045), 9L);
            A0e.A9F("hscroll_seed_ad_id", AnonymousClass7TE.A10(str));
            A0e.A9F(C273654mx.A00(2454), DbV.A0p(A0e, C273654mx.A00(2455), str2, i));
            A0e.A7p("is_clips_async_ads_in_flight", Boolean.valueOf(z));
            A0e.A7p(C273654mx.A00(2943), Boolean.valueOf(z2));
            A0e.Cgf();
        }
        gHm.A01 = AnonymousClass05K.A01;
        AnonymousClass0fD.A0A(1102483425, A032);
    }
}
