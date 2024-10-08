package com.facebook.cameracore.ardelivery.xplat.sparkvision;

import X.00k;
import X.0qQ;
import X.1Ef;
import X.1vo;
import X.2IV;
import X.AnonymousClass05K;
import X.AnonymousClass8LN;
import X.C249803kO;
import X.C250663lr;
import X.C352718Eo;
import X.C352728Ep;
import X.C371118xc;
import X.C391359sl;
import X.C42255BWy;
import X.C45911DEr;
import X.CU6;
import X.DFP;
import X.DGD;
import X.TY5;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.cameracore.ardelivery.model.ARAssetType;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.EffectAssetType;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import com.facebook.cameracore.ardelivery.sparkvision.SparkVisionMetadataResponse;
import com.facebook.cameracore.ardelivery.xplat.models.XplatRemoteAsset;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class SparkVisionMetadataDownloader {
    public final 1vo graphQLQueryExecutor;

    public SparkVisionMetadataDownloader(1vo r2) {
        0qQ.A0B(r2, 1);
        this.graphQLQueryExecutor = r2;
    }

    public final void downloadModelMetadata(List list, C352728Ep r7, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        0qQ.A0B(list, 0);
        0qQ.A0B(sparkVisionMetadataCallback, 2);
        1Ef makeQuery = makeQuery(makeRequest(list));
        TY5 ty5 = new TY5(sparkVisionMetadataCallback, 12);
        this.graphQLQueryExecutor.ATL(new C45911DEr(ty5), new DFP(sparkVisionMetadataCallback, this, ty5), makeQuery);
    }

    public final void xplatDownloadModelMetadata(List list, SparkVisionMetadataCallback sparkVisionMetadataCallback) {
        0qQ.A0B(list, 0);
        0qQ.A0B(sparkVisionMetadataCallback, 1);
        downloadModelMetadata(list, new C352718Eo().A00(), sparkVisionMetadataCallback);
    }

    private final 1Ef makeQuery(ImmutableList immutableList) {
        2IV r3 = new 2IV();
        ImmutableList of = ImmutableList.of("TAR_BROTLI", "None");
        r3.A05("bytecodeVersion", new ArrayList());
        r3.A05("supportedCompressions", of);
        DGD A00 = CU6.A00();
        A00.A00(immutableList);
        A00.A00.A00(r3, "client_capability_metadata");
        1Ef build = A00.build();
        0qQ.A0A(build);
        return build;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.S1g] */
    /* access modifiers changed from: private */
    public final SparkVisionMetadataResponse parseResults(ImmutableList immutableList) {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C249803kO it = immutableList.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            C250663lr r6 = (C250663lr) it.next();
            if (r6 != null) {
                str = r6.A07(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            } else {
                str = null;
            }
            ImmutableList requiredCompactedTreeListField = r6.getRequiredCompactedTreeListField(2, "assets", C42255BWy.class, 70526919);
            0qQ.A07(requiredCompactedTreeListField);
            if (str == null || requiredCompactedTreeListField.size() == 0 || requiredCompactedTreeListField.size() > 1) {
                ? obj = new Object();
                obj.A00 = AnonymousClass05K.A08;
                throw obj.A00();
            }
            C250663lr r7 = (C250663lr) 00k.A0I(requiredCompactedTreeListField);
            String A07 = r7.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (A07 == null) {
                A07 = "";
            }
            String optionalStringField = r7.getOptionalStringField(7, "url");
            String A0B = r7.A0B("md5_hash");
            ARRequestAsset.CompressionMethod fromString = ARRequestAsset.CompressionMethod.fromString(String.valueOf(r7.getOptionalEnumField(9, TraceFieldType.CompressionType, C391359sl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE)));
            String A0A = r7.A0A("source_content_hash");
            linkedHashMap.put(str, new XplatRemoteAsset(new ARRequestAsset(ARAssetType.EFFECT, fromString, EffectAssetType.NORMAL_EFFECT, (C371118xc) null, (AnonymousClass8LN) null, (SparkVisionCapability) null, (VersionedCapability) null, AnonymousClass05K.A00, str, A07, (String) null, "", optionalStringField, A0B, A0A, (String) null, (List) null, (List) null, -1, (long) r7.getCoercedIntField(8, "filesize_bytes"), 0, false, false, false)));
        }
        return new SparkVisionMetadataResponse(linkedHashMap);
    }

    private final ImmutableList makeRequest(List list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            2IV r1 = new 2IV();
            r1.A09((String) it.next(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            builder.add(r1);
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        return build;
    }
}
