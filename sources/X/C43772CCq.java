package X;

/* renamed from: X.CCq  reason: case insensitive filesystem */
public final class C43772CCq extends AnonymousClass4El {
    public final Object A01(Class cls) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot allocate ");
        sb.append(cls);
        sb.append(". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly.");
        throw AnonymousClass7TE.A1B(sb.toString());
    }
}
