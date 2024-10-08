package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gallery.GalleryView;
import java.util.List;

public final class K6V extends AnonymousClass4DH implements AnonymousClass4DR, MUL {
    public static final String __redex_internal_original_name = "ReelPicsPleaseMediaGridFragment";
    public LPF A00;
    public MT1 A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);
    public final String A03 = "reel_pics_please_media_grid_fragment";

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.K6V, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        UserSession A0l = AnonymousClass7TE.A0l(this.A02);
        View A0G = AnonymousClass7TF.A0G(view2, R.id.gallery);
        C63957LFd lFd = new C63957LFd(10, (String) null, (String) null, (String) null, (String) null, AnonymousClass7TE.A16(view2.getContext(), 2131965943), (List) null, 0.5625f, 10, false, false, false, false, false, false, true, false);
        LPF lpf = new LPF(A0G, AnonymousClass07i.A00(this), AnonymousClass8XO.PHOTO_AND_VIDEO, A0l, (2Cn) null, (MVI) null, lFd, (Boolean) null, 3, 0, false, false, false);
        lpf.A02 = this.A01;
        this.A00 = lpf;
        DbX.A1B(view2, R.id.media_picker_tab_header);
    }

    public final boolean CPd() {
        LPF lpf = this.A00;
        boolean z = false;
        if (lpf != null) {
            GalleryView galleryView = lpf.A03;
            if (galleryView == null) {
                0qQ.A0F("galleryView");
                throw AnonymousClass00P.createAndThrow();
            }
            C361778gm r0 = galleryView.A0B;
            if (r0 != null && r0.A04) {
                z = true;
            }
        }
        return !z;
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final boolean isScrolledToTop() {
        LPF lpf = this.A00;
        if (lpf != null) {
            return lpf.A05();
        }
        return false;
    }

    public final boolean onBackPressed() {
        LPF lpf = this.A00;
        if (lpf != null) {
            return lpf.A06();
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-50791954);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_media_picker_photos, viewGroup, false);
        AnonymousClass0fD.A09(-668194199, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(487131453);
        K6V.super.onPause();
        LPF lpf = this.A00;
        if (lpf != null) {
            lpf.A02();
        }
        AnonymousClass0fD.A09(351158886, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2113476584);
        super.onResume();
        LPF lpf = this.A00;
        if (lpf != null) {
            lpf.A03();
        }
        AnonymousClass0fD.A09(-1678523475, A022);
    }
}
