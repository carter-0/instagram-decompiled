package X;

import android.content.Context;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration;
import com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectActionSheetIntf;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.effect.AttributedAREffect;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.34G  reason: invalid class name */
public final /* synthetic */ class AnonymousClass34G implements 1wn {
    public final /* synthetic */ AnonymousClass348 A00;

    public /* synthetic */ AnonymousClass34G(AnonymousClass348 r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v35, types: [java.lang.Object, com.instagram.model.shopping.ProductAREffectContainer] */
    public final void onEvent(Object obj) {
        ImmutableList copyOf;
        ImageUrl imageUrl;
        List list;
        List list2;
        C306106Ku r0;
        EffectInfoBottomSheetMode effectInfoBottomSheetMode;
        ProductAREffectContainer productAREffectContainer;
        AnonymousClass348 r3 = this.A00;
        1Xj r4 = ((C240193Jy) obj).A00;
        CreativeConfigIntf AsO = r4.A0C.AsO();
        Context context = r3.A00.getContext();
        if (context != null && AsO != null && AsO.B02() != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = AsO.B02().iterator();
            String str = null;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                EffectPreviewIntf effectPreviewIntf = (EffectPreviewIntf) it.next();
                0qQ.A0B(effectPreviewIntf, 0);
                if (effectPreviewIntf.getId().length() == 0) {
                    0wb.A03("EffectPreview", AnonymousClass000.A00(2251));
                    0wb.A03("MediaFeedbackHelper", 002.A0R("Receiving invalid config for effect: ", effectPreviewIntf.getName()));
                } else {
                    if (!C305756Jk.A00(context)) {
                        str = context.getResources().getString(2131976002);
                    }
                    String id = effectPreviewIntf.getId();
                    String name = effectPreviewIntf.getName();
                    ImageUrl A002 = DDx.A00(effectPreviewIntf);
                    String A03 = DDx.A03(effectPreviewIntf);
                    ProductItemWithARIntf B0B = AsO.B0B();
                    if (!(B0B == null || B0B.BgJ().BRo() == null)) {
                        A03 = B0B.BgJ().BRo().A03.getUsername();
                    }
                    String A02 = DDx.A02(effectPreviewIntf);
                    ProfilePicture Bh6 = effectPreviewIntf.AdD().Bh6();
                    if (Bh6 != null) {
                        imageUrl = Bh6.CCI();
                    } else {
                        imageUrl = null;
                    }
                    boolean equals = "SAVED".equals(effectPreviewIntf.getSaveStatus());
                    EffectActionSheetIntf Azy = effectPreviewIntf.Azy();
                    if (Azy == null || (list = Azy.BfN()) == null) {
                        list = 0sn.A00;
                    }
                    EffectActionSheetIntf Azy2 = effectPreviewIntf.Azy();
                    if (Azy2 == null || (list2 = Azy2.BqS()) == null) {
                        list2 = 0sn.A00;
                    }
                    AttributedAREffect attributedAREffect = new AttributedAREffect(A002, imageUrl, (C62622Kit) null, (ProductAREffectContainer) null, id, name, A03, A02, (String) null, (String) null, (String) null, list, list2, (List) null, 8, equals);
                    String A032 = DDx.A03(effectPreviewIntf);
                    ProductItemWithARIntf B0B2 = AsO.B0B();
                    if (!(B0B2 == null || B0B2.BgJ().BRo() == null)) {
                        A032 = B0B2.BgJ().BRo().A03.getUsername();
                    }
                    EffectInfoAttributionConfiguration effectInfoAttributionConfiguration = new EffectInfoAttributionConfiguration(attributedAREffect, A032);
                    effectInfoAttributionConfiguration.A09 = str;
                    if (C284745Nt.A0A(AsO)) {
                        r0 = C284745Nt.A03(AsO);
                    } else {
                        r0 = null;
                    }
                    effectInfoAttributionConfiguration.A02 = r0;
                    if (AsO.B0B() != null) {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.SHOPPING;
                    } else {
                        effectInfoBottomSheetMode = EffectInfoBottomSheetMode.NORMAL;
                    }
                    effectInfoAttributionConfiguration.A01 = effectInfoBottomSheetMode;
                    if (AsO.B0B() != null) {
                        ProductItemWithAR FFL = AsO.B0B().FFL(1E4.A00(r3.A01));
                        if (AsO.B0B().BgJ() != null) {
                            z = false;
                        }
                        ? obj2 = new Object();
                        obj2.A00 = FFL;
                        obj2.A01 = z;
                        productAREffectContainer = obj2;
                    } else {
                        productAREffectContainer = null;
                    }
                    effectInfoAttributionConfiguration.A05 = productAREffectContainer;
                    effectInfoAttributionConfiguration.A03 = C284745Nt.A04(AsO);
                    arrayList.add(effectInfoAttributionConfiguration);
                }
            }
            if (arrayList.isEmpty()) {
                0wb.A03("MediaFeedbackHelper", "Trying to launch bottom sheet with no effect info attribution configurations");
                return;
            }
            EffectInfoBottomSheetConfiguration effectInfoBottomSheetConfiguration = new EffectInfoBottomSheetConfiguration();
            if (arrayList.size() == 1) {
                copyOf = ImmutableList.of(arrayList.get(0));
            } else if (!arrayList.isEmpty()) {
                copyOf = ImmutableList.copyOf((Collection) arrayList);
            } else {
                throw new IllegalArgumentException(AnonymousClass000.A00(2658));
            }
            effectInfoBottomSheetConfiguration.A02 = copyOf;
            effectInfoBottomSheetConfiguration.A00 = 8;
            effectInfoBottomSheetConfiguration.A01 = 28D.A2l;
            effectInfoBottomSheetConfiguration.A06 = false;
            LPQ.A02(context, C59725JVj.PRE_CAPTURE, r3.A01, (C279284yO) null, effectInfoBottomSheetConfiguration, new IQ9(r4, r3), (C273414mX) null);
        }
    }
}
