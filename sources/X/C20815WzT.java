package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.WzT  reason: case insensitive filesystem */
public class C20815WzT extends C20816WzU {
    public boolean A00;
    public int A01;
    public final JsonObject A02;
    public final SerialDescriptor A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20815WzT(String str, SerialDescriptor serialDescriptor, C250863mB r4, JsonObject jsonObject) {
        super(str, r4, jsonObject);
        0qQ.A0B(jsonObject, 2);
        this.A02 = jsonObject;
        this.A03 = serialDescriptor;
    }

    public final C2590240b ADI(SerialDescriptor serialDescriptor) {
        0qQ.A0B(serialDescriptor, 0);
        SerialDescriptor serialDescriptor2 = this.A03;
        if (serialDescriptor != serialDescriptor2) {
            return super.ADI(serialDescriptor);
        }
        C250863mB r3 = this.A01;
        JsonElement A0J = A0J();
        String BsV = serialDescriptor2.BsV();
        if (A0J instanceof JsonObject) {
            return new C20815WzT(this.A00, serialDescriptor2, r3, (JsonObject) A0J);
        }
        throw C20442Wrk.A03(A0J, BsV, this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r10.B0R(r4).CYM() == false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00be, code lost:
        if (r5 == false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int ANp(kotlinx.serialization.descriptors.SerialDescriptor r10) {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C20814WzS
            if (r0 == 0) goto L_0x0015
            r2 = r9
            X.WzS r2 = (X.C20814WzS) r2
            int r1 = r2.A00
            int r0 = r2.A01
            int r0 = r0 + -1
            r4 = -1
            if (r1 >= r0) goto L_0x0014
            int r4 = r1 + 1
            r2.A00 = r4
        L_0x0014:
            return r4
        L_0x0015:
            r3 = 0
            X.0qQ.A0B(r10, r3)
        L_0x0019:
            int r1 = r9.A01
            int r0 = r10.B0a()
            if (r1 >= r0) goto L_0x00ca
            int r1 = r9.A01
            int r0 = r1 + 1
            r9.A01 = r0
            java.lang.String r7 = r9.A0H(r10, r1)
            X.0qQ.A0B(r7, r3)
            java.util.ArrayList r0 = r9.A01
            X.00k.A0L(r0)
            int r0 = r9.A01
            int r4 = r0 + -1
            r9.A00 = r3
            kotlinx.serialization.json.JsonObject r0 = r9.A02
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L_0x005f
            X.3mB r0 = r9.A01
            X.40P r0 = r0.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x005a
            boolean r0 = r10.CRn(r4)
            if (r0 != 0) goto L_0x005a
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r10.B0R(r4)
            boolean r1 = r0.CYM()
            r0 = 1
            if (r1 != 0) goto L_0x005b
        L_0x005a:
            r0 = 0
        L_0x005b:
            r9.A00 = r0
            if (r0 == 0) goto L_0x0019
        L_0x005f:
            X.40P r0 = r9.A02
            boolean r0 = r0.A07
            if (r0 == 0) goto L_0x0014
            X.3mB r6 = r9.A01
            boolean r8 = r10.CRn(r4)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r10.B0R(r4)
            if (r8 == 0) goto L_0x0080
            boolean r0 = r2.CYM()
            if (r0 != 0) goto L_0x0080
            kotlinx.serialization.json.JsonElement r0 = r9.A0K(r7)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L_0x0080
            goto L_0x0019
        L_0x0080:
            X.3uF r1 = r2.BKK()
            X.48A r0 = X.AnonymousClass48A.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0014
            boolean r5 = r2.CYM()
            if (r5 == 0) goto L_0x009b
            kotlinx.serialization.json.JsonElement r0 = r9.A0K(r7)
            boolean r0 = r0 instanceof kotlinx.serialization.json.JsonNull
            if (r0 == 0) goto L_0x009b
            return r4
        L_0x009b:
            kotlinx.serialization.json.JsonElement r1 = r9.A0K(r7)
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonPrimitive
            if (r0 == 0) goto L_0x0014
            kotlinx.serialization.json.JsonPrimitive r1 = (kotlinx.serialization.json.JsonPrimitive) r1
            if (r1 == 0) goto L_0x0014
            kotlinx.serialization.descriptors.SerialDescriptor r0 = X.C271114hv.A00
            boolean r0 = r1 instanceof kotlinx.serialization.json.JsonNull
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = r1.A00()
            if (r0 == 0) goto L_0x0014
            int r2 = X.C2591440o.A01(r0, r2, r6)
            X.40P r0 = r6.A00
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x00c0
            r1 = 1
            if (r5 != 0) goto L_0x00c1
        L_0x00c0:
            r1 = 0
        L_0x00c1:
            r0 = -3
            if (r2 != r0) goto L_0x0014
            if (r8 != 0) goto L_0x0019
            if (r1 == 0) goto L_0x0014
            goto L_0x0019
        L_0x00ca:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20815WzT.ANp(kotlinx.serialization.descriptors.SerialDescriptor):int");
    }
}
