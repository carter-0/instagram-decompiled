package X;

import com.facebook.msys.mca.MailboxObservableImpl;
import com.facebook.msys.util.NotificationScope;

/* renamed from: X.Opu  reason: case insensitive filesystem */
public final class C71734Opu implements C295145ne {
    public final int A00;
    public final Object A01;

    public C71734Opu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static MailboxObservableImpl A00(C71734Opu opu) {
        return (MailboxObservableImpl) ((C71723Oph) opu.A01).A02;
    }

    public static NotificationScope A01(C295115nb r1, Object obj, String str, int i) {
        return r1.A00(new C71734Opu(obj, i), str);
    }

    /* JADX WARNING: type inference failed for: r0v103, types: [X.Npa, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x03db, code lost:
        r2 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DfW(java.util.Map r5) {
        /*
            r4 = this;
            int r0 = r4.A00
            switch(r0) {
                case 1: goto L_0x0412;
                case 2: goto L_0x0005;
                case 3: goto L_0x0405;
                case 4: goto L_0x03ed;
                case 5: goto L_0x03dd;
                case 6: goto L_0x03c2;
                case 7: goto L_0x03ae;
                case 8: goto L_0x0388;
                case 9: goto L_0x0366;
                case 10: goto L_0x0351;
                case 11: goto L_0x0340;
                case 12: goto L_0x031e;
                case 13: goto L_0x0309;
                case 14: goto L_0x02f8;
                case 15: goto L_0x02de;
                case 16: goto L_0x02ca;
                case 17: goto L_0x02a8;
                case 18: goto L_0x0294;
                case 19: goto L_0x026e;
                case 20: goto L_0x024a;
                case 21: goto L_0x0228;
                case 22: goto L_0x0204;
                case 23: goto L_0x01e8;
                case 24: goto L_0x01c4;
                case 25: goto L_0x01b9;
                case 26: goto L_0x0005;
                case 27: goto L_0x0005;
                case 28: goto L_0x019b;
                case 29: goto L_0x017f;
                case 30: goto L_0x0161;
                case 31: goto L_0x0145;
                case 32: goto L_0x0127;
                case 33: goto L_0x010a;
                case 34: goto L_0x00ef;
                case 35: goto L_0x00c1;
                case 36: goto L_0x00af;
                case 37: goto L_0x0095;
                case 38: goto L_0x0071;
                case 39: goto L_0x0057;
                case 40: goto L_0x0043;
                case 41: goto L_0x0038;
                case 42: goto L_0x001e;
                case 43: goto L_0x000e;
                default: goto L_0x0005;
            }
        L_0x0005:
            com.facebook.msys.mca.MailboxObservableImpl r1 = A00(r4)
            r0 = 0
            r1.setResult(r0)
            return
        L_0x000e:
            r5.getClass()
            X.681 r1 = X.NAV.A00
            r0 = 2
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            goto L_0x03fc
        L_0x001e:
            r5.getClass()
            X.681 r1 = X.NAU.A00
            r0 = 13
            java.lang.Object r0 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            if (r0 == 0) goto L_0x03db
            X.NBD r2 = new X.NBD
            r2.<init>(r0)
            goto L_0x03fc
        L_0x0038:
            java.lang.Object r0 = r4.A01
            X.OoP r0 = (X.C71644OoP) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A00
            r0 = 0
            r1.setResult(r0)
            return
        L_0x0043:
            r5.getClass()
            X.681 r1 = X.C68313NAa.A00
            r0 = 1
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.Oox r0 = (X.C71678Oox) r0
            java.lang.Object r3 = r0.A04
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x0057:
            r5.getClass()
            X.681 r1 = X.NAT.A00
            r0 = 28
            java.lang.Object r0 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            if (r0 == 0) goto L_0x03db
            X.62z r2 = new X.62z
            r2.<init>(r0)
            goto L_0x03fc
        L_0x0071:
            r5.getClass()
            X.681 r1 = X.NAS.A00
            r0 = 4
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 2
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r4.A01
            X.Opd r0 = (X.C71719Opd) r0
            java.lang.Object r1 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            X.OB6 r0 = new X.OB6
            r0.<init>(r2, r3)
            r1.setResult(r0)
            return
        L_0x0095:
            r5.getClass()
            X.681 r1 = X.NAS.A00
            r0 = 10
            java.lang.Object r0 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            if (r0 == 0) goto L_0x03db
            X.NBF r2 = new X.NBF
            r2.<init>(r0)
            goto L_0x03fc
        L_0x00af:
            r5.getClass()
            X.681 r1 = X.NAR.A00
            r0 = 1
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.OpQ r0 = (X.C71706OpQ) r0
            com.facebook.msys.mca.MailboxFutureImpl r3 = r0.A00
            goto L_0x03fc
        L_0x00c1:
            r5.getClass()
            java.lang.String r0 = "MCATaskCompletionStateUserInfoKey"
            java.lang.Object r0 = r5.get(r0)
            r0.getClass()
            int r3 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r0 = "MCATaskCompletionErrorCodeUserInfoKey"
            java.lang.Object r2 = r5.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r0 = "MCATaskCompletionErrorTitleUserInfoKey"
            r5.get(r0)
            java.lang.Object r1 = r4.A01
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            X.Npa r0 = new X.Npa
            r0.<init>()
            r0.A00 = r3
            r0.A01 = r2
            r1.setResult(r0)
            return
        L_0x00ef:
            r5.getClass()
            X.681 r1 = X.NAQ.A00
            r0 = 5
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.OoD r0 = (X.C71632OoD) r0
            com.facebook.msys.mca.MailboxFutureImpl r3 = r0.A01
            if (r1 == 0) goto L_0x03db
            X.NB6 r2 = new X.NB6
            r2.<init>(r1)
            goto L_0x03fc
        L_0x010a:
            r5.getClass()
            X.681 r1 = X.NAQ.A00
            r0 = 7
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Opc r0 = (X.C71718Opc) r0
            java.lang.Object r3 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            if (r1 == 0) goto L_0x03db
            X.NB7 r2 = new X.NB7
            r2.<init>(r1)
            goto L_0x03fc
        L_0x0127:
            r5.getClass()
            X.681 r1 = X.NAQ.A00
            r0 = 8
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Opc r0 = (X.C71718Opc) r0
            java.lang.Object r3 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            if (r1 == 0) goto L_0x03db
            X.NB8 r2 = new X.NB8
            r2.<init>(r1)
            goto L_0x03fc
        L_0x0145:
            r5.getClass()
            X.681 r1 = X.NAP.A00
            r0 = 20
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Oot r0 = (X.C71674Oot) r0
            com.facebook.msys.mca.MailboxFutureImpl r3 = r0.A02
            if (r1 == 0) goto L_0x03db
            X.NB4 r2 = new X.NB4
            r2.<init>(r1)
            goto L_0x03fc
        L_0x0161:
            r5.getClass()
            X.681 r1 = X.NAP.A00
            r0 = 19
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Ooj r0 = (X.C71664Ooj) r0
            java.lang.Object r3 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            if (r1 == 0) goto L_0x03db
            X.NB3 r2 = new X.NB3
            r2.<init>(r1)
            goto L_0x03fc
        L_0x017f:
            r5.getClass()
            X.681 r1 = X.NAP.A00
            r0 = 13
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.OoC r0 = (X.C71631OoC) r0
            com.facebook.msys.mca.MailboxFutureImpl r3 = r0.A01
            if (r1 == 0) goto L_0x03db
            X.NB1 r2 = new X.NB1
            r2.<init>(r1)
            goto L_0x03fc
        L_0x019b:
            r5.getClass()
            X.681 r1 = X.NAP.A00
            r0 = 16
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Opc r0 = (X.C71718Opc) r0
            java.lang.Object r3 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            if (r1 == 0) goto L_0x03db
            X.NB2 r2 = new X.NB2
            r2.<init>(r1)
            goto L_0x03fc
        L_0x01b9:
            java.lang.Object r0 = r4.A01
            X.OpF r0 = (X.C71695OpF) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A04
            r0 = 0
            r1.setResult(r0)
            return
        L_0x01c4:
            r5.getClass()
            X.681 r1 = X.AnonymousClass67N.A00
            r0 = 18
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 17
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.Object r0 = r4.A01
            X.OpJ r0 = (X.C71699OpJ) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A03
            X.OAv r0 = new X.OAv
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x01e8:
            r5.getClass()
            X.681 r1 = X.AnonymousClass67N.A00
            r0 = 27
            java.lang.Object r1 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r1 = (com.facebook.msys.mci.CQLResultSet) r1
            java.lang.Object r0 = r4.A01
            X.Mgv r0 = (X.C67022Mgv) r0
            com.facebook.msys.mca.MailboxFutureImpl r3 = r0.A07
            if (r1 == 0) goto L_0x03db
            X.5s9 r2 = new X.5s9
            r2.<init>(r1)
            goto L_0x03fc
        L_0x0204:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 9
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 8
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            java.lang.Object r0 = r4.A01
            X.OpP r0 = (X.C71705OpP) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A08
            X.OAt r0 = new X.OAt
            r0.<init>(r2, r3)
            r1.setResult(r0)
            return
        L_0x0228:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 7
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            android.net.Uri r3 = (android.net.Uri) r3
            r0 = 6
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            java.lang.Object r0 = r4.A01
            X.OpI r0 = (X.C71698OpI) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A04
            X.OAl r0 = new X.OAl
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x024a:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 61
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            android.net.Uri r3 = (android.net.Uri) r3
            r0 = 60
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            java.lang.Object r0 = r4.A01
            X.Ooc r0 = (X.C71657Ooc) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A03
            X.L3D r0 = new X.L3D
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x026e:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 59
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            android.net.Uri r3 = (android.net.Uri) r3
            r0 = 58
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            java.lang.Object r0 = r4.A01
            X.Op6 r0 = (X.C71687Op6) r0
            java.lang.Object r1 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            X.L3C r0 = new X.L3C
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x0294:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 1
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.Opc r0 = (X.C71718Opc) r0
            java.lang.Object r3 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x02a8:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 36
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.util.List r3 = (java.util.List) r3
            r0 = 34
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mcf.MsysError r2 = (com.facebook.msys.mcf.MsysError) r2
            com.facebook.msys.mca.MailboxObservableImpl r1 = A00(r4)
            X.OAk r0 = new X.OAk
            r0.<init>(r2, r3)
            r1.setResult(r0)
            return
        L_0x02ca:
            r5.getClass()
            X.681 r1 = X.NAY.A00
            r0 = 5
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r3 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x02de:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 192(0xc0, float:2.69E-43)
            java.lang.Object r0 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            if (r0 == 0) goto L_0x03db
            X.NAz r2 = new X.NAz
            r2.<init>(r0)
            goto L_0x03fc
        L_0x02f8:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 362(0x16a, float:5.07E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            goto L_0x03fc
        L_0x0309:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 358(0x166, float:5.02E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r3 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x031e:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 365(0x16d, float:5.11E-43)
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 364(0x16c, float:5.1E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            com.facebook.msys.mca.MailboxObservableImpl r1 = A00(r4)
            X.OAg r0 = new X.OAg
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x0340:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 372(0x174, float:5.21E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            goto L_0x03fc
        L_0x0351:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 370(0x172, float:5.18E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r3 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x0366:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 366(0x16e, float:5.13E-43)
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r3 = (java.lang.Number) r3
            r0 = 367(0x16f, float:5.14E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Number r2 = (java.lang.Number) r2
            com.facebook.msys.mca.MailboxObservableImpl r1 = A00(r4)
            X.OAh r0 = new X.OAh
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x0388:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 373(0x175, float:5.23E-43)
            java.lang.Object r3 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.String r3 = (java.lang.String) r3
            r0 = 374(0x176, float:5.24E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r0 = r4.A01
            X.Ooj r0 = (X.C71664Ooj) r0
            java.lang.Object r1 = r0.A03
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            X.OAi r0 = new X.OAi
            r0.<init>(r3, r2)
            r1.setResult(r0)
            return
        L_0x03ae:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 375(0x177, float:5.25E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            java.lang.Object r0 = r4.A01
            X.OoW r0 = (X.C71651OoW) r0
            java.lang.Object r3 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r3 = (com.facebook.msys.mca.MailboxObservableImpl) r3
            goto L_0x03fc
        L_0x03c2:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 310(0x136, float:4.34E-43)
            java.lang.Object r0 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mci.CQLResultSet r0 = (com.facebook.msys.mci.CQLResultSet) r0
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            if (r0 == 0) goto L_0x03db
            X.NB0 r2 = new X.NB0
            r2.<init>(r0)
            goto L_0x03fc
        L_0x03db:
            r2 = 0
            goto L_0x03fc
        L_0x03dd:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 246(0xf6, float:3.45E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
            goto L_0x03fc
        L_0x03ed:
            r5.getClass()
            X.681 r1 = X.NAX.A00
            r0 = 177(0xb1, float:2.48E-43)
            java.lang.Object r2 = X.C66581MXm.A0s(r1, r5, r0)
            com.facebook.msys.mca.MailboxObservableImpl r3 = A00(r4)
        L_0x03fc:
            com.facebook.msys.mca.MailboxNullable r0 = new com.facebook.msys.mca.MailboxNullable
            r0.<init>(r2)
            r3.setResult(r0)
            return
        L_0x0405:
            java.lang.Object r0 = r4.A01
            X.OoX r0 = (X.C71652OoX) r0
            java.lang.Object r1 = r0.A02
            com.facebook.msys.mca.MailboxObservableImpl r1 = (com.facebook.msys.mca.MailboxObservableImpl) r1
            r0 = 0
            r1.setResult(r0)
            return
        L_0x0412:
            java.lang.Object r0 = r4.A01
            X.OoB r0 = (X.C71630OoB) r0
            com.facebook.msys.mca.MailboxFutureImpl r1 = r0.A01
            r0 = 0
            r1.setResult(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71734Opu.DfW(java.util.Map):void");
    }
}
