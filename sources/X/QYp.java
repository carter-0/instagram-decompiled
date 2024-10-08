package X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

public final class QYp extends C10407Rrj {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QYp(C13565Tck tck, NativeAnimatedModule nativeAnimatedModule, int i) {
        super(nativeAnimatedModule);
        this.A00 = 4;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = tck;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QYp(NativeAnimatedModule nativeAnimatedModule, ReadableMap readableMap, int i, int i2) {
        super(nativeAnimatedModule);
        this.A00 = i2;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = readableMap;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QYp(NativeAnimatedModule nativeAnimatedModule, Callback callback, int i) {
        super(nativeAnimatedModule);
        this.A00 = 0;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = callback;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QYp(NativeAnimatedModule nativeAnimatedModule, ReadableArray readableArray, int i) {
        super(nativeAnimatedModule);
        this.A00 = 1;
        this.A02 = nativeAnimatedModule;
        this.A01 = i;
        this.A03 = readableArray;
    }
}
