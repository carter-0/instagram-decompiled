package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;

/* renamed from: X.KHw  reason: case insensitive filesystem */
public final class C61688KHw extends C339867kI {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C60711Jpw A02;
    public final /* synthetic */ GalleryGridFormat A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ boolean A05;

    public final boolean Dqe(View view) {
        int i;
        0qQ.A0B(view, 0);
        if (this.A05) {
            this.A02.A0C.invoke(this.A03);
            return true;
        }
        Activity activity = this.A00;
        switch (this.A04.intValue()) {
            case 0:
                i = -1;
                break;
            case 1:
                i = 2131962919;
                break;
            default:
                i = 2131962917;
                break;
        }
        AnonymousClass5Gt A0V = DbZ.A0V(activity, i);
        A0V.A02();
        A0V.A03(view);
        A0V.A07(C283255Gu.A07);
        A0V.A00().A07(this.A01);
        return true;
    }

    public C61688KHw(Activity activity, UserSession userSession, C60711Jpw jpw, GalleryGridFormat galleryGridFormat, Integer num, boolean z) {
        this.A05 = z;
        this.A02 = jpw;
        this.A03 = galleryGridFormat;
        this.A00 = activity;
        this.A04 = num;
        this.A01 = userSession;
    }
}
