package com.instagram.wellbeing.fundraiser.coverphotopicker;

import X.002;
import X.0cp;
import X.0mb;
import X.0qQ;
import X.17k;
import X.1MF;
import X.2Cn;
import X.2Yu;
import X.AnonymousClass05K;
import X.AnonymousClass07i;
import X.AnonymousClass0fD;
import X.AnonymousClass6QE;
import X.AnonymousClass6QJ;
import X.AnonymousClass7TG;
import X.AnonymousClass8XN;
import X.AnonymousClass8XO;
import X.AnonymousClass8XU;
import X.AnonymousClass8XW;
import X.AnonymousClass9I9;
import X.C2604245p;
import X.C273374mT;
import X.C277014uI;
import X.C299275ur;
import X.C307896Rx;
import X.C308276Tl;
import X.C339797kB;
import X.C355608Qq;
import X.C60442Jla;
import X.C60459Jlr;
import X.DbT;
import X.DbU;
import X.DbV;
import X.L9U;
import X.LY3;
import X.MUN;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import java.io.File;
import java.net.URI;
import java.net.URL;

public class FundraiserPhotoPickerGalleryTabFragment extends C273374mT implements MUN {
    public L9U A00;
    public ViewGroup A01;
    public C339797kB A02;
    public AnonymousClass8XW A03;
    public RecyclerView mRecyclerView;

    public final boolean DM5(View view, AnonymousClass9I9 r3, GalleryItem galleryItem) {
        return false;
    }

    public final String getModuleName() {
        return "fundraiser_photo_picker_library_tab";
    }

    public final void DLv(AnonymousClass9I9 r14, GalleryItem galleryItem) {
        String str;
        L9U l9u = this.A00;
        if (l9u != null) {
            Medium medium = galleryItem.A00;
            medium.getClass();
            l9u.A02.A0c();
            AnonymousClass6QE r0 = AnonymousClass6QE.A02;
            if (l9u.A05) {
                Context context = l9u.A00;
                Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X);
                17k.A07(decodeFile, "Bitmap extraction returned null");
                Bitmap A06 = 1MF.A06(decodeFile);
                17k.A07(A06, "New bitmap does not generate");
                File A04 = 0mb.A04(context);
                if (!A04.exists()) {
                    str = "";
                } else {
                    1MF.A0M(A06, A04);
                    str = A04.getPath();
                }
            } else {
                str = medium.A0X;
            }
            0qQ.A0B(str, 0);
            URL url = new URL(002.A0R("file://", str));
            String obj = AnonymousClass6QJ.A00(0cp.A03(DbT.A10(new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef())))).toString();
            C307896Rx r2 = l9u.A03;
            C277014uI r1 = l9u.A04;
            C308276Tl r02 = new C308276Tl();
            r02.A03(obj, 0);
            r02.A02((Object) null);
            C299275ur.A00(r2, r02.A00(), r1);
        }
    }

    public static void A00(FundraiserPhotoPickerGalleryTabFragment fundraiserPhotoPickerGalleryTabFragment) {
        C339797kB r2;
        if (C2604245p.A03(fundraiserPhotoPickerGalleryTabFragment.requireContext())) {
            fundraiserPhotoPickerGalleryTabFragment.A03.A07();
            C339797kB r0 = fundraiserPhotoPickerGalleryTabFragment.A02;
            if (r0 != null) {
                r0.A00();
                r2 = null;
            } else {
                return;
            }
        } else if (fundraiserPhotoPickerGalleryTabFragment.A02 == null) {
            String A0K = 2Yu.A0K(fundraiserPhotoPickerGalleryTabFragment.requireContext());
            r2 = new C339797kB(fundraiserPhotoPickerGalleryTabFragment.A01, R.layout.fundraiser_photo_picker_no_permission_layout);
            r2.A05(DbV.A0z(fundraiserPhotoPickerGalleryTabFragment, A0K, 2131974231));
            r2.A04(DbV.A0z(fundraiserPhotoPickerGalleryTabFragment, A0K, 2131974230));
            r2.A02(2131974229);
            r2.A03(new LY3((Object) fundraiserPhotoPickerGalleryTabFragment, 9));
        } else {
            return;
        }
        fundraiserPhotoPickerGalleryTabFragment.A02 = r2;
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1955694532);
        FundraiserPhotoPickerGalleryTabFragment.super.onCreate(bundle);
        AnonymousClass0fD.A09(-1461147236, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-683105581);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.fundraiser_photo_picker_tab);
        AnonymousClass0fD.A09(-269450206, A022);
        return A0C;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1363383849);
        super.onResume();
        A00(this);
        AnonymousClass0fD.A09(1408952466, A022);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.07Z, com.instagram.wellbeing.fundraiser.coverphotopicker.FundraiserPhotoPickerGalleryTabFragment, androidx.fragment.app.Fragment, X.4mT, java.lang.Object, X.MUN, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A01 = DbU.A0C(view, R.id.view_container);
        this.mRecyclerView = DbT.A0I(view, 16908298);
        this.mRecyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 3));
        this.mRecyclerView.A11(new C60459Jlr(this, AnonymousClass7TG.A04(requireContext()), 2));
        int i = DbV.A05(this).getDisplayMetrics().widthPixels / 3;
        C355608Qq r2 = new C355608Qq(requireContext(), getSession(), AnonymousClass05K.A00, i, i, false);
        C60442Jla jla = new C60442Jla(requireContext(), r2, this);
        this.mRecyclerView.setAdapter(jla);
        AnonymousClass8XN r1 = new AnonymousClass8XN(AnonymousClass07i.A00(this), r2);
        r1.A03 = AnonymousClass8XO.STATIC_PHOTO_ONLY;
        r1.A09 = true;
        this.A03 = new AnonymousClass8XW(requireContext(), (2Cn) null, jla, new AnonymousClass8XU(r1));
        A00(this);
    }
}
