package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.ASu  reason: case insensitive filesystem */
public final class C40129ASu implements AnonymousClass2Kv {
    public final /* synthetic */ C312726f4 A00;
    public final /* synthetic */ Set A01;

    public C40129ASu(C312726f4 r1, Set set) {
        this.A00 = r1;
        this.A01 = set;
    }

    public final void invoke(AnonymousClass3JD r9) {
        ImmutableList immutableList;
        0Gb r2;
        Integer num;
        String str;
        C250663lr r3;
        if (r9 == null || (r3 = (C250663lr) r9.Bny()) == null) {
            immutableList = null;
        } else {
            immutableList = r3.A06(C382609eE.class, "fetch_ar_effects(effect_ids:$effect_ids)", -1006305489);
        }
        if (immutableList == null) {
            r2 = this.A00.A02;
            num = AnonymousClass05K.A00;
            str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects is null.";
        } else {
            int size = immutableList.size();
            Set set = this.A01;
            if (size != set.size()) {
                this.A00.A02.EFW("ArDelivery", AnonymousClass05K.A00, 002.A02(set.size(), immutableList.size(), "# of effects in request = ", " is different from response's fetchArEffects.size = "));
            }
            C312726f4 r5 = this.A00;
            Iterator it = immutableList.iterator();
            while (it.hasNext()) {
                C250663lr optionalTreeField = ((C250663lr) it.next()).getOptionalTreeField(0, "effect", C382599eD.class, -495064920);
                if (optionalTreeField == null) {
                    r2 = r5.A02;
                    num = AnonymousClass05K.A00;
                    str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect is null.";
                } else {
                    String optionalStringField = optionalTreeField.getOptionalStringField(0, "strong_id__");
                    if (optionalStringField == null) {
                        r2 = r5.A02;
                        num = AnonymousClass05K.A00;
                        str = "ArEffectsFlmCapabilityQueryResponse.FetchArEffects.Effect has no id.";
                    } else {
                        optionalTreeField.getCoercedBooleanField(1, "uses_flm_capability");
                        if (optionalTreeField.getCoercedBooleanField(1, "uses_flm_capability")) {
                            r5.A00.remove(optionalStringField);
                        }
                    }
                }
            }
            0xY AR4 = r5.A01.A00.AR4();
            AR4.E5T("flmEffectsDeleted", true);
            AR4.apply();
            return;
        }
        r2.EFW("ArDelivery", num, str);
    }
}
