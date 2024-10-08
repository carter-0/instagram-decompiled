package X;

import android.text.TextUtils;
import android.text.method.MovementMethod;
import com.instagram.android.R;

/* renamed from: X.Gsi  reason: case insensitive filesystem */
public final class C53691Gsi extends C251343mx {
    public final 2WX A00;
    public final C247213fx A01;
    public final String A02;

    public C53691Gsi(2WX r2, C247213fx r3, String str) {
        0qQ.A0B(r3, 2);
        this.A02 = str;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        AnonymousClass3Y5 r6 = r27;
        0qQ.A0B(r6, 0);
        2WX r5 = this.A00;
        2Wb A0S = AnonymousClass7TG.A0S(r6.A05);
        String str = this.A02;
        long A04 = C244013aV.A04(A0S);
        int A022 = C244013aV.A02(A0S, R.color.design_dark_default_color_on_background);
        AnonymousClass3XV r0 = 2WX.A02;
        C247213fx r3 = this.A01;
        2WX A0Y = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A00, new C244233ar(C56952IIw.A00, r3), 2);
        long A06 = C244013aV.A06(A0S);
        2WX A0Q = C51973G9u.A0Q(A0Y, C51967G9n.A0S(0, A06), 0, C244013aV.A0C(A0S, R.dimen.accent_edge_thickness));
        Integer valueOf = Integer.valueOf(A022);
        2Wd A0e = C51965G9l.A0e(A04);
        Integer valueOf2 = Integer.valueOf(R.drawable.caption_background);
        return C51967G9n.A0Q(new C244473bF((TextUtils.TruncateAt) null, (MovementMethod) null, A0Q, A0e, C244473bF.A0C, AnonymousClass7TE.A0v(), str, (Float) null, valueOf, (Integer) null, valueOf2, 17), A0S, r6, r5);
    }
}
