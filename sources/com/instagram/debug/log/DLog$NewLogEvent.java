package com.instagram.debug.log;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C67841xE;
import X.DbY;
import com.instagram.debug.log.tags.DLogTag;

public final class DLog$NewLogEvent extends AnonymousClass0T0 implements C67841xE {
    public final int logLevel;
    public final DLogTag logTag;
    public final String message;

    public static /* synthetic */ DLog$NewLogEvent copy$default(DLog$NewLogEvent dLog$NewLogEvent, DLogTag dLogTag, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dLogTag = dLog$NewLogEvent.logTag;
        }
        if ((i2 & 2) != 0) {
            i = dLog$NewLogEvent.logLevel;
        }
        if ((i2 & 4) != 0) {
            str = dLog$NewLogEvent.message;
        }
        return dLog$NewLogEvent.copy(dLogTag, i, str);
    }

    public final DLogTag component1() {
        return this.logTag;
    }

    public final int component2() {
        return this.logLevel;
    }

    public final String component3() {
        return this.message;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DLog$NewLogEvent) {
                DLog$NewLogEvent dLog$NewLogEvent = (DLog$NewLogEvent) obj;
                if (!0qQ.A0K(this.logTag, dLog$NewLogEvent.logTag) || this.logLevel != dLog$NewLogEvent.logLevel || !0qQ.A0K(this.message, dLog$NewLogEvent.message)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public String toString() {
        return super.toString();
    }

    public final int getLogLevel() {
        return this.logLevel;
    }

    public final DLogTag getLogTag() {
        return this.logTag;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return C41845B3m.A01(this.message, (AnonymousClass7TE.A0K(this.logTag) + this.logLevel) * 31);
    }

    public DLog$NewLogEvent(DLogTag dLogTag, int i, String str) {
        AnonymousClass7TG.A1P(dLogTag, str);
        this.logTag = dLogTag;
        this.logLevel = i;
        this.message = str;
    }

    public final DLog$NewLogEvent copy(DLogTag dLogTag, int i, String str) {
        DbY.A1S(dLogTag, str);
        return new DLog$NewLogEvent(dLogTag, i, str);
    }
}
