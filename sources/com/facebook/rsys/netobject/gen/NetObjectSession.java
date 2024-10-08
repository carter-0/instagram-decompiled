package com.facebook.rsys.netobject.gen;

import X.2LV;
import X.C22181Xwr;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import java.util.ArrayList;

public abstract class NetObjectSession {
    public static 2LV CONVERTER = C22181Xwr.A00(19);

    public final class CProxy extends NetObjectSession {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        public static native NetObjectSession createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public native ArrayList allObjectsListCopy();

        public native boolean canDestroy(long j);

        public native boolean canUpdate(long j);

        public native long createObjectWithTypeId(int i);

        public native long createObjectWithTypeName(String str);

        public native void destroy();

        public native void destroyObject(long j);

        public native byte[] getBinaryValueCopy(long j, int i);

        public native boolean getBoolValue(long j, int i);

        public native int getByteValue(long j, int i);

        public native double getDoubleValue(long j, int i);

        public native float getFloatValue(long j, int i);

        public native float getFloatVectorValue(long j, int i, int i2);

        public native int getIntValue(long j, int i);

        public native long getLongValue(long j, int i);

        public native String getStringValueCopy(long j, int i);

        public native int getTypeId(long j);

        public native long getUpdateTime(long j);

        public native boolean hasField(long j, int i);

        public native int hashCode();

        public native boolean isOwner(long j, String str);

        public native void publishUpdates();

        public native void sendRawData(int i, ArrayList arrayList, byte[] bArr);

        public native void setBinaryValue(long j, int i, byte[] bArr);

        public native void setBoolValue(long j, int i, boolean z);

        public native void setByteValue(long j, int i, int i2);

        public native void setDoubleValue(long j, int i, double d);

        public native void setFloatValue(long j, int i, float f);

        public native void setFloatVectorValue(long j, int i, int i2, float f);

        public native void setIntValue(long j, int i, int i2);

        public native void setLongValue(long j, int i, long j2);

        public native void setRawDataListener(RawDataListener rawDataListener);

        public native void setStringValue(long j, int i, String str);

        public native void start(NetObjectSessionListener netObjectSessionListener, ArrayList arrayList);

        public native String typeNameCopy(long j);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof NetObjectSession)) {
                return false;
            }
            return nativeEquals(obj);
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract ArrayList allObjectsListCopy();

    public abstract boolean canDestroy(long j);

    public abstract boolean canUpdate(long j);

    public abstract long createObjectWithTypeId(int i);

    public abstract long createObjectWithTypeName(String str);

    public abstract void destroy();

    public abstract void destroyObject(long j);

    public abstract byte[] getBinaryValueCopy(long j, int i);

    public abstract boolean getBoolValue(long j, int i);

    public abstract int getByteValue(long j, int i);

    public abstract double getDoubleValue(long j, int i);

    public abstract float getFloatValue(long j, int i);

    public abstract float getFloatVectorValue(long j, int i, int i2);

    public abstract int getIntValue(long j, int i);

    public abstract long getLongValue(long j, int i);

    public abstract String getStringValueCopy(long j, int i);

    public abstract int getTypeId(long j);

    public abstract long getUpdateTime(long j);

    public abstract boolean hasField(long j, int i);

    public abstract boolean isOwner(long j, String str);

    public abstract void publishUpdates();

    public abstract void sendRawData(int i, ArrayList arrayList, byte[] bArr);

    public abstract void setBinaryValue(long j, int i, byte[] bArr);

    public abstract void setBoolValue(long j, int i, boolean z);

    public abstract void setByteValue(long j, int i, int i2);

    public abstract void setDoubleValue(long j, int i, double d);

    public abstract void setFloatValue(long j, int i, float f);

    public abstract void setFloatVectorValue(long j, int i, int i2, float f);

    public abstract void setIntValue(long j, int i, int i2);

    public abstract void setLongValue(long j, int i, long j2);

    public abstract void setRawDataListener(RawDataListener rawDataListener);

    public abstract void setStringValue(long j, int i, String str);

    public abstract void start(NetObjectSessionListener netObjectSessionListener, ArrayList arrayList);

    public abstract String typeNameCopy(long j);
}
