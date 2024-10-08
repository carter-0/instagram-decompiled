package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import X.002;
import X.0Gb;
import X.B2O;
import X.C3502583y;
import X.C371698yt;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public class DynamicServiceModule extends ServiceModule {
    public ServiceModule mBaseModule;
    public final 0Gb mErrorReporter;
    public final B2O mModule;
    public final C3502583y mModuleLoader;

    private synchronized ServiceModule getBaseInstance() {
        if (this.mBaseModule == null) {
            try {
                C3502583y r0 = this.mModuleLoader;
                if (r0 != null) {
                    r0.ASc();
                }
                this.mBaseModule = (ServiceModule) Class.forName(this.mModule.BTw()).asSubclass(ServiceModule.class).newInstance();
            } catch (Exception e) {
                0Gb r3 = this.mErrorReporter;
                if (r3 != null) {
                    r3.Ew2("DynamicServiceModule", 002.A0R("ServiceModule instance creation failed for ", this.mModule.BTw()), e);
                }
            }
        }
        return this.mBaseModule;
    }

    private native HybridData initHybrid(int i);

    public ServiceConfiguration createConfiguration(C371698yt r3) {
        ServiceModule baseInstance;
        if (!this.mModule.CUp(r3) || (baseInstance = getBaseInstance()) == null) {
            return null;
        }
        return baseInstance.createConfiguration(r3);
    }

    public DynamicServiceModule(B2O b2o, C3502583y r3, 0Gb r4) {
        this.mModule = b2o;
        this.mModuleLoader = r3;
        this.mErrorReporter = r4;
        this.mHybridData = initHybrid(b2o.Bsn().A00);
    }
}
