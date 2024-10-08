package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.avatars.store.AvatarStore;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import com.instagram.igds.components.search.IgdsInlineSearchBox;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.K4b  reason: case insensitive filesystem */
public final class C61359K4b extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CommentStickerSuggestionBottomsheetFragment";
    public AvatarStore A00;
    public C63836L8r A01;
    public C63836L8r A02;
    public IgLinearLayout A03;
    public IgdsInlineSearchBox A04;
    public String A05 = "";
    public String A06;
    public boolean A07;
    public final String A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;

    public final void onViewCreated(View view, Bundle bundle) {
        SpinnerImageView spinnerImageView;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgLinearLayout igLinearLayout = (IgLinearLayout) AnonymousClass7TF.A0G(view, R.id.root_container);
        this.A03 = igLinearLayout;
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) view.requireViewById(R.id.search_box);
        this.A04 = igdsInlineSearchBox;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A0E.setText(this.A06);
        }
        AnonymousClass27H r1 = null;
        if (this.A07) {
            A00(this, igLinearLayout, false);
        }
        AvatarStore avatarStore = this.A00;
        if (avatarStore != null) {
            r1 = avatarStore.A01.A00;
        }
        if (0qQ.A0K(r1, C299715vi.A00)) {
            07U r5 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MH4(r5, this, viewLifecycleOwner, (AnonymousClass4D7) null, 24), AnonymousClass07a.A00(viewLifecycleOwner));
        }
        Context requireContext = requireContext();
        AnonymousClass2tC A0S = DbV.A0S(this);
        A0S.A01(new KG1(AnonymousClass7TE.A0l(this.A0C)));
        C63836L8r l8r = new C63836L8r(requireContext, A0S, igLinearLayout, 2131974217, false);
        this.A02 = l8r;
        TextView textView = l8r.A01;
        if (textView != null) {
            LY1.A00(textView, 54, this);
        }
        07U r52 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner2);
        MH4 mh4 = new MH4(r52, this, viewLifecycleOwner2, (AnonymousClass4D7) null, 25);
        19B r53 = 19B.A00;
        1Eo.A05(r53, mh4, A002);
        String str = this.A06;
        if (str != null) {
            ((C335987ds) this.A09.getValue()).A00(str);
            2YL A0H = DbS.A0H(this.A0B);
            1Eo.A05(r53, new MGE(A0H, str, (AnonymousClass4D7) null, 34), C318116oQ.A00(A0H));
            C63836L8r l8r2 = this.A02;
            if (!(l8r2 == null || (spinnerImageView = l8r2.A04) == null)) {
                spinnerImageView.setVisibility(0);
            }
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A04;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.A02 = new C65353Lrt(this, 1);
        }
    }

    public static final void A01(C61359K4b k4b, boolean z) {
        String str;
        BottomSheetFragment A092;
        AnonymousClass37D A0g = DbV.A0g(k4b, AnonymousClass37D.A00);
        C331157Pu A002 = C48943Emh.A00(A0g);
        String str2 = k4b.A08;
        K7G k7g = new K7G();
        DbT.A1N(k7g, new 0eP[]{AnonymousClass7TE.A1L("args_entry_surface_module_name", str2)});
        if (z) {
            str = "avatar_tab";
        } else {
            str = "gif_tab";
        }
        AnonymousClass0eM r1 = k4b.A0C;
        k7g.A00(AnonymousClass7TE.A0l(r1), str);
        if (A002 != null) {
            if (!(A0g == null || (A092 = A0g.A09()) == null)) {
                A092.A0T(0);
            }
            C331127Pr A0f = DbX.A0f(r1);
            A0f.A11 = true;
            DbS.A1S(A0f, true);
            A0f.A03 = 0.8f;
            A0f.A0T = k7g;
            A002.A0F(k7g, A0f);
        } else if (A0g != null) {
            A0g.A0J(k7g);
        }
    }

    public final String getModuleName() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C61359K4b() {
        C58177Inh inh = new C58177Inh(this, 15);
        C58177Inh inh2 = new C58177Inh(this, 19);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C58177Inh(inh2, 20));
        this.A09 = DbS.A0I(new C58177Inh(A002, 21), inh, new C58188Ins(31, (Object) null, A002), DbS.A0z(C335987ds.class));
        C58177Inh inh3 = new C58177Inh(this, 17);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C58177Inh(new C58177Inh(this, 22), 23));
        this.A0B = DbS.A0I(new C58177Inh(A003, 24), inh3, new C58188Ins(32, (Object) null, A003), DbS.A0z(C60163Jgi.class));
        this.A0A = DbS.A0I(new C58177Inh(this, 18), new C58177Inh(this, 16), new C58188Ins(30, (Object) null, this), DbS.A0z(C335127cR.class));
        this.A08 = "comment_sticker_suggestion_bottomsheet_fragment";
        this.A0C = C227642jf.A02(this);
    }

    public static final void A00(C61359K4b k4b, IgLinearLayout igLinearLayout, boolean z) {
        Context requireContext = k4b.requireContext();
        AnonymousClass2tC A0S = DbV.A0S(k4b);
        A0S.A01(new KG0(AnonymousClass7TE.A0l(k4b.A0C)));
        C63836L8r l8r = new C63836L8r(requireContext, A0S, igLinearLayout, 2131974216, z);
        k4b.A01 = l8r;
        TextView textView = l8r.A01;
        if (textView != null) {
            LY1.A00(textView, 53, k4b);
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-266388452);
        C61359K4b.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A06 = requireArguments.getString(AnonymousClass000.A00(2649));
        this.A07 = requireArguments.getBoolean(AnonymousClass000.A00(2647));
        String string = requireArguments.getString(C273654mx.A00(549));
        if (string == null) {
            string = "";
        }
        this.A05 = string;
        this.A00 = 25x.A00(AnonymousClass7TE.A0l(this.A0C));
        AnonymousClass0fD.A09(-27762385, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(929434085);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.fragment_comment_sticker_suggestion_bottomsheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1770721915, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1849076007);
        super.onDestroy();
        this.A04 = null;
        this.A03 = null;
        C63836L8r l8r = this.A01;
        if (l8r != null) {
            l8r.A02 = null;
            l8r.A04 = null;
            l8r.A00 = null;
            l8r.A01 = null;
        }
        C63836L8r l8r2 = this.A02;
        if (l8r2 != null) {
            l8r2.A02 = null;
            l8r2.A04 = null;
            l8r2.A00 = null;
            l8r2.A01 = null;
        }
        AnonymousClass0fD.A09(1156234159, A022);
    }
}
