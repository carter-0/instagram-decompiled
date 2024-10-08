package X;

import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;

/* renamed from: X.8Xr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C357388Xr implements AnonymousClass2gO {
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
    public final /* synthetic */ AnonymousClass825 A0I;
    public final /* synthetic */ AnonymousClass0eM A0J;

    public /* synthetic */ C357388Xr(C3507686c r2, AnonymousClass86W r3, TouchInterceptorFrameLayout touchInterceptorFrameLayout, C352888Fl r5, AnonymousClass8W6 r6, AnonymousClass85X r7, AnonymousClass823 r8, AnonymousClass8FA r9, AnonymousClass80D r10, C3508086k r11, AnonymousClass8AL r12, AnonymousClass8DD r13, C3504884v r14, C355898Ru r15, C3502083s r16, C3497281m r17, AnonymousClass80U r18, C3511387s r19, AnonymousClass825 r20, AnonymousClass0eM r21) {
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
        this.A0I = r20;
        this.A0H = r19;
        this.A0B = r13;
        this.A04 = r6;
        this.A0J = r21;
    }

    public final void onChanged(Object obj) {
        05G r1;
        AnonymousClass826 r0;
        AnonymousClass80U r8 = this.A0G;
        TouchInterceptorFrameLayout touchInterceptorFrameLayout = this.A02;
        C3502083s r33 = this.A0E;
        AnonymousClass8FA r32 = this.A07;
        AnonymousClass85X r31 = this.A05;
        C3497281m r30 = this.A0F;
        AnonymousClass823 r19 = this.A06;
        AnonymousClass8AL r23 = this.A0A;
        C3504884v r14 = this.A0C;
        C355898Ru r13 = this.A0D;
        C352888Fl r12 = this.A03;
        AnonymousClass80D r11 = this.A08;
        AnonymousClass86W r6 = this.A01;
        C3507686c r5 = this.A00;
        C3508086k r4 = this.A09;
        AnonymousClass825 r3 = this.A0I;
        C3511387s r15 = this.A0H;
        AnonymousClass8DD r2 = this.A0B;
        AnonymousClass8W6 r16 = this.A04;
        AnonymousClass0eM r10 = this.A0J;
        C3507586b r9 = (C3507586b) obj;
        if (r8.CZe()) {
            int ordinal = r9.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && touchInterceptorFrameLayout.isLaidOut()) {
                    AnonymousClass8W6 r132 = r16;
                    AnonymousClass85X r142 = r31;
                    AnonymousClass8FA r152 = r32;
                    AnonymousClass80D r162 = r11;
                    C3508086k r17 = r4;
                    C357338Xm.A02(r12, r132, r142, r152, r162, r17, r23, r2, r14, r13, r33, r30, r8, r15, r10, false, true);
                    r1 = r3.A06;
                    r0 = AnonymousClass826.CLOSED;
                } else {
                    return;
                }
            } else if (touchInterceptorFrameLayout.isLaidOut()) {
                C357338Xm.A01(r5, r6, r12, r31, r19, r32, r11, r4, r23, r14, r13, r33, r30, false, true);
                r1 = r3.A06;
                r0 = AnonymousClass826.OPEN;
            } else {
                return;
            }
            r1.Epw(r0);
        }
    }
}
