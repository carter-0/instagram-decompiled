package X;

import android.graphics.Bitmap;
import java.util.TreeMap;

/* renamed from: X.9jd  reason: invalid class name and case insensitive filesystem */
public final class C385849jd extends 2Cn {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass8QN A01;
    public final /* synthetic */ TreeMap A02;
    public final /* synthetic */ boolean A03;

    public C385849jd(AnonymousClass8QN r1, TreeMap treeMap, int i, boolean z) {
        this.A01 = r1;
        this.A02 = treeMap;
        this.A03 = z;
        this.A00 = i;
    }

    public final void onFail(Exception exc) {
        AnonymousClass8QN r2 = this.A01;
        r2.A00--;
        0KC.A0F(AnonymousClass8QN.__redex_internal_original_name, "Failed to initialize photo", exc);
        AnonymousClass8QN.A06(r2, this.A02);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C352218Cl r7 = (C352218Cl) obj;
        AnonymousClass8QN r5 = this.A01;
        r5.A00--;
        AnonymousClass8QN.A03(r5, new C365798nh((Bitmap) null, r7, r7.A0h, this.A03), this.A02, this.A00);
    }
}
