package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.modal.ModalActivity;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.JdP  reason: case insensitive filesystem */
public final class C60016JdP extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C60016JdP(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        FragmentActivity fragmentActivity;
        String str;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                0qQ.A0A(context);
                IgBloksScreenConfig A0N = DbS.A0N(((JYV) this.A02).A00);
                String A002 = C66579MXk.A00(275);
                A0N.A0R = A002;
                A0N.A0S = A002;
                A0N.A0l = true;
                A0N.A0U = context.getString(2131953748);
                HashMap A1E = AnonymousClass7TE.A1E();
                HashMap A1E2 = AnonymousClass7TE.A1E();
                HashMap A1E3 = AnonymousClass7TE.A1E();
                BitSet bitSet = new BitSet(1);
                A1E.put("entrypoint", "partnerships_inbox");
                bitSet.set(0);
                if (bitSet.nextClearBit(0) >= 1) {
                    C46649DiU A06 = C46649DiU.A06(A002, C359608dC.A01(A1E), A1E2);
                    C46649DiU.A0B(A06, 719983200);
                    A06.A03 = null;
                    A06.A02 = null;
                    A06.A04 = null;
                    A06.A0H(A1E3);
                    A06.A0D(context, A0N);
                    return;
                }
                throw AnonymousClass7TE.A0z(AnonymousClass000.A00(457));
            case 1:
                K7b k7b = (K7b) this.A02;
                String A0q = DbS.A0q(this.A01);
                AnonymousClass0eM r0 = k7b.A0G;
                Bundle A012 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r0), C46474Dfc.A01(AnonymousClass7TE.A0l(r0), A0q, "music_pick_reels_bottom_sheet", k7b.A09));
                DbU.A1K(k7b, DbS.A0b(k7b.requireActivity(), A012, DbT.A0X(r0), ModalActivity.class, "profile"));
                return;
            case 2:
                fragmentActivity = DbT.A0E(this.A02);
                str = ((C61120JxW) ((MWR) this.A01)).A01;
                if (str == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            case 3:
                C61427K7c k7c = (C61427K7c) this.A02;
                C61427K7c.A02(k7c, DbS.A0q(this.A01));
                LN4.A00((LN4) k7c.A0C.getValue(), AnonymousClass000.A00(2664), (String) null);
                return;
            case 4:
                fragmentActivity = DbT.A0E(this.A02);
                str = ((C61120JxW) this.A01).A01;
                if (str == null) {
                    throw AnonymousClass7TE.A0y();
                }
                break;
            default:
                ((C67745Mty) this.A02).A03.A00.FIA(new C61249Jzh((C255773uh) this.A01, AnonymousClass05K.A00));
                return;
        }
        FH7.A03(fragmentActivity, str);
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(textPaint, 0);
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 5:
                DbW.A0u(textPaint);
                textPaint.setColor(-1);
                return;
            default:
                0qQ.A0B(textPaint, 0);
                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                return;
        }
    }
}
