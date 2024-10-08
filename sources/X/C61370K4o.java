package X;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.K4o  reason: case insensitive filesystem */
public final class C61370K4o extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "StoryCommentLikesFragment";
    public final AnonymousClass0eM A00 = AnonymousClass1YB.A00(new MJ2(this, 18));
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final String getModuleName() {
        return AnonymousClass000.A00(4051);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        view.setPadding(0, 0, AnonymousClass7TG.A02(view.getContext()), 0);
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C58107ImT imT = new C58107ImT((Object) viewLifecycleOwner, (Object) r4, (Object) this, (AnonymousClass4D7) null, 24);
        19B r1 = 19B.A00;
        AnonymousClass07Z A0I = JTP.A0I(this, r1, imT, A002);
        1Eo.A05(r1, new C58107ImT((Object) A0I, (Object) r4, (Object) this, (AnonymousClass4D7) null, 25), AnonymousClass07a.A00(A0I));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C61370K4o() {
        MJ2 mj2 = new MJ2(this, 22);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new MJ2(new MJ2(this, 19), 20));
        this.A02 = DbS.A0I(new MJ2(A002, 21), mj2, new MJ5(4, (Object) null, A002), DbS.A0z(C53021GhC.class));
    }

    public final void configureActionBar(2da r3) {
        DbW.A1C(r3, JTT.A0B(this, r3).getString(2131974393));
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        int A022 = AnonymousClass0fD.A02(-1270420516);
        Context context = getContext();
        if (context != null) {
            recyclerView = new RecyclerView(context, (AttributeSet) null);
            C51968G9o.A1D(recyclerView, -1);
            DbV.A1B(recyclerView.getContext(), recyclerView);
            Dba.A17(recyclerView, this.A00);
        } else {
            recyclerView = null;
        }
        AnonymousClass0fD.A09(-2007790441, A022);
        return recyclerView;
    }
}
