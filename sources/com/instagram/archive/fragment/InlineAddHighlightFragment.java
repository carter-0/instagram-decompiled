package com.instagram.archive.fragment;

import X.0Tu;
import X.0f9;
import X.0lg;
import X.0nA;
import X.0nY;
import X.0qQ;
import X.0wj;
import X.1OC;
import X.1Xj;
import X.1iA;
import X.2Yu;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass3BN;
import X.AnonymousClass3BQ;
import X.AnonymousClass3BT;
import X.AnonymousClass3HO;
import X.AnonymousClass3O9;
import X.AnonymousClass738;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C240373Kq;
import X.C249703kE;
import X.C255943uy;
import X.C317776no;
import X.C318876pg;
import X.C322126vI;
import X.C322946wf;
import X.C60005JdE;
import X.C60459Jlr;
import X.C60704Jpp;
import X.C62539KhV;
import X.C63920LCw;
import X.C64499Ld0;
import X.C64500Ld1;
import X.C64501Ld2;
import X.C64504Ld5;
import X.C64505Ld6;
import X.C64885Ljl;
import X.C66521MUz;
import X.C71662eb;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbX;
import X.DbY;
import X.JTO;
import X.JTQ;
import X.KIe;
import X.LWR;
import X.LYC;
import X.MRX;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.api.schemas.HighlightReelTypeStr;
import com.instagram.api.schemas.IGUserHighlightsTrayType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InlineAddHighlightFragment extends C240373Kq implements C317776no, C322946wf {
    public UserSession A00;
    public Integer A01;
    public String A02;
    public int A03;
    public C322126vI A04;
    public C63920LCw A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public TextView mActionButton;
    public View mCreateHighlightCardCoverImage;
    public CircularImageView mCreateHighlightCoverImage;
    public EditText mCreateHighlightEditText;
    public View mCreateHighlightView;
    public ViewStub mCreateHighlightViewStub;
    public C66521MUz mDelegate;
    public C71662eb mHeaderBackButtonStubHolder;
    public TextView mHeaderText;
    public SpinnerImageView mLoadingSpinner;
    public RecyclerView mTrayRecyclerView;
    public View mView;

    public final void AUz() {
    }

    public final boolean CJl() {
        return false;
    }

    public final boolean CKZ() {
        return false;
    }

    public final void CLl(String str) {
    }

    public final boolean Cdz(Reel reel) {
        return false;
    }

    public final void Cmq() {
    }

    public final void D0J(Reel reel) {
    }

    public final void D6h(View view) {
        A05(true);
    }

    public final void DBv() {
    }

    public final void DIR() {
    }

    public final /* synthetic */ void DJP(boolean z) {
    }

    public final /* synthetic */ void DJR(boolean z) {
    }

    public final /* synthetic */ void DR6() {
    }

    public final void DTT(Reel reel) {
    }

    public final void DU2() {
    }

    public final void DVw() {
    }

    public final /* synthetic */ void DWD(long j, int i) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* synthetic */ void DWE(long j) {
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DcY(C62539KhV khV, String str) {
    }

    public final /* synthetic */ void DcZ(Reel reel, AnonymousClass3BN r2, int i) {
    }

    public final /* synthetic */ void Dcb(C249703kE r1, AnonymousClass3O9 r2, Integer num, String str, String str2, String str3, List list, float f, int i, int i2, boolean z) {
    }

    public final void Dcd(Reel reel, AnonymousClass3BN r2, Integer num, int i) {
    }

    public final void Dcf(List list, int i, String str) {
    }

    public final void Dci(String str) {
    }

    public final void Du3(int i) {
    }

    public final void E0D(C249703kE r1, Reel reel, Integer num, String str, String str2, List list) {
    }

    public final String getModuleName() {
        return "inline_add_to_highlight";
    }

    public static void A01(InlineAddHighlightFragment inlineAddHighlightFragment) {
        DbS.A1T(inlineAddHighlightFragment.mLoadingSpinner);
        Context requireContext = inlineAddHighlightFragment.requireContext();
        UserSession userSession = inlineAddHighlightFragment.A00;
        1OC r3 = AnonymousClass738.A05(requireContext, userSession, (Boolean) null, (Boolean) null, (Boolean) null, AnonymousClass05K.A0Y, (Integer) null, userSession.A06, false).A00;
        r3.A00 = new C318876pg(inlineAddHighlightFragment, inlineAddHighlightFragment.A00, true);
        inlineAddHighlightFragment.schedule(r3);
    }

    public static void A02(InlineAddHighlightFragment inlineAddHighlightFragment) {
        inlineAddHighlightFragment.mHeaderText.setText(2131964347);
        inlineAddHighlightFragment.mTrayRecyclerView.setVisibility(0);
        0nA.A0O(inlineAddHighlightFragment.mCreateHighlightView);
        inlineAddHighlightFragment.A04(AnonymousClass05K.A00);
        0nA.A0N(inlineAddHighlightFragment.mView);
        inlineAddHighlightFragment.mHeaderBackButtonStubHolder.A02();
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static void A03(InlineAddHighlightFragment inlineAddHighlightFragment, ImageUrl imageUrl) {
        if (imageUrl == null) {
            imageUrl = inlineAddHighlightFragment.mDelegate.Arz(inlineAddHighlightFragment.requireContext());
        }
        if (inlineAddHighlightFragment.A0A) {
            int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            View view = inlineAddHighlightFragment.mCreateHighlightView;
            view.getClass();
            ((C60005JdE) new C60704Jpp(view).A08.getValue()).A02(imageUrl, "inline_add_to_highlight");
            return;
        }
        CircularImageView circularImageView = inlineAddHighlightFragment.mCreateHighlightCoverImage;
        if (circularImageView != null) {
            circularImageView.setUrl(imageUrl, inlineAddHighlightFragment);
            if (!inlineAddHighlightFragment.A08) {
                inlineAddHighlightFragment.mCreateHighlightCoverImage.setRotation((float) inlineAddHighlightFragment.A03);
            }
            if (inlineAddHighlightFragment.A07) {
                ? r2 = inlineAddHighlightFragment.mCreateHighlightCoverImage;
                r2.setScaleY(r2.getScaleY() * -1.0f);
                return;
            }
            return;
        }
        0f9 AEf = 0wj.A01.AEf("InlineAddHighlightFragment mCreateHighlightCoverImage is null", 817905059);
        AEf.ABR("mCreateHighlightView is null", DbW.A1a(inlineAddHighlightFragment.mCreateHighlightView));
        AEf.ABQ("imageUrl", imageUrl.getUrl());
        AEf.report();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View, java.lang.Object] */
    private void A05(boolean z) {
        this.mHeaderText.setText(2131956869);
        if (this.mCreateHighlightView == null) {
            View inflate = this.mCreateHighlightViewStub.inflate();
            this.mCreateHighlightView = inflate;
            this.mCreateHighlightCoverImage = (CircularImageView) inflate.requireViewById(R.id.highlight_cover_image);
            this.mCreateHighlightCardCoverImage = this.mCreateHighlightView.requireViewById(R.id.highlight_card_cover_image);
            EditText editText = (EditText) this.mCreateHighlightView.requireViewById(R.id.highlight_title);
            this.mCreateHighlightEditText = editText;
            0qQ.A0B(editText, 0);
            editText.addTextChangedListener(new LWR(editText, (MRX) null));
        }
        boolean z2 = this.A0A;
        int i = 0;
        ? r0 = this.mCreateHighlightCoverImage;
        r0.getClass();
        if (z2) {
            r0.setVisibility(8);
            View view = this.mCreateHighlightCardCoverImage;
            view.getClass();
            view.setVisibility(0);
        } else {
            r0.setVisibility(0);
            View view2 = this.mCreateHighlightCardCoverImage;
            view2.getClass();
            view2.setVisibility(8);
        }
        this.mCreateHighlightView.setVisibility(0);
        String str = this.A06;
        this.mCreateHighlightEditText.getClass();
        if (str != null) {
            this.mCreateHighlightEditText.setText(str);
        } else {
            EditText editText2 = this.mCreateHighlightEditText;
            editText2.setText(AnonymousClass7TF.A0f(editText2).trim());
        }
        this.mCreateHighlightEditText.requestFocus();
        0nA.A0Q(this.mCreateHighlightEditText);
        if (DbY.A1Y(0Tu.A05, this.A00, 36323436070448286L)) {
            0nY.A00().ATE(new KIe(requireContext(), this));
        } else {
            A03(this, (ImageUrl) null);
        }
        A04(AnonymousClass05K.A01);
        C71662eb r02 = this.mHeaderBackButtonStubHolder;
        if (!z) {
            i = 8;
        }
        r02.A03(i);
        this.mTrayRecyclerView.setVisibility(8);
    }

    public final /* bridge */ /* synthetic */ 0lg A0M() {
        return this.A00;
    }

    public final /* synthetic */ int C8o() {
        return 0;
    }

    public final /* synthetic */ boolean CKY() {
        return false;
    }

    public final void DJQ(boolean z) {
        this.mLoadingSpinner.setLoadingStatus(C255943uy.FAILED);
        LYC.A00(this.mLoadingSpinner, 35, this);
    }

    public final void DJS(AnonymousClass3HO r7, List list, boolean z) {
        JTO.A1X(this.mLoadingSpinner);
        boolean A1W = AnonymousClass7TF.A1W(r7.FH3().A01, IGUserHighlightsTrayType.CARDS);
        this.A0A = A1W;
        this.A04.A09(A1W);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Reel reel = (Reel) it.next();
            HighlightReelTypeStr highlightReelTypeStr = reel.A09;
            if (!(highlightReelTypeStr == HighlightReelTypeStr.FAN_CLUB || highlightReelTypeStr == HighlightReelTypeStr.FAN_CLUB_WELCOME_FEEDBACK_STORY || reel.A0l())) {
                A1C.add(reel);
            }
        }
        if (A1C.isEmpty()) {
            A05(false);
            return;
        }
        this.mDelegate.DOL(this.A04, A1C);
        A02(this);
    }

    public final void Dca(C249703kE r4, AnonymousClass3O9 r5, Integer num, String str, String str2, List list, int i, boolean z) {
        C322126vI r1 = this.A04;
        0qQ.A0B(str, 0);
        AnonymousClass3BT A002 = C322126vI.A00(r1, str);
        if (A002 == null || !A002.A02) {
            this.A02 = str;
            this.A05.A00((1Xj) null, !this.A08);
            return;
        }
        this.mDelegate.DcI(this, this, str, true);
    }

    private void A04(Integer num) {
        int i;
        int A072;
        int A022;
        int A0H;
        if (num.intValue() != 0) {
            i = 2131952258;
            A072 = R.color.design_dark_default_color_on_background;
            A022 = R.color.badge_color;
            A0H = R.color.blue_6;
        } else {
            i = 2131954722;
            A072 = 2Yu.A07(requireContext());
            A022 = 2Yu.A02(requireContext());
            A0H = 2Yu.A0H(requireContext(), R.attr.backgroundColorSecondary);
        }
        this.mActionButton.setText(i);
        DbT.A17(requireContext(), this.mActionButton, A072);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, new ColorDrawable(JTQ.A03(this, A0H)));
        stateListDrawable.addState(new int[0], new ColorDrawable(JTQ.A03(this, A022)));
        this.mActionButton.setBackground(stateListDrawable);
        this.A01 = num;
    }

    public final void onCreate(Bundle bundle) {
        C66521MUz ld1;
        int A022 = AnonymousClass0fD.A02(-1374168497);
        InlineAddHighlightFragment.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A00 = DbX.A0U(this);
        String string = requireArguments.getString("current_reel_item_media_id");
        int i = requireArguments.getInt("initial_selected_media_width");
        int i2 = requireArguments.getInt("initial_selected_media_height");
        if (string != null) {
            1Xj A0U = DbV.A0U(this.A00, string);
            if (A0U != null) {
                this.A08 = AnonymousClass7TF.A1W(A0U.BR7(), 1iA.A0a);
            }
            Parcelable parcelable = requireArguments.getParcelable("initial_selected_media_url");
            Serializable serializable = requireArguments.getSerializable(AnonymousClass000.A00(1747));
            Context requireContext = requireContext();
            UserSession userSession = this.A00;
            parcelable.getClass();
            serializable.getClass();
            this.mDelegate = new C64501Ld2(requireContext, userSession, (ImageUrl) parcelable, A0U, (AnonymousClass3BQ) serializable, string);
        } else {
            String string2 = requireArguments.getString("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_FILE_PATH");
            string2.getClass();
            this.A08 = requireArguments.getBoolean("InlineAddHighlightFragment.ARG_CAPTURED_MEDIA_IS_VIDEO");
            if (requireArguments.getParcelable("InlineAddHighlightsFragment.ARG_INGEST_SESSION") != null) {
                ld1 = new C64499Ld0(requireContext(), this.A00, string2, i, i2, this.A08);
            } else {
                ld1 = new C64500Ld1(requireContext(), this.A00, string2, i, i2, this.A08);
            }
            this.mDelegate = ld1;
        }
        this.A07 = requireArguments.getBoolean("InlineAddHighlightsFragment.ARG_IS_MEDIA_MIRRORED");
        this.A03 = requireArguments.getInt("InlineAddHighlightsFragment.ARG_MEDIA_ROTATION_DEGREES");
        boolean z = requireArguments.getBoolean("is_in_story_creation_flow_tray", false);
        this.A09 = requireArguments.getBoolean("should_request_highlight_tray", true);
        this.A06 = requireArguments.getString("default_new_highlight_title");
        C322126vI r3 = new C322126vI(requireContext(), this, this.A00, AnonymousClass3BQ.PROFILE_HIGHLIGHTS_TRAY, true, z, false, true);
        this.A04 = r3;
        r3.A01 = this;
        this.A05 = new C63920LCw(requireContext(), new C64504Ld5(this), new C64505Ld6(this));
        AnonymousClass0fD.A09(-741290996, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1411186048);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_inline_add_highlight);
        AnonymousClass0fD.A09(699565540, A022);
        return A0C;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-81922871);
        InlineAddHighlightFragment.super.onDestroyView();
        InlineAddHighlightFragmentLifecycleUtil.cleanupReferences(this);
        AnonymousClass0fD.A09(-80153311, A022);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1qK, java.lang.Object] */
    public final void onDismiss(DialogInterface dialogInterface) {
        InlineAddHighlightFragment.super.onDismiss(dialogInterface);
        AnonymousClass1Nd.A00(this.A00).A00(new Object());
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-410223);
        InlineAddHighlightFragment.super.onPause();
        0nA.A0N(this.mView);
        AnonymousClass0fD.A09(26991, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mView = view;
        this.mCreateHighlightViewStub = DbU.A0D(view, R.id.inline_create_highlight_metadata_stub);
        C71662eb A0T = DbY.A0T(view, R.id.inline_create_highlight_back_button_stub);
        this.mHeaderBackButtonStubHolder = A0T;
        A0T.A02 = new C64885Ljl(this, 0);
        this.mHeaderText = DbU.A0G(view, R.id.header_text);
        TextView A0G = DbU.A0G(view, R.id.action_button);
        this.mActionButton = A0G;
        LYC.A00(A0G, 34, this);
        A04(AnonymousClass05K.A00);
        this.mTrayRecyclerView = DbT.A0I(view, R.id.highlights_reel_tray_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        this.mTrayRecyclerView.setLayoutManager(linearLayoutManager);
        linearLayoutManager.A0v(true);
        this.mTrayRecyclerView.A11(new C60459Jlr(this, AnonymousClass7TG.A04(requireContext()), 0));
        this.mTrayRecyclerView.setAdapter(this.A04);
        this.mTrayRecyclerView.setVisibility(8);
        this.mLoadingSpinner = DbX.A0k(this.mView);
        if (this.A09) {
            A01(this);
        } else {
            A05(false);
        }
    }

    public final /* synthetic */ boolean EsD(Integer num, int i, int i2) {
        return false;
    }
}
