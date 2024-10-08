package X;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.actionbar.ActionButton;
import com.instagram.android.R;

public final class E2Z extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "MultipleLinksReorderingFragment";
    public RecyclerView A00;
    public ActionButton A01;
    public E92 A02;
    public CardView A03;
    public final C355568Qm A04 = new C355568Qm(new C46807Dlj(this));
    public final AnonymousClass0eM A05 = C227642jf.A02(this);
    public final AnonymousClass0eM A06;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Jbl, java.lang.Object] */
    public final void configureActionBar(2da r6) {
        0qQ.A0B(r6, 0);
        boolean A002 = C49072Eoq.A00(AnonymousClass7TE.A0l(this.A05), true);
        ? obj = new Object();
        C59922Jbl.A02(DbV.A05(this), obj, 2131970028);
        ActionButton A003 = C59904JbT.A00(new C50100FOq(6, (Object) this, A002), r6, obj);
        A003.setEnabled(false);
        this.A01 = A003;
        DbX.A1A(new C50100FOq(7, (Object) this, A002), DbX.A0M(), r6);
    }

    public final String getModuleName() {
        return "multiple_links_reordering";
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [X.07Z, androidx.fragment.app.Fragment, X.E2Z, java.lang.Object, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        EPF epf;
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = new E92(new C59343JFv(this, 11));
        RecyclerView A0I = DbT.A0I(view, R.id.links_list);
        this.A00 = A0I;
        if (A0I != null) {
            E92 e92 = this.A02;
            if (e92 == null) {
                str = "adapter";
            } else {
                A0I.setAdapter(e92);
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setLayoutManager(new C46810Dlm(requireContext(), this));
                    C355568Qm r1 = this.A04;
                    RecyclerView recyclerView2 = this.A00;
                    if (recyclerView2 != null) {
                        r1.A0A(recyclerView2);
                        AnonymousClass0eM r5 = this.A06;
                        05G r0 = ((C46733DkM) r5.getValue()).A03;
                        19B r4 = 19B.A00;
                        C49597EzG ezG = (C49597EzG) C226292g8.A00(r4, r0).A02();
                        if (!(ezG == null || (epf = ezG.A00) == null)) {
                            View inflate = DbS.A0F(view, R.id.pinned_link_stub).inflate();
                            0qQ.A0C(inflate, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
                            CardView cardView = (CardView) inflate;
                            this.A03 = cardView;
                            str = "pinnedLinkView";
                            if (cardView != null) {
                                cardView.setCardElevation(0.0f);
                                CardView cardView2 = this.A03;
                                if (cardView2 != null) {
                                    AnonymousClass7TE.A0d(cardView2, R.id.link_title).setText(epf.A03);
                                    CardView cardView3 = this.A03;
                                    if (cardView3 != null) {
                                        int i = 1;
                                        AnonymousClass7TE.A0d(cardView3, R.id.link_title).setTypeface(Typeface.defaultFromStyle(1));
                                        CardView cardView4 = this.A03;
                                        if (cardView4 != null) {
                                            TextView A0d = AnonymousClass7TE.A0d(cardView4, R.id.link_sub_title);
                                            String str2 = epf.A02;
                                            A0d.setText(str2);
                                            CardView cardView5 = this.A03;
                                            if (cardView5 != null) {
                                                View findViewById = cardView5.findViewById(R.id.link_sub_title);
                                                if (!(str2 == null || str2.length() == 0)) {
                                                    i = 0;
                                                }
                                                findViewById.setVisibility(DbW.A00(i));
                                                CardView cardView6 = this.A03;
                                                if (cardView6 != null) {
                                                    ImageView A0G = DbS.A0G(cardView6, R.id.link_icon);
                                                    CardView cardView7 = this.A03;
                                                    if (cardView7 != null) {
                                                        DbU.A13(cardView7.getContext(), A0G, epf.A00);
                                                        CardView cardView8 = this.A03;
                                                        if (cardView8 != null) {
                                                            cardView8.findViewById(R.id.is_pinned_text).setVisibility(0);
                                                            CardView cardView9 = this.A03;
                                                            if (cardView9 != null) {
                                                                cardView9.findViewById(R.id.chevron_icon).setVisibility(8);
                                                                RecyclerView recyclerView3 = this.A00;
                                                                if (recyclerView3 != null) {
                                                                    ViewGroup.LayoutParams layoutParams = recyclerView3.getLayoutParams();
                                                                    0qQ.A0C(layoutParams, C273654mx.A00(3));
                                                                    C71492dQ r12 = (C71492dQ) layoutParams;
                                                                    CardView cardView10 = this.A03;
                                                                    if (cardView10 != null) {
                                                                        r12.A0t = cardView10.getId();
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        DbV.A1F(this, C226292g8.A00(r4, ((C46733DkM) r5.getValue()).A03), new G4S(this, 26), 38);
                        DbV.A1F(this, C226292g8.A00(r4, ((C46733DkM) r5.getValue()).A02), new G4S(this, 27), 38);
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("recyclerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public E2Z() {
        C51800G2j A002 = C51800G2j.A00(this, 45);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(0eO.A02, C51800G2j.A00(C51800G2j.A00(this, 42), 43));
        this.A06 = DbS.A0I(C51800G2j.A00(A003, 44), A002, new MJ4(36, (Object) null, A003), DbS.A0z(C46733DkM.class));
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(2081840045);
        E2Z.super.onCreate(bundle);
        Dbc.A0p(this);
        AnonymousClass0fD.A09(-532092475, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1954102618);
        0qQ.A0B(layoutInflater, 0);
        View A09 = DbW.A09(layoutInflater, viewGroup, R.layout.multiple_links_reordering, false);
        AnonymousClass0fD.A09(30210866, A022);
        return A09;
    }
}
