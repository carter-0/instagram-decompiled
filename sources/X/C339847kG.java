package X;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;

/* renamed from: X.7kG  reason: invalid class name and case insensitive filesystem */
public final class C339847kG extends C249703kE {
    public final View A00;
    public final ConstraintLayout A01;
    public final AnonymousClass3NM A02;
    public final C62320sa A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C339847kG(ConstraintLayout constraintLayout, C62320sa r5) {
        super(constraintLayout);
        0qQ.A0B(constraintLayout, 1);
        this.A01 = constraintLayout;
        this.A03 = r5;
        View requireViewById = constraintLayout.requireViewById(R.id.gallery_grid_camera_item_overlay);
        0qQ.A07(requireViewById);
        this.A00 = requireViewById;
        AnonymousClass3NG r1 = new AnonymousClass3NG(constraintLayout);
        r1.A0C = true;
        r1.A07 = true;
        r1.A02 = 0.92f;
        r1.A04 = new C339857kH(this);
        this.A02 = r1.A00();
        constraintLayout.setAccessibilityDelegate((View.AccessibilityDelegate) null);
        constraintLayout.setContentDescription(constraintLayout.getContext().getString(2131952036));
        2eS.A04(constraintLayout, AnonymousClass05K.A01);
    }
}
