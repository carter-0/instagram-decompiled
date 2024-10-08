package X;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import com.instagram.igds.components.dialog.promo.IgdsPrismPromoDialog;
import java.util.List;

public final class F3t {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnDismissListener A01;
    public C51907G7b A02;
    public CharSequence A03 = "";
    public CharSequence A04 = "";
    public Integer A05;
    public String A06 = "";
    public String A07;
    public List A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public DialogInterface.OnClickListener A0C;
    public String A0D;
    public final Context A0E;

    public F3t(Context context) {
        0qQ.A0B(context, 1);
        this.A0E = context;
        this.A0D = AnonymousClass7TE.A16(context, 2131968772);
        this.A05 = AnonymousClass05K.A00;
        this.A0A = true;
    }

    public final void A02(DialogInterface.OnClickListener onClickListener, String str) {
        0qQ.A0B(str, 0);
        this.A0D = str;
        this.A0C = onClickListener;
    }

    public final void A03(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        this.A02 = new C50493Fcf(drawable);
    }

    public final void A04(CharSequence charSequence) {
        0qQ.A0B(charSequence, 0);
        this.A04 = charSequence;
    }

    public final void A05(String str) {
        0qQ.A0B(str, 0);
        this.A06 = str;
    }

    public final Dialog A00() {
        Context context = this.A0E;
        String str = this.A06;
        boolean z = this.A0B;
        CharSequence charSequence = this.A04;
        List list = this.A08;
        CharSequence charSequence2 = this.A03;
        String str2 = this.A0D;
        DialogInterface.OnClickListener onClickListener = this.A0C;
        String str3 = this.A07;
        DialogInterface.OnClickListener onClickListener2 = this.A00;
        C51907G7b g7b = this.A02;
        if (g7b != null) {
            return new IgdsPrismPromoDialog(context, onClickListener, onClickListener2, this.A01, g7b, charSequence, charSequence2, this.A05, str, str2, str3, list, z, this.A09, this.A0A).A00;
        }
        throw DbU.A0h();
    }

    public final void A01() {
        AnonymousClass0fN.A00(A00());
    }
}
