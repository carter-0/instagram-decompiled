package X;

import com.facebook.common.jniexecutors.AndroidAsyncExecutorFactory;
import com.facebook.models.IgModelLoader;
import com.facebook.models.ManifestLoaderProxy;
import com.facebook.models.VoltronModuleLoaderProxy;
import com.facebook.models.interfaces.ModelLoaderBase;
import com.instagram.service.tigon.IGTigonService;
import java.io.IOException;

/* renamed from: X.8j0  reason: invalid class name and case insensitive filesystem */
public final class C363048j0 {
    public static IgModelLoader A00;

    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.8j9] */
    /* JADX WARNING: type inference failed for: r0v13, types: [com.facebook.models.interfaces.ModelLoaderBase, com.facebook.models.IgModelLoader] */
    public static final synchronized IgModelLoader A00(0lg r8) {
        IgModelLoader igModelLoader;
        Class<C363048j0> cls = C363048j0.class;
        synchronized (cls) {
            IgModelLoader igModelLoader2 = A00;
            igModelLoader = igModelLoader2;
            if (igModelLoader2 == null) {
                try {
                    Class cls2 = IgModelLoader.TAG;
                    String canonicalPath = AnonymousClass1F2.A00().AXT((1LJ) null, 420392075).getCanonicalPath();
                    0qQ.A0A(r8);
                    IGTigonService tigonService = IGTigonService.getTigonService(r8);
                    AndroidAsyncExecutorFactory androidAsyncExecutorFactory = AndroidAsyncExecutorFactory.$redex_init_class;
                    AndroidAsyncExecutorFactory androidAsyncExecutorFactory2 = new AndroidAsyncExecutorFactory(C61560nl.A00().A00);
                    C363088j4 A002 = C363088j4.A00(r8);
                    0qQ.A07(A002);
                    ? modelLoaderBase = new ModelLoaderBase(IgModelLoader.initHybridWithJavaManifestLoader(canonicalPath, C59720ag.A01, tigonService, androidAsyncExecutorFactory2, new ManifestLoaderProxy(new C363108j6(A002)), new VoltronModuleLoaderProxy(new Object())));
                    A00 = modelLoaderBase;
                    igModelLoader = modelLoaderBase;
                } catch (IOException e) {
                    0KC.A05(cls, "Exception from getCanonicalPath()", e);
                    igModelLoader = null;
                }
            }
        }
        return igModelLoader;
    }
}
