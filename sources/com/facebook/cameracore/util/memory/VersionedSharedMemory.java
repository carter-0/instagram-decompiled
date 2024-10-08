package com.facebook.cameracore.util.memory;

import X.0KC;
import X.0qQ;
import X.ALJ;
import X.Pxd;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import android.system.OsConstants;
import java.nio.ByteBuffer;

public final class VersionedSharedMemory implements Parcelable {
    public static final ALJ CREATOR = new Object();
    public static final Class TAG = VersionedSharedMemory.class;
    public static volatile boolean isLibraryLoaded;
    public final SharedMemory androidSharedMemory;
    public long bufferPtr = -1;
    public final int fd;
    public final String name;
    public final int size;

    public VersionedSharedMemory(int i, SharedMemory sharedMemory, int i2, String str) {
        0qQ.A0B(str, 4);
        this.fd = i;
        this.androidSharedMemory = sharedMemory;
        this.size = i2;
        this.name = str;
        ALJ.A00(CREATOR);
    }

    public static final native int closeMemoryFile(int i);

    public static final native int closeMemoryMap(long j, int i);

    public static final native Object createByteBufferFromMap(long j, int i);

    public static final native int createNewSharedMemoryRegion(String str, int i);

    public static final native int getSharedMemoryRegionSize(int i);

    public static final native long memoryMapRegion(int i, int i2, int i3);

    public void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.androidSharedMemory, i);
        parcel.writeString(this.name);
    }

    public static final Class getTAG() {
        return TAG;
    }

    private final ByteBuffer map(int i) {
        if (this.bufferPtr > 0) {
            0KC.A02(TAG, "Failed to create buffer. Buffer already created for shared memory region");
            return null;
        }
        long memoryMapRegion = memoryMapRegion(this.fd, this.size, i);
        if (memoryMapRegion < 0) {
            0KC.A09(TAG, "Failed to create memory region for shared memory %d %s", new Object[]{Integer.valueOf(this.fd), this.name});
            return null;
        }
        this.bufferPtr = memoryMapRegion;
        Object createByteBufferFromMap = createByteBufferFromMap(memoryMapRegion, this.size);
        0qQ.A0C(createByteBufferFromMap, Pxd.A00(819));
        return (ByteBuffer) createByteBufferFromMap;
    }

    public final void close() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            sharedMemory.close();
            return;
        }
        int closeMemoryFile = closeMemoryFile(this.fd);
        if (closeMemoryFile != 0) {
            0KC.A09(TAG, "Failed to close file %d %s result: %d", new Object[]{Integer.valueOf(this.fd), this.name, Integer.valueOf(closeMemoryFile)});
        }
    }

    public int describeContents() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.describeContents();
        }
        return 1;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSize() {
        return this.size;
    }

    public final ByteBuffer mapReadOnly() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.mapReadOnly();
        }
        return map(OsConstants.PROT_READ);
    }

    public final ByteBuffer mapReadWrite() {
        SharedMemory sharedMemory = this.androidSharedMemory;
        if (sharedMemory != null) {
            return sharedMemory.mapReadWrite();
        }
        return map(OsConstants.PROT_READ | OsConstants.PROT_WRITE);
    }

    public final void unmap(ByteBuffer byteBuffer) {
        if (this.androidSharedMemory == null) {
            long j = this.bufferPtr;
            if (j >= 0) {
                int closeMemoryMap = closeMemoryMap(j, this.size);
                this.bufferPtr = -1;
                if (closeMemoryMap != 0) {
                    0KC.A09(TAG, "Failed to close mmap %d %s result: %d", new Object[]{Integer.valueOf(this.fd), this.name, Integer.valueOf(closeMemoryMap)});
                }
            }
        } else if (byteBuffer != null) {
            SharedMemory.unmap(byteBuffer);
        }
    }
}
