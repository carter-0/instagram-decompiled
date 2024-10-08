package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.user.model.User;

/* renamed from: X.8c7  reason: invalid class name and case insensitive filesystem */
public final class C359168c7 implements C2365734g {
    public final /* synthetic */ C358338ak A00;

    public C359168c7(C358338ak r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0A(view);
        0eE r2 = AnonymousClass0t1.A01;
        C358338ak r1 = this.A00;
        User A01 = r2.A01(r1.A02);
        AnonymousClass0iw r3 = r1.A01;
        0qQ.A0B(view, 0);
        IgImageView requireViewById = view.requireViewById(R.id.alignment_header_profile_picture);
        0qQ.A07(requireViewById);
        requireViewById.setUrl(A01.Bh3(), r3);
        View requireViewById2 = view.requireViewById(R.id.alignment_header_title);
        0qQ.A07(requireViewById2);
        ((TextView) requireViewById2).setText(A01.getUsername());
        View requireViewById3 = view.requireViewById(R.id.reel_viewer_progress_bar);
        0qQ.A07(requireViewById3);
        SegmentedProgressBar segmentedProgressBar = (SegmentedProgressBar) requireViewById3;
        segmentedProgressBar.setProgress(0.0f);
        segmentedProgressBar.setSegments(1);
    }
}
