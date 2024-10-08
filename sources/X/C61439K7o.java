package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.util.List;

/* renamed from: X.K7o  reason: case insensitive filesystem */
public final class C61439K7o extends AnonymousClass4DH implements MVI {
    public static final String __redex_internal_original_name = "NametagBackgroundImagePickerFragment";
    public KB6 A00;
    public LPF A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final /* synthetic */ void D0u() {
    }

    public final boolean DHW(View view, GalleryItem galleryItem) {
        return false;
    }

    public final /* synthetic */ void DIn(boolean z) {
    }

    public final boolean Dkq(Medium medium, String str) {
        0qQ.A0B(str, 0);
        KB6 kb6 = this.A00;
        if (kb6 == null) {
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        }
        DbX.A10(kb6.A0A, AnonymousClass37D.A00);
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        C64126LOx lOx = kb6.A0I;
        lOx.A01(decodeFile);
        lOx.A02(kb6);
        kb6.A05 = true;
        KB6.A07(kb6);
        KB6.A05(kb6);
        return true;
    }

    public final String getModuleName() {
        return "qr_code_media_picker_gallery_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        View view3 = view2;
        this.A01 = new LPF(view3, (AnonymousClass07i) null, AnonymousClass8XO.PHOTO_ONLY, AnonymousClass7TE.A0l(this.A02), (2Cn) null, this, new C63957LFd(0, (String) null, (String) null, (String) null, "", "", (List) null, 1.0f, 0, false, false, false, false, false, false, true, false), (Boolean) null, 3, 0, true, false, false);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-707465892);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_nametag_media_picker_photos, viewGroup, false);
        AnonymousClass0fD.A09(435225885, A022);
        return inflate;
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1732044069);
        C61439K7o.super.onPause();
        LPF lpf = this.A01;
        if (lpf == null) {
            0qQ.A0F("mediaPickerPhotosController");
            throw AnonymousClass00P.createAndThrow();
        }
        lpf.A02();
        AnonymousClass0fD.A09(-1824053920, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(966999893);
        super.onResume();
        LPF lpf = this.A01;
        if (lpf == null) {
            0qQ.A0F("mediaPickerPhotosController");
            throw AnonymousClass00P.createAndThrow();
        }
        lpf.A03();
        AnonymousClass0fD.A09(1924469367, A022);
    }
}
