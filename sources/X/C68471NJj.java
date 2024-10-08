package X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.direct.fragment.thread.poll.view.PollMessageOptionViewModel;
import java.util.Arrays;

/* renamed from: X.NJj  reason: case insensitive filesystem */
public final class C68471NJj extends AnonymousClass4DH implements C74393Pu9 {
    public static final String __redex_internal_original_name = "DirectPollMessageOptionVotersFragment";
    public AnonymousClass2t9 A00;
    public PollMessageOptionViewModel A01;
    public C60226Jhj A02;
    public boolean A03;
    public boolean A04;
    public ViewGroup A05;
    public LinearLayoutManager A06;
    public RecyclerView A07;
    public boolean A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);
    public final float[] A0A = new float[8];

    public final String getModuleName() {
        return "direct_poll_message_options_voters";
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.2tF, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A05 = DbU.A0C(view, R.id.poll_message_option_voters_root_container);
        this.A07 = DbT.A0I(view, R.id.poll_message_option_voters_recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 1, false);
        this.A06 = linearLayoutManager;
        RecyclerView recyclerView = this.A07;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(linearLayoutManager);
        }
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new KFG(this));
        AnonymousClass2t9 A0U = DbU.A0U(A0S, new Object());
        this.A00 = A0U;
        String str = "optionViewModel";
        if (this.A08) {
            C60226Jhj jhj = this.A02;
            if (jhj != null) {
                Dba.A15(getViewLifecycleOwner(), jhj.A00, new C73934PmE(this, 14), 48);
                RecyclerView recyclerView2 = this.A07;
                if (recyclerView2 != null) {
                    JTQ.A0y(recyclerView2.A0D, recyclerView2, new C72693PFx(this, 3), C3251771i.A0A);
                }
                C60226Jhj jhj2 = this.A02;
                if (jhj2 != null) {
                    PollMessageOptionViewModel pollMessageOptionViewModel = this.A01;
                    if (pollMessageOptionViewModel != null) {
                        jhj2.A00(true, pollMessageOptionViewModel.A03, String.valueOf(pollMessageOptionViewModel.A01));
                    }
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            str = "directPollMessageOptionVotersViewModel";
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        ViewModelListUpdate A0R = DbS.A0R();
        PollMessageOptionViewModel pollMessageOptionViewModel2 = this.A01;
        if (pollMessageOptionViewModel2 != null) {
            A0R.A01(pollMessageOptionViewModel2.A05);
            A0U.A05(A0R);
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
        RecyclerView recyclerView3 = this.A07;
        if (recyclerView3 != null) {
            AnonymousClass2t9 r0 = this.A00;
            if (r0 == null) {
                0qQ.A0F("adapter");
                throw AnonymousClass00P.createAndThrow();
            }
            recyclerView3.setAdapter(r0);
        }
        C71401Ok0.A01(AnonymousClass7TF.A0G(view, R.id.poll_message_back_button), 68, this);
        TextView A0R2 = AnonymousClass7TG.A0R(view, R.id.poll_message_option_text);
        PollMessageOptionViewModel pollMessageOptionViewModel3 = this.A01;
        if (pollMessageOptionViewModel3 != null) {
            A0R2.setText(pollMessageOptionViewModel3.A04);
            A0R2.setContentDescription(A0R2.getContentDescription());
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final boolean isScrolledToTop() {
        LinearLayoutManager linearLayoutManager = this.A06;
        if (linearLayoutManager != null) {
            return C2808154f.A03(linearLayoutManager);
        }
        0qQ.A0F("linearLayoutManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        ViewGroup viewGroup = this.A05;
        if (viewGroup != null) {
            float A002 = C66583MXo.A00(((float) i) / 0.0f);
            float[] fArr = this.A0A;
            Arrays.fill(fArr, 0, 4, 0.0f * A002);
            Drawable background = viewGroup.getBackground();
            0qQ.A0C(background, C273654mx.A00(0));
            ((GradientDrawable) background).setCornerRadii(fArr);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.NJj, X.07g, androidx.fragment.app.Fragment] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2067947723);
        C68471NJj.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        PollMessageOptionViewModel pollMessageOptionViewModel = (PollMessageOptionViewModel) requireArguments.getParcelable("DirectPollMessageVotersFragment_OPTION_VIEW_MODEL");
        if (pollMessageOptionViewModel != null) {
            this.A01 = pollMessageOptionViewModel;
            this.A08 = requireArguments.getBoolean("DirectPollMessageVotersFragment_ARGS_IS_BROADCAST_CHAT_THREAD");
            this.A02 = new 2YN(new C61538KBr(AnonymousClass7TE.A0l(this.A09)), this).A00(C60226Jhj.class);
            AnonymousClass0fD.A09(1715116458, A022);
            return;
        }
        IllegalArgumentException A0w = AnonymousClass7TE.A0w("voters info can't be null");
        AnonymousClass0fD.A09(-288534519, A022);
        throw A0w;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(183524056);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_direct_poll_message_option_voters, viewGroup, false);
        AnonymousClass0fD.A09(-594591923, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1331850425);
        super.onDestroyView();
        this.A05 = null;
        this.A07 = null;
        AnonymousClass0fD.A09(-1058104273, A022);
    }
}
