package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.instagram.business.activity.BusinessConversionActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: X.30x  reason: invalid class name and case insensitive filesystem */
public final class C2357130x extends C2357230y implements C229802oH, AnonymousClass310, AnonymousClass322 {
    public C274114nj A00;
    public C274184nq A01;
    public AnonymousClass4GI A02;
    public AnonymousClass3TA A03;
    public AnonymousClass4GD A04;
    public C279134y8 A05;
    public C258353ys A06;
    public C256163vK A07;
    public JOB A08;
    public AnonymousClass41G A09;
    public AnonymousClass3WV A0A;
    public C2361132m A0B;
    public C2360732i A0C;
    public C242813Wa A0D;
    public AnonymousClass4JX A0E;
    public C246753fB A0F;
    public C2363233h A0G;
    public AnonymousClass324 A0H;
    public C242963Ww A0I;
    public final UserSession A0J;
    public final AnonymousClass4DU A0K;
    public final AnonymousClass2rI A0L;
    public final C230072os A0M;
    public final C249763kK A0N;
    public final C227802jw A0O;
    public final C2356530r A0P;
    public final C234172xD A0Q;
    public final AnonymousClass2xI A0R;
    public final C233102ux A0S;
    public final C228302lG A0T;
    public final C233002un A0U;
    public final C228232l0 A0V;
    public final C2354930b A0W;
    public final C2362032v A0X;
    public final C2362132w A0Y;
    public final Map A0Z;
    public final Map A0a;

    public final void A02(AnonymousClass3O9 r10, C242803Vz r11, int i) {
        AnonymousClass3O9 r5 = r10;
        0qQ.A0B(r10, 0);
        C230072os r1 = this.A0M;
        C229932oe r2 = r1.A01;
        String id = r10.getId();
        id.getClass();
        AnonymousClass30Y A002 = r2.A00(id);
        C242803Vz r6 = r11;
        if (A002 == AnonymousClass30Y.A07) {
            r1.A9R(r10, r11);
            String id2 = r10.getId();
            id2.getClass();
            A002 = r2.A00(id2);
        }
        String id3 = r10.getId();
        id3.getClass();
        String A0b = 002.A0b(id3, ":", i);
        r2.A01(new AnonymousClass30Y(A002, r5, r6, A0b, (List) null), A0b);
    }

    public final void A9R(AnonymousClass3O9 r2, C242803Vz r3) {
        0qQ.A0B(r2, 0);
        0qQ.A0B(r3, 1);
        this.A0M.A9R(r2, r3);
    }

    public final void EBq(View view, AnonymousClass3O9 r3) {
        0qQ.A0B(r3, 0);
        0qQ.A0B(view, 1);
        this.A0M.EBq(view, r3);
    }

    public static final void A01(C2357130x r6, int i) {
        1Q9.A01(AnonymousClass000.A00(2740)).A08();
        C322576w3.A00();
        C227802jw r4 = r6.A0O;
        Intent intent = new Intent(r4.requireContext(), BusinessConversionActivity.class);
        Bundle requireArguments = r4.requireArguments();
        requireArguments.putString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "net_ego");
        requireArguments.putInt(C273654mx.A00(312), i);
        requireArguments.putInt(AnonymousClass000.A00(532), 0);
        intent.putExtras(requireArguments);
        0kR.A05(r4, intent, 11);
    }

    public final void A04(C266934aa r6, AnonymousClass3UH r7) {
        C57214ITb iTb = new C57214ITb(r7, r6);
        C227802jw r3 = this.A0O;
        C46498Dg1 dg1 = new C46498Dg1(r3.requireContext(), this.A0J);
        dg1.A04(new C56758IBh(r6, iTb, this), 2131963365);
        new C49945FFy(dg1).A05(r3.requireContext());
    }

    public final C258353ys AZ8() {
        C258353ys r0 = this.A06;
        if (r0 != null) {
            return r0;
        }
        C258353ys AZ8 = super.AZ8();
        UserSession userSession = this.A0J;
        C227802jw r1 = this.A0O;
        AnonymousClass2rI r5 = this.A0L;
        C2362032v r7 = this.A0X;
        C258363yt r02 = new C258363yt(r1, this.A0P, userSession, AZ8, r5, this.A0W, r7);
        this.A06 = r02;
        return r02;
    }

    public final C274114nj Alp() {
        C274114nj r3 = this.A00;
        if (r3 != null) {
            return r3;
        }
        C274124nk r32 = new C274124nk(this.A0J, super.Alp(), this.A0Y);
        this.A00 = r32;
        return r32;
    }

    public final C274184nq Alq() {
        C274184nq r3 = this.A01;
        if (r3 != null) {
            return r3;
        }
        C274194nr r32 = new C274194nr(this.A0J, super.Alq(), this.A0T);
        this.A01 = r32;
        return r32;
    }

    public final AnonymousClass4GI Alt() {
        AnonymousClass4GI r3 = this.A02;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass4GK r32 = new AnonymousClass4GK(this.A0J, super.Alt(), this, this.A0T);
        this.A02 = r32;
        return r32;
    }

    public final AnonymousClass3TA Aly() {
        AnonymousClass3TA r2 = this.A03;
        if (r2 != null) {
            return r2;
        }
        AnonymousClass3TB r22 = new AnonymousClass3TB(super.Aly(), this.A0T);
        this.A03 = r22;
        return r22;
    }

    public final C279134y8 AmB() {
        C279134y8 r3 = this.A05;
        if (r3 != null) {
            return r3;
        }
        C279144y9 r32 = new C279144y9(this.A0J, super.AmB(), this, this.A0T);
        this.A05 = r32;
        return r32;
    }

    public final AnonymousClass4GD AmC() {
        AnonymousClass4GD r3 = this.A04;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass4GE r32 = new AnonymousClass4GE(this.A0J, super.AmC(), this.A0Y);
        this.A04 = r32;
        return r32;
    }

    public final C2360732i BD7() {
        C2360732i r2 = this.A0C;
        if (r2 != null) {
            return r2;
        }
        C242933Wt r22 = new C242933Wt(super.BD7(), this.A0L);
        this.A0C = r22;
        return r22;
    }

    public final C242813Wa BQE() {
        C242813Wa r0 = this.A0D;
        if (r0 != null) {
            return r0;
        }
        C242813Wa BQE = super.BQE();
        UserSession userSession = this.A0J;
        C227802jw r1 = this.A0O;
        C227802jw r2 = r1;
        C242883Wj r02 = new C242883Wj(r1, r2, userSession, BQE, this.A0L, this.A0U, this.A0W);
        this.A0D = r02;
        return r02;
    }

    public final AnonymousClass4JX BQG() {
        AnonymousClass4JX r3 = this.A0E;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass4JY r32 = new AnonymousClass4JY(this.A0J, this, super.BQG(), this.A0T);
        this.A0E = r32;
        return r32;
    }

    public final AnonymousClass324 BQk() {
        AnonymousClass324 r3 = this.A0H;
        if (r3 != null) {
            return r3;
        }
        IXE ixe = new IXE(this.A0T, super.BQk(), CBn());
        this.A0H = ixe;
        return ixe;
    }

    public final C256163vK BRA() {
        C256163vK r4 = this.A07;
        if (r4 != null) {
            return r4;
        }
        C256163vK BRA = super.BRA();
        C256173vL r42 = new C256173vL(this.A0J, BRA, this.A0L, this.A0U);
        this.A07 = r42;
        return r42;
    }

    public final JOB BRC() {
        JOB job = this.A08;
        if (job != null) {
            return job;
        }
        ISQ isq = new ISQ(this.A0J, super.BRC(), this.A0T);
        this.A08 = isq;
        return isq;
    }

    public final AnonymousClass41G BRE() {
        AnonymousClass41G r0 = this.A09;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass41G BRE = super.BRE();
        C227802jw r6 = this.A0O;
        AnonymousClass41H r02 = new AnonymousClass41H(this.A0J, BRE, this.A0R, this.A0W, this.A0X, r6);
        this.A09 = r02;
        return r02;
    }

    public final C246753fB BRN() {
        C246753fB r3 = this.A0F;
        if (r3 != null) {
            return r3;
        }
        C246763fC r32 = new C246763fC(this.A0J, super.BRN(), this.A0Y);
        this.A0F = r32;
        return r32;
    }

    public final AnonymousClass3WV BRO() {
        AnonymousClass3WV r3 = this.A0A;
        if (r3 != null) {
            return r3;
        }
        AnonymousClass3WW r32 = new AnonymousClass3WW(this.A0J, super.BRO(), this.A0L);
        this.A0A = r32;
        return r32;
    }

    public final C242963Ww BwU() {
        C242963Ww r1 = this.A0I;
        if (r1 != null) {
            return r1;
        }
        C242973Wx r12 = new C242973Wx(super.BwU());
        this.A0I = r12;
        return r12;
    }

    public final C2361132m C86() {
        C2361132m r3 = this.A0B;
        if (r3 != null) {
            return r3;
        }
        C2363533k r32 = new C2363533k(this.A0J, super.C86(), this.A0Q);
        this.A0B = r32;
        return r32;
    }

    public final C2363233h C87() {
        C2363233h r0 = this.A0G;
        if (r0 != null) {
            return r0;
        }
        C2363233h C87 = super.C87();
        UserSession userSession = this.A0J;
        AnonymousClass4DU r2 = this.A0K;
        C227802jw r7 = this.A0O;
        C2363433j r02 = new C2363433j(userSession, r2, C87, this.A0L, this.A0a, this.A0N, r7);
        this.A0G = r02;
        return r02;
    }

    public final void D2g(C274594oe r3, AnonymousClass5O4 r4) {
        A00(new C57214ITb(r3, r4), r4, C266954ac.CLICKED_HIDE, this);
    }

    public static final void A00(C57214ITb iTb, C266944ab r3, C266954ac r4, C2357130x r5) {
        r3.EZ9(r4);
        iTb.A00(r5.C86(), r5.A0O.getScrollingViewProxy());
    }

    public final void A03(1Xj r4, AnonymousClass3VH r5) {
        1iA BR7 = r4.BR7();
        String A30 = r4.A30();
        if (BR7 == 1iA.A0Q || BR7 == 1iA.A0a) {
            Map map = this.A0a;
            List list = (List) map.get(A30);
            if (list == null) {
                list = new LinkedList();
                map.put(A30, list);
            }
            list.add(r5);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2357130x(X.0hq r54, X.C2356530r r55, X.C227762js r56, X.C227282ix r57, X.C2355930l r58, com.instagram.common.session.UserSession r59, X.2el r60, X.C2356130n r61, X.AnonymousClass57N r62, X.C2355030c r63, X.AnonymousClass4DU r64, X.C234172xD r65, X.AnonymousClass2lU r66, X.AnonymousClass2xI r67, X.AnonymousClass2xI r68, X.AnonymousClass2xI r69, X.C2356230o r70, X.0Pl r71, X.AnonymousClass2xS r72, X.AnonymousClass30S r73, X.AnonymousClass2rI r74, X.C233102ux r75, X.C228302lG r76, X.AnonymousClass57Q r77, X.C233002un r78, X.C230072os r79, X.1Ux r80, X.C2356430q r81, X.C234422xq r82, X.C231002qi r83, X.C2355630i r84, X.C228232l0 r85, X.C234342xi r86, X.C249763kK r87, X.C2354930b r88, X.C227802jw r89, java.lang.String r90) {
        /*
            r53 = this;
            r0 = 9
            r13 = r59
            X.0qQ.A0B(r13, r0)
            r0 = 15
            r1 = r87
            X.0qQ.A0B(r1, r0)
            r49 = 0
            r17 = 0
            X.323 r37 = new X.323
            r32 = r80
            r16 = r84
            r8 = r89
            r2 = r64
            r11 = r37
            r12 = r8
            r14 = r2
            r15 = r32
            r18 = r1
            r19 = r17
            r20 = r17
            r21 = r49
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r33 = r81
            r31 = r77
            r5 = r74
            r30 = r73
            r0 = r65
            r34 = r82
            r7 = r53
            r36 = r83
            r9 = r54
            r3 = r85
            r10 = r56
            r40 = r86
            r11 = r57
            r12 = r58
            r16 = r62
            r18 = r63
            r14 = r60
            r45 = r90
            r15 = r61
            r22 = r66
            r24 = r67
            r25 = r68
            r27 = r70
            r28 = r71
            r4 = r72
            r20 = r2
            r21 = r0
            r23 = r5
            r26 = r17
            r29 = r4
            r35 = r17
            r38 = r17
            r39 = r3
            r41 = r1
            r42 = r17
            r43 = r17
            r44 = r17
            r46 = r17
            r47 = r17
            r48 = r17
            r50 = r49
            r51 = r49
            r52 = r49
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r7.A0O = r8
            r7.A0K = r2
            r7.A0Q = r0
            r7.A0J = r13
            r0 = r69
            r7.A0R = r0
            r7.A0N = r1
            r0 = r76
            r7.A0T = r0
            r0 = r79
            r7.A0M = r0
            r0 = r78
            r7.A0U = r0
            r7.A0V = r3
            r0 = r55
            r7.A0P = r0
            r0 = r88
            r7.A0W = r0
            r7.A0L = r5
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r7.A0a = r2
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r7.A0Z = r1
            r6 = r75
            r7.A0S = r6
            X.32v r0 = new X.32v
            r0.<init>(r13, r5, r6)
            r7.A0X = r0
            X.32w r0 = new X.32w
            r0.<init>(r2, r1)
            r7.A0Y = r0
            X.2uK r0 = r4.A0G
            r0.A03 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2357130x.<init>(X.0hq, X.30r, X.2js, X.2ix, X.30l, com.instagram.common.session.UserSession, X.2el, X.30n, X.57N, X.30c, X.4DU, X.2xD, X.2lU, X.2xI, X.2xI, X.2xI, X.30o, X.0Pl, X.2xS, X.30S, X.2rI, X.2ux, X.2lG, X.57Q, X.2un, X.2os, X.1Ux, X.30q, X.2xq, X.2qi, X.30i, X.2l0, X.2xi, X.3kK, X.30b, X.2jw, java.lang.String):void");
    }
}
