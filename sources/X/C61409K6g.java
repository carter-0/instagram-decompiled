package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.gallery.model.GalleryItem;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K6g  reason: case insensitive filesystem */
public final class C61409K6g extends AnonymousClass4DH implements AnonymousClass8QW, C348257y9, C361698ge, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GalleryGridEditMediaSelectionFragment";
    public int A00;
    public C355608Qq A01;
    public LRA A02;
    public GalleryGridEditMediaSelectionFragment$Config A03;
    public boolean A04;
    public final AnonymousClass0eM A05;
    public final C328767Gd A06;
    public final HashMap A07 = AnonymousClass7TE.A1E();

    public final boolean CWP(Medium medium) {
        return true;
    }

    public final /* synthetic */ void D3h(Integer num) {
    }

    public final /* synthetic */ void DBA(int i) {
    }

    public final /* synthetic */ void DLy(GalleryItem galleryItem, MQT mqt, int i) {
    }

    public final /* synthetic */ void DM8(View view, GalleryItem galleryItem, MQT mqt, int i) {
    }

    public final /* synthetic */ void DMO(GalleryItem galleryItem, boolean z) {
    }

    public final void DMR(GalleryItem galleryItem, MQT mqt, int i, boolean z) {
        0qQ.A0B(mqt, 1);
        if (mqt instanceof C59787JYg) {
            LRA lra = this.A02;
            if (lra == null) {
                0qQ.A0F("itemAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            Bitmap bitmap = ((C59787JYg) mqt).A00;
            0qQ.A0B(bitmap, 1);
            C328767Gd r3 = lra.A04;
            if (r3.CbT(galleryItem)) {
                r3.EDm(galleryItem);
                Medium medium = galleryItem.A00;
                if (medium != null) {
                    LRA.A00(medium, lra);
                }
            } else if (!r3.A8m(new AnonymousClass9SZ(galleryItem, bitmap))) {
                Context context = lra.A00;
                C59689JTv.A09(context, DbW.A0h(context, Integer.valueOf(r3.A00), 2131973048));
                return;
            }
            int size = r3.A02.size();
            for (int i2 = 0; i2 < size; i2++) {
                Medium medium2 = r3.BJM(i2).A01.A00;
                if (medium2 != null) {
                    LRA.A00(medium2, lra);
                }
            }
            LRA.A01(lra);
        }
    }

    public final /* synthetic */ void DSb() {
    }

    public final /* synthetic */ void DdF(String str) {
    }

    public final /* synthetic */ void Dik() {
    }

    public final /* synthetic */ void Du4() {
    }

    public final String getModuleName() {
        return "gallery_grid_edit_media_selection_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireActivity = requireActivity();
        AnonymousClass0eM r3 = this.A05;
        UserSession A0l = AnonymousClass7TE.A0l(r3);
        r3.getValue();
        int A012 = AnonymousClass8XE.A01(requireActivity);
        r3.getValue();
        Context context = requireActivity;
        this.A01 = new C355608Qq(context, A0l, AnonymousClass05K.A00, A012, AnonymousClass8XE.A00(requireActivity), false);
        Context requireContext = requireContext();
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        C355608Qq r4 = this.A01;
        if (r4 != null) {
            C328767Gd r15 = this.A06;
            this.A02 = new LRA(requireContext, r4, A0l2, r15, this);
            GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A03;
            if (galleryGridEditMediaSelectionFragment$Config != null) {
                if (AnonymousClass7TE.A1b(galleryGridEditMediaSelectionFragment$Config.A02)) {
                    GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config2 = this.A03;
                    if (galleryGridEditMediaSelectionFragment$Config2 != null) {
                        for (Medium medium : galleryGridEditMediaSelectionFragment$Config2.A02) {
                            C355608Qq r1 = this.A01;
                            if (r1 != null) {
                                r1.A04(medium, this);
                            }
                        }
                    }
                } else {
                    LRA lra = this.A02;
                    if (lra != null) {
                        GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config3 = this.A03;
                        if (galleryGridEditMediaSelectionFragment$Config3 != null) {
                            lra.A02(galleryGridEditMediaSelectionFragment$Config3.A01);
                        }
                    }
                    0qQ.A0F("itemAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                AnonymousClass8QZ r8 = new AnonymousClass8QZ(requireActivity, (View) null, this, AnonymousClass7TE.A0l(r3), AnonymousClass7TF.A0G(view2, R.id.edit_media_selection_thumbnail_tray), (C355458Qb) null, r15, this, (C355468Qc) null, (AnonymousClass7SL) null, JYJ.A00, AnonymousClass8QY.A00, 0.5625f, 2131968361, 0, DbV.A05(this).getDimensionPixelSize(R.dimen.audio_translations_language_list_cell_row_height), DbZ.A02(this), R.color.grey_10, R.dimen.abc_button_inset_vertical_material, false, true, true, false, false, false);
                r8.A0C(true, false);
                r8.A0B(false);
                RecyclerView A0I = DbT.A0I(view2, R.id.edit_media_selection_recycler_view);
                Context A0S = AnonymousClass7TE.A0S(A0I);
                int A022 = DbS.A02(A0S, 1);
                A0I.setLayoutManager(new GridLayoutManager(A0S, 3, 1, false));
                A0I.setItemAnimator((AnonymousClass3AS) null);
                LRA lra2 = this.A02;
                if (lra2 != null) {
                    A0I.setAdapter(lra2.A02);
                    A0I.A11(new C361648gZ(A022, false));
                    return;
                }
                0qQ.A0F("itemAdapter");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("configuration");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("thumbnailLoader");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ boolean Cdb() {
        return false;
    }

    public final void DLY(Medium medium, String str) {
        this.A00++;
    }

    public final void Du1(C53401GnY gnY) {
        C328767Gd r2 = this.A06;
        if (r2.A02.size() < 2) {
            Context context = getContext();
            if (context != null) {
                C59689JTv.A09(context, DbW.A0h(context, 2, 2131973050));
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            List<AnonymousClass9SZ> Brk = r2.Brk();
            ArrayList A0r = AnonymousClass7TG.A0r(Brk);
            for (AnonymousClass9SZ r0 : Brk) {
                A0r.add(r0.A01.A00);
            }
            ArrayList A1D = AnonymousClass7TE.A1D(A0r);
            Intent A09 = DbS.A09();
            A09.putParcelableArrayListExtra("selected_media", A1D);
            Dba.A0k(activity, A09);
        }
    }

    public final /* synthetic */ boolean EtH() {
        return false;
    }

    public final void configureActionBar(2da r21) {
        2da r3 = r21;
        Context A0B = JTT.A0B(this, r3);
        int color = A0B.getColor(2Yu.A0A(A0B));
        int A032 = AnonymousClass7TF.A03(A0B, R.attr.igds_color_media_background);
        DbX.A1A(new LY0(this, 40), DbX.A0M(), r3);
        GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A03;
        if (galleryGridEditMediaSelectionFragment$Config == null) {
            0qQ.A0F("configuration");
            throw AnonymousClass00P.createAndThrow();
        }
        r3.setTitle(galleryGridEditMediaSelectionFragment$Config.A00);
        Integer num = AnonymousClass05K.A00;
        r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, AnonymousClass37O.A00(color), new ColorDrawable(A032), (Drawable) null, (View.OnClickListener) null, num, color, A032, A032, -2, -2, -2, -2, true));
    }

    public final /* synthetic */ boolean getCanHaveEmptySegments() {
        return false;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public C61409K6g() {
        AnonymousClass0eM A022 = C227642jf.A02(this);
        this.A05 = A022;
        this.A06 = new C328767Gd(AnonymousClass7TE.A0l(A022));
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        DbY.A1S(medium, bitmap);
        if (!this.A04) {
            HashMap hashMap = this.A07;
            hashMap.put(Integer.valueOf(medium.A05), bitmap);
            int i = this.A00 + 1;
            this.A00 = i;
            GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A03;
            String str = "configuration";
            if (galleryGridEditMediaSelectionFragment$Config != null) {
                List list = galleryGridEditMediaSelectionFragment$Config.A02;
                if (i == list.size()) {
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Medium A0W = JTO.A0W(it);
                        Bitmap bitmap2 = (Bitmap) hashMap.get(Integer.valueOf(A0W.A05));
                        if (bitmap2 != null) {
                            A1C.add(new AnonymousClass9SZ(JTR.A0f(A0W), bitmap2));
                        }
                    }
                    C328767Gd r4 = this.A06;
                    List list2 = r4.A02;
                    list2.clear();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Iterator it2 = A1C.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        list2.add(next);
                        A1C2.add(next);
                    }
                    for (AnonymousClass8QO DMZ : r4.A03) {
                        DMZ.DMZ(A1C2);
                    }
                    LRA lra = this.A02;
                    if (lra == null) {
                        str = "itemAdapter";
                    } else {
                        GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config2 = this.A03;
                        if (galleryGridEditMediaSelectionFragment$Config2 != null) {
                            lra.A02(galleryGridEditMediaSelectionFragment$Config2.A01);
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-997734924);
        C61409K6g.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Parcelable parcelable = bundle2.getParcelable("edit_media_selection_config");
            if (parcelable != null) {
                this.A03 = (GalleryGridEditMediaSelectionFragment$Config) parcelable;
                AnonymousClass0fD.A09(912860188, A022);
                return;
            }
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 455029736;
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = -1293614654;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-741664526);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_edit_media_selection_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1809532118, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-986872960);
        super.onDestroyView();
        this.A04 = true;
        this.A07.clear();
        AnonymousClass0fD.A09(1224035670, A022);
    }
}
