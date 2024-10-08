package com.instagram.ui.widget.typeahead;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TG;
import X.C46458DfM;
import X.C51004Fmr;
import X.C66997MgV;
import X.C74374Pto;
import X.DbV;
import X.FPM;
import X.G5J;
import X.G7N;
import X.PRO;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class TypeaheadHeader extends LinearLayout {
    public SearchEditText A00;
    public G7N A01;
    public C74374Pto A02;
    public G5J A03;
    public final C46458DfM A04 = new C46458DfM(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00();
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setHint(str);
        }
    }

    public final void A04(String str) {
        0qQ.A0B(str, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setText(str);
        }
    }

    public final void setDelegate(G7N g7n) {
        0qQ.A0B(g7n, 0);
        this.A01 = g7n;
    }

    public final void setOnSearchEditTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        0qQ.A0B(onFocusChangeListener, 0);
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setOnFocusChangeListener(onFocusChangeListener);
        }
    }

    public final void setSearchClearListener(C74374Pto pto) {
        0qQ.A0B(pto, 0);
        this.A02 = pto;
    }

    public final void setSearchFocusListener(G5J g5j) {
        0qQ.A0B(g5j, 0);
        this.A03 = g5j;
    }

    public final void A01() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText != null) {
            searchEditText.clearFocus();
            SearchEditText searchEditText2 = this.A00;
            if (searchEditText2 != null) {
                searchEditText2.A04();
                return;
            }
        }
        0qQ.A0F("searchEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setSelection(searchEditText.getText().length());
        }
    }

    public final C46458DfM getScrollDelegate() {
        return this.A04;
    }

    public final String getSearchString() {
        SearchEditText searchEditText = this.A00;
        if (searchEditText != null) {
            return searchEditText.getSearchString();
        }
        0qQ.A0F("searchEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void setAllowTextSelection(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setAllowTextSelection(z);
        }
    }

    public final void setClearButtonEnabled(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setClearButtonEnabled(z);
        }
    }

    public final void setEditTextBackground(Drawable drawable) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setBackground(drawable);
        }
    }

    public final void setFocusOnTouchEnabled(boolean z) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.A0J = z;
        }
    }

    public final void setSearchIconPadding(int i) {
        SearchEditText searchEditText = this.A00;
        if (searchEditText == null) {
            0qQ.A0F("searchEditText");
            throw AnonymousClass00P.createAndThrow();
        } else {
            searchEditText.setCompoundDrawablePadding(i);
        }
    }

    private final void A00() {
        DbV.A0D(this).inflate(R.layout.typeahead_header, this, true);
        SearchEditText searchEditText = (SearchEditText) requireViewById(R.id.row_search_edit_text);
        this.A00 = searchEditText;
        if (searchEditText != null) {
            searchEditText.A0C = new C51004Fmr(this, 7);
            searchEditText.A0B = new PRO(this, 2);
            FPM.A00(searchEditText, 22, this);
            SearchEditText searchEditText2 = this.A00;
            if (searchEditText2 != null) {
                C66997MgV.A00(searchEditText2);
                SearchEditText searchEditText3 = this.A00;
                if (searchEditText3 != null) {
                    C66997MgV.A01(searchEditText3);
                    SearchEditText searchEditText4 = this.A00;
                    if (searchEditText4 != null) {
                        C66997MgV.A00(searchEditText4);
                        SearchEditText searchEditText5 = this.A00;
                        if (searchEditText5 != null) {
                            C66997MgV.A01(searchEditText5);
                            G7N g7n = this.A01;
                            if (g7n != null) {
                                SearchEditText searchEditText6 = this.A00;
                                if (searchEditText6 != null) {
                                    g7n.registerTextViewLogging(searchEditText6);
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F("searchEditText");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass7TG.A1O(context, attributeSet);
        A00();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeaheadHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass7TG.A1O(context, attributeSet);
        A00();
    }
}
