package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.modal.ModalActivity;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.E5e  reason: case insensitive filesystem */
public final class C47499E5e extends AnonymousClass4DH implements C230222pE {
    public static final String __redex_internal_original_name = "GroupMentionUserListFragment";
    public View A00;
    public View A01;
    public RecyclerView A02;
    public G8X A03;
    public AnonymousClass32A A04;
    public User A05;
    public String A06;
    public String A07;
    public List A08 = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A09 = AnonymousClass1YB.A00(new C66297MMg(this, 40));
    public final AnonymousClass0eM A0A = AnonymousClass1YB.A00(new C66297MMg(this, 41));
    public final AnonymousClass0eM A0B = AnonymousClass1YB.A00(new C66297MMg(this, 42));
    public final AnonymousClass0eM A0C = AnonymousClass1YB.A00(G2H.A00);
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E = AnonymousClass1YB.A00(G2I.A00);

    public final /* synthetic */ void DcC(Reel reel) {
    }

    public final /* synthetic */ void Dcl(Reel reel) {
    }

    public final String getModuleName() {
        return "ig_group_mention_user_list";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A01 = view.requireViewById(R.id.spinner);
        this.A00 = view.requireViewById(R.id.divider);
        RecyclerView A0I = DbT.A0I(view, R.id.group_mention_sticker_users);
        Dba.A17(A0I, this.A0A);
        DbU.A15(requireContext(), A0I, 1, false);
        this.A02 = A0I;
        AnonymousClass0eM r4 = this.A0D;
        AnonymousClass32A r1 = new AnonymousClass32A(this, AnonymousClass7TE.A0l(r4), DbV.A0f(this));
        this.A04 = r1;
        r1.A0C = AnonymousClass7TF.A0b();
        0lg A0X = DbT.A0X(r4);
        String str2 = ((C387339m3) this.A0B.getValue()).A04;
        0qQ.A0B(A0X, 0);
        0qQ.A0B(str2, 1);
        1NY A0b = AnonymousClass7TG.A0b(A0X);
        A0b.A0A("stories/group_mention_stickers/details/");
        A0b.A9m("sticker_id", str2);
        C47696EDf.A00(this, DbU.A0S(A0b, CER.class, C45576Cyo.class), 22);
        if (this.mView != null) {
            View view2 = this.A01;
            if (view2 == null) {
                str = "spinner";
            } else {
                view2.setVisibility(0);
                View view3 = this.A00;
                if (view3 == null) {
                    str = "divider";
                } else {
                    view3.setVisibility(8);
                    RecyclerView recyclerView = this.A02;
                    if (recyclerView == null) {
                        str = "mentionedUsersRecyclerView";
                    } else {
                        recyclerView.setVisibility(8);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DFj(Reel reel, AnonymousClass6UY r3) {
        ((2Rw) this.A0A.getValue()).notifyDataSetChanged();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final void A00(User user) {
        requireView();
        AnonymousClass0eM r0 = this.A0D;
        Bundle A012 = C46447Df9.A02().A01(AnonymousClass7TE.A0l(r0), C46474Dfc.A01(AnonymousClass7TE.A0l(r0), user.getId(), "group_mention_user_list_user_row", "ig_group_mention_user_list"));
        DbU.A1K(this, DbS.A0b(getActivity(), A012, DbT.A0X(r0), ModalActivity.class, "profile"));
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        String string;
        User parcelable;
        int A022 = AnonymousClass0fD.A02(621284407);
        C47499E5e.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        String str = null;
        if (bundle2 != null) {
            str = bundle2.getString(C273654mx.A00(154));
        }
        if (str != null) {
            this.A06 = str;
            Bundle bundle3 = this.mArguments;
            if (bundle3 == null || (string = bundle3.getString(C273654mx.A00(155))) == null) {
                illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                i = -1963200226;
            } else {
                this.A07 = string;
                Bundle bundle4 = this.mArguments;
                if (bundle4 == null || (parcelable = bundle4.getParcelable(C273654mx.A00(156))) == null) {
                    illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
                    i = -1896077776;
                } else {
                    this.A05 = parcelable;
                    AnonymousClass0fD.A09(-567123401, A022);
                    return;
                }
            }
        } else {
            illegalStateException = AnonymousClass7TE.A0z("Required value was null.");
            i = 897302171;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1095873783);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.group_mention_user_list_sheet_fragment, false);
        AnonymousClass0fD.A09(-1626449654, A022);
        return A0D2;
    }
}
