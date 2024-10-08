package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.AudienceList;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class K8H extends MYR implements C273494mf, C273414mX {
    public static final String __redex_internal_original_name = "AudienceListsListFragment";
    public C62671KkX A00;
    public MTR A01;
    public C63963LFo A02;
    public IngestSessionShim A03;
    public LOS A04 = new LOS((C62320sa) null);
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public List A0C;
    public boolean A0D;
    public final List A0E = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;

    public final /* synthetic */ void Cyf() {
    }

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "audience_lists_list_fragment";
    }

    public final /* synthetic */ void onBottomSheetClosed() {
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(requireView(), R.id.title);
        int i = 2131953253;
        if (this.A09) {
            i = 2131973642;
        }
        DbU.A1G(A0R, this, i);
        TextView A0R2 = AnonymousClass7TG.A0R(requireView(), R.id.create_list);
        if (this.A07) {
            A0R2.setText(2131956872);
            LY1.A00(A0R2, 38, this);
        } else {
            A0R2.setVisibility(8);
        }
        View A0G2 = AnonymousClass7TF.A0G(requireView(), R.id.back_button);
        if (this.A05) {
            LY1.A00(A0G2, 39, this);
            A0G2.setVisibility(0);
        } else {
            A0G2.setVisibility(8);
        }
        View A0G3 = AnonymousClass7TF.A0G(requireView(), R.id.share_story_button);
        if (this.A0A) {
            A0G3.setVisibility(0);
            LY1.A00(A0G3, 40, this);
        } else {
            A0G3.setVisibility(8);
        }
        A00(this);
        ConstraintLayout constraintLayout = (ConstraintLayout) AnonymousClass7TF.A0F(requireView(), R.id.recycler_view_container);
        C270354gb A0C2 = JTQ.A0C(constraintLayout);
        C270354gb.A02(A0C2, R.id.recycler_view).A03.A0z = true;
        C270354gb.A02(A0C2, R.id.recycler_view).A03.A0W = (int) (((float) 0nA.A05(requireContext())) * 0.5f);
        A0C2.A0G(constraintLayout);
        JTR.A0c(requireView(), R.id.recycler_view).setItemAnimator((AnonymousClass3AS) null);
        AnonymousClass0eM r4 = this.A0F;
        Dba.A16(getViewLifecycleOwner(), ((C60224Jhh) r4.getValue()).A00, new J6O(this, 13), 55);
        2YL A0H = DbS.A0H(r4);
        MG7.A01(A0H, C318116oQ.A00(A0H), 18);
    }

    public static final void A01(K8H k8h, AudienceListViewModel audienceListViewModel, Integer num) {
        AudienceList audienceList;
        if (audienceListViewModel != null) {
            boolean z = audienceListViewModel.A05;
            String str = audienceListViewModel.A01;
            String str2 = audienceListViewModel.A02;
            boolean z2 = audienceListViewModel.A06;
            audienceList = new AudienceList(str, str2, z, z2, z2);
        } else {
            audienceList = null;
        }
        LPM.A02(audienceList, k8h, AnonymousClass7TE.A0l(k8h.A0G), num.intValue(), k8h.A0D);
    }

    public final void A0C(AudienceListViewModel audienceListViewModel) {
        C63963LFo lFo = this.A02;
        if (lFo == null) {
            0qQ.A0F("logger");
            throw AnonymousClass00P.createAndThrow();
        }
        C62671KkX kkX = this.A00;
        if (kkX == null) {
            kkX = C62671KkX.LIST_SHEET;
        }
        lFo.A02(kkX, audienceListViewModel.A01, audienceListViewModel.A02);
        A01(this, audienceListViewModel, 58548288);
    }

    public final void Cyc() {
        MTR mtr = this.A01;
        if (mtr != null) {
            mtr.CwM(this.A0E, this.A0B);
        }
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(new J6O(this, 11));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public K8H() {
        C58710IwJ iwJ = new C58710IwJ(this, 36);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58710IwJ(new C58710IwJ(this, 38), 39));
        this.A0F = DbS.A0I(new C58710IwJ(A002, 40), iwJ, new C58188Ins(8, (Object) null, A002), DbS.A0z(C60224Jhh.class));
        this.A0G = C227642jf.A02(this);
    }

    public static final void A00(K8H k8h) {
        AnonymousClass7TF.A0G(k8h.requireView(), R.id.share_story_button).setEnabled(AnonymousClass7TE.A1b(k8h.A0E));
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C61645KFv(requireContext(), this, this, this.A06));
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final boolean isScrolledToTop() {
        return C2808154f.A05(getRecyclerView());
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        List list;
        List<AudienceListViewModel> list2;
        ArrayList arrayList;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i2 == -1) {
            if (i == 58548288) {
                ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("audience_list_view_models");
                if (parcelableArrayListExtra != null) {
                    ((C60224Jhh) this.A0F.getValue()).A01.A01(parcelableArrayListExtra, false);
                    list2 = this.A0E;
                    ArrayList A0p = AnonymousClass7TF.A0p(list2);
                    for (AudienceListViewModel audienceListViewModel : list2) {
                        A0p.add(audienceListViewModel.A01);
                    }
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    Iterator it = parcelableArrayListExtra.iterator();
                    while (it.hasNext()) {
                        Object next = it.next();
                        JTR.A1R(((AudienceListViewModel) next).A01, next, A1C, A0p);
                    }
                    arrayList = 00k.A0U(A1C);
                } else {
                    AudienceListViewModel audienceListViewModel2 = (AudienceListViewModel) intent.getParcelableExtra(AnonymousClass000.A00(1911));
                    if (audienceListViewModel2 != null) {
                        ((C60224Jhh) this.A0F.getValue()).A00(audienceListViewModel2, false);
                        list2 = this.A0E;
                        arrayList = AnonymousClass7TF.A0p(list2);
                        for (AudienceListViewModel audienceListViewModel3 : list2) {
                            if (0qQ.A0K(audienceListViewModel3.A01, audienceListViewModel2.A01)) {
                                audienceListViewModel3 = audienceListViewModel2;
                            }
                            arrayList.add(audienceListViewModel3);
                        }
                    }
                }
                list2.clear();
                list2.addAll(arrayList);
            } else if (i == 101232125) {
                ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra("audience_list_view_models");
                if (parcelableArrayListExtra2 != null) {
                    ((C60224Jhh) this.A0F.getValue()).A01.A01(parcelableArrayListExtra2, true);
                }
                C2808154f.A01(getRecyclerView(), true);
            } else if (i == 1000) {
                AnonymousClass0eM r4 = this.A0F;
                C59721JVf jVf = (C59721JVf) ((C60224Jhh) r4.getValue()).A00.A02();
                if (jVf != null && (list = (List) jVf.A00) != null) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (Object next2 : list) {
                        if (((AudienceListViewModel) next2).A05) {
                            A1C2.add(next2);
                        }
                    }
                    AudienceListViewModel audienceListViewModel4 = (AudienceListViewModel) 00k.A0O(A1C2, 0);
                    if (audienceListViewModel4 != null) {
                        ((C60224Jhh) r4.getValue()).A00(new AudienceListViewModel(audienceListViewModel4.A01, audienceListViewModel4.A02, audienceListViewModel4.A03, intent.getIntExtra("private_story_audience_member_count", audienceListViewModel4.A00), audienceListViewModel4.A05, audienceListViewModel4.A06, false), false);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            A00(this);
        }
    }

    public final void onCreate(Bundle bundle) {
        C62671KkX kkX;
        int A022 = AnonymousClass0fD.A02(-550564365);
        K8H.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        IngestSessionShim ingestSessionShim = (IngestSessionShim) requireArguments.getParcelable(C62528KhK.SHARE_TO_STORY_BUTTON.toString());
        this.A03 = ingestSessionShim;
        this.A0A = AnonymousClass7TF.A1V(ingestSessionShim);
        this.A07 = requireArguments.getBoolean(C62528KhK.UPPER_RIGHT_CREATE_AUDIENCE_LIST_BUTTON.toString());
        this.A05 = requireArguments.getBoolean(C62528KhK.BACK_BUTTON_ENABLED.toString());
        this.A06 = requireArguments.getBoolean(C62528KhK.CAN_SELECT_AUDIENCE_LISTS.toString());
        this.A0C = requireArguments.getStringArrayList(C62528KhK.FILTER_AUDIENCE_LISTS.toString());
        this.A09 = requireArguments.getBoolean(C62528KhK.SET_TITLE_SHARED_TO.toString());
        this.A0D = requireArguments.getBoolean(C62528KhK.DELETE_OPTION_ENABLED.toString());
        Serializable serializable = requireArguments.getSerializable(C62528KhK.LOGGING_ENTRY_POINT.toString());
        if (serializable instanceof C62671KkX) {
            kkX = (C62671KkX) serializable;
        } else {
            kkX = null;
        }
        this.A00 = kkX;
        this.A08 = requireArguments.getBoolean(C62528KhK.IS_FROM_SHARE_SHEET.toString());
        this.A02 = new C63963LFo(this, AnonymousClass7TE.A0l(this.A0G));
        ((C60224Jhh) this.A0F.getValue()).A01.A00 = this.A0C;
        AnonymousClass0fD.A09(1771154448, A022);
    }
}
