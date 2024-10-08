package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class K5R extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CutoutStickerGalleryCreationFragment";
    public Integer A00;
    public boolean A01;
    public C64968Ll7 A02;
    public final AnonymousClass0eM A03 = DbS.A0I(new MMT(this, 9), new MMT(this, 8), new MJ9(8, (Object) null, this), DbS.A0z(C60088JfU.class));
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final AnonymousClass8ML A05 = new C64958Lkx(this);

    public final String getModuleName() {
        return "cutout_sticker_gallery_creation";
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.K5R, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        boolean z;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            str = bundle2.getString("args_entry_point");
        } else {
            str = null;
        }
        this.A00 = C63130Kry.A00(str);
        Bundle bundle3 = this.mArguments;
        if (bundle3 != null) {
            z = bundle3.getBoolean("args_from_create_btn");
        } else {
            z = false;
        }
        this.A01 = z;
        0hq parentFragmentManager = getParentFragmentManager();
        parentFragmentManager.A0v(new WE4(7, (Object) parentFragmentManager, (Object) this), requireActivity(), AnonymousClass000.A00(144));
        ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0G(view, R.id.cutout_sticker_gallery_creation_stub);
        FragmentActivity requireActivity = requireActivity();
        Context requireContext = requireContext();
        UserSession A0l = AnonymousClass7TE.A0l(this.A04);
        0gy A002 = AnonymousClass07i.A00(this);
        requireContext().getColor(R.color.black_30_transparent);
        int width = C226132fh.A01(requireContext()).getWidth();
        AnonymousClass8ML r8 = this.A05;
        Integer num = this.A00;
        if (num == null) {
            0qQ.A0F("entryPoint");
            throw AnonymousClass00P.createAndThrow();
        }
        C64968Ll7 ll7 = new C64968Ll7(requireActivity, requireContext, viewStub, A002, this, A0l, r8, num, (Integer) null, width, false, this.A01);
        this.A02 = ll7;
        ll7.E0h();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        C64968Ll7 ll7 = this.A02;
        if (ll7 != null) {
            return ll7.CII();
        }
        0qQ.A0F("cutoutStickerGalleryController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(616710871);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_gallery_creation_fragment, viewGroup, false);
        AnonymousClass0fD.A09(244329022, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-349148251);
        super.onDestroyView();
        C64968Ll7 ll7 = this.A02;
        if (ll7 == null) {
            0qQ.A0F("cutoutStickerGalleryController");
            throw AnonymousClass00P.createAndThrow();
        }
        ll7.close();
        AnonymousClass0fD.A09(-1543981916, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1781516558);
        super.onResume();
        JTU.A0p(this, 8);
        C317756nm.A03(requireActivity(), (Fragment) null, AnonymousClass7TE.A0l(this.A04), false, false);
        C64968Ll7 ll7 = this.A02;
        if (ll7 == null) {
            0qQ.A0F("cutoutStickerGalleryController");
            throw AnonymousClass00P.createAndThrow();
        }
        if (ll7.A07 != null) {
            C64968Ll7.A06(ll7, false, false);
        }
        AnonymousClass0fD.A09(-2121751427, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1976387686);
        K5R.super.onStop();
        JTU.A0p(this, 0);
        if (!this.A01) {
            C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A04), false, false);
        }
        AnonymousClass0fD.A09(1438942664, A022);
    }
}
