package X;

import android.content.Context;
import android.util.AttributeSet;
import com.instagram.igds.components.snackbar.IgdsSnackBar;

/* renamed from: X.UfL  reason: case insensitive filesystem */
public final class C15593UfL extends 1P0 {
    public final Context A00;
    public final C20918X4j A01;
    public final C14450TwY A02;

    public C15593UfL(Context context, C20918X4j x4j, C14450TwY twY) {
        this.A00 = context;
        this.A02 = twY;
        this.A01 = x4j;
    }

    public final void onFail(C268654dm r7) {
        int i;
        int A03 = AnonymousClass0fD.A03(2053807631);
        0qQ.A0B(r7, 0);
        C15593UfL.super.onFail(r7);
        this.A01.EIv();
        Context context = this.A00;
        if (context != null) {
            new IgdsSnackBar(context, (AttributeSet) null, 0);
            C14450TwY twY = this.A02;
            if (twY != null) {
                i = twY.A00;
            } else {
                i = 0;
            }
            C310336ap A0X = DbV.A0X();
            A0X.A0H = "search_history_clear_fail";
            A0X.A0D = context.getResources().getString(2131972821);
            A0X.A02 = i;
            DbY.A1N(A0X);
        }
        AnonymousClass0fD.A0A(266616955, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1224825882);
        int A0D = AnonymousClass7TG.A0D(obj, -1874973704);
        C15593UfL.super.onSuccess(obj);
        AnonymousClass0fD.A0A(-1702269406, A0D);
        AnonymousClass0fD.A0A(-805891766, A03);
    }
}
