package X;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.K5u  reason: case insensitive filesystem */
public final class C61400K5u extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "ClipsProfileTextEditingFragment";
    public IgSimpleImageView A00;
    public AnonymousClass80Q A01;
    public InteractiveDrawableContainer A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final String getModuleName() {
        return "clips_profile_text_editing_fragment";
    }

    public final boolean onBackPressed() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgSimpleImageView A0T = JTP.A0T(view, R.id.creation_image_container);
        A0T.setImageDrawable(Drawable.createFromPath(C320236s2.A01(requireArguments(), "ClipsConstants.ARG_CLIPS_COVER_IMAGE_FILE_PATH")));
        this.A00 = A0T;
        View requireViewById = view.requireViewById(R.id.text_edit_add_button);
        AnonymousClass0fU.A00(LYG.A01(this, requireViewById, 45), requireViewById);
        0qQ.A07(requireViewById);
        Activity rootActivity = getRootActivity();
        if (rootActivity != null) {
            JTR.A1C(view, R.id.text_edit_tools_stub);
            View A0F = DbY.A0F(requireView(), R.id.interactive_drawable_container_stub);
            0qQ.A0C(A0F, "null cannot be cast to non-null type com.instagram.ui.widget.interactive.InteractiveDrawableContainer");
            InteractiveDrawableContainer interactiveDrawableContainer = (InteractiveDrawableContainer) A0F;
            interactiveDrawableContainer.setMarginAlignmentGuideEnabled(false);
            this.A02 = interactiveDrawableContainer;
            C226112fe.A0B.A05(requireActivity(), new C41216AqE(rootActivity, view, requireViewById, this));
            InteractiveDrawableContainer interactiveDrawableContainer2 = this.A02;
            if (interactiveDrawableContainer2 != null) {
                interactiveDrawableContainer2.setVisibility(0);
                interactiveDrawableContainer2.A0O = true;
                interactiveDrawableContainer2.setLongPressEnabled(false);
                interactiveDrawableContainer2.A0y(new C57412IaI(requireViewById, 1));
                List list = (List) ((C61084JwM) ((C60123Jg4) this.A04.getValue()).A01.getValue()).A02;
                if (AnonymousClass7TE.A1b(list)) {
                    C3500282x r5 = interactiveDrawableContainer2.A0D;
                    Iterator it = list.iterator();
                    if (r5 != null) {
                        while (it.hasNext()) {
                            Object next = it.next();
                            0qQ.A0B(next, 0);
                            C3500783d r2 = ((ClipsCreationViewModel) r5).A0N;
                            List list2 = r2.A00;
                            list2.add(next);
                            r2.A0A.Epw(list2);
                            r2.A03.FIA(next);
                        }
                    } else {
                        while (it.hasNext()) {
                            interactiveDrawableContainer2.A0r.add(it.next());
                        }
                    }
                    InteractiveDrawableContainer.A07(interactiveDrawableContainer2);
                }
            }
            JTS.A1P(this.A01);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public C61400K5u() {
        0Yh A0z = DbS.A0z(C60123Jg4.class);
        this.A04 = DbS.A0I(C66296MMf.A00(this, 8), C66296MMf.A00(this, 9), MMY.A00(this, (Object) null, 26), A0z);
    }

    public final void configureActionBar(2da r4) {
        C59922Jbl A002 = C59922Jbl.A00(r4);
        A002.A02 = "";
        2eS.A01(C59904JbT.A00(new LYF((Object) this, 70), r4, A002));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(816367336);
        C61400K5u.super.onCreate(bundle);
        Window A0G = DbV.A0G(this);
        if (A0G != null) {
            A0G.setSoftInputMode(48);
        }
        AnonymousClass0fD.A09(162378587, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1313584568);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.clips_profile_text_edit_fragment, false);
        AnonymousClass0fD.A09(786896083, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-252868093);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A01;
        if (r0 != null) {
            AnonymousClass80R r2 = r0.A00;
            r2.A0v.A09.removeView(r2.A0U);
        }
        this.A02 = null;
        AnonymousClass0fD.A09(1205443807, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(2113699769);
        super.onResume();
        AnonymousClass80Q r0 = this.A01;
        if (r0 != null) {
            r0.A01();
        }
        AnonymousClass0fD.A09(1717223233, A022);
    }
}
