package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class JZL extends AnonymousClass3NK implements View.OnFocusChangeListener, AnonymousClass8Z4 {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final MVN A03;
    public final SearchEditText A04;
    public final UserSession A05;
    public final C66441MRv A06;
    public final AnimatedHintsTextLayout A07;

    public JZL(View view, UserSession userSession, MVN mvn, C66441MRv mRv) {
        View requireViewById;
        KeyEvent.Callback A0F;
        AnonymousClass7TG.A1Q(userSession, view);
        this.A05 = userSession;
        this.A02 = view;
        this.A06 = mRv;
        Context context = view.getContext();
        AnimatedHintsTextLayout animatedHintsTextLayout = null;
        if (A00() && (A0F = DbY.A0F(view, R.id.row_search_with_hints_stub)) != null && (A0F instanceof AnimatedHintsTextLayout)) {
            animatedHintsTextLayout = (AnimatedHintsTextLayout) A0F;
        }
        this.A07 = animatedHintsTextLayout;
        view.requireViewById(R.id.row_search_edit_text).setVisibility(DbW.A00(A00() ? 1 : 0));
        if (A00()) {
            requireViewById = view.requireViewById(R.id.row_search_hints_edit_text);
        } else {
            requireViewById = view.requireViewById(R.id.row_search_edit_text);
        }
        0qQ.A07(requireViewById);
        SearchEditText searchEditText = (SearchEditText) requireViewById;
        this.A04 = searchEditText;
        View requireViewById2 = view.requireViewById(R.id.back_button_ui_refresh_v2);
        this.A01 = requireViewById2;
        searchEditText.A0B = new C65797Lzp(this, 0);
        0nA.A0T(view, AnonymousClass7TG.A02(context) - context.getResources().getDimensionPixelSize(R.dimen.achievements_only_you_top_margin));
        int A032 = AnonymousClass7TF.A03(context, R.attr.assetSearchIconColor);
        searchEditText.setClearButtonEnabled(true);
        searchEditText.setClearButtonColorFilter(AnonymousClass37O.A00(A032));
        searchEditText.setSearchIconEnabled(true);
        searchEditText.setCompoundDrawableTintList(ColorStateList.valueOf(A032));
        JTQ.A1H(this, AnonymousClass7TE.A0m(requireViewById2));
        view.setVisibility(0);
        this.A03 = mvn;
        searchEditText.setAllowTextSelection(true);
        searchEditText.A0C = this;
        searchEditText.setOnFocusChangeListener(this);
        A04();
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        if (view != this.A01) {
            return false;
        }
        A01();
        return true;
    }

    public final void onSearchSubmitted(SearchEditText searchEditText, String str) {
        0qQ.A0B(str, 1);
        this.A03.Cw7(str);
    }

    public final void onSearchTextChanged(SearchEditText searchEditText, CharSequence charSequence, int i, int i2, int i3) {
        0qQ.A0B(charSequence, 1);
        this.A03.Cw6(charSequence.toString());
    }

    private final boolean A00() {
        if (!182.A06(0Tu.A05, this.A05, 36323968646393480L)) {
            return false;
        }
        Integer Aci = this.A06.Aci();
        if (Aci == AnonymousClass05K.A00 || Aci == AnonymousClass05K.A0Y) {
            return true;
        }
        return false;
    }

    public final void A02() {
        SearchEditText searchEditText = this.A04;
        if (searchEditText.isFocused()) {
            searchEditText.clearFocus();
            0nA.A0N(searchEditText);
        }
    }

    public final void A03() {
        SearchEditText searchEditText = this.A04;
        searchEditText.A05();
        searchEditText.A06();
        A04();
        DbS.A1C(searchEditText);
    }

    public final void A04() {
        AnimatedHintsTextLayout animatedHintsTextLayout;
        String[] strArr;
        String str;
        SearchEditText searchEditText;
        int i;
        int intValue = this.A06.Aci().intValue();
        if (intValue != 0) {
            if (intValue != 4) {
                if (intValue == 2) {
                    searchEditText = this.A04;
                    i = 2131972818;
                } else if (intValue == 8) {
                    searchEditText = this.A04;
                    i = 2131953494;
                }
            } else if (A00()) {
                animatedHintsTextLayout = this.A07;
                if (animatedHintsTextLayout != null) {
                    strArr = new String[3];
                    strArr[0] = "sticker one";
                    strArr[1] = "sticker two";
                    str = "sticker three";
                    strArr[2] = str;
                    animatedHintsTextLayout.setHints(0sr.A1P(strArr));
                    return;
                }
                return;
            }
            searchEditText = this.A04;
            i = 2131972797;
        } else if (A00()) {
            animatedHintsTextLayout = this.A07;
            if (animatedHintsTextLayout != null) {
                strArr = new String[3];
                strArr[0] = "music one";
                strArr[1] = "music two";
                str = "music three";
                strArr[2] = str;
                animatedHintsTextLayout.setHints(0sr.A1P(strArr));
                return;
            }
            return;
        } else {
            searchEditText = this.A04;
            i = 2131972831;
        }
        searchEditText.setHint(i);
    }

    public final void A05(boolean z) {
        C14287TtL ttL;
        View view = this.A02;
        if (view instanceof ViewGroup) {
            if (z) {
                ttL = null;
            } else {
                ttL = new C14287TtL();
            }
            C14283TtH.A02((ViewGroup) view, ttL);
        }
        this.A01.setVisibility(DbW.A01(z ? 1 : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r6.A04.getVisibility() != 0) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(boolean r7, boolean r8) {
        /*
            r6 = this;
            android.view.View r5 = r6.A02
            int r0 = r5.getVisibility()
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0013
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            int r0 = r0.getVisibility()
            r2 = 1
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r2 = 0
        L_0x0014:
            if (r8 == 0) goto L_0x0025
            if (r2 != 0) goto L_0x0025
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x0025
            if (r7 == 0) goto L_0x0034
            r1 = 0
        L_0x001f:
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            X.C14283TtH.A02(r0, r1)
        L_0x0025:
            if (r7 == 0) goto L_0x003a
            if (r2 != 0) goto L_0x0033
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            android.view.View[] r1 = new android.view.View[]{r5, r0}
            r0 = 0
            X.C294975nL.A04(r0, r1, r4)
        L_0x0033:
            return
        L_0x0034:
            X.TtL r1 = new X.TtL
            r1.<init>()
            goto L_0x001f
        L_0x003a:
            com.instagram.ui.widget.searchedittext.SearchEditText r0 = r6.A04
            android.view.View[] r0 = new android.view.View[]{r5, r0}
            X.C294975nL.A05(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.JZL.A06(boolean, boolean):void");
    }

    public final void onFocusChange(View view, boolean z) {
        SearchEditText searchEditText = this.A04;
        searchEditText.setSearchIconEnabled(!z);
        if (z) {
            this.A03.Cw5();
            if (this.A00) {
                A05(true);
                return;
            }
            return;
        }
        0nA.A0N(searchEditText);
        String A0f = AnonymousClass7TF.A0f(searchEditText);
        if ((A0f == null || A0f.length() == 0) && this.A03.Erv()) {
            A01();
        }
    }

    public final void A01() {
        A02();
        if (this.A00) {
            A05(false);
        }
        this.A03.Cw4();
        A04();
        DbS.A1C(this.A04);
    }
}
