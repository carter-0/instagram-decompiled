package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.models.Manifest;
import com.facebook.models.UnresolvedModelAssetMetadata;
import com.facebook.models.UnresolvedModelMetadata;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.9RC  reason: invalid class name */
public final class AnonymousClass9RC implements AnonymousClass2Kv {
    public final /* synthetic */ SettableFuture A00;

    public AnonymousClass9RC(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    public final void invoke(AnonymousClass3JD r21) {
        Object Bny;
        int i;
        int i2;
        long j;
        int i3;
        if (r21 == null || (Bny = r21.Bny()) == null) {
            this.A00.setException(new Throwable("GraphQL returns empty response."));
            return;
        }
        AnonymousClass3FZ A002 = ((AnonymousClass3FZ) Bny).A00(AnonymousClass9RP.class, "aim_model_manifest");
        if (A002 == null) {
            this.A00.setException(new Throwable("GraphQL returns empty manifest."));
            return;
        }
        Manifest manifest = new Manifest();
        manifest.setResolvedFromCache(false);
        C378739Ra r2 = C378739Ra.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        if (A002.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r2) != null) {
            C378739Ra r0 = (C378739Ra) A002.A04(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, r2);
            0qQ.A0A(r0);
            manifest.setQueryStatus(r0.name(), A002.A05("status_details"));
        }
        C378749Rb r22 = C378749Rb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
        if (A002.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r22) != null) {
            C378749Rb r02 = (C378749Rb) A002.A04(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, r22);
            0qQ.A0A(r02);
            manifest.setQueryEntryPoint(AnonymousClass7TF.A0j(r02.name()));
        }
        JSONObject jSONObject = A002.A00;
        if (!jSONObject.isNull("model_count")) {
            i = jSONObject.optInt("model_count");
        } else {
            i = -1;
        }
        if (!jSONObject.isNull("asset_count")) {
            i2 = jSONObject.optInt("asset_count");
        } else {
            i2 = -1;
        }
        manifest.setQueryResponseExpectation(i, i2);
        ImmutableList A02 = A002.A02("models", AnonymousClass9RQ.class);
        0qQ.A07(A02);
        C249803kO it = A02.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            AnonymousClass3FZ r6 = (AnonymousClass3FZ) it.next();
            String A05 = r6.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            JSONObject jSONObject2 = r6.A00;
            if (!jSONObject2.isNull("version")) {
                j = (long) jSONObject2.optInt("version");
            } else {
                j = -1;
            }
            UnresolvedModelMetadata unresolvedModelMetadata = new UnresolvedModelMetadata(A05, j);
            ImmutableList A022 = r6.A02("assets", AnonymousClass9RR.class);
            0qQ.A07(A022);
            C249803kO it2 = A022.iterator();
            0qQ.A07(it2);
            while (it2.hasNext()) {
                AnonymousClass3FZ r1 = (AnonymousClass3FZ) it2.next();
                Class<AnonymousClass9RS> cls = AnonymousClass9RS.class;
                if (r1.A00(cls, "metadata") != null) {
                    AnonymousClass3FZ A003 = r1.A00(cls, "metadata");
                    0qQ.A0A(A003);
                    i3 = A003.A00.optInt("bytecode_version");
                } else {
                    i3 = -1;
                }
                UnresolvedModelAssetMetadata unresolvedModelAssetMetadata = UnresolvedModelAssetMetadata.$redex_init_class;
                UnresolvedModelAssetMetadata unresolvedModelAssetMetadata2 = new UnresolvedModelAssetMetadata(r1.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), (long) i3, r1.A05("url"), r1.A05("cache_key"), r1.A05("md5_hash"), r1.A05("asset_handle"), r1.A05("creation_time"));
                ImmutableList A023 = r1.A02("delta_cache", C381379be.class);
                0qQ.A07(A023);
                C249803kO it3 = A023.iterator();
                0qQ.A07(it3);
                while (it3.hasNext()) {
                    AnonymousClass3FZ r7 = (AnonymousClass3FZ) it3.next();
                    unresolvedModelAssetMetadata2.addDeltaCacheEntryNative(r7.A05("base_md5"), r7.A05("delta_url"));
                }
                unresolvedModelMetadata.addAsset(unresolvedModelAssetMetadata2);
            }
            ImmutableList A024 = r6.A02("properties", C381389bf.class);
            0qQ.A07(A024);
            C249803kO it4 = A024.iterator();
            0qQ.A07(it4);
            while (it4.hasNext()) {
                AnonymousClass3FZ r62 = (AnonymousClass3FZ) it4.next();
                unresolvedModelMetadata.addPropertyNative(r62.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME), r62.A05(IntentModule.EXTRA_MAP_KEY_FOR_VALUE));
            }
            manifest.addModel(unresolvedModelMetadata);
        }
        this.A00.set(manifest);
    }
}
