package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import org.json.JSONObject;

/* renamed from: X.7yh  reason: invalid class name and case insensitive filesystem */
public final class C348587yh extends AnonymousClass3FZ implements C348597yi {
    public final String AjI() {
        return A05("cache_key");
    }

    public final C348607yj Apk() {
        return (C348607yj) A04(TraceFieldType.CompressionType, C348607yj.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public final ImmutableList B03() {
        return A02("effect_file_contents", C348657yo.class);
    }

    public final int B5l() {
        return this.A00.optInt("filesize_bytes");
    }

    public final boolean BJ6() {
        return A06("is_encrypted");
    }

    public final String BPb() {
        return A05("md5_hash");
    }

    public final int CBG() {
        return this.A00.optInt("uncompressed_filesize_bytes");
    }

    public final String getId() {
        return A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
    }

    public final String getUri() {
        return A05("uri");
    }

    public C348587yh(JSONObject jSONObject) {
        super(jSONObject);
    }
}
