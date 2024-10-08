package X;

import android.app.PendingIntent;
import android.os.Bundle;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Rzt  reason: case insensitive filesystem */
public abstract class C10893Rzt {
    public static Qy2 A00(Bundle bundle) {
        int i = bundle.getInt(SAn.A00(0, 10, 33));
        int i2 = bundle.getInt(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        int i3 = bundle.getInt(TraceFieldType.ErrorCode);
        long j = bundle.getLong("bytes_downloaded");
        long j2 = bundle.getLong("total_bytes_to_download");
        return new Qy2((PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), bundle.getParcelableArrayList("split_file_intents"), i, i2, i3, j, j2);
    }

    public final ArrayList A01() {
        List list = ((Qy2) this).A06;
        if (list != null) {
            return AnonymousClass7TE.A1D(list);
        }
        return AnonymousClass7TE.A1C();
    }
}
