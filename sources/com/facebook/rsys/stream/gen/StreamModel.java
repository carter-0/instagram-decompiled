package com.facebook.rsys.stream.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C22181Xwr;
import X.C66581MXm;
import X.C66582MXn;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import java.util.HashSet;

public class StreamModel {
    public static 2LV CONVERTER = C22181Xwr.A00(62);
    public static long sMcfTypeId;
    public final HashSet allowedCustomVideoContentTypes;
    public final ArrayList localVideoStreams;
    @Deprecated
    public final HashSet processedUserIds;
    @Deprecated
    public final ArrayList supportedCustomVideoCodecs;

    public static native StreamModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof StreamModel)) {
                return false;
            }
            StreamModel streamModel = (StreamModel) obj;
            ArrayList arrayList = this.supportedCustomVideoCodecs;
            ArrayList arrayList2 = streamModel.supportedCustomVideoCodecs;
            if (arrayList == null) {
                if (arrayList2 != null) {
                    return false;
                }
            } else if (!arrayList.equals(arrayList2)) {
                return false;
            }
            if (!this.allowedCustomVideoContentTypes.equals(streamModel.allowedCustomVideoContentTypes) || !this.processedUserIds.equals(streamModel.processedUserIds) || !this.localVideoStreams.equals(streamModel.localVideoStreams)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass7TE.A0N(this.localVideoStreams, AnonymousClass7TF.A07(this.processedUserIds, AnonymousClass7TF.A07(this.allowedCustomVideoContentTypes, C66583MXo.A01(AnonymousClass7TG.A0C(this.supportedCustomVideoCodecs)))));
    }

    public StreamModel(ArrayList arrayList, HashSet hashSet, HashSet hashSet2, ArrayList arrayList2) {
        C66581MXm.A1R(hashSet, hashSet2, arrayList2);
        this.supportedCustomVideoCodecs = arrayList;
        this.allowedCustomVideoContentTypes = hashSet;
        this.processedUserIds = hashSet2;
        this.localVideoStreams = arrayList2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("StreamModel{supportedCustomVideoCodecs=");
        A1A.append(this.supportedCustomVideoCodecs);
        A1A.append(",allowedCustomVideoContentTypes=");
        A1A.append(this.allowedCustomVideoContentTypes);
        A1A.append(",processedUserIds=");
        A1A.append(this.processedUserIds);
        A1A.append(",localVideoStreams=");
        return C66582MXn.A0v(this.localVideoStreams, A1A);
    }
}
