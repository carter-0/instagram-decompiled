package X;

/* renamed from: X.HAv  reason: case insensitive filesystem */
public final class C54380HAv extends C324596za {
    public final int A00;
    public final Object A01;
    public final boolean A02;
    public final boolean A03;

    public C54380HAv(Object obj, int i, boolean z, boolean z2) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = z;
        this.A02 = z2;
    }

    public final void onFail(C268654dm r6) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-157387566);
            C52770GcN gcN = (C52770GcN) this.A01;
            gcN.A09().A0E.update();
            if (gcN.isResumed()) {
                C59689JTv.A0F(gcN.requireActivity(), "save_media_request_failed", 2131956760);
            }
            C52770GcN.A06(gcN);
            i = 260775468;
        } else {
            A032 = AnonymousClass0fD.A03(125251929);
            ((IXC) this.A01).A03.DFE(this.A02);
            i = 187140863;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFailInBackground(C268654dm r3) {
        if (1 - this.A00 != 0) {
            C54380HAv.super.onFailInBackground(r3);
            return;
        }
        int A032 = AnonymousClass0fD.A03(-1625415861);
        C46329Dbx dbx = ((C52770GcN) this.A01).A01;
        if (dbx == null) {
            0qQ.A0F("navigationPerfLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        dbx.A00.A01();
        AnonymousClass0fD.A0A(-1205721583, A032);
    }

    public final void onFinish() {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(688391601);
            C52770GcN gcN = (C52770GcN) this.A01;
            C14074TpO.A00(gcN.A09(), false, true);
            gcN.A0G = false;
            i = -629075538;
        } else {
            A032 = AnonymousClass0fD.A03(401641714);
            i = -291990907;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onStart() {
        int i;
        int i2;
        if (this.A00 != 0) {
            i = AnonymousClass0fD.A03(920147709);
            C52770GcN gcN = (C52770GcN) this.A01;
            C14074TpO.A00(gcN.A09(), true, this.A02);
            C46329Dbx dbx = gcN.A01;
            if (dbx == null) {
                0qQ.A0F("navigationPerfLogger");
                throw AnonymousClass00P.createAndThrow();
            } else {
                dbx.A00.A04();
                i2 = 1605433173;
            }
        } else {
            i = AnonymousClass0fD.A03(1958004951);
            i2 = 1029284930;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        if (X.182.A06(r2, r5, 36329796917084493L) != false) goto L_0x00aa;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            if (r0 == 0) goto L_0x0041
            r0 = 1813395359(0x6c16379f, float:7.2640614E26)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.HE8 r12 = (X.HE8) r12
            r0 = 146606678(0x8bd0a56, float:1.1377454E-33)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r3 = 0
            X.0qQ.A0B(r12, r3)
            java.lang.Object r2 = r11.A01
            X.GcN r2 = (X.C52770GcN) r2
            boolean r1 = r11.A02
            boolean r0 = r11.A03
            X.C52770GcN.A05(r12, r2, r1, r0, r3)
            X.Dbx r0 = r2.A01
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "navigationPerfLogger"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0031:
            X.34p r0 = r0.A00
            r0.A05()
            r0 = 720274110(0x2aee82be, float:4.2368013E-13)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -971182385(0xffffffffc61ceecf, float:-10043.702)
            goto L_0x00c8
        L_0x0041:
            r0 = 2058472270(0x7ab1cb4e, float:4.6158003E35)
            int r7 = X.AnonymousClass0fD.A03(r0)
            X.Gyy r12 = (X.C54074Gyy) r12
            r0 = 2095862930(0x7cec5492, float:9.816779E36)
            int r10 = X.AnonymousClass7TG.A0D(r12, r0)
            java.lang.Object r6 = r11.A01
            X.IXC r6 = (X.IXC) r6
            com.instagram.common.session.UserSession r5 = r6.A01
            X.IOk r4 = X.C55124HcX.A00(r5)
            boolean r3 = r11.A03
            if (r3 == 0) goto L_0x00ae
            java.util.List r9 = r12.A01
            boolean r8 = r11.A02
            X.0iw r0 = r6.A00
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "saved_collections_list"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00aa
            com.instagram.user.model.User r0 = X.DbT.A0j(r5)
            boolean r0 = r0.A1o()
            if (r0 != 0) goto L_0x00aa
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321185507845272(0x8109ed00042498, double:3.033002196611698E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x009e
            r0 = 36324024481361593(0x810c8200062eb9, double:3.034797574895048E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x009e
            r0 = 36324024481099445(0x810c8200022eb5, double:3.0347975747292646E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00aa
        L_0x009e:
            r0 = 36329796917084493(0x8111c20001414d, double:3.038448086489943E-306)
            boolean r1 = X.182.A06(r2, r5, r0)
            r0 = 1
            if (r1 == 0) goto L_0x00ab
        L_0x00aa:
            r0 = 0
        L_0x00ab:
            r4.A06(r9, r8, r0)
        L_0x00ae:
            X.JPW r5 = r6.A03
            boolean r2 = r11.A02
            if (r3 == 0) goto L_0x00cc
            java.util.List r1 = r6.A04
            java.util.List r0 = r6.A05
            java.util.List r8 = r4.A02(r1, r0)
        L_0x00bc:
            r5.DFO(r8, r2)
            r0 = -382774299(0xffffffffe92f53e5, float:-1.3247387E25)
            X.AnonymousClass0fD.A0A(r0, r10)
            r0 = 131624031(0x7d86c5f, float:3.2563763E-34)
        L_0x00c8:
            X.AnonymousClass0fD.A0A(r0, r7)
            return
        L_0x00cc:
            java.util.List r0 = r12.A01
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r0.iterator()
        L_0x00d6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r4 = r9.next()
            r3 = r4
            com.instagram.save.model.SavedCollection r3 = (com.instagram.save.model.SavedCollection) r3
            java.util.List r1 = r6.A04
            X.HMw r0 = r3.A07
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00d6
            java.util.List r1 = r6.A05
            X.HMU r0 = r3.A06
            boolean r0 = X.00k.A0u(r1, r0)
            if (r0 != 0) goto L_0x00fb
            X.HMU r0 = r3.A06
            if (r0 != 0) goto L_0x00d6
        L_0x00fb:
            r8.add(r4)
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54380HAv.onSuccess(java.lang.Object):void");
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-409769935);
            AnonymousClass0fD.A0A(1076518800, AnonymousClass0fD.A03(-1454856833));
            i = -1931244135;
        } else {
            A032 = AnonymousClass0fD.A03(1979706575);
            AnonymousClass0fD.A0A(1498261056, AnonymousClass0fD.A03(-1610058579));
            i = 1731378725;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
