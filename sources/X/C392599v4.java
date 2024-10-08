package X;

/* renamed from: X.9v4  reason: invalid class name and case insensitive filesystem */
public abstract class C392599v4 {
    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.84T] */
    public static final AnonymousClass84T A00(1US r4) {
        if (!1RH.A00().A05(r4) || !1RH.A00().A07(r4)) {
            throw AnonymousClass7TE.A15(002.A0R("Library loading failed for: ", r4.name()));
        }
        ? obj = new Object();
        try {
            C392589v3 r0 = C392589v3.$redex_init_class;
            int ordinal = r4.ordinal();
            if (ordinal == 1) {
                0dV.A0D("dynamic_pytorch_impl", 16);
                0dV.A0D("torch-code-gen", 16);
                0dV.A0D("aten_vulkan", 16);
                0dV.A0D("gans-ops-xplat", 16);
                0dV.A0D("torchvision-ops", 16);
                0dV.A0D("pytorch_jni", 16);
                0dV.A0D("pytorch_jni_lite", 16);
            } else if (ordinal == 5) {
                0dV.A0D("slam-native", 16);
                return obj;
            }
            return obj;
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException(002.A0g("SoLoader dynamic ", r4.name(), " library exception:"), e);
        }
    }
}
