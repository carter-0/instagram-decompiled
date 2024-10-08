package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66582MXn;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchSuggestedContentQueueModel {
    public static 2LV CONVERTER = C22180Xwq.A00(38);
    public static long sMcfTypeId;
    public final ArrayList nextMediaInfoModels;
    public final ArrayList previousMediaInfoModels;

    public static native CowatchSuggestedContentQueueModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchSuggestedContentQueueModel)) {
            return false;
        }
        CowatchSuggestedContentQueueModel cowatchSuggestedContentQueueModel = (CowatchSuggestedContentQueueModel) obj;
        return this.previousMediaInfoModels.equals(cowatchSuggestedContentQueueModel.previousMediaInfoModels) && this.nextMediaInfoModels.equals(cowatchSuggestedContentQueueModel.nextMediaInfoModels);
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.nextMediaInfoModels, C21056XCh.A01(this.previousMediaInfoModels));
    }

    public CowatchSuggestedContentQueueModel(ArrayList arrayList, ArrayList arrayList2) {
        arrayList.getClass();
        arrayList2.getClass();
        this.previousMediaInfoModels = arrayList;
        this.nextMediaInfoModels = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchSuggestedContentQueueModel{previousMediaInfoModels=");
        A1A.append(this.previousMediaInfoModels);
        A1A.append(",nextMediaInfoModels=");
        return C66582MXn.A0v(this.nextMediaInfoModels, A1A);
    }
}
