package com.facebook.cameracore.mediapipeline.services.externalvideostreamsdelegate;

import X.AnonymousClass7TE;
import X.C346327uz;
import X.C346337v0;
import com.facebook.jni.HybridData;
import java.util.Iterator;
import java.util.Set;

public class ExternalVideoStreamsDelegateManager {
    public final Set mDelegates = AnonymousClass7TE.A1F();
    public HybridData mHybridData;

    private native HybridData initHybrid();

    private int[] getStreamTextureMetadata(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("getStreamTextureMetadata");
            }
        }
        return null;
    }

    private boolean hasStreamTextureForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("hasStreamTextureForIdentifier");
            }
        }
        return false;
    }

    private boolean hasStreamUpdatedForIdentifier(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("hasStreamUpdatedForIdentifier");
            }
        }
        return false;
    }

    private void onStreamTextureMade(String str) {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onStreamTextureMade");
            }
        }
    }

    private void onStreamTexturesUpdateBegin() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onStreamTexturesUpdateBegin");
            }
        }
    }

    private void onStreamTexturesUpdateEnd() {
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("onStreamTexturesUpdateEnd");
            }
        }
    }

    private void updateStreamTexture(String str, int i, int i2, int i3, int i4) {
        C346327uz r1 = new C346327uz(str);
        r1.A04 = i;
        r1.A02 = i2;
        r1.A00 = i3;
        r1.A01 = i4;
        r1.A07 = true;
        C346337v0 r3 = new C346337v0(r1);
        synchronized (this.mDelegates) {
            Iterator it = this.mDelegates.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass7TE.A11("updateStreamTexture");
            }
        }
        r3.A01();
    }
}
