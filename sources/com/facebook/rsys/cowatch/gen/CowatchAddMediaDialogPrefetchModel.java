package com.facebook.rsys.cowatch.gen;

import X.AnonymousClass7TE;
import X.C21056XCh;
import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;

public class CowatchAddMediaDialogPrefetchModel {
    public final ArrayList logs;
    public final int pageToPrefetch;

    public static native CowatchAddMediaDialogPrefetchModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchAddMediaDialogPrefetchModel)) {
            return false;
        }
        CowatchAddMediaDialogPrefetchModel cowatchAddMediaDialogPrefetchModel = (CowatchAddMediaDialogPrefetchModel) obj;
        return this.logs.equals(cowatchAddMediaDialogPrefetchModel.logs) && this.pageToPrefetch == cowatchAddMediaDialogPrefetchModel.pageToPrefetch;
    }

    public final int hashCode() {
        return C21056XCh.A01(this.logs) + this.pageToPrefetch;
    }

    public CowatchAddMediaDialogPrefetchModel(ArrayList arrayList, int i) {
        arrayList.getClass();
        this.logs = arrayList;
        this.pageToPrefetch = i;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchAddMediaDialogPrefetchModel{logs=");
        A1A.append(this.logs);
        A1A.append(",pageToPrefetch=");
        return C21056XCh.A0A(A1A, this.pageToPrefetch);
    }
}
