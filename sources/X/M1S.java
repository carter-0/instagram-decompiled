package X;

import com.facebook.mantle.common.mantledatavalue.MantleDataValue;
import com.facebook.mantle.ig.IGMantle;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

public final class M1S implements 1aV {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ImmutableMap A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ AnonymousClass1pI A03;
    public final /* synthetic */ 0rm A04;

    public M1S(ImmutableMap immutableMap, 1a8 r2, AnonymousClass1pI r3, 0rm r4, int i) {
        this.A01 = immutableMap;
        this.A03 = r3;
        this.A00 = i;
        this.A04 = r4;
        this.A02 = r2;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        ImmutableMap immutableMap = this.A01;
        0qQ.A0A(immutableMap);
        try {
            ImmutableMap immutableMap2 = (ImmutableMap) ((IGMantle) obj).runMantleWithConfigStr("igd_nudity_detection", "{\"nodes\":{\"0\":{\"nodeType\":116,\"parents\":[],\"staticParams\":{\"11\":{\"boolean_val\":true}}},\"1\":{\"nodeType\":100,\"parents\":[0],\"staticParams\":{\"11\":{\"boolean_val\":true},\"25\":{\"int_val\":1}}}}}", immutableMap).get();
            if (immutableMap2 == null || !immutableMap2.containsKey("predictions")) {
                02m r1 = this.A03.A00;
                if (r1 != null) {
                    r1.markerEnd(426181758, this.A00, 3);
                    this.A04.A00 = new C61081JwJ("mantle_inference_failure", (Object) null, 47);
                    this.A02.A01();
                    return;
                }
            } else {
                02m r2 = this.A03.A00;
                if (r2 != null) {
                    r2.markerEnd(426181758, this.A00, 2);
                    MantleDataValue mantleDataValue = (MantleDataValue) immutableMap2.get("predictions");
                    if (mantleDataValue != null && (mantleDataValue.value == null || mantleDataValue.type != C301305yu.LIST_DOUBLE)) {
                        ImmutableList.of();
                    }
                    this.A04.A00 = new C61081JwJ((String) null, (Object) immutableMap2, 47);
                    this.A02.A01();
                    return;
                }
            }
            0qQ.A0F("qpl");
            throw AnonymousClass00P.createAndThrow();
        } catch (Exception e) {
            02m r12 = this.A03.A00;
            if (r12 == null) {
                0qQ.A0F("qpl");
                throw AnonymousClass00P.createAndThrow();
            }
            r12.markerEnd(426181758, this.A00, 3);
            this.A04.A00 = new C61081JwJ(AnonymousClass7TF.A0m("mantle_exception", e), (Object) null, 47);
            this.A02.A01();
        }
    }
}
