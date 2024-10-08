package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Ug0  reason: case insensitive filesystem */
public final class C15634Ug0 extends C308096Sr {
    public final C276544tV A00;

    public final /* bridge */ /* synthetic */ Object A00(Context context, View view, Object obj, Object obj2) {
        C276544tV r3 = this.A00;
        view.setScaleX(r3.A02(136, 1.0f));
        view.setScaleY(r3.A02(137, 1.0f));
        view.setTranslationX(r3.A02(144, 0.0f));
        view.setTranslationY(r3.A02(145, 0.0f));
        view.setRotation(r3.A02(138, 0.0f));
        view.setAlpha(r3.A02(141, 1.0f));
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setAlpha(1.0f);
    }

    public C15634Ug0(C276544tV r1, long j) {
        super(j);
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean A01(Object obj, Object obj2, Object obj3, Object obj4) {
        return DbW.A1a(C276674ti.A00());
    }
}
