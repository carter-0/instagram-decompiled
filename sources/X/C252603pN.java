package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.3pN  reason: invalid class name and case insensitive filesystem */
public final class C252603pN {
    public final Context A00;
    public final C252623pP A01;
    public final AnonymousClass4DU A02;
    public final boolean A03;
    public final FragmentActivity A04;
    public final UserSession A05;
    public final C231672s5 A06;
    public final C252653pS A07;
    public final C252613pO A08;
    public final 0rQ A09;
    public final AnonymousClass4DV A0A;

    public C252603pN(Context context, FragmentActivity fragmentActivity, UserSession userSession, C231672s5 r15, C252593pM r16, C252613pO r17, AnonymousClass4DU r18, AnonymousClass4DV r19, C249763kK r20, String str, boolean z, boolean z2) {
        AnonymousClass4DV r7 = r19;
        0qQ.A0B(r7, 7);
        C252613pO r1 = r17;
        0qQ.A0B(r1, 8);
        C252593pM r5 = r16;
        0qQ.A0B(r5, 9);
        this.A04 = fragmentActivity;
        this.A00 = context;
        AnonymousClass4DU r6 = r18;
        this.A02 = r6;
        this.A05 = userSession;
        this.A03 = z;
        this.A06 = r15;
        this.A0A = r7;
        this.A08 = r1;
        0rQ r0 = new 0rQ(userSession);
        this.A09 = r0;
        C252623pP r12 = new C252623pP(context, fragmentActivity, userSession, r5, r6, r7, r20, str, z2);
        this.A01 = r12;
        this.A07 = new C252653pS(fragmentActivity, context, userSession, r12, r0.A04());
    }

    public final void A01(AnonymousClass4WX r24, C254163s2 r25, AnonymousClass3W1 r26) {
        AnonymousClass4WX r0 = r24;
        0qQ.A0B(r0, 0);
        C254163s2 r1 = r25;
        0qQ.A0B(r1, 1);
        AnonymousClass3W1 r15 = r26;
        0qQ.A0B(r15, 2);
        int A022 = this.A08.A02(r1.A02, r0.A04, r0.A00, r0.A01, r0.A09, r0.A0B);
        ViewGroup viewGroup = r1.A04;
        if (A022 != viewGroup.getLayoutParams().height) {
            0nA.A0V(viewGroup, A022);
        }
        if (!this.A09.A04()) {
            C254003rm r13 = r1.A05;
            if (r13 instanceof C253993rl) {
                C376509Ig r9 = r0.A03;
                C243613Zn r12 = (C243613Zn) ((C62320sa) r9.A01).invoke();
                int position = r15.getPosition();
                this.A01.A00.A06(this.A02, r12, (C253993rl) r13, (C243513Zb) ((0sL) r9.A02).invoke(this.A00, Boolean.valueOf(this.A03)), r15, position);
            }
        } else {
            r1.A03.setVisibility(8);
        }
        AnonymousClass3TO r122 = r0.A06;
        C245853da r11 = r0.A05;
        boolean z = r0.A0A;
        AnonymousClass4JV r8 = new AnonymousClass4JV(r0.A07, -1, r0.A0C, true);
        C231592rv r10 = C231592rv.MEDIA_CONTENT;
        int i = r0.A02;
        C376509Ig r6 = r0.A03;
        int intValue = ((Number) ((0sP) r6.A04).invoke(Integer.valueOf(i))).intValue();
        Map map = r1.A07;
        Number number = (Number) map.get(r10);
        if (number == null || number.intValue() != intValue) {
            map.put(r10, Integer.valueOf(intValue));
            AnonymousClass4EZ r102 = this.A01.A01;
            AnonymousClass4EA r7 = r1.A06;
            int position2 = r15.getPosition();
            r102.A07(this.A02, r8, (C246613et) ((0sK) r6.A03).invoke(this.A00, r122, r11), r7, position2, false);
        }
        if (!z) {
            r1.A06.A0N.setVisibility(0);
        }
        0qQ.A0B(this.A02.getModuleName(), 2);
        r1.A01 = r15;
        r1.A00 = r0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3rm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3TP A00(android.view.ViewGroup r13, boolean r14) {
        /*
            r12 = this;
            X.3pS r2 = r12.A07
            r10 = 0
            r0 = -1
            android.view.ViewGroup$LayoutParams r7 = new android.view.ViewGroup$LayoutParams
            r7.<init>(r0, r0)
            r9 = 2131625481(0x7f0e0609, float:1.8878171E38)
            android.app.Activity r0 = r2.A00
            android.view.LayoutInflater r6 = r0.getLayoutInflater()
            X.0qQ.A07(r6)
            r11 = 1
            r8 = r13
            android.view.View r5 = X.2Su.A01(r6, r7, r8, r9, r10, r11)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup"
            X.0qQ.A0C(r5, r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            boolean r0 = r2.A03
            r4 = 0
            if (r0 != 0) goto L_0x008e
            if (r14 == 0) goto L_0x007d
            android.content.Context r0 = r2.A01
            X.4Ag r6 = new X.4Ag
            r6.<init>(r0)
            r0 = 2131435930(0x7f0b219a, float:1.8493716E38)
            X.C261564Ab.A00(r5, r6, r0)
            X.4WU r0 = new X.4WU
            r0.<init>(r6)
            r6.setTag(r0)
        L_0x003e:
            X.3pP r0 = r2.A02
            X.4EZ r0 = r0.A01
            android.content.Context r2 = r2.A01
            android.view.View r1 = r0.A04(r2, r5)
            r0 = 2131435896(0x7f0b2178, float:1.8493647E38)
            X.C261564Ab.A00(r5, r1, r0)
            X.3TP r3 = new X.3TP
            r3.<init>(r2, r14)
            r3.setLayoutParams(r7)
            r3.addView(r5)
            java.lang.Object r2 = r1.getTag()
            boolean r0 = r2 instanceof X.AnonymousClass4EA
            if (r0 == 0) goto L_0x007a
            X.4EA r2 = (X.AnonymousClass4EA) r2
            if (r2 == 0) goto L_0x007a
            if (r6 == 0) goto L_0x007b
            java.lang.Object r1 = r6.getTag()
        L_0x006b:
            boolean r0 = r1 instanceof X.C254003rm
            if (r0 == 0) goto L_0x0072
            r4 = r1
            X.3rm r4 = (X.C254003rm) r4
        L_0x0072:
            X.3s2 r0 = new X.3s2
            r0.<init>(r3, r4, r2)
            r3.setTag(r0)
        L_0x007a:
            return r3
        L_0x007b:
            r1 = r4
            goto L_0x006b
        L_0x007d:
            X.3pP r0 = r2.A02
            X.3pR r1 = r0.A00
            android.content.Context r0 = r2.A01
            android.view.View r6 = r1.A04(r0, r5)
            r0 = 2131435930(0x7f0b219a, float:1.8493716E38)
            X.C261564Ab.A00(r5, r6, r0)
            goto L_0x003e
        L_0x008e:
            r6 = r4
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C252603pN.A00(android.view.ViewGroup, boolean):X.3TP");
    }
}
