package com.facebook.rsys.metaaivoicestate.gen;

import X.002;
import X.2LV;
import X.C22181Xwr;
import X.C51968G9o;
import com.facebook.djinni.msys.infra.McfReference;

public class GenAiMediaStats {
    public static 2LV CONVERTER = C22181Xwr.A00(6);
    public static long sMcfTypeId;
    public final long serverToClientAudioCtpLatencyMs;

    public static native GenAiMediaStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof GenAiMediaStats) && this.serverToClientAudioCtpLatencyMs == ((GenAiMediaStats) obj).serverToClientAudioCtpLatencyMs;
        }
        return true;
    }

    public int hashCode() {
        return 527 + C51968G9o.A03(this.serverToClientAudioCtpLatencyMs);
    }

    public String toString() {
        return 002.A0e("GenAiMediaStats{serverToClientAudioCtpLatencyMs=", "}", this.serverToClientAudioCtpLatencyMs);
    }

    public GenAiMediaStats(long j) {
        this.serverToClientAudioCtpLatencyMs = j;
    }
}
