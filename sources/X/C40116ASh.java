package X;

import com.instagram.contentprovider.InstallReferrerProvider;

/* renamed from: X.ASh  reason: case insensitive filesystem */
public final class C40116ASh implements 2Kw {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstallReferrerProvider.Impl A01;
    public final /* synthetic */ String A02;

    public C40116ASh(InstallReferrerProvider.Impl impl, String str, long j) {
        this.A01 = impl;
        this.A02 = str;
        this.A00 = j;
    }

    public final void invoke(Throwable th) {
        0Aj A0e = AnonymousClass7TE.A0e(this.A01.A02, "android_on_device_install_referrer_logging");
        if (A0e.isSampled()) {
            A0e.AAJ("action", "GraphQLMutationFailure");
            A0e.AAJ("asset_id", this.A02);
            A0e.A9F("activity_type", Long.valueOf(this.A00));
            A0e.AAJ("error", th.getMessage());
            A0e.Cgf();
        }
    }
}
