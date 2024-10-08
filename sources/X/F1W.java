package X;

import android.os.Bundle;
import com.instagram.api.schemas.IGRevShareProductType;

public final class F1W {
    public final EN1 A00(IGRevShareProductType iGRevShareProductType, String str, String str2) {
        EN1 en1 = new EN1();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("ARGUMENT_ENTRY_POINT", str);
        A0a.putString(AnonymousClass000.A00(203), str2);
        A0a.putParcelable("ARGUMENT_PRODUCT_TYPE", iGRevShareProductType);
        en1.setArguments(A0a);
        return en1;
    }
}
