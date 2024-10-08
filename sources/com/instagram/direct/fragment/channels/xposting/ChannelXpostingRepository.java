package com.instagram.direct.fragment.channels.xposting;

import X.0qQ;
import X.0wb;
import X.2Dr;
import X.2L2;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass43D;
import X.AnonymousClass48S;
import X.C242243Te;
import X.C252733pa;
import X.C46570DhC;
import X.C61073JwB;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class ChannelXpostingRepository extends C252733pa {
    public final UserSession A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C46570DhC(this, 27));

    public static final void A00(C61073JwB jwB, ChannelXpostingRepository channelXpostingRepository, DirectThreadKey directThreadKey) {
        ImmutableList immutableList;
        2Dr A002 = 2L2.A00(channelXpostingRepository.A00);
        synchronized (A002) {
            0qQ.A0B(directThreadKey, 0);
            AnonymousClass48S A0P = A002.A0P(directThreadKey);
            if (A0P == null) {
                0wb.A03("Null thread entry", "Entry should exist before function call.");
            } else {
                C242243Te A0L = A0P.A0L();
                0qQ.A07(A0L);
                if (jwB != null) {
                    immutableList = ImmutableList.of(jwB);
                } else {
                    immutableList = null;
                }
                A0L.A0G = immutableList;
                2Dr.A0E(A0P.A0M(A0L), A002, false);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDv, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r7, X.AnonymousClass4D7 r8) {
        /*
            r6 = this;
            r3 = 47
            boolean r0 = X.C66143MDv.A02(r3, r8)
            if (r0 == 0) goto L_0x0076
            r5 = r8
            X.MDv r5 = (X.C66143MDv) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0076
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x004d
            if (r0 != r3) goto L_0x0080
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0044
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.CFF r0 = (X.CFF) r0
            java.util.List r0 = r0.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0037:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0043
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x007b
            X.5sO r1 = X.DbU.A0f()
        L_0x0043:
            return r1
        L_0x0044:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0037
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.Dba.A0j(r3, r0, r7)
            X.1NY r2 = X.AnonymousClass7TG.A0b(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r0 = "direct_v2/threads/%s/get_all_channels_for_xposting/"
            r2.A0K(r0, r1)
            java.lang.Class<X.CFF> r1 = X.CFF.class
            java.lang.Class<X.D12> r0 = X.D12.class
            X.1OC r1 = X.DbU.A0S(r2, r1, r0)
            r5.A00 = r3
            r0 = 542899570(0x205bfd72, float:1.863388E-19)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x0076:
            X.MDv r5 = X.C41847B3o.A1H(r6, r8, r3)
            goto L_0x0016
        L_0x007b:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.direct.fragment.channels.xposting.ChannelXpostingRepository.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    public ChannelXpostingRepository(UserSession userSession) {
        super("channels", AnonymousClass43D.A00(542899570));
        this.A00 = userSession;
    }
}
