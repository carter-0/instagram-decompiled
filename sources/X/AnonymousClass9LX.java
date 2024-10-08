package X;

import android.content.Context;
import android.os.Looper;
import android.util.Base64;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.RedactedString;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.activesession.msysactivesession.MsysActiveUserSession;
import com.instagram.direct.send.mutation.armadilloexpresstransport.ArmadilloExpressNoteReplySender;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONObject;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9LX  reason: invalid class name */
public final class AnonymousClass9LX extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9LX(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.facebook.msys.mci.RedactedString, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v6, types: [X.0rm, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        C257443xP A012;
        String str;
        switch (this.A00) {
            case 0:
                return ((AnonymousClass7EV) this.A01).A00.A01().findViewById(R.id.refresh_image_view);
            case 1:
                return this.A01;
            case 2:
                return new AnonymousClass7AL(((AnonymousClass7PZ) this.A01).A00);
            case 3:
                return new C301265yp((UserSession) this.A01);
            case 4:
                return Boolean.valueOf(182.A06(0Tu.A05, (0lg) this.A01, 36327847001864952L));
            case 5:
                return Boolean.valueOf(182.A06(0Tu.A05, (0lg) this.A01, 36318058775385946L));
            case 6:
                UserSession userSession = (UserSession) this.A01;
                if (userSession.A07()) {
                    0kD.A0J("Invalid create foreground account session when user session is stopped", (Throwable) null, 0Yt.A0E(), 20134884);
                }
                AccountSession A013 = C300345wy.A01(userSession, 0);
                AnonymousClass66g.A00(userSession).A00 = A013;
                return A013;
            case 7:
                UserSession userSession2 = (UserSession) this.A01;
                AccountSession A014 = C300345wy.A01(userSession2, 1);
                AnonymousClass66g.A00(userSession2).A00 = A014;
                return A014;
            case 10:
                C301435zF r0 = DgwNetworkSessionPluginImpl.Companion;
                DGWClient dGWClient = DGWClientHolder.Companion.A00((UserSession) this.A01).client;
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
                0qQ.A07(scheduledThreadPoolExecutor);
                return new DgwNetworkSessionPluginImpl(dGWClient, scheduledThreadPoolExecutor);
            case 11:
                UserSession userSession3 = (UserSession) this.A01;
                Long BST = AnonymousClass0t1.A01.A01(userSession3).BST();
                if (BST == null) {
                    BST = 0L;
                    0wj.A01.AEf("msys_eimu_null", 20134884).report();
                }
                19i A015 = 0jh.A04.A01(userSession3).A01(19f.A1J);
                0qQ.A0B(userSession3, 0);
                String str2 = AnonymousClass1CT.A00(userSession3).A04;
                if (str2 == null) {
                    A012 = C2612848z.A00;
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("authorization", str2);
                    String obj = jSONObject.toString();
                    0qQ.A07(obj);
                    byte[] bytes = obj.getBytes(AnonymousClass15Q.A05);
                    0qQ.A07(bytes);
                    A012 = C257443xP.A01(Base64.encodeToString(bytes, 11));
                }
                0qQ.A0A(A012);
                if (!A012.A06()) {
                    0wj.A01.AEf("msys_ig_access_token_null", 20134884).report();
                }
                if (A015 == null) {
                    0wj.A01.AEf("msys_phoneId_null", 20134884).report();
                }
                RedactedString redactedString = RedactedString.$redex_init_class;
                String str3 = (String) A012.A05("");
                ? obj2 = new Object();
                str3.getClass();
                obj2.mNativeHolder = RedactedString.initNativeHolder(str3);
                String A04 = 0qv.A02.A04(C60960kU.A00);
                if (A04 != null) {
                    if (A015 == null || (str = A015.A01) == null) {
                        str = "";
                    }
                    AuthData authData = AuthData.$redex_init_class;
                    return new AuthData(obj2, (String) null, A04, str, BST.toString(), (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, 2, (Map) null);
                }
                throw new IllegalStateException("Required value was null.");
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AnonymousClass7VU((UserSession) this.A01);
            case 13:
                UserSession userSession4 = (UserSession) this.A01;
                2HR A002 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342156064348374640L));
                2HR A003 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342156064349095545L));
                2HR A004 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342156064349685376L));
                2HR A005 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313884063238419L));
                2HR A006 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36876834016591990L));
                2HR A007 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342157017830918510L));
                2HR A008 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314257725327858L));
                2HR A009 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342156064348636787L));
                2HR A0010 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36600929612599362L));
                2HR A0011 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055137498771L));
                2HR A0012 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571327455871L));
                2HR A0013 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046304031149L));
                2HR A0014 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046304883118L));
                2HR A0015 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046305014191L));
                2HR A0016 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046305079728L));
                2HR A0017 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571328504449L));
                2HR A0018 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571329815179L));
                2HR A0019 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571328569986L));
                2HR A0020 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342163580541936256L));
                2HR A0021 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571329749642L));
                2HR A0022 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313085199255268L));
                2HR A0023 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36594564471260937L));
                2HR A0024 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36594564471326474L));
                0t0 A016 = AnonymousClass0eN.A01(new C73920Pm0(userSession4, 40));
                2HR A0025 = 2HP.A00(userSession4, AnonymousClass0yP.A00(37157480064745528L));
                2HR A0026 = 2HP.A00(userSession4, AnonymousClass0yP.A00(37157480065007673L));
                2HR A0027 = 2HP.A00(userSession4, AnonymousClass0yP.A00(37157480064679991L));
                2HR A0028 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135008372L));
                2HR A0029 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313089494222565L));
                2HR A0030 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313046544615022L));
                2HR A0031 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135467130L));
                2HR A0032 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135532667L));
                2HR A0033 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055137826455L));
                2HR A0034 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36319308607593595L));
                2HR A0035 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135270519L));
                2HR A0036 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135663741L));
                2HR A0037 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313450271475716L));
                2HR A0038 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055134484079L));
                2HR A0039 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135204982L));
                2HR A0040 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135139445L));
                2HR A0041 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055135794815L));
                2HR A0042 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314429524281898L));
                2HR A0043 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314438113954348L));
                2HR A0044 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314511128398489L));
                2HR A0045 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314433818987051L));
                2HR A0046 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314429524019751L));
                2HR A0047 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342157438737779240L));
                2HR A0048 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314429524150825L));
                2HR A0049 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342157017830984047L));
                2HR A0050 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342157017831049584L));
                2HR A0051 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314257725393395L));
                2HR A0052 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055137367697L));
                2HR A0053 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36315284222512243L));
                2HR A0054 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313403026900908L));
                2HR A0055 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313403026966445L));
                2HR A0056 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313403027031982L));
                2HR A0057 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313403027097519L));
                0t0 A017 = AnonymousClass0eN.A01(new C73920Pm0(userSession4, 41));
                2HR A0058 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055136908938L));
                2HR A0059 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314395164412439L));
                2HR A0060 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36314395164346902L));
                2HR A0061 = 2HP.A00(userSession4, AnonymousClass0yP.A00(2342156064351389334L));
                2HR A0062 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313892653107484L));
                2HR A0063 = 2HP.A00(userSession4, AnonymousClass0yP.A00(36313076609779411L));
                return new AnonymousClass2HN(A002, A003, A004, A005, A007, A006, A009, A0010, A008, A0011, A0012, A0013, A0014, A0015, A0016, A0017, A0018, A0019, A0020, A0021, A0022, A0023, A0024, A0025, A0026, A0027, A0028, A0029, A0030, A0031, A0032, A0033, A0034, A0035, A0036, A0037, A0038, A0039, A0040, A0041, A0042, A0043, A0044, A0045, A0046, A0047, A0048, A0049, A0050, A0051, A0052, A0053, A0054, A0055, A0056, A0057, A0058, A0062, 2HP.A00(userSession4, AnonymousClass0yP.A00(36313076610434776L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315773848849949L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315773849439775L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315773849505312L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315816798588471L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315816798522934L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055138547361L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36316886245315269L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317135353484072L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317298562372571L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317298562307034L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317298562438108L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36598795013721379L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317320037143574L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055139071655L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317539080344864L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36318398073804910L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36318398073870447L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36600306842406739L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(37163256795955469L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(37163256796021006L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36318831865960938L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(37163256796152079L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36318831866092011L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36322538422479087L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36885488375956076L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36885488375693931L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(37166963352535483L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36319639319682605L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36313055140251313L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36328757534932552L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36319656499224114L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36320240614842502L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36317320037667863L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36321726673462944L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(2342164916276045654L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36321907062482776L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(2342164916276111191L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36321907062548313L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36321907062613850L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(2342164735887353506L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36315949950766898L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(2342163580542526084L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36322740285942138L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36322740286925185L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36321907062679387L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36320571329225350L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046305997233L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046306062770L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36602046306128307L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36330230708716053L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36611705685547267L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36330230708781590L)), 2HP.A00(userSession4, AnonymousClass0yP.A00(36330230708912663L)), A0059, A0060, A0061, A0063, A016, A017);
            case 14:
                Runnable runnable = (Runnable) this.A01;
                if (runnable == null) {
                    return null;
                }
                runnable.run();
                return C60340gF.A00;
            case 15:
                AnonymousClass7N4 r02 = (AnonymousClass7N4) this.A01;
                return new C72491P8a(r02.A04, new C388979oh(r02.A07));
            case 16:
                AnonymousClass7N4 r03 = (AnonymousClass7N4) this.A01;
                return new AnonymousClass78D(r03.A04, new AnonymousClass78B(r03.A07));
            case 17:
                UserSession userSession5 = (UserSession) this.A01;
                return new AnonymousClass6AQ(userSession5, 2Hz.A00(userSession5), 2Hi.A00(userSession5));
            case EglBase14Impl.EGLExt_SDK_VERSION:
                UserSession userSession6 = (UserSession) this.A01;
                return new C3030567f(2HP.A00(userSession6, AnonymousClass0yP.A00(2342156218967066432L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36329088247414559L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36610563224180787L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530111784691L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322714516007281L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530118141691L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36610563225294905L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530119059198L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36321907062875996L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286728575L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36610563224705078L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342161901217127116L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342167020810088106L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36321481861440950L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342161454532728960L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36328224959249499L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318806095829465L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36600281072471873L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318144671324081L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319656499224114L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319660794191411L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36326098950239747L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286663038L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36329088248463146L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142282948L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446773535186L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375214639231L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596918448L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36328937923559100L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342156064352175776L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286073212L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064452061575L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064452127112L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319308607265913L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319458930728351L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319454635761053L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319308607134840L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319308607069303L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142676169L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142610632L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142545095L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142414021L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302861468692L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36328899268853415L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596066470L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596066470L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064451930501L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064451864964L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064451996038L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314064451799427L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324127560183623L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055140710068L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314489653561975L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314330739771914L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375214442621L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596721838L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596525228L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740285942138L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36315816798457397L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36321481860326827L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530118797053L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318892002908872L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055138743972L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055138547361L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302861075471L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286794112L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055141496510L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302861403155L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36329088248725291L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375213721718L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36321907062548313L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324518402273408L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342164916276045654L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302860944398L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302860551178L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302860354568L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318891999500962L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055141627583L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302861534229L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317298562241497L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055138023066L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318892001270453L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302861206544L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055140972216L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302860682252L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36317302859830278L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322714515941744L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324518402338945L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318445318969471L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740285811065L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286597501L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36595964630468892L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36595964630534429L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36329148376956758L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36595805716613377L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342161901214702258L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36603850191082458L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651831497L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651765960L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652749011L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652683474L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651503812L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651569349L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651962571L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651897034L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652355791L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652290254L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652552400L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652617937L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652028108L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597652093645L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651634886L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342157597651700423L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36881841957241251L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318892002056894L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322409573263504L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(2342156064356173510L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324518402404482L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36316057316626315L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375214573694L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36879007270174950L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36605486572836083L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(37160482247082099L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36319308607265913L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530119583487L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530118272764L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36604215262975008L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36604215263040545L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36328852024409733L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36594530117748474L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36328224959380572L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446773338575L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36604215263564834L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375214770305L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36598777836866835L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36598777837128982L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36598777836997909L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36609562496735097L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36604215262581791L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322375214311548L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(37166800144302514L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36603850190951385L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36609562496800634L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36609699935688605L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36609699935688605L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446773862871L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446774125018L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446774387166L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36601921750634873L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36320446774256092L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055141889728L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596197543L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36324011596197543L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36313055142741706L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36314429524019751L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36322740286007675L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36598777836932372L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318028706813705L)), 2HP.A00(userSession6, AnonymousClass0yP.A00(36318028706748168L)));
            case 19:
                17k.A0J(!0qQ.A0K(Thread.currentThread(), Looper.getMainLooper().getThread()), "To avoid ANRs, IgMailbox initialization should not run on main thread", new Object[0]);
                ? obj3 = new Object();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                1aD.A01((UserSession) this.A01, C66579MXk.A00(576)).A03(new C73448Pcq(countDownLatch, obj3));
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                    0KC.A0E("IgMailbox", "Interrupted when initializing IgMailbox");
                }
                Object obj4 = obj3.A00;
                if (obj4 != null) {
                    return new C295615oa((Mailbox) obj4);
                }
                throw new IllegalStateException("Required value was null.");
            case 20:
                return new AnonymousClass1y9();
            case 21:
                return new AnonymousClass61J((UserSession) this.A01);
            case 22:
                UserSession userSession7 = (UserSession) this.A01;
                0qQ.A0B(userSession7, 0);
                return new C68949NbY(userSession7, new C327607Bl(C327587Bj.A02(userSession7)), new C327607Bl(C327587Bj.A01(userSession7)));
            case 23:
                UserSession userSession8 = (UserSession) this.A01;
                0qQ.A0B(userSession8, 0);
                return new C68948NbX(userSession8, new C327607Bl(C327587Bj.A02(userSession8)), new C327607Bl(C327587Bj.A00(userSession8)));
            case 24:
                UserSession userSession9 = (UserSession) this.A01;
                0qQ.A0B(userSession9, 0);
                return new C389029om(userSession9, new C327607Bl(C327587Bj.A01(userSession9)));
            case 25:
                UserSession userSession10 = (UserSession) this.A01;
                0qQ.A0B(userSession10, 0);
                return new AnonymousClass78J(userSession10, new C327607Bl(C327587Bj.A00(userSession10)));
            case 26:
                UserSession userSession11 = (UserSession) this.A01;
                02m r4 = 02m.A0p;
                0qQ.A07(r4);
                14i r3 = 14i.A08;
                int i = 20131727;
                if (182.A06(0Tu.A05, userSession11, 36324033071886026L)) {
                    i = 20127832;
                }
                return new 2I1(r4, r3, userSession11, i);
            case 27:
                02m r04 = 02m.A0p;
                0qQ.A07(r04);
                return new 2Hf(r04, (UserSession) this.A01);
            case 28:
                C61410nE r32 = C61410nE.A00;
                C638515i r2 = AnonymousClass15h.sStartupTypeDetector;
                0qQ.A07(r2);
                02m r1 = 02m.A0p;
                0qQ.A07(r1);
                return new 2He(r1, r32, C262454Eg.A00((UserSession) this.A01), r2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                02m r12 = 02m.A0p;
                0qQ.A07(r12);
                return new AnonymousClass7UH(r12, 14i.A08, (UserSession) this.A01);
            case 30:
                return new AnonymousClass8KX((UserSession) this.A01);
            case 31:
                return ((C252423p5) this.A01).A02("view_holder_preload");
            case 32:
                return ((C62320sa) this.A01).invoke();
            case 33:
                return new C2598043d((UserSession) this.A01);
            case 34:
                return 1Zm.A00(((AnonymousClass43O) this.A01).A04);
            case 35:
                return ((2dZ) this.A01).A0P;
            case 36:
                return Integer.valueOf(((2dZ) this.A01).AYI());
            case 37:
                return ((AnonymousClass38U) this.A01).A03.getResources().getString(2131959908);
            case 38:
                return ((AnonymousClass38U) this.A01).A03.getResources().getString(2131976541);
            case 39:
                return Integer.valueOf(((AnonymousClass388) this.A01).A05.getResources().getDimensionPixelSize(R.dimen.direct_composer_redesign_background_height));
            case 40:
                return new C274254nx((UserSession) this.A01);
            case Seq.NULL_REFNUM:
                return new C283125Gf((UserSession) this.A01);
            case Seq.RefTracker.REF_OFFSET:
                Context context = C60960kU.A00;
                0qQ.A07(context);
                return new C333537Zi(context, (UserSession) this.A01);
            case 43:
                return 28K.A00((UserSession) this.A01);
            case 44:
                return 28E.A00((UserSession) this.A01);
            case 45:
                return C282415Cz.A00(((1fk) this.A01).A00);
            case 46:
                UserSession userSession12 = ((1fk) this.A01).A00;
                return new OTH(userSession12, C70175NyT.A00(userSession12));
            case 47:
                return new ArmadilloExpressNoteReplySender(((1jp) this.A01).A00);
            case 48:
                return new A48(((1e4) this.A01).A00);
            case 49:
                return new A49(((1ds) this.A01).A00);
            default:
                return new MsysActiveUserSession((UserSession) this.A01);
        }
    }
}
