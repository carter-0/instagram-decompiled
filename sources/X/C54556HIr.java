package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.HIr  reason: case insensitive filesystem */
public final class C54556HIr extends C56604I4d {
    public C54024Gy9 A00;
    public C52972GgP A01;
    public C52965GgI A02;
    public C53036GhS A03;
    public Ho1 A04;
    public C262204Co A05;
    public C262204Co A06;
    public final int A07;
    public final C59657JRz A08;
    public final C56564I1s A09;
    public final I44 A0A;
    public final I25 A0B;
    public final C55546HjS A0C;
    public final C56150Htc A0D;
    public final C56145HtX A0E;
    public final Integer A0F;
    public final 0sP A0G;
    public final 0sP A0H;
    public final 0sP A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final 0b6 A0L;

    /* JADX WARNING: type inference failed for: r2v11, types: [X.JRz, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x003a, code lost:
        if (X.C250563lf.A0B("IMPLEMENTATION").A03 != false) goto L_0x003c;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C54556HIr(android.content.Context r23, com.meta.foa.session.FoaUserSession r24, X.C56150Htc r25, X.0sP r26, X.0sP r27, X.0sP r28) {
        /*
            r22 = this;
            r4 = r23
            r1 = r24
            r0 = r22
            r0.<init>(r4, r1)
            r5 = r25
            r0.A0D = r5
            r2 = r26
            r0.A0I = r2
            r2 = r27
            r0.A0H = r2
            r2 = r28
            r0.A0G = r2
            int r6 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            r2 = 48
            if (r6 > r3) goto L_0x0023
            r2 = 16
        L_0x0023:
            r0.A07 = r2
            java.lang.String r3 = "IMPLEMENTATION"
            X.HtH r2 = X.C250563lf.A0B(r3)
            X.I1s r2 = r2.A00
            r0.A09 = r2
            boolean r2 = r5.A0Q
            if (r2 != 0) goto L_0x003c
            X.HtH r2 = X.C250563lf.A0B(r3)
            boolean r3 = r2.A03
            r2 = 0
            if (r3 == 0) goto L_0x003d
        L_0x003c:
            r2 = 1
        L_0x003d:
            r0.A0K = r2
            r3 = 0
            X.I44 r2 = new X.I44
            r2.<init>(r1, r5)
            r0.A0A = r2
            X.I25 r2 = new X.I25
            r2.<init>(r5)
            r0.A0B = r2
            X.Icj r2 = new X.Icj
            r2.<init>()
            r0.A08 = r2
            boolean r2 = r5.A0F
            if (r2 == 0) goto L_0x00ad
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x005b:
            r0.A0F = r10
            X.HjS r2 = new X.HjS
            r2.<init>()
            r0.A0C = r2
            X.0b6 r2 = X.0b6.A00()
            X.0qQ.A07(r2)
            r0.A0L = r2
            r2 = 2131966333(0x7f13397d, float:1.9569501E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r4, r2)
            java.lang.Integer r9 = X.AnonymousClass05K.A05
            long r11 = X.C51970G9q.A0J()
            r13 = 1
            java.lang.String r20 = "Close Bottom Sheet"
            X.HNN r15 = X.HNN.A0G
            X.HNO r17 = X.HNO.A0W
            java.lang.Integer r19 = X.AnonymousClass05K.A00
            X.J5X r21 = X.J5X.A00
            X.I1u r6 = new X.I1u
            r14 = r6
            r16 = r3
            r18 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r14 = 0
            X.HtX r2 = new X.HtX
            r4 = r3
            r5 = r3
            r8 = r3
            r15 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r0.A0E = r2
            com.instagram.common.session.UserSession r4 = X.C56316HwT.A00(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36328998053691093(0x81110800093ed5, double:3.037942882063192E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            r0.A0J = r1
            return
        L_0x00ad:
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54556HIr.<init>(android.content.Context, com.meta.foa.session.FoaUserSession, X.Htc, X.0sP, X.0sP, X.0sP):void");
    }

    public static final String A00(C54556HIr hIr, boolean z) {
        Context context;
        int i;
        if (z) {
            context = hIr.A00;
            i = 2131966327;
        } else {
            C56150Htc htc = hIr.A0D;
            Integer num = htc.A06;
            if (num == AnonymousClass05K.A00) {
                context = hIr.A00;
                i = 2131966311;
            } else {
                Integer num2 = htc.A08;
                Integer num3 = AnonymousClass05K.A01;
                if (num2 == num3 || num == AnonymousClass05K.A0C) {
                    context = hIr.A00;
                    i = 2131966328;
                } else if (num == num3) {
                    context = hIr.A00;
                    i = 2131966317;
                } else {
                    throw AnonymousClass7TE.A0w("Unexpected action button");
                }
            }
        }
        return AnonymousClass7TE.A16(context, i);
    }

    public static final void A01(C54556HIr hIr) {
        Integer num;
        I25 i25 = hIr.A0B;
        QuickPerformanceLogger quickPerformanceLogger = i25.A00;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerStart(325715839);
        }
        i25.A05("query_begin");
        C56150Htc htc = i25.A01;
        i25.A08(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, htc.A02.A00);
        i25.A08("surface_session_id", htc.A0B);
        i25.A08("bottom_sheet_session_id", htc.A0A);
        C52972GgP ggP = hIr.A01;
        if (ggP == null) {
            C51965G9l.A15();
            throw AnonymousClass00P.createAndThrow();
        }
        A04(hIr, ggP.A01);
        A03(hIr);
        if (hIr.A0I()) {
            num = AnonymousClass05K.A01;
        } else {
            num = null;
        }
        I4X A002 = I4X.A00(C46626Di6.FULL_SHEET, hIr.A0F, num, C58677Ivm.A00(hIr, 27), hIr.A07);
        if (hIr.A0I()) {
            A07(hIr, new C58103ImP(hIr, A002, (AnonymousClass4D7) null, 22));
        } else {
            hIr.A0F(A002, "ImagineCreationFlow", new C58141In7(hIr, 23));
        }
        C55546HjS hjS = hIr.A0C;
        HIK hik = HIK.A00;
        0qQ.A0B(hik, 0);
        if (!hik.equals(HIL.A00)) {
            hjS.A00.addLast(hik);
        }
    }

    public static final void A02(C54556HIr hIr) {
        C62320sa A012;
        if (hIr.A0K) {
            hIr.A0H(J5B.A00);
            return;
        }
        J5C j5c = J5C.A00;
        C56140HtS htS = C56604I4d.A0A(hIr).A00;
        if (htS != null) {
            01W r1 = htS.A04;
            if (r1.isEmpty() || r1.size() < 2) {
                A012 = C58708IwH.A01(htS, 10);
            } else {
                A012 = new GL8(2, 41, htS, j5c);
            }
            htS.A01(A012);
        }
    }

    public static final void A03(C54556HIr hIr) {
        if (hIr.A00 == null) {
            0QS r1 = new 0QS(new C59900bo[]{new C71780Oqg(new C58141In7(hIr, 24))});
            hIr.A00 = r1;
            0b6.A02(hIr.A00, r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        if ((r2 instanceof X.HIA) != false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        if ((r4.A0H.A0R() instanceof X.HI9) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A04(X.C54556HIr r16, X.HQ2 r17) {
        /*
            r4 = r17
            r9 = 0
            r1 = 0
            r0 = r16
            java.lang.String r12 = A00(r0, r1)
            X.HjS r1 = r0.A0C
            X.01W r1 = r1.A00
            java.lang.Object r1 = r1.A0R()
            boolean r1 = r1 instanceof X.HIK
            if (r1 == 0) goto L_0x008f
            X.GgP r2 = r0.A01
            java.lang.String r3 = "viewModel"
            if (r2 == 0) goto L_0x00db
            boolean r1 = r2.A0R
            if (r1 == 0) goto L_0x00af
            com.meta.metaai.imagine.creation.impl.data.ImagineGenerationImageRepository r1 = r2.A0E
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x00af
            boolean r1 = r4 instanceof X.HI8
            if (r1 == 0) goto L_0x00af
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            android.content.Context r2 = r0.A00
            r1 = 2131966335(0x7f13397f, float:1.9569505E38)
            java.lang.String r11 = X.AnonymousClass7TE.A16(r2, r1)
            X.HNN r6 = X.HNN.A0X
            r1 = 35
            X.JFy r12 = X.C59346JFy.A00(r0, r1)
            r13 = 1
            X.HNO r7 = X.HNO.A0W
            X.HNO r8 = X.HNO.A0O
            X.HtV r5 = new X.HtV
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0047:
            X.GgP r4 = r0.A01
            if (r4 == 0) goto L_0x00db
            X.HQ2 r2 = r4.A01
            boolean r1 = r2 instanceof X.HID
            if (r1 != 0) goto L_0x0056
            boolean r1 = r2 instanceof X.HIA
            r3 = 0
            if (r1 == 0) goto L_0x0057
        L_0x0056:
            r3 = 1
        L_0x0057:
            boolean r1 = r2 instanceof X.HI9
            if (r1 == 0) goto L_0x0066
            X.01W r1 = r4.A0H
            java.lang.Object r1 = r1.A0R()
            boolean r1 = r1 instanceof X.HI9
            r2 = 1
            if (r1 == 0) goto L_0x0067
        L_0x0066:
            r2 = 0
        L_0x0067:
            X.HQ2 r1 = r4.A01
            boolean r1 = r1 instanceof X.HIC
            if (r3 != 0) goto L_0x0090
            if (r2 != 0) goto L_0x0090
            if (r1 != 0) goto L_0x0090
            r6 = 0
        L_0x0072:
            X.HtX r1 = r0.A0E
            java.lang.CharSequence r7 = r1.A06
            java.lang.Integer r9 = r1.A08
            long r11 = r1.A00
            boolean r13 = r1.A0B
            r14 = 1
            X.2WX r4 = r1.A02
            android.graphics.drawable.Drawable r3 = r1.A01
            java.lang.Integer r10 = r1.A07
            java.lang.CharSequence r8 = r1.A05
            boolean r15 = r1.A0A
            X.HtX r2 = new X.HtX
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15)
            r0.A0G(r2)
        L_0x008f:
            return
        L_0x0090:
            android.content.Context r2 = r0.A00
            r1 = 2131966346(0x7f13398a, float:1.9569528E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r2, r1)
            X.HNN r11 = X.HNN.A0E
            r1 = 44
            X.J6g r17 = X.C59098J6g.A01(r0, r1)
            X.HNN r12 = X.HNN.A0F
            X.HNO r13 = X.HNO.A0W
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.I1u r6 = new X.I1u
            r10 = r6
            r14 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0072
        L_0x00af:
            boolean r1 = r0.A0J
            if (r1 == 0) goto L_0x00d8
            boolean r1 = r4 instanceof X.HI9
            if (r1 == 0) goto L_0x00d8
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.HI9 r4 = (X.HI9) r4
            boolean r2 = r4.A03
            r1 = 36
            X.JFy r15 = X.C59346JFy.A00(r0, r1)
            if (r2 == 0) goto L_0x00d4
            X.HNO r10 = X.HNO.A0W
            X.HNO r11 = X.HNO.A0O
        L_0x00c9:
            X.HtV r5 = new X.HtV
            r8 = r5
            r14 = r12
            r16 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0047
        L_0x00d4:
            X.HNO r10 = X.HNO.A0B
            r11 = r10
            goto L_0x00c9
        L_0x00d8:
            r5 = 0
            goto L_0x0047
        L_0x00db:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54556HIr.A04(X.HIr, X.HQ2):void");
    }

    public static final void A06(C54556HIr hIr, String str, String str2, boolean z, boolean z2, boolean z3) {
        Integer num;
        C54678HOj hOj;
        C54556HIr hIr2 = hIr;
        if (hIr2.A0I()) {
            C56150Htc htc = hIr2.A0D;
            C56092Hsf hsf = htc.A05;
            String str3 = hsf.A01;
            boolean z4 = z3;
            if (z3) {
                num = AnonymousClass05K.A0N;
            } else if (z2) {
                num = AnonymousClass05K.A0C;
            } else {
                num = AnonymousClass05K.A00;
            }
            I44 i44 = hIr2.A0A;
            i44.A03.add(C51972G9s.A0n());
            C56507Hzd hzd = i44.A02;
            XSJ A002 = XXv.A00(i44.A01.A02);
            C54673HOe hOe = C54673HOe.MEMU_ONBOARDING;
            0qQ.A0B(A002, 0);
            C56507Hzd.A00(hOe, A002, hzd, "open_intent", (String) null);
            Context context = hIr2.A00;
            FoaUserSession foaUserSession = hIr2.A01;
            C69416Nky nky = htc.A02;
            int ordinal = nky.ordinal();
            if (ordinal == 7) {
                hOj = C54678HOj.MEMU_IN_FEED_MUSTACHE_TEXT;
            } else if (ordinal != 8) {
                hOj = C54678HOj.META_AI_INTENTS;
            } else {
                hOj = C54678HOj.MEMU_IN_FEED_STORY_MIMICRY;
            }
            String str4 = str3;
            if (str3 == null) {
                str4 = "";
            }
            String str5 = hsf.A00;
            0eP r0 = null;
            if (str3 != null) {
                r0 = AnonymousClass7TE.A1L("surface_session_id", str3);
            }
            boolean z5 = z;
            C54555HIq hIq = new C54555HIq(context, foaUserSession, new C56144HtW(hOj, XXv.A00(nky), num, str4, str5, (String) null, (String) null, 0Yt.A08(C51967G9n.A0s(new 0eP[]{null, r0})), htc.A0F, z4, z5), new C58773IxK(hIr2, str, str2, 4, z5));
            C56140HtS A003 = C56536I0l.A00(C56604I4d.A0A(hIr2));
            C56536I0l A0A2 = C56604I4d.A0A(hIq);
            A0A2.A01 = "ImagineCreationFlow";
            A0A2.A00 = A003;
            A0A2.A05.invoke(A003.A03);
            hIq.A0J();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Icj, java.lang.Object] */
    public static final void A05(C54556HIr hIr, Integer num, String str) {
        Fragment A092;
        View view;
        if (hIr.A0I() && (A092 = C56604I4d.A09(hIr)) != null && (view = A092.mView) != null) {
            new Object().Etm((View) null, view, new C58738Iwl(str, num, 6));
        }
    }

    public static final void A07(C54556HIr hIr, 0sL r6) {
        if (hIr.A0I()) {
            AnonymousClass0xx A002 = AnonymousClass07a.A00(C56604I4d.A09(hIr));
            AnonymousClass4CZ r0 = AnonymousClass12W.A00;
            1Eo.A05(AnonymousClass12y.A00, new MGC((Object) r6, (AnonymousClass4D7) null, 38, 42), A002);
        }
    }

    public static final void A08(C54556HIr hIr, 0sL r3) {
        if (hIr.A0I()) {
            C51975G9x.A1E(r3, hIr, AnonymousClass07a.A00(C56604I4d.A09(hIr)), 40);
        }
    }
}
