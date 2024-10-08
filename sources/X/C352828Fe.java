package X;

import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.Set;

/* renamed from: X.8Fe  reason: invalid class name and case insensitive filesystem */
public final class C352828Fe implements C352588Dy {
    public C279284yO A00;
    public AnonymousClass8W6 A01;
    public final ViewGroup A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final AnonymousClass3E6 A05;
    public final C357638Yz A06;
    public final TargetViewSizeProvider A07;
    public final AnonymousClass872 A08;
    public final C352818Fd A09;
    public final C3496881i A0A;
    public final C3497281m A0B;
    public final 1ua A0C;
    public final AnonymousClass0eM A0D = AnonymousClass1YB.A00(new AnonymousClass9LV(this, 10));
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;

    public C352828Fe(ViewGroup viewGroup, AnonymousClass3E6 r11, C357638Yz r12, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass872 r14, AnonymousClass80D r15, C352818Fd r16, C3496881i r17, C3497281m r18) {
        0qQ.A0B(r12, 3);
        0qQ.A0B(targetViewSizeProvider, 5);
        this.A02 = viewGroup;
        this.A06 = r12;
        this.A05 = r11;
        this.A07 = targetViewSizeProvider;
        this.A0A = r17;
        this.A0B = r18;
        this.A08 = r14;
        this.A09 = r16;
        r15.A0M.getClass();
        AnonymousClass4DH r2 = r15.A0M;
        0qQ.A07(r2);
        this.A03 = r2;
        UserSession userSession = r15.A0S;
        0qQ.A07(userSession);
        this.A04 = userSession;
        this.A0C = 1ua.A0G.A01(r2.requireContext(), userSession);
        AnonymousClass9LV r8 = new AnonymousClass9LV(this, 14);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LV(new AnonymousClass9LV(r2, 11), 12));
        this.A0F = new C227862kA(new AnonymousClass9LV(A002, 13), r8, new AnonymousClass9M1(4, (Object) null, A002), new 0Yh(C352838Ff.class));
        this.A0E = AnonymousClass1YB.A00(new AnonymousClass9M1(5, r15, this));
        this.A00 = (C279284yO) r12.A08.A00;
        if (((Set) r12.A07.A00).contains(AnonymousClass80K.A00) && AnonymousClass39V.A00(userSession).booleanValue()) {
            r12.A0E(new C41490Auo(this));
            07U r82 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r2.getViewLifecycleOwner();
            AnonymousClass0xx A003 = AnonymousClass07a.A00(viewLifecycleOwner);
            1Eo.A05(19B.A00, new MH5(r82, this, viewLifecycleOwner, (AnonymousClass4D7) null, 16), A003);
        }
    }

    public final int CUu() {
        return 0;
    }

    public final boolean Cc9() {
        return true;
    }

    public final boolean DHO() {
        return false;
    }

    public final boolean DHP() {
        return false;
    }

    public final void Dkg() {
    }

    public static final void A00(C352828Fe r1, C62320sa r2) {
        AnonymousClass4DH r12 = r1.A03;
        if (r12.getContext() != null && r12.isAdded()) {
            r2.invoke();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: X.L4x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: X.L4x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: X.L4x} */
    /* JADX WARNING: type inference failed for: r1v10, types: [X.L4x, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(android.graphics.Bitmap r6) {
        /*
            r5 = this;
            X.872 r0 = r5.A08
            X.876 r1 = r0.A0H
            int r0 = r1.A00
            X.87G r3 = r1.A02(r0)
            r0 = 0
            if (r3 == 0) goto L_0x007c
            X.87I r1 = r3.A04
            if (r1 != 0) goto L_0x0013
            X.87I r1 = X.AnonymousClass87I.EMPTY
        L_0x0013:
            int r2 = r1.ordinal()
            r1 = 36
            if (r2 == r1) goto L_0x005d
            r1 = 38
            if (r2 == r1) goto L_0x0060
            r1 = 39
            if (r2 != r1) goto L_0x007c
            java.lang.String r4 = r3.getId()
            X.0qQ.A07(r4)
            java.util.List r1 = r3.A0K
            if (r1 == 0) goto L_0x0051
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x003d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            r3.add(r0)
            goto L_0x003d
        L_0x0051:
            X.0sn r3 = X.0sn.A00
        L_0x0053:
            X.3QO r2 = X.AnonymousClass3QO.CUSTOM
            X.L4x r1 = new X.L4x
            r1.<init>()
            r1.A00 = r4
            goto L_0x0075
        L_0x005d:
            X.LMM r0 = X.LMM.A02
            goto L_0x007c
        L_0x0060:
            java.lang.String r0 = r3.getId()
            X.0qQ.A07(r0)
            X.3QO r2 = X.AnonymousClass3QO.DEFAULT
            X.L4x r1 = new X.L4x
            r1.<init>()
            java.util.List r3 = java.util.Collections.singletonList(r0)
            X.0qQ.A07(r3)
        L_0x0075:
            r1.A01 = r3
            X.LMM r0 = new X.LMM
            r0.<init>(r2, r1)
        L_0x007c:
            r2 = 43
            X.Iw4 r1 = new X.Iw4
            r1.<init>((int) r2, (java.lang.Object) r6, (java.lang.Object) r5, (java.lang.Object) r0)
            A00(r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352828Fe.A01(android.graphics.Bitmap):void");
    }

    public final boolean Ccv() {
        if (((C352838Ff) this.A0F.getValue()).A01 == AnonymousClass05K.A0Y || this.A09.A00.A1N.A00().A08().A00 > 0.0f) {
            return true;
        }
        return false;
    }
}
