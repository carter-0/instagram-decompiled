package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.Vv1  reason: case insensitive filesystem */
public class C18608Vv1 {
    public static final Uri A05 = Uri.parse("https://www.facebook.com/maps/report/?");
    public final Context A00;
    public final VL9 A01;
    public final X2D A02;
    public final CharSequence A03;
    public final CharSequence A04;

    public final Dialog A00(Dialog dialog) {
        U2H u2h = new U2H(0, dialog, this);
        U2F u2f = new U2F(this, 0);
        U2F u2f2 = new U2F(this, 1);
        Context context = this.A00;
        String string = context.getResources().getString(2131965863);
        String string2 = context.getResources().getString(2131965861);
        String string3 = context.getResources().getString(2131969045);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(u2h, 0, Pxj.A0C(string), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
        spannableStringBuilder2.setSpan(u2f, 0, Pxj.A0C(string2), 33);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(string3);
        spannableStringBuilder3.setSpan(u2f2, 0, Pxj.A0C(string3), 33);
        SpannableStringBuilder append = spannableStringBuilder.append("\n").append(spannableStringBuilder2).append("\n").append(spannableStringBuilder3);
        C20993X8p AKw = this.A02.AKw();
        AKw.Eok(context.getResources().getString(2131965860));
        AKw.EdL(append);
        AKw.EgC((DialogInterface.OnClickListener) null, context.getResources().getString(17039370));
        Dialog AKr = AKw.AKr();
        AnonymousClass0fN.A00(AKr);
        C16706V2p.A00 = AKr;
        return AKr;
    }

    public final void A01(Context context, Uri uri) {
        if (this instanceof UH1) {
            if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
                C20993X8p AKw = this.A02.AKw();
                AKw.EdL(this.A03);
                AKw.EgC(new C18833W4v(0, this, uri), this.A04);
                AKw.Ee4((DialogInterface.OnClickListener) null, this.A00.getResources().getString(17039360));
                Dialog AKr = AKw.AKr();
                AKr.setOnCancelListener(new FHX(0, uri, this));
                A00(AKr);
            }
        } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            C20993X8p AKw2 = this.A02.AKw();
            AKw2.EdL(this.A03);
            AKw2.EgC(new C18833W4v(0, this, uri), this.A04);
            Dialog AKr2 = AKw2.AKr();
            AKr2.setOnCancelListener(new FHX(0, uri, this));
            TextView textView = (TextView) A00(AKr2).findViewById(16908299);
            if (textView != null) {
                DbT.A1H(textView);
                textView.setLineSpacing(0.0f, 1.4f);
            }
        }
    }

    public C18608Vv1(Context context, X2D x2d, CharSequence charSequence, CharSequence charSequence2) {
        this.A00 = context;
        this.A04 = charSequence;
        this.A03 = charSequence2;
        this.A02 = x2d == null ? new WFM(context) : x2d;
        this.A01 = new VL9(this);
    }
}
