package X;

/* renamed from: X.4pU  reason: invalid class name and case insensitive filesystem */
public final class C275034pU implements C274924pJ, AnonymousClass0gr {
    public 0TS A00;
    public 0TS A01;
    public 0TS A02;
    public final AnonymousClass0TR A03;

    public final String getName() {
        return "memory_red";
    }

    public final void update() {
    }

    public final void AGZ(S3X s3x, StackTraceElement[] stackTraceElementArr) {
        if (s3x instanceof QJT) {
            QJT qjt = (QJT) s3x;
            0TS r0 = this.A01;
            if (r0 != null) {
                qjt.A06 = r0.name();
            }
            0TS r02 = this.A02;
            if (r02 != null) {
                qjt.A0C = r02.name();
            }
            0TS r03 = this.A00;
            if (r03 != null) {
                qjt.A04 = r03.name();
            }
        }
    }

    public C275034pU(AnonymousClass0TR r1) {
        this.A03 = r1;
        r1.A8y(this);
    }

    public final void CuY(0TS r1) {
        this.A00 = r1;
    }

    public final void DMb(0TS r1) {
        this.A01 = r1;
    }

    public final void Dq7(0TS r1) {
        this.A02 = r1;
    }
}
