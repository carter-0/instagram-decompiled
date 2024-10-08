package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.quicksnap.capture.viewmodel.QuickSnapArchiveViewModel;

/* renamed from: X.DpP  reason: case insensitive filesystem */
public final class C47033DpP extends C249703kE {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final AnonymousClass0iw A05;
    public final IgTextView A06;
    public final IgTextView A07;
    public final IgTextView A08;
    public final IgImageView A09;
    public final QuickSnapArchiveViewModel A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47033DpP(View view, AnonymousClass0iw r3, QuickSnapArchiveViewModel quickSnapArchiveViewModel) {
        super(view);
        AnonymousClass7TG.A1Q(r3, quickSnapArchiveViewModel);
        this.A05 = r3;
        this.A0A = quickSnapArchiveViewModel;
        this.A09 = AnonymousClass7TE.A0b(view, R.id.quick_snap_archive_item_image_view);
        this.A04 = AnonymousClass7TE.A0b(view, R.id.quick_snap_archive_item_reaction_container);
        this.A06 = Dba.A0E(view, R.id.quick_snap_archive_item_reaction_emoji);
        this.A08 = Dba.A0E(view, R.id.quick_snap_archive_item_reaction_count);
        this.A02 = AnonymousClass7TE.A0b(view, R.id.quick_snap_archive_item_overlay);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.quick_snap_archive_item_progress);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.quick_snap_archive_item_error);
        this.A07 = Dba.A0E(view, R.id.quick_snap_archive_multi_select_indicator);
    }
}
