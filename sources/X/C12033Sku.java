package X;

/* renamed from: X.Sku  reason: case insensitive filesystem */
public final class C12033Sku implements C274924pJ {
    public C274994pQ A00;
    public C275014pS A01;

    public final String getName() {
        return "render_thread";
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        if (s3x instanceof QJT) {
            QJT qjt = (QJT) s3x;
            C274994pQ r0 = this.A00;
            if (r0 != null) {
                qjt.A09 = r0.A01();
            }
            if (stackTraceElementArr.length != 0) {
                StackTraceElement stackTraceElement = stackTraceElementArr[0];
                if (this.A01 == null) {
                    return;
                }
                if ("android.graphics.HardwareRenderer".equals(stackTraceElement.getClassName()) || "android.view.ThreadedRenderer".equals(stackTraceElement.getClassName())) {
                    qjt.A0B = this.A01.A01();
                }
            }
        }
    }

    public final void update() {
        int A002;
        if (this.A01 == null && (A002 = AnonymousClass15N.A00()) >= 0) {
            this.A01 = new C275014pS(A002);
            this.A00 = new C274994pQ(A002);
        }
        C275014pS r0 = this.A01;
        if (r0 != null) {
            r0.A02();
        }
        C274994pQ r02 = this.A00;
        if (r02 != null) {
            r02.A02();
        }
    }
}
