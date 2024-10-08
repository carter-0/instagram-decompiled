package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.draggableview.DraggableViewContainer;
import com.facebook.rtc.views.omnigrid.GridItemType;
import com.facebook.rtc.views.omnigrid.GridSelfViewLocation;
import com.facebook.rtc.views.omnigridview.OmniGridView;
import com.instagram.android.R;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PlV  reason: case insensitive filesystem */
public final class C73894PlV extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73894PlV(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass0eM A00(Object obj, int i) {
        return AnonymousClass1YB.A00(new C73894PlV(obj, i));
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context;
        int i;
        switch (this.A00) {
            case 0:
                return ((PMF) this.A01).A01.findViewById(16908336);
            case 1:
                return ((Context) this.A01).getDrawable(R.drawable.participants_grid_reconnecting_background);
            case 2:
                return ((Context) this.A01).getDrawable(R.drawable.participant_muted_badge_drawable);
            case 3:
                return JTP.A0k(((Context) this.A01).getResources(), R.dimen.abc_dropdownitem_icon_width);
            case 4:
                return Integer.valueOf(C51972G9s.A08((Context) this.A01));
            case 5:
                return ((Context) this.A01).getDrawable(R.drawable.instagram_microphone_off_outline_44);
            case 6:
                return Integer.valueOf(DbY.A01((Context) this.A01));
            case 7:
                return JTP.A0k(((Context) this.A01).getResources(), R.dimen.account_group_management_clickable_width);
            case 8:
                NgG ngG = (NgG) this.A01;
                ngG.A01 = true;
                C68166N3g n3g = ngG.A00;
                if (n3g != null) {
                    ngG.A06.invoke(Boolean.valueOf(AnonymousClass7TF.A1W(n3g.A03, GridItemType.SELF_VIEW)), C69265NiR.FRAME_RENDERED);
                }
                return C60340gF.A00;
            case 9:
                return ((C69110Nep) this.A01).A05.getString(2131976416);
            case 10:
                return new C71536OmX((C69110Nep) this.A01);
            case 11:
                return new C71537OmY((C69110Nep) this.A01);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C70526O9z((C69110Nep) this.A01);
            case 13:
                return Integer.valueOf(DbS.A02(((C69110Nep) this.A01).A05, 16));
            case 14:
                return ((C69110Nep) this.A01).A05.getString(2131976435);
            case 15:
                return Integer.valueOf(DbS.A02(((C69110Nep) this.A01).A05, 8));
            case 16:
                C69110Nep nep = (C69110Nep) this.A01;
                return new OWU(nep.A06, nep.A07, nep.A0C, DbX.A07(nep.A0J), DbX.A07(nep.A0M));
            case 17:
                return ((C69110Nep) this.A01).A06.getResources().getString(2131954475);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new C70588OCl(((C69110Nep) this.A01).A09);
            case 19:
                return Boolean.valueOf(AnonymousClass7TF.A1R((182.A01(0Tu.A05, ((C69110Nep) this.A01).A07, 36595900205959443L) > 1 ? 1 : (182.A01(0Tu.A05, ((C69110Nep) this.A01).A07, 36595900205959443L) == 1 ? 0 : -1))));
            case 20:
                C69110Nep nep2 = (C69110Nep) this.A01;
                int i2 = 2131972738;
                if (DbS.A04(0Tu.A05, nep2.A07, 36595900206418197L) == 3) {
                    i2 = 2131972731;
                }
                return nep2.A06.getResources().getString(i2);
            case 21:
                return 1Au.A00(((C69110Nep) this.A01).A07);
            case 22:
                C70977OTy oTy = (C70977OTy) this.A01;
                View findViewById = AnonymousClass7TE.A0c(oTy.A0B).findViewById(R.id.invite_page_back_button);
                0qQ.A0A(findViewById);
                NQx.A01(AnonymousClass7TE.A0m(findViewById), oTy, 29);
                return findViewById;
            case 23:
                return ((View) this.A01).findViewById(R.id.bottom_sheet_contents);
            case 24:
                C70977OTy oTy2 = (C70977OTy) this.A01;
                RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(AnonymousClass7TE.A0c(oTy2.A0B), R.id.add_users_recycler_view);
                recyclerView.setItemAnimator((AnonymousClass3AS) null);
                DbU.A15(recyclerView.getContext(), recyclerView, 1, false);
                recyclerView.A0S = true;
                Dba.A17(recyclerView, ((C70795OLq) oTy2.A05.getValue()).A08);
                AnonymousClass03j.A00(recyclerView, new C71492Olh(recyclerView, 4));
                recyclerView.requestApplyInsets();
                recyclerView.setFitsSystemWindows(true);
                return recyclerView;
            case 25:
                return AnonymousClass7TE.A0c(((C70977OTy) this.A01).A0B).findViewById(R.id.invite_divider);
            case 26:
                return AnonymousClass7TE.A0c(((C70977OTy) this.A01).A0B).findViewById(R.id.invite_title);
            case 27:
                C70977OTy oTy3 = (C70977OTy) this.A01;
                RecyclerView recyclerView2 = (RecyclerView) AnonymousClass7TE.A0b(AnonymousClass7TE.A0c(oTy3.A0B), R.id.participants_recycler_view);
                DbV.A1A(recyclerView2.getContext(), recyclerView2);
                Dba.A17(recyclerView2, oTy3.A09);
                recyclerView2.setHorizontalFadingEdgeEnabled(true);
                recyclerView2.setFadingEdgeLength(recyclerView2.getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_material));
                recyclerView2.A0S = true;
                recyclerView2.setNestedScrollingEnabled(false);
                return recyclerView2;
            case 28:
                C70977OTy oTy4 = (C70977OTy) this.A01;
                return DbT.A0C(LayoutInflater.from(oTy4.A02), C66583MXo.A0C(oTy4.A04), R.layout.layout_call_participants_sheet);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return AnonymousClass7TE.A0c(((C70977OTy) this.A01).A0B).findViewById(R.id.sheet_subtitle);
            case 30:
                return AnonymousClass7TE.A0c(((C70977OTy) this.A01).A0B).findViewById(R.id.sheet_title);
            case 31:
                C69091NeW neW = (C69091NeW) this.A01;
                context = neW.A00;
                i = 2131954480;
                if (182.A05(0Tu.A05, neW.A01)) {
                    i = 2131954479;
                    break;
                }
                break;
            case 32:
                C69091NeW neW2 = (C69091NeW) this.A01;
                context = neW2.A00;
                i = 2131954482;
                if (182.A05(0Tu.A05, neW2.A01)) {
                    i = 2131954483;
                    break;
                }
                break;
            case 33:
                PML pml = (PML) this.A01;
                View inflate = DbV.A0D(pml.A02).inflate(R.layout.layout_call_participants_floating_view, (ViewGroup) null, false);
                0qQ.A0C(inflate, "null cannot be cast to non-null type com.facebook.common.draggableview.DraggableViewContainer");
                DraggableViewContainer draggableViewContainer = (DraggableViewContainer) inflate;
                draggableViewContainer.A0C = false;
                draggableViewContainer.A0E = true;
                draggableViewContainer.A0M.add(pml.A04);
                return draggableViewContainer;
            case 34:
                return AnonymousClass7TF.A0G(((PML) this.A01).A02, R.id.call_participant_grid_container);
            case 35:
                return JTP.A0k((Resources) ((PML) this.A01).A0H.getValue(), R.dimen.achievements_list_container_height);
            case 36:
                return JTP.A0k((Resources) ((PML) this.A01).A0H.getValue(), R.dimen.avatar_size_ridiculously_xxlarge);
            case 37:
                PML pml2 = (PML) this.A01;
                View requireViewById = AnonymousClass7TE.A0c(pml2.A0B).requireViewById(R.id.call_participant_omni_grid);
                OmniGridView omniGridView = (OmniGridView) requireViewById;
                AnonymousClass0iw r10 = pml2.A06;
                0sK r15 = pml2.A0O;
                C70525O9y o9y = pml2.A08;
                0sL r14 = pml2.A0N;
                omniGridView.setItemDefinitions(DbY.A0q(2, new NEA(r10, o9y, r14, r15), C66581MXm.A13(new NEB(r10, o9y, pml2.A0M, pml2.A0L, r14, r15), 0), C66581MXm.A13(new NEA(r10, o9y, r14, r15), 1)), (ODG) null);
                0qQ.A07(requireViewById);
                0nA.A0p(omniGridView, new C73133PXS(pml2));
                omniGridView.setClipToOutline(true);
                omniGridView.setShouldInterceptChildTouchEventsForFloatingView(true);
                if (!pml2.A0P) {
                    return omniGridView;
                }
                C74291PsJ psJ = pml2.A05;
                List list = omniGridView.A0H.A0M;
                list.add(psJ);
                if (!omniGridView.isAttachedToWindow()) {
                    list.remove(psJ);
                    return omniGridView;
                }
                omniGridView.addOnAttachStateChangeListener(new I9x(2, omniGridView, omniGridView, pml2));
                return omniGridView;
            case 38:
                return ((C252063oV) ((PML) this.A01).A0G.getValue()).getView();
            case 39:
                return C66581MXm.A0T(((PML) this.A01).A02, R.id.call_participant_overlay_stub);
            case 40:
                return DbU.A05(((PML) this.A01).A02);
            case Seq.NULL_REFNUM:
                C70526O9z o9z = ((PML) this.A01).A09;
                if (o9z != null) {
                    return new C72268Ozd(o9z);
                }
                return null;
            case Seq.RefTracker.REF_OFFSET:
                OIG oig = ((OWU) this.A01).A07;
                NE8 A002 = NE8.A00(oig.A0D);
                int i3 = oig.A00;
                NE8 A003 = NE8.A00(i3);
                NE8 A004 = NE8.A00(i3);
                NE8 A005 = NE8.A00(oig.A0A);
                NE8 A006 = NE8.A00(oig.A0B);
                int i4 = oig.A06;
                NE8 A007 = NE8.A00(i4);
                NE8 A008 = NE8.A00(i4);
                NE8 A009 = NE8.A00(oig.A09);
                Integer num = AnonymousClass05K.A01;
                return new N4M(GridSelfViewLocation.TOP_RIGHT, (C69671Npt) A005, (C69671Npt) A006, (C69671Npt) A002, (C69671Npt) A003, (C69671Npt) A007, (C69671Npt) A008, (C69671Npt) A004, (C69671Npt) A009, (Object) new C68180N3v((Float) null, Float.valueOf(0.8f), num, num, (Integer) null, AnonymousClass05K.A00, (Integer) null, 6, 0, 0, 0, false, false, false), true, true, false, false, false);
            case 43:
                OWU owu = (OWU) this.A01;
                int i5 = owu.A07.A04;
                Integer num2 = AnonymousClass05K.A01;
                Integer num3 = num2;
                return N4M.A00((N4M) owu.A08.getValue(), (GridSelfViewLocation) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, new C68180N3v((Float) null, Float.valueOf(0.8f), num2, num3, (Integer) null, AnonymousClass05K.A00, Integer.valueOf(i5), 6, 0, 0, 0, false, false, false), 16383, false, false);
            case 44:
                OWU owu2 = (OWU) this.A01;
                OIG oig2 = owu2.A07;
                return new N4M((GridSelfViewLocation) null, (C69671Npt) NE8.A00(oig2.A0A), (C69671Npt) NE8.A00(oig2.A0B), (C69671Npt) null, (C69671Npt) null, (C69671Npt) NE8.A00(oig2.A06), (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (Object) new C68180N3v(Float.valueOf(0.2f), (Float) null, JTP.A0j(AnonymousClass7TF.A1Z(owu2.A0H) ? 1 : 0), AnonymousClass05K.A01, (Integer) null, AnonymousClass05K.A0C, (Integer) null, 6, 0, 0, 0, false, false, true), 15596, true, true, false, false);
            case 45:
                OIG oig3 = ((OWU) this.A01).A07;
                NE8 A0010 = NE8.A00(oig3.A00);
                int i6 = oig3.A0C;
                return new N4M(GridSelfViewLocation.BOTTOM_RIGHT, (C69671Npt) null, (C69671Npt) null, (C69671Npt) NE8.A00(0), (C69671Npt) NE8.A00(0), (C69671Npt) NE8.A00(i6), (C69671Npt) NE8.A00(i6), (C69671Npt) A0010, (C69671Npt) NE8.A00(oig3.A09), (Object) null, 22275, false, false, false, false);
            case 46:
                OIG oig4 = ((OWU) this.A01).A07;
                NE8 A0011 = NE8.A00(oig4.A0D);
                int i7 = oig4.A00;
                NE8 A0012 = NE8.A00(i7);
                NE8 A0013 = NE8.A00(i7);
                NE8 A0014 = NE8.A00(oig4.A0A);
                NE8 A0015 = NE8.A00(oig4.A0B);
                int i8 = oig4.A01;
                NE8 A0016 = NE8.A00(i8);
                NE8 A0017 = NE8.A00(i8);
                NE8 A0018 = NE8.A00(oig4.A09);
                Integer num4 = AnonymousClass05K.A01;
                return new N4M(GridSelfViewLocation.TOP_RIGHT, (C69671Npt) A0014, (C69671Npt) A0015, (C69671Npt) A0011, (C69671Npt) A0012, (C69671Npt) A0016, (C69671Npt) A0017, (C69671Npt) A0013, (C69671Npt) A0018, (Object) new C68180N3v((Float) null, (Float) null, num4, num4, Integer.valueOf(oig4.A02), num4, (Integer) null, 6, 0, 0, 0, false, false, false), true, true, false, false, false);
            case 47:
                OIG oig5 = ((OWU) this.A01).A07;
                NE8 A0019 = NE8.A00(oig5.A00);
                int i9 = oig5.A0C;
                return new N4M(GridSelfViewLocation.BOTTOM_RIGHT, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) null, (C69671Npt) NE8.A00(i9), (C69671Npt) NE8.A00(i9), (C69671Npt) A0019, (C69671Npt) NE8.A00(oig5.A09), (Object) null, 21263, false, false, true, false);
            case 48:
                C71743Oq3 oq3 = (C71743Oq3) this.A01;
                oq3.A07 = true;
                AnonymousClass0eM r1 = oq3.A0A;
                C67678MsE msE = new C67678MsE(AnonymousClass7TE.A0S(AnonymousClass7TE.A0c(r1)), oq3);
                C66583MXo.A0C(r1).addView(msE, -1, -1);
                return msE;
            default:
                FrameLayout frameLayout = new FrameLayout((Context) this.A01);
                frameLayout.setBackgroundColor(-16777216);
                C51968G9o.A1D(frameLayout, -1);
                return frameLayout;
        }
        return context.getString(i);
    }
}
