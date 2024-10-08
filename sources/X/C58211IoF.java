package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.IoF  reason: case insensitive filesystem */
public final class C58211IoF extends 0Yg implements C62320sa {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ AnonymousClass5PL A03;
    public final /* synthetic */ AnonymousClass5Y2 A04;
    public final /* synthetic */ 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58211IoF(Context context, View view, AnonymousClass5PL r4, AnonymousClass5Y2 r5, 0sP r6, int i) {
        super(0);
        this.A01 = context;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = i;
        this.A02 = view;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A01;
        0sP r5 = this.A05;
        AnonymousClass5PL r2 = this.A03;
        AnonymousClass5Y2 r3 = this.A04;
        int i = this.A00;
        View view = this.A02;
        0qQ.A0C(view, "null cannot be cast to non-null type androidx.compose.ui.node.Owner");
        return new C52849Gdi(context, r2, r3, (C268124co) view, r5, i).A0N;
    }
}
