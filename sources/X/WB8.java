package X;

import android.view.View;

public final class WB8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public WB8(C19354WVv wVv, int i) {
        this.A00 = i;
        if (51 - i != 0) {
            this.A01 = wVv;
        } else {
            this.A01 = wVv;
        }
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new WB8(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v56, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0b05, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0b08, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0c64, code lost:
        if (r9 != null) goto L_0x0b66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0c6f, code lost:
        r2 = "promoteLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0c72, code lost:
        r2 = "locationSharingPresenter";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0c8d, code lost:
        X.0qQ.A0F(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0c94, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0ca4, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:0x0ca7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0021, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x0b7e  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0b81  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0b93  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0bbe  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0bc6  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0bce  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0bf0  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0bf8  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x0c18  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x0c23  */
    /* JADX WARNING: Removed duplicated region for block: B:343:0x0c3f  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0c44  */
    /* JADX WARNING: Removed duplicated region for block: B:345:0x0c49  */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0c4f  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0c55  */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0c58  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r30) {
        /*
            r29 = this;
            r1 = r29
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0c75;
                case 1: goto L_0x0b09;
                case 2: goto L_0x0ae9;
                case 3: goto L_0x0acc;
                case 4: goto L_0x0abc;
                case 5: goto L_0x0a9b;
                case 6: goto L_0x0a76;
                case 7: goto L_0x0a65;
                case 8: goto L_0x0a54;
                case 9: goto L_0x0a32;
                case 10: goto L_0x0a0c;
                case 11: goto L_0x09f9;
                case 12: goto L_0x09e6;
                case 13: goto L_0x09d3;
                case 14: goto L_0x09bf;
                case 15: goto L_0x09ac;
                case 16: goto L_0x0995;
                case 17: goto L_0x0982;
                case 18: goto L_0x0967;
                case 19: goto L_0x0898;
                case 20: goto L_0x0884;
                case 21: goto L_0x0871;
                case 22: goto L_0x085c;
                case 23: goto L_0x07f6;
                case 24: goto L_0x0405;
                case 25: goto L_0x07d9;
                case 26: goto L_0x07b4;
                case 27: goto L_0x079d;
                case 28: goto L_0x076e;
                case 29: goto L_0x0754;
                case 30: goto L_0x0283;
                case 31: goto L_0x072b;
                case 32: goto L_0x0718;
                case 33: goto L_0x0705;
                case 34: goto L_0x06ec;
                case 35: goto L_0x06d4;
                case 36: goto L_0x06af;
                case 37: goto L_0x0258;
                case 38: goto L_0x0245;
                case 39: goto L_0x068f;
                case 40: goto L_0x01c8;
                case 41: goto L_0x01b5;
                case 42: goto L_0x0678;
                case 43: goto L_0x0661;
                case 44: goto L_0x064a;
                case 45: goto L_0x0633;
                case 46: goto L_0x061c;
                case 47: goto L_0x05fc;
                case 48: goto L_0x019e;
                case 49: goto L_0x0189;
                case 50: goto L_0x0174;
                case 51: goto L_0x05e5;
                case 52: goto L_0x015d;
                case 53: goto L_0x0148;
                case 54: goto L_0x0124;
                case 55: goto L_0x010d;
                case 56: goto L_0x00f6;
                case 57: goto L_0x00dd;
                case 58: goto L_0x00c6;
                case 59: goto L_0x00ad;
                case 60: goto L_0x059b;
                case 61: goto L_0x0574;
                case 62: goto L_0x0550;
                case 63: goto L_0x0066;
                case 64: goto L_0x0498;
                case 65: goto L_0x004d;
                case 66: goto L_0x0039;
                case 67: goto L_0x043a;
                case 68: goto L_0x0025;
                case 69: goto L_0x03de;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = -1340454363(0xffffffffb01a4a25, float:-5.613024E-10)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.TpQ r0 = (X.C14076TpQ) r0
            com.instagram.common.session.UserSession r4 = r0.A0R
            androidx.fragment.app.Fragment r3 = r0.A0O
            java.lang.String r2 = "explore_content"
            r1 = 0
            java.lang.String r0 = "discover_people"
            X.F79.A00(r3, r4, r2, r0, r1)
            r0 = 853883976(0x32e53c48, float:2.6686521E-8)
        L_0x0021:
            X.AnonymousClass0fD.A0C(r0, r5)
        L_0x0024:
            return
        L_0x0025:
            r0 = 1337427864(0x4fb78798, float:6.1582336E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WPk r0 = (X.C19204WPk) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A0K
            X.DbT.A1K(r0)
            r0 = -979723400(0xffffffffc59a9b78, float:-4947.4336)
            goto L_0x0021
        L_0x0039:
            r0 = -292570313(0xffffffffee8fbb37, float:-2.2241343E28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WPk r0 = (X.C19204WPk) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A0K
            r0.A0F()
            r0 = -1948421281(0xffffffff8bdd735f, float:-8.5299695E-32)
            goto L_0x0021
        L_0x004d:
            r0 = -863527558(0xffffffffcc879d7a, float:-7.1101392E7)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WPk r0 = (X.C19204WPk) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = r0.A0K
            r0 = 1
            r1.A0K = r0
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r1.A0A
            X.C13990Tnq.A1K(r0)
            r0 = 871517231(0x33f24c2f, float:1.1282861E-7)
            goto L_0x0021
        L_0x0066:
            r0 = -829802724(0xffffffffce8a371c, float:-1.15943373E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A01
            X.UZz r9 = (X.C15293UZz) r9
            android.content.Context r8 = r9.requireContext()
            X.0eM r0 = r9.A00
            com.instagram.common.session.UserSession r10 = X.AnonymousClass7TE.A0l(r0)
            X.Tva r11 = X.C14407Tva.MAP
            r4 = 2131955148(0x7f130dcc, float:1.9546815E38)
            r3 = 2131955147(0x7f130dcb, float:1.9546813E38)
            r1 = 2131955136(0x7f130dc0, float:1.954679E38)
            r0 = 1
            X.0qQ.A0B(r10, r0)
            X.8ab r2 = new X.8ab
            r2.<init>((android.content.Context) r8)
            r2.A09(r4)
            r2.A08(r3)
            r7 = 4
            X.W4z r6 = new X.W4z
            r6.<init>(r7, r8, r9, r10, r11)
            r2.A0I(r6, r1)
            r1 = 2131968513(0x7f134201, float:1.9573923E38)
            r0 = 0
            r2.A0H(r0, r1)
            X.DbT.A1V(r2)
            r0 = 1027312564(0x3d3b8bb4, float:0.04578753)
            goto L_0x0021
        L_0x00ad:
            r0 = -66594448(0xfffffffffc07d970, float:-2.821481E36)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.discovery.mediamap.fragment.LocationListFragment r0 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = X.C13990Tnq.A0P(r0)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = r0.A00
            r1.A0I(r0)
            r0 = 1173026847(0x45eaf81f, float:7519.015)
            goto L_0x0021
        L_0x00c6:
            r0 = -272163022(0xffffffffefc71f32, float:-1.2325046E29)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = X.C13990Tnq.A0P(r0)
            r0.A0E()
            r0 = -128602322(0xfffffffff855af2e, float:-1.733613E34)
            goto L_0x0021
        L_0x00dd:
            r0 = -835216379(0xffffffffce379c05, float:-7.7011386E8)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.discovery.mediamap.fragment.LocationListFragment r0 = (com.instagram.discovery.mediamap.fragment.LocationListFragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = X.C13990Tnq.A0P(r0)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r0 = r0.A00
            r1.A0I(r0)
            r0 = 1710162296(0x65ef0178, float:1.41084085E23)
            goto L_0x0021
        L_0x00f6:
            r0 = 1608921874(0x5fe63312, float:3.3175243E19)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = X.C13990Tnq.A0P(r0)
            r0.A0E()
            r0 = -1122853784(0xffffffffbd129c68, float:-0.035793692)
            goto L_0x0021
        L_0x010d:
            r0 = -824943468(0xffffffffced45c94, float:-1.7814185E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = X.C13990Tnq.A0P(r0)
            r0.A0E()
            r0 = 1272119456(0x4bd300a0, float:2.7656512E7)
            goto L_0x0021
        L_0x0124:
            r0 = -1161440335(0xffffffffbac5d3b1, float:-0.0015092996)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = X.C13990Tnq.A0P(r0)
            X.W1f r0 = r1.A0B
            r0.A05()
            com.instagram.discovery.mediamap.intf.MediaMapQuery r0 = com.instagram.discovery.mediamap.intf.MediaMapQuery.A08
            r1.A0E = r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.A07(r1)
            r0 = 1
            com.instagram.discovery.mediamap.fragment.MediaMapFragment.A0A(r1, r0)
            r0 = -1213510602(0xffffffffb7ab4c36, float:-2.0420277E-5)
            goto L_0x0021
        L_0x0148:
            r0 = 686388227(0x28e97403, float:2.5918509E-14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WVv r0 = (X.C19354WVv) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A0C
            r0.A0C()
            r0 = 1868236987(0x6f5b08bb, float:6.778777E28)
            goto L_0x0021
        L_0x015d:
            r0 = 1872468926(0x6f9b9bbe, float:9.631691E28)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WVv r0 = (X.C19354WVv) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A0C
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r0.A0A
            X.C13990Tnq.A1K(r0)
            r0 = 363986508(0x15b1fe4c, float:7.189094E-26)
            goto L_0x0021
        L_0x0174:
            r0 = 704660446(0x2a0043de, float:1.139223E-13)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WVu r0 = (X.C19353WVu) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A02
            r0.A0D()
            r0 = -188107611(0xfffffffff4c9b4a5, float:-1.2784614E32)
            goto L_0x0021
        L_0x0189:
            r0 = -935741104(0xffffffffc839b950, float:-190181.25)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WVu r0 = (X.C19353WVu) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A02
            r0.A0C()
            r0 = -463504285(0xffffffffe45f7c63, float:-1.6490348E22)
            goto L_0x0021
        L_0x019e:
            r0 = -1081706556(0xffffffffbf8677c4, float:-1.05053)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.WVu r0 = (X.C19353WVu) r0
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r0.A02
            com.instagram.discovery.mediamap.fragment.MapBottomSheetController r0 = r0.A0A
            X.C13990Tnq.A1K(r0)
            r0 = 1675297694(0x63db039e, float:8.080195E21)
            goto L_0x0021
        L_0x01b5:
            r0 = 1341917705(0x4ffc0a09, float:8.4570322E9)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZB r0 = (X.UZB) r0
            r0.A03()
            r0 = -195960591(0xfffffffff451e0f1, float:-6.651321E31)
            goto L_0x0021
        L_0x01c8:
            r0 = -670558695(0xffffffffd8081619, float:-5.9851396E14)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Ukw r0 = (X.C15931Ukw) r0
            X.UHR r6 = r0.A02
            if (r6 == 0) goto L_0x0c72
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r0 = X.UHR.A00(r6)
            com.facebook.locationsharing.core.models.Location r0 = r0.A04
            X.OYm r4 = r6.A06
            if (r0 == 0) goto L_0x0231
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r6.A0B(r0)
            android.app.Activity r7 = r4.A01
            if (r7 == 0) goto L_0x022c
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r1 = 1
            r0 = 958(0x3be, float:1.342E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putBoolean(r0, r1)
            r0 = 450(0x1c2, float:6.3E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 2348(0x92c, float:3.29E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putString(r1, r0)
            com.instagram.common.session.UserSession r3 = r4.A02
            java.lang.Class<com.instagram.modal.ModalActivity> r1 = com.instagram.modal.ModalActivity.class
            r0 = 164(0xa4, float:2.3E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r7, r2, r3, r1, r0)
            X.1wn r0 = r4.A00
            if (r0 != 0) goto L_0x022c
            r0 = 2
            X.WQd r2 = new X.WQd
            r2.<init>(r0, r6, r4)
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r3)
            java.lang.Class<X.Lfa> r0 = X.C64648Lfa.class
            r1.A01(r2, r0)
            r4.A00 = r2
        L_0x022c:
            r0 = -952212754(0xffffffffc73e62ee, float:-48738.93)
            goto L_0x0021
        L_0x0231:
            android.app.Activity r1 = r4.A01
            if (r1 == 0) goto L_0x022c
            java.lang.String r0 = "android.permission.ACCESS_FINE_LOCATION"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            boolean r0 = X.1DL.A08(r1, r0)
            if (r0 != 0) goto L_0x022c
            X.C71014OYm.A00(r6, r4)
            goto L_0x022c
        L_0x0245:
            r0 = 437548409(0x1a147579, float:3.0700576E-23)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.UZB r0 = (X.UZB) r0
            r0.A03()
            r0 = -850320482(0xffffffffcd51239e, float:-2.19298272E8)
            goto L_0x0021
        L_0x0258:
            r0 = -105950543(0xfffffffff9af52b1, float:-1.1379114E35)
            int r5 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.Ukw r4 = (X.C15931Ukw) r4
            X.UHR r3 = r4.A02
            java.lang.String r2 = "locationSharingPresenter"
            if (r3 == 0) goto L_0x0c8d
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x0273
            java.lang.String r1 = "PIN_DRAGGING_STOPPED"
            r0 = 0
            X.UHS.A04(r3, r0, r1)
        L_0x0273:
            X.UHR r1 = r4.A02
            if (r1 == 0) goto L_0x0c8d
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r1.A0B(r0)
            r0 = -1042813028(0xffffffffc1d7ef9c, float:-26.991997)
            goto L_0x0021
        L_0x0283:
            java.lang.Object r0 = r1.A01
            X.WUX r0 = (X.WUX) r0
            X.84u r0 = r0.A03
            com.instagram.user.model.Product r8 = r0.A04()
            if (r8 == 0) goto L_0x0024
            boolean r1 = r8.A04()
            if (r1 == 0) goto L_0x03b9
            boolean r1 = r8.A0P
            if (r1 == 0) goto L_0x0024
            boolean r1 = r0.A06()
            if (r1 == 0) goto L_0x031d
            X.28D r1 = r0.A00
            java.lang.String r14 = r1.name()
            java.lang.String r6 = r0.A06
            if (r6 == 0) goto L_0x0ca8
            java.lang.String r5 = r0.A03
            if (r5 != 0) goto L_0x02b1
            java.lang.String r5 = X.AnonymousClass7TF.A0b()
        L_0x02b1:
            X.VhI r1 = r0.A0D
            java.lang.String r9 = "add_to_bag"
            r11 = r14
            r7 = r1
            r10 = r6
            r12 = r5
            r7.A00(r8, r9, r10, r11, r12)
            X.4DH r1 = r0.A0A
            android.content.Context r21 = r1.getContext()
            androidx.fragment.app.FragmentActivity r22 = r1.getActivity()
            if (r22 == 0) goto L_0x0024
            if (r21 == 0) goto L_0x0024
            com.instagram.user.model.Product r1 = r0.A04()
            r7 = 0
            if (r1 == 0) goto L_0x031b
            com.instagram.user.model.User r4 = r1.A0B
        L_0x02d3:
            com.instagram.common.session.UserSession r2 = r0.A0B
            if (r4 == 0) goto L_0x0318
            java.lang.String r17 = X.AnonymousClass3ZA.A00(r4)
        L_0x02db:
            java.lang.String r1 = r0.A0G
            X.1Xj r11 = X.C3504784u.A00(r0)
            java.lang.String r16 = "instagram_shopping_camera"
            r9 = r0
            r10 = r2
            r12 = r7
            r13 = r8
            r15 = r6
            r18 = r5
            r19 = r1
            r20 = r7
            X.W2s.A06(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            X.6xT r1 = X.C323426xT.A00(r2)
            X.6xZ r3 = r1.A07
            if (r4 == 0) goto L_0x02ff
            java.lang.String r2 = X.AnonymousClass3ZA.A00(r4)
            if (r2 != 0) goto L_0x0301
        L_0x02ff:
            java.lang.String r2 = ""
        L_0x0301:
            X.WcC r1 = new X.WcC
            r20 = r1
            r23 = r0
            r24 = r8
            r25 = r4
            r26 = r5
            r27 = r14
            r28 = r6
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28)
            r3.A0D(r1, r8, r2, r7)
            return
        L_0x0318:
            r17 = r7
            goto L_0x02db
        L_0x031b:
            r4 = r7
            goto L_0x02d3
        L_0x031d:
            java.lang.String r10 = r0.A03
            if (r10 != 0) goto L_0x0325
            java.lang.String r10 = X.AnonymousClass7TF.A0b()
        L_0x0325:
            X.VhI r3 = r0.A0D
            java.lang.String r2 = r0.A06
            X.28D r1 = r0.A00
            java.lang.String r15 = r1.name()
            java.lang.String r13 = "checkout"
            r11 = r3
            r12 = r8
            r14 = r2
            r16 = r10
            r11.A00(r12, r13, r14, r15, r16)
            X.4DH r6 = r0.A0A
            androidx.fragment.app.FragmentActivity r3 = r6.getActivity()
            if (r3 == 0) goto L_0x0024
            java.lang.String r1 = r0.A07
            r16 = 0
            if (r1 != 0) goto L_0x03ac
            r5 = r16
        L_0x0349:
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            com.instagram.model.shopping.incentives.igfunded.IgFundedIncentive r1 = r0.A0C
            if (r1 == 0) goto L_0x0357
            java.lang.String r1 = r1.A07
            r2.add(r1)
        L_0x0357:
            if (r5 == 0) goto L_0x03a9
            com.instagram.common.session.UserSession r1 = r0.A0B
            com.instagram.user.model.User r4 = r5.A2A(r1)
        L_0x035f:
            com.instagram.user.model.User r1 = r8.A0B
            if (r1 == 0) goto L_0x0369
            java.lang.String r9 = X.AnonymousClass3ZA.A00(r1)
            if (r9 != 0) goto L_0x036b
        L_0x0369:
            java.lang.String r9 = ""
        L_0x036b:
            java.lang.String r11 = "instagram_shopping_camera"
            java.lang.String r12 = r6.getModuleName()
            if (r5 == 0) goto L_0x03a3
            if (r4 == 0) goto L_0x03a3
            java.lang.String r14 = r4.getId()
        L_0x0379:
            java.lang.String r15 = r5.A30()
            com.instagram.common.session.UserSession r1 = r0.A0B
            java.lang.String r16 = X.C231122qu.A0F(r1, r5)
        L_0x0383:
            r17 = 0
            r23 = 0
            java.lang.String r1 = r0.A0G
            java.lang.String r13 = "shopping_camera"
            r19 = r13
            r20 = r17
            r21 = r17
            r22 = r2
            r18 = r1
            com.instagram.model.payments.checkout.CheckoutLaunchParams r2 = X.C18769W0q.A01(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.1Y6 r1 = X.VFA.A00()
            com.instagram.common.session.UserSession r0 = r0.A0B
            r1.A04(r3, r0, r2, r13)
            return
        L_0x03a3:
            r14 = r16
            if (r5 != 0) goto L_0x0379
            r15 = r14
            goto L_0x0383
        L_0x03a9:
            r4 = r16
            goto L_0x035f
        L_0x03ac:
            com.instagram.common.session.UserSession r1 = r0.A0B
            X.1E8 r2 = X.1E7.A00(r1)
            java.lang.String r1 = r0.A07
            X.1Xj r5 = r2.A02(r1)
            goto L_0x0349
        L_0x03b9:
            X.VhI r7 = r0.A0D
            java.lang.String r10 = r0.A06
            X.28D r1 = r0.A00
            java.lang.String r11 = r1.name()
            java.lang.String r9 = "webclick"
            r12 = 0
            r7.A00(r8, r9, r10, r11, r12)
            X.4DH r1 = r0.A0A
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            if (r1 == 0) goto L_0x0024
            com.instagram.common.session.UserSession r2 = r0.A0B
            java.lang.String r0 = r0.A0H
            java.lang.String r6 = "instagram_shopping_camera"
            r3 = r8
            r4 = r12
            r5 = r0
            X.FH7.A0A(r1, r2, r3, r4, r5, r6)
            return
        L_0x03de:
            r0 = -364521738(0xffffffffea45d6f6, float:-5.979338E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WPk r1 = (X.C19204WPk) r1
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = r1.A0K
            X.VwL r1 = r1.mMapViewController
            X.U4T r3 = r1.A04
            com.facebook.maps.delegate.common.interfaces.MapOptions r1 = r3.A07
            X.Uyo r2 = r1.A05
            X.Uyo r1 = X.C16652Uyo.MAPBOX
            if (r2 == r1) goto L_0x0400
            r2 = 4
            X.WIS r1 = new X.WIS
            r1.<init>((X.U4T) r3, (int) r2)
            r3.A04(r1)
        L_0x0400:
            r1 = 1021882173(0x3ce8af3d, float:0.028403873)
            goto L_0x0b05
        L_0x0405:
            r0 = -1747483654(0xffffffff97d783fa, float:-1.3927365E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.WUv r2 = (X.C19339WUv) r2
            X.OVW r3 = r2.A0B
            r4 = 0
            if (r3 != 0) goto L_0x0419
            java.lang.String r2 = "datePickerController"
            goto L_0x0c8d
        L_0x0419:
            boolean r1 = X.C19339WUv.A05(r2)
            if (r1 == 0) goto L_0x042f
            r6 = r4
        L_0x0420:
            r9 = 0
            r5 = r4
            r7 = r4
            r8 = r4
            r3.A01(r4, r5, r6, r7, r8, r9)
            android.widget.EditText r1 = r2.A07
            if (r1 != 0) goto L_0x0432
            java.lang.String r2 = "stickerTitleView"
            goto L_0x0c8d
        L_0x042f:
            java.util.Date r6 = r2.A0F
            goto L_0x0420
        L_0x0432:
            r1.clearFocus()
            r1 = -1058442259(0xffffffffc0e973ed, float:-7.295401)
            goto L_0x0b05
        L_0x043a:
            r0 = 1587510342(0x5e9f7c46, float:5.7460687E18)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.WPk r8 = (X.C19204WPk) r8
            X.1Wr r4 = X.1Wr.A00
            if (r4 == 0) goto L_0x046b
            com.instagram.common.session.UserSession r5 = r8.A0H
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330514176557730(0x811269000042a2, double:3.03890168426899E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x046b
            android.app.Activity r6 = r8.A08
            X.4cM r7 = r8.A0L
            X.MTx r8 = r8.A0M
            r10 = 1
            X.Uwa r11 = X.C16530Uwa.DISCOVERY_MAP
            java.lang.String r9 = "MapChromeController"
            r4.requestLocationUpdates(r5, r6, r7, r8, r9, r10, r11)
        L_0x0466:
            r0 = 1045586163(0x3e5260f3, float:0.20544796)
            goto L_0x0ca4
        L_0x046b:
            android.app.Activity r7 = r8.A08
            java.lang.String r6 = "android.permission.ACCESS_FINE_LOCATION"
            boolean r0 = X.1DL.A07(r7, r6)
            if (r0 == 0) goto L_0x0479
            r8.A07()
            goto L_0x0466
        L_0x0479:
            com.instagram.common.session.UserSession r5 = r8.A0H
            X.4O6 r4 = X.C19204WPk.A00(r7, r5, r8)
            r8.A03 = r4
            java.lang.String r3 = "DISCOVERY_MAP"
            java.lang.String r1 = "MapChromeController::onTapCurrentLocationButton"
            X.4O7 r0 = X.VK6.A00
            r0.A05(r5, r4, r3, r1)
            r0 = 2
            X.WRm r1 = new X.WRm
            r1.<init>(r8, r0)
            java.lang.String[] r0 = new java.lang.String[]{r6}
            X.1DL.A04(r7, r1, r0)
            goto L_0x0466
        L_0x0498:
            r0 = 1297174033(0x4d514e11, float:2.19472144E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WPk r1 = (X.C19204WPk) r1
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r3 = r1.A0K
            X.Vvi r1 = r3.A0C
            java.util.TreeSet r4 = r1.A02()
            int r1 = r4.size()
            r11 = 1
            if (r1 <= r11) goto L_0x054b
            X.W3Q r8 = r3.A0F
            com.instagram.discovery.mediamap.intf.MediaMapQuery r7 = r3.A0E
            java.util.LinkedList r6 = new java.util.LinkedList
            r6.<init>()
            java.util.Iterator r5 = r4.iterator()
        L_0x04bf:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x04d8
            java.lang.Object r2 = r5.next()
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = (com.instagram.discovery.mediamap.model.MediaMapPin) r2
            com.instagram.model.venue.LocationDict r1 = r2.A09
            X.C18231Vnv.A00(r1)
            java.lang.String r1 = X.C18231Vnv.A01(r2)
            r6.add(r1)
            goto L_0x04bf
        L_0x04d8:
            java.lang.String r1 = "instagram_map_tap_cluster"
            X.1Ln r2 = X.W3Q.A01(r8, r1)
            X.C13990Tnq.A12(r2, r7)
            java.lang.String r1 = "location_ids"
            r2.A0S(r1, r6)
            X.W3Q.A04(r2, r8)
            r2.Cgf()
            X.VwL r5 = r3.mMapViewController
            java.util.ArrayList r6 = com.instagram.discovery.mediamap.fragment.MediaMapFragment.A01(r4)
            int r1 = r3.A00
            int r1 = r1 * 2
            float r7 = (float) r1
            int r8 = r3.A01
            r10 = 300(0x12c, float:4.2E-43)
            r9 = r8
            r5.A0F(r6, r7, r8, r9, r10, r11)
            X.Vvi r2 = r3.A0C
            r1 = 0
            X.C18642Vvi.A00(r2, r1)
            r3.A0N = r11
            X.W1f r5 = r3.A0B
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            com.instagram.common.session.UserSession r1 = r5.A05
            X.DbU.A1D(r3, r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            java.lang.String r1 = "arg_map_pins"
            r3.putParcelableArrayList(r1, r2)
            com.instagram.discovery.mediamap.fragment.LocationListFragmentMode r2 = com.instagram.discovery.mediamap.fragment.LocationListFragmentMode.PIN_LIST
            java.lang.String r1 = "arg_list_mode"
            r3.putParcelable(r1, r2)
            java.lang.String r2 = r5.A06
            java.lang.String r1 = "arg_session_id"
            r3.putString(r1, r2)
            com.instagram.discovery.mediamap.fragment.LocationListFragment r4 = new com.instagram.discovery.mediamap.fragment.LocationListFragment
            r4.<init>()
            r4.setArguments(r3)
            int r3 = r5.A01
            r1 = -1
            if (r3 == r1) goto L_0x053e
            X.0hq r2 = r5.A03
            r1 = 0
            r2.A0e(r3, r1, r1)
        L_0x053e:
            X.0s1 r2 = X.C18780W1f.A00(r4, r5)
            java.lang.String r1 = "LIST"
            r2.A0I(r1)
            r1 = 0
            r2.A0J(r1)
        L_0x054b:
            r1 = -1181742645(0xffffffffb99009cb, float:-2.7473117E-4)
            goto L_0x0b05
        L_0x0550:
            r0 = -1407503253(0xffffffffac1b346b, float:-2.2055923E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.Fragment r1 = r1.mParentFragment
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = (com.instagram.discovery.mediamap.fragment.MediaMapFragment) r1
            if (r1 == 0) goto L_0x056f
            X.W1f r1 = r1.A0B
            X.0hq r3 = r1.A03
            int r2 = r3.A0M()
            r1 = 1
            if (r2 <= r1) goto L_0x056f
            r3.A0c()
        L_0x056f:
            r1 = -1300088939(0xffffffffb2823795, float:-1.5159268E-8)
            goto L_0x0b05
        L_0x0574:
            r0 = 1790200013(0x6ab448cd, float:1.0897522E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.discovery.mediamap.fragment.LocationSearchFragment r2 = (com.instagram.discovery.mediamap.fragment.LocationSearchFragment) r2
            com.instagram.ui.widget.searchedittext.SearchEditText r1 = r2.mSearchEditText
            r1.clearFocus()
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r1 = X.C13990Tnq.A0P(r2)
            X.W1f r1 = r1.A0B
            X.0hq r3 = r1.A03
            int r2 = r3.A0M()
            r1 = 1
            if (r2 <= r1) goto L_0x0596
            r3.A0c()
        L_0x0596:
            r1 = 947177680(0x3874c8d0, float:5.8361155E-5)
            goto L_0x0b05
        L_0x059b:
            r0 = 1060351380(0x3f33ad94, float:0.70186734)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.UEn r6 = (X.C14908UEn) r6
            int r1 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            com.instagram.discovery.mediamap.fragment.LocationListFragment r5 = r6.A0A
            if (r5 == 0) goto L_0x05dc
            X.WRy r1 = r6.A01
            if (r1 == 0) goto L_0x05dc
            X.Vhn r2 = r6.A08
            java.lang.String r1 = r1.A01
            r4 = 0
            java.util.HashMap r2 = r2.A03
            java.lang.Object r1 = r2.get(r1)
            if (r1 == 0) goto L_0x05dc
            X.WRy r1 = r6.A01
            if (r1 == 0) goto L_0x05e3
            java.lang.String r1 = r1.A01
            java.lang.Object r3 = r2.get(r1)
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
        L_0x05c9:
            X.WRy r2 = r6.A01
            if (r2 == 0) goto L_0x05e1
            X.Vko r1 = r6.A09
            java.lang.String r2 = r2.A01
            java.util.Map r1 = r1.A02
            java.lang.Object r1 = r1.get(r2)
            com.instagram.discovery.mediamap.model.MediaMapPin r1 = (com.instagram.discovery.mediamap.model.MediaMapPin) r1
        L_0x05d9:
            r5.A09(r1, r3, r6, r4)
        L_0x05dc:
            r1 = -816399933(0xffffffffcf56b9c3, float:-3.6024983E9)
            goto L_0x0b05
        L_0x05e1:
            r1 = 0
            goto L_0x05d9
        L_0x05e3:
            r3 = 0
            goto L_0x05c9
        L_0x05e5:
            java.lang.Object r4 = r1.A01
            X.WVv r4 = (X.C19354WVv) r4
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r4.A0D
            X.W3Q r3 = r0.A0F
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r4.A00
            com.instagram.discovery.mediamap.intf.MediaMapQuery r1 = r0.A0E
            java.lang.String r0 = "instagram_map_location_detail_tap_ellipses"
            X.DbZ.A1a(r1, r3, r2, r0)
            com.instagram.discovery.mediamap.fragment.MediaMapFragment r0 = r4.A0C
            r0.A0D()
            return
        L_0x05fc:
            r0 = -67188312(0xfffffffffbfec9a8, float:-2.645867E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UDO r2 = (X.UDO) r2
            int r3 = r2.getBindingAdapterPosition()
            r1 = -1
            if (r3 == r1) goto L_0x0617
            X.0sP r2 = r2.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r2.invoke(r1)
        L_0x0617:
            r1 = -217452918(0xfffffffff309ee8a, float:-1.0928083E31)
            goto L_0x0b05
        L_0x061c:
            r0 = 80780237(0x4d09bcd, float:4.9043645E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OuE r1 = (X.C71982OuE) r1
            X.V4b r1 = r1.A02
            if (r1 == 0) goto L_0x062e
            r1.A00()
        L_0x062e:
            r1 = 1931318666(0x731d958a, float:1.2485102E31)
            goto L_0x0b05
        L_0x0633:
            r0 = 1323111189(0x4edd1315, float:1.85450765E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OuE r1 = (X.C71982OuE) r1
            X.V4b r1 = r1.A02
            if (r1 == 0) goto L_0x0645
            r1.A01()
        L_0x0645:
            r1 = -396953185(0xffffffffe856f99f, float:-4.0607645E24)
            goto L_0x0b05
        L_0x064a:
            r0 = 1033921138(0x3da06272, float:0.07831277)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OuE r1 = (X.C71982OuE) r1
            X.V4b r1 = r1.A02
            if (r1 == 0) goto L_0x065c
            r1.A02()
        L_0x065c:
            r1 = -1637509297(0xffffffff9e65974f, float:-1.2154449E-20)
            goto L_0x0b05
        L_0x0661:
            r0 = 2067915833(0x7b41e439, float:1.0067422E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OuE r1 = (X.C71982OuE) r1
            X.V4b r1 = r1.A02
            if (r1 == 0) goto L_0x0673
            r1.A02()
        L_0x0673:
            r1 = -1984869173(0xffffffff89b14ccb, float:-4.2683416E-33)
            goto L_0x0b05
        L_0x0678:
            r0 = 1744712029(0x67fe315d, float:2.4007834E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.OuE r1 = (X.C71982OuE) r1
            X.V4b r1 = r1.A02
            if (r1 == 0) goto L_0x068a
            r1.A03()
        L_0x068a:
            r1 = -191835883(0xfffffffff490d115, float:-9.178851E31)
            goto L_0x0b05
        L_0x068f:
            r0 = -1952595552(0xffffffff8b9dc1a0, float:-6.0765535E-32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Ukw r3 = (X.C15931Ukw) r3
            com.instagram.igds.components.button.IgdsButton r2 = r3.A05
            if (r2 == 0) goto L_0x06a2
            r1 = 1
            r2.setLoading(r1)
        L_0x06a2:
            X.UHR r2 = r3.A02
            if (r2 == 0) goto L_0x0c72
            r1 = 1
            X.C18431Vra.A06(r2, r1)
            r1 = 312001639(0x1298c467, float:9.640966E-28)
            goto L_0x0b05
        L_0x06af:
            r0 = 127180064(0x7949d20, float:2.2360915E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ukw r1 = (X.C15931Ukw) r1
            X.UHR r3 = r1.A02
            if (r3 == 0) goto L_0x0c72
            boolean r1 = r3.A00
            if (r1 == 0) goto L_0x06cf
            java.lang.String r2 = "PIN_DRAGGING_STARTED"
            r1 = 0
            X.UHS.A04(r3, r1, r2)
            android.os.Handler r2 = r3.A00
            java.lang.Runnable r1 = r3.A07
            r2.post(r1)
        L_0x06cf:
            r1 = 1396538955(0x533d7e4b, float:8.1386766E11)
            goto L_0x0b05
        L_0x06d4:
            r0 = 2025630575(0x78bcab6f, float:3.0613403E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ukv r1 = (X.C15930Ukv) r1
            X.UHR r2 = r1.A01
            if (r2 == 0) goto L_0x0c72
            r1 = 1
            X.C18431Vra.A06(r2, r1)
            r1 = 1080443112(0x406640e8, float:3.5977116)
            goto L_0x0b05
        L_0x06ec:
            r0 = 1079981776(0x405f36d0, float:3.4877205)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ukv r1 = (X.C15930Ukv) r1
            X.UHR r3 = r1.A01
            if (r3 == 0) goto L_0x0c72
            long r1 = X.C15930Ukv.A0G
            r3.A09(r1)
            r1 = -2011377815(0xffffffff881ccf69, float:-4.718835E-34)
            goto L_0x0b05
        L_0x0705:
            r0 = -505407569(0xffffffffe1e017af, float:-5.1672216E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1I(r1)
            r1 = -937225713(0xffffffffc823120f, float:-166984.23)
            goto L_0x0b05
        L_0x0718:
            r0 = 1454657052(0x56b44e1c, float:9.9123785E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UZB r1 = (X.UZB) r1
            r1.A03()
            r1 = -16378235(0xffffffffff061685, float:-1.7823348E38)
            goto L_0x0b05
        L_0x072b:
            r0 = -79216804(0xfffffffffb473f5c, float:-1.03455216E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.U4E r1 = (X.U4E) r1
            X.VMz r1 = r1.A01
            X.Uaf r1 = r1.A00
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.0eM r1 = r1.A06
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.2EG r2 = X.2EG.A2B
            r1 = 78
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.Dbb.A0k(r4, r3, r2, r1)
            r1 = -87160028(0xffffffffface0b24, float:-5.3491956E35)
            goto L_0x0b05
        L_0x0754:
            r0 = 1946535212(0x7405c52c, float:4.239347E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYi r1 = (X.C15268UYi) r1
            X.VRt r1 = r1.A00
            if (r1 == 0) goto L_0x0769
            X.7Pu r2 = r1.A01
            r1 = 0
            r2.A0L(r1)
        L_0x0769:
            r1 = -1405937012(0xffffffffac331a8c, float:-2.5452166E-12)
            goto L_0x0b05
        L_0x076e:
            r0 = -1018545231(0xffffffffc34a3bb1, float:-202.23317)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UYi r1 = (X.C15268UYi) r1
            X.VRt r3 = r1.A00
            if (r3 == 0) goto L_0x0796
            com.instagram.igds.components.switchbutton.IgdsSwitch r1 = r1.A01
            if (r1 == 0) goto L_0x079b
            boolean r2 = r1.isChecked()
        L_0x0785:
            X.ALf r1 = r3.A00
            com.instagram.common.session.UserSession r1 = r1.A0K
            X.1Av r1 = X.1Au.A00(r1)
            r1.A1C(r2)
            X.7Pu r2 = r3.A01
            r1 = 0
            r2.A0L(r1)
        L_0x0796:
            r1 = 316150821(0x12d81425, float:1.3636482E-27)
            goto L_0x0b05
        L_0x079b:
            r2 = 0
            goto L_0x0785
        L_0x079d:
            r0 = 150637765(0x8fa8cc5, float:1.5079422E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.TsL r1 = (X.C14238TsL) r1
            X.X3Z r2 = r1.A05
            java.lang.Integer r1 = r1.A01
            r2.Czg(r1)
            r1 = 287955621(0x1129daa5, float:1.3399124E-28)
            goto L_0x0b05
        L_0x07b4:
            r0 = 1447996365(0x564eabcd, float:5.6809319E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WPf r1 = (X.C19199WPf) r1
            androidx.viewpager.widget.ViewPager r3 = r1.A08
            int r2 = r3.getCurrentItem()
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r1 = r1.A0C
            com.google.common.collect.ImmutableList r1 = r1.A02
            int r1 = X.Pxe.A0A(r1)
            if (r2 >= r1) goto L_0x07d4
            int r1 = r2 + 1
            r3.setCurrentItem(r1)
        L_0x07d4:
            r1 = -1561085170(0xffffffffa2f3bb0e, float:-6.6063334E-18)
            goto L_0x0b05
        L_0x07d9:
            r0 = 901273381(0x35b85725, float:1.3734431E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.WPf r1 = (X.C19199WPf) r1
            androidx.viewpager.widget.ViewPager r2 = r1.A08
            int r1 = r2.getCurrentItem()
            if (r1 <= 0) goto L_0x07f1
            int r1 = r1 + -1
            r2.setCurrentItem(r1)
        L_0x07f1:
            r1 = -17171659(0xfffffffffef9fb35, float:-1.6614106E38)
            goto L_0x0b05
        L_0x07f6:
            r0 = -1810230245(0xffffffff941a141b, float:-7.778978E-27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Lky r0 = (X.C64959Lky) r0
            X.8MU r7 = r0.A03
            X.8ME r7 = (X.AnonymousClass8ME) r7
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.common.session.UserSession r6 = r7.A0r
            com.instagram.user.model.User r0 = r0.A01(r6)
            boolean r0 = r0.A1R()
            r5 = 0
            if (r0 == 0) goto L_0x0843
            X.3kF r4 = X.C249713kF.A00
            X.4DH r3 = r7.A0l
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0iw r0 = r7.A0o
            java.lang.String r0 = r0.getModuleName()
            X.ViV r1 = r4.A0A(r1, r6, r0)
            java.lang.String r0 = "entry_point_creator_swipe_up_to_shop"
            r1.A04 = r0
            r0 = 1
            r1.A06 = r0
            r1.A08 = r5
            r1.A07 = r5
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            r1.A00 = r3
            r1.A00()
        L_0x083e:
            r0 = 1321390012(0x4ec2cfbc, float:1.63419699E9)
            goto L_0x0ca4
        L_0x0843:
            java.lang.String r1 = r6.A06
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r6)
            java.lang.String r0 = r0.getUsername()
            com.instagram.user.model.User r3 = X.1aC.A05(r1, r0)
            X.80U r1 = r7.A1B
            X.8UF r0 = new X.8UF
            r0.<init>((com.instagram.user.model.User) r3)
            r1.E3H(r0)
            goto L_0x083e
        L_0x085c:
            r0 = 88522823(0x546c047, float:9.345231E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.37E r3 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r1.A01
            android.app.Activity r0 = (android.app.Activity) r0
            X.DbX.A10(r0, r3)
            r0 = 973599622(0x3a07f386, float:5.186129E-4)
            goto L_0x0ca4
        L_0x0871:
            r0 = -1687470292(0xffffffff9b6b3f2c, float:-1.9459156E-22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Uh4 r1 = (X.Uh4) r1
            r1.A00()
            r1 = 314836878(0x12c4078e, float:1.2371201E-27)
            goto L_0x0b05
        L_0x0884:
            r0 = 1122329620(0x42e56414, float:114.695465)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ugw r2 = (X.C15691Ugw) r2
            r1 = 1
            r2.A03(r1)
            r1 = 820677516(0x30ea8b8c, float:1.7065402E-9)
            goto L_0x0b05
        L_0x0898:
            r0 = 1647232622(0x622ec66e, float:8.0600796E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.UaY r3 = (X.C15325UaY) r3
            X.0eM r5 = r3.A0B
            X.1Ng r2 = X.DbX.A0R(r5)
            X.36l r1 = new X.36l
            r1.<init>()
            r2.A00(r1)
            X.Ugw r4 = r3.A01
            if (r4 == 0) goto L_0x0963
            X.Vku r1 = r3.A09
            com.google.common.collect.ImmutableList r2 = r1.A00()
            X.W1j r1 = r4.A09
            r1.A07(r2)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            X.5rw r2 = X.C297545rv.A00(r1)
            java.lang.String r5 = "favorites_management"
            X.0eM r1 = r3.A0A
            java.lang.String r4 = X.C13991Tnr.A0k(r1)
            com.instagram.common.session.UserSession r1 = r2.A00
            X.0wc r2 = X.DbW.A0J(r1, r5)
            java.lang.String r1 = "instagram_feed_favorites_done"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x08ef
            java.lang.String r1 = "module"
            r2.AAJ(r1, r5)
            java.lang.String r1 = "management_session_id"
            r2.AAJ(r1, r4)
            r2.Cgf()
        L_0x08ef:
            X.Ugw r1 = r3.A01
            if (r1 == 0) goto L_0x0963
            X.W1j r2 = r1.A09
            java.util.List r4 = r1.A01
            java.util.List r1 = r1.A02
            X.Vku r5 = r2.A02
            com.google.common.collect.ImmutableList r6 = r5.A00()
            X.3kO r7 = r6.iterator()
        L_0x0903:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x0928
            com.instagram.user.model.User r9 = X.DbT.A0k(r7)
            java.lang.Integer r6 = r2.A03(r9, r4, r1)
            java.lang.String r12 = X.C16916VAt.A00(r6)
            com.instagram.common.session.UserSession r6 = r2.A04
            X.5rw r8 = X.C297545rv.A00(r6)
            X.0iw r6 = r2.A03
            java.lang.String r10 = r6.getModuleName()
            java.lang.String r11 = r2.A00
            r13 = 0
            r8.A00(r9, r10, r11, r12, r13)
            goto L_0x0903
        L_0x0928:
            java.util.Iterator r7 = r4.iterator()
        L_0x092c:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x095b
            com.instagram.user.model.User r9 = X.DbT.A0k(r7)
            com.google.common.collect.ImmutableList r6 = r5.A00()
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x092c
            java.lang.Integer r6 = r2.A03(r9, r4, r1)
            java.lang.String r12 = X.C16916VAt.A00(r6)
            com.instagram.common.session.UserSession r6 = r2.A04
            X.5rw r8 = X.C297545rv.A00(r6)
            X.0iw r6 = r2.A03
            java.lang.String r10 = r6.getModuleName()
            java.lang.String r11 = r2.A00
            r13 = 0
            r8.A01(r9, r10, r11, r12, r13)
            goto L_0x092c
        L_0x095b:
            X.DbX.A1I(r3)
            r1 = 1704824264(0x659d8dc8, float:9.300337E22)
            goto L_0x0b05
        L_0x0963:
            java.lang.String r2 = "listController"
            goto L_0x0c8d
        L_0x0967:
            r0 = -1327538081(0xffffffffb0df605f, float:-1.6252776E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaY r1 = (X.C15325UaY) r1
            X.Uh4 r1 = r1.A02
            if (r1 != 0) goto L_0x097a
            java.lang.String r2 = "searchController"
            goto L_0x0c8d
        L_0x097a:
            r1.A00()
            r1 = 224495903(0xd61891f, float:6.949853E-31)
            goto L_0x0b05
        L_0x0982:
            r0 = 513942218(0x1ea222ca, float:1.7166806E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaY r1 = (X.C15325UaY) r1
            r1.onBackPressed()
            r1 = -375665338(0xffffffffe99bcd46, float:-2.354411E25)
            goto L_0x0b05
        L_0x0995:
            r0 = 1006286686(0x3bfab75e, float:0.0076512536)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Uh3 r0 = (X.C15697Uh3) r0
            X.Ua1 r0 = r0.A0J
            if (r0 == 0) goto L_0x09a7
            r0.A01()
        L_0x09a7:
            r0 = 643464434(0x265a7cf2, float:7.5803276E-16)
            goto L_0x0ca4
        L_0x09ac:
            r0 = -1746371688(0xffffffff97e87b98, float:-1.5023848E-24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Ua1 r1 = (X.C15295Ua1) r1
            r1.A01()
            r1 = 1195548270(0x47429e6e, float:49822.43)
            goto L_0x0b05
        L_0x09bf:
            r0 = 1875310593(0x6fc6f801, float:1.231557E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Ua1 r2 = (X.C15295Ua1) r2
            r1 = 1
            X.C15295Ua1.A00(r2, r1)
            r1 = 2125100296(0x7eaa7508, float:1.1328821E38)
            goto L_0x0b05
        L_0x09d3:
            r0 = 1985491822(0x7658336e, float:1.0962688E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UZb r1 = (X.C15273UZb) r1
            X.C15273UZb.A02(r1)
            r1 = 194733165(0xb9b646d, float:5.985493E-32)
            goto L_0x0b05
        L_0x09e6:
            r0 = -1185529694(0xffffffffb95640a2, float:-2.0432708E-4)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.U5O r1 = (X.U5O) r1
            r1.toggle()
            r1 = -1829708092(0xffffffff92f0dec4, float:-1.5201045E-27)
            goto L_0x0b05
        L_0x09f9:
            r0 = 632057787(0x25ac6fbb, float:2.9912955E-16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.U5O r1 = (X.U5O) r1
            r1.toggle()
            r1 = -1832229764(0xffffffff92ca647c, float:-1.2772764E-27)
            goto L_0x0b05
        L_0x0a0c:
            r0 = -1430924558(0xffffffffaab5d2f2, float:-3.2298432E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZS r2 = (X.UZS) r2
            X.0eM r1 = r2.A05
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            r1 = 2131970523(0x7f1349db, float:1.9578E38)
            java.lang.String r2 = X.DbU.A0m(r2, r1)
            java.lang.String r1 = "https://help.instagram.com/contact/502692143473097"
            X.C16904VAh.A00(r3, r4, r2, r1)
            r1 = -832891977(0xffffffffce5b13b7, float:-9.1887558E8)
            goto L_0x0b05
        L_0x0a32:
            r0 = -830519836(0xffffffffce7f45e4, float:-1.07069261E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZS r4 = (X.UZS) r4
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.String r1 = "instagram_ad_account_request_review_button"
            X.HWE.A00(r2, r3, r1)
            X.DbT.A1K(r4)
            r1 = -33888701(0xfffffffffdfae643, float:-4.1687823E37)
            goto L_0x0b05
        L_0x0a54:
            r0 = 157979885(0x96a94ed, float:2.823675E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = -935887958(0xffffffffc8377baa, float:-187886.66)
            goto L_0x0b05
        L_0x0a65:
            r0 = -103762687(0xfffffffff9d0b501, float:-1.3545862E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 1993905495(0x76d89557, float:2.1964162E33)
            goto L_0x0b05
        L_0x0a76:
            r0 = -1048171006(0xffffffffc1862e02, float:-16.772465)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.UZS r2 = (X.UZS) r2
            X.0eM r1 = r2.A05
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r3 = r2.requireActivity()
            r1 = 2131970545(0x7f1349f1, float:1.9578044E38)
            java.lang.String r2 = X.DbU.A0m(r2, r1)
            java.lang.String r1 = "https://business.facebook.com"
            X.C16904VAh.A00(r3, r4, r2, r1)
            r1 = 1342121613(0x4fff268d, float:8.5614331E9)
            goto L_0x0b05
        L_0x0a9b:
            r0 = 1681792781(0x643e1f0d, float:1.4028475E22)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZS r4 = (X.UZS) r4
            X.0eM r1 = r4.A05
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            java.lang.String r1 = "instagram_business_request_review_button"
            X.HWE.A00(r2, r3, r1)
            X.DbT.A1K(r4)
            r1 = -1136682622(0xffffffffbc3f9982, float:-0.011694314)
            goto L_0x0b05
        L_0x0abc:
            r0 = -871827966(0xffffffffcc08f602, float:-3.5903496E7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Dba.A1Q(r1)
            r1 = 846168528(0x326f81d0, float:1.3941147E-8)
            goto L_0x0b05
        L_0x0acc:
            r0 = -1629274485(0xffffffff9ee33e8b, float:-2.4060427E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZE r4 = (X.UZE) r4
            X.WGU r3 = r4.A00
            if (r3 == 0) goto L_0x0c6f
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = "discard_draft_exit_friction_sheet_button"
            r3.A0F(r2, r1)
            X.DbT.A1K(r4)
            r1 = 1809587043(0x6bdc1b63, float:5.3218602E26)
            goto L_0x0b05
        L_0x0ae9:
            r0 = -1321973393(0xffffffffb134496f, float:-2.623519E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZE r4 = (X.UZE) r4
            X.WGU r3 = r4.A00
            if (r3 == 0) goto L_0x0c6f
            X.UzE r2 = X.C16678UzE.OBJECTIVE
            java.lang.String r1 = "discard_draft_action_sheet_button"
            r3.A0F(r2, r1)
            X.DbT.A1K(r4)
            r1 = 1535950200(0x5b8cbd78, float:7.922964E16)
        L_0x0b05:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x0b09:
            r0 = -1317434148(0xffffffffb1798cdc, float:-3.6314338E-9)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.UZE r4 = (X.UZE) r4
            r0 = 0
            X.UZE.A01(r4, r0)
            X.WGU r3 = r4.A00
            if (r3 == 0) goto L_0x0c6f
            X.UzE r1 = X.C16678UzE.OBJECTIVE
            java.lang.String r0 = "save_draft_action_sheet_button"
            r3.A0F(r1, r0)
            X.W1k r5 = r4.A01
            if (r5 != 0) goto L_0x0b2b
            java.lang.String r2 = "dataFetcher"
            goto L_0x0c8d
        L_0x0b2b:
            X.0eM r0 = r4.A07
            java.lang.Object r4 = r0.getValue()
            X.Ufp r4 = (X.C15623Ufp) r4
            com.instagram.business.promote.model.PromoteData r7 = r5.A03
            com.instagram.business.promote.model.PromoteAudience r9 = r7.A07()
            com.instagram.api.schemas.XIGIGBoostDestination r0 = r7.A0i
            com.instagram.api.schemas.XIGIGBoostCallToAction r19 = X.C18677Vwa.A01(r0, r7)
            com.instagram.common.session.UserSession r6 = r7.A0y
            com.instagram.api.schemas.XIGIGBoostDestination r1 = r7.A0i
            boolean r0 = r7.A2e
            java.util.ArrayList r18 = X.W3x.A0J(r1, r6, r0)
            com.instagram.leadgen.core.api.LeadForm r0 = r7.A16
            r12 = 0
            if (r0 == 0) goto L_0x0c6b
            java.lang.String r0 = r0.A03
            r21 = r0
        L_0x0b52:
            int r3 = r7.A07
            int r8 = r7.A0A
            if (r9 == 0) goto L_0x0c62
            com.instagram.api.schemas.BoostedPostAudienceOption r0 = r9.A03
            if (r0 == 0) goto L_0x0c62
            int r1 = r0.ordinal()
            r0 = 17
            if (r1 != r0) goto L_0x0c5e
            com.instagram.api.schemas.BoostedPostAudienceOption r17 = com.instagram.api.schemas.BoostedPostAudienceOption.IG_PROMOTED_POST_AUTO
        L_0x0b66:
            boolean r0 = X.W3x.A0P(r9)
            if (r0 != 0) goto L_0x0c68
            java.lang.String r1 = r7.A1Z
        L_0x0b6e:
            java.lang.String r13 = r7.A1S
            java.lang.String r11 = r7.A1A
            com.instagram.business.boost.model.AdCreativeAuthorizationCategory r0 = r7.A0k
            r20 = r0
            com.instagram.api.schemas.XIGIGBoostDestination r14 = r7.A0i
            com.instagram.api.schemas.XFBCTXWelcomeMessageStatus r10 = r7.A0a
            java.lang.String r0 = r7.A1I
            if (r3 != 0) goto L_0x0c58
            r3 = r12
        L_0x0b7f:
            if (r8 == 0) goto L_0x0b85
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
        L_0x0b85:
            com.google.common.collect.ImmutableList r16 = r7.A03()
            java.lang.String r8 = r7.A09()
            java.util.ArrayList r7 = r7.A0A()
            if (r7 == 0) goto L_0x0c55
            java.lang.String r7 = X.Pxf.A0f(r7)
        L_0x0b97:
            X.WGU r9 = r5.A02
            java.lang.String r9 = r9.A03
            X.1NY r6 = X.DbU.A0N(r6)
            java.lang.String r15 = "ads/promote/create_draft_promotion_v2/"
            X.C51968G9o.A1K(r6, r15, r13)
            java.lang.String r13 = "fb_auth_token"
            r6.A9m(r13, r11)
            java.lang.String r13 = X.C51970G9q.A0k(r18)
            java.lang.String r11 = "additional_publisher_platforms"
            r6.A9m(r11, r13)
            java.lang.String r13 = r20.toString()
            java.lang.String r11 = "authorization_category"
            r6.A9m(r11, r13)
            r11 = 0
            if (r14 != 0) goto L_0x0c4f
            r14 = r11
        L_0x0bbf:
            java.lang.String r13 = "destination"
            r6.A0G(r13, r14)
            if (r10 != 0) goto L_0x0c49
            r13 = r11
        L_0x0bc7:
            java.lang.String r10 = "ctx_welcome_message_status"
            r6.A0G(r10, r13)
            if (r19 != 0) goto L_0x0c44
            r13 = r11
        L_0x0bcf:
            java.lang.String r10 = "call_to_action"
            r6.A0G(r10, r13)
            java.lang.String r10 = "website_url"
            r6.A0G(r10, r0)
            java.lang.String r10 = "lead_gen_form_id"
            r0 = r21
            r6.A0G(r10, r0)
            r0 = 581(0x245, float:8.14E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A09(r3, r0)
            java.lang.String r0 = "duration_in_days"
            r6.A09(r12, r0)
            if (r16 != 0) goto L_0x0c3f
            r3 = r11
        L_0x0bf1:
            java.lang.String r0 = "regulated_categories"
            r6.A0G(r0, r3)
            if (r17 == 0) goto L_0x0bfc
            java.lang.String r11 = r17.toString()
        L_0x0bfc:
            java.lang.String r0 = "audience_code"
            r6.A0G(r0, r11)
            java.lang.String r0 = "audience_id"
            r6.A0G(r0, r1)
            java.lang.String r0 = "flow_id"
            r6.A0G(r0, r9)
            java.lang.Class<X.UX5> r1 = X.UX5.class
            java.lang.Class<X.VmS> r0 = X.C18152VmS.class
            r6.A0R(r1, r0)
            boolean r0 = X.0mp.A0B(r8)
            if (r0 != 0) goto L_0x0c1d
            java.lang.String r0 = "messaging_destinations"
            r6.A9m(r0, r8)
        L_0x0c1d:
            boolean r0 = X.0mp.A0B(r7)
            if (r0 != 0) goto L_0x0c28
            java.lang.String r0 = "ad_format_preferences"
            r6.A9m(r0, r7)
        L_0x0c28:
            X.1OC r1 = r6.A0M()
            r1.A00 = r4
            java.lang.String r0 = "/api/v1/ads/promote/create_draft_promotion_v2/"
            java.lang.String r0 = X.W2x.A01(r0)
            r4.A02 = r0
            X.2lw r0 = r5.A07
            r0.schedule(r1)
            r0 = -1174354428(0xffffffffba00c604, float:-4.912319E-4)
            goto L_0x0ca4
        L_0x0c3f:
            java.lang.String r3 = X.C51970G9q.A0k(r16)
            goto L_0x0bf1
        L_0x0c44:
            java.lang.String r13 = r19.toString()
            goto L_0x0bcf
        L_0x0c49:
            java.lang.String r13 = r10.toString()
            goto L_0x0bc7
        L_0x0c4f:
            java.lang.String r14 = r14.toString()
            goto L_0x0bbf
        L_0x0c55:
            r7 = 0
            goto L_0x0b97
        L_0x0c58:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x0b7f
        L_0x0c5e:
            com.instagram.api.schemas.BoostedPostAudienceOption r17 = com.instagram.api.schemas.BoostedPostAudienceOption.SAVED_AUDIENCE
            goto L_0x0b66
        L_0x0c62:
            r17 = r12
            if (r9 == 0) goto L_0x0c68
            goto L_0x0b66
        L_0x0c68:
            r1 = r12
            goto L_0x0b6e
        L_0x0c6b:
            r21 = r12
            goto L_0x0b52
        L_0x0c6f:
            java.lang.String r2 = "promoteLogger"
            goto L_0x0c8d
        L_0x0c72:
            java.lang.String r2 = "locationSharingPresenter"
            goto L_0x0c8d
        L_0x0c75:
            r0 = -1343034811(0xffffffffaff2ea45, float:-4.4186002E-10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.UaS r5 = (X.C15320UaS) r5
            X.WGU r4 = r5.A0B
            r3 = 0
            if (r4 == 0) goto L_0x0c9e
            X.UzE r1 = X.C16678UzE.SUMMARY
            com.instagram.business.promote.model.PromoteData r0 = r5.A0F
            if (r0 != 0) goto L_0x0c95
            java.lang.String r2 = "promoteData"
        L_0x0c8d:
            X.0qQ.A0F(r2)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0c95:
            boolean r0 = r0.A2r
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A0C(r1, r0)
        L_0x0c9e:
            X.C15320UaS.A05(r5, r3, r3, r3)
            r0 = 1047418243(0x3e6e5583, float:0.23274808)
        L_0x0ca4:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x0ca8:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WB8.onClick(android.view.View):void");
    }

    public WB8(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
