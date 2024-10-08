package X;

import android.view.View;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceContent;
import com.facebook.cameracore.mediapipeline.services.gallerypicker.GalleryPickerServiceDataSource;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.81o  reason: invalid class name and case insensitive filesystem */
public final class C3497481o implements GalleryPickerServiceDataSource {
    public boolean A00;
    public C40715Ahk A01;
    public AnonymousClass9YT A02;
    public final List A03 = new ArrayList();

    public final synchronized void A00() {
        if (!this.A00) {
            this.A03.clear();
        }
        AnonymousClass9YT r2 = this.A02;
        if (r2 != null) {
            AnonymousClass8AN r1 = r2.A03;
            View view = r2.A00;
            r1.DBT(view);
            r2.A02.setText(view.getContext().getString(2131952307));
        }
        C40715Ahk ahk = this.A01;
        if (ahk != null) {
            ahk.A00(this.A03);
        }
    }

    public final synchronized void A01(int i, String str, boolean z) {
        List list = this.A03;
        list.clear();
        list.add(new GalleryPickerServiceContent(i, str, z));
        AnonymousClass9YT r0 = this.A02;
        if (r0 != null) {
            r0.A00();
        }
        C40715Ahk ahk = this.A01;
        if (ahk != null) {
            ahk.A00(list);
        }
    }

    public final synchronized List getContent() {
        return this.A03;
    }

    public final void setGalleryPickerContentListener(C40715Ahk ahk) {
        this.A01 = ahk;
        if (ahk != null) {
            ahk.A00(this.A03);
        }
    }

    public final void setGalleryPickerServiceListener(AnonymousClass9YT r2) {
        this.A02 = r2;
        if (!this.A03.isEmpty() && r2 != null) {
            r2.A00();
        }
    }
}
