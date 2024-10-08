package com.facebook.rsys.cowatch.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C21056XCh;
import X.C22180Xwq;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class CowatchReelsMediaHashtagModel {
    public static 2LV CONVERTER = C22180Xwq.A00(36);
    public static long sMcfTypeId;
    public final String hashtagId;
    public final int length;
    public final String name;
    public final int offset;

    public static native CowatchReelsMediaHashtagModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CowatchReelsMediaHashtagModel)) {
            return false;
        }
        CowatchReelsMediaHashtagModel cowatchReelsMediaHashtagModel = (CowatchReelsMediaHashtagModel) obj;
        return this.hashtagId.equals(cowatchReelsMediaHashtagModel.hashtagId) && this.name.equals(cowatchReelsMediaHashtagModel.name) && this.offset == cowatchReelsMediaHashtagModel.offset && this.length == cowatchReelsMediaHashtagModel.length;
    }

    public int hashCode() {
        return ((AnonymousClass7TF.A08(this.name, C66583MXo.A06(this.hashtagId)) + this.offset) * 31) + this.length;
    }

    public CowatchReelsMediaHashtagModel(String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.hashtagId = str;
        this.name = str2;
        this.offset = i;
        this.length = i2;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("CowatchReelsMediaHashtagModel{hashtagId=");
        A1A.append(this.hashtagId);
        A1A.append(",name=");
        A1A.append(this.name);
        A1A.append(",offset=");
        A1A.append(this.offset);
        A1A.append(",length=");
        return C21056XCh.A0A(A1A, this.length);
    }
}
