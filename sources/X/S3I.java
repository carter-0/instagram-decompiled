package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public final class S3I {
    public final Intent A00;
    public final Bundle A01;
    public final 00W A02;
    public final 00Y A03;
    public final FragmentActivity A04;
    public final FragmentActivity A05;
    public final T9K A06;
    public final String A07;

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.T9K] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.00i] */
    public S3I(Intent intent, Bundle bundle, 00W r6, FragmentActivity fragmentActivity, String str) {
        DbW.A1N(str, 2, bundle);
        ? obj = new Object();
        this.A05 = fragmentActivity;
        this.A07 = str;
        this.A02 = r6;
        this.A06 = obj;
        this.A00 = intent;
        this.A01 = bundle;
        this.A03 = new 0VG(fragmentActivity.registerForActivityResult(new 0Vm(new Object(), Pxf.A0O()), r6));
        this.A04 = fragmentActivity;
    }

    public final void A00() {
        SGW sgw = SGW.A00;
        T9K t9k = this.A06;
        FragmentActivity fragmentActivity = this.A05;
        08y r1 = 09i.A0A;
        0wc A022 = AnonymousClass0kN.A02(r1.A08(fragmentActivity));
        Integer num = AnonymousClass05K.A03;
        String str = this.A07;
        sgw.A00(A022, num, str, (String) null, (String) null, (Map) null, 0);
        try {
            C12118SnH snH = (C12118SnH) Pxj.A0l((Object) null, C11070S8q.class, "create");
            snH.A00.A04("oauth_integration_id", str);
            snH.A01 = true;
            t9k.A00(fragmentActivity, snH.build().setMaxToleratedCacheAgeMs(0).setEnsureCacheWrite(false), new T0R(this.A02, AnonymousClass0kN.A02(r1.A08(fragmentActivity)), str, 0));
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
