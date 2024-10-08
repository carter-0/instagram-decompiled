package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.8Xp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C357368Xp implements AnonymousClass2gO {
    public final /* synthetic */ C3507686c A00;
    public final /* synthetic */ AnonymousClass86W A01;
    public final /* synthetic */ TouchInterceptorFrameLayout A02;
    public final /* synthetic */ C352888Fl A03;
    public final /* synthetic */ AnonymousClass8W6 A04;
    public final /* synthetic */ AnonymousClass85X A05;
    public final /* synthetic */ AnonymousClass823 A06;
    public final /* synthetic */ AnonymousClass8FA A07;
    public final /* synthetic */ AnonymousClass80D A08;
    public final /* synthetic */ C3508086k A09;
    public final /* synthetic */ AnonymousClass8AL A0A;
    public final /* synthetic */ AnonymousClass8DD A0B;
    public final /* synthetic */ C3504884v A0C;
    public final /* synthetic */ C355898Ru A0D;
    public final /* synthetic */ C3502083s A0E;
    public final /* synthetic */ C3497281m A0F;
    public final /* synthetic */ AnonymousClass80U A0G;
    public final /* synthetic */ C3511387s A0H;
    public final /* synthetic */ AnonymousClass0eM A0I;

    public /* synthetic */ C357368Xp(C3507686c r2, AnonymousClass86W r3, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C352888Fl r5, AnonymousClass8W6 r6, AnonymousClass85X r7, AnonymousClass823 r8, AnonymousClass8FA r9, AnonymousClass80D r10, C3508086k r11, AnonymousClass8AL r12, AnonymousClass8DD r13, C3504884v r14, C355898Ru r15, C3502083s r16, C3497281m r17, AnonymousClass80U r18, C3511387s r19, AnonymousClass0eM r20) {
        this.A0G = r18;
        this.A02 = touchInterceptorFrameLayout;
        this.A0E = r16;
        this.A07 = r9;
        this.A05 = r7;
        this.A0F = r17;
        this.A06 = r8;
        this.A0A = r12;
        this.A0C = r14;
        this.A0D = r15;
        this.A03 = r5;
        this.A08 = r10;
        this.A01 = r3;
        this.A00 = r2;
        this.A09 = r11;
        this.A0H = r19;
        this.A0B = r13;
        this.A04 = r6;
        this.A0I = r20;
    }

    public final void onChanged(Object obj) {
        AnonymousClass80U r18 = this.A0G;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A02;
        C3502083s r30 = this.A0E;
        AnonymousClass8FA r29 = this.A07;
        AnonymousClass85X r17 = this.A05;
        C3497281m r28 = this.A0F;
        AnonymousClass823 r13 = this.A06;
        AnonymousClass8AL r12 = this.A0A;
        C3504884v r11 = this.A0C;
        C355898Ru r10 = this.A0D;
        C352888Fl r9 = this.A03;
        AnonymousClass80D r7 = this.A08;
        AnonymousClass86W r6 = this.A01;
        C3507686c r5 = this.A00;
        C3508086k r4 = this.A09;
        C3511387s r14 = this.A0H;
        AnonymousClass8DD r3 = this.A0B;
        AnonymousClass8W6 r0 = this.A04;
        AnonymousClass0eM r2 = this.A0I;
        AnonymousClass86R r8 = (AnonymousClass86R) obj;
        if (r18.CZe()) {
            int ordinal = r8.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && touchInterceptorFrameLayout.isLaidOut()) {
                    AnonymousClass80U r23 = r18;
                    C3511387s r24 = r14;
                    AnonymousClass85X r132 = r17;
                    AnonymousClass8FA r142 = r29;
                    AnonymousClass80D r15 = r7;
                    C3508086k r16 = r4;
                    AnonymousClass8AL r172 = r12;
                    AnonymousClass8DD r182 = r3;
                    C352888Fl r112 = r9;
                    AnonymousClass8W6 r122 = r0;
                    C357338Xm.A02(r112, r122, r132, r142, r15, r16, r172, r182, r11, r10, r30, r28, r23, r24, r2, true, false);
                }
            } else if (touchInterceptorFrameLayout.isLaidOut()) {
                C357338Xm.A01(r5, r6, r9, r17, r13, r29, r7, r4, r12, r11, r10, r30, r28, true, false);
            }
        } else if (r18.CZU() && r8.ordinal() == 1 && touchInterceptorFrameLayout.isLaidOut()) {
            ((C342227oF) r2.getValue()).A02.Dx2(0, 0, 1.0f, 1.0f);
        }
    }
}
