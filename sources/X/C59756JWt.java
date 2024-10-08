package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.gallery.RemoteMedia;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.view.GalleryPickerMediaOverlayView;

/* renamed from: X.JWt  reason: case insensitive filesystem */
public final class C59756JWt extends C232232tF {
    public final C376529Ii A00;
    public final UserSession A01;
    public final 0sP A02;
    public final 0sP A03;
    public final 0sP A04;
    public final 0sL A05;

    public C59756JWt(C376529Ii r2, UserSession userSession, 0sP r4, 0sP r5, 0sP r6, 0sL r7) {
        0qQ.A0B(r2, 2);
        this.A01 = userSession;
        this.A00 = r2;
        this.A03 = r4;
        this.A02 = r5;
        this.A05 = r7;
        this.A04 = r6;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.gallery_remote_media, viewGroup, false);
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0G(inflate, R.id.gallery_picker_grid_item_container);
        C59738JVw A002 = JXQ.A00(JTR.A0i(constraintLayout, R.id.gallery_picker_grid_item_background));
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60674JpL(inflate, constraintLayout, (ShimmerFrameLayout) AnonymousClass7TF.A0G(inflate, R.id.gallery_remote_media_shimmer), new C59851JaS((GalleryPickerMediaOverlayView) AnonymousClass7TE.A0b(constraintLayout, R.id.gallery_picker_item_overlay)), A002);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r29, C249703kE r30) {
        C59898JbN jbN;
        int i;
        C64794LiE liE = (C64794LiE) r29;
        C60674JpL jpL = (C60674JpL) r30;
        boolean A1Z = AnonymousClass7TG.A1Z(liE, jpL);
        C63699L3j l3j = new C63699L3j(this, liE);
        C376529Ii r10 = this.A00;
        UserSession userSession = this.A01;
        0sP r9 = this.A04;
        C59112J6u j6u = new C59112J6u(this, 15);
        int A032 = DbW.A03(2, r10, userSession);
        View view = jpL.A04;
        GalleryItem galleryItem = liE.A01;
        C59851JaS jaS = jpL.A07;
        GalleryPickerMediaOverlayView galleryPickerMediaOverlayView = jaS.A00;
        if (AJ5.A06(userSession, C64153LQs.A00(galleryItem))) {
            jbN = C59898JbN.CLOUD_WARNING;
        } else {
            jbN = C59898JbN.CLOUD;
        }
        int ordinal = jbN.ordinal();
        int i2 = R.drawable.instagram_app_icloud_pano_outline_24;
        if (ordinal != 0) {
            i2 = R.drawable.instagram_app_icloud_warning_pano_outline_24;
        }
        Integer valueOf = Integer.valueOf(i2);
        String str = null;
        if (valueOf == null) {
            galleryPickerMediaOverlayView.A01 = null;
        } else {
            Drawable A0E = JTP.A0E(galleryPickerMediaOverlayView.getContext(), valueOf);
            JTT.A10(A0E, galleryPickerMediaOverlayView);
            galleryPickerMediaOverlayView.A01 = A0E;
        }
        AnonymousClass0fU.A00(new C64249LXb(0, l3j, liE, view, jpL), view);
        view.setOnLongClickListener(new LYW(2, jpL, l3j, view));
        AnonymousClass9I9 r15 = liE.A00;
        boolean z = liE.A02.A06;
        jpL.A00 = new C66093MBb(j6u, A1Z ? 1 : 0);
        RemoteMedia remoteMedia = galleryItem.A04;
        if (remoteMedia != null) {
            RemoteMedia remoteMedia2 = jpL.A02;
            String str2 = null;
            if (remoteMedia2 != null) {
                str = remoteMedia2.A06;
            }
            String str3 = remoteMedia.A06;
            boolean A1a = C51966G9m.A1a(str, str3);
            jpL.A02 = remoteMedia;
            LNL lnl = LNL.A00;
            ConstraintLayout constraintLayout = jpL.A05;
            C59738JVw jVw = jpL.A08;
            if (remoteMedia.A09 && (i = remoteMedia.A01) > 0) {
                str2 = C347917xa.A01(i);
            }
            if (lnl.A00((Bitmap) null, constraintLayout, r15, r10, galleryItem, jaS, jVw, str2, A1a, z)) {
                jpL.A03 = A1Z;
                jpL.A06.A06(A1Z);
                AnonymousClass1MK r7 = jpL.A01;
                if (r7 == null) {
                    r7 = new C64617Lf3(A032, r10, jpL);
                }
                jpL.A01 = r7;
                1OO A0J = 1NK.A00().A0J(remoteMedia.A03, (String) null);
                A0J.A0I = false;
                A0J.A0L = A1Z;
                A0J.A08 = str3;
                A0J.A02(r7);
                A0J.A01();
            }
            galleryPickerMediaOverlayView.invalidate();
            constraintLayout.invalidate();
            if (r9 != null) {
                r9.invoke(str3);
                return;
            }
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final Class modelClass() {
        return C64794LiE.class;
    }
}
