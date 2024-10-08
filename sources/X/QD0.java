package X;

import java.util.Map;

public final class QD0 extends 2YL {
    public final 2Fk A00;
    public final C319836rJ A01;

    public QD0(C319836rJ r5) {
        2Fk r1;
        0qQ.A0B(r5, 1);
        this.A01 = r5;
        Map map = r5.A02;
        Object obj = map.get("clipsAdvancedSettingsConfig");
        if (!(obj instanceof AnonymousClass2Fj) || (r1 = (2Fk) obj) == null) {
            Map map2 = r5.A03;
            if (map2.containsKey("clipsAdvancedSettingsConfig")) {
                r1 = new 2Fk(map2.get("clipsAdvancedSettingsConfig"));
            } else {
                r1 = new AnonymousClass2Fj();
            }
            r1.A01 = "clipsAdvancedSettingsConfig";
            r1.A00 = r5;
            map.put("clipsAdvancedSettingsConfig", r1);
        }
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<T of androidx.lifecycle.SavedStateHandle.getLiveData>");
        this.A00 = r1;
    }
}
