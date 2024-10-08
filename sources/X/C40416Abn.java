package X;

import android.content.Context;
import android.text.Editable;
import android.text.TextPaint;
import android.widget.TextView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.Abn  reason: case insensitive filesystem */
public final class C40416Abn implements C358378ao {
    public final /* synthetic */ C353798Jc A00;

    public final boolean CQC() {
        return false;
    }

    public final boolean CTU() {
        return false;
    }

    public C40416Abn(C353798Jc r1) {
        this.A00 = r1;
    }

    public final int C5G() {
        ConstrainedEditText constrainedEditText = this.A00.A0D;
        constrainedEditText.getClass();
        return constrainedEditText.length();
    }

    public final boolean Ccc() {
        return 182.A06(0Tu.A05, this.A00.A0U, 36323139719343002L);
    }

    public final void Dr2(C358868bb r8, Integer num) {
        C353798Jc r6 = this.A00;
        1Au.A00(r6.A0U).A0y(r8.A09);
        AIY aiy = r6.A0B;
        aiy.getClass();
        aiy.A04((BackgroundGradientColors) null, r8);
        AnonymousClass91a r1 = r6.A08;
        r1.getClass();
        r1.A00(r8.A07);
        C306386Ly r4 = r6.A0F;
        if (r4 != null) {
            Context context = r6.A0P;
            0qQ.A0B(context, 2);
            Editable A002 = AEU.A00(r4.A0F);
            if (A002 != null) {
                TextPaint textPaint = r4.A0b;
                0qQ.A07(textPaint);
                AnonymousClass91S.A01(A002, r8, false);
                AnonymousClass91U.A02(context, A002, r8);
                AnonymousClass91W.A01(context, textPaint, A002, r8);
                AnonymousClass91Y.A00((TextView) null, r8, r4);
                AnonymousClass91Z.A00(A002, r8);
                r4.A0L(A002);
            }
            C306386Ly r0 = r6.A0F;
            r0.getClass();
            r0.A0R();
            C353798Jc.A01(r6.A0F, r6);
        }
        C353798Jc.A07(r6);
        C353798Jc.A08(r6);
        C353798Jc.A0A(r6);
        C353798Jc.A0B(r6);
        C353798Jc.A0C(r6);
        C353798Jc.A0D(r6);
        C353798Jc.A0E(r6);
        C353798Jc.A0F(r6);
        C353798Jc.A0G(r6);
    }
}
