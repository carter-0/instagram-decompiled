package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import java.util.List;
import java.util.Map;

/* renamed from: X.K6y  reason: case insensitive filesystem */
public final class C61424K6y extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, C361528gN, AnonymousClass4DS, AnonymousClass8XQ, 1DN, AdapterView.OnItemSelectedListener {
    public static final String __redex_internal_original_name = "IGTVUploadGalleryFragment";
    public int A00;
    public int A01;
    public int A02;
    public View A03;
    public ViewGroup A04;
    public TextView A05;
    public RecyclerView A06;
    public C60446Jle A07;
    public C62465KgF A08;
    public C339797kB A09;
    public int A0A;
    public AnonymousClass8XW A0B;
    public TriangleSpinner A0C;
    public final AnonymousClass0eM A0D = C66306MMp.A01(this, 38);
    public final AnonymousClass0eM A0E = C66306MMp.A01(this, 39);
    public final AnonymousClass0eM A0F = C227642jf.A02(this);
    public final AnonymousClass0eM A0G = C66306MMp.A00(this, C66306MMp.A02(this, 40), new C73666Phf(13, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 41);

    public final void DCx(Exception exc) {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        LJA.A01(r4);
        View ETj = r4.ETj(AnonymousClass7TE.A0l(this.A0F), R.layout.gallery_picker_layout, 0, 0);
        0qQ.A0C(ETj, "null cannot be cast to non-null type com.instagram.ui.widget.trianglespinner.TriangleSpinner");
        TriangleSpinner triangleSpinner = (TriangleSpinner) ETj;
        triangleSpinner.setDropDownVerticalOffset(-AnonymousClass3D4.A00(AnonymousClass7TE.A0S(triangleSpinner)));
        triangleSpinner.setAdapter((C60051JeJ) this.A0E.getValue());
        triangleSpinner.setOnItemSelectedListener(this);
        this.A0C = triangleSpinner;
        triangleSpinner.A00 = (MRI) this.A0D.getValue();
    }

    public final String getModuleName() {
        return "igtv_upload_gallery_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = (ViewGroup) view;
        this.A03 = view.findViewById(R.id.loading_spinner);
        this.A05 = AnonymousClass7TE.A0d(view, R.id.no_media_text);
        C60366JkE jkE = new C60366JkE(this, 5);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.A01 = jkE;
        RecyclerView A0F2 = DbZ.A0F(view, R.id.gallery_recycler_view);
        A0F2.setLayoutManager(gridLayoutManager);
        C60446Jle jle = this.A07;
        if (jle == null) {
            0qQ.A0F("galleryAdapter");
            throw AnonymousClass00P.createAndThrow();
        }
        A0F2.setAdapter(jle);
        A0F2.A11(new C60464Jlw(jkE, this.A0A));
        this.A06 = A0F2;
    }

    public final Folder getCurrentFolder() {
        AnonymousClass8XW r0 = this.A0B;
        if (r0 != null) {
            return r0.A02;
        }
        0qQ.A0F("mediaLoaderController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final List getFolders() {
        AnonymousClass8XW r1 = this.A0B;
        if (r1 != null) {
            return C64078LLw.A00(C64458LcH.A00, r1);
        }
        0qQ.A0F("mediaLoaderController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0F);
    }

    public final boolean onBackPressed() {
        C63299Kui.A00(this, this.A0G);
        return false;
    }

    public static final void A00(C61424K6y k6y, Folder folder) {
        String str;
        int i = k6y.getCurrentFolder().A02;
        int i2 = folder.A02;
        if (i != i2) {
            AnonymousClass8XW r0 = k6y.A0B;
            if (r0 == null) {
                str = "mediaLoaderController";
            } else {
                r0.A0D(i2);
                RecyclerView recyclerView = k6y.A06;
                if (recyclerView == null) {
                    str = "galleryGridView";
                } else {
                    recyclerView.A0o(0);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DQY(AnonymousClass8XW r8, List list, List list2, int i) {
        if (isResumed()) {
            String str = "loadingSpinner";
            View view = this.A03;
            if (view != null) {
                view.setVisibility(8);
                AnonymousClass0eM r5 = this.A0E;
                int count = ((C60051JeJ) r5.getValue()).getCount();
                str = "emptyGalleryText";
                RecyclerView recyclerView = this.A06;
                if (count > 0) {
                    if (recyclerView != null) {
                        recyclerView.setVisibility(0);
                        TextView textView = this.A05;
                        if (textView != null) {
                            textView.setVisibility(8);
                        }
                    }
                    0qQ.A0F("galleryGridView");
                    throw AnonymousClass00P.createAndThrow();
                }
                if (recyclerView != null) {
                    recyclerView.setVisibility(8);
                    TextView textView2 = this.A05;
                    if (textView2 != null) {
                        C62465KgF kgF = this.A08;
                        if (kgF == null) {
                            str = "pickerMode";
                        } else {
                            int i2 = 2131964027;
                            if (kgF == C62465KgF.PICK_UPLOAD_VIDEO) {
                                i2 = 2131964028;
                            }
                            textView2.setText(i2);
                            textView2.setVisibility(0);
                        }
                    }
                }
                0qQ.A0F("galleryGridView");
                throw AnonymousClass00P.createAndThrow();
                0fE.A00((BaseAdapter) r5.getValue(), -948707981);
                return;
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DWm(Map map) {
        String str;
        if (C2604245p.A03(requireContext())) {
            AnonymousClass8XW r0 = this.A0B;
            if (r0 == null) {
                str = "mediaLoaderController";
            } else {
                r0.A07();
                C339797kB r02 = this.A09;
                if (r02 != null) {
                    r02.A00();
                    return;
                }
                return;
            }
        } else {
            if (this.A09 == null) {
                ViewGroup viewGroup = this.A04;
                if (viewGroup == null) {
                    str = "galleryContainer";
                } else {
                    this.A09 = JTQ.A0O(viewGroup);
                }
            }
            Context requireContext = requireContext();
            String A0K = 2Yu.A0K(requireContext);
            C339797kB r1 = this.A09;
            if (r1 != null) {
                r1.A05(requireContext.getString(2131964085));
                r1.A04(DbW.A0h(requireContext, A0K, 2131964084));
                r1.A02(2131964083);
                r1.A03(LY6.A00(this, 18));
                return;
            }
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r0 = -1113754932(0xffffffffbd9d72cc, float:-0.076879114)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r15 = r18
            r0 = r19
            X.C61424K6y.super.onCreate(r0)
            android.os.Bundle r2 = r15.requireArguments()
            android.content.Context r7 = r15.requireContext()
            X.0eM r1 = r15.A0F
            r1.getValue()
            r1.getValue()
            r4 = 0
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            r15.A02 = r0
            r1.getValue()
            r4 = 4651127699538968576(0x408c200000000000, double:900.0)
            double r4 = java.lang.Math.ceil(r4)
            int r0 = (int) r4
            r15.A01 = r0
            r1.getValue()
            r0 = 900500(0xdbd94, float:1.261869E-39)
            r15.A00 = r0
            r0 = 2
            int r0 = X.DbS.A02(r7, r0)
            r15.A0A = r0
            java.lang.String r0 = "igtv_upload_gallery_fragment_mode_arg"
            java.io.Serializable r4 = r2.getSerializable(r0)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.igtv.uploadflow.gallery.IGTVUploadGalleryFragment.IGTVGalleryItemPickerMode"
            X.0qQ.A0C(r4, r0)
            X.KgF r4 = (X.C62465KgF) r4
            r15.A08 = r4
            java.lang.String r5 = "pickerMode"
            if (r4 == 0) goto L_0x00aa
            X.KgF r2 = X.C62465KgF.PICK_UPLOAD_VIDEO
            r16 = 1059363750(0x3f249ba6, float:0.643)
            if (r4 != r2) goto L_0x0061
            r16 = 1058013184(0x3f100000, float:0.5625)
        L_0x0061:
            int r0 = X.0nA.A09(r7)
            int r10 = r0 / 3
            int r0 = r15.A0A
            int r0 = r10 - r0
            float r0 = (float) r0
            float r0 = r0 / r16
            int r11 = (int) r0
            com.instagram.common.session.UserSession r8 = X.AnonymousClass7TE.A0l(r1)
            r4 = 0
            r12 = 1
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.8Qq r6 = new X.8Qq
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.instagram.common.session.UserSession r14 = X.AnonymousClass7TE.A0l(r1)
            X.Jle r12 = new X.Jle
            r13 = r6
            r17 = r11
            r12.<init>(r13, r14, r15, r16, r17)
            r15.A07 = r12
            X.0gy r0 = X.AnonymousClass07i.A00(r15)
            X.8XN r1 = new X.8XN
            r1.<init>(r0, r6)
            X.KgF r0 = r15.A08
            if (r0 == 0) goto L_0x00aa
            if (r0 != r2) goto L_0x00b2
            X.8XO r0 = X.AnonymousClass8XO.VIDEO_ONLY
        L_0x009b:
            r1.A03 = r0
            r1.A07 = r15
            X.8XU r2 = new X.8XU
            r2.<init>(r1)
            X.Jle r1 = r15.A07
            if (r1 != 0) goto L_0x00b5
            java.lang.String r5 = "galleryAdapter"
        L_0x00aa:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b2:
            X.8XO r0 = X.AnonymousClass8XO.STATIC_PHOTO_ONLY
            goto L_0x009b
        L_0x00b5:
            X.8XW r0 = new X.8XW
            r0.<init>(r7, r4, r1, r2)
            r15.A0B = r0
            r0 = -156404604(0xfffffffff6ad7484, float:-1.7590441E33)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61424K6y.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2141355666);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.upload_gallery, false);
        AnonymousClass0fD.A09(782148790, A022);
        return A0D2;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-968707494);
        super.onDestroyView();
        RecyclerView recyclerView = this.A06;
        if (recyclerView == null) {
            0qQ.A0F("galleryGridView");
            throw AnonymousClass00P.createAndThrow();
        }
        recyclerView.A0b();
        AnonymousClass0fD.A09(632475788, A022);
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        A00(this, (Folder) getFolders().get(i));
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1240503588);
        C61424K6y.super.onPause();
        AnonymousClass8XW r0 = this.A0B;
        if (r0 == null) {
            0qQ.A0F("mediaLoaderController");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.A08();
        AnonymousClass0fD.A09(-694451016, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1203193349);
        super.onResume();
        if (C2604245p.A03(requireContext())) {
            C339797kB r0 = this.A09;
            if (r0 != null) {
                r0.A00();
            }
            String str = "loadingSpinner";
            View view = this.A03;
            if (view != null) {
                view.setVisibility(0);
                RecyclerView recyclerView = this.A06;
                if (recyclerView == null) {
                    str = "galleryGridView";
                } else {
                    recyclerView.setVisibility(8);
                    TextView textView = this.A05;
                    if (textView == null) {
                        str = "emptyGalleryText";
                    } else {
                        textView.setVisibility(8);
                        AnonymousClass8XW r02 = this.A0B;
                        if (r02 == null) {
                            str = "mediaLoaderController";
                        } else {
                            r02.A07();
                        }
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        C2604245p.A01(requireActivity(), this);
        AnonymousClass0fD.A09(1580648590, A022);
    }
}
