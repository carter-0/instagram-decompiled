package com.facebook.content;

import X.AnonymousClass00P;
import X.Xr6;
import android.content.Context;
import com.facebook.ultralight.UL;

public abstract class ContentModule {

    public class ContentModuleSelendroidInjector {
        public final Context A00;

        public SecureContextHelper getSecureContextHelper() {
            return (SecureContextHelper) Xr6.A00(UL.id._UL__ULSEP_com_facebook_content_SecureContextHelper_ULSEP_BINDING_ID);
        }

        public ContentModuleSelendroidInjector(Context context) {
            this.A00 = context;
        }
    }

    public ContentModule() {
        throw AnonymousClass00P.createAndThrow();
    }
}
