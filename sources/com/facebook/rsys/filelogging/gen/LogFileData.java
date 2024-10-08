package com.facebook.rsys.filelogging.gen;

import X.2LV;
import X.AnonymousClass7TE;
import X.C22180Xwq;
import X.C66583MXo;
import X.C66584MXp;
import com.facebook.djinni.msys.infra.McfReference;

public class LogFileData {
    public static 2LV CONVERTER = C22180Xwq.A00(50);
    public static long sMcfTypeId;
    public final boolean isStreamValid;
    public final String line;

    public static native LogFileData createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LogFileData)) {
            return false;
        }
        LogFileData logFileData = (LogFileData) obj;
        return this.line.equals(logFileData.line) && this.isStreamValid == logFileData.isStreamValid;
    }

    public int hashCode() {
        return C66583MXo.A06(this.line) + (this.isStreamValid ? 1 : 0);
    }

    public LogFileData(String str, boolean z) {
        str.getClass();
        this.line = str;
        this.isStreamValid = z;
    }

    public String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LogFileData{line=");
        A1A.append(this.line);
        A1A.append(",isStreamValid=");
        return C66584MXp.A0b(A1A, this.isStreamValid);
    }
}
