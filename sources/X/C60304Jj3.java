package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.channels.model.AddChannelsRowChannelInfo;

/* renamed from: X.Jj3  reason: case insensitive filesystem */
public final class C60304Jj3 extends 2YL {
    public AddChannelsRowChannelInfo A00;
    public final UserSession A01;
    public final C62030KWg A02;
    public final 1Av A03;
    public final AnonymousClass0eM A04 = AnonymousClass0eN.A01(MMQ.A00(this, 12));
    public final 05G A05;
    public final 05G A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0Ud A08;
    public final boolean A09;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r10 == null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass4DH r9, com.instagram.creation.channels.model.AddChannelsRowChannelInfo r10, boolean r11) {
        /*
            r8 = this;
            r5 = r8
            boolean r0 = r8.A09
            if (r0 != 0) goto L_0x0010
            r8.A00 = r10
            if (r11 == 0) goto L_0x000c
            r0 = 1
            if (r10 != 0) goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            A01(r8, r0)
        L_0x0010:
            X.07U r3 = X.07U.A05
            r4 = r9
            X.07Z r2 = r9.getViewLifecycleOwner()
            X.0xx r0 = X.AnonymousClass07a.A00(r2)
            r6 = 0
            r7 = 3
            X.MHF r1 = new X.MHF
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60304Jj3.A03(X.4DH, com.instagram.creation.channels.model.AddChannelsRowChannelInfo, boolean):void");
    }

    public static final C61084JwM A00(C60304Jj3 jj3) {
        return new C61084JwM((C62320sa) MMQ.A00(jj3, 13), (C62320sa) MMQ.A00(jj3, 14), 4);
    }

    public static final void A01(C60304Jj3 jj3, boolean z) {
        Object jyp;
        AddChannelsRowChannelInfo addChannelsRowChannelInfo = jj3.A00;
        05G r3 = jj3.A06;
        if (addChannelsRowChannelInfo != null) {
            C61084JwM A002 = A00(jj3);
            int i = 1;
            if (z) {
                i = 0;
            }
            jyp = new C53520Gpq(A002, addChannelsRowChannelInfo, i);
        } else {
            jyp = new C61196Jyp(A00(jj3));
        }
        r3.Epw(jyp);
    }

    public final String A02() {
        AddChannelsRowChannelInfo addChannelsRowChannelInfo;
        if (C53520Gpq.A00(0, this.A06.getValue()) || (addChannelsRowChannelInfo = this.A00) == null) {
            return null;
        }
        return addChannelsRowChannelInfo.A01;
    }

    public C60304Jj3(UserSession userSession, C62030KWg kWg, boolean z) {
        AnonymousClass7TG.A1O(userSession, kWg);
        this.A01 = userSession;
        this.A02 = kWg;
        this.A09 = z;
        02z A10 = DbS.A10(new C61196Jyp(A00(this)));
        this.A06 = A10;
        this.A08 = 10b.A03(A10);
        02z A012 = 106.A01(KN6.A00);
        this.A05 = A012;
        this.A07 = 10b.A03(A012);
        this.A03 = 1Au.A00(userSession);
    }
}
