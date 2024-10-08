package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.P8g  reason: case insensitive filesystem */
public final class C72497P8g implements C332897Ww, AnonymousClass7XQ, AnonymousClass7XX, C333087Xp, C333157Xw, AnonymousClass7Y2, AnonymousClass7Y3, AnonymousClass7YJ, AnonymousClass7YL {
    public MessageIdentifier A00;
    public boolean A01;
    public boolean A02;
    public final Activity A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final C327767Cc A06;
    public final OBX A07;
    public final AnonymousClass7UC A08;
    public final C70694OGp A09;
    public final C70694OGp A0A;
    public final C70694OGp A0B;
    public final C70694OGp A0C;
    public final C70694OGp A0D;
    public final C70694OGp A0E;
    public final C70694OGp A0F;
    public final AnonymousClass7SM A0G;
    public final C70443O6u A0H;
    public final OT9 A0I;
    public final AnonymousClass7XS A0J;
    public final C333167Xx A0K;
    public final C333177Xy A0L;
    public final C332837Wo A0M;
    public final AnonymousClass7TK A0N;
    public final AnonymousClass7XC A0O;
    public final C332867Wr A0P;
    public final AnonymousClass7Ws A0Q;
    public final AnonymousClass7X4 A0R;
    public final C333027Xj A0S;
    public final AnonymousClass7UB A0T;
    public final AnonymousClass7TL A0U;
    public final C333077Xo A0V;
    public final AnonymousClass7XF A0W;
    public final AnonymousClass7YG A0X;
    public final AnonymousClass7YH A0Y;
    public final AnonymousClass7YI A0Z;
    public final C333097Xq A0a;
    public final AnonymousClass7XK A0b;
    public final C332257Ug A0c;
    public final AnonymousClass7XG A0d;
    public final AnonymousClass7XB A0e;
    public final AnonymousClass7XN A0f;
    public final AnonymousClass7SN A0g;
    public final AnonymousClass7XO A0h;
    public final AnonymousClass7XP A0i;
    public final AnonymousClass7X2 A0j;
    public final OFD A0k;
    public final C70562OBk A0l;
    public final OG4 A0m;
    public final C328837Gl A0n;
    public final C328837Gl A0o;
    public final OG5 A0p;
    public final C71872OsF A0q;
    public final AnonymousClass0eK A0r;
    public final AnonymousClass0eK A0s;
    public final AnonymousClass0eK A0t;
    public final C62320sa A0u;
    public final C62320sa A0v;
    public final C62320sa A0w;
    public final C62320sa A0x;
    public final C62320sa A0y;
    public final C62320sa A0z;

    public final void AIF(C66709MbG mbG) {
        0qQ.A0B(mbG, 0);
        if (C66582MXn.A0W(this.A0r).CLm(mbG)) {
            this.A08.A00(false);
        }
    }

    public final void AOV() {
        0wj r1;
        String str;
        AnonymousClass0eK r5 = this.A0r;
        HashSet AiW = C66582MXn.A0W(r5).AiW();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = AiW.iterator();
        while (it.hasNext()) {
            MessageIdentifier messageIdentifier = (MessageIdentifier) it.next();
            A1C.add(messageIdentifier.A01);
            String A002 = messageIdentifier.A00();
            if (A002 != null) {
                A1C2.add(A002);
            }
        }
        if (A1C.isEmpty() || A1C2.isEmpty()) {
            r1 = 0wj.A01;
            str = "deleteMessages - messageIds or messageClientContexts empty";
        } else if (A1C.size() != A1C2.size()) {
            r1 = 0wj.A01;
            str = "deleteMessages - messageIds and messageClientContexts not the same size";
        } else {
            C58769IxG ixG = new C58769IxG(43, A1C, this, AiW, A1C2);
            AnonymousClass4kA A003 = AnonymousClass4k9.A00(this.A05);
            if (DbY.A03(A003, A003.A08, AnonymousClass4kA.A0c, 23) < 3) {
                Activity activity = this.A03;
                C358248ab A0X2 = DbS.A0X(activity);
                A0X2.A09(2131958906);
                A0X2.A08(2131958905);
                A0X2.A0Y(new C71183Of1(14, ixG, this), C358278ae.RED_BOLD, DbY.A0c(activity, Integer.valueOf(C66582MXn.A0W(r5).AiV()), 2131958903), true);
                DbX.A16(C71249OgE.A00(this, 55), A0X2);
                return;
            }
            ixG.invoke(false);
            return;
        }
        DbT.A1Q(r1, str, 20134884);
    }

    public final void ASg(MessageIdentifier messageIdentifier) {
        this.A02 = true;
        this.A00 = messageIdentifier;
        A00();
    }

    public final void ATV(boolean z) {
        String str;
        if (z) {
            UserSession userSession = this.A05;
            C254743sy r1 = (C254743sy) C66580MXl.A0s(this.A0s);
            MessageIdentifier messageIdentifier = this.A00;
            if (messageIdentifier != null) {
                str = messageIdentifier.A01;
            } else {
                str = null;
            }
            C3265677h.A0k(userSession, r1, str, false);
        }
        this.A02 = false;
        this.A01 = false;
        this.A00 = null;
        if (this.A0a.CPk()) {
            AnonymousClass0eK r3 = this.A0r;
            AnonymousClass7ZY A0W2 = C66582MXn.A0W(r3);
            A0W2.EQ9((0sP) null, false);
            A01(this, A0W2, r3, new C73909Plk(A0W2, 33), false);
        }
    }

    public final void ATf(C66709MbG mbG, boolean z) {
        0qQ.A0B(mbG, 0);
        C333517Zg A0V2 = C66580MXl.A0V(this.A0r);
        if (A0V2.BSN().EvC(mbG, z)) {
            this.A08.A00(false);
        }
        List list = (List) mbG.A02;
        if (AnonymousClass7TE.A1b(list) && ((AnonymousClass7LQ) list.get(0)).A0Y) {
            A0V2.C62().EGT(C66647MaG.A03((C254743sy) this.A0s.get()));
        }
    }

    public final void CJJ(String str) {
        0qQ.A0B(str, 0);
        C333517Zg A0V2 = C66580MXl.A0V(this.A0r);
        String C6C = A0V2.C6l().C6C();
        if (C6C != null) {
            A0V2.C62().Eyu(C6C, str);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DRU() {
        this.A01 = true;
        A00();
    }

    public final void EJM(MessageIdentifier messageIdentifier) {
        0qQ.A0B(messageIdentifier, 0);
        String str = messageIdentifier.A01;
        C333517Zg A0V2 = C66580MXl.A0V(this.A0r);
        if (A0V2.C6l().CdE()) {
            C376179Gx r1 = C376179Gx.PSEUDO_LOG_TAP_ON_REVEAL_MESSAGE;
            if (!A0V2.AH1(r1)) {
                C69932NuY.A00(r1);
            }
            String EJL = A0V2.EJL(str);
            if (EJL != null) {
                ((View) this.A0w.invoke()).announceForAccessibility(EJL);
            }
        }
    }

    public final void EKr(String str, boolean z) {
        String str2;
        0qQ.A0B(str, 0);
        AnonymousClass9H7 r1 = this.A0G.A00;
        AnonymousClass9H7.A06(r1).A16();
        C329067Hl A062 = AnonymousClass9H7.A06(r1);
        if (AnonymousClass7TF.A1Z(A062.A0Z.A0G)) {
            if (z) {
                str2 = "stickers";
            } else {
                str2 = "gifs";
            }
            A062.A1L(C69319NjK.DIRECT_CREATOR_SEARCH, str2, str);
        }
    }

    private final void A00() {
        if (this.A02 && this.A01 && !this.A0a.CPk()) {
            AnonymousClass0eK r4 = this.A0r;
            AnonymousClass7ZY A0W2 = C66582MXn.A0W(r4);
            A0W2.EQ9(new C74181PqN(this, 41), true);
            A01(this, A0W2, r4, new C73916Plr(40, A0W2, this), true);
        }
    }

    public final void AKo(MessageIdentifier messageIdentifier) {
        String ArO = C66582MXn.A0W(this.A0r).ArO(messageIdentifier);
        Activity activity = this.A03;
        0nC.A00(activity, ArO);
        C59689JTv.A07(activity, 2131956742);
    }

    public final void CLb(String str) {
        C66580MXl.A0V(this.A0r).CLb(str);
    }

    public static void A01(C72497P8g p8g, AnonymousClass7ZY r2, AnonymousClass0eK r3, C62320sa r4, boolean z) {
        r2.ABw(r4);
        ((C333517Zg) r3.get()).BCh().CzH(z);
        p8g.A0u.invoke();
        AnonymousClass9H7.A01(p8g.A0G.A00).A0R();
        ((AnonymousClass7WL) p8g.A0H.A00.A0k.getValue()).A01();
    }

    public final void EK6(MessageIdentifier messageIdentifier, String str) {
        1a8 A0P2 = C66581MXm.A0P();
        A0P2.A02(C66580MXl.A0V(this.A0r).E48(messageIdentifier).A0P(C318146oT.A01), new PU9(11, this, A0P2));
    }

    public /* synthetic */ C72497P8g(Activity activity, AnonymousClass0iw r41, UserSession userSession, OBX obx, AnonymousClass7UC r44, C70694OGp oGp, C70694OGp oGp2, C70694OGp oGp3, C70694OGp oGp4, C70694OGp oGp5, C70694OGp oGp6, C70694OGp oGp7, AnonymousClass7SM r52, C70443O6u o6u, OT9 ot9, AnonymousClass7XS r55, C333167Xx r56, C333177Xy r57, C332837Wo r58, AnonymousClass7TK r59, AnonymousClass7XC r60, C332867Wr r61, AnonymousClass7Ws r62, AnonymousClass7X4 r63, C333027Xj r64, AnonymousClass7UB r65, AnonymousClass7TL r66, C333077Xo r67, AnonymousClass7XF r68, AnonymousClass7YG r69, AnonymousClass7YH r70, AnonymousClass7YI r71, C333097Xq r72, AnonymousClass7XK r73, C332257Ug r74, AnonymousClass7XG r75, AnonymousClass7XB r76, AnonymousClass7XN r77, AnonymousClass7SN r78, AnonymousClass7XO r79, AnonymousClass7XP r80, AnonymousClass7X2 r81, OFD ofd, C70562OBk oBk, OG4 og4, C328837Gl r85, C328837Gl r86, OG5 og5, AnonymousClass0eK r88, AnonymousClass0eK r89, AnonymousClass0eK r90, C62320sa r91, C62320sa r92, C62320sa r93, C62320sa r94, C62320sa r95, C62320sa r96) {
        UserSession userSession2 = userSession;
        C327767Cc r1 = new C327767Cc(userSession2);
        AnonymousClass0eK r20 = r88;
        0qQ.A0B(r20, 4);
        AnonymousClass0eK r19 = r89;
        OT9 ot92 = ot9;
        AnonymousClass7TG.A1S(r19, ot92);
        C62320sa r18 = r91;
        0qQ.A0B(r18, 8);
        C62320sa r17 = r92;
        C62320sa r16 = r93;
        C51972G9s.A1F(r17, r16);
        C62320sa r4 = r94;
        0qQ.A0B(r4, 12);
        C332257Ug r24 = r74;
        AnonymousClass7YI r26 = r71;
        AnonymousClass7YG r28 = r69;
        C51973G9u.A0v(13, r24, r28, r26);
        AnonymousClass7X2 r21 = r81;
        0qQ.A0B(r21, 17);
        AnonymousClass7XP r22 = r80;
        AnonymousClass7XG r23 = r75;
        C333077Xo r30 = r67;
        AnonymousClass7X4 r31 = r63;
        C66583MXo.A0q(21, r22, r31, r23, r30);
        AnonymousClass7XF r29 = r68;
        0qQ.A0B(r29, 25);
        AnonymousClass7XK r25 = r73;
        0qQ.A0B(r25, 26);
        AnonymousClass7XN r14 = r77;
        AnonymousClass7YH r27 = r70;
        C328837Gl r13 = r85;
        C328837Gl r5 = r86;
        C332837Wo r33 = r58;
        C66583MXo.A1N(r13, r5, r27, r33, r14);
        AnonymousClass7XS r35 = r55;
        0qQ.A0B(r35, 32);
        AnonymousClass7UB r15 = r65;
        0qQ.A0B(r15, 34);
        AnonymousClass7UC r37 = r44;
        0qQ.A0B(r37, 35);
        AnonymousClass7XC r32 = r60;
        0qQ.A0B(r32, 36);
        C333167Xx r34 = r56;
        0qQ.A0B(r34, 38);
        AnonymousClass7XB r7 = r76;
        0qQ.A0B(r7, 40);
        C332867Wr r12 = r61;
        0qQ.A0B(r12, 41);
        AnonymousClass7XO r6 = r79;
        0qQ.A0B(r6, 43);
        C62320sa r3 = r95;
        0qQ.A0B(r3, 49);
        AnonymousClass7Ws r9 = r62;
        0qQ.A0B(r9, 52);
        C62320sa r2 = r96;
        0qQ.A0B(r2, 55);
        C333097Xq r8 = r72;
        0qQ.A0B(r8, 56);
        this.A05 = userSession2;
        Activity activity2 = activity;
        this.A03 = activity2;
        this.A04 = r41;
        this.A0r = r20;
        this.A0s = r19;
        this.A0I = ot92;
        this.A0t = r90;
        this.A0w = r18;
        this.A0G = r52;
        this.A0v = r17;
        this.A0x = r16;
        this.A0y = r4;
        this.A0c = r24;
        this.A0g = r78;
        this.A0X = r28;
        this.A0Z = r26;
        this.A0j = r21;
        this.A0C = oGp;
        this.A0E = oGp2;
        this.A0B = oGp3;
        this.A0i = r22;
        this.A0R = r31;
        this.A0d = r23;
        this.A0V = r30;
        this.A0W = r29;
        this.A0b = r25;
        this.A0n = r13;
        this.A0o = r5;
        this.A0Y = r27;
        this.A0M = r33;
        this.A0f = r14;
        this.A0J = r35;
        this.A0N = r59;
        this.A0T = r15;
        this.A08 = r37;
        this.A0O = r32;
        this.A0U = r66;
        this.A0K = r34;
        this.A0k = ofd;
        this.A0e = r7;
        this.A0P = r12;
        this.A0A = oGp4;
        this.A0h = r6;
        this.A0m = og4;
        this.A0L = r57;
        this.A0l = oBk;
        this.A0S = r64;
        this.A0D = oGp5;
        this.A0u = r3;
        this.A0H = o6u;
        this.A06 = r1;
        this.A0Q = r9;
        this.A07 = obx;
        this.A0p = og5;
        this.A0z = r2;
        this.A0a = r8;
        this.A0F = oGp6;
        this.A09 = oGp7;
        this.A0q = new C71872OsF(activity2, (AnonymousClass0iw) null, userSession2, new PAN(this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v1, resolved type: com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v10, resolved type: com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v11, resolved type: com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan} */
    /* JADX WARNING: type inference failed for: r5v0, types: [X.OEs, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x063f, code lost:
        if (r0 != false) goto L_0x0641;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0644, code lost:
        if (r3 == 29) goto L_0x0646;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0646, code lost:
        if (r7 == null) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0648, code lost:
        r0 = r7.A0q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x064a, code lost:
        if (r0 == null) goto L_0x0976;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x064c, code lost:
        r26 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0654, code lost:
        if ((r16 instanceof X.C328667Fr) == false) goto L_0x0972;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0656, code lost:
        r25 = ((X.C328667Fr) r16).A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x065e, code lost:
        r0 = new X.OMT(r9);
        r3 = X.C66582MXn.A0d(r113).C6C();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c9, code lost:
        if (X.C66582MXn.A0d(r113).CVr() == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x066b, code lost:
        if (r3 == null) goto L_0x096e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x066d, code lost:
        r8 = X.OP1.A00(X.C66582MXn.A0b(r9, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0675, code lost:
        r81 = r16.Aqm();
        r11 = r16.BSG().A01;
        r6 = (X.C254743sy) r31.get();
        r13 = r16.BSG().A00();
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x068e, code lost:
        if (r7 == null) goto L_0x096b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0690, code lost:
        r3 = r7.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0692, code lost:
        if (r3 == null) goto L_0x096b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0694, code lost:
        r3 = r3.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0696, code lost:
        r12 = X.C63238Ktj.A00(r3);
        r10 = r25;
        r4 = X.AnonymousClass7TE.A0e(r0.A00, "direct_long_press_message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x06a8, code lost:
        if (r4.isSampled() == false) goto L_0x06eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x06aa, code lost:
        X.DbS.A1J(r4, "long_press");
        X.C66581MXm.A1H(r4, r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x06b4, code lost:
        if (r25 != null) goto L_0x06ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x06b6, code lost:
        r10 = java.lang.String.valueOf(r81);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x06ba, code lost:
        r4.AAJ(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, r10);
        r4.AAJ("message_id", r11);
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x06c5, code lost:
        if (r6 == null) goto L_0x0968;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x06c7, code lost:
        r0 = X.C67003Mgb.A01(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x06cb, code lost:
        X.C66580MXl.A1K(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x06ce, code lost:
        if (r6 == null) goto L_0x06d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x06d0, code lost:
        r3 = X.C67003Mgb.A00(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x06d4, code lost:
        r4.A9F("occamadillo_thread_id", r3);
        r4.AAJ("client_context", r13);
        r4.A8M(r8, "thread_type");
        r4.AAJ("media_source", r12);
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x06ef, code lost:
        if ((r16 instanceof X.C328687Ft) == false) goto L_0x0962;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06f1, code lost:
        r4 = ((X.C328687Ft) r16).A04;
        r0 = (X.C68821NYf) X.00k.A0O(r4, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06ff, code lost:
        if (r0 == null) goto L_0x0962;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0701, code lost:
        r3 = r0.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0705, code lost:
        if (r3.A0N == null) goto L_0x0950;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0707, code lost:
        r54 = X.C51968G9o.A0t(r4);
        r53 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x070d, code lost:
        r49 = X.C71082Ob1.A00;
        r0 = (X.C254743sy) r31.get();
        r52 = java.lang.Boolean.valueOf(r20);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x071b, code lost:
        if (r7 == null) goto L_0x071f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x071d, code lost:
        r14 = r7.A1u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x071f, code lost:
        r49.A03(r9, r0, r52, r53, r54, (java.lang.Integer) null, (java.lang.String) null, r14, (java.lang.String) null, 8, 7, r99);
        r6 = r1.A06;
        r4 = X.C66582MXn.A0X(r113).A0b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x073a, code lost:
        if (r7 == null) goto L_0x094d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x073c, code lost:
        r3 = r7.A1S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0740, code lost:
        r111 = r6.A00(r4, r99, r3);
        r0 = X.C66582MXn.A0d(r113).BiC();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x074e, code lost:
        if (r0 == null) goto L_0x0949;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0750, code lost:
        r24 = r0.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x0754, code lost:
        r4 = X.C66582MXn.A0d(r113).Cms();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x075c, code lost:
        if (r4 == null) goto L_0x0946;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x075e, code lost:
        if (r7 == null) goto L_0x0943;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0760, code lost:
        r0 = r7.A1u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0762, code lost:
        r0 = r4.CCf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0766, code lost:
        if (r0 == null) goto L_0x0946;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0768, code lost:
        r3 = r0.A03.AaX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x076e, code lost:
        r112 = X.AnonymousClass7TF.A1W(r3, com.instagram.api.schemas.IGAIAgentType.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0774, code lost:
        if (r4 == null) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0776, code lost:
        r0 = r4.BZK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x077a, code lost:
        if (r0 == null) goto L_0x093d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x077c, code lost:
        r3 = r0.A03.AaU();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0782, code lost:
        r0 = r4.BZK();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0786, code lost:
        if (r0 == null) goto L_0x093a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0788, code lost:
        r0 = r0.A03.AaX();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0107, code lost:
        if (X.182.A06(r6, r9, 36316491108585886L) == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x078e, code lost:
        if (r3 == null) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0790, code lost:
        r13 = new com.instagram.aistudio.logging.AiStudioLoggingData(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0795, code lost:
        r50 = r1.A0G;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0799, code lost:
        if (r4 == null) goto L_0x0936;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x079b, code lost:
        r94 = r4.BRZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x079f, code lost:
        r23 = r16.BSG();
        r96 = r16.Atz();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x07a7, code lost:
        if (r15 == null) goto L_0x0930;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x07a9, code lost:
        r22 = r15.A00;
        r21 = r15.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x07b1, code lost:
        if (r7 == null) goto L_0x092b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x07b3, code lost:
        r85 = java.lang.Boolean.valueOf(r7.A1S());
        r15 = r7.A1K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x07bd, code lost:
        r105 = X.C51971G9r.A1b(r1.A0x);
        r107 = X.C66582MXn.A1W(r30);
        r72 = r1.A0j;
        r57 = r1.A0X;
        r60 = r1.A0Z;
        r33 = r1.A0C;
        r34 = r1.A0E;
        r35 = r1.A0B;
        r71 = r1.A0i;
        r51 = r1.A0R;
        r65 = r1.A0d;
        r55 = r1.A0V;
        r56 = r1.A0W;
        r63 = r1.A0b;
        r77 = r1.A0n;
        r78 = r1.A0o;
        r59 = r1.A0Y;
        r45 = r1.A0M;
        r68 = r1.A0f;
        r41 = r1.A0J;
        r46 = r1.A0N;
        r14 = r1.A0T;
        r47 = r1.A0O;
        r6 = (X.AnonymousClass7ST) r1.A0v.invoke();
        r69 = r1.A0g;
        r54 = r1.A0U;
        r64 = r1.A0c;
        r74 = r1.A0k;
        r67 = r1.A0e;
        r48 = r1.A0P;
        r36 = r1.A0A;
        r70 = r1.A0h;
        r76 = r1.A0m;
        r43 = r1.A0L;
        r75 = r1.A0l;
        r52 = r1.A0S;
        r37 = r1.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0855, code lost:
        if (r7 == null) goto L_0x0928;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0857, code lost:
        r4 = r7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0859, code lost:
        r49 = r1.A0Q;
        r32 = r1.A07;
        r12 = r1.A0p;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0863, code lost:
        if (r7 == null) goto L_0x0925;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x0865, code lost:
        r11 = r7.A1u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0867, code lost:
        r10 = r1.A0z;
        r38 = r1.A0F;
        r39 = r1.A09;
        X.0qQ.A0B(r23, 9);
        X.0qQ.A0B(r14, 55);
        X.0qQ.A0B(r6, 57);
        X.0qQ.A0B(r12, 79);
        X.0qQ.A0B(r10, 82);
        r3 = null;
        r0 = r16;
        X.C71107Ocl.A01(r2, r114, r29, r13, r9, r32, r33, r34, r35, r36, r37, r38, r39, r0, r41, r1, r43, r1, r45, r46, r47, r48, r49, r50, r51, r52, r14, r54, r55, r56, r57, (X.C74329Pt5) null, r59, r60, r1, r1, r63, r64, r65, r6, r67, r68, r69, r70, r71, r72, new X.N2I(r4, r0, r7), r74, r75, r76, r77, r78, r12, r7, r81, r23, r27, r28, r85, r15, r22, r21, r26, r17, r25, (java.lang.String) null, r11, r94, r5, r96, r24, r10, r99, r100, r119, r20, r104, r105, r106, r107, r108, false, r110, r111, r112);
        r2 = X.C66582MXn.A0d(r113);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x08df, code lost:
        if (X.C66580MXl.A05(r2) != 29) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x08e7, code lost:
        if (r2.COR(r9.A06) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x08e9, code lost:
        r6 = X.C313746gw.A00(r9);
        r5 = r2.AdN();
        r4 = r2.C6C();
        r2 = r2.C6k();
        r1 = X.DbT.A0J(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0901, code lost:
        if (X.DbT.A1Y(r1) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0903, code lost:
        X.DbW.A17(r1, r6);
        X.DbV.A1M(r1, "message_options_rendered");
        r1.A0p("message_options_dot_menu");
        X.DbZ.A1L(r1, "thread_view", r5);
        r1.A0s(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0918, code lost:
        if (r2 == null) goto L_0x091e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x091a, code lost:
        r3 = X.AnonymousClass7TE.A10(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x091e, code lost:
        r1.A0i(r3);
        r1.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0924, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0925, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0928, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x092b, code lost:
        r85 = null;
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0930, code lost:
        r22 = null;
        r21 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0936, code lost:
        r94 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x093a, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x093d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0940, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0943, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0946, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0949, code lost:
        r24 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x094d, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0952, code lost:
        if (r3.A0F == null) goto L_0x095c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0954, code lost:
        r53 = X.C51968G9o.A0t(r4);
        r54 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x095c, code lost:
        r53 = null;
        r54 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0962, code lost:
        r53 = null;
        r54 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0968, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x096b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x096e, code lost:
        r8 = X.XSV.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0972, code lost:
        r25 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0976, code lost:
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0114, code lost:
        if (r5 != false) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        if (r3 == null) goto L_0x0125;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02b3  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x031c  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0358  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x037c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03d4  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x03f3  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0444  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0495  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x04cb A[LOOP:0: B:190:0x04c5->B:192:0x04cb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04f0  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0562  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x0599  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05ac  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x05bd  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05c8 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0606  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x063d  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0232  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Eum(android.graphics.PointF r116, X.AnonymousClass7FU r117, X.AnonymousClass7FR r118, long r119, boolean r121, boolean r122) {
        /*
            r115 = this;
            r1 = 2
            r0 = r118
            X.0qQ.A0B(r0, r1)
            r1 = r115
            com.instagram.common.session.UserSession r9 = r1.A05
            android.app.Activity r2 = r1.A03
            X.OEs r5 = new X.OEs
            r5.<init>()
            r5.A03 = r9
            r5.A00 = r2
            X.6it r4 = X.C314816it.THREAD
            X.6iu r3 = new X.6iu
            r3.<init>(r4, r9)
            r5.A02 = r3
            X.6iv r3 = new X.6iv
            r3.<init>(r9, r2)
            r5.A01 = r3
            com.instagram.common.session.UserSession r7 = r5.A03
            if (r7 != 0) goto L_0x0033
            java.lang.String r0 = "userSession"
        L_0x002b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0033:
            X.0Tu r6 = X.0Tu.A05
            r3 = 36318015822042877(0x81070b000516fd, double:3.030997674546963E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            if (r3 != 0) goto L_0x004b
            r3 = 36322473998297292(0x810b19000828cc, double:3.03381704316189E-306)
            boolean r3 = X.182.A06(r6, r7, r3)
            if (r3 == 0) goto L_0x009e
        L_0x004b:
            X.6iv r3 = r5.A01
            if (r3 != 0) goto L_0x0052
            java.lang.String r0 = "rollingDeprecationUtil"
            goto L_0x002b
        L_0x0052:
            boolean r3 = r3.A00()
            if (r3 == 0) goto L_0x009e
            android.content.Context r4 = r5.A00
            java.lang.String r0 = "context"
            if (r4 == 0) goto L_0x002b
            X.8ab r3 = X.DbS.A0Y(r4)
            com.instagram.common.session.UserSession r2 = r5.A03
            java.lang.String r0 = "userSession"
            if (r2 == 0) goto L_0x002b
            r0 = 36880965775524203(0x83070b0006016b, double:3.3870094919460683E-306)
            java.lang.String r0 = X.182.A04(r6, r2, r0)
            r3.A05 = r0
            r0 = 36880965775589740(0x83070b0007016c, double:3.387009491987514E-306)
            java.lang.String r0 = X.182.A04(r6, r2, r0)
            r3.A0q(r0)
            r0 = 2131238417(0x7f081e11, float:1.8093112E38)
            X.DbU.A16(r4, r3, r0)
            r1 = 2131976057(0x7f135f79, float:1.9589224E38)
            r0 = 4
            X.C71249OgE.A02(r3, r5, r0, r1)
            r1 = 2131954735(0x7f130c2f, float:1.9545978E38)
            r0 = 3
            X.C71249OgE.A03(r3, r5, r0, r1)
            android.app.Dialog r1 = r3.A02()
            X.6iu r0 = r5.A02
            if (r0 != 0) goto L_0x097e
            java.lang.String r0 = "audLogging"
            goto L_0x002b
        L_0x009e:
            X.0sa r3 = r1.A0y
            boolean r3 = X.C51971G9r.A1b(r3)
            if (r3 != 0) goto L_0x0984
            X.0eK r3 = r1.A0s
            r31 = r3
            java.lang.Object r3 = r31.get()
            boolean r3 = r3 instanceof com.instagram.model.direct.threadkey.impl.MsysThreadId
            r20 = r3
            X.0eK r3 = r1.A0r
            r113 = r3
            X.7S7 r3 = X.C66582MXn.A0d(r113)
            boolean r3 = r3.CdE()
            if (r3 == 0) goto L_0x00cb
            X.7S7 r3 = X.C66582MXn.A0d(r113)
            boolean r3 = r3.CVr()
            r12 = 1
            if (r3 != 0) goto L_0x00cc
        L_0x00cb:
            r12 = 0
        L_0x00cc:
            X.OT9 r7 = r1.A0I
            r16 = r117
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r16.BSG()
            java.lang.String r5 = r3.A01
            java.lang.String r4 = "DirectThreadFragment.showMessageActionDialog"
            r19 = 0
            r3 = r19
            X.3su r7 = X.OT9.A00(r7, r5, r4, r3)
            java.lang.Object r3 = r31.get()
            X.3sy r3 = (X.C254743sy) r3
            com.instagram.model.direct.DirectThreadKey r15 = X.C66647MaG.A04(r3)
            X.7SD r3 = X.C66582MXn.A0X(r113)
            int r3 = r3.A08
            r99 = r3
            r3 = 36316491108323741(0x8105a80000119d, double:3.030033439451452E-306)
            boolean r5 = X.182.A06(r6, r9, r3)
            if (r5 == 0) goto L_0x0109
            r3 = 36316491108585886(0x8105a80004119e, double:3.0300334396172336E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            r10 = 1
            if (r3 != 0) goto L_0x010a
        L_0x0109:
            r10 = 0
        L_0x010a:
            r18 = 29
            r4 = r99
            r3 = r18
            if (r4 != r3) goto L_0x0116
            r22 = 1
            if (r5 == 0) goto L_0x0118
        L_0x0116:
            r22 = 0
        L_0x0118:
            if (r7 == 0) goto L_0x0591
            X.7AG r3 = r7.A0Q
            if (r3 == 0) goto L_0x0591
            java.lang.String r3 = r3.A05
            r17 = r3
            r13 = 1
            if (r3 != 0) goto L_0x0126
        L_0x0125:
            r13 = 0
        L_0x0126:
            X.7S7 r3 = X.C66582MXn.A0d(r113)
            boolean r21 = X.C308556Us.A0R(r9, r3)
            X.0eK r3 = r1.A0t
            r30 = r3
            boolean r14 = X.C66582MXn.A1W(r30)
            r8 = 1
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            if (r10 == 0) goto L_0x0176
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r3 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r3 == 0) goto L_0x058e
            X.1pr r3 = r3.A00
        L_0x0143:
            r11 = 0
            if (r3 == 0) goto L_0x058b
            java.lang.String r10 = "⏰"
        L_0x0148:
            X.0sa r3 = r0.A0C
            if (r3 == 0) goto L_0x0176
            java.lang.Object r4 = r3.invoke()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L_0x0176
            java.lang.Integer r26 = X.AnonymousClass05K.A00
            r27 = 0
            X.NkG r25 = X.C69376NkG.A08
            if (r21 == 0) goto L_0x0166
            if (r10 == 0) goto L_0x0166
            r3 = 2131238132(0x7f081cf4, float:1.8092534E38)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan r11 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionLabelSpan
            r11.<init>(r10, r3)
        L_0x0166:
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r23 = r3
            r24 = r11
            r28 = r4
            r29 = r27
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r5.add(r3)
        L_0x0176:
            java.lang.String r10 = r0.A02
            if (r10 == 0) goto L_0x01ab
            boolean r3 = X.00l.A0W(r10)
            if (r3 != 0) goto L_0x01ab
            r3 = 36319398806822158(0x81084d00561d0e, double:3.031872279690213E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x01ab
            java.lang.Integer r26 = X.AnonymousClass05K.A0K
            r3 = 2131959733(0x7f131fb5, float:1.9556115E38)
            java.lang.String r28 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238134(0x7f081cf6, float:1.8092538E38)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r3)
            r24 = 0
            X.NkG r25 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r23 = r3
            r29 = r10
            r23.<init>(r24, r25, r26, r27, r28, r29)
            r5.add(r3)
        L_0x01ab:
            if (r22 != 0) goto L_0x01c0
            boolean r3 = r0.A0X
            if (r3 == 0) goto L_0x01c0
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r3 = 2131959781(0x7f131fe5, float:1.9556212E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238713(0x7f081f39, float:1.8093712E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x01c0:
            boolean r3 = r0.A0P
            if (r3 == 0) goto L_0x01d3
            java.lang.Integer r10 = X.AnonymousClass05K.A0l
            r3 = 2131959756(0x7f131fcc, float:1.9556161E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238284(0x7f081d8c, float:1.8092842E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x01d3:
            boolean r3 = r0.A0K
            if (r3 == 0) goto L_0x0580
            java.lang.Integer r10 = X.AnonymousClass05K.A0k
            r3 = 2131961515(0x7f1326ab, float:1.955973E38)
        L_0x01dc:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238628(0x7f081ee4, float:1.809354E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x01e6:
            if (r14 != 0) goto L_0x0201
            X.0sa r3 = r0.A09
            if (r3 == 0) goto L_0x0201
            boolean r3 = X.C51971G9r.A1b(r3)
            if (r3 != r8) goto L_0x0201
            java.lang.Integer r10 = X.AnonymousClass05K.A0G
            r3 = 2131959170(0x7f131d82, float:1.9554973E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238245(0x7f081d65, float:1.8092763E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x0201:
            r106 = r122
            if (r122 != 0) goto L_0x0208
            X.C70021Nvz.A00(r2, r9, r0, r5)
        L_0x0208:
            boolean r3 = r0.A0r
            if (r3 == 0) goto L_0x021b
            java.lang.Integer r10 = X.AnonymousClass05K.A0p
            r3 = 2131960702(0x7f13237e, float:1.955808E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238850(0x7f081fc2, float:1.809399E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x021b:
            boolean r3 = r0.A0E
            if (r3 == 0) goto L_0x022e
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            r3 = 2131959781(0x7f131fe5, float:1.9556212E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238713(0x7f081f39, float:1.8093712E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x022e:
            boolean r3 = r0.A0g
            if (r3 == 0) goto L_0x0532
            java.lang.Integer r10 = X.AnonymousClass05K.A1I
            r3 = 2131960323(0x7f132203, float:1.9557311E38)
        L_0x0237:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238210(0x7f081d42, float:1.8092692E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x0241:
            boolean r3 = r0.A0T
            if (r3 == 0) goto L_0x0254
            java.lang.Integer r10 = X.AnonymousClass05K.A0D
            r3 = 2131969464(0x7f1345b8, float:1.9575852E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238644(0x7f081ef4, float:1.8093573E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x0254:
            boolean r3 = r0.A0o
            if (r3 == 0) goto L_0x0267
            java.lang.Integer r10 = X.AnonymousClass05K.A0E
            r3 = 2131975963(0x7f135f1b, float:1.9589033E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238644(0x7f081ef4, float:1.8093573E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x0267:
            if (r22 == 0) goto L_0x027c
            boolean r3 = r0.A0X
            if (r3 == 0) goto L_0x027c
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            r3 = 2131959781(0x7f131fe5, float:1.9556212E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238713(0x7f081f39, float:1.8093712E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x027c:
            boolean r10 = r0.A0d
            if (r10 == 0) goto L_0x0291
            if (r13 != 0) goto L_0x0291
            java.lang.Integer r11 = X.AnonymousClass05K.A02
            r3 = 2131960257(0x7f1321c1, float:1.9557178E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238227(0x7f081d53, float:1.8092727E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x0291:
            boolean r3 = r0.A0D
            if (r3 == 0) goto L_0x02af
            r3 = 36325708108149920(0x810e0a000034a0, double:3.035862307255407E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x02af
            java.lang.Integer r11 = X.AnonymousClass05K.A0f
            r3 = 2131959796(0x7f131ff4, float:1.9556243E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238850(0x7f081fc2, float:1.809399E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x02af:
            boolean r3 = r0.A0F
            if (r3 == 0) goto L_0x02c9
            java.lang.Integer r11 = X.AnonymousClass05K.A04
            boolean r4 = r0.A0z
            r3 = 2131958826(0x7f131c2a, float:1.9554275E38)
            if (r4 == 0) goto L_0x02bf
            r3 = 2131958827(0x7f131c2b, float:1.9554277E38)
        L_0x02bf:
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238164(0x7f081d14, float:1.8092599E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x02c9:
            boolean r3 = r0.A0U
            if (r3 == 0) goto L_0x02dc
            java.lang.Integer r11 = X.AnonymousClass05K.A0i
            r3 = 2131960199(0x7f132187, float:1.955706E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238727(0x7f081f47, float:1.809374E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x02dc:
            boolean r3 = r0.A0S
            if (r3 == 0) goto L_0x02ef
            java.lang.Integer r11 = X.AnonymousClass05K.A0X
            r3 = 2131959735(0x7f131fb7, float:1.9556119E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131237980(0x7f081c5c, float:1.8092226E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x02ef:
            boolean r3 = r0.A0t
            if (r3 == 0) goto L_0x0318
            r3 = 36325166942270118(0x810d8c000032a6, double:3.03552007177392E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x0318
            r3 = 36328882089246369(0x8110ed00043ea1, double:3.0378695456813974E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x0318
            java.lang.Integer r11 = X.AnonymousClass05K.A0r
            r3 = 2131959741(0x7f131fbd, float:1.955613E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238850(0x7f081fc2, float:1.809399E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x0318:
            boolean r3 = r0.A0G
            if (r3 == 0) goto L_0x032b
            java.lang.Integer r11 = X.AnonymousClass05K.A0s
            r3 = 2131959743(0x7f131fbf, float:1.9556135E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238519(0x7f081e77, float:1.809332E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x032b:
            boolean r3 = r0.A0u
            if (r3 == 0) goto L_0x0354
            r3 = 36325166942270118(0x810d8c000032a6, double:3.03552007177392E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x0354
            r3 = 36328882089180832(0x8110ed00033ea0, double:3.0378695456399515E-306)
            boolean r3 = X.182.A06(r6, r9, r3)
            if (r3 == 0) goto L_0x0354
            java.lang.Integer r11 = X.AnonymousClass05K.A0q
            r3 = 2131959742(0x7f131fbe, float:1.9556133E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238743(0x7f081f57, float:1.8093773E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x0354:
            boolean r3 = r0.A0j
            if (r3 == 0) goto L_0x04fb
            java.lang.Integer r24 = X.AnonymousClass05K.A0S
            r3 = 2131959737(0x7f131fb9, float:1.9556123E38)
        L_0x035d:
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238922(0x7f08200a, float:1.8094136E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
        L_0x036c:
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r27 = r22
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
        L_0x0378:
            boolean r3 = r0.A0e
            if (r3 == 0) goto L_0x038b
            java.lang.Integer r11 = X.AnonymousClass05K.A03
            r3 = 2131960259(0x7f1321c3, float:1.9557182E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238805(0x7f081f95, float:1.80939E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x038b:
            boolean r3 = r0.A0n
            if (r3 == 0) goto L_0x04f0
            java.lang.Integer r24 = X.AnonymousClass05K.A05
            r3 = 2131975945(0x7f135f09, float:1.9588997E38)
        L_0x0394:
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r25 = r22
            r27 = r22
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
        L_0x03aa:
            boolean r3 = r0.A0k
            if (r3 == 0) goto L_0x03bd
            java.lang.Integer r11 = X.AnonymousClass05K.A07
            r3 = 2131976699(0x7f1361fb, float:1.9590526E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238465(0x7f081e41, float:1.809321E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x03bd:
            boolean r3 = r0.A0Y
            if (r3 == 0) goto L_0x03d0
            java.lang.Integer r11 = X.AnonymousClass05K.A08
            r3 = 2131960218(0x7f13219a, float:1.9557098E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238040(0x7f081c98, float:1.8092347E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x03d0:
            boolean r3 = r0.A0a
            if (r3 == 0) goto L_0x03ef
            java.lang.Integer r24 = X.AnonymousClass05K.A09
            r3 = 2131976700(0x7f1361fc, float:1.9590528E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r25 = r22
            r27 = r22
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
        L_0x03ef:
            boolean r3 = r0.A0f
            if (r3 == 0) goto L_0x0402
            java.lang.Integer r11 = X.AnonymousClass05K.A0A
            r3 = 2131960288(0x7f1321e0, float:1.955724E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238956(0x7f08202c, float:1.8094205E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x0402:
            boolean r3 = r0.A0Q
            if (r3 == 0) goto L_0x0440
            java.lang.Integer r24 = X.AnonymousClass05K.A0u
            r3 = 2131958609(0x7f131b51, float:1.9553835E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238916(0x7f082004, float:1.8094124E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r27 = r22
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
            java.lang.Integer r24 = X.AnonymousClass05K.A15
            r3 = 2131958608(0x7f131b50, float:1.9553833E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238912(0x7f082000, float:1.8094116E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
        L_0x0440:
            boolean r3 = r0.A0N
            if (r3 == 0) goto L_0x0453
            java.lang.Integer r11 = X.AnonymousClass05K.A0h
            r3 = 2131959176(0x7f131d88, float:1.9554985E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238245(0x7f081d65, float:1.8092763E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x0453:
            boolean r3 = r0.A0M
            if (r3 == 0) goto L_0x0491
            java.lang.Integer r24 = X.AnonymousClass05K.A0I
            r3 = 2131959747(0x7f131fc3, float:1.9556143E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238916(0x7f082004, float:1.8094124E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r27 = r22
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
            java.lang.Integer r24 = X.AnonymousClass05K.A0J
            r3 = 2131959746(0x7f131fc2, float:1.9556141E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238912(0x7f082000, float:1.8094116E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
        L_0x0491:
            boolean r3 = r0.A0H
            if (r3 == 0) goto L_0x04a4
            java.lang.Integer r11 = X.AnonymousClass05K.A0Z
            r3 = 2131959592(0x7f131f28, float:1.9555829E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238318(0x7f081dae, float:1.8092911E38)
            X.C66583MXo.A1L(r11, r4, r5, r3)
        L_0x04a4:
            if (r10 == 0) goto L_0x04b7
            if (r13 == 0) goto L_0x04b7
            java.lang.Integer r10 = X.AnonymousClass05K.A02
            r3 = 2131960257(0x7f1321c1, float:1.9557178E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238227(0x7f081d53, float:1.8092727E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x04b7:
            java.util.List r3 = r0.A08
            if (r3 == 0) goto L_0x0595
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0595
            java.util.Iterator r13 = r3.iterator()
        L_0x04c5:
            boolean r3 = r13.hasNext()
            if (r3 == 0) goto L_0x0595
            java.lang.Object r3 = r13.next()
            X.JV7 r3 = (X.JV7) r3
            java.lang.Integer r24 = X.AnonymousClass05K.A0g
            java.lang.String r11 = r3.A02
            java.lang.String r10 = r3.A01
            java.lang.Object r4 = r3.A00
            java.lang.Integer r4 = (java.lang.Integer) r4
            r22 = 0
            X.NkG r23 = X.C69376NkG.A09
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = new com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData
            r21 = r3
            r25 = r4
            r26 = r11
            r27 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27)
            r5.add(r3)
            goto L_0x04c5
        L_0x04f0:
            boolean r3 = r0.A0R
            if (r3 == 0) goto L_0x03aa
            java.lang.Integer r24 = X.AnonymousClass05K.A06
            r3 = 2131964931(0x7f133403, float:1.9566658E38)
            goto L_0x0394
        L_0x04fb:
            boolean r3 = r0.A0l
            if (r3 == 0) goto L_0x051c
            boolean r3 = r0.A0m
            if (r3 == 0) goto L_0x0519
            X.NkG r23 = X.C69376NkG.A0A
        L_0x0505:
            java.lang.Integer r24 = X.AnonymousClass05K.A0P
            r3 = 2131959738(0x7f131fba, float:1.9556125E38)
            java.lang.String r26 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238922(0x7f08200a, float:1.8094136E38)
            java.lang.Integer r25 = java.lang.Integer.valueOf(r3)
            r22 = 0
            goto L_0x036c
        L_0x0519:
            X.NkG r23 = X.C69376NkG.A09
            goto L_0x0505
        L_0x051c:
            boolean r3 = r0.A0O
            if (r3 == 0) goto L_0x0527
            java.lang.Integer r24 = X.AnonymousClass05K.A0R
            r3 = 2131959734(0x7f131fb6, float:1.9556117E38)
            goto L_0x035d
        L_0x0527:
            boolean r3 = r0.A0c
            if (r3 == 0) goto L_0x0378
            java.lang.Integer r24 = X.AnonymousClass05K.A0Q
            r3 = 2131959736(0x7f131fb8, float:1.955612E38)
            goto L_0x035d
        L_0x0532:
            boolean r3 = r0.A0i
            if (r3 == 0) goto L_0x0545
            java.lang.Integer r10 = X.AnonymousClass05K.A0B
            r3 = 2131960340(0x7f132214, float:1.9557346E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238596(0x7f081ec4, float:1.8093475E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x0545:
            X.0sa r3 = r0.A0A
            if (r3 == 0) goto L_0x0569
            boolean r3 = X.C51971G9r.A1b(r3)
            if (r3 != r8) goto L_0x0569
            java.lang.Integer r10 = X.AnonymousClass05K.A0T
            r3 = 2131960260(0x7f1321c4, float:1.9557184E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238844(0x7f081fbc, float:1.8093978E38)
        L_0x055b:
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x055e:
            boolean r3 = r0.A0L
            if (r3 == 0) goto L_0x0241
            java.lang.Integer r10 = X.AnonymousClass05K.A1F
            r3 = 2131959292(0x7f131dfc, float:1.955522E38)
            goto L_0x0237
        L_0x0569:
            X.0sa r3 = r0.A0B
            if (r3 == 0) goto L_0x055e
            boolean r3 = X.C51971G9r.A1b(r3)
            if (r3 != r8) goto L_0x055e
            java.lang.Integer r10 = X.AnonymousClass05K.A0U
            r3 = 2131960642(0x7f132342, float:1.9557958E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238837(0x7f081fb5, float:1.8093964E38)
            goto L_0x055b
        L_0x0580:
            boolean r3 = r0.A0V
            if (r3 == 0) goto L_0x01e6
            java.lang.Integer r10 = X.AnonymousClass05K.A0L
            r3 = 2131959780(0x7f131fe4, float:1.955621E38)
            goto L_0x01dc
        L_0x058b:
            r10 = r11
            goto L_0x0148
        L_0x058e:
            r3 = 0
            goto L_0x0143
        L_0x0591:
            r17 = 0
            goto L_0x0125
        L_0x0595:
            boolean r3 = r0.A0I
            if (r3 == 0) goto L_0x05a8
            java.lang.Integer r10 = X.AnonymousClass05K.A0M
            r3 = 2131959744(0x7f131fc0, float:1.9556137E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238196(0x7f081d34, float:1.8092664E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x05a8:
            boolean r3 = r0.A0h
            if (r3 == 0) goto L_0x05bb
            java.lang.Integer r10 = X.AnonymousClass05K.A0n
            r3 = 2131973441(0x7f135541, float:1.9583918E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r2, r3)
            r3 = 2131238210(0x7f081d42, float:1.8092692E38)
            X.C66583MXo.A1L(r10, r4, r5, r3)
        L_0x05bb:
            if (r122 == 0) goto L_0x05c0
            X.C70021Nvz.A00(r2, r9, r0, r5)
        L_0x05c0:
            boolean r0 = X.DbT.A1b(r5)
            r104 = r121
            if (r0 != 0) goto L_0x05cc
            if (r121 == 0) goto L_0x0984
            if (r122 == 0) goto L_0x0984
        L_0x05cc:
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r16.BSG()
            if (r0 == 0) goto L_0x0984
            if (r12 != 0) goto L_0x05eb
            X.7SD r0 = X.C66582MXn.A0X(r113)
            int r0 = r0.A08
            r3 = r18
            if (r0 == r3) goto L_0x05eb
            if (r20 == 0) goto L_0x097a
            r3 = 36318630002039115(0x81079a0000194b, double:3.031386084449688E-306)
            boolean r0 = X.182.A06(r6, r9, r3)
            if (r0 != 0) goto L_0x097a
        L_0x05eb:
            r108 = 1
        L_0x05ed:
            X.0sa r3 = r1.A0w
            java.lang.Object r4 = r3.invoke()
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            r0 = r19
            X.0qQ.A0B(r4, r0)
            r114 = r116
            r0 = r114
            android.view.View r0 = X.C70866OPf.A00(r0, r4)
            r28 = 0
            if (r0 == 0) goto L_0x0613
            X.OJl r6 = X.C70866OPf.A01(r0, r4, r8)
            r4 = 10
            X.PQr r28 = new X.PQr
            r0 = r28
            r0.<init>(r6, r4)
        L_0x0613:
            java.lang.Object r3 = r3.invoke()
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r0 = r114
            android.view.View r29 = X.C70866OPf.A00(r0, r3)
            java.lang.Object r27 = r31.get()
            r0 = r27
            X.3sy r0 = (X.C254743sy) r0
            r27 = r0
            X.7S7 r0 = X.C66582MXn.A0d(r113)
            int r100 = r0.AdN()
            X.7SD r0 = X.C66582MXn.A0X(r113)
            boolean r0 = r0.A0n
            r3 = r99
            r4 = r18
            if (r3 != r4) goto L_0x0641
            r110 = 1
            if (r0 == 0) goto L_0x0646
        L_0x0641:
            r110 = 0
            r0 = r3
            if (r0 != r4) goto L_0x0976
        L_0x0646:
            if (r7 == 0) goto L_0x0976
            com.instagram.direct.model.comments.DirectMessageComments r0 = r7.A0q
            if (r0 == 0) goto L_0x0976
            java.lang.String r0 = r0.A01
            r26 = r0
        L_0x0650:
            r0 = r16
            boolean r0 = r0 instanceof X.C328667Fr
            if (r0 == 0) goto L_0x0972
            r0 = r16
            X.7Fr r0 = (X.C328667Fr) r0
            java.lang.String r0 = r0.A0Y
            r25 = r0
        L_0x065e:
            X.OMT r0 = new X.OMT
            r0.<init>(r9)
            X.7S7 r3 = X.C66582MXn.A0d(r113)
            java.lang.String r3 = r3.C6C()
            if (r3 == 0) goto L_0x096e
            X.3U9 r3 = X.C66582MXn.A0b(r9, r3)
            X.XSV r8 = X.OP1.A00(r3)
        L_0x0675:
            X.2FW r81 = r16.Aqm()
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r16.BSG()
            java.lang.String r11 = r3.A01
            java.lang.Object r6 = r31.get()
            X.3sy r6 = (X.C254743sy) r6
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r16.BSG()
            java.lang.String r13 = r3.A00()
            r14 = 0
            if (r7 == 0) goto L_0x096b
            X.7AG r3 = r7.A0Q
            if (r3 == 0) goto L_0x096b
            java.lang.String r3 = r3.A06
        L_0x0696:
            java.lang.String r12 = X.C63238Ktj.A00(r3)
            r10 = r25
            X.0wc r3 = r0.A00
            java.lang.String r0 = "direct_long_press_message"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r3, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x06eb
            java.lang.String r0 = "long_press"
            X.DbS.A1J(r4, r0)
            r0 = r20
            X.C66581MXm.A1H(r4, r0)
            if (r25 != 0) goto L_0x06ba
            java.lang.String r10 = java.lang.String.valueOf(r81)
        L_0x06ba:
            java.lang.String r0 = "type"
            r4.AAJ(r0, r10)
            java.lang.String r0 = "message_id"
            r4.AAJ(r0, r11)
            r3 = 0
            if (r6 == 0) goto L_0x0968
            java.lang.String r0 = X.C67003Mgb.A01(r6)
        L_0x06cb:
            X.C66580MXl.A1K(r4, r0)
            if (r6 == 0) goto L_0x06d4
            java.lang.Long r3 = X.C67003Mgb.A00(r6)
        L_0x06d4:
            java.lang.String r0 = "occamadillo_thread_id"
            r4.A9F(r0, r3)
            java.lang.String r0 = "client_context"
            r4.AAJ(r0, r13)
            java.lang.String r0 = "thread_type"
            r4.A8M(r8, r0)
            java.lang.String r0 = "media_source"
            r4.AAJ(r0, r12)
            r4.Cgf()
        L_0x06eb:
            r0 = r16
            boolean r0 = r0 instanceof X.C328687Ft
            if (r0 == 0) goto L_0x0962
            r0 = r16
            X.7Ft r0 = (X.C328687Ft) r0
            java.util.List r4 = r0.A04
            r0 = r19
            java.lang.Object r0 = X.00k.A0O(r4, r0)
            X.NYf r0 = (X.C68821NYf) r0
            if (r0 == 0) goto L_0x0962
            X.7Fr r3 = r0.A02
            com.instagram.model.mediasize.GifUrlImpl r0 = r3.A0N
            if (r0 == 0) goto L_0x0950
            java.lang.Integer r54 = X.C51968G9o.A0t(r4)
            r53 = r14
        L_0x070d:
            X.Ob1 r49 = X.C71082Ob1.A00
            java.lang.Object r0 = r31.get()
            X.3sy r0 = (X.C254743sy) r0
            r58 = 0
            java.lang.Boolean r52 = java.lang.Boolean.valueOf(r20)
            if (r7 == 0) goto L_0x071f
            java.lang.String r14 = r7.A1u
        L_0x071f:
            r59 = 8
            r60 = 7
            r50 = r9
            r51 = r0
            r55 = r58
            r56 = r58
            r57 = r14
            r61 = r99
            r49.A03(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61)
            X.7Cc r6 = r1.A06
            X.7SD r0 = X.C66582MXn.A0X(r113)
            java.util.List r4 = r0.A0b
            if (r7 == 0) goto L_0x094d
            boolean r3 = r7.A1S()
        L_0x0740:
            r0 = r99
            boolean r111 = r6.A00(r4, r0, r3)
            X.7S7 r0 = X.C66582MXn.A0d(r113)
            X.3Te r0 = r0.BiC()
            if (r0 == 0) goto L_0x0949
            java.util.List r0 = r0.A09
            r24 = r0
        L_0x0754:
            X.7S7 r0 = X.C66582MXn.A0d(r113)
            X.2Ep r4 = r0.Cms()
            if (r4 == 0) goto L_0x0946
            if (r7 == 0) goto L_0x0943
            java.lang.String r0 = r7.A1u
        L_0x0762:
            com.instagram.user.model.User r0 = r4.CCf(r0)
            if (r0 == 0) goto L_0x0946
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r3 = r0.AaX()
        L_0x076e:
            com.instagram.api.schemas.IGAIAgentType r0 = com.instagram.api.schemas.IGAIAgentType.A04
            boolean r112 = X.AnonymousClass7TF.A1W(r3, r0)
            if (r4 == 0) goto L_0x0940
            com.instagram.user.model.User r0 = r4.BZK()
            if (r0 == 0) goto L_0x093d
            X.4Cl r0 = r0.A03
            java.lang.String r3 = r0.AaU()
        L_0x0782:
            com.instagram.user.model.User r0 = r4.BZK()
            if (r0 == 0) goto L_0x093a
            X.4Cl r0 = r0.A03
            com.instagram.api.schemas.IGAIAgentType r0 = r0.AaX()
        L_0x078e:
            if (r3 == 0) goto L_0x0940
            com.instagram.aistudio.logging.AiStudioLoggingData r13 = new com.instagram.aistudio.logging.AiStudioLoggingData
            r13.<init>(r0, r3)
        L_0x0795:
            X.7SM r0 = r1.A0G
            r50 = r0
            if (r4 == 0) goto L_0x0936
            java.util.List r94 = r4.BRZ()
        L_0x079f:
            com.instagram.model.direct.messageid.MessageIdentifier r23 = r16.BSG()
            java.util.List r96 = r16.Atz()
            if (r15 == 0) goto L_0x0930
            java.lang.String r0 = r15.A00
            r22 = r0
            java.lang.String r0 = r15.A01
            r21 = r0
        L_0x07b1:
            if (r7 == 0) goto L_0x092b
            boolean r0 = r7.A1S()
            java.lang.Boolean r85 = java.lang.Boolean.valueOf(r0)
            java.lang.Long r15 = r7.A1K
        L_0x07bd:
            X.0sa r0 = r1.A0x
            boolean r105 = X.C51971G9r.A1b(r0)
            boolean r107 = X.C66582MXn.A1W(r30)
            X.7X2 r0 = r1.A0j
            r72 = r0
            X.7YG r0 = r1.A0X
            r57 = r0
            X.7YI r0 = r1.A0Z
            r60 = r0
            X.OGp r0 = r1.A0C
            r33 = r0
            X.OGp r0 = r1.A0E
            r34 = r0
            X.OGp r0 = r1.A0B
            r35 = r0
            X.7XP r0 = r1.A0i
            r71 = r0
            X.7X4 r0 = r1.A0R
            r51 = r0
            X.7XG r0 = r1.A0d
            r65 = r0
            X.7Xo r0 = r1.A0V
            r55 = r0
            X.7XF r0 = r1.A0W
            r56 = r0
            X.7XK r0 = r1.A0b
            r63 = r0
            X.7Gl r0 = r1.A0n
            r77 = r0
            X.7Gl r0 = r1.A0o
            r78 = r0
            X.7YH r0 = r1.A0Y
            r59 = r0
            X.7Wo r0 = r1.A0M
            r45 = r0
            X.7XN r0 = r1.A0f
            r68 = r0
            X.7XS r0 = r1.A0J
            r41 = r0
            X.7TK r0 = r1.A0N
            r46 = r0
            X.7UB r14 = r1.A0T
            X.7XC r0 = r1.A0O
            r47 = r0
            X.0sa r0 = r1.A0v
            java.lang.Object r6 = r0.invoke()
            X.7ST r6 = (X.AnonymousClass7ST) r6
            X.7SN r0 = r1.A0g
            r69 = r0
            X.7TL r0 = r1.A0U
            r54 = r0
            X.7Ug r0 = r1.A0c
            r64 = r0
            X.OFD r0 = r1.A0k
            r74 = r0
            X.7XB r0 = r1.A0e
            r67 = r0
            X.7Wr r0 = r1.A0P
            r48 = r0
            X.OGp r0 = r1.A0A
            r36 = r0
            X.7XO r0 = r1.A0h
            r70 = r0
            X.OG4 r0 = r1.A0m
            r76 = r0
            X.7Xy r0 = r1.A0L
            r43 = r0
            X.OBk r0 = r1.A0l
            r75 = r0
            X.7Xj r0 = r1.A0S
            r52 = r0
            X.OGp r0 = r1.A0D
            r37 = r0
            if (r7 == 0) goto L_0x0928
            X.N4L r4 = r7.A0D
        L_0x0859:
            X.7Ws r0 = r1.A0Q
            r49 = r0
            X.OBX r0 = r1.A07
            r32 = r0
            X.OG5 r12 = r1.A0p
            if (r7 == 0) goto L_0x0925
            java.lang.String r11 = r7.A1u
        L_0x0867:
            X.0sa r10 = r1.A0z
            X.OGp r0 = r1.A0F
            r38 = r0
            X.OGp r0 = r1.A09
            r39 = r0
            r3 = 9
            r0 = r23
            X.0qQ.A0B(r0, r3)
            r0 = 55
            X.0qQ.A0B(r14, r0)
            r0 = 57
            X.0qQ.A0B(r6, r0)
            r0 = 79
            X.0qQ.A0B(r12, r0)
            r0 = 82
            X.0qQ.A0B(r10, r0)
            r3 = 0
            X.N2I r8 = new X.N2I
            r0 = r16
            r8.<init>(r4, r0, r7)
            r101 = r119
            r30 = r13
            r31 = r9
            r40 = r0
            r42 = r1
            r44 = r1
            r53 = r14
            r61 = r1
            r62 = r1
            r66 = r6
            r73 = r8
            r79 = r12
            r80 = r7
            r82 = r23
            r83 = r27
            r84 = r28
            r86 = r15
            r87 = r22
            r88 = r21
            r89 = r26
            r90 = r17
            r91 = r25
            r92 = r3
            r93 = r11
            r95 = r5
            r97 = r24
            r98 = r10
            r103 = r20
            r109 = r19
            r27 = r2
            r28 = r114
            X.C71107Ocl.A01(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85, r86, r87, r88, r89, r90, r91, r92, r93, r94, r95, r96, r97, r98, r99, r100, r101, r103, r104, r105, r106, r107, r108, r109, r110, r111, r112)
            X.7S7 r2 = X.C66582MXn.A0d(r113)
            int r1 = X.C66580MXl.A05(r2)
            r0 = r18
            if (r1 != r0) goto L_0x0984
            java.lang.String r0 = r9.A06
            boolean r0 = r2.COR(r0)
            if (r0 == 0) goto L_0x0984
            X.6gx r6 = X.C313746gw.A00(r9)
            int r5 = r2.AdN()
            java.lang.String r4 = r2.C6C()
            java.lang.String r2 = r2.C6k()
            X.1Ln r1 = X.DbT.A0J(r6)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x0984
            X.DbW.A17(r1, r6)
            java.lang.String r0 = "message_options_rendered"
            X.DbV.A1M(r1, r0)
            java.lang.String r0 = "message_options_dot_menu"
            r1.A0p(r0)
            java.lang.String r0 = "thread_view"
            X.DbZ.A1L(r1, r0, r5)
            r1.A0s(r4)
            if (r2 == 0) goto L_0x091e
            java.lang.Long r3 = X.AnonymousClass7TE.A10(r2)
        L_0x091e:
            r1.A0i(r3)
            r1.Cgf()
            return
        L_0x0925:
            r11 = 0
            goto L_0x0867
        L_0x0928:
            r4 = 0
            goto L_0x0859
        L_0x092b:
            r85 = 0
            r15 = 0
            goto L_0x07bd
        L_0x0930:
            r22 = 0
            r21 = 0
            goto L_0x07b1
        L_0x0936:
            r94 = 0
            goto L_0x079f
        L_0x093a:
            r0 = 0
            goto L_0x078e
        L_0x093d:
            r3 = 0
            goto L_0x0782
        L_0x0940:
            r13 = 0
            goto L_0x0795
        L_0x0943:
            r0 = 0
            goto L_0x0762
        L_0x0946:
            r3 = 0
            goto L_0x076e
        L_0x0949:
            r24 = 0
            goto L_0x0754
        L_0x094d:
            r3 = 1
            goto L_0x0740
        L_0x0950:
            X.777 r0 = r3.A0F
            if (r0 == 0) goto L_0x095c
            java.lang.Integer r53 = X.C51968G9o.A0t(r4)
            r54 = r14
            goto L_0x070d
        L_0x095c:
            r53 = r14
            r54 = r14
            goto L_0x070d
        L_0x0962:
            r53 = r14
            r54 = r14
            goto L_0x070d
        L_0x0968:
            r0 = r14
            goto L_0x06cb
        L_0x096b:
            r3 = r14
            goto L_0x0696
        L_0x096e:
            X.XSV r8 = X.XSV.A07
            goto L_0x0675
        L_0x0972:
            r25 = 0
            goto L_0x065e
        L_0x0976:
            r26 = 0
            goto L_0x0650
        L_0x097a:
            r108 = 0
            goto L_0x05ed
        L_0x097e:
            r0.A01()
            X.AnonymousClass0fN.A00(r1)
        L_0x0984:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72497P8g.Eum(android.graphics.PointF, X.7FU, X.7FR, long, boolean, boolean):void");
    }
}
