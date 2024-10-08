package com.facebook.odin.prediction.litennmodelparams;

import X.AnonymousClass00P;
import X.AnonymousClass0T0;
import X.AnonymousClass409;
import X.AnonymousClass411;
import X.C15049ULf;
import X.C20502Wsi;
import X.C20503Wsj;
import X.C255453u9;
import X.C255463uA;
import X.C51972G9s;
import X.VJ6;
import com.facebook.odin.model.Matrix;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class DynamicNNModelParams extends AnonymousClass0T0 implements AnonymousClass411 {
    public static final C255463uA[] A08;
    public static final Companion Companion = new Object();
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;
    public final float[] A04;
    public final float[] A05;
    public final float[] A06;
    public final int[] A07;

    public final class Companion {
        public final C255463uA serializer() {
            return C20502Wsi.A00;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams$Companion] */
    static {
        C255453u9 r1 = C255453u9.A01;
        A08 = new C255463uA[]{new AnonymousClass409(r1), null, null, null, null, new AnonymousClass409(C20503Wsj.A00), null, new AnonymousClass409(r1)};
    }

    public /* synthetic */ DynamicNNModelParams(String str, List list, List list2, List list3, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int i) {
        if (255 != (i & 255)) {
            VJ6.A00(C20502Wsi.A01, i, 255);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A01 = list;
        this.A04 = fArr;
        this.A05 = fArr2;
        this.A00 = str;
        this.A06 = fArr3;
        this.A03 = list2;
        this.A07 = iArr;
        this.A02 = list3;
    }

    public final float[] AfW(int i) {
        return ((C15049ULf) this.A03.get(i - 1)).A01;
    }

    public final float[] AfX(int i) {
        return ((C15049ULf) this.A03.get(i - 1)).A02;
    }

    public final float[] Afk(int i) {
        return ((C15049ULf) this.A03.get(i - 1)).A03;
    }

    public final float[] BPc(int i) {
        return this.A04;
    }

    public final List BTc() {
        return this.A02;
    }

    public final int[] BVv() {
        return this.A07;
    }

    public final String BWX() {
        return this.A00;
    }

    public final List BeY() {
        return this.A01;
    }

    public final float[] CDE(int i) {
        return this.A06;
    }

    public final float[] CDF(int i) {
        return this.A05;
    }

    public final Matrix CGO(int i) {
        return ((C15049ULf) this.A03.get(i - 1)).A00;
    }

    public DynamicNNModelParams(String str, List list, List list2, List list3, float[] fArr, float[] fArr2, float[] fArr3, int[] iArr) {
        C51972G9s.A1B(list, str);
        this.A01 = list;
        this.A04 = fArr;
        this.A05 = fArr2;
        this.A00 = str;
        this.A06 = fArr3;
        this.A03 = list2;
        this.A07 = iArr;
        this.A02 = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DynamicNNModelParams() {
        /*
            r9 = this;
            X.0sn r2 = X.0sn.A00
            r0 = 0
            float[] r5 = new float[r0]
            float[] r6 = new float[r0]
            float[] r7 = new float[r0]
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int[] r8 = new int[r0]
            java.lang.String r1 = "range"
            r0 = r9
            r4 = r2
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams.<init>():void");
    }
}
