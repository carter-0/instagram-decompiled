package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.ARDRemoteModelVersionFetcher;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatModelVersionResponse;
import com.facebook.cameracore.ardelivery.xplat.modelmanager.versionfetcher.XplatRemoteModelVersionFetchCompletionCallback;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

public final class DFW implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public DFW(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj4;
        this.A02 = obj;
        this.A03 = obj3;
        this.A04 = obj2;
    }

    public final void invoke(AnonymousClass3JD r13) {
        Object obj;
        Object[] objArr;
        String A002;
        C62320sa r0;
        AnonymousClass5DY r02;
        AnonymousClass5DY r03;
        Object Bny;
        switch (this.A00) {
            case 0:
                if (r13 != null) {
                    obj = r13.Bny();
                } else {
                    obj = null;
                }
                if (obj == null) {
                    String A003 = AnonymousClass000.A00(3201);
                    0KC.A0E(ARDRemoteModelVersionFetcher.TAG, A003);
                    ((XplatRemoteModelVersionFetchCompletionCallback) this.A01).onFailure(A003);
                    return;
                }
                Object Bny2 = r13.Bny();
                0qQ.A0A(Bny2);
                ImmutableList A0X = C41845B3m.A0X((C250663lr) Bny2, C42148BSv.class, "latest_versioned_capabilities(capability_types:$capability_types,supported_compressions:$supported_compressions)", 0, 635693167);
                if (A0X.size() != ((List) this.A02).size()) {
                    0KC.A0Q(ARDRemoteModelVersionFetcher.TAG, "# of models requested and received are different. requested %s. received %s", new Object[]{(List) this.A03, A0X});
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                ArrayList A1C3 = AnonymousClass7TE.A1C();
                C249803kO it = A0X.iterator();
                0qQ.A07(it);
                while (it.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(it);
                    C21269XRo xRo = C21269XRo.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                    if (A0V.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, xRo) == null) {
                        objArr = new Object[]{A0V};
                        A002 = "Capability type is null. This should never happen. data: %s";
                    } else {
                        C21269XRo xRo2 = (C21269XRo) A0V.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, xRo);
                        0qQ.A0A(xRo2);
                        VersionedCapability fromServerValue = VersionedCapability.fromServerValue(xRo2.name());
                        if (fromServerValue == null) {
                            objArr = new Object[]{A0V.getOptionalEnumField(1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, xRo)};
                            A002 = AnonymousClass000.A00(2386);
                        } else {
                            A1C.add(fromServerValue);
                            A1C3.add(C41846B3n.A0g(A0V, "version", 0));
                            A1C2.add(Boolean.valueOf(((ARDRemoteModelVersionFetcher) this.A04).forceDownloadFlagHandler.AH2(fromServerValue, A0V.A09("force_download_group_identifier"))));
                        }
                    }
                    0KC.A0Q(ARDRemoteModelVersionFetcher.TAG, A002, objArr);
                }
                ((XplatRemoteModelVersionFetchCompletionCallback) this.A01).onSuccess(new XplatModelVersionResponse(A1C2, A1C, A1C3));
                return;
            case 1:
                H3S h3s = (H3S) this.A03;
                AnonymousClass5DY r04 = h3s.A00;
                if (r04 != null) {
                    C45448Cwb AK9 = r04.AK9();
                    AK9.A02 = true;
                    r02 = AK9.A00();
                } else {
                    r02 = null;
                }
                h3s.A00 = r02;
                1Xj r1 = (1Xj) this.A01;
                B56.A00(r1, h3s.A04, true);
                1E7.A00((UserSession) this.A04).A03(r1);
                r0 = (C62320sa) this.A02;
                if (r0 == null) {
                    return;
                }
                break;
            case 2:
                H3S h3s2 = (H3S) this.A03;
                AnonymousClass5DY r05 = h3s2.A00;
                if (r05 != null) {
                    C45448Cwb AK92 = r05.AK9();
                    AK92.A02 = false;
                    r03 = AK92.A00();
                } else {
                    r03 = null;
                }
                h3s2.A00 = r03;
                1Xj r12 = (1Xj) this.A01;
                B56.A00(r12, h3s2.A04, false);
                1E7.A00((UserSession) this.A04).A03(r12);
                r0 = (C62320sa) this.A02;
                break;
            default:
                C12485SvH svH = (C12485SvH) this.A01;
                SparseArray sparseArray = (SparseArray) this.A02;
                C2818659w r4 = (C2818659w) this.A03;
                2Kw r2 = (2Kw) this.A04;
                if (r13 == null || (Bny = r13.Bny()) == null) {
                    r2.invoke(new RuntimeException("GraphQLResult is null."));
                    return;
                }
                try {
                    C86 c86 = (C86) Bny;
                    c86.getClass();
                    c86.A0E().getClass();
                    C41847B3o.A0v(c86).getClass();
                    String A0k = C41845B3m.A0k(C41847B3o.A0v(c86));
                    A0k.getClass();
                    svH.A00.ADV(A0k, C41847B3o.A15(sparseArray, 13).toString(), svH.A02);
                } catch (Exception e) {
                    0KC.A0F("IGCreditCardFormApi", "Problem with card binding", e);
                }
                r4.A02(C11097S9y.A00(Cs7.A00.apply(Bny)));
                return;
        }
        r0.invoke();
    }
}
