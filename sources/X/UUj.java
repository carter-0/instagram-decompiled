package X;

public final class UUj extends C16746V4d {
    public final int A00;
    public final Object A01;

    public UUj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A00() {
        V2C v2c;
        C20885X2p uri;
        W0T A002;
        if (2 - this.A00 == 0) {
            C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:onConnect");
            C18760Vzv vzv = (C18760Vzv) this.A01;
            vzv.A0B.A03();
            W0T A003 = C18760Vzv.A00(vzv);
            if (!(A003 == null || (A002 = C18760Vzv.A00(vzv)) == null)) {
                AnonymousClass0Ud r2 = A003.A03;
                A002.A0E(((AnonymousClass9ID) r2.getValue()).A03, ((AnonymousClass9ID) r2.getValue()).A01, ((AnonymousClass9ID) r2.getValue()).A06, ((AnonymousClass9ID) r2.getValue()).A07, true);
            }
            W0T A004 = C18760Vzv.A00(vzv);
            if (A004 != null && A004.A0H()) {
                W0T A005 = C18760Vzv.A00(vzv);
                if (A005 != null) {
                    A005.A06();
                }
                W0T A006 = C18760Vzv.A00(vzv);
                if (A006 != null) {
                    A006.A0B((Boolean) null, (Boolean) null, true, (Boolean) null);
                }
                X80 x80 = vzv.A04;
                if (x80 != null) {
                    x80.DWr();
                }
            }
            1Av r5 = vzv.A0D;
            0s0 r4 = r5.A4q;
            AnonymousClass0YZ[] r3 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(r5, r4, r3, 126)) {
                X5A x5a = vzv.A03;
                if (x5a != null) {
                    x5a.FJs();
                }
                AnonymousClass7TF.A1J(r5, r4, r3, 126, true);
            }
            C17917Vi8 vi8 = vzv.A0A;
            if (vi8 != null) {
                ((OMN) vi8.A06.getValue()).A00();
            }
            ((OMN) vzv.A0E.getValue()).A00();
            C18078Vl7 vl7 = vzv.A01;
            if (vl7 != null) {
                v2c = vl7.A0B.Brd();
            } else {
                v2c = null;
            }
            if (v2c instanceof UUU) {
                uri = new C16281Urj(vzv);
            } else {
                uri = new C16280Uri(vzv);
            }
            vzv.A00 = uri;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0020, code lost:
        if (r0.A0H() != true) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r9 = this;
            int r0 = r9.A00
            int r0 = 2 - r0
            if (r0 != 0) goto L_0x004a
            X.8j2 r6 = X.C363058j1.A02
            java.lang.String r5 = "sup:MediaStreamControllerDelegate"
            java.lang.String r0 = "MediaStreamStateListener:onInitial"
            r6.A01(r5, r0)
            java.lang.Object r4 = r9.A01
            X.Vzv r4 = (X.C18760Vzv) r4
            X.W0T r0 = X.C18760Vzv.A00(r4)
            r3 = 1
            r8 = 0
            if (r0 == 0) goto L_0x0022
            boolean r0 = r0.A0H()
            r1 = 1
            if (r0 == r3) goto L_0x0023
        L_0x0022:
            r1 = 0
        L_0x0023:
            java.lang.String r2 = "MediaStreamStateListener:startErrorToConnectJob onInitial"
            java.lang.String r7 = "LIVE_STREAM_CONNECT_FAIL"
            X.W0T r0 = X.C18760Vzv.A00(r4)
            if (r1 == 0) goto L_0x004b
            if (r0 == 0) goto L_0x0032
            r0.A06()
        L_0x0032:
            X.W1b r1 = r4.A0B
            X.UUY r0 = new X.UUY
            r0.<init>(r7)
            r1.A04(r0)
            r6.A01(r5, r2)
            X.0sP r1 = r4.A06
            if (r1 == 0) goto L_0x004a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
        L_0x0047:
            r1.invoke(r0)
        L_0x004a:
            return
        L_0x004b:
            if (r0 == 0) goto L_0x004a
            X.0Ud r0 = r0.A02
            java.lang.Object r1 = r0.getValue()
            X.V4Y r1 = (X.V4Y) r1
            if (r1 == 0) goto L_0x004a
            boolean r0 = r1 instanceof X.K0R
            if (r0 == 0) goto L_0x004a
            X.K0R r1 = (X.K0R) r1
            X.Jvi r0 = r1.A00
            java.lang.Object r0 = r0.A01
            X.VR1 r0 = (X.VR1) r0
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x004a
            X.W1b r1 = r4.A0B
            X.UUY r0 = new X.UUY
            r0.<init>(r7)
            r1.A04(r0)
            boolean r0 = X.C18760Vzv.A01(r4)
            if (r0 == 0) goto L_0x004a
            r6.A01(r5, r2)
            X.0sP r1 = r4.A06
            if (r1 == 0) goto L_0x004a
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UUj.A04():void");
    }

    public final void A05() {
        switch (this.A00) {
            case 0:
                C18078Vl7.A00((C18078Vl7) this.A01);
                return;
            case 4:
                C62423KfY kfY = (C62423KfY) this.A01;
                MG2.A01(kfY, kfY.A0h, 42);
                return;
            default:
                return;
        }
    }

    public final void A06() {
        switch (this.A00) {
            case 2:
                C363068j2 r7 = C363058j1.A02;
                r7.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:onDisconnect");
                C18760Vzv vzv = (C18760Vzv) this.A01;
                W0T A002 = C18760Vzv.A00(vzv);
                boolean z = false;
                if (A002 != null && A002.A0H()) {
                    W0T A003 = C18760Vzv.A00(vzv);
                    if (A003 != null) {
                        A003.A06();
                    }
                    vzv.A0B.A04(new UUY("LIVE_STREAM_CONNECT_FAIL"));
                }
                if (C18760Vzv.A01(vzv)) {
                    r7.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:startErrorToConnectJob onDisconnected");
                    0sP r1 = vzv.A06;
                    if (r1 != null) {
                        C51968G9o.A1O(r1, true);
                    }
                }
                C17917Vi8 vi8 = vzv.A0A;
                if (vi8 != null) {
                    C18078Vl7 vl7 = vzv.A01;
                    if (vl7 != null) {
                        z = vl7.A0J;
                    }
                    vi8.A00(z);
                    ((OMN) vi8.A06.getValue()).A01();
                }
                ((OMN) vzv.A0E.getValue()).A01();
                return;
            case 3:
                ((C18078Vl7) this.A01).A07(AnonymousClass000.A00(1863));
                return;
            default:
                return;
        }
    }

    public final void A07() {
        UV8 uv8;
        C18078Vl7 vl7;
        switch (this.A00) {
            case 0:
                C18078Vl7.A00((C18078Vl7) this.A01);
                return;
            case 1:
                C363058j1.A02.A01(C3496881i.A0Z, "MediaStreamStateListener:onStreamStarted");
                C19187WOt wOt = (C19187WOt) this.A01;
                C3496881i r5 = wOt.A01;
                C340297l2 r4 = r5.A02;
                if (r4 != null) {
                    C363898kX A012 = C340297l2.A01(r4);
                    if (A012 instanceof C382219dL) {
                        C341547n8 r0 = ((C382219dL) A012).A00;
                        if (r0 == null) {
                            0qQ.A0F("supernovaBasicRecordingComponent");
                            throw AnonymousClass00P.createAndThrow();
                        }
                        AUL aul = r0.A00;
                        if (!(aul == null || (vl7 = wOt.A00) == null)) {
                            vl7.A0D = aul;
                            vl7.A0C = aul;
                            vl7.A0B.EPA(new C19085WKs(vl7, aul));
                        }
                    }
                    if (r5.A0M.A08.A00 == AnonymousClass9QA.A00) {
                        wOt.A00.A0B.EVO(true);
                    }
                    C340297l2.A05(C390989sA.A04, r4);
                    return;
                }
                return;
            case 2:
                C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:onStreamStarted");
                C18760Vzv vzv = (C18760Vzv) this.A01;
                W0T A002 = C18760Vzv.A00(vzv);
                if (A002 != null) {
                    A002.A0B((Boolean) null, (Boolean) null, AnonymousClass7TE.A0u(), (Boolean) null);
                }
                C62320sa r02 = vzv.A05;
                if (r02 != null) {
                    r02.invoke();
                }
                C18777W1b w1b = vzv.A0B;
                VR1 vr1 = (VR1) w1b.A03.invoke();
                if (!(vr1 == null || !(vr1 instanceof UV8) || (uv8 = w1b.A00) == null)) {
                    C18777W1b.A01(w1b, uv8, vr1);
                }
                X80 x80 = vzv.A04;
                if (x80 != null) {
                    x80.DI8();
                    return;
                }
                return;
            case 4:
                C62423KfY kfY = (C62423KfY) this.A01;
                MG2.A01(kfY, kfY.A0h, 41);
                return;
            default:
                return;
        }
    }

    public final void A08(int i) {
        if (2 - this.A00 != 0) {
            return;
        }
        if (i == 18) {
            C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "onHardwareStatusEvent NO_DEVICE_READY");
            W0T A002 = C18760Vzv.A00((C18760Vzv) this.A01);
            if (A002 != null) {
                W0T.A01(A002, 15, false, false, false, false, false);
            }
        } else if (i == 19) {
            C363058j1.A02.A01("sup:MediaStreamControllerDelegate", "onHardwareStatusEvent DEVICE_IS_READY");
            W0T A003 = C18760Vzv.A00((C18760Vzv) this.A01);
            if (A003 != null) {
                W0T.A01(A003, 15, false, false, false, false, true);
            }
        }
    }

    public final void A0A(V4C v4c) {
        W0T A002;
        W0T A003;
        switch (this.A00) {
            case 2:
                C363068j2 r5 = C363058j1.A02;
                r5.A01("sup:MediaStreamControllerDelegate", AnonymousClass000.A00(2371));
                C18760Vzv vzv = (C18760Vzv) this.A01;
                W0T A004 = C18760Vzv.A00(vzv);
                if (!(A004 == null || !A004.A0H() || (A003 = C18760Vzv.A00(vzv)) == null)) {
                    A003.A06();
                }
                vzv.A0B.A04(v4c);
                if (0qQ.A0K(v4c.A00(), "STREAM_STOPPED_REASON_TAMPER_DETECTED") && (A002 = C18760Vzv.A00(vzv)) != null && !A002.A0I()) {
                    0sL r1 = vzv.A07;
                    if (r1 != null) {
                        r1.invoke(true, C15196UUz.A00);
                        return;
                    }
                    return;
                } else if (C18760Vzv.A01(vzv)) {
                    r5.A01("sup:MediaStreamControllerDelegate", "MediaStreamStateListener:startErrorToConnectJob onError");
                    0sP r0 = vzv.A06;
                    if (r0 != null) {
                        r0.invoke(true);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 4:
                C62423KfY kfY = (C62423KfY) this.A01;
                MG2.A01(kfY, kfY.A0h, 40);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.V2D r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 1: goto L_0x015f;
                case 2: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            r4 = 0
            X.UUg r0 = X.C15181UUg.A00
            boolean r0 = r8.equals(r0)
            java.lang.String r2 = "sup:MediaStreamControllerDelegate"
            r6 = 0
            r3 = 1
            if (r0 == 0) goto L_0x004d
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDonned"
            r1.A01(r2, r0)
            java.lang.Object r5 = r7.A01
            X.Vzv r5 = (X.C18760Vzv) r5
            X.W1b r4 = r5.A0B
            X.UUp r1 = X.C15186UUp.A00
            java.util.LinkedHashSet r0 = r4.A02
            boolean r2 = r0.contains(r1)
            X.Vl7 r0 = r5.A01
            if (r0 == 0) goto L_0x0035
            X.XBm r0 = r0.A0B
            boolean r0 = r0.isConnected()
            if (r0 != r3) goto L_0x0035
            r6 = 1
        L_0x0035:
            r1 = r6 ^ 1
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x004a
            if (r2 == 0) goto L_0x004a
            if (r1 == 0) goto L_0x004a
            X.UV4 r0 = X.UV4.A00
            r4.A05(r0)
            X.UUo r0 = X.C15185UUo.A00
        L_0x0046:
            r4.A05(r0)
            return
        L_0x004a:
            X.UV4 r0 = X.UV4.A00
            goto L_0x0046
        L_0x004d:
            X.UUf r0 = X.C15180UUf.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.Object r4 = r7.A01
            X.Vzv r4 = (X.C18760Vzv) r4
            X.W0T r0 = X.C18760Vzv.A00(r4)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.A0I()
            if (r0 != r3) goto L_0x0005
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDoffedImmediate"
            r1.A01(r2, r0)
            X.W1b r4 = r4.A0B
            X.UUq r0 = X.C15187UUq.A00
            goto L_0x0046
        L_0x0071:
            X.UUe r0 = X.C15179UUe.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008e
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent SGDoffErrorDuringStream"
            r1.A01(r2, r0)
            java.lang.Object r0 = r7.A01
            X.Vzv r0 = (X.C18760Vzv) r0
            X.Vl7 r0 = r0.A01
            if (r0 == 0) goto L_0x0005
            X.XBm r0 = r0.A0B
            r0.EkZ(r3)
            return
        L_0x008e:
            X.UUh r0 = X.C15182UUh.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00ae
            java.lang.Object r1 = r7.A01
            X.Vzv r1 = (X.C18760Vzv) r1
            X.W0T r0 = X.C18760Vzv.A00(r1)
            if (r0 == 0) goto L_0x0005
            boolean r0 = r0.A0I()
            if (r0 != r3) goto L_0x0005
            X.X2p r0 = r1.A00
            if (r0 == 0) goto L_0x0005
            r0.onPaused()
            return
        L_0x00ae:
            X.UUd r0 = X.C15178UUd.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0101
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestSGCameraOn"
            r1.A01(r2, r0)
            java.lang.Object r3 = r7.A01
            X.Vzv r3 = (X.C18760Vzv) r3
            X.W1b r2 = r3.A0B
            X.UUx r1 = X.C15194UUx.A00
            java.util.LinkedHashSet r0 = r2.A02
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00f3
            int r1 = r1.A00
            r0 = 4
            if (r1 == r0) goto L_0x00fe
            r0 = 7
            if (r1 == r0) goto L_0x00fb
            r0 = 10
            if (r1 != r0) goto L_0x00de
            X.UUm r0 = X.C15183UUm.A00
        L_0x00db:
            r2.A05(r0)
        L_0x00de:
            X.W0T r2 = X.C18760Vzv.A00(r3)
            if (r2 == 0) goto L_0x00ec
            r1 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2.A0B(r1, r0, r1, r1)
        L_0x00ec:
            X.X5A r0 = r3.A03
            if (r0 == 0) goto L_0x00f3
            r0.FJs()
        L_0x00f3:
            X.X80 r0 = r3.A04
            if (r0 == 0) goto L_0x0005
            r0.DI7()
            return
        L_0x00fb:
            X.UUy r0 = X.C15195UUy.A00
            goto L_0x00db
        L_0x00fe:
            X.UV5 r0 = X.UV5.A00
            goto L_0x00db
        L_0x0101:
            X.UUc r0 = X.C15177UUc.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0125
            X.8j2 r1 = X.C363058j1.A02
            java.lang.String r0 = "MediaStreamStateListener:onUserEvent RequestPhoneCameraOn"
            r1.A01(r2, r0)
            java.lang.Object r1 = r7.A01
            X.Vzv r1 = (X.C18760Vzv) r1
            X.W0T r0 = X.C18760Vzv.A00(r1)
            if (r0 == 0) goto L_0x011d
            r0.A06()
        L_0x011d:
            X.X80 r0 = r1.A04
            if (r0 == 0) goto L_0x0005
            r0.DWr()
            return
        L_0x0125:
            X.UUi r0 = X.UUi.A00
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r7.A01
            X.Vzv r0 = (X.C18760Vzv) r0
            X.Vi8 r2 = r0.A0A
            if (r2 == 0) goto L_0x0005
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0005
            android.app.NotificationManager r4 = r2.A04
            if (r4 == 0) goto L_0x0005
            int r3 = r2.A02
            android.content.Context r1 = r2.A05
            int r0 = r2.A03
            X.9Y4 r2 = new X.9Y4
            r2.<init>(r1, r0)
            X.AnonymousClass9Y4.A02(r2)
            android.content.Context r1 = r2.A00
            r0 = 2131951901(0x7f13011d, float:1.954023E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0B(r0)
            android.app.Notification r0 = r2.A03()
            r4.notify(r3, r0)
            return
        L_0x015f:
            java.lang.Object r3 = r7.A01
            X.WOt r3 = (X.C19187WOt) r3
            X.81i r5 = r3.A01
            X.7l2 r4 = r5.A02
            if (r4 == 0) goto L_0x0005
            boolean r0 = r8 instanceof X.C15178UUd
            if (r0 == 0) goto L_0x0180
            java.lang.String r2 = X.C3496881i.A0Z
            java.lang.String r1 = "MediaStreamStateListener:onUserEvent RequestSGCameraOn"
            X.8j2 r0 = X.C363058j1.A02
            r0.A01(r2, r1)
            X.Vl7 r0 = r3.A00
            X.XBm r1 = r0.A0B
            android.view.Surface r0 = r0.A06
            r1.EwG(r0)
            return
        L_0x0180:
            boolean r0 = r8 instanceof X.C15177UUc
            if (r0 == 0) goto L_0x0005
            java.lang.String r2 = X.C3496881i.A0Z
            java.lang.String r1 = "MediaStreamStateListener:onUserEvent RequestPhoneCameraOn"
            X.8j2 r0 = X.C363058j1.A02
            r0.A01(r2, r1)
            X.9sA r0 = X.C390989sA.A03
            X.C340297l2.A05(r0, r4)
            X.8Yz r0 = r5.A0M
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r1 != r0) goto L_0x01a4
            X.Vl7 r0 = r3.A00
            X.XBm r1 = r0.A0B
            r0 = 0
            r1.EVO(r0)
        L_0x01a4:
            X.Vl7 r0 = r3.A00
            r0.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UUj.A0B(X.V2D):void");
    }

    public final void A0C(boolean z) {
        if (2 - this.A00 == 0) {
            C363058j1.A02.A01("sup:MediaStreamControllerDelegate", 002.A1D("MediaStreamStateListener:onStreamingProtocolChanged, isOnWifi: ", z));
            C18760Vzv vzv = (C18760Vzv) this.A01;
            W0T A002 = C18760Vzv.A00(vzv);
            if (A002 != null) {
                A002.A0B(AnonymousClass7TE.A0v(), (Boolean) null, (Boolean) null, Boolean.valueOf(z));
            }
            X5A x5a = vzv.A03;
            if (x5a != null) {
                x5a.FJs();
            }
        }
    }
}
