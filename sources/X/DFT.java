package X;

import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;

public final class DFT implements AnonymousClass2Kv {
    public final /* synthetic */ C313026fe A00;
    public final /* synthetic */ C45199CsA A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ 0sP A03;

    public DFT(C313026fe r1, C45199CsA csA, String str, 0sP r4) {
        this.A03 = r4;
        this.A02 = str;
        this.A00 = r1;
        this.A01 = csA;
    }

    public final void invoke(AnonymousClass3JD r8) {
        C250663lr optionalTreeField;
        C250663lr A0U = C41845B3m.A0U(r8);
        if (A0U == null || (optionalTreeField = A0U.getOptionalTreeField(0, "ar_scripting_modules_package_download(package_hash:$package_hash)", BXW.class, -1279245700)) == null) {
            this.A03.invoke(AnonymousClass7TE.A0z("Graphql result is null."));
            return;
        }
        0sP r1 = this.A03;
        String str = this.A02;
        C313026fe r4 = this.A00;
        C45199CsA csA = this.A01;
        String optionalStringField = optionalTreeField.getOptionalStringField(0, "cdn_uri");
        if (optionalStringField != null) {
            ScriptingPackageMetadata scriptingPackageMetadata = new ScriptingPackageMetadata(str, optionalTreeField.getCoercedIntField(1, "revision"), optionalStringField);
            r4.A01.put(str, scriptingPackageMetadata);
            csA.A00.onSuccess(scriptingPackageMetadata);
            return;
        }
        r1.invoke(AnonymousClass7TE.A0z("Graphql result CdnUri is null."));
    }
}
