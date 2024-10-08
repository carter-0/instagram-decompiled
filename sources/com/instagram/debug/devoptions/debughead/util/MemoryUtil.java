package com.instagram.debug.devoptions.debughead.util;

import X.0dV;
import X.AnonymousClass7TE;
import X.C63114Kri;
import java.util.List;

public final class MemoryUtil {
    public static final List ALLOCATIONS = AnonymousClass7TE.A1C();
    public static final MemoryUtil INSTANCE = new Object();
    public static final int MAX_ALLOC_SIZE = 10000000;
    public static final int PAGE_SIZE = 4096;
    public static final String TAG = "MemoryUtil";

    public static final native synchronized void allocateNativeMemory(int i);

    public static final native synchronized void freeAllPreviouslyAllocatedNativeMemory();

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.debughead.util.MemoryUtil, java.lang.Object] */
    static {
        0dV.A0C("debugheadutil");
    }

    public static final void allocJavaMemory(int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2 += 4096) {
            bArr[i2] = (byte) ((int) (Math.random() * 256.0d));
        }
        ALLOCATIONS.add(bArr);
    }

    public static final synchronized void allocNativeMemory(int i) {
        synchronized (MemoryUtil.class) {
            int i2 = i / MAX_ALLOC_SIZE;
            int i3 = i % MAX_ALLOC_SIZE;
            for (int i4 = 0; i4 < i2; i4++) {
                allocateNativeMemory(MAX_ALLOC_SIZE);
            }
            allocateNativeMemory(i3);
        }
    }

    public static final void freeAllPreviouslyAllocatedJavaMemory() {
        ALLOCATIONS.clear();
    }

    public static final int remainingMbBeforeOom() {
        return C63114Kri.A00();
    }
}
