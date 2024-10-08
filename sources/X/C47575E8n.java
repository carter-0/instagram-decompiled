package X;

import android.content.Context;
import java.util.Set;

/* renamed from: X.E8n  reason: case insensitive filesystem */
public final class C47575E8n extends C331047Ph {
    public final F3A A00;
    public final F3A A01;
    public final F3A A02;
    public final Set A03 = AnonymousClass7TE.A1F();
    public final Context A04;
    public final C47590E9c A05;
    public final E9P A06;
    public final C47625EAl A07;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.E9P, X.2rz, java.lang.Object] */
    public C47575E8n(Context context, E3c e3c, E3c e3c2) {
        0qQ.A0B(context, 3);
        this.A04 = context;
        C47590E9c e9c = new C47590E9c(e3c);
        this.A05 = e9c;
        ? obj = new Object();
        obj.A00 = e3c2;
        this.A06 = obj;
        C47625EAl eAl = new C47625EAl(context);
        this.A07 = eAl;
        A0A(AnonymousClass7TE.A1D(0sr.A1P(new C231632rz[]{e9c, obj, eAl})));
        String A16 = AnonymousClass7TE.A16(context, 2131972255);
        String A022 = SQU.A02(context, C66579MXk.A00(35));
        0qQ.A07(A022);
        this.A02 = new F3A(A16, A022);
        String A162 = AnonymousClass7TE.A16(context, 2131972252);
        String A023 = SQU.A02(context, "https://help.instagram.com/519522125107875");
        0qQ.A07(A023);
        this.A01 = new F3A(A162, A023);
        this.A00 = new F3A(AnonymousClass7TE.A16(context, 2131972254), "https://help.instagram.com/626057554667531");
    }

    public final void A0C() {
        A06();
        String string = this.A04.getString(2131952539);
        Set set = this.A03;
        A09(this.A05, string, Boolean.valueOf(AnonymousClass7TF.A1S(set.size(), 3)));
        A08(this.A07, C46568DhA.FULL_WIDTH);
        F3A f3a = this.A02;
        Boolean valueOf = Boolean.valueOf(set.contains(f3a));
        E9P e9p = this.A06;
        A09(e9p, f3a, valueOf);
        F3A f3a2 = this.A01;
        A09(e9p, f3a2, Boolean.valueOf(set.contains(f3a2)));
        F3A f3a3 = this.A00;
        A09(e9p, f3a3, Boolean.valueOf(set.contains(f3a3)));
        A07();
    }
}
