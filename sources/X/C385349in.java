package X;

import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.user.model.ProductDetailsProductItemDict;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9in  reason: invalid class name and case insensitive filesystem */
public final class C385349in extends 1P0 {
    public final /* synthetic */ C39690A5g A00;
    public final /* synthetic */ C39691A5h A01;

    public C385349in(C39690A5g a5g, C39691A5h a5h) {
        this.A00 = a5g;
        this.A01 = a5h;
    }

    public final void onFail(C268654dm r5) {
        int A0D = AnonymousClass7TG.A0D(r5, 1754489048);
        this.A00.A00 = AnonymousClass05K.A01;
        this.A01.A00.A00.resumeWith(new C297815sO(C385039iI.A00));
        AnonymousClass0fD.A0A(-1616951686, A0D);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        List<ProductItemWithAR> emptyList;
        HashMap hashMap;
        int A03 = AnonymousClass0fD.A03(-1324742351);
        C384599ha r14 = (C384599ha) obj;
        int A0D = AnonymousClass7TG.A0D(r14, 881581603);
        this.A00.A00 = AnonymousClass05K.A0C;
        C39691A5h a5h = this.A01;
        ProductItemWithAR productItemWithAR = r14.A00;
        if (productItemWithAR != null) {
            C3504784u r5 = a5h.A01;
            if (0qQ.A0K(r5.A01.A01.A0h, productItemWithAR.A01.A0h)) {
                ProductArEffectMetadata productArEffectMetadata = productItemWithAR.A00;
                0qQ.A0B(productArEffectMetadata, 1);
                ContainerEffectEnum containerEffectEnum = productArEffectMetadata.A00;
                DynamicEffectState dynamicEffectState = productArEffectMetadata.A01;
                String str = productArEffectMetadata.A03;
                String str2 = productArEffectMetadata.A04;
                EffectThumbnailImageDict effectThumbnailImageDict = productArEffectMetadata.A02;
                HashMap hashMap2 = productArEffectMetadata.A05;
                EffectThumbnailImageDict effectThumbnailImageDict2 = null;
                if (hashMap2 != null) {
                    hashMap = new HashMap(hashMap2);
                } else {
                    hashMap = null;
                }
                if (effectThumbnailImageDict != null) {
                    effectThumbnailImageDict2 = effectThumbnailImageDict;
                }
                r5.A01 = new ProductItemWithAR(new ProductArEffectMetadata(containerEffectEnum, dynamicEffectState, effectThumbnailImageDict2, str, str2, hashMap), r5.A01.A01);
            }
        }
        List list = r14.A01;
        if (list != null) {
            emptyList = Collections.unmodifiableList(list);
        } else {
            emptyList = Collections.emptyList();
        }
        if (emptyList != null) {
            C3504784u r7 = a5h.A01;
            String str3 = r7.A01.A01.A0h;
            for (ProductItemWithAR productItemWithAR2 : emptyList) {
                ProductDetailsProductItemDict productDetailsProductItemDict = productItemWithAR2.A01;
                if (!0qQ.A0K(str3, productDetailsProductItemDict.A0h)) {
                    r7.A0I.add(productItemWithAR2);
                    String A002 = C18386Vqm.A00(C14502TxO.A00(productDetailsProductItemDict));
                    r7.A0K.put(A002, A002);
                }
                C3504784u.A02(productItemWithAR2, r7);
            }
            C18644Vvm vvm = r7.A0F;
            for (ProductItemWithAR A02 : r7.A0I) {
                vvm.A02(A02);
            }
        }
        C3504784u r2 = a5h.A01;
        if (AnonymousClass7TE.A1b(C3504784u.A01(r2))) {
            A3W a3w = a5h.A00;
            List A012 = C3504784u.A01(r2);
            0qQ.A0C(A012, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            a3w.A00.resumeWith(new C239793Ih(A012));
        }
        AnonymousClass0fD.A0A(404445642, A0D);
        AnonymousClass0fD.A0A(-628329252, A03);
    }
}
