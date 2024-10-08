package X;

import android.view.ViewGroup;
import com.instagram.creation.base.ui.grid.GridLinesView;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.creation.photo.crop.CropHighlightView;

/* renamed from: X.81Q  reason: invalid class name */
public final /* synthetic */ class AnonymousClass81Q implements C3495480u {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ GridLinesView A01;
    public final /* synthetic */ AnonymousClass80R A02;
    public final /* synthetic */ CropHighlightView A03;

    public /* synthetic */ AnonymousClass81Q(ViewGroup viewGroup, GridLinesView gridLinesView, AnonymousClass80R r3, CropHighlightView cropHighlightView) {
        this.A02 = r3;
        this.A00 = viewGroup;
        this.A01 = gridLinesView;
        this.A03 = cropHighlightView;
    }

    public final void onChanged(Object obj) {
        CameraConfiguration cameraConfiguration = (CameraConfiguration) obj;
        AnonymousClass80R.A02(this.A00, this.A01, cameraConfiguration, this.A02, this.A03);
    }
}
