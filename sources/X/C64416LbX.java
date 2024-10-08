package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.LbX  reason: case insensitive filesystem */
public final class C64416LbX implements AnonymousClass94T {
    public L34 A00;
    public final UserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, new C13350TVx(this, 16));

    public final void cleanup() {
        this.A00 = null;
    }

    public C64416LbX(UserSession userSession) {
        this.A01 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CN8() {
        /*
            r13 = this;
            X.02m r1 = X.C51965G9l.A0l()
            r0 = 122955850(0x754284a, float:1.5960947E-34)
            X.3zy r4 = new X.3zy
            r4.<init>(r1, r0)
            r4.A00()
            X.0eM r6 = r13.A02
            java.lang.Object r0 = r6.getValue()
            X.Oq2 r0 = (X.C71742Oq2) r0
            boolean r0 = r0.CZg()
            if (r0 != 0) goto L_0x017a
            r3 = 0
            r1 = 0
            java.lang.String r0 = "Prediction is not enabled"
            X.40G r2 = new X.40G
            r2.<init>(r3, r0, r1)
        L_0x0026:
            java.lang.String r0 = "dependency_download_end"
            r4.A01(r0)
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0036
            r1 = 0
        L_0x0030:
            java.lang.String r0 = r2.A01
            r4.A04(r1, r0)
            return
        L_0x0036:
            java.lang.Object r0 = r6.getValue()
            X.Oq2 r0 = (X.C71742Oq2) r0
            X.0gq r3 = r0.A00
            r2 = 1
            if (r3 == 0) goto L_0x0177
            r0 = 36326506972854060(0x810ec4000c372c, double:3.036367512511075E-306)
            boolean r0 = r3.Agw(r0)
            if (r0 != r2) goto L_0x0177
        L_0x004c:
            r8 = 0
            r7 = 0
            if (r2 != 0) goto L_0x0067
            java.lang.String r0 = "Blocklist is not enabled"
        L_0x0052:
            X.40G r2 = new X.40G
            r2.<init>(r7, r0, r8)
        L_0x0057:
            java.lang.String r0 = "create_blocklist_end"
            r4.A01(r0)
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0030
            java.lang.Object r0 = r2.A00
            X.L34 r0 = (X.L34) r0
            r13.A00 = r0
            goto L_0x0030
        L_0x0067:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.950 r5 = X.C3733194w.A00(r0)
            java.lang.Object r3 = r6.getValue()
            X.Oq2 r3 = (X.C71742Oq2) r3
            java.lang.Object r0 = r6.getValue()
            X.Oq2 r0 = (X.C71742Oq2) r0
            X.0gq r2 = r0.A00
            if (r2 == 0) goto L_0x0088
            r0 = 36889456926327634(0x830ec4000d0352, double:3.392379329905278E-306)
            java.lang.String r0 = r2.C1i(r0)
            if (r0 != 0) goto L_0x008a
        L_0x0088:
            java.lang.String r0 = "invalid"
        L_0x008a:
            X.40G r1 = r5.A00(r3, r0)
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0095
            java.lang.String r0 = r1.A01
            goto L_0x0052
        L_0x0095:
            java.lang.Object r0 = r1.A00
            java.lang.String r0 = (java.lang.String) r0
            java.io.File r5 = X.AnonymousClass7TE.A0t(r0)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L_0x0173
            boolean r0 = r5.canRead()
            if (r0 == 0) goto L_0x0173
            X.L33 r3 = new X.L33
            r3.<init>()
            X.L5g r2 = r3.A00
            X.L35 r0 = r2.A01
            r10 = 1
            r0.A00 = r10
            r0 = 28
            X.TY5 r1 = new X.TY5     // Catch:{ Exception -> 0x0167 }
            r1.<init>(r3, r0)     // Catch:{ Exception -> 0x0167 }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ Exception -> 0x0167 }
            X.C272134kB.A02(r5, r0, r1)     // Catch:{ Exception -> 0x0167 }
            X.L5h r9 = r2.A00     // Catch:{ Exception -> 0x0167 }
            java.util.concurrent.LinkedBlockingDeque r11 = new java.util.concurrent.LinkedBlockingDeque     // Catch:{ Exception -> 0x0167 }
            r11.<init>()     // Catch:{ Exception -> 0x0167 }
            X.LMt r2 = r9.A00     // Catch:{ Exception -> 0x0167 }
            java.util.Map r0 = r2.A03     // Catch:{ Exception -> 0x0167 }
            java.util.Iterator r1 = X.AnonymousClass7TF.A0v(r0)     // Catch:{ Exception -> 0x0167 }
        L_0x00d0:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r0 = r1.next()     // Catch:{ Exception -> 0x0167 }
            X.LMt r0 = (X.C64099LMt) r0     // Catch:{ Exception -> 0x0167 }
            r0.A01 = r2     // Catch:{ Exception -> 0x0167 }
            r11.add(r0)     // Catch:{ Exception -> 0x0167 }
            goto L_0x00d0
        L_0x00e2:
            boolean r0 = r11.isEmpty()     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x015b
            java.lang.Object r6 = r11.remove()     // Catch:{ Exception -> 0x0167 }
            X.LMt r6 = (X.C64099LMt) r6     // Catch:{ Exception -> 0x0167 }
            java.util.Map r5 = r6.A03     // Catch:{ Exception -> 0x0167 }
            java.util.Iterator r12 = X.DbV.A16(r5)     // Catch:{ Exception -> 0x0167 }
        L_0x00f4:
            boolean r0 = r12.hasNext()     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x00e2
            java.lang.Object r1 = r12.next()     // Catch:{ Exception -> 0x0167 }
            java.lang.Character r1 = (java.lang.Character) r1     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r3 = r5.get(r1)     // Catch:{ Exception -> 0x0167 }
            X.LMt r3 = (X.C64099LMt) r3     // Catch:{ Exception -> 0x0167 }
            if (r3 != 0) goto L_0x010d
            X.LMt r0 = r6.A04     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x010d
            r3 = r0
        L_0x010d:
            r11.add(r3)     // Catch:{ Exception -> 0x0167 }
            X.LMt r2 = r6.A01     // Catch:{ Exception -> 0x0167 }
        L_0x0112:
            java.util.Map r0 = r2.A03     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x0167 }
            X.LMt r0 = (X.C64099LMt) r0     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0123
            X.LMt r0 = r2.A04     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0123
            X.LMt r2 = r2.A01     // Catch:{ Exception -> 0x0167 }
            goto L_0x0112
        L_0x0123:
            java.util.Map r0 = r2.A03     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ Exception -> 0x0167 }
            X.LMt r1 = (X.C64099LMt) r1     // Catch:{ Exception -> 0x0167 }
            if (r1 != 0) goto L_0x0132
            X.LMt r0 = r2.A04     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x0132
            r1 = r0
        L_0x0132:
            r3.A01 = r1     // Catch:{ Exception -> 0x0167 }
            java.util.Set r0 = r1.A00     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x013c
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ Exception -> 0x0167 }
        L_0x013c:
            java.util.Iterator r2 = r0.iterator()     // Catch:{ Exception -> 0x0167 }
        L_0x0140:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0167 }
            if (r0 == 0) goto L_0x00f4
            java.lang.Object r1 = r2.next()     // Catch:{ Exception -> 0x0167 }
            X.M1X r1 = (X.M1X) r1     // Catch:{ Exception -> 0x0167 }
            java.util.Set r0 = r3.A00     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0157
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch:{ Exception -> 0x0167 }
            r0.<init>()     // Catch:{ Exception -> 0x0167 }
            r3.A00 = r0     // Catch:{ Exception -> 0x0167 }
        L_0x0157:
            r0.add(r1)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0140
        L_0x015b:
            X.L34 r0 = new X.L34     // Catch:{ Exception -> 0x0167 }
            r0.<init>(r9)     // Catch:{ Exception -> 0x0167 }
            X.40G r2 = new X.40G     // Catch:{ Exception -> 0x0167 }
            r2.<init>(r0, r7, r10)     // Catch:{ Exception -> 0x0167 }
            goto L_0x0057
        L_0x0167:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            X.40G r2 = new X.40G
            r2.<init>(r7, r0, r8)
            goto L_0x0057
        L_0x0173:
            java.lang.String r0 = "Blocklist file does not exist or is not readable"
            goto L_0x0052
        L_0x0177:
            r2 = 0
            goto L_0x004c
        L_0x017a:
            com.instagram.common.session.UserSession r0 = r13.A01
            X.950 r1 = X.C3733194w.A00(r0)
            java.lang.Object r0 = r6.getValue()
            java.util.List r0 = X.AnonymousClass7TE.A1I(r0)
            X.40G r2 = r1.A01(r0)
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64416LbX.CN8():void");
    }
}
