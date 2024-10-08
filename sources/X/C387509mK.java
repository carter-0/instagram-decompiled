package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.reels.memories.model.MemoryItem;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9mK  reason: invalid class name and case insensitive filesystem */
public final class C387509mK extends AA8 {
    public int A00;
    public Drawable A01;
    public View A02;
    public C369908vW A03;
    public C369848vQ A04;
    public 1Xj A05;
    public List A06 = Collections.emptyList();
    public final Context A07;
    public final UserSession A08;
    public final TargetViewSizeProvider A09;
    public final AnonymousClass87H A0A;
    public final C39890ADo A0B;
    public final HashMap A0C = AnonymousClass7TE.A1E();
    public final C310416b1 A0D = new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.15f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, true, true, false, false, true, true, true, true, true, true, false, false);

    public C387509mK(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r40) {
        this.A0A = r40;
        Context context2 = context;
        this.A07 = context2;
        this.A08 = userSession;
        View view2 = view;
        this.A02 = view2;
        this.A09 = targetViewSizeProvider;
        C39890ADo aDo = new C39890ADo();
        aDo.A0F = false;
        aDo.A04 = 0.7f;
        aDo.A01(0.0f, AnonymousClass7TE.A01(context2.getResources(), R.dimen.account_group_management_clickable_width));
        aDo.A0R = false;
        this.A0B = aDo;
        this.A02 = view2;
    }

    public static void A00(AnonymousClass57C r8, C387509mK r9) {
        MemoryItem memoryItem = (MemoryItem) r9.A06.get(r9.A00);
        int ordinal = memoryItem.A00.ordinal();
        if (ordinal == 0) {
            C45388CvU cvU = memoryItem.A01;
            cvU.getClass();
            r9.A05 = cvU.A01;
            AnonymousClass87H r3 = r9.A0A;
            Context context = r9.A07;
            UserSession userSession = r9.A08;
            r3.A0C(new C387149lk(context, userSession, memoryItem, AnonymousClass81W.A00(r9.A09)), r9.A0D, true);
            1Xj r32 = r9.A05;
            r32.getClass();
            if (r9.A0C.containsKey(r32.getId())) {
                A01(r8, r9, r32);
            } else {
                C290815g0 A032 = C59730JVo.A03(context, userSession, C59730JVo.A05(context, r32, "CanvasMemoriesController", false, false));
                A032.A00 = new C385899ji(3, r9, r8, r32);
                1ES.A03(A032);
            }
        } else if (ordinal == 1) {
            C45388CvU cvU2 = memoryItem.A01;
            cvU2.getClass();
            r9.A05 = cvU2.A01;
            AnonymousClass87H r5 = r9.A0A;
            r5.A0F((BackgroundGradientColors) null);
            1Xj r2 = r9.A05;
            C3509386y r1 = r5.A00;
            r1.A01.A00();
            r1.A01.A03.A0O(r8, r2, (C310416b1) null);
            r5.A0C(new C387149lk(r9.A07, r9.A08, memoryItem, AnonymousClass81W.A00(r9.A09)), r9.A0D, false);
        } else if (ordinal == 2) {
            r9.A05 = null;
            AnonymousClass87H r52 = r9.A0A;
            r52.A0F((BackgroundGradientColors) null);
            r52.A0A(new C369858vR(r9.A07, r9.A08, memoryItem), r8, C317876nz.A17);
        }
        AnonymousClass8S4 r22 = r9.A0A.A00.A01;
        r22.A08.A0u(new AWF(r22, false));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000a: MOVE  (r2v0 X.1Xj) = (r16v0 X.1Xj)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public static void A01(X.AnonymousClass57C r14, X.C387509mK r15, X.1Xj r16) {
        /*
            X.87H r0 = r15.A0A
            boolean r0 = r0.A0L(r15)
            if (r0 == 0) goto L_0x0050
            X.1Xj r0 = r15.A05
            r2 = r16
            if (r2 != r0) goto L_0x0050
            java.util.HashMap r1 = r15.A0C
            java.lang.String r0 = r2.getId()
            java.lang.Object r4 = r1.get(r0)
            r4.getClass()
            com.instagram.common.gallery.Medium r4 = (com.instagram.common.gallery.Medium) r4
            android.content.Context r2 = r15.A07
            r3 = 0
            X.1Xj r0 = r15.A05
            r0.getClass()
            com.instagram.model.mediasize.ExtendedImageUrl r5 = r0.A1n(r2)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r15.A09
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r8 = r0.getWidth()
            int r9 = r0.getHeight()
            X.8Mx r6 = X.C354668Mx.RECTANGLE
            r11 = 1
            X.AnonymousClass7TF.A1B(r2, r11, r4)
            r10 = 0
            X.8vW r1 = new X.8vW
            r7 = r3
            r12 = r10
            r13 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r15.A03 = r1
            X.AZ1 r0 = new X.AZ1
            r0.<init>(r10, r15, r14, r4)
            r1.A9D(r0)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387509mK.A01(X.57C, X.9mK, X.1Xj):void");
    }

    public static boolean A02(C387509mK r2) {
        1Xj r0 = r2.A05;
        if (r0 == null || !r0.A5v() || !r2.A0C.containsKey(r2.A05.getId())) {
            return false;
        }
        return true;
    }
}
