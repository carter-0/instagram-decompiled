package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C56078HsR;

public final class SandboxErrorInfo extends AnonymousClass0T0 {
    public final String logMessage;
    public final C56078HsR message;
    public final C56078HsR title;

    public static /* synthetic */ SandboxErrorInfo copy$default(SandboxErrorInfo sandboxErrorInfo, C56078HsR hsR, C56078HsR hsR2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            hsR = sandboxErrorInfo.title;
        }
        if ((i & 2) != 0) {
            hsR2 = sandboxErrorInfo.message;
        }
        if ((i & 4) != 0) {
            str = sandboxErrorInfo.logMessage;
        }
        return sandboxErrorInfo.copy(hsR, hsR2, str);
    }

    public final C56078HsR component1() {
        return this.title;
    }

    public final C56078HsR component2() {
        return this.message;
    }

    public final String component3() {
        return this.logMessage;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SandboxErrorInfo) {
                SandboxErrorInfo sandboxErrorInfo = (SandboxErrorInfo) obj;
                if (!0qQ.A0K(this.title, sandboxErrorInfo.title) || !0qQ.A0K(this.message, sandboxErrorInfo.message) || !0qQ.A0K(this.logMessage, sandboxErrorInfo.logMessage)) {
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

    public final String getLogMessage() {
        return this.logMessage;
    }

    public final C56078HsR getMessage() {
        return this.message;
    }

    public final C56078HsR getTitle() {
        return this.title;
    }

    public int hashCode() {
        return C41845B3m.A01(this.logMessage, AnonymousClass7TF.A07(this.message, AnonymousClass7TE.A0K(this.title)));
    }

    public SandboxErrorInfo(C56078HsR hsR, C56078HsR hsR2, String str) {
        AnonymousClass7TG.A1U(hsR, hsR2, str);
        this.title = hsR;
        this.message = hsR2;
        this.logMessage = str;
    }

    public final SandboxErrorInfo copy(C56078HsR hsR, C56078HsR hsR2, String str) {
        AnonymousClass7TG.A1T(hsR, hsR2, str);
        return new SandboxErrorInfo(hsR, hsR2, str);
    }
}
