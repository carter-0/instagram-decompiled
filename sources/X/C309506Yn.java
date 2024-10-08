package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.api.schemas.MoreInfoSUGPositionType;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: X.6Yn  reason: invalid class name and case insensitive filesystem */
public abstract class C309506Yn {
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        if (A01(r12, r4) != X.AnonymousClass6MV.A05) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if ("com.facebook.orca".equals(r10.CHl()) == false) goto L_0x0095;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C300635xX A00(android.content.Context r17, com.instagram.common.session.UserSession r18, X.AnonymousClass6MT r19, X.C255773uh r20, java.lang.Boolean r21, java.lang.Integer r22, java.lang.String r23, java.lang.String r24, int r25, boolean r26, boolean r27) {
        /*
            r5 = 0
            r11 = r17
            X.0qQ.A0B(r11, r5)
            r2 = 1
            r12 = r18
            r4 = r20
            X.6MV r1 = A01(r12, r4)
            X.6MV r3 = X.AnonymousClass6MV.BLUE_ICON_BLACK_TEXT_WITH_SENTENCE_CASE
            java.lang.String r17 = "link_sticker_redesign_default"
            r15 = r22
            if (r1 == r3) goto L_0x0023
            X.6MV r0 = X.AnonymousClass6MV.DOMINANT_COLOR_BLACK_TEXT_WITH_UPPER_CASE
            if (r1 == r0) goto L_0x00dd
            X.6MV r0 = X.AnonymousClass6MV.DOMINANT_COLOR_BLACK_TEXT_WITH_SENTENCE_CASE
            if (r1 == r0) goto L_0x00dd
            if (r22 != 0) goto L_0x00d9
            java.lang.String r17 = "link_sticker_default"
        L_0x0023:
            X.1Xj r6 = r4.A0b
            com.instagram.model.androidlink.AndroidLink r10 = X.AnonymousClass47K.A02(r11, r12, r6, r5, r5)
            com.instagram.model.androidlink.AndroidLink r0 = X.AnonymousClass4EQ.A04(r11, r12, r4)
            if (r0 == 0) goto L_0x0079
            X.47L r1 = X.AnonymousClass47L.AD_DESTINATION_PROFILE_VISIT
            X.47L r0 = X.C271714jT.A01(r0)
            if (r1 != r0) goto L_0x0079
            X.0Tu r5 = X.0Tu.A05
            r0 = 36329603643621591(0x811195000240d7, double:3.038325859573754E-306)
            boolean r0 = X.182.A06(r5, r12, r0)
            if (r0 == 0) goto L_0x0079
            r0 = 2131237883(0x7f081bfb, float:1.809203E38)
        L_0x0047:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
        L_0x004b:
            X.6MV r1 = A01(r12, r4)
            X.6MV r0 = X.AnonymousClass6MV.DOMINANT_COLOR_DOMINANT_TEXT_WITH_SENTENCE_CASE
            if (r1 == r0) goto L_0x0063
            X.6MV r0 = A01(r12, r4)
            if (r0 == r3) goto L_0x0063
            X.6MV r1 = A01(r12, r4)
            X.6MV r0 = X.AnonymousClass6MV.DOMINANT_COLOR_BLACK_TEXT_WITH_SENTENCE_CASE
            r22 = 0
            if (r1 != r0) goto L_0x0065
        L_0x0063:
            r22 = 1
        L_0x0065:
            X.5xX r10 = new X.5xX
            r13 = r19
            r14 = r21
            r18 = r23
            r19 = r24
            r20 = r25
            r23 = r27
            r21 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r10
        L_0x0079:
            if (r26 == 0) goto L_0x007f
            r0 = 2131238787(0x7f081f83, float:1.8093863E38)
            goto L_0x0047
        L_0x007f:
            r9 = 0
            if (r6 == 0) goto L_0x00c9
            boolean r5 = r6.A5n()
        L_0x0086:
            if (r10 == 0) goto L_0x0095
            java.lang.String r1 = r10.CHl()
            java.lang.String r0 = "com.facebook.orca"
            boolean r0 = r0.equals(r1)
            r8 = 1
            if (r0 != 0) goto L_0x0096
        L_0x0095:
            r8 = 0
        L_0x0096:
            boolean r7 = X.C270804hK.A02(r10)
            if (r10 == 0) goto L_0x00c7
            X.47L r1 = X.C271714jT.A01(r10)
        L_0x00a0:
            X.47L r0 = X.AnonymousClass47L.AD_DESTINATION_JOIN_CHANNEL
            r6 = 0
            if (r1 != r0) goto L_0x00a6
            r6 = 1
        L_0x00a6:
            if (r8 != 0) goto L_0x00ac
            if (r7 != 0) goto L_0x00ac
            if (r6 == 0) goto L_0x00ad
        L_0x00ac:
            r9 = 1
        L_0x00ad:
            r16 = 0
            if (r9 == 0) goto L_0x004b
            if (r5 != 0) goto L_0x004b
            X.0Tu r5 = X.0Tu.A05
            r0 = 36602488685597320(0x8209c500001288, double:3.2108994589390714E-306)
            long r0 = X.182.A01(r5, r12, r0)
            int r5 = (int) r0
            if (r5 != r2) goto L_0x004b
            if (r8 == 0) goto L_0x00cb
            r0 = 2131237893(0x7f081c05, float:1.809205E38)
            goto L_0x0047
        L_0x00c7:
            r1 = 0
            goto L_0x00a0
        L_0x00c9:
            r5 = 0
            goto L_0x0086
        L_0x00cb:
            if (r7 == 0) goto L_0x00d2
            r0 = 2131237902(0x7f081c0e, float:1.8092068E38)
            goto L_0x0047
        L_0x00d2:
            if (r6 == 0) goto L_0x004b
            r0 = 2131238060(0x7f081cac, float:1.8092388E38)
            goto L_0x0047
        L_0x00d9:
            java.lang.String r17 = "link_sticker_primary_color"
            goto L_0x0023
        L_0x00dd:
            if (r22 == 0) goto L_0x0023
            java.lang.String r17 = "link_sticker_redesign_primary_icon"
            goto L_0x0023
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309506Yn.A00(android.content.Context, com.instagram.common.session.UserSession, X.6MT, X.3uh, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.String, int, boolean, boolean):X.5xX");
    }

    public static final Integer A02(UserSession userSession, C255773uh r6) {
        1Xj r3 = r6.A0b;
        if ((r3 == null || !C243213Xw.A06(r3) || !182.A06(0Tu.A05, userSession, 36328486952058231L)) && !A07(userSession, r6) && !C297785sK.A0O(r3)) {
            int A01 = (int) 182.A01(0Tu.A05, userSession, 36595384811653258L);
            if (A01 != 0) {
                if (A01 != 1) {
                    if (A01 == 3) {
                        return AnonymousClass05K.A0C;
                    }
                }
            }
            return AnonymousClass05K.A00;
        }
        return AnonymousClass05K.A01;
    }

    public static final String A03(Context context, UserSession userSession, C255773uh r9) {
        C250243l8 Ata;
        String Amm;
        0qQ.A0B(r9, 0);
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        if (!r9.CcK()) {
            return null;
        }
        1Xj r6 = r9.A0b;
        r6.getClass();
        AndroidLink A00 = AnonymousClass47K.A00(context, userSession, r6, (String) null, false);
        if (A00 == null) {
            return null;
        }
        AnonymousClass47L A01 = C271714jT.A01(A00);
        if (AnonymousClass47L.AD_DESTINATION_WEB == A01) {
            return A00.CGH();
        }
        if (AnonymousClass47L.AD_DESTINATION_JOIN_CHANNEL == A01) {
            EnumSet enumSet = 1sx.A01;
            C250513lZ injected = r6.A0C.getInjected();
            if (injected == null || (Ata = injected.Ata()) == null || (Amm = Ata.Amm()) == null) {
                String BMq = r6.A0C.BMq();
                if (BMq != null) {
                    return BMq;
                }
                String string = context.getString(2131955154);
                0qQ.A07(string);
                return string;
            } else if (182.A01(0Tu.A05, userSession, 36608896776804105L) != 0) {
                return 1sx.A08(context, r6);
            } else {
                return Amm;
            }
        } else {
            String Awc = A00.Awc();
            if (Awc == null || Awc.length() == 0) {
                return null;
            }
            return context.getString(2131971659, new Object[]{Awc});
        }
    }

    public static final boolean A05(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        1Xj r1;
        C250723lx C05;
        0qQ.A0B(r5, 1);
        0qQ.A0B(userSession, 3);
        boolean z = false;
        if (!A0A(userSession, r5, r6)) {
            return false;
        }
        if (A02(userSession, r5) == AnonymousClass05K.A0C && (r1 = r5.A0b) != null && r1.A0C.C05() != null && (((C05 = r1.A0C.C05()) == null || C05.Auw() == null) && C316216lI.A0B(context))) {
            z = true;
        }
        return !z;
    }

    public static final boolean A08(UserSession userSession, C255773uh r5) {
        C250183l2 r0;
        AnonymousClass41Z BUC;
        C270854hQ B7C;
        MoreInfoSUGPositionType C2j;
        C250513lZ injected;
        0qQ.A0B(userSession, 0);
        1Xj r1 = r5.A0b;
        if (r1 == null || (injected = r1.A0C.getInjected()) == null) {
            r0 = null;
        } else {
            r0 = injected.AaH();
        }
        if (C295435o9.A00(r0, userSession, false)) {
            return !182.A06(0Tu.A06, userSession, 36323745308224965L);
        }
        if (r1 == null || (BUC = r1.A0C.BUC()) == null || (B7C = BUC.B7C()) == null || (C2j = B7C.C2j()) == null || C2j != MoreInfoSUGPositionType.ABOVE_CTA) {
            return false;
        }
        return true;
    }

    public static final boolean A09(UserSession userSession, C255773uh r4, int i) {
        1Xj r1;
        0qQ.A0B(userSession, 0);
        if ((i == 0 || 182.A06(0Tu.A05, userSession, 36328547082255783L)) && (((r1 = r4.A0b) == null || (!r1.A5n() && !r1.A5e())) && 182.A06(0Tu.A05, userSession, 36328547081600421L))) {
            return true;
        }
        return false;
    }

    public static final boolean A0A(UserSession userSession, C255773uh r6, C250973mM r7) {
        if (!r6.CcK() || (!A04(userSession, r6, r7).isEmpty())) {
            return false;
        }
        0Tu r3 = 0Tu.A05;
        boolean A06 = 182.A06(r3, userSession, 36313909832976674L);
        boolean A062 = 182.A06(r3, userSession, 36313909833369892L);
        if (!C297785sK.A0Z(r6) && !r6.A1A() && !C297785sK.A0d(r6) && !C297785sK.A0c(r6) && !r6.A15()) {
            return A06;
        }
        if (!A06 || !A062) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008e, code lost:
        if (com.instagram.model.reels.sponsored.AutoGeneratedCardType.MAI == r5.A0C.Ae3()) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A0B(com.instagram.common.session.UserSession r10, X.C255773uh r11, X.C250973mM r12) {
        /*
            r3 = 0
            X.0qQ.A0B(r11, r3)
            r0 = r11
            boolean r1 = X.C297785sK.A0l(r12)
            if (r1 != 0) goto L_0x0015
            java.util.List r0 = X.C250973mM.A00(r10, r12)
            java.lang.Object r0 = r0.get(r3)
            X.3uh r0 = (X.C255773uh) r0
        L_0x0015:
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x0058
            X.1Xy r0 = r0.A0C
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.BwC()
            if (r0 == 0) goto L_0x0058
            java.lang.String r1 = r0.C4b()
        L_0x0025:
            java.lang.String r0 = "bloks_dpa_showcase_2"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r9 = 0
            if (r0 != 0) goto L_0x0057
            boolean r0 = X.C297785sK.A0H(r10, r11, r12)
            if (r0 != 0) goto L_0x0057
            r0 = r11
            X.1Xj r5 = r11.A0b
            if (r5 == 0) goto L_0x0069
            X.1Xy r1 = r5.A0C
            X.3lx r1 = r1.C05()
            if (r1 == 0) goto L_0x005a
            X.1Xy r1 = r5.A0C
            X.3lx r1 = r1.C05()
            if (r1 == 0) goto L_0x004f
            X.3lv r1 = r1.Auw()
            if (r1 != 0) goto L_0x005a
        L_0x004f:
            java.lang.Integer r2 = A02(r10, r11)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            if (r2 != r1) goto L_0x005a
        L_0x0057:
            return r3
        L_0x0058:
            r1 = 0
            goto L_0x0025
        L_0x005a:
            X.1Xy r1 = r5.A0C
            X.3lx r1 = r1.C05()
            if (r1 == 0) goto L_0x0069
            X.3lv r1 = r1.Auw()
            if (r1 == 0) goto L_0x0069
            return r3
        L_0x0069:
            X.0Tu r4 = X.0Tu.A05
            r1 = 36313909833566501(0x81034f00090925, double:3.0284010309010143E-306)
            boolean r8 = X.182.A06(r4, r10, r1)
            r1 = 36313909834156327(0x81034f00120927, double:3.0284010312740227E-306)
            boolean r7 = X.182.A06(r4, r10, r1)
            X.3mL r6 = r11.A0e
            X.3mL r4 = X.C250963mL.MEDIA
            if (r6 != r4) goto L_0x0091
            r5.getClass()
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r2 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.MAI
            X.1Xy r1 = r5.A0C
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = r1.Ae3()
            if (r2 != r1) goto L_0x0091
        L_0x0090:
            return r8
        L_0x0091:
            boolean r1 = r11.A1A()
            if (r1 != 0) goto L_0x0090
            if (r6 != r4) goto L_0x00a7
            r5.getClass()
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r2 = com.instagram.model.reels.sponsored.AutoGeneratedCardType.COLLECTION
            X.1Xy r1 = r5.A0C
            com.instagram.model.reels.sponsored.AutoGeneratedCardType r1 = r1.Ae3()
            if (r2 != r1) goto L_0x00a7
            return r8
        L_0x00a7:
            boolean r1 = X.C297785sK.A0l(r12)
            if (r1 != 0) goto L_0x00b7
            java.util.List r0 = X.C250973mM.A00(r10, r12)
            java.lang.Object r0 = r0.get(r3)
            X.3uh r0 = (X.C255773uh) r0
        L_0x00b7:
            X.1Xj r0 = r0.A0b
            if (r0 == 0) goto L_0x00ee
            X.1Xy r0 = r0.A0C
            com.instagram.model.showreel.IgShowreelComposition r0 = r0.BwC()
            if (r0 == 0) goto L_0x00ee
            java.lang.String r1 = r0.C4b()
        L_0x00c7:
            java.lang.String r0 = "bloks_dpa_showcase_flexible_tiles"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0090
            boolean r0 = X.C297785sK.A0a(r11)
            if (r0 != 0) goto L_0x0090
            boolean r0 = X.C297785sK.A0Z(r11)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = X.C297785sK.A0d(r11)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = X.C297785sK.A0c(r11)
            if (r0 != 0) goto L_0x00f0
            boolean r0 = r11.A15()
            if (r0 != 0) goto L_0x00f0
            return r8
        L_0x00ee:
            r1 = 0
            goto L_0x00c7
        L_0x00f0:
            if (r8 == 0) goto L_0x00f6
            if (r7 == 0) goto L_0x00f6
            r9 = 1
            return r9
        L_0x00f6:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C309506Yn.A0B(com.instagram.common.session.UserSession, X.3uh, X.3mM):boolean");
    }

    public static final AnonymousClass6MV A01(UserSession userSession, C255773uh r5) {
        0Tu r3 = 0Tu.A05;
        int A01 = (int) 182.A01(r3, userSession, 36603575312913342L);
        if (182.A06(r3, userSession, 36313909835401521L) && !C297785sK.A0D(userSession, r5)) {
            A01 = (int) 182.A01(r3, userSession, 36595384812177547L);
        }
        if (A01 == 1) {
            return AnonymousClass6MV.BLUE_ICON_BLACK_TEXT_WITH_SENTENCE_CASE;
        }
        if (A01 == 2) {
            return AnonymousClass6MV.DOMINANT_COLOR_DOMINANT_TEXT_WITH_UPPER_CASE;
        }
        if (A01 == 3) {
            return AnonymousClass6MV.DOMINANT_COLOR_BLACK_TEXT_WITH_UPPER_CASE;
        }
        if (A01 != 4) {
            return AnonymousClass6MV.DOMINANT_COLOR_DOMINANT_TEXT_WITH_SENTENCE_CASE;
        }
        return AnonymousClass6MV.DOMINANT_COLOR_BLACK_TEXT_WITH_SENTENCE_CASE;
    }

    public static final ArrayList A04(UserSession userSession, C255773uh r5, C250973mM r6) {
        ArrayList arrayList = new ArrayList();
        if (C297785sK.A0m(r6)) {
            arrayList.add("IS_MULTI_ADVERTISER_CAROUSEL");
        }
        List A0b = r5.A0b();
        if (A0b != null && !A0b.isEmpty() && !C297785sK.A0O(r5.A0b)) {
            arrayList.add("HAS_OTHER_INTERACTIVE_ELEMENTS");
        }
        if (!r6.A0H.A0v(r6.A03(userSession, r5))) {
            arrayList.add("BACKEND_INVALIDATION");
        }
        if (C297785sK.A0B(userSession, r5) && !182.A06(0Tu.A05, userSession, 36313909835139373L)) {
            arrayList.add("IS_DISCLAIMER_AD");
        }
        if (!AnonymousClass4EQ.A0G(r5)) {
            arrayList.add("NO_CTA_LINKS");
        }
        if (r5.A1I()) {
            arrayList.add("IS_GENERIC_PROFILE_CARD");
        }
        if (r5.A1M()) {
            arrayList.add("IS_LEADGEN_CARD");
        }
        if (r5.A1F()) {
            arrayList.add("IS_FIRST_QUESTION_LEADGEN_CARD_WITH_MCQ");
        }
        if (r5.A1G()) {
            arrayList.add("IS_FIRST_QUESTION_LEADGEN_CARD_WITH_SAQ");
        }
        if (r5.A1X()) {
            arrayList.add("IS_OFFSITE_LEADGEN_CARD");
        }
        if (r5.A18()) {
            arrayList.add("IS_CLICK_TO_MESSAGING_FAQS_CARD");
        }
        if (C297785sK.A0F(userSession, r5)) {
            arrayList.add("IS_REMINDER_AD");
        }
        if (r5.A19()) {
            arrayList.add("IS_CLICK_TO_MESSAGING_WHATSAPP_CARD");
        }
        return arrayList;
    }

    public static final boolean A07(UserSession userSession, C255773uh r4) {
        1Xj r2 = r4.A0b;
        if (r2 == null || !C243213Xw.A09(r2) || !C243213Xw.A02(userSession, r2)) {
            return false;
        }
        return true;
    }

    public static final boolean A0C(UserSession userSession, C309426Yf r9) {
        if (((double) r9.A0O) <= 0.0d) {
            return false;
        }
        if ((182.A06(0Tu.A06, userSession, 36313909835270447L) || r9.A0D <= 0) && !r9.A0j && ((double) (SystemClock.uptimeMillis() - r9.A0O)) < ((double) ((int) 182.A01(0Tu.A05, userSession, 36595384811260040L)))) {
            return false;
        }
        return true;
    }

    public static final boolean A06(Context context, UserSession userSession, C255773uh r2, C250973mM r3) {
        if (A05(context, userSession, r2, r3) || r2.A1I() || r2.A1M() || r2.A1F() || r2.A1G() || r2.A1X() || r2.A18() || r2.A19() || C297785sK.A0m(r3) || C297785sK.A0F(userSession, r2)) {
            return false;
        }
        return AnonymousClass4EQ.A0G(r2);
    }
}
