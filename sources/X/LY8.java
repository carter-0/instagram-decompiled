package X;

import android.view.View;

public final class LY8 implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public LY8(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public static void A00(View view, int i, Object obj, Object obj2) {
        AnonymousClass0fU.A00(new LY8(i, obj, obj2), view);
    }

    public static void A01(C46498Dg1 dg1, Object obj, Object obj2, int i, int i2) {
        dg1.A04(new LY8(i, obj, obj2), i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v234, resolved type: X.L3g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v235, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v236, resolved type: X.L3g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v237, resolved type: X.L3g} */
    /* JADX WARNING: type inference failed for: r1v304, types: [X.JVz, com.instagram.creation.photo.crop.CropImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v244, types: [java.lang.Object, X.2jA] */
    /* JADX WARNING: type inference failed for: r1v375, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x08b2, code lost:
        X.AnonymousClass0fD.A0C(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x08b5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x08c2, code lost:
        X.0qQ.A0F(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x08c9, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0ad0, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0ad3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x1194, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x1197, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:405:0x1289, code lost:
        X.AnonymousClass0fD.A0C(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x128c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x029f, code lost:
        if (r5 != null) goto L_0x02a1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r23) {
        /*
            r22 = this;
            r1 = r22
            int r0 = r1.A00
            r3 = r23
            switch(r0) {
                case 0: goto L_0x120c;
                case 1: goto L_0x11b0;
                case 2: goto L_0x1117;
                case 3: goto L_0x10d0;
                case 4: goto L_0x10b4;
                case 5: goto L_0x1067;
                case 6: goto L_0x1012;
                case 7: goto L_0x0ff5;
                case 8: goto L_0x0f89;
                case 9: goto L_0x0f31;
                case 10: goto L_0x0eca;
                case 11: goto L_0x0e73;
                case 12: goto L_0x0e4a;
                case 13: goto L_0x0e04;
                case 14: goto L_0x0dbf;
                case 15: goto L_0x0d95;
                case 16: goto L_0x0d16;
                case 17: goto L_0x0cc8;
                case 18: goto L_0x0ca1;
                case 19: goto L_0x0c7a;
                case 20: goto L_0x0c0f;
                case 21: goto L_0x0bd8;
                case 22: goto L_0x0bc1;
                case 23: goto L_0x0b97;
                case 24: goto L_0x0b09;
                case 25: goto L_0x0adf;
                case 26: goto L_0x0a96;
                case 27: goto L_0x0a80;
                case 28: goto L_0x0a6a;
                case 29: goto L_0x0a54;
                case 30: goto L_0x0a17;
                case 31: goto L_0x09c7;
                case 32: goto L_0x09a0;
                case 33: goto L_0x098b;
                case 34: goto L_0x0976;
                case 35: goto L_0x0961;
                case 36: goto L_0x0947;
                case 37: goto L_0x091c;
                case 38: goto L_0x08f8;
                case 39: goto L_0x08e1;
                case 40: goto L_0x08ca;
                case 41: goto L_0x075b;
                case 42: goto L_0x00ab;
                case 43: goto L_0x000a;
                case 44: goto L_0x0738;
                case 45: goto L_0x06ee;
                case 46: goto L_0x06d3;
                case 47: goto L_0x067e;
                case 48: goto L_0x0657;
                case 49: goto L_0x063c;
                case 50: goto L_0x0619;
                case 51: goto L_0x05ec;
                case 52: goto L_0x04f8;
                case 53: goto L_0x04c6;
                case 54: goto L_0x0469;
                case 55: goto L_0x0417;
                case 56: goto L_0x03fa;
                case 57: goto L_0x03bb;
                case 58: goto L_0x039c;
                case 59: goto L_0x0371;
                case 60: goto L_0x0347;
                case 61: goto L_0x030b;
                case 62: goto L_0x02eb;
                case 63: goto L_0x026f;
                case 64: goto L_0x021d;
                case 65: goto L_0x0204;
                case 66: goto L_0x01eb;
                case 67: goto L_0x01cb;
                case 68: goto L_0x011f;
                case 69: goto L_0x00fd;
                case 70: goto L_0x00da;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r3 = r1.A01
            com.instagram.creation.fragment.ManageDraftsFragment r3 = (com.instagram.creation.fragment.ManageDraftsFragment) r3
            java.lang.Object r6 = r1.A02
            com.instagram.common.gallery.Draft r6 = (com.instagram.common.gallery.Draft) r6
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.82p r5 = r3.A01
            if (r5 == 0) goto L_0x0009
            boolean r0 = r3.A02
            r4 = 0
            if (r0 == 0) goto L_0x002b
            X.K9A r3 = r3.A00
            if (r3 != 0) goto L_0x12a5
            X.DbS.A13()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x002b:
            com.instagram.common.session.UserSession r0 = r3.getSession()
            com.instagram.pendingmedia.store.PendingMediaStore r1 = X.28K.A00(r0)
            java.lang.String r0 = r6.A04
            X.3Q2 r2 = r1.A03(r0)
            if (r2 == 0) goto L_0x009d
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.getSession()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r0 = X.AnonymousClass72U.A00(r1, r0)
            r0.A0L()
            boolean r0 = r2.A0y()
            if (r0 != 0) goto L_0x0056
            boolean r0 = r2.A0u()
            if (r0 == 0) goto L_0x0061
        L_0x0056:
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.JaN r0 = X.JW1.A00(r0)
            r0.A04(r4)
        L_0x0061:
            boolean r0 = r2.A0u()
            if (r0 == 0) goto L_0x006e
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.C63997LHx.A01(r0, r2)
        L_0x006e:
            com.instagram.common.session.UserSession r1 = r3.getSession()
            java.lang.String r0 = "feed_draft_list_item_tap"
            X.C63997LHx.A00(r3, r1, r5, r2, r0)
        L_0x0077:
            X.82p r0 = r3.A01
            if (r0 == 0) goto L_0x0095
            com.instagram.creation.base.CreationSession r0 = X.JWE.A01(r0)
            boolean r0 = r0.A0M
            if (r0 == 0) goto L_0x0095
            android.content.Context r2 = r3.requireContext()
            X.JTO.A1Z(r2)
            android.app.Activity r2 = (android.app.Activity) r2
            com.instagram.common.session.UserSession r1 = r3.getSession()
            r0 = 10001(0x2711, float:1.4014E-41)
            X.LI1.A01(r2, r4, r1, r5, r0)
        L_0x0095:
            boolean r0 = r3.A03
            if (r0 == 0) goto L_0x0009
            X.DbT.A1K(r3)
            return
        L_0x009d:
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.JaN r1 = X.JW1.A00(r0)
            java.lang.String r0 = "Media is null"
            r1.A07(r0)
            goto L_0x0077
        L_0x00ab:
            java.lang.Object r2 = r1.A01
            X.Jal r2 = (X.C59867Jal) r2
            java.lang.Object r5 = r1.A02
            android.app.Activity r5 = (android.app.Activity) r5
            X.7kB r0 = r2.A08
            r0.getClass()
            java.util.HashMap r1 = r0.A06
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>(r1)
            java.lang.String r4 = "android.permission.CAMERA"
            java.lang.Object r0 = r0.get(r4)
            X.7vz r0 = (X.C346927vz) r0
            if (r0 == 0) goto L_0x12ec
            int r1 = r0.ordinal()
            r0 = 1
            if (r1 == r0) goto L_0x12d0
            r0 = 2
            if (r1 != r0) goto L_0x0009
            r0 = 2131954557(0x7f130b7d, float:1.9545617E38)
            X.W38.A02(r5, r0)
            return
        L_0x00da:
            r0 = -1697225642(0xffffffff9ad66456, float:-8.867043E-23)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Lzf r0 = (X.C65787Lzf) r0
            X.Jj2 r2 = X.C65787Lzf.A00(r0)
            java.lang.Object r0 = r1.A01
            X.0eP r0 = (X.0eP) r0
            int r1 = X.C51970G9q.A0B(r0)
            java.lang.Object r0 = r0.A01
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            r2.A03(r0, r1)
            r0 = 753861057(0x2cef01c1, float:6.7929833E-12)
            goto L_0x0ad0
        L_0x00fd:
            r0 = 522544284(0x1f25649c, float:3.502333E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.61R r2 = (X.AnonymousClass61R) r2
            if (r2 == 0) goto L_0x010d
            r2.E2p()
        L_0x010d:
            java.lang.Object r1 = r1.A02
            X.Lzf r1 = (X.C65787Lzf) r1
            X.Jj2 r2 = X.C65787Lzf.A00(r1)
            X.KLT r1 = X.KLT.A00
            X.C60303Jj2.A01(r1, r2)
            r1 = 963624019(0x396fbc53, float:2.2862972E-4)
            goto L_0x1194
        L_0x011f:
            r0 = -681535126(0xffffffffd760996a, float:-2.46949513E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Lhu r3 = (X.C64778Lhu) r3
            boolean r2 = r3.A00
            if (r2 != 0) goto L_0x01be
            java.lang.Object r9 = r1.A01
            X.LxB r9 = (X.C65634LxB) r9
            boolean r1 = r3.A01
            if (r1 != 0) goto L_0x01c3
            X.K7n r3 = r9.A05
            X.8ab r6 = X.DbW.A0U(r3)
            r1 = 2131971398(0x7f134d46, float:1.9579774E38)
            r6.A09(r1)
            r1 = 2131971397(0x7f134d45, float:1.9579772E38)
            r6.A08(r1)
            r8 = 1
            r6.A0r(r8)
            r6.A0s(r8)
            r2 = 2131971396(0x7f134d44, float:1.957977E38)
            r1 = 44
            X.LV3.A01(r6, r9, r1, r2)
            X.LUi r1 = X.C64218LUi.A00
            r6.A0C(r1)
            X.0sa r1 = r9.A07
            java.lang.Object r7 = r1.invoke()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L_0x01bb
            android.content.Context r1 = r3.requireContext()
            r5 = 0
            X.3Md r4 = new X.3Md
            r4.<init>(r1)
            android.content.Context r3 = r4.getContext()
            com.instagram.common.session.UserSession r1 = r9.A02
            X.34d r2 = new X.34d
            r2.<init>(r3, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r2.A06 = r1
            X.34e r3 = new X.34e
            r3.<init>(r2)
            X.3N0 r2 = r4.A00
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            X.C2365534e.A06(r3, r2, r1)
            X.0eM r2 = r2.A03
            java.lang.Object r1 = r2.getValue()
            X.3N9 r1 = (X.AnonymousClass3N9) r1
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r1.A0L
            X.0qQ.A06(r1)
            r1.A01 = r8
            java.lang.Object r1 = r2.getValue()
            X.3N9 r1 = (X.AnonymousClass3N9) r1
            com.instagram.common.ui.widget.imageview.CircularImageView r1 = r1.A0L
            X.0qQ.A06(r1)
            r1.setImageBitmap(r7)
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131165205(0x7f070015, float:1.794462E38)
            int r1 = r2.getDimensionPixelSize(r1)
            r4.setPadding(r5, r1, r5, r5)
            r6.A0k(r4)
        L_0x01bb:
            X.DbT.A1V(r6)
        L_0x01be:
            r1 = -1918488909(0xffffffff8da62eb3, float:-1.0241782E-30)
            goto L_0x1194
        L_0x01c3:
            X.K7n r2 = r9.A05
            X.Ki2 r1 = X.C62571Ki2.MY_WEEK
            r2.A08(r1)
            goto L_0x01be
        L_0x01cb:
            r0 = -2052421469(0xffffffff85aa88a3, float:-1.6036916E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.KGd r0 = (X.C61653KGd) r0
            X.L0N r3 = r0.A01
            java.lang.Object r0 = r1.A01
            X.Lhs r0 = (X.C64776Lhs) r0
            com.instagram.model.reels.Reel r2 = r0.A00
            r1 = 0
            X.K7Z r0 = r3.A00
            r0.A04 = r2
            X.K7Z.A01(r0, r1)
            r0 = 1312492660(0x4e3b0c74, float:7.8453888E8)
            goto L_0x0ad0
        L_0x01eb:
            r0 = -1419250162(0xffffffffab67f60e, float:-8.2409155E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LxB r2 = (X.C65634LxB) r2
            java.lang.Object r0 = r1.A02
            X.Lhr r0 = (X.C64775Lhr) r0
            boolean r0 = r0.A00
            r2.A02(r0)
            r0 = 808212581(0x302c5865, float:6.269885E-10)
            goto L_0x0ad0
        L_0x0204:
            r0 = 757185053(0x2d21ba1d, float:9.193116E-12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.LxB r2 = (X.C65634LxB) r2
            java.lang.Object r0 = r1.A02
            X.Lhr r0 = (X.C64775Lhr) r0
            boolean r0 = r0.A00
            r2.A02(r0)
            r0 = 797378793(0x2f8708e9, float:2.4562688E-10)
            goto L_0x0ad0
        L_0x021d:
            r0 = -2060709367(0xffffffff852c1209, float:-8.090714E-36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.61R r2 = (X.AnonymousClass61R) r2
            r2.E2p()
            java.lang.Object r4 = r1.A02
            X.LmT r4 = (X.C65049LmT) r4
            java.util.List r3 = r4.A0A
            boolean r1 = X.AnonymousClass7TE.A1b(r3)
            if (r1 == 0) goto L_0x026a
            com.instagram.common.ui.base.IgEditText r2 = r4.A02
            java.lang.String r5 = "stickerEditText"
            if (r2 == 0) goto L_0x08c2
            int r1 = r4.A01
            java.lang.Object r1 = X.JTT.A0m(r3, r1)
            X.DbZ.A14(r2, r1)
            com.instagram.common.ui.base.IgEditText r1 = r4.A02
            if (r1 == 0) goto L_0x08c2
            X.JTR.A1F(r1)
            int r1 = r4.A01
            int r1 = r1 + 1
            r4.A01 = r1
            com.instagram.common.session.UserSession r1 = r4.A0H
            X.27r r3 = X.27p.A01(r1)
            X.283 r1 = r3.A04
            X.JVj r2 = r1.A0C
            X.4yP r1 = r3.A0J()
            if (r1 == 0) goto L_0x026a
            if (r2 == 0) goto L_0x026a
            java.lang.String r1 = "ADD_YOURS_DICE_TOP_TRENDING_SUGGESTION"
            r3.A1Q(r2, r1)
        L_0x026a:
            r1 = -568752232(0xffffffffde198798, float:-2.76574453E18)
            goto L_0x1194
        L_0x026f:
            r0 = 257880380(0xf5ef13c, float:1.0991905E-29)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            X.8BA r4 = r0.A00
            X.82o r0 = r4.A14
            X.82Y r0 = r0.A01
            X.7zv r6 = r0.A04()
            X.8Cl r5 = r0.A03()
            android.content.Intent r3 = X.DbS.A09()
            r0 = 0
            java.lang.String r2 = "file_path"
            if (r6 == 0) goto L_0x02d1
            java.lang.String r0 = r6.A0k
            android.net.Uri r0 = X.JTQ.A09(r0)
            r3.setData(r0)
            java.lang.String r0 = r6.A0k
            r3.putExtra(r2, r0)
            if (r5 == 0) goto L_0x02e9
        L_0x02a1:
            r2 = 1
        L_0x02a2:
            r0 = 781(0x30d, float:1.094E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r3.putExtra(r0, r2)
            X.8LU r0 = r4.A07
            if (r0 == 0) goto L_0x02ba
            X.3Q2 r0 = r0.A0D
            if (r0 == 0) goto L_0x02ba
            java.lang.String r2 = r0.A35
            java.lang.String r0 = "pending_media_key"
            r3.putExtra(r0, r2)
        L_0x02ba:
            android.app.Activity r0 = r4.A0n
            X.Dba.A0k(r0, r3)
            java.lang.Object r0 = r1.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.60k r1 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A05
            r1.A0C(r0)
            r0 = 1671847306(0x63a65d8a, float:6.1377994E21)
            goto L_0x08b2
        L_0x02d1:
            if (r5 == 0) goto L_0x02e6
            java.io.File r0 = r5.A03()
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            r3.setData(r0)
            java.lang.String r0 = r5.A06()
            r3.putExtra(r2, r0)
            goto L_0x02a1
        L_0x02e6:
            r3.setData(r0)
        L_0x02e9:
            r2 = 0
            goto L_0x02a2
        L_0x02eb:
            r0 = -324766013(0xffffffffeca476c3, float:-1.5905974E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.8Be r0 = (X.C351978Be) r0
            r0.A04()
            java.lang.Object r0 = r1.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.60k r1 = X.C3018660j.A01(r0)
            X.Nmo r0 = X.C69506Nmo.A08
            r1.A0C(r0)
            r0 = -372200152(0xffffffffe9d0ad28, float:-3.1534285E25)
            goto L_0x0ad0
        L_0x030b:
            r0 = 1043840604(0x3e37be5c, float:0.1794371)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.8Be r2 = (X.C351978Be) r2
            java.lang.Object r1 = r1.A02
            X.Lm5 r1 = (X.Lm5) r1
            com.instagram.igds.components.form.IgFormField r1 = r1.A00
            java.lang.CharSequence r1 = r1.getText()
            java.lang.String r6 = r1.toString()
            X.8BA r2 = r2.A00
            X.82o r1 = r2.A14
            X.82Y r1 = r1.A01
            X.8Cl r1 = r1.A03()
            if (r1 == 0) goto L_0x0342
            com.instagram.common.gallery.Medium r4 = r1.A0F
            if (r4 == 0) goto L_0x0342
            com.instagram.common.session.UserSession r5 = r2.A0v
            X.0iw r3 = r2.A0u
            android.view.View r1 = r2.A0o
            android.content.Context r2 = r1.getContext()
            r7 = 0
            X.C63205KtC.A00(r2, r3, r4, r5, r6, r7)
        L_0x0342:
            r1 = -1634809014(0xffffffff9e8ecb4a, float:-1.5118913E-20)
            goto L_0x1194
        L_0x0347:
            r0 = 1628842251(0x6116290b, float:1.7312307E20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.K4c r2 = (X.C61360K4c) r2
            java.lang.Object r1 = r1.A01
            X.3NV r1 = (X.AnonymousClass3NV) r1
            X.C61360K4c.A02(r2, r1)
            boolean r1 = r2.A0F
            if (r1 != 0) goto L_0x036c
            X.0eM r1 = r2.A0H
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            boolean r1 = X.C278264wZ.A00(r1)
            if (r1 == 0) goto L_0x036c
            X.C61360K4c.A01(r2)
        L_0x036c:
            r1 = -1975796935(0xffffffff8a3bbb39, float:-9.038935E-33)
            goto L_0x1194
        L_0x0371:
            r0 = -919715311(0xffffffffc92e4211, float:-713761.06)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            android.view.ViewPropertyAnimator r0 = r3.animate()
            r0.cancel()
            android.view.ViewPropertyAnimator r2 = X.C51972G9s.A0I(r3)
            java.lang.Object r1 = r1.A02
            X.JYD r1 = (X.JYD) r1
            X.M6Y r0 = new X.M6Y
            r0.<init>(r3, r1)
            android.view.ViewPropertyAnimator r0 = r2.withEndAction(r0)
            r0.start()
            r0 = -1621786090(0xffffffff9f558216, float:-4.521211E-20)
            goto L_0x0ad0
        L_0x039c:
            r0 = -1522117563(0xffffffffa5465445, float:-1.7202314E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JpQ r2 = (X.C60679JpQ) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Ll9 r0 = r2.A0C
            java.lang.Object r2 = r1.A02
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            X.8MN r1 = r0.A0E
            java.lang.String r0 = r0.A05
            r1.DHJ(r2, r0)
            r0 = 94509952(0x5a21b80, float:1.5244509E-35)
            goto L_0x0ad0
        L_0x03bb:
            r0 = 46788625(0x2c9f011, float:2.9672087E-37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JpM r2 = (X.C60675JpM) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            android.content.Context r6 = r2.A00
            X.8ab r5 = X.DbS.A0Y(r6)
            r3 = 2131962858(0x7f132bea, float:1.9562453E38)
            r2 = 1
            java.lang.Object r0 = r1.A02
            X.9hg r0 = (X.C384659hg) r0
            java.lang.String r0 = r0.A07
            java.lang.String r0 = X.DbW.A0h(r6, r0, r3)
            r5.A05 = r0
            r5.A0r(r2)
            r5.A0s(r2)
            r2 = 2131976674(0x7f1361e2, float:1.9590475E38)
            r0 = 39
            X.LV3.A01(r5, r1, r0, r2)
            r0 = 38
            X.LV3 r0 = X.LV3.A00(r1, r0)
            X.DbX.A16(r0, r5)
            r0 = 1050138485(0x3e97d775, float:0.29656568)
            goto L_0x0ad0
        L_0x03fa:
            r0 = -700630532(0xffffffffd63d39fc, float:-5.2014185E13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JpM r2 = (X.C60675JpM) r2
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Ll9 r0 = r2.A09
            java.lang.Object r1 = r1.A02
            X.9hg r1 = (X.C384659hg) r1
            X.8MN r0 = r0.A0E
            r0.Ctb(r1)
            r0 = 754406464(0x2cf75440, float:7.029516E-12)
            goto L_0x0ad0
        L_0x0417:
            r0 = -1394622196(0xffffffffacdfc10c, float:-6.3594737E-12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            java.lang.Object r5 = r1.A02
            X.L3q r5 = (X.C63706L3q) r5
            android.content.Context r1 = r5.A00
            r0 = 2131955178(0x7f130dea, float:1.9546876E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131955177(0x7f130de9, float:1.9546874E38)
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "acr_camera_roll_access_denied"
            X.6ap r1 = X.DbV.A0W()
            r1.A0H = r0
            r1.A0D = r3
            r1.A0I = r2
            r0 = 10000(0x2710, float:1.4013E-41)
            r1.A01 = r0
            r0 = 1
            r1.A0J = r0
            X.DbY.A1N(r1)
            com.instagram.common.session.UserSession r2 = r5.A01
            X.1Av r1 = X.1Au.A00(r2)
            r0 = 0
            r1.A1M(r0)
            X.27r r2 = X.27p.A01(r2)
            java.lang.String r1 = "DENY_ACCESS_TO_DEVICE_CAMERA_ROLL"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r2.A1Q(r0, r1)
            r0 = -1685895476(0xffffffff9b8346cc, float:-2.1717883E-22)
            goto L_0x0ad0
        L_0x0469:
            r0 = -665198663(0xffffffffd859dfb9, float:-9.5821962E14)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            java.lang.Object r6 = r1.A02
            X.L3q r6 = (X.C63706L3q) r6
            android.content.Context r5 = r6.A00
            r0 = 2131955176(0x7f130de8, float:1.9546872E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r5, r0)
            r0 = 2131955175(0x7f130de7, float:1.954687E38)
            java.lang.String r1 = r5.getString(r0)
            java.lang.String r0 = "acr_camera_roll_access_granted"
            X.6ap r2 = X.DbV.A0W()
            r2.A0H = r0
            r2.A0D = r3
            r2.A0I = r1
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.A01 = r0
            r1 = 1
            r2.A0J = r1
            X.DbY.A1N(r2)
            com.instagram.common.session.UserSession r3 = r6.A01
            X.1Av r0 = X.1Au.A00(r3)
            r0.A1M(r1)
            X.27r r2 = X.27p.A01(r3)
            java.lang.String r1 = "ALLOW_ACCESS_TO_DEVICE_CAMERA_ROLL"
            X.JVj r0 = X.C59725JVj.ACR_BROWSER
            r2.A1Q(r0, r1)
            X.2jA r0 = new X.2jA
            r0.<init>()
            X.2jD r0 = X.AnonymousClass2jC.A00(r5, r3, r0)
            r0.A01()
            r0 = -905375175(0xffffffffca091239, float:-2245774.2)
            goto L_0x0ad0
        L_0x04c6:
            r0 = -1905388505(0xffffffff8e6e1427, float:-2.9345468E-30)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A02
            X.Lmv r0 = (X.C65075Lmv) r0
            X.0hq r0 = r0.A07
            X.0s1 r3 = new X.0s1
            r3.<init>(r0)
            java.lang.Object r0 = r1.A01
            android.view.View r0 = (android.view.View) r0
            int r2 = r0.getId()
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r0 = 1
            X.K5R r1 = X.C63128Krw.A00(r1, r0)
            java.lang.String r0 = "CutoutStickerGalleryCreationFragment"
            r3.A0D(r1, r0, r2)
            r0 = 0
            r3.A0I(r0)
            r3.A00()
            r0 = -790997178(0xffffffffd0da5746, float:-2.93052211E10)
            goto L_0x0ad0
        L_0x04f8:
            r0 = -1603120319(0xffffffffa0725341, float:-2.0525744E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.JpX r2 = (X.C60686JpX) r2
            X.JuW r2 = r2.A00
            if (r2 == 0) goto L_0x05dd
            java.lang.Object r1 = r1.A02
            X.KI8 r1 = (X.KI8) r1
            X.L0D r1 = r1.A02
            if (r1 == 0) goto L_0x05dd
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r1 = r1.A00
            X.MQD r1 = r1.A00
            if (r1 == 0) goto L_0x05dd
            com.instagram.common.gallery.model.GalleryItem r7 = r2.A0B
            X.LlH r1 = (X.C64978LlH) r1
            r3 = 0
            X.0qQ.A0B(r7, r3)
            X.JW7 r4 = r1.A00
            boolean r1 = X.JW7.A0Q(r4)
            if (r1 == 0) goto L_0x05e2
            com.instagram.common.session.UserSession r6 = r4.A0z
            X.0Tu r5 = X.0Tu.A05
            r1 = 36318625707137354(0x8107990001194a, double:3.0313833683365204E-306)
            boolean r1 = X.182.A06(r5, r6, r1)
            if (r1 == 0) goto L_0x05e2
            com.instagram.creation.capture.gallery.ui.preview.GalleryPreviewMultiselectPager r1 = r4.A0I
            if (r1 == 0) goto L_0x05dd
            com.instagram.common.gallery.model.GalleryItem r1 = r4.A0B
            if (r1 == 0) goto L_0x05dd
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x05dd
            android.content.Context r8 = r4.getContext()
            java.lang.Class<androidx.fragment.app.FragmentActivity> r7 = androidx.fragment.app.FragmentActivity.class
            java.lang.Object r1 = X.0mE.A01(r8, r7)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0hq r1 = r1.getSupportFragmentManager()
            java.lang.String r6 = "PhotoCropFragment"
            androidx.fragment.app.Fragment r1 = r1.A0R(r6)
            if (r1 != 0) goto L_0x05dd
            android.os.Bundle r5 = X.AnonymousClass7TE.A0a()
            com.instagram.common.gallery.model.GalleryItem r2 = r4.A0B
            java.lang.String r1 = "PhotoCropFragment.previewItem"
            r5.putParcelable(r1, r2)
            int r2 = r4.getWidth()
            int r1 = r4.getHeight()
            android.graphics.Bitmap r12 = X.AnonymousClass7TF.A0B(r2, r1)
            android.graphics.Canvas r2 = X.JTO.A0B(r12)
            X.4DH r11 = r4.A0x
            android.view.View r1 = r11.mView
            if (r1 == 0) goto L_0x057e
            r1.draw(r2)
        L_0x057e:
            r1 = 150(0x96, float:2.1E-43)
            r2.drawARGB(r1, r3, r3, r3)
            com.instagram.creation.photo.crop.CropImageView r1 = r4.A1D
            android.graphics.Matrix r10 = r1.A08
            int r9 = r1.getWidth()
            int r3 = r1.getHeight()
            com.instagram.common.gallery.model.GalleryItem r1 = r4.A0B
            X.0qQ.A0A(r1)
            float r2 = X.JW7.A00(r1, r4)
            X.L0B r1 = new X.L0B
            r1.<init>(r4)
            X.K6F r4 = new X.K6F
            r4.<init>()
            r4.A05 = r1
            r4.A02 = r9
            r4.A01 = r3
            r4.A00 = r2
            r4.A03 = r12
            if (r10 == 0) goto L_0x05b7
            r1 = 9
            float[] r1 = new float[r1]
            r4.A07 = r1
            r10.getValues(r1)
        L_0x05b7:
            java.lang.String r3 = r11.mTag
            r1 = 2287(0x8ef, float:3.205E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r2 = 2131435209(0x7f0b1ec9, float:1.8492254E38)
            if (r3 != r1) goto L_0x05c7
            r2 = 2131439029(0x7f0b2db5, float:1.8500002E38)
        L_0x05c7:
            r4.setArguments(r5)
            java.lang.Object r1 = X.0mE.A01(r8, r7)
            androidx.fragment.app.FragmentActivity r1 = (androidx.fragment.app.FragmentActivity) r1
            X.0s1 r1 = X.DbW.A0D(r1)
            r1.A0I(r6)
            r1.A0C(r4, r6, r2)
            r1.A00()
        L_0x05dd:
            r1 = -1923277078(0xffffffff8d5d1eea, float:-6.8138094E-31)
            goto L_0x1194
        L_0x05e2:
            X.JW7.A0L(r4, r3)
            com.instagram.creation.photo.crop.CropImageView r2 = r4.A1D
            r1 = 1
            r2.A0O(r1, r3)
            goto L_0x05dd
        L_0x05ec:
            r0 = -672831095(0xffffffffd7e56989, float:-5.04482866E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            boolean r2 = r2.isSelected()
            if (r2 == 0) goto L_0x0602
            r1 = 776555051(0x2e494a2b, float:4.5767983E-11)
            goto L_0x1194
        L_0x0602:
            java.lang.Object r3 = r1.A02
            X.JW8 r3 = (X.JW8) r3
            X.LPH r2 = r3.A01
            if (r2 == 0) goto L_0x060f
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r2.A06(r1)
        L_0x060f:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r3.A0K(r1)
            r1 = -1041166738(0xffffffffc1f10e6e, float:-30.132046)
            goto L_0x1194
        L_0x0619:
            r0 = 222835287(0xd483257, float:6.1690353E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            r2 = 0
            X.W38.A06(r3, r2)
            java.lang.Object r2 = r1.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            if (r2 == 0) goto L_0x0637
            X.37D r1 = X.DbT.A0i(r3)
            if (r1 == 0) goto L_0x0637
            r1.A0J(r2)
        L_0x0637:
            r1 = 902608378(0x35ccb5fa, float:1.5252147E-6)
            goto L_0x1194
        L_0x063c:
            r0 = -108094012(0xfffffffff98e9dc4, float:-9.256325E34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.Object r2 = r1.A02
            r1 = 3
            X.Lh6 r0 = new X.Lh6
            r0.<init>(r1, r3, r2)
            X.C2604245p.A01(r3, r0)
            r0 = 248153243(0xeca849b, float:4.992454E-30)
            goto L_0x0ad0
        L_0x0657:
            r0 = -1570686580(0xffffffffa261398c, float:-3.0523651E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            r2 = 3
            r3.performHapticFeedback(r2)
            java.lang.Object r4 = r1.A02
            X.KKU r4 = (X.KKU) r4
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.8gM r3 = r4.A04
            if (r3 == 0) goto L_0x0679
            int r2 = r4.getBindingAdapterPosition()
            java.lang.Object r1 = r1.A01
            X.KKP r1 = (X.KKP) r1
            X.LEl r1 = r1.A00
            r3.DQC(r1, r2)
        L_0x0679:
            r1 = -1459947730(0xffffffffa8faf72e, float:-2.7862773E-14)
            goto L_0x1194
        L_0x067e:
            r0 = -1285057288(0xffffffffb36794f8, float:-5.3919365E-8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.LRF r3 = (X.LRF) r3
            java.lang.Object r2 = r1.A01
            com.instagram.common.ui.widget.imageview.IgImageView r4 = r3.A0C
            boolean r1 = r4.isActivated()
            if (r1 == 0) goto L_0x06c3
            boolean r1 = r4.isSelected()
            r1 = r1 ^ 1
            r4.setSelected(r1)
            X.4MM r2 = r3.A03
            if (r2 == 0) goto L_0x06ab
            boolean r1 = r4.isSelected()
            float r1 = X.C51971G9r.A00(r1)
            r2.Eqq(r1)
        L_0x06ab:
            android.content.Context r3 = r4.getContext()
            boolean r2 = r4.isSelected()
            r1 = 2131976526(0x7f13614e, float:1.9590175E38)
            if (r2 == 0) goto L_0x06bb
            r1 = 2131976527(0x7f13614f, float:1.9590177E38)
        L_0x06bb:
            X.C59689JTv.A07(r3, r1)
        L_0x06be:
            r1 = 778282411(0x2e63a5ab, float:5.1760967E-11)
            goto L_0x1194
        L_0x06c3:
            X.9QA r1 = X.AnonymousClass9QA.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x06be
            android.content.Context r3 = r4.getContext()
            r1 = 2131976524(0x7f13614c, float:1.959017E38)
            goto L_0x06bb
        L_0x06d3:
            r0 = -253379970(0xfffffffff0e5ba7e, float:-5.6878018E29)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.8MM r2 = (X.AnonymousClass8MM) r2
            java.lang.Object r0 = r1.A01
            X.JwJ r0 = (X.C61081JwJ) r0
            java.lang.Object r0 = r0.A00
            com.instagram.api.schemas.StickerTraySectionCTAType r0 = (com.instagram.api.schemas.StickerTraySectionCTAType) r0
            r2.DnF(r0)
            r0 = 1978788590(0x75f1eaee, float:6.1333422E32)
            goto L_0x0ad0
        L_0x06ee:
            r0 = 1493657255(0x590766a7, float:2.38199933E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.KKA r2 = (X.KKA) r2
            X.6nz r4 = r2.A00
            if (r4 == 0) goto L_0x0731
            java.lang.Object r3 = r1.A02
            X.A66 r3 = (X.A66) r3
            X.0sK r6 = r2.A01
            X.KgR r2 = r2.A00
            X.KgR r1 = X.C62476KgR.PLAYING
            boolean r1 = X.AnonymousClass7TF.A1W(r2, r1)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            java.lang.String r4 = r4.A0Z
            android.graphics.drawable.Drawable r2 = r3.A00
            boolean r1 = r2 instanceof X.C347017w8
            r3 = 0
            if (r1 == 0) goto L_0x0736
            X.7w8 r2 = (X.C347017w8) r2
            if (r2 == 0) goto L_0x0736
            android.graphics.drawable.Drawable r2 = X.JTR.A0S(r2)
        L_0x0720:
            boolean r1 = r2 instanceof X.C321016tR
            if (r1 == 0) goto L_0x072e
            X.6tR r2 = (X.C321016tR) r2
            if (r2 == 0) goto L_0x072e
            int r1 = r2.A02
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
        L_0x072e:
            r6.invoke(r5, r4, r3)
        L_0x0731:
            r1 = 1246542089(0x4a4cb909, float:3354178.2)
            goto L_0x1194
        L_0x0736:
            r2 = r3
            goto L_0x0720
        L_0x0738:
            r0 = -117797141(0xfffffffff8fa8eeb, float:-4.0655404E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.MBb r3 = (X.C66093MBb) r3
            if (r3 == 0) goto L_0x0756
            java.lang.Object r2 = r1.A01
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r1 = r3.A01
            X.JWq r1 = (X.C59753JWq) r1
            X.JW8 r1 = r1.A00
            X.JWm r1 = r1.A0H
            X.JW7 r1 = r1.A00
            r1.A0Y(r2)
        L_0x0756:
            r1 = -634478310(0xffffffffda2ea11a, float:-1.22884447E16)
            goto L_0x1194
        L_0x075b:
            r0 = 840016932(0x3211a424, float:8.477432E-9)
            int r8 = X.AnonymousClass0fD.A05(r0)
            r5 = 0
            java.lang.Object r6 = r1.A02     // Catch:{ IllegalStateException -> 0x077a }
            com.instagram.creation.base.ui.filterview.FilterViewContainer r6 = (com.instagram.creation.base.ui.filterview.FilterViewContainer) r6     // Catch:{ IllegalStateException -> 0x077a }
            X.82q r0 = r6.A04     // Catch:{ IllegalStateException -> 0x077a }
            if (r0 == 0) goto L_0x0793
            X.514 r0 = r0.ANP()     // Catch:{ IllegalStateException -> 0x077a }
            int r2 = r0.A01     // Catch:{ IllegalStateException -> 0x077a }
            X.514 r4 = X.AnonymousClass514.SQUARE     // Catch:{ IllegalStateException -> 0x077a }
            int r0 = r4.A01     // Catch:{ IllegalStateException -> 0x077a }
            if (r2 != r0) goto L_0x0781
            X.514 r4 = X.AnonymousClass514.FOUR_BY_FIVE     // Catch:{ IllegalStateException -> 0x077a }
            goto L_0x0781
        L_0x077a:
            r2 = move-exception
            java.lang.String r0 = "FilterViewContainer"
            X.JTP.A1U(r0, r2)
            goto L_0x0793
        L_0x0781:
            r5 = r4
            java.lang.Object r3 = r1.A01
            android.view.View r3 = (android.view.View) r3
            android.content.res.Resources r2 = r6.getResources()
            int r0 = r4.A02
            java.lang.String r0 = r2.getString(r0)
            X.03v.A0G(r3, r0)
        L_0x0793:
            java.lang.Object r1 = r1.A02
            com.instagram.creation.base.ui.filterview.FilterViewContainer r1 = (com.instagram.creation.base.ui.filterview.FilterViewContainer) r1
            X.82q r2 = r1.A04
            if (r2 == 0) goto L_0x07a2
            r0 = r2
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r0.A05 = r5
        L_0x07a2:
            X.MQ6 r1 = r1.A03
            if (r2 == 0) goto L_0x08af
            X.514 r14 = r2.ANP()
            if (r1 == 0) goto L_0x08af
            X.Lko r1 = (X.C64949Lko) r1
            X.JcV r3 = r1.A00
            X.0eM r4 = r3.A0i
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            boolean r0 = X.2Ht.A03(r0)
            java.lang.String r5 = "creationCameraSession"
            r13 = 0
            if (r0 == 0) goto L_0x07d5
            X.82q r2 = r3.A0G
            if (r2 == 0) goto L_0x08c2
            java.lang.String r1 = r1.A01
            X.JWE r2 = (X.JWE) r2
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.instagram.creation.base.CreationSession r0 = r2.A01
            java.util.Map r0 = r0.A0R
            java.lang.Object r13 = r0.get(r1)
            X.Kof r13 = (X.C62927Kof) r13
        L_0x07d5:
            X.JcW r7 = X.C59962JcV.A01(r3)
            X.3Q2 r12 = r3.A0S
            X.LCk r11 = r3.A0O
            android.content.Context r1 = r3.requireContext()
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.84L r1 = X.AnonymousClass84K.A00(r1, r0)
            X.82q r0 = r3.A0G
            if (r0 == 0) goto L_0x08c2
            java.lang.String r0 = r0.E2g()
            android.graphics.Rect r1 = r1.A00(r0)
            r20 = 1
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r2 = r7.A04()
            java.lang.String r0 = "_onCropButtonToggled()"
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r10 = X.C395019z4.A00(r2, r0)
            if (r10 == 0) goto L_0x087f
            X.82q r9 = r7.A0A
            r0 = r9
            X.JWE r0 = (X.JWE) r0
            com.instagram.creation.base.CreationSession r0 = r0.A01
            r21 = r0
            int r6 = r21.A01()
            int r5 = r21.A00()
            int r4 = r9.ATT()
            if (r1 == 0) goto L_0x08b8
            boolean r0 = r14.A03
            if (r0 != 0) goto L_0x08b8
            float r0 = r14.A00
            android.graphics.Rect r3 = X.JW0.A03(r1, r0, r6, r5, r4)
        L_0x0824:
            if (r12 == 0) goto L_0x0847
            int r0 = r3.left
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            int r0 = r3.top
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            int r0 = r3.right
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            int r0 = r3.bottom
            java.lang.Integer[] r0 = X.JTQ.A1a(r15, r2, r1, r0)
            java.util.List r0 = X.0sr.A1P(r0)
            r12.A4f = r0
            r12.A0S(r3)
        L_0x0847:
            r19 = r4
            r18 = r5
            r17 = r6
            r16 = r3
            r15 = r10
            r15.A0K(r16, r17, r18, r19, r20)
            com.instagram.common.session.UserSession r0 = r7.A09
            boolean r0 = X.2Ht.A02(r0)
            if (r0 == 0) goto L_0x085e
            r10.A0E()
        L_0x085e:
            if (r13 == 0) goto L_0x0867
            float r1 = r13.A00
            android.graphics.PointF r0 = r13.A01
            r10.A0J(r0, r1)
        L_0x0867:
            int r1 = r21.A01()
            int r0 = r21.A00()
            r9.ETL(r3, r1, r0)
            if (r11 == 0) goto L_0x087f
            java.lang.String r1 = r9.E2g()
            X.514 r0 = r9.ANP()
            r11.A00(r0, r10, r1)
        L_0x087f:
            X.JwC r0 = r7.A00
            java.lang.Object r0 = r0.A02
            X.0eP r0 = (X.0eP) r0
            if (r0 == 0) goto L_0x08af
            int r0 = X.C51969G9p.A0A(r0)
            X.JwC r1 = r7.A00
            X.0eP r6 = X.C59963JcW.A01(r14, r7, r0)
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r4 = r7.A04()
            X.82q r0 = r7.A0A
            com.instagram.creation.base.PhotoSession r0 = X.JWE.A02(r0)
            if (r0 == 0) goto L_0x08b6
            com.instagram.creation.base.CropInfo r3 = r0.A05
        L_0x089f:
            java.lang.Object r5 = r1.A02
            r2 = 8
            X.JwC r1 = new X.JwC
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r1
            X.3ju r0 = r7.A0C
            r0.FIG(r1)
        L_0x08af:
            r0 = -2087048613(0xffffffff839a2a5b, float:-9.061031E-37)
        L_0x08b2:
            X.AnonymousClass0fD.A0C(r0, r8)
            return
        L_0x08b6:
            r3 = 0
            goto L_0x089f
        L_0x08b8:
            float r1 = r14.A00
            boolean r0 = r14.A03
            android.graphics.Rect r3 = X.JW0.A00(r1, r6, r5, r4, r0)
            goto L_0x0824
        L_0x08c2:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x08ca:
            r0 = 2111502799(0x7ddaf9cf, float:3.6383598E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JWG r2 = (X.JWG) r2
            java.lang.Object r0 = r1.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.JWG.A07(r2, r0)
            r0 = -378507708(0xffffffffe9706e44, float:-1.8166432E25)
            goto L_0x0ad0
        L_0x08e1:
            r0 = 515375970(0x1eb80362, float:1.9483157E-20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JWG r2 = (X.JWG) r2
            java.lang.Object r0 = r1.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.JWG.A07(r2, r0)
            r0 = 922467636(0x36fbbd34, float:7.502409E-6)
            goto L_0x0ad0
        L_0x08f8:
            r0 = -2020823270(0xffffffff878caf1a, float:-2.1167774E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JlU r2 = (X.C60436JlU) r2
            X.Kzz r2 = r2.A04
            if (r2 == 0) goto L_0x0917
            java.lang.Object r1 = r1.A01
            X.3kE r1 = (X.C249703kE) r1
            android.view.View r1 = r1.itemView
            X.0qQ.A06(r1)
            X.KB5 r1 = r2.A00
            com.instagram.creation.fragment.AlbumEditFragment r1 = r1.A0U
            r1.A0K()
        L_0x0917:
            r1 = -1780364258(0xffffffff95e1cc1e, float:-9.1198816E-26)
            goto L_0x1194
        L_0x091c:
            r0 = -1163018385(0xffffffffbaadbf6f, float:-0.0013255904)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.JlU r2 = (X.C60436JlU) r2
            X.Kzz r2 = r2.A04
            if (r2 == 0) goto L_0x0942
            java.lang.Object r4 = r1.A01
            com.instagram.creation.base.MediaSession r4 = (com.instagram.creation.base.MediaSession) r4
            X.KB5 r3 = r2.A00
            com.instagram.creation.base.CreationSession r2 = r3.A0S
            X.514 r1 = r3.A0D
            r2.A05 = r1
            com.instagram.creation.fragment.AlbumEditFragment r2 = r3.A0U
            r1 = 0
            X.0qQ.A0B(r4, r1)
            X.Kgp r1 = X.C62499Kgp.A04
            com.instagram.creation.fragment.AlbumEditFragment.A06(r4, r2, r1)
        L_0x0942:
            r1 = -251164787(0xfffffffff107878d, float:-6.7110955E29)
            goto L_0x1194
        L_0x0947:
            java.lang.Object r3 = r1.A01
            X.KB5 r3 = (X.KB5) r3
            java.lang.Object r2 = r1.A02
            com.instagram.creation.base.MediaSession r2 = (com.instagram.creation.base.MediaSession) r2
            com.instagram.creation.base.CreationSession r1 = r3.A0S
            X.514 r0 = r3.A0D
            r1.A05 = r0
            com.instagram.creation.fragment.AlbumEditFragment r1 = r3.A0U
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.Kgp r0 = X.C62499Kgp.A04
            com.instagram.creation.fragment.AlbumEditFragment.A06(r2, r1, r0)
            return
        L_0x0961:
            r0 = -1443287352(0xffffffffa9f92ec8, float:-1.10659366E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.1IX r1 = (X.1IX) r1
            X.Kgl r0 = X.C62495Kgl.VIEW_PROFILE
            X.JTU.A1J(r0, r1)
            r0 = 291726248(0x116363a8, float:1.7937852E-28)
            goto L_0x0ad0
        L_0x0976:
            r0 = -1775171433(0xffffffff96310897, float:-1.4300657E-25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.1IX r1 = (X.1IX) r1
            X.Kgl r0 = X.C62495Kgl.REPORT
            X.JTU.A1J(r0, r1)
            r0 = 1300576898(0x4d853a82, float:2.79400512E8)
            goto L_0x0ad0
        L_0x098b:
            r0 = 107308727(0x66566b7, float:4.3145576E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.1IX r1 = (X.1IX) r1
            X.Kgl r0 = X.C62495Kgl.MUTE
            X.JTU.A1J(r0, r1)
            r0 = 389358421(0x17352355, float:5.852885E-25)
            goto L_0x0ad0
        L_0x09a0:
            r0 = 434015278(0x19de8c2e, float:2.301088E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder r6 = (com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder) r6
            X.L62 r2 = r6.A04
            X.LAH r2 = r2.A02
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x09c2
            X.4Cq r5 = r6.A05
            r4 = 0
            java.lang.Object r3 = r1.A01
            r2 = 38
            X.MGz r1 = new X.MGz
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r6, (X.AnonymousClass4D7) r4, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r5)
        L_0x09c2:
            r1 = -651464168(0xffffffffd92b7218, float:-3.01610428E15)
            goto L_0x1194
        L_0x09c7:
            r0 = -2028087897(0xffffffff871dd5a7, float:-1.1874154E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.LN3 r6 = (X.LN3) r6
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            java.lang.Object r5 = r1.A01
            X.OI6 r5 = (X.OI6) r5
            com.instagram.ui.text.backinterceptedittext.BackInterceptEditText r4 = r5.A0A
            android.text.Editable r1 = r4.getText()
            X.0qQ.A07(r1)
            int r1 = r1.length()
            if (r1 != 0) goto L_0x09f1
            X.LN3.A00(r6, r5)
        L_0x09ec:
            r1 = 1653909958(0x6294a9c6, float:1.3711758E21)
            goto L_0x1194
        L_0x09f1:
            X.8ab r3 = X.DbS.A0Y(r2)
            r1 = 2131968581(0x7f134245, float:1.957406E38)
            r3.A09(r1)
            r2 = 2131968582(0x7f134246, float:1.9574063E38)
            r1 = 10
            X.LV0 r1 = X.LV0.A00(r5, r6, r1)
            r3.A0L(r1, r2)
            r2 = 2131968583(0x7f134247, float:1.9574065E38)
            r1 = 25
            X.LV3 r1 = X.LV3.A00(r4, r1)
            r3.A0H(r1, r2)
            X.DbT.A1V(r3)
            goto L_0x09ec
        L_0x0a17:
            r0 = -1247837518(0xffffffffb59f82b2, float:-1.188446E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A02
            com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment r8 = (com.instagram.connections.notifyme.modules.fragments.NotifyMeNotFollowedFragment) r8
            androidx.fragment.app.FragmentActivity r7 = r8.requireActivity()
            X.0eM r0 = r8.A02
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r3 = r1.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.String r2 = "notify_me_not_followed"
            r1 = 9
            X.KAf r0 = new X.KAf
            r0.<init>(r8, r1)
            r5 = 0
            X.FH6.A09(r7, r0, r6, r3, r2)
            X.0eM r0 = r8.A01
            X.2YL r3 = X.DbS.A0H(r0)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 7
            X.MG0 r0 = new X.MG0
            r0.<init>(r3, r5, r1)
            X.AnonymousClass7TE.A1Z(r0, r2)
            r0 = -906745331(0xffffffffc9f42a0d, float:-2000193.6)
            goto L_0x0ad0
        L_0x0a54:
            r0 = -1640142935(0xffffffff9e3d67a9, float:-1.0027013E-20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K8H r2 = (X.K8H) r2
            java.lang.Object r0 = r1.A02
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r0 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r0
            r2.A0C(r0)
            r0 = -201266157(0xfffffffff400ec13, float:-4.0857065E31)
            goto L_0x0ad0
        L_0x0a6a:
            r0 = 839098217(0x32039f69, float:7.661449E-9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K8H r2 = (X.K8H) r2
            java.lang.Object r0 = r1.A02
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r0 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r0
            r2.A0C(r0)
            r0 = -2023040535(0xffffffff876ad9e9, float:-1.7668241E-34)
            goto L_0x0ad0
        L_0x0a80:
            r0 = -1296438932(0xffffffffb2b9e96c, float:-2.1642983E-8)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K8H r2 = (X.K8H) r2
            java.lang.Object r0 = r1.A02
            com.instagram.closefriends.audiencelists.model.AudienceListViewModel r0 = (com.instagram.closefriends.audiencelists.model.AudienceListViewModel) r0
            r2.A0C(r0)
            r0 = -432647112(0xffffffffe6365438, float:-2.1525607E23)
            goto L_0x0ad0
        L_0x0a96:
            r0 = 23615700(0x16858d4, float:4.26754E-38)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.JlT r5 = (X.C60435JlT) r5
            X.LPH r3 = r5.A07
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r3.A08(r2, r0)
            java.lang.Object r0 = r1.A01
            X.1Xj r0 = (X.1Xj) r0
            java.lang.String r3 = r0.getId()
            if (r3 == 0) goto L_0x0ad4
            android.content.Context r2 = r5.A04
            X.0iw r0 = r5.A08
            java.lang.String r1 = r0.getModuleName()
            java.lang.String r0 = "HAMBURGER"
            X.Del r0 = X.C319116q4.A01(r2, r3, r1, r0)
            instagram.features.feed.fragment.ContextualFeedFragment r2 = r0.A07()
            androidx.fragment.app.FragmentActivity r1 = r5.A05
            com.instagram.common.session.UserSession r0 = r5.A09
            X.Dbb.A11(r2, r1, r0)
            r0 = 1280152643(0x4c4d9443, float:5.389134E7)
        L_0x0ad0:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0ad4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -1574610918(0xffffffffa225581a, float:-2.240831E-18)
            X.AnonymousClass0fD.A0C(r0, r4)
            throw r1
        L_0x0adf:
            r0 = 2056928280(0x7a9a3c18, float:4.004163E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.JlT r5 = (X.C60435JlT) r5
            X.LPH r4 = r5.A07
            java.lang.Integer r3 = X.AnonymousClass05K.A0Y
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r4.A08(r3, r2)
            androidx.fragment.app.FragmentActivity r3 = r5.A05
            android.content.Context r2 = r5.A04
            X.2k4 r4 = r5.A06
            com.instagram.common.session.UserSession r6 = r5.A09
            X.0iw r5 = r5.A08
            java.lang.Object r7 = r1.A01
            X.1Xj r7 = (X.1Xj) r7
            X.C319116q4.A04(r2, r3, r4, r5, r6, r7)
            r1 = 111159907(0x6a02a63, float:6.024759E-35)
            goto L_0x1194
        L_0x0b09:
            r0 = -410028044(0xffffffffe78f77f4, float:-1.3550223E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jl6 r3 = (X.C60413Jl6) r3
            java.lang.Object r8 = r1.A01
            X.3HY r8 = (X.AnonymousClass3HY) r8
            X.28D r4 = X.28D.A3K
            com.instagram.api.schemas.ACRType r6 = com.instagram.api.schemas.ACRType.HIGHLIGHT_REEL
            com.instagram.common.session.UserSession r5 = r3.A03
            X.8ZP r2 = X.AnonymousClass8ZO.A00(r5)
            r2.A00(r4, r6)
            java.lang.String r1 = r8.getId()
            if (r1 == 0) goto L_0x0b91
            X.3Hr r1 = r8.As1()
            r7 = 0
            if (r1 == 0) goto L_0x0b91
            java.lang.String r1 = r1.getMediaId()
            if (r1 == 0) goto L_0x0b91
            X.Hrt r1 = X.C250563lf.A0C(r4)
            android.os.Bundle r4 = r1.A00()
            java.lang.String r2 = r8.getId()
            r1 = 33
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.putString(r1, r2)
            X.50r r2 = X.C2801950r.CLIPS
            r1 = 19
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.putSerializable(r1, r2)
            X.3Hr r1 = r8.As1()
            if (r1 == 0) goto L_0x0b62
            java.lang.String r7 = r1.getMediaId()
        L_0x0b62:
            r1 = 211(0xd3, float:2.96E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.putString(r1, r7)
            r1 = 0
            X.0qQ.A0B(r6, r1)
            java.lang.String r2 = r6.A00
            r1 = 55
            java.lang.String r1 = X.C273654mx.A00(r1)
            r4.putString(r1, r2)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r2 = com.instagram.modal.TransparentModalActivity.class
            androidx.fragment.app.FragmentActivity r3 = r3.A01
            java.lang.String r1 = "clips_camera"
            X.6W8 r2 = X.AnonymousClass6W8.A02(r3, r4, r5, r2, r1)
            X.Dbc.A0y(r2)
            r1 = 9587(0x2573, float:1.3434E-41)
            r2.A0A(r3, r1)
        L_0x0b8c:
            r1 = 1080159323(0x4061ec5b, float:3.530051)
            goto L_0x1194
        L_0x0b91:
            java.lang.String r1 = "story_highlights_item_null_metadata"
            r2.A02(r1)
            goto L_0x0b8c
        L_0x0b97:
            r0 = 1543224265(0x5bfbbbc9, float:1.41713382E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            com.instagram.bugreporter.BugReportComposerFragment r2 = (com.instagram.bugreporter.BugReportComposerFragment) r2
            boolean r2 = r2.A09
            if (r2 == 0) goto L_0x0bb9
            X.0f9 r3 = X.JTU.A0B()
            java.lang.String r2 = "message"
            java.lang.String r1 = "Ignoring bug composer click because we are processing an action"
            r3.ABQ(r2, r1)
            r3.report()
        L_0x0bb4:
            r1 = 572142272(0x221a32c0, float:2.0897759E-18)
            goto L_0x1194
        L_0x0bb9:
            java.lang.Object r1 = r1.A01
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r1.onClick(r3)
            goto L_0x0bb4
        L_0x0bc1:
            r0 = 1749079279(0x6840d4ef, float:3.6424892E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.Jkd r2 = (X.C60384Jkd) r2
            X.0sP r2 = r2.A01
            java.lang.Object r1 = r1.A01
            r2.invoke(r1)
            r1 = 917888658(0x36b5de92, float:5.420131E-6)
            goto L_0x1194
        L_0x0bd8:
            r0 = -400633908(0xffffffffe81ecfcc, float:-2.9998683E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A02
            X.K8V r6 = (X.K8V) r6
            X.0eM r2 = r6.A03
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)
            if (r2 == 0) goto L_0x0c0b
            X.0eM r2 = r6.A04
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureBaseViewModel r2 = X.JTT.A0H(r2)
            boolean r2 = r2.A0D
            if (r2 == 0) goto L_0x0c0b
            X.0xx r5 = X.DbV.A0J(r6)
            r4 = 0
            java.lang.Object r3 = r1.A01
            r2 = 29
            X.MHC r1 = new X.MHC
            r1.<init>((java.lang.Object) r3, (java.lang.Object) r6, (X.AnonymousClass4D7) r4, (int) r2)
            X.AnonymousClass7TE.A1Z(r1, r5)
        L_0x0c06:
            r1 = 306410590(0x1243745e, float:6.1674584E-28)
            goto L_0x1194
        L_0x0c0b:
            r6.onBackPressed()
            goto L_0x0c06
        L_0x0c0f:
            r0 = 1387705469(0x52b6b47d, float:3.92356069E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A02
            X.K8W r7 = (X.K8W) r7
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r2 = X.K8W.A02(r7)
            java.lang.String r3 = r2.A05
            java.lang.String r2 = "live"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x0c51
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r2 = X.K8W.A02(r7)
            boolean r2 = r2.A0D
            if (r2 == 0) goto L_0x0c51
            java.lang.Object r2 = r1.A01
            android.view.View r2 = (android.view.View) r2
            r1 = 0
            r2.setEnabled(r1)
            X.0xx r2 = X.DbV.A0J(r7)
            r1 = 18
            X.MH8.A03(r7, r2, r1)
        L_0x0c41:
            X.0eM r1 = r7.A01
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A0S
            X.JVF.A01(r7, r2, r1)
            r1 = 1584630815(0x5e738c1f, float:4.38735898E18)
            goto L_0x1194
        L_0x0c51:
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r1 = X.K8W.A02(r7)
            boolean r6 = r1.A0E
            X.0eM r1 = r7.A01
            X.1Ng r5 = X.DbX.A0R(r1)
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r1 = X.K8W.A02(r7)
            java.util.List r1 = r1.A06
            java.util.List r4 = X.00k.A0a(r1)
            r3 = 0
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureViewModel r1 = X.K8W.A02(r7)
            com.instagram.api.schemas.BrandedContentGatingInfo r2 = r1.A01
            X.Lg6 r1 = new X.Lg6
            r1.<init>(r2, r3, r4, r6)
            r5.A05(r1)
            X.K8W.A03(r7)
            goto L_0x0c41
        L_0x0c7a:
            r0 = -1569946086(0xffffffffa26c861a, float:-3.2054957E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KGA r2 = (X.KGA) r2
            X.4DH r4 = r2.A02
            X.4DU r6 = r2.A05
            com.instagram.common.session.UserSession r5 = r2.A04
            java.lang.Object r3 = r1.A01
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.content.Context r2 = r2.A00
            r1 = 2131969181(0x7f13449d, float:1.9575278E38)
            java.lang.String r8 = r2.getString(r1)
            r7 = 0
            X.LTZ.A07(r3, r4, r5, r6, r7, r8)
            r1 = -1963513625(0xffffffff8af728e7, float:-2.380062E-32)
            goto L_0x1194
        L_0x0ca1:
            r0 = -473983382(0xffffffffe3bf966a, float:-7.068333E21)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KGA r2 = (X.KGA) r2
            X.4DH r4 = r2.A02
            X.4DU r6 = r2.A05
            com.instagram.common.session.UserSession r5 = r2.A04
            java.lang.Object r3 = r1.A01
            android.os.Bundle r3 = (android.os.Bundle) r3
            android.content.Context r2 = r2.A00
            r1 = 2131969181(0x7f13449d, float:1.9575278E38)
            java.lang.String r8 = r2.getString(r1)
            r7 = 0
            X.LTZ.A07(r3, r4, r5, r6, r7, r8)
            r1 = -180789047(0xfffffffff53960c9, float:-2.3499462E32)
            goto L_0x1194
        L_0x0cc8:
            r0 = -267606139(0xfffffffff00ca785, float:-1.7412168E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A02
            X.K3P r5 = (X.K3P) r5
            java.lang.Object r2 = r1.A01
            X.6o8 r2 = (X.C317966o8) r2
            X.Jir r1 = r5.A0B()
            r1.A04(r2)
            X.0eM r1 = r5.A02
            X.0lg r6 = X.DbT.A0X(r1)
            java.lang.Class<com.instagram.modal.TransparentModalActivity> r4 = com.instagram.modal.TransparentModalActivity.class
            java.lang.String r2 = r2.A0S
            r1 = 387(0x183, float:5.42E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP r3 = X.AnonymousClass7TE.A1L(r1, r2)
            X.EUz r2 = X.C48081EUz.AVATAR
            r1 = 388(0x184, float:5.44E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            android.os.Bundle r3 = X.AnonymousClass7TG.A0P(r1, r2, r3)
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.String r1 = "attribution_quick_camera_fragment"
            X.6W8 r2 = X.AnonymousClass6W8.A02(r2, r3, r6, r4, r1)
            X.Dbc.A0y(r2)
            r1 = 60571(0xec9b, float:8.4878E-41)
            r2.A0D(r5, r1)
            r1 = -545416312(0xffffffffdf7d9b88, float:-1.8274349E19)
            goto L_0x1194
        L_0x0d16:
            r0 = -605549217(0xffffffffdbe80d5f, float:-1.30633793E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K3P r3 = (X.K3P) r3
            java.lang.Object r7 = r1.A01
            X.6o8 r7 = (X.C317966o8) r7
            X.0eM r2 = r3.A02
            X.7Pr r1 = X.DbX.A0f(r2)
            X.7Pu r4 = r1.A00()
            X.1as r1 = X.1as.A04
            X.1ap r5 = r1.A02
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.2FW r1 = X.2FW.A0O
            X.F3w r5 = r5.A07(r3, r2, r1)
            java.lang.String r1 = r7.A0S
            X.0qQ.A07(r1)
            r5.A06(r1)
            java.lang.String r2 = r7.A0U
            android.os.Bundle r6 = r5.A07
            r1 = 2232(0x8b8, float:3.128E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putString(r1, r2)
            com.instagram.common.typedurl.ImageUrl r2 = r7.A0H
            X.0qQ.A07(r2)
            r1 = 2219(0x8ab, float:3.11E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putParcelable(r1, r2)
            float r2 = r7.A01
            r1 = 2220(0x8ac, float:3.111E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putFloat(r1, r2)
            float r2 = r7.A00
            r1 = 2218(0x8aa, float:3.108E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putFloat(r1, r2)
            float r2 = r7.A01()
            r1 = 2221(0x8ad, float:3.112E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            r6.putFloat(r1, r2)
            r5.A06 = r4
            r1 = 0
            r5.A08(r1)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r1 = r5.A00()
            X.DbU.A1I(r3, r1, r4)
            r1 = 896080018(0x35691892, float:8.683502E-7)
            goto L_0x1194
        L_0x0d95:
            r0 = -2048203602(0xffffffff85eae4ae, float:-2.2089258E-35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r6 = (com.instagram.archive.fragment.ArchiveHomeFragment) r6
            java.lang.Object r2 = r1.A02
            X.KiM r2 = (X.C62589KiM) r2
            r6.A01 = r2
            com.instagram.common.session.UserSession r1 = r6.A02
            X.1Av r5 = X.1Au.A00(r1)
            java.lang.String r4 = r2.A01
            X.0s0 r3 = r5.A85
            X.0YZ[] r2 = X.1Av.A8a
            r1 = 211(0xd3, float:2.96E-43)
            X.DbS.A1a(r5, r4, r3, r2, r1)
            com.instagram.archive.fragment.ArchiveHomeFragment.A00(r6)
            r1 = -1271122844(0xffffffffb43c3464, float:-1.7527924E-7)
            goto L_0x1194
        L_0x0dbf:
            java.lang.Object r0 = r1.A01
            com.instagram.archive.fragment.ArchiveHomeFragment r0 = (com.instagram.archive.fragment.ArchiveHomeFragment) r0
            java.lang.Object r7 = r1.A02
            android.app.Activity r7 = (android.app.Activity) r7
            r7.getClass()
            com.instagram.common.session.UserSession r6 = r0.A02
            X.Ki3 r5 = X.Ki3.ARCHIVE
            r4 = 0
            r3 = 1
            X.0qQ.A0B(r6, r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 119(0x77, float:1.67E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r1.putBoolean(r0, r3)
            r0 = 1530(0x5fa, float:2.144E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "hide_privacy_footer"
            r1.putBoolean(r0, r3)
            java.lang.String r0 = "highlight_management_source"
            r1.putSerializable(r0, r5)
            java.lang.String r0 = "suggested_highlights_enabled"
            r1.putBoolean(r0, r4)
            r0 = 233(0xe9, float:3.27E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.DbU.A0w(r7, r1, r6, r2, r0)
            return
        L_0x0e04:
            r0 = -708500776(0xffffffffd5c522d8, float:-2.70941804E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.LSr r2 = (X.C64184LSr) r2
            java.util.Map r2 = r2.A05
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0e2f
            java.lang.Object r3 = r1.A01
            X.K68 r3 = (X.K68) r3
            boolean r1 = r3.A08
            if (r1 == 0) goto L_0x0e34
            X.6ap r2 = X.DbV.A0X()
            r1 = 2131961444(0x7f132664, float:1.9559585E38)
            java.lang.String r1 = r3.getString(r1)
            r2.A0D = r1
            X.Dbb.A1Q(r2)
        L_0x0e2f:
            r1 = -225374157(0xfffffffff2911033, float:-5.7465485E30)
            goto L_0x1194
        L_0x0e34:
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            X.0eM r1 = r3.A0C
            X.6Yo r2 = X.DbX.A0N(r2, r1)
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r1 = new com.instagram.archive.fragment.SelectHighlightsCoverFragment
            r1.<init>()
            r2.A0D(r1)
            r2.A04()
            goto L_0x0e2f
        L_0x0e4a:
            r0 = 2042739948(0x79c1bcec, float:1.2574314E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.Kze r3 = (X.C63591Kze) r3
            java.lang.Object r1 = r1.A02
            X.1Xj r1 = (X.1Xj) r1
            java.lang.String r2 = r1.getId()
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r1 = r3.A00
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r5 = r1.mViewPager
            X.U4F r1 = r1.A01
            int r1 = r1.A00(r2)
            float r4 = (float) r1
            r2 = 0
            r1 = 1
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A05(r5, r2, r4, r1)
            r1 = 879008841(0x34649c49, float:2.1291011E-7)
            goto L_0x1194
        L_0x0e73:
            r0 = -617984722(0xffffffffdb2a4d2e, float:-4.7935606E16)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jnq r3 = (X.C60581Jnq) r3
            int r2 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Kzb r2 = r3.A00
            java.lang.Object r1 = r1.A01
            X.Li1 r1 = (X.C64785Li1) r1
            java.lang.String r6 = r1.A02
            X.K2T r2 = r2.A00
            X.0eM r1 = r2.A00
            java.lang.Object r5 = r1.getValue()
            X.Jgt r5 = (X.C60174Jgt) r5
            android.content.Context r4 = r2.requireContext()
            r1 = 30
            X.MP6 r3 = new X.MP6
            r3.<init>(r2, r1)
            java.util.Map r1 = r5.A00
            java.lang.Object r1 = r1.get(r6)
            java.io.File r1 = (java.io.File) r1
            if (r1 == 0) goto L_0x0eb3
            java.lang.String r1 = X.JTP.A0u(r1)
            r3.invoke(r1)
        L_0x0eae:
            r1 = -364632372(0xffffffffea4426cc, float:-5.928317E25)
            goto L_0x1194
        L_0x0eb3:
            X.05G r1 = r5.A01
            java.util.Map r1 = X.JTO.A18(r1)
            java.lang.Object r2 = r1.get(r6)
            X.4Dk r2 = (X.C262364Dk) r2
            if (r2 == 0) goto L_0x0eae
            X.LjS r1 = new X.LjS
            r1.<init>(r4, r5, r6, r3)
            r2.A01(r1)
            goto L_0x0eae
        L_0x0eca:
            r0 = 574417119(0x223ce8df, float:2.5602032E-18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KFi r2 = (X.C61632KFi) r2
            X.KzZ r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.LiN r1 = (X.C64803LiN) r1
            java.lang.String r4 = r1.A03
            com.instagram.common.typedurl.ImageUrl r7 = r1.A00
            com.instagram.common.typedurl.ImageUrl r8 = r1.A01
            X.K86 r1 = r2.A00
            X.0eM r1 = r1.A08
            java.lang.Object r5 = r1.getValue()
            X.Jiz r5 = (X.C60301Jiz) r5
            X.05G r1 = r5.A07
            java.lang.Object r6 = r1.getValue()
            X.MPr r6 = (X.C66385MPr) r6
            boolean r1 = r6 instanceof X.C61143Jxt
            r10 = -1
            if (r1 == 0) goto L_0x0f1b
            r1 = r6
            X.Jxt r1 = (X.C61143Jxt) r1
            X.Gn3 r1 = r1.A00
            java.lang.Object r1 = r1.A03
            java.util.List r1 = (java.util.List) r1
            r3 = 0
            java.util.Iterator r2 = r1.iterator()
        L_0x0f06:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0f1b
            java.lang.Object r1 = r2.next()
            X.N4E r1 = (X.N4E) r1
            java.lang.String r1 = r1.A05
            boolean r1 = X.0qQ.A0K(r1, r4)
            if (r1 == 0) goto L_0x0f2e
            r10 = r3
        L_0x0f1b:
            X.6oS r1 = X.C318116oQ.A00(r5)
            r9 = 0
            r11 = 0
            X.MGn r4 = new X.MGn
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r4, r1)
            r1 = 1810668270(0x6bec9aee, float:5.7207626E26)
            goto L_0x1194
        L_0x0f2e:
            int r3 = r3 + 1
            goto L_0x0f06
        L_0x0f31:
            r0 = 293616023(0x11803997, float:2.0230332E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KF8 r2 = (X.KF8) r2
            X.KzW r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.LiQ r1 = (X.LiQ) r1
            java.lang.String r7 = r1.A04
            java.lang.String r6 = r1.A03
            r4 = 1
            X.K85 r3 = r2.A00
            android.os.Bundle r2 = r3.requireArguments()
            java.lang.String r1 = "arg_appreciation_logging_fan_data"
            android.os.Parcelable r2 = r2.getParcelable(r1)
            if (r2 == 0) goto L_0x0f84
            com.instagram.appreciation.analytics.LoggingFanData r2 = (com.instagram.appreciation.analytics.LoggingFanData) r2
            X.0eM r1 = r3.A06
            java.lang.Object r5 = r1.getValue()
            com.instagram.appreciation.funding.AppreciationFundingViewModel r5 = (com.instagram.appreciation.funding.AppreciationFundingViewModel) r5
            X.0eM r1 = r3.A05
            java.lang.String r8 = X.DbU.A0u(r1)
            java.lang.String r9 = r2.A02
            r1 = 3
            X.0qQ.A0B(r9, r1)
            boolean r1 = r5.A00
            if (r1 != 0) goto L_0x0f7f
            r5.A00 = r4
            X.6oS r1 = X.C318116oQ.A00(r5)
            r10 = 0
            r11 = 0
            X.MEm r4 = new X.MEm
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r4, r1)
        L_0x0f7f:
            r1 = -250354425(0xfffffffff113e507, float:-7.323388E29)
            goto L_0x1194
        L_0x0f84:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0f89:
            r0 = 1736947100(0x6787b59c, float:1.2817392E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A02
            X.KFR r2 = (X.KFR) r2
            X.K89 r2 = r2.A00
            java.lang.Object r1 = r1.A01
            X.LiM r1 = (X.C64802LiM) r1
            java.lang.String r14 = r1.A04
            java.lang.Long r3 = r1.A01
            java.lang.Long r1 = r1.A00
            r17 = 0
            if (r3 == 0) goto L_0x0ff3
            if (r1 == 0) goto L_0x0ff3
            java.util.Map r12 = X.AnonymousClass7TF.A0w(r3, r1)
        L_0x0faa:
            android.os.Bundle r1 = r2.requireArguments()
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r3 = X.C63036KqR.A00(r1)
            X.0eM r1 = r2.A00
            java.lang.Object r4 = r1.getValue()
            X.LTO r4 = (X.LTO) r4
            java.lang.Integer r9 = X.AnonymousClass05K.A1F
            java.lang.Integer r10 = X.AnonymousClass05K.A05
            boolean r1 = r3.A01
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r3.A02
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            java.util.Map r11 = r3.A00
            r7 = 0
            java.lang.String r1 = "media_id"
            java.util.Map r13 = X.AnonymousClass7TF.A0w(r1, r14)
            r8 = r7
            r4.A08(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.0eM r1 = r2.A01
            com.instagram.common.session.UserSession r13 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r12 = r2.requireActivity()
            java.lang.String r15 = "AppreciationCreatorInsightsFragment"
            r19 = 1
            java.util.HashMap r16 = X.AnonymousClass7TE.A1E()
            r18 = r17
            X.FG2.A02(r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = -374808901(0xffffffffe9a8debb, float:-2.551892E25)
            goto L_0x1194
        L_0x0ff3:
            r12 = 0
            goto L_0x0faa
        L_0x0ff5:
            r0 = 1841682031(0x6dc5d66f, float:7.6534727E27)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jj6 r3 = (X.C60307Jj6) r3
            java.lang.Object r1 = r1.A01
            X.Kl4 r1 = (X.C62704Kl4) r1
            X.K1v r1 = (X.C61308K1v) r1
            X.Jvd r2 = r1.A00
            X.JwF r1 = r1.A01
            X.C60307Jj6.A01(r2, r1, r3)
            r1 = 522555352(0x1f258fd8, float:3.5059094E-20)
            goto L_0x1194
        L_0x1012:
            r0 = -1351324715(0xffffffffaf746bd5, float:-2.222998E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jj6 r3 = (X.C60307Jj6) r3
            java.lang.Object r7 = r1.A01
            X.Kl4 r7 = (X.C62704Kl4) r7
            X.K1v r7 = (X.C61308K1v) r7
            X.Jvd r1 = r7.A00
            boolean r6 = r1.A03
            boolean r4 = r1.A05
            boolean r2 = r1.A02
            boolean r5 = r1.A04
            X.JwF r1 = r7.A01
            java.lang.Object r14 = r1.A00
            java.util.Map r14 = (java.util.Map) r14
            X.LTO r7 = r3.A00
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r15 = 0
            X.0sm r16 = X.0Yt.A0E()
            r13 = r12
            r7.A08(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.6oS r1 = X.C318116oQ.A00(r3)
            r9 = 0
            X.MGK r5 = new X.MGK
            r7 = r14
            r8 = r15
            r10 = r4
            r11 = r2
            r6 = r3
            r5.<init>(r6, r7, r8, r9, r10, r11)
            X.AnonymousClass7TE.A1Z(r5, r1)
            r1 = -1601277134(0xffffffffa08e7332, float:-2.4131966E-19)
            goto L_0x1194
        L_0x1067:
            r0 = -64114186(0xfffffffffc2db1f6, float:-3.6075073E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jj6 r3 = (X.C60307Jj6) r3
            java.lang.Object r1 = r1.A01
            X.Kl4 r1 = (X.C62704Kl4) r1
            X.K1v r1 = (X.C61308K1v) r1
            X.Jvd r4 = r1.A00
            X.JwF r2 = r1.A01
            X.LTO r5 = r3.A00
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            boolean r1 = r4.A05
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r4.A02
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r12 = r2.A00
            java.util.Map r12 = (java.util.Map) r12
            boolean r1 = r4.A03
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r4.A04
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r13 = 0
            X.0sm r14 = X.0Yt.A0E()
            r5.A08(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 32
            X.MHA.A03(r3, r2, r1)
            r1 = -189117355(0xfffffffff4ba4c55, float:-1.1808049E32)
            goto L_0x1194
        L_0x10b4:
            r0 = 995578788(0x3b5753a4, float:0.003285625)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jj6 r3 = (X.C60307Jj6) r3
            java.lang.Object r1 = r1.A01
            X.Kl4 r1 = (X.C62704Kl4) r1
            X.K1u r1 = (X.C61307K1u) r1
            X.Jvd r2 = r1.A00
            r1 = 0
            X.C60307Jj6.A01(r2, r1, r3)
            r1 = -2046717638(0xffffffff8601913a, float:-2.43689E-35)
            goto L_0x1194
        L_0x10d0:
            r0 = -227984644(0xfffffffff2693afc, float:-4.6196042E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.Jj6 r3 = (X.C60307Jj6) r3
            java.lang.Object r1 = r1.A01
            X.Kl4 r1 = (X.C62704Kl4) r1
            X.K1u r1 = (X.C61307K1u) r1
            X.Jvd r2 = r1.A00
            X.LTO r4 = r3.A00
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            java.lang.Integer r10 = X.AnonymousClass05K.A07
            boolean r1 = r2.A05
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r2.A02
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r2.A03
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r2.A04
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r1)
            r11 = 0
            X.0sm r13 = X.0Yt.A0E()
            r12 = r11
            r4.A08(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            X.6oS r2 = X.C318116oQ.A00(r3)
            r1 = 33
            X.MHA.A03(r3, r2, r1)
            r1 = -1278795875(0xffffffffb3c71f9d, float:-9.27241E-8)
            goto L_0x1194
        L_0x1117:
            r0 = 376320903(0x166e3387, float:1.9241746E-25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A02
            X.K5m r7 = (X.C61392K5m) r7
            java.lang.Object r6 = r1.A01
            X.2da r6 = (X.2da) r6
            X.0eM r8 = r7.A05
            X.JjI r1 = X.JTO.A0S(r8)
            r1.A05()
            X.0eM r1 = r7.A02
            X.LTH r4 = X.JTO.A0T(r1)
            X.0eM r1 = r7.A03
            java.lang.String r3 = X.DbS.A0t(r1)
            java.lang.String r2 = X.C60315JjI.A02(r8)
            java.lang.String r1 = "advanced_settings_editing"
            r4.A0M(r3, r2, r1)
            X.JjI r1 = X.JTO.A0S(r8)
            X.0Ud r1 = r1.A0E
            java.lang.Object r5 = r1.getValue()
            X.JuP r5 = (X.C60967JuP) r5
            X.JjI r1 = X.JTO.A0S(r8)
            X.05G r8 = r1.A02
            java.lang.Object r9 = r8.getValue()
            java.lang.String r2 = "Required value was null."
            if (r9 == 0) goto L_0x11ab
            X.Jvn r9 = (X.C61049Jvn) r9
            X.05G r1 = r1.A05
            java.lang.Object r4 = r1.getValue()
            if (r4 == 0) goto L_0x11a6
            X.JuP r4 = (X.C60967JuP) r4
            int r3 = r4.A00
            java.util.List r2 = r9.A02
            r1 = -1
            if (r3 != r1) goto L_0x119c
            X.N49 r1 = r4.A01
            java.util.ArrayList r2 = X.00k.A0T(r1, r2)
        L_0x1177:
            java.lang.Object r1 = r8.getValue()
            X.Jvn r1 = (X.C61049Jvn) r1
            if (r1 == 0) goto L_0x119a
            X.Jvn r1 = X.C61049Jvn.A00(r1, (java.lang.String) null, (java.util.List) null, (java.util.List) null, r2, (java.util.List) null, 983, true, false, false, false, false)
        L_0x1183:
            r8.Epw(r1)
            X.DbT.A1I(r7)
            r2 = 0
            if (r5 == 0) goto L_0x1198
            boolean r1 = r5.A04
        L_0x118e:
            r6.ARb(r2, r1)
            r1 = -736437757(0xffffffffd41ada03, float:-2.66033037E12)
        L_0x1194:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x1198:
            r1 = 0
            goto L_0x118e
        L_0x119a:
            r1 = 0
            goto L_0x1183
        L_0x119c:
            java.util.ArrayList r2 = X.00k.A0U(r2)
            X.N49 r1 = r4.A01
            r2.set(r3, r1)
            goto L_0x1177
        L_0x11a6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x11ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x11b0:
            r0 = 786239882(0x2edd118a, float:1.0053032E-10)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A02
            X.K5r r3 = (X.C61397K5r) r3
            java.lang.Object r1 = r1.A01
            r0 = 26
            X.MMV r4 = X.MMV.A00(r1, r3, r0)
            X.0eM r0 = r3.A05
            X.JjI r0 = X.JTO.A0S(r0)
            X.0Ud r0 = r0.A0E
            java.lang.Object r0 = r0.getValue()
            X.JuP r0 = (X.C60967JuP) r0
            if (r0 == 0) goto L_0x1208
            boolean r1 = r0.A05
            boolean r0 = r0.A06
            if (r1 == 0) goto L_0x1208
            if (r0 == 0) goto L_0x1208
            X.0eM r2 = r3.A02
            X.1Ln r1 = X.LTH.A02(r2)
            boolean r0 = X.DbT.A1Y(r1)
            if (r0 == 0) goto L_0x11ef
            java.lang.String r0 = "thread_view_add_example_dialogue_submit_for_review_dialog_shown"
            r1.A0l(r0)
            r1.Cgf()
        L_0x11ef:
            android.content.Context r3 = r3.requireContext()
            X.LTH r2 = X.JTO.A0T(r2)
            r0 = 21
            X.MMM r1 = new X.MMM
            r1.<init>(r4, r0)
            java.lang.String r0 = "in_thread_add_example_dialogue"
            X.C63001Kpr.A00(r3, r2, r0, r1)
        L_0x1203:
            r0 = -425234373(0xffffffffe6a7703b, float:-3.9535274E23)
            goto L_0x1289
        L_0x1208:
            r4.invoke()
            goto L_0x1203
        L_0x120c:
            r0 = -1412487007(0xffffffffabcf28a1, float:-1.4719511E-12)
            int r6 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A02
            X.K5k r7 = (X.C61390K5k) r7
            java.lang.Object r5 = r1.A01
            X.2da r5 = (X.2da) r5
            X.0eM r8 = r7.A05
            X.JjJ r0 = X.JTO.A0R(r8)
            r0.A04()
            X.0eM r0 = r7.A02
            X.LTH r3 = X.JTO.A0T(r0)
            X.0eM r0 = r7.A03
            java.lang.String r2 = X.DbS.A0t(r0)
            java.lang.String r1 = X.C60316JjJ.A02(r8)
            java.lang.String r0 = "advanced_settings_creation"
            r3.A0M(r2, r1, r0)
            X.JjJ r0 = X.JTO.A0R(r8)
            X.0Ud r0 = r0.A0N
            java.lang.Object r4 = r0.getValue()
            X.JuP r4 = (X.C60967JuP) r4
            X.JjJ r0 = X.JTO.A0R(r8)
            X.05G r8 = r0.A04
            java.lang.Object r9 = r8.getValue()
            java.lang.String r1 = "Required value was null."
            if (r9 == 0) goto L_0x12a0
            X.Jvn r9 = (X.C61049Jvn) r9
            X.05G r0 = r0.A07
            java.lang.Object r3 = r0.getValue()
            if (r3 == 0) goto L_0x129b
            X.JuP r3 = (X.C60967JuP) r3
            int r2 = r3.A00
            java.util.List r1 = r9.A02
            r0 = -1
            if (r2 != r0) goto L_0x1291
            X.N49 r0 = r3.A01
            java.util.ArrayList r1 = X.00k.A0T(r0, r1)
        L_0x126c:
            java.lang.Object r0 = r8.getValue()
            X.Jvn r0 = (X.C61049Jvn) r0
            if (r0 == 0) goto L_0x128f
            X.Jvn r0 = X.C61049Jvn.A00(r0, (java.lang.String) null, (java.util.List) null, (java.util.List) null, r1, (java.util.List) null, 983, true, false, false, false, false)
        L_0x1278:
            r8.Epw(r0)
            X.DbT.A1I(r7)
            r1 = 0
            if (r4 == 0) goto L_0x128d
            boolean r0 = r4.A04
        L_0x1283:
            r5.ARb(r1, r0)
            r0 = -615509812(0xffffffffdb5010cc, float:-5.8565264E16)
        L_0x1289:
            X.AnonymousClass0fD.A0C(r0, r6)
            return
        L_0x128d:
            r0 = 0
            goto L_0x1283
        L_0x128f:
            r0 = 0
            goto L_0x1278
        L_0x1291:
            java.util.ArrayList r1 = X.00k.A0U(r1)
            X.N49 r0 = r3.A01
            r1.set(r2, r0)
            goto L_0x126c
        L_0x129b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x12a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x12a5:
            java.util.Map r0 = r3.A03
            java.lang.Object r2 = r0.get(r6)
            X.L3g r2 = (X.C63696L3g) r2
            if (r2 != 0) goto L_0x12b7
            X.L3g r2 = new X.L3g
            r2.<init>()
            r0.put(r6, r2)
        L_0x12b7:
            boolean r0 = r3.A00
            r2.A00 = r0
            java.util.ArrayList r1 = r3.A02
            boolean r0 = r1.contains(r6)
            r2.A01 = r0
            if (r0 == 0) goto L_0x12cc
            r1.remove(r6)
        L_0x12c8:
            X.K9A.A00(r3)
            return
        L_0x12cc:
            r1.add(r6)
            goto L_0x12c8
        L_0x12d0:
            X.Lh4 r3 = new X.Lh4
            r3.<init>(r2, r0)
            com.instagram.creation.base.ui.mediatabbar.Tab r2 = r2.A03
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A01
            java.lang.String r1 = "android.permission.WRITE_EXTERNAL_STORAGE"
            if (r2 != r0) goto L_0x12e5
            java.lang.String[] r0 = new java.lang.String[]{r4, r1}
        L_0x12e1:
            X.1DL.A04(r5, r3, r0)
            return
        L_0x12e5:
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            java.lang.String[] r0 = new java.lang.String[]{r4, r1, r0}
            goto L_0x12e1
        L_0x12ec:
            java.lang.String r0 = "CAMERA PermissionState not received in permission request"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY8.onClick(android.view.View):void");
    }
}
