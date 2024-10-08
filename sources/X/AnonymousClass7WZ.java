package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.google.common.collect.EvictingQueue;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.reels.ReelViewerConfig;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.7WZ  reason: invalid class name */
public final class AnonymousClass7WZ implements C332697Wa {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final C332237Ue A02;

    public final void CvY() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003a, code lost:
        if (X.182.A06(X.0Tu.A05, r6, 36321125378040961L) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D6Y(android.os.Bundle r28, X.C333197Ya r29) {
        /*
            r27 = this;
            r9 = 0
            r2 = r29
            X.0qQ.A0B(r2, r9)
            r0 = r27
            X.7Ue r1 = r0.A02
            X.4DH r8 = r1.A0E
            android.content.Context r12 = r8.requireContext()
            X.7Zg r7 = r2.A00
            X.OtJ r0 = r2.A01
            r1.A09 = r0
            com.instagram.common.session.UserSession r6 = r1.A0G
            X.7Tw r5 = r1.A0I
            X.7UW r10 = r5.A0C
            X.3t2 r4 = r2.A02
            r0 = 2
            X.0qQ.A0B(r10, r0)
            X.9HW r2 = X.AnonymousClass9HV.A00(r6)
            r0 = 59
            boolean r0 = r2.A00(r4, r0)
            if (r0 == 0) goto L_0x003c
            X.0Tu r0 = X.0Tu.A05
            r2 = 36321125378040961(0x8109df00002481, double:3.0329641702813283E-306)
            boolean r2 = X.182.A06(r0, r6, r2)
            r0 = 1
            if (r2 != 0) goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            r11 = 0
            if (r0 == 0) goto L_0x0058
            X.3t3 r2 = X.AnonymousClass6W3.A05(r4)
            boolean r0 = r2 instanceof X.C254763t0
            if (r0 == 0) goto L_0x0058
            X.3t0 r2 = (X.C254763t0) r2
            java.lang.String r0 = r2.A00
            if (r0 == 0) goto L_0x0058
            X.7AX r11 = new X.7AX
            r13 = r6
            r14 = r10
            r15 = r7
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16)
        L_0x0058:
            r1.A03 = r11
            X.7Yy r0 = r7.BCh()
            X.7Lz r2 = new X.7Lz
            r2.<init>(r0)
            X.MaJ r0 = new X.MaJ
            r0.<init>(r8, r6, r2)
            r1.A0A = r0
            r8.requireArguments()
            X.7M0 r11 = new X.7M0
            r11.<init>(r6, r7)
            androidx.fragment.app.FragmentActivity r13 = r8.requireActivity()
            android.content.Context r0 = r8.requireContext()
            android.content.Context r14 = r0.getApplicationContext()
            X.0qQ.A07(r14)
            X.7L4 r12 = r5.A04
            if (r12 == 0) goto L_0x02a4
            X.7Ty r2 = r5.A0O
            X.7Tn r3 = r1.A0H
            X.0sa r0 = r3.A0C
            X.7Um r10 = new X.7Um
            r10.<init>(r0)
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.7M1 r0 = new X.7M1
            r0.<init>(r7)
            X.9IV r15 = new X.9IV
            r15.<init>((X.AnonymousClass7M2) r0, (X.C332187Tz) r12)
            X.7M3 r0 = new X.7M3
            r0.<init>(r7, r10)
            X.9IV r10 = new X.9IV
            r10.<init>((X.AnonymousClass7M2) r0, (X.C332187Tz) r2)
            X.7M4 r0 = new X.7M4
            r16 = r0
            r17 = r13
            r18 = r14
            r19 = r8
            r20 = r6
            r21 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            X.9IV r2 = new X.9IV
            r2.<init>((X.AnonymousClass7M2) r0, (X.C332187Tz) r11)
            X.7M5 r0 = new X.7M5
            r0.<init>(r7)
            X.7M6 r12 = new X.7M6
            r18 = r6
            r19 = r7
            r20 = r0
            r16 = r10
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r1.A05 = r12
            X.7U1 r0 = r5.A0M
            X.7L2 r2 = r0.A04
            X.0qQ.A07(r2)
            X.7M7 r0 = new X.7M7
            r0.<init>(r2)
            r1.A07 = r0
            X.7S7 r2 = r7.C6l()
            boolean r0 = r2.CdE()
            if (r0 == 0) goto L_0x0112
            X.3tH r0 = r3.A07
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.CUO()
            if (r0 != 0) goto L_0x0112
            boolean r0 = r2.CVr()
            if (r0 != 0) goto L_0x0112
            java.util.List r3 = r2.C6O()
            androidx.fragment.app.FragmentActivity r2 = r8.requireActivity()
            X.75n r0 = new X.75n
            r0.<init>(r2, r6, r3)
            r1.A02 = r0
            r8.registerLifecycleListener(r0)
        L_0x0112:
            X.0eM r0 = r1.A0p
            java.lang.Object r5 = r0.getValue()
            X.7WK r5 = (X.AnonymousClass7WK) r5
            X.7M8 r0 = new X.7M8
            r0.<init>(r5, r4)
            r5.A01 = r0
            X.7M9 r0 = new X.7M9
            r0.<init>(r5)
            r5.A00 = r0
            com.instagram.common.session.UserSession r0 = r5.A05
            X.1Am r2 = X.1Al.A01(r0)
            X.1An r0 = X.1An.A3V
            X.0xa r2 = r2.A03(r0)
            r5.A02 = r2
            java.lang.String r3 = "sharedPreferences"
            X.0xZ r0 = r5.A01
            if (r0 != 0) goto L_0x0146
            java.lang.String r3 = "onChangeListener"
        L_0x013e:
            X.0qQ.A0F(r3)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0146:
            r2.EBr(r0)
            X.0xa r2 = r5.A02
            if (r2 == 0) goto L_0x013e
            X.0xZ r0 = r5.A00
            if (r0 != 0) goto L_0x0154
            java.lang.String r3 = "adsEventSharingPrefKeyChangeListener"
            goto L_0x013e
        L_0x0154:
            r2.EBr(r0)
            X.0eM r0 = r1.A0U
            java.lang.Object r0 = r0.getValue()
            X.7VS r0 = (X.AnonymousClass7VS) r0
            r0.maybeRedirectThread()
            X.0eM r0 = r1.A0c
            java.lang.Object r4 = r0.getValue()
            X.7Vy r4 = (X.C332677Vy) r4
            com.instagram.common.session.UserSession r8 = r4.A0J
            X.0eK r0 = r4.A0W
            java.lang.Object r2 = r0.get()
            X.0qQ.A07(r2)
            X.7Zg r2 = (X.C333517Zg) r2
            X.7MA r0 = new X.7MA
            r0.<init>(r8, r2)
            r4.A00 = r0
            X.4DH r0 = r4.A03
            android.content.Context r3 = r0.requireContext()
            X.7MG r2 = new X.7MG
            r2.<init>(r4)
            X.7Q8 r0 = new X.7Q8
            r0.<init>(r3, r8, r2)
            r4.A01 = r0
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r8)
            X.0Tu r7 = X.0Tu.A05
            r5 = 36316448161862021(0x81059e00311185, double:3.030006279936129E-306)
            boolean r0 = X.182.A06(r7, r8, r5)
            if (r0 == 0) goto L_0x01a8
            java.lang.Class<X.7MH> r2 = X.AnonymousClass7MH.class
            X.1wn r0 = r4.A06
            r3.A01(r0, r2)
        L_0x01a8:
            java.lang.Class<X.7MI> r2 = X.AnonymousClass7MI.class
            X.1wn r0 = r4.A0A
            r3.A01(r0, r2)
            java.lang.Class<X.7MJ> r2 = X.AnonymousClass7MJ.class
            X.1wn r0 = r4.A04
            r3.A01(r0, r2)
            X.1Av r0 = X.1Au.A00(r8)
            X.0xa r2 = r0.A01
            r0 = 1698(0x6a2, float:2.38E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r9)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01dc
            r5 = 36322809005222319(0x810b67000029af, double:3.0340289028902416E-306)
            boolean r0 = X.182.A06(r7, r8, r5)
            if (r0 == 0) goto L_0x01dc
            java.lang.Class<X.OsW> r2 = X.C71888OsW.class
            X.1wn r0 = r4.A09
            r3.A01(r0, r2)
        L_0x01dc:
            X.0xi r0 = X.0tS.A4E
            X.0tS r0 = r0.A00()
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x01ef
            java.lang.Class<X.OsV> r2 = X.C71887OsV.class
            X.1wn r0 = r4.A0G
            r3.A01(r0, r2)
        L_0x01ef:
            java.lang.Class<X.7MK> r2 = X.AnonymousClass7MK.class
            X.1wn r0 = r4.A0C
            r3.A01(r0, r2)
            java.lang.Class<X.7ML> r2 = X.AnonymousClass7ML.class
            X.1wn r0 = r4.A0E
            r3.A01(r0, r2)
            java.lang.Class<X.7MM> r2 = X.AnonymousClass7MM.class
            X.1wn r0 = r4.A08
            r3.A01(r0, r2)
            java.lang.Class<X.7MN> r2 = X.AnonymousClass7MN.class
            X.1wn r0 = r4.A0D
            r3.A01(r0, r2)
            java.lang.Class<X.7MO> r2 = X.AnonymousClass7MO.class
            X.1wn r0 = r4.A0H
            r3.A01(r0, r2)
            java.lang.Class<X.7MP> r2 = X.AnonymousClass7MP.class
            X.1wn r0 = r4.A05
            r3.A01(r0, r2)
            java.lang.Class<X.7MQ> r2 = X.AnonymousClass7MQ.class
            X.1wn r0 = r4.A07
            r3.A01(r0, r2)
            X.0eM r0 = r1.A0P
            java.lang.Object r6 = r0.getValue()
            X.7Vn r6 = (X.C332567Vn) r6
            X.0eK r0 = r6.A0A
            java.lang.Object r0 = r0.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r5 = r0.C6l()
            com.instagram.common.session.UserSession r4 = r6.A05
            java.lang.String r3 = r4.A06
            X.7SD r0 = r5.C6Q()
            int r2 = r0.A08
            X.3Te r0 = r5.BiC()
            boolean r0 = X.C329997La.A02(r0, r3, r2)
            if (r0 == 0) goto L_0x0264
            X.3t3 r0 = r5.CBU()
            boolean r0 = X.AnonymousClass7OI.A01(r4, r0)
            if (r0 == 0) goto L_0x0264
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r4)
            java.lang.Class<X.OsY> r2 = X.C71890OsY.class
            X.1wn r0 = r6.A03
            r3.A01(r0, r2)
            java.lang.Class<X.AY2> r2 = X.AY2.class
            X.1wn r0 = r6.A04
            r3.A01(r0, r2)
        L_0x0264:
            X.0eM r0 = r1.A0e
            java.lang.Object r4 = r0.getValue()
            X.7Vr r4 = (X.C332607Vr) r4
            com.instagram.common.session.UserSession r0 = r4.A03
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.7MR> r2 = X.AnonymousClass7MR.class
            X.1wn r0 = r4.A02
            r3.A01(r0, r2)
            X.0eM r0 = r1.A0g
            java.lang.Object r5 = r0.getValue()
            X.7VP r5 = (X.AnonymousClass7VP) r5
            X.7SE r7 = r5.A06
            X.0eM r0 = r5.A0A
            java.lang.Object r6 = r0.getValue()
            X.2qi r6 = (X.C231002qi) r6
            X.0qQ.A0B(r6, r9)
            com.instagram.quickpromotion.intf.QuickPromotionSlot r26 = com.instagram.quickpromotion.intf.QuickPromotionSlot.A0O
            X.1YN r21 = X.AnonymousClass2bO.A00()
            X.4DH r4 = r7.A00
            if (r4 != 0) goto L_0x029c
            java.lang.String r3 = "fragment"
            goto L_0x013e
        L_0x029c:
            X.0iw r3 = r7.A01
            if (r3 != 0) goto L_0x02a8
            java.lang.String r3 = "analyticsModule"
            goto L_0x013e
        L_0x02a4:
            java.lang.String r3 = "dmStatusProvider"
            goto L_0x013e
        L_0x02a8:
            com.instagram.common.session.UserSession r2 = r7.A07
            X.AnonymousClass2bO.A00()
            r8 = 0
            X.7MS r13 = new X.7MS
            r13.<init>(r7)
            X.7MT r0 = new X.7MT
            r0.<init>(r7)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r18 = r8
            r19 = r8
            r20 = r8
            r17 = r0
            X.2bW r25 = X.2bV.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r22 = r4
            r23 = r3
            r24 = r2
            X.2qi r0 = r21.A01(r22, r23, r24, r25, r26)
            r7.A03 = r0
            r7.A04 = r6
            X.2jd r2 = r5.A02
            X.0eM r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            X.2qT r0 = (X.C230882qT) r0
            r2.A0E(r0)
            X.7TD r0 = r5.A05
            X.4md r0 = r0.A00
            r0.registerLifecycleListenerSet(r2)
            X.0eM r0 = r1.A0f
            java.lang.Object r4 = r0.getValue()
            X.7V4 r4 = (X.AnonymousClass7V4) r4
            com.instagram.common.session.UserSession r3 = r4.A01
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.7MU> r1 = X.AnonymousClass7MU.class
            X.7V8 r0 = r4.A02
            r2.A01(r0, r1)
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.7MV> r1 = X.AnonymousClass7MV.class
            X.7V9 r0 = r4.A03
            r2.A01(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WZ.D6Y(android.os.Bundle, X.7Ya):void");
    }

    public final void D70(C333517Zg r14) {
        C74542Pwb pwb;
        Fragment fragment;
        0qQ.A0B(r14, 0);
        C332237Ue r2 = this.A02;
        C333457Za AkC = r14.AkC();
        UserSession userSession = r2.A0G;
        AnonymousClass7UC r3 = r2.A0I.A0J;
        C332067Tn r5 = r2.A0H;
        r2.A08 = new C330327Mi(userSession, r3, AkC, r5.A0H);
        AnonymousClass4DH r7 = r2.A0E;
        r2.A0B = new C330367Mm(r7.requireActivity(), userSession, new C330347Mk(r2), AnonymousClass3BQ.DIRECT);
        r2.A0C = new C330377Mn(r7.requireActivity(), r7, r5.A02, userSession, ReelViewerConfig.A00(), (String) r2.A0s.invoke(), r2.A0t);
        AnonymousClass4DH r1 = this.A00;
        r1.registerLifecycleListener(r2.A08);
        r1.registerLifecycleListener(r2.A0B);
        AnonymousClass7V0 r52 = (AnonymousClass7V0) r2.A0i.getValue();
        if (C330397Mp.A07(r52.A00) && (pwb = (C74542Pwb) r52.A08.getValue()) != null) {
            pwb.start();
            WeakReference weakReference = r52.A06;
            if (weakReference.get() != null && (fragment = (Fragment) weakReference.get()) != null) {
                AnonymousClass0xx A002 = C71772f0.A00(fragment.getLifecycle());
                AnonymousClass9K1 r22 = new AnonymousClass9K1((Object) pwb, (Object) r52, (AnonymousClass4D7) null, 1);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, r22, A002);
            }
        }
    }

    public final void D7F() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0108, code lost:
        if (X.182.A06(X.0Tu.A05, r1, 36320674406474511L) == false) goto L_0x010a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dys(android.view.View r26, androidx.recyclerview.widget.RecyclerView r27, X.C333517Zg r28, com.instagram.direct.messagethread.store.intf.MessageListLayoutManager r29) {
        /*
            r25 = this;
            r0 = 0
            r5 = r26
            X.0qQ.A0B(r5, r0)
            r0 = 1
            r2 = r27
            X.0qQ.A0B(r2, r0)
            r0 = 2
            r12 = r29
            X.0qQ.A0B(r12, r0)
            r3 = 3
            r14 = r28
            X.0qQ.A0B(r14, r3)
            r13 = r25
            X.7Ue r0 = r13.A02
            X.4DH r7 = r0.A0E
            android.content.Context r16 = r7.requireContext()
            com.instagram.common.session.UserSession r1 = r0.A0G
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
            androidx.fragment.app.FragmentActivity r18 = r7.requireActivity()
            X.7Tn r6 = r0.A0H
            X.0iw r4 = r6.A02
            X.7N6 r21 = X.AnonymousClass7N6.A00
            r8 = 0
            X.7N7 r15 = new X.7N7
            r23 = r8
            r19 = r4
            r20 = r1
            r22 = r8
            r17 = r7
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A0D = r15
            X.4DU r11 = r6.A08
            X.0sa r10 = r6.A0I
            java.lang.Object r9 = r10.invoke()
            X.9HC r9 = (X.AnonymousClass9HC) r9
            X.0sa r6 = r6.A0H
            X.7N8 r4 = new X.7N8
            r4.<init>(r11, r1, r9, r6)
            r0.A01 = r4
            java.lang.Object r4 = r10.invoke()
            X.9HC r4 = (X.AnonymousClass9HC) r4
            X.0eM r4 = r4.A0y
            java.lang.Object r4 = r4.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0199
            android.content.Context r9 = r7.requireContext()
            X.9H7 r4 = r0.A0J
            X.0sa r7 = r0.A0t
            r11 = 0
            r10 = 2
            X.0qQ.A0B(r7, r3)
            android.widget.FrameLayout r6 = r4.A03
            if (r6 == 0) goto L_0x0415
            java.lang.String r3 = X.AnonymousClass7N9.A09
            X.2gp r18 = X.C226442gp.A00
            X.0qQ.A07(r18)
            X.7NB r19 = X.AnonymousClass7NB.A00
            X.7NC r17 = X.AnonymousClass7NC.A00
            java.util.concurrent.Executor r20 = r9.getMainExecutor()
            X.0qQ.A07(r20)
            r4 = 47
            X.0na r3 = new X.0na
            r3.<init>(r4, r10, r11, r11)
            X.0wb r16 = X.0wb.A01
            X.7N9 r15 = new X.7N9
            r21 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r4 = 24
            X.PlY r3 = new X.PlY
            r3.<init>(r7, r4)
            X.7ND r10 = new X.7ND
            r10.<init>(r9, r1, r3)
            X.7NR r9 = new X.7NR
            r9.<init>(r7)
            r3 = 11
            X.PmE r4 = new X.PmE
            r4.<init>(r7, r3)
            X.7NT r3 = new X.7NT
            r16 = r3
            r17 = r6
            r18 = r10
            r19 = r15
            r20 = r9
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21)
        L_0x00c5:
            r0.A00 = r3
            X.7Na r3 = new X.7Na
            r3.<init>(r2, r1)
            r0.A04 = r3
            X.7S7 r3 = r14.C6l()
            X.3t2 r4 = r3.C6c()
            X.0qQ.A0A(r4)
            r6 = 0
            X.0qQ.A0B(r4, r6)
            boolean r3 = r4 instanceof X.C254773t1
            if (r3 != 0) goto L_0x00e5
            boolean r3 = r4 instanceof X.C333417Yw
            if (r3 == 0) goto L_0x010a
        L_0x00e5:
            X.3t1 r3 = X.AnonymousClass6W3.A01(r4)
            com.instagram.model.direct.DirectThreadKey r4 = X.AnonymousClass6W4.A01(r3)
            X.2Dm r3 = X.2L2.A00(r1)
            java.util.HashSet r3 = r3.Bk6()
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x010a
            X.0Tu r7 = X.0Tu.A05
            r3 = 36320674406474511(0x8109760000230f, double:3.0326789740467886E-306)
            boolean r3 = X.182.A06(r7, r1, r3)
            r20 = 1
            if (r3 != 0) goto L_0x010c
        L_0x010a:
            r20 = 0
        L_0x010c:
            X.0Tu r7 = X.0Tu.A05
            r3 = 36327271476246846(0x810f760000393e, double:3.036850987535081E-306)
            boolean r3 = X.182.A06(r7, r1, r3)
            if (r3 != 0) goto L_0x0132
            X.7Tw r3 = r0.A0I
            X.7L3 r4 = r3.A07
            if (r4 == 0) goto L_0x0196
            X.7ZY r18 = r14.BSN()
            X.7Nb r3 = new X.7Nb
            r14 = r3
            r15 = r12
            r16 = r2
            r17 = r1
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r0.A06 = r3
        L_0x0132:
            X.0eM r1 = r0.A0a
            java.lang.Object r9 = r1.getValue()
            X.7WX r9 = (X.AnonymousClass7WX) r9
            com.instagram.common.session.UserSession r1 = r9.A01
            r3 = 36324677316456674(0x810d1a000730e2, double:3.035210430437933E-306)
            boolean r1 = X.182.A06(r7, r1, r3)
            if (r1 != 0) goto L_0x014a
            X.AnonymousClass7WX.A00(r9)
        L_0x014a:
            X.0eM r1 = r0.A0b
            java.lang.Object r9 = r1.getValue()
            X.7Uk r9 = (X.C332297Uk) r9
            X.4DH r1 = r9.A03
            android.content.Context r1 = r1.requireContext()
            android.content.res.Resources r3 = r1.getResources()
            X.7Nj r1 = new X.7Nj
            r1.<init>(r3)
            r9.A01 = r1
            r9.A00 = r2
            android.content.Context r1 = r5.getContext()
            X.7Nn r4 = new X.7Nn
            r4.<init>(r1)
            r1 = 2131432288(0x7f0b1360, float:1.848633E38)
            r4.setId(r1)
            r1 = 8
            r4.setVisibility(r1)
            android.view.View r3 = r5.getRootView()
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r3, r1)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = -1
            r3.addView(r4, r1, r1)
            X.7Nj r1 = r9.A01
            if (r1 != 0) goto L_0x019c
            java.lang.String r0 = "emitterAnimationCanvasRenderer"
        L_0x018e:
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0196:
            java.lang.String r0 = "videoPlayer"
            goto L_0x018e
        L_0x0199:
            r3 = 0
            goto L_0x00c5
        L_0x019c:
            r4.setCanvasRenderer(r1)
            r9.A02 = r4
            X.4DH r3 = r13.A00
            X.7N7 r1 = r0.A0D
            r3.registerLifecycleListener(r1)
            X.7Mn r1 = r0.A0C
            if (r1 == 0) goto L_0x01ae
            r1.A00 = r12
        L_0x01ae:
            X.0eM r1 = r0.A0S
            java.lang.Object r9 = r1.getValue()
            X.7VH r9 = (X.AnonymousClass7VH) r9
            X.0sa r1 = r9.A09
            java.lang.Object r1 = r1.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r4 = r1.C6l()
            X.7SD r1 = r4.C6Q()
            int r3 = r1.A08
            r1 = 29
            if (r3 != r1) goto L_0x0214
            X.7SD r1 = r4.C6Q()
            boolean r1 = r1.A0n
            if (r1 != 0) goto L_0x0214
            com.instagram.common.session.UserSession r10 = r9.A08
            r3 = 36319407396691300(0x81084f00551d64, double:3.031877711958047E-306)
            boolean r1 = X.182.A06(r7, r10, r3)
            if (r1 == 0) goto L_0x0214
            android.view.ViewGroup r3 = X.AnonymousClass7VH.A00(r9)
            r1 = 2131431817(0x7f0b1189, float:1.8485374E38)
            android.view.View r1 = r3.findViewById(r1)
            r9.A01 = r1
            android.view.ViewGroup r3 = X.AnonymousClass7VH.A00(r9)
            r1 = 2131429836(0x7f0b09cc, float:1.8481356E38)
            android.view.View r1 = r3.findViewById(r1)
            X.3oV r3 = X.2b1.A00(r1)
            r9.A03 = r3
            if (r3 == 0) goto L_0x0209
            X.AZX r1 = new X.AZX
            r1.<init>(r9)
            r3.EeU(r1)
        L_0x0209:
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r10)
            java.lang.Class<X.INk> r3 = X.C57070INk.class
            X.1wn r1 = r9.A07
            r4.A01(r1, r3)
        L_0x0214:
            X.0eM r1 = r0.A0Z
            java.lang.Object r4 = r1.getValue()
            X.7WY r4 = (X.AnonymousClass7WY) r4
            r1 = 2131442741(0x7f0b3c35, float:1.850753E38)
            android.view.View r1 = r5.requireViewById(r1)
            X.3oV r3 = X.2b1.A01(r1, r6, r6)
            X.7Np r1 = new X.7Np
            r1.<init>(r2, r3, r4)
            r4.A01 = r1
            X.AnonymousClass7WY.A00(r4)
            X.0eM r1 = r0.A0j
            java.lang.Object r9 = r1.getValue()
            X.7Vj r9 = (X.C332527Vj) r9
            com.instagram.common.session.UserSession r1 = r9.A05
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.7Nt> r2 = X.C330677Nt.class
            X.1wn r1 = r9.A04
            r3.A01(r1, r2)
            X.0wc r4 = r9.A03
            X.7Nu r3 = new X.7Nu
            r3.<init>(r9)
            X.7Nv r2 = new X.7Nv
            r2.<init>(r9)
            X.7Nw r1 = new X.7Nw
            r1.<init>(r4, r2, r3)
            r9.A00 = r1
            X.0eM r1 = r0.A0k
            java.lang.Object r2 = r1.getValue()
            X.7WL r2 = (X.AnonymousClass7WL) r2
            X.0sa r1 = r2.A02
            java.lang.Object r1 = r1.invoke()
            X.7L4 r1 = (X.AnonymousClass7L4) r1
            boolean r1 = r1.CdC()
            X.782 r1 = X.AnonymousClass7WL.A00(r2, r1)
            r2.A00 = r1
            X.0eM r1 = r0.A0c
            java.lang.Object r4 = r1.getValue()
            X.7Vy r4 = (X.C332677Vy) r4
            com.instagram.common.session.UserSession r1 = r4.A0J
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.6eU> r2 = X.C312476eU.class
            X.1wn r1 = r4.A0B
            r3.A01(r1, r2)
            X.0eM r1 = r0.A0W
            java.lang.Object r11 = r1.getValue()
            X.7WH r11 = (X.AnonymousClass7WH) r11
            X.0sa r1 = r11.A05
            java.lang.Object r13 = r1.invoke()
            X.0sa r1 = r11.A06
            java.lang.Object r2 = r1.invoke()
            java.lang.String r2 = (java.lang.String) r2
            com.instagram.common.session.UserSession r10 = r11.A03
            androidx.fragment.app.Fragment r9 = r11.A02
            androidx.fragment.app.FragmentActivity r12 = r9.requireActivity()
            r1 = 2131431809(0x7f0b1181, float:1.8485358E38)
            android.view.View r1 = r5.findViewById(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.2eb r4 = new X.2eb
            r4.<init>(r1)
            r1 = 14
            X.9Mu r3 = new X.9Mu
            r3.<init>(r11, r13, r2, r1)
            r1 = 36318033001584394(0x81070f0000170a, double:3.031008538958195E-306)
            boolean r1 = X.182.A06(r7, r10, r1)
            if (r1 == 0) goto L_0x03f4
            X.OLf r1 = new X.OLf
            r1.<init>(r12, r10, r4, r3)
        L_0x02cb:
            r11.A00 = r1
            if (r1 == 0) goto L_0x02f3
            X.7VS r12 = r11.A04
            X.A45 r7 = new X.A45
            r7.<init>(r1)
            java.lang.Boolean r1 = r12.A00
            if (r1 != 0) goto L_0x03ed
            X.3t2 r1 = r12.A06
            X.3t3 r1 = X.AnonymousClass6W3.A05(r1)
            if (r1 == 0) goto L_0x03e7
            com.instagram.model.direct.threadkey.impl.MsysThreadId r4 = X.C300965yF.A04(r1)
            if (r4 == 0) goto L_0x03e7
            X.7VU r3 = r12.A05
            r2 = 6
            X.PqR r1 = new X.PqR
            r1.<init>((int) r2, (java.lang.Object) r7, (java.lang.Object) r12)
            r3.A03(r4, r1)
        L_0x02f3:
            X.0xi r1 = X.0tS.A4E
            X.0tS r4 = r1.A00()
            X.0s0 r3 = r4.A1f
            X.0YZ[] r2 = X.0tS.A4G
            r1 = 47
            r1 = r2[r1]
            java.lang.Object r1 = r3.CDM(r4, r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x031c
            android.content.Context r3 = r9.requireContext()
            X.MZ9 r2 = X.MZA.A00(r10)
            X.OFz r1 = new X.OFz
            r1.<init>(r3, r5, r2)
            r11.A01 = r1
        L_0x031c:
            X.0eM r1 = r0.A0P
            java.lang.Object r5 = r1.getValue()
            X.7Vn r5 = (X.C332567Vn) r5
            X.4DH r1 = r5.A02
            android.os.Bundle r3 = r1.mArguments
            if (r3 == 0) goto L_0x0373
            java.lang.String r2 = "media_id"
            java.lang.String r1 = r3.getString(r2)
            if (r1 == 0) goto L_0x0373
            java.lang.String r1 = "DirectFragment.DIRECT_FRAGMENT_ARGUMENT_MESSAGE_ID"
            java.lang.String r4 = r3.getString(r1, r8)
            X.AgO r7 = new X.AgO
            r7.<init>(r5, r4)
            X.0sa r1 = r5.A0C
            java.lang.Object r5 = r1.invoke()
            X.7XS r5 = (X.AnonymousClass7XS) r5
            X.0qQ.A0A(r4)
            com.instagram.model.direct.messageid.MessageIdentifier r6 = new com.instagram.model.direct.messageid.MessageIdentifier
            r6.<init>(r4, r8)
            java.lang.String r8 = r3.getString(r2)
            java.lang.String r1 = "target_comment_id"
            java.lang.String r9 = r3.getString(r1)
            java.lang.String r1 = "media_owner_id"
            java.lang.String r10 = r3.getString(r1)
            r1 = 700(0x2bc, float:9.81E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.String r11 = r3.getString(r1)
            r1 = 419(0x1a3, float:5.87E-43)
            java.lang.String r12 = X.C66579MXk.A00(r1)
            r5.EuG(r6, r7, r8, r9, r10, r11, r12)
            r3.remove(r2)
        L_0x0373:
            X.0eM r0 = r0.A0M
            java.lang.Object r5 = r0.getValue()
            X.7WI r5 = (X.AnonymousClass7WI) r5
            X.0eK r6 = r5.A03
            java.lang.Object r0 = r6.get()
            X.0qQ.A07(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.COb()
            if (r0 == 0) goto L_0x0414
            boolean r0 = X.AnonymousClass7WI.A01(r5)
            if (r0 != 0) goto L_0x0414
            java.lang.Object r0 = r6.get()
            X.0qQ.A07(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.3t3 r1 = r0.CBU()
            r0 = 0
            if (r1 != 0) goto L_0x03ab
            r0 = 1
        L_0x03ab:
            r5.A00 = r0
            if (r0 == 0) goto L_0x0407
            java.lang.Object r0 = r6.get()
            X.0qQ.A07(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            java.util.List r1 = r0.A0b
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r3 = r1.iterator()
        L_0x03d1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03f7
            java.lang.Object r2 = r3.next()
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            r1 = 1
            X.9IM r0 = new X.9IM
            r0.<init>((com.instagram.user.model.User) r2, (int) r1)
            r4.add(r0)
            goto L_0x03d1
        L_0x03e7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            r12.A00 = r1
        L_0x03ed:
            X.OLf r1 = r7.A00
            r1.A00()
            goto L_0x02f3
        L_0x03f4:
            r1 = 0
            goto L_0x02cb
        L_0x03f7:
            java.lang.Object r0 = r6.get()
            X.0qQ.A07(r0)
            X.7Zg r0 = (X.C333517Zg) r0
            X.7Za r0 = r0.AkC()
            r0.Ctg(r4)
        L_0x0407:
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            X.1wn r0 = r5.A01
            r2.A01(r0, r1)
        L_0x0414:
            return
        L_0x0415:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WZ.Dys(android.view.View, androidx.recyclerview.widget.RecyclerView, X.7Zg, com.instagram.direct.messagethread.store.intf.MessageListLayoutManager):void");
    }

    public final void onDestroy() {
        String str;
        C332237Ue r5 = this.A02;
        AnonymousClass7VP r1 = (AnonymousClass7VP) r5.A0g.getValue();
        AnonymousClass7TD r0 = r1.A05;
        C227622jd r12 = r1.A02;
        0qQ.A0B(r12, 0);
        r0.A00.unregisterLifecycleListenerSet(r12);
        this.A00.unregisterLifecycleListener(r5.A08);
        AnonymousClass7WK r02 = (AnonymousClass7WK) r5.A0p.getValue();
        0xa r13 = r02.A02;
        if (r13 == null) {
            str = "sharedPreferences";
        } else {
            0xZ r03 = r02.A00;
            if (r03 == null) {
                str = "adsEventSharingPrefKeyChangeListener";
            } else {
                r13.FJ1(r03);
                AnonymousClass7AX r3 = r5.A03;
                if (r3 != null) {
                    r3.A02.A02(r3.A03, AnonymousClass7MN.class);
                    C327307Ag r04 = r3.A07;
                    C327327Ai r14 = r3.A05;
                    0qQ.A0B(r14, 0);
                    r04.A01.remove(r14);
                }
                C332677Vy r32 = (C332677Vy) r5.A0c.getValue();
                1Ng A002 = AnonymousClass1Nd.A00(r32.A0J);
                A002.A02(r32.A06, AnonymousClass7MH.class);
                A002.A02(r32.A0C, AnonymousClass7MK.class);
                A002.A02(r32.A0E, AnonymousClass7ML.class);
                A002.A02(r32.A08, AnonymousClass7MM.class);
                A002.A02(r32.A0D, AnonymousClass7MN.class);
                A002.A02(r32.A09, C71888OsW.class);
                A002.A02(r32.A0G, C71887OsV.class);
                A002.A02(r32.A0H, AnonymousClass7MO.class);
                A002.A02(r32.A05, AnonymousClass7MP.class);
                A002.A02(r32.A0A, AnonymousClass7MI.class);
                A002.A02(r32.A04, AnonymousClass7MJ.class);
                A002.A02(r32.A07, AnonymousClass7MQ.class);
                C332567Vn r33 = (C332567Vn) r5.A0P.getValue();
                1Ng A003 = AnonymousClass1Nd.A00(r33.A05);
                A003.A02(r33.A03, C71890OsY.class);
                A003.A02(r33.A04, AY2.class);
                C332607Vr r34 = (C332607Vr) r5.A0e.getValue();
                AnonymousClass1Nd.A00(r34.A03).A02(r34.A02, AnonymousClass7MR.class);
                AnonymousClass7V4 r4 = (AnonymousClass7V4) r5.A0f.getValue();
                UserSession userSession = r4.A01;
                1Ng A004 = AnonymousClass1Nd.A00(userSession);
                A004.A02(r4.A02, AnonymousClass7MU.class);
                A004.A02(r4.A03, AnonymousClass7MV.class);
                userSession.A03(C69003Ncf.class);
                ((C41836B2r) ((C332457Vc) r5.A0o.getValue()).A02.getValue()).onDestroy();
                AnonymousClass7VH r35 = (AnonymousClass7VH) r5.A0S.getValue();
                AnonymousClass1Nd.A00(r35.A08).A02(r35.A07, C57070INk.class);
                AnonymousClass7VS r42 = (AnonymousClass7VS) r5.A0U.getValue();
                if (182.A06(0Tu.A05, r42.A04, 36320051636543389L)) {
                    r42.A03.A00.dispose();
                }
                C3261375n r15 = r5.A02;
                if (r15 != null) {
                    r5.A0E.unregisterLifecycleListener(r15);
                    r5.A02 = null;
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onDestroyView() {
        C74542Pwb pwb;
        String str;
        C332237Ue r4 = this.A02;
        r4.A0X.getValue();
        AnonymousClass7WH r5 = (AnonymousClass7WH) r4.A0W.getValue();
        C70678OFz oFz = r5.A01;
        if (oFz != null) {
            oFz.A04.A04.remove(oFz);
            EvictingQueue evictingQueue = oFz.A02;
            evictingQueue.clear();
            oFz.A03.A00(evictingQueue);
            oFz.A00.removeView(oFz.A01);
        }
        r5.A00 = null;
        C330377Mn r0 = r4.A0C;
        if (r0 != null) {
            r0.A06.removeCallbacksAndMessages((Object) null);
            AnonymousClass7WK r02 = (AnonymousClass7WK) r4.A0p.getValue();
            0xa r1 = r02.A02;
            if (r1 == null) {
                str = "sharedPreferences";
            } else {
                0xZ r03 = r02.A01;
                if (r03 == null) {
                    str = "onChangeListener";
                } else {
                    r1.FJ1(r03);
                    C332677Vy r52 = (C332677Vy) r4.A0c.getValue();
                    AnonymousClass1Nd.A00(r52.A0J).A02(r52.A0B, C312476eU.class);
                    C332527Vj r53 = (C332527Vj) r4.A0j.getValue();
                    AnonymousClass1Nd.A00(r53.A05).A02(r53.A04, C330677Nt.class);
                    C332637Vu r6 = (C332637Vu) r4.A0O.getValue();
                    AnonymousClass7FA r54 = r6.A02;
                    if (r54 != null) {
                        r6.A05.unregisterLifecycleListener(r54);
                        r54.A03 = null;
                        Set<C392289uY> set = r54.A0B;
                        for (C392289uY A022 : set) {
                            A022.A02();
                        }
                        r54.A0A.destroy();
                        set.clear();
                        r54.A01 = null;
                        r54.A02 = null;
                        r54.A05 = false;
                        r6.A02 = null;
                    }
                    C332297Uk r55 = (C332297Uk) r4.A0b.getValue();
                    C330617Nn r2 = r55.A02;
                    if (r2 != null) {
                        View rootView = r2.getRootView();
                        0qQ.A0C(rootView, "null cannot be cast to non-null type android.view.ViewGroup");
                        ((ViewGroup) rootView).removeView(r2);
                        r55.A02 = null;
                    }
                    AnonymousClass7V0 r62 = (AnonymousClass7V0) r4.A0i.getValue();
                    UserSession userSession = r62.A00;
                    if (C330397Mp.A07(userSession) && (pwb = (C74542Pwb) r62.A08.getValue()) != null) {
                        pwb.stop();
                    }
                    if (182.A06(0Tu.A05, userSession, 36318058774206281L)) {
                        r62.A06.clear();
                    }
                    AnonymousClass7WI r56 = (AnonymousClass7WI) r4.A0M.getValue();
                    Object obj = r56.A03.get();
                    0qQ.A07(obj);
                    if (((C333517Zg) obj).C6l().COb() && !AnonymousClass7WI.A01(r56)) {
                        r56.A00 = false;
                        AnonymousClass1Nd.A00(r56.A02).A02(r56.A01, 2Kb.class);
                    }
                    r4.A0C = null;
                    C71935OtJ otJ = r4.A09;
                    if (otJ != null) {
                        r4.A0E.unregisterLifecycleListener(otJ);
                        r4.A09 = null;
                    }
                    r4.A06 = null;
                    C330367Mm r12 = r4.A0B;
                    if (r12 != null) {
                        r4.A0E.unregisterLifecycleListener(r12);
                        r12.onDestroyView();
                        r4.A0B = null;
                    }
                    AnonymousClass7N7 r13 = r4.A0D;
                    if (r13 != null) {
                        r4.A0E.unregisterLifecycleListener(r13);
                        r13.onDestroy();
                        r4.A0D = null;
                        return;
                    }
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void onPause() {
        Set set;
        Set<DirectMessageIdentifier> unmodifiableSet;
        String str;
        AnonymousClass782 r0;
        C332237Ue r4 = this.A02;
        C330497Nb r1 = r4.A06;
        if (r1 != null) {
            11Z.A02(new C40879Akn(r1));
        }
        AnonymousClass7WL r12 = (AnonymousClass7WL) r4.A0k.getValue();
        if (((C333517Zg) r12.A03.invoke()).C6l().CRx() && (r0 = r12.A00) != null) {
            r0.A02();
        }
        KQg kQg = ((C332567Vn) r4.A0P.getValue()).A00;
        if (kQg != null) {
            kQg.A01 = null;
            AnonymousClass5H8.A02(kQg.A02.ArX());
        }
        C332677Vy r3 = (C332677Vy) r4.A0c.getValue();
        AnonymousClass7MA r5 = r3.A00;
        if (r5 == null) {
            str = "directThreadFragmentEventListenerManager";
        } else {
            r5.A00 = null;
            1Ng A002 = AnonymousClass1Nd.A00(r5.A05);
            A002.A02(r5.A06, AnonymousClass3EK.class);
            A002.A02(r5.A04, 2Kd.class);
            A002.A02(r5.A03, C240303Kj.class);
            A002.A02(r5.A02, C240323Kl.class);
            A002.A02(r5.A01, C321896uv.class);
            AnonymousClass7Q8 r02 = r3.A01;
            if (r02 == null) {
                str = "followStatusUpdatedListener";
            } else {
                r02.A01();
                1Ng A003 = AnonymousClass1Nd.A00(r3.A0J);
                A003.A02(r3.A0O, 27U.class);
                A003.A02(r3.A0N, 2Cy.class);
                A003.A02(r3.A0F, C330887Oq.class);
                A003.A02(r3.A06, AnonymousClass7MH.class);
                A003.A02(r3.A0I, 2Ka.class);
                AnonymousClass7WY r03 = (AnonymousClass7WY) r4.A0Z.getValue();
                1wn r2 = r03.A00;
                if (r2 != null) {
                    r03.A08.A02(r2, C330937Ov.class);
                }
                C330377Mn r04 = r4.A0C;
                if (r04 != null) {
                    r04.A03 = false;
                    C330377Mn.A00(r04);
                    AnonymousClass7WU r13 = (AnonymousClass7WU) r4.A0L.getValue();
                    ((C330957Ox) r13.A02.getValue()).A03.remove(r13);
                    AnonymousClass7VA r14 = (AnonymousClass7VA) r4.A0r.getValue();
                    AnonymousClass7ZA C62 = ((C333517Zg) r14.A01.invoke()).C62();
                    AnonymousClass7VC r32 = r14.A00;
                    synchronized (r32) {
                        set = r32.A00;
                        unmodifiableSet = Collections.unmodifiableSet(set);
                        0qQ.A07(unmodifiableSet);
                    }
                    for (DirectMessageIdentifier CmB : unmodifiableSet) {
                        C62.CmB(CmB);
                    }
                    synchronized (r32) {
                        set.clear();
                    }
                    AnonymousClass7VX r33 = (AnonymousClass7VX) r4.A0h.getValue();
                    UserSession userSession = r33.A03;
                    0Tu r52 = 0Tu.A05;
                    boolean A06 = 182.A06(r52, userSession, 36324677316653284L);
                    AnonymousClass0eM r15 = r33.A07;
                    if (!A06 || r15.CVQ()) {
                        OZR ozr = (OZR) r15.getValue();
                        ozr.A02 = false;
                        ozr.A07.A00();
                        OZR.A00(ozr);
                        ozr.A01 = null;
                    }
                    AnonymousClass7M6 r34 = r4.A05;
                    if (r34 != null) {
                        Window window = r34.A03.getWindow();
                        if (AnonymousClass7M6.A02(r34)) {
                            AnonymousClass79I A004 = AnonymousClass79I.A02.A00();
                            if (window != null) {
                                A004.A02(window, "ScreenshotNotificationManager");
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        AnonymousClass3KG r16 = r34.A00;
                        AnonymousClass3KQ r05 = r34.A01;
                        if (!(r05 == null || r16 == null)) {
                            r16.A06(r05);
                            r34.A01 = null;
                            r16.A04();
                            r34.A00 = null;
                        }
                        r34.A05.A01();
                        C70785OLf oLf = ((AnonymousClass7WH) r4.A0W.getValue()).A00;
                        if (oLf != null) {
                            AnonymousClass1Nd.A00(oLf.A02).A02(oLf.A01, 2Kb.class);
                        }
                        AnonymousClass7V0 r35 = (AnonymousClass7V0) r4.A0i.getValue();
                        if (!182.A06(r52, r35.A00, 36317182598320969L)) {
                            r35.A02.A00();
                        }
                        C332477Ve r36 = (C332477Ve) r4.A0Y.getValue();
                        AnonymousClass1Nd.A00(r36.A01).A02(r36.A00, AnonymousClass7P2.class);
                        return;
                    }
                    str = "screenshotNotificationManager";
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r10 = this;
            X.7Ue r4 = r10.A02
            X.0eM r0 = r4.A0i
            java.lang.Object r5 = r0.getValue()
            X.7V0 r5 = (X.AnonymousClass7V0) r5
            java.lang.ref.WeakReference r6 = r5.A06
            java.lang.Object r0 = r6.get()
            if (r0 == 0) goto L_0x029e
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317182598320969(0x81064900041349, double:3.030470740510106E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x029e
            java.lang.Object r0 = r6.get()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L_0x003f
            X.07V r0 = r0.getLifecycle()
            X.0xx r3 = X.C71772f0.A00(r0)
            r1 = 0
            r0 = 7
            X.9Ju r2 = new X.9Ju
            r2.<init>(r5, r1, r0)
            X.19B r1 = X.19B.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.1Eo.A03(r0, r1, r2, r3)
        L_0x003f:
            X.0eM r0 = r4.A0c
            java.lang.Object r6 = r0.getValue()
            X.7Vy r6 = (X.C332677Vy) r6
            X.7MA r5 = r6.A00
            if (r5 != 0) goto L_0x0055
            java.lang.String r0 = "directThreadFragmentEventListenerManager"
        L_0x004d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0055:
            X.7W8 r0 = r6.A0M
            r3 = 0
            X.0qQ.A0B(r0, r3)
            r5.A00 = r0
            com.instagram.common.session.UserSession r0 = r5.A05
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.3EK> r1 = X.AnonymousClass3EK.class
            X.7MF r0 = r5.A06
            r2.A01(r0, r1)
            java.lang.Class<X.2Kd> r1 = X.2Kd.class
            X.1wn r0 = r5.A04
            r2.A01(r0, r1)
            java.lang.Class<X.3Kj> r1 = X.C240303Kj.class
            X.1wn r0 = r5.A03
            r2.A01(r0, r1)
            java.lang.Class<X.3Kl> r1 = X.C240323Kl.class
            X.1wn r0 = r5.A02
            r2.A01(r0, r1)
            java.lang.Class<X.6uv> r1 = X.C321896uv.class
            X.1wn r0 = r5.A01
            r2.A01(r0, r1)
            X.7Q8 r0 = r6.A01
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = "followStatusUpdatedListener"
            goto L_0x004d
        L_0x008d:
            r0.A00()
            com.instagram.common.session.UserSession r7 = r6.A0J
            X.1Ng r5 = X.AnonymousClass1Nd.A00(r7)
            java.lang.Class<X.2Ka> r1 = X.2Ka.class
            X.1wn r0 = r6.A0I
            r5.A01(r0, r1)
            java.lang.Class<X.27U> r1 = X.27U.class
            X.7W6 r0 = r6.A0O
            r5.A01(r0, r1)
            java.lang.Class<X.2Cy> r1 = X.2Cy.class
            X.7W7 r0 = r6.A0N
            r5.A01(r0, r1)
            java.lang.Class<X.7Oq> r1 = X.C330887Oq.class
            X.1wn r0 = r6.A0F
            r5.A01(r0, r1)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316448161862021(0x81059e00311185, double:3.030006279936129E-306)
            boolean r0 = X.182.A06(r2, r7, r0)
            if (r0 == 0) goto L_0x00c6
            java.lang.Class<X.7MH> r1 = X.AnonymousClass7MH.class
            X.1wn r0 = r6.A06
            r5.A01(r0, r1)
        L_0x00c6:
            X.0eM r0 = r4.A0k
            java.lang.Object r5 = r0.getValue()
            X.7WL r5 = (X.AnonymousClass7WL) r5
            X.0sa r1 = r5.A03
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            boolean r0 = r0.CRx()
            if (r0 == 0) goto L_0x00e3
            r5.A01()
        L_0x00e3:
            X.1a8 r2 = r5.A01
            java.lang.Object r0 = r1.invoke()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.1aU r1 = r0.C6S()
            X.7Os r0 = new X.7Os
            r0.<init>(r5)
            X.1aU r0 = r1.A0L(r0)
            X.1aU r1 = r0.A0D()
            X.7Ot r0 = new X.7Ot
            r0.<init>(r5)
            r2.A02(r1, r0)
            X.0eM r0 = r4.A0Z
            java.lang.Object r0 = r0.getValue()
            X.7WY r0 = (X.AnonymousClass7WY) r0
            X.1wn r2 = r0.A00
            if (r2 == 0) goto L_0x011b
            X.1Ng r1 = r0.A08
            java.lang.Class<X.7Ov> r0 = X.C330937Ov.class
            r1.A01(r2, r0)
        L_0x011b:
            X.7Nb r5 = r4.A06
            if (r5 == 0) goto L_0x014e
            r1 = 1
            r5.A02 = r1
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            r5.A01 = r0
            r5.A00(r1)
            boolean r0 = r5.A0F
            if (r0 == 0) goto L_0x014e
            X.7L3 r1 = r5.A0A
            X.7Nc r0 = r5.A07
            r1.A00 = r0
            java.util.Set r2 = r5.A0C
            com.instagram.common.session.UserSession r0 = r5.A06
            X.1Av r0 = X.1Au.A00(r0)
            X.0xa r1 = r0.A01
            r0 = 3010(0xbc2, float:4.218E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.util.Set r0 = r1.C1t(r0)
            java.util.List r0 = X.00k.A0X(r0)
            r2.addAll(r0)
        L_0x014e:
            X.7Mn r1 = r4.A0C
            if (r1 == 0) goto L_0x02b5
            r0 = 1
            r1.A03 = r0
            X.0eM r0 = r4.A0L
            java.lang.Object r1 = r0.getValue()
            X.7WU r1 = (X.AnonymousClass7WU) r1
            X.0eM r0 = r1.A02
            java.lang.Object r0 = r0.getValue()
            X.7Ox r0 = (X.C330957Ox) r0
            java.util.Set r0 = r0.A03
            r0.add(r1)
            X.0eM r0 = r4.A0n
            java.lang.Object r0 = r0.getValue()
            X.7VD r0 = (X.AnonymousClass7VD) r0
            r0.A02()
            X.0eM r0 = r4.A0e
            java.lang.Object r7 = r0.getValue()
            X.7Vr r7 = (X.C332607Vr) r7
            X.0sa r0 = r7.A05
            java.lang.Object r1 = r0.invoke()
            X.7Zg r1 = (X.C333517Zg) r1
            X.7S7 r8 = r1.C6l()
            java.lang.String r2 = r8.C6C()
            if (r2 == 0) goto L_0x01c9
            boolean r0 = r8.CdE()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r8.CUO()
            if (r0 == 0) goto L_0x01c9
            X.7GL r9 = X.AnonymousClass7GK.A08
            X.7V0 r0 = r7.A04
            X.9Hs r0 = r0.A0D
            long r5 = r0.A00
            X.2Er r0 = r1.Api()
            if (r0 == 0) goto L_0x02ad
            com.instagram.common.session.UserSession r1 = r7.A03
            boolean r0 = r9.A04(r1, r0, r5)
            if (r0 == 0) goto L_0x01c9
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r1)
            java.lang.String r0 = r0.getId()
            boolean r0 = r8.COR(r0)
            if (r0 == 0) goto L_0x01c9
            X.AcV r0 = new X.AcV
            r0.<init>(r7)
            X.C69943Nuj.A00(r1, r0, r2)
        L_0x01c9:
            X.7M6 r6 = r4.A05
            if (r6 == 0) goto L_0x029a
            boolean r0 = X.AnonymousClass7M6.A02(r6)
            if (r0 == 0) goto L_0x0205
            X.3KG r1 = r6.A00
            X.3KQ r0 = r6.A01
            if (r0 == 0) goto L_0x01e6
            if (r1 == 0) goto L_0x01e6
            r1.A06(r0)
            r0 = 0
            r6.A01 = r0
            r1.A04()
            r6.A00 = r0
        L_0x01e6:
            com.instagram.common.session.UserSession r1 = r6.A06
            android.content.Context r0 = r6.A04
            X.3KG r1 = X.AnonymousClass3KF.A00(r0, r1)
            r6.A00 = r1
            r1.A03()
            X.3KQ r0 = X.AnonymousClass3KG.A00(r6)
            r6.A01 = r0
            r1.A05(r0)
            android.app.Activity r0 = r6.A03
            android.view.Window r0 = r0.getWindow()
            X.AnonymousClass7M6.A00(r0, r6)
        L_0x0205:
            android.app.Activity r0 = r6.A03
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference
            r5.<init>(r0)
            X.1a8 r2 = r6.A05
            X.7Zg r0 = r6.A07
            X.7S7 r0 = r0.C6l()
            X.1aU r1 = r0.C6S()
            X.7Oz r0 = new X.7Oz
            r0.<init>(r6)
            X.1aU r0 = r1.A0L(r0)
            X.1aU r1 = r0.A0D()
            X.7P0 r0 = new X.7P0
            r0.<init>(r6, r5)
            r2.A02(r1, r0)
            X.0eM r0 = r4.A0P
            java.lang.Object r0 = r0.getValue()
            X.7Vn r0 = (X.C332567Vn) r0
            X.KQg r2 = r0.A00
            if (r2 == 0) goto L_0x0252
            X.0eK r0 = r0.A0A
            java.lang.Object r0 = r0.get()
            X.7Zg r0 = (X.C333517Zg) r0
            X.7S7 r0 = r0.C6l()
            X.7SD r0 = r0.C6Q()
            int r1 = r0.A08
            r0 = 29
            if (r1 != r0) goto L_0x0252
            r2.A00()
        L_0x0252:
            X.0eM r0 = r4.A0p
            java.lang.Object r1 = r0.getValue()
            X.7WK r1 = (X.AnonymousClass7WK) r1
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x026b
            X.0sa r0 = r1.A06
            java.lang.Object r0 = r0.invoke()
            X.7FA r0 = (X.AnonymousClass7FA) r0
            if (r0 == 0) goto L_0x026b
            r0.A05(r3)
        L_0x026b:
            X.0eM r0 = r4.A0W
            java.lang.Object r0 = r0.getValue()
            X.7WH r0 = (X.AnonymousClass7WH) r0
            X.OLf r3 = r0.A00
            if (r3 == 0) goto L_0x0284
            com.instagram.common.session.UserSession r0 = r3.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.2Kb> r1 = X.2Kb.class
            X.1wn r0 = r3.A01
            r2.A01(r0, r1)
        L_0x0284:
            X.0eM r0 = r4.A0Y
            java.lang.Object r3 = r0.getValue()
            X.7Ve r3 = (X.C332477Ve) r3
            com.instagram.common.session.UserSession r0 = r3.A01
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Class<X.7P2> r1 = X.AnonymousClass7P2.class
            X.1wn r0 = r3.A00
            r2.A01(r0, r1)
            return
        L_0x029a:
            java.lang.String r0 = "screenshotNotificationManager"
            goto L_0x004d
        L_0x029e:
            X.9Hr r1 = r5.A02
            X.7Oo r0 = new X.7Oo
            r0.<init>(r5)
            r1.A01(r0)
            X.AnonymousClass7V0.A01(r5)
            goto L_0x003f
        L_0x02ad:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x02b5:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7WZ.onResume():void");
    }

    public final void onStop() {
        C330577Nj r0 = ((C332297Uk) this.A02.A0b.getValue()).A01;
        if (r0 != null) {
            r0.A00();
        }
    }

    public AnonymousClass7WZ(AnonymousClass4DH r1, UserSession userSession, C332237Ue r3) {
        this.A00 = r1;
        this.A01 = userSession;
        this.A02 = r3;
    }
}
