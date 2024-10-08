package X;

import android.app.Activity;
import android.graphics.RectF;
import android.view.View;
import com.instagram.model.reels.Reel;

/* renamed from: X.Upq  reason: case insensitive filesystem */
public final class C16165Upq extends AnonymousClass6UX {
    public final X4W A00;
    public final Integer A01;

    public final void A0A(Reel reel, C255773uh r2) {
    }

    public final void A0C(Reel reel, C255773uh r2) {
    }

    public static void A00(Activity activity, RectF rectF, AnonymousClass32A r4, Object obj, int i) {
        r4.A05 = new C16165Upq(activity, rectF, (C230222pE) new C19489Wab(obj, i));
    }

    public final AnonymousClass6KT A08(Reel reel, C255773uh r5) {
        RectF C4O = this.A00.C4O();
        if (C4O == null) {
            return AnonymousClass6KT.A01();
        }
        if (this.A01 == AnonymousClass05K.A00) {
            return AnonymousClass6KT.A04(C4O);
        }
        return AnonymousClass6KT.A03(C4O);
    }

    public final void A09(Reel reel) {
    }

    public final void A0D(RectF rectF) {
        X4W x4w = this.A00;
        if (x4w instanceof C19493Waf) {
            ((C19493Waf) x4w).A00 = rectF;
            return;
        }
        throw new IllegalStateException("can't set Target RectF when a delegate is passed");
    }

    public C16165Upq(Activity activity, View view, C230222pE r4) {
        this(activity, 0nA.A0F(view), r4);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Waf, java.lang.Object, X.X4W] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C16165Upq(android.app.Activity r2, android.graphics.RectF r3, X.C230222pE r4, java.lang.Integer r5) {
        /*
            r1 = this;
            X.Waf r0 = new X.Waf
            r0.<init>()
            r0.A00 = r3
            r1.<init>((android.app.Activity) r2, (X.C230222pE) r4, (X.X4W) r0, (java.lang.Integer) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16165Upq.<init>(android.app.Activity, android.graphics.RectF, X.2pE, java.lang.Integer):void");
    }

    public C16165Upq(Activity activity, C230222pE r2, X4W x4w, Integer num) {
        super(activity, r2);
        this.A00 = x4w;
        this.A01 = num;
    }

    public C16165Upq(Activity activity, RectF rectF, C230222pE r4) {
        this(activity, rectF, r4, AnonymousClass05K.A00);
    }
}
