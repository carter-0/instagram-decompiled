package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: X.7NI  reason: invalid class name */
public final class AnonymousClass7NI extends AnonymousClass7NJ {
    public final AnonymousClass7NN A00;

    public final void ADP(C39752A7s a7s, AnonymousClass7NZ r5, String str, boolean z) {
        ViewGroup viewGroup;
        0qQ.A0B(a7s, 0);
        0qQ.A0B(str, 1);
        0qQ.A0B(r5, 2);
        super.ADP(a7s, r5, str, z);
        AnonymousClass7NN r2 = this.A00;
        View view = a7s.A01;
        0qQ.A0C(view, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A00((U3Z) view, str);
        View view2 = a7s.A02;
        0qQ.A0C(view2, "null cannot be cast to non-null type com.facebook.xac.powerups.hearts.HeartsDecorationView");
        r2.A01((U3Z) view2, str);
        if (!z && (viewGroup = a7s.A05) != null) {
            viewGroup.post(new C57902IiJ(a7s, this, str));
        }
    }

    public final C39752A7s CrU(Context context, ShapeDrawable shapeDrawable, View view, ViewGroup viewGroup, ImageView imageView, AnonymousClass763 r15) {
        0qQ.A0B(context, 0);
        return new C39752A7s(shapeDrawable, new U3Z(context), new U3Z(context), new U3L(context), view, viewGroup, imageView, r15);
    }

    public final boolean D27(C39752A7s a7s, AnonymousClass7NZ r14, String str, boolean z) {
        C39752A7s a7s2 = a7s;
        0qQ.A0B(a7s, 0);
        String str2 = str;
        0qQ.A0B(str, 1);
        0qQ.A0B(r14, 3);
        boolean z2 = z;
        super.D27(a7s, r14, str, z2);
        if (!this.A00.A04(str)) {
            return false;
        }
        C58700Iw9 iw9 = new C58700Iw9(this, a7s2, AnonymousClass05K.A01, str2, 3, z2);
        return A02(a7s, str, iw9, C58372Iqr.A00, true);
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

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnonymousClass7NI(X.AnonymousClass7NF r8, X.AnonymousClass7NG r9, X.AnonymousClass7NH r10) {
        /*
            r7 = this;
            X.7NL r3 = new X.7NL
            r3.<init>()
            r1 = 1
            r0 = 0
            X.7NM r4 = new X.7NM
            r4.<init>(r0, r0, r1)
            X.7NN r0 = new X.7NN
            r0.<init>()
            r1 = r7
            r2 = r8
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7NI.<init>(X.7NF, X.7NG, X.7NH):void");
    }

    public final AnonymousClass5FV CAI() {
        return AnonymousClass5FV.AvatarHeart;
    }
}
