package X;

import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;

/* renamed from: X.Lpf  reason: case insensitive filesystem */
public final class C65235Lpf implements MSD {
    public final int A00;
    public final Object A01;

    public C65235Lpf(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Dof(String str, int i, int i2) {
        int i3 = this.A00;
        0qQ.A0B(str, 0);
        switch (i3) {
            case 0:
                ClipsCoverPhotoPickerController clipsCoverPhotoPickerController = (ClipsCoverPhotoPickerController) this.A01;
                AnonymousClass3Q2 r0 = clipsCoverPhotoPickerController.A0C;
                if (r0 != null) {
                    r0.A33 = str;
                }
                clipsCoverPhotoPickerController.A0A.A02(str);
                return;
            case 1:
                IGTVUploadViewModel A0k = JTO.A0k(((C61424K6y) this.A01).A0G);
                A0k.ET0(str);
                A0k.ET6(i);
                A0k.ET3(i2);
                return;
            default:
                11Z.A02(new C65994M7f((C61942KSr) this.A01, str));
                return;
        }
    }
}
