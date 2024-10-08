package X;

import android.content.Context;

/* renamed from: X.XwF  reason: case insensitive filesystem */
public final class C22150XwF implements Y9D {
    public final /* bridge */ /* synthetic */ Object Cg0(Object obj) {
        Context context = (Context) obj;
        if (C22224Xxe.A02 == null) {
            C22224Xxe.A02 = context.getApplicationContext();
            if (C22224Xxe.A02 == null) {
                throw AnonymousClass7TE.A0z("An application must be set on the injector ```FbInjector.setApplication(app)``` before you can start performing injections");
            }
        }
        return new XM0(context, new XLy(C22224Xxe.A02));
    }
}
