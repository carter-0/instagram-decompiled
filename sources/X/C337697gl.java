package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7gl  reason: invalid class name and case insensitive filesystem */
public final class C337697gl extends 2Sg {
    public final WeakReference A00;

    public C337697gl(C337657gh r3) {
        super(new AnonymousClass2Si((2V1) null, (C251233mm) null), -1);
        this.A00 = new WeakReference(r3);
    }

    public final /* bridge */ /* synthetic */ Object A00(Object obj) {
        if (this.A00.get() == null) {
            return null;
        }
        throw new NullPointerException("loadingState");
    }
}
