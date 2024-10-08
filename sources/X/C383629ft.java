package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9ft  reason: invalid class name and case insensitive filesystem */
public final class C383629ft extends C250663lr implements C348667yp {
    public final ImmutableList C1p() {
        return getRequiredCompactedStringListField(4, "string_identifiers");
    }

    public final String AjI() {
        return A08("cache_key");
    }

    public final String getId() {
        return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public final String getUri() {
        return A0C("uri");
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TF.A0I(r2), AnonymousClass7TE.A0f(r2, "cache_key"), AnonymousClass7TE.A0f(r2, TraceFieldType.CompressionType), AnonymousClass7TE.A0f(r2, "md5_hash"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A02(), "string_identifiers"), AnonymousClass7TE.A0f(r2, "uri")});
    }

    public C383629ft(int i) {
        super(i);
    }

    public C383629ft() {
        super(-1153896853);
    }
}
