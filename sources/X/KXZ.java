package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.igds.components.checkbox.IgdsCheckBox;
import java.io.Serializable;

public final class KXZ extends K6S {
    public static final String __redex_internal_original_name = "PrivateStoryOnYourListAudiencePickerFragment";
    public C63766L5y A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void CtJ(C46448DfA dfA) {
    }

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(new LY1(this, 51), K6S.A01(r4, getString(2131956191)), r4);
    }

    public final String getModuleName() {
        return "close_friends_on_your_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        JTS.A0y(view, R.id.audience_picker_disclaimer_text);
        String A16 = AnonymousClass7TE.A16(requireContext, 2131956191);
        String A162 = AnonymousClass7TE.A16(requireContext, 2131969776);
        A09().A00 = new C63870L9z(requireContext, A16, A162, R.drawable.instagram_star_outline_96, false);
        K6S.A04(A0A(), DbX.A0l(AnonymousClass0t1.A01, this.A01));
        A0D();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final void A0C(IgdsCheckBox igdsCheckBox, C61036Jva jva) {
        AnonymousClass7TG.A1N(jva, igdsCheckBox);
        C63766L5y l5y = this.A00;
        if (l5y == null) {
            0qQ.A0F("waterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        C62574Ki7 ki7 = l5y.A00;
        if (ki7 != null) {
            boolean z = !igdsCheckBox.isChecked();
            igdsCheckBox.setChecked(z);
            boolean z2 = A0A().A01;
            LRl lRl = this.A03;
            lRl.A05(jva, JTP.A0j(z2 ? 1 : 0), z, z2);
            A09().A05(DbU.A0K(lRl.A03), 0sn.A00);
            LRl.A01(this, lRl);
            UserSession A0l = AnonymousClass7TE.A0l(this.A01);
            String str = ki7.A00;
            0qQ.A07(str);
            LHo.A01(A0l, "close_friends_on_your_list", str, jva.A02.getId(), z);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.07Z, androidx.fragment.app.Fragment, X.KXZ, java.lang.Object, X.K6S] */
    public final void A0D() {
        A09().A04(requireContext(), (View.OnClickListener) null, C320156rr.LOADING);
        Context requireContext = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        1OC A003 = LHo.A00(AnonymousClass7TE.A0l(this.A01), (Integer) null, (String) null, false, false);
        C61500KAf.A00(A003, this, 8);
        1ES.A00(requireContext, A002, A003);
    }

    public final boolean onBackPressed() {
        DbV.A0I(this).A0c();
        return true;
    }

    public final void onCreate(Bundle bundle) {
        C62574Ki7 ki7;
        int A02 = AnonymousClass0fD.A02(-192327783);
        KXZ.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = new C63766L5y(this, AnonymousClass7TE.A0l(this.A01));
        Serializable serializable = requireArguments.getSerializable(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        if (serializable instanceof C62574Ki7) {
            ki7 = (C62574Ki7) serializable;
        } else {
            ki7 = null;
        }
        C63766L5y l5y = this.A00;
        if (l5y == null) {
            0qQ.A0F("waterfall");
            throw AnonymousClass00P.createAndThrow();
        }
        if (ki7 == null) {
            ki7 = C62574Ki7.UNKNOWN;
        }
        l5y.A00 = ki7;
        AnonymousClass0fD.A09(223935086, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1497380709);
        K6S.A03(this, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.layout_audience_picker, viewGroup, false);
        AnonymousClass0fD.A09(1625095233, A02);
        return inflate;
    }
}
