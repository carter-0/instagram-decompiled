package X;

import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.File;

public final class SMP {
    public static final SMP A00 = new Object();

    public static final 0eP A00(File file) {
        String str;
        file.getPath();
        String name = file.getName();
        0qQ.A07(name);
        if (00p.A0k(name, "InShot", true)) {
            str = "2";
        } else {
            String name2 = file.getName();
            0qQ.A07(name2);
            if (00p.A0k(name2, "YouCut", true)) {
                str = "3";
            } else {
                String name3 = file.getName();
                0qQ.A07(name3);
                if (00p.A0k(name3, "lv_", true)) {
                    str = RealtimeSubscription.GRAPHQL_MQTT_VERSION;
                } else {
                    String name4 = file.getName();
                    0qQ.A07(name4);
                    if (00p.A0k(name4, "km_", true)) {
                        str = "4";
                    } else {
                        String name5 = file.getName();
                        0qQ.A07(name5);
                        if (new 11S("[0-9a-fA-F]{32}").A08(00l.A0G(".mp4", name5))) {
                            str = "5";
                        } else {
                            str = "unknown";
                        }
                    }
                }
            }
        }
        return AnonymousClass7TE.A1L(str, "unknown");
    }
}
