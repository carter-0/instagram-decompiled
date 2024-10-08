package com.instagram.archive.data;

import X.02z;
import X.05G;
import X.10b;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0t1;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass9I8;
import X.C252733pa;
import X.C262224Cq;
import X.C323026wo;
import X.C323046wr;
import X.C323056ws;
import X.C376889Js;
import X.C377369Lo;
import X.C58736Iwj;
import com.instagram.common.session.UserSession;

public final class HighlightsSettingsRepository extends C252733pa {
    public final C323026wo A00;
    public final UserSession A01;
    public final 05G A02;
    public final AnonymousClass0Ud A03;

    public HighlightsSettingsRepository(C323026wo r6, UserSession userSession) {
        super("HighlightsSettings", AnonymousClass43D.A01(1600862899, 3));
        this.A01 = userSession;
        this.A00 = r6;
        02z r0 = new 02z(new C323046wr(new AnonymousClass9I8(AnonymousClass0t1.A01.A01(userSession).A2S(), false, 1)));
        this.A02 = r0;
        this.A03 = 10b.A03(r0);
        C262224Cq r3 = this.A01;
        C376889Js r2 = new C376889Js(this, (AnonymousClass4D7) null, 6);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036 A[LOOP:0: B:13:0x0036->B:14:0x004b, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a A[LOOP:1: B:18:0x005a->B:19:0x0076, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.archive.data.HighlightsSettingsRepository r7, X.AnonymousClass4D7 r8, X.0sP r9, X.0sP r10, boolean r11, boolean r12, boolean r13, boolean r14) {
        /*
            r5 = 1
            boolean r0 = r8 instanceof X.C376729Jc
            if (r0 == 0) goto L_0x00ce
            r4 = r8
            X.9Jc r4 = (X.C376729Jc) r4
            int r0 = r4.A06
            if (r0 != r5) goto L_0x00ce
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ce
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0017:
            java.lang.Object r1 = r4.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0079
            if (r0 != r5) goto L_0x00d5
            boolean r12 = r4.A05
            boolean r11 = r4.A04
            java.lang.Object r10 = r4.A02
            X.0sP r10 = (X.0sP) r10
            java.lang.Object r7 = r4.A01
            com.instagram.archive.data.HighlightsSettingsRepository r7 = (com.instagram.archive.data.HighlightsSettingsRepository) r7
            X.0eS.A00(r1)
        L_0x0030:
            boolean r0 = r1 instanceof X.C239793Ih
            X.05G r4 = r7.A02
            if (r0 == 0) goto L_0x005a
        L_0x0036:
            java.lang.Object r2 = r4.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.6wr r0 = new X.6wr
            r0.<init>(r1)
            boolean r0 = r4.AIY(r2, r0)
            if (r0 == 0) goto L_0x0036
        L_0x004d:
            X.05G r0 = r7.A02
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C323046wr
        L_0x0055:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L_0x005a:
            java.lang.Object r3 = r4.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r2 = r10.invoke(r0)
            java.lang.String r0 = "cannot mutate settings"
            java.lang.Error r1 = new java.lang.Error
            r1.<init>(r0)
            X.KAk r0 = new X.KAk
            r0.<init>(r2, r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x005a
            goto L_0x004d
        L_0x0079:
            X.0eS.A00(r1)
            if (r14 != 0) goto L_0x0080
            if (r12 == r11) goto L_0x00cc
        L_0x0080:
            X.05G r3 = r7.A02
            java.lang.Object r0 = r3.getValue()
            boolean r0 = r0 instanceof X.C61506KAl
            if (r0 != 0) goto L_0x00cc
            if (r13 != 0) goto L_0x00b4
        L_0x008c:
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.KAl r0 = new X.KAl
            r0.<init>(r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x008c
            r4.A01 = r7
            r4.A02 = r10
            r4.A04 = r11
            r4.A05 = r12
            r4.A00 = r5
            java.lang.Object r1 = r9.invoke(r4)
            if (r1 != r6) goto L_0x0030
            return r6
        L_0x00b4:
            java.lang.Object r2 = r3.getValue()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            java.lang.Object r1 = r10.invoke(r0)
            X.6wr r0 = new X.6wr
            r0.<init>(r1)
            boolean r0 = r3.AIY(r2, r0)
            if (r0 == 0) goto L_0x00b4
            goto L_0x004d
        L_0x00cc:
            r0 = 0
            goto L_0x0055
        L_0x00ce:
            X.9Jc r4 = new X.9Jc
            r4.<init>(r7, r8, r5)
            goto L_0x0017
        L_0x00d5:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.archive.data.HighlightsSettingsRepository.A00(com.instagram.archive.data.HighlightsSettingsRepository, X.4D7, X.0sP, X.0sP, boolean, boolean, boolean, boolean):java.lang.Object");
    }

    public final Object A02(AnonymousClass4D7 r10, boolean z) {
        boolean z2 = A01().A02;
        return A00(this, r10, new HighlightsSettingsRepository$setMyWeekEnabled$2(this, (AnonymousClass4D7) null, z), new C58736Iwj(4, this, z), z, z2, false, false);
    }

    public final Object A03(AnonymousClass4D7 r10, boolean z, boolean z2, boolean z3) {
        boolean z4 = A01().A01;
        return A00(this, r10, new HighlightsSettingsRepository$setCardsEnabled$2(this, (AnonymousClass4D7) null, z), new C377369Lo(0, this, z), z, z4, z2, z3);
    }

    public final AnonymousClass9I8 A01() {
        return (AnonymousClass9I8) ((C323056ws) this.A03.getValue()).A00;
    }
}
