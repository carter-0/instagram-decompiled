package X;

import android.os.Looper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public abstract class UHS extends C18431Vra {
    public static final List A07 = new ArrayList();
    public C18047VkV A00;
    public boolean A01;
    public final VQY A02;
    public final List A03 = new ArrayList();
    public final C18725Vz0 A04;
    public final String A05;
    public final C19197WPd A06;

    public void A06() {
        A05(this, "detach", new Object[0]);
        if (this.A00) {
            VQY vqy = this.A02;
            vqy.A01.clear();
            vqy.A00 = false;
        }
        this.A00 = null;
        this.A00 = false;
    }

    public void A07() {
        A05(this, "refresh", new Object[0]);
    }

    public void A08() {
        A05(this, "suspend", new Object[0]);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.facebook.locationsharing.core.models.Location} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: com.facebook.locationsharing.core.models.Address} */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: type inference failed for: r5v17 */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0256, code lost:
        r11 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r8.size());
        r12 = X.AnonymousClass7TF.A0t(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0266, code lost:
        if (r12.hasNext() == false) goto L_0x027e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0268, code lost:
        r9 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r12.next();
        r0 = r9.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0274, code lost:
        if (r0 == -1) goto L_0x027a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0278, code lost:
        if (r0 <= r4) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027a, code lost:
        r11.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027e, code lost:
        r0 = r11.build();
        r8 = com.google.common.collect.ImmutableList.builder();
        r5 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x028e, code lost:
        if (r5.hasNext() == false) goto L_0x02a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0290, code lost:
        r4 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r5.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029e, code lost:
        if (android.text.TextUtils.equals(r6.A00, r4.A04) != false) goto L_0x028a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a0, code lost:
        r8.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a4, code lost:
        r8 = r8.build();
        r6 = X.C18725Vz0.A00(r7);
        r6.A09 = r8;
        X.C11367SPk.A03(r8, "sharers");
        r11 = com.google.common.collect.ImmutableList.builder();
        r9 = X.C9251RVc.A00(r2);
        r5 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02c3, code lost:
        if (r5.hasNext() == false) goto L_0x02e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c5, code lost:
        r4 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r5.next();
        r1 = r4.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02d1, code lost:
        if (r9.containsKey(r1) == false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02db, code lost:
        if (r9.get(r1).equals(r4) != false) goto L_0x02bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02dd, code lost:
        r11.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02e1, code lost:
        r1 = r11.build();
        r6.A0A = r1;
        X.C11367SPk.A03(r1, "updatedSharerIds");
        r9 = com.google.common.collect.ImmutableList.builder();
        r5 = X.C9251RVc.A00(r2);
        r4 = r8.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02fc, code lost:
        if (r4.hasNext() == false) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02fe, code lost:
        r1 = ((com.facebook.locationsharing.core.models.LiveLocationSharer) r4.next()).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x030a, code lost:
        if (r5.containsKey(r1) != false) goto L_0x02f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x030c, code lost:
        r9.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0310, code lost:
        r1 = r9.build();
        r6.A06 = r1;
        X.C11367SPk.A03(r1, "addedSharerIds");
        r5 = com.google.common.collect.ImmutableList.builder();
        r4 = X.C9251RVc.A00(r8);
        r2 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x032b, code lost:
        if (r2.hasNext() == false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x032d, code lost:
        r1 = ((com.facebook.locationsharing.core.models.LiveLocationSharer) r2.next()).A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0339, code lost:
        if (r4.containsKey(r1) != false) goto L_0x0327;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x033b, code lost:
        r5.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033f, code lost:
        r1 = r5.build();
        r6.A08 = r1;
        X.C11367SPk.A03(r1, "removedSharerIds");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x034c, code lost:
        if (r69 == null) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x034e, code lost:
        r5 = (com.facebook.locationsharing.core.models.Location) r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0352, code lost:
        r6 = X.C18725Vz0.A00(r7);
        r6.A04 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x035a, code lost:
        r0 = X.C18725Vz0.A00(r7);
        r0.A03 = (com.facebook.locationsharing.core.models.LiveLocationSession) r8;
        r2 = new X.C18047VkV(X.C18725Vz0.A01, new com.facebook.locationsharing.core.models.LocationSharingPresenterState(r0), (java.lang.Throwable) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0370, code lost:
        r0 = X.C18725Vz0.A00(r7);
        r0.A03 = null;
        r2 = new X.C18047VkV(X.C18725Vz0.A01, new com.facebook.locationsharing.core.models.LocationSharingPresenterState(r0), (java.lang.Throwable) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0384, code lost:
        r1 = r4.A00(r2);
        r2 = new X.C18047VkV(X.C18725Vz0.A01, r1, (java.lang.Throwable) r8, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0393, code lost:
        r8 = (com.facebook.locationsharing.core.models.Location) r8;
        r6 = X.C18725Vz0.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x039a, code lost:
        r6 = X.C18725Vz0.A00(r7);
        r8 = r1.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03a0, code lost:
        r6.A05 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x03a4, code lost:
        r2 = new X.C18047VkV(X.C18725Vz0.A01, r4.A00(r2), (java.lang.Throwable) null, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x03b1, code lost:
        r2 = new X.C18047VkV(X.C18725Vz0.A01, r4.A00(r2), (java.lang.Throwable) null, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03c0, code lost:
        r6 = X.C18725Vz0.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03c6, code lost:
        r8 = (com.google.common.collect.ImmutableCollection) r8;
        r6 = X.C18725Vz0.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03cc, code lost:
        if (r8 == null) goto L_0x03e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ce, code lost:
        r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x03d2, code lost:
        r6.A07 = r1;
        X.C11367SPk.A03(r1, "pointsOfInterest");
        r6.A00 = -1;
        r6.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x03e0, code lost:
        r1 = com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03e5, code lost:
        r30 = r9.build();
        X.C11367SPk.A03(r30, "pointOfInterestViewModels");
        r67 = r6.A00;
        r66 = r6.A0B;
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03fc, code lost:
        if (r0 == null) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03fe, code lost:
        r0 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0404, code lost:
        if (r0 == -1) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0406, code lost:
        r0 = java.lang.Math.max(r0 - r6.A01, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x040f, code lost:
        if (r0 == -1) goto L_0x0509;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0413, code lost:
        if (r0 <= 0) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0415, code lost:
        r4 = ((double) r0) / 60000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0420, code lost:
        if (r4 <= 1.0d) goto L_0x0503;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0422, code lost:
        r0 = java.lang.Math.floor(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0426, code lost:
        r29 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0429, code lost:
        r0 = r6.A09;
        r28 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r0.size());
        r27 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x043b, code lost:
        if (r27.hasNext() == false) goto L_0x0511;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x043d, code lost:
        r7 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r27.next();
        r11 = r7.A01;
        r14 = r7.A04;
        r26 = new java.util.HashSet();
        r42 = r11.A00;
        r8 = r6.A01;
        r46 = (int) java.lang.Math.max(X.AnonymousClass7TE.A0P(r8 - r11.A02), 0);
        r44 = r11.A01;
        X.C11367SPk.A03(r14, "userId");
        r0 = r7.A05;
        r38 = r0;
        X.C11367SPk.A03(r0, "userName");
        r15 = r11.A00();
        X.C11367SPk.A03(r15, com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0484, code lost:
        if (r26.contains(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS) != false) goto L_0x0492;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0486, code lost:
        r4 = new java.util.HashSet(r26);
        r26 = r4;
        r4.add(com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        if (r3.equals("SHARER_SELECTED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0492, code lost:
        r50 = r6.A0A.contains(r14);
        r48 = r6.A06.contains(r14);
        r0 = r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04a4, code lost:
        if (r0 == -1) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04a6, code lost:
        r4 = java.lang.Math.max(r0 - r8, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x04af, code lost:
        if (r4 == -1) goto L_0x0501;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04b3, code lost:
        if (r4 > 0) goto L_0x04e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04b5, code lost:
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x04b6, code lost:
        if (r12 == null) goto L_0x04e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x04b8, code lost:
        r0 = (long) X.C16787V5u.A00(r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x04bd, code lost:
        r5 = r7.A02;
        X.C11367SPk.A03(r5, "fullAddress");
        r28.add(new X.C18057Vkf(r15, r5, r14, r38, r26, r42, r44, r46, r8, r0, r48, false, r50));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04e6, code lost:
        r0 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x04e9, code lost:
        r0 = ((double) r4) / 60000.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x04f4, code lost:
        if (r0 <= 1.0d) goto L_0x04fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x04f6, code lost:
        r0 = java.lang.Math.floor(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x04fa, code lost:
        r8 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x04fc, code lost:
        r0 = java.lang.Math.ceil(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0501, code lost:
        r8 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0503, code lost:
        r0 = java.lang.Math.ceil(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0509, code lost:
        r29 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x050d, code lost:
        r29 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006f, code lost:
        if (r3.equals("CURRENT_TIME_UPDATED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0511, code lost:
        r5 = r6.A08.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x051b, code lost:
        if (r5.hasNext() == false) goto L_0x054e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x051d, code lost:
        r4 = X.AnonymousClass7TE.A18(r5);
        r54 = new java.util.HashSet();
        X.C11367SPk.A03(r4, "userId");
        r28.add(new X.C18057Vkf((java.lang.Integer) null, "", r4, "", r54, 0.0d, 0.0d, 0, 0, -1, false, true, false));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x054e, code lost:
        r1 = r28.build();
        X.C11367SPk.A03(r1, "sharerViewModels");
        r33 = new X.C18019Vjv(r30, r1, r68, r66, r69, r18, r20, r22, r16, r29, r67, r70);
        r2 = new X.C18042VkQ(X.VJc.A00, r33, r2.A03, r2.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0583, code lost:
        if (r10.A00 == false) goto L_0x058a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0585, code lost:
        r10.A01.EEv(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x058a, code lost:
        r1 = r10.A03.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0594, code lost:
        if (r1.hasNext() == false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0596, code lost:
        ((X.X2G) r1.next()).EEv(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x05a0, code lost:
        r2 = A07.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x05aa, code lost:
        if (r2.hasNext() == false) goto L_0x05c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x05ac, code lost:
        r1 = (X.UHS) r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x05b2, code lost:
        if (r1 == r10) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x05b4, code lost:
        A04(r1, r32, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x05c1, code lost:
        throw new java.lang.IllegalArgumentException("address must not be null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r3.equals("POINTS_OF_INTEREST_SELECTED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        if (r3.equals("SHARERS_UPDATED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r3.equals("ERROR") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (r3.equals("MAP_MOVED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        if (r3.equals("MAP_CENTERED") == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fb, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fc, code lost:
        switch(r0) {
            case 0: goto L_0x03c0;
            case 1: goto L_0x03a4;
            case 2: goto L_0x01fd;
            case 3: goto L_0x020c;
            case 4: goto L_0x0218;
            case 5: goto L_0x01da;
            case 6: goto L_0x0224;
            case 7: goto L_0x034c;
            case 8: goto L_0x035a;
            case 9: goto L_0x0370;
            case 10: goto L_0x0384;
            case 11: goto L_0x0393;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x03b1;
            case 13: goto L_0x01e1;
            case 14: goto L_0x03c6;
            case 15: goto L_0x039a;
            default: goto L_0x00ff;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        r6 = X.C18725Vz0.A00(r7);
        r6.A0D = true;
        r6.A00 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x010a, code lost:
        r6.A0B = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x010c, code lost:
        r5 = r7.A04;
        r4 = r7.A03;
        r2 = new X.C18047VkV(X.C18725Vz0.A01, new com.facebook.locationsharing.core.models.LocationSharingPresenterState(r6), r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0122, code lost:
        if (r2.equals(r10.A00) != false) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        throw new java.lang.UnsupportedOperationException(X.002.A0R("Unsupported action: ", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0124, code lost:
        A05(r10, "State changed. state=\"%s\"", r2);
        r10.A00 = r2;
        r6 = (com.facebook.locationsharing.core.models.LocationSharingPresenterState) r2.A01.A00(r2.A02);
        r12 = r6.A04;
        r5 = r6.A05;
        r4 = r6.A02;
        com.google.common.collect.ImmutableList.of();
        com.google.common.collect.ImmutableList.of();
        r70 = r6.A0D;
        r0 = r6.A0C;
        r69 = r0;
        X.C11367SPk.A03(r0, "userId");
        r16 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0159, code lost:
        if (r12 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015b, code lost:
        r18 = r12.A00;
        r20 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0163, code lost:
        if (r5 == null) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0165, code lost:
        r22 = r5.A00;
        r16 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x016d, code lost:
        if (r4 == null) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x016f, code lost:
        r68 = r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        X.C11367SPk.A03(r68, "mapAddress");
        r0 = r6.A07;
        r9 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r0.size());
        r24 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x018c, code lost:
        if (r24.hasNext() == false) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x018e, code lost:
        r11 = (com.facebook.locationsharing.core.models.PointOfInterest) r24.next();
        r8 = r11.A00;
        r4 = -1;
        r7 = r11.A01;
        X.C11367SPk.A03(r7, "fullAddress");
        r27 = r8.A00;
        r14 = r8.A01;
        r26 = r11.A02;
        r25 = r11.A04;
        r11 = r11.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01af, code lost:
        if (r12 == null) goto L_0x01b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b1, code lost:
        r4 = (long) X.C16787V5u.A00(r12, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b6, code lost:
        r9.add(new com.facebook.locationsharing.core.models.PointOfInterestViewModel(r7, r26, r11, r25, r27, r14, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01cf, code lost:
        r68 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01d2, code lost:
        r22 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01d5, code lost:
        r18 = 0.0d;
        r20 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01da, code lost:
        r6 = X.C18725Vz0.A00(r7);
        r6.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01e1, code lost:
        r8 = (com.facebook.locationsharing.core.models.Address) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01e3, code lost:
        if (r8 == null) goto L_0x05ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e5, code lost:
        r6 = X.C18725Vz0.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01eb, code lost:
        if (r1.A0D == false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f3, code lost:
        if (android.text.TextUtils.isEmpty(r8.A01) == false) goto L_0x01fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01f5, code lost:
        r5 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f7, code lost:
        r6.A02 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01fb, code lost:
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01fd, code lost:
        r6 = X.C18725Vz0.A00(r7);
        r6.A0B = (java.lang.String) r8;
        r6.A00 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0208, code lost:
        r6.A0D = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x020c, code lost:
        r0 = X.AnonymousClass7TE.A0R(r32);
        r6 = X.C18725Vz0.A00(r7);
        r6.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0218, code lost:
        r0 = X.AnonymousClass7TE.A0M(r32);
        r6 = X.C18725Vz0.A00(r7);
        r6.A00 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0224, code lost:
        if (r69 != null) goto L_0x022a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0226, code lost:
        r8 = com.google.common.collect.ImmutableList.of();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022a, code lost:
        r2 = r1.A09;
        r4 = r1.A01;
        r14 = new com.google.common.collect.ImmutableList[]{r2, (com.google.common.collect.ImmutableList) r8};
        r8 = new java.util.LinkedHashMap();
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x023a, code lost:
        r12 = r14[r11].iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0244, code lost:
        if (r12.hasNext() == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0246, code lost:
        r1 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r12.next();
        r8.put(r1.A04, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0252, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0254, code lost:
        if (r11 < 2) goto L_0x023a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.UHS r68, java.lang.Object r69, java.lang.String r70) {
        /*
            r10 = r68
            X.VkV r0 = r10.A00
            if (r0 == 0) goto L_0x05c2
            r9 = 2
            r13 = 0
            r33 = 1
            r32 = r69
            r3 = r70
            r0 = r32
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r0}
            java.lang.String r0 = "Dispatch action. action=%s payload=\"%s\""
            A05(r10, r0, r1)
            X.Vz0 r6 = r10.A04
            X.VkV r7 = r10.A00
            r8 = r32
            X.V4A r4 = r7.A01
            java.lang.Object r2 = r7.A02
            java.lang.Object r1 = r4.A00(r2)
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r1 = (com.facebook.locationsharing.core.models.LocationSharingPresenterState) r1
            int r0 = r3.hashCode()
            switch(r0) {
                case -2116533376: goto L_0x004a;
                case -2044189691: goto L_0x0055;
                case -1964292889: goto L_0x0060;
                case -1743906225: goto L_0x0069;
                case -1148781180: goto L_0x0072;
                case -1130840262: goto L_0x007b;
                case -882097764: goto L_0x0085;
                case -790629321: goto L_0x008e;
                case -70865718: goto L_0x009c;
                case -57999850: goto L_0x00a7;
                case 66247144: goto L_0x00b2;
                case 657651152: goto L_0x00bc;
                case 1054633244: goto L_0x00c6;
                case 1310009446: goto L_0x00d1;
                case 1629737106: goto L_0x00dc;
                case 1991226199: goto L_0x00e7;
                case 2037425915: goto L_0x00f1;
                case 2050291783: goto L_0x003c;
                default: goto L_0x0030;
            }
        L_0x0030:
            java.lang.String r0 = "Unsupported action: "
            java.lang.String r0 = X.002.A0R(r0, r3)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x003c:
            java.lang.String r0 = "PIN_DRAGGING_STOPPED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            X.VtK r6 = X.C18725Vz0.A00(r7)
            goto L_0x0208
        L_0x004a:
            java.lang.String r0 = "SHARER_UNSELECTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 0
            goto L_0x00fb
        L_0x0055:
            java.lang.String r0 = "LOADED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 1
            goto L_0x00fb
        L_0x0060:
            java.lang.String r0 = "SHARER_SELECTED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x01fd
            goto L_0x0030
        L_0x0069:
            java.lang.String r0 = "CURRENT_TIME_UPDATED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x020c
            goto L_0x0030
        L_0x0072:
            java.lang.String r0 = "POINTS_OF_INTEREST_SELECTED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0218
            goto L_0x0030
        L_0x007b:
            java.lang.String r0 = "PIN_ADDRESS_SHARED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 5
            goto L_0x00fb
        L_0x0085:
            java.lang.String r0 = "SHARERS_UPDATED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0224
            goto L_0x0030
        L_0x008e:
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 7
            goto L_0x00fb
        L_0x009c:
            java.lang.String r0 = "LIVE_LOCATION_STARTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 8
            goto L_0x00fb
        L_0x00a7:
            java.lang.String r0 = "LIVE_LOCATION_STOPPED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 9
            goto L_0x00fb
        L_0x00b2:
            java.lang.String r0 = "ERROR"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0384
            goto L_0x0030
        L_0x00bc:
            java.lang.String r0 = "MAP_MOVED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0393
            goto L_0x0030
        L_0x00c6:
            java.lang.String r0 = "LOADING"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 12
            goto L_0x00fb
        L_0x00d1:
            java.lang.String r0 = "PIN_ADDRESS_UPDATED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 13
            goto L_0x00fb
        L_0x00dc:
            java.lang.String r0 = "POINTS_OF_INTEREST_UPDATED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 14
            goto L_0x00fb
        L_0x00e7:
            java.lang.String r0 = "MAP_CENTERED"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x039a
            goto L_0x0030
        L_0x00f1:
            java.lang.String r0 = "PIN_DRAGGING_STARTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0030
            r0 = 16
        L_0x00fb:
            r5 = 0
            switch(r0) {
                case 0: goto L_0x03c0;
                case 1: goto L_0x03a4;
                case 2: goto L_0x01fd;
                case 3: goto L_0x020c;
                case 4: goto L_0x0218;
                case 5: goto L_0x01da;
                case 6: goto L_0x0224;
                case 7: goto L_0x034c;
                case 8: goto L_0x035a;
                case 9: goto L_0x0370;
                case 10: goto L_0x0384;
                case 11: goto L_0x0393;
                case 12: goto L_0x03b1;
                case 13: goto L_0x01e1;
                case 14: goto L_0x03c6;
                case 15: goto L_0x039a;
                default: goto L_0x00ff;
            }
        L_0x00ff:
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r0 = r33
            r6.A0D = r0
            r0 = -1
            r6.A00 = r0
        L_0x010a:
            r6.A0B = r5
        L_0x010c:
            boolean r5 = r7.A04
            java.lang.Throwable r4 = r7.A03
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r1 = new com.facebook.locationsharing.core.models.LocationSharingPresenterState
            r1.<init>((X.C18520VtK) r6)
            X.UHL r0 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r2.<init>(r0, r1, r4, r5)
        L_0x011c:
            X.VkV r0 = r10.A00
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x05a0
            java.lang.Object[] r1 = new java.lang.Object[]{r2}
            java.lang.String r0 = "State changed. state=\"%s\""
            A05(r10, r0, r1)
            r10.A00 = r2
            X.V4A r1 = r2.A01
            java.lang.Object r0 = r2.A02
            java.lang.Object r6 = r1.A00(r0)
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r6 = (com.facebook.locationsharing.core.models.LocationSharingPresenterState) r6
            com.facebook.locationsharing.core.models.Location r12 = r6.A04
            com.facebook.locationsharing.core.models.Location r5 = r6.A05
            com.facebook.locationsharing.core.models.Address r4 = r6.A02
            java.lang.String r51 = ""
            com.google.common.collect.ImmutableList.of()
            com.google.common.collect.ImmutableList.of()
            boolean r0 = r6.A0D
            r70 = r0
            java.lang.String r0 = r6.A0C
            r69 = r0
            java.lang.String r31 = "userId"
            r1 = r0
            r0 = r31
            X.C11367SPk.A03(r1, r0)
            r16 = 0
            if (r12 == 0) goto L_0x01d5
            double r0 = r12.A00
            r18 = r0
            double r0 = r12.A01
            r20 = r0
        L_0x0163:
            if (r5 == 0) goto L_0x01d2
            double r0 = r5.A00
            r22 = r0
            double r0 = r5.A01
            r16 = r0
        L_0x016d:
            if (r4 == 0) goto L_0x01cf
            java.lang.String r0 = r4.A01
            r68 = r0
        L_0x0173:
            java.lang.String r1 = "mapAddress"
            r0 = r68
            X.C11367SPk.A03(r0, r1)
            com.google.common.collect.ImmutableList r0 = r6.A07
            int r1 = r0.size()
            com.google.common.collect.ImmutableList$Builder r9 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r1)
            X.3kO r24 = r0.iterator()
        L_0x0188:
            boolean r0 = r24.hasNext()
            if (r0 == 0) goto L_0x03e5
            java.lang.Object r11 = r24.next()
            com.facebook.locationsharing.core.models.PointOfInterest r11 = (com.facebook.locationsharing.core.models.PointOfInterest) r11
            com.facebook.locationsharing.core.models.Location r8 = r11.A00
            r4 = -1
            java.lang.String r7 = r11.A01
            java.lang.String r0 = "fullAddress"
            X.C11367SPk.A03(r7, r0)
            double r0 = r8.A00
            r27 = r0
            double r14 = r8.A01
            java.lang.String r0 = r11.A02
            r26 = r0
            java.lang.String r0 = r11.A04
            r25 = r0
            java.lang.String r11 = r11.A03
            if (r12 == 0) goto L_0x01b6
            double r0 = X.C16787V5u.A00(r12, r8)
            long r4 = (long) r0
        L_0x01b6:
            com.facebook.locationsharing.core.models.PointOfInterestViewModel r0 = new com.facebook.locationsharing.core.models.PointOfInterestViewModel
            r37 = r11
            r38 = r25
            r39 = r27
            r41 = r14
            r43 = r4
            r34 = r0
            r35 = r7
            r36 = r26
            r34.<init>(r35, r36, r37, r38, r39, r41, r43)
            r9.add(r0)
            goto L_0x0188
        L_0x01cf:
            r68 = r51
            goto L_0x0173
        L_0x01d2:
            r22 = 0
            goto L_0x016d
        L_0x01d5:
            r18 = 0
            r20 = 0
            goto L_0x0163
        L_0x01da:
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A0D = r13
            goto L_0x01f7
        L_0x01e1:
            com.facebook.locationsharing.core.models.Address r8 = (com.facebook.locationsharing.core.models.Address) r8
            if (r8 == 0) goto L_0x05ba
            X.VtK r6 = X.C18725Vz0.A00(r7)
            boolean r0 = r1.A0D
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = r8.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01fb
            com.facebook.locationsharing.core.models.Address r5 = r1.A02
        L_0x01f7:
            r6.A02 = r5
            goto L_0x010c
        L_0x01fb:
            r5 = r8
            goto L_0x01f7
        L_0x01fd:
            java.lang.String r8 = (java.lang.String) r8
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A0B = r8
            r0 = -1
            r6.A00 = r0
        L_0x0208:
            r6.A0D = r13
            goto L_0x010c
        L_0x020c:
            long r0 = X.AnonymousClass7TE.A0R(r32)
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A01 = r0
            goto L_0x010c
        L_0x0218:
            int r0 = X.AnonymousClass7TE.A0M(r32)
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A00 = r0
            goto L_0x010c
        L_0x0224:
            if (r69 != 0) goto L_0x022a
            com.google.common.collect.ImmutableList r8 = com.google.common.collect.ImmutableList.of()
        L_0x022a:
            com.google.common.collect.ImmutableList r2 = r1.A09
            long r4 = r1.A01
            com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
            com.google.common.collect.ImmutableList[] r14 = new com.google.common.collect.ImmutableList[]{r2, r8}
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            r11 = 0
        L_0x023a:
            r0 = r14[r11]
            X.3kO r12 = r0.iterator()
        L_0x0240:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0252
            java.lang.Object r1 = r12.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r1 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r1
            java.lang.String r0 = r1.A04
            r8.put(r0, r1)
            goto L_0x0240
        L_0x0252:
            int r11 = r11 + 1
            if (r11 < r9) goto L_0x023a
            int r0 = r8.size()
            com.google.common.collect.ImmutableList$Builder r11 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r0)
            java.util.Iterator r12 = X.AnonymousClass7TF.A0t(r8)
        L_0x0262:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x027e
            java.lang.Object r9 = r12.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r9 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r9
            long r0 = r9.A00
            r14 = -1
            int r8 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r8 == 0) goto L_0x027a
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0262
        L_0x027a:
            r11.add(r9)
            goto L_0x0262
        L_0x027e:
            com.google.common.collect.ImmutableList r0 = r11.build()
            com.google.common.collect.ImmutableList$Builder r8 = com.google.common.collect.ImmutableList.builder()
            X.3kO r5 = r0.iterator()
        L_0x028a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r4 = r5.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r4 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r4
            java.lang.String r1 = r6.A00
            java.lang.String r0 = r4.A04
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x028a
            r8.add(r4)
            goto L_0x028a
        L_0x02a4:
            com.google.common.collect.ImmutableList r8 = r8.build()
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A09 = r8
            java.lang.String r0 = "sharers"
            X.C11367SPk.A03(r8, r0)
            com.google.common.collect.ImmutableList$Builder r11 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableMap r9 = X.C9251RVc.A00(r2)
            X.3kO r5 = r8.iterator()
        L_0x02bf:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02e1
            java.lang.Object r4 = r5.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r4 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r4
            java.lang.String r1 = r4.A04
            boolean r0 = r9.containsKey(r1)
            if (r0 == 0) goto L_0x02bf
            java.lang.Object r0 = r9.get(r1)
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02bf
            r11.add(r1)
            goto L_0x02bf
        L_0x02e1:
            com.google.common.collect.ImmutableList r1 = r11.build()
            r6.A0A = r1
            java.lang.String r0 = "updatedSharerIds"
            X.C11367SPk.A03(r1, r0)
            com.google.common.collect.ImmutableList$Builder r9 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableMap r5 = X.C9251RVc.A00(r2)
            X.3kO r4 = r8.iterator()
        L_0x02f8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0310
            java.lang.Object r0 = r4.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r0 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r0
            java.lang.String r1 = r0.A04
            boolean r0 = r5.containsKey(r1)
            if (r0 != 0) goto L_0x02f8
            r9.add(r1)
            goto L_0x02f8
        L_0x0310:
            com.google.common.collect.ImmutableList r1 = r9.build()
            r6.A06 = r1
            java.lang.String r0 = "addedSharerIds"
            X.C11367SPk.A03(r1, r0)
            com.google.common.collect.ImmutableList$Builder r5 = com.google.common.collect.ImmutableList.builder()
            com.google.common.collect.ImmutableMap r4 = X.C9251RVc.A00(r8)
            X.3kO r2 = r2.iterator()
        L_0x0327:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x033f
            java.lang.Object r0 = r2.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r0 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r0
            java.lang.String r1 = r0.A04
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x0327
            r5.add(r1)
            goto L_0x0327
        L_0x033f:
            com.google.common.collect.ImmutableList r1 = r5.build()
            r6.A08 = r1
            java.lang.String r0 = "removedSharerIds"
            X.C11367SPk.A03(r1, r0)
            goto L_0x010c
        L_0x034c:
            if (r69 == 0) goto L_0x0352
            r5 = r32
            com.facebook.locationsharing.core.models.Location r5 = (com.facebook.locationsharing.core.models.Location) r5
        L_0x0352:
            X.VtK r6 = X.C18725Vz0.A00(r7)
            r6.A04 = r5
            goto L_0x010c
        L_0x035a:
            com.facebook.locationsharing.core.models.LiveLocationSession r8 = (com.facebook.locationsharing.core.models.LiveLocationSession) r8
            X.VtK r0 = X.C18725Vz0.A00(r7)
            r0.A03 = r8
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r1 = new com.facebook.locationsharing.core.models.LocationSharingPresenterState
            r1.<init>((X.C18520VtK) r0)
            X.UHL r0 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r2.<init>(r0, r1, r5, r13)
            goto L_0x011c
        L_0x0370:
            X.VtK r0 = X.C18725Vz0.A00(r7)
            r0.A03 = r5
            com.facebook.locationsharing.core.models.LocationSharingPresenterState r1 = new com.facebook.locationsharing.core.models.LocationSharingPresenterState
            r1.<init>((X.C18520VtK) r0)
            X.UHL r0 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r2.<init>(r0, r1, r5, r13)
            goto L_0x011c
        L_0x0384:
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            java.lang.Object r1 = r4.A00(r2)
            X.UHL r0 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r2.<init>(r0, r1, r8, r13)
            goto L_0x011c
        L_0x0393:
            com.facebook.locationsharing.core.models.Location r8 = (com.facebook.locationsharing.core.models.Location) r8
            X.VtK r6 = X.C18725Vz0.A00(r7)
            goto L_0x03a0
        L_0x039a:
            X.VtK r6 = X.C18725Vz0.A00(r7)
            com.facebook.locationsharing.core.models.Location r8 = r1.A04
        L_0x03a0:
            r6.A05 = r8
            goto L_0x010c
        L_0x03a4:
            java.lang.Object r1 = r4.A00(r2)
            X.UHL r0 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r2.<init>(r0, r1, r5, r13)
            goto L_0x011c
        L_0x03b1:
            java.lang.Object r4 = r4.A00(r2)
            X.UHL r1 = X.C18725Vz0.A01
            X.VkV r2 = new X.VkV
            r0 = r33
            r2.<init>(r1, r4, r5, r0)
            goto L_0x011c
        L_0x03c0:
            X.VtK r6 = X.C18725Vz0.A00(r7)
            goto L_0x010a
        L_0x03c6:
            com.google.common.collect.ImmutableCollection r8 = (com.google.common.collect.ImmutableCollection) r8
            X.VtK r6 = X.C18725Vz0.A00(r7)
            if (r8 == 0) goto L_0x03e0
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r8)
        L_0x03d2:
            r6.A07 = r1
            java.lang.String r0 = "pointsOfInterest"
            X.C11367SPk.A03(r1, r0)
            r0 = -1
            r6.A00 = r0
            r6.A0D = r13
            goto L_0x010a
        L_0x03e0:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            goto L_0x03d2
        L_0x03e5:
            com.google.common.collect.ImmutableList r30 = r9.build()
            java.lang.String r1 = "pointOfInterestViewModels"
            r0 = r30
            X.C11367SPk.A03(r0, r1)
            int r0 = r6.A00
            r67 = r0
            java.lang.String r0 = r6.A0B
            r66 = r0
            com.facebook.locationsharing.core.models.LiveLocationSession r0 = r6.A03
            r4 = 0
            if (r0 == 0) goto L_0x050d
            long r0 = r0.A00
            r14 = -1
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0509
            long r7 = r6.A01
            long r0 = r0 - r7
            long r0 = java.lang.Math.max(r0, r4)
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 == 0) goto L_0x0509
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L_0x050d
            double r4 = (double) r0
            r0 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r4 = r4 / r0
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x0503
            double r0 = java.lang.Math.floor(r4)
        L_0x0426:
            int r4 = (int) r0
            r29 = r4
        L_0x0429:
            com.google.common.collect.ImmutableList r0 = r6.A09
            int r1 = r0.size()
            com.google.common.collect.ImmutableList$Builder r28 = com.google.common.collect.ImmutableList.builderWithExpectedSize(r1)
            X.3kO r27 = r0.iterator()
        L_0x0437:
            boolean r0 = r27.hasNext()
            if (r0 == 0) goto L_0x0511
            java.lang.Object r7 = r27.next()
            com.facebook.locationsharing.core.models.LiveLocationSharer r7 = (com.facebook.locationsharing.core.models.LiveLocationSharer) r7
            com.facebook.locationsharing.core.models.Location r11 = r7.A01
            java.lang.String r14 = r7.A04
            java.util.HashSet r26 = new java.util.HashSet
            r26.<init>()
            double r0 = r11.A00
            r42 = r0
            long r8 = r6.A01
            long r0 = r11.A02
            long r4 = r8 - r0
            long r4 = X.AnonymousClass7TE.A0P(r4)
            r0 = 0
            long r0 = java.lang.Math.max(r4, r0)
            int r4 = (int) r0
            r46 = r4
            double r0 = r11.A01
            r44 = r0
            r0 = r31
            X.C11367SPk.A03(r14, r0)
            java.lang.String r0 = r7.A05
            r38 = r0
            java.lang.String r1 = "userName"
            X.C11367SPk.A03(r0, r1)
            java.lang.Integer r15 = r11.A00()
            java.lang.String r1 = "status"
            X.C11367SPk.A03(r15, r1)
            r0 = r26
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L_0x0492
            java.util.HashSet r4 = new java.util.HashSet
            r0 = r26
            r4.<init>(r0)
            r26 = r4
            r4.add(r1)
        L_0x0492:
            com.google.common.collect.ImmutableList r0 = r6.A0A
            boolean r50 = r0.contains(r14)
            com.google.common.collect.ImmutableList r0 = r6.A06
            boolean r48 = r0.contains(r14)
            long r0 = r7.A00
            r24 = -1
            int r4 = (r0 > r24 ? 1 : (r0 == r24 ? 0 : -1))
            if (r4 == 0) goto L_0x0501
            long r0 = r0 - r8
            r8 = 0
            long r4 = java.lang.Math.max(r0, r8)
            int r0 = (r4 > r24 ? 1 : (r4 == r24 ? 0 : -1))
            if (r0 == 0) goto L_0x0501
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x04e9
            r8 = 0
        L_0x04b6:
            if (r12 == 0) goto L_0x04e6
            double r4 = X.C16787V5u.A00(r11, r12)
            long r0 = (long) r4
        L_0x04bd:
            java.lang.String r5 = r7.A02
            java.lang.String r4 = "fullAddress"
            X.C11367SPk.A03(r5, r4)
            X.Vkf r4 = new X.Vkf
            r34 = r4
            r35 = r15
            r36 = r5
            r37 = r14
            r39 = r26
            r40 = r42
            r42 = r44
            r44 = r46
            r45 = r8
            r46 = r0
            r49 = r13
            r34.<init>(r35, r36, r37, r38, r39, r40, r42, r44, r45, r46, r48, r49, r50)
            r0 = r28
            r0.add(r4)
            goto L_0x0437
        L_0x04e6:
            r0 = -1
            goto L_0x04bd
        L_0x04e9:
            double r0 = (double) r4
            r4 = 4678479150791524352(0x40ed4c0000000000, double:60000.0)
            double r0 = r0 / r4
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x04fc
            double r0 = java.lang.Math.floor(r0)
        L_0x04fa:
            int r8 = (int) r0
            goto L_0x04b6
        L_0x04fc:
            double r0 = java.lang.Math.ceil(r0)
            goto L_0x04fa
        L_0x0501:
            r8 = -1
            goto L_0x04b6
        L_0x0503:
            double r0 = java.lang.Math.ceil(r4)
            goto L_0x0426
        L_0x0509:
            r29 = -1
            goto L_0x0429
        L_0x050d:
            r29 = 0
            goto L_0x0429
        L_0x0511:
            com.google.common.collect.ImmutableList r0 = r6.A08
            X.3kO r5 = r0.iterator()
        L_0x0517:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x054e
            java.lang.String r4 = X.AnonymousClass7TE.A18(r5)
            r50 = 0
            java.util.HashSet r54 = new java.util.HashSet
            r54.<init>()
            r0 = r31
            X.C11367SPk.A03(r4, r0)
            r61 = -1
            r55 = 0
            X.Vkf r1 = new X.Vkf
            r49 = r1
            r52 = r4
            r53 = r51
            r57 = r55
            r59 = r13
            r60 = r13
            r63 = r13
            r64 = r33
            r65 = r13
            r49.<init>(r50, r51, r52, r53, r54, r55, r57, r59, r60, r61, r63, r64, r65)
            r0 = r28
            r0.add(r1)
            goto L_0x0517
        L_0x054e:
            com.google.common.collect.ImmutableList r1 = r28.build()
            java.lang.String r0 = "sharerViewModels"
            X.C11367SPk.A03(r1, r0)
            X.Vjv r5 = new X.Vjv
            r33 = r5
            r34 = r30
            r35 = r1
            r36 = r68
            r37 = r66
            r38 = r69
            r39 = r18
            r41 = r20
            r43 = r22
            r45 = r16
            r47 = r29
            r48 = r67
            r49 = r70
            r33.<init>(r34, r35, r36, r37, r38, r39, r41, r43, r45, r47, r48, r49)
            X.UHM r4 = X.VJc.A00
            boolean r1 = r2.A04
            java.lang.Throwable r0 = r2.A03
            X.VkQ r2 = new X.VkQ
            r2.<init>(r4, r5, r0, r1)
            boolean r0 = r10.A00
            if (r0 == 0) goto L_0x058a
            X.X2G r0 = r10.A01
            r0.EEv(r2)
        L_0x058a:
            java.util.List r0 = r10.A03
            java.util.Iterator r1 = r0.iterator()
        L_0x0590:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x05a0
            java.lang.Object r0 = r1.next()
            X.X2G r0 = (X.X2G) r0
            r0.EEv(r2)
            goto L_0x0590
        L_0x05a0:
            java.util.List r0 = A07
            java.util.Iterator r2 = r0.iterator()
        L_0x05a6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05c2
            java.lang.Object r1 = r2.next()
            X.UHS r1 = (X.UHS) r1
            if (r1 == r10) goto L_0x05a6
            r0 = r32
            A04(r1, r0, r3)
            goto L_0x05a6
        L_0x05ba:
            java.lang.String r0 = "address must not be null"
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r0)
            throw r1
        L_0x05c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UHS.A04(X.UHS, java.lang.Object, java.lang.String):void");
    }

    public static void A05(UHS uhs, String str, Object... objArr) {
        C19197WPd wPd = uhs.A06;
        Thread currentThread = Thread.currentThread();
        Thread thread = Looper.getMainLooper().getThread();
        wPd.A00(002.A0g(String.format(Locale.US, str, objArr), " thread=", currentThread.getName()));
        if (!uhs.A01 && currentThread.getId() != thread.getId()) {
            wPd.A00("Not running in main thread.");
            uhs.A01 = true;
        }
    }

    public UHS(VQY vqy, X2G x2g, C18725Vz0 vz0, C19197WPd wPd, String str) {
        super(x2g);
        this.A04 = vz0;
        this.A02 = vqy;
        this.A06 = wPd;
        this.A05 = TextUtils.isEmpty(str) ? "PresenterBase" : str;
        A05(this, "init", new Object[0]);
    }
}
