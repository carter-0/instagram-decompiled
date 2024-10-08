package X;

import android.util.LruCache;

/* renamed from: X.ECy  reason: case insensitive filesystem */
public final class C47689ECy extends 1P0 {
    public final 1P0 A00;
    public final String A01;
    public final boolean A02;

    public C47689ECy(1P0 r1, String str, boolean z) {
        this.A02 = z;
        this.A01 = str;
        this.A00 = r1;
    }

    public final void onFail(C268654dm r3) {
        int A0D = AnonymousClass7TG.A0D(r3, -2066135287);
        this.A00.onFail(r3);
        AnonymousClass0fD.A0A(-1739376890, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-1717032774);
        this.A00.onFinish();
        AnonymousClass0fD.A0A(1278439295, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(1796051547);
        this.A00.onStart();
        AnonymousClass0fD.A0A(-674861946, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        LruCache lruCache;
        int A03 = AnonymousClass0fD.A03(694543919);
        int A0D = AnonymousClass7TG.A0D(obj, 1879860578);
        this.A00.onSuccess(obj);
        String str = this.A01;
        if (this.A02) {
            lruCache = FA3.A02;
        } else {
            lruCache = FA3.A01;
        }
        lruCache.put(str, obj);
        AnonymousClass0fD.A0A(1391187431, A0D);
        AnonymousClass0fD.A0A(1523565075, A03);
    }
}
