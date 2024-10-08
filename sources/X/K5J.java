package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.GalleryGridEditMediaSelectionFragment$Config;
import com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class K5J extends AnonymousClass4DH implements C348257y9 {
    public static final String __redex_internal_original_name = "GalleryGridFormatsBottomSheet";
    public UserSession A00;
    public GalleryGridEditMediaSelectionFragment$Config A01;
    public C63711L3v A02;
    public ArrayList A03;
    public RecyclerView A04;
    public C355608Qq A05;
    public C63710L3u A06;
    public ArrayList A07;
    public final HashMap A08 = AnonymousClass7TE.A1E();

    public final boolean CWP(Medium medium) {
        return true;
    }

    public final void DLY(Medium medium, String str) {
    }

    public final String getModuleName() {
        return "gallery_grid_formats_bottom_sheet";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        int i;
        int i2;
        int i3;
        String A0d;
        int i4;
        int i5 = 0;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        int A022 = AnonymousClass7TG.A02(requireContext());
        int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.ad_tag_max_width);
        int dimensionPixelSize2 = DbV.A05(this).getDimensionPixelSize(R.dimen.gallery_grid_format_thumbnail_height);
        UserSession userSession = this.A00;
        if (userSession != null) {
            C355608Qq r8 = new C355608Qq(requireActivity, userSession, AnonymousClass05K.A00, dimensionPixelSize, dimensionPixelSize2, false);
            this.A05 = r8;
            UserSession userSession2 = this.A00;
            if (userSession2 != null) {
                this.A06 = new C63710L3u(requireActivity, requireContext, r8, userSession2, new C66309MMs(this, 20), (float) dimensionPixelSize, (float) dimensionPixelSize2);
                A00();
                RecyclerView A0I = DbT.A0I(view2, R.id.gallery_grid_format_picker_recycler_view);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext);
                linearLayoutManager.A1o(0);
                A0I.setLayoutManager(linearLayoutManager);
                C63710L3u l3u = this.A06;
                if (l3u == null) {
                    str = "galleryGridFormatsAdapter";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                A0I.setAdapter((2Rw) AnonymousClass7TE.A14(l3u.A01));
                A0I.A11(new AnonymousClass3V7(A022, A022));
                this.A04 = A0I;
                GalleryGridEditMediaSelectionFragment$Config galleryGridEditMediaSelectionFragment$Config = this.A01;
                if (galleryGridEditMediaSelectionFragment$Config != null) {
                    View A0F = DbY.A0F(view2, R.id.gallery_grid_format_picker_edit_selection_stub);
                    LYA.A01(A0F, requireContext, requireActivity, this, 15);
                    Resources resources = requireContext.getResources();
                    List list = galleryGridEditMediaSelectionFragment$Config.A01;
                    boolean z = list instanceof Collection;
                    if (!z || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (JTO.A0W(it).A05() && (i5 = i5 + 1) < 0) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z || !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            if (JTO.A0W(it2).CeS() && (i = i + 1) < 0) {
                                0sr.A1S();
                                throw AnonymousClass00P.createAndThrow();
                            }
                        }
                    } else {
                        i = 0;
                    }
                    TextView A0G = DbU.A0G(A0F, R.id.gallery_formats_picker_edit_selection_title);
                    if (i5 > 0) {
                        i2 = 2131962923;
                        if (i > 0) {
                            i2 = 2131962924;
                        }
                    } else if (i > 0) {
                        i2 = 2131962925;
                    } else {
                        throw AnonymousClass7TE.A0z("editSelectionMedia should have at least one photo or video.");
                    }
                    DbU.A1A(resources, A0G, i2);
                    TextView A0G2 = DbU.A0G(A0F, R.id.gallery_formats_picker_edit_selection_subtitle);
                    if (i5 > 0) {
                        if (i == 0) {
                            i4 = R.plurals.gallery_formats_picker_edit_selection_n_photos;
                        } else if (i5 == 1) {
                            i3 = R.plurals.gallery_formats_picker_edit_selection_one_photo_n_videos;
                            A0d = DbY.A0d(resources, i, i3);
                        } else if (i == 1) {
                            i4 = R.plurals.gallery_formats_picker_edit_selection_n_photos_one_video;
                        } else {
                            A0d = resources.getString(2131962922, C51968G9o.A1Z(Integer.valueOf(i5), i));
                        }
                        A0d = DbY.A0d(resources, i5, i4);
                    } else if (i > 0) {
                        i3 = R.plurals.gallery_formats_picker_edit_selection_n_videos;
                        A0d = DbY.A0d(resources, i, i3);
                    } else {
                        throw AnonymousClass7TE.A0z("editSelectionMedia should have at least one photo or video.");
                    }
                    A0G2.setText(A0d);
                    return;
                }
                return;
            }
        }
        str = "session";
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0093  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A00() {
        /*
            r9 = this;
            java.util.HashMap r0 = r9.A08
            r0.clear()
            java.util.ArrayList r0 = r9.A03
            java.lang.String r8 = "selectedMedia"
            if (r0 == 0) goto L_0x0021
            java.util.Iterator r2 = X.AnonymousClass7TE.A1G(r0)
        L_0x000f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002d
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r2)
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            X.8Qq r0 = r9.A05
            if (r0 != 0) goto L_0x0029
            java.lang.String r8 = "thumbnailLoader"
        L_0x0021:
            X.0qQ.A0F(r8)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0029:
            r0.A04(r1, r9)
            goto L_0x000f
        L_0x002d:
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r0 = r9.A07
            if (r0 != 0) goto L_0x003c
            java.lang.String r8 = "galleryFormats"
            goto L_0x0021
        L_0x003c:
            java.util.Iterator r7 = X.AnonymousClass7TE.A1G(r0)
        L_0x0040:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r5 = X.AnonymousClass7TF.A0a(r7)
            com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat r5 = (com.instagram.creation.capture.quickcapture.gallery.gallerygrid.formats.viewmodel.GalleryGridFormat) r5
            java.util.ArrayList r6 = r9.A03
            if (r6 == 0) goto L_0x0021
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r1 = 1
            int r0 = r5.ordinal()
            if (r0 != r1) goto L_0x00a1
            r2 = 0
            java.util.Iterator r1 = r6.iterator()
        L_0x0060:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0098
            com.instagram.common.gallery.Medium r0 = X.JTO.A0W(r1)
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0095
            java.lang.Integer r2 = X.AnonymousClass05K.A01
        L_0x0072:
            int r0 = r2.intValue()
            if (r0 == 0) goto L_0x0093
            r0 = 0
        L_0x0079:
            java.util.ArrayList r1 = r9.A03
            if (r0 == 0) goto L_0x0088
            if (r1 == 0) goto L_0x0021
            X.LiG r0 = new X.LiG
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            goto L_0x0040
        L_0x0088:
            if (r1 == 0) goto L_0x0021
            X.LiG r0 = new X.LiG
            r0.<init>(r5, r2, r1)
            r3.add(r0)
            goto L_0x0040
        L_0x0093:
            r0 = 1
            goto L_0x0079
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0060
        L_0x0098:
            r0 = 2
            if (r2 < r0) goto L_0x009e
            r0 = 6
            if (r2 <= r0) goto L_0x00a1
        L_0x009e:
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            goto L_0x0072
        L_0x00a1:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            goto L_0x0072
        L_0x00a4:
            X.L3u r2 = r9.A06
            if (r2 != 0) goto L_0x00ac
            java.lang.String r8 = "galleryGridFormatsAdapter"
            goto L_0x0021
        L_0x00ac:
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r0.addAll(r4)
            r0.addAll(r3)
            java.util.List r1 = r2.A00
            r1.clear()
            r1.addAll(r0)
            X.0eM r0 = r2.A01
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            X.2t9 r0 = (X.AnonymousClass2t9) r0
            X.JTR.A1L(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5J.A00():void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        UserSession userSession = this.A00;
        if (userSession != null) {
            return userSession;
        }
        0qQ.A0F("session");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        DbY.A1S(medium, bitmap);
        this.A08.put(Integer.valueOf(medium.A05), bitmap);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9223 && i2 == -1 && intent != null) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("selected_media");
            if (parcelableArrayListExtra != null) {
                this.A03 = parcelableArrayListExtra;
                A00();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-2009856758);
        K5J.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A00 = 09i.A0A.A06(bundle2);
            this.A03 = C320236s2.A02(bundle2, Medium.class, AnonymousClass000.A00(3947));
            this.A07 = C320236s2.A02(bundle2, GalleryGridFormat.class, AnonymousClass000.A00(3148));
            this.A01 = (GalleryGridEditMediaSelectionFragment$Config) bundle2.getParcelable("edit_selection_config");
        }
        AnonymousClass0fD.A09(-1235888993, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1060406965);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.gallery_grid_formats_bottom_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-651974290, A022);
        return inflate;
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(567117008);
        super.onDestroyView();
        this.A08.clear();
        C63710L3u l3u = this.A06;
        if (l3u == null) {
            str = "galleryGridFormatsAdapter";
        } else {
            int itemCount = ((2Rw) AnonymousClass7TE.A14(l3u.A01)).getItemCount();
            int i = 0;
            while (i < itemCount) {
                RecyclerView recyclerView = this.A04;
                if (recyclerView == null) {
                    str = "recyclerView";
                } else {
                    recyclerView.A0W(i);
                    i++;
                }
            }
            AnonymousClass0fD.A09(-1772369634, A022);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
