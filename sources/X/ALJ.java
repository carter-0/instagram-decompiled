package X;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SharedMemory;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;

public final class ALJ implements Parcelable.Creator {
    public static final synchronized void A00(ALJ alj) {
        synchronized (alj) {
            if (!VersionedSharedMemory.isLibraryLoaded) {
                0dV.A0C("arfx-memory-jni");
                VersionedSharedMemory.isLibraryLoaded = true;
            }
        }
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object readParcelable;
        0qQ.A0B(parcel, 0);
        A00(this);
        String str = "";
        int i = 0;
        Class<SharedMemory> cls = SharedMemory.class;
        if (Build.VERSION.SDK_INT >= 33) {
            readParcelable = parcel.readParcelable(cls.getClassLoader(), cls);
        } else {
            readParcelable = parcel.readParcelable(cls.getClassLoader());
        }
        SharedMemory sharedMemory = (SharedMemory) readParcelable;
        if (sharedMemory != null) {
            i = sharedMemory.getSize();
        }
        String readString = parcel.readString();
        if (readString != null) {
            str = readString;
        }
        return new VersionedSharedMemory(-1, sharedMemory, i, str);
    }

    public final VersionedSharedMemory A01(String str, int i) {
        A00(this);
        SharedMemory create = SharedMemory.create(str, i);
        0qQ.A07(create);
        return new VersionedSharedMemory(-1, create, i, str);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new VersionedSharedMemory[i];
    }
}
