package X;

import android.view.View;

public final class LY6 implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public LY6(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LY6 A00(Object obj, int i) {
        return new LY6(obj, i);
    }

    public static void A01(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new LY6(obj, i), view);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0ce0, code lost:
        if (r3.A08() != false) goto L_0x0cbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0d86, code lost:
        X.AnonymousClass0fD.A0C(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x0d89, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        X.AnonymousClass0fD.A0C(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x109b, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x109e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:428:0x10e8, code lost:
        r23 = "creationLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x11b6, code lost:
        X.0qQ.A0F(r23);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x11bd, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x1200, code lost:
        X.AnonymousClass0fD.A0C(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x1203, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r29) {
        /*
            r28 = this;
            r1 = r28
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x1197;
                case 1: goto L_0x1181;
                case 2: goto L_0x116a;
                case 3: goto L_0x1153;
                case 4: goto L_0x113e;
                case 5: goto L_0x112b;
                case 6: goto L_0x1114;
                case 7: goto L_0x1100;
                case 8: goto L_0x10ec;
                case 9: goto L_0x10c9;
                case 10: goto L_0x109f;
                case 11: goto L_0x101f;
                case 12: goto L_0x0ff5;
                case 13: goto L_0x0f8a;
                case 14: goto L_0x0d8a;
                case 15: goto L_0x0d37;
                case 16: goto L_0x0ce3;
                case 17: goto L_0x0c90;
                case 18: goto L_0x0c78;
                case 19: goto L_0x0c5d;
                case 20: goto L_0x0bda;
                case 21: goto L_0x0bbb;
                case 22: goto L_0x0b9c;
                case 23: goto L_0x0b71;
                case 24: goto L_0x0af6;
                case 25: goto L_0x0abe;
                case 26: goto L_0x0aa9;
                case 27: goto L_0x0a21;
                case 28: goto L_0x09f6;
                case 29: goto L_0x09bc;
                case 30: goto L_0x0993;
                case 31: goto L_0x018a;
                case 32: goto L_0x0980;
                case 33: goto L_0x096f;
                case 34: goto L_0x095e;
                case 35: goto L_0x0087;
                case 36: goto L_0x094b;
                case 37: goto L_0x0934;
                case 38: goto L_0x091d;
                case 39: goto L_0x08f8;
                case 40: goto L_0x08de;
                case 41: goto L_0x08c9;
                case 42: goto L_0x08a7;
                case 43: goto L_0x0890;
                case 44: goto L_0x0879;
                case 45: goto L_0x0852;
                case 46: goto L_0x0837;
                case 47: goto L_0x07e8;
                case 48: goto L_0x07bf;
                case 49: goto L_0x07a8;
                case 50: goto L_0x0776;
                case 51: goto L_0x0717;
                case 52: goto L_0x0700;
                case 53: goto L_0x06ae;
                case 54: goto L_0x05ef;
                case 55: goto L_0x05bb;
                case 56: goto L_0x059e;
                case 57: goto L_0x0586;
                case 58: goto L_0x0554;
                case 59: goto L_0x0504;
                case 60: goto L_0x04ec;
                case 61: goto L_0x02dc;
                case 62: goto L_0x02c3;
                case 63: goto L_0x0201;
                case 64: goto L_0x010b;
                case 65: goto L_0x00ad;
                case 66: goto L_0x0095;
                case 67: goto L_0x0046;
                case 68: goto L_0x0030;
                case 69: goto L_0x001a;
                default: goto L_0x0007;
            }
        L_0x0007:
            r0 = 280940731(0x10bed0bb, float:7.5263386E-29)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 966489281(0x399b74c1, float:2.9650892E-4)
        L_0x0016:
            X.AnonymousClass0fD.A0C(r0, r8)
        L_0x0019:
            return
        L_0x001a:
            r0 = 1736706054(0x67840806, float:1.2470008E24)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LiT r0 = (X.C64808LiT) r0
            X.LrS r1 = r0.A03
            X.JzD r0 = r0.A01
            r1.A01(r0)
            r0 = 1899973809(0x713f4cb1, float:9.472696E29)
            goto L_0x0016
        L_0x0030:
            r0 = 1582599159(0x5e548bf7, float:3.82890163E18)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LiT r0 = (X.C64808LiT) r0
            X.LrS r1 = r0.A03
            X.JzD r0 = r0.A01
            r1.A01(r0)
            r0 = 1433969984(0x5578a540, float:1.70867892E13)
            goto L_0x0016
        L_0x0046:
            r0 = 149765803(0x8ed3eab, float:1.4278652E-33)
            int r8 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KUU r0 = (X.KUU) r0
            X.LrS r7 = r0.A01
            X.1Xj r6 = r0.A01
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.MXF r5 = r7.A00
            java.lang.Integer r4 = X.AnonymousClass05K.A0b
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = r6.A30()
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x1209
            java.lang.String r0 = "media_id"
            r3.put(r0, r1)
            X.C64127LPb.A02(r5, r4, r3)
            java.lang.String r1 = r6.getId()
            if (r1 == 0) goto L_0x1204
            X.Ltm r0 = new X.Ltm
            r0.<init>(r1)
            X.MQn[] r0 = new X.C66407MQn[]{r0}
            X.C65329LrS.A00(r7, r0)
            r0 = -210354804(0xfffffffff3763d8c, float:-1.9509176E31)
            goto L_0x0016
        L_0x0087:
            java.lang.Object r0 = r1.A01
            com.instagram.igtv.widget.TitleDescriptionEditor r0 = (com.instagram.igtv.widget.TitleDescriptionEditor) r0
            android.view.View$OnClickListener r0 = r0.A09
            if (r0 == 0) goto L_0x0019
            r1 = r29
            r0.onClick(r1)
            return
        L_0x0095:
            r0 = 649422851(0x26b56803, float:1.258759E-15)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K77 r1 = (X.K77) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            X.C64127LPb.A01(r1, r0)
            X.DbT.A1J(r1)
            r0 = -1887835035(0xffffffff8f79ec65, float:-1.2322176E-29)
            goto L_0x0d86
        L_0x00ad:
            r0 = -575705297(0xffffffffddaf6f2f, float:-1.58017179E18)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.KUF r6 = (X.KUF) r6
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            r5 = 0
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "source"
            java.lang.String r1 = "media_kit_intro_info"
            r3.put(r2, r1)
            X.C64127LPb.A02(r6, r4, r3)
            X.0eM r1 = r6.A00
            X.JjW r1 = X.JTT.A0a(r1)
            X.LC9 r1 = r1.A06
            r3 = 1
            java.lang.String r2 = "media_kit_intro_shown"
            X.0xa r1 = r1.A00
            X.DbX.A1V(r1, r2, r3)
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            X.0eM r1 = r6.A07
            X.6Yo r4 = X.DbX.A0N(r2, r1)
            X.K6H r2 = new X.K6H
            r2.<init>()
            android.os.Bundle r1 = r2.mArguments
            r2.setArguments(r1)
            r4.A0B(r5, r2)
            r4.A0G = r3
            X.0hq r3 = r6.getParentFragmentManager()
            int r2 = r3.A0M()
            r1 = 0
        L_0x00fb:
            if (r1 >= r2) goto L_0x0103
            r3.A13()
            int r1 = r1 + 1
            goto L_0x00fb
        L_0x0103:
            r4.A04()
            r1 = 1970766319(0x757781ef, float:3.137531E32)
            goto L_0x109b
        L_0x010b:
            r0 = -517360944(0xffffffffe129b2d0, float:-1.9564903E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K5A r7 = (X.K5A) r7
            X.0eM r0 = r7.A03
            X.JjW r1 = X.JTT.A0a(r0)
            X.0eM r0 = r7.A01
            java.lang.Object r0 = r0.getValue()
            X.Jki r0 = (X.C60389Jki) r0
            java.util.ArrayList r0 = r0.A01
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r0)
            com.instagram.mediakit.repository.MediaKitRepository r6 = r1.A07
            X.LFM r0 = r6.A02
            int r1 = r8.size()
            java.util.ArrayList r5 = r0.A04
            int r0 = r5.size()
            if (r1 != r0) goto L_0x017f
            int r0 = X.JTT.A08(r5)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r3 = r5.iterator()
        L_0x0146:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.JzD r0 = (X.C61220JzD) r0
            java.lang.String r0 = r0.A03
            r4.put(r0, r1)
            goto L_0x0146
        L_0x0159:
            r5.clear()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r8.iterator()
        L_0x0164:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017c
            java.lang.Object r0 = r1.next()
            X.JzD r0 = (X.C61220JzD) r0
            java.lang.String r0 = r0.A03
            java.lang.Object r0 = r4.get(r0)
            if (r0 == 0) goto L_0x0164
            r3.add(r0)
            goto L_0x0164
        L_0x017c:
            r5.addAll(r3)
        L_0x017f:
            com.instagram.mediakit.repository.MediaKitRepository.A05(r6)
            X.DbT.A1I(r7)
            r0 = 1676916580(0x63f3b764, float:8.991547E21)
            goto L_0x1200
        L_0x018a:
            r0 = 1159234289(0x451882f1, float:2440.1838)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K8C r5 = (X.K8C) r5
            X.KFk r0 = r5.A02
            java.lang.String r23 = "seriesItemDefinition"
            if (r0 == 0) goto L_0x11b6
            int r7 = r0.A00
            android.view.View r0 = r5.A00
            if (r0 != 0) goto L_0x01a5
            java.lang.String r23 = "doneButton"
            goto L_0x11b6
        L_0x01a5:
            float r1 = r0.getAlpha()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
            if (r7 >= 0) goto L_0x01d9
            X.0eM r0 = r5.A08
            java.lang.Object r6 = r0.getValue()
            X.JiN r6 = (X.C60266JiN) r6
            X.LMg r3 = X.C60266JiN.A03
            r0 = 0
            X.0qQ.A0B(r3, r0)
        L_0x01bf:
            r6.A01 = r3
        L_0x01c1:
            boolean r0 = r5.A03
            if (r0 == 0) goto L_0x01d5
            X.0eM r0 = r5.A0A
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KTP r0 = X.KTP.A00
            r1.A04(r5, r0)
        L_0x01d0:
            r0 = -1567277292(0xffffffffa2953f14, float:-4.0453317E-18)
            goto L_0x0d86
        L_0x01d5:
            X.DbT.A1I(r5)
            goto L_0x01d0
        L_0x01d9:
            X.KFk r0 = r5.A02
            if (r0 == 0) goto L_0x11b6
            X.K1d r3 = r0.A01
            if (r3 == 0) goto L_0x01c1
            X.0eM r0 = r5.A08
            java.lang.Object r6 = r0.getValue()
            X.JiN r6 = (X.C60266JiN) r6
            java.lang.String r2 = r3.A03
            X.0qQ.A07(r2)
            java.lang.String r1 = r3.A08
            X.0qQ.A07(r1)
            java.util.List r0 = r3.A0A
            int r0 = r0.size()
            int r0 = r0 + 1
            X.LMg r3 = new X.LMg
            r3.<init>(r7, r0, r2, r1)
            goto L_0x01bf
        L_0x0201:
            r0 = -2058702245(0xffffffff854ab25b, float:-9.530753E-36)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KXh r3 = (X.KXh) r3
            X.0eM r0 = r3.A03
            java.lang.Object r4 = r0.getValue()
            X.Ji2 r4 = (X.C60245Ji2) r4
            X.05G r0 = r4.A0B
            java.lang.Iterable r0 = X.JTO.A0x(r0)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0222:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x022c
            X.C61036Jva.A02(r6, r1)
            goto L_0x0222
        L_0x022c:
            X.JzD r0 = r4.A00
            java.lang.String r23 = "profileSection"
            r19 = 0
            if (r0 == 0) goto L_0x11b6
            java.lang.String r14 = r0.A02
            java.lang.String r15 = r0.A03
            java.util.List r5 = r0.A06
            X.JzC r12 = r0.A00
            java.lang.String r1 = r0.A04
            com.instagram.mediakit.model.MediaKitSectionType r13 = r0.A01
            r0 = 2
            X.0qQ.A0B(r15, r0)
            X.AnonymousClass7TG.A1S(r1, r13)
            X.JzD r11 = new X.JzD
            r18 = r5
            r16 = r1
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.MXF r8 = r4.A05
            java.lang.Integer r18 = X.AnonymousClass05K.A0i
            java.util.HashMap r7 = X.AnonymousClass7TE.A1E()
            int r0 = r6.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "selected_profile_count"
            r7.put(r0, r1)
            X.JzD r0 = r4.A00
            if (r0 == 0) goto L_0x11b6
            java.lang.String r10 = r0.A03
            com.instagram.mediakit.repository.MediaKitRepository r6 = r4.A06
            boolean r0 = r6.A0C(r10)
            r5 = 1
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x027a
            r10 = r19
        L_0x027a:
            X.JzD r0 = r4.A00
            if (r0 == 0) goto L_0x11b6
            com.instagram.mediakit.model.MediaKitSectionType r9 = r0.A01
            java.lang.String r0 = r0.A03
            int r1 = r6.A06(r0)
            X.0qQ.A0B(r9, r5)
            if (r10 == 0) goto L_0x0290
            java.lang.String r0 = "section_id"
            r7.put(r0, r10)
        L_0x0290:
            int r0 = r1 + 1
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "section_position"
            r7.put(r0, r1)
            X.KkN r16 = X.C63312Kuv.A00(r9)
            r17 = r8
            r20 = r19
            r21 = r7
            X.C64127LPb.A00(r16, r17, r18, r19, r20, r21)
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x02bd
            X.6oS r1 = X.C318116oQ.A00(r4)
            r0 = 17
            X.MH3.A00(r4, r11, r1, r0)
        L_0x02b5:
            X.DbT.A1I(r3)
            r0 = 1716900564(0x6655d2d4, float:2.5243829E23)
            goto L_0x1200
        L_0x02bd:
            java.lang.String r0 = r11.A03
            r6.A0B(r11, r0, r5)
            goto L_0x02b5
        L_0x02c3:
            r0 = -809670299(0xffffffffcfbd6965, float:-6.3556019E9)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K5B r0 = (X.K5B) r0
            X.JjV r1 = X.JTT.A0Z(r0)
            X.J3f r0 = X.C59020J3f.A00
            X.C60326JjV.A01(r1, r0)
            r0 = 240588651(0xe57176b, float:2.6512071E-30)
            goto L_0x0d86
        L_0x02dc:
            r0 = 1714143328(0x662bc060, float:2.0276834E23)
            int r3 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K5B r2 = (X.K5B) r2
            X.JjV r1 = X.JTT.A0Z(r2)
            androidx.fragment.app.FragmentActivity r11 = r2.requireActivity()
            X.0eM r0 = r2.A0A
            java.lang.Object r0 = r0.getValue()
            r4 = 1
            r5 = 0
            X.0qQ.A0B(r0, r4)
            X.KhP r6 = r1.A02
            int r6 = r6.ordinal()
            if (r6 == r5) goto L_0x03c1
            if (r6 != r4) goto L_0x03bc
            java.lang.Integer r9 = X.AnonymousClass05K.A0h
            r13 = 0
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.LinkedHashMap r6 = r1.A02()
            int r6 = r6.size()
            java.lang.String r7 = java.lang.String.valueOf(r6)
            java.lang.String r6 = "selected_media_count"
            r8.put(r6, r7)
            X.C64127LPb.A02(r1, r9, r8)
            java.util.LinkedHashMap r6 = r1.A02()
            java.util.Collection r7 = r6.values()
            X.0qQ.A07(r7)
            java.util.ArrayList r6 = X.AnonymousClass7TG.A0r(r7)
            java.util.Iterator r10 = r7.iterator()
        L_0x0332:
            boolean r7 = r10.hasNext()
            if (r7 == 0) goto L_0x0390
            java.lang.Object r9 = r10.next()
            X.HAW r9 = (X.HAW) r9
            boolean r7 = r9 instanceof X.HC0
            if (r7 == 0) goto L_0x035c
            r7 = r9
            X.HC0 r7 = (X.HC0) r7
            X.LtR r7 = r7.A00
            X.1Xj r8 = r7.A00
            int r7 = r9.A00
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            java.lang.String r16 = ""
            X.Jzx r9 = new X.Jzx
            r12 = r9
            r14 = r8
            r17 = r7
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x0358:
            r6.add(r9)
            goto L_0x0332
        L_0x035c:
            boolean r7 = r9 instanceof X.C54408HBz
            if (r7 == 0) goto L_0x0385
            r7 = r9
            X.HBz r7 = (X.C54408HBz) r7
            X.LtQ r7 = r7.A00
            com.instagram.common.gallery.model.GalleryItem r7 = r7.A00
            com.instagram.common.gallery.Medium r8 = r7.A00
            java.lang.String r7 = "null cannot be cast to non-null type com.instagram.common.gallery.Medium"
            X.0qQ.A0C(r8, r7)
            int r7 = r9.A00
            X.0qQ.A0B(r8, r5)
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            java.lang.String r18 = X.JTQ.A0Z()
            X.Jzx r9 = new X.Jzx
            r14 = r9
            r15 = r8
            r16 = r13
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            goto L_0x0358
        L_0x0385:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "MediaKit media selection should not contain: "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r9, r0, r1)
            throw r0
        L_0x0390:
            com.instagram.mediakit.repository.MediaKitRepository r7 = r1.A03
            X.LFM r5 = r7.A02
            r5.A02 = r6
            X.05G r5 = r7.A07
            r5.Epw(r6)
            r7.A00 = r4
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r6.iterator()
        L_0x03a5:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x04d2
            java.lang.Object r6 = r7.next()
            r4 = r6
            X.Jzx r4 = (X.C61264Jzx) r4
            java.lang.Integer r5 = r4.A03
            java.lang.Integer r4 = X.AnonymousClass05K.A01
            if (r5 != r4) goto L_0x03a5
            r9.add(r6)
            goto L_0x03a5
        L_0x03bc:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03c1:
            java.util.LinkedHashMap r0 = r1.A02()
            java.util.Collection r0 = r0.values()
            X.0qQ.A07(r0)
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r12 = r0.iterator()
        L_0x03d4:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0412
            java.lang.Object r6 = r12.next()
            X.HAW r6 = (X.HAW) r6
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.mediakit.ui.definition.picker.MediaKitMediaItemModel"
            X.0qQ.A0C(r6, r0)
            X.HC0 r6 = (X.HC0) r6
            X.LtR r0 = r6.A00
            X.1Xj r10 = r0.A00
            r9 = 0
            X.1hu r6 = new X.1hu
            r6.<init>(r9)
            r8 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r6, r8, r5)
            int r0 = r10.A0v()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
            X.1hu r6 = new X.1hu
            r6.<init>(r9)
            X.1E9 r0 = new X.1E9
            r0.<init>(r6, r8, r5)
            X.JzB r0 = new X.JzB
            r0.<init>(r10, r7)
            r11.add(r0)
            goto L_0x03d4
        L_0x0412:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x04e2
            java.lang.Integer r14 = X.AnonymousClass05K.A0g
            r6 = 0
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.util.LinkedHashMap r0 = r1.A02()
            int r0 = r0.size()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "selected_media_count"
            r9.put(r0, r7)
            X.JzD r0 = r1.A00
            if (r0 == 0) goto L_0x04c9
            java.lang.String r12 = r0.A03
            if (r12 == 0) goto L_0x04c9
            com.instagram.mediakit.repository.MediaKitRepository r0 = r1.A03
            boolean r0 = r0.A0C(r12)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x04c9
        L_0x0442:
            X.JzD r0 = r1.A00
            if (r0 == 0) goto L_0x044a
            com.instagram.mediakit.model.MediaKitSectionType r10 = r0.A01
            if (r10 != 0) goto L_0x044c
        L_0x044a:
            com.instagram.mediakit.model.MediaKitSectionType r10 = com.instagram.mediakit.model.MediaKitSectionType.MEDIA_POSTS
        L_0x044c:
            com.instagram.mediakit.repository.MediaKitRepository r7 = r1.A03
            if (r0 == 0) goto L_0x04c7
            java.lang.String r0 = r0.A03
        L_0x0452:
            int r8 = r7.A06(r0)
            X.0qQ.A0B(r10, r4)
            if (r12 == 0) goto L_0x0460
            java.lang.String r0 = "section_id"
            r9.put(r0, r12)
        L_0x0460:
            int r0 = r8 + 1
            java.lang.String r8 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "section_position"
            r9.put(r0, r8)
            X.KkN r12 = X.C63312Kuv.A00(r10)
            r13 = r1
            r15 = r6
            r16 = r6
            r17 = r9
            X.C64127LPb.A00(r12, r13, r14, r15, r16, r17)
            X.JzD r13 = r1.A00
            if (r13 == 0) goto L_0x04e2
            java.util.List r0 = r13.A05
            r16 = r0
            java.lang.String r0 = r13.A02
            r18 = r0
            java.lang.String r12 = r13.A03
            java.util.List r10 = r13.A06
            java.lang.String r9 = r13.A04
            com.instagram.mediakit.model.MediaKitSectionType r8 = r13.A01
            X.JzC r0 = r13.A00
            if (r0 == 0) goto L_0x04bc
            boolean r15 = r0.A01
            X.1hu r14 = new X.1hu
            r14.<init>(r6)
            r13 = 6
            X.1E9 r0 = new X.1E9
            r0.<init>(r14, r13, r5)
            X.JzC r11 = X.C63317Kv0.A00(r11, r15)
        L_0x04a1:
            r17 = r10
            r14 = r12
            r15 = r9
            r12 = r8
            r13 = r18
            X.JzD r5 = X.C63319Kv2.A00(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r1.A01
            if (r0 == 0) goto L_0x04cc
            X.6oS r4 = X.C318116oQ.A00(r1)
            r0 = 15
            X.MH3 r8 = new X.MH3
            r8.<init>(r1, r5, r6, r0)
            goto L_0x04df
        L_0x04bc:
            X.JzC r0 = X.LQI.A00(r11)
            java.util.List r0 = r0.A00
            X.JzC r11 = X.C63317Kv0.A00(r0, r5)
            goto L_0x04a1
        L_0x04c7:
            r0 = r6
            goto L_0x0452
        L_0x04c9:
            r12 = r6
            goto L_0x0442
        L_0x04cc:
            java.lang.String r0 = r5.A03
            r7.A0B(r5, r0, r4)
            goto L_0x04e2
        L_0x04d2:
            X.6oS r4 = X.C318116oQ.A00(r1)
            r14 = 23
            X.MGj r8 = new X.MGj
            r10 = r1
            r12 = r0
            r8.<init>((java.lang.Object) r9, (java.lang.Object) r10, (java.lang.Object) r11, (java.lang.Object) r12, (X.AnonymousClass4D7) r13, (int) r14)
        L_0x04df:
            X.AnonymousClass7TE.A1Z(r8, r4)
        L_0x04e2:
            X.DbT.A1I(r2)
            r0 = -895825475(0xffffffffca9ac9bd, float:-5072094.5)
            X.AnonymousClass0fD.A0C(r0, r3)
            return
        L_0x04ec:
            r0 = 1811663192(0x6bfbc958, float:6.087824E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K76 r1 = (X.K76) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C64127LPb.A01(r1, r0)
            X.DbT.A1K(r1)
            r0 = -729937824(0xffffffffd47e0860, float:-4.36424881E12)
            goto L_0x0d86
        L_0x0504:
            r0 = 1483587794(0x586dc0d2, float:1.04564965E15)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K76 r7 = (X.K76) r7
            java.lang.Integer r4 = X.AnonymousClass05K.A0u
            r6 = 0
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = "source"
            java.lang.String r0 = "media_kit_intro"
            r3.put(r1, r0)
            X.C64127LPb.A02(r7, r4, r3)
            X.0eM r0 = r7.A07
            X.JjW r0 = X.JTT.A0a(r0)
            X.LC9 r0 = r0.A06
            r5 = 1
            r4 = 0
            java.lang.String r1 = "media_kit_intro_shown"
            X.0xa r0 = r0.A00
            X.DbX.A1V(r0, r1, r5)
            androidx.fragment.app.FragmentActivity r1 = r7.requireActivity()
            X.0eM r0 = r7.A06
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            X.K6H r1 = new X.K6H
            r1.<init>()
            android.os.Bundle r0 = r1.mArguments
            r1.setArguments(r0)
            r3.A0B(r6, r1)
            r3.A0D = r4
            r3.A0G = r5
            r3.A04()
            r0 = -1101409354(0xffffffffbe59d3b6, float:-0.21272168)
            goto L_0x1200
        L_0x0554:
            r0 = -2011917916(0xffffffff881491a4, float:-4.470833E-34)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K76 r3 = (X.K76) r3
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            X.C64127LPb.A01(r3, r0)
            androidx.fragment.app.FragmentActivity r1 = r3.requireActivity()
            X.0eM r0 = r3.A06
            X.6Yo r2 = X.DbX.A0N(r1, r0)
            X.KUF r1 = new X.KUF
            r1.<init>()
            android.os.Bundle r0 = r3.mArguments
            r1.setArguments(r0)
            r2.A0D(r1)
            r0 = 1
            r2.A0G = r0
            r2.A04()
            r0 = -1356688629(0xffffffffaf22930b, float:-1.4786054E-10)
            goto L_0x0d86
        L_0x0586:
            r0 = -307205446(0xffffffffedb06aba, float:-6.824798E27)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K76 r1 = (X.K76) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.C64127LPb.A01(r1, r0)
            X.DbT.A1K(r1)
            r0 = -1044137613(0xffffffffc1c3b973, float:-24.465551)
            goto L_0x0d86
        L_0x059e:
            r0 = -1136170132(0xffffffffbc476b6c, float:-0.012171607)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r2 = (com.instagram.common.ui.widget.videopreviewview.VideoPreviewView) r2
            boolean r1 = r2.A08()
            if (r1 == 0) goto L_0x05b7
            r2.A06()
        L_0x05b2:
            r1 = 582306342(0x22b54a26, float:4.9138656E-18)
            goto L_0x109b
        L_0x05b7:
            r2.A04()
            goto L_0x05b2
        L_0x05bb:
            r0 = -1068308242(0xffffffffc052e8ee, float:-3.295467)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K6i r2 = (X.C61411K6i) r2
            java.lang.Integer r0 = X.AnonymousClass05K.A0H
            X.C64127LPb.A01(r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r2.requireActivity()
            X.0eM r0 = r2.A0D
            X.6Yo r3 = X.DbX.A0N(r1, r0)
            X.K5B r2 = new X.K5B
            r2.<init>()
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "mk_select_entry_point"
            X.DbZ.A1B(r2, r0, r1)
            r3.A0D(r2)
            r3.A04()
            r0 = -1399424468(0xffffffffac967a2c, float:-4.2768202E-12)
            goto L_0x0d86
        L_0x05ef:
            r0 = 259759971(0xf7b9f63, float:1.2405952E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6H r1 = (X.K6H) r1
            X.0eM r1 = r1.A0O
            X.JjW r7 = X.JTT.A0a(r1)
            X.L9D r2 = r7.A05
            boolean r1 = r2.A04
            if (r1 == 0) goto L_0x0639
            boolean r1 = r2.A02
            if (r1 == 0) goto L_0x0639
            java.lang.Integer r4 = X.AnonymousClass05K.A0n
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "destination"
            java.lang.String r1 = "partnership_thread"
            r3.put(r2, r1)
            X.C64127LPb.A02(r7, r4, r3)
            X.0Ud r1 = r7.A0M
            java.lang.Object r1 = r1.getValue()
            X.JzE r1 = (X.C61221JzE) r1
            if (r1 == 0) goto L_0x0634
            com.instagram.user.model.User r1 = r1.A01
            if (r1 == 0) goto L_0x0634
            java.lang.String r2 = r1.getId()
            X.Ltk r1 = new X.Ltk
            r1.<init>(r2)
            X.C60327JjW.A02(r1, r7)
        L_0x0634:
            r1 = 421590036(0x1920f414, float:8.321097E-24)
            goto L_0x109b
        L_0x0639:
            com.instagram.common.session.UserSession r3 = r2.A03
            r1 = 36316808936166035(0x8105f200041293, double:3.030234435058709E-306)
            boolean r1 = X.AnonymousClass430.A03(r3, r1)
            if (r1 == 0) goto L_0x0634
            java.lang.Integer r4 = X.AnonymousClass05K.A0n
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "destination"
            java.lang.String r1 = "brand_onboarding"
            r3.put(r2, r1)
            X.C64127LPb.A02(r7, r4, r3)
            X.0Ud r1 = r7.A0M
            java.lang.Object r1 = r1.getValue()
            X.JzE r1 = (X.C61221JzE) r1
            if (r1 == 0) goto L_0x06ac
            com.instagram.user.model.User r1 = r1.A01
            if (r1 == 0) goto L_0x06ac
            java.lang.String r3 = r1.getId()
        L_0x0668:
            r1 = 556(0x22c, float:7.79E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.LMc r6 = new X.LMc
            r6.<init>(r1)
            r8 = 2
            java.lang.String r2 = "entry_point"
            java.lang.String r1 = "MEDIA_KIT_MESSAGING"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r2, r1)
            r1 = 2957(0xb8d, float:4.144E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.0eP[] r5 = X.JTQ.A1b(r1, r3, r2)
            r4 = 0
        L_0x0687:
            r1 = r5[r4]
            java.lang.Object r3 = r1.A00
            java.lang.Object r2 = r1.A01
            java.util.HashMap r1 = r6.A00
            if (r2 != 0) goto L_0x0693
            java.lang.String r2 = ""
        L_0x0693:
            r1.put(r3, r2)
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x0687
            r2 = 9
            X.G2c r1 = new X.G2c
            r1.<init>(r7, r2)
            r6.A01 = r1
            X.Ltf r1 = new X.Ltf
            r1.<init>(r6)
            X.C60327JjW.A02(r1, r7)
            goto L_0x0634
        L_0x06ac:
            r3 = 0
            goto L_0x0668
        L_0x06ae:
            r0 = 1658798755(0x62df42a3, float:2.0592128E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6H r1 = (X.K6H) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0O
            X.C64127LPb.A01(r1, r0)
            X.0eM r0 = r1.A0O
            X.JjW r5 = X.JTT.A0a(r0)
            r0 = 6
            X.MMD r3 = new X.MMD
            r3.<init>(r1, r0)
            X.L9D r0 = r5.A05
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x06f7
            com.instagram.mediakit.repository.MediaKitRepository r0 = r5.A07
            X.LFM r0 = r0.A02
            java.util.ArrayList r0 = r0.A04
            int r1 = r0.size()
            X.L9F r0 = r5.A08
            int r4 = r0.A02
            if (r1 < r4) goto L_0x06fc
            r3 = 0
            r0 = 2131966644(0x7f133ab4, float:1.9570132E38)
            X.LE6 r1 = new X.LE6
            r1.<init>(r3, r3, r0)
            java.lang.Object[] r0 = X.AnonymousClass7TF.A1b(r4)
            r1.A02 = r0
            X.Ltc r0 = new X.Ltc
            r0.<init>(r1)
            X.C60327JjW.A02(r0, r5)
        L_0x06f7:
            r0 = -2096130988(0xffffffff830f9454, float:-4.2194195E-37)
            goto L_0x1200
        L_0x06fc:
            r3.invoke()
            goto L_0x06f7
        L_0x0700:
            r0 = -487765046(0xffffffffe2ed4bca, float:-2.1886698E21)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LtB r0 = (X.LtB) r0
            X.LCA r0 = r0.A0D
            if (r0 == 0) goto L_0x0712
            r0.A00()
        L_0x0712:
            r0 = -1678754141(0xffffffff9bf03ea3, float:-3.9745147E-22)
            goto L_0x1200
        L_0x0717:
            r0 = 1056334982(0x3ef66486, float:0.48123568)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LtB r0 = (X.LtB) r0
            X.LCA r0 = r0.A0D
            if (r0 == 0) goto L_0x0754
            X.K6H r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0V
            X.C64127LPb.A01(r1, r0)
            X.0eM r0 = r1.A0O
            X.JjW r5 = X.JTT.A0a(r0)
            android.content.Context r3 = r1.requireContext()
            com.instagram.mediakit.repository.MediaKitRepository r0 = r5.A07
            X.LFM r1 = r0.A02
            java.util.ArrayList r0 = r1.A04
            boolean r0 = X.DbT.A1b(r0)
            if (r0 == 0) goto L_0x0759
            java.util.List r0 = r1.A02
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 == 0) goto L_0x0759
            X.6oS r1 = X.C318116oQ.A00(r5)
            r0 = 19
            X.MH3.A00(r5, r3, r1, r0)
        L_0x0754:
            r0 = -2036708643(0xffffffff869a4add, float:-5.8038363E-35)
            goto L_0x1200
        L_0x0759:
            r1 = 2131966624(0x7f133aa0, float:1.9570091E38)
            r0 = 2131966623(0x7f133a9f, float:1.957009E38)
            X.LDu r4 = new X.LDu
            r4.<init>(r1, r0)
            r3 = 0
            r1 = 2131968772(0x7f134304, float:1.9574448E38)
            X.8ae r0 = X.C358278ae.BLUE_BOLD
            r4.A00(r0, r3, r1)
            X.LtZ r0 = new X.LtZ
            r0.<init>(r4)
            X.C60327JjW.A02(r0, r5)
            goto L_0x0754
        L_0x0776:
            r0 = -1590949735(0xffffffffa12c0899, float:-5.8287246E-19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LtB r0 = (X.LtB) r0
            X.LCA r0 = r0.A0D
            if (r0 == 0) goto L_0x07a3
            X.K6H r4 = r0.A00
            X.7Pr r1 = X.K6H.A00(r4)
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            r0 = 1
            r1.A0x = r0
            X.7Pu r1 = r1.A00()
            X.K75 r0 = new X.K75
            r0.<init>()
            r0.A00 = r1
            X.7Pu r0 = r1.A02(r3, r0)
            r4.A08 = r0
        L_0x07a3:
            r0 = 1498900501(0x59576815, float:3.78947246E15)
            goto L_0x1200
        L_0x07a8:
            r0 = -604393617(0xffffffffdbf9af6f, float:-1.40560321E17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LtB r0 = (X.LtB) r0
            X.LCA r0 = r0.A0D
            if (r0 == 0) goto L_0x07ba
            r0.A00()
        L_0x07ba:
            r0 = 2002619215(0x775d8b4f, float:4.4934497E33)
            goto L_0x1200
        L_0x07bf:
            r0 = 1613660446(0x602e811e, float:5.029746E19)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LiJ r0 = (X.C64799LiJ) r0
            X.K42 r5 = r0.A01
            com.instagram.mediakit.model.MediaKitSectionType r4 = r0.A00
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            if (r0 == 0) goto L_0x07e3
            X.37D r3 = X.DbT.A0i(r0)
            if (r3 == 0) goto L_0x07e3
            r1 = 2
            X.Lz3 r0 = new X.Lz3
            r0.<init>(r1, r5, r4)
            X.DbU.A1U(r0, r3, r3)
        L_0x07e3:
            r0 = -893952197(0xffffffffcab75f3b, float:-6008733.5)
            goto L_0x1200
        L_0x07e8:
            r0 = -1614584899(0xffffffff9fc363bd, float:-8.2750716E-20)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K75 r1 = (X.K75) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0K
            X.C64127LPb.A01(r1, r0)
            X.0eM r0 = r1.A02
            X.JjW r6 = X.JTT.A0a(r0)
            r1 = 2131966580(0x7f133a74, float:1.9570002E38)
            r0 = 2131966579(0x7f133a73, float:1.957E38)
            X.LDu r5 = new X.LDu
            r5.<init>(r1, r0)
            X.8ae r3 = X.C358278ae.DEFAULT
            r2 = 2131954722(0x7f130c22, float:1.9545951E38)
            r0 = 3
            X.LU1 r1 = new X.LU1
            r1.<init>(r0)
            X.L6e r0 = new X.L6e
            r0.<init>(r1, r3, r2)
            r5.A00 = r0
            r0 = 8
            X.G2c r2 = new X.G2c
            r2.<init>(r6, r0)
            r1 = 2131957531(0x7f13171b, float:1.9551649E38)
            X.8ae r0 = X.C358278ae.RED_BOLD
            r5.A00(r0, r2, r1)
            X.LtZ r0 = new X.LtZ
            r0.<init>(r5)
            X.C60327JjW.A02(r0, r6)
            r0 = 1200808441(0x4792e1f9, float:75203.945)
            goto L_0x0d86
        L_0x0837:
            r0 = 93497995(0x592aa8b, float:1.3792422E-35)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K75 r0 = (X.K75) r0
            X.0eM r0 = r0.A02
            X.JjW r1 = X.JTT.A0a(r0)
            com.instagram.mediakit.analytics.VisibilitySheetOrigin r0 = com.instagram.mediakit.analytics.VisibilitySheetOrigin.MENU
            r1.A04(r0)
            r0 = -1754568992(0xffffffff976b66e0, float:-7.606244E-25)
            goto L_0x0d86
        L_0x0852:
            r0 = 1622043658(0x60ae6c0a, float:1.0054745E20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K75 r1 = (X.K75) r1
            java.lang.Integer r0 = X.AnonymousClass05K.A0M
            X.C64127LPb.A01(r1, r0)
            X.7Pu r0 = r1.A00
            X.DbW.A1K(r0)
            X.0eM r0 = r1.A02
            X.JjW r0 = X.JTT.A0a(r0)
            X.05G r1 = r0.A0H
            X.KgG r0 = X.C62466KgG.EDIT
            r1.Epw(r0)
            r0 = 1596291760(0x5f257ab0, float:1.1924036E19)
            goto L_0x1200
        L_0x0879:
            r0 = -1566394350(0xffffffffa2a2b812, float:-4.410508E-18)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel r0 = (com.instagram.mediakit.ui.model.MediaKitFolderSheetItemModel) r0
            X.0sP r1 = r0.A03
            int r0 = r0.A00
            X.C51967G9n.A0w(r0, r1)
            r0 = -523782585(0xffffffffe0c7b647, float:-1.1512614E20)
            goto L_0x0d86
        L_0x0890:
            r0 = -1007601987(0xffffffffc3f136bd, float:-482.42764)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = (com.instagram.mediakit.config.MediaKitInfoSheetConfig) r0
            X.0sa r0 = r0.A09
            if (r0 == 0) goto L_0x08a2
            r0.invoke()
        L_0x08a2:
            r0 = 1632561008(0x614ee770, float:2.3854413E20)
            goto L_0x1200
        L_0x08a7:
            r0 = -1266575782(0xffffffffb481965a, float:-2.4137518E-7)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LZk r0 = (X.C64310LZk) r0
            X.57X r2 = r0.A07
            r0 = 1
            r2.A02 = r0
            X.05G r1 = r2.A09
            X.Kur r0 = new X.Kur
            r0.<init>()
            r1.Epw(r0)
            r2.A00()
            r0 = -825880579(0xffffffffcec60ffd, float:-1.66146829E9)
            goto L_0x0d86
        L_0x08c9:
            r0 = -38166105(0xfffffffffdb9a1a7, float:-3.0843316E37)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LZk r0 = (X.C64310LZk) r0
            X.57X r0 = r0.A07
            r0.A00()
            r0 = 2022151302(0x78879486, float:2.199914E34)
            goto L_0x0d86
        L_0x08de:
            r0 = 198435842(0xbd3e402, float:8.161731E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.UaM r1 = (X.UaM) r1
            X.Unn r0 = r1.A02()
            r0.A05()
            r1.A03()
            r0 = -19233816(0xfffffffffeda83e8, float:-1.452283E38)
            goto L_0x0d86
        L_0x08f8:
            r0 = -1992125866(0xffffffff89429256, float:-2.3420707E-33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.Uu6 r0 = (X.C16388Uu6) r0
            X.0eM r0 = r0.A03
            X.2YL r5 = X.DbS.A0H(r0)
            X.6oS r3 = X.C318116oQ.A00(r5)
            r2 = 0
            r1 = 18
            X.MFT r0 = new X.MFT
            r0.<init>(r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            r0 = -129692959(0xfffffffff8450ae1, float:-1.5985986E34)
            goto L_0x0d86
        L_0x091d:
            r0 = -1067208935(0xffffffffc063af19, float:-3.557562)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.L1q r0 = (X.C63654L1q) r0
            X.K4T r1 = r0.A00
            X.UwG r0 = X.C16512UwG.STORY_SHARE
            X.K4T.A00(r1, r0)
            r0 = -1650263075(0xffffffff9da2fbdd, float:-4.3141463E-21)
            goto L_0x0d86
        L_0x0934:
            r0 = -929247047(0xffffffffc89cd0b9, float:-321157.78)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.L1q r0 = (X.C63654L1q) r0
            X.K4T r1 = r0.A00
            X.UwG r0 = X.C16512UwG.CLIP
            X.K4T.A00(r1, r0)
            r0 = -290887033(0xffffffffeea96a87, float:-2.6215875E28)
            goto L_0x0d86
        L_0x094b:
            r0 = 1358695915(0x50fc0deb, float:3.38301645E10)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.DbT.A1K(r0)
            r0 = 576801238(0x226149d6, float:3.0532275E-18)
            goto L_0x0d86
        L_0x095e:
            r0 = -731805498(0xffffffffd46188c6, float:-3.87464928E12)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = 469599954(0x1bfd86d2, float:4.1942465E-22)
            goto L_0x0d86
        L_0x096f:
            r0 = -1938681749(0xffffffff8c72106b, float:-1.8647942E-31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.DbS.A1U(r0)
            r0 = -1613982033(0xffffffff9fcc96af, float:-8.6646646E-20)
            goto L_0x0d86
        L_0x0980:
            r0 = 491923643(0x1d5228bb, float:2.7814326E-21)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K8C r0 = (X.K8C) r0
            X.K8C.A01(r0)
            r0 = -936825112(0xffffffffc8292ee8, float:-173243.62)
            goto L_0x0d86
        L_0x0993:
            r0 = 1812603279(0x6c0a218f, float:6.6796096E26)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6r r3 = (X.C61420K6r) r3
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r2 = r3.A03
            java.lang.String r23 = "videoPreviewView"
            if (r2 == 0) goto L_0x11b6
            X.JXT r1 = r2.A04
            X.JXT r0 = X.JXT.STARTED
            if (r1 != r0) goto L_0x09b2
            X.C61420K6r.A00(r3)
        L_0x09ad:
            r0 = -1362752465(0xffffffffaec60c2f, float:-9.006162E-11)
            goto L_0x0d86
        L_0x09b2:
            boolean r0 = r2.A08()
            if (r0 == 0) goto L_0x09ad
            X.C61420K6r.A01(r3)
            goto L_0x09ad
        L_0x09bc:
            r0 = 1927901096(0x72e96fa8, float:9.247359E30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K6r r5 = (X.C61420K6r) r5
            boolean r1 = r5.A04
            r1 = r1 ^ 1
            r5.A04 = r1
            r4 = 1058013184(0x3f100000, float:0.5625)
            if (r1 == 0) goto L_0x09d4
            r4 = 1071877875(0x3fe38ef3, float:1.7778)
        L_0x09d4:
            X.0eM r1 = r5.A09
            X.KTX r2 = X.JTR.A0o(r1)
            X.3Q2 r3 = r2.A02
            com.instagram.pendingmedia.model.ClipInfo r1 = r3.A1N
            r1.A00 = r4
            r3.A02 = r4
            X.MW0 r2 = r2.A01
            r2.EgG(r4)
            boolean r1 = r5.A04
            r3.A5x = r1
            r2.Eah(r1)
            X.C61420K6r.A02(r5)
            r1 = 1558982902(0x5cec30f6, float:5.31855421E17)
            goto L_0x109b
        L_0x09f6:
            r0 = 1763485093(0x691ca5a5, float:1.1835916E25)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KFc r0 = (X.C61626KFc) r0
            X.L1j r0 = r0.A01
            X.K8A r2 = r0.A00
            boolean r0 = r2 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x0a15
            r0 = r2
            X.KSr r0 = (X.C61942KSr) r0
            X.KTX r0 = X.JTT.A0X(r0)
            r1 = 0
            X.3Q2 r0 = r0.A02
            r0.A1p = r1
        L_0x0a15:
            java.util.ArrayList r0 = r2.A0D()
            r2.A0B(r0)
            r0 = 1524482920(0x5addc368, float:3.12104106E16)
            goto L_0x0d86
        L_0x0a21:
            r0 = -216242377(0xfffffffff31c6737, float:-1.2391537E31)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KFc r0 = (X.C61626KFc) r0
            X.L1j r0 = r0.A01
            X.K8A r5 = r0.A00
            boolean r0 = r5 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x0a5e
            X.KSr r5 = (X.C61942KSr) r5
            X.3Q2 r0 = X.LJ9.A01(r5)
            com.instagram.user.model.UpcomingEventImpl r0 = r0.A1p
            if (r0 == 0) goto L_0x0a46
            X.C61942KSr.A09(r5)
        L_0x0a41:
            r0 = -1254862471(0xffffffffb5345179, float:-6.7173784E-7)
            goto L_0x0d86
        L_0x0a46:
            X.0eM r0 = r5.A0W
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            X.1OC r3 = X.C45709D2i.A01(r0)
            X.0hq r2 = r5.mFragmentManager
            r1 = 1
            X.HDx r0 = new X.HDx
            r0.<init>(r2, r5, r1)
            r3.A00 = r0
            r5.schedule(r3)
            goto L_0x0a41
        L_0x0a5e:
            X.KSq r5 = (X.C61941KSq) r5
            X.1Xj r2 = r5.A0C
            if (r2 != 0) goto L_0x0a6e
            java.lang.String r0 = "editMedia"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0a6e:
            X.0eM r1 = r5.A0Y
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.user.model.UpcomingEvent r8 = r2.A27(r0)
            if (r8 == 0) goto L_0x0a41
            r0 = 1
            X.M02 r7 = new X.M02
            r7.<init>(r5, r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            androidx.fragment.app.FragmentActivity r5 = r5.requireActivity()
            X.0qQ.A0B(r6, r0)
            X.K6D r3 = new X.K6D
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            X.Khz r1 = X.C62569Khz.EDIT_MEDIA
            java.lang.String r0 = "prior_surface"
            r2.putSerializable(r0, r1)
            java.lang.String r0 = "initial_upcoming_event"
            r2.putParcelable(r0, r8)
            r3.A06 = r7
            r3.setArguments(r2)
            X.DbY.A14(r3, r5, r6)
            goto L_0x0a41
        L_0x0aa9:
            r0 = -1422434525(0xffffffffab375f23, float:-6.514669E-13)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LiI r0 = (X.C64798LiI) r0
            X.MSW r0 = r0.A01
            r0.Dg7()
            r0 = 609546757(0x2454f205, float:4.617517E-17)
            goto L_0x0d86
        L_0x0abe:
            r0 = 625245747(0x25447e33, float:1.7043048E-16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.KFL r0 = (X.KFL) r0
            X.L1i r0 = r0.A00
            X.K8A r3 = r0.A00
            boolean r0 = r3 instanceof X.C61942KSr
            if (r0 == 0) goto L_0x0ae3
            X.KSr r3 = (X.C61942KSr) r3
            X.0eM r0 = r3.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KTB r0 = X.KTB.A00
            r1.A04(r3, r0)
        L_0x0ade:
            r0 = -1625192094(0xffffffff9f218962, float:-3.4206717E-20)
            goto L_0x0d86
        L_0x0ae3:
            X.KSq r3 = (X.C61941KSq) r3
            X.0eM r0 = r3.A0Y
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            X.K8C r1 = new X.K8C
            r1.<init>()
            X.LMk r0 = X.C64092LMk.A04
            X.LJB.A01(r3, r1, r2, r0)
            goto L_0x0ade
        L_0x0af6:
            r0 = 1477847350(0x58162936, float:6.6041498E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K8B r5 = (X.K8B) r5
            X.0eM r4 = r5.A06
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r4)
            boolean r1 = X.C347037wA.A04(r1)
            if (r1 == 0) goto L_0x0b61
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r4)
            X.0eM r2 = r5.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r2)
            X.Lsu r1 = r1.A0M
            java.util.List r11 = r1.A0O
            if (r11 != 0) goto L_0x0b1f
            X.0sn r11 = X.0sn.A00
        L_0x0b1f:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r2)
            X.Lsu r1 = r1.A0M
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r7 = r1.A08
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r2)
            X.Lsu r1 = r1.A0M
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r6 = r1.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r2)
            X.Lsu r1 = r1.A0M
            boolean r1 = r1.A0f
            r9 = 0
            java.lang.String r10 = "igtv"
            X.AnonymousClass7TG.A1O(r8, r11)
            r12 = 0
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r1
            androidx.fragment.app.Fragment r1 = X.LLA.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.6Yo r2 = X.DbZ.A0P(r5, r4)
            r2.A0B(r9, r1)
        L_0x0b4e:
            r2.A04()
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r4)
            java.lang.Integer r2 = X.AnonymousClass05K.A0H
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            X.LPL.A01(r5, r3, r2, r1, r4)
            r1 = -664412564(0xffffffffd865de6c, float:-1.01097383E15)
            goto L_0x109b
        L_0x0b61:
            X.6Yo r2 = X.DbZ.A0P(r5, r4)
            X.E47 r1 = X.C49892FBu.A01()
            r2.A0D(r1)
            java.lang.String r1 = X.K8B.A08
            r2.A0A = r1
            goto L_0x0b4e
        L_0x0b71:
            r0 = 1994994039(0x76e93177, float:2.3648602E33)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K8B r5 = (X.K8B) r5
            X.0eM r0 = r5.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = X.JTO.A0k(r0)
            X.0eM r0 = r5.A06
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r0)
            r0 = 2131973426(0x7f135532, float:1.9583887E38)
            java.lang.String r1 = X.DbU.A0m(r5, r0)
            X.KTE r0 = new X.KTE
            r0.<init>(r2, r1)
            r3.A04(r5, r0)
            r0 = -2118030391(0xffffffff81c16bc9, float:-7.1051667E-38)
            goto L_0x0d86
        L_0x0b9c:
            r0 = -635964708(0xffffffffda17f2dc, float:-1.0692437E16)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K8B r2 = (X.K8B) r2
            X.L6i r0 = r2.A00
            if (r0 == 0) goto L_0x10e8
            X.0eM r0 = r2.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KT3 r0 = X.KT3.A00
            r1.A04(r2, r0)
            r0 = 1531395659(0x5b473e4b, float:5.6082012E16)
            goto L_0x0d86
        L_0x0bbb:
            r0 = -1233588659(0xffffffffb678ee4d, float:-3.709359E-6)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.K8B r2 = (X.K8B) r2
            X.L6i r0 = r2.A00
            if (r0 == 0) goto L_0x10e8
            X.0eM r0 = r2.A07
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KT4 r0 = X.KT4.A00
            r1.A04(r2, r0)
            r0 = -364885514(0xffffffffea4049f6, float:-5.8115757E25)
            goto L_0x0d86
        L_0x0bda:
            r0 = 1302218941(0x4d9e48bd, float:3.31945888E8)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KSr r3 = (X.C61942KSr) r3
            X.0eM r2 = r3.A0W
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A0H
            java.lang.Integer r4 = X.AnonymousClass05K.A0j
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            java.lang.Integer r1 = X.LPL.A00(r1)
            X.JVF.A02(r3, r6, r5, r4, r1)
            X.Lsu r1 = X.JTT.A0Y(r3)
            boolean r1 = r1.A0U
            if (r1 == 0) goto L_0x0c14
            X.LM3 r3 = r3.A0A
            if (r3 == 0) goto L_0x0c0f
            r2 = 2131961824(0x7f1327e0, float:1.9560356E38)
            r1 = 2131961795(0x7f1327c3, float:1.9560297E38)
            X.LM3.A00(r3, r2, r1)
        L_0x0c0f:
            r1 = -541736266(0xffffffffdfb5c2b6, float:-2.6194462E19)
            goto L_0x109b
        L_0x0c14:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r2)
            boolean r1 = X.C347037wA.A04(r1)
            if (r1 == 0) goto L_0x0c58
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r2)
            X.Lsu r1 = X.JTT.A0Y(r3)
            java.util.List r9 = r1.A0O
            if (r9 != 0) goto L_0x0c2c
            X.0sn r9 = X.0sn.A00
        L_0x0c2c:
            X.Lsu r1 = X.JTT.A0Y(r3)
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r5 = r1.A08
            X.Lsu r1 = X.JTT.A0Y(r3)
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r4 = r1.A07
            X.Lsu r1 = X.JTT.A0Y(r3)
            boolean r14 = r1.A0f
            r7 = 0
            java.lang.String r8 = "igtv"
            X.AnonymousClass7TG.A1O(r6, r9)
            r10 = 0
            r11 = r10
            r12 = r10
            r13 = r10
            androidx.fragment.app.Fragment r1 = X.LLA.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0c4c:
            androidx.fragment.app.FragmentActivity r3 = r3.requireActivity()
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r2)
            X.DbY.A14(r1, r3, r2)
            goto L_0x0c0f
        L_0x0c58:
            X.E47 r1 = X.C49892FBu.A01()
            goto L_0x0c4c
        L_0x0c5d:
            r0 = -2059650990(0xffffffff853c3852, float:-8.850062E-36)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.KSr r2 = (X.C61942KSr) r2
            X.0eM r0 = r2.A0Y
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KT5 r0 = X.KT5.A00
            r1.A04(r2, r0)
            r0 = 198059033(0xbce2419, float:7.940263E-32)
            goto L_0x0d86
        L_0x0c78:
            r0 = -591850193(0xffffffffdcb9152f, float:-4.16769298E17)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            androidx.fragment.app.FragmentActivity r0 = X.DbZ.A0E(r0)
            X.0qQ.A0A(r0)
            X.W38.A01(r0)
            r0 = 887932746(0x34ecc74a, float:4.4103427E-7)
            goto L_0x0d86
        L_0x0c90:
            r0 = -1723304621(0xffffffff99487553, float:-1.0363451E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.K6t r5 = (X.C61422K6t) r5
            android.widget.SeekBar r0 = r5.A04
            if (r0 != 0) goto L_0x0ca9
            java.lang.String r4 = "seekBar"
        L_0x0ca1:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0ca9:
            int r1 = r0.getProgress()
            int r0 = r5.A01
            java.lang.String r4 = "videoPreviewView"
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r3 = r5.A08
            if (r1 < r0) goto L_0x0cc3
            if (r3 == 0) goto L_0x0ca1
            r0 = 0
            r3.A07(r0)
        L_0x0cbb:
            X.C61422K6t.A00(r5)
        L_0x0cbe:
            r0 = -232134394(0xfffffffff229e906, float:-3.3654192E30)
            goto L_0x1200
        L_0x0cc3:
            if (r3 == 0) goto L_0x0ca1
            X.JXT r1 = r3.A04
            X.JXT r0 = X.JXT.STARTED
            if (r1 != r0) goto L_0x0cdc
            r3.A04()
            android.widget.ImageView r1 = r5.A03
            if (r1 != 0) goto L_0x0cd5
            java.lang.String r4 = "scrubberButton"
            goto L_0x0ca1
        L_0x0cd5:
            r0 = 2131239498(0x7f08224a, float:1.8095305E38)
            r1.setImageResource(r0)
            goto L_0x0cbe
        L_0x0cdc:
            boolean r0 = r3.A08()
            if (r0 == 0) goto L_0x0cbe
            goto L_0x0cbb
        L_0x0ce3:
            r0 = 1020206276(0x3ccf1cc4, float:0.025282271)
            int r7 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.K6t r8 = (X.C61422K6t) r8
            com.instagram.common.ui.widget.videopreviewview.VideoPreviewView r1 = r8.A08
            if (r1 != 0) goto L_0x0cf6
            java.lang.String r23 = "videoPreviewView"
            goto L_0x11b6
        L_0x0cf6:
            int r0 = r1.getTop()
            float r2 = (float) r0
            float r0 = r1.getTranslationY()
            float r2 = r2 + r0
            float r1 = X.AnonymousClass7TE.A03(r1)
            android.graphics.RectF r0 = r8.A02
            java.lang.String r23 = "punchHoleRectF"
            if (r0 == 0) goto L_0x11b6
            float r6 = r0.top
            float r6 = r6 - r2
            float r6 = r6 / r1
            float r5 = r0.bottom
            float r5 = r5 - r2
            float r5 = r5 / r1
            X.0eM r4 = r8.A0E
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = X.JTO.A0k(r4)
            r2 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            com.instagram.api.schemas.MediaCroppingCoordinates r1 = new com.instagram.api.schemas.MediaCroppingCoordinates
            r1.<init>(r5, r2, r0, r6)
            X.Lsu r0 = r3.A0M
            r0.A09 = r1
            r0 = 0
            r8.A0A = r0
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r4)
            X.KTP r0 = X.KTP.A00
            r1.A04(r8, r0)
            r0 = 125679747(0x77db883, float:1.9087828E-34)
            X.AnonymousClass0fD.A0C(r0, r7)
            return
        L_0x0d37:
            r0 = -1954342196(0xffffffff8b831acc, float:-5.0499684E-32)
            int r4 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.KSq r5 = (X.C61941KSq) r5
            X.0eM r3 = r5.A0Y
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r3)
            java.util.List r11 = r5.A0N
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r7 = r5.A07
            X.1Xj r0 = r5.A0C
            java.lang.String r23 = "editMedia"
            if (r0 == 0) goto L_0x11b6
            X.1Xy r0 = r0.A0C
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r6 = r0.BQ3()
            boolean r1 = r5.A0W
            X.1Xj r0 = r5.A0C
            if (r0 == 0) goto L_0x11b6
            java.lang.String r9 = r0.getId()
            java.lang.String r10 = "igtv"
            X.AnonymousClass7TG.A1O(r8, r11)
            r12 = 0
            r14 = 1
            r13 = r12
            r15 = r12
            r16 = r1
            androidx.fragment.app.Fragment r1 = X.LLA.A00(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            androidx.fragment.app.FragmentActivity r0 = r5.requireActivity()
            X.Dbc.A0S(r1, r0, r3)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0H
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.LPL.A01(r5, r2, r1, r0, r3)
            r0 = -459915289(0xffffffffe4963fe7, float:-2.217293E22)
        L_0x0d86:
            X.AnonymousClass0fD.A0C(r0, r4)
            return
        L_0x0d8a:
            r0 = -1077993054(0xffffffffbfbf21a2, float:-1.4932139)
            int r22 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.KSq r8 = (X.C61941KSq) r8
            boolean r0 = r8.A0T
            if (r0 == 0) goto L_0x0f83
            X.0eM r0 = r8.A0Y
            r27 = r0
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r27)
            X.FYp r4 = X.C50334FYp.A00(r0)
            X.0qQ.A07(r4)
            android.content.Context r21 = r8.requireContext()
            X.0gy r20 = X.AnonymousClass07i.A00(r8)
            X.1Xj r0 = r8.A0C
            r19 = r0
            java.lang.String r23 = "editMedia"
            if (r0 == 0) goto L_0x11b6
            r10 = 0
            java.lang.String r3 = r8.A0F
            boolean r2 = r8.A0O
            boolean r0 = r8.A0R
            r18 = r0
            boolean r0 = r8.A0P
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.A0W
            r26 = r0
            java.util.List r14 = r8.A0M
            java.util.List r13 = r8.A0N
            com.instagram.api.schemas.BrandedContentProjectMetadataIntf r0 = r8.A07
            r25 = r0
            com.instagram.api.schemas.BrandedContentGatingInfoIntf r0 = r8.A06
            r24 = r0
            java.util.ArrayList r12 = r8.A0K
            java.util.ArrayList r11 = r8.A0J
            com.instagram.model.venue.Venue r1 = r8.A0E
            r0 = 2
            X.KTh r9 = new X.KTh
            r9.<init>(r8, r0)
            com.instagram.common.session.UserSession r7 = r4.A00
            r6 = 0
            X.0qQ.A0B(r7, r6)
            r16 = 1
            r0 = 3
            X.C51973G9u.A0u(r0, r3, r14, r13)
            r0 = 13
            X.C51969G9p.A1P(r12, r0, r11)
            java.lang.String r15 = X.C63383Kw4.A00(r1)
            r5 = -2
            X.1NY r1 = new X.1NY
            r1.<init>(r7, r5)
            r1.A04()
            java.lang.Object[] r4 = X.C51969G9p.A1b(r19)
            java.lang.String r0 = "media/%s/edit_media/"
            X.DbU.A1P(r1, r0, r4)
            java.lang.String r0 = "caption_text"
            r1.A9m(r0, r3)
            java.lang.String r3 = "1"
            if (r2 == 0) goto L_0x0e97
            r2 = r3
        L_0x0e14:
            java.lang.String r0 = "igtv_ads_toggled_on"
            r1.A9m(r0, r2)
            java.lang.String r2 = "location"
            r1.A9m(r2, r15)
            java.lang.String r0 = "waterfall_id"
            X.0qQ.A0B(r0, r6)
            java.lang.String r0 = "session_instance_id"
            X.0qQ.A0B(r0, r6)
            if (r18 == 0) goto L_0x0e2f
            java.lang.String r0 = "is_funded_deal"
            r1.A9m(r0, r3)
        L_0x0e2f:
            if (r17 == 0) goto L_0x0e3a
            boolean r2 = r17.booleanValue()
            java.lang.String r0 = "disable_comments"
            r1.A0H(r0, r2)
        L_0x0e3a:
            X.0Tu r4 = X.0Tu.A05
            r2 = 2342156773019486445(0x2081032d001a08ed, double:4.060298116550925E-152)
            boolean r15 = X.182.A06(r4, r7, r2)
            java.lang.String r0 = "include_e2ee_mentioned_user_list"
            r1.A0H(r0, r15)
            r0 = r24
            X.LSV.A02(r1, r0)
            r0 = r26
            X.LSV.A04(r1, r7, r14, r13, r0)
            r0 = r25
            X.LSV.A03(r1, r0)
            java.util.ArrayList r14 = r19.A3E()
            if (r14 != 0) goto L_0x0e63
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
        L_0x0e63:
            java.util.ArrayList r13 = X.C63461KxQ.A00(r14, r12)
            boolean r0 = X.DbT.A1b(r13)
            if (r0 != 0) goto L_0x0e73
            boolean r0 = r14.containsAll(r12)
            if (r0 != 0) goto L_0x0e7c
        L_0x0e73:
            java.lang.String r12 = com.instagram.tagging.model.TagSerializer.A01(r12, r13, r10)
            java.lang.String r0 = "usertags"
            r1.A9m(r0, r12)
        L_0x0e7c:
            java.util.ArrayList r13 = r19.A3I()
            if (r13 != 0) goto L_0x0e86
            java.util.ArrayList r13 = X.AnonymousClass7TE.A1C()
        L_0x0e86:
            java.util.ArrayList r12 = X.C63461KxQ.A00(r13, r11)
            boolean r0 = X.DbT.A1b(r12)
            if (r0 != 0) goto L_0x0e9b
            boolean r0 = r13.containsAll(r11)
            if (r0 != 0) goto L_0x0eb2
            goto L_0x0e9b
        L_0x0e97:
            java.lang.String r2 = "0"
            goto L_0x0e14
        L_0x0e9b:
            X.LOQ r0 = X.LOQ.A00     // Catch:{ IOException -> 0x0eb2 }
            java.lang.String r11 = r0.A00(r13, r11, r12, r10)     // Catch:{ IOException -> 0x0eb2 }
            int r0 = r11.length()     // Catch:{ IOException -> 0x0eb2 }
            if (r0 <= 0) goto L_0x0eb2
            boolean r0 = X.C51966G9m.A1X(r11)     // Catch:{ IOException -> 0x0eb2 }
            if (r0 == 0) goto L_0x0eb2
            java.lang.String r0 = "fb_user_tags"
            r1.A9m(r0, r11)     // Catch:{ IOException -> 0x0eb2 }
        L_0x0eb2:
            java.lang.Class<X.K1b> r11 = X.C61290K1b.class
            java.lang.Class<X.LJl> r0 = X.C64024LJl.class
            r1.A0O(r10, r11, r0, r6)
            r0 = r16
            X.1OC r11 = X.DbT.A0U(r1, r0)
            X.K1m r0 = new X.K1m
            r0.<init>(r7, r9)
            r11.A00 = r0
            r1 = r21
            r0 = r20
            X.1ES.A00(r1, r0, r11)
            X.0eM r1 = r8.A06
            X.LMg r0 = X.JTT.A0W(r1)
            java.lang.String r0 = r0.A02
            int r0 = r0.length()
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r13 = "Required value was null."
            if (r0 == 0) goto L_0x0f31
            boolean r0 = r8.A03
            if (r0 == 0) goto L_0x0f31
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r27)
            X.FYp r7 = X.C50334FYp.A00(r0)
            X.LMg r0 = X.JTT.A0W(r1)
            java.lang.String r1 = r0.A02
            X.1Xj r0 = r8.A0C
            if (r0 == 0) goto L_0x11b6
            java.lang.String r12 = r0.A2n()
            if (r12 == 0) goto L_0x0f79
            X.KTh r11 = new X.KTh
            r11.<init>(r8, r6)
            com.instagram.common.session.UserSession r9 = r7.A00
            X.0qQ.A0B(r9, r6)
            X.1NY r7 = new X.1NY
            r7.<init>(r9, r5)
            r7.A04()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r0 = "igtv/series/%s/add_episode/"
            r7.A0K(r0, r1)
            X.JTO.A1W(r7, r12)
            java.lang.Class<X.K1O> r1 = X.K1O.class
            java.lang.Class<X.LJ3> r0 = X.LJ3.class
            X.1OC r5 = X.DbT.A0R(r10, r7, r1, r0, r6)
            X.K1m r0 = new X.K1m
            r0.<init>(r9, r11)
            r5.A00 = r0
            r1 = r21
            r0 = r20
            X.1ES.A00(r1, r0, r5)
        L_0x0f31:
            X.0lg r0 = X.DbT.A0X(r27)
            boolean r0 = X.182.A06(r4, r0, r2)
            if (r0 == 0) goto L_0x0f69
            X.1Xj r0 = r8.A0C
            if (r0 == 0) goto L_0x11b6
            java.lang.String r4 = r0.getId()
            if (r4 == 0) goto L_0x0f61
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r27)
            X.8Oa r3 = X.AnonymousClass8OY.A00(r0)
            java.util.ArrayList r0 = r8.A0K
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0f57:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0f66
            X.JTU.A1M(r2, r1)
            goto L_0x0f57
        L_0x0f61:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0f66:
            r3.A01(r4, r2)
        L_0x0f69:
            X.LMW r2 = r8.A0D
            if (r2 != 0) goto L_0x0f71
            java.lang.String r23 = "logger"
            goto L_0x11b6
        L_0x0f71:
            java.lang.String r1 = r8.A0H
            if (r1 != 0) goto L_0x0f7e
            java.lang.String r23 = "mediaId"
            goto L_0x11b6
        L_0x0f79:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r13)
            throw r0
        L_0x0f7e:
            java.lang.String r0 = "tap_done"
            X.LMW.A00(r2, r0, r1)
        L_0x0f83:
            r1 = 2085806054(0x7c52dfe6, float:4.3796942E36)
            r0 = r22
            goto L_0x109b
        L_0x0f8a:
            r0 = -402550816(0xffffffffe8018fe0, float:-2.4473572E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KSo r4 = (X.C61939KSo) r4
            X.0eM r5 = r4.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r5)
            r2 = 0
            X.Lsu r1 = r1.A0M
            r1.A0A = r2
            boolean r1 = r4.A08
            if (r1 == 0) goto L_0x0fdd
            android.graphics.Bitmap r7 = r4.A00
            if (r7 == 0) goto L_0x0fd9
            X.LBd r6 = X.C65413Lst.A00
            android.content.Context r3 = r4.requireContext()
            X.0eM r1 = r4.A0C
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r5)
            r6.A00(r3, r7, r2, r1)
        L_0x0fbb:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r3 = X.JTO.A0k(r5)
            android.widget.SeekBar r1 = r4.A05
            if (r1 == 0) goto L_0x0ff1
            int r2 = r1.getProgress()
            X.Lsu r1 = r3.A0M
            r1.A01 = r2
        L_0x0fcb:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r5)
            X.KTP r1 = X.KTP.A00
            r2.A04(r4, r1)
            r1 = -1650044857(0xffffffff9da65047, float:-4.402284E-21)
            goto L_0x109b
        L_0x0fd9:
            r1 = 1
            r4.A04 = r1
            goto L_0x0fbb
        L_0x0fdd:
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r5)
            X.Lsu r1 = r1.A0M
            X.2Fj r2 = r1.A0j
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r5)
            X.Lsu r1 = r1.A0M
            java.lang.String r1 = r1.A0J
            r2.A0B(r1)
            goto L_0x0fcb
        L_0x0ff1:
            java.lang.String r23 = "seekBar"
            goto L_0x11b6
        L_0x0ff5:
            r0 = -603775262(0xffffffffdc031ee2, float:-1.47628712E17)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6n r3 = (X.C61416K6n) r3
            r0 = 0
            r3.A08 = r0
            android.widget.ImageView r1 = r3.A04
            if (r1 != 0) goto L_0x100b
            java.lang.String r23 = "addFromGalleryIcon"
            goto L_0x11b6
        L_0x100b:
            r0 = 1
            r1.setPressed(r0)
            X.0eM r0 = r3.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KTA r0 = X.KTA.A00
            r1.A04(r3, r0)
            r0 = -1911813599(0xffffffff8e0c0a21, float:-1.726121E-30)
            goto L_0x1200
        L_0x101f:
            r0 = -1223522010(0xffffffffb7128926, float:-8.7342105E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.KSp r3 = (X.C61940KSp) r3
            r5 = 1
            r3.A03 = r5
            boolean r1 = r3.A08
            if (r1 == 0) goto L_0x1069
            boolean r1 = r3.A02
            if (r1 != 0) goto L_0x1098
            X.0eM r6 = r3.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r6)
            X.KTX r2 = r1.A02()
            X.MW0 r4 = r2.A01
            r1 = 0
            r4.ESz(r1)
            X.3Q2 r2 = r2.A02
            boolean r1 = r2.A5L
            r4.ET1(r1)
            int r1 = r2.A05
            r4.ET2(r1)
            java.lang.String r1 = r2.A33
            r4.ET0(r1)
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r6)
            r2 = 0
            X.Lsu r1 = r1.A0M
            r1.A0A = r2
            r3.A02 = r5
            X.LZQ r2 = r3.A00
            if (r2 != 0) goto L_0x107e
            java.lang.String r23 = "singleVideoCoverFrameScrubbingController"
            goto L_0x11b6
        L_0x1069:
            r1 = 0
            r3.A03 = r1
            boolean r1 = r3.isResumed()
            if (r1 == 0) goto L_0x1098
            X.0eM r1 = r3.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r2 = X.JTO.A0k(r1)
            X.KTP r1 = X.KTP.A00
            r2.A04(r3, r1)
            goto L_0x1098
        L_0x107e:
            r1 = 1059363750(0x3f249ba6, float:0.643)
            r2.EJw(r5, r1)
            android.content.Context r1 = r3.requireContext()
            X.6ST r2 = new X.6ST
            r2.<init>(r1, r5)
            r1 = 2131969783(0x7f1346f7, float:1.9576499E38)
            X.DbU.A1L(r3, r2, r1)
            X.AnonymousClass0fN.A00(r2)
            r3.A01 = r2
        L_0x1098:
            r1 = -388480083(0xffffffffe8d843ad, float:-8.1702365E24)
        L_0x109b:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        L_0x109f:
            r0 = 363403693(0x15a919ad, float:6.8299066E-26)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.KTT r4 = (X.KTT) r4
            X.0eM r3 = r4.A01
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r0 = X.JTO.A0k(r3)
            com.instagram.api.schemas.MediaCroppingCoordinates r1 = r4.A00()
            X.Lsu r0 = r0.A0M
            r0.A0A = r1
            r0 = 0
            r4.A03 = r0
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r3)
            X.KTP r0 = X.KTP.A00
            r1.A04(r4, r0)
            r0 = 2027137599(0x78d3aa3f, float:3.4344614E34)
            goto L_0x1200
        L_0x10c9:
            r0 = -2130345665(0xffffffff8105813f, float:-2.4520972E-38)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.K6s r3 = (X.C61421K6s) r3
            X.L6i r0 = r3.A07
            if (r0 == 0) goto L_0x10e8
            X.0eM r0 = r3.A0D
            com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel r1 = X.JTO.A0k(r0)
            X.KT8 r0 = X.KT8.A00
            r1.A04(r3, r0)
            r0 = 260502139(0xf86f27b, float:1.330682E-29)
            goto L_0x1200
        L_0x10e8:
            java.lang.String r23 = "creationLogger"
            goto L_0x11b6
        L_0x10ec:
            r0 = 153070945(0x91fad61, float:1.9220451E-33)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6b r1 = (X.C61405K6b) r1
            r0 = 0
            X.C61405K6b.A01(r1, r0)
            r0 = -304773287(0xffffffffedd58759, float:-8.2604915E27)
            goto L_0x1200
        L_0x1100:
            r0 = 933456892(0x37a36bfc, float:1.9481398E-5)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.K6b r1 = (X.C61405K6b) r1
            r0 = 1
            X.C61405K6b.A01(r1, r0)
            r0 = -1145810498(0xffffffffbbb451be, float:-0.0055029085)
            goto L_0x1200
        L_0x1114:
            r0 = 1160295988(0x4528b634, float:2699.3877)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K4V r0 = (X.K4V) r0
            X.MSV r0 = r0.A02
            if (r0 == 0) goto L_0x1126
            r0.Dfk()
        L_0x1126:
            r0 = 418660275(0x18f43fb3, float:6.313684E-24)
            goto L_0x1200
        L_0x112b:
            r0 = -86909135(0xfffffffffad1df31, float:-5.4485845E35)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.K6o r0 = (X.C61417K6o) r0
            X.C61417K6o.A00(r0)
            r0 = 2063875242(0x7b043caa, float:6.866136E35)
            goto L_0x1200
        L_0x113e:
            r0 = 1833948568(0x6d4fd598, float:4.020101E27)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r0 = r1.A01
            X.LMX r0 = (X.LMX) r0
            androidx.appcompat.app.AppCompatActivity r0 = r0.A02
            r0.onBackPressed()
            r0 = 854295769(0x32eb84d9, float:2.7418013E-8)
            goto L_0x1200
        L_0x1153:
            r0 = 534391059(0x1fda2913, float:9.239454E-20)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JpN r1 = (X.C60676JpN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K6o r0 = r1.A07
            r0.A01()
            r0 = 559891064(0x215f4278, float:7.564331E-19)
            goto L_0x1200
        L_0x116a:
            r0 = -271321342(0xffffffffefd3f702, float:-1.311999E29)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JpN r1 = (X.C60676JpN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K6o r0 = r1.A07
            r0.A01()
            r0 = -599964158(0xffffffffdc3d4602, float:-2.1310298E17)
            goto L_0x1200
        L_0x1181:
            r0 = 1140852736(0x44000800, float:512.125)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.JpN r1 = (X.C60676JpN) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.K6o r0 = r1.A07
            r0.A01()
            r0 = -1585164923(0xffffffffa1844d85, float:-8.965187E-19)
            goto L_0x1200
        L_0x1197:
            r0 = -2004648145(0xffffffff88837f2f, float:-7.914176E-34)
            int r2 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r7 = r1.A01
            X.K6o r7 = (X.C61417K6o) r7
            androidx.fragment.app.FragmentActivity r1 = r7.getActivity()
            if (r1 == 0) goto L_0x11fd
            X.0eM r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.Hq6 r0 = (X.C55942Hq6) r0
            X.K1d r8 = r7.A00
            if (r8 != 0) goto L_0x11be
            java.lang.String r23 = "series"
        L_0x11b6:
            X.0qQ.A0F(r23)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x11be:
            r6 = 0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.6Yo r5 = X.DbS.A0M(r1, r0)
            X.1YO r0 = X.1YO.A00
            X.0qQ.A0A(r0)
            X.KTU r4 = new X.KTU
            r4.<init>()
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = r8.A03
            java.lang.String r0 = "igtv_series_id_arg"
            r3.putString(r0, r1)
            java.lang.String r1 = r8.A08
            java.lang.String r0 = "igtv_series_name_arg"
            r3.putString(r0, r1)
            java.lang.String r1 = r8.A05
            java.lang.String r0 = "igtv_series_description_arg"
            r3.putString(r0, r1)
            r4.setArguments(r3)
            r5.A0D(r4)
            r1 = 2130771974(0x7f010006, float:1.7147053E38)
            r0 = 2130771975(0x7f010007, float:1.7147055E38)
            r5.A0A(r1, r6, r6, r0)
            r5.A0F(r7, r6)
            r5.A04()
        L_0x11fd:
            r0 = 595841609(0x2383d249, float:1.4292108E-17)
        L_0x1200:
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x1204:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x1209:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LY6.onClick(android.view.View):void");
    }
}
