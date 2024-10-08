package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: X.ELt  reason: case insensitive filesystem */
public final class C47899ELt extends C315486jy {
    public final /* bridge */ /* synthetic */ void ADq(C283255Gu r7, C284395Mi r8) {
        C369058tl r82 = (C369058tl) r8;
        AnonymousClass7TG.A1N(r82, r7);
        TextView textView = r82.A00;
        Context context = textView.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131969498);
        String A0c = DbY.A0c(context, A16, 2131969497);
        Uri A09 = DbT.A09("https://help.instagram.com/2937306082959298?helpref=uf_permalink");
        int color = context.getColor(r7.A02);
        SpannableStringBuilder A0C = DbS.A0C(A0c);
        AnonymousClass7AV.A05(A0C, new C46683DjC(A09, color), A16);
        textView.setText(A0C);
        textView.setTextColor(color);
        DbT.A1H(textView);
    }
}
