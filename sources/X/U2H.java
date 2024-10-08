package X;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.user.model.User;

public final class U2H extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public U2H(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                Dialog dialog = C16706V2p.A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                AnonymousClass0fN.A00((Dialog) this.A02);
                return;
            case 1:
                C14788U8z u8z = (C14788U8z) ((C15299Ua6) this.A02).A0G.getValue();
                String valueOf = String.valueOf(((GSY) this.A01).A00);
                0qQ.A0B(valueOf, 0);
                WGU.A00(u8z.A08).A0F(C16678UzE.BOOST_PACKAGES, "payment_inline_footer_row");
                C14788U8z.A02(u8z, valueOf, "enter_billing_wizard_by_clicking_entry");
                return;
            case 2:
                C17924ViF viF = (C17924ViF) this.A02;
                viF.A02.A0F(viF.A01, "payment_inline_footer_row");
                viF.A05.A0A(String.valueOf(((GSY) this.A01).A00), "enter_billing_wizard_by_clicking_entry", viF.A00());
                return;
            case 3:
                ((Runnable) this.A02).run();
                return;
            default:
                VUA vua = ((C15370UbN) this.A02).A02;
                if (vua != null) {
                    User user = (User) this.A01;
                    C310236ae r3 = vua.A01;
                    if (!r3.A0C.A0A) {
                        UserSession userSession = r3.A09;
                        Bundle A012 = C46447Df9.A02().A01(userSession, C46474Dfc.A01(userSession, user.getId(), "countdown_sticker_creator", r3.A08.getModuleName()));
                        AnonymousClass6W8 r4 = new AnonymousClass6W8(r3.A07, A012, userSession, ModalActivity.class, "profile");
                        r4.A0J = ModalActivity.A08;
                        r4.A0C(r3.A06);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 0:
                AnonymousClass7TE.A1N(((C18608Vv1) this.A01).A00, textPaint, R.color.info_dialog_link_color);
                z = false;
                break;
            case 3:
                z = false;
                0qQ.A0B(textPaint, 0);
                Context context = (Context) this.A01;
                AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
                break;
            case 4:
                DbW.A0u(textPaint);
                textPaint.setFakeBoldText(true);
                return;
            default:
                z = false;
                0qQ.A0B(textPaint, 0);
                textPaint.setColor(textPaint.linkColor);
                textPaint.setFakeBoldText(true);
                break;
        }
        textPaint.setUnderlineText(z);
    }
}
