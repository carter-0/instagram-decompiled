package X;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.facebook.smartcapture.components.ContourView;
import com.facebook.smartcapture.docauth.CaptureState;
import com.facebook.smartcapture.docauth.DocumentType;
import com.facebook.smartcapture.view.IdCaptureActivity;

/* renamed from: X.TIk  reason: case insensitive filesystem */
public final class C13028TIk implements Runnable {
    public final /* synthetic */ DocumentType A00;
    public final /* synthetic */ C12166SoH A01;
    public final /* synthetic */ boolean A02;

    public C13028TIk(DocumentType documentType, C12166SoH soH, boolean z) {
        this.A01 = soH;
        this.A00 = documentType;
        this.A02 = z;
    }

    /* JADX WARNING: type inference failed for: r5v2, types: [android.content.Context, com.facebook.smartcapture.view.IdCaptureActivity] */
    public final void run() {
        C12166SoH soH = this.A01;
        C13777Tgs tgs = (C13777Tgs) soH.A0K.get();
        if (tgs != null) {
            ? r5 = (IdCaptureActivity) tgs;
            float f = AnonymousClass7TF.A0E(r5).density;
            DocumentType documentType = this.A00;
            FrameLayout frameLayout = r5.A01;
            0qQ.A0A(frameLayout);
            int width = frameLayout.getWidth();
            FrameLayout frameLayout2 = r5.A01;
            0qQ.A0A(frameLayout2);
            int height = frameLayout2.getHeight();
            0qQ.A0B(documentType, 1);
            Rect A0A = Pxk.A0A(documentType, f, width, height);
            CaptureState captureState = soH.A04;
            boolean z = this.A02;
            C7915Qcm qcm = r5.A04;
            0qQ.A0A(qcm);
            ContourView contourView = ((C7913Qcj) qcm).A0A;
            0qQ.A0A(contourView);
            contourView.post(new C13053TJj(A0A, contourView, captureState, z));
        }
    }
}
