package X;

import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Uxq  reason: case insensitive filesystem */
public enum C16596Uxq {
    CHANCE_FLURRIES("chanceflurries"),
    CHANCE_RAIN("chancerain"),
    CHANCE_SLEET("chancesleet"),
    CHANCE_SNOW("chancesnow"),
    CHANCE_TSTORMS("chancetstorms"),
    CLEAR(QuickExperimentDumperPlugin.CLEAR_CMD),
    CLOUDY("cloudy"),
    FLURRIES("flurries"),
    FOG("fog"),
    HAZY("hazy"),
    MOSTLY_CLOUDY("mostlycloudy"),
    MOSTLY_SUNNY("mostlysunny"),
    PARTLY_CLOUDY("partlycloudy"),
    PARTLY_SUNNY("partlysunny"),
    RAIN("rain"),
    SLEET("sleet"),
    SNOW("snow"),
    SUNNY("sunny"),
    TSTORMS("tstorms"),
    NT_CHANCE_FLURRIES("nt_chanceflurries"),
    NT_CHANCE_RAIN("nt_chancerain"),
    NT_CHANCE_SLEET("nt_chancesleet"),
    NT_CHANCE_SNOW("nt_chancesnow"),
    NT_CHANCE_TSTORMS("nt_chancetstorms"),
    NT_CLEAR("nt_clear"),
    NT_CLOUDY("nt_cloudy"),
    NT_FLURRIES("nt_flurries"),
    NT_FOG("nt_fog"),
    NT_HAZY("nt_hazy"),
    NT_MOSTLY_CLOUDY("nt_mostlycloudy"),
    NT_MOSTLY_SUNNY("nt_mostlysunny"),
    NT_PARTLY_CLOUDY("nt_partlycloudy"),
    NT_PARTLY_SUNNY("nt_partlysunny"),
    NT_RAIN("nt_rain"),
    NT_SLEET("nt_sleet"),
    NT_SNOW("nt_snow"),
    NT_SUNNY("nt_sunny"),
    NT_TSTORMS("nt_tstorms"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        C16596Uxq[] uxqArr;
        A02 = 0oU.A00(uxqArr);
        C16596Uxq[] values = values();
        ArrayList arrayList = new ArrayList();
        for (C16596Uxq uxq : values) {
            if (uxq != UNKNOWN) {
                arrayList.add(uxq);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(DbY.A00(0Yv.A1E(arrayList, 10)));
        for (Object next : arrayList) {
            linkedHashMap.put(((C16596Uxq) next).A00, next);
        }
        A01 = linkedHashMap;
    }

    /* access modifiers changed from: public */
    C16596Uxq(String str) {
        this.A00 = str;
    }
}
