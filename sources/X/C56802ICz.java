package X;

import android.view.View;

/* renamed from: X.ICz  reason: case insensitive filesystem */
public final class C56802ICz implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C56802ICz(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C56802ICz A00(Object obj, int i) {
        return new C56802ICz(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C56802ICz(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0702, code lost:
        r8 = "collection";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0780, code lost:
        if (r1 == false) goto L_0x0782;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x07b5, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x07b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0a29, code lost:
        r8 = "userSession";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:0x0df3, code lost:
        X.0qQ.A0F(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x0dfa, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x107c, code lost:
        X.AnonymousClass0fD.A0C(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x107f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x108c, code lost:
        X.AnonymousClass0fD.A0C(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x108f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r0 = r28
            int r1 = r0.A00
            switch(r1) {
                case 0: goto L_0x1065;
                case 1: goto L_0x104d;
                case 2: goto L_0x1006;
                case 3: goto L_0x0fc7;
                case 4: goto L_0x0faf;
                case 5: goto L_0x0f93;
                case 6: goto L_0x0f77;
                case 7: goto L_0x0f5e;
                case 8: goto L_0x0ea1;
                case 9: goto L_0x0e88;
                case 10: goto L_0x0e73;
                case 11: goto L_0x0e5a;
                case 12: goto L_0x0e2b;
                case 13: goto L_0x0e1a;
                case 14: goto L_0x0d99;
                case 15: goto L_0x0cde;
                case 16: goto L_0x0cb9;
                case 17: goto L_0x0c94;
                case 18: goto L_0x0c57;
                case 19: goto L_0x0c46;
                case 20: goto L_0x0c29;
                case 21: goto L_0x0bf7;
                case 22: goto L_0x0bda;
                case 23: goto L_0x0bb3;
                case 24: goto L_0x0b3b;
                case 25: goto L_0x0b28;
                case 26: goto L_0x0b17;
                case 27: goto L_0x0b06;
                case 28: goto L_0x0af5;
                case 29: goto L_0x0ae4;
                case 30: goto L_0x0ad3;
                case 31: goto L_0x1080;
                case 32: goto L_0x0a2d;
                case 33: goto L_0x09de;
                case 34: goto L_0x099e;
                case 35: goto L_0x092a;
                case 36: goto L_0x08e5;
                case 37: goto L_0x07e4;
                case 38: goto L_0x07b9;
                case 39: goto L_0x0742;
                case 40: goto L_0x0706;
                case 41: goto L_0x06c8;
                case 42: goto L_0x067b;
                case 43: goto L_0x0667;
                case 44: goto L_0x0599;
                case 45: goto L_0x0581;
                case 46: goto L_0x055a;
                case 47: goto L_0x0547;
                case 48: goto L_0x0534;
                case 49: goto L_0x04e2;
                case 50: goto L_0x04a1;
                case 51: goto L_0x0473;
                case 52: goto L_0x0460;
                case 53: goto L_0x03fe;
                case 54: goto L_0x02ec;
                case 55: goto L_0x029b;
                case 56: goto L_0x0280;
                case 57: goto L_0x026d;
                case 58: goto L_0x0228;
                case 59: goto L_0x0215;
                case 60: goto L_0x0144;
                case 61: goto L_0x020b;
                case 62: goto L_0x00d0;
                case 63: goto L_0x00b2;
                case 64: goto L_0x0007;
                case 65: goto L_0x0203;
                case 66: goto L_0x00a4;
                case 67: goto L_0x0007;
                case 68: goto L_0x01f0;
                case 69: goto L_0x01dd;
                case 70: goto L_0x01ca;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r0.A01
            X.H15 r4 = (X.H15) r4
            android.content.Context r5 = r4.getContext()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x00a3
            if (r5 == 0) goto L_0x00a3
            android.view.View r0 = r4.mView
            if (r0 == 0) goto L_0x001c
            X.0nA.A0N(r0)
        L_0x001c:
            int r7 = r4.A00
            r0 = -1
            if (r7 != r0) goto L_0x0029
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.Integer r0 = r0.A0E
            int r7 = X.AnonymousClass7TG.A0A(r0)
        L_0x0029:
            X.1as r0 = X.1as.A04
            X.1ap r3 = r0.A02
            com.instagram.common.session.UserSession r2 = r4.A05
            X.2FW r1 = X.2FW.A1Q
            java.lang.String r0 = r4.getModuleName()
            X.F3w r6 = r3.A08(r2, r1, r0)
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            r3 = 0
            X.0qQ.A0B(r1, r3)
            android.os.Bundle r2 = r6.A07
            r0 = 2230(0x8b6, float:3.125E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putParcelable(r0, r1)
            X.0xF r8 = new X.0xF
            r8.<init>()
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = "collection_id"
            X.0xF.A00(r8, r1, r0)
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            java.lang.String r1 = r0.A0G
            java.lang.String r0 = "collection_name"
            X.0xF.A00(r8, r1, r0)
            com.instagram.save.model.SavedCollection r1 = r4.A0C
            com.instagram.common.session.UserSession r0 = r4.A05
            java.lang.Integer r0 = r1.A01(r0)
            java.lang.String r1 = X.I35.A01(r0)
            java.lang.String r0 = "user_type"
            X.0xF.A00(r8, r1, r0)
            r6.A02(r8)
            r1 = 3
            X.P43 r0 = new X.P43
            r0.<init>(r4, r1)
            r6.A01 = r0
            r0 = 2229(0x8b5, float:3.123E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.putInt(r0, r7)
            com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment r2 = r6.A00()
            X.37E r0 = X.AnonymousClass37D.A00
            X.37D r1 = r0.A02(r5)
            if (r1 == 0) goto L_0x009d
            X.HFY r0 = new X.HFY
            r0.<init>(r4, r3)
            r1.A0Q(r0)
            r1.A0I(r2)
        L_0x009d:
            X.1Ng r1 = r4.A04
            r0 = 1
            X.C57076INq.A00(r1, r0)
        L_0x00a3:
            return
        L_0x00a4:
            java.lang.Object r1 = r0.A01
            X.H15 r1 = (X.H15) r1
            boolean r0 = r1.A0S
            if (r0 != 0) goto L_0x00a3
            X.HqZ r0 = r1.A0H
            r0.A00()
            return
        L_0x00b2:
            java.lang.Object r2 = r0.A01
            X.H15 r2 = (X.H15) r2
            com.instagram.common.ui.base.IgEditText r0 = r2.A06
            if (r0 == 0) goto L_0x00a3
            android.view.View r1 = r2.A01
            if (r1 == 0) goto L_0x00a3
            r0 = 0
            r1.setVisibility(r0)
            com.instagram.common.ui.base.IgEditText r0 = r2.A06
            r0.requestFocus()
            r0 = 1
            r2.A0R = r0
            com.instagram.common.ui.base.IgEditText r0 = r2.A06
            X.0nA.A0Q(r0)
            return
        L_0x00d0:
            java.lang.Object r6 = r0.A01
            X.H15 r6 = (X.H15) r6
            com.instagram.save.model.SavedCollection r1 = r6.A0C
            if (r1 == 0) goto L_0x00a3
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r6.A0J
            if (r0 == 0) goto L_0x00a3
            java.lang.Boolean r0 = r1.A0B
            boolean r5 = r0.booleanValue()
            com.instagram.common.session.UserSession r0 = r6.A05
            java.lang.String r9 = r1.A0F
            java.lang.Integer r8 = X.C51967G9n.A0l(r5)
            r4 = 0
            boolean r3 = X.AnonymousClass7TF.A1U(r4, r0, r9)
            X.1NY r7 = X.DbU.A0M(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            java.lang.String r0 = "collections/"
            java.lang.StringBuilder r1 = X.AnonymousClass7TF.A0n(r0)
            if (r8 != r2) goto L_0x013e
            r1.append(r9)
            java.lang.String r0 = "/unlike/"
        L_0x0102:
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r1)
            r7.A0A(r0)
            r7.A08(r2)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r7.A0Q(r1, r0)
            X.1OC r2 = X.DbT.A0U(r7, r3)
            r1 = 3
            X.H4m r0 = new X.H4m
            r0.<init>(r1, r6, r5)
            r2.A00 = r0
            X.1ES.A03(r2)
            com.instagram.save.model.SavedCollection r2 = r6.A0C
            r1 = r5 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2.A0B = r0
            X.5xz r0 = r6.A0K
            r0.A02(r5, r4, r4)
            com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView r0 = r6.A0J
            r0.setSelected(r1)
            if (r5 != 0) goto L_0x00a3
            r0 = r29
            r0.performHapticFeedback(r3)
            return
        L_0x013e:
            r1.append(r9)
            java.lang.String r0 = "/like/"
            goto L_0x0102
        L_0x0144:
            java.lang.Object r4 = r0.A01
            X.H15 r4 = (X.H15) r4
            com.instagram.common.ui.base.IgEditText r0 = r4.A06
            if (r0 == 0) goto L_0x00a3
            java.lang.String r8 = X.AnonymousClass7TF.A0f(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00a3
            com.instagram.save.model.SavedCollection r0 = r4.A0C
            if (r0 == 0) goto L_0x01bd
            com.instagram.user.model.User r0 = r0.A08
            if (r0 == 0) goto L_0x01bd
            com.instagram.model.direct.DirectShareTarget r6 = new com.instagram.model.direct.DirectShareTarget
            r6.<init>((com.instagram.user.model.User) r0)
            com.instagram.save.model.SavedCollection r7 = r4.A0C
            java.lang.String r0 = r7.A0F
            r6.A0G = r0
            com.instagram.common.session.UserSession r1 = r4.A05
            java.lang.String r9 = r4.getModuleName()
            r10 = 0
            X.0qQ.A0B(r1, r10)
            r0 = 2
            X.7Z7 r5 = X.OXC.A01(r1, r6)
            r11 = r10
            r5.EMQ(r6, r7, r8, r9, r10, r11)
            com.instagram.common.session.UserSession r5 = r4.A05
            com.instagram.save.model.SavedCollection r3 = r4.A0C
            X.0qQ.A0B(r5, r10)
            X.0wc r1 = X.C51967G9n.A0Z(r4, r5, r3, r0)
            java.lang.String r0 = "ig_collections"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r2.isSampled()
            if (r0 == 0) goto L_0x01af
            java.lang.String r1 = r4.getModuleName()
            java.lang.String r0 = "module_name"
            r2.AAJ(r0, r1)
            java.lang.String r1 = "collection_send_message"
            java.lang.String r0 = "event"
            java.lang.String r1 = X.C51975G9x.A0g(r2, r3, r0, r1)
            java.lang.String r0 = "collection_type"
            X.C51973G9u.A14(r2, r0, r1)
            X.I35.A02(r2, r5, r3)
            r2.Cgf()
        L_0x01af:
            android.os.Handler r3 = X.AnonymousClass7TF.A0D()
            X.Ifu r2 = new X.Ifu
            r2.<init>(r4)
            r0 = 300(0x12c, double:1.48E-321)
            r3.postDelayed(r2, r0)
        L_0x01bd:
            com.instagram.common.ui.base.IgEditText r0 = r4.A06
            X.0nA.A0N(r0)
            com.instagram.common.ui.base.IgEditText r1 = r4.A06
            java.lang.String r0 = ""
            r1.setText(r0)
            return
        L_0x01ca:
            r1 = 1760464716(0x68ee8f4c, float:9.0125327E24)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.JQf r0 = (X.C59611JQf) r0
            r0.DdM()
            r0 = 146841838(0x8c0a0ee, float:1.1593414E-33)
            goto L_0x108c
        L_0x01dd:
            r1 = 661565779(0x276eb153, float:3.3125263E-15)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.JQf r0 = (X.C59611JQf) r0
            r0.Cu3()
            r0 = 1742408874(0x67db0caa, float:2.0688637E24)
            goto L_0x108c
        L_0x01f0:
            r1 = -1877180669(0xffffffff901c7f03, float:-3.0863422E-29)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.JQf r0 = (X.C59611JQf) r0
            r0.Dv7()
            r0 = 1892597185(0x70cebdc1, float:5.118665E29)
            goto L_0x108c
        L_0x0203:
            java.lang.Object r0 = r0.A01
            X.H15 r0 = (X.H15) r0
            X.H15.A03(r0)
            return
        L_0x020b:
            java.lang.Object r0 = r0.A01
            X.H15 r0 = (X.H15) r0
            com.instagram.common.ui.base.IgEditText r0 = r0.A06
            X.0nA.A0N(r0)
            return
        L_0x0215:
            r1 = -758603219(0xffffffffd2c8a22d, float:-4.30857159E11)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.GcN r0 = (X.C52770GcN) r0
            r0.A0B()
            r0 = 1499043256(0x595995b8, float:3.82779297E15)
            goto L_0x108c
        L_0x0228:
            r1 = -518391936(0xffffffffe119f780, float:-1.7751163E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.GcN r3 = (X.C52770GcN) r3
            androidx.fragment.app.FragmentActivity r2 = r3.requireActivity()
            com.instagram.common.session.UserSession r0 = r3.A03
            if (r0 == 0) goto L_0x0a29
            X.6Yo r6 = X.DbS.A0M(r2, r0)
            X.C55115HcO.A00()
            com.instagram.save.model.SavedCollection r5 = r3.A0C
            if (r5 == 0) goto L_0x0702
            java.lang.String r4 = r3.A0F
            if (r4 != 0) goto L_0x024e
            java.lang.String r8 = "_sessionId"
            goto L_0x0df3
        L_0x024e:
            X.H1v r3 = new X.H1v
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            r2.putParcelable(r0, r5)
            r0 = 113(0x71, float:1.58E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r4)
            X.DbW.A0x(r2, r3, r6)
            r0 = 1364945023(0x515b687f, float:5.8896937E10)
            goto L_0x107c
        L_0x026d:
            r1 = -295386805(0xffffffffee64c14b, float:-1.7699065E28)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.GcN r0 = (X.C52770GcN) r0
            r0.A0B()
            r0 = 2001741023(0x775024df, float:4.2216624E33)
            goto L_0x108c
        L_0x0280:
            r1 = 1676436078(0x63ec626e, float:8.7210484E21)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.GcN r0 = (X.C52770GcN) r0
            X.HqZ r0 = r0.A0D
            if (r0 != 0) goto L_0x0293
            java.lang.String r8 = "optionsActionSheet"
            goto L_0x0df3
        L_0x0293:
            r0.A00()
            r0 = -1186154143(0xffffffffb94cb961, float:-1.9524015E-4)
            goto L_0x108c
        L_0x029b:
            r1 = -630404661(0xffffffffda6cc9cb, float:-1.66624921E16)
            int r5 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01
            X.GcN r6 = (X.C52770GcN) r6
            X.C55115HcO.A00()
            com.instagram.common.session.UserSession r0 = r6.A03
            java.lang.String r8 = "userSession"
            if (r0 == 0) goto L_0x0df3
            java.lang.String r1 = r0.A05
            int r4 = r6.A00
            X.HG5 r0 = r6.A05
            if (r0 != 0) goto L_0x02bb
            java.lang.String r8 = "selectStateProvider"
            goto L_0x0df3
        L_0x02bb:
            java.util.LinkedHashMap r0 = r0.A02
            java.util.Set r0 = r0.keySet()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            X.H25 r2 = new X.H25
            r2.<init>()
            android.os.Bundle r1 = X.DbX.A0C(r1)
            java.lang.String r0 = "ARGUMENT_NUM_MEDIA_COLLECTIONS"
            r1.putInt(r0, r4)
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_ITEM_IDS"
            r1.putStringArrayList(r0, r3)
            androidx.fragment.app.FragmentActivity r1 = X.DbU.A0I(r1, r2, r6)
            com.instagram.common.session.UserSession r0 = r6.A03
            if (r0 == 0) goto L_0x0df3
            X.DbY.A14(r2, r1, r0)
            r0 = 119059143(0x718b2c7, float:1.1487747E-34)
            goto L_0x108c
        L_0x02ec:
            r1 = 1476797239(0x58062337, float:5.8994322E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01     // Catch:{ IOException -> 0x03e8 }
            X.GcN r4 = (X.C52770GcN) r4     // Catch:{ IOException -> 0x03e8 }
            r8 = 1
            X.C51975G9x.A17(r4, r8)     // Catch:{ IOException -> 0x03e8 }
            X.HG5 r2 = r4.A05     // Catch:{ IOException -> 0x03e8 }
            r15 = 0
            if (r2 != 0) goto L_0x030a
            java.lang.String r7 = "selectStateProvider"
        L_0x0302:
            X.0qQ.A0F(r7)     // Catch:{ IOException -> 0x03e8 }
        L_0x0305:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x03e8 }
            throw r2     // Catch:{ IOException -> 0x03e8 }
        L_0x030a:
            java.util.List r2 = r2.A04()     // Catch:{ IOException -> 0x03e8 }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ IOException -> 0x03e8 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ IOException -> 0x03e8 }
        L_0x0316:
            boolean r2 = r3.hasNext()     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x032a
            X.1Xj r2 = X.C51966G9m.A0t(r3)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = r2.A30()     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x0316
            r5.add(r2)     // Catch:{ IOException -> 0x03e8 }
            goto L_0x0316
        L_0x032a:
            X.0eM r2 = r4.A0U     // Catch:{ IOException -> 0x03e8 }
            boolean r2 = X.AnonymousClass7TF.A1Z(r2)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r7 = "collection"
            java.lang.String r6 = "userSession"
            if (r2 == 0) goto L_0x03a7
            android.os.Bundle r3 = r4.requireArguments()     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_IS_PUBLIC"
            boolean r2 = r3.getBoolean(r2)     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x03a4
            com.instagram.api.schemas.CollectionPrivacyModeEnum r8 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ IOException -> 0x03e8 }
        L_0x0344:
            boolean r2 = r5.isEmpty()     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x03a2
            android.os.Bundle r3 = r4.requireArguments()     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_ADDED_MEDIA_FBID"
            java.lang.String r14 = r3.getString(r2)     // Catch:{ IOException -> 0x03e8 }
        L_0x0354:
            com.instagram.common.session.UserSession r9 = r4.A03     // Catch:{ IOException -> 0x03e8 }
            if (r9 == 0) goto L_0x03e3
            com.instagram.save.model.SavedCollection r2 = r4.A0C     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x0302
            java.lang.String r12 = r2.A0G     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r13 = r4.getModuleName()     // Catch:{ IOException -> 0x03e8 }
            android.os.Bundle r3 = r4.requireArguments()     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_SURFACE"
            java.lang.String r16 = X.C320236s2.A01(r3, r2)     // Catch:{ IOException -> 0x03e8 }
            android.os.Bundle r3 = r4.requireArguments()     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_WITH_SEARCH_TEXT"
            boolean r6 = r3.getBoolean(r2)     // Catch:{ IOException -> 0x03e8 }
            android.os.Bundle r3 = r4.requireArguments()     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "SaveFragment.ARGUMENT_SAVED_COLLECTION_CREATE_THREAD_ID"
            java.lang.String r17 = r3.getString(r2)     // Catch:{ IOException -> 0x03e8 }
            X.H50 r4 = r4.A0Q     // Catch:{ IOException -> 0x03e8 }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x03e8 }
            java.lang.Boolean r11 = X.AnonymousClass7TE.A0u()     // Catch:{ IOException -> 0x03e8 }
            r18 = r5
            X.1NY r3 = X.C56641I5w.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "collections/create/"
            r3.A0A(r2)     // Catch:{ IOException -> 0x03e8 }
            X.1OC r3 = r3.A0M()     // Catch:{ IOException -> 0x03e8 }
            r2 = 12
            X.H51.A00(r3, r4, r9, r2)     // Catch:{ IOException -> 0x03e8 }
            X.1ES.A03(r3)     // Catch:{ IOException -> 0x03e8 }
            goto L_0x03f9
        L_0x03a2:
            r14 = r15
            goto L_0x0354
        L_0x03a4:
            com.instagram.api.schemas.CollectionPrivacyModeEnum r8 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PRIVATE     // Catch:{ IOException -> 0x03e8 }
            goto L_0x0344
        L_0x03a7:
            com.instagram.common.session.UserSession r3 = r4.A03     // Catch:{ IOException -> 0x03e8 }
            if (r3 == 0) goto L_0x03e3
            com.instagram.save.model.SavedCollection r2 = r4.A0C     // Catch:{ IOException -> 0x03e8 }
            if (r2 == 0) goto L_0x0302
            java.lang.String r2 = r2.A0F     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r7 = r4.getModuleName()     // Catch:{ IOException -> 0x03e8 }
            X.1NY r6 = X.DbU.A0N(r3)     // Catch:{ IOException -> 0x03e8 }
            java.lang.Object[] r3 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "collections/%s/edit/"
            r6.A0K(r2, r3)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r3 = X.0mh.A00(r5)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "added_media_ids"
            r6.A9m(r2, r3)     // Catch:{ IOException -> 0x03e8 }
            java.lang.String r2 = "module_name"
            r6.A9m(r2, r7)     // Catch:{ IOException -> 0x03e8 }
            java.lang.Class<com.instagram.save.model.SavedCollection> r3 = com.instagram.save.model.SavedCollection.class
            java.lang.Class<X.Vwn> r2 = X.C18689Vwn.class
            r6.A0R(r3, r2)     // Catch:{ IOException -> 0x03e8 }
            X.1OC r3 = X.DbT.A0U(r6, r8)     // Catch:{ IOException -> 0x03e8 }
            X.H50 r2 = r4.A0Q     // Catch:{ IOException -> 0x03e8 }
            r3.A00 = r2     // Catch:{ IOException -> 0x03e8 }
            r4.schedule(r3)     // Catch:{ IOException -> 0x03e8 }
            goto L_0x03f9
        L_0x03e3:
            X.0qQ.A0F(r6)     // Catch:{ IOException -> 0x03e8 }
            goto L_0x0305
        L_0x03e8:
            java.lang.Object r2 = r0.A01
            X.GcN r2 = (X.C52770GcN) r2
            r0 = 0
            X.C51975G9x.A17(r2, r0)
            android.content.Context r2 = r2.requireContext()
            java.lang.String r0 = "add_to_collection_failed"
            X.C59689JTv.A0C(r2, r0)
        L_0x03f9:
            r0 = 1988260939(0x7682744b, float:1.3229635E33)
            goto L_0x107c
        L_0x03fe:
            r1 = 115538710(0x6e2fb16, float:8.538069E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01     // Catch:{ IOException -> 0x044a }
            X.GcN r4 = (X.C52770GcN) r4     // Catch:{ IOException -> 0x044a }
            r2 = 1
            X.C51975G9x.A17(r4, r2)     // Catch:{ IOException -> 0x044a }
            com.instagram.common.session.UserSession r7 = r4.A03     // Catch:{ IOException -> 0x044a }
            if (r7 != 0) goto L_0x041b
            java.lang.String r2 = "userSession"
        L_0x0413:
            X.0qQ.A0F(r2)     // Catch:{ IOException -> 0x044a }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x044a }
            throw r2     // Catch:{ IOException -> 0x044a }
        L_0x041b:
            android.content.Context r3 = r4.requireContext()     // Catch:{ IOException -> 0x044a }
            r2 = 2131972616(0x7f135208, float:1.9582245E38)
            java.lang.String r8 = r3.getString(r2)     // Catch:{ IOException -> 0x044a }
            java.lang.String r9 = r4.getModuleName()     // Catch:{ IOException -> 0x044a }
            X.HG5 r2 = r4.A05     // Catch:{ IOException -> 0x044a }
            if (r2 != 0) goto L_0x0431
            java.lang.String r2 = "selectStateProvider"
            goto L_0x0413
        L_0x0431:
            java.util.LinkedHashMap r2 = r2.A02     // Catch:{ IOException -> 0x044a }
            java.util.Set r2 = r2.keySet()     // Catch:{ IOException -> 0x044a }
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1D(r2)     // Catch:{ IOException -> 0x044a }
            r10 = 0
            com.instagram.api.schemas.CollectionPrivacyModeEnum r5 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ IOException -> 0x044a }
            r2 = 17
            X.H50 r6 = new X.H50     // Catch:{ IOException -> 0x044a }
            r6.<init>(r4, r2)     // Catch:{ IOException -> 0x044a }
            r12 = 0
            X.C56641I5w.A03(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x044a }
            goto L_0x045b
        L_0x044a:
            java.lang.Object r2 = r0.A01
            X.GcN r2 = (X.C52770GcN) r2
            r0 = 0
            X.C51975G9x.A17(r2, r0)
            android.content.Context r2 = r2.requireContext()
            java.lang.String r0 = "add_to_collection_failed"
            X.C59689JTv.A0C(r2, r0)
        L_0x045b:
            r0 = 1936449363(0x736bdf53, float:1.8687734E31)
            goto L_0x107c
        L_0x0460:
            r1 = -956712853(0xffffffffc6f9b86b, float:-31964.209)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            androidx.paging.PagingDataAdapter r0 = (androidx.paging.PagingDataAdapter) r0
            r0.A05()
            r0 = 302687723(0x120aa5eb, float:4.374963E-28)
            goto L_0x07b5
        L_0x0473:
            r1 = -1764353781(0xffffffff96d6190b, float:-3.458937E-25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            X.1Ze r3 = X.C55169HdL.A00()
            java.lang.Object r1 = r0.A01
            X.H1G r1 = (X.H1G) r1
            X.0eM r0 = r1.A03
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            androidx.fragment.app.FragmentActivity r4 = r1.requireActivity()
            X.HM8 r7 = X.HM8.SAVED_AUDIO_PAGE
            X.GgD r0 = r1.A00
            if (r0 != 0) goto L_0x0496
            java.lang.String r8 = "viewModel"
            goto L_0x0df3
        L_0x0496:
            java.util.List r8 = r0.A00
            r5 = 0
            r3.A01(r4, r5, r6, r7, r8)
            r0 = 270162537(0x101a5a69, float:3.0440794E-29)
            goto L_0x07b5
        L_0x04a1:
            r1 = 1784236637(0x6a594a5d, float:6.567202E25)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.H1q r3 = (X.C54171H1q) r3
            X.0eM r0 = r3.A0M
            java.lang.Object r0 = r0.getValue()
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r0 = r0.getText()
            r0.clear()
            X.DbS.A1D(r3)
            androidx.recyclerview.widget.RecyclerView r1 = r3.A04
            if (r1 != 0) goto L_0x04c6
            java.lang.String r8 = "recyclerView"
            goto L_0x0df3
        L_0x04c6:
            r0 = 0
            r1.setVisibility(r0)
            X.0eM r0 = r3.A0O
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
            r1 = 8
            r0.setVisibility(r1)
            X.C54171H1q.A00(r3)
            X.0eM r0 = r3.A0Q
            X.DbW.A1R(r0, r1)
            r0 = -1399908849(0xffffffffac8f160f, float:-4.0667534E-12)
            goto L_0x07b5
        L_0x04e2:
            r1 = -1455850935(0xffffffffa9397a49, float:-4.1184317E-14)
            int r3 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.H1q r2 = (X.C54171H1q) r2
            X.1Xj r6 = r2.A05
            if (r6 == 0) goto L_0x052a
            java.lang.Integer r1 = r2.A0A
            if (r1 != 0) goto L_0x04f9
            java.lang.String r8 = "actionButtonMode"
            goto L_0x0df3
        L_0x04f9:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x052a
            X.I1p r4 = r2.A08
            if (r4 != 0) goto L_0x0505
            java.lang.String r8 = "delegate"
            goto L_0x0df3
        L_0x0505:
            java.lang.String r7 = r2.A0C
            if (r7 != 0) goto L_0x050d
            java.lang.String r8 = "newCollectionName"
            goto L_0x0df3
        L_0x050d:
            int r9 = r2.A00
            int r10 = r2.A01
            X.0eM r0 = r2.A0J
            java.lang.Object r0 = r0.getValue()
            X.2Rw r0 = (X.2Rw) r0
            int r11 = r0.getItemCount()
            java.lang.String r8 = r2.A0B
            if (r8 != 0) goto L_0x0525
            java.lang.String r8 = "navigationType"
            goto L_0x0df3
        L_0x0525:
            androidx.fragment.app.Fragment r5 = r2.mParentFragment
            r4.A03(r5, r6, r7, r8, r9, r10, r11)
        L_0x052a:
            X.DbT.A1J(r2)
            r0 = -865948372(0xffffffffcc62ad2c, float:-5.9421872E7)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x0534:
            r1 = -2048891431(0xffffffff85e065d9, float:-2.1102272E-35)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.H1q r0 = (X.C54171H1q) r0
            X.C54171H1q.A01(r0)
            r0 = -1993619330(0xffffffff892bc87e, float:-2.0677647E-33)
            goto L_0x07b5
        L_0x0547:
            r1 = -1373437567(0xffffffffae230181, float:-3.7063245E-11)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.H1q r0 = (X.C54171H1q) r0
            X.C54171H1q.A02(r0)
            r0 = 1068402963(0x3fae8913, float:1.3635582)
            goto L_0x07b5
        L_0x055a:
            r1 = 287224804(0x111eb3e4, float:1.2519435E-28)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.H26 r3 = (X.H26) r3
            X.GiB r1 = r3.A04
            java.util.List r0 = r1.A06
            r0.clear()
            r1.notifyDataSetChanged()
            com.instagram.ui.widget.spinner.SpinnerImageView r1 = r3.A08
            X.3uy r0 = X.C255943uy.LOADING
            r1.setLoadingStatus(r0)
            X.IXC r1 = r3.A05
            r0 = 1
            r1.A02(r0, r0)
            r0 = -488933751(0xffffffffe2db7689, float:-2.0241892E21)
            goto L_0x07b5
        L_0x0581:
            r1 = -1397511843(0xffffffffacb3a95d, float:-5.106289E-12)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.H1x r0 = (X.C54177H1x) r0
            X.Ghb r1 = X.C51968G9o.A0p(r0)
            r0 = 0
            r1.EB9(r0)
            r0 = -1329280721(0xffffffffb0c4c92f, float:-1.4318057E-9)
            goto L_0x07b5
        L_0x0599:
            r1 = -2076156471(0xffffffff84405dc9, float:-2.2612556E-36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.H1x r5 = (X.C54177H1x) r5
            X.0eM r3 = r5.A0D
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            X.0Tu r0 = X.0Tu.A05
            r6 = 36320940694905825(0x8109b4000723e1, double:3.032847375923009E-306)
            boolean r0 = X.182.A06(r0, r2, r6)
            if (r0 == 0) goto L_0x0603
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r12 = r5.getModuleName()
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            r8 = 0
            r19 = 0
            X.0sn r18 = X.0sn.A00
            com.instagram.direct.messagethread.collections.model.DirectCollectionArguments r7 = new com.instagram.direct.messagethread.collections.model.DirectCollectionArguments
            r9 = r8
            r10 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putParcelable(r0, r7)
            r2 = 4
            r0 = 434(0x1b2, float:6.08E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putInt(r0, r2)
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.String r0 = "direct_new_collection"
            X.6W8 r2 = X.Dba.A0K(r2, r6, r4, r3, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
        L_0x05fb:
            r2.A0C(r0)
            r0 = 579094209(0x228446c1, float:3.5853585E-18)
            goto L_0x107c
        L_0x0603:
            X.Hj2 r0 = r5.A0B
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            X.H1x r5 = r0.A00
            X.0eM r3 = r5.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.DbU.A1D(r6, r0)
            X.HMH r2 = X.HMH.ADD_TO_NEW_COLLECTION
            java.lang.String r0 = "SaveFragment.SAVE_HOME_TAB_MODE"
            r6.putSerializable(r0, r2)
            java.lang.String r2 = r5.getModuleName()
            java.lang.String r0 = "prior_module"
            r6.putString(r0, r2)
            X.H3x r0 = r5.A02
            if (r0 != 0) goto L_0x062c
            java.lang.String r8 = "adapter"
            goto L_0x0df3
        L_0x062c:
            int r2 = r0.A01
            java.lang.String r0 = "ARGUMENT_NUM_MEDIA_COLLECTIONS"
            r6.putInt(r0, r2)
            com.instagram.save.model.SavedCollection r2 = new com.instagram.save.model.SavedCollection
            r2.<init>()
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            r6.putParcelable(r0, r2)
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0656
            java.lang.String r4 = "saved_feed"
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.6W8 r2 = X.DbS.A0b(r0, r6, r3, r2, r4)
        L_0x0651:
            android.content.Context r0 = r5.requireContext()
            goto L_0x05fb
        L_0x0656:
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            androidx.fragment.app.FragmentActivity r2 = r5.requireActivity()
            java.lang.String r0 = "create_collection"
            X.6W8 r2 = X.DbS.A0b(r2, r6, r4, r3, r0)
            goto L_0x0651
        L_0x0667:
            r1 = -140244391(0xfffffffff7a40a59, float:-6.65427E33)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r1 = r0.A01
            X.H1v r1 = (X.C54175H1v) r1
            r0 = 1
            X.C54175H1v.A02(r1, r0)
            r0 = 635000418(0x25d95662, float:3.7702035E-16)
            goto L_0x07b5
        L_0x067b:
            r1 = 1727625309(0x66f9785d, float:5.890448E23)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.H1i r3 = (X.C54164H1i) r3
            X.JOU r2 = r3.A02
            if (r2 == 0) goto L_0x068f
            boolean r0 = r3.A05
            r2.Cyj(r0)
        L_0x068f:
            com.instagram.save.model.SavedCollection r5 = r3.A03
            if (r5 == 0) goto L_0x06c3
            X.0eM r0 = r3.A08
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r0)
            X.0wc r2 = X.DbX.A0O(r3, r4)
            java.lang.String r0 = "ig_collections"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r2, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x06c3
            java.lang.String r2 = "public_collections_audience_selector_bottom_sheet"
            java.lang.String r0 = "module_name"
            r3.AAJ(r0, r2)
            java.lang.String r2 = "change_collection_audience"
            java.lang.String r0 = "event"
            java.lang.String r2 = X.C51975G9x.A0g(r3, r5, r0, r2)
            java.lang.String r0 = "collection_type"
            X.C51973G9u.A14(r3, r0, r2)
            X.I35.A02(r3, r4, r5)
            r3.Cgf()
        L_0x06c3:
            r0 = -376552412(0xffffffffe98e4424, float:-2.1498656E25)
            goto L_0x107c
        L_0x06c8:
            r1 = -2126988528(0xffffffff8138bb10, float:-3.3929673E-38)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            X.H10 r4 = (X.H10) r4
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.HMH r1 = X.HMH.SELECT_COVER_PHOTO
            java.lang.String r0 = "SaveFragment.SAVE_HOME_TAB_MODE"
            r3.putSerializable(r0, r1)
            com.instagram.save.model.SavedCollection r1 = r4.A02
            if (r1 == 0) goto L_0x0702
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            r3.putParcelable(r0, r1)
            java.lang.String r1 = "collection_editor"
            java.lang.String r0 = "prior_module"
            r3.putString(r0, r1)
            X.0eM r0 = r4.A0H
            X.0lg r0 = X.DbT.A0X(r0)
            X.6W8 r1 = X.C51975G9x.A0a(r3, r4, r0)
            r0 = 1042(0x412, float:1.46E-42)
            r1.A0D(r4, r0)
            r0 = -1842343733(0xffffffff923010cb, float:-5.5556507E-28)
            goto L_0x07b5
        L_0x0702:
            java.lang.String r8 = "collection"
            goto L_0x0df3
        L_0x0706:
            r1 = 126284321(0x786f221, float:2.030439E-34)
            int r2 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            androidx.fragment.app.Fragment r3 = (androidx.fragment.app.Fragment) r3
            X.8ab r5 = X.DbW.A0U(r3)
            r0 = 2131972543(0x7f1351bf, float:1.9582097E38)
            r5.A09(r0)
            r0 = 2131972542(0x7f1351be, float:1.9582095E38)
            r5.A08(r0)
            android.content.res.Resources r1 = X.DbV.A05(r3)
            r0 = 2131957531(0x7f13171b, float:1.9551649E38)
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r1, r0)
            r0 = 35
            X.I8z r3 = X.C56719I8z.A00(r3, r0)
            X.8ae r1 = X.C358278ae.RED_BOLD
            r0 = 1
            r5.A0Y(r3, r1, r4, r0)
            r5.A05()
            X.AnonymousClass7TH.A0a(r5, r0)
            r0 = -1223931974(0xffffffffb70c47ba, float:-8.36135E-6)
            goto L_0x07b5
        L_0x0742:
            r1 = -908392515(0xffffffffc9db07bd, float:-1794295.6)
            int r2 = X.AnonymousClass0fD.A05(r1)
            X.H1i r5 = new X.H1i
            r5.<init>()
            java.lang.Object r7 = r0.A01
            X.H10 r7 = (X.H10) r7
            X.0eM r0 = r7.A0H
            X.7Pr r1 = X.DbX.A0f(r0)
            android.content.res.Resources r0 = X.DbV.A05(r7)
            X.7Pu r6 = X.C51975G9x.A0Y(r0, r1)
            r0 = 2
            X.IXI r4 = new X.IXI
            r4.<init>(r0, r6, r7)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            boolean r1 = r7.A04
            java.lang.String r0 = "is_public_collection"
            r3.putBoolean(r0, r1)
            com.instagram.save.model.SavedCollection r0 = r7.A02
            java.lang.String r8 = "collection"
            if (r0 == 0) goto L_0x0df3
            java.lang.Boolean r0 = r0.A0C
            if (r0 == 0) goto L_0x0782
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 != 0) goto L_0x0783
        L_0x0782:
            r0 = 0
        L_0x0783:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r1 = r0.booleanValue()
            java.lang.String r0 = "arg_has_private_media"
            r3.putBoolean(r0, r1)
            com.instagram.save.model.SavedCollection r0 = r7.A02
            if (r0 == 0) goto L_0x0df3
            java.lang.String r1 = r0.A0F
            java.lang.String r0 = "audience_selector_collection_id"
            r3.putString(r0, r1)
            com.instagram.save.model.SavedCollection r1 = r7.A02
            if (r1 == 0) goto L_0x0df3
            java.lang.String r0 = "audience_selector_collection"
            r3.putParcelable(r0, r1)
            r5.setArguments(r3)
            r5.A02 = r4
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x07b2
            r6.A02(r0, r5)
        L_0x07b2:
            r0 = -139543326(0xfffffffff7aebce2, float:-7.088208E33)
        L_0x07b5:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x07b9:
            r1 = -1346519469(0xffffffffafbdbe53, float:-3.4514133E-10)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            android.content.Context r3 = X.DbT.A08(r0)
            X.6ap r2 = X.DbS.A0a()
            r0 = 2131970952(0x7f134b88, float:1.957887E38)
            X.DbS.A19(r3, r2, r0)
            r2.A02()
            r0 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r0)
            r2.A04 = r0
            X.DbY.A1N(r2)
            r0 = 2099134531(0x7d1e4043, float:1.314698E37)
            goto L_0x107c
        L_0x07e4:
            r1 = -630614872(0xffffffffda6994a8, float:-1.64367797E16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r13 = r0.A01     // Catch:{ IOException -> 0x08d9 }
            X.H10 r13 = (X.H10) r13     // Catch:{ IOException -> 0x08d9 }
            com.instagram.save.model.SavedCollection r2 = r13.A02     // Catch:{ IOException -> 0x08d9 }
            java.lang.String r12 = "collection"
            r8 = 0
            if (r2 == 0) goto L_0x0801
            java.lang.String r4 = r2.A0G     // Catch:{ IOException -> 0x08d9 }
            X.0qQ.A07(r4)     // Catch:{ IOException -> 0x08d9 }
            android.widget.EditText r2 = r13.A00     // Catch:{ IOException -> 0x08d9 }
            if (r2 != 0) goto L_0x0809
            java.lang.String r12 = "collectionName"
        L_0x0801:
            X.0qQ.A0F(r12)     // Catch:{ IOException -> 0x08d9 }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x08d9 }
            throw r2     // Catch:{ IOException -> 0x08d9 }
        L_0x0809:
            java.lang.String r11 = X.AnonymousClass7TF.A0f(r2)     // Catch:{ IOException -> 0x08d9 }
            int r9 = r11.length()     // Catch:{ IOException -> 0x08d9 }
            r10 = 1
            int r9 = r9 - r10
            r7 = 0
            r6 = 0
            r5 = 0
        L_0x0816:
            if (r6 > r9) goto L_0x0838
            r2 = r9
            if (r5 != 0) goto L_0x081c
            r2 = r6
        L_0x081c:
            char r3 = r11.charAt(r2)     // Catch:{ IOException -> 0x08d9 }
            r2 = 32
            int r2 = X.0qQ.A00(r3, r2)     // Catch:{ IOException -> 0x08d9 }
            boolean r2 = X.Dba.A1U(r2)
            if (r5 != 0) goto L_0x0833
            if (r2 != 0) goto L_0x0830
            r5 = 1
            goto L_0x0816
        L_0x0830:
            int r6 = r6 + 1
            goto L_0x0816
        L_0x0833:
            if (r2 == 0) goto L_0x0838
            int r9 = r9 + -1
            goto L_0x0816
        L_0x0838:
            java.lang.String r6 = X.Dba.A0c(r11, r9, r6)     // Catch:{ IOException -> 0x08d9 }
            com.instagram.save.model.SavedCollection r2 = r13.A02     // Catch:{ IOException -> 0x08d9 }
            if (r2 == 0) goto L_0x0801
            X.1Xj r2 = r2.A04     // Catch:{ IOException -> 0x08d9 }
            java.lang.String r9 = "_"
            if (r2 == 0) goto L_0x087d
            java.lang.String r3 = r2.getId()     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x087d
            java.lang.String[] r2 = new java.lang.String[]{r9}     // Catch:{ IOException -> 0x08d9 }
            java.util.List r3 = X.00l.A0R(r3, r2, r7)     // Catch:{ IOException -> 0x08d9 }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ IOException -> 0x08d9 }
            java.lang.Object[] r3 = r3.toArray(r2)     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x087d
            int r2 = r3.length     // Catch:{ IOException -> 0x08d9 }
            if (r7 >= r2) goto L_0x087b
            r5 = r3[r7]     // Catch:{ IOException -> 0x08d9 }
        L_0x0861:
            java.lang.String r3 = r13.A03     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x087f
            java.lang.String[] r2 = new java.lang.String[]{r9}     // Catch:{ IOException -> 0x08d9 }
            java.util.List r3 = X.00l.A0R(r3, r2, r7)     // Catch:{ IOException -> 0x08d9 }
            java.lang.String[] r2 = new java.lang.String[r7]     // Catch:{ IOException -> 0x08d9 }
            java.lang.Object[] r3 = r3.toArray(r2)     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x087f
            int r2 = r3.length     // Catch:{ IOException -> 0x08d9 }
            if (r7 >= r2) goto L_0x087f
            r8 = r3[r7]     // Catch:{ IOException -> 0x08d9 }
            goto L_0x087f
        L_0x087b:
            r5 = 0
            goto L_0x0861
        L_0x087d:
            r5 = r8
            goto L_0x0861
        L_0x087f:
            if (r5 != 0) goto L_0x0883
            if (r8 == 0) goto L_0x088a
        L_0x0883:
            boolean r2 = X.0qQ.A0K(r8, r5)     // Catch:{ IOException -> 0x08d9 }
            if (r2 != 0) goto L_0x088a
            r10 = 0
        L_0x088a:
            boolean r2 = r13.A04     // Catch:{ IOException -> 0x08d9 }
            if (r2 == 0) goto L_0x08a1
            boolean r2 = r13.A07     // Catch:{ IOException -> 0x08d9 }
            if (r2 == 0) goto L_0x08a1
            com.instagram.save.model.SavedCollection r3 = r13.A02     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x0801
            com.instagram.api.schemas.CollectionPrivacyModeEnum r2 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ IOException -> 0x08d9 }
            r3.A00 = r2     // Catch:{ IOException -> 0x08d9 }
        L_0x089a:
            boolean r2 = X.0qQ.A0K(r6, r4)     // Catch:{ IOException -> 0x08d9 }
            if (r2 == 0) goto L_0x08b4
            goto L_0x08aa
        L_0x08a1:
            com.instagram.save.model.SavedCollection r3 = r13.A02     // Catch:{ IOException -> 0x08d9 }
            if (r3 == 0) goto L_0x0801
            com.instagram.api.schemas.CollectionPrivacyModeEnum r2 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PRIVATE     // Catch:{ IOException -> 0x08d9 }
            r3.A00 = r2     // Catch:{ IOException -> 0x08d9 }
            goto L_0x089a
        L_0x08aa:
            if (r10 == 0) goto L_0x08b4
            boolean r2 = r13.A05     // Catch:{ IOException -> 0x08d9 }
            if (r2 != 0) goto L_0x08b4
            X.DbT.A1J(r13)     // Catch:{ IOException -> 0x08d9 }
            goto L_0x08e0
        L_0x08b4:
            X.0eM r2 = r13.A0H     // Catch:{ IOException -> 0x08d9 }
            X.1Ng r5 = X.DbX.A0R(r2)     // Catch:{ IOException -> 0x08d9 }
            com.instagram.common.session.UserSession r15 = X.AnonymousClass7TE.A0l(r2)     // Catch:{ IOException -> 0x08d9 }
            com.instagram.save.model.SavedCollection r2 = r13.A02     // Catch:{ IOException -> 0x08d9 }
            if (r2 == 0) goto L_0x0801
            java.lang.String r4 = r2.A0F     // Catch:{ IOException -> 0x08d9 }
            java.lang.String r3 = r13.A03     // Catch:{ IOException -> 0x08d9 }
            com.instagram.api.schemas.CollectionPrivacyModeEnum r12 = r2.A00     // Catch:{ IOException -> 0x08d9 }
            r2 = 16
            X.H51 r14 = new X.H51     // Catch:{ IOException -> 0x08d9 }
            r14.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r13)     // Catch:{ IOException -> 0x08d9 }
            r17 = r6
            r18 = r3
            r16 = r4
            X.C56641I5w.A02(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x08d9 }
            goto L_0x08e0
        L_0x08d9:
            java.lang.Object r0 = r0.A01
            X.H10 r0 = (X.H10) r0
            X.H10.A02(r0)
        L_0x08e0:
            r0 = 864804578(0x338bdee2, float:6.513234E-8)
            goto L_0x107c
        L_0x08e5:
            r1 = 1681143951(0x6434388f, float:1.3297958E22)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A01
            X.H25 r7 = (X.H25) r7
            X.DbS.A1D(r7)
            X.H1i r6 = new X.H1i
            r6.<init>()
            com.instagram.common.session.UserSession r0 = r7.A02
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.res.Resources r0 = X.DbV.A05(r7)
            X.7Pu r5 = X.C51975G9x.A0Y(r0, r2)
            r0 = 1
            X.IXI r4 = new X.IXI
            r4.<init>(r0, r7, r5)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            boolean r2 = r7.A07
            java.lang.String r0 = "is_public_collection"
            r3.putBoolean(r0, r2)
            r6.setArguments(r3)
            r6.A02 = r4
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0925
            r5.A02(r0, r6)
        L_0x0925:
            r0 = -1216787286(0xffffffffb7794caa, float:-1.4859406E-5)
            goto L_0x107c
        L_0x092a:
            r1 = 231678916(0xdcf23c4, float:1.276597E-30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01     // Catch:{ IOException -> 0x0982 }
            X.H25 r4 = (X.H25) r4     // Catch:{ IOException -> 0x0982 }
            r2 = 1
            X.C51975G9x.A17(r4, r2)     // Catch:{ IOException -> 0x0982 }
            android.widget.EditText r3 = r4.A01     // Catch:{ IOException -> 0x0982 }
            r2 = 0
            r3.setEnabled(r2)     // Catch:{ IOException -> 0x0982 }
            com.instagram.common.session.UserSession r2 = r4.getSession()     // Catch:{ IOException -> 0x0982 }
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r2)     // Catch:{ IOException -> 0x0982 }
            boolean r2 = r4.A07     // Catch:{ IOException -> 0x0982 }
            if (r2 == 0) goto L_0x0971
            boolean r2 = r4.A08     // Catch:{ IOException -> 0x0982 }
            if (r2 == 0) goto L_0x0971
            com.instagram.api.schemas.CollectionPrivacyModeEnum r5 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ IOException -> 0x0982 }
        L_0x0951:
            com.instagram.common.session.UserSession r7 = r4.getSession()     // Catch:{ IOException -> 0x0982 }
            android.widget.EditText r2 = r4.A01     // Catch:{ IOException -> 0x0982 }
            java.lang.String r2 = X.AnonymousClass7TF.A0f(r2)     // Catch:{ IOException -> 0x0982 }
            java.lang.String r8 = r2.trim()     // Catch:{ IOException -> 0x0982 }
            java.lang.String r9 = "collection_create"
            java.util.ArrayList r11 = r4.A06     // Catch:{ IOException -> 0x0982 }
            java.lang.String r10 = r4.A05     // Catch:{ IOException -> 0x0982 }
            r2 = 14
            X.H51 r6 = new X.H51     // Catch:{ IOException -> 0x0982 }
            r6.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r3)     // Catch:{ IOException -> 0x0982 }
            X.HMU r3 = r4.A04     // Catch:{ IOException -> 0x0982 }
            X.HMU r2 = X.HMU.A04     // Catch:{ IOException -> 0x0982 }
            goto L_0x097a
        L_0x0971:
            boolean r2 = r4.A08     // Catch:{ IOException -> 0x0982 }
            if (r2 == 0) goto L_0x0978
            com.instagram.api.schemas.CollectionPrivacyModeEnum r5 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PRIVATE     // Catch:{ IOException -> 0x0982 }
            goto L_0x0951
        L_0x0978:
            r5 = 0
            goto L_0x0951
        L_0x097a:
            boolean r12 = X.AnonymousClass7TF.A1W(r3, r2)
            X.C56641I5w.A03(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch:{ IOException -> 0x0982 }
            goto L_0x0999
        L_0x0982:
            java.lang.Object r3 = r0.A01
            X.H25 r3 = (X.H25) r3
            r0 = 0
            X.C51975G9x.A17(r3, r0)
            android.widget.EditText r2 = r3.A01
            r0 = 1
            r2.setEnabled(r0)
            android.content.Context r2 = r3.getContext()
            java.lang.String r0 = "create_collection_failed"
            X.C59689JTv.A0C(r2, r0)
        L_0x0999:
            r0 = -1801787210(0xffffffff949ae8b6, float:-1.5641814E-26)
            goto L_0x107c
        L_0x099e:
            r1 = -650727286(0xffffffffd936b08a, float:-3.21390953E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.Object r3 = r0.A01
            X.H25 r3 = (X.H25) r3
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.DbU.A1D(r4, r0)
            X.HMH r2 = X.HMH.SELECT_COVER_PHOTO
            java.lang.String r0 = "SaveFragment.SAVE_HOME_TAB_MODE"
            r4.putSerializable(r0, r2)
            com.instagram.save.model.SavedCollection r2 = new com.instagram.save.model.SavedCollection
            r2.<init>()
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_FEED_COLLECTION"
            r4.putParcelable(r0, r2)
            java.util.ArrayList r2 = r3.A06
            java.lang.String r0 = "SaveFragment.ARGUMENT_SAVED_ITEM_IDS"
            r4.putStringArrayList(r0, r2)
            com.instagram.common.session.UserSession r0 = r3.getSession()
            X.6W8 r2 = X.C51975G9x.A0a(r4, r3, r0)
            r0 = 1042(0x412, float:1.46E-42)
            r2.A0D(r3, r0)
            r0 = 917627781(0x36b1e385, float:5.301498E-6)
            goto L_0x107c
        L_0x09de:
            r1 = -312880098(0xffffffffed59d41e, float:-4.2134176E27)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A01
            X.H24 r7 = (X.H24) r7
            X.DbS.A1D(r7)
            X.H1i r6 = new X.H1i
            r6.<init>()
            com.instagram.common.session.UserSession r0 = r7.A04
            if (r0 == 0) goto L_0x0a29
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.res.Resources r0 = X.DbV.A05(r7)
            X.7Pu r5 = X.C51975G9x.A0Y(r0, r2)
            r0 = 0
            X.IXI r4 = new X.IXI
            r4.<init>(r0, r5, r7)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            boolean r2 = r7.A06
            java.lang.String r0 = "is_public_collection"
            r3.putBoolean(r0, r2)
            r6.setArguments(r3)
            r6.A02 = r4
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()
            if (r0 == 0) goto L_0x0a24
            androidx.fragment.app.FragmentActivity r0 = r7.requireActivity()
            r5.A02(r0, r6)
        L_0x0a24:
            r0 = 1216709553(0x488583b1, float:273437.53)
            goto L_0x107c
        L_0x0a29:
            java.lang.String r8 = "userSession"
            goto L_0x0df3
        L_0x0a2d:
            r1 = -836597572(0xffffffffce2288bc, float:-6.817175E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r6 = r0.A01     // Catch:{ IOException -> 0x0ac7 }
            X.H24 r6 = (X.H24) r6     // Catch:{ IOException -> 0x0ac7 }
            X.2dY r3 = X.2dZ.A0t     // Catch:{ IOException -> 0x0ac7 }
            androidx.fragment.app.FragmentActivity r2 = r6.getActivity()     // Catch:{ IOException -> 0x0ac7 }
            X.2dZ r2 = r3.A03(r2)     // Catch:{ IOException -> 0x0ac7 }
            r7 = 1
            r2.setIsLoading(r7)     // Catch:{ IOException -> 0x0ac7 }
            android.widget.EditText r2 = r6.A03     // Catch:{ IOException -> 0x0ac7 }
            r5 = 0
            if (r2 == 0) goto L_0x0a4e
            r2.setEnabled(r5)     // Catch:{ IOException -> 0x0ac7 }
        L_0x0a4e:
            com.instagram.common.session.UserSession r2 = r6.A04     // Catch:{ IOException -> 0x0ac7 }
            r3 = 0
            if (r2 != 0) goto L_0x0a5b
            X.DbS.A17()     // Catch:{ IOException -> 0x0ac7 }
            X.00P r2 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IOException -> 0x0ac7 }
            throw r2     // Catch:{ IOException -> 0x0ac7 }
        L_0x0a5b:
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r2)     // Catch:{ IOException -> 0x0ac7 }
            boolean r2 = r6.A06     // Catch:{ IOException -> 0x0ac7 }
            if (r2 == 0) goto L_0x0a81
            boolean r2 = r6.A07     // Catch:{ IOException -> 0x0ac7 }
            if (r2 == 0) goto L_0x0a81
            com.instagram.api.schemas.CollectionPrivacyModeEnum r11 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PUBLIC     // Catch:{ IOException -> 0x0ac7 }
        L_0x0a69:
            com.instagram.common.session.UserSession r13 = r6.getSession()     // Catch:{ IOException -> 0x0ac7 }
            android.widget.EditText r2 = r6.A03     // Catch:{ IOException -> 0x0ac7 }
            if (r2 == 0) goto L_0x0a75
            android.text.Editable r3 = r2.getText()     // Catch:{ IOException -> 0x0ac7 }
        L_0x0a75:
            java.lang.String r10 = java.lang.String.valueOf(r3)     // Catch:{ IOException -> 0x0ac7 }
            int r9 = r10.length()     // Catch:{ IOException -> 0x0ac7 }
            int r9 = r9 - r7
            r8 = 0
            r7 = 0
            goto L_0x0a8a
        L_0x0a81:
            boolean r2 = r6.A07     // Catch:{ IOException -> 0x0ac7 }
            if (r2 == 0) goto L_0x0a88
            com.instagram.api.schemas.CollectionPrivacyModeEnum r11 = com.instagram.api.schemas.CollectionPrivacyModeEnum.PRIVATE     // Catch:{ IOException -> 0x0ac7 }
            goto L_0x0a69
        L_0x0a88:
            r11 = r3
            goto L_0x0a69
        L_0x0a8a:
            if (r8 > r9) goto L_0x0aac
            r2 = r9
            if (r7 != 0) goto L_0x0a90
            r2 = r8
        L_0x0a90:
            char r3 = r10.charAt(r2)     // Catch:{ IOException -> 0x0ac7 }
            r2 = 32
            int r2 = X.0qQ.A00(r3, r2)     // Catch:{ IOException -> 0x0ac7 }
            boolean r2 = X.Dba.A1U(r2)
            if (r7 != 0) goto L_0x0aa7
            if (r2 != 0) goto L_0x0aa4
            r7 = 1
            goto L_0x0a8a
        L_0x0aa4:
            int r8 = r8 + 1
            goto L_0x0a8a
        L_0x0aa7:
            if (r2 == 0) goto L_0x0aac
            int r9 = r9 + -1
            goto L_0x0a8a
        L_0x0aac:
            java.lang.String r14 = X.Dba.A0c(r10, r9, r8)     // Catch:{ IOException -> 0x0ac7 }
            if (r14 != 0) goto L_0x0ab4
            java.lang.String r14 = ""
        L_0x0ab4:
            java.lang.String r15 = "collection_create"
            r16 = 0
            r2 = 13
            X.H51 r12 = new X.H51     // Catch:{ IOException -> 0x0ac7 }
            r12.<init>((int) r2, (java.lang.Object) r4, (java.lang.Object) r6)     // Catch:{ IOException -> 0x0ac7 }
            r17 = r16
            r18 = r5
            X.C56641I5w.A03(r11, r12, r13, r14, r15, r16, r17, r18)     // Catch:{ IOException -> 0x0ac7 }
            goto L_0x0ace
        L_0x0ac7:
            java.lang.Object r0 = r0.A01
            X.H24 r0 = (X.H24) r0
            X.H24.A00(r0)
        L_0x0ace:
            r0 = 498123991(0x1db0c4d7, float:4.679034E-21)
            goto L_0x107c
        L_0x0ad3:
            r1 = 734681557(0x2bca59d5, float:1.4377897E-12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 1026364566(0x3d2d1496, float:0.04225596)
            goto L_0x107c
        L_0x0ae4:
            r1 = -1948860754(0xffffffff8bd6beae, float:-8.2716705E-32)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 278607452(0x109b365c, float:6.1220474E-29)
            goto L_0x107c
        L_0x0af5:
            r1 = -1066454430(0xffffffffc06f3262, float:-3.7374501)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 1552375864(0x5c876038, float:3.04839324E17)
            goto L_0x107c
        L_0x0b06:
            r1 = -888941971(0xffffffffcb03d26d, float:-8639085.0)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = -484989564(0xffffffffe317a584, float:-2.797385E21)
            goto L_0x107c
        L_0x0b17:
            r1 = -736419987(0xffffffffd41b1f6d, float:-2.66498867E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 1617407318(0x6067ad56, float:6.6776376E19)
            goto L_0x107c
        L_0x0b28:
            r1 = 1536436192(0x5b9427e0, float:8.3404279E16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.LOZ r0 = (X.LOZ) r0
            r0.A01()
            r0 = -1650606384(0xffffffff9d9dbed0, float:-4.175485E-21)
            goto L_0x107c
        L_0x0b3b:
            r1 = -72585666(0xfffffffffbac6e3e, float:-1.790622E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r7 = r0.A01
            X.H1L r7 = (X.H1L) r7
            X.0eM r6 = r7.A0B
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            java.lang.String r2 = r7.A02
            java.lang.String r0 = r7.A03
            r8 = 0
            r11 = 0
            X.0qQ.A0B(r3, r11)
            if (r0 == 0) goto L_0x0bae
            X.1Xl r5 = X.C324666zh.A00(r3, r2, r0)
            if (r5 == 0) goto L_0x0bae
            android.content.Context r2 = r7.getContext()
            java.lang.String r0 = "null cannot be cast to non-null type android.app.Activity"
            X.0qQ.A0C(r2, r0)
            android.app.Activity r2 = (android.app.Activity) r2
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r6)
            X.GJd r18 = X.C52212GJd.A0A
            X.IZE r0 = new X.IZE
            r0.<init>(r11)
            X.GCd r4 = new X.GCd
            r16 = r8
            r17 = r0
            r19 = r8
            r12 = r4
            r13 = r2
            r15 = r7
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r6)
            X.1Xj r2 = r5.BPf()
            X.4jb r0 = new X.4jb
            r0.<init>(r3, r2)
            r12 = 1
            X.HpF r7 = new X.HpF
            r9 = r8
            r10 = r8
            r13 = r12
            r14 = r11
            r15 = r11
            r16 = r12
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.A0L(r0, r5, r7)
        L_0x0bae:
            r0 = 518635646(0x1ee9c07e, float:2.4749447E-20)
            goto L_0x107c
        L_0x0bb3:
            r1 = -744226843(0xffffffffd3a3ffe5, float:-1.40874573E12)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.H1L r2 = (X.H1L) r2
            X.0eM r0 = r2.A0B
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            X.6rY r4 = X.C319986rY.SELF
            java.lang.String r6 = X.DbU.A0u(r0)
            java.lang.String r7 = r2.A03
            java.lang.String r8 = r2.A04
            java.lang.String r5 = "tap_sponsored_label"
            java.lang.String r9 = "ads_products_tab_sponsored_label"
            X.C319976rX.A08(r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = 37726469(0x23fa905, float:1.408097E-37)
            goto L_0x107c
        L_0x0bda:
            r1 = -54325075(0xfffffffffcc310ad, float:-8.102689E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.6wc r2 = (X.C322916wc) r2
            r0 = 0
            X.C322916wc.A03(r2, r0)
            androidx.fragment.app.FragmentActivity r2 = r2.A02
            if (r2 == 0) goto L_0x0bf2
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r2, r0)
        L_0x0bf2:
            r0 = 767643548(0x2dc14f9c, float:2.1976913E-11)
            goto L_0x107c
        L_0x0bf7:
            r1 = 1880881132(0x701bf7ec, float:1.9307958E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.6wc r2 = (X.C322916wc) r2
            r0 = 1
            X.C322916wc.A03(r2, r0)
            androidx.fragment.app.FragmentActivity r4 = r2.A02
            if (r4 == 0) goto L_0x0c24
            com.instagram.common.session.UserSession r0 = r2.A03
            X.6Yo r3 = X.DbS.A0M(r4, r0)
            X.C46447Df9.A03()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment r0 = new com.instagram.profile.edithighlightsmigration.HighlightsMigrationFragment
            r0.<init>()
            X.DbW.A0x(r2, r0, r3)
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r4, r0)
        L_0x0c24:
            r0 = -31719496(0xfffffffffe1bffb8, float:-5.1839527E37)
            goto L_0x107c
        L_0x0c29:
            r1 = 1538285964(0x5bb0618c, float:9.92937E16)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.6wc r2 = (X.C322916wc) r2
            r0 = 1
            X.C322916wc.A03(r2, r0)
            androidx.fragment.app.FragmentActivity r2 = r2.A02
            if (r2 == 0) goto L_0x0c41
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r2, r0)
        L_0x0c41:
            r0 = 965069878(0x3985cc36, float:2.5519886E-4)
            goto L_0x107c
        L_0x0c46:
            r1 = -1922363453(0xffffffff8d6b0fc3, float:-7.243394E-31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = -771432547(0xffffffffd204df9d, float:-1.42671823E11)
            goto L_0x107c
        L_0x0c57:
            r1 = -241142674(0xfffffffff1a0746e, float:-1.5890674E30)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.W1A r3 = (X.W1A) r3
            java.lang.String r0 = "learn_more_button"
            X.W1A.A01(r3, r0)
            com.instagram.common.session.UserSession r5 = r3.A01
            X.2cc r2 = X.C71342cb.A00(r5)
            android.app.Activity r4 = r3.A00
            r0 = 2555(0x9fb, float:3.58E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0A(r4, r0)
            X.FEe r3 = com.instagram.simplewebview.SimpleWebViewActivity.A02
            r0 = 3250(0xcb2, float:4.554E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.SFz r2 = new X.SFz
            r2.<init>((java.lang.String) r0)
            r0 = 2131951987(0x7f130173, float:1.9540404E38)
            java.lang.String r0 = r4.getString(r0)
            X.C49906FEe.A01(r4, r5, r3, r2, r0)
            r0 = 310335778(0x127f5922, float:8.0573677E-28)
            goto L_0x107c
        L_0x0c94:
            r1 = 1463768098(0x573f5422, float:2.10368069E14)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.H1C r0 = (X.H1C) r0
            X.0eM r0 = r0.A0D
            X.2YL r5 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 8
            X.MFT r0 = new X.MFT
            r0.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = -1018498436(0xffffffffc34af27c, float:-202.9472)
            goto L_0x107c
        L_0x0cb9:
            r1 = 1493648475(0x5907445b, float:2.37964247E15)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.H1C r0 = (X.H1C) r0
            X.0eM r0 = r0.A0D
            X.2YL r5 = X.DbS.A0H(r0)
            X.6oS r4 = X.C318116oQ.A00(r5)
            r3 = 0
            r2 = 9
            X.MFT r0 = new X.MFT
            r0.<init>(r5, r3, r2)
            X.AnonymousClass7TE.A1Z(r0, r4)
            r0 = -812306613(0xffffffffcf952f4b, float:-5.0058092E9)
            goto L_0x107c
        L_0x0cde:
            r1 = -1801452328(0xffffffff94a004d8, float:-1.6157782E-26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r10 = r0.A01
            X.H1C r10 = (X.H1C) r10
            X.0eM r6 = r10.A0E
            X.0lg r2 = X.DbT.A0X(r6)
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r10.A06
            java.lang.String r8 = "promptStickerModel"
            if (r0 == 0) goto L_0x0df3
            X.1Xj r7 = r10.A03
            X.3kK r0 = r10.A07
            if (r0 != 0) goto L_0x0cff
            java.lang.String r8 = "sessionIdProvider"
            goto L_0x0df3
        L_0x0cff:
            java.lang.String r3 = r0.getSessionId()
            r5 = 0
            X.AnonymousClass7TF.A1D(r2, r5, r3)
            X.0Aj r4 = X.C51972G9s.A0M(r10, r2)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0d51
            java.lang.String r2 = "add_yours_topic_report_tap"
            java.lang.String r0 = "organic_tap_action"
            r4.AAJ(r0, r2)
            java.lang.String r2 = "add_yours_pivot_page"
            java.lang.String r0 = "organic_tap_action_source"
            r4.AAJ(r0, r2)
            java.lang.String r0 = "clips_prompt_pivot_page"
            X.C51965G9l.A1M(r4, r0)
            X.C51969G9p.A16(r4, r5)
            X.C51965G9l.A1O(r4, r3)
            if (r7 == 0) goto L_0x0d96
            java.lang.String r0 = r7.A2n()
            if (r0 == 0) goto L_0x0d96
            java.lang.Long r0 = X.AnonymousClass7TE.A10(r0)
            if (r0 == 0) goto L_0x0d96
            long r2 = r0.longValue()
        L_0x0d3c:
            X.C51970G9q.A18(r4, r2)
            if (r7 == 0) goto L_0x0d94
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r7)
            if (r0 == 0) goto L_0x0d94
            java.lang.Long r0 = X.C51972G9s.A0h(r0)
        L_0x0d4b:
            X.C51965G9l.A1H(r4, r0)
            r4.Cgf()
        L_0x0d51:
            X.0lg r4 = X.DbT.A0X(r6)
            X.0Tu r0 = X.0Tu.A05
            r2 = 36314837546306366(0x81042700060b3e, double:3.028987720173304E-306)
            boolean r2 = X.182.A06(r0, r4, r2)
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r6)
            androidx.fragment.app.FragmentActivity r9 = r10.requireActivity()
            if (r2 == 0) goto L_0x0d8d
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r10.A06
            if (r0 == 0) goto L_0x0df3
            java.lang.String r14 = r0.A03
        L_0x0d70:
            X.TpH r12 = X.C14068TpH.CLIPS_PROMPT_PAGE
            if (r2 == 0) goto L_0x0d8a
            X.UzD r13 = X.C16677UzD.PROMPT
        L_0x0d76:
            X.OcF r2 = X.ORV.A01(r9, r10, r11, r12, r13, r14)
            X.Uz2 r0 = X.C16666Uz2.REPORT_BUTTON
            X.0qQ.A0B(r0, r5)
            r2.A02 = r0
            r0 = 0
            X.C71093OcF.A00(r0, r2)
            r0 = 780879947(0x2e8b484b, float:6.33383E-11)
            goto L_0x107c
        L_0x0d8a:
            X.UzD r13 = X.C16677UzD.MEDIA
            goto L_0x0d76
        L_0x0d8d:
            java.lang.String r14 = r10.A08
            if (r14 != 0) goto L_0x0d70
            java.lang.String r14 = ""
            goto L_0x0d70
        L_0x0d94:
            r0 = 0
            goto L_0x0d4b
        L_0x0d96:
            r2 = 0
            goto L_0x0d3c
        L_0x0d99:
            r1 = 1261469808(0x4b308070, float:1.1567216E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.H1C r5 = (X.H1C) r5
            android.content.Context r2 = r5.requireContext()
            X.0eM r0 = r5.A0E
            X.Dg1 r4 = X.C46498Dg1.A00(r2, r0)
            r2 = 2131970861(0x7f134b2d, float:1.9578685E38)
            r0 = 15
            X.ICz r0 = A00(r5, r0)
            r4.A04(r0, r2)
            X.0eM r7 = r5.A0D
            java.lang.Object r0 = r7.getValue()
            X.Ggy r0 = (X.C53007Ggy) r0
            X.0Ud r0 = r0.A09
            java.lang.Object r3 = r0.getValue()
            com.instagram.api.schemas.MediaPromptPrefType r6 = com.instagram.api.schemas.MediaPromptPrefType.NOT_APPLICABLE
            if (r3 == r6) goto L_0x0ddf
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            r2 = 2131970866(0x7f134b32, float:1.9578695E38)
            if (r3 != r0) goto L_0x0dd6
            r2 = 2131970864(0x7f134b30, float:1.9578691E38)
        L_0x0dd6:
            r0 = 16
            X.ICz r0 = A00(r5, r0)
            r4.A04(r0, r2)
        L_0x0ddf:
            java.lang.Object r0 = r7.getValue()
            X.Ggy r0 = (X.C53007Ggy) r0
            X.0Ud r0 = r0.A08
            java.lang.Object r3 = r0.getValue()
            if (r3 == r6) goto L_0x0e12
            com.instagram.reels.prompt.model.PromptStickerModel r0 = r5.A06
            if (r0 != 0) goto L_0x0dfb
            java.lang.String r8 = "promptStickerModel"
        L_0x0df3:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0dfb:
            boolean r0 = r0.A0E
            if (r0 == 0) goto L_0x0e12
            com.instagram.api.schemas.MediaPromptPrefType r0 = com.instagram.api.schemas.MediaPromptPrefType.ON
            r2 = 2131970862(0x7f134b2e, float:1.9578687E38)
            if (r3 != r0) goto L_0x0e09
            r2 = 2131970859(0x7f134b2b, float:1.957868E38)
        L_0x0e09:
            r0 = 17
            X.ICz r0 = A00(r5, r0)
            r4.A04(r0, r2)
        L_0x0e12:
            X.C49945FFy.A00(r5, r4)
            r0 = -493535778(0xffffffffe2953dde, float:-1.3765114E21)
            goto L_0x107c
        L_0x0e1a:
            r1 = 1882353467(0x70326f3b, float:2.208912E29)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.Dba.A1Q(r0)
            r0 = 1382536405(0x5267d4d5, float:2.48927044E11)
            goto L_0x107c
        L_0x0e2b:
            r1 = -352150372(0xffffffffeb029c9c, float:-1.5789992E26)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r4 = r0.A01
            androidx.fragment.app.Fragment r4 = (androidx.fragment.app.Fragment) r4
            X.8ab r3 = X.Dba.A0H(r4)
            r0 = 2131964017(0x7f133071, float:1.9564804E38)
            r3.A09(r0)
            r0 = 2131964015(0x7f13306f, float:1.95648E38)
            r3.A08(r0)
            r2 = 24
            X.LV2 r0 = new X.LV2
            r0.<init>(r4, r2)
            r3.A0F(r0)
            X.I8n r0 = X.C56707I8n.A00
            X.DbX.A16(r0, r3)
            r0 = -393181411(0xffffffffe890871d, float:-5.4601054E24)
            goto L_0x107c
        L_0x0e5a:
            r1 = 1956277308(0x749a6c3c, float:9.787707E31)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.9IZ r0 = (X.AnonymousClass9IZ) r0
            java.lang.Object r0 = r0.A00
            X.9IV r0 = (X.AnonymousClass9IV) r0
            java.lang.Object r0 = r0.A01
            X.DbS.A1U(r0)
            r0 = 667700898(0x27cc4ea2, float:5.670663E-15)
            goto L_0x107c
        L_0x0e73:
            r1 = 2080446364(0x7c01179c, float:2.6811406E36)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.3ZP r0 = (X.AnonymousClass3ZP) r0
            X.3Wa r0 = r0.A01
            r0.D2r()
            r0 = -673156169(0xffffffffd7e073b7, float:-4.93575192E14)
            goto L_0x107c
        L_0x0e88:
            r1 = -2037819285(0xffffffff8689586b, float:-5.166359E-35)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.JM7 r0 = (X.JM7) r0
            X.GqE r0 = (X.C53543GqE) r0
            X.JwJ r0 = r0.A01
            java.lang.Object r0 = r0.A00
            X.DbS.A1U(r0)
            r0 = -1848197349(0xffffffff91d6bf1b, float:-3.3881025E-28)
            goto L_0x107c
        L_0x0ea1:
            r1 = -851215400(0xffffffffcd437bd8, float:-2.04979584E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.GMC r2 = (X.GMC) r2
            int r0 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            X.1Xj r3 = r2.A00
            com.instagram.model.direct.DirectShareTarget r7 = r2.A02
            r8 = 0
            if (r7 != 0) goto L_0x0ef5
            X.2Ep r5 = r2.A0A
            if (r5 == 0) goto L_0x0f5c
            java.util.List r0 = r5.BRZ()
            java.util.ArrayList r4 = X.AnonymousClass48M.A01(r0)
            java.lang.String r0 = r5.C6C()
            X.3t1 r13 = X.C66662MaV.A00(r0, r4)
            java.lang.String r20 = r5.C6f()
            boolean r26 = r5.CQ2()
            X.2EN r12 = r5.C3d()
            r27 = 0
            com.instagram.model.direct.DirectShareTarget r7 = new com.instagram.model.direct.DirectShareTarget
            r9 = r8
            r10 = r8
            r11 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r17 = r8
            r18 = r8
            r19 = r8
            r21 = r8
            r22 = r8
            r23 = r8
            r24 = r8
            r25 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
        L_0x0ef3:
            r2.A02 = r7
        L_0x0ef5:
            if (r7 == 0) goto L_0x0f21
            if (r3 == 0) goto L_0x0f21
            X.OZA r4 = X.OZA.A00
            com.instagram.common.session.UserSession r0 = r2.A09
            boolean r6 = r4.A01(r0, r7)
            boolean r0 = r3.A5G()
            if (r0 == 0) goto L_0x0f26
            X.Mew r0 = r2.A0B
            X.7Z7 r9 = r0.A00(r7)
            X.0iw r0 = r2.A08
            java.lang.String r15 = r0.getModuleName()
            java.lang.String r16 = "floating_send_button"
            r10 = r8
            r11 = r8
            r13 = r7
            r14 = r8
            r17 = r8
            r18 = r6
            r12 = r3
            r9.ELV(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x0f21:
            r0 = 814462463(0x308bb5ff, float:1.0165307E-9)
            goto L_0x107c
        L_0x0f26:
            X.2rR r0 = r2.A0C
            if (r0 == 0) goto L_0x0f3a
            X.3W1 r0 = r0.BQr(r3)
            int r0 = r0.A03
            X.1Xj r0 = r3.A1c(r0)
            if (r0 == 0) goto L_0x0f3a
            java.lang.String r8 = r0.getId()
        L_0x0f3a:
            X.Mew r0 = r2.A0B
            X.7Z7 r9 = r0.A00(r7)
            r10 = 0
            X.0iw r0 = r2.A08
            java.lang.String r5 = r0.getModuleName()
            r4 = 0
            java.lang.String r2 = ""
            X.9cP r0 = new X.9cP
            r0.<init>(r5, r2, r6, r4)
            r11 = r10
            r12 = r0
            r13 = r3
            r14 = r7
            r15 = r10
            r16 = r10
            r17 = r8
            r9.EM1(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0f21
        L_0x0f5c:
            r7 = r8
            goto L_0x0ef3
        L_0x0f5e:
            r1 = -706302531(0xffffffffd5e6adbd, float:-3.17042343E13)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.Gsh r0 = (X.C53690Gsh) r0
            com.instagram.common.session.UserSession r3 = r0.A01
            androidx.fragment.app.FragmentActivity r2 = r0.A00
            java.lang.String r0 = "tifu"
            X.C49965FGy.A02(r2, r3, r0)
            r0 = -1474965788(0xffffffffa815cee4, float:-8.316024E-15)
            goto L_0x107c
        L_0x0f77:
            r1 = -1609750667(0xffffffffa00d2775, float:-1.195622E-19)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.H09 r2 = (X.H09) r2
            r0 = 4204(0x106c, float:5.891E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A05(r0)
            r2.A00()
            r0 = -1416615965(0xffffffffab9027e3, float:-1.0242886E-12)
            goto L_0x107c
        L_0x0f93:
            r1 = -574505341(0xffffffffddc1be83, float:-1.74509249E18)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.H09 r2 = (X.H09) r2
            r0 = 3167(0xc5f, float:4.438E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.A05(r0)
            r2.A00()
            r0 = -649285741(0xffffffffd94caf93, float:-3.60087132E15)
            goto L_0x107c
        L_0x0faf:
            r1 = 1635118662(0x6175ee46, float:2.8353886E20)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r2 = r0.A01
            X.H09 r2 = (X.H09) r2
            java.lang.String r0 = "profile_media"
            r2.A05(r0)
            r2.A00()
            r0 = 739969366(0x2c1b0956, float:2.2032007E-12)
            goto L_0x107c
        L_0x0fc7:
            r1 = 1295822367(0x4d3cae1f, float:1.97845488E8)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r3 = r0.A01
            X.H1w r3 = (X.C54176H1w) r3
            androidx.fragment.app.FragmentActivity r2 = r3.getActivity()
            if (r2 == 0) goto L_0x1002
            X.0eM r0 = r3.A0D
            java.lang.Object r6 = r0.getValue()
            X.LRh r5 = r3.A00
            X.8ab r4 = X.DbS.A0X(r2)
            r0 = 2131968977(0x7f1343d1, float:1.9574864E38)
            r4.A09(r0)
            r0 = 2131968976(0x7f1343d0, float:1.9574862E38)
            r4.A08(r0)
            r3 = 2131971974(0x7f134f86, float:1.9580942E38)
            r2 = 6
            X.I8y r0 = new X.I8y
            r0.<init>((int) r2, (java.lang.Object) r5, (java.lang.Object) r6)
            r4.A0I(r0, r3)
            r4.A05()
            X.DbT.A1V(r4)
        L_0x1002:
            r0 = -1773741638(0xffffffff9646d9ba, float:-1.6063015E-25)
            goto L_0x107c
        L_0x1006:
            r1 = -300261478(0xffffffffee1a5f9a, float:-1.1944067E28)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r5 = r0.A01
            X.H1w r5 = (X.C54176H1w) r5
            X.H1p r4 = new X.H1p
            r4.<init>()
            X.Hii r0 = new X.Hii
            r0.<init>(r5)
            r4.A00 = r0
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            X.0eM r0 = r5.A0D
            X.GMQ r0 = X.C53039GhV.A00(r0)
            java.lang.Object r0 = r0.A01
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "initial_filter_type"
            r3.putString(r0, r2)
            r4.setArguments(r3)
            X.0eM r0 = r5.A0C
            X.7Pr r2 = X.DbX.A0f(r0)
            r0 = 2131968984(0x7f1343d8, float:1.9574878E38)
            java.lang.String r0 = r5.getString(r0)
            r2.A0d = r0
            r2.A0U = r4
            X.DbY.A13(r5, r4, r2)
            r0 = -213046909(0xfffffffff34d2983, float:-1.625462E31)
            goto L_0x107c
        L_0x104d:
            r1 = 1260282725(0x4b1e6365, float:1.0380133E7)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.9IE r0 = (X.AnonymousClass9IE) r0
            java.lang.Object r0 = r0.A00
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A00
            X.DbS.A1U(r0)
            r0 = 1765789285(0x693fce65, float:1.4492469E25)
            goto L_0x107c
        L_0x1065:
            r1 = -2016831566(0xffffffff87c997b2, float:-3.0332277E-34)
            int r1 = X.AnonymousClass0fD.A05(r1)
            java.lang.Object r0 = r0.A01
            X.9IE r0 = (X.AnonymousClass9IE) r0
            java.lang.Object r0 = r0.A00
            X.JwM r0 = (X.C61084JwM) r0
            java.lang.Object r0 = r0.A02
            X.DbS.A1U(r0)
            r0 = -1085080526(0xffffffffbf52fc32, float:-0.8241607)
        L_0x107c:
            X.AnonymousClass0fD.A0C(r0, r1)
            return
        L_0x1080:
            r0 = -930595008(0xffffffffc8883f40, float:-279034.0)
            int r5 = X.AnonymousClass0fD.A05(r0)
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            r0 = 884055066(0x34b19c1a, float:3.3082398E-7)
        L_0x108c:
            X.AnonymousClass0fD.A0C(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56802ICz.onClick(android.view.View):void");
    }
}
