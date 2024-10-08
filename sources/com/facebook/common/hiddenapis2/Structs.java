package com.facebook.common.hiddenapis2;

import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodType;
import java.lang.reflect.Member;

public interface Structs {

    public class AccessibleObject {
        public boolean override;
    }

    public final class Class {
        public transient int accessFlags;
        public transient int classFlags;
        public transient ClassLoader classLoader;
        public transient int classSize;
        public transient int clinitThreadId;
        public transient Class componentType;
        public transient short copiedMethodsOffset;
        public transient Object dexCache;
        public transient int dexClassDefIndex;
        public volatile transient int dexTypeIndex;
        public transient Object extData;
        public transient long iFields;
        public transient Object[] ifTable;
        public transient long methods;
        public transient String name;
        public transient int numReferenceInstanceFields;
        public transient int numReferenceStaticFields;
        public transient int objectSize;
        public transient int objectSizeAllocFastPath;
        public transient int primitiveType;
        public transient int referenceInstanceOffsets;
        public transient long sFields;
        public transient int status;
        public transient Class superClass;
        public transient short virtualMethodsOffset;
        public transient Object vtable;
    }

    public final class Executable extends AccessibleObject {
        public int accessFlags;
        public long artMethod;
        public Class declaringClass;
        public Class declaringClassOfOverriddenMethod;
        public Object[] parameters;
    }

    public final class HandleInfo {
        public final MethodHandle handle = null;
        public final Member member = null;
    }

    public class MethodHandle {
        public final long artFieldOrMethod = 0;
        public MethodHandle cachedSpreadInvoker;
        public final int handleKind = 0;
        public MethodType nominalType;
        public final MethodType type = null;
    }

    public final class MethodHandleImpl extends MethodHandle {
        public final MethodHandleInfo info = null;
    }

    public class Stub {
        public static int S;
        public static int T;
        public int a;
        public int b;

        public static void f1() {
        }

        public static void f2() {
        }
    }
}
