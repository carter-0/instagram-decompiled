package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.direct.stella.StellaIpcDirectMessagingServiceClient;
import com.instagram.search.common.analytics.SearchContext;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class I72 {
    public static boolean A00;

    public static final void A02(DialogInterface.OnDismissListener onDismissListener, AnonymousClass4DH r7, UserSession userSession, 1Xj r9) {
        C358248ab A0U = DbW.A0U(r7);
        A0U.A09(2131972038);
        A0U.A08(2131972104);
        DialogInterface.OnDismissListener onDismissListener2 = onDismissListener;
        A0U.A0E(new I90(onDismissListener2, r7, userSession, r9, 5));
        DbX.A16(C56719I8z.A00(onDismissListener2, 28), A0U);
    }

    public static final void A07(AnonymousClass4DH r10, UserSession userSession, 1Xj r12, String str) {
        String str2;
        HashMap A1E;
        String A0d;
        if (!A00) {
            A00 = true;
            C229382nI A03 = C229382nI.A03(r10, userSession, (2el) null);
            boolean A5V = r12.A5V();
            boolean A4Z = r12.A4Z();
            if (A5V) {
                if (A4Z) {
                    if (182.A06(0Tu.A05, userSession, 36313969962518865L)) {
                        str2 = AnonymousClass000.A00(1195);
                    } else {
                        str2 = "com.instagram.insights.media.posts.surface";
                    }
                } else if (182.A06(0Tu.A06, userSession, 36313372962064291L)) {
                    str2 = AnonymousClass000.A00(1194);
                } else {
                    str2 = "com.instagram.insights.media.posts.bottom_sheet.action";
                }
            } else if (A4Z) {
                if (182.A06(0Tu.A05, userSession, 36313969962649939L)) {
                    str2 = AnonymousClass000.A00(1198);
                } else {
                    str2 = "com.instagram.insights.media.videos.surface";
                }
            } else if (182.A06(0Tu.A06, userSession, 36313372962391974L)) {
                str2 = AnonymousClass000.A00(1197);
            } else {
                str2 = "com.instagram.insights.media.videos.bottom_sheet.action";
            }
            String id = r12.getId();
            if (id != null) {
                Object obj = DbV.A18(id, "_").get(0);
                02m.A0p.markerStart(39130588);
                AnonymousClass7TF.A0D().postDelayed(new C57731IfY(userSession), StellaIpcDirectMessagingServiceClient.KEEP_CONNECTION_ALIVE_MS);
                if (r12.A4Z()) {
                    A00 = false;
                    A1E = AnonymousClass7TE.A1E();
                    A1E.put("target_id", obj);
                    if (str != null) {
                        A1E.put("origin", str);
                    }
                    boolean A06 = 182.A06(0Tu.A06, userSession, 36330058910089648L);
                    Resources A05 = DbV.A05(r10);
                    int i = 2131952241;
                    if (A06) {
                        i = 2131957496;
                    }
                    A0d = A05.getString(i);
                    0qQ.A0A(A0d);
                } else if ((!r12.A5V() || !182.A06(0Tu.A05, userSession, 36313372962064291L)) && (r12.A5V() || !182.A06(0Tu.A05, userSession, 36313372962391974L))) {
                    LinkedHashMap A1H = AnonymousClass7TE.A1H();
                    A1H.put("media_id", obj);
                    if (str != null) {
                        A1H.put("origin", str);
                    }
                    C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, userSession, str2, A1H);
                    A02.A00(new E86(r10, A03, 4));
                    1ES.A03(A02);
                    return;
                } else {
                    A00 = false;
                    A1E = AnonymousClass7TE.A1E();
                    A1E.put("target_id", obj);
                    A0d = AnonymousClass7TF.A0d(DbV.A05(r10), 2131976490);
                    if (r12.A5V()) {
                        A0d = DbV.A05(r10).getString(2131969625);
                    }
                }
                C309516Yo A0H = DbW.A0H(r10, userSession);
                C46649DiU A04 = C46649DiU.A04(str2, A1E);
                IgBloksScreenConfig A0N = DbS.A0N(userSession);
                A0N.A0U = A0d;
                A0H.A0B((Bundle) null, C49891FBs.A02(A0N, A04));
                A0H.A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A00(Context context, AnonymousClass0iw r5, UserSession userSession, 1Xj r7, C270194gL r8) {
        2FW r1;
        C49731F3w A07;
        if (r8 != null) {
            A07 = 1as.A04.A02.A07(r5, userSession, 2FW.A19);
            A07.A06(r8.getId());
            String id = r8.A03().getId();
            Bundle bundle = A07.A07;
            bundle.putString(AnonymousClass000.A00(920), id);
            String str = r8.A0e;
            str.getClass();
            bundle.putString(AnonymousClass000.A00(918), str);
            bundle.putString(AnonymousClass000.A00(2223), "v2v");
            bundle.putString(AnonymousClass000.A00(2222), "paperplane");
        } else {
            if (r7.A5V()) {
                r1 = 2FW.A1D;
            } else {
                r1 = 2FW.A0t;
            }
            A07 = 1as.A04.A02.A07(r5, userSession, r1);
            String id2 = r7.getId();
            if (id2 != null) {
                A07.A06(id2);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        DirectShareSheetFragment A002 = A07.A00();
        AnonymousClass37D A02 = AnonymousClass37D.A00.A02(context);
        if (A02 != null) {
            A02.A0J(A002);
        }
    }

    public static final void A01(Context context, UserSession userSession, 1Xj r19, AnonymousClass4DU r20, String str) {
        C243363Yl r1;
        C243363Yl r5;
        C243363Yl r0;
        String str2;
        UserSession userSession2 = userSession;
        1Xj r6 = r19;
        if (C51968G9o.A1X(userSession2, r6)) {
            r1 = C243363Yl.LIKED;
            r0 = r1;
            r5 = C243363Yl.NOT_LIKED;
        } else {
            r1 = C243363Yl.NOT_LIKED;
            r5 = C243363Yl.LIKED;
            r0 = r5;
        }
        C54994HaR.A00(userSession2, r1, r5, r6);
        Integer num = AnonymousClass05K.A0N;
        Integer A0j = C51967G9n.A0j();
        AnonymousClass4DU r2 = r20;
        C56622I4z.A03(context, r2, userSession2, (JPO) null, r5, r6, (SearchContext) null, num, (Integer) null, A0j, A0j, (Long) null, (String) null, (String) null, (Map) null, false, false);
        if (r5 == r0) {
            str2 = "like";
        } else {
            str2 = "unlike";
        }
        C254523sc A0c = C51967G9n.A0c(userSession2, r6, r2, str2);
        A0c.A2E = false;
        A0c.A6t = str;
        C233822wX.A0I(userSession2, A0c, r2, AnonymousClass05K.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        if (r6.A5Y() == false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(android.content.DialogInterface.OnDismissListener r3, X.AnonymousClass4DH r4, com.instagram.common.session.UserSession r5, X.1Xj r6, boolean r7) {
        /*
            if (r7 == 0) goto L_0x000e
            boolean r1 = r6.A5Y()
            r2 = 2131976471(0x7f136117, float:1.9590063E38)
            r0 = 2131976470(0x7f136116, float:1.9590061E38)
            if (r1 != 0) goto L_0x0014
        L_0x000e:
            r2 = 2131964019(0x7f133073, float:1.9564808E38)
            r0 = 2131964018(0x7f133072, float:1.9564806E38)
        L_0x0014:
            X.8ab r1 = X.DbW.A0U(r4)
            r1.A09(r2)
            r1.A08(r0)
            r0 = 2131964037(0x7f133085, float:1.9564844E38)
            r7 = 3
            X.I90 r2 = new X.I90
            r2.<init>((android.content.DialogInterface.OnDismissListener) r3, (X.AnonymousClass4DH) r4, (com.instagram.common.session.UserSession) r5, (X.1Xj) r6, (int) r7)
            r1.A0K(r2, r0)
            r0 = 26
            X.I8z r0 = X.C56719I8z.A00(r3, r0)
            X.DbX.A16(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I72.A03(android.content.DialogInterface$OnDismissListener, X.4DH, com.instagram.common.session.UserSession, X.1Xj, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.07Z, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.AnonymousClass4DH r16, X.AnonymousClass0iw r17, com.instagram.common.session.UserSession r18, X.1Xj r19, java.lang.String r20, java.lang.String r21) {
        /*
            r10 = r18
            X.FYp r0 = X.C50334FYp.A00(r10)
            r1 = r16
            android.content.Context r5 = r1.requireContext()
            X.0gy r4 = X.AnonymousClass07i.A00(r1)
            androidx.fragment.app.FragmentActivity r7 = r1.requireActivity()
            X.0hq r8 = r1.mFragmentManager
            java.lang.String r18 = "copy_link"
            X.EQJ r6 = new X.EQJ
            r9 = r17
            r11 = r19
            r12 = r20
            r13 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = r9.getModuleName()
            r0 = 0
            X.1OC r0 = X.FGA.A00(r3, r11, r0, r2, r1)
            r0.A00 = r6
            X.1ES.A00(r5, r4, r0)
            java.lang.String r19 = X.DbT.A0x(r11)
            r14 = r9
            r15 = r10
            r16 = r12
            r17 = r13
            X.C22031Xty.A0G(r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I72.A05(X.4DH, X.0iw, com.instagram.common.session.UserSession, X.1Xj, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [X.07Z, androidx.fragment.app.Fragment, X.4DH] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass4DH r12, X.AnonymousClass0iw r13, com.instagram.common.session.UserSession r14, X.1Xj r15, java.lang.String r16, java.lang.String r17) {
        /*
            X.ITV r11 = new X.ITV
            r8 = r13
            r11.<init>(r13)
            r9 = r14
            X.FYp r0 = X.C50334FYp.A00(r14)
            r7 = r12
            android.content.Context r5 = r12.requireContext()
            X.0gy r4 = X.AnonymousClass07i.A00(r12)
            java.lang.String r14 = "system_share_sheet"
            X.ECD r6 = new X.ECD
            r10 = r15
            r12 = r16
            r13 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r3 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.String r1 = r8.getModuleName()
            r0 = 0
            X.1OC r0 = X.FGA.A00(r3, r15, r0, r2, r1)
            r0.A00 = r6
            X.1ES.A00(r5, r4, r0)
            java.lang.String r15 = X.DbT.A0x(r15)
            r10 = r8
            r11 = r9
            X.C22031Xty.A0G(r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I72.A06(X.4DH, X.0iw, com.instagram.common.session.UserSession, X.1Xj, java.lang.String, java.lang.String):void");
    }

    public static final void A04(FragmentActivity fragmentActivity, UserSession userSession, 1Xj r5, String str, String str2) {
        if (r5.A1Z() != C16616UyC.NOT_BOOSTED && r5.A1Z() != C16616UyC.UNAVAILABLE && r5.A1Z() != C16616UyC.UNKNOWN) {
            C358248ab A0X = DbS.A0X(fragmentActivity);
            A0X.A09(2131975818);
            A0X.A08(2131975819);
            A0X.A05();
            DbT.A1V(A0X);
        } else if (r5.A0C.getBoostedBySponsor() != null) {
            C49946FGa.A04(fragmentActivity, (DialogInterface.OnClickListener) null, userSession, AnonymousClass7TE.A16(fragmentActivity, 2131954741), AnonymousClass7TE.A16(fragmentActivity, 2131954742));
        } else {
            C309516Yo A0M = DbS.A0M(fragmentActivity, userSession);
            0qQ.A0A(1YO.A00);
            C61941KSq kSq = new C61941KSq();
            Bundle A0a = AnonymousClass7TE.A0a();
            if (str == null) {
                str = AnonymousClass7TG.A0j();
            }
            A0a.putString(AnonymousClass000.A00(1448), str);
            A0a.putString(AnonymousClass000.A00(1447), str2);
            DbW.A0y(A0a, kSq, A0M);
        }
    }
}
