package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.7zS  reason: invalid class name and case insensitive filesystem */
public final class C349017zS extends IgSimpleImageView {
    public boolean A00;
    public final C349027zT A01;

    public C349017zS(UserSession userSession, Context context) {
        super(context);
        this.A01 = new C349027zT(userSession, context, true);
    }

    public final void onDraw(Canvas canvas) {
        C306386Ly r5;
        float f;
        C306386Ly r1;
        C306396Lz r12;
        C15927Ukr ukr;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        if (this.A00) {
            Drawable drawable = getDrawable();
            C362938ik r7 = null;
            if ((drawable instanceof C15927Ukr) && (ukr = (C15927Ukr) drawable) != null) {
                ukr.A0b();
            }
            Drawable drawable2 = getDrawable();
            if (drawable2 instanceof C306386Ly) {
                r5 = (C306386Ly) drawable2;
            } else {
                r5 = null;
            }
            float f2 = 0.0f;
            if (r5 != null) {
                f = (float) AnonymousClass6M0.A00(r5.A0G);
            } else {
                f = 0.0f;
            }
            canvas2.save();
            canvas2.translate(f, 0.0f);
            if (r5 != null) {
                r5.A0S(canvas2);
            }
            canvas2.restore();
            if (!(r5 == null || (r12 = r5.A0I) == null)) {
                float A012 = C39814AAl.A01(r12, r5.A0b.getTextSize());
                if (Float.valueOf(A012) != null) {
                    f2 = A012;
                }
            }
            int width = (int) (((float) getWidth()) + (2.0f * f2));
            long nanoTime = System.nanoTime();
            C349027zT r10 = this.A01;
            Drawable drawable3 = getDrawable();
            if ((drawable3 instanceof C306386Ly) && (r1 = (C306386Ly) drawable3) != null) {
                r7 = r1.A0J;
            }
            float f3 = f + f2;
            int i = width;
            if (width < 1) {
                i = 1;
            }
            float f4 = 1.0f / ((float) i);
            int height = getHeight();
            if (height < 1) {
                height = 1;
            }
            r10.A02(canvas2, C394799yi.A00(r7, f3, f4, 1.0f / ((float) height), 1.0f), new C41658AyA(canvas2, f2), new C41659AyB(r5, f, f2), width, canvas2.getHeight(), nanoTime);
            return;
        }
        super.onDraw(canvas2);
    }

    public final void A00() {
        ALH B3D;
        C349047zV r0 = this.A01.A00;
        if (r0 != null && (B3D = r0.B3D()) != null) {
            synchronized (B3D) {
                B3D.A05.clear();
                B3D.A02.A00.clear();
            }
        }
    }

    public final void onDetachedFromWindow() {
        C349047zV r0;
        int A06 = AnonymousClass0fD.A06(1977465285);
        C349027zT r02 = this.A01;
        if (!(r02 == null || (r0 = r02.A00) == null)) {
            r0.cleanup();
        }
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(-2074510809, A06);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r1.A0F.length() <= 0) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setImageDrawable(android.graphics.drawable.Drawable r3) {
        /*
            r2 = this;
            super.setImageDrawable(r3)
            android.graphics.drawable.Drawable r1 = r2.getDrawable()
            boolean r0 = r1 instanceof X.C306386Ly
            if (r0 == 0) goto L_0x001c
            X.6Ly r1 = (X.C306386Ly) r1
            if (r1 == 0) goto L_0x001c
            X.6Lz r0 = r1.A0I
            if (r0 == 0) goto L_0x001c
            android.text.Spannable r0 = r1.A0F
            int r1 = r0.length()
            r0 = 1
            if (r1 > 0) goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            r2.A00 = r0
            X.7zT r1 = r2.A01
            if (r0 == 0) goto L_0x002b
            X.7zV r0 = r1.A00
            if (r0 == 0) goto L_0x002a
            r0.Exd()
        L_0x002a:
            return
        L_0x002b:
            monitor-enter(r1)
            X.7zV r0 = r1.A00     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0033
            r0.EyL()     // Catch:{ all -> 0x0035 }
        L_0x0033:
            monitor-exit(r1)
            return
        L_0x0035:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C349017zS.setImageDrawable(android.graphics.drawable.Drawable):void");
    }
}
