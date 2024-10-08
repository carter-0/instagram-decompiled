package X;

import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.intf.Trigger;
import java.util.EnumSet;

/* renamed from: X.41F  reason: invalid class name */
public final class AnonymousClass41F implements AnonymousClass41G {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass311 A02;
    public final C2357230y A03;
    public final C246803fG A04;
    public final AnonymousClass4DU A05;
    public final C2360232c A06;
    public final C231002qi A07;
    public final C228232l0 A08;

    public AnonymousClass41F(Fragment fragment, UserSession userSession, AnonymousClass311 r4, C2357230y r5, C246803fG r6, AnonymousClass4DU r7, C2360232c r8, C231002qi r9, C228232l0 r10) {
        0qQ.A0B(r8, 7);
        0qQ.A0B(r6, 8);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = userSession;
        this.A00 = fragment;
        this.A05 = r7;
        this.A08 = r10;
        this.A06 = r8;
        this.A04 = r6;
        this.A07 = r9;
    }

    public final void DQy(1Xj r6, AnonymousClass3W1 r7, int i) {
        String str;
        0qQ.A0B(r6, 0);
        1Xj A1c = r6.A1c(r7.A03);
        if (A1c == null) {
            A1c = r6;
        }
        C65251bZ BtX = A1c.A0C.BtX();
        if (BtX != null) {
            str = BtX.AgC();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            Dji(r6, r7, i);
        } else if (str != null) {
            C2360232c r3 = this.A06;
            1Xj A1c2 = r6.A1c(r7.A03);
            if (A1c2 == null) {
                A1c2 = r6;
            }
            r3.A00((C2357230y) this.A02, new DHN(this, r6, r7, i), str, C56587I2r.A00(A1c2, this.A05.getModuleName()));
        }
    }

    public final void Djh(1Xj r1, C62320sa r2) {
    }

    public final void Dji(1Xj r2, AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        A00(r2, r3, "airplane_button", i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x005a: MOVE  (r9v1 X.4DH) = (r9v0 X.4DH)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void Djn(android.graphics.Rect r20, android.view.ViewParent r21, X.1Xj r22, int r23) {
        /*
            r19 = this;
            r4 = 1
            r0 = 2
            r12 = r22
            X.0qQ.A0B(r12, r0)
            r3 = r19
            com.instagram.common.session.UserSession r11 = r3.A01
            androidx.fragment.app.Fragment r10 = r3.A00
            android.content.Context r0 = r10.requireContext()
            X.OW3 r1 = new X.OW3
            r1.<init>(r11, r0)
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x0022
            X.DI8 r0 = X.DI8.A00
            r1.A00(r0)
        L_0x0021:
            return
        L_0x0022:
            X.30y r0 = r3.A03
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x0021
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342162575518604773(0x2081087400001de5, double:4.06521814359108E-152)
            boolean r0 = X.182.A06(r2, r11, r0)
            if (r0 == 0) goto L_0x0021
            long r17 = java.lang.System.currentTimeMillis()
            int r0 = android.view.ViewConfiguration.getLongPressTimeout()
            long r0 = (long) r0
            long r17 = r17 - r0
            X.3fG r1 = r3.A04
            androidx.fragment.app.FragmentActivity r8 = r10.getActivity()
            if (r8 == 0) goto L_0x0021
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            X.0iw r10 = (X.AnonymousClass0iw) r10
            r0 = 5
            X.0qQ.A0B(r10, r0)
            X.3fH r5 = r1.A03
            X.4DU r13 = r1.A04
            androidx.fragment.app.Fragment r9 = r1.A00
            boolean r0 = r9 instanceof X.AnonymousClass4DH
            if (r0 == 0) goto L_0x006b
            X.4DH r9 = (X.AnonymousClass4DH) r9
            if (r9 == 0) goto L_0x006b
            X.2FW r14 = X.C55018Hap.A00(r12)
            r6 = r20
            r7 = r21
            r16 = r23
            r5.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x006b:
            X.1Av r3 = X.1Au.A00(r11)
            X.0s0 r2 = r3.A3M
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 83
            r1 = r1[r0]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.Epx(r3, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass41F.Djn(android.graphics.Rect, android.view.ViewParent, X.1Xj, int):void");
    }

    public final void Djs(MotionEvent motionEvent, 1Xj r6) {
        0qQ.A0B(r6, 1);
        if (!this.A03.A01) {
            if (182.A06(0Tu.A05, this.A01, 2342162575518604773L)) {
                C246803fG r0 = this.A04;
                r0.A03.A01(motionEvent, r6.getId());
            }
        }
    }

    private final void A00(1Xj r5, AnonymousClass3W1 r6, String str, int i) {
        C231002qi r1 = this.A07;
        if (r1 != null) {
            EnumSet of = EnumSet.of(Trigger.A0t);
            0qQ.A07(of);
            r1.AVg(of);
        }
        this.A08.DUE(C301155ye.A00(), C233162v9.SHARE_BUTTON_CLICK, r5, r6);
        this.A04.A00(r5, r6, str, i);
        UserSession userSession = this.A01;
        if (182.A06(0Tu.A05, userSession, 36326227800307316L)) {
            2DU.A00(userSession).A09(C273654mx.A00(956));
        }
    }

    public final void Djj(1Xj r1, AnonymousClass3W1 r2, String str, int i) {
        A00(r1, r2, str, i);
    }
}
