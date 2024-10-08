package X;

import android.view.View;

/* renamed from: X.8Xm  reason: invalid class name and case insensitive filesystem */
public abstract class C357338Xm {
    public static void A01(C3507686c r6, AnonymousClass86W r7, C352888Fl r8, AnonymousClass85X r9, AnonymousClass823 r10, AnonymousClass8FA r11, AnonymousClass80D r12, C3508086k r13, AnonymousClass8AL r14, C3504884v r15, C355898Ru r16, C3502083s r17, C3497281m r18, boolean z, boolean z2) {
        r17.EvD();
        r11.A00.Epw(false);
        r9.A0D = true;
        AnonymousClass85X.A06(r9);
        r18.A00().CLW();
        r18.A00().CLs();
        r18.A00().EvM();
        if (r10 != null) {
            r10.A00().A04(true);
        }
        r14.A0P.setVisibility(8);
        C3508086k r5 = r13;
        r13.A00().EUr(true);
        if (r15 != null) {
            if (z) {
                r15.A0d.Epw(false);
            }
            if (z2) {
                r15.A0a.Epw(false);
            }
        }
        r16.A0H.CNi((View.OnTouchListener) null);
        r8.A07 = new AnonymousClass90E(r6, r7, r8, r12, r5);
    }

    public static void A02(C352888Fl r4, AnonymousClass8W6 r5, AnonymousClass85X r6, AnonymousClass8FA r7, AnonymousClass80D r8, C3508086k r9, AnonymousClass8AL r10, AnonymousClass8DD r11, C3504884v r12, C355898Ru r13, C3502083s r14, C3497281m r15, AnonymousClass80U r16, C3511387s r17, AnonymousClass0eM r18, boolean z, boolean z2) {
        r14.CLn();
        r7.A00.Epw(true);
        r15.A00().CLq();
        AnonymousClass80U r2 = r16;
        if (!r2.CQ0(AnonymousClass80V.LAYOUT_CAPTURE) && !r2.CQ0(AnonymousClass80V.VIDEO_LAYOUT_CAPTURE) && !"story_selfie_reply".equals(r8.A2q)) {
            r15.A00().Euh();
            if (r12 != null && !((Boolean) r12.A0b.getValue()).booleanValue() && r17.A04 == null) {
                r15.A00().EvV();
            }
        }
        r6.A0D = false;
        AnonymousClass85X.A06(r6);
        if (r11 != null) {
            AnonymousClass87G A0D = r11.A0D();
            r5.A09.A09(A0D);
            AnonymousClass85X r0 = r5.A0C;
            r0.A03 = A0D;
            AnonymousClass85X.A06(r0);
        }
        r10.A0P.setVisibility(0);
        r9.A00().EUr(false);
        if (r12 != null) {
            if (z) {
                r12.A0d.Epw(true);
            }
            if (z2) {
                r12.A0a.Epw(true);
            }
        }
        r13.A0H.A00(r13.A0P, r13.A0O);
        r4.A07 = null;
        ((C342227oF) r18.getValue()).A02.Dx2(0, 0, 1.0f, 1.0f);
        r15.A00().EPv(0);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.07Z, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C3507686c r28, X.AnonymousClass86W r29, X.AnonymousClass4DH r30, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r31, X.C352888Fl r32, X.AnonymousClass8W6 r33, X.AnonymousClass85X r34, X.AnonymousClass823 r35, X.AnonymousClass8FA r36, X.AnonymousClass80D r37, X.C3508086k r38, X.AnonymousClass8AL r39, X.AnonymousClass8DD r40, X.C3504884v r41, X.AnonymousClass8WX r42, X.C355898Ru r43, X.C3502083s r44, X.C3497281m r45, X.AnonymousClass80U r46, X.C3511387s r47, X.AnonymousClass825 r48, X.AnonymousClass0eM r49) {
        /*
            r7 = r37
            android.app.Activity r0 = r7.A05
            X.07g r0 = (X.AnonymousClass07g) r0
            X.2YN r1 = new X.2YN
            r1.<init>(r0)
            java.lang.Class<X.8Q1> r0 = X.AnonymousClass8Q1.class
            X.2YL r5 = r1.A00(r0)
            X.8Q1 r5 = (X.AnonymousClass8Q1) r5
            r11 = r29
            X.81C r1 = r11.A00
            X.81E r0 = r1.A00()
            X.8Xo r0 = (X.C357358Xo) r0
            X.86D r0 = r0.A02
            X.05G r0 = r0.A0O
            X.19B r6 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r6, r0)
            X.8Xp r9 = new X.8Xp
            r21 = r40
            r20 = r39
            r19 = r38
            r17 = r36
            r16 = r35
            r15 = r34
            r14 = r33
            r13 = r32
            r2 = r49
            r27 = r47
            r26 = r46
            r25 = r45
            r24 = r44
            r12 = r31
            r3 = r43
            r22 = r41
            r10 = r28
            r23 = r3
            r28 = r2
            r18 = r7
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r4 = r30
            r0.A06(r4, r9)
            X.81E r0 = r1.A00()
            X.8Xo r0 = (X.C357358Xo) r0
            X.86D r0 = r0.A02
            X.05G r0 = r0.A0N
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r6, r0)
            X.2gB r1 = X.AnonymousClass72Y.A00(r0)
            X.8Xq r0 = new X.8Xq
            r0.<init>(r12, r2)
            r1.A06(r4, r0)
            com.instagram.common.session.UserSession r9 = r7.A0S
            r0 = 0
            X.0qQ.A0B(r9, r0)
            X.0Tu r8 = X.0Tu.A06
            r0 = 36327627958598215(0x810fc900013a47, double:3.037076428409526E-306)
            boolean r0 = X.182.A06(r8, r9, r0)
            r8 = r48
            if (r0 == 0) goto L_0x0099
            X.86a r0 = r10.A02
            X.2Fj r9 = r0.A00
            X.APs r1 = new X.APs
            r1.<init>(r7, r8)
            X.6q2 r0 = new X.6q2
            r0.<init>(r1)
            r9.A06(r4, r0)
        L_0x0099:
            X.86a r1 = r10.A02
            X.05G r0 = r1.A06
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r6, r0)
            X.8Xr r9 = new X.8Xr
            r28 = r8
            r29 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r0.A06(r4, r9)
            X.05G r0 = r1.A05
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r6, r0)
            X.2gB r1 = X.AnonymousClass72Y.A00(r0)
            X.8Xs r0 = new X.8Xs
            r0.<init>(r12, r2)
            r1.A06(r4, r0)
            if (r5 == 0) goto L_0x00ed
            X.2Fk r2 = r5.A00
            X.07Z r1 = r4.getViewLifecycleOwner()
            X.8Xt r0 = new X.8Xt
            r6 = r42
            r0.<init>(r6)
            r2.A06(r1, r0)
            X.2Fk r2 = r5.A01
            X.07Z r1 = r4.getViewLifecycleOwner()
            X.8Xu r0 = new X.8Xu
            r0.<init>(r15, r6, r3)
            r2.A06(r1, r0)
            X.2Fk r2 = r5.A02
            X.07Z r1 = r4.getViewLifecycleOwner()
            X.8Xv r0 = new X.8Xv
            r0.<init>(r3)
            r2.A06(r1, r0)
        L_0x00ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357338Xm.A00(X.86c, X.86W, X.4DH, com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout, X.8Fl, X.8W6, X.85X, X.823, X.8FA, X.80D, X.86k, X.8AL, X.8DD, X.84v, X.8WX, X.8Ru, X.83s, X.81m, X.80U, X.87s, X.825, X.0eM):void");
    }
}
