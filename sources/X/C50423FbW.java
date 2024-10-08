package X;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.searchedittext.SearchWithDeleteEditText;
import com.instagram.ui.widget.typeaheadpill.TypeaheadPill;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: X.FbW  reason: case insensitive filesystem */
public final class C50423FbW implements G8J {
    public DirectShareTarget A00;
    public int A01 = -1;
    public final Handler A02;
    public final View A03;
    public final ViewGroup A04;
    public final HorizontalScrollView A05;
    public final FPM A06;
    public final SearchWithDeleteEditText A07;
    public final List A08 = AnonymousClass7TE.A1C();
    public final Set A09;
    public final boolean A0A;
    public final int A0B;
    public final View.OnClickListener A0C;
    public final UserSession A0D;
    public final G6W A0E;
    public final TypeaheadPill A0F;
    public final Runnable A0G;

    public C50423FbW(ViewGroup viewGroup, FPM fpm, UserSession userSession, boolean z, boolean z2) {
        int A022 = DbW.A02(1, userSession, fpm);
        this.A0D = userSession;
        this.A06 = fpm;
        this.A0A = z;
        ViewGroup A0I = DbX.A0I(viewGroup, R.id.recipients_container);
        this.A04 = A0I;
        TypeaheadPill typeaheadPill = (TypeaheadPill) AnonymousClass7TF.A0F(viewGroup, R.id.recipient_picker_typeahead_pill);
        this.A0F = typeaheadPill;
        SearchWithDeleteEditText searchWithDeleteEditText = typeaheadPill.A04;
        this.A07 = searchWithDeleteEditText;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) AnonymousClass7TF.A0F(viewGroup, R.id.recipients_scroll_container);
        this.A05 = horizontalScrollView;
        View A0G2 = AnonymousClass7TF.A0G(viewGroup, R.id.search_tap_padding);
        this.A03 = A0G2;
        this.A02 = new C46672Dj1(this, A022);
        this.A09 = DbS.A0y();
        this.A0E = new C51009Fmw(this);
        this.A0C = FP8.A00(this, 56);
        this.A0G = new C51199FqG(this);
        this.A0B = DbS.A03(DbU.A05(searchWithDeleteEditText), R.dimen.abc_action_bar_elevation_material);
        if (!z2) {
            DbX.A1B(viewGroup, R.id.direct_share_search_bar_label);
        }
        FP8.A01(A0I, 54, this);
        typeaheadPill.A00 = new C51013Fn4(this);
        typeaheadPill.setVisibility(0);
        horizontalScrollView.setHorizontalFadingEdgeEnabled(true);
        horizontalScrollView.setFadingEdgeLength(30);
        searchWithDeleteEditText.A0D = new C51006Fmt(this);
        FPM.A00(searchWithDeleteEditText, 7, this);
        searchWithDeleteEditText.A00 = new C51007Fmu(this);
        searchWithDeleteEditText.setOnFocusChangeListener(fpm);
        searchWithDeleteEditText.addTextChangedListener(AnonymousClass4v0.A00(userSession));
        FP8.A01(A0G2, 55, this);
        if (z) {
            Context context = typeaheadPill.getContext();
            int A023 = AnonymousClass7TF.A02(context, R.dimen.abc_action_bar_elevation_material);
            int A072 = AnonymousClass7TG.A07(context);
            TextView textView = typeaheadPill.A03;
            textView.setPadding(textView.getPaddingLeft(), A023, textView.getPaddingRight(), A072);
            textView.setHeight(context.getResources().getDimensionPixelSize(R.dimen.challenge_sticker_v2_2_winner2_mention_bottom_margin));
            DbX.A1C(searchWithDeleteEditText, searchWithDeleteEditText.getPaddingLeft(), AnonymousClass7TE.A0C(context.getResources()));
        }
        A00(this);
    }

    public final void Eop(int i) {
        this.A01 = 0;
    }

    public final void FLl(String str, List list, boolean z, boolean z2) {
        C46723DkC dkC;
        String A032;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        List list2 = this.A08;
        list2.clear();
        List list3 = list;
        list2.addAll(list3);
        ViewGroup viewGroup = this.A04;
        int childCount = viewGroup.getChildCount();
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        Context context = searchWithDeleteEditText.getContext();
        viewGroup.removeViews(0, viewGroup.getChildCount() - 2);
        int i = 0;
        for (Object next : list3) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            DirectShareTarget directShareTarget = (DirectShareTarget) next;
            boolean z3 = this.A0A;
            if (z3) {
                0qQ.A0A(context);
                dkC = new C46723DkC(context, R.attr.TokenTextViewPillStyleRedesign);
                dkC.A02 = false;
            } else {
                0qQ.A0A(context);
                dkC = new C46723DkC(context);
            }
            int i3 = this.A01;
            if (i3 != -1) {
                dkC.setBackgroundResource(i3);
            }
            dkC.setGravity(17);
            if (this.A09.contains(directShareTarget.A09())) {
                A032 = directShareTarget.A0J;
                if (A032 == null) {
                    A032 = "";
                }
            } else {
                A032 = AnonymousClass50n.A03(directShareTarget, AnonymousClass0t1.A01.A01(this.A0D));
            }
            dkC.setText(A032);
            dkC.A00 = this.A0E;
            dkC.setOnFocusChangeListener(this.A06);
            AnonymousClass0fU.A00(this.A0C, dkC);
            dkC.setTag(directShareTarget);
            viewGroup.addView(dkC, i);
            ViewGroup.LayoutParams layoutParams = dkC.getLayoutParams();
            if ((layoutParams instanceof LinearLayout.LayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.setMarginEnd(this.A0B);
            }
            if (!z3) {
                dkC.setPaddingRelative((int) DbU.A00(context, R.dimen.account_discovery_bottom_gap), DbS.A03(context.getResources(), R.dimen.album_music_sticker_text_vertical_padding), (int) DbU.A00(context, R.dimen.account_discovery_bottom_gap), DbS.A03(context.getResources(), R.dimen.account_discovery_bottom_gap));
            }
            i = i2;
        }
        if (z) {
            AHt();
        }
        if (AnonymousClass7TE.A1b(list2)) {
            searchWithDeleteEditText.setHint("");
        } else {
            searchWithDeleteEditText.setHint(2131960278);
        }
        A00(this);
        if (viewGroup.getChildCount() > childCount) {
            this.A02.post(this.A0G);
        }
    }

    public static final void A00(C50423FbW fbW) {
        if (AnonymousClass7TE.A1b(fbW.A08)) {
            SearchWithDeleteEditText searchWithDeleteEditText = fbW.A07;
            if (!searchWithDeleteEditText.hasFocus()) {
                Editable text = searchWithDeleteEditText.getText();
                0qQ.A07(text);
                if (text.length() == 0) {
                    fbW.A03.setVisibility(0);
                    searchWithDeleteEditText.setVisibility(8);
                    return;
                }
            }
        }
        A01(fbW);
    }

    public static final void A01(C50423FbW fbW) {
        fbW.A03.setVisibility(8);
        fbW.A07.setVisibility(0);
    }

    public final void AHG() {
        this.A02.removeCallbacksAndMessages((Object) null);
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        searchWithDeleteEditText.A00 = null;
        searchWithDeleteEditText.removeTextChangedListener(AnonymousClass4v0.A00(this.A0D));
    }

    public final boolean AHd() {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        if (!searchWithDeleteEditText.hasFocus()) {
            return false;
        }
        searchWithDeleteEditText.clearFocus();
        this.A02.sendEmptyMessageDelayed(1, 20);
        return true;
    }

    public final void AHt() {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setTag("");
        searchWithDeleteEditText.setText("");
        searchWithDeleteEditText.setTag((Object) null);
    }

    public final String BqO() {
        return AnonymousClass7TF.A0f(this.A07);
    }

    public final boolean CJp() {
        return this.A07.hasFocus();
    }

    public final void CLU() {
        0nA.A0N(this.A07);
    }

    public final void DzK() {
        this.A07.A0C = new C51004Fmr(this, 2);
    }

    public final void EHP() {
        this.A07.requestFocus();
    }

    public final void EIM() {
        TypeaheadPill typeaheadPill = this.A0F;
        if (typeaheadPill != null) {
            typeaheadPill.A01();
            this.A00 = null;
            ((C49916FEq) this.A06.A01).A05.Dbr((DirectShareTarget) null);
        }
    }

    public final void EjT(String str) {
        SearchWithDeleteEditText searchWithDeleteEditText = this.A07;
        searchWithDeleteEditText.setText(str);
        Pattern pattern = 0mp.A01;
        searchWithDeleteEditText.setSelection(str.length());
        A01(this);
    }

    public final void Eug() {
        0nA.A0S(this.A07);
    }

    public final void FM8(DirectShareTarget directShareTarget) {
        String A0A2;
        TypeaheadPill typeaheadPill = this.A0F;
        if (directShareTarget.A0T()) {
            A0A2 = DbU.A0n(this.A0D, AnonymousClass0t1.A01);
        } else {
            A0A2 = directShareTarget.A0A();
        }
        if (!typeaheadPill.A02(A0A2)) {
            String str = directShareTarget.A0J;
            if (str == null) {
                str = "";
            }
            if (!typeaheadPill.A02(str)) {
                EIM();
                return;
            }
        }
        this.A00 = directShareTarget;
        ((C49916FEq) this.A06.A01).A05.Dbr(directShareTarget);
        this.A02.post(this.A0G);
        this.A07.requestFocus();
    }

    public final void Dwm(List list) {
        DirectShareTarget directShareTarget = (DirectShareTarget) 00k.A0J(list);
        if (directShareTarget == null || this.A08.contains(directShareTarget)) {
            EIM();
        } else {
            FM8(directShareTarget);
        }
    }
}
