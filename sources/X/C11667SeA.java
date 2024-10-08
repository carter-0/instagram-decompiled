package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.SeA  reason: case insensitive filesystem */
public final class C11667SeA implements 07h {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ C11667SeA(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.gms.auth.api.signin.internal.SignInHubActivity] */
    public final 07p D6j(Bundle bundle, int i) {
        ? r2 = this.A00;
        Set set = AnonymousClass63S.A00;
        synchronized (set) {
        }
        return new QDZ(r2, set);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.google.android.gms.auth.api.signin.internal.SignInHubActivity, android.app.Activity] */
    public final /* bridge */ /* synthetic */ void DOK(07p r4, Object obj) {
        ? r2 = this.A00;
        r2.setResult(r2.A00, r2.A01);
        r2.finish();
    }
}
