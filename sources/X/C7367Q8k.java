package X;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import com.facebook.smartcapture.view.IdCaptureActivity;
import com.instagram.android.R;

/* renamed from: X.Q8k  reason: case insensitive filesystem */
public final class C7367Q8k extends ViewOutlineProvider {
    public final /* synthetic */ FrameLayout A00;
    public final /* synthetic */ IdCaptureActivity A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.content.Context, com.facebook.smartcapture.view.IdCaptureActivity] */
    public final void getOutline(View view, Outline outline) {
        boolean A1U = AnonymousClass7TF.A1U(0, view, outline);
        TypedValue typedValue = new TypedValue();
        this.A01.getTheme().resolveAttribute(R.attr.sc_capture_camera_corner_radius, typedValue, A1U);
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) TypedValue.complexToDimensionPixelSize(typedValue.data, AnonymousClass7TF.A0E(this.A00.getContext())));
    }

    public C7367Q8k(FrameLayout frameLayout, IdCaptureActivity idCaptureActivity) {
        this.A01 = idCaptureActivity;
        this.A00 = frameLayout;
    }
}
