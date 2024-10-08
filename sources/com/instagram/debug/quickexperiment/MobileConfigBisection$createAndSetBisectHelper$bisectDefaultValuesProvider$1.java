package com.instagram.debug.quickexperiment;

import X.002;
import X.0Tu;
import X.1AA;
import X.AnonymousClass7TE;
import X.DbS;
import com.facebook.mobileconfig.factory.MobileConfigValueSource;
import com.facebook.mobileconfig.troubleshooting.BisectDefaultValuesProvider;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.HashMap;

public final class MobileConfigBisection$createAndSetBisectHelper$bisectDefaultValuesProvider$1 implements BisectDefaultValuesProvider {
    public final /* synthetic */ 1AA $factory;

    public MobileConfigBisection$createAndSetBisectHelper$bisectDefaultValuesProvider$1(1AA r1) {
        this.$factory = r1;
    }

    public final String getMobileConfigFieldValue(long j) {
        String valueOf;
        String str;
        1AA r11 = this.$factory;
        HashMap A1E = AnonymousClass7TE.A1E();
        int i = (int) ((j >>> 48) & 63);
        0Tu r10 = 0Tu.A06;
        0Tu A00 = 0Tu.A00(r10);
        A00.A02 = true;
        if (i == 1) {
            valueOf = String.valueOf(r11.Ah0(A00, j));
        } else if (i == 2) {
            valueOf = String.valueOf(r11.BOa(A00, j));
        } else if (i != 3) {
            if (i != 4) {
                valueOf = "UNSUPPORTED TYPE";
            } else {
                valueOf = String.valueOf(r11.Aym(A00, j));
            }
        } else if (((j >>> 60) & 1) == 1) {
            valueOf = r11.C1w(r10, "__fbt_null__", j);
        } else {
            valueOf = r11.C1v(r10, j);
        }
        A1E.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, valueOf);
        MobileConfigValueSource mobileConfigValueSource = A00.A00.A00;
        int ordinal = mobileConfigValueSource.ordinal();
        if (!(ordinal == 1 || ordinal == 0)) {
            if (ordinal != 2) {
                str = 002.A0c("default[", "]", mobileConfigValueSource.getSource());
            } else {
                str = QuickExperimentDumperPlugin.OVERRIDE_CMD;
            }
            A1E.put("source", str);
        }
        String A0r = DbS.A0r(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, A1E);
        if (A0r == null) {
            return "";
        }
        return A0r;
    }
}
