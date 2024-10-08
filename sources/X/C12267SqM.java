package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;

/* renamed from: X.SqM  reason: case insensitive filesystem */
public final class C12267SqM implements C13720Tfl {
    public final FbnsServiceDelegate A00;

    public final void AQ1(Context context, Bundle bundle) {
        0KC.A0C("AppsStatisticsFetcher", "not implemented for AppsStatisticsFetcher");
        throw AnonymousClass7TE.A0w("not implemented for AppsStatisticsFetcher");
    }

    public C12267SqM(FbnsServiceDelegate fbnsServiceDelegate) {
        this.A00 = fbnsServiceDelegate;
    }

    public final Bundle APv(Context context, Bundle bundle) {
        Bundle A0a = AnonymousClass7TE.A0a();
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        C241833Rj.A01(context, A1C, A1C2);
        A0a.putStringArrayList("valid_compatible_apps", A1C);
        A0a.putStringArrayList("enabled_compatible_apps", A1C2);
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        this.A00.A0c(A1C3);
        A0a.putStringArrayList("registered_apps", A1C3);
        return A0a;
    }
}
