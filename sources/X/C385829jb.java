package X;

import java.util.TreeMap;

/* renamed from: X.9jb  reason: invalid class name and case insensitive filesystem */
public final class C385829jb extends 2Cn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8QN A01;
    public final /* synthetic */ TreeMap A02;

    public C385829jb(AnonymousClass8QN r1, TreeMap treeMap, int i) {
        this.A01 = r1;
        this.A02 = treeMap;
        this.A00 = i;
    }

    public final void onFail(Exception exc) {
        AnonymousClass8QN r2 = this.A01;
        r2.A00--;
        0KC.A0F(AnonymousClass8QN.__redex_internal_original_name, "Failed to initialize video", exc);
        AnonymousClass8QN.A06(r2, this.A02);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        AnonymousClass8QN r3 = this.A01;
        r3.A00--;
        AnonymousClass8QN.A03(r3, new C365798nh((C349307zv) obj), this.A02, this.A00);
    }
}
