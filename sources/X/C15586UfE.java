package X;

import android.content.Context;

/* renamed from: X.UfE  reason: case insensitive filesystem */
public final class C15586UfE extends 1P0 {
    public final /* synthetic */ C17600Vas A00;

    public C15586UfE(C17600Vas vas) {
        this.A00 = vas;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(-1674276592);
        Context context = this.A00.A00;
        C59689JTv.A03(context, context.getString(2131969820), "product_rejected_dialog_remove_tag_failed", 0);
        AnonymousClass0fD.A0A(-877920432, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1881655482);
        int A032 = AnonymousClass0fD.A03(-663817789);
        C17600Vas vas = this.A00;
        C310206ab r1 = vas.A04;
        if (r1 != null) {
            r1.Ddb(vas.A05);
        }
        AnonymousClass0fD.A0A(1919933919, A032);
        AnonymousClass0fD.A0A(-35378170, A03);
    }
}
