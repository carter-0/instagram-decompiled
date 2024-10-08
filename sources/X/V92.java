package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;
import java.util.HashMap;

public abstract class V92 {
    public static Object A00(C307896Rx r14, AnonymousClass6Tm r15) {
        Product product;
        String str = (String) r15.A02();
        Object A00 = r15.A00();
        FragmentActivity A04 = C308206Td.A04(r14);
        UserSession A0B = C308206Td.A0B(r14);
        VZO A02 = C18680Vwd.A02((C307786Rm) r15.A01(), A0B, "BKBloksActionCxfCpdpTryInARCTAImpl");
        if (A02 == null || (product = A02.A00.A06) == null) {
            0wb.A03("BKBloksActionCxfCpdpTryInARCTAImpl", "arguments or product is null");
            return null;
        }
        ContainerEffectEnum containerEffectEnum = (ContainerEffectEnum) ContainerEffectEnum.A01.get(A00);
        if (containerEffectEnum == null) {
            containerEffectEnum = ContainerEffectEnum.UNRECOGNIZED;
        }
        ProductArEffectMetadata productArEffectMetadata = new ProductArEffectMetadata(containerEffectEnum, DynamicEffectState.ENABLED, (EffectThumbnailImageDict) null, str, (String) null, (HashMap) null);
        C249713kF.A00.A08(A04, 28D.A4J, A0B, productArEffectMetadata, product, A02.A02, "instagram_shopping_pdp").A01();
        return null;
    }
}
