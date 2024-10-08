package X;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.AbstractCollection;
import java.util.Iterator;

public abstract class SKQ {
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ca, code lost:
        if (r1 != null) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass40G A00(X.S4A r22, X.C258743zZ r23, X.AnonymousClass0eM r24) {
        /*
            r0 = r22
            r4 = r23
            java.lang.String r1 = r0.A01(r4)
            int r0 = r1.length()
            r11 = 0
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r3 = "Model file is not found for "
            r2 = 0
            if (r0 != 0) goto L_0x0389
            java.io.File r1 = X.AnonymousClass7TE.A0t(r1)
            boolean r0 = r1.exists()
            if (r0 == 0) goto L_0x0389
            boolean r0 = r1.canRead()
            if (r0 == 0) goto L_0x0389
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05
            java.lang.String r2 = X.C272134kB.A00(r1, r0)
            java.lang.Object r1 = r24.getValue()
            com.google.gson.Gson r1 = (com.google.gson.Gson) r1
            java.lang.Class<com.google.gson.JsonObject> r0 = com.google.gson.JsonObject.class
            java.lang.Object r10 = r1.A08(r2, r0)
            com.google.gson.JsonObject r10 = (com.google.gson.JsonObject) r10
            java.lang.String r0 = "feature_id_list"
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r14 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0048:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0060
            java.lang.Object r0 = r1.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            int r0 = r0.getAsInt()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.add(r0)
            goto L_0x0048
        L_0x0060:
            java.lang.String r0 = "mean_val"
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x006f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            A02(r2, r1)
            goto L_0x006f
        L_0x0079:
            float[] r21 = X.00k.A0w(r2)
            java.lang.String r0 = "val_range"
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x008c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0096
            A02(r2, r1)
            goto L_0x008c
        L_0x0096:
            float[] r23 = X.00k.A0w(r2)
            java.lang.String r0 = "layers"
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00bc
            java.lang.Object r0 = r1.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            int r0 = r0.getAsInt()
            X.AnonymousClass7TF.A1M(r2, r0)
            goto L_0x00a8
        L_0x00bc:
            int[] r13 = X.00k.A0x(r2)
            java.lang.String r1 = "model_arch"
            X.54a r0 = r10.members
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x00eb
            com.google.gson.JsonArray r0 = A01(r10, r1)
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00d7:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r0 = r1.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            java.lang.String r0 = r0.getAsString()
            r9.add(r0)
            goto L_0x00d7
        L_0x00eb:
            X.0sn r9 = X.0sn.A00
        L_0x00ed:
            java.lang.String r1 = "std_val"
            X.54a r0 = r10.members
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0113
            com.google.gson.JsonArray r0 = A01(r10, r1)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0104:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x010e
            A02(r2, r1)
            goto L_0x0104
        L_0x010e:
            float[] r8 = X.00k.A0w(r2)
            goto L_0x0115
        L_0x0113:
            float[] r8 = new float[r11]
        L_0x0115:
            java.lang.String r1 = "normalization_type"
            X.54a r0 = r10.members
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0296
            com.google.gson.JsonElement r0 = r10.get(r1)
            java.lang.String r17 = r0.getAsString()
        L_0x0128:
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            boolean r0 = r9.isEmpty()
            r12 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x029b
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            float[] r12 = new float[r11]
            float[] r6 = new float[r11]
            float[] r0 = new float[r11]
            float[][] r1 = new float[][]{r0}
            float[] r5 = new float[r11]
            java.util.Iterator r16 = r9.iterator()
            r4 = 1
        L_0x014a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0370
            java.lang.String r3 = X.AnonymousClass7TE.A18(r16)
            int r0 = r3.hashCode()
            java.lang.String r2 = "layer."
            switch(r0) {
                case -2018804923: goto L_0x015e;
                case -542065042: goto L_0x01fa;
                case 2542364: goto L_0x01fd;
                case 2575999: goto L_0x0200;
                case 1456754377: goto L_0x0227;
                default: goto L_0x015d;
            }
        L_0x015d:
            goto L_0x014a
        L_0x015e:
            java.lang.String r0 = "Linear"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x014a
            java.lang.String r3 = ".Linear.weight"
            java.lang.String r1 = X.002.A0c(r2, r3, r4)
            X.54a r0 = r10.members
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0176
            int r4 = r4 + 1
        L_0x0176:
            java.lang.String r0 = X.002.A0c(r2, r3, r4)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x01bb
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x01bb
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r15 = r0.iterator()
        L_0x018e:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01c2
            java.lang.Object r0 = r15.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            X.0qQ.A07(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x01a9:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x01b3
            A02(r1, r0)
            goto L_0x01a9
        L_0x01b3:
            float[] r0 = X.00k.A0w(r1)
            r3.add(r0)
            goto L_0x018e
        L_0x01bb:
            float[] r0 = new float[r11]
            float[][] r1 = new float[][]{r0}
            goto L_0x01cc
        L_0x01c2:
            float[][] r0 = new float[r11][]
            java.lang.Object[] r1 = r3.toArray(r0)
            float[][] r1 = (float[][]) r1
            if (r1 == 0) goto L_0x01bb
        L_0x01cc:
            java.lang.String r0 = ".Linear.bias"
            java.lang.String r0 = X.002.A0c(r2, r0, r4)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x01f6
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x01f6
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x01e6:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01f0
            A02(r2, r0)
            goto L_0x01e6
        L_0x01f0:
            float[] r5 = X.00k.A0w(r2)
            goto L_0x014a
        L_0x01f6:
            float[] r5 = new float[r11]
            goto L_0x014a
        L_0x01fa:
            java.lang.String r0 = "Sigmoid"
            goto L_0x0202
        L_0x01fd:
            java.lang.String r0 = "ReLU"
            goto L_0x0202
        L_0x0200:
            java.lang.String r0 = "SiLU"
        L_0x0202:
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x014a
            X.3uA[] r0 = X.C15049ULf.A04
            com.facebook.odin.model.Matrix r0 = new com.facebook.odin.model.Matrix
            r0.<init>(r1)
            X.ULf r1 = new X.ULf
            r1.<init>(r0, r12, r6, r5)
            r7.add(r1)
            float[] r12 = new float[r11]
            float[] r6 = new float[r11]
            float[] r0 = new float[r11]
            float[][] r1 = new float[][]{r0}
            float[] r5 = new float[r11]
            int r4 = r4 + 1
            goto L_0x014a
        L_0x0227:
            java.lang.String r0 = "BatchNorm1d"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x014a
            java.lang.String r6 = ".BatchNorm1d.alpha"
            java.lang.String r3 = X.002.A0c(r2, r6, r4)
            X.54a r0 = r10.members
            boolean r0 = r0.containsKey(r3)
            if (r0 != 0) goto L_0x023f
            int r4 = r4 + 1
        L_0x023f:
            java.lang.String r0 = X.002.A0c(r2, r6, r4)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x0261
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x0261
            java.util.ArrayList r3 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0257:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0264
            A02(r3, r0)
            goto L_0x0257
        L_0x0261:
            float[] r12 = new float[r11]
            goto L_0x0268
        L_0x0264:
            float[] r12 = X.00k.A0w(r3)
        L_0x0268:
            java.lang.String r0 = ".BatchNorm1d.beta"
            java.lang.String r0 = X.002.A0c(r2, r0, r4)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x0292
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x0292
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0282:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x028c
            A02(r2, r0)
            goto L_0x0282
        L_0x028c:
            float[] r6 = X.00k.A0w(r2)
            goto L_0x014a
        L_0x0292:
            float[] r6 = new float[r11]
            goto L_0x014a
        L_0x0296:
            java.lang.String r17 = "range"
            goto L_0x0128
        L_0x029b:
            int r6 = r13.length
            if (r12 > r6) goto L_0x0370
        L_0x029e:
            java.lang.String r5 = "layer."
            java.lang.String r0 = ".BatchNorm1d.alpha"
            java.lang.String r0 = X.002.A0c(r5, r0, r12)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x02c4
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x02c4
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x02ba:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02c7
            A02(r2, r1)
            goto L_0x02ba
        L_0x02c4:
            float[] r4 = new float[r11]
            goto L_0x02cb
        L_0x02c7:
            float[] r4 = X.00k.A0w(r2)
        L_0x02cb:
            java.lang.String r0 = ".BatchNorm1d.beta"
            java.lang.String r0 = X.002.A0c(r5, r0, r12)
            com.google.gson.JsonElement r0 = r10.get(r0)
            if (r0 == 0) goto L_0x02ef
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            if (r0 == 0) goto L_0x02ef
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x02e5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x02f2
            A02(r1, r0)
            goto L_0x02e5
        L_0x02ef:
            float[] r3 = new float[r11]
            goto L_0x02f6
        L_0x02f2:
            float[] r3 = X.00k.A0w(r1)
        L_0x02f6:
            java.lang.String r0 = ".Linear.weight"
            java.lang.String r0 = X.002.A0c(r5, r0, r12)
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r16 = r0.iterator()
        L_0x0308:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0335
            java.lang.Object r0 = r16.next()
            com.google.gson.JsonElement r0 = (com.google.gson.JsonElement) r0
            com.google.gson.JsonArray r0 = r0.getAsJsonArray()
            X.0qQ.A07(r0)
            java.util.ArrayList r1 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0323:
            boolean r15 = r0.hasNext()
            if (r15 == 0) goto L_0x032d
            A02(r1, r0)
            goto L_0x0323
        L_0x032d:
            float[] r0 = X.00k.A0w(r1)
            r2.add(r0)
            goto L_0x0308
        L_0x0335:
            float[][] r0 = new float[r11][]
            java.lang.Object[] r0 = r2.toArray(r0)
            float[][] r0 = (float[][]) r0
            com.facebook.odin.model.Matrix r1 = new com.facebook.odin.model.Matrix
            r1.<init>(r0)
            java.lang.String r0 = ".Linear.bias"
            java.lang.String r0 = X.002.A0c(r5, r0, r12)
            com.google.gson.JsonArray r0 = A01(r10, r0)
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0354:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x035e
            A02(r2, r0)
            goto L_0x0354
        L_0x035e:
            float[] r2 = X.00k.A0w(r2)
            X.ULf r0 = new X.ULf
            r0.<init>(r1, r4, r3, r2)
            r7.add(r0)
            if (r12 == r6) goto L_0x0370
            int r12 = r12 + 1
            goto L_0x029e
        L_0x0370:
            X.3uA[] r0 = com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams.A08
            X.0qQ.A0A(r17)
            com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams r16 = new com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams
            r22 = r8
            r24 = r13
            r19 = r7
            r20 = r9
            r18 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            X.40G r0 = X.Pxf.A0M(r16)
            return r0
        L_0x0389:
            java.lang.String r0 = r4.CCQ()
            java.lang.String r1 = X.002.A0R(r3, r0)
            X.40G r0 = new X.40G
            r0.<init>(r2, r1, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SKQ.A00(X.S4A, X.3zZ, X.0eM):X.40G");
    }

    public static JsonArray A01(JsonObject jsonObject, String str) {
        JsonArray asJsonArray = jsonObject.get(str).getAsJsonArray();
        0qQ.A07(asJsonArray);
        return asJsonArray;
    }

    public static void A02(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(Float.valueOf(((JsonElement) it.next()).getAsFloat()));
    }
}
