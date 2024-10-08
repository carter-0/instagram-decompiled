package com.facebook.rsys.filelogging.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C12068SmN;
import X.C66583MXo;
import com.facebook.djinni.msys.infra.McfReference;

public class LogFileStats {
    public static 2LV CONVERTER = new C12068SmN(1);
    public static long sMcfTypeId;
    public final int droppedLogBytes;
    public final int droppedLogsCount;
    public final int logBytes;
    public final int logsCount;

    public static native LogFileStats createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileStats)) {
            return false;
        }
        LogFileStats logFileStats = (LogFileStats) obj;
        return this.logsCount == logFileStats.logsCount && this.logBytes == logFileStats.logBytes && this.droppedLogsCount == logFileStats.droppedLogsCount && this.droppedLogBytes == logFileStats.droppedLogBytes;
    }

    public int hashCode() {
        return ((((C66583MXo.A01(this.logsCount) + this.logBytes) * 31) + this.droppedLogsCount) * 31) + this.droppedLogBytes;
    }

    public LogFileStats(int i, int i2, int i3, int i4) {
        this.logsCount = i;
        this.logBytes = i2;
        this.droppedLogsCount = i3;
        this.droppedLogBytes = i4;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LogFileStats{logsCount=");
        A1A.append(this.logsCount);
        A1A.append(",logBytes=");
        A1A.append(this.logBytes);
        A1A.append(",droppedLogsCount=");
        A1A.append(this.droppedLogsCount);
        A1A.append(",droppedLogBytes=");
        A1A.append(this.droppedLogBytes);
        return AnonymousClass7TF.A0l("}", A1A);
    }
}
