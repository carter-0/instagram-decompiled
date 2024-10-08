package X;

import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import com.meta.arfx.engine.common.AREngineService$binder$1;
import java.nio.ByteBuffer;

/* renamed from: X.Apm  reason: case insensitive filesystem */
public final class C41188Apm implements Runnable {
    public final /* synthetic */ VersionedSharedMemory A00;
    public final /* synthetic */ AREngineService$binder$1 A01;
    public final /* synthetic */ C368618t1 A02;

    public C41188Apm(VersionedSharedMemory versionedSharedMemory, AREngineService$binder$1 aREngineService$binder$1, C368618t1 r3) {
        this.A01 = aREngineService$binder$1;
        this.A02 = r3;
        this.A00 = versionedSharedMemory;
    }

    public final void run() {
        ByteBuffer byteBuffer;
        AREngineService$binder$1.A00(this.A01);
        C368618t1 r1 = this.A02;
        if (r1.A0G == null) {
            VersionedSharedMemory versionedSharedMemory = this.A00;
            r1.A0G = versionedSharedMemory;
            if (versionedSharedMemory != null) {
                byteBuffer = versionedSharedMemory.mapReadOnly();
            } else {
                byteBuffer = null;
            }
            r1.A0L = byteBuffer;
        }
    }
}
