package X;

import android.graphics.Canvas;
import android.text.Spannable;
import android.text.StaticLayout;
import com.instagram.common.session.UserSession;

/* renamed from: X.9UM  reason: invalid class name */
public final class AnonymousClass9UM extends C306386Ly implements C321026tS {
    public AnonymousClass6MO A00;
    public Integer A01;
    public final AnonymousClass6M4 A02;
    public final float A03;
    public final int A04;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass9UM(android.content.Context r5, com.instagram.common.session.UserSession r6, int r7) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            X.0Tu r3 = X.0Tu.A05
            r0 = 36326519857035062(0x810ec700013736, double:3.036375660519021E-306)
            boolean r2 = X.182.A06(r3, r6, r0)
            if (r2 == 0) goto L_0x0041
            android.content.Context r2 = r5.getApplicationContext()
        L_0x0015:
            r4.<init>(r2, r7)
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r4.A01 = r2
            r2 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r2 = r5.getColor(r2)
            r4.A04 = r2
            r2 = 1084227584(0x40a00000, float:5.0)
            float r2 = X.0nA.A00(r5, r2)
            r4.A03 = r2
            boolean r0 = X.182.A06(r3, r6, r0)
            if (r0 == 0) goto L_0x0037
            android.content.Context r5 = r5.getApplicationContext()
        L_0x0037:
            X.0qQ.A0A(r5)
            X.6M4 r0 = X.C321156tf.A00(r5, r4)
            r4.A02 = r0
            return
        L_0x0041:
            r2 = r5
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9UM.<init>(android.content.Context, com.instagram.common.session.UserSession, int):void");
    }

    public final /* synthetic */ void CLr() {
        C321156tf.A02(this);
    }

    public final void draw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        super.draw(canvas);
        this.A02.draw(canvas);
    }

    public final AnonymousClass6M4 C49() {
        return this.A02;
    }

    public final /* synthetic */ boolean Cdq() {
        return false;
    }

    public final void FL9(boolean z, boolean z2) {
        StaticLayout staticLayout = this.A0G;
        if (staticLayout != null) {
            AnonymousClass6MO r1 = this.A00;
            if (r1 != null) {
                this.A0F.removeSpan(r1);
            }
            this.A00 = null;
            if (z) {
                float f = this.A00;
                float f2 = this.A01;
                Spannable spannable = this.A0F;
                0qQ.A07(spannable);
                if (C358948bj.A00(spannable, 0, spannable.length()) != C306576Mr.DISABLED) {
                    float f3 = this.A03;
                    f += f3;
                    f2 += f3;
                }
                int i = this.A04;
                float textSize = this.A0b.getTextSize() / 4.0f;
                AnonymousClass6MO r3 = new AnonymousClass6MO(C306496Mj.A02(staticLayout, f, f2, f2, textSize, 1.0f), textSize, i);
                this.A00 = r3;
                Spannable spannable2 = this.A0F;
                spannable2.setSpan(r3, 0, spannable2.length(), 16711698);
            }
            AnonymousClass6M4 r0 = this.A02;
            if (z2) {
                r0.A01();
            } else {
                r0.A00();
            }
            invalidateSelf();
        }
    }

    public final /* synthetic */ boolean CZ7(UserSession userSession) {
        return true;
    }
}
