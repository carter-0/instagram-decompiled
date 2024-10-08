package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.aistudio.editor.AiCreationRepositoryV2$quickCreateAi$2;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class KX0 extends C252733pa {
    public AnonymousClass1EO A00;
    public C65365Ls6 A01;
    public C262204Co A02;
    public final UserSession A03;
    public final 1vn A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final 05G A0V;
    public final 05G A0W;
    public final 05G A0X;
    public final 05G A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;
    public final AnonymousClass0Ud A0b;
    public final AnonymousClass0Ud A0c;
    public final AnonymousClass0Ud A0d;
    public final AnonymousClass0Ud A0e;
    public final AnonymousClass0Ud A0f;
    public final AnonymousClass0Ud A0g;
    public final AnonymousClass0Ud A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;
    public final AnonymousClass0Ud A0k = C63563KzC.A00;
    public final AnonymousClass0Ud A0l;
    public final AnonymousClass0Ud A0m;
    public final AnonymousClass0Ud A0n;
    public final AnonymousClass0Ud A0o;
    public final AnonymousClass0Ud A0p;
    public final AnonymousClass0Ud A0q;
    public final AnonymousClass0Ud A0r;
    public final AnonymousClass0Ud A0s;
    public final AnonymousClass0Ud A0t;
    public final AnonymousClass0Ud A0u;
    public final AnonymousClass0Ud A0v;
    public final AnonymousClass0Ud A0w;
    public final AnonymousClass0Ud A0x;
    public final AnonymousClass0Ud A0y = C63563KzC.A01;
    public final AnonymousClass0Ud A0z = C63563KzC.A02;

    public static final String A00(KX0 kx0, C43347Bwl bwl) {
        Enum enumR;
        if (bwl != null) {
            enumR = bwl.getOptionalEnumField(0, AnonymousClass000.A00(593), C62626Kix.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            enumR = null;
        }
        Iterator A0u2 = AnonymousClass7TF.A0u(JTO.A19(kx0.A0c));
        while (A0u2.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u2);
            String A13 = DbT.A13(A1J);
            if (enumR == A1J.getValue()) {
                return A13;
            }
        }
        return null;
    }

    public final void A06(ImageUrl imageUrl, String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        AnonymousClass1EO r0;
        AnonymousClass7TF.A1O(this.A0U, false);
        C66375MPh mPh = (C66375MPh) this.A0v.getValue();
        AnonymousClass0eM r3 = this.A09;
        JTO.A0U(r3).A06.markerStart(673067423);
        JTO.A0U(r3).A05("quick_create_request_sent");
        if ((mPh instanceof C64472LcZ) && (r0 = ((C64472LcZ) mPh).A00) != null) {
            r0.cancel();
        }
        String str7 = str;
        0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, str7, DevServerEntity.COLUMN_DESCRIPTION);
        0Df.A00(A032, AnonymousClass7TF.A0b(), "client_mutation_id");
        0Df.A00(A032, str3, C49902FCf.A00());
        boolean z2 = z;
        0Df.A00(A032, Boolean.valueOf(z2), "lightweight");
        String str8 = str2;
        if (str2 != null) {
            0Df.A00(A032, str8, "template_option_id");
        }
        2IS A042 = C41845B3m.A04();
        C64091Eg pandoGraphQLRequest = new PandoGraphQLRequest(C41847B3o.A04(A032, A042, "input"), "KirbyQuickCreateAiMutation", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43324BwO.class, true, (PandoRealtimeInfoJNI) null, 96, (String) null, "xfb_kirby_mobile_quick_create_genai_persona", AnonymousClass7TE.A1C());
        pandoGraphQLRequest.setNetworkTimeoutSeconds(30);
        this.A0C.Epw((Object) null);
        0sP mMr = new C66308MMr(this, 30);
        ImageUrl imageUrl2 = imageUrl;
        String str9 = str4;
        String str10 = str5;
        String str11 = str6;
        if (182.A06(0Tu.A05, this.A03, 36330204939043335L)) {
            AnonymousClass7TE.A1Z(new AiCreationRepositoryV2$quickCreateAi$2(pandoGraphQLRequest, this, imageUrl2, str7, str9, str10, str11, (AnonymousClass4D7) null, mMr, z2), this.A01);
            return;
        }
        this.A0V.Epw(new C64472LcZ(this.A04.A01(new C64394LbB(mMr, 0), new C64399LbG(this, imageUrl2, str9, str10, str11, mMr, z2), pandoGraphQLRequest), str7));
    }

    public final void A07(String str) {
        String str2 = str;
        0qQ.A0B(str, 0);
        AnonymousClass4D7 A0t2 = C51975G9x.A0t(this.A02);
        Object value = this.A0b.getValue();
        if (value != null) {
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, ((C61061Jvz) value).A04, "persona_id");
            2IS A0D2 = JTQ.A0D(A032, str, "image_prompt");
            2IS A042 = C41845B3m.A04();
            DbW.A18(A032, A0D2, "input");
            PandoGraphQLRequest A002 = C64406LbN.A00(A0D2, A042);
            A002.setNetworkTimeoutSeconds(30);
            AnonymousClass7TF.A1O(this.A0M, true);
            this.A02 = C51966G9m.A1L(new C66174MGl((Object) this, (Object) A002, str2, A0t2, 1), this.A01);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public static final List A01(KX0 kx0, C61061Jvz jvz) {
        C61061Jvz A0M2;
        List list;
        if (JTO.A19(kx0.A0c).get(jvz.A08) != C62626Kix.PUBLIC || (A0M2 = JTP.A0M(kx0.A0C)) == null || (list = A0M2.A0E) == null) {
            return 0sn.A00;
        }
        ArrayList<C61055Jvt> A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (((C61055Jvt) next).A03) {
                A1C.add(next);
            }
        }
        ArrayList A0r2 = AnonymousClass7TG.A0r(A1C);
        for (C61055Jvt jvt : A1C) {
            DbU.A1X(jvt.A00, A0r2);
        }
        return A0r2;
    }

    public static final void A03(KX0 kx0) {
        String str;
        KX0 kx02 = kx0;
        JTO.A0U(kx02.A09).A05("quick_create_image_gen_subscription_started");
        kx02.A05();
        2IS A042 = C41845B3m.A04();
        2IS A043 = C41845B3m.A04();
        C61061Jvz A0M2 = JTP.A0M(kx02.A0C);
        if (A0M2 == null || (str = A0M2.A07) == null) {
            str = "";
        }
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A042, "persona_version_Id", str), "KirbyAiCreationImageGenerationSubscription", A042.getParamsCopy(), A043.getParamsCopy(), C43316BwG.class, false, PandoRealtimeInfoJNI.forSubscription("xfb_genai_persona_initial_creation_image_subscribe"), 0, (String) null, "xfb_genai_persona_initial_creation_image_subscribe", AnonymousClass7TE.A1C());
        kx02.A00 = 1vm.A01(kx02.A03).A01(new C64394LbB(kx02, 1), new C64397LbE(kx02, 0), pandoGraphQLRequest);
        AnonymousClass7TE.A1Z(new C59676JTh((Object) kx02, (AnonymousClass4D7) null, 42), kx02.A01);
    }

    public final void A05() {
        AnonymousClass1EO r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KX0(UserSession userSession) {
        super("AiCreationRepositoryV2", AnonymousClass43D.A00(1464279681));
        Boolean A0u2 = AnonymousClass7TE.A0u();
        this.A03 = userSession;
        this.A04 = 1vm.A01(userSession);
        02z A1J = JTO.A1J();
        this.A0T = A1J;
        this.A0t = 10b.A03(A1J);
        02z A10 = DbS.A10("");
        this.A0B = A10;
        this.A0a = 10b.A03(A10);
        02z A012 = 106.A01(C64473Lca.A00);
        this.A0V = A012;
        this.A0v = 10b.A03(A012);
        02z A013 = 106.A01((Object) null);
        this.A0C = A013;
        this.A0b = 10b.A03(A013);
        this.A0W = 106.A01((Object) null);
        02z A014 = 106.A01((Object) null);
        this.A0E = A014;
        this.A0d = 10b.A03(A014);
        02z A015 = 106.A01((Object) null);
        this.A0Y = A015;
        this.A0x = 10b.A03(A015);
        02z A102 = DbS.A10(A0u2);
        this.A0M = A102;
        this.A0m = 10b.A03(A102);
        02z A0q2 = JTQ.A0q();
        this.A0D = A0q2;
        this.A0c = 10b.A03(A0q2);
        02z A103 = DbS.A10("");
        this.A0X = A103;
        this.A0w = 10b.A03(A103);
        02z A016 = 106.A01(Integer.valueOf(C63112Krf.A00(userSession)));
        this.A0K = A016;
        this.A0j = 10b.A03(A016);
        02z A104 = DbS.A10(A0u2);
        this.A0U = A104;
        this.A0u = 10b.A03(A104);
        02z A017 = 106.A01((Object) null);
        this.A0A = A017;
        this.A0Z = 10b.A03(A017);
        02z A105 = DbS.A10(A0u2);
        this.A0Q = A105;
        this.A0q = 10b.A03(A105);
        02z A106 = DbS.A10(A0u2);
        this.A0R = A106;
        this.A0r = 10b.A03(A106);
        02z A107 = DbS.A10(A0u2);
        this.A0S = A107;
        this.A0s = 10b.A03(A107);
        02z A018 = 106.A01((Object) null);
        this.A0J = A018;
        this.A0i = 10b.A03(A018);
        02z A108 = DbS.A10(A0u2);
        this.A0N = A108;
        this.A0n = 10b.A03(A108);
        02z A019 = 106.A01((Object) null);
        this.A0G = A019;
        this.A0f = 10b.A03(A019);
        02z A109 = DbS.A10(A0u2);
        this.A0O = A109;
        this.A0o = 10b.A03(A109);
        02z A0110 = 106.A01((Object) null);
        this.A0H = A0110;
        this.A0g = 10b.A03(A0110);
        02z A1010 = DbS.A10(A0u2);
        this.A0P = A1010;
        this.A0p = 10b.A03(A1010);
        02z A0111 = 106.A01((Object) null);
        this.A0I = A0111;
        this.A0h = 10b.A03(A0111);
        02z A1011 = DbS.A10(A0u2);
        this.A0L = A1011;
        this.A0l = 10b.A03(A1011);
        02z A0112 = 106.A01((Object) null);
        this.A0F = A0112;
        this.A0e = 10b.A03(A0112);
        this.A06 = AnonymousClass7TE.A1C();
        this.A07 = AnonymousClass7TE.A1C();
        this.A05 = AnonymousClass7TE.A1C();
        this.A09 = MMM.A00(this, 7);
        this.A08 = MMM.A00(this, 6);
    }

    public static final List A02(0sn<GSY> r6) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (r6 == null) {
            r6 = 0sn.A00;
        }
        for (GSY gsy : r6) {
            2IV r2 = new 2IV();
            r2.A09(String.valueOf(gsy.A01), "plugin_type");
            r2.A05("plugin_overrides", (List) null);
            r2.A05("enabled_apps", AnonymousClass7TE.A1I("INSTAGRAM"));
            r2.A08("is_enabled", (Boolean) gsy.A00);
            A1C.add(r2);
        }
        return 00k.A0a(A1C);
    }

    public static final void A04(KX0 kx0, C62320sa r4, int i, boolean z) {
        C310336ap A0X2 = DbV.A0X();
        A0X2.A0H = "ai_studio_creation_error";
        C62880wX r1 = kx0.A03.A03;
        DbS.A19(r1.A06(), A0X2, i);
        if (z) {
            DbW.A0q(r1.A06(), A0X2, 2131975551);
            A0X2.A0L = true;
            A0X2.A0A(new C65358Lry(r4, 0));
        }
        DbY.A1N(A0X2);
    }
}
