package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;
import java.util.HashMap;

public abstract class V93 {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        Product product;
        AnonymousClass6Tm r2 = r17;
        C307786Rm A0L = Dbb.A0L(r2);
        Object A02 = r2.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        Object A00 = r2.A00();
        0qQ.A0C(A00, "null cannot be cast to non-null type kotlin.String");
        boolean A01 = Q0A.A01(r2.A03(7));
        FragmentActivity A04 = C308206Td.A04(r16);
        UserSession A0Z = DbT.A0Z(r16);
        VZO A022 = C18680Vwd.A02(A0L, A0Z, "BKBloksActionCxfCpdpTryInARCTAv3Impl");
        if (A022 == null || (product = A022.A00.A06) == null) {
            0wb.A03("BKBloksActionCxfCpdpTryInARCTAv3Impl", "arguments or product is null");
            return null;
        }
        ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(A00);
        if (containerEffectEnum == null) {
            containerEffectEnum = ContainerEffectEnum.UNRECOGNIZED;
        }
        ProductArEffectMetadata productArEffectMetadata = new ProductArEffectMetadata(containerEffectEnum, DynamicEffectState.ENABLED, (EffectThumbnailImageDict) null, str, (String) null, (HashMap) null);
        C249713kF.A00.A07(A04, 28D.A4J, A0Z, productArEffectMetadata, product, Boolean.valueOf(A01), A022.A02, "instagram_shopping_pdp").A01();
        return null;
    }
}
