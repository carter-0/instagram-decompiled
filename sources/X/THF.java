package X;

import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public final class THF implements Runnable {
    public final /* synthetic */ C365678nV A00;
    public final /* synthetic */ 2Jr A01;

    public THF(C365678nV r1, 2Jr r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        C70102Jm r3 = this.A01.A00;
        C365678nV r0 = this.A00;
        List list = r0.A00;
        List<Locale> list2 = r0.A01;
        ArrayList A0m = C51970G9q.A0m(list2);
        for (Locale languageTag : list2) {
            A0m.add(languageTag.toLanguageTag());
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putInt(SAn.A00(0, 10, 33), 0);
        A0a.putInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 5);
        A0a.putInt(TraceFieldType.ErrorCode, 0);
        if (!list.isEmpty()) {
            A0a.putStringArrayList("module_names", AnonymousClass7TE.A1D(list));
        }
        if (!A0m.isEmpty()) {
            A0a.putStringArrayList("languages", AnonymousClass7TE.A1D(A0m));
        }
        A0a.putLong("total_bytes_to_download", 0);
        A0a.putLong("bytes_downloaded", 0);
        r3.A01(C10893Rzt.A00(A0a));
    }
}
