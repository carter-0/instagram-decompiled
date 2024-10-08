package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.meta.foa.performancelogging.lss.LocalSendSpeedMessageTypes;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class PA9 implements C74501Pvv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ OBX A04;
    public final /* synthetic */ C70694OGp A05;
    public final /* synthetic */ C70694OGp A06;
    public final /* synthetic */ C70694OGp A07;
    public final /* synthetic */ C70694OGp A08;
    public final /* synthetic */ C70694OGp A09;
    public final /* synthetic */ C70694OGp A0A;
    public final /* synthetic */ C70694OGp A0B;
    public final /* synthetic */ AnonymousClass7FU A0C;
    public final /* synthetic */ AnonymousClass7XS A0D;
    public final /* synthetic */ C333157Xw A0E;
    public final /* synthetic */ C333177Xy A0F;
    public final /* synthetic */ C332897Ww A0G;
    public final /* synthetic */ C332837Wo A0H;
    public final /* synthetic */ AnonymousClass7TK A0I;
    public final /* synthetic */ AnonymousClass7XC A0J;
    public final /* synthetic */ C332867Wr A0K;
    public final /* synthetic */ AnonymousClass7Ws A0L;
    public final /* synthetic */ AnonymousClass7X4 A0M;
    public final /* synthetic */ C333027Xj A0N;
    public final /* synthetic */ AnonymousClass7UB A0O;
    public final /* synthetic */ AnonymousClass7TL A0P;
    public final /* synthetic */ C333077Xo A0Q;
    public final /* synthetic */ AnonymousClass7XF A0R;
    public final /* synthetic */ AnonymousClass7YG A0S;
    public final /* synthetic */ C74329Pt5 A0T;
    public final /* synthetic */ AnonymousClass7YH A0U;
    public final /* synthetic */ AnonymousClass7YI A0V;
    public final /* synthetic */ AnonymousClass7YJ A0W;
    public final /* synthetic */ AnonymousClass7YL A0X;
    public final /* synthetic */ AnonymousClass7XK A0Y;
    public final /* synthetic */ C332257Ug A0Z;
    public final /* synthetic */ AnonymousClass7XG A0a;
    public final /* synthetic */ AnonymousClass7XB A0b;
    public final /* synthetic */ AnonymousClass7XN A0c;
    public final /* synthetic */ AnonymousClass7SN A0d;
    public final /* synthetic */ AnonymousClass7XO A0e;
    public final /* synthetic */ AnonymousClass7XP A0f;
    public final /* synthetic */ AnonymousClass7X2 A0g;
    public final /* synthetic */ N2I A0h;
    public final /* synthetic */ OFD A0i;
    public final /* synthetic */ C70562OBk A0j;
    public final /* synthetic */ OG4 A0k;
    public final /* synthetic */ C328837Gl A0l;
    public final /* synthetic */ C328837Gl A0m;
    public final /* synthetic */ OG5 A0n;
    public final /* synthetic */ MessageActionsViewModel A0o;
    public final /* synthetic */ C254703su A0p;
    public final /* synthetic */ C254743sy A0q;
    public final /* synthetic */ C273414mX A0r;
    public final /* synthetic */ List A0s;
    public final /* synthetic */ C62320sa A0t;
    public final /* synthetic */ boolean A0u;
    public final /* synthetic */ boolean A0v;
    public final /* synthetic */ boolean A0w;

    public final void CI7(Integer num, String str, boolean z) {
        C74317Pst pst;
        Integer num2 = num;
        0qQ.A0B(num2, 0);
        C71107Ocl ocl = C71107Ocl.A00;
        AnonymousClass7FU r30 = this.A0C;
        Activity activity = this.A01;
        UserSession userSession = this.A03;
        C254743sy r63 = this.A0q;
        int i = this.A00;
        List list = this.A0s;
        C254703su r62 = this.A0p;
        boolean z2 = this.A0v;
        MessageActionsViewModel messageActionsViewModel = this.A0o;
        View view = this.A02;
        AnonymousClass7X2 r52 = this.A0g;
        AnonymousClass7YJ r44 = this.A0W;
        AnonymousClass7YG r42 = this.A0S;
        C333157Xw r32 = this.A0E;
        AnonymousClass7YI r43 = this.A0V;
        C70694OGp oGp = this.A08;
        C70694OGp oGp2 = this.A0A;
        C70694OGp oGp3 = this.A07;
        AnonymousClass7XP r51 = this.A0f;
        AnonymousClass7X4 r38 = this.A0M;
        AnonymousClass7YL r45 = this.A0X;
        AnonymousClass7XG r47 = this.A0a;
        C333077Xo r40 = this.A0Q;
        AnonymousClass7XF r41 = this.A0R;
        AnonymousClass7XK r46 = this.A0Y;
        C328837Gl r58 = this.A0l;
        C328837Gl r59 = this.A0m;
        AnonymousClass7XN r49 = this.A0c;
        AnonymousClass7XS r31 = this.A0D;
        AnonymousClass7XC r35 = this.A0J;
        OFD ofd = this.A0i;
        AnonymousClass7SN r9 = this.A0d;
        C332257Ug r8 = this.A0Z;
        AnonymousClass7XB r48 = this.A0b;
        C332867Wr r36 = this.A0K;
        C70694OGp oGp4 = this.A06;
        C332897Ww r34 = this.A0G;
        AnonymousClass7XO r50 = this.A0e;
        OG4 og4 = this.A0k;
        C333177Xy r33 = this.A0F;
        C74329Pt5 pt5 = this.A0T;
        C70562OBk oBk = this.A0j;
        C333027Xj r39 = this.A0N;
        C70694OGp oGp5 = this.A09;
        N2I n2i = this.A0h;
        AnonymousClass7Ws r17 = this.A0L;
        OBX obx = this.A04;
        OG5 og5 = this.A0n;
        C62320sa r11 = this.A0t;
        C70694OGp oGp6 = this.A0B;
        C70694OGp oGp7 = this.A05;
        String str2 = str;
        if (num2 == AnonymousClass05K.A0V) {
            C46498Dg1 dg1 = new C46498Dg1(activity, userSession);
            OMT omt = new OMT(userSession);
            dg1.A05 = true;
            dg1.A08(messageActionsViewModel.A0K);
            for (LongPressActionData longPressActionData : messageActionsViewModel.A0O) {
                C71379Ojd ojd = new C71379Ojd(activity, view, userSession, omt, obx, oGp, oGp2, oGp4, oGp5, oGp6, oGp7, r30, r31, r32, r33, r34, r35, r36, r17, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, n2i, longPressActionData, ofd, oBk, og4, r58, r59, og5, messageActionsViewModel, r62, r63, str2, list, r11, i, z2);
                boolean A1W = AnonymousClass7TF.A1W(longPressActionData.A01, C69376NkG.A07);
                String str3 = longPressActionData.A04;
                if (A1W) {
                    dg1.A0A(str3, ojd);
                } else {
                    dg1.A0C(str3, ojd);
                }
            }
            dg1.A03 = new IVE(r8, 1);
            AnonymousClass37D r6 = null;
            if ((activity instanceof C74317Pst) && (pst = (C74317Pst) activity) != null) {
                r6 = pst.AhO();
            }
            C49945FFy fFy = new C49945FFy(dg1);
            C331157Pu r3 = fFy.A02;
            Context context = fFy.A03.A00;
            C47417E1l e1l = fFy.A04;
            0qQ.A0B(e1l, 2);
            C331157Pu.A00(activity, context, e1l, r3, r6);
            C49945FFy.A01(fFy);
            r9.CLU();
            r8.Cyt();
            return;
        }
        MessageIdentifier messageIdentifier = messageActionsViewModel.A08;
        long j = messageActionsViewModel.A03;
        2FW r92 = messageActionsViewModel.A07;
        Activity activity2 = activity;
        View view2 = view;
        UserSession userSession2 = userSession;
        OBX obx2 = obx;
        C70694OGp oGp8 = oGp;
        C70694OGp oGp9 = oGp2;
        C70694OGp oGp10 = oGp3;
        C70694OGp oGp11 = oGp4;
        ocl.A04(activity2, view2, userSession2, obx2, oGp8, oGp9, oGp10, oGp11, oGp5, oGp6, oGp7, r30, r31, r32, r33, r34, r35, r36, r17, r38, r39, r40, r41, r42, pt5, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, n2i, ofd, oBk, og4, r58, r59, og5, r62, r92, messageIdentifier, r63, num2, messageActionsViewModel.A0F, str2, messageActionsViewModel.A0H, list, r11, i, j, z2, z);
    }

    public final void CIh(C254783t2 r27, C254743sy r28, String str, String str2, String str3, Map map, Map map2, boolean z) {
        C254923tH r11;
        MessageActionsViewModel messageActionsViewModel = this.A0o;
        List list = messageActionsViewModel.A0N;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (0qQ.A0K(next, str4)) {
                    if (next != null && 0qQ.A0K(str5, NetInfoModule.CONNECTION_TYPE_NONE)) {
                        this.A0H.DbX(messageActionsViewModel.A07, messageActionsViewModel.A08, str4, str6, messageActionsViewModel.A03);
                        return;
                    }
                }
            }
        }
        Boolean bool = messageActionsViewModel.A09;
        if (AnonymousClass7TF.A1Y(bool, true)) {
            r11 = C254923tH.ACT;
        } else if (AnonymousClass7TF.A1Y(bool, false) || r28 == null || (r11 = C66647MaG.A01(r28)) == null) {
            r11 = C254923tH.DJANGO;
        }
        String A0s2 = DbV.A0s();
        UserSession userSession = this.A03;
        boolean z2 = z;
        String str7 = null;
        C254783t2 r12 = r27;
        AnonymousClass7UG.A00(userSession).A00(r11, r12, Boolean.valueOf(z2), (Boolean) null, AnonymousClass05K.A0Y, Integer.valueOf(messageActionsViewModel.A02), A0s2, map, map2);
        String str8 = null;
        C69240Nhu A012 = C328727Fx.A01(userSession, A0s2.hashCode());
        if (A012 != null) {
            A012.onStartFlow(z2);
            A012.onLogDataProcessingStart();
            A012.onLogTransportMessageStart();
            A012.annotateLocalDataId(A0s2);
            A012.annotateMessageType(LocalSendSpeedMessageTypes.REACTION);
            int i = messageActionsViewModel.A02;
            A012.annotateThreadType(i, AnonymousClass48O.A00(i));
            if (r27 != null) {
                str7 = AnonymousClass4KK.A02(r12);
            }
            A012.annotateOpenThreadId(str7);
            2FW r0 = messageActionsViewModel.A07;
            if (r0 != null) {
                str8 = r0.A00;
            }
            A012.annotateReactToType(str8);
            A012.annotateTransportType(r11.A00);
        }
        C332837Wo r9 = this.A0H;
        MessageIdentifier messageIdentifier = messageActionsViewModel.A08;
        long j = messageActionsViewModel.A03;
        r9.DRi(messageActionsViewModel.A07, messageIdentifier, str4, str5, str6, A0s2, j, false, true);
    }

    public final void Cyt() {
        this.A0Z.CyY();
    }

    public final void D9I() {
        if (this.A0u) {
            this.A0U.EJK();
        }
        C273414mX r0 = this.A0r;
        if (r0 != null) {
            r0.Cyf();
        }
    }

    public final void D9d() {
        Window window = this.A01.getWindow();
        if (window != null) {
            window.setSoftInputMode(48);
        }
        this.A0I.ARf(true);
        this.A0O.EJ8();
        this.A0Z.Cyg();
        C273414mX r0 = this.A0r;
        if (r0 != null) {
            r0.Cyc();
        }
        AnonymousClass7XB r1 = this.A0b;
        if (r1 != null) {
            r1.Cyd(this.A02);
        }
        C332897Ww r02 = this.A0G;
        if (r02 != null) {
            r02.DRU();
        }
    }

    public final void D9w() {
        this.A0H.D9w();
    }

    public final void DCK() {
        this.A0P.E28(true);
        if (this.A0w) {
            this.A0d.CLU();
        }
    }

    public final void DDO() {
        this.A0P.E28(false);
        if (this.A0w) {
            this.A0d.Euf();
        }
    }

    public final void DVv() {
        this.A0Z.Cyt();
    }

    public PA9(Activity activity, View view, UserSession userSession, OBX obx, C70694OGp oGp, C70694OGp oGp2, C70694OGp oGp3, C70694OGp oGp4, C70694OGp oGp5, C70694OGp oGp6, C70694OGp oGp7, AnonymousClass7FU r13, AnonymousClass7XS r14, C333157Xw r15, C333177Xy r16, C332897Ww r17, C332837Wo r18, AnonymousClass7TK r19, AnonymousClass7XC r20, C332867Wr r21, AnonymousClass7Ws r22, AnonymousClass7X4 r23, C333027Xj r24, AnonymousClass7UB r25, AnonymousClass7TL r26, C333077Xo r27, AnonymousClass7XF r28, AnonymousClass7YG r29, C74329Pt5 pt5, AnonymousClass7YH r31, AnonymousClass7YI r32, AnonymousClass7YJ r33, AnonymousClass7YL r34, AnonymousClass7XK r35, C332257Ug r36, AnonymousClass7XG r37, AnonymousClass7XB r38, AnonymousClass7XN r39, AnonymousClass7SN r40, AnonymousClass7XO r41, AnonymousClass7XP r42, AnonymousClass7X2 r43, N2I n2i, OFD ofd, C70562OBk oBk, OG4 og4, C328837Gl r48, C328837Gl r49, OG5 og5, MessageActionsViewModel messageActionsViewModel, C254703su r52, C254743sy r53, C273414mX r54, List list, C62320sa r56, int i, boolean z, boolean z2, boolean z3) {
        this.A0C = r13;
        this.A01 = activity;
        this.A03 = userSession;
        this.A0q = r53;
        this.A00 = i;
        this.A0s = list;
        this.A0p = r52;
        this.A0v = z;
        this.A0o = messageActionsViewModel;
        this.A02 = view;
        this.A0g = r43;
        this.A0W = r33;
        this.A0S = r29;
        this.A0E = r15;
        this.A0V = r32;
        this.A08 = oGp;
        this.A0A = oGp2;
        this.A07 = oGp3;
        this.A0f = r42;
        this.A0M = r23;
        this.A0X = r34;
        this.A0a = r37;
        this.A0Q = r27;
        this.A0R = r28;
        this.A0Y = r35;
        this.A0l = r48;
        this.A0m = r49;
        this.A0c = r39;
        this.A0D = r14;
        this.A0J = r20;
        this.A0i = ofd;
        this.A0d = r40;
        this.A0Z = r36;
        this.A0b = r38;
        this.A0K = r21;
        this.A06 = oGp4;
        this.A0G = r17;
        this.A0e = r41;
        this.A0k = og4;
        this.A0F = r16;
        this.A0T = pt5;
        this.A0j = oBk;
        this.A0N = r24;
        this.A09 = oGp5;
        this.A0h = n2i;
        this.A0L = r22;
        this.A04 = obx;
        this.A0n = og5;
        this.A0t = r56;
        this.A0B = oGp6;
        this.A05 = oGp7;
        this.A0H = r18;
        this.A0I = r19;
        this.A0O = r25;
        this.A0r = r54;
        this.A0P = r26;
        this.A0w = z2;
        this.A0u = z3;
        this.A0U = r31;
    }
}
