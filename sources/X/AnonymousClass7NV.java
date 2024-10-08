package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.7NV  reason: invalid class name */
public final class AnonymousClass7NV implements AnonymousClass7NK {
    public final AnonymousClass7NN A00 = new AnonymousClass7NN();
    public final AnonymousClass5FV A01 = AnonymousClass5FV.Love;

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r5, String str, boolean z) {
        ViewGroup viewGroup;
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        AnonymousClass7NN r2 = this.A00;
        View view = a7s.A01;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A00((U3Z) view, str);
        View view2 = a7s.A02;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A01((U3Z) view2, str);
        if (!z && (viewGroup = a7s.A05) != null) {
            viewGroup.post(new C57895IiC(this, a7s, str));
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, new U3Z(context), new U3Z(context), new U3L(context), (View) null, viewGroup, (ImageView) null, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r10, String str, boolean z) {
        C39752A7s a7s2 = a7s;
        0qQ.A0B(a7s, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        AnonymousClass7NN r2 = this.A00;
        if (r2.A04(str)) {
            return C16809V6q.A00(r2, a7s2, AnonymousClass05K.A01, str2, true, z);
        }
        return false;
    }

    public final void FIO(C39752A7s a7s, String str) {
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        AnonymousClass7NN r2 = this.A00;
        View view = a7s.A01;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A02((U3Z) view, str);
        View view2 = a7s.A02;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A03((U3Z) view2, str);
    }

    public final AnonymousClass5FV CAI() {
        return this.A01;
    }

    public final /* synthetic */ boolean CQX(String str) {
        return false;
    }
}
