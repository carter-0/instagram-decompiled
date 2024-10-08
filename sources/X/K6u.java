package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.instagram.android.R;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;
import com.instagram.igtv.uploadflow.upload.IGTVUploadViewModel;
import com.instagram.igtv.widget.TitleDescriptionEditor;

public abstract class K6u extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS, C66517MUv, C66402MQi {
    public static final String __redex_internal_original_name = "IGTVUploadSeriesInfoFragment";
    public View A00;
    public ImageView A01;
    public ScrollView A02;
    public TitleDescriptionEditor A03;
    public boolean A04;
    public C64720Lgx A05;
    public final AnonymousClass0eM A06 = C66299MMi.A00(this, new C66299MMi(this, 16), new C73666Phf(19, (Object) null, this), DbS.A0z(IGTVUploadViewModel.class), 17);
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final void configureActionBar(2da r6) {
        String A0m;
        0qQ.A0B(r6, 0);
        requireActivity();
        LJA.A01(r6);
        Integer num = AnonymousClass05K.A1F;
        int A032 = JTQ.A03(this, 2Yu.A0D(getContext()));
        C66299MMi mMi = new C66299MMi(this, 15);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = Tt3.A01(num);
        A0K.A05 = Tt3.A00(num);
        A0K.A0G = LY6.A00(mMi, 34);
        A0K.A02 = A032;
        View A0P = C51970G9q.A0P(A0K, r6);
        0qQ.A0C(A0P, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) A0P;
        LJB.A00(imageView, this.A04);
        this.A01 = imageView;
        if (this instanceof KTU) {
            A0m = DbU.A0m(this, 2131964025);
        } else {
            A0m = DbU.A0m(this, 2131964099);
        }
        r6.setTitle(A0m);
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (ScrollView) view.findViewById(R.id.scroll_view_container);
        this.A00 = view.findViewById(R.id.scroll_view_content);
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            0qQ.A0F("titleDescriptionEditor");
            throw AnonymousClass00P.createAndThrow();
        }
        titleDescriptionEditor.A03 = titleDescriptionEditor.getResources().getDimensionPixelSize(R.dimen.abc_list_item_height_large_material);
        titleDescriptionEditor.setMaxTitleLength(titleDescriptionEditor.getResources().getInteger(R.integer.series_title_max_characters));
        titleDescriptionEditor.setTitleHint(2131964110);
        titleDescriptionEditor.setDescriptionHint(2131964108);
        if (this instanceof KTV) {
            z = !((KTV) this).A00;
        } else {
            z = true;
        }
        titleDescriptionEditor.A0M = z;
    }

    public final String A00() {
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            0qQ.A0F("titleDescriptionEditor");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(titleDescriptionEditor.A0J);
        0qQ.A07(A0f);
        return DbV.A12(A0f);
    }

    public final String A01() {
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            0qQ.A0F("titleDescriptionEditor");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0f = AnonymousClass7TF.A0f(titleDescriptionEditor.A0K);
        0qQ.A07(A0f);
        return DbV.A12(A0f);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02() {
        /*
            r3 = this;
            boolean r0 = r3 instanceof X.KTU
            if (r0 == 0) goto L_0x0026
            r2 = r3
            X.KTU r2 = (X.KTU) r2
            java.lang.String r1 = r2.A01
            if (r1 != 0) goto L_0x0015
            java.lang.String r0 = "originalTitle"
        L_0x000d:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0015:
            java.lang.String r0 = r2.A01()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r1 = r2.A00
            if (r1 != 0) goto L_0x0042
            java.lang.String r0 = "originalDescription"
            goto L_0x000d
        L_0x0026:
            r1 = r3
            X.KTV r1 = (X.KTV) r1
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = r1.A01()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r1.A00()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x004f
            goto L_0x004d
        L_0x0042:
            java.lang.String r0 = r2.A00()
            boolean r0 = r1.equals(r0)
            r1 = 0
            if (r0 != 0) goto L_0x004e
        L_0x004d:
            r1 = 1
        L_0x004e:
            return r1
        L_0x004f:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K6u.A02():boolean");
    }

    public final void Cxb() {
        if (this instanceof KTV) {
            KTV ktv = (KTV) this;
            if (ktv.A00) {
                C63299Kui.A00(ktv, ktv.A06);
            }
        } else if (getActivity() instanceof IGTVUploadActivity) {
            C63299Kui.A00(this, this.A06);
        }
    }

    public final void D92() {
        if (this instanceof KTV) {
            KTV ktv = (KTV) this;
            if (ktv.A00) {
                JTO.A0k(ktv.A06).A04(ktv, KTO.A00);
            } else {
                DbT.A1I(ktv);
            }
        } else if (getActivity() instanceof IGTVUploadActivity) {
            JTO.A0k(this.A06).A04(this, KTO.A00);
        } else {
            DbT.A1I(this);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        C64720Lgx lgx = this.A05;
        if (lgx != null) {
            return lgx.onBackPressed();
        }
        0qQ.A0F("backHandlerDelegate");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean BCK() {
        return A02();
    }

    public void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1037902656);
        K6u.super.onCreate(bundle);
        this.A05 = new C64720Lgx(requireContext(), this);
        AnonymousClass0fD.A09(-635057663, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1529440583);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.upload_series_info, false);
        if (!(getActivity() instanceof IGTVUploadActivity)) {
            View findViewById = A0D.findViewById(R.id.scroll_view_content);
            0qQ.A0A(findViewById);
            0nA.A0e(findViewById, 0);
        }
        TitleDescriptionEditor titleDescriptionEditor = (TitleDescriptionEditor) A0D.findViewById(R.id.title_description_editor);
        titleDescriptionEditor.A0I = this;
        titleDescriptionEditor.A0N = false;
        this.A03 = titleDescriptionEditor;
        registerLifecycleListener(titleDescriptionEditor);
        AnonymousClass0fD.A09(699926701, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-28152975);
        TitleDescriptionEditor titleDescriptionEditor = this.A03;
        if (titleDescriptionEditor == null) {
            0qQ.A0F("titleDescriptionEditor");
            throw AnonymousClass00P.createAndThrow();
        }
        unregisterLifecycleListener(titleDescriptionEditor);
        super.onDestroyView();
        AnonymousClass0fD.A09(283772258, A022);
    }
}
