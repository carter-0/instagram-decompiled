package X;

import android.graphics.Bitmap;
import android.graphics.Path;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import java.io.File;

public final class K4N extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PotatoPostCaptureFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02 = "potato_post_capture_fragment";

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 6), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(K4N k4n, MQK mqk) {
        Bitmap.CompressFormat compressFormat;
        long j;
        K4N k4n2 = k4n;
        if (mqk instanceof C65028Lm7) {
            if (((C65028Lm7) mqk).A00) {
                j = 100;
                JTT.A16(k4n);
            } else {
                j = 0;
            }
            k4n.requireView().postDelayed(new C65870M2l(k4n), j);
        } else if (mqk instanceof C65029Lm8) {
            C65029Lm8 lm8 = (C65029Lm8) mqk;
            Bitmap bitmap = lm8.A00;
            Path path = lm8.A01;
            String str = lm8.A02;
            String str2 = lm8.A03;
            int dimensionPixelSize = DbV.A05(k4n2).getDimensionPixelSize(R.dimen.canvas_text_view_input_background_width);
            Bitmap A0D = 1MF.A0D(new C59978Jcn(bitmap, path, dimensionPixelSize, dimensionPixelSize));
            0qQ.A07(A0D);
            File A04 = 0mb.A04(k4n2.requireContext());
            if (Build.VERSION.SDK_INT >= 30) {
                compressFormat = Bitmap.CompressFormat.WEBP_LOSSY;
            } else {
                compressFormat = Bitmap.CompressFormat.PNG;
            }
            1MF.A0L(compressFormat, A0D, A04, 100);
            0qQ.A0A(A04);
            0qQ.A0B(A04, 0);
            C63205KtC.A00(k4n2.requireContext(), k4n2, C282665Eg.A03(A04, 1, 0), AnonymousClass7TE.A0l(k4n2.A00), str, str2);
            DbT.A1K(k4n2);
        } else if (mqk instanceof C65030Lm9) {
            0nA.A0N(k4n.requireView());
            0lg A0X = DbT.A0X(k4n.A00);
            FragmentActivity requireActivity = k4n.requireActivity();
            0qQ.A0B(A0X, 0);
            DbW.A0T(A0X).A02(requireActivity, new K41());
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public K4N() {
        C66295MMe mMe = new C66295MMe(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C66295MMe(new MMU(this, 49), 0));
        this.A01 = DbS.A0I(new C66295MMe(A002, 1), mMe, new MJ9(39, (Object) null, A002), DbS.A0z(C60199JhI.class));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1197967906);
        ComposeView A0H = DbV.A0H(this, new C59112J6u(this, 27), -1567867171);
        AnonymousClass0fD.A09(1836161738, A022);
        return A0H;
    }
}
