package X;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.android.R;

public final class U2F extends ClickableSpan {
    public final int A00;
    public final Object A01;

    public U2F(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onClick(View view) {
        VL9 vl9;
        Intent intent;
        String str;
        Intent flags;
        Context context;
        switch (this.A00) {
            case 0:
                Dialog dialog = C16706V2p.A00;
                if (dialog != null) {
                    dialog.dismiss();
                }
                vl9 = ((C18608Vv1) this.A01).A01;
                intent = new Intent("android.intent.action.VIEW");
                str = "https://www.facebook.com/maps/attribution_terms/";
                break;
            case 1:
                Dialog dialog2 = C16706V2p.A00;
                if (dialog2 != null) {
                    dialog2.dismiss();
                }
                vl9 = ((C18608Vv1) this.A01).A01;
                intent = new Intent("android.intent.action.VIEW");
                str = "https://www.openstreetmap.org/copyright/";
                break;
            default:
                flags = new Intent(Pxd.A00(31));
                context = (Context) this.A01;
                flags.setData(0cp.A03(002.A0R("package:", context.getPackageName())));
                break;
        }
        flags = intent.setData(Uri.parse(str)).setFlags(268435456);
        context = vl9.A00.A00;
        context.startActivity(flags);
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        if (2 - this.A00 != 0) {
            AnonymousClass7TE.A1N(((C18608Vv1) this.A01).A00, textPaint, R.color.info_dialog_link_color);
            z = false;
        } else {
            z = false;
            0qQ.A0B(textPaint, 0);
            super.updateDrawState(textPaint);
        }
        textPaint.setUnderlineText(z);
    }
}
