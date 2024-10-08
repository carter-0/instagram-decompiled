package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatModelVersionResponse;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8Mc  reason: invalid class name and case insensitive filesystem */
public final class C354458Mc implements AnonymousClass2Kv {
    public final /* synthetic */ C312996fY A00;
    public final /* synthetic */ XplatRemoteModelVersionFetchCompletionCallback A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ List A03;

    public C354458Mc(C312996fY r1, XplatRemoteModelVersionFetchCompletionCallback xplatRemoteModelVersionFetchCompletionCallback, List list, List list2) {
        this.A01 = xplatRemoteModelVersionFetchCompletionCallback;
        this.A02 = list;
        this.A03 = list2;
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r14) {
        C312986fX r3;
        0qQ.A0A(r14);
        Object Bny = r14.Bny();
        if (Bny == null) {
            String A002 = AnonymousClass000.A00(3201);
            0KC.A0E("NMLMLRemoteModelVersionFetcher", A002);
            this.A01.onFailure(A002);
            return;
        }
        C250663lr r4 = (C250663lr) Bny;
        Class<C357538Yl> cls = C357538Yl.class;
        if (r4.getOptionalTreeField(0, "aim_model_version_manifest(models:$models)", cls, 682083891) == null) {
            0KC.A0E("NMLMLRemoteModelVersionFetcher", "Received Null model versions");
            return;
        }
        0qQ.A0A(Bny);
        C250663lr optionalTreeField = r4.getOptionalTreeField(0, "aim_model_version_manifest(models:$models)", cls, 682083891);
        0qQ.A0A(optionalTreeField);
        ImmutableList requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "models", C357548Ym.class, -262964002);
        0qQ.A07(requiredCompactedTreeListField);
        if (requiredCompactedTreeListField.size() != this.A02.size()) {
            0KC.A0Q("NMLMLRemoteModelVersionFetcher", "# of models requested and received are different. requested %d . received %d", new Object[]{Integer.valueOf(this.A03.size()), Integer.valueOf(requiredCompactedTreeListField.size())});
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        C249803kO it = requiredCompactedTreeListField.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            C250663lr r2 = (C250663lr) it.next();
            if (r2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME) != null) {
                String optionalStringField = r2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                0qQ.A0A(optionalStringField);
                VersionedCapability fromServerValue = VersionedCapability.fromServerValue(optionalStringField);
                if (fromServerValue != null) {
                    arrayList.add(fromServerValue);
                    arrayList3.add(Integer.valueOf(r2.getCoercedIntField(1, "version")));
                    C312996fY r11 = this.A00;
                    arrayList2.add(Boolean.valueOf(r11.A00.AH2(fromServerValue, r2.getOptionalStringField(2, "force_download_group_identifier"))));
                    C312956fU r112 = r11.A01;
                    if (r2.getCoercedBooleanField(3, "is_ard_version")) {
                        r3 = C312986fX.ARD;
                    } else {
                        r3 = C312986fX.NMLML;
                    }
                    0xY AR4 = r112.A00.AR4();
                    AR4.E5g(fromServerValue.toServerValue(), r3.toString());
                    r112.A01.put(fromServerValue, r3);
                    AR4.apply();
                }
            }
            0KC.A0Q("NMLMLRemoteModelVersionFetcher", AnonymousClass000.A00(2386), new Object[]{r2.getOptionalStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME)});
        }
        this.A01.onSuccess(new XplatModelVersionResponse(arrayList2, arrayList, arrayList3));
    }
}
