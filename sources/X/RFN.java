package X;

import java.util.LinkedHashMap;
import java.util.Map;

public enum RFN {
    SONG_NOT_AVAILABLE("song_not_available"),
    OUTSIDE_TERRITORY("outside_territory"),
    LABEL_GO_DARK("label_go_dark"),
    MUSIC_RIGHTS_NOT_LAUNCHED_TO_COUNTRY("music_rights_not_launched_to_country"),
    ORIGINAL_AUDIO_MUTED("original_audio_muted"),
    UNKNOWN("unknown");
    
    public static final Map A01 = null;
    public final String A00;

    /* access modifiers changed from: public */
    static {
        int i;
        RFN[] rfnArr;
        A02 = 0oU.A00(rfnArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RFN rfn : values()) {
            A0x.put(rfn.A00, rfn);
        }
        A01 = A0x;
    }

    /* access modifiers changed from: public */
    RFN(String str) {
        this.A00 = str;
    }
}
