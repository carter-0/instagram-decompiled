package X;

import android.os.Bundle;
import com.instagram.api.schemas.CachedExternalLoginUserImpl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class EI5 extends 0ng {
    public final /* synthetic */ Bundle A00;
    public final /* synthetic */ SignedOutFragmentActivity A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EI5(Bundle bundle, SignedOutFragmentActivity signedOutFragmentActivity) {
        super(758);
        this.A01 = signedOutFragmentActivity;
        this.A00 = bundle;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.nux.activity.SignedOutFragmentActivity, android.app.Activity] */
    public final void run() {
        C48103EVv eVv;
        ? r2 = this.A01;
        1CV A002 = FAB.A00(r2.A04);
        0qQ.A0A(A002);
        Map all = A002.getAll();
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator A0u = AnonymousClass7TF.A0u(all);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (!0qQ.A0K(key, "AccountCachingHelper.FACEBOOK_USER_ID")) {
                try {
                    DbS.A1Y(value);
                    CachedExternalLoginUserImpl parseFromJson = C48324Ech.parseFromJson(16P.A00((String) value));
                    String str = parseFromJson.A05;
                    String str2 = parseFromJson.A02;
                    ImageUrl imageUrl = parseFromJson.A00;
                    String str3 = parseFromJson.A03;
                    String str4 = parseFromJson.A04;
                    C48103EVv[] values = C48103EVv.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            eVv = C48103EVv.UNKNOWN;
                            break;
                        }
                        eVv = values[i];
                        if (0qQ.A0K(eVv.A00, str4)) {
                            break;
                        }
                        i++;
                    }
                    ENQ enq = new ENQ(imageUrl, eVv, str, str2, str3);
                    A1E.put(enq.A00, enq);
                } catch (IOException e) {
                    0wb.A07("ExternalAccountCachingHelper_deserialize_account_error", e);
                }
            }
        }
        r2.runOnUiThread(new C51378FtA(this, A1E.isEmpty()));
    }
}
