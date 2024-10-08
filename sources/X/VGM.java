package X;

import android.widget.TextView;

public abstract class VGM {
    public static final void A00(C14886UDo uDo, WSI wsi) {
        AnonymousClass0eM r5 = uDo.A03;
        TextView A0A = JTQ.A0A(r5);
        WSI wsi2 = wsi;
        C61073JwB jwB = wsi.A00;
        String str = jwB.A02;
        String str2 = str;
        if (str == null) {
            str2 = "";
        }
        Object invoke = wsi2.A01.A00.invoke();
        if (invoke == null) {
            invoke = jwB.A01;
        }
        String A06 = 0mp.A06("%s %s", new Object[]{invoke, str});
        int color = AnonymousClass7TH.A06(r5).getContext().getColor(2Yu.A06(AnonymousClass7TH.A06(r5).getContext()));
        AnonymousClass7AV.A07(new C15450Ud0(new 04x(16, (CharSequence) null), AnonymousClass05K.A01, wsi2, str, color, 2), A0A, str2, A06);
    }
}
