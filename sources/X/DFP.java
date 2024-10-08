package X;

import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataCallback;
import com.facebook.cameracore.ardelivery.xplat.sparkvision.SparkVisionMetadataDownloader;
import com.google.common.collect.ImmutableList;

public final class DFP implements AnonymousClass2Kv {
    public final /* synthetic */ SparkVisionMetadataCallback A00;
    public final /* synthetic */ SparkVisionMetadataDownloader A01;
    public final /* synthetic */ 0sP A02;

    public DFP(SparkVisionMetadataCallback sparkVisionMetadataCallback, SparkVisionMetadataDownloader sparkVisionMetadataDownloader, 0sP r3) {
        this.A00 = sparkVisionMetadataCallback;
        this.A01 = sparkVisionMetadataDownloader;
        this.A02 = r3;
    }

    public final void invoke(AnonymousClass3JD r7) {
        ImmutableList immutableList;
        BX1 bx1;
        try {
            SparkVisionMetadataCallback sparkVisionMetadataCallback = this.A00;
            SparkVisionMetadataDownloader sparkVisionMetadataDownloader = this.A01;
            BX2 bx2 = (BX2) r7.Bny();
            if (bx2 == null || (bx1 = (BX1) bx2.A03(BX1.class, AnonymousClass000.A00(1081), 543548346)) == null) {
                immutableList = null;
            } else {
                immutableList = bx1.A06(BX0.class, "models", 557494686);
            }
            0qQ.A0C(immutableList, "null cannot be cast to non-null type com.google.common.collect.ImmutableList<com.facebook.cameracore.ardelivery.graphql.NativeMLModelBatchedQueryResponse.AimModelBatchedManifest.Models>");
            sparkVisionMetadataCallback.onSuccess(sparkVisionMetadataDownloader.parseResults(immutableList));
        } catch (Exception e) {
            this.A02.invoke(e);
        }
    }
}
