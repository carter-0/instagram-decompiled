package X;

import android.content.Context;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class P9R implements C332847Wp, AnonymousClass7Ws {
    public C39760A8a A00 = new C39760A8a();
    public final Context A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final AnonymousClass0iw A04;
    public final UserSession A05;
    public final AnonymousClass7SM A06;
    public final C72527P9k A07;
    public final OVS A08;
    public final AnonymousClass7VL A09;
    public final AnonymousClass7Y6 A0A;
    public final AnonymousClass7Wt A0B;
    public final AnonymousClass7XE A0C;
    public final C333047Xl A0D;
    public final C332917Wy A0E;
    public final AnonymousClass7X7 A0F;
    public final AnonymousClass7XJ A0G;
    public final C333117Xs A0H;
    public final P9G A0I;
    public final List A0J;
    public final AnonymousClass0eM A0K = AnonymousClass0eN.A01(C73753PjE.A00);
    public final AnonymousClass0eM A0L = C73897PlY.A00(this, 33);
    public final AnonymousClass0eM A0M = C73897PlY.A00(this, 34);
    public final C62320sa A0N;
    public final C62320sa A0O;

    public static N0a A00(C69322NjN njN, String str, String str2, String str3) {
        0bb r2 = new 0bb();
        r2.A06("author_id", str);
        r2.A01(njN.A00, "cta_type");
        r2.A06("payload", (String) null);
        r2.A06("message_id", str2);
        r2.A06(DialogModule.KEY_TITLE, str3);
        r2.A06(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null);
        return r2;
    }

    private final void A02(Uri uri, C333517Zg r5) {
        String queryParameter;
        if (AnonymousClass7TF.A1Z(this.A0L) || (AnonymousClass7TF.A1Z(this.A0M) && (queryParameter = uri.getQueryParameter("xma_update")) != null && queryParameter.equals("nav"))) {
            r5.AvL().EIF();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v0, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v3, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v4, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r41v3, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v6, resolved type: com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel} */
    /* JADX WARNING: type inference failed for: r19v5, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (X.C3267177w.A00.A04(r1) != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c9, code lost:
        if (r1.A1c() != false) goto L_0x00cb;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A03(android.view.View r51, X.C333517Zg r52, X.C68168N3i r53, com.instagram.model.direct.messageid.MessageIdentifier r54, java.lang.Long r55, java.lang.String r56, java.lang.String r57, java.util.List r58, java.util.List r59, java.util.List r60, java.util.List r61, java.util.List r62, int r63, boolean r64) {
        /*
            r50 = this;
            r12 = r52
            X.7S7 r17 = r12.C6l()
            X.3sy r0 = r17.B8S()
            com.instagram.model.direct.DirectThreadKey r2 = X.C66647MaG.A04(r0)
            r6 = r54
            java.lang.String r4 = r6.A00()
            r26 = 0
            r0 = r50
            if (r2 == 0) goto L_0x0146
            if (r4 == 0) goto L_0x0146
            com.instagram.common.session.UserSession r1 = r0.A05
            X.2Dm r1 = X.2L2.A00(r1)
            X.3su r1 = r1.BRy(r2, r4)
        L_0x0026:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r59)
            java.util.Iterator r16 = r59.iterator()
            r3 = 0
        L_0x002f:
            boolean r2 = r16.hasNext()
            r30 = r57
            if (r2 == 0) goto L_0x014a
            java.lang.Object r2 = r16.next()
            int r15 = r3 + 1
            if (r3 >= 0) goto L_0x0047
            X.0sr.A1T()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0047:
            com.instagram.common.typedurl.ImageUrl r2 = (com.instagram.common.typedurl.ImageUrl) r2
            r5 = r58
            if (r58 == 0) goto L_0x0059
            java.lang.String r7 = X.C51966G9m.A1G(r5, r3)
            if (r7 == 0) goto L_0x0059
            int r5 = r7.length()
            if (r5 != 0) goto L_0x0063
        L_0x0059:
            android.net.Uri r7 = X.0cp.A03(r56)
            java.lang.String r5 = "media_fbid"
            java.lang.String r7 = r7.getQueryParameter(r5)
        L_0x0063:
            r5 = r62
            if (r62 == 0) goto L_0x0142
            java.lang.String r5 = X.C51966G9m.A1G(r5, r3)
        L_0x006b:
            r9 = r61
            if (r61 == 0) goto L_0x013e
            java.lang.String r14 = X.C51966G9m.A1G(r9, r3)
        L_0x0073:
            if (r1 == 0) goto L_0x0134
            X.3tI r10 = r1.A0P()
            java.lang.String r9 = java.lang.String.valueOf(r7)
            if (r10 == 0) goto L_0x012e
            java.lang.Integer r13 = r10.A02(r9)
        L_0x0083:
            X.7AG r9 = r1.A0Q
            if (r9 == 0) goto L_0x0136
            java.lang.String r10 = r9.A08
        L_0x0089:
            if (r7 == 0) goto L_0x012a
            java.lang.String r35 = X.C3267177w.A02(r1, r7)
        L_0x008f:
            X.7SD r9 = r17.C6Q()
            boolean r9 = r9.A1A
            if (r9 == 0) goto L_0x00b3
            X.7SD r9 = r17.C6Q()
            boolean r9 = r9.A14
            if (r9 != 0) goto L_0x00b3
            X.7SD r9 = r17.C6Q()
            boolean r9 = r9.A15
            if (r9 != 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00b3
            X.77w r9 = X.C3267177w.A00
            boolean r9 = r9.A04(r1)
            r43 = 1
            if (r9 != 0) goto L_0x00b5
        L_0x00b3:
            r43 = 0
        L_0x00b5:
            java.lang.String r9 = r6.A01
            r11 = r60
            if (r60 == 0) goto L_0x0127
            java.lang.Object r3 = X.00k.A0O(r11, r3)
            com.instagram.model.mediasize.GifUrlImpl r3 = (com.instagram.model.mediasize.GifUrlImpl) r3
        L_0x00c1:
            if (r1 == 0) goto L_0x00cb
            boolean r11 = r1.A1c()
            r44 = 1
            if (r11 == 0) goto L_0x00cd
        L_0x00cb:
            r44 = 0
        L_0x00cd:
            X.1Xj r29 = X.C70024Nw2.A00(r2, r3, r5, r7)
            if (r14 == 0) goto L_0x00df
            android.net.Uri r5 = X.DbT.A09(r14)
            java.lang.String r3 = "blob_sender_id"
            java.lang.String r32 = r5.getQueryParameter(r3)
            if (r32 != 0) goto L_0x00e1
        L_0x00df:
            r32 = r30
        L_0x00e1:
            java.lang.String r33 = r2.getUrl()
            com.instagram.model.mediasize.ExtendedImageUrl r5 = new com.instagram.model.mediasize.ExtendedImageUrl
            r5.<init>(r2)
            if (r55 == 0) goto L_0x0124
            long r2 = r55.longValue()
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r40 = r7.toMicros(r2)
        L_0x00f6:
            int r39 = X.DbX.A01(r13)
            r45 = 0
            r42 = 1
            java.lang.Boolean r30 = java.lang.Boolean.valueOf(r45)
            X.OIP r2 = new X.OIP
            r27 = r2
            r28 = r5
            r31 = r9
            r34 = r4
            r36 = r10
            r37 = r26
            r38 = r26
            r46 = r45
            r47 = r45
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r42, r43, r44, r45, r46, r47)
            X.Oa5 r3 = new X.Oa5
            r3.<init>((X.OIP) r2)
            r8.add(r3)
            r3 = r15
            goto L_0x002f
        L_0x0124:
            r40 = 0
            goto L_0x00f6
        L_0x0127:
            r3 = r26
            goto L_0x00c1
        L_0x012a:
            r35 = r26
            goto L_0x008f
        L_0x012e:
            java.lang.Integer r13 = r1.A0d(r9)
            goto L_0x0083
        L_0x0134:
            r13 = r26
        L_0x0136:
            r10 = r26
            if (r1 != 0) goto L_0x0089
            r35 = r10
            goto L_0x008f
        L_0x013e:
            r14 = r26
            goto L_0x0073
        L_0x0142:
            r5 = r26
            goto L_0x006b
        L_0x0146:
            r1 = r26
            goto L_0x0026
        L_0x014a:
            androidx.fragment.app.FragmentActivity r3 = r0.A03
            com.instagram.common.session.UserSession r2 = r0.A05
            X.76d r7 = X.C3262776c.A00(r3, r2)
            java.lang.String r2 = r6.A01
            boolean r15 = r12.CXH(r2)
            if (r1 == 0) goto L_0x023d
            boolean r38 = r1.A1T()
        L_0x015e:
            X.7Wy r10 = r0.A0E
            java.util.ArrayList r6 = X.AnonymousClass7TF.A0p(r8)
            java.util.Iterator r14 = r8.iterator()
        L_0x0168:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0246
            java.lang.Object r1 = r14.next()
            X.Oa5 r1 = (X.C71039Oa5) r1
            X.3t3 r22 = r17.CBU()
            r5 = 0
            X.0qQ.A0B(r1, r5)
            X.1Xj r20 = r1.A02()
            if (r20 == 0) goto L_0x0241
            java.lang.String r27 = r1.A07()
            java.lang.String r28 = r1.A05()
            X.2FW r21 = X.2FW.A1A
            X.1iA r23 = r20.BR7()
            java.lang.String r29 = r1.A04()
            long r12 = r1.A01()
            boolean r40 = r1.A08()
            java.lang.Object r0 = r1.A00
            boolean r9 = r0 instanceof X.N3S
            r3 = 1
            android.content.Context r2 = r7.A00
            android.content.res.Resources r2 = r2.getResources()
            int r4 = r1.A00()
            r11 = 1
            if (r4 == r3) goto L_0x01af
            r11 = 0
        L_0x01af:
            r19 = 0
            if (r11 == 0) goto L_0x021d
            r3 = 2131238269(0x7f081d7d, float:1.8092812E38)
            java.lang.Integer r42 = java.lang.Integer.valueOf(r3)
            if (r2 == 0) goto L_0x01c3
            r3 = 2131964457(0x7f133229, float:1.9565696E38)
            java.lang.String r19 = r2.getString(r3)
        L_0x01c3:
            java.lang.Integer r43 = X.AnonymousClass05K.A00
            r48 = 2
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r41 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r44 = r26
            r45 = r26
            r46 = r19
            r47 = r26
            r49 = r5
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49)
            r19 = r41
        L_0x01d8:
            boolean r2 = r0 instanceof X.OIP
            if (r2 == 0) goto L_0x0219
            X.OIP r0 = (X.OIP) r0
            boolean r3 = r0.A0H
            java.lang.String r2 = r0.A06
            java.lang.String r0 = r0.A05
        L_0x01e4:
            boolean r44 = r1.A09()
            java.lang.Long r25 = java.lang.Long.valueOf(r12)
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r15)
            r31 = r0
            r32 = r2
            r33 = r26
            r34 = r26
            r35 = r26
            r36 = r5
            r37 = r5
            r39 = r9
            r41 = r5
            r42 = r3
            r43 = r5
            r45 = r5
            r46 = r5
            r47 = r5
            r48 = r5
            r18 = r7
            X.77B r0 = X.C3262876d.A01(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r6.add(r0)
            goto L_0x0168
        L_0x0219:
            r3 = 0
            r2 = 0
            r0 = 0
            goto L_0x01e4
        L_0x021d:
            int r4 = r1.A00()
            r2 = 100
            if (r4 != r2) goto L_0x01d8
            java.lang.Integer r43 = X.AnonymousClass05K.A01
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r19 = new com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel
            r41 = r19
            r42 = r26
            r44 = r26
            r45 = r26
            r46 = r26
            r47 = r26
            r48 = r3
            r49 = r5
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x01d8
        L_0x023d:
            r38 = 0
            goto L_0x015e
        L_0x0241:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0246:
            r2 = 0
            java.lang.Object r0 = X.00k.A0O(r8, r2)
            X.Oa5 r0 = (X.C71039Oa5) r0
            if (r0 == 0) goto L_0x0267
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != r0) goto L_0x0267
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
        L_0x0258:
            r15 = r63
            r11 = r51
            r17 = r64
            r12 = r53
            r14 = r6
            r16 = r2
            r10.Cpz(r11, r12, r13, r14, r15, r16, r17)
            return
        L_0x0267:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            goto L_0x0258
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9R.A03(android.view.View, X.7Zg, X.N3i, com.instagram.model.direct.messageid.MessageIdentifier, java.lang.Long, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, int, boolean):void");
    }

    public static void A04(0Ak r1, 0bb r2, String str, String str2, String str3) {
        r2.A06("notification_token", str);
        r2.A06("campaign_id", str2);
        r2.A06("cta_type_unique_id", str3);
        r1.A0N(r2, "call_to_action");
        r1.Cgf();
    }

    private final void A06(C254743sy r8, String str, String str2, String str3) {
        1Ln A002 = C3265677h.A00(this.A04, this.A05, r8, C66647MaG.A0E(r8), 0oI.A0A(this.A03), C321406u6.A06(str));
        A002.A0R("media_id", str2);
        A002.A0Q("sender_id", AnonymousClass7TE.A10(str3));
        A002.Cgf();
    }

    private final boolean A08(Uri uri, N3I n3i) {
        List list = this.A0J;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : list) {
            if (!(!((C74319Psv) next).Cmw(uri, n3i))) {
                break;
            }
            A1C.add(next);
        }
        if (A1C.size() == list.size()) {
            return false;
        }
        return true;
    }

    public static final String A01(String str, String str2) {
        Uri A092 = DbT.A09(str);
        if (!0qQ.A0K(A092.getHost(), "blend") && (!0qQ.A0K(A092.getHost(), "www.instagram.com") || !A092.getQueryParameterNames().contains("feed_type"))) {
            return str;
        }
        String obj = DbV.A08(A092.buildUpon(), PublicKeyCredentialControllerUtility.JSON_KEY_ID, str2).toString();
        0qQ.A0A(obj);
        return obj;
    }

    public static final void A05(C69497Nmf nmf, C70846ONz oNz, C333517Zg r5, String str) {
        String C6C = r5.C6l().C6C();
        if (C6C != null) {
            1Ln A032 = 1Ln.A03(oNz.A00);
            if (DbT.A1Y(A032)) {
                A032.A0M(nmf, "action");
                C66583MXo.A11(C69494Nmc.STOP_PROMPT_DIALOG, A032, str, C6C);
            }
        }
    }

    private final void A07(String str, String str2) {
        C3018960m.A00().A00().A02(this.A03, AnonymousClass5OB.DIRECT_RESHARE_COMMENT, this.A05, C227942kP.A01(this.A04.getModuleName(), true, false), str, str2, (String) null, false, true, false, true, false, false);
    }

    public /* synthetic */ P9R(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r32, UserSession userSession, AnonymousClass7SM r34, C72527P9k p9k, OVS ovs, AnonymousClass7VL r37, C332997Xg r38, AnonymousClass7XT r39, AnonymousClass7Y6 r40, AnonymousClass7Wt r41, AnonymousClass7XE r42, C333047Xl r43, AnonymousClass7X6 r44, C332917Wy r45, AnonymousClass7X7 r46, AnonymousClass7X8 r47, AnonymousClass7XJ r48, C333117Xs r49, P9G p9g, P9G p9g2, P9G p9g3, C62320sa r53, C62320sa r54) {
        AnonymousClass7X7 r5 = r46;
        AnonymousClass7X8 r25 = r47;
        C332997Xg r28 = r38;
        AnonymousClass7VL r7 = r37;
        AnonymousClass7XT r27 = r39;
        UserSession userSession2 = userSession;
        P9G p9g4 = p9g;
        AnonymousClass7X6 r26 = r44;
        AnonymousClass7XE r9 = r42;
        P9G p9g5 = p9g2;
        C62320sa r3 = r53;
        C72527P9k p9k2 = p9k;
        List A1P = 0sr.A1P(new C74319Psv[]{new P25(r5, r25), new P21(r7, r28), new P22(userSession2, r27), new P24(userSession2, p9g4), new P20(r26), new C71871OsE(r9), new P23(userSession2, p9g5), new P26(p9k2, r3)});
        Fragment fragment2 = fragment;
        0qQ.A0B(fragment2, 3);
        C333047Xl r6 = r43;
        C51973G9u.A0u(8, r25, r5, r6);
        AnonymousClass7Wt r12 = r41;
        AnonymousClass7Y6 r13 = r40;
        C51974G9v.A1R(r12, r13, r28, r27);
        C51969G9p.A1R(p9g4, 15, p9g5);
        0qQ.A0B(r7, 17);
        C332917Wy r15 = r45;
        C66581MXm.A1P(r15, 18, r9);
        P9G p9g6 = p9g3;
        C333117Xs r14 = r49;
        C66583MXo.A0q(20, r26, r14, p9g6, p9k2);
        AnonymousClass7XJ r0 = r48;
        0qQ.A0B(r0, 25);
        this.A05 = userSession2;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        this.A03 = fragmentActivity2;
        this.A02 = fragment2;
        this.A04 = r32;
        this.A0N = r3;
        this.A08 = ovs;
        this.A0O = r54;
        this.A0F = r5;
        this.A0D = r6;
        this.A0B = r12;
        this.A0A = r13;
        this.A09 = r7;
        this.A0E = r15;
        this.A0C = r9;
        this.A06 = r34;
        this.A0H = r14;
        this.A0I = p9g6;
        this.A07 = p9k2;
        this.A0G = r0;
        this.A0J = A1P;
        this.A01 = fragmentActivity2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v21, resolved type: com.instagram.common.typedurl.ImageUrl} */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0574, code lost:
        if (X.00p.A0j(r23, X.2FW.A1v.A00, r2) == false) goto L_0x0576;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x058a, code lost:
        if (r3.equalsIgnoreCase("true") != r2) goto L_0x058c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cqp(android.view.View r58, com.instagram.common.typedurl.ImageUrl r59, X.C68168N3i r60, com.instagram.model.direct.messageid.MessageIdentifier r61, com.instagram.ui.widget.gradientspinner.GradientSpinner r62, java.lang.Long r63, java.lang.Long r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.lang.String r70, java.lang.String r71, java.util.List r72, java.util.List r73, java.util.List r74, java.util.List r75, java.util.List r76, java.util.Map r77, int r78, boolean r79) {
        /*
            r57 = this;
            r8 = r67
            r6 = 0
            r5 = r66
            r55 = r65
            r0 = r55
            boolean r2 = X.AnonymousClass7TF.A1U(r6, r0, r5)
            r22 = 2
            r56 = r61
            r1 = r56
            r0 = r22
            X.0qQ.A0B(r1, r0)
            r0 = r57
            X.0sa r1 = r0.A0N
            java.lang.Object r4 = r1.invoke()
            X.7Zg r4 = (X.C333517Zg) r4
            if (r4 == 0) goto L_0x0169
            X.7S7 r21 = r4.C6l()
            com.instagram.direct.capabilities.Capabilities r1 = r21.AlE()
            X.9Gx r3 = X.C376179Gx.PSEUDO_NAVIGATE_TO_XMA_DETAILS
            boolean r1 = r1.A00(r3)
            if (r1 == 0) goto L_0x05fa
            X.7S9 r3 = r4.AvL()
            X.3t2 r1 = r21.C6c()
            X.0qQ.A07(r1)
            boolean r37 = X.AnonymousClass6W3.A07(r1)
            androidx.fragment.app.FragmentActivity r1 = r0.A03
            r42 = r1
            boolean r38 = X.0oI.A0A(r42)
            boolean r1 = r3 instanceof X.AnonymousClass7S6
            r40 = r78
            r9 = r77
            r35 = r72
            r23 = r70
            if (r1 == 0) goto L_0x04a5
            r10 = r3
            X.7S6 r10 = (X.AnonymousClass7S6) r10
            r1 = r56
            java.lang.String r8 = r1.A01
            X.2Dm r7 = r10.A0O
            com.instagram.model.direct.DirectThreadKey r1 = r10.B8S()
            X.3su r1 = r7.BRz(r1, r8)
            if (r1 == 0) goto L_0x009b
            X.2FW r7 = r1.A10
            if (r7 == 0) goto L_0x009b
            X.OVS r1 = r0.A08
            java.lang.Long r26 = X.DbS.A0j(r40)
            java.lang.String r31 = r56.A00()
            java.lang.Boolean r10 = r10.A0D(r8)
            boolean r39 = r10.booleanValue()
            X.7XJ r10 = r0.A0G
            java.lang.String r34 = r10.B20()
            java.lang.String r30 = "xma"
            r33 = r71
            r28 = r5
            r29 = r8
            r32 = r23
            r36 = r9
            r24 = r1
            r25 = r7
            r27 = r55
            r24.A01(r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
        L_0x009b:
            r20 = 0
            android.net.Uri r1 = X.DbT.A09(r55)
            r0.A02(r1, r4)
            java.util.List r10 = r1.getPathSegments()
            java.lang.String r7 = "comment_id"
            java.lang.String r19 = r1.getQueryParameter(r7)
            java.lang.String r7 = "media_id"
            java.lang.String r12 = r1.getQueryParameter(r7)
            r13 = r73
            if (r73 == 0) goto L_0x04a1
            boolean r7 = r13.isEmpty()
            if (r7 != 0) goto L_0x04a1
            java.lang.Object r16 = X.00k.A0I(r13)
            r7 = r16
            com.instagram.common.typedurl.ImageUrl r7 = (com.instagram.common.typedurl.ImageUrl) r7
            r16 = r7
        L_0x00c8:
            com.instagram.common.session.UserSession r7 = r0.A05
            r29 = r7
            java.lang.String r7 = r7.A06
            r28 = r7
            boolean r34 = X.0qQ.A0K(r7, r5)
            java.lang.String r7 = "spin_id"
            java.lang.String r32 = r1.getQueryParameter(r7)
            java.lang.String r8 = r1.getHost()
            java.lang.String r18 = "comments"
            r7 = r18
            boolean r7 = X.0qQ.A0K(r8, r7)
            if (r7 == 0) goto L_0x00f4
            X.3sy r8 = r21.B8S()
            X.0qQ.A07(r8)
            r7 = r55
            r0.A06(r8, r7, r12, r5)
        L_0x00f4:
            r7 = r56
            java.lang.String r7 = r7.A01
            r27 = r7
            java.lang.String r17 = r56.A00()
            r8 = r60
            if (r60 == 0) goto L_0x049e
            android.graphics.RectF r15 = r8.A01
        L_0x0104:
            r7 = r62
            if (r62 == 0) goto L_0x049b
            android.content.Context r9 = r0.A01
            android.content.res.Resources r9 = X.AnonymousClass7TF.A0A(r9)
            X.OMU r14 = new X.OMU
            r14.<init>(r9, r7)
        L_0x0113:
            X.OVS r9 = r0.A08
            X.0sa r9 = r9.A06
            java.lang.Object r11 = r9.invoke()
            java.util.List r11 = (java.util.List) r11
            androidx.fragment.app.Fragment r9 = r0.A02
            r24 = r9
            X.N3I r9 = new X.N3I
            r48 = r64
            r46 = r59
            r41 = r9
            r43 = r15
            r44 = r24
            r45 = r29
            r47 = r14
            r49 = r5
            r50 = r27
            r51 = r17
            r52 = r20
            r53 = r13
            r54 = r11
            r41.<init>(r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            boolean r9 = r0.A08(r1, r9)
            if (r9 != 0) goto L_0x0169
            if (r60 == 0) goto L_0x0226
            int r11 = r10.size()
            r9 = r22
            if (r11 < r9) goto L_0x016a
            java.lang.String r11 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r9 = "tv"
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x016a
            X.7Xl r3 = r0.A0D
            java.lang.String r2 = X.AnonymousClass7TE.A19(r10, r2)
            android.graphics.RectF r1 = r8.A01
            r0 = r20
            r3.Cpp(r1, r0, r2)
        L_0x0169:
            return
        L_0x016a:
            java.lang.String r11 = r1.getHost()
            java.lang.String r9 = "blend"
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x01bf
            r9 = 992(0x3e0, float:1.39E-42)
            java.lang.String r9 = X.C273654mx.A00(r9)
            java.lang.String r11 = r1.getQueryParameter(r9)
            if (r11 == 0) goto L_0x01bf
            X.7Wt r4 = r0.A0B
            java.lang.String r29 = r1.getQueryParameter(r9)
            android.graphics.RectF r5 = r8.A01
            if (r62 == 0) goto L_0x01bd
            android.content.Context r0 = r0.A01
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            X.OMU r3 = new X.OMU
            r3.<init>(r0, r7)
        L_0x0197:
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r2)
            r0 = 914(0x392, float:1.281E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r33 = r1.getQueryParameter(r0)
            java.lang.Boolean r28 = java.lang.Boolean.valueOf(r6)
            r21 = r4
            r22 = r5
            r23 = r16
            r24 = r3
            r25 = r56
            r26 = r20
            r30 = r20
            r31 = r20
            r21.CpS(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        L_0x01bd:
            r3 = 0
            goto L_0x0197
        L_0x01bf:
            int r11 = r10.size()
            r9 = r22
            if (r11 < r9) goto L_0x0226
            java.lang.String r11 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r9 = "reel"
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x0226
            java.lang.String r11 = r1.getHost()
            if (r11 == 0) goto L_0x0226
            java.lang.String r14 = ".*instagram.*"
            X.11S r9 = new X.11S
            r9.<init>(r14)
            boolean r9 = r9.A08(r11)
            if (r9 != r2) goto L_0x0226
            X.7Wt r3 = r0.A0B
            java.lang.String r4 = "id"
            java.lang.String r11 = r1.getQueryParameter(r4)
            java.lang.String r12 = X.AnonymousClass7TE.A19(r10, r2)
            android.graphics.RectF r4 = r8.A01
            if (r62 == 0) goto L_0x0224
            android.content.Context r0 = r0.A01
            android.content.res.Resources r0 = X.AnonymousClass7TF.A0A(r0)
            X.OMU r2 = new X.OMU
            r2.<init>(r0, r7)
        L_0x0201:
            java.lang.String r0 = "is_clips_ad"
            java.lang.String r0 = r1.getQueryParameter(r0)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            r5 = r16
            r6 = r2
            r7 = r56
            r8 = r20
            r13 = r8
            r14 = r32
            r15 = r8
            r16 = r34
            r3.CpS(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0224:
            r2 = 0
            goto L_0x0201
        L_0x0226:
            java.lang.String r11 = r1.getHost()
            r9 = r18
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x023a
            if (r12 == 0) goto L_0x023a
            r1 = r19
            r0.A07(r12, r1)
            return
        L_0x023a:
            java.lang.String r11 = r1.getHost()
            r9 = 1589(0x635, float:2.227E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r9)
            boolean r9 = r9.equalsIgnoreCase(r11)
            r19 = r63
            r26 = r76
            r25 = r75
            r24 = r74
            r15 = r58
            if (r9 == 0) goto L_0x027c
            if (r60 == 0) goto L_0x027c
            if (r73 == 0) goto L_0x027c
            boolean r9 = r13.isEmpty()
            if (r9 != 0) goto L_0x027c
            r27 = r0
            r29 = r4
            r30 = r8
            r31 = r56
            r33 = r55
            r34 = r5
            r36 = r13
            r41 = r6
            r28 = r15
            r32 = r19
            r37 = r24
            r38 = r25
            r39 = r26
            r27.A03(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            return
        L_0x027c:
            java.lang.String r11 = r1.getHost()
            java.lang.String r9 = "ify_share_view"
            boolean r9 = r9.equalsIgnoreCase(r11)
            if (r9 == 0) goto L_0x02a9
            if (r60 == 0) goto L_0x02a9
            if (r73 == 0) goto L_0x02a9
            boolean r9 = r13.isEmpty()
            if (r9 != 0) goto L_0x02a9
            r14 = r0
            r16 = r4
            r17 = r8
            r18 = r56
            r20 = r55
            r21 = r5
            r22 = r35
            r23 = r13
            r27 = r6
            r28 = r2
            r14.A03(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        L_0x02a9:
            java.lang.String r9 = r1.getHost()
            java.lang.String r4 = "share_to_direct_preview"
            boolean r4 = r4.equalsIgnoreCase(r9)
            if (r4 == 0) goto L_0x02dd
            java.lang.String r2 = "url"
            java.lang.String r3 = r1.getQueryParameter(r2)
            java.lang.String r2 = "author_id"
            java.lang.String r4 = r1.getQueryParameter(r2)
            if (r3 == 0) goto L_0x0169
            if (r4 == 0) goto L_0x0169
            X.7Y6 r2 = r0.A0A
            java.lang.String r0 = "audio_cluster_id"
            java.lang.String r5 = r1.getQueryParameter(r0)
            r0 = 3034(0xbda, float:4.252E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = r1.getQueryParameter(r0)
            r7 = r79
            r2.CpR(r3, r4, r5, r6, r7)
            return
        L_0x02dd:
            java.lang.String r9 = r1.getHost()
            java.lang.String r4 = "generated_sticker_action"
            boolean r4 = r4.equalsIgnoreCase(r9)
            if (r4 == 0) goto L_0x0381
            if (r73 == 0) goto L_0x0169
            boolean r2 = r13.isEmpty()
            if (r2 != 0) goto L_0x0169
            X.7SM r2 = r0.A06
            r2.CLU()
            X.0eM r3 = r0.A0K
            r3.getValue()
            java.lang.Object r3 = r13.get(r6)
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.lang.String r5 = X.JTP.A0o(r3)
            java.lang.String r3 = r1.getLastPathSegment()
            X.0iw r7 = r0.A04
            X.OYR.A00 = r6
            X.NjX r4 = X.OYR.A00(r29)
            X.NjX r0 = X.C69332NjX.A03
            if (r4 == r0) goto L_0x0169
            java.lang.String r0 = ".webp"
            boolean r16 = X.00l.A0d(r5, r0, r6)
            java.lang.String r15 = X.AnonymousClass7TG.A0j()
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            if (r3 != 0) goto L_0x037f
            java.lang.String r14 = "INVALID_STICKER_ID"
        L_0x0325:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r16)
            r6 = r20
            r8 = r29
            r9 = r4
            r12 = r11
            r13 = r6
            X.C71048OaQ.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.7Pr r1 = X.DbS.A0W(r29)
            X.PQq r0 = new X.PQq
            r9 = r0
            r10 = r7
            r11 = r8
            r12 = r2
            r13 = r4
            r14 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r1.A0U = r0
            X.7Pu r7 = r1.A00()
            X.P7v r6 = new X.P7v
            r6.<init>(r7)
            X.NjX r4 = X.OYR.A00(r29)
            r0 = 3
            android.os.Bundle r2 = X.DbV.A0B(r4, r0)
            X.NIV r1 = new X.NIV
            r1.<init>()
            X.DbU.A1D(r2, r8)
            java.lang.String r0 = "AI_STICKER_IMAGE_URL"
            r2.putString(r0, r5)
            java.lang.String r0 = "AI_STICKER_MODAL_TYPE"
            r2.putSerializable(r0, r4)
            java.lang.String r0 = "AI_STICKER_PROMPT_TEXT"
            r4 = r68
            r2.putString(r0, r4)
            java.lang.String r0 = "AI_STICKER_ID"
            r2.putString(r0, r3)
            r1.setArguments(r2)
            r1.A00 = r6
            r0 = r42
            r7.A02(r0, r1)
            return
        L_0x037f:
            r14 = r3
            goto L_0x0325
        L_0x0381:
            java.lang.String r9 = r1.getHost()
            r4 = 1511(0x5e7, float:2.117E-42)
            java.lang.String r4 = X.C273654mx.A00(r4)
            boolean r4 = r4.equalsIgnoreCase(r9)
            if (r4 == 0) goto L_0x03c4
            if (r73 == 0) goto L_0x0169
            boolean r1 = r13.isEmpty()
            if (r1 != 0) goto L_0x0169
            if (r17 == 0) goto L_0x03a3
            r1 = r17
            X.7LQ r4 = r3.BSO(r1)
            if (r4 != 0) goto L_0x03a4
        L_0x03a3:
            r4 = 0
        L_0x03a4:
            X.7Xs r3 = r0.A0H
            java.lang.Object r0 = X.00k.A0I(r13)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            java.lang.String r2 = X.JTP.A0o(r0)
            r0 = r28
            boolean r1 = r5.equals(r0)
            if (r4 == 0) goto L_0x03be
            X.7Bo r0 = r4.A03()
            if (r0 != 0) goto L_0x03c0
        L_0x03be:
            X.7Bo r0 = X.C327627Bo.NUX_TYPE_NONE
        L_0x03c0:
            r3.Eu1(r0, r2, r1)
            return
        L_0x03c4:
            java.lang.String r4 = r1.getHost()
            java.lang.String r3 = "direct_prompt_camera"
            boolean r3 = r3.equalsIgnoreCase(r4)
            java.lang.String r4 = "collection_id"
            java.lang.String r11 = "collection_type"
            if (r3 == 0) goto L_0x041b
            java.lang.String r9 = r1.getQueryParameter(r11)
            java.lang.String r3 = "challenges"
            boolean r3 = X.0qQ.A0K(r9, r3)
            if (r3 == 0) goto L_0x041b
            java.lang.String r6 = r21.C6C()
            if (r6 == 0) goto L_0x0169
            r3 = r29
            X.3U9 r6 = X.C66582MXn.A0b(r3, r6)
            if (r6 == 0) goto L_0x0169
            boolean r3 = r6.COP()
            if (r3 != 0) goto L_0x0519
            X.7VL r3 = r0.A09
            java.lang.String r2 = r6.C6C()
            int r1 = r6.C6a()
            if (r2 == 0) goto L_0x0418
            r0 = 29
            if (r1 != r0) goto L_0x0418
            java.lang.String r1 = "instagram://thread/"
            r0 = 1169(0x491, float:1.638E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r2 = X.002.A0g(r1, r2, r0)
        L_0x0410:
            java.lang.String r1 = "link_preview"
            r0 = r27
            r3.A00(r2, r1, r5, r0)
            return
        L_0x0418:
            java.lang.String r2 = ""
            goto L_0x0410
        L_0x041b:
            java.lang.String r9 = r1.getHost()
            java.lang.String r3 = "direct_sharesheet"
            boolean r3 = r3.equalsIgnoreCase(r9)
            if (r3 == 0) goto L_0x052e
            java.lang.String r3 = r1.getQueryParameter(r11)
            java.lang.String r2 = "thread_id"
            java.lang.String r7 = r1.getQueryParameter(r2)
            java.lang.String r9 = r1.getQueryParameter(r4)
            java.lang.String r1 = "challenges"
            boolean r1 = X.0qQ.A0K(r3, r1)
            if (r1 == 0) goto L_0x0169
            if (r7 == 0) goto L_0x0169
            if (r9 == 0) goto L_0x0169
            r3 = 29
            X.3Te r2 = r21.BiC()
            r1 = r28
            java.lang.String r14 = X.C329997La.A00(r2, r1, r3)
            X.P9G r4 = r0.A0I
            java.lang.String r11 = r21.BiB()
            X.1as r0 = X.1as.A04
            X.1ap r3 = r0.A02
            com.instagram.common.session.UserSession r2 = r4.A03
            X.2FW r1 = X.2FW.A0R
            X.0iw r0 = r4.A02
            X.F3w r3 = r3.A07(r0, r2, r1)
            X.0eK r0 = r4.A08
            X.7SD r0 = X.C66582MXn.A0X(r0)
            if (r0 == 0) goto L_0x0499
            int r0 = r0.A01
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
        L_0x046f:
            java.lang.String r16 = "channel_challenge_share_xma"
            com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo r2 = new com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengePromptShareInfo
            r10 = r69
            r12 = r27
            r13 = r17
            r15 = r20
            r5 = r2
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            android.os.Bundle r1 = r3.A07
            java.lang.String r0 = "DirectShareSheetConstants.channel_challenge"
            r1.putParcelable(r0, r2)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r3.A00()
            X.37E r1 = X.AnonymousClass37D.A00
            androidx.fragment.app.FragmentActivity r0 = r4.A00
            X.37D r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0169
            r0.A0J(r2)
            return
        L_0x0499:
            r6 = 0
            goto L_0x046f
        L_0x049b:
            r14 = 0
            goto L_0x0113
        L_0x049e:
            r15 = 0
            goto L_0x0104
        L_0x04a1:
            r16 = 0
            goto L_0x00c8
        L_0x04a5:
            boolean r1 = r3 instanceof X.PCQ
            if (r1 == 0) goto L_0x009b
            if (r67 == 0) goto L_0x009b
            if (r37 != 0) goto L_0x009b
            X.OVS r10 = r0.A08
            java.lang.String r11 = r56.A00()
            java.lang.String r12 = "xma"
            com.instagram.common.session.UserSession r13 = r10.A02
            X.0iw r7 = r10.A01
            X.0sa r1 = r10.A07
            java.lang.Object r1 = r1.invoke()
            X.3sy r1 = (X.C254743sy) r1
            boolean r19 = X.C321406u6.A06(r55)
            r14 = r7
            r15 = r13
            r16 = r1
            r17 = r6
            r18 = r38
            X.1Ln r7 = X.C3265677h.A00(r14, r15, r16, r17, r18, r19)
            if (r70 == 0) goto L_0x04d5
            r8 = r23
        L_0x04d5:
            java.lang.String r1 = "web_link_entry_source"
            r7.A0R(r1, r8)
            X.0sa r1 = r10.A06
            java.lang.Object r1 = r1.invoke()
            java.util.List r1 = (java.util.List) r1
            r8 = 0
            if (r1 == 0) goto L_0x04ff
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r14 = r1.iterator()
        L_0x04ed:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0500
            com.instagram.user.model.User r1 = X.DbT.A0k(r14)
            java.lang.String r1 = r1.getId()
            X.C66582MXn.A1N(r1, r13)
            goto L_0x04ed
        L_0x04ff:
            r13 = r8
        L_0x0500:
            java.lang.String r1 = "recipient_ids"
            r7.A0S(r1, r13)
            java.lang.String r1 = "tap_surface"
            r7.A0R(r1, r12)
            java.lang.String r1 = "client_context"
            r7.A0R(r1, r11)
            r1 = r55
            X.OVS.A00(r7, r10, r1, r8, r9)
            r7.Cgf()
            goto L_0x009b
        L_0x0519:
            X.OUc r3 = X.C70979OUc.A00
            java.lang.String r7 = r1.getQueryParameter(r4)
            java.lang.String r0 = "subtitle_text"
            java.lang.String r8 = r1.getQueryParameter(r0)
            r4 = r42
            r5 = r29
            r9 = r2
            r3.A00(r4, r5, r6, r7, r8, r9)
            return
        L_0x052e:
            if (r60 == 0) goto L_0x05e6
            X.0qQ.A0A(r10)
            java.lang.String r9 = r1.getHost()
            r12 = 1
            if (r9 == 0) goto L_0x0576
            java.lang.String r4 = ".*instagram.*"
            X.11S r3 = new X.11S
            r3.<init>(r4)
            boolean r3 = r3.A08(r9)
            if (r3 != r2) goto L_0x0576
            int r4 = r10.size()
            r3 = r22
            if (r4 < r3) goto L_0x0576
            java.lang.String r4 = X.AnonymousClass7TE.A19(r10, r6)
            java.lang.String r3 = "p"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L_0x0576
            java.lang.Object r3 = r10.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            if (r3 == 0) goto L_0x0576
            boolean r3 = X.00l.A0W(r3)
            if (r3 != 0) goto L_0x0576
            X.2FW r3 = X.2FW.A1v
            java.lang.String r4 = r3.A00
            r3 = r23
            boolean r3 = X.00p.A0j(r3, r4, r2)
            r11 = 1
            if (r3 != 0) goto L_0x0577
        L_0x0576:
            r11 = 0
        L_0x0577:
            r3 = 166(0xa6, float:2.33E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r3)
            java.lang.String r3 = r1.getQueryParameter(r3)
            java.lang.String r9 = "true"
            if (r3 == 0) goto L_0x058c
            boolean r3 = r3.equalsIgnoreCase(r9)
            r4 = 1
            if (r3 == r2) goto L_0x058d
        L_0x058c:
            r4 = 0
        L_0x058d:
            java.lang.String r3 = "is_ineligible_for_clips_chaining"
            java.lang.String r1 = r1.getQueryParameter(r3)
            if (r1 == 0) goto L_0x059c
            boolean r1 = r1.equalsIgnoreCase(r9)
            if (r1 != 0) goto L_0x059c
            r12 = 0
        L_0x059c:
            if (r11 == 0) goto L_0x05e6
            if (r12 != 0) goto L_0x05e6
            X.0Tu r9 = X.0Tu.A05
            if (r4 == 0) goto L_0x05e0
            r3 = 36328620096372194(0x8110b000063de2, double:3.0377038603328085E-306)
        L_0x05a9:
            r1 = r29
            boolean r1 = X.182.A06(r9, r1, r3)
            if (r1 == 0) goto L_0x05e6
            X.7Wt r3 = r0.A0B
            java.lang.String r10 = X.AnonymousClass7TE.A19(r10, r2)
            android.graphics.RectF r2 = r8.A01
            if (r62 == 0) goto L_0x05de
            android.content.Context r0 = r0.A01
            android.content.res.Resources r1 = X.AnonymousClass7TF.A0A(r0)
            X.OMU r0 = new X.OMU
            r0.<init>(r1, r7)
        L_0x05c6:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r6)
            r1 = r3
            r3 = r16
            r4 = r0
            r5 = r56
            r6 = r20
            r8 = r7
            r9 = r6
            r11 = r6
            r12 = r32
            r13 = r6
            r14 = r34
            r1.CpS(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x05de:
            r0 = 0
            goto L_0x05c6
        L_0x05e0:
            r3 = 36328620096044509(0x8110b000013ddd, double:3.037703860125579E-306)
            goto L_0x05a9
        L_0x05e6:
            java.lang.String r2 = r21.C6C()
            r1 = r55
            java.lang.String r3 = A01(r1, r2)
            X.7VL r2 = r0.A09
            java.lang.String r1 = "link_preview"
            r0 = r27
            r2.A00(r3, r1, r5, r0)
            return
        L_0x05fa:
            X.C69865NtT.A00(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9R.Cqp(android.view.View, com.instagram.common.typedurl.ImageUrl, X.N3i, com.instagram.model.direct.messageid.MessageIdentifier, com.instagram.ui.widget.gradientspinner.GradientSpinner, java.lang.Long, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, int, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0433, code lost:
        if (r8.equals(r7) != false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0437, code lost:
        if (r51 == null) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x043d, code lost:
        if (r0.length() <= 0) goto L_0x05bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x043f, code lost:
        r7 = r12.getQueryParameter("media_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0443, code lost:
        if (r7 != null) goto L_0x044b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0445, code lost:
        r7 = r12.getQueryParameter("reel_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x044b, code lost:
        r8 = X.C66580MXl.A0W(r41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x044f, code lost:
        if (r8 == null) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0451, code lost:
        r8 = r8.C6l().Cms();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0459, code lost:
        if (r8 == null) goto L_0x05b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x045b, code lost:
        r32 = X.OP1.A00(r8).name();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0463, code lost:
        r23 = r44;
        r21 = new X.N3I(r6, r23, r1.A02, r2, (com.instagram.common.typedurl.ImageUrl) null, (X.OMU) null, (java.lang.Long) null, r3, r38, r56, r32, (java.util.List) null, (java.util.List) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0488, code lost:
        if (r0.startsWith("instagram://bloks/") == false) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x048a, code lost:
        X.FFC.A03(r2, r40, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x04ec, code lost:
        if (r0.startsWith("instagram://run_bloks_action/") == false) goto L_0x052c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x04ee, code lost:
        X.DbS.A1X(r6);
        r7 = X.DbT.A09(r0);
        r1 = r7.getQueryParameter("params");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x04fb, code lost:
        if (r1 == null) goto L_0x0510;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:?, code lost:
        r16 = X.F5I.A00(X.0c9.A04.A01(r2, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0508, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0509, code lost:
        X.0KC.A0F("direct_thread", "IOException while parseParams()", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0536, code lost:
        if ("comments".equals(r12.getHost()) == false) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0538, code lost:
        if (r7 == null) goto L_0x0581;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x053a, code lost:
        r8 = r12.getQueryParameter("comment_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x054c, code lost:
        if ("clips".equals(r12.getQueryParameter("media_type")) == false) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x054e, code lost:
        if (r44 == null) goto L_0x057d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0550, code lost:
        r1.A0B.CpS(r23, (com.instagram.common.typedurl.ImageUrl) null, (X.OMU) null, r42, (X.AnonymousClass3OA) null, false, (java.lang.Boolean) null, r7, (java.lang.String) null, r8, (java.lang.String) null, (java.lang.String) null, X.C66580MXl.A1X(r2, r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0571, code lost:
        r2 = r20.B8S();
        X.0qQ.A07(r2);
        A06(r2, r0, r7, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x057d, code lost:
        A07(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0585, code lost:
        if (A08(r12, r21) != false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x058b, code lost:
        if (X.OXO.A02(r12) == false) goto L_0x05a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x058d, code lost:
        r1.A09.A00(X.OXO.A01(r0, X.AnonymousClass7TE.A1I(new android.util.Pair("s", "channel_link_xma"))), "xma_cta", r3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05a7, code lost:
        r1.A09.A00(A01(r0, r20.C6C()), "xma_cta", r3, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05b8, code lost:
        r32 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x05bc, code lost:
        r0 = "Null or empty url on WEB_URL CTA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x05c6, code lost:
        if (r8.equals(r1) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05c8, code lost:
        r3 = new X.C71008OYe(r6, r39, r2);
        r2 = r20.C6O();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05d3, code lost:
        if (r51 != null) goto L_0x05db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05d5, code lost:
        r14 = "AppointmentBookingXMACtaHandler";
        r0 = "url is null or empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05db, code lost:
        switch(r15) {
            case -1524976429: goto L_0x070f;
            case -1283937730: goto L_0x06f0;
            case -120225331: goto L_0x06c8;
            case 735972178: goto L_0x06ab;
            case 1432172107: goto L_0x068b;
            case 1477503468: goto L_0x066a;
            case 1714077153: goto L_0x064a;
            case 1765252812: goto L_0x05ff;
            case 2133108061: goto L_0x05df;
            default: goto L_0x05de;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x05de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05e5, code lost:
        if (r8.equals("booking_ig_view_calendar") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x05e7, code lost:
        r13 = X.OZW.A00;
        r14 = r3.A00;
        r4 = r3.A02;
        r15 = r3.A01;
        r1 = X.C71008OYe.A00(r3, r2);
        r2 = r4.A06;
        r20 = X.C71008OYe.A01(r0);
        r17 = "com.bloks.www.services.ig.appointment.calendar";
        r21 = "merchant_view_calendar_xma_cta";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0605, code lost:
        if (r8.equals("booking_ig_business_accept_appointment") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0607, code lost:
        r5 = r3.A00;
        r6 = r3.A02;
        r4 = r3.A01;
        r3 = X.C71008OYe.A00(r3, r2);
        r2 = r6.A06;
        r1 = X.C71008OYe.A01(r0);
        r7 = new X.FBO("com.bloks.www.services.ig.customer.request_appointment_accept.async");
        r3 = X.AnonymousClass7TE.A1L("ig_buyer_igid", r3);
        r2 = X.AnonymousClass7TE.A1L("ig_merchant_igid", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x062c, code lost:
        if (r1 != null) goto L_0x0630;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x062e, code lost:
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0630, code lost:
        r7.A04 = X.0Yt.A02(X.AnonymousClass7TH.A0h("referrer_ui_component", "merchant_confirm_appointment_xma_cta", r3, r2, X.AnonymousClass7TE.A1L("appointment_id", r1)));
        r7.A01(r5, X.C229382nI.A04(r5, r4, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0649, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0650, code lost:
        if (r8.equals("booking_ig_user_view_details") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x0652, code lost:
        r4 = X.OZW.A00;
        r5 = r3.A00;
        r7 = r3.A02;
        r6 = r3.A01;
        r9 = r7.A06;
        r10 = X.C71008OYe.A00(r3, r2);
        r11 = X.C71008OYe.A01(r0);
        r8 = "com.bloks.www.services.ig.appointment.edit.contact.details";
        r12 = "customer_view_details_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0670, code lost:
        if (r8.equals("booking_ig_business_view_appointment_details") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0672, code lost:
        r13 = X.OZW.A00;
        r14 = r3.A00;
        r4 = r3.A02;
        r15 = r3.A01;
        r1 = X.C71008OYe.A00(r3, r2);
        r2 = r4.A06;
        r20 = X.C71008OYe.A01(r0);
        r17 = "com.bloks.www.services.ig.appointment.booking";
        r21 = "merchant_view_details_xma";
        r22 = "IG_APPOINTMENT_BUSINESS_EDIT_BOOKING_SCREEN_ID";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0691, code lost:
        if (r8.equals("booking_ig_user_add_details") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0693, code lost:
        r4 = X.OZW.A00;
        r5 = r3.A00;
        r7 = r3.A02;
        r6 = r3.A01;
        r9 = r7.A06;
        r10 = X.C71008OYe.A00(r3, r2);
        r11 = X.C71008OYe.A01(r0);
        r8 = "com.bloks.www.services.ig.appointment.edit.contact.details";
        r12 = "customer_add_contact_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x06b1, code lost:
        if (r8.equals("booking_ig_business_view_create_appointment") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x06b3, code lost:
        r13 = X.OZW.A00;
        r14 = r3.A00;
        r4 = r3.A02;
        r15 = r3.A01;
        r1 = X.C71008OYe.A00(r3, r2);
        r2 = r4.A06;
        r20 = null;
        r17 = "com.bloks.www.services.ig.appointment.booking";
        r21 = "merchant_cancelled_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x06ce, code lost:
        if (r8.equals("booking_ig_customer_view_request_another_time") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x06d0, code lost:
        r13 = X.OZW.A00;
        r14 = r3.A00;
        r4 = r3.A02;
        r15 = r3.A01;
        r1 = r4.A06;
        r2 = X.C71008OYe.A00(r3, r2);
        r20 = null;
        r17 = "com.bloks.www.services.ig.appointment.customer";
        r21 = "customer_cancelled_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x06e4, code lost:
        r22 = "IG_APPOINTMENT_BOOKING_START_SCREEN_ID";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x06e6, code lost:
        r13.A02(r14, r15, r4, r17, r1, r2, r20, r21, r22);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x06ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06f6, code lost:
        if (r8.equals("booking_ig_business_view_details_appointment_cancelled") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06f8, code lost:
        r4 = X.OZW.A00;
        r5 = r3.A00;
        r7 = r3.A02;
        r6 = r3.A01;
        r9 = X.C71008OYe.A00(r3, r2);
        r10 = r7.A06;
        r11 = X.C71008OYe.A01(r0);
        r8 = "com.bloks.www.services.ig.appointment.cancellation.details";
        r12 = "merchant_cancelled_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x013b, code lost:
        r0 = "Unsupported XMA CTA Type";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x0715, code lost:
        if (r8.equals("booking_ig_user_view_details_appointment_cancelled") == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0717, code lost:
        r4 = X.OZW.A00;
        r5 = r3.A00;
        r7 = r3.A02;
        r6 = r3.A01;
        r9 = r7.A06;
        r10 = X.C71008OYe.A00(r3, r2);
        r11 = X.C71008OYe.A01(r0);
        r8 = "com.bloks.www.services.ig.appointment.cancellation.details";
        r12 = "customer_cancelled_xma";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x072d, code lost:
        r4.A01(r5, r6, r7, r8, r9, r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0730, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x013d, code lost:
        X.0wb.A03(r14, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x075e, code lost:
        r3 = X.C46649DiU.A04(r0, r1);
        r0 = new X.C49672F1e(r2);
        r2 = X.AnonymousClass05K.A01;
        r1 = r0.A00;
        r1.A0P = r2;
        r1.A0R = r39.getModuleName();
        r1.A00 = 32;
        r1.A0P = r2;
        r3.A0D(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x077c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0285, code lost:
        if (r8.equals(r7) != false) goto L_0x0437;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJS(android.graphics.RectF r44, X.2FW r45, com.instagram.model.direct.messageid.DirectMessageIdentifier r46, com.instagram.ui.widget.gradientspinner.GradientSpinner r47, java.lang.Integer r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, java.lang.String r55, java.lang.String r56, java.lang.String r57, java.util.Map r58) {
        /*
            r43 = this;
            r0 = r51
            r11 = 0
            r9 = r49
            r8 = r50
            boolean r21 = X.AnonymousClass7TF.A1U(r11, r9, r8)
            r42 = r46
            r3 = r54
            r1 = r42
            X.AnonymousClass7TG.A1S(r3, r1)
            r1 = 9
            r10 = r45
            X.0qQ.A0B(r10, r1)
            r1 = r43
            X.0sa r2 = r1.A0N
            r41 = r2
            java.lang.Object r7 = r41.invoke()
            X.7Zg r7 = (X.C333517Zg) r7
            if (r7 == 0) goto L_0x0140
            X.7S7 r20 = r7.C6l()
            android.content.Context r2 = r1.A01
            r40 = r2
            com.instagram.common.session.UserSession r2 = r1.A05
            androidx.fragment.app.FragmentActivity r6 = r1.A03
            X.0iw r4 = r1.A04
            r39 = r4
            r12 = r40
            r5 = r4
            r4 = r20
            boolean r19 = X.C70104NxK.A00(r6, r12, r5, r2, r4)
            X.0wc r18 = X.AnonymousClass0kN.A02(r2)
            if (r48 == 0) goto L_0x0735
            java.lang.String r5 = "cta"
            int r4 = r48.intValue()
            int r4 = r4 + 1
            java.lang.String r28 = X.002.A0O(r5, r4)
        L_0x0054:
            X.3t2 r4 = r20.C6c()
            X.0qQ.A07(r4)
            boolean r35 = X.AnonymousClass6W3.A07(r4)
            r4 = r20
            boolean r5 = r4 instanceof X.AnonymousClass7S6
            r4 = 0
            if (r5 == 0) goto L_0x0731
            r12 = r20
            X.7S6 r12 = (X.AnonymousClass7S6) r12
            if (r12 == 0) goto L_0x0731
            r5 = r42
            java.lang.String r5 = r5.A01
            java.lang.Boolean r5 = r12.A0D(r5)
            if (r5 == 0) goto L_0x0731
            boolean r37 = r5.booleanValue()
        L_0x007a:
            X.OVS r12 = r1.A08
            r5 = r42
            java.lang.String r5 = r5.A01
            r38 = r5
            r5 = r42
            java.lang.String r5 = r5.A00
            r17 = r5
            boolean r36 = X.0oI.A0A(r6)
            X.7XJ r5 = r1.A0G
            java.lang.String r32 = r5.B20()
            r31 = r55
            r34 = r58
            r30 = r57
            r27 = r38
            r29 = r17
            r33 = r4
            r22 = r12
            r23 = r10
            r24 = r4
            r25 = r0
            r26 = r3
            r22.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.A8a r5 = r1.A00
            r22 = r5
            r23 = r39
            r24 = r2
            r27 = r35
            r22.A00(r23, r24, r25, r26, r27)
            java.lang.String r22 = ""
            r5 = r0
            if (r51 != 0) goto L_0x00bf
            r5 = r22
        L_0x00bf:
            android.net.Uri r12 = X.DbT.A09(r5)
            r1.A02(r12, r7)
            java.lang.String r5 = "item_type"
            java.lang.String r14 = r12.getQueryParameter(r5)
            java.lang.String r5 = "add_to_story"
            boolean r5 = r12.getBooleanQueryParameter(r5, r11)
            if (r5 == 0) goto L_0x012e
            X.2FW r5 = X.2FW.A1v
            boolean r5 = X.Dba.A1X(r5, r14)
            if (r5 != 0) goto L_0x00e4
            X.2FW r5 = X.2FW.A1p
            boolean r5 = X.Dba.A1X(r5, r14)
            if (r5 == 0) goto L_0x012e
        L_0x00e4:
            X.NjN r15 = X.C69322NjN.A03
            X.1Ln r16 = X.1Ln.A04(r18)
            boolean r5 = X.DbT.A1Y(r16)
            if (r5 == 0) goto L_0x012e
            X.N0a r13 = new X.N0a
            r13.<init>()
            java.lang.String r5 = "author_id"
            r13.A06(r5, r3)
            X.Nlk r15 = r15.A00
            java.lang.String r5 = "cta_type"
            r13.A01(r15, r5)
            java.lang.String r5 = "payload"
            r13.A06(r5, r4)
            java.lang.String r5 = "message_id"
            r13.A06(r5, r4)
            java.lang.String r5 = "title"
            r13.A06(r5, r9)
            java.lang.String r5 = "type"
            r13.A06(r5, r14)
            java.lang.String r5 = "notification_token"
            r13.A06(r5, r4)
            java.lang.String r5 = "campaign_id"
            r13.A06(r5, r4)
            java.lang.String r5 = "cta_type_unique_id"
            r13.A06(r5, r4)
            java.lang.String r14 = "call_to_action"
            r5 = r16
            r5.A0N(r13, r14)
            r16.Cgf()
        L_0x012e:
            int r15 = r8.hashCode()
            java.lang.String r13 = "media_id"
            java.lang.String r14 = "DirectXmaNavigator"
            r5 = r53
            switch(r15) {
                case -1524976429: goto L_0x0141;
                case -1283937730: goto L_0x0145;
                case -773349167: goto L_0x0149;
                case -630755038: goto L_0x014d;
                case -605136096: goto L_0x0200;
                case -504306182: goto L_0x020a;
                case -502711000: goto L_0x0211;
                case -246520126: goto L_0x0221;
                case -120225331: goto L_0x026c;
                case 37456919: goto L_0x0270;
                case 38721517: goto L_0x0273;
                case 184018580: goto L_0x0276;
                case 310459463: goto L_0x0279;
                case 393763406: goto L_0x027c;
                case 462436666: goto L_0x027f;
                case 735972178: goto L_0x0289;
                case 757419399: goto L_0x028d;
                case 1223751172: goto L_0x0323;
                case 1314037561: goto L_0x0327;
                case 1432172107: goto L_0x03b6;
                case 1477503468: goto L_0x03ba;
                case 1714077153: goto L_0x03be;
                case 1765252812: goto L_0x03c2;
                case 1855361157: goto L_0x03c6;
                case 1950847763: goto L_0x03d6;
                case 2023283705: goto L_0x0426;
                case 2062383705: goto L_0x042d;
                case 2133108061: goto L_0x05c0;
                default: goto L_0x013b;
            }
        L_0x013b:
            java.lang.String r0 = "Unsupported XMA CTA Type"
        L_0x013d:
            X.0wb.A03(r14, r0)
        L_0x0140:
            return
        L_0x0141:
            java.lang.String r1 = "booking_ig_user_view_details_appointment_cancelled"
            goto L_0x05c2
        L_0x0145:
            java.lang.String r1 = "booking_ig_business_view_details_appointment_cancelled"
            goto L_0x05c2
        L_0x0149:
            java.lang.String r7 = "xma_web_url"
            goto L_0x0281
        L_0x014d:
            java.lang.String r4 = "xma_long_press_action"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x013b
            r4 = r0
            if (r51 != 0) goto L_0x015a
            r4 = r22
        L_0x015a:
            android.net.Uri r9 = X.DbT.A09(r4)
            java.lang.String r8 = r9.getHost()
            if (r8 == 0) goto L_0x0140
            int r5 = r8.hashCode()
            r4 = -804158557(0xffffffffd01183a3, float:-9.7652931E9)
            if (r5 == r4) goto L_0x018c
            r1 = 1947068729(0x740de939, float:4.49734E31)
            if (r5 != r1) goto L_0x0140
            java.lang.String r1 = "edit_prompt"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.3sy r1 = r20.B8S()
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A04(r1)
            if (r1 == 0) goto L_0x0140
            if (r51 != 0) goto L_0x0188
            r0 = r22
        L_0x0188:
            X.C69962Nv2.A00(r6, r2, r1, r0)
            return
        L_0x018c:
            java.lang.String r0 = "stop_recurring_prompt"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0140
            if (r17 == 0) goto L_0x0198
            r22 = r17
        L_0x0198:
            X.0xG r0 = X.DbS.A0O(r14)
            X.ONz r8 = new X.ONz
            r8.<init>(r0, r2)
            java.lang.String r0 = "collection_id"
            java.lang.String r5 = r9.getQueryParameter(r0)
            X.Nmf r0 = X.C69497Nmf.IMPRESSION
            A05(r0, r8, r7, r5)
            android.content.res.Resources r4 = r6.getResources()
            X.OUZ r0 = X.OUZ.A00
            int r0 = r0.A00(r2)
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r4, r0)
            java.lang.String r4 = X.AnonymousClass7TF.A0j(r0)
            android.content.res.Resources r2 = r6.getResources()
            r0 = 2131960381(0x7f13223d, float:1.955743E38)
            java.lang.String r2 = X.AnonymousClass7TF.A0e(r2, r4, r0)
            X.0qQ.A07(r2)
            X.8ab r4 = X.DbS.A0X(r6)
            r0 = 2131960382(0x7f13223e, float:1.9557431E38)
            r4.A09(r0)
            r4.A0q(r2)
            r2 = 2131968772(0x7f134304, float:1.9574448E38)
            r16 = 2
            X.OfH r0 = new X.OfH
            r9 = r0
            r10 = r1
            r11 = r7
            r12 = r8
            r13 = r22
            r14 = r3
            r15 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r4.A0L(r0, r2)
            X.Of9 r0 = new X.Of9
            r11 = r0
            r12 = r7
            r13 = r1
            r14 = r8
            r11.<init>(r12, r13, r14, r15, r16)
            r4.A0C(r0)
            r0 = r21
            X.AnonymousClass7TH.A0a(r4, r0)
            return
        L_0x0200:
            java.lang.String r0 = "xma_disabled_cta"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L_0x0140
            goto L_0x013b
        L_0x020a:
            r7 = 1654(0x676, float:2.318E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r7)
            goto L_0x0281
        L_0x0211:
            java.lang.String r1 = "ig_bio_send_message"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x013b
            if (r51 != 0) goto L_0x0739
            java.lang.String r14 = "BIOSendMessageXMACtaHandler"
            java.lang.String r0 = "media id is null or empty"
            goto L_0x013d
        L_0x0221:
            java.lang.String r3 = "xma_shopping_add_to_cart"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x013b
            X.3kF r3 = X.C249713kF.A00
            java.lang.String r4 = "Required value was null."
            if (r51 == 0) goto L_0x0751
            android.os.Bundle r3 = r3.A02(r0)
            if (r3 == 0) goto L_0x074c
            java.lang.String r0 = "product_id"
            java.lang.String r13 = r3.getString(r0)
            java.lang.String r0 = "merchant_id"
            java.lang.String r14 = r3.getString(r0)
            java.lang.String r0 = "variant_value"
            java.lang.String r3 = r3.getString(r0)
            androidx.fragment.app.Fragment r0 = r1.A02
            X.0gy r10 = X.AnonymousClass07i.A00(r0)
            X.VhZ r0 = new X.VhZ
            r7 = r0
            r8 = r40
            r9 = r6
            r11 = r39
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            if (r13 == 0) goto L_0x0747
            if (r14 == 0) goto L_0x0742
            android.content.Context r9 = r0.A00
            X.07i r10 = r0.A02
            com.instagram.common.session.UserSession r11 = r0.A04
            X.WcK r12 = new X.WcK
            r12.<init>(r0, r14, r13, r3)
            X.C18262VoT.A01(r9, r10, r11, r12, r13, r14)
            return
        L_0x026c:
            java.lang.String r1 = "booking_ig_customer_view_request_another_time"
            goto L_0x05c2
        L_0x0270:
            java.lang.String r7 = "xma_igd_genai_updates"
            goto L_0x0281
        L_0x0273:
            java.lang.String r7 = "xma_igd_pinned_location_sharing"
            goto L_0x0281
        L_0x0276:
            java.lang.String r7 = "xma_ig_comment_action_url"
            goto L_0x0281
        L_0x0279:
            java.lang.String r7 = "xma_memu_onboarding"
            goto L_0x0281
        L_0x027c:
            java.lang.String r7 = "xma_igd_genai_reminders"
            goto L_0x0281
        L_0x027f:
            java.lang.String r7 = "xma_bcp_project_detail"
        L_0x0281:
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0437
            goto L_0x013b
        L_0x0289:
            java.lang.String r1 = "booking_ig_business_view_create_appointment"
            goto L_0x05c2
        L_0x028d:
            java.lang.String r0 = "postback"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x013b
            if (r19 != 0) goto L_0x0140
            X.0sa r0 = r1.A0O
            java.lang.Object r6 = r0.invoke()
            X.7L7 r6 = (X.AnonymousClass7L7) r6
            X.7L5 r0 = r6.A02
            java.lang.String r30 = r0.A00()
            r28 = r52
            r19 = r6
            r20 = r4
            r21 = r4
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r9
            r29 = r4
            r31 = r4
            r32 = r11
            X.1aU r2 = r19.A00(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            X.1a8 r1 = r6.A00
            X.PS7 r0 = new X.PS7
            r0.<init>(r6)
            r1.A02(r2, r0)
            X.2FW r0 = X.2FW.A0x
            if (r0 == r10) goto L_0x02d5
            X.2FW r0 = X.2FW.A0y
            if (r0 != r10) goto L_0x0140
        L_0x02d5:
            X.NjN r7 = X.C69322NjN.A04
            X.1Ln r6 = X.1Ln.A04(r18)
            if (r53 == 0) goto L_0x02ed
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "notification_message_token"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x02ed
            java.lang.String r4 = r2.getString(r1)
        L_0x02ed:
            r8 = 0
            if (r53 == 0) goto L_0x0300
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "mbs_mm_campaign_id"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x0300
            java.lang.String r8 = r2.getString(r1)
        L_0x0300:
            r10 = 0
            if (r53 == 0) goto L_0x0313
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "mm_cta_unique_id"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x0313
            java.lang.String r10 = r2.getString(r1)
        L_0x0313:
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0140
            r0 = r38
            X.N0a r0 = A00(r7, r3, r0, r9)
            A04(r6, r0, r4, r8, r10)
            return
        L_0x0323:
            java.lang.String r7 = "web_url"
            goto L_0x042f
        L_0x0327:
            java.lang.String r6 = "ctx_business_whatsapp_share"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x013b
            X.7VL r12 = r1.A09
            if (r51 == 0) goto L_0x0140
            int r1 = r0.length()
            if (r1 == 0) goto L_0x0140
            X.NjN r11 = X.C69322NjN.A03
            X.1Ln r10 = X.1Ln.A04(r18)
            r8 = 0
            if (r53 == 0) goto L_0x0352
            org.json.JSONObject r7 = X.C66580MXl.A17(r5)
            java.lang.String r6 = "notification_message_token"
            boolean r1 = X.DbU.A1a(r5, r6)
            if (r1 == 0) goto L_0x0352
            java.lang.String r8 = r7.getString(r6)
        L_0x0352:
            r13 = 0
            if (r53 == 0) goto L_0x0365
            org.json.JSONObject r7 = X.C66580MXl.A17(r5)
            java.lang.String r6 = "mbs_mm_campaign_id"
            boolean r1 = X.DbU.A1a(r5, r6)
            if (r1 == 0) goto L_0x0365
            java.lang.String r13 = r7.getString(r6)
        L_0x0365:
            r14 = 0
            if (r53 == 0) goto L_0x0378
            org.json.JSONObject r7 = X.C66580MXl.A17(r5)
            java.lang.String r6 = "mm_cta_unique_id"
            boolean r1 = X.DbU.A1a(r5, r6)
            if (r1 == 0) goto L_0x0378
            java.lang.String r14 = r7.getString(r6)
        L_0x0378:
            boolean r1 = X.DbT.A1Y(r10)
            if (r1 == 0) goto L_0x0387
            r1 = r38
            X.N0a r1 = A00(r11, r3, r1, r9)
            A04(r10, r1, r8, r13, r14)
        L_0x0387:
            X.0wc r2 = X.AnonymousClass0kN.A02(r2)
            java.lang.String r1 = "wa_business_number_share_cta_click"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            r1 = 412(0x19c, float:5.77E-43)
            X.1Ln r5 = new X.1Ln
            r5.<init>(r2, r1)
            boolean r1 = X.DbT.A1Y(r5)
            if (r1 == 0) goto L_0x03b0
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r3)
            if (r1 == 0) goto L_0x03b0
            java.lang.Long r2 = X.DbV.A0q(r3)
            java.lang.String r1 = "page_id"
            r5.A0Q(r1, r2)
            r5.Cgf()
        L_0x03b0:
            java.lang.String r1 = "xma_cta"
            r12.A00(r0, r1, r3, r4)
            return
        L_0x03b6:
            java.lang.String r1 = "booking_ig_user_add_details"
            goto L_0x05c2
        L_0x03ba:
            java.lang.String r1 = "booking_ig_business_view_appointment_details"
            goto L_0x05c2
        L_0x03be:
            java.lang.String r1 = "booking_ig_user_view_details"
            goto L_0x05c2
        L_0x03c2:
            java.lang.String r1 = "booking_ig_business_accept_appointment"
            goto L_0x05c2
        L_0x03c6:
            java.lang.String r1 = "bmc_base_xma"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x013b
            if (r51 != 0) goto L_0x0756
            java.lang.String r14 = "BMCBaseXMACtaHandler"
            java.lang.String r0 = "action url is null or empty"
            goto L_0x013d
        L_0x03d6:
            java.lang.String r3 = "xma_ig_prompt_action_url"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x013b
            if (r51 != 0) goto L_0x03e2
            r0 = r22
        L_0x03e2:
            android.net.Uri r3 = X.0cp.A03(r0)
            if (r3 == 0) goto L_0x0140
            androidx.fragment.app.Fragment r0 = r1.A02
            X.0gy r8 = X.AnonymousClass07i.A00(r0)
            java.lang.String r7 = r3.getQueryParameter(r13)
            java.lang.String r0 = "prompt_id"
            java.lang.String r5 = r3.getQueryParameter(r0)
            java.lang.String r0 = "prompt_text"
            java.lang.String r3 = r3.getQueryParameter(r0)
            if (r7 == 0) goto L_0x0140
            if (r5 == 0) goto L_0x0140
            X.1NY r9 = X.AnonymousClass7TG.A0b(r2)
            java.lang.String r0 = "stories/prompt_stickers/top_participants_pagination/"
            r9.A0A(r0)
            r9.A9m(r13, r7)
            java.lang.String r0 = "prompt_sticker_id"
            r9.A9m(r0, r5)
            java.lang.Class<X.XPI> r2 = X.XPI.class
            java.lang.Class<X.Xdj> r0 = X.C21517Xdj.class
            X.1OC r2 = X.DbT.A0R(r4, r9, r2, r0, r11)
            X.KA9 r0 = new X.KA9
            r0.<init>(r1, r5, r7, r3)
            r2.A00 = r0
            X.1ES.A00(r6, r8, r2)
            return
        L_0x0426:
            r7 = 3503(0xdaf, float:4.909E-42)
            java.lang.String r7 = X.C273654mx.A00(r7)
            goto L_0x042f
        L_0x042d:
            java.lang.String r7 = "xma_igd_live_location_sharing"
        L_0x042f:
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L_0x0437
            goto L_0x013b
        L_0x0437:
            if (r51 == 0) goto L_0x05bc
            int r7 = r0.length()
            if (r7 <= 0) goto L_0x05bc
            java.lang.String r7 = r12.getQueryParameter(r13)
            if (r7 != 0) goto L_0x044b
            java.lang.String r7 = "reel_id"
            java.lang.String r7 = r12.getQueryParameter(r7)
        L_0x044b:
            X.7Zg r8 = X.C66580MXl.A0W(r41)
            if (r8 == 0) goto L_0x05b8
            X.7S7 r8 = r8.C6l()
            X.2Ep r8 = r8.Cms()
            if (r8 == 0) goto L_0x05b8
            X.XSV r8 = X.OP1.A00(r8)
            java.lang.String r32 = r8.name()
        L_0x0463:
            androidx.fragment.app.Fragment r13 = r1.A02
            X.N3I r8 = new X.N3I
            r31 = r56
            r23 = r44
            r21 = r8
            r22 = r6
            r24 = r13
            r25 = r2
            r26 = r4
            r27 = r4
            r28 = r4
            r29 = r3
            r30 = r38
            r34 = r4
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            java.lang.String r13 = "instagram://bloks/"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x04e6
            r1 = r40
            X.FFC.A03(r2, r1, r0)
        L_0x048f:
            X.2FW r0 = X.2FW.A0x
            if (r0 == r10) goto L_0x0497
            X.2FW r0 = X.2FW.A0y
            if (r0 != r10) goto L_0x0140
        L_0x0497:
            X.NjN r7 = X.C69322NjN.A03
            X.1Ln r6 = X.1Ln.A04(r18)
            r4 = 0
            if (r53 == 0) goto L_0x04b0
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "notification_message_token"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x04b0
            java.lang.String r4 = r2.getString(r1)
        L_0x04b0:
            r8 = 0
            if (r53 == 0) goto L_0x04c3
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "mbs_mm_campaign_id"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x04c3
            java.lang.String r8 = r2.getString(r1)
        L_0x04c3:
            r10 = 0
            if (r53 == 0) goto L_0x04d6
            org.json.JSONObject r2 = X.C66580MXl.A17(r5)
            java.lang.String r1 = "mm_cta_unique_id"
            boolean r0 = X.DbU.A1a(r5, r1)
            if (r0 == 0) goto L_0x04d6
            java.lang.String r10 = r2.getString(r1)
        L_0x04d6:
            boolean r0 = X.DbT.A1Y(r6)
            if (r0 == 0) goto L_0x0140
            r0 = r38
            X.N0a r0 = A00(r7, r3, r0, r9)
            A04(r6, r0, r4, r8, r10)
            return
        L_0x04e6:
            java.lang.String r13 = "instagram://run_bloks_action/"
            boolean r13 = r0.startsWith(r13)
            if (r13 == 0) goto L_0x052c
            X.DbS.A1X(r6)
            android.net.Uri r7 = X.DbT.A09(r0)
            java.lang.String r0 = "params"
            java.lang.String r1 = r7.getQueryParameter(r0)
            if (r1 == 0) goto L_0x0510
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0508 }
            X.0c9 r0 = r0.A01(r2, r1)     // Catch:{ IOException -> 0x0508 }
            java.util.HashMap r16 = X.F5I.A00(r0)     // Catch:{ IOException -> 0x0508 }
            goto L_0x0512
        L_0x0508:
            r4 = move-exception
            java.lang.String r1 = "direct_thread"
            java.lang.String r0 = "IOException while parseParams()"
            X.0KC.A0F(r1, r0, r4)
        L_0x0510:
            r16 = 0
        L_0x0512:
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r14 = r7.getQueryParameter(r0)
            if (r14 == 0) goto L_0x048f
            X.Ory r12 = new X.Ory
            r12.<init>()
            java.lang.String r15 = "direct_thread"
            r11 = r6
            r13 = r2
            X.FHB.A0D(r11, r12, r13, r14, r15, r16)
            goto L_0x048f
        L_0x052c:
            java.lang.String r13 = r12.getHost()
            java.lang.String r6 = "comments"
            boolean r6 = r6.equals(r13)
            if (r6 == 0) goto L_0x0581
            if (r7 == 0) goto L_0x0581
            java.lang.String r6 = "comment_id"
            java.lang.String r8 = r12.getQueryParameter(r6)
            java.lang.String r6 = "media_type"
            java.lang.String r12 = r12.getQueryParameter(r6)
            java.lang.String r6 = "clips"
            boolean r6 = r6.equals(r12)
            if (r6 == 0) goto L_0x057d
            if (r44 == 0) goto L_0x057d
            X.7Wt r6 = r1.A0B
            boolean r34 = X.C66580MXl.A1X(r2, r3)
            java.lang.Boolean r27 = java.lang.Boolean.valueOf(r11)
            r21 = r6
            r22 = r23
            r23 = r4
            r24 = r4
            r25 = r42
            r28 = r27
            r29 = r7
            r30 = r4
            r31 = r8
            r32 = r4
            r21.CpS(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
        L_0x0571:
            X.3sy r2 = r20.B8S()
            X.0qQ.A07(r2)
            r1.A06(r2, r0, r7, r3)
            goto L_0x048f
        L_0x057d:
            r1.A07(r7, r8)
            goto L_0x0571
        L_0x0581:
            boolean r2 = r1.A08(r12, r8)
            if (r2 != 0) goto L_0x048f
            boolean r2 = X.OXO.A02(r12)
            if (r2 == 0) goto L_0x05a7
            java.lang.String r7 = "s"
            java.lang.String r6 = "channel_link_xma"
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r7, r6)
            java.util.List r2 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r2 = X.OXO.A01(r0, r2)
            X.7VL r1 = r1.A09
            java.lang.String r0 = "xma_cta"
            r1.A00(r2, r0, r3, r4)
            goto L_0x048f
        L_0x05a7:
            java.lang.String r2 = r20.C6C()
            java.lang.String r2 = A01(r0, r2)
            X.7VL r1 = r1.A09
            java.lang.String r0 = "xma_cta"
            r1.A00(r2, r0, r3, r4)
            goto L_0x048f
        L_0x05b8:
            r32 = r4
            goto L_0x0463
        L_0x05bc:
            java.lang.String r0 = "Null or empty url on WEB_URL CTA"
            goto L_0x013d
        L_0x05c0:
            java.lang.String r1 = "booking_ig_view_calendar"
        L_0x05c2:
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x013b
            X.OYe r3 = new X.OYe
            r1 = r39
            r3.<init>(r6, r1, r2)
            java.util.List r2 = r20.C6O()
            if (r51 != 0) goto L_0x05db
            java.lang.String r14 = "AppointmentBookingXMACtaHandler"
            java.lang.String r0 = "url is null or empty"
            goto L_0x013d
        L_0x05db:
            switch(r15) {
                case -1524976429: goto L_0x070f;
                case -1283937730: goto L_0x06f0;
                case -120225331: goto L_0x06c8;
                case 735972178: goto L_0x06ab;
                case 1432172107: goto L_0x068b;
                case 1477503468: goto L_0x066a;
                case 1714077153: goto L_0x064a;
                case 1765252812: goto L_0x05ff;
                case 2133108061: goto L_0x05df;
                default: goto L_0x05de;
            }
        L_0x05de:
            return
        L_0x05df:
            java.lang.String r1 = "booking_ig_view_calendar"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r13 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r14 = r3.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            X.0iw r15 = r3.A01
            java.lang.String r1 = X.C71008OYe.A00(r3, r2)
            java.lang.String r2 = r4.A06
            java.lang.String r20 = X.C71008OYe.A01(r0)
            java.lang.String r17 = "com.bloks.www.services.ig.appointment.calendar"
            java.lang.String r21 = "merchant_view_calendar_xma_cta"
            goto L_0x06e6
        L_0x05ff:
            java.lang.String r1 = "booking_ig_business_accept_appointment"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            androidx.fragment.app.FragmentActivity r5 = r3.A00
            com.instagram.common.session.UserSession r6 = r3.A02
            X.0iw r4 = r3.A01
            java.lang.String r3 = X.C71008OYe.A00(r3, r2)
            java.lang.String r2 = r6.A06
            java.lang.String r1 = X.C71008OYe.A01(r0)
            java.lang.String r0 = "com.bloks.www.services.ig.customer.request_appointment_accept.async"
            java.lang.String r8 = "merchant_confirm_appointment_xma_cta"
            X.FBO r7 = new X.FBO
            r7.<init>(r0)
            java.lang.String r0 = "ig_buyer_igid"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r3)
            java.lang.String r0 = "ig_merchant_igid"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            if (r1 != 0) goto L_0x0630
            r1 = r22
        L_0x0630:
            java.lang.String r0 = "appointment_id"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "referrer_ui_component"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r8, r3, r2, r1)
            java.util.HashMap r0 = X.0Yt.A02(r0)
            r7.A04 = r0
            X.2nI r0 = X.C229382nI.A04(r5, r4, r6)
            r7.A01(r5, r0)
            return
        L_0x064a:
            java.lang.String r1 = "booking_ig_user_view_details"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r4 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r5 = r3.A00
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0iw r6 = r3.A01
            java.lang.String r9 = r7.A06
            java.lang.String r10 = X.C71008OYe.A00(r3, r2)
            java.lang.String r11 = X.C71008OYe.A01(r0)
            java.lang.String r8 = "com.bloks.www.services.ig.appointment.edit.contact.details"
            java.lang.String r12 = "customer_view_details_xma"
            goto L_0x072d
        L_0x066a:
            java.lang.String r1 = "booking_ig_business_view_appointment_details"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r13 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r14 = r3.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            X.0iw r15 = r3.A01
            java.lang.String r1 = X.C71008OYe.A00(r3, r2)
            java.lang.String r2 = r4.A06
            java.lang.String r20 = X.C71008OYe.A01(r0)
            java.lang.String r17 = "com.bloks.www.services.ig.appointment.booking"
            java.lang.String r21 = "merchant_view_details_xma"
            java.lang.String r22 = "IG_APPOINTMENT_BUSINESS_EDIT_BOOKING_SCREEN_ID"
            goto L_0x06e6
        L_0x068b:
            java.lang.String r1 = "booking_ig_user_add_details"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r4 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r5 = r3.A00
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0iw r6 = r3.A01
            java.lang.String r9 = r7.A06
            java.lang.String r10 = X.C71008OYe.A00(r3, r2)
            java.lang.String r11 = X.C71008OYe.A01(r0)
            java.lang.String r8 = "com.bloks.www.services.ig.appointment.edit.contact.details"
            java.lang.String r12 = "customer_add_contact_xma"
            goto L_0x072d
        L_0x06ab:
            java.lang.String r0 = "booking_ig_business_view_create_appointment"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0140
            X.OZW r13 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r14 = r3.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            X.0iw r15 = r3.A01
            java.lang.String r1 = X.C71008OYe.A00(r3, r2)
            java.lang.String r2 = r4.A06
            r20 = 0
            java.lang.String r17 = "com.bloks.www.services.ig.appointment.booking"
            java.lang.String r21 = "merchant_cancelled_xma"
            goto L_0x06e4
        L_0x06c8:
            java.lang.String r0 = "booking_ig_customer_view_request_another_time"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0140
            X.OZW r13 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r14 = r3.A00
            com.instagram.common.session.UserSession r4 = r3.A02
            X.0iw r15 = r3.A01
            java.lang.String r1 = r4.A06
            java.lang.String r2 = X.C71008OYe.A00(r3, r2)
            r20 = 0
            java.lang.String r17 = "com.bloks.www.services.ig.appointment.customer"
            java.lang.String r21 = "customer_cancelled_xma"
        L_0x06e4:
            java.lang.String r22 = "IG_APPOINTMENT_BOOKING_START_SCREEN_ID"
        L_0x06e6:
            r18 = r1
            r19 = r2
            r16 = r4
            r13.A02(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x06f0:
            java.lang.String r1 = "booking_ig_business_view_details_appointment_cancelled"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r4 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r5 = r3.A00
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0iw r6 = r3.A01
            java.lang.String r9 = X.C71008OYe.A00(r3, r2)
            java.lang.String r10 = r7.A06
            java.lang.String r11 = X.C71008OYe.A01(r0)
            java.lang.String r8 = "com.bloks.www.services.ig.appointment.cancellation.details"
            java.lang.String r12 = "merchant_cancelled_xma"
            goto L_0x072d
        L_0x070f:
            java.lang.String r1 = "booking_ig_user_view_details_appointment_cancelled"
            boolean r1 = r8.equals(r1)
            if (r1 == 0) goto L_0x0140
            X.OZW r4 = X.OZW.A00
            androidx.fragment.app.FragmentActivity r5 = r3.A00
            com.instagram.common.session.UserSession r7 = r3.A02
            X.0iw r6 = r3.A01
            java.lang.String r9 = r7.A06
            java.lang.String r10 = X.C71008OYe.A00(r3, r2)
            java.lang.String r11 = X.C71008OYe.A01(r0)
            java.lang.String r8 = "com.bloks.www.services.ig.appointment.cancellation.details"
            java.lang.String r12 = "customer_cancelled_xma"
        L_0x072d:
            r4.A01(r5, r6, r7, r8, r9, r10, r11, r12)
            return
        L_0x0731:
            r37 = 0
            goto L_0x007a
        L_0x0735:
            java.lang.String r28 = "xma"
            goto L_0x0054
        L_0x0739:
            java.lang.String r1 = "ig_post_id"
            java.util.HashMap r1 = X.DbY.A0m(r1, r0)
            java.lang.String r0 = "com.bloks.www.bio.product.details.variants.page.controller"
            goto L_0x075e
        L_0x0742:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0747:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x074c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0751:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0756:
            java.lang.String r1 = "action_url"
            java.util.HashMap r1 = X.DbY.A0m(r1, r0)
            java.lang.String r0 = "com.bloks.www.bmc.base.xma.cta.controller"
        L_0x075e:
            X.DiU r3 = X.C46649DiU.A04(r0, r1)
            X.F1e r0 = new X.F1e
            r0.<init>(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            com.instagram.bloks.hosting.IgBloksScreenConfig r1 = r0.A00
            r1.A0P = r2
            java.lang.String r0 = r39.getModuleName()
            r1.A0R = r0
            r0 = 32
            r1.A00 = r0
            r1.A0P = r2
            r3.A0D(r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P9R.CJS(android.graphics.RectF, X.2FW, com.instagram.model.direct.messageid.DirectMessageIdentifier, com.instagram.ui.widget.gradientspinner.GradientSpinner, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map):void");
    }
}
