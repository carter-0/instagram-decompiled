package X;

import android.os.Bundle;
import com.instagram.android.R;
import java.util.Collection;

public final class NVN extends C68494NKn {
    public static final String __redex_internal_original_name = "ChannelDiscoverySuggestionsFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final C74446Pv1 A02 = new P17(this);
    public final O6K A03 = new O6K(this);
    public final OJT A04 = new OJT(this);
    public final C74433Pun A05 = new PRG(this);

    /* JADX WARNING: type inference failed for: r13v0, types: [X.2tF, java.lang.Object] */
    public final Collection getDefinitions() {
        AnonymousClass0eM r2 = this.A05;
        return 0sr.A1P(new C232232tF[]{new C68624NPu(this, AnonymousClass7TE.A0l(r2), this.A03), new NQ4(requireContext(), this, AnonymousClass7TE.A0l(r2), this.A02, true), new C68618NPo(requireContext(), this.A04), new C67176MjY(AnonymousClass7TE.A0l(r2), this.A05), new Object(), new C66610MYw(this.A02, R.layout.direct_empty_view)});
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public NVN() {
        0eO r3 = 0eO.A02;
        this.A00 = AnonymousClass0eN.A00(r3, new C46570DhC(this, 2));
        C46570DhC dhC = new C46570DhC(this, 6);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C46570DhC(new C46570DhC(this, 3), 4));
        this.A01 = DbS.A0I(new C46570DhC(A002, 5), dhC, C73915Plq.A00(A002, (Object) null, 20), DbS.A0z(NVR.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1276507570);
        NVN.super.onCreate(bundle);
        AnonymousClass0fD.A09(-2061139010, A022);
    }
}
