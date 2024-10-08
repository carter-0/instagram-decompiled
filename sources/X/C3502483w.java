package X;

import com.aiplatform.modelloaders.nativemodelloader.ig.IgVoltronModelLoader;

/* renamed from: X.83w  reason: invalid class name and case insensitive filesystem */
public final class C3502483w implements AnonymousClass83x {
    public final /* synthetic */ IgVoltronModelLoader A00;
    public final /* synthetic */ 0sP A01;

    public C3502483w(IgVoltronModelLoader igVoltronModelLoader, 0sP r2) {
        this.A00 = igVoltronModelLoader;
        this.A01 = r2;
    }

    public final void DEf(boolean z, Throwable th) {
        0kD.A07(IgVoltronModelLoader.TAG, 002.A0R("fetchVoltronModule onFailure ", th.getLocalizedMessage()), (Throwable) null);
        this.A01.invoke(new 0eR(new 0eQ(th)));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        this.A00.arePytorchLibrariesLoaded.set(true);
        this.A01.invoke(new 0eR(C60340gF.A00));
    }
}
