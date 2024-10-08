package X;

import java.lang.ref.WeakReference;
import java.util.HashMap;

/* renamed from: X.Inw  reason: case insensitive filesystem */
public final class C58192Inw extends 0Yg implements C62320sa {
    public final /* synthetic */ GH3 A00;
    public final /* synthetic */ boolean A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58192Inw(GH3 gh3, boolean z, boolean z2, boolean z3) {
        super(0);
        this.A00 = gh3;
        this.A01 = z;
        this.A02 = z2;
        this.A03 = z3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        GH3 gh3 = this.A00;
        C267324bN r3 = gh3.A00;
        HashMap hashMap = gh3.A06;
        HashMap hashMap2 = gh3.A05;
        AnonymousClass0iw r5 = gh3.A02;
        WeakReference A0v = C51965G9l.A0v(gh3.A04);
        return new C52152GGu(2WX.A02, r3, gh3.A01, r5, gh3.A03, (Integer) null, A0v, hashMap, hashMap2, this.A01, gh3.A07, false, false, this.A02, this.A03);
    }
}
