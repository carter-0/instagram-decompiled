package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

public final class K7A extends AnonymousClass4DH implements MU3 {
    public static final String __redex_internal_original_name = "GalleryImportOAFragment";
    public C3514789a A00;
    public AnonymousClass88V A01;
    public C64712Lgl A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "gallery_import_oa_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean isScrolledToBottom() {
        boolean z;
        C64712Lgl lgl = this.A02;
        if (lgl == null) {
            0qQ.A0F("galleryImportOAController");
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView = lgl.A00;
        if (recyclerView != null) {
            z = recyclerView.canScrollVertically(1);
        } else {
            z = false;
        }
        return !z;
    }

    public final boolean isScrolledToTop() {
        boolean z;
        C64712Lgl lgl = this.A02;
        if (lgl == null) {
            0qQ.A0F("galleryImportOAController");
            throw AnonymousClass00P.createAndThrow();
        }
        RecyclerView recyclerView = lgl.A00;
        if (recyclerView != null) {
            z = JTP.A1Y(recyclerView);
        } else {
            z = false;
        }
        return !z;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.2YM] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-857039125);
        K7A.super.onCreate(bundle);
        this.A02 = new C64712Lgl(this, AnonymousClass7TE.A0l(this.A03), this);
        FragmentActivity requireActivity = requireActivity();
        String A002 = AnonymousClass000.A00(177);
        0qQ.A0C(requireActivity, A002);
        this.A01 = JTO.A0L(new Object(), requireActivity).A00(AnonymousClass88V.class);
        FragmentActivity requireActivity2 = requireActivity();
        0qQ.A0C(requireActivity2, A002);
        this.A00 = JTO.A0L(new Object(), requireActivity2).A00(C3514789a.class);
        C64712Lgl lgl = this.A02;
        if (lgl == null) {
            0qQ.A0F("galleryImportOAController");
            throw AnonymousClass00P.createAndThrow();
        }
        registerLifecycleListener(lgl);
        AnonymousClass0fD.A09(839478858, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1439622940);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.gallery_grid, false);
        AnonymousClass0fD.A09(-802992671, A022);
        return A0D;
    }
}
