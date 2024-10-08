package X;

import android.os.Process;

/* renamed from: X.4pP  reason: invalid class name and case insensitive filesystem */
public final class C274984pP implements C274924pJ {
    public static C274984pP A03;
    public final C275014pS A00 = new C275014pS(Process.myPid());
    public final C274994pQ A01 = new C274994pQ();
    public final C274994pQ A02 = new C274994pQ(Process.myPid());

    public final String getName() {
        return "procstat";
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        s3x.A0B = this.A02.A01();
        s3x.A0A = this.A01.A01();
        s3x.A0C = this.A00.A01();
    }

    public final void update() {
        this.A02.A02();
        this.A01.A02();
        this.A00.A02();
    }
}
