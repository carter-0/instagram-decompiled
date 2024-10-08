package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.Ubk  reason: case insensitive filesystem */
public final class C15385Ubk extends AnonymousClass32G implements AnonymousClass4DS, X4C, AnonymousClass32K {
    public static final String __redex_internal_original_name = "SimilarHashtagsFragment";
    public UserSession A00;
    public E90 A01;
    public C320226s1 A02;
    public C230132oy A03;
    public Hashtag A04;
    public final C228172ku A05 = new C228172ku();
    public final C230152p2 A06 = new C19383WXa(this, 2);
    public final AbsListView.OnScrollListener A07 = new LZD(this, 1);
    public final C14029ToV A08 = new C14029ToV();
    public final X99 A09 = new WXP(this);

    public final String getModuleName() {
        return "see_all_suggested_hashtag_fragment";
    }

    public final /* bridge */ /* synthetic */ 0lg A0Y() {
        return this.A00;
    }

    public final C358248ab ALt(C358248ab r2) {
        r2.A0l(this, this.A00);
        return r2;
    }

    public final void configureActionBar(2da r2) {
        DbW.A1B(r2, 2131973897);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [java.lang.Object, X.G88] */
    public final void onCreate(Bundle bundle) {
        String encode;
        int A022 = AnonymousClass0fD.A02(-426318766);
        C15385Ubk.super.onCreate(bundle);
        this.A00 = DbX.A0U(this);
        Context requireContext = requireContext();
        this.A01 = new E90(requireActivity(), requireContext, this, this.A00, this.A08, this.A09, this, this, new Object(), (EEF) null, requireContext().getString(2131968395));
        Bundle bundle2 = this.mArguments;
        bundle2.getClass();
        Parcelable parcelable = bundle2.getParcelable("SimilarAccountsFragment.ARGUMENT_HASHTAG");
        parcelable.getClass();
        this.A04 = (Hashtag) parcelable;
        Context requireContext2 = requireContext();
        0gy A002 = AnonymousClass07i.A00(this);
        UserSession userSession = this.A00;
        this.A03 = new C230132oy(requireContext2, A002, this, userSession);
        String id = this.A04.getId();
        id.getClass();
        0jB r2 = new 0jB();
        C18766W0k.A03(r2, this.A04);
        0xF A003 = r2.A00();
        0qQ.A0B(userSession, 2);
        this.A02 = new C320226s1(this, userSession, id, "hashtag", "see_all_suggested_hashtag_fragment", 0j8.A03(A003));
        UserSession userSession2 = this.A00;
        String name = this.A04.getName();
        1NY A0O = DbU.A0O(userSession2);
        if (name == null) {
            encode = "";
        } else {
            encode = Uri.encode(name.trim());
        }
        DbU.A1P(A0O, "tags/%s/see_all_follow_chaining_recs/", new Object[]{encode});
        1OC A0S = DbT.A0S(A0O, UXK.class, C18224Vno.class);
        C15621Ufn.A00(A0S, this, 34);
        Dbb.A15(this, A0S);
        AnonymousClass0fD.A09(-621226355, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1124031527);
        View A0C = DbT.A0C(layoutInflater, viewGroup, R.layout.layout_listview);
        AnonymousClass0fD.A09(1844682398, A022);
        return A0C;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(16908298);
        A0V(this.A01);
        this.A05.A01(new C18909WCd(this.A01, this, this.A08, this.A02));
        findViewById.getClass();
        ((AbsListView) findViewById).setOnScrollListener(this.A07);
    }
}
