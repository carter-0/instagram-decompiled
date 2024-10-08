package X;

import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2gv  reason: invalid class name and case insensitive filesystem */
public final class C226502gv extends C226512gw {
    public static final AnonymousClass2h0 A06 = new C226542gz();
    public static volatile C303766Ar A07;
    public int A00;
    public int A01;
    public String A02;
    public AtomicReference A03 = new AtomicReference();
    public AtomicReference A04 = new AtomicReference();
    public final C226442gp A05;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.6Ar] */
    public static C71532dv A00(ByteBuffer byteBuffer) {
        try {
            if (A07 == null) {
                synchronized (C226502gv.class) {
                    if (A07 == null) {
                        A07 = new Object();
                    }
                }
            }
            return A07.A00(byteBuffer);
        } catch (Exception unused) {
            return null;
        }
    }

    public C226502gv(C226442gp r2, Executor executor, int i) {
        super(executor, i);
        this.A05 = r2;
    }
}
