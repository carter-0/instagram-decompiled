package com.instagram.common.graphics;

import X.AnonymousClass1O0;
import X.AnonymousClass7TE;
import X.C51965G9l;
import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import java.util.List;

public final class IgBitmapReference {
    public WeakReference mBitmapWeakReference;
    public final long mNativeEntry;
    public boolean mReleased;

    public static native Bitmap nativeCreateBitmap(long j);

    public static native void nativeDestructor(long j);

    public static native void nativeMakeDiscardable(long j);

    public synchronized Bitmap getOrCreateBitmap() {
        Bitmap bitmap;
        if (!this.mReleased) {
            WeakReference weakReference = this.mBitmapWeakReference;
            if (weakReference == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) weakReference.get();
            }
            if (bitmap == null) {
                bitmap = nativeCreateBitmap(this.mNativeEntry);
                List list = AnonymousClass1O0.A01;
                if (list.size() > 450) {
                    System.gc();
                }
                list.add(new WeakReference(bitmap, AnonymousClass1O0.A00));
                if (bitmap != null) {
                    this.mBitmapWeakReference = C51965G9l.A0v(bitmap);
                }
            }
        } else {
            throw AnonymousClass7TE.A0z("Trying to use a bitmap reference that's already been released");
        }
        return bitmap;
    }

    public synchronized void makeDiscardable() {
        nativeMakeDiscardable(this.mNativeEntry);
    }

    public synchronized void release() {
        if (!this.mReleased) {
            this.mReleased = true;
            this.mBitmapWeakReference = null;
            nativeDestructor(this.mNativeEntry);
        } else {
            throw AnonymousClass7TE.A0z("Trying to release a bitmap reference that's already been released");
        }
    }

    public void finalize() {
        if (!this.mReleased) {
            nativeDestructor(this.mNativeEntry);
        }
    }

    public IgBitmapReference(long j) {
        this.mNativeEntry = j;
    }
}
