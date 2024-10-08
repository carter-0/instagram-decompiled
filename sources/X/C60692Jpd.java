package X;

import android.content.Context;
import android.text.TextWatcher;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Jpd  reason: case insensitive filesystem */
public abstract class C60692Jpd extends C249703kE {
    public TextWatcher A00;
    public TextWatcher A01;
    public final Context A02;
    public final View A03;
    public final AnonymousClass0eM A04 = A00(R.id.mk_section_description_edit_text);
    public final AnonymousClass0eM A05 = A00(R.id.mk_section_description_text);
    public final AnonymousClass0eM A06 = A00(R.id.mk_section_edit_info_icon);
    public final AnonymousClass0eM A07 = A00(R.id.mk_section_edit_button);
    public final AnonymousClass0eM A08 = A00(R.id.mk_section_edit_view_button);
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A00(0eO.A02, new C51793G2c(this, 3));
    public final AnonymousClass0eM A0A = A00(R.id.mk_section_title_edit_text);
    public final AnonymousClass0eM A0B = A00(R.id.mk_section_title_text);
    public final AnonymousClass0eM A0C = A00(R.id.mk_section_view_info_icon);

    private final AnonymousClass0eM A00(int i) {
        return AnonymousClass0eN.A00(0eO.A02, new MJ3(i, 32, this));
    }

    public final boolean A02() {
        if (this instanceof KUL) {
            return ((KUL) this).A00;
        }
        if (this instanceof KUK) {
            return false;
        }
        if (this instanceof KUN) {
            return ((KUN) this).A02;
        }
        if (!(this instanceof KUM)) {
            return ((KUO) this).A03;
        }
        return false;
    }

    public C60692Jpd(View view) {
        super(view);
        this.A03 = view;
        this.A02 = AnonymousClass7TE.A0S(view);
    }

    public static final void A01(C60692Jpd jpd, C62320sa r1) {
        if (jpd.A02()) {
            r1.invoke();
        }
    }
}
