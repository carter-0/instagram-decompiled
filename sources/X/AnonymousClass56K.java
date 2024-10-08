package X;

import com.instagram.api.schemas.IGFormatLiquidityUseCaseEnum;
import java.io.IOException;

/* renamed from: X.56K  reason: invalid class name */
public abstract class AnonymousClass56K {
    public static AnonymousClass56L parseFromJson(16F r4) {
        String str;
        0qQ.A0B(r4, 0);
        try {
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            IGFormatLiquidityUseCaseEnum iGFormatLiquidityUseCaseEnum = null;
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                r4.A1J();
                if ("format_liquidity_use_case".equals(A0q)) {
                    if (r4.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r4.A1P();
                    }
                    iGFormatLiquidityUseCaseEnum = (IGFormatLiquidityUseCaseEnum) IGFormatLiquidityUseCaseEnum.A01.get(str);
                    if (iGFormatLiquidityUseCaseEnum == null) {
                        iGFormatLiquidityUseCaseEnum = IGFormatLiquidityUseCaseEnum.UNRECOGNIZED;
                    }
                }
                r4.A0z();
            }
            return new AnonymousClass56L(iGFormatLiquidityUseCaseEnum);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
