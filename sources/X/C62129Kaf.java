package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.Kaf  reason: case insensitive filesystem */
public final class C62129Kaf extends C47518E6c {
    public static final String __redex_internal_original_name = "BackgroundImageBottomSheetFragment";
    public KB6 A00;
    public boolean A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C51801G2k(this, 7));

    public final String getModuleName() {
        return "nametag_background_image_bottomsheet_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Context A0C = JTP.A0C(view, 0);
        DbT.A16(A0C, view, 2Yu.A02(getContext()));
        super.onViewCreated(view, bundle);
        ArrayList A1C = AnonymousClass7TE.A1C();
        FGF fgf = new FGF(2131953562);
        fgf.A06 = true;
        fgf.A01 = R.style.igds_emphasized_title;
        A1C.add(fgf);
        DbV.A1W(A1C, true);
        A1C.add(new C50989Fmc(A0C, (View.OnClickListener) new LYC((Object) this, 46), 2131953561));
        LZJ.A01(this, A1C, 3, 2131953560, this.A01);
        setBottomSheetMenuItems(A1C);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-664278837);
        super.onCreate(bundle);
        this.A01 = requireArguments().getBoolean("ARG_IS_BACKGROUND_IMAGE_BLURRED");
        AnonymousClass0fD.A09(-2066456124, A022);
    }
}
