package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.7LE  reason: invalid class name */
public final class AnonymousClass7LE {
    public AnonymousClass7ZX A00;
    public AnonymousClass7P7 A01;
    public AnonymousClass7LD A02;
    public AnonymousClass9HC A03;
    public AnonymousClass7L2 A04;
    public AnonymousClass7AM A05;
    public final AnonymousClass4DH A06;
    public final UserSession A07;
    public final AnonymousClass7TO A08;
    public final AnonymousClass7LG A09;
    public final AnonymousClass9HO A0A;
    public final AnonymousClass7LF A0B;
    public final C332807Wl A0C;
    public final AnonymousClass7S7 A0D;
    public final String A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final Activity A0I;
    public final Context A0J;
    public final 2cp A0K;
    public final AnonymousClass0iw A0L;
    public final AnonymousClass7LB A0M;
    public final AnonymousClass9HS A0N;
    public final C331037Pg A0O;
    public final AnonymousClass7L3 A0P;
    public final boolean A0Q;
    public final boolean A0R;

    public AnonymousClass7LE(Activity activity, Context context, 2cp r13, AnonymousClass4DH r14, AnonymousClass0iw r15, UserSession userSession, AnonymousClass7TO r17, AnonymousClass7LD r18, AnonymousClass9HO r19, C332807Wl r20, AnonymousClass9HC r21, AnonymousClass7LB r22, AnonymousClass7L2 r23, AnonymousClass7S7 r24, AnonymousClass9HS r25, C331037Pg r26, AnonymousClass7L3 r27, String str, boolean z, boolean z2) {
        AnonymousClass0eM r0;
        AnonymousClass7LD r1 = r18;
        0qQ.A0B(r1, 21);
        this.A0I = activity;
        this.A0J = context;
        this.A06 = r14;
        UserSession userSession2 = userSession;
        this.A07 = userSession2;
        C332807Wl r7 = r20;
        this.A0C = r7;
        this.A0L = r15;
        this.A0D = r24;
        this.A08 = r17;
        this.A0K = r13;
        this.A0E = str;
        this.A0P = r27;
        this.A0O = r26;
        this.A0M = r22;
        this.A0N = r25;
        this.A0R = z;
        this.A0Q = z2;
        this.A03 = r21;
        this.A04 = r23;
        this.A02 = r1;
        AnonymousClass9HO r6 = r19;
        this.A0A = r6;
        this.A0B = new AnonymousClass7LF(userSession2);
        this.A09 = new AnonymousClass7LG(context, r13, r15, userSession2, r6, r7, this.A03, this.A04);
        0eO r2 = 0eO.A03;
        this.A0H = AnonymousClass0eN.A00(r2, new C377139Kr(this, 44));
        C377139Kr r12 = new C377139Kr(this, 42);
        if (C331817Sm.A00(userSession2)) {
            r0 = AnonymousClass0eN.A00(r2, r12);
        } else {
            r0 = new 1Ue(r12.invoke());
        }
        this.A0F = r0;
        this.A0G = AnonymousClass0eN.A01(new C377139Kr(this, 43));
    }

    public static final AnonymousClass7AM A00(AnonymousClass7LE r5) {
        AnonymousClass7AM r0 = r5.A05;
        if (r0 != null) {
            return r0;
        }
        UserSession userSession = r5.A07;
        AnonymousClass9HC r3 = r5.A03;
        AnonymousClass7AM r02 = new AnonymousClass7AM(userSession, (C327367Am) r5.A0F.getValue(), r5.A0C, r3);
        r5.A05 = r02;
        return r02;
    }

    public static final AnonymousClass7P7 A01(AnonymousClass7LE r32) {
        AnonymousClass7LE r0 = r32;
        Activity activity = r0.A0I;
        AnonymousClass4DH r14 = r0.A06;
        Context context = r0.A0J;
        UserSession userSession = r0.A07;
        C332807Wl r11 = r0.A0C;
        AnonymousClass9HC r10 = r0.A03;
        AnonymousClass0iw r9 = r0.A0L;
        AnonymousClass9HS r8 = r0.A0N;
        boolean z = r0.A0Q;
        2cp r6 = r0.A0K;
        AnonymousClass7L3 r5 = r0.A0P;
        C331037Pg r4 = r0.A0O;
        boolean z2 = r0.A0R;
        AnonymousClass7LB r2 = r0.A0M;
        AnonymousClass7ZX r1 = r0.A00;
        if (r1 != null) {
            boolean z3 = z;
            AnonymousClass7L3 r30 = r5;
            C331037Pg r29 = r4;
            AnonymousClass9HS r28 = r8;
            return new AnonymousClass7P7(activity, context, r6, r14, r9, userSession, r1, r11, r10, r2, r0.A04, r28, r29, r30, z3, z2);
        }
        0qQ.A0F("messageStore");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final AnonymousClass7P7 A02(AnonymousClass7LE r1) {
        AnonymousClass7P7 r0 = r1.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass7P7 A012 = A01(r1);
        r1.A01 = A012;
        return A012;
    }
}
