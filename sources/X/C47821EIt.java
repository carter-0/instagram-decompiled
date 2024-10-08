package X;

import com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs;
import com.instagram.direct.channels.analytics.ChannelCreationSource;

/* renamed from: X.EIt  reason: case insensitive filesystem */
public final class C47821EIt extends C46732DkL {
    public final int A00;
    public final ChannelCreationFlowExtraArgs A01;
    public final C50337FYu A02;
    public final ChannelCreationSource A03;
    public final C50338FYv A04;
    public final AnonymousClass0Ud A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007d, code lost:
        if (r15.A02 == null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (X.182.A06(X.0Tu.A05, r14, 36330226413879826L) == false) goto L_0x0094;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C47821EIt(android.app.Application r13, com.instagram.common.session.UserSession r14, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs r15, X.C313756gx r16, com.instagram.direct.channels.analytics.ChannelCreationSource r17, X.C50338FYv r18, X.EV0 r19, java.lang.Integer r20) {
        /*
            r12 = this;
            r7 = r14
            X.FYu r1 = X.C48796EkJ.A00(r14)
            r8 = r16
            r2 = r18
            X.AnonymousClass7TG.A1U(r14, r8, r2)
            r0 = 4
            r6 = r13
            X.0qQ.A0B(r13, r0)
            r0 = 6
            r9 = r17
            X.AnonymousClass7TF.A1E(r9, r0, r15)
            r0 = 9
            X.0qQ.A0B(r1, r0)
            r5 = r12
            r10 = r19
            r11 = r20
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.A04 = r2
            r12.A03 = r9
            r12.A01 = r15
            r12.A02 = r1
            com.instagram.direct.channels.analytics.ChannelCreationSource r0 = com.instagram.direct.channels.analytics.ChannelCreationSource.MESSAGING_LED
            r3 = 0
            if (r9 != r0) goto L_0x003e
            X.0Tu r2 = X.0Tu.A05
            r0 = 36328542786633124(0x81109e00013da4, double:3.037654969342519E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 != 0) goto L_0x0067
        L_0x003e:
            com.instagram.creatormessaging.intf.CategorySelectionScreenArgs r0 = r15.A00
            if (r0 != 0) goto L_0x00c7
            X.4Cl r0 = X.DbX.A0m(r14)
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B3v()
            if (r0 == 0) goto L_0x005a
            java.lang.Integer r0 = r0.Aq0()
            if (r0 == 0) goto L_0x005a
            int r1 = r0.intValue()
            r0 = 250(0xfa, float:3.5E-43)
            if (r1 >= r0) goto L_0x00c7
        L_0x005a:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321846932547383(0x810a8700002737, double:3.0334204842566564E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            if (r0 == 0) goto L_0x00c7
        L_0x0067:
            r0 = 1
        L_0x0068:
            r12.A08 = r0
            boolean r0 = X.C375489Dt.A01(r14)
            r12.A06 = r0
            boolean r0 = X.C375479Ds.A01(r14)
            r12.A07 = r0
            java.lang.String r0 = r15.A01
            if (r0 == 0) goto L_0x007f
            java.lang.String r0 = r15.A02
            r1 = 1
            if (r0 != 0) goto L_0x0080
        L_0x007f:
            r1 = 0
        L_0x0080:
            r0 = r1 ^ 1
            r12.A0A = r0
            if (r1 == 0) goto L_0x0094
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330226413879826(0x81122600024212, double:3.0387197019927564E-306)
            boolean r0 = X.182.A06(r2, r14, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            r12.A0B = r1
            boolean r0 = r12.A0A
            if (r0 != 0) goto L_0x00c5
            if (r1 != 0) goto L_0x00c5
        L_0x009d:
            r12.A09 = r3
            X.0Ud r4 = r12.A0F
            r0 = 2
            X.MC0 r3 = new X.MC0
            r3.<init>(r0, r12, r4)
            X.6oS r2 = X.C318116oQ.A00(r12)
            X.109 r1 = X.AnonymousClass10A.A00
            java.lang.Object r0 = r4.getValue()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            X.EIr r0 = A04(r12, r0)
            X.05F r0 = X.10b.A02(r0, r2, r3, r1)
            r12.A05 = r0
            r0 = 1693104323(0x64eab8c3, float:3.4638813E22)
            r12.A00 = r0
            return
        L_0x00c5:
            r3 = 1
            goto L_0x009d
        L_0x00c7:
            r0 = 0
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47821EIt.<init>(android.app.Application, com.instagram.common.session.UserSession, com.instagram.creatormessaging.intf.ChannelCreationFlowExtraArgs, X.6gx, com.instagram.direct.channels.analytics.ChannelCreationSource, X.FYv, X.EV0, java.lang.Integer):void");
    }

    public static final F0V A03(C47821EIt eIt) {
        String str = eIt.A03.A00;
        boolean z = false;
        if (C46732DkL.A00(eIt) == 2) {
            z = true;
        }
        return new F0V(false, Boolean.valueOf(z), Boolean.valueOf(eIt.A03), (Boolean) null, (Integer) null, Integer.valueOf(((EWM) eIt.A0G.getValue()).A00), str);
    }

    private final GKO A02(int i) {
        int i2;
        if (i == 0) {
            i2 = 2131959370;
        } else if (i == 1) {
            i2 = 2131959314;
        } else if (i == 2) {
            i2 = 2131959368;
            if (this.A08) {
                i2 = 2131959369;
            }
        } else if (i == 5) {
            i2 = 2131972709;
        } else {
            throw DbW.A0a("Unsupported audience type: ", i);
        }
        return DbS.A0Q(new Object[0], i2);
    }

    public static final C47819EIr A04(C47821EIt eIt, int i) {
        String str;
        ChannelCreationFlowExtraArgs channelCreationFlowExtraArgs = eIt.A01;
        int i2 = i;
        if (channelCreationFlowExtraArgs.A01 != null && (str = channelCreationFlowExtraArgs.A02) != null) {
            return new C47819EIr(eIt.A02(i), str, i2, false, false, false, true);
        }
        return new C47819EIr(eIt.A02(i), (String) null, i2, eIt.A06, eIt.A07, AnonymousClass7TF.A1S(C46732DkL.A00(eIt), 2), false);
    }
}
