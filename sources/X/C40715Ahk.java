package X;

import android.os.Bundle;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ahk  reason: case insensitive filesystem */
public final class C40715Ahk implements B38 {
    public final List A00 = AnonymousClass7TE.A1C();

    public final void A00(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList<Object> A1C2 = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GalleryPickerServiceContent galleryPickerServiceContent = (GalleryPickerServiceContent) it.next();
            A0q.add(galleryPickerServiceContent.mFilePath);
            AnonymousClass7TF.A1M(A1C, galleryPickerServiceContent.mOrientation);
            A1C2.add(Boolean.valueOf(galleryPickerServiceContent.mIsPhoto));
        }
        if (list.size() == A0q.size() && list.size() == A1C.size() && list.size() == A1C2.size()) {
            0eP A0x = AnonymousClass7TF.A0x("serviceType", 29);
            0eP A0J = AnonymousClass7TH.A0J(AnonymousClass05K.A00);
            0eP A1L = AnonymousClass7TE.A1L("filePaths", A0q);
            0eP A1L2 = AnonymousClass7TE.A1L("orientations", A1C);
            boolean[] zArr = new boolean[A1C2.size()];
            int i = 0;
            for (Object A1a : A1C2) {
                zArr[i] = AnonymousClass7TE.A1a(A1a);
                i++;
            }
            this.A00.add(Q21.A00(A0x, A0J, A1L, A1L2, AnonymousClass7TE.A1L("isPhotoBooleans", zArr)));
            return;
        }
        0KC.A0C("GalleryPickerService", "Error retrieving gallery content: mismatching sizes");
    }

    public final void FKT(Bundle bundle) {
    }

    public final Bundle BH4() {
        return AnonymousClass7TH.A05(29);
    }

    public final void CMw(C371698yt r3) {
        GalleryPickerServiceConfiguration galleryPickerServiceConfiguration;
        GalleryPickerServiceDataSource galleryPickerServiceDataSource;
        if (r3 != null) {
            C371628yi r1 = GalleryPickerServiceConfiguration.A01;
            if (C371698yt.A01(r3, r1) && (galleryPickerServiceConfiguration = (GalleryPickerServiceConfiguration) r3.A02(r1)) != null && (galleryPickerServiceDataSource = galleryPickerServiceConfiguration.A00) != null) {
                galleryPickerServiceDataSource.setGalleryPickerContentListener(this);
            }
        }
    }

    public final List EzR() {
        List list = this.A00;
        List A0a = 00k.A0a(list);
        list.clear();
        return A0a;
    }
}
