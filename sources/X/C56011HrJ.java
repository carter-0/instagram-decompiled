package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.HrJ  reason: case insensitive filesystem */
public final class C56011HrJ {
    public final Context A00;
    public final C229382nI A01;
    public final UserSession A02;
    public final AnonymousClass33B A03;
    public final AnonymousClass4DU A04;
    public final C243033Xd A05;
    public final AnonymousClass335 A06;
    public final AnonymousClass339 A07;
    public final AnonymousClass2xS A08;
    public final C232722uK A09;
    public final AnonymousClass4DV A0A;
    public final boolean A0B;
    public final C55491HiZ A0C;
    public final AnonymousClass3TA A0D;
    public final AnonymousClass4GD A0E;
    public final 0Pl A0F;
    public final AnonymousClass2xS A0G;

    public final C251263mp A00(C262754Fw r37, 1Xj r38, C245813dW r39, AnonymousClass3W1 r40, List list, int i) {
        1Xj r5 = r38;
        0qQ.A0B(r5, 0);
        C245813dW r7 = r39;
        AnonymousClass3W1 r2 = r40;
        AnonymousClass7TG.A1P(r2, r7);
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 2342166402335976579L)) {
            HashMap hashMap = this.A0C.A00;
            int i2 = i;
            Integer valueOf = Integer.valueOf(i2);
            IUL iul = (IUL) hashMap.get(valueOf);
            if (iul == null) {
                iul = new IUL(userSession, r2);
            }
            hashMap.put(valueOf, iul);
            1iA BR7 = r5.BR7();
            AnonymousClass3XV r25 = 2WX.A02;
            AnonymousClass3ZH A1Y = r5.A1Y();
            AnonymousClass4DU r13 = this.A04;
            UserSession userSession2 = userSession;
            2WX A002 = C244223aq.A00(C238863Ds.CAROUSEL_CARD_STORY, r25, userSession2, A1Y, r13, (Integer) null, false, false);
            C262754Fw r3 = r37;
            if (AnonymousClass4GV.A00(userSession, r5, BR7)) {
                1Xj r72 = r3.A0D;
                boolean z = this.A0B;
                AnonymousClass4GD r52 = this.A0E;
                int i3 = r3.A04;
                AnonymousClass2xS r32 = this.A0G;
                AnonymousClass4GD r17 = r52;
                1Xj r18 = r72;
                return new C53961Gx5(A002, r13, userSession, iul, this.A0D, r17, r18, r13, r2, this.A0F, r32, i2, i3, z);
            }
            1Xj r53 = r3.A0D;
            int i4 = r3.A04;
            boolean z2 = this.A0B;
            return new C53959Gx3(A002, userSession2, this.A0D.Alp(), r53, r13, r2, this.A0F, list, i4, i2, z2);
        }
        AnonymousClass2xS r33 = this.A08;
        Context context = this.A00;
        AnonymousClass4DU r10 = this.A04;
        C58684Ivt ivt = new C58684Ivt(r7.A00(context, r5, r10, r2, r33), 2);
        IUE iue = new IUE(this.A06, 0);
        C232722uK r73 = this.A09;
        C243033Xd r54 = this.A05;
        AnonymousClass33B r4 = this.A03;
        AnonymousClass339 r34 = this.A07;
        boolean z3 = this.A0B;
        return new AnonymousClass3Y2((AnonymousClass9IV) null, (2Wd) null, this.A01, userSession, r4, r10, r54, iue, r34, r73, this.A0A, ivt, z3, false);
    }

    public C56011HrJ(Context context, C229382nI r16, UserSession userSession, AnonymousClass33B r18, C55491HiZ hiZ, AnonymousClass3TA r20, AnonymousClass4GD r21, AnonymousClass4DU r22, C243033Xd r23, AnonymousClass335 r24, AnonymousClass339 r25, 0Pl r26, AnonymousClass2xS r27, AnonymousClass2xS r28, C232722uK r29, AnonymousClass4DV r30, boolean z) {
        AnonymousClass2xS r3 = r27;
        AnonymousClass335 r6 = r24;
        AnonymousClass4DU r8 = r22;
        C55491HiZ hiZ2 = hiZ;
        UserSession userSession2 = userSession;
        C51974G9v.A1S(userSession2, r8, hiZ2, r6, r3);
        0Pl r4 = r26;
        AnonymousClass4GD r9 = r21;
        AnonymousClass7TF.A1G(r9, 7, r4);
        C232722uK r1 = r29;
        AnonymousClass2xS r2 = r28;
        C243033Xd r7 = r23;
        AnonymousClass33B r12 = r18;
        C51974G9v.A1R(r7, r2, r1, r12);
        AnonymousClass339 r5 = r25;
        0qQ.A0B(r5, 15);
        AnonymousClass4DV r13 = r30;
        0qQ.A0B(r13, 18);
        this.A00 = context;
        this.A02 = userSession2;
        this.A04 = r8;
        this.A0C = hiZ2;
        this.A06 = r6;
        this.A0G = r3;
        this.A0E = r9;
        this.A0B = z;
        this.A0F = r4;
        this.A0D = r20;
        this.A05 = r7;
        this.A08 = r2;
        this.A09 = r1;
        this.A03 = r12;
        this.A07 = r5;
        this.A01 = r16;
        this.A0A = r13;
    }
}
