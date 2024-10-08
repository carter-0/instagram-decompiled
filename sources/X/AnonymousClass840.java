package X;

import com.instagram.ar.core.voltron.IgArVoltronModuleLoader;

/* renamed from: X.840  reason: invalid class name */
public final class AnonymousClass840 implements AnonymousClass83x {
    public final /* synthetic */ AnonymousClass83x A00;
    public final /* synthetic */ IgArVoltronModuleLoader A01;
    public final /* synthetic */ 1US A02;

    public AnonymousClass840(AnonymousClass83x r1, IgArVoltronModuleLoader igArVoltronModuleLoader, 1US r3) {
        this.A02 = r3;
        this.A01 = igArVoltronModuleLoader;
        this.A00 = r1;
    }

    public final void DEf(boolean z, Throwable th) {
        this.A00.DEf(z, th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        1US r1 = this.A02;
        AnonymousClass84U r0 = AnonymousClass84U.$redex_init_class;
        int ordinal = r1.ordinal();
        if (ordinal == 1) {
            try {
                0dV.A0D("dynamic_pytorch_impl", 16);
                0dV.A0D("torch-code-gen", 16);
                0dV.A0D("aten_vulkan", 16);
                0dV.A0D("gans-ops-xplat", 16);
                0dV.A0D("torchvision-ops", 16);
                0dV.A0D("pytorch_jni", 16);
                0dV.A0D("pytorch_jni_lite", 16);
                this.A01.arePytorchModulesLoaded = true;
            } catch (UnsatisfiedLinkError e) {
                e = e;
                str = "SoLoader dynamic pytorch library exception:";
                0KC.A0J(IgArVoltronModuleLoader.TAG, str, e);
                this.A00.DEf(false, e);
                return;
            }
        } else if (ordinal == 5) {
            try {
                0dV.A0D("slam-native", 16);
            } catch (UnsatisfiedLinkError e2) {
                e = e2;
                str = "SoLoader dynamic slam-native library exception:";
            }
        }
        this.A00.onSuccess(obj);
    }
}
