package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* renamed from: X.REo  reason: case insensitive filesystem */
public enum C8896REo {
    START_DOWNLOAD_URL,
    FAILED_DOWNLOAD_URL,
    START_DOWNLOAD,
    WAITING_DOWNLOAD,
    RUNNING_DOWNLOAD,
    CANCEL_DOWNLOAD,
    SUCCESS_DOWNLOAD,
    FAILED_DOWNLOAD,
    START_INSTALL,
    FAILED_INSTALL,
    SUCCESS_INSTALL,
    WAITING_WIFI_FOR_DOWNLOAD;
    
    public static final Map A00 = null;

    /* access modifiers changed from: public */
    static {
        C8896REo rEo;
        C8896REo rEo2;
        C8896REo rEo3;
        C8896REo rEo4;
        C8896REo rEo5;
        C8896REo rEo6;
        C8896REo[] rEoArr;
        A01 = 0oU.A00(rEoArr);
        ImmutableMap.Builder builder = new ImmutableMap.Builder(4);
        builder.put(rEo4, ImmutableSet.A00(rEo3, rEo4));
        builder.put(rEo5, ImmutableSet.A05(new Object[]{rEo3, rEo4, rEo, rEo2}, 4));
        ImmutableMap A0Z = Pxe.A0Z(builder, rEo6, ImmutableSet.A00(rEo3, rEo4));
        0qQ.A07(A0Z);
        A00 = A0Z;
    }
}
