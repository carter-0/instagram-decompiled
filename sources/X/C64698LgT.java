package X;

import com.instagram.creation.fragment.EditMediaInfoFragment;
import org.webrtc.EglBase14Impl;

/* renamed from: X.LgT  reason: case insensitive filesystem */
public final class C64698LgT implements 1wn {
    public final int A00;
    public final Object A01;

    public C64698LgT(EditMediaInfoFragment editMediaInfoFragment, int i) {
        this.A00 = i;
        switch (i) {
            case 15:
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
                this.A01 = editMediaInfoFragment;
                return;
            default:
                this.A01 = editMediaInfoFragment;
                return;
        }
    }

    public static C64698LgT A00(Object obj, int i) {
        return new C64698LgT(obj, i);
    }

    /* JADX WARNING: type inference failed for: r0v486, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04e4, code lost:
        com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04e7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0ece, code lost:
        if (r5 != null) goto L_0x0ed0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        X.0qQ.A0F(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x1503, code lost:
        r0.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x1506, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x1679, code lost:
        X.AnonymousClass0fD.A0A(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x167c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002e, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x1805, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x020a, code lost:
        if (r0 != false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x191a, code lost:
        X.AnonymousClass0fD.A0A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x191d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0233, code lost:
        if (r2 != false) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:831:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r38) {
        /*
            r37 = this;
            r2 = r37
            r3 = r38
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x1871;
                case 1: goto L_0x1809;
                case 2: goto L_0x17d9;
                case 3: goto L_0x17ab;
                case 4: goto L_0x1757;
                case 5: goto L_0x1705;
                case 6: goto L_0x04e8;
                case 7: goto L_0x082b;
                case 8: goto L_0x167d;
                case 9: goto L_0x032e;
                case 10: goto L_0x1617;
                case 11: goto L_0x15cd;
                case 12: goto L_0x1599;
                case 13: goto L_0x153b;
                case 14: goto L_0x1507;
                case 15: goto L_0x04d3;
                case 16: goto L_0x14ce;
                case 17: goto L_0x14a9;
                case 18: goto L_0x04c5;
                case 19: goto L_0x147a;
                case 20: goto L_0x1448;
                case 21: goto L_0x1404;
                case 22: goto L_0x13dd;
                case 23: goto L_0x13b9;
                case 24: goto L_0x03e8;
                case 25: goto L_0x1369;
                case 26: goto L_0x1339;
                case 27: goto L_0x12c9;
                case 28: goto L_0x1283;
                case 29: goto L_0x07bf;
                case 30: goto L_0x0744;
                case 31: goto L_0x1250;
                case 32: goto L_0x06fa;
                case 33: goto L_0x1226;
                case 34: goto L_0x04ab;
                case 35: goto L_0x11ff;
                case 36: goto L_0x11df;
                case 37: goto L_0x06bd;
                case 38: goto L_0x11b8;
                case 39: goto L_0x0697;
                case 40: goto L_0x1112;
                case 41: goto L_0x03a2;
                case 42: goto L_0x1099;
                case 43: goto L_0x1071;
                case 44: goto L_0x101f;
                case 45: goto L_0x066b;
                case 46: goto L_0x0f88;
                case 47: goto L_0x0f3f;
                case 48: goto L_0x0642;
                case 49: goto L_0x0c7b;
                case 50: goto L_0x0c33;
                case 51: goto L_0x0bf2;
                case 52: goto L_0x0b9f;
                case 53: goto L_0x0b65;
                case 54: goto L_0x0370;
                case 55: goto L_0x00c7;
                case 56: goto L_0x0609;
                case 57: goto L_0x002f;
                case 58: goto L_0x0074;
                case 59: goto L_0x0ae7;
                case 60: goto L_0x0aa9;
                case 61: goto L_0x0a87;
                case 62: goto L_0x0a3e;
                case 63: goto L_0x0a1e;
                case 64: goto L_0x09d3;
                case 65: goto L_0x097e;
                case 66: goto L_0x0956;
                case 67: goto L_0x092e;
                case 68: goto L_0x08f9;
                case 69: goto L_0x08d3;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 1630306298(0x612c7ffa, float:1.9887885E20)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lg3 r3 = (X.C64677Lg3) r3
            r0 = -1192298381(0xffffffffb8eef873, float:-1.1395002E-4)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            java.lang.Object r4 = r2.A01
            X.KSq r4 = (X.C61941KSq) r4
            X.1Ng r1 = r4.A08
            if (r1 != 0) goto L_0x1652
            java.lang.String r11 = "eventBus"
        L_0x0027:
            X.0qQ.A0F(r11)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x002f:
            r0 = 424116641(0x194781a1, float:1.0314237E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfc r3 = (X.C64650Lfc) r3
            r0 = -1604345498(0xffffffffa05fa166, float:-1.8942237E-19)
            int r6 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r4 = r2.A01
            X.K6A r4 = (X.K6A) r4
            java.lang.Integer r2 = r3.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            java.lang.String r11 = "videoPreviewController"
            X.LFb r1 = r4.A0F
            if (r2 != r0) goto L_0x0065
            if (r1 == 0) goto L_0x0027
            X.9Pn r0 = r1.A03
            r0.A04()
            r0.A01()
        L_0x0057:
            X.K6A.A05(r4, r2)
            r0 = -325012904(0xffffffffeca0b258, float:-1.5541627E27)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 70255881(0x4300509, float:2.0691013E-36)
            goto L_0x1805
        L_0x0065:
            if (r1 == 0) goto L_0x0027
            r0 = 0
            r1.A01(r0)
            X.9Pn r0 = r1.A03
            r0.A04()
            r0.A03()
            goto L_0x0057
        L_0x0074:
            r0 = 119863979(0x724faab, float:1.2411653E-34)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = 1334972684(0x4f92110c, float:4.9011814E9)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r6 = r2.A01
            X.K6A r6 = (X.K6A) r6
            X.JWG r1 = r6.A08
            if (r1 == 0) goto L_0x008f
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.A08(r0)
        L_0x008f:
            boolean r0 = r6.A0K
            if (r0 == 0) goto L_0x05b6
            X.0eM r7 = r6.A0P
            java.lang.Object r0 = r7.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0589
            X.LOy r3 = r6.A0B
            if (r3 == 0) goto L_0x057e
            X.Lmf r2 = r3.A02
            if (r2 == 0) goto L_0x00ba
            X.0hq r0 = r2.A00
            if (r0 == 0) goto L_0x00ba
            X.0s1 r1 = new X.0s1
            r1.<init>(r0)
            X.4DH r0 = r2.A01
            r1.A03(r0)
            r1.A00()
        L_0x00ba:
            r1 = 0
            r3.A02 = r1
            r6.A0I = r1
            X.LFb r0 = r6.A0F
            if (r0 != 0) goto L_0x05c5
            java.lang.String r11 = "videoPreviewController"
            goto L_0x0027
        L_0x00c7:
            r0 = -1913439343(0xffffffff8df33b91, float:-1.4990371E-30)
            int r20 = X.AnonymousClass0fD.A03(r0)
            X.8No r3 = (X.C354838No) r3
            r0 = -936845848(0xffffffffc828dde8, float:-172919.62)
            int r19 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r3, r1)
            X.3Ii r6 = r3.A00
            boolean r0 = r6 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r2.A01
            X.LpP r0 = (X.C65219LpP) r0
            X.L9K r0 = r0.A0B
            X.02m r2 = r0.A01
            X.0qQ.A06(r2)
            java.util.Set r1 = r0.A03
            r0 = 37370567(0x23a3ac7, float:1.368199E-37)
            X.C18251VoI.A01(r2, r1, r0)
            r0 = 37358359(0x23a0b17, float:1.3668304E-37)
            X.C18251VoI.A01(r2, r1, r0)
        L_0x00fa:
            r1 = 1971936483(0x75895ce3, float:3.4825617E32)
        L_0x00fd:
            r0 = r19
            X.AnonymousClass0fD.A0A(r1, r0)
            r1 = -2034858773(0xffffffff86b684eb, float:-6.8656096E-35)
            r0 = r20
            goto L_0x191a
        L_0x0109:
            java.lang.String r3 = r3.A01
            java.lang.String r0 = "feed"
            boolean r0 = X.0qQ.A0K(r3, r0)
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r5 = r2.A01
            X.LpP r5 = (X.C65219LpP) r5
            X.L9K r0 = r5.A0B
            X.02m r4 = r0.A01
            X.0qQ.A06(r4)
            java.util.Set r3 = r0.A03
            r7 = 37370567(0x23a3ac7, float:1.368199E-37)
            r18 = 1
            r0 = r18
            X.0qQ.A0B(r3, r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            boolean r0 = r3.contains(r2)
            if (r0 == 0) goto L_0x013b
            r0 = 2
            r4.markerEnd(r7, r0)
            r3.remove(r2)
        L_0x013b:
            X.KOb r7 = r5.A08
            java.util.ArrayList r0 = r7.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0159
            java.util.List r0 = r7.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0159
            com.instagram.common.session.UserSession r0 = r5.A03
            boolean r0 = X.C367088qA.A03(r0)
            if (r0 != 0) goto L_0x0159
            r1 = -344957486(0xffffffffeb705dd2, float:-2.9058525E26)
            goto L_0x00fd
        L_0x0159:
            r0 = 1642(0x66a, float:2.301E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r6, r0)
            X.3Ih r6 = (X.C239793Ih) r6
            java.lang.Object r12 = r6.A00
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L_0x0317
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0317
            X.82q r8 = r5.A05
            boolean r0 = r8.COf()
            if (r0 == 0) goto L_0x0236
            java.util.ArrayList r10 = X.AnonymousClass7TE.A1C()
            X.KO3 r9 = r5.A06
            X.3Q2 r0 = r9.A04()
            java.util.List r0 = r0.A0L()
            java.util.ArrayList r11 = X.AnonymousClass7TF.A0q(r0, r1)
            java.util.Iterator r13 = r0.iterator()
        L_0x018e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01a5
            java.lang.Object r6 = r13.next()
            r0 = r6
            X.3Q2 r0 = (X.AnonymousClass3Q2) r0
            X.1iA r2 = r0.A1G
            X.1iA r0 = X.1iA.A0Q
            if (r2 != r0) goto L_0x018e
            r11.add(r6)
            goto L_0x018e
        L_0x01a5:
            int r2 = r12.size()
            int r0 = r11.size()
            if (r2 <= r0) goto L_0x01b4
            r1 = 937327599(0x37de7bef, float:2.6522173E-5)
            goto L_0x00fd
        L_0x01b4:
            java.util.Iterator r17 = r12.iterator()
            r2 = 0
            r16 = 0
        L_0x01bb:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x022d
            java.lang.Object r14 = r17.next()
            X.Koi r14 = (X.C62930Koi) r14
            int r13 = r14.A00
            if (r13 < 0) goto L_0x01bb
            int r0 = r11.size()
            if (r13 >= r0) goto L_0x01bb
            java.lang.Object r6 = r11.get(r13)
            X.3Q2 r6 = (X.AnonymousClass3Q2) r6
            java.util.List r12 = r14.A02
            X.0qQ.A07(r12)
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x01bb
            com.instagram.common.session.UserSession r2 = r5.A03
            X.4DH r0 = r5.A01
            r22 = r0
            java.lang.String r0 = r5.A0E
            X.LBk r15 = X.C64832Lit.A04
            X.Lit r15 = r15.A00(r2)
            X.Jqt r21 = r15.A00(r0, r0)
            r23 = r2
            r24 = r6
            r25 = r14
            r26 = r0
            r27 = r13
            r28 = r18
            boolean r0 = X.LTX.A0C(r21, r22, r23, r24, r25, r26, r27, r28)
            if (r0 != 0) goto L_0x020c
            r0 = r16
            r16 = 0
            if (r0 == 0) goto L_0x020e
        L_0x020c:
            r16 = 1
        L_0x020e:
            java.util.ArrayList r13 = r7.A00
            X.LP7 r0 = r5.A0C
            boolean r0 = X.LRu.A02(r2, r8, r6, r0)
            java.util.ArrayList r2 = X.LTX.A02(r2, r12, r13, r0)
            java.util.ArrayList r0 = r6.A41
            java.util.ArrayList r2 = X.LTX.A03(r2, r0)
            r6.A43 = r2
            java.util.List r0 = X.C63460KxP.A00(r12)
            r6.A4X = r0
            r10.addAll(r2)
            r2 = 1
            goto L_0x01bb
        L_0x022d:
            X.3Q2 r0 = r9.A04()
            r0.A43 = r10
            if (r2 == 0) goto L_0x0317
            goto L_0x029b
        L_0x0236:
            java.lang.Object r0 = r12.get(r1)
            X.Koi r0 = (X.C62930Koi) r0
            java.util.List r6 = r0.A02
            X.0qQ.A07(r6)
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0317
            X.KO3 r9 = r5.A06
            X.3Q2 r24 = r9.A04()
            java.lang.Object r12 = r12.get(r1)
            X.Koi r12 = (X.C62930Koi) r12
            com.instagram.common.session.UserSession r10 = r5.A03
            X.4DH r11 = r5.A01
            java.lang.String r2 = r5.A0E
            X.LBk r0 = X.C64832Lit.A04
            X.Lit r0 = r0.A00(r10)
            X.Jqt r21 = r0.A00(r2, r2)
            r23 = r10
            r25 = r12
            r26 = r2
            r27 = r1
            r28 = r1
            r22 = r11
            boolean r16 = X.LTX.A0C(r21, r22, r23, r24, r25, r26, r27, r28)
            java.util.ArrayList r7 = r7.A00
            X.3Q2 r2 = r9.A00
            X.LP7 r0 = r5.A0C
            boolean r0 = X.LRu.A02(r10, r8, r2, r0)
            java.util.ArrayList r2 = X.LTX.A02(r10, r6, r7, r0)
            X.3Q2 r0 = r9.A04()
            java.util.ArrayList r0 = r0.A41
            java.util.ArrayList r2 = X.LTX.A03(r2, r0)
            X.3Q2 r0 = r9.A04()
            r0.A43 = r2
            X.3Q2 r2 = r9.A04()
            java.util.List r0 = X.C63460KxP.A00(r6)
            r2.A4X = r0
        L_0x029b:
            X.4DH r10 = r5.A01
            boolean r0 = r10.isResumed()
            java.lang.String r11 = "tagProductsSection"
            if (r0 == 0) goto L_0x0310
            if (r16 == 0) goto L_0x02c0
            android.view.View r8 = r10.mView
            if (r8 == 0) goto L_0x02c0
            X.KB3 r7 = r5.A0D
            X.LFP r0 = r5.A00
            if (r0 == 0) goto L_0x0027
            X.LP7 r0 = r0.A01
            android.view.View r6 = r0.A01
            if (r6 == 0) goto L_0x05db
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            androidx.fragment.app.FragmentActivity r0 = r10.requireActivity()
            r7.A00(r0, r8, r6, r2)
        L_0x02c0:
            X.3Q2 r0 = r9.A04()
            java.util.ArrayList r0 = r0.A43
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            com.instagram.tagging.api.model.MediaSuggestedProductTag r0 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r0
            if (r0 == 0) goto L_0x02fc
            java.util.List r0 = r0.A02
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r0)
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r0 = X.00k.A0O(r0, r1)
            com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer r0 = (com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer) r0
            if (r0 == 0) goto L_0x02fc
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r0 = X.C14502TxO.A00(r0)
            boolean r2 = r0.A04()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            if (r0 == 0) goto L_0x02fc
            r1 = 37358359(0x23a0b17, float:1.3668304E-37)
            r0 = 545(0x221, float:7.64E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.markerAnnotate(r1, r0, r2)
        L_0x02fc:
            r2 = 37358359(0x23a0b17, float:1.3668304E-37)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x0310
            r0 = 2
            r4.markerEnd(r2, r0)
            r3.remove(r1)
        L_0x0310:
            X.LFP r0 = r5.A00
            if (r0 == 0) goto L_0x0027
            r0.A00()
        L_0x0317:
            r2 = 37358359(0x23a0b17, float:1.3668304E-37)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r0 = r3.contains(r1)
            if (r0 == 0) goto L_0x00fa
            r0 = 33
            r4.markerEnd(r2, r0)
            r3.remove(r1)
            goto L_0x00fa
        L_0x032e:
            r0 = 1452206290(0x568ee8d2, float:7.8565303E13)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = 428631152(0x198c6470, float:1.4516227E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r4 = r2.A01
            X.K7n r4 = (X.C61438K7n) r4
            android.content.Context r3 = r4.requireContext()
            X.8it r0 = r4.A05
            java.lang.String r11 = "shareToFBController"
            if (r0 == 0) goto L_0x0027
            boolean r2 = r0.A03
            com.instagram.common.session.UserSession r0 = X.JTP.A0R(r4)
            boolean r1 = X.C363018iu.A00(r0)
            X.8it r0 = r4.A05
            if (r0 == 0) goto L_0x0027
            r0.A02()
            if (r2 == r1) goto L_0x0365
            if (r1 == 0) goto L_0x0365
            r0 = 2131974358(0x7f1358d6, float:1.9585778E38)
            X.DbU.A0z(r3, r0)
        L_0x0365:
            r0 = 216425562(0xce6645a, float:3.5497508E-31)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 1126629228(0x4326ff6c, float:166.99774)
            goto L_0x1679
        L_0x0370:
            r0 = -1427706410(0xffffffffaae6edd6, float:-4.102124E-13)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1883627565(0xffffffff8fba1fd3, float:-1.8353274E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r5 = r2.A01
            X.LpV r5 = (X.C65225LpV) r5
            com.instagram.common.session.UserSession r2 = r5.A05
            X.1Av r0 = X.1Au.A00(r2)
            java.lang.String r1 = r5.A08
            java.util.Set r0 = r0.A0I(r1)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r0)
            X.1Av r0 = X.1Au.A00(r2)
            boolean r2 = r0.A24(r1)
            X.JfA r1 = r5.A00
            if (r1 != 0) goto L_0x05e0
            java.lang.String r11 = "geoGatingRow"
            goto L_0x0027
        L_0x03a2:
            r0 = 413683269(0x18a84e45, float:4.3506014E-24)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.LfZ r3 = (X.C64647LfZ) r3
            r0 = -49948964(0xfffffffffd05d6dc, float:-1.1118934E37)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.lang.Integer r0 = r3.A00
            int r0 = r0.intValue()
            r1 = 1
            if (r0 == r4) goto L_0x03d8
            if (r0 != r1) goto L_0x03cd
            java.lang.Object r1 = r2.A01
            X.K6N r1 = (X.K6N) r1
            X.M3N r0 = new X.M3N
            r0.<init>(r1)
            X.11Z.A02(r0)
        L_0x03cd:
            r0 = -913234208(0xffffffffc99126e0, float:-1189084.0)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 1234587162(0x49964e1a, float:1231299.2)
            goto L_0x1805
        L_0x03d8:
            java.lang.Object r0 = r2.A01
            X.K6N r0 = (X.K6N) r0
            com.instagram.igds.components.button.IgdsButton r0 = r0.A00
            if (r0 != 0) goto L_0x03e4
            java.lang.String r11 = "nextButton"
            goto L_0x0027
        L_0x03e4:
            r0.setLoading(r1)
            goto L_0x03cd
        L_0x03e8:
            r0 = 1200702567(0x47914467, float:74376.805)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r1 = 1573854279(0x5dcf1c47, float:1.86548517E18)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r6 = 0
            X.0qQ.A0B(r3, r6)
            java.lang.Object r5 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r5 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r5
            X.KNr r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r5)
            X.KOU r9 = r1.A0I
            X.L7w r8 = new X.L7w
            r8.<init>()
            java.util.List r7 = r3.A02
            r8.A02 = r7
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r1 = r3.A00
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = r1.F0x()
            r8.A00 = r1
            boolean r1 = r3.A03
            r8.A03 = r1
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A01
            r2 = 0
            if (r1 == 0) goto L_0x0426
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = r1.F0y()
            r8.A01 = r1
        L_0x0426:
            X.JwD r1 = r9.A06()
            X.JVf r1 = r1.A03
            if (r1 == 0) goto L_0x0430
            java.lang.Object r2 = r1.A00
        L_0x0430:
            r1 = 43
            X.JVf r3 = new X.JVf
            r3.<init>((int) r1, (java.lang.Object) r8, (java.lang.Object) r2)
            int r1 = r7.size()
            r8 = 1
            if (r1 != r8) goto L_0x0463
            java.lang.Object r1 = X.00k.A0O(r7, r6)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x0463
            boolean r2 = r1.A04
        L_0x0448:
            X.JwD r1 = r9.A06()
            X.JwD r1 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, r3, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r1, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, -12289, 262143, false, r2, false, false, false, false, false, false, false, false, false, false, false)
            r9.A09(r1)
            X.LFX r1 = r5.A0F
            if (r1 == 0) goto L_0x045a
            r1.A00()
        L_0x045a:
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r1 = r5.A02
            r3 = 0
            if (r1 != 0) goto L_0x0465
            java.lang.String r11 = "brandedContentDisclosureController"
            goto L_0x0027
        L_0x0463:
            r2 = 0
            goto L_0x0448
        L_0x0465:
            r2 = 0
            java.lang.String r11 = "dependencyProvider"
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x049d
            int r1 = r7.size()
            if (r1 != r8) goto L_0x049d
            X.KNl r1 = r5.A0C
            if (r1 == 0) goto L_0x0027
            X.LP7 r3 = r1.A08()
            java.lang.Object r1 = r7.get(r6)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x0486
            java.lang.String r2 = r1.A01
        L_0x0486:
            X.LPD r1 = r3.A0D
            r1.A04(r2)
        L_0x048b:
            X.Loa r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r5)
            r1.A01()
            r1 = -1356912533(0xffffffffaf1f286b, float:-1.4475325E-10)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -747680041(0xffffffffd36f4ed7, float:-1.0278199E12)
            goto L_0x191a
        L_0x049d:
            X.KNl r1 = r5.A0C
            if (r1 == 0) goto L_0x0027
            X.LP7 r1 = r1.A08()
            X.LPD r1 = r1.A0D
            r1.A04(r3)
            goto L_0x048b
        L_0x04ab:
            r0 = -702268781(0xffffffffd6243a93, float:-4.514287E13)
            X.AnonymousClass0fD.A03(r0)
            r0 = 621394361(0x2509b9b9, float:1.1945781E-16)
            X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r0)
            java.lang.String r0 = "partnerBoostEnabled"
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)
            throw r1
        L_0x04c5:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            X.LfY r3 = (X.C64646LfY) r3
            X.Juw r0 = r3.A00
            r2.A0D = r0
            r0 = 1
            r2.A0k = r0
            goto L_0x04e4
        L_0x04d3:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            r1 = 0
            r0 = 1
            r2.A0L = r1
            r2.A0u = r0
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x04e4
            com.instagram.creation.fragment.EditMediaInfoFragment.A0H(r2)
        L_0x04e4:
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            return
        L_0x04e8:
            r0 = -1861062482(0xffffffff911270ae, float:-1.1552091E-28)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lg9 r3 = (X.C64681Lg9) r3
            r0 = -83377180(0xfffffffffb07c3e4, float:-7.049332E35)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r2 = r2.A01
            X.Jal r2 = (X.C59867Jal) r2
            com.instagram.creation.base.ui.mediatabbar.Tab r1 = r2.A03
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A01
            if (r1 == r0) goto L_0x0506
            com.instagram.creation.base.ui.mediatabbar.Tab r0 = X.JXL.A02
            if (r1 != r0) goto L_0x0516
        L_0x0506:
            java.lang.Integer r0 = r3.A00
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x0523;
                case 1: goto L_0x0528;
                case 2: goto L_0x053a;
                case 3: goto L_0x055e;
                case 4: goto L_0x0579;
                default: goto L_0x050f;
            }
        L_0x050f:
            java.lang.String r1 = "InAppCaptureView"
            java.lang.String r0 = "onZoomOutKey not implemented"
        L_0x0513:
            X.0KC.A0D(r1, r0)
        L_0x0516:
            r0 = 1925461174(0x72c434b6, float:7.7725165E30)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 278032576(0x109270c0, float:5.7760565E-29)
            X.AnonymousClass0fD.A0A(r0, r5)
            return
        L_0x0523:
            java.lang.String r1 = "InAppCaptureView"
            java.lang.String r0 = "onFocusKey not implemened"
            goto L_0x0513
        L_0x0528:
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0516
            X.Jat r0 = r2.A0e
            X.Jav r0 = r0.A06
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x0516
            r2.A0C()
            goto L_0x0516
        L_0x053a:
            boolean r0 = r2.A0E
            if (r0 != 0) goto L_0x0516
            X.Jat r0 = r2.A0e
            X.3Q2 r0 = r0.A00
            if (r0 == 0) goto L_0x0516
            boolean r0 = r2.A0H
            if (r0 != 0) goto L_0x0516
            java.lang.Integer r1 = X.AnonymousClass05K.A0H
            com.instagram.common.session.UserSession r0 = r2.A0a
            X.C59882Jb5.A01(r0, r1)
            com.instagram.creation.capture.ShutterButton r1 = r2.A0d
            r0 = 1
            r1.setPressed(r0)
            r2.A0H = r0
            r2.A0D()
            X.C59867Jal.A06(r2, r0)
            goto L_0x0516
        L_0x055e:
            boolean r0 = r2.A0H
            if (r0 == 0) goto L_0x0516
            r1 = 0
            r2.A0H = r1
            X.7l2 r0 = r2.A0Y     // Catch:{ 8Fp -> 0x0516 }
            boolean r0 = r0.A0V()     // Catch:{ 8Fp -> 0x0516 }
            if (r0 == 0) goto L_0x0516
            r2.A0B()
            com.instagram.creation.capture.ShutterButton r0 = r2.A0d
            r0.setPressed(r1)
            r2.A07()
            goto L_0x0516
        L_0x0579:
            java.lang.String r1 = "InAppCaptureView"
            java.lang.String r0 = "onZoomInKey not implemented"
            goto L_0x0513
        L_0x057e:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -151302801(0xfffffffff6fb4d6f, float:-2.5485099E33)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x0589:
            java.lang.Integer r1 = r6.A0I
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 == r0) goto L_0x0593
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 != r0) goto L_0x05b0
        L_0x0593:
            X.0eM r0 = r6.A0O
            X.0lg r3 = X.DbT.A0X(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329191326629744(0x81113500003f70, double:3.038065108647843E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x05b0
            java.lang.Object r0 = r7.getValue()
            X.JiK r0 = (X.C60263JiK) r0
            r0.A00()
            goto L_0x05d0
        L_0x05b0:
            X.0eM r0 = r6.A0O
            X.C59888JbD.A02(r0)
            goto L_0x05d0
        L_0x05b6:
            X.0eM r0 = r6.A0O
            X.1Ng r1 = X.DbX.A0R(r0)
            X.LfM r0 = new X.LfM
            r0.<init>()
            r1.A05(r0)
            goto L_0x05d0
        L_0x05c5:
            r0.A01(r1)
            X.9Pn r0 = r0.A03
            r0.A04()
            r0.A03()
        L_0x05d0:
            r0 = -1446914711(0xffffffffa9c1d569, float:-8.6079425E-14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 711565468(0x2a69a09c, float:2.075028E-13)
            goto L_0x1805
        L_0x05db:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x05e0:
            java.lang.String r0 = X.C65225LpV.A00(r5, r3, r2)
            r1.setInlineSubtitle(r0)
            if (r2 == 0) goto L_0x05fe
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x05fe
            X.4DH r0 = r5.A03
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            r0 = 34
            X.LV0 r0 = X.LV0.A00(r3, r5, r0)
            X.C64025LJm.A00(r1, r0)
        L_0x05fe:
            r0 = -1538784529(0xffffffffa44802ef, float:-4.3370572E-17)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 53714704(0x3339f10, float:5.2785967E-37)
            goto L_0x1679
        L_0x0609:
            r0 = 1478068321(0x58198861, float:6.7524409E14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -276221397(0xffffffffef89322b, float:-8.492019E28)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.KPh r0 = (X.C61868KPh) r0
            X.RBc r2 = r0.A09
            if (r2 == 0) goto L_0x062e
            android.widget.SeekBar r1 = r0.A05
            if (r1 == 0) goto L_0x063d
            r0 = 0
            r1.setEnabled(r0)
            boolean r0 = r2.A09
            if (r0 == 0) goto L_0x0639
            r2.A09()
        L_0x062e:
            r0 = 1757648809(0x68c397a9, float:7.389273E24)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1022034228(0x3ceb0134, float:0.028687097)
            goto L_0x1805
        L_0x0639:
            r0 = 1
            r2.A0B = r0
            goto L_0x062e
        L_0x063d:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0642:
            r0 = 448996092(0x1ac322fc, float:8.070663E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lg8 r3 = (X.Lg8) r3
            r0 = -28421531(0xfffffffffe4e5265, float:-6.8562196E37)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            X.K66 r0 = (X.K66) r0
            X.3Q2 r1 = X.C61829KNs.A02(r0)
            if (r1 == 0) goto L_0x0660
            boolean r0 = r3.A00
            r1.A51 = r0
        L_0x0660:
            r0 = 1811174542(0x6bf4548e, float:5.907544E26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 2043234521(0x79c948d9, float:1.3064115E35)
            goto L_0x1805
        L_0x066b:
            r0 = 698128505(0x299c9879, float:6.9542415E-14)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.LfY r3 = (X.C64646LfY) r3
            r0 = -1479315159(0xffffffffa7d37129, float:-5.8686953E-15)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            X.Juw r1 = r3.A00
            if (r1 == 0) goto L_0x068c
            java.lang.Object r0 = r2.A01
            X.K66 r0 = (X.K66) r0
            X.KNs r0 = X.K66.A06(r0)
            X.KOc r0 = r0.A0G
            r0.A0A(r1)
        L_0x068c:
            r0 = 2134154767(0x7f349e0f, float:2.4008173E38)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1463773997(0x573f6b2d, float:2.10467037E14)
            goto L_0x1805
        L_0x0697:
            r0 = 1904273915(0x7180e9fb, float:1.2767023E30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r0 = -777360079(0xffffffffd1aa6d31, float:-9.1497046E10)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.LFX r0 = r1.A0F
            if (r0 == 0) goto L_0x06b2
            r0.A00()
        L_0x06b2:
            r0 = -1312878324(0xffffffffb1bf110c, float:-5.5607696E-9)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = -1317373710(0xffffffffb17a78f2, float:-3.6448538E-9)
            goto L_0x1805
        L_0x06bd:
            r0 = -1293462636(0xffffffffb2e75394, float:-2.6929946E-8)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfe r3 = (X.C64652Lfe) r3
            r0 = -820897415(0xffffffffcf121979, float:-2.45114291E9)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x06ef
            X.LE1 r1 = r2.A0D
            if (r1 == 0) goto L_0x06e6
            boolean r0 = r3.A00
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            r0 = 1
            r1.A05 = r0
        L_0x06e6:
            X.LFW r1 = r2.shareToBarcelonaViewBinder
            if (r1 == 0) goto L_0x06ef
            boolean r0 = r3.A00
            r1.A01(r0)
        L_0x06ef:
            r0 = 732798310(0x2bad9d66, float:1.2336076E-12)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1474432583(0x57e20e47, float:4.97101897E14)
            goto L_0x1805
        L_0x06fa:
            r0 = -1581939010(0xffffffffa1b586be, float:-1.2300703E-18)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfa r3 = (X.C64648Lfa) r3
            r0 = -1846126879(0xffffffff91f656e1, float:-3.88655E-28)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            com.instagram.model.venue.Venue r3 = r3.A00
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r1)
            X.KOp r0 = r0.A0M
            r0.DOm(r3)
            X.0eM r4 = r1.A0f
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            X.0Tu r2 = X.DbS.A0J(r3, r7)
            r0 = 36322486882674903(0x810b1c000028d7, double:3.0338251912941724E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0739
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r4)
            X.C59888JbD.A00(r0)
        L_0x0739:
            r0 = 788234089(0x2efb7f69, float:1.1436791E-10)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 885272867(0x34c43123, float:3.6543597E-7)
            goto L_0x1805
        L_0x0744:
            r0 = 2027710832(0x78dc6970, float:3.576387E34)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = 1543622568(0x5c01cfa8, float:1.4615437E17)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r7 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r7 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r7
            android.view.View r1 = r7.mView
            java.lang.String r6 = "Required value was null."
            if (r1 == 0) goto L_0x078e
            com.facebook.common.callercontext.CallerContext r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            java.lang.String r5 = r7.A0O
            if (r5 == 0) goto L_0x078e
            X.LpS r1 = r7.A0I
            if (r1 == 0) goto L_0x07b4
            X.JeZ r1 = r1.A00
            if (r1 == 0) goto L_0x07b4
            java.util.List r1 = r1.A0P
            java.util.Iterator r3 = r1.iterator()
        L_0x0770:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x078e
            android.view.View r2 = X.JTO.A0H(r3)
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto L_0x0770
            java.lang.Object r1 = r2.getTag()
            boolean r1 = X.0qQ.A0K(r1, r5)
            if (r1 == 0) goto L_0x0770
            r2.performClick()
            goto L_0x0770
        L_0x078e:
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            X.4mj r1 = (X.C273524mj) r1
            if (r1 == 0) goto L_0x07a1
            com.instagram.creation.activity.MediaCaptureActivity r1 = (com.instagram.creation.activity.MediaCaptureActivity) r1
            X.JWG r2 = r1.A07
            if (r2 == 0) goto L_0x07ac
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A08(r1)
        L_0x07a1:
            r1 = 1990886401(0x76aa8401, float:1.729234E33)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -267363475(0xfffffffff0105b6d, float:-1.7870547E29)
            goto L_0x191a
        L_0x07ac:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)
            r0 = -831599013(0xffffffffce6ece5b, float:-1.00162528E9)
            goto L_0x07bb
        L_0x07b4:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0z(r6)
            r0 = 2127521979(0x7ecf68bb, float:1.3784699E38)
        L_0x07bb:
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x07bf:
            r0 = 1074018677(0x40043975, float:2.066007)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfi r3 = (X.C64656Lfi) r3
            r0 = 1581990564(0x5e4b42a4, float:3.66161231E18)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r6 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r6 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r6
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            X.4mj r0 = (X.C273524mj) r0
            if (r0 == 0) goto L_0x07e7
            com.instagram.creation.activity.MediaCaptureActivity r0 = (com.instagram.creation.activity.MediaCaptureActivity) r0
            X.JWG r2 = r0.A07
            if (r2 == 0) goto L_0x0820
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r0 = 0
            r2.A0A(r0, r1)
        L_0x07e7:
            android.content.Context r2 = r6.getContext()
            if (r2 == 0) goto L_0x07fe
            X.0eM r0 = r6.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.Liv r1 = X.C63270KuF.A00(r0)
            X.3Q2 r0 = X.LRK.A01(r6)
            r1.A01(r2, r0)
        L_0x07fe:
            java.lang.String r1 = r3.A00
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            r6.A0O = r1
            boolean r0 = X.LTP.A0A(r6)
            if (r0 != 0) goto L_0x0815
            X.JeZ r1 = r6.mAppShareTable
            if (r1 == 0) goto L_0x0815
            X.3Q2 r0 = X.LRK.A00(r6)
            r1.A06(r0)
        L_0x0815:
            r0 = 341625065(0x145cc8e9, float:1.1146784E-26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1080908666(0xffffffffbf92a486, float:-1.1456459)
            goto L_0x1805
        L_0x0820:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = -569807967(0xffffffffde096ba1, float:-2.47554631E18)
            X.AnonymousClass0fD.A0A(r0, r4)
            throw r1
        L_0x082b:
            r0 = 959420802(0x392f9982, float:1.6746487E-4)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Jbx r3 = (X.C59933Jbx) r3
            r1 = -340518595(0xffffffffebb4193d, float:-4.3545166E26)
            int r4 = X.AnonymousClass0fD.A03(r1)
            boolean r1 = r3.A01
            r7 = 0
            r5 = 1
            java.lang.Object r6 = r2.A01
            if (r1 == 0) goto L_0x089f
            com.instagram.creation.capture.MediaCaptureFragment r6 = (com.instagram.creation.capture.MediaCaptureFragment) r6
            X.Jah r1 = r6.mMediaTabHost
            r1.A08 = r7
            r1.A05 = r7
            com.instagram.creation.base.ui.mediatabbar.MediaTabBar r1 = r1.A0I
            r8 = 8
            r1.setVisibility(r8)
            X.82p r1 = r6.A04
            com.instagram.creation.base.CreationSession r1 = X.JWE.A01(r1)
            boolean r1 = r1.A0J
            r2 = 2
            if (r1 == 0) goto L_0x085e
            r2 = 1
        L_0x085e:
            boolean r1 = r6.A07
            if (r1 == 0) goto L_0x0876
            int r1 = r3.A00
            if (r1 >= r2) goto L_0x0876
            X.JW9 r1 = r6.mActionBar
            r1.setNextEnabledWithColor(r7)
        L_0x086b:
            r1 = -1155066433(0xffffffffbb2715bf, float:-0.002549514)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1802022319(0xffffffff94975251, float:-1.5279572E-26)
            goto L_0x191a
        L_0x0876:
            int r3 = r3.A00
            int r2 = r6.A01
            X.JW9 r1 = r6.mActionBar
            r1.setNextEnabledWithColor(r5)
            X.Jah r5 = r6.mMediaTabHost
            if (r3 != r2) goto L_0x0894
            android.content.res.Resources r3 = X.DbV.A05(r6)
            r2 = 2131973048(0x7f1353b8, float:1.958312E38)
            int r1 = r6.A01
            java.lang.String r1 = X.JTS.A0i(r3, r1, r2)
            r5.setTextInfoBar(r1)
            goto L_0x086b
        L_0x0894:
            X.C59864Jah.A02(r5)
            android.view.View r1 = r5.A02
            if (r1 == 0) goto L_0x08c9
            r1.setVisibility(r8)
            goto L_0x086b
        L_0x089f:
            com.instagram.creation.capture.MediaCaptureFragment r6 = (com.instagram.creation.capture.MediaCaptureFragment) r6
            X.Jah r1 = r6.mMediaTabHost
            X.C59864Jah.A02(r1)
            android.view.View r1 = r1.A02
            if (r1 == 0) goto L_0x08ce
            r3 = 8
            r1.setVisibility(r3)
            X.Jah r2 = r6.mMediaTabHost
            com.instagram.creation.base.ui.mediatabbar.MediaTabBar r1 = r2.A0I
            int r1 = r1.getChildCount()
            if (r1 <= r5) goto L_0x08ba
            r7 = 1
        L_0x08ba:
            r2.A05 = r7
            com.instagram.creation.base.ui.mediatabbar.MediaTabBar r1 = r2.A0I
            if (r7 == 0) goto L_0x08c1
            r3 = 0
        L_0x08c1:
            r1.setVisibility(r3)
            X.Jah r1 = r6.mMediaTabHost
            r1.A08 = r5
            goto L_0x086b
        L_0x08c9:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x08ce:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x08d3:
            r0 = -1399893852(0xffffffffac8f50a4, float:-4.0732574E-12)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lfa r3 = (X.C64648Lfa) r3
            r0 = -1988821279(0xffffffff8974fee1, float:-2.9490275E-33)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            com.instagram.model.venue.Venue r1 = r3.A00
            java.lang.Object r0 = r2.A01
            X.KSq r0 = (X.C61941KSq) r0
            r0.A0E = r1
            X.C61941KSq.A03(r0)
            r0 = -167819340(0xfffffffff5ff47b4, float:-6.4721192E32)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1073894381(0x400253ed, float:2.0363724)
            goto L_0x1679
        L_0x08f9:
            r0 = 265179572(0xfce51b4, float:2.0344639E-29)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r0 = 2130272858(0x7ef9625a, float:1.6574422E38)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r1 = r2.A01
            X.KSq r1 = (X.C61941KSq) r1
            boolean r0 = r3.A03
            r1.A0W = r0
            java.util.List r0 = r3.A02
            r1.A0N = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r3.A01
            r1.A07 = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r3.A00
            r1.A06 = r0
            X.C61941KSq.A02(r1)
            r1.A0E()
            r0 = -1963531825(0xffffffff8af6e1cf, float:-2.3773878E-32)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1439212776(0x55c8a4e8, float:2.75763241E13)
            goto L_0x1679
        L_0x092e:
            r0 = -919669463(0xffffffffc92ef529, float:-716626.56)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3GP r3 = (X.AnonymousClass3GP) r3
            r0 = 155195487(0x940185f, float:2.3122619E-33)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.igtv.uploadflow.IGTVUploadActivity r0 = (com.instagram.igtv.uploadflow.IGTVUploadActivity) r0
            X.3M8 r1 = r0.Bx5()
            X.Dc2 r0 = r3.A01
            r1.A0A(r0)
            r0 = 1061739959(0x3f48ddb7, float:0.7846331)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1687567071(0xffffffff9b69c521, float:-1.9337004E-22)
            goto L_0x1679
        L_0x0956:
            r0 = -556380419(0xffffffffded64efd, float:-7.7212792E18)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.3GR r3 = (X.AnonymousClass3GR) r3
            r0 = 421227162(0x191b6a9a, float:8.03484E-24)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.igtv.uploadflow.IGTVUploadActivity r0 = (com.instagram.igtv.uploadflow.IGTVUploadActivity) r0
            X.3M8 r1 = r0.Bx5()
            X.Dc2 r0 = r3.A00
            r1.A09(r0)
            r0 = 60425904(0x39a06b0, float:9.052842E-37)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -354550452(0xffffffffeaddfd4c, float:-1.3418438E26)
            goto L_0x1679
        L_0x097e:
            r0 = -209485518(0xfffffffff3838132, float:-2.0837747E31)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -573852460(0xffffffffddcbb4d4, float:-1.83482377E18)
            int r7 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r6 = r2.A01
            X.Lso r6 = (X.C65408Lso) r6
            java.util.Map r1 = r6.A04
            java.util.Iterator r5 = X.AnonymousClass7TF.A0u(r1)
        L_0x0996:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x09c8
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r4 = r1.getKey()
            X.2gO r4 = (X.AnonymousClass2gO) r4
            java.lang.Object r1 = r1.getValue()
            X.LZf r1 = (X.C64305LZf) r1
            boolean r2 = r1.A00
            r1 = 1
            X.0qQ.A0B(r4, r1)
            java.util.Map r1 = r6.A05
            java.lang.Object r1 = r1.get(r4)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0996
            r1.add(r3)
            if (r2 == 0) goto L_0x0996
            r4.onChanged(r1)
            r1.clear()
            goto L_0x0996
        L_0x09c8:
            r1 = -1110901903(0xffffffffbdc8fb71, float:-0.09813584)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = 326162878(0x1370d9be, float:3.0399614E-27)
            goto L_0x191a
        L_0x09d3:
            r0 = 1177594564(0x4630aac4, float:11306.691)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfh r3 = (X.C64655Lfh) r3
            r1 = -802511460(0xffffffffd02aa59c, float:-1.14519204E10)
            int r6 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r7 = r2.A01
            X.KRq r7 = (X.C61921KRq) r7
            boolean r2 = r3.A00
            if (r2 == 0) goto L_0x0a09
            com.instagram.common.session.UserSession r1 = r7.A06
            X.8jd r5 = X.C363388je.A00(r1)
            com.facebook.common.callercontext.CallerContext r4 = r7.A04
            java.lang.String r3 = "upsell"
            r2 = 2
            X.Lpk r1 = new X.Lpk
            r1.<init>(r7, r2)
            r5.A01(r4, r1, r3)
        L_0x09fe:
            r1 = 92025651(0x57c3333, float:1.1858387E-35)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -1513597072(0xffffffffa5c85770, float:-3.475372E-16)
            goto L_0x191a
        L_0x0a09:
            X.LCj r1 = r7.A00
            if (r1 == 0) goto L_0x0a10
            r1.A00(r2)
        L_0x0a10:
            com.instagram.common.session.UserSession r1 = r7.A06
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r1)
            java.lang.Class<X.Lfh> r2 = X.C64655Lfh.class
            X.1wn r1 = r7.A05
            r3.A02(r1, r2)
            goto L_0x09fe
        L_0x0a1e:
            r0 = 327980061(0x138c941d, float:3.548702E-27)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = 721792128(0x2b05ac80, float:4.7490484E-13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            X.JcS r0 = (X.C59960JcS) r0
            X.C59960JcS.A00(r0)
            r0 = -520757644(0xffffffffe0f5de74, float:-1.417338E20)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -936543642(0xffffffffc82d7a66, float:-177641.6)
            goto L_0x1679
        L_0x0a3e:
            r0 = -1357434799(0xffffffffaf173051, float:-1.3750535E-10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Jy0 r3 = (X.C61149Jy0) r3
            r1 = 225293977(0xd6db699, float:7.3251057E-31)
            int r8 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r7 = r2.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r7 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r7
            com.instagram.common.session.UserSession r6 = r7.A0B
            X.0Tu r1 = X.0Tu.A05
            r4 = 36329723902837029(0x8111b100044125, double:3.038401911985842E-306)
            boolean r1 = X.DbY.A1Y(r1, r6, r4)
            if (r1 == 0) goto L_0x0a83
            com.instagram.common.session.UserSession r1 = r7.A0B
            X.8jd r7 = X.C363388je.A00(r1)
            java.lang.String r1 = "DirectPrivateStoryRecipientController"
            com.facebook.common.callercontext.CallerContext r6 = com.facebook.common.callercontext.CallerContext.A01(r1)
            java.lang.String r5 = "after_new_fbc"
            r4 = 1
            X.Lpl r1 = new X.Lpl
            r1.<init>(r4, r2, r3)
            r7.A01(r6, r1, r5)
        L_0x0a78:
            r1 = -2015699862(0xffffffff87dadc6a, float:-3.2930542E-34)
            X.AnonymousClass0fD.A0A(r1, r8)
            r1 = 345308986(0x1494ff3a, float:1.504485E-26)
            goto L_0x191a
        L_0x0a83:
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController.A0A(r7, r3)
            goto L_0x0a78
        L_0x0a87:
            r0 = 970501987(0x39d8af63, float:4.1329404E-4)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -443434938(0xffffffffe591b846, float:-8.60178E22)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController r0 = (com.instagram.direct.fragment.recipientpicker.controller.DirectPrivateStoryRecipientController) r0
            X.K9I r0 = r0.A0H
            r0.A06()
            r0 = 1906338959(0x71a06c8f, float:1.5887629E30)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -495335224(0xffffffffe279c8c8, float:-1.1519268E21)
            goto L_0x1679
        L_0x0aa9:
            r0 = -1160057498(0xffffffffbadaed66, float:-0.001670283)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.AY0 r3 = (X.AY0) r3
            r1 = -1730479770(0xffffffff98daf966, float:-5.6603507E-24)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            java.lang.Object r4 = r2.A01
            X.LRE r4 = (X.LRE) r4
            java.util.List r3 = r3.A00
            X.Kgq r2 = X.LRE.A00(r4)
            X.Kgq r1 = X.C62500Kgq.EXPANDED
            if (r2 != r1) goto L_0x0acd
            X.Kgq r2 = X.C62500Kgq.DEFAULT
        L_0x0acd:
            X.LRE.A01(r4, r2)
            X.LBH r1 = r4.A09
            if (r1 == 0) goto L_0x0adc
            X.0qQ.A0B(r3, r5)
            X.05G r1 = r1.A09
            r1.Epw(r3)
        L_0x0adc:
            r1 = -389468287(0xffffffffe8c92f81, float:-7.6005756E24)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = -2000716382(0xffffffff88bf7da2, float:-1.15249305E-33)
            goto L_0x191a
        L_0x0ae7:
            r0 = 547155841(0x209cef81, float:2.6585918E-19)
            int r0 = X.AnonymousClass0fD.A03(r0)
            r1 = -399238858(0xffffffffe8341936, float:-3.401964E24)
            int r4 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r5 = r2.A01
            X.K6A r5 = (X.K6A) r5
            X.K6A.A04(r5)
            X.0hq r2 = r5.getChildFragmentManager()
            X.0qQ.A07(r2)
            r1 = 2131443704(0x7f0b3ff8, float:1.8509484E38)
            androidx.fragment.app.Fragment r1 = r2.A0P(r1)
            if (r1 == 0) goto L_0x0b0f
            X.JTU.A0q(r1, r2)
        L_0x0b0f:
            X.JWG r2 = r5.A08
            if (r2 == 0) goto L_0x0b18
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A08(r1)
        L_0x0b18:
            X.3Q2 r2 = X.JTT.A0f(r5)
            android.content.Context r1 = r5.getContext()
            X.4cJ r1 = (X.C267844cJ) r1
            if (r2 == 0) goto L_0x0b36
            if (r1 == 0) goto L_0x0b36
            X.82p r1 = r1.Ajn()
            X.82q r1 = r1.A00()
            com.instagram.creation.base.VideoSession r1 = X.JWE.A03(r1)
            float r1 = r1.A00
            r2.A02 = r1
        L_0x0b36:
            android.content.Context r1 = r5.requireContext()
            X.82q r1 = X.JTU.A0L(r1)
            X.JWE r1 = (X.JWE) r1
            com.instagram.creation.base.CreationSession r1 = r1.A01
            boolean r3 = r1.A0I
            X.0eM r1 = r5.A0O
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            if (r3 == 0) goto L_0x0b5f
            X.KPF r1 = new X.KPF
            r1.<init>()
        L_0x0b51:
            X.C59888JbD.A01(r2, r1)
            r1 = 1952312117(0x745deb35, float:7.032887E31)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 874291217(0x341ca011, float:1.4586864E-7)
            goto L_0x191a
        L_0x0b5f:
            X.KPK r1 = new X.KPK
            r1.<init>()
            goto L_0x0b51
        L_0x0b65:
            r0 = -1723298890(0xffffffff99488bb6, float:-1.0367972E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.LfZ r3 = (X.C64647LfZ) r3
            r1 = -89745918(0xfffffffffaa69602, float:-4.324819E35)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.lang.Integer r1 = r3.A00
            int r3 = r1.intValue()
            if (r3 == r4) goto L_0x0b97
            r1 = 2
            if (r3 != r1) goto L_0x0b8c
            java.lang.Object r2 = r2.A01
            X.JjG r2 = (X.C60313JjG) r2
            r1 = 1
            X.C60313JjG.A02(r2, r1)
        L_0x0b8c:
            r1 = -383054482(0xffffffffe92b0d6e, float:-1.2924358E25)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 80552009(0x4cd2049, float:4.8224918E-36)
            goto L_0x191a
        L_0x0b97:
            java.lang.Object r1 = r2.A01
            X.JjG r1 = (X.C60313JjG) r1
            X.C60313JjG.A02(r1, r4)
            goto L_0x0b8c
        L_0x0b9f:
            r0 = 442264647(0x1a5c6c47, float:4.55824E-23)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfe r3 = (X.C64652Lfe) r3
            r1 = -1600043932(0xffffffffa0a14464, float:-2.7319718E-19)
            int r5 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r4 = r2.A01
            X.JjG r4 = (X.C60313JjG) r4
            boolean r1 = r3.A00
            X.LE1 r2 = r4.A02
            r6 = 1
            r2.A05 = r6
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.A00 = r1
            X.05G r4 = r4.A06
        L_0x0bc2:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            X.JU0 r2 = (X.JU0) r2
            int r1 = r2.A01
            int r10 = r1 + 1
            java.lang.Object r9 = r2.A02
            X.MXB r9 = (X.MXB) r9
            java.lang.Object r8 = r2.A03
            X.LE1 r8 = (X.LE1) r8
            boolean r11 = r2.A05
            boolean r12 = r2.A04
            X.0qQ.A0B(r8, r6)
            X.JU0 r7 = new X.JU0
            r7.<init>((X.LE1) r8, (X.MXB) r9, (int) r10, (boolean) r11, (boolean) r12)
            boolean r1 = r4.AIY(r3, r7)
            if (r1 == 0) goto L_0x0bc2
            r1 = -1002731858(0xffffffffc43b86ae, float:-750.1044)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -1775179233(0xffffffff9630ea1f, float:-1.4291042E-25)
            goto L_0x191a
        L_0x0bf2:
            r0 = -95145111(0xfffffffffa543369, float:-2.7545241E35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfn r3 = (X.C64661Lfn) r3
            r1 = 1923913603(0x72ac9783, float:6.837067E30)
            int r4 = X.AnonymousClass7TG.A0D(r3, r1)
            boolean r11 = r3.A00
            java.lang.Object r1 = r2.A01
            X.JjG r1 = (X.C60313JjG) r1
            X.05G r3 = r1.A05
        L_0x0c0a:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.Jur r1 = (X.C60995Jur) r1
            boolean r9 = r1.A06
            boolean r10 = r1.A04
            X.5wF r6 = r1.A00
            java.lang.String r8 = r1.A02
            X.EZv r7 = r1.A01
            boolean r12 = r1.A05
            X.Jur r5 = new X.Jur
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            boolean r1 = r3.AIY(r2, r5)
            if (r1 == 0) goto L_0x0c0a
            r1 = -97806108(0xfffffffffa2b98e4, float:-2.2274594E35)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 2139335419(0x7f83aafb, float:NaN)
            goto L_0x191a
        L_0x0c33:
            r0 = 1323812461(0x4ee7c66d, float:1.94427046E9)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.LfX r3 = (X.C64645LfX) r3
            r1 = -575156024(0xffffffffddb7d0c8, float:-1.6556633E18)
            int r4 = X.AnonymousClass0fD.A03(r1)
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.Object r1 = r2.A01
            X.K66 r1 = (X.K66) r1
            X.KNs r1 = X.K66.A06(r1)
            X.KO9 r2 = r1.A0C
            X.JwI r1 = r3.A00
            X.JwD r5 = r2.A06()
            if (r1 == 0) goto L_0x0c79
            java.lang.Object r1 = r1.A00
            X.Khl r1 = (X.C62555Khl) r1
            if (r1 == 0) goto L_0x0c79
            java.lang.String r7 = r1.A00
        L_0x0c61:
            r6 = 0
            r10 = -1048577(0xffffffffffefffff, float:NaN)
            r8 = r6
            r9 = r6
            X.JwD r1 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, (X.C59721JVf) null, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r5, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, r6, r7, r8, (java.lang.String) null, (java.util.List) null, (java.util.List) null, r9, (java.util.List) null, (java.util.List) null, (X.0eP) null, r10, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r2.A09(r1)
            r1 = 1484423487(0x587a813f, float:1.10173206E15)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = 1089242776(0x40ec8698, float:7.39143)
            goto L_0x191a
        L_0x0c79:
            r7 = 0
            goto L_0x0c61
        L_0x0c7b:
            r0 = -1558495606(0xffffffffa31b3e8a, float:-8.41581E-18)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.8No r3 = (X.C354838No) r3
            r1 = -848822890(0xffffffffcd67fd96, float:-2.43259744E8)
            int r17 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            X.3Ii r4 = r3.A00
            boolean r1 = r4 instanceof X.C297815sO
            if (r1 != 0) goto L_0x0e2d
            java.lang.String r1 = r3.A01
            java.lang.String r12 = "reels"
            boolean r1 = X.0qQ.A0K(r1, r12)
            if (r1 == 0) goto L_0x0e2d
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0dfa
            X.3Ih r4 = (X.C239793Ih) r4
            if (r4 == 0) goto L_0x0dfa
            java.lang.Object r1 = r4.A00
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0dfa
            java.lang.Object r1 = X.00k.A0J(r1)
            X.Koi r1 = (X.C62930Koi) r1
            if (r1 != 0) goto L_0x0cc2
            r2 = 233480884(0xdeaa2b4, float:1.4460533E-30)
        L_0x0cb8:
            r1 = r17
            X.AnonymousClass0fD.A0A(r2, r1)
            r1 = -1024866887(0xffffffffc2e9c5b9, float:-116.88618)
            goto L_0x191a
        L_0x0cc2:
            java.util.List r6 = r1.A02
            X.0qQ.A07(r6)
            boolean r1 = X.AnonymousClass7TE.A1b(r6)
            if (r1 == 0) goto L_0x0e2d
            java.lang.Object r2 = r2.A01
            X.K66 r2 = (X.K66) r2
            X.3Q2 r1 = X.C61829KNs.A02(r2)
            if (r1 == 0) goto L_0x0e2d
            X.KNs r1 = X.K66.A06(r2)
            X.KOi r1 = r1.A0V
            X.0iw r11 = r2.A0N
            X.0qQ.A0B(r11, r5)
            r15 = 1
            X.3Q2 r2 = r1.A01
            r8 = 0
            if (r2 == 0) goto L_0x0d14
            X.Jw0 r4 = r2.A0q
        L_0x0cea:
            com.instagram.common.session.UserSession r2 = r1.A06
            r36 = r2
            java.lang.String r2 = r1.A08
            r35 = r2
            java.util.List r9 = r1.A05
            r34 = 4
            if (r4 == 0) goto L_0x0cfe
            java.lang.Object r7 = r4.A01
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L_0x0d00
        L_0x0cfe:
            X.0sn r7 = X.0sn.A00
        L_0x0d00:
            r13 = 10
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x0d0a:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0d16
            X.JTU.A1K(r3, r10)
            goto L_0x0d0a
        L_0x0d14:
            r4 = r8
            goto L_0x0cea
        L_0x0d16:
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x0d1e:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0d28
            X.JTT.A1U(r2, r10)
            goto L_0x0d1e
        L_0x0d28:
            java.util.List r7 = X.LTX.A08(r6)
            java.util.Iterator r16 = r7.iterator()
        L_0x0d30:
            boolean r7 = r16.hasNext()
            if (r7 == 0) goto L_0x0db0
            java.lang.Object r7 = r16.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTag r7 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r7
            java.lang.String r14 = X.JTT.A0n(r7)
            java.lang.String r10 = X.JTT.A0n(r7)
            boolean r10 = r3.contains(r10)
            if (r10 != 0) goto L_0x0d30
            boolean r10 = r9.contains(r14)
            if (r10 != 0) goto L_0x0d30
            com.instagram.user.model.Product r10 = r7.A07()
            com.instagram.user.model.User r10 = r10.A0B
            if (r10 == 0) goto L_0x0d30
            java.lang.String r25 = X.AnonymousClass3ZA.A00(r10)
            if (r25 == 0) goto L_0x0d30
            java.lang.String r24 = X.JTT.A0n(r7)
            com.instagram.user.model.Product r10 = r7.A07()
            java.lang.String r10 = r10.A0J
            r18 = r10
            com.instagram.user.model.Product r10 = r7.A07()
            com.instagram.user.model.ProductDetailsProductItemDict r14 = r10.A01
            X.Khv r22 = X.C62565Khv.AUTO_TAG
            r30 = 112(0x70, float:1.57E-43)
            X.BBU r10 = new X.BBU
            r21 = r10
            r23 = r14
            r26 = r18
            r27 = r8
            r28 = r8
            r29 = r8
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r2.add(r10)
            java.lang.String r27 = X.JTT.A0n(r7)
            java.lang.String r28 = X.JTT.A0n(r7)
            java.lang.Float r23 = r7.A08()
            android.graphics.PointF r7 = r7.A00
            java.lang.String r26 = "add"
            java.lang.String r31 = "seller"
            r21 = r36
            r24 = r8
            r25 = r35
            r30 = r12
            r32 = r5
            r33 = r5
            r18 = r7
            r19 = r8
            r20 = r11
            X.LTQ.A04(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            goto L_0x0d30
        L_0x0db0:
            r3 = 0
            if (r4 == 0) goto L_0x0df7
            java.lang.String r8 = r4.A03
            java.lang.Object r9 = r4.A00
            java.lang.String r5 = r4.A04
            java.lang.String r3 = r4.A02
        L_0x0dbb:
            X.Jw0 r7 = new X.Jw0
            r28 = r7
            r29 = r9
            r30 = r2
            r31 = r5
            r32 = r8
            r33 = r3
            r28.<init>(r29, r30, r31, r32, r33, r34)
            X.3Q2 r2 = r1.A01
            if (r2 == 0) goto L_0x0dff
            java.util.ArrayList r2 = r2.A43
            if (r2 == 0) goto L_0x0dff
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r9 = r2.iterator()
        L_0x0ddc:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x0e01
            java.lang.Object r8 = r9.next()
            r2 = r8
            com.instagram.tagging.api.model.MediaSuggestedProductTag r2 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r2
            X.Khv r3 = r2.A01
            X.Khv r2 = X.C62565Khv.AUTO_TAG
            if (r3 == r2) goto L_0x0df3
            X.Khv r2 = X.C62565Khv.AUTO_PLACE
            if (r3 != r2) goto L_0x0ddc
        L_0x0df3:
            r5.add(r8)
            goto L_0x0ddc
        L_0x0df7:
            r9 = r8
            r5 = r8
            goto L_0x0dbb
        L_0x0dfa:
            r2 = -299354420(0xffffffffee2836cc, float:-1.3014932E28)
            goto L_0x0cb8
        L_0x0dff:
            X.0sn r5 = X.0sn.A00
        L_0x0e01:
            boolean r2 = r5.isEmpty()
            if (r2 == 0) goto L_0x0ef3
            r5 = r6
        L_0x0e08:
            java.util.List r2 = X.00k.A0a(r5)
            X.C61844KOi.A00(r1, r2)
            java.lang.Object r5 = r7.A01
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x0e2d
            boolean r2 = X.AnonymousClass7TE.A1b(r5)
            if (r2 == 0) goto L_0x0e2d
            if (r4 == 0) goto L_0x0e32
            java.lang.Object r2 = r4.A01
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0e32
            int r3 = r2.size()
            int r2 = r5.size()
            if (r3 != r2) goto L_0x0e32
        L_0x0e2d:
            r2 = -649904626(0xffffffffd9433e0e, float:-3.43474064E15)
            goto L_0x0cb8
        L_0x0e32:
            X.3Q2 r2 = r1.A01
            if (r2 == 0) goto L_0x0e38
            r2.A0q = r7
        L_0x0e38:
            X.JwD r4 = r1.A06()
            r3 = 0
            r2 = -1025(0xfffffffffffffbff, float:NaN)
            X.JwD r2 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, r3, (X.C59721JVf) null, (X.C61046Jvk) null, r3, (X.C61079JwH) null, r7, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r4, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (java.util.List) null, (X.0eP) null, r2, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            r1.A09(r2)
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r5 = r1.A02
            r8 = 0
            if (r5 != 0) goto L_0x0e65
            java.util.List r2 = X.LTX.A08(r6)
            java.util.ArrayList r7 = X.AnonymousClass7TF.A0p(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x0e57:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0e8f
            com.instagram.user.model.Product r2 = X.JTU.A0Q(r3)
            r7.add(r2)
            goto L_0x0e57
        L_0x0e65:
            java.util.List r7 = X.C64032LJw.A00(r5)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 != 0) goto L_0x0e71
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
        L_0x0e71:
            java.util.Iterator r6 = r6.iterator()
        L_0x0e75:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0e8f
            com.instagram.user.model.Product r4 = X.JTU.A0Q(r6)
            if (r4 == 0) goto L_0x0e8b
            java.util.Map r3 = r5.A04
            java.lang.String r2 = r4.A0H
            boolean r2 = r3.containsKey(r2)
            if (r2 != 0) goto L_0x0e75
        L_0x0e8b:
            r7.add(r4)
            goto L_0x0e75
        L_0x0e8f:
            int r2 = X.0Yv.A1E(r7, r13)
            int r2 = X.AnonymousClass7TG.A01(r2)
            java.util.LinkedHashMap r10 = X.DbS.A0x(r2)
            java.util.Iterator r4 = r7.iterator()
        L_0x0e9f:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0eb2
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.instagram.user.model.Product r2 = (com.instagram.user.model.Product) r2
            java.lang.String r2 = r2.A0H
            r10.put(r2, r3)
            goto L_0x0e9f
        L_0x0eb2:
            if (r5 == 0) goto L_0x0eb8
            java.util.Map r3 = r5.A03
            if (r3 != 0) goto L_0x0ebc
        L_0x0eb8:
            X.0sm r3 = X.0Yt.A0E()
        L_0x0ebc:
            if (r5 == 0) goto L_0x0ec2
            java.util.Map r2 = r5.A02
            if (r2 != 0) goto L_0x0ec6
        L_0x0ec2:
            X.0sm r2 = X.0Yt.A0E()
        L_0x0ec6:
            if (r5 == 0) goto L_0x0ecc
            java.util.List r9 = r5.A01
            if (r9 != 0) goto L_0x0ed0
        L_0x0ecc:
            X.0sn r9 = X.0sn.A00
            if (r5 == 0) goto L_0x0ed2
        L_0x0ed0:
            com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta r8 = r5.A00
        L_0x0ed2:
            com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState r7 = new com.instagram.shopping.model.taggingfeed.TaggingFeedMultiSelectState
            r11 = r3
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            r1.A02 = r7
            X.05G r5 = r1.A09
            java.lang.Object r1 = r5.getValue()
            X.KO5 r1 = (X.KO5) r1
            boolean r4 = r1.A02
            X.Jw0 r3 = r1.A00
            java.util.List r2 = r1.A01
            X.KO5 r1 = new X.KO5
            r1.<init>(r3, r2, r4, r15)
            r5.Epw(r1)
            goto L_0x0e2d
        L_0x0ef3:
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x0e08
            boolean r2 = r6 instanceof java.util.ArrayList
            if (r2 == 0) goto L_0x0f02
            r9 = r6
            java.util.AbstractCollection r9 = (java.util.AbstractCollection) r9
            if (r9 != 0) goto L_0x0f06
        L_0x0f02:
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
        L_0x0f06:
            java.util.ArrayList r8 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r3 = r6.iterator()
        L_0x0f0e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x0f1e
            com.instagram.user.model.Product r2 = X.JTU.A0Q(r3)
            java.lang.String r2 = r2.A0H
            r8.add(r2)
            goto L_0x0f0e
        L_0x0f1e:
            java.util.Iterator r5 = r5.iterator()
        L_0x0f22:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L_0x0f3c
            java.lang.Object r3 = r5.next()
            com.instagram.tagging.api.model.MediaSuggestedProductTag r3 = (com.instagram.tagging.api.model.MediaSuggestedProductTag) r3
            java.lang.String r2 = X.JTT.A0n(r3)
            boolean r2 = r8.contains(r2)
            if (r2 != 0) goto L_0x0f22
            r9.add(r3)
            goto L_0x0f22
        L_0x0f3c:
            r5 = r9
            goto L_0x0e08
        L_0x0f3f:
            r0 = 1036904561(0x3dcde871, float:0.100541)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfq r3 = (X.C64664Lfq) r3
            r1 = 1244019060(0x4a263974, float:2723421.0)
            int r4 = X.AnonymousClass7TG.A0D(r3, r1)
            X.LB3 r3 = r3.A00
            java.lang.Object r1 = r2.A01
            X.K66 r1 = (X.K66) r1
            X.MXh r2 = X.K66.A03(r1)
            java.lang.String r6 = r3.A04
            java.lang.String r11 = r3.A03
            java.lang.String r7 = r3.A06
            java.lang.Integer r1 = r3.A01
            int r15 = X.DbX.A01(r1)
            java.lang.String r8 = r3.A07
            java.lang.Boolean r1 = r3.A00
            boolean r16 = X.AnonymousClass7TG.A1X(r1)
            java.util.List r14 = r3.A08
            java.lang.String r13 = r3.A02
            java.lang.String r9 = r3.A05
            r10 = 0
            com.instagram.model.fundraiser.NewFundraiserInfo r5 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r12 = r10
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r2.FKr(r5)
            r1 = -935353585(0xffffffffc83fa30f, float:-196236.23)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -259260082(0xfffffffff08c014e, float:-3.4663583E29)
            goto L_0x191a
        L_0x0f88:
            r0 = 1082539532(0x40863e0c, float:4.195074)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r1 = -756485048(0xffffffffd2e8f448, float:-5.00265386E11)
            int r4 = X.AnonymousClass7TG.A0D(r3, r1)
            X.L7w r5 = new X.L7w
            r5.<init>()
            java.util.List r1 = r3.A02
            r5.A02 = r1
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r1 = r3.A00
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = r1.F0x()
            r5.A00 = r1
            boolean r1 = r3.A03
            r5.A03 = r1
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r1 = r3.A01
            if (r1 == 0) goto L_0x101d
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = r1.F0y()
        L_0x0fb5:
            r5.A01 = r1
            java.lang.Object r1 = r2.A01
            X.K66 r1 = (X.K66) r1
            X.KNs r1 = X.K66.A06(r1)
            X.KOU r3 = r1.A0H
            r8 = 0
            r1 = 43
            X.JVf r6 = new X.JVf
            r6.<init>((int) r1, (java.lang.Object) r5, (java.lang.Object) r8)
            X.JwD r7 = r3.A06()
            r11 = -4097(0xffffffffffffefff, float:NaN)
            r9 = r8
            r10 = r8
            X.JwD r6 = X.C61075JwD.A00((X.AnonymousClass9J6) null, (X.C61080JwI) null, (X.C61066Jw4) null, r6, (X.C61046Jvk) null, (X.C61077JwF) null, (X.C61079JwH) null, (X.C61062Jw0) null, (X.C61100JxB) null, (com.instagram.api.schemas.MediaGenAIDetectionMethod) null, (X.C61000Juw) null, (X.Jv3) null, r7, (X.AnonymousClass3QO) null, (com.instagram.model.venue.Venue) null, (com.instagram.music.common.model.AudioOverlayTrack) null, (com.instagram.pendingmedia.model.ClipInfo) null, (X.C272024jy) null, (com.instagram.user.model.UpcomingEvent) null, (java.lang.String) null, r8, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, r9, (java.util.List) null, r10, (java.util.List) null, (X.0eP) null, r11, 262143, false, false, false, false, false, false, false, false, false, false, false, false, false)
            X.3Q2 r2 = r3.A0A()
            boolean r1 = r5.A03
            r2.A5i = r1
            X.3Q2 r2 = r3.A0A()
            java.util.List r1 = r5.A02
            r2.A4C = r1
            X.3Q2 r2 = r3.A0A()
            com.instagram.api.schemas.BrandedContentGatingInfo r1 = r5.A00
            r2.A0s = r1
            X.3Q2 r2 = r3.A0A()
            com.instagram.api.schemas.BrandedContentProjectMetadata r1 = r5.A01
            r2.A0t = r1
            X.3Q2 r2 = r3.A0A()
            java.util.List r1 = r5.A02
            java.lang.Object r1 = X.00k.A0J(r1)
            com.instagram.pendingmedia.model.BrandedContentTag r1 = (com.instagram.pendingmedia.model.BrandedContentTag) r1
            if (r1 == 0) goto L_0x101b
            boolean r1 = r1.A04
        L_0x1005:
            r2.A65 = r1
            X.3Q2 r1 = r3.A0A()
            r3.A00 = r1
            r3.A09(r6)
            r1 = 1949487617(0x7432d201, float:5.6670424E31)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -1118953707(0xffffffffbd4e1f15, float:-0.05032261)
            goto L_0x191a
        L_0x101b:
            r1 = 0
            goto L_0x1005
        L_0x101d:
            r1 = 0
            goto L_0x0fb5
        L_0x101f:
            r0 = -242692919(0xfffffffff188ccc9, float:-1.354801E30)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Jy0 r3 = (X.C61149Jy0) r3
            r1 = -1666421674(0xffffffff9cac6c56, float:-1.1410009E-21)
            int r6 = X.AnonymousClass0fD.A03(r1)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            java.lang.Object r8 = r2.A01
            X.K66 r8 = (X.K66) r8
            X.0eM r9 = r8.A0T
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r9)
            X.0Tu r4 = X.0Tu.A05
            r1 = 36329723902837029(0x8111b100044125, double:3.038401911985842E-306)
            boolean r1 = X.182.A06(r4, r5, r1)
            if (r1 == 0) goto L_0x106d
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r9)
            X.8jd r5 = X.C363388je.A00(r1)
            java.lang.String r1 = "ClipsPublishScreenFragment"
            com.facebook.common.callercontext.CallerContext r4 = com.facebook.common.callercontext.CallerContext.A01(r1)
            java.lang.String r2 = "after_new_fbc"
            X.Lpl r1 = new X.Lpl
            r1.<init>(r7, r3, r8)
            r5.A01(r4, r1, r2)
        L_0x1062:
            r1 = 633315551(0x25bfa0df, float:3.324223E-16)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 929663447(0x376989d7, float:1.3919976E-5)
            goto L_0x191a
        L_0x106d:
            X.K66.A0K(r8, r3)
            goto L_0x1062
        L_0x1071:
            r0 = -1051109031(0xffffffffc1595959, float:-13.584313)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lfp r3 = (X.C64663Lfp) r3
            r0 = -985724629(0xffffffffc53f092b, float:-3056.573)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            X.K66 r0 = (X.K66) r0
            X.MXh r1 = X.K66.A03(r0)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = r3.A00
            r1.FKU(r0)
            r0 = -313480662(0xffffffffed50aa2a, float:-4.0361624E27)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1423420812(0x54d7ad8c, float:7.4106368E12)
            goto L_0x1679
        L_0x1099:
            r0 = 2075697287(0x7bb8a087, float:1.917277E36)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lg3 r3 = (X.C64677Lg3) r3
            r1 = 82590961(0x4ec3cf1, float:5.55393E-36)
            int r6 = X.AnonymousClass0fD.A03(r1)
            java.lang.Object r7 = r2.A01
            X.K5H r7 = (X.K5H) r7
            com.instagram.actionbar.ActionButton r1 = r7.A0A
            r5 = 0
            if (r1 == 0) goto L_0x10b5
            r1.setDisplayedChild(r5)
        L_0x10b5:
            java.lang.String r1 = r3.A01
            r4 = 1
            X.K9J r2 = r7.A0E
            if (r1 != 0) goto L_0x10db
            java.util.List r1 = r2.A03
            r1.clear()
            java.util.List r1 = r2.A04
            r1.clear()
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            r2.A01(r1)
            r2.A02(r4)
        L_0x10d0:
            r1 = -1436831235(0xffffffffaa5bb1fd, float:-1.951286E-13)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 879075508(0x3465a0b4, float:2.138575E-7)
            goto L_0x191a
        L_0x10db:
            r2.A02(r5)
            java.lang.String r1 = r7.A0M
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x10d0
            java.util.List r5 = r3.A02
            if (r5 == 0) goto L_0x110a
            X.LET r4 = r7.A0D
            java.lang.String r2 = r7.A0M
            if (r2 != 0) goto L_0x10f2
            java.lang.String r2 = ""
        L_0x10f2:
            java.lang.String r1 = r3.A00
            r4.A01(r2, r1, r5)
            X.K9J r2 = r7.A0E
            java.util.List r1 = r2.A03
            r1.clear()
            java.util.List r1 = r2.A04
            r1.clear()
            r2.A01(r5)
            r2.notifyDataSetChanged()
            goto L_0x10d0
        L_0x110a:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()
            X.K5H.A0A(r7, r1, r4)
            goto L_0x10d0
        L_0x1112:
            r0 = -1775612664(0xffffffff962a4d08, float:-1.3756797E-25)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Jy0 r3 = (X.C61149Jy0) r3
            r1 = -618396257(0xffffffffdb24059f, float:-4.6168077E16)
            int r5 = X.AnonymousClass0fD.A03(r1)
            r4 = 0
            X.0qQ.A0B(r3, r4)
            java.lang.Integer r1 = r3.A00
            if (r1 == 0) goto L_0x11a8
            int r1 = r1.intValue()
            r12 = 1
            if (r1 != r4) goto L_0x11a8
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            java.lang.String r11 = "after_new_fbc"
            X.8jv r8 = X.C363548ju.A03
            java.lang.Object r6 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r6 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r6
            X.0eM r7 = r6.A0f
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r7)
            r10 = 0
            r13 = r12
            r8.A01(r9, r10, r11, r12, r13)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.8ju r2 = X.LJr.A00(r1)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            r2.A01(r1, r11, r12)
            boolean r1 = X.LTP.A0A(r6)
            if (r1 == 0) goto L_0x1167
            X.1Ng r2 = X.JTQ.A0F(r6)
            X.Lfn r1 = new X.Lfn
            r1.<init>(r12)
            r2.A00(r1)
        L_0x1167:
            com.facebook.common.callercontext.CallerContext r1 = X.C62052KYa.A02
            android.content.Context r1 = r6.requireContext()
            X.LRS.A01(r1, r3, r4)
        L_0x1170:
            X.Loa r2 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r6)
            X.EXN r1 = X.EXN.SHARE_PHOTO
            java.lang.String r1 = r1.A01()
            r2.A04(r1)
            boolean r1 = X.LTP.A0A(r6)
            if (r1 != 0) goto L_0x119d
            X.0eM r1 = r6.A0f
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x119d
            X.Loa r1 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A01(r6)
            r1.A02()
        L_0x119d:
            r1 = -1424434758(0xffffffffab18d9ba, float:-5.4303404E-13)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 374299587(0x164f5bc3, float:1.6750282E-25)
            goto L_0x191a
        L_0x11a8:
            com.facebook.common.callercontext.CallerContext r1 = X.C62052KYa.A02
            java.lang.Object r6 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r6 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r6
            android.content.Context r2 = r6.requireContext()
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            X.LRS.A01(r2, r1, r4)
            goto L_0x1170
        L_0x11b8:
            r0 = 88975679(0x54da93f, float:9.670139E-36)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.LfZ r3 = (X.C64647LfZ) r3
            r0 = -1468269662(0xffffffffa87bfba2, float:-1.3987863E-14)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            X.M75 r0 = new X.M75
            r0.<init>(r1, r3)
            X.11Z.A02(r0)
            r0 = -2043813444(0xffffffff862de1bc, float:-3.2703527E-35)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 310439481(0x1280ee39, float:8.136662E-28)
            goto L_0x1679
        L_0x11df:
            r0 = 1728745357(0x670a8f8d, float:6.543346E23)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -2133408947(0xffffffff80d6c34d, float:-1.9722857E-38)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0E(r0)
            r0 = -1285356348(0xffffffffb36304c4, float:-5.285689E-8)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 795201157(0x2f65ce85, float:2.0900799E-10)
            goto L_0x1679
        L_0x11ff:
            r0 = 1827334776(0x6ceaea78, float:2.2719671E27)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lg8 r3 = (X.Lg8) r3
            r0 = 1470447299(0x57a53ec3, float:3.63377956E14)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.3Q2 r1 = X.LRK.A00(r0)
            boolean r0 = r3.A00
            r1.A51 = r0
            r0 = 1459010088(0x56f6ba28, float:1.35639698E14)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1840984955(0xffffffff9244cc85, float:-6.2098785E-28)
            goto L_0x1679
        L_0x1226:
            r0 = 923296849(0x37086451, float:8.129588E-6)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lfg r3 = (X.C64654Lfg) r3
            r0 = 936782246(0x37d629a6, float:2.5530182E-5)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r0)
            X.KOe r1 = r0.A07
            java.lang.String r0 = r3.A00
            r1.A0B(r0)
            r0 = -852507702(0xffffffffcd2fc3ca, float:-1.84302752E8)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1882038824(0x702da228, float:2.1494777E29)
            goto L_0x1679
        L_0x1250:
            r0 = 2045758078(0x79efca7e, float:1.5563325E35)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.LfX r3 = (X.C64645LfX) r3
            r1 = -1044451569(0xffffffffc1beef0f, float:-23.866728)
            int r4 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            X.JwI r1 = r3.A00
            X.3Q2 r2 = X.LRK.A00(r2)
            if (r1 == 0) goto L_0x1281
            java.lang.Object r1 = r1.A00
            X.Khl r1 = (X.C62555Khl) r1
            if (r1 == 0) goto L_0x1281
            java.lang.String r1 = r1.A00
        L_0x1274:
            r2.A3G = r1
            r1 = -1412902046(0xffffffffabc8d362, float:-1.4269525E-12)
            X.AnonymousClass0fD.A0A(r1, r4)
            r1 = -332790861(0xffffffffec2a03b3, float:-8.221394E26)
            goto L_0x191a
        L_0x1281:
            r1 = 0
            goto L_0x1274
        L_0x1283:
            r0 = 425487584(0x195c6ce0, float:1.13957206E-23)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfr r3 = (X.C64665Lfr) r3
            r0 = -1893290576(0xffffffff8f26adb0, float:-8.217883E-30)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            boolean r0 = X.LTP.A0A(r2)
            if (r0 != 0) goto L_0x12b7
            X.LE1 r1 = r2.A0D
            if (r1 == 0) goto L_0x12a5
            boolean r0 = r3.A00
            r1.A03 = r0
        L_0x12a5:
            X.LFW r0 = r2.shareToBarcelonaViewBinder
            if (r0 == 0) goto L_0x12ac
            r0.A00()
        L_0x12ac:
            r0 = -1291302276(0xffffffffb3084a7c, float:-3.173271E-8)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1027353009(0xffffffffc2c3d64f, float:-97.91857)
            goto L_0x1805
        L_0x12b7:
            X.KNr r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A03(r2)
            X.KOP r0 = r0.A0D
            X.JjG r2 = r0.A02
            boolean r1 = r3.A00
            X.LE1 r0 = r2.A02
            r0.A03 = r1
            r2.A04()
            goto L_0x12ac
        L_0x12c9:
            r0 = 1360549244(0x5118557c, float:4.0891826E10)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfq r3 = (X.C64664Lfq) r3
            r1 = -107728220(0xfffffffff99432a4, float:-9.618588E34)
            int r1 = X.AnonymousClass0fD.A03(r1)
            r5 = 0
            X.0qQ.A0B(r3, r5)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            X.KOf r2 = X.C60102Jfi.A00(r2)
            X.LB3 r4 = r3.A00
            X.0qQ.A0B(r4, r5)
            java.lang.String r5 = r4.A04
            java.lang.Integer r3 = r4.A01
            if (r3 == 0) goto L_0x1337
            int r14 = r3.intValue()
        L_0x12f4:
            java.lang.String r6 = r4.A06
            java.lang.String r7 = r4.A07
            java.lang.Boolean r3 = r4.A00
            boolean r15 = X.C51972G9s.A1Z(r3)
            java.lang.String r8 = r4.A05
            java.lang.String r10 = r4.A03
            java.util.List r13 = r4.A08
            com.instagram.model.fundraiser.FundraiserCampaignTypeEnum r3 = com.instagram.model.fundraiser.FundraiserCampaignTypeEnum.IG_STANDALONE_FOR_CHARITY
            java.lang.String r11 = r3.toString()
            r12 = 0
            java.lang.String r9 = "FEED_COMPOSER"
            com.instagram.model.fundraiser.NewFundraiserInfo r4 = new com.instagram.model.fundraiser.NewFundraiserInfo
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A02 = r4
            r5 = 1
            X.C62915KoT.A00 = r5
            com.instagram.common.session.UserSession r3 = r2.A0C
            X.1Ng r4 = X.AnonymousClass1Nd.A00(r3)
            X.Lfr r3 = new X.Lfr
            r3.<init>(r5)
            r4.A00(r3)
            X.4Cq r4 = r2.A0F
            r3 = 38
            X.MH9.A04(r2, r4, r3)
            r2 = -251538856(0xfffffffff101d258, float:-6.428457E29)
            X.AnonymousClass0fD.A0A(r2, r1)
            r1 = -2093831230(0xffffffff8332abc2, float:-5.2506667E-37)
            goto L_0x191a
        L_0x1337:
            r14 = -1
            goto L_0x12f4
        L_0x1339:
            r0 = 267004168(0xfea2908, float:2.3089986E-29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfn r3 = (X.C64661Lfn) r3
            r1 = 829665319(0x3173b027, float:3.5461285E-9)
            int r5 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            boolean r1 = X.LTP.A0A(r2)
            if (r1 != 0) goto L_0x135e
            X.EZv r4 = X.C48153EZv.A05
            X.3Q2 r2 = X.LRK.A00(r2)
            boolean r1 = r3.A00
            r4.A06(r2, r1)
        L_0x135e:
            r1 = 1488224105(0x58b47f69, float:1.58767452E15)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -920224503(0xffffffffc9267d09, float:-681936.56)
            goto L_0x191a
        L_0x1369:
            r0 = 2004507897(0x777a5cf9, float:5.0779685E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.LfC r3 = (X.C64624LfC) r3
            r0 = -1226198670(0xffffffffb6e9b172, float:-6.9645985E-6)
            int r6 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.3Q2 r2 = X.LRK.A00(r0)
            boolean r0 = X.JTP.A1Z(r0)
            if (r0 == 0) goto L_0x13a2
            java.util.Iterator r4 = X.JTQ.A0g(r2)
        L_0x138b:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x13ae
            X.3Q2 r2 = X.JTO.A0m(r4)
            java.util.LinkedHashMap r1 = r3.A00
            java.lang.String r0 = r2.A35
            java.lang.String r0 = X.DbS.A0r(r0, r1)
            if (r0 == 0) goto L_0x138b
            r2.A2j = r0
            goto L_0x138b
        L_0x13a2:
            java.util.LinkedHashMap r1 = r3.A00
            java.lang.String r0 = r2.A35
            java.lang.String r0 = X.DbS.A0r(r0, r1)
            if (r0 == 0) goto L_0x13ae
            r2.A2j = r0
        L_0x13ae:
            r0 = -203932809(0xfffffffff3d83b77, float:-3.4263373E31)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -786290320(0xffffffffd1222970, float:-4.3529994E10)
            goto L_0x1805
        L_0x13b9:
            r0 = 180905811(0xac86753, float:1.9298166E-32)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1555648690(0xffffffffa346af4e, float:-1.0770724E-17)
            int r1 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.KOf r0 = X.C60102Jfi.A00(r0)
            r0.A0B()
            r0 = 1332055207(0x4f658ca7, float:3.85120026E9)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 2024129169(0x78a5c291, float:2.6896102E34)
            goto L_0x1679
        L_0x13dd:
            r0 = -523638862(0xffffffffe0c9e7b2, float:-1.1639034E20)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.LfB r3 = (X.C64623LfB) r3
            r0 = -1516267087(0xffffffffa59f99b1, float:-2.7686249E-16)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.3Q2 r1 = X.LRK.A00(r0)
            boolean r0 = r3.A00
            r1.A4y = r0
            r0 = 392996624(0x176ca710, float:7.6466575E-25)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1468055049(0x5780be09, float:2.83107366E14)
            goto L_0x1679
        L_0x1404:
            r0 = 984253705(0x3aaa8509, float:0.0013009618)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lfp r3 = (X.C64663Lfp) r3
            r0 = -1670940358(0xffffffff9c67793a, float:-7.658817E-22)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r1 = 0
            X.0qQ.A0B(r3, r1)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.KOf r4 = X.C60102Jfi.A00(r0)
            com.instagram.wellbeing.fundraiser.model.ExistingStandaloneFundraiserForFeedModel r0 = r3.A00
            X.0qQ.A0B(r0, r1)
            r4.A04 = r0
            com.instagram.common.session.UserSession r0 = r4.A0C
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r0)
            r1 = 1
            X.Lfr r0 = new X.Lfr
            r0.<init>(r1)
            r2.A00(r0)
            X.4Cq r1 = r4.A0F
            r0 = 37
            X.MH9.A04(r4, r1, r0)
            r0 = 1807029398(0x6bb51496, float:4.3782558E26)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 2083358498(0x7c2d8722, float:3.6040327E36)
            goto L_0x1679
        L_0x1448:
            r0 = 1374758895(0x51f127ef, float:1.29469637E11)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = 137005528(0x82a89d8, float:5.131955E-34)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r1 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r1
            com.facebook.common.callercontext.CallerContext r0 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A10
            X.0eM r0 = r1.A0f
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.2cc r2 = X.C71342cb.A00(r0)
            androidx.fragment.app.FragmentActivity r1 = r1.getActivity()
            java.lang.String r0 = "next"
            r2.A0A(r1, r0)
            r0 = 2145121017(0x7fdbf2f9, float:NaN)
            X.AnonymousClass0fD.A0A(r0, r3)
            r0 = 1683797006(0x645cb40e, float:1.6285032E22)
            goto L_0x1679
        L_0x147a:
            r0 = -1811145377(0xffffffff940c1d5f, float:-7.073986E-27)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r0 = -1372762140(0xffffffffae2d4fe4, float:-3.9406603E-11)
            int r4 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = (com.instagram.creation.fragment.EditMediaInfoFragment) r1
            boolean r0 = r3.A03
            r1.A0q = r0
            java.util.List r0 = r3.A02
            r1.A0g = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r3.A00
            r1.A04 = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r3.A01
            r1.A05 = r0
            r0 = -1115583033(0xffffffffbd818dc7, float:-0.0632587)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 1253286650(0x4ab3a2fa, float:5886333.0)
            goto L_0x1679
        L_0x14a9:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            X.LfC r3 = (X.C64624LfC) r3
            java.util.LinkedHashMap r1 = r3.A00
            boolean r0 = com.instagram.creation.fragment.EditMediaInfoFragment.A0P(r2)
            if (r0 == 0) goto L_0x14c1
            r2.A0f = r1
        L_0x14b9:
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            X.0hq r0 = r2.mFragmentManager
            if (r0 == 0) goto L_0x1808
            goto L_0x1503
        L_0x14c1:
            java.util.Iterator r0 = X.AnonymousClass7TF.A0s(r1)
            java.lang.Object r0 = X.C51971G9r.A0p(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0U = r0
            goto L_0x14b9
        L_0x14ce:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            X.Lfa r3 = (X.C64648Lfa) r3
            com.instagram.model.venue.Venue r1 = r3.A00
            r0 = 0
            r2.A0L = r1
            r2.A0u = r0
            android.view.View r0 = r2.mView
            if (r0 == 0) goto L_0x14e2
            com.instagram.creation.fragment.EditMediaInfoFragment.A0H(r2)
        L_0x14e2:
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            X.0hq r1 = r2.mFragmentManager
            if (r1 == 0) goto L_0x1808
            int r0 = r1.A0M()
            if (r0 <= 0) goto L_0x1808
            java.lang.Class<X.K5H> r0 = X.K5H.class
            java.lang.String r0 = r0.getCanonicalName()
            androidx.fragment.app.Fragment r0 = r1.A0R(r0)
            if (r0 == 0) goto L_0x1808
            boolean r0 = r0.isResumed()
            if (r0 == 0) goto L_0x1808
            X.0hq r0 = r2.mFragmentManager
        L_0x1503:
            r0.A0c()
            return
        L_0x1507:
            r0 = 1317857185(0x4e8ce7a1, float:1.18199514E9)
            int r9 = X.AnonymousClass0fD.A03(r0)
            r0 = -1208035588(0xffffffffb7fed6fc, float:-3.037927E-5)
            int r5 = X.AnonymousClass0fD.A03(r0)
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.AlbumEditFragment r0 = (com.instagram.creation.fragment.AlbumEditFragment) r0
            X.0eM r0 = r0.A0f
            java.lang.Object r4 = r0.getValue()
            X.JjS r4 = (X.C60323JjS) r4
            r3 = 1
            r2 = 4
            r0 = 3
            X.JVq r1 = new X.JVq
            r1.<init>((int) r2, (int) r0, (boolean) r3, (boolean) r3)
            r4.A00 = r1
            X.3ju r0 = r4.A0B
            r0.FIG(r1)
            r0 = -257616446(0xfffffffff0a515c2, float:-4.0873064E29)
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = -1350220941(0xffffffffaf854373, float:-2.4240485E-10)
            goto L_0x1679
        L_0x153b:
            r0 = -1638890655(0xffffffff9e508361, float:-1.1038597E-20)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lft r3 = (X.C64667Lft) r3
            r1 = 359236883(0x15698513, float:4.7158952E-26)
            int r7 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.String r9 = r3.A01
            if (r9 == 0) goto L_0x1583
            X.Khl[] r6 = X.C62555Khl.values()
            r5 = 0
            int r4 = r6.length
        L_0x1555:
            if (r5 >= r4) goto L_0x1583
            r8 = r6[r5]
            java.lang.String r1 = r8.A00
            boolean r1 = X.0qQ.A0K(r1, r9)
            if (r1 == 0) goto L_0x1596
            java.lang.Object r6 = r2.A01
            X.LAL r6 = (X.LAL) r6
            java.util.List r1 = r6.A04
            java.util.Iterator r5 = r1.iterator()
        L_0x156b:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x1583
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.Jvo r1 = (X.C61050Jvo) r1
            java.lang.Object r1 = r1.A05
            if (r1 != r8) goto L_0x156b
            if (r4 == 0) goto L_0x1583
            X.05G r1 = r6.A06
            r1.Epw(r4)
        L_0x1583:
            java.lang.Object r2 = r2.A01
            X.LAL r2 = (X.LAL) r2
            java.lang.String r1 = r3.A00
            r2.A00 = r1
            r1 = -938660635(0xffffffffc80d2ce5, float:-144563.58)
            X.AnonymousClass0fD.A0A(r1, r7)
            r1 = -669474112(0xffffffffd818a2c0, float:-6.7129909E14)
            goto L_0x191a
        L_0x1596:
            int r5 = r5 + 1
            goto L_0x1555
        L_0x1599:
            r0 = 1587851815(0x5ea4b227, float:5.9337954E18)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.LfX r3 = (X.C64645LfX) r3
            r0 = -990904718(0xffffffffc4effe72, float:-1919.9514)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r2 = r2.A01
            X.L9e r2 = (X.C63849L9e) r2
            X.JwI r0 = r3.A00
            if (r0 == 0) goto L_0x15cb
            java.lang.Object r0 = r0.A00
            X.Khl r0 = (X.C62555Khl) r0
            if (r0 == 0) goto L_0x15cb
            java.lang.String r1 = X.C63188Ksv.A00(r0)
        L_0x15bb:
            X.05G r0 = r2.A04
            r0.Epw(r1)
            r0 = 410929159(0x187e4807, float:3.2865095E-24)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -975098511(0xffffffffc5e12d71, float:-7205.68)
            goto L_0x1805
        L_0x15cb:
            r1 = 0
            goto L_0x15bb
        L_0x15cd:
            r0 = 1433032815(0x556a586f, float:1.61040963E13)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lfu r3 = (X.C64668Lfu) r3
            r0 = -1934924767(0xffffffff8cab6421, float:-2.6406985E-31)
            int r8 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r9 = r2.A01
            X.L9e r9 = (X.C63849L9e) r9
            java.lang.String r7 = r3.A01
            if (r7 == 0) goto L_0x1615
            X.Khl[] r6 = X.C62555Khl.values()
            r4 = 0
            int r2 = r6.length
        L_0x15eb:
            if (r4 >= r2) goto L_0x1615
            r1 = r6[r4]
            java.lang.String r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 == 0) goto L_0x1612
            java.lang.String r1 = X.C63188Ksv.A00(r1)
        L_0x15fb:
            X.05G r0 = r9.A04
            r0.Epw(r1)
            java.lang.Integer r1 = r3.A00
            X.05G r0 = r9.A05
            r0.Epw(r1)
            r0 = 1961131902(0x74e47f7e, float:1.4482782E32)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 1943447641(0x73d6a859, float:3.4013856E31)
            goto L_0x1805
        L_0x1612:
            int r4 = r4 + 1
            goto L_0x15eb
        L_0x1615:
            r1 = 0
            goto L_0x15fb
        L_0x1617:
            r0 = -1056362649(0xffffffffc1092f67, float:-8.574073)
            int r9 = X.AnonymousClass0fD.A03(r0)
            X.Jy0 r3 = (X.C61149Jy0) r3
            r0 = -1928566601(0xffffffff8d0c68b7, float:-4.3266877E-31)
            int r8 = X.AnonymousClass0fD.A03(r0)
            r7 = 0
            X.0qQ.A0B(r3, r7)
            java.lang.Object r6 = r2.A01
            X.K7n r6 = (X.C61438K7n) r6
            com.instagram.common.session.UserSession r5 = X.JTP.A0R(r6)
            X.L3w r4 = new X.L3w
            r4.<init>(r6, r3)
            X.8jd r3 = X.C363388je.A00(r5)
            com.facebook.common.callercontext.CallerContext r2 = X.C61438K7n.A0M
            java.lang.String r1 = "after_new_fbc"
            X.Lpm r0 = new X.Lpm
            r0.<init>(r7, r4, r5, r6)
            r3.A01(r2, r0, r1)
            r0 = -1769513057(0xffffffff96875f9f, float:-2.1870772E-25)
            X.AnonymousClass0fD.A0A(r0, r8)
            r0 = 463551071(0x1ba13a5f, float:2.6672937E-22)
            goto L_0x1679
        L_0x1652:
            java.lang.Class<X.Lg3> r0 = X.C64677Lg3.class
            r1.A02(r2, r0)
            java.util.List r2 = r3.A02
            if (r2 == 0) goto L_0x1670
            r0 = 1
            r4.A0U = r0
            r1 = 5
            int r0 = r2.size()
            int r0 = java.lang.Math.min(r1, r0)
            java.util.List r0 = r2.subList(r5, r0)
            r4.A0L = r0
            X.C61941KSq.A03(r4)
        L_0x1670:
            r0 = -1419619629(0xffffffffab6252d3, float:-8.040627E-13)
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = 835385634(0x31caf922, float:5.907297E-9)
        L_0x1679:
            X.AnonymousClass0fD.A0A(r0, r9)
            return
        L_0x167d:
            r0 = -1349029905(0xffffffffaf976fef, float:-2.7546274E-10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r0 = 2034901173(0x794a20b5, float:6.559421E34)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r3, r8)
            java.lang.Object r7 = r2.A01
            X.K7u r7 = (X.C61443K7u) r7
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.A04 = r0
            java.util.List r1 = r3.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r1)
            if (r0 == 0) goto L_0x16e7
            java.util.Iterator r2 = r1.iterator()
        L_0x16a7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x16b7
            java.lang.Object r1 = r2.next()
            java.util.ArrayList r0 = r7.A04
            r0.add(r1)
            goto L_0x16a7
        L_0x16b7:
            android.widget.TextView r6 = r7.A01
            if (r6 == 0) goto L_0x16f7
            android.content.Context r3 = r7.requireContext()
            java.util.ArrayList r2 = r7.A04
            r1 = 1
            if (r2 == 0) goto L_0x16e4
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x16e4
            int r0 = r2.size()
            if (r0 != r1) goto L_0x16dc
            java.lang.Object r0 = r2.get(r8)
            com.instagram.pendingmedia.model.BrandedContentTag r0 = (com.instagram.pendingmedia.model.BrandedContentTag) r0
            java.lang.String r0 = r0.A02
        L_0x16d8:
            r6.setText(r0)
            goto L_0x16f7
        L_0x16dc:
            r0 = 2131975609(0x7f135db9, float:1.9588315E38)
            java.lang.String r0 = X.C51967G9n.A0p(r3, r0)
            goto L_0x16d8
        L_0x16e4:
            java.lang.String r0 = ""
            goto L_0x16d8
        L_0x16e7:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r7.A04 = r0
            android.widget.TextView r1 = r7.A01
            if (r1 == 0) goto L_0x16f7
            r0 = 2131963975(0x7f133047, float:1.9564719E38)
            r1.setText(r0)
        L_0x16f7:
            X.C61443K7u.A03(r7)
            r0 = -346144773(0xffffffffeb5e3ffb, float:-2.6868367E26)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -136809975(0xfffffffff7d87209, float:-8.7800705E33)
            goto L_0x1805
        L_0x1705:
            r0 = 1897898183(0x711fa0c7, float:7.9043975E29)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.Lfs r3 = (X.C64666Lfs) r3
            r1 = 1670989270(0x639945d6, float:5.654768E21)
            int r6 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r8 = r2.A01
            X.JlT r8 = (X.C60435JlT) r8
            X.1Xj r7 = r3.A01
            java.util.List r1 = r8.A00
            int r5 = r1.size()
            r4 = 0
        L_0x1722:
            if (r4 >= r5) goto L_0x1749
            java.lang.String r2 = r7.getId()
            java.util.List r1 = r8.A00
            X.1Xj r1 = X.DbZ.A0T(r1, r4)
            java.lang.String r1 = r1.getId()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x1754
            if (r4 < 0) goto L_0x1749
            java.util.List r1 = r8.A01
            java.lang.Object r2 = r1.get(r4)
            X.Jox r2 = (X.C60650Jox) r2
            if (r2 == 0) goto L_0x1749
            int r1 = r3.A00
            X.C60435JlT.A00(r2, r8, r1)
        L_0x1749:
            r1 = -877530765(0xffffffffcbb1f173, float:-2.3323366E7)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 2055918058(0x7a8ad1ea, float:3.6039726E35)
            goto L_0x191a
        L_0x1754:
            int r4 = r4 + 1
            goto L_0x1722
        L_0x1757:
            r0 = 1450326828(0x56723b2c, float:6.6583989E13)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.LfW r3 = (X.C64644LfW) r3
            r1 = -768028531(0xffffffffd238d08d, float:-1.98443221E11)
            int r5 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r7 = r2.A01
            X.JlT r7 = (X.C60435JlT) r7
            X.1Xj r6 = r3.A00
            java.util.List r1 = r7.A00
            int r4 = r1.size()
            r3 = 0
        L_0x1774:
            if (r3 >= r4) goto L_0x179d
            java.lang.String r2 = r6.getId()
            java.util.List r1 = r7.A00
            X.1Xj r1 = X.DbZ.A0T(r1, r3)
            java.lang.String r1 = r1.getId()
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x17a8
            if (r3 < 0) goto L_0x179d
            java.util.List r1 = r7.A00
            r1.remove(r3)
            r7.notifyItemRemoved(r3)
            java.util.List r1 = r7.A00
            int r1 = r1.size()
            r7.notifyItemRangeChanged(r3, r1)
        L_0x179d:
            r1 = 254804114(0xf300092, float:8.67758E-30)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = 1323956360(0x4ee9f888, float:1.96268954E9)
            goto L_0x191a
        L_0x17a8:
            int r3 = r3 + 1
            goto L_0x1774
        L_0x17ab:
            r0 = 2008629233(0x77b93ff1, float:7.5146235E33)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.Lg6 r3 = (X.C64679Lg6) r3
            r0 = 2128888559(0x7ee442ef, float:1.5170576E38)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r1 = r2.A01
            X.K5F r1 = (X.K5F) r1
            boolean r0 = r3.A03
            r1.A03 = r0
            java.util.List r0 = r3.A02
            r1.A02 = r0
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r3.A01
            r1.A01 = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r3.A00
            r1.A00 = r0
            r0 = -1757129663(0xffffffff97445441, float:-6.343736E-25)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = -1607511094(0xffffffffa02f53ca, float:-1.48508E-19)
            goto L_0x1805
        L_0x17d9:
            r0 = -1326798761(0xffffffffb0eaa857, float:-1.7073586E-9)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.LfV r3 = (X.C64643LfV) r3
            r0 = -754787986(0xffffffffd302d96e, float:-5.6199361E11)
            int r4 = X.AnonymousClass7TG.A0D(r3, r0)
            java.lang.Object r0 = r2.A01
            X.K8V r0 = (X.K8V) r0
            X.0eM r0 = r0.A04
            java.lang.Object r1 = r0.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r1 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r1
            X.Jus r0 = r3.A00
            r1.A01 = r0
            r1.A04()
            r0 = -372275914(0xffffffffe9cf8536, float:-3.135959E25)
            X.AnonymousClass0fD.A0A(r0, r4)
            r0 = 860531297(0x334aaa61, float:4.718675E-8)
        L_0x1805:
            X.AnonymousClass0fD.A0A(r0, r5)
        L_0x1808:
            return
        L_0x1809:
            r0 = 330004187(0x13ab76db, float:4.328367E-27)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.LfV r3 = (X.C64643LfV) r3
            r1 = -331403704(0xffffffffec3f2e48, float:-9.2449355E26)
            int r6 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r2 = r2.A01
            X.K8Z r2 = (X.K8Z) r2
            X.0hq r1 = r2.getParentFragmentManager()
            r1.A13()
            X.0eM r1 = r2.A05
            java.lang.Object r7 = r1.getValue()
            X.JjM r7 = (X.C60318JjM) r7
            X.Jus r5 = r3.A00
            java.util.Map r4 = r7.A09
            java.util.Collection r2 = r4.values()
            if (r2 == 0) goto L_0x1856
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x1856
        L_0x183c:
            com.instagram.user.model.User r1 = r5.A00()
            r4.put(r1, r5)
        L_0x1843:
            com.instagram.user.model.User r2 = r5.A00()
            r1 = 0
            r7.A06(r1, r2)
            r1 = -628275969(0xffffffffda8d44ff, float:-1.98819169E16)
            X.AnonymousClass0fD.A0A(r1, r6)
            r1 = 280621884(0x10b9f33c, float:7.3344396E-29)
            goto L_0x191a
        L_0x1856:
            java.util.Iterator r3 = r2.iterator()
        L_0x185a:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x183c
            java.lang.Object r1 = r3.next()
            X.Jus r1 = (X.C60996Jus) r1
            java.lang.String r2 = r1.A05
            java.lang.String r1 = r5.A05
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x185a
            goto L_0x1843
        L_0x1871:
            r0 = 1527083194(0x5b0570ba, float:3.7560116E16)
            int r0 = X.AnonymousClass0fD.A03(r0)
            X.2Kb r3 = (X.2Kb) r3
            r1 = 747531177(0x2c8e6ba9, float:4.0478354E-12)
            int r5 = X.AnonymousClass7TG.A0D(r3, r1)
            java.lang.Object r8 = r2.A01
            X.K5p r8 = (X.C61395K5p) r8
            java.lang.Integer r2 = r3.A01
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            if (r2 != r1) goto L_0x1911
            X.0eM r6 = r8.A02
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            X.2Dm r2 = X.2L2.A00(r1)
            com.instagram.model.direct.DirectThreadKey r1 = r3.A00
            X.3U9 r3 = r2.C5z(r1)
            if (r3 == 0) goto L_0x1911
            android.os.Bundle r2 = r8.requireArguments()
            java.lang.String r1 = "kirby_ai_preparation_fragment.ai_name"
            java.lang.String r2 = r2.getString(r1)
            int r1 = r3.C6a()
            r12 = 1014(0x3f6, float:1.421E-42)
            if (r1 != r12) goto L_0x1911
            java.lang.String r1 = r3.C6f()
            boolean r1 = X.0qQ.A0K(r1, r2)
            if (r1 == 0) goto L_0x1911
            java.lang.String r9 = r3.C6C()
            if (r9 == 0) goto L_0x18eb
            X.0eM r4 = r8.A01
            X.7I6 r1 = X.JTO.A0U(r4)
            java.lang.String r2 = "launch_ai_thread_view"
            r3 = 673059101(0x281e111d, float:8.774473E-15)
            X.02m r1 = r1.A06
            r1.markerPoint(r3, r2)
            X.7I6 r2 = X.JTO.A0U(r4)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.JVT.A01(r2, r1, r3)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r6)
            com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher r6 = new com.instagram.direct.aiagent.navigation.AiAgentThreadLauncher
            r6.<init>(r1)
            androidx.fragment.app.FragmentActivity r7 = r8.requireActivity()
            r10 = 0
            r13 = 1
            r11 = r10
            r6.A07(r7, r8, r9, r10, r11, r12, r13)
        L_0x18eb:
            X.0eM r1 = r8.A00
            X.LTH r2 = X.JTO.A0T(r1)
            X.0eM r1 = r8.A03
            java.lang.String r4 = X.C60316JjJ.A02(r1)
            java.lang.String r3 = X.C60316JjJ.A01(r1)
            X.1Ln r2 = X.LTH.A00(r2)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x190e
            java.lang.String r1 = "creation_preparation_screen_open_thread_success"
            java.lang.Long r1 = X.JTU.A0W(r2, r1, r4)
            X.JTT.A1G(r2, r1, r3)
        L_0x190e:
            X.DbT.A1K(r8)
        L_0x1911:
            r1 = 686752922(0x28ef049a, float:2.6536326E-14)
            X.AnonymousClass0fD.A0A(r1, r5)
            r1 = -525533306(0xffffffffe0acff86, float:-9.972664E19)
        L_0x191a:
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C64698LgT.onEvent(java.lang.Object):void");
    }

    public C64698LgT(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
