package com.facebook.simplejni;

import X.0dV;
import X.1FH;
import X.C249623k6;
import X.C249633k7;
import X.C249643k8;
import java.util.concurrent.atomic.AtomicReference;

public class NativeHolder {
    public final Destructor mDestructor;
    public final long mNativePointer;

    public class Destructor extends C249623k6 {
        public long mNativeDestructorFunctionPointer;
        public long mNativePointer;

        public static native void deleteNative(long j, long j2);

        static {
            0dV.A0C("simplejni");
        }

        public Destructor(Object obj, long j, long j2) {
            super(obj, C249633k7.A02);
            AtomicReference atomicReference;
            C249623k6 r0;
            C249643k8 r2 = C249633k7.A01;
            do {
                atomicReference = r2.A00;
                r0 = (C249623k6) atomicReference.get();
                this.A00 = r0;
            } while (!1FH.A00(r0, this, atomicReference));
            this.mNativePointer = j;
            this.mNativeDestructorFunctionPointer = j2;
        }

        public void destruct() {
            long j = this.mNativePointer;
            if (j != 0) {
                deleteNative(j, this.mNativeDestructorFunctionPointer);
                this.mNativePointer = 0;
            }
        }
    }

    static {
        0dV.A0C("simplejni");
    }

    public NativeHolder(long j, long j2) {
        this.mNativePointer = j;
        this.mDestructor = new Destructor(this, j, j2);
    }
}
