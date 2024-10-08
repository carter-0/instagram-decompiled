package X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: X.EMj  reason: case insensitive filesystem */
public final class C47915EMj extends C249383je {
    public final /* synthetic */ Rect A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C307786Rm A02;
    public final /* synthetic */ C276544tV A03;

    public C47915EMj(Rect rect, View view, C307786Rm r3, C276544tV r4) {
        this.A01 = view;
        this.A00 = rect;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.Eax, java.lang.Object] */
    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        float f;
        int A032 = AnonymousClass0fD.A03(1990709536);
        View view = this.A01;
        Rect rect = this.A00;
        if (view.getLocalVisibleRect(rect)) {
            f = ((float) rect.bottom) / ((float) view.getHeight());
        } else {
            f = 0.0f;
        }
        C276544tV r3 = this.A03;
        C277014uI A08 = r3.A08();
        if (A08 != null) {
            try {
                C308276Tl A0P = DbS.A0P();
                ? obj = new Object();
                obj.A00 = f;
                A0P.A01(obj);
                C307886Rw.A03(this.A02, r3, A0P.A00(), A08);
            } catch (IllegalStateException e) {
                1Kn.A02("NetegoNodeExtensionBinderUtils", 002.A0b(e.getMessage(), " on_scroll hash: ", System.identityHashCode(r3.A08())));
            }
        }
        AnonymousClass0fD.A0A(1720762424, A032);
    }

    public final void onScrollStateChanged(C238133Ar r3, int i) {
        AnonymousClass0fD.A0A(-51740331, AnonymousClass0fD.A03(985537654));
    }
}
