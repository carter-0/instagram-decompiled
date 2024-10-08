package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView;

/* renamed from: X.9jU  reason: invalid class name and case insensitive filesystem */
public final class C385759jU extends 2Cn {
    public final /* synthetic */ AnonymousClass8BI A00;

    public C385759jU(AnonymousClass8BI r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        View requireViewById;
        C349307zv r9 = (C349307zv) obj;
        AnonymousClass8BA r5 = this.A00.A00;
        WUW wuw = (WUW) r5.A1Y.get();
        AnonymousClass80U r3 = wuw.A0F;
        C3493580b r1 = wuw.A0H;
        AnonymousClass80T r2 = (AnonymousClass80T) r3;
        0qQ.A0B(r1, 0);
        if (!r2.A02.A02.contains(r1)) {
            r3.A7z(r1);
        }
        C3493580b r12 = wuw.A0G;
        0qQ.A0B(r12, 0);
        if (!r2.A01.A02.contains(r12)) {
            r3.A7w(r12);
        }
        ViewStub viewStub = wuw.A08;
        if (viewStub == null || viewStub.getParent() == null) {
            requireViewById = wuw.A07.requireViewById(R.id.boomerang_trimmer);
            0qQ.A0A(requireViewById);
        } else {
            requireViewById = viewStub.inflate();
            0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.ui.widget.filmstriptimeline.FilmstripTimelineView");
        }
        FilmstripTimelineView filmstripTimelineView = (FilmstripTimelineView) requireViewById;
        wuw.A05 = filmstripTimelineView;
        if (filmstripTimelineView != null) {
            filmstripTimelineView.setShowSeekbar(false);
            FilmstripTimelineView filmstripTimelineView2 = wuw.A05;
            if (filmstripTimelineView2 != null) {
                filmstripTimelineView2.A00 = wuw.A0D;
                TargetViewSizeProvider targetViewSizeProvider = wuw.A0B;
                if (targetViewSizeProvider.CTv()) {
                    0nA.A0p(filmstripTimelineView2, new C41012Amw(filmstripTimelineView2, targetViewSizeProvider));
                }
                Context context = wuw.A06;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.album_preview_add_item_margin);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_title_text_horizontal_padding);
                FilmstripTimelineView filmstripTimelineView3 = wuw.A05;
                if (filmstripTimelineView3 != null) {
                    filmstripTimelineView3.A02(wuw.A0I, dimensionPixelSize, dimensionPixelSize2);
                    wuw.A04 = (FrameLayout) wuw.A07.requireViewById(R.id.gl_frame_preview_container);
                    r9.A1I = true;
                    r9.A13 = true;
                    r9.A1H = false;
                    r5.A1M.E3H(new AnonymousClass8SQ(r9));
                    return;
                }
            }
        }
        0qQ.A0F("trimmerTimelineView");
        throw AnonymousClass00P.createAndThrow();
    }
}
