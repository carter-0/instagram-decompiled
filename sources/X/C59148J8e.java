package X;

import android.os.Handler;
import androidx.compose.ui.Modifier;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.ExecutionLogger;
import com.facebook.msys.mci.SessionedNotificationCenter;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.J8e  reason: case insensitive filesystem */
public final class C59148J8e extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59148J8e(Object obj, Object obj2, String str, String str2, String str3, int i) {
        super(2);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A01 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Object obj3 = obj2;
        Object obj4 = obj;
        if (this.A00 != 0) {
            C286575Wy r0 = (C286575Wy) obj4;
            if (C51968G9o.A0B(obj3) != 2 || !r0.Bwn()) {
                if (0fL.A02()) {
                    0fL.A01(-1787852380, "instagram.features.clips.spins.feedback.ui.ClipsSpinsReplyBottomSheetHeader.<anonymous> (ClipsSpinsReplyBottomSheetHeader.kt:33)");
                }
                C285245Qk r21 = Modifier.A00;
                Modifier A0T = C51966G9m.A0T(r21);
                Modifier A09 = C287205Zk.A09(C51967G9n.A0G(A0T, 10.0f), 54.0f);
                C287245Zp r11 = C287215Zl.A04;
                C53371Gmv gmv = (C53371Gmv) this.A02;
                C62320sa r20 = (C62320sa) this.A01;
                String str = this.A04;
                String str2 = this.A03;
                String str3 = this.A05;
                C287295Zu r10 = C287275Zs.A01;
                AnonymousClass5RD A022 = C287395a4.A02(r10, r0, r11, 48);
                int A002 = C287425a7.A00(r0);
                C286565Wx r2 = (C286565Wx) r0;
                AnonymousClass5RM A042 = C286565Wx.A04(r2);
                Modifier A012 = C287435a8.A01(r0, A09);
                C62320sa r9 = C287485aD.A00;
                C51973G9u.A0z(r0, r2, r9);
                0sL r8 = C287485aD.A03;
                0sL A0w = C51969G9p.A0w(r0, A022, A042, r8);
                0sL r7 = C287485aD.A02;
                if (r2.A0K || !C51972G9s.A1Q(r0, A002)) {
                    C51971G9r.A13(r0, r7, A002);
                }
                0sL A1K = C51966G9m.A1K(r0, A012);
                AnonymousClass6FX r5 = AnonymousClass6FX.A00;
                GRY.A03(r0, 1zC.A00(r0, DbS.A0V(gmv.A01)), C57117IPg.A00);
                Modifier A092 = C287195Zj.A09(r5.A00(r21), 12.0f, 8.0f);
                AnonymousClass5RD A0Z = C51969G9p.A0Z(r0, 0);
                int A003 = C287425a7.A00(r0);
                AnonymousClass5RM A043 = C286565Wx.A04(r2);
                Modifier A013 = C287435a8.A01(r0, A092);
                C51973G9u.A0z(r0, r2, r9);
                C287595aO.A00(r0, A0Z, r8);
                if (C51965G9l.A1Y(r0, r2, A043, A0w) || !C51972G9s.A1Q(r0, A003)) {
                    C51971G9r.A13(r0, r7, A003);
                }
                C287595aO.A00(r0, A013, A1K);
                Modifier A0B = C287195Zj.A0B(A0T, 0.0f, 0.0f, 0.0f, 8.0f);
                AnonymousClass5RD A023 = C287395a4.A02(r10, r0, r11, 54);
                int A004 = C287425a7.A00(r0);
                AnonymousClass5RM A044 = C286565Wx.A04(r2);
                Modifier A014 = C287435a8.A01(r0, A0B);
                C51973G9u.A0z(r0, r2, r9);
                C287595aO.A00(r0, A023, r8);
                if (C51965G9l.A1Y(r0, r2, A044, A0w) || !C51972G9s.A1Q(r0, A004)) {
                    C51971G9r.A13(r0, r7, A004);
                }
                C287595aO.A00(r0, A014, A1K);
                AnonymousClass5ZZ.A0k(r0, C51966G9m.A0h(r0), str2, 1, 390, 11262, 0);
                r0.ExS(1007813829);
                if (str3 != null) {
                    long A0M = C51966G9m.A0M(r0);
                    AnonymousClass5Z4 A0c = C51966G9m.A0c(r0);
                    AnonymousClass5ZZ.A0L(r0, C287195Zj.A0B(r21, 4.0f, 0.0f, 0.0f, 0.0f), A0c, "•", 54, A0M);
                    long A0M2 = C51966G9m.A0M(r0);
                    C286575Wy r23 = r0;
                    AnonymousClass5ZZ.A0D(r23, C287195Zj.A0B(r21, 4.0f, 0.0f, 0.0f, 0.0f), C51966G9m.A0c(r0), str3, 1, 48, 390, 11256, A0M2);
                }
                C286565Wx.A0L(r2, false);
                r0.ASN();
                C286575Wy r4 = r0;
                AnonymousClass5ZZ.A0k(r4, C51966G9m.A0c(r0), str, 2, 390, 11258, C51966G9m.A0M(r0));
                r0.ASN();
                r0.ExS(1686866360);
                if (!gmv.A05) {
                    C55251Heg.A00(r0, r20, 0, gmv.A06);
                }
                if (C51971G9r.A1S(r0, r2, false)) {
                    0fL.A00(-834595904);
                }
            } else {
                r0.Evl();
            }
        } else {
            QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) obj4;
            C70571OBt oBt = (C70571OBt) obj3;
            boolean A1U = AnonymousClass7TF.A1U(0, quickPerformanceLogger, oBt);
            C66957Mfq mfq = (C66957Mfq) this.A02;
            C71068Oan oan = new C71068Oan(quickPerformanceLogger, oBt, this.A03, this.A04, this.A05, (HashMap) this.A01);
            mfq.A01 = oan;
            C57705If8 if8 = new C57705If8(mfq);
            C70571OBt oBt2 = oan.A0C;
            String str4 = oan.A0F;
            UserSession userSession = oBt2.A01;
            if (AnonymousClass45R.A00(userSession) || (!AnonymousClass7TE.A1a(2HM.A00(userSession).A1C.get()) && !str4.equals(AnonymousClass000.A00(3823)))) {
                if8.run();
            } else {
                oan.A05 = if8;
                QuickPerformanceLogger quickPerformanceLogger2 = oan.A0B;
                String str5 = oan.A0D;
                quickPerformanceLogger2.markerStart(755177991, str5.hashCode(), false);
                ExecutionLogger.activeFlowMarkerStart(755177991);
                MarkerEditor withMarker = quickPerformanceLogger2.withMarker(755177991);
                withMarker.setSurviveUserSwitch(A1U);
                withMarker.markerEditingCompleted();
                C71068Oan.A00(oan, (Boolean) null, (Integer) null, "SyncBatchId", oan.A0E);
                C71068Oan.A00(oan, (Boolean) null, (Integer) null, C66579MXk.A00(620), str4);
                C71068Oan.A00(oan, Boolean.valueOf(A1U), (Integer) null, "IsPlatform", (String) null);
                long A0R = AnonymousClass7TE.A0R(2HM.A00(userSession).A1D.A00());
                if (A0R > 0) {
                    Handler handler = oan.A01;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages((Object) null);
                    }
                    Handler A0D = AnonymousClass7TF.A0D();
                    oan.A01 = A0D;
                    A0D.postDelayed(new PUT(oan), 1000 * A0R);
                }
                AccountSession A024 = C300345wy.A02(userSession, false);
                if (A024 != null) {
                    SessionedNotificationCenter sessionedNotificationCenter = A024.getSessionedNotificationCenter();
                    0qQ.A07(sessionedNotificationCenter);
                    sessionedNotificationCenter.addObserver(oan.A0A, AnonymousClass000.A00(4371), A1U ? 1 : 0, (AnonymousClass2Lq) null);
                    AccountSession A025 = C300345wy.A02(userSession, false);
                    if (A025 != null) {
                        SessionedNotificationCenter sessionedNotificationCenter2 = A025.getSessionedNotificationCenter();
                        0qQ.A07(sessionedNotificationCenter2);
                        sessionedNotificationCenter2.addObserver(oan.A09, C66579MXk.A00(584), A1U, (AnonymousClass2Lq) null);
                        0qQ.A0C(oBt2, C66579MXk.A00(993));
                        TYA tya = new TYA(27, (Object) oan, (Object) oBt2);
                        17k.A0F(0qQ.A0K(userSession.A06, str5));
                        tya.invoke(OVM.A05.A00(userSession).A02.A01);
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        return C60340gF.A00;
    }
}
