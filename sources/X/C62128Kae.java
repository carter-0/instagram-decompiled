package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import com.instagram.arlink.fragment.NametagController;
import java.util.ArrayList;

/* renamed from: X.Kae  reason: case insensitive filesystem */
public final class C62128Kae extends C47518E6c {
    public static final String __redex_internal_original_name = "DownloadOptionsBottomSheetFragment";
    public NametagController A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C51801G2k(this, 6));

    public final String getModuleName() {
        return "NametagDownloadOptionsBottomSheetFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        DbT.A16(view.getContext(), view, 2Yu.A02(getContext()));
        AnonymousClass0eM r5 = this.A02;
        1Av A0h = DbX.A0h(r5);
        this.A01 = AnonymousClass7TG.A1a(A0h, A0h.A1z, 1Av.A8a, 100);
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF fgf = new FGF(2131961017);
        fgf.A06 = true;
        fgf.A01 = R.style.igds_emphasized_title;
        A1C.add(fgf);
        DbV.A1W(A1C, true);
        LZJ.A01(this, A1C, 2, 2131961013, this.A01);
        A1C.add(new C50989Fmc(requireContext(), (View.OnClickListener) new LYC((Object) this, 41), 2131961016));
        if (182.A06(0Tu.A05, DbT.A0X(r5), 36314859023698776L)) {
            A1C.add(new C50989Fmc(requireContext(), (View.OnClickListener) new LYC((Object) this, 42), 2131961012));
        }
        setBottomSheetMenuItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(861535965);
        super.onCreate(bundle);
        AnonymousClass0fD.A09(2058053916, A022);
    }
}
