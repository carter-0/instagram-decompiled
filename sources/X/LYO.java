package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class LYO implements View.OnFocusChangeListener, G77 {
    public boolean A00;
    public final IgdsInlineSearchBox A01;
    public final K6T A02;

    public final void onSearchCleared(String str) {
    }

    public final void onSearchTextChanged(String str) {
        0qQ.A0B(str, 0);
        K6T k6t = this.A02;
        int length = str.length();
        boolean A1R = AnonymousClass7TF.A1R(length);
        LZE lze = k6t.A04;
        if (A1R) {
            if (lze != null) {
                if (!lze.A00) {
                    lze.A00 = true;
                    AnonymousClass7TG.A1A(lze.A01, true);
                    LZE.A00(lze, false);
                    C63701L3l l3l = k6t.A00;
                    if (l3l != null) {
                        AnonymousClass7TE.A1U(l3l.A00, true);
                    }
                    0qQ.A0F("emojiSheetHolder");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            0qQ.A0F("emojiSearchResultsController");
            throw AnonymousClass00P.createAndThrow();
        }
        if (lze != null) {
            if (lze.A00) {
                lze.A00 = false;
                AnonymousClass7TE.A1U(lze.A01, true);
                LZE.A00(lze, false);
                C63701L3l l3l2 = k6t.A00;
                if (l3l2 != null) {
                    AnonymousClass7TG.A1A(l3l2.A00, true);
                }
                0qQ.A0F("emojiSheetHolder");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        0qQ.A0F("emojiSearchResultsController");
        throw AnonymousClass00P.createAndThrow();
        LZE lze2 = k6t.A04;
        if (lze2 != null) {
            if (length == 0) {
                LZE.A00(lze2, false);
                lze2.A02.A03();
                return;
            } else if (lze2.A00) {
                lze2.A03.A03(str);
                return;
            } else {
                return;
            }
        }
        0qQ.A0F("emojiSearchResultsController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A00() {
        IgdsInlineSearchBox igdsInlineSearchBox = this.A01;
        igdsInlineSearchBox.A03();
        igdsInlineSearchBox.A0E.setText("");
        K6T k6t = this.A02;
        LZE lze = k6t.A04;
        String str = "emojiSearchResultsController";
        if (lze != null) {
            if (lze.A00) {
                lze.A00 = false;
                AnonymousClass7TE.A1U(lze.A01, true);
                LZE.A00(lze, false);
                C63701L3l l3l = k6t.A00;
                if (l3l == null) {
                    str = "emojiSheetHolder";
                } else {
                    AnonymousClass7TG.A1A(l3l.A00, true);
                }
            }
            this.A00 = false;
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFocusChange(View view, boolean z) {
        if (z && !this.A00) {
            LZE lze = this.A02.A04;
            if (lze == null) {
                0qQ.A0F("emojiSearchResultsController");
                throw AnonymousClass00P.createAndThrow();
            }
            if ("".length() == 0) {
                LZE.A00(lze, false);
                lze.A02.A03();
            } else if (lze.A00) {
                lze.A03.A03("");
            }
            this.A00 = true;
        }
    }

    public LYO(View view, K6T k6t) {
        this.A02 = k6t;
        IgdsInlineSearchBox igdsInlineSearchBox = (IgdsInlineSearchBox) AnonymousClass7TF.A0F(view, R.id.asset_search_bar);
        this.A01 = igdsInlineSearchBox;
        igdsInlineSearchBox.A02 = this;
        igdsInlineSearchBox.A00 = this;
        igdsInlineSearchBox.A05(R.style.DirectDarkMode);
    }
}
