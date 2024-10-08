package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.Collections;
import java.util.List;

public abstract class LPR {
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r25.B02().isEmpty() != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration A01(android.content.Context r24, com.instagram.feed.media.CreativeConfigIntf r25, java.lang.String r26) {
        /*
            r5 = 5
            r4 = 0
            java.util.List r0 = r25.B02()
            if (r0 == 0) goto L_0x0013
            java.util.List r0 = r25.B02()
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            X.17k.A0F(r0)
            boolean r0 = X.C284745Nt.A0A(r25)
            r12 = 0
            if (r0 == 0) goto L_0x00dc
            X.6Ku r3 = X.C284745Nt.A03(r25)
        L_0x0022:
            boolean r0 = X.C305756Jk.A00(r24)
            if (r0 != 0) goto L_0x00d9
            android.content.res.Resources r1 = r24.getResources()
            r0 = 2131976002(0x7f135f42, float:1.9589112E38)
            java.lang.String r2 = r1.getString(r0)
        L_0x0033:
            com.google.common.collect.ImmutableList$Builder r1 = new com.google.common.collect.ImmutableList$Builder
            r1.<init>()
            java.util.List r0 = r25.B02()
            java.util.Iterator r8 = r0.iterator()
        L_0x0040:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00df
            java.lang.Object r0 = r8.next()
            com.instagram.feed.media.EffectPreviewIntf r0 = (com.instagram.feed.media.EffectPreviewIntf) r0
            X.0qQ.A0B(r0, r4)
            java.lang.String r6 = r0.getId()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0069
            r0 = 4343(0x10f7, float:6.086E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r0)
            r0 = 2251(0x8cb, float:3.154E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0wb.A03(r6, r0)
            goto L_0x0040
        L_0x0069:
            java.lang.String r14 = r0.getId()
            java.lang.String r15 = r0.getName()
            com.instagram.common.typedurl.ImageUrl r10 = X.DDx.A00(r0)
            java.lang.String r16 = X.DDx.A03(r0)
            java.lang.String r17 = X.DDx.A02(r0)
            com.instagram.api.schemas.AttributionUser r6 = r0.AdD()
            com.instagram.api.schemas.ProfilePicture r6 = r6.Bh6()
            if (r6 == 0) goto L_0x00d7
            com.instagram.common.typedurl.ImageUrl r11 = r6.CCI()
        L_0x008b:
            java.lang.String r7 = r0.getSaveStatus()
            java.lang.String r6 = "SAVED"
            boolean r25 = r6.equals(r7)
            com.instagram.feed.media.EffectActionSheetIntf r6 = r0.Azy()
            if (r6 == 0) goto L_0x00a1
            java.util.List r21 = r6.BfN()
            if (r21 != 0) goto L_0x00a3
        L_0x00a1:
            X.0sn r21 = X.0sn.A00
        L_0x00a3:
            com.instagram.feed.media.EffectActionSheetIntf r6 = r0.Azy()
            if (r6 == 0) goto L_0x00af
            java.util.List r22 = r6.BqS()
            if (r22 != 0) goto L_0x00b1
        L_0x00af:
            X.0sn r22 = X.0sn.A00
        L_0x00b1:
            com.instagram.model.effect.AttributedAREffect r9 = new com.instagram.model.effect.AttributedAREffect
            r13 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r23 = r12
            r24 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            java.lang.String r0 = X.DDx.A03(r0)
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r6 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration
            r6.<init>(r9, r0)
            r6.A09 = r2
            r6.A02 = r3
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r0 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
            r6.A01 = r0
            r1.add(r6)
            goto L_0x0040
        L_0x00d7:
            r11 = 0
            goto L_0x008b
        L_0x00d9:
            r2 = r12
            goto L_0x0033
        L_0x00dc:
            r3 = r12
            goto L_0x0022
        L_0x00df:
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r2 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration
            r2.<init>()
            com.google.common.collect.ImmutableList r1 = r1.build()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0103
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            r2.A02 = r0
            r2.A00 = r5
            X.28D r0 = X.28D.A4f
            r2.A01 = r0
            r2.A06 = r4
            r2.A04 = r4
            r0 = r26
            r2.A03 = r0
            return r2
        L_0x0103:
            r0 = 2658(0xa62, float:3.725E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LPR.A01(android.content.Context, com.instagram.feed.media.CreativeConfigIntf, java.lang.String):com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration");
    }

    public static String A02(int i) {
        if (i == 2) {
            return "profile_effect_preview_video";
        }
        if (i == 3) {
            return "gallery_effect_preview_video";
        }
        if (i == 4) {
            return C66579MXk.A00(292);
        }
        if (i == 7) {
            return "search_effect_preview_video";
        }
        if (i == 11) {
            return "ig_map";
        }
        0kD.A01(AnonymousClass000.A00(931), 002.A0O("Unhandled effect surface: ", i));
        return AnonymousClass000.A00(534);
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public static EffectInfoBottomSheetConfiguration A00(Context context, UserSession userSession, ImageUrl imageUrl, ImageUrl imageUrl2, C306106Ku r27, C62622Kit kit, ProductItemWithARIntf productItemWithARIntf, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, boolean z, boolean z2, boolean z3) {
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        ProductAREffectContainer productAREffectContainer;
        List list3 = list;
        String str8 = str3;
        String str9 = str5;
        String str10 = str2;
        List list4 = list2;
        if (z3) {
            list3 = Collections.singletonList("REPORT");
            list4.clear();
        }
        if (!C305756Jk.A00(context)) {
            str9 = context.getResources().getString(2131976002);
        }
        ProductItemWithARIntf productItemWithARIntf2 = productItemWithARIntf;
        if (productItemWithARIntf != null) {
            str10 = C16910VAn.A00(C14502TxO.A00(productItemWithARIntf2.BgJ()), false);
        }
        String str11 = str8;
        if (!(productItemWithARIntf == null || productItemWithARIntf2.BgJ().BRo() == null)) {
            str11 = productItemWithARIntf2.BgJ().BRo().A03.getUsername();
        }
        int i2 = i;
        ImageUrl imageUrl3 = imageUrl;
        AttributedAREffect attributedAREffect = new AttributedAREffect(imageUrl3, imageUrl2, (C62622Kit) null, (ProductAREffectContainer) null, str, str10, str11, str4, (String) null, (String) null, (String) null, list3, list4, (List) null, i2, z);
        if (!(productItemWithARIntf == null || productItemWithARIntf2.BgJ().BRo() == null)) {
            str8 = productItemWithARIntf2.BgJ().BRo().A03.getUsername();
        }
        str8.getClass();
        EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(attributedAREffect, str8);
        effectInfoAttributionConfiguration.A08 = str6;
        effectInfoAttributionConfiguration.A09 = str9;
        effectInfoAttributionConfiguration.A02 = r27;
        if (productItemWithARIntf != null) {
            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
        } else {
            effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
        }
        effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
        if (productItemWithARIntf != null) {
            ProductItemWithAR FFL = productItemWithARIntf2.FFL(1E4.A00(userSession));
            boolean A1a = DbW.A1a(productItemWithARIntf2.BgJ());
            ? obj = new Object();
            obj.A00 = FFL;
            obj.A01 = A1a;
            productAREffectContainer = obj;
        } else {
            productAREffectContainer = null;
        }
        effectInfoAttributionConfiguration.A05 = productAREffectContainer;
        effectInfoAttributionConfiguration.A03 = kit;
        effectInfoAttributionConfiguration.A0A = Boolean.valueOf(z2).booleanValue();
        EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
        effectInfoBottomSheetConfiguration.A02 = ImmutableList.of(effectInfoAttributionConfiguration);
        effectInfoBottomSheetConfiguration.A00 = i2;
        effectInfoBottomSheetConfiguration.A01 = 28D.A4f;
        effectInfoBottomSheetConfiguration.A06 = false;
        effectInfoBottomSheetConfiguration.A03 = str7;
        effectInfoBottomSheetConfiguration.A04 = false;
        return effectInfoBottomSheetConfiguration;
    }
}
