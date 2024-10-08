package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class NJ0 extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "RecsFromFriendsReceiverFragment";
    public ONF A00;
    public C67810MvE A01;
    public C60265JiM A02;
    public Long A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public RecyclerView A08;
    public final AnonymousClass0eM A09 = C227642jf.A02(this);

    public final void configureActionBar(2da r4) {
        0qQ.A0B(r4, 0);
        DbX.A1A(new C71396Ojv(this, 15), DbX.A0M(), r4);
        r4.setTitle("");
    }

    public final String getModuleName() {
        return "recs_from_friends_receiver";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View A0G = AnonymousClass7TF.A0G(view, R.id.recs_from_friends_receiver_headline);
        A0G.setPadding(A0G.getPaddingLeft(), 0, A0G.getPaddingRight(), AnonymousClass7TG.A02(requireContext()));
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.rff_follow_all_button);
        if (this.A07) {
            A0G2.setVisibility(8);
        } else {
            C71396Ojv.A00(A0G2, 16, this);
        }
        this.A08 = DbT.A0I(view, R.id.rff_receiver_recycler_view);
        UserSession A0l = AnonymousClass7TE.A0l(this.A09);
        FragmentActivity requireActivity = requireActivity();
        ONF onf = this.A00;
        if (onf != null) {
            this.A01 = new C67810MvE(requireActivity, this, A0l, onf, this.A03);
            RecyclerView recyclerView = this.A08;
            if (recyclerView != null) {
                recyclerView.setAdapter(A00());
            }
            RecyclerView recyclerView2 = this.A08;
            if (recyclerView2 != null) {
                recyclerView2.setLayoutManager(new GridLayoutManager(view.getContext(), 2));
            }
            RecyclerView recyclerView3 = this.A08;
            if (recyclerView3 != null) {
                recyclerView3.setItemAnimator((AnonymousClass3AS) null);
            }
            07U r3 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MHL(viewLifecycleOwner, r3, A0G, this, (AnonymousClass4D7) null, 23), AnonymousClass07a.A00(viewLifecycleOwner));
            ONF onf2 = this.A00;
            if (onf2 != null) {
                onf2.A01(this.A03, "full_screen_viewer", "recs_from_friends_receiver");
                return;
            }
        }
        0qQ.A0F("recsFromFriendsLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C67810MvE A00() {
        C67810MvE mvE = this.A01;
        if (mvE != null) {
            return mvE;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A09);
    }

    public final void onCreate(Bundle bundle) {
        String str;
        int A022 = AnonymousClass0fD.A02(1419530029);
        NJ0.super.onCreate(bundle);
        String string = requireArguments().getString("thread_name");
        String str2 = "";
        if (string == null) {
            string = str2;
        }
        this.A05 = string;
        String string2 = requireArguments().getString("recs_from_friends_user_ids");
        if (string2 == null) {
            string2 = str2;
        }
        this.A06 = string2;
        String string3 = requireArguments().getString("sender_id");
        if (string3 == null) {
            string3 = str2;
        }
        this.A04 = string3;
        C60265JiM jiM = new C60265JiM((C69625Np7) null, (DefaultConstructorMarker) null, 1);
        this.A02 = jiM;
        String str3 = this.A06;
        if (str3 != null) {
            AnonymousClass0eM r4 = this.A09;
            Object value = r4.getValue();
            0qQ.A0B(value, 1);
            AnonymousClass7TE.A1Z(new C66173MGk(value, jiM, str3, (AnonymousClass4D7) null, 10), C318116oQ.A00(jiM));
            String str4 = this.A04;
            if (str4 != null) {
                this.A07 = str4.equals(DbU.A0u(r4));
                this.A00 = new ONF(this, AnonymousClass7TE.A0l(r4));
                String string4 = requireArguments().getString("thread_user_id");
                if (string4 != null) {
                    str2 = string4;
                }
                String A0u = DbU.A0u(r4);
                String str5 = this.A04;
                if (str5 != null) {
                    if (!0qQ.A0K(A0u, str5)) {
                        str2 = DbU.A0u(r4);
                    }
                    this.A03 = DbV.A0q(str2);
                    AnonymousClass0fD.A09(620230662, A022);
                    return;
                }
            }
            str = "senderId";
        } else {
            str = "userIds";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1187971835);
        0qQ.A0B(layoutInflater, 0);
        NJ0.super.onCreateView(layoutInflater, viewGroup, bundle);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.recs_from_friends_receiver_fragment, false);
        AnonymousClass0fD.A09(-1902083816, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-752307341);
        super.onDestroyView();
        this.A08 = null;
        AnonymousClass0fD.A09(464700649, A022);
    }
}
