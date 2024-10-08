package X;

import com.facebook.msys.mca.MailboxFeature;

/* renamed from: X.Opk  reason: case insensitive filesystem */
public final class C71726Opk implements MailboxFeature.DbConnectionResolutionCallback {
    public final int A00;
    public final Object A01;

    public C71726Opk(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C71726Opk A00(Object obj, int i) {
        return new C71726Opk(obj, i);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x04bb, code lost:
        r1 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object run(com.facebook.msys.mca.Mailbox r18, com.facebook.msys.mci.sqliteholder.SqliteHolder r19) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.A00
            r5 = r18
            r6 = r19
            switch(r0) {
                case 0: goto L_0x04cb;
                case 1: goto L_0x04bd;
                case 2: goto L_0x049f;
                case 3: goto L_0x048b;
                case 4: goto L_0x047d;
                case 5: goto L_0x046e;
                case 6: goto L_0x0468;
                case 7: goto L_0x0462;
                case 8: goto L_0x045c;
                case 9: goto L_0x044d;
                case 10: goto L_0x0441;
                case 11: goto L_0x0422;
                case 12: goto L_0x0406;
                case 13: goto L_0x0400;
                case 14: goto L_0x03ea;
                case 15: goto L_0x03d5;
                case 16: goto L_0x03c5;
                case 17: goto L_0x03b9;
                case 18: goto L_0x03ab;
                case 19: goto L_0x039d;
                case 20: goto L_0x0387;
                case 21: goto L_0x0376;
                case 22: goto L_0x035f;
                case 23: goto L_0x033e;
                case 24: goto L_0x0327;
                case 25: goto L_0x0310;
                case 26: goto L_0x02fa;
                case 27: goto L_0x02ea;
                case 28: goto L_0x02d6;
                case 29: goto L_0x02be;
                case 30: goto L_0x02ad;
                case 31: goto L_0x029e;
                case 32: goto L_0x028f;
                case 33: goto L_0x0280;
                case 34: goto L_0x0271;
                case 35: goto L_0x0269;
                case 36: goto L_0x0261;
                case 37: goto L_0x024b;
                case 38: goto L_0x0234;
                case 39: goto L_0x0225;
                case 40: goto L_0x020e;
                case 41: goto L_0x01f7;
                case 42: goto L_0x01e0;
                case 43: goto L_0x01c9;
                case 44: goto L_0x01ba;
                case 45: goto L_0x01ac;
                case 46: goto L_0x0196;
                case 47: goto L_0x0186;
                case 48: goto L_0x0176;
                case 49: goto L_0x0168;
                case 50: goto L_0x015b;
                case 51: goto L_0x014e;
                case 52: goto L_0x013f;
                case 53: goto L_0x012e;
                case 54: goto L_0x011c;
                case 55: goto L_0x010f;
                case 56: goto L_0x00ff;
                case 57: goto L_0x00ec;
                case 58: goto L_0x00e5;
                case 59: goto L_0x00c2;
                case 60: goto L_0x00a0;
                case 61: goto L_0x008a;
                case 62: goto L_0x007c;
                case 63: goto L_0x006d;
                case 64: goto L_0x005d;
                case 65: goto L_0x004e;
                case 66: goto L_0x0041;
                case 67: goto L_0x0034;
                case 68: goto L_0x0027;
                case 69: goto L_0x0018;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 54
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x0018:
            java.lang.Object r0 = r1.A01
            X.Oou r0 = (X.C71675Oou) r0
            long r2 = r0.A02
            long r4 = r0.A03
            r1 = 41
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJJO(r1, r2, r4, r6)
            return r2
        L_0x0027:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 33
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x0034:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 32
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x0041:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 31
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x004e:
            java.lang.Object r0 = r1.A01
            X.Ope r0 = (X.C71720Ope) r0
            long r2 = r0.A02
            java.lang.String r1 = r0.A05
            r0 = 29
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOO(r0, r2, r1, r6)
            return r2
        L_0x005d:
            java.lang.Object r0 = r1.A01
            X.Ope r0 = (X.C71720Ope) r0
            long r3 = r0.A02
            java.lang.String r5 = r0.A05
            r7 = 0
            r2 = 24
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOOZ(r2, r3, r5, r6, r7)
            return r2
        L_0x006d:
            java.lang.Object r0 = r1.A01
            X.Oov r0 = (X.C71676Oov) r0
            int r3 = r0.A01
            long r1 = r0.A03
            r0 = 23
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            return r2
        L_0x007c:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r2 = r0.A02
            r1 = 0
            r0 = 17
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOO(r0, r2, r1, r6)
            return r2
        L_0x008a:
            java.lang.Object r0 = r1.A01
            X.OpG r0 = (X.C71696OpG) r0
            long r8 = r0.A02
            long r10 = r0.A01
            java.util.List r12 = r0.A05
            java.util.List r13 = r0.A06
            java.util.List r14 = r0.A07
            r7 = 15
            r15 = r6
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJJOOOO(r7, r8, r10, r12, r13, r14, r15)
            return r2
        L_0x00a0:
            java.lang.Object r0 = r1.A01
            X.Op5 r0 = (X.C71686Op5) r0
            long r2 = r0.A02
            java.lang.String r4 = r0.A06
            java.lang.Object r5 = r0.A05
            r1 = 14
            java.lang.Object r2 = com.facebook.tam.mca.MailboxTamJNI.dispatchCqlOJOOO(r1, r2, r4, r5, r6)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r0 = 0
            r1 = r2[r0]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 1
            r0 = r2[r0]
            java.lang.Number r0 = (java.lang.Number) r0
            X.OT6 r2 = new X.OT6
            r2.<init>(r1, r0)
            return r2
        L_0x00c2:
            java.lang.Object r0 = r1.A01
            X.Oon r0 = (X.C71668Oon) r0
            java.util.List r4 = r0.A03
            java.util.List r5 = r0.A02
            r7 = 0
            boolean r8 = r0.A04
            r3 = 40
            r9 = r7
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOOOOZZZ(r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            r1 = r2[r7]
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 1
            r0 = r2[r0]
            java.lang.String r0 = (java.lang.String) r0
            X.OT5 r2 = new X.OT5
            r2.<init>(r0, r1)
            return r2
        L_0x00e5:
            r0 = 36
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOO(r0, r6)
            return r2
        L_0x00ec:
            java.lang.Object r0 = r1.A01
            X.Oox r0 = (X.C71678Oox) r0
            long r8 = r0.A01
            long r10 = r0.A02
            java.lang.Object r12 = r0.A05
            r13 = 0
            r7 = 33
            r14 = r6
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJJOOO(r7, r8, r10, r12, r13, r14)
            return r2
        L_0x00ff:
            java.lang.Object r0 = r1.A01
            X.OoY r0 = (X.C71653OoY) r0
            long r1 = r0.A00
            long r3 = r0.A01
            r5 = 0
            r0 = 31
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJJOO(r0, r1, r3, r5, r6)
            return r2
        L_0x010f:
            java.lang.Object r0 = r1.A01
            X.Oog r0 = (X.C71661Oog) r0
            long r1 = r0.A01
            r0 = 27
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x011c:
            java.lang.Object r0 = r1.A01
            X.Oox r0 = (X.C71678Oox) r0
            long r8 = r0.A01
            long r10 = r0.A02
            r12 = 0
            r7 = 26
            r13 = r12
            r14 = r6
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJJOOO(r7, r8, r10, r12, r13, r14)
            return r2
        L_0x012e:
            java.lang.Object r0 = r1.A01
            X.Ooz r0 = (X.C71680Ooz) r0
            long r2 = r0.A01
            java.lang.Object r4 = r0.A05
            java.lang.Object r5 = r0.A04
            r1 = 25
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJOOO(r1, r2, r4, r5, r6)
            return r2
        L_0x013f:
            java.lang.Object r0 = r1.A01
            X.Oog r0 = (X.C71661Oog) r0
            long r2 = r0.A01
            java.lang.Object r1 = r0.A04
            r0 = 24
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJOO(r0, r2, r1, r6)
            return r2
        L_0x014e:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            long r1 = r0.A01
            r0 = 23
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x015b:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            long r1 = r0.A01
            r0 = 22
            java.lang.Object r2 = com.facebook.shim.mca.MailboxShimJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x0168:
            java.lang.Object r0 = r1.A01
            X.OoX r0 = (X.C71652OoX) r0
            r2 = 2
            r3 = 4
            java.lang.String r4 = r0.A03
            r1 = 5
            java.lang.Object r2 = com.facebook.secureconsentframework.mca.MailboxSecureConsentFrameworkJNI.dispatchDasmOIIOOO(r1, r2, r3, r4, r5, r6)
            return r2
        L_0x0176:
            java.lang.Object r0 = r1.A01
            X.Oow r0 = (X.C71677Oow) r0
            int r3 = r0.A01
            int r4 = r0.A02
            boolean r7 = r0.A05
            r2 = 4
            java.lang.Object r2 = com.facebook.secureconsentframework.mca.MailboxSecureConsentFrameworkJNI.dispatchDasmOIIOOZ(r2, r3, r4, r5, r6, r7)
            return r2
        L_0x0186:
            r0 = 0
            java.lang.Object r0 = com.facebook.safetyinterventions.mca.MailboxSafetyInterventionsJNI.dispatchCqlOO(r0, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NBC r1 = new X.NBC
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0196:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            long r1 = r0.A01
            r0 = 1
            java.lang.Object r0 = com.facebook.proactivewarningsnoncore.mca.MailboxProactiveWarningsNonCoreJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NBB r1 = new X.NBB
            r1.<init>(r0)
            goto L_0x04b5
        L_0x01ac:
            java.lang.Object r0 = r1.A01
            X.Oog r0 = (X.C71661Oog) r0
            long r1 = r0.A01
            r3 = 0
            r0 = 0
            r4 = r3
            java.lang.Object r2 = com.facebook.proactivewarnings.mca.MailboxProactiveWarningsJNI.dispatchDasmOJOOOO(r0, r1, r3, r4, r5, r6)
            return r2
        L_0x01ba:
            java.lang.Object r0 = r1.A01
            X.Ook r0 = (X.C71665Ook) r0
            int r2 = r0.A01
            java.lang.String r1 = r0.A04
            r0 = 6
            java.lang.Object r1 = com.facebook.notificationengineinstagramintegrator.mca.MailboxNotificationEngineInstagramIntegratorJNI.dispatchCqlOIOO(r0, r2, r1, r6)
            goto L_0x04b5
        L_0x01c9:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 75
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAw r1 = new X.NAw
            r1.<init>(r0)
            goto L_0x04b5
        L_0x01e0:
            java.lang.Object r0 = r1.A01
            X.Ooh r0 = (X.C71662Ooh) r0
            java.lang.Object r1 = r0.A04
            r0 = 74
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOOO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAu r1 = new X.NAu
            r1.<init>(r0)
            goto L_0x04b5
        L_0x01f7:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 73
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAv r1 = new X.NAv
            r1.<init>(r0)
            goto L_0x04b5
        L_0x020e:
            java.lang.Object r0 = r1.A01
            X.OoU r0 = (X.C71649OoU) r0
            boolean r1 = r0.A03
            r0 = 72
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOOZ(r0, r6, r1)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.6AH r1 = new X.6AH
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0225:
            java.lang.Object r0 = r1.A01
            X.Oov r0 = (X.C71676Oov) r0
            int r3 = r0.A01
            long r1 = r0.A03
            r0 = 71
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            return r2
        L_0x0234:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 64
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAt r1 = new X.NAt
            r1.<init>(r0)
            goto L_0x04b5
        L_0x024b:
            java.lang.Object r0 = r1.A01
            X.Ook r0 = (X.C71665Ook) r0
            java.lang.String r1 = r0.A04
            r0 = 4
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOOO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAr r1 = new X.NAr
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0261:
            r0 = 52
            java.lang.Object r1 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOO(r0, r6)
            goto L_0x04b5
        L_0x0269:
            r0 = 51
            java.lang.Object r1 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOO(r0, r6)
            goto L_0x04b5
        L_0x0271:
            java.lang.Object r0 = r1.A01
            X.Ooy r0 = (X.C71679Ooy) r0
            long r2 = r0.A02
            java.lang.Object r1 = r0.A04
            r0 = 50
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOO(r0, r2, r1, r6)
            return r2
        L_0x0280:
            java.lang.Object r0 = r1.A01
            X.Ooy r0 = (X.C71679Ooy) r0
            long r2 = r0.A02
            java.lang.Object r1 = r0.A04
            r0 = 49
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOO(r0, r2, r1, r6)
            return r2
        L_0x028f:
            java.lang.Object r0 = r1.A01
            X.Oof r0 = (X.C71660Oof) r0
            long r2 = r0.A01
            boolean r1 = r0.A04
            r0 = 48
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOZ(r0, r2, r6, r1)
            return r2
        L_0x029e:
            java.lang.Object r0 = r1.A01
            X.Oov r0 = (X.C71676Oov) r0
            int r3 = r0.A01
            long r1 = r0.A03
            r0 = 47
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            return r2
        L_0x02ad:
            java.lang.Object r0 = r1.A01
            X.Oos r0 = (X.C71673Oos) r0
            int r1 = r0.A00
            long r2 = r0.A03
            long r4 = r0.A02
            r0 = 46
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIJJO(r0, r1, r2, r4, r6)
            return r2
        L_0x02be:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r2 = r0.A02
            r1 = 0
            r0 = 44
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJOZ(r0, r2, r6, r1)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAq r1 = new X.NAq
            r1.<init>(r0)
            goto L_0x04b5
        L_0x02d6:
            java.lang.Object r0 = r1.A01
            X.Oor r0 = (X.C71672Oor) r0
            long r8 = r0.A02
            long r10 = r0.A01
            r12 = 0
            java.lang.String r13 = r0.A05
            r7 = 40
            r14 = r12
            r15 = r6
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJJOOOO(r7, r8, r10, r12, r13, r14, r15)
            return r2
        L_0x02ea:
            r0 = 2
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOO(r0, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAk r1 = new X.NAk
            r1.<init>(r0)
            goto L_0x04b5
        L_0x02fa:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 1
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAh r1 = new X.NAh
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0310:
            java.lang.Object r0 = r1.A01
            X.OpD r0 = (X.C71693OpD) r0
            int r8 = r0.A01
            long r9 = r0.A02
            java.lang.String r11 = r0.A07
            r12 = 0
            java.lang.String r13 = r0.A06
            java.lang.Number r14 = r0.A05
            r7 = 22
            r15 = r6
            java.lang.Object r2 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIJOOOOO(r7, r8, r9, r11, r12, r13, r14, r15)
            return r2
        L_0x0327:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 16
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAn r1 = new X.NAn
            r1.<init>(r0)
            goto L_0x04b5
        L_0x033e:
            java.lang.Object r0 = r1.A01
            X.Op3 r0 = (X.C71684Op3) r0
            int r8 = r0.A02
            int r9 = r0.A00
            long r10 = r0.A04
            long r12 = r0.A03
            r14 = -9223372036854775808
            r7 = 14
            r16 = r6
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOIIJJJO(r7, r8, r9, r10, r12, r14, r16)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAm r1 = new X.NAm
            r1.<init>(r0)
            goto L_0x04b5
        L_0x035f:
            java.lang.Object r0 = r1.A01
            X.Opi r0 = (X.C71724Opi) r0
            long r1 = r0.A02
            r0 = 12
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOJO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAl r1 = new X.NAl
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0376:
            r0 = 8
            java.lang.Object r0 = com.facebook.instagramsecuremessage.mca.MailboxInstagramSecureMessageJNI.dispatchCqlOO(r0, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAj r1 = new X.NAj
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0387:
            java.lang.Object r0 = r1.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.String r1 = r0.A03
            r0 = 0
            java.lang.Object r0 = com.facebook.instagramsearch.mca.MailboxInstagramSearchJNI.dispatchCqlOOO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAg r1 = new X.NAg
            r1.<init>(r0)
            goto L_0x04b5
        L_0x039d:
            java.lang.Object r0 = r1.A01
            X.Ooe r0 = (X.C71659Ooe) r0
            java.lang.String r2 = r0.A03
            boolean r1 = r0.A04
            r0 = 3
            java.lang.Object r2 = com.facebook.instagrampresence.mca.MailboxInstagramPresenceJNI.dispatchDasmOOOOZ(r0, r2, r5, r6, r1)
            return r2
        L_0x03ab:
            java.lang.Object r0 = r1.A01
            X.Ood r0 = (X.C71658Ood) r0
            int r2 = r0.A00
            java.lang.String r1 = r0.A04
            r0 = 1
            java.lang.Object r2 = com.facebook.instagrampresence.mca.MailboxInstagramPresenceJNI.dispatchDasmOIOOO(r0, r2, r1, r5, r6)
            return r2
        L_0x03b9:
            java.lang.Object r0 = r1.A01
            X.Ooj r0 = (X.C71664Ooj) r0
            java.lang.Object r1 = r0.A02
            r0 = 0
            java.lang.Object r2 = com.facebook.instagrampresence.mca.MailboxInstagramPresenceJNI.dispatchDasmOOOO(r0, r1, r5, r6)
            return r2
        L_0x03c5:
            r0 = 1
            java.lang.Object r0 = com.facebook.instagrampresence.mca.MailboxInstagramPresenceJNI.dispatchCqlOO(r0, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAf r1 = new X.NAf
            r1.<init>(r0)
            goto L_0x04b5
        L_0x03d5:
            java.lang.Object r0 = r1.A01
            X.OpB r0 = (X.C71691OpB) r0
            java.lang.String r1 = r0.A05
            java.lang.String r2 = r0.A04
            java.lang.String r3 = r0.A03
            java.lang.String r4 = r0.A06
            r7 = 1
            boolean r8 = r0.A07
            r0 = 0
            java.lang.Object r2 = com.facebook.instagramopenxmareceiverfetch.mca.MailboxInstagramOpenXmaReceiverFetchJNI.dispatchDasmOOOOOOOZZ(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r2
        L_0x03ea:
            java.lang.Object r0 = r1.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r1 = r0.A03
            r0 = 0
            java.lang.Object r0 = com.facebook.instagramopenxmareceiverfetch.mca.MailboxInstagramOpenXmaReceiverFetchJNI.dispatchCqlOOO(r0, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAe r1 = new X.NAe
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0400:
            r0 = 0
            java.lang.Object r2 = com.facebook.globaldeletesettings.mca.MailboxGlobalDeleteSettingsJNI.dispatchCqlOO(r0, r6)
            return r2
        L_0x0406:
            java.lang.Object r0 = r1.A01
            X.Ope r0 = (X.C71720Ope) r0
            int r1 = r0.A01
            long r2 = r0.A02
            java.lang.String r4 = "AdvancedCrypto"
            java.lang.String r5 = r0.A05
            r0 = 3
            java.lang.Object r0 = com.facebook.fts.mca.MailboxFTSJNI.dispatchCqlOIJOOO(r0, r1, r2, r4, r5, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NBA r1 = new X.NBA
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0422:
            java.lang.Object r0 = r1.A01
            X.Oob r0 = (X.C71656Oob) r0
            r8 = 10
            long r9 = r0.A00
            java.lang.String r11 = "AdvancedCrypto"
            java.lang.String r12 = r0.A04
            java.lang.Number r13 = r0.A03
            r15 = 0
            r7 = 2
            r14 = r6
            java.lang.Object r0 = com.facebook.fts.mca.MailboxFTSJNI.dispatchCqlOIJOOOOZ(r7, r8, r9, r11, r12, r13, r14, r15)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NB9 r1 = new X.NB9
            r1.<init>(r0)
            goto L_0x04b5
        L_0x0441:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            long r1 = r0.A01
            r0 = 0
            java.lang.Object r2 = com.facebook.cutoverinternal.mca.MailboxCutoverInternalJNI.dispatchCqlOJO(r0, r1, r6)
            return r2
        L_0x044d:
            r0 = 4
            java.lang.Object r0 = com.facebook.businessinbox.mca.MailboxBusinessInboxJNI.dispatchCqlOO(r0, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAx r1 = new X.NAx
            r1.<init>(r0)
            goto L_0x04b5
        L_0x045c:
            r0 = 6
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(r0, r6)
            return r2
        L_0x0462:
            r0 = 5
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(r0, r6)
            return r2
        L_0x0468:
            r0 = 4
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOO(r0, r6)
            return r2
        L_0x046e:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            r2 = 3
            long r3 = r0.A01
            r5 = 0
            r1 = 24
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJOO(r1, r2, r3, r5, r6)
            return r2
        L_0x047d:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            r3 = 3
            long r1 = r0.A01
            r0 = 23
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            return r2
        L_0x048b:
            java.lang.Object r0 = r1.A01
            X.Ooo r0 = (X.C71669Ooo) r0
            r1 = 3
            int r2 = r0.A00
            long r3 = r0.A01
            byte[] r5 = r0.A05
            boolean r7 = r0.A04
            r0 = 22
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJOOZ(r0, r1, r2, r3, r5, r6, r7)
            return r2
        L_0x049f:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            r3 = 3
            long r1 = r0.A01
            r0 = 21
            java.lang.Object r0 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            if (r0 == 0) goto L_0x04bb
            X.NAy r1 = new X.NAy
            r1.<init>(r0)
        L_0x04b5:
            com.facebook.msys.mca.MailboxNullable r2 = new com.facebook.msys.mca.MailboxNullable
            r2.<init>(r1)
            return r2
        L_0x04bb:
            r1 = 0
            goto L_0x04b5
        L_0x04bd:
            java.lang.Object r0 = r1.A01
            X.Opc r0 = (X.C71718Opc) r0
            r3 = 3
            long r1 = r0.A01
            r0 = 20
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIJO(r0, r3, r1, r6)
            return r2
        L_0x04cb:
            java.lang.Object r0 = r1.A01
            X.Oog r0 = (X.C71661Oog) r0
            r1 = 3
            r2 = 9999(0x270f, float:1.4012E-41)
            long r3 = r0.A01
            java.lang.Object r5 = r0.A03
            r0 = 19
            java.lang.Object r2 = com.facebook.advancedcryptotransport.mca.MailboxAdvancedCryptoTransportJNI.dispatchCqlOIIJOO(r0, r1, r2, r3, r5, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71726Opk.run(com.facebook.msys.mca.Mailbox, com.facebook.msys.mci.sqliteholder.SqliteHolder):java.lang.Object");
    }
}
