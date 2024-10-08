package X;

import android.app.Activity;
import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;
import java.util.Set;

/* renamed from: X.Ll2  reason: case insensitive filesystem */
public final class C64963Ll2 implements MXG {
    public static final String __redex_internal_original_name = "LinkStickerCreationController";
    public AnonymousClass1O8 A00;
    public LB5 A01;
    public boolean A02;
    public final Activity A03;
    public final Context A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final AnonymousClass8MT A07;
    public final C3499582p A08;
    public final AnonymousClass0eM A09 = MMT.A00(this, 14);
    public final int A0A;
    public final ViewStub A0B;
    public final Set A0C;

    public C64963Ll2(Activity activity, ViewStub viewStub, AnonymousClass0iw r5, UserSession userSession, AnonymousClass8MT r7, C3499582p r8) {
        0qQ.A0B(viewStub, 2);
        this.A03 = activity;
        this.A0B = viewStub;
        this.A07 = r7;
        this.A08 = r8;
        this.A06 = userSession;
        this.A05 = r5;
        Context context = viewStub.getContext();
        this.A04 = context;
        this.A0A = context.getColor(2Yu.A08(activity));
        this.A0C = DbS.A0y();
    }

    public final /* synthetic */ void Cw3() {
    }

    public final /* synthetic */ void Dfq() {
    }

    public static final String A00(C64963Ll2 ll2) {
        IgEditText igEditText;
        Editable text;
        LB5 lb5 = ll2.A01;
        if (lb5 == null || (igEditText = lb5.A06) == null || (text = igEditText.getText()) == null) {
            return null;
        }
        return text.toString();
    }

    public static final void A01(C64963Ll2 ll2) {
        int i;
        LB5 lb5 = ll2.A01;
        if (lb5 != null) {
            String A002 = A00(ll2);
            if (A002 == null || A002.length() == 0) {
                IgTextView igTextView = lb5.A08;
                igTextView.setEnabled(false);
                i = ll2.A0A;
                igTextView.setTextColor(i);
                lb5.A03.setEnabled(false);
            } else {
                IgTextView igTextView2 = lb5.A08;
                igTextView2.setEnabled(true);
                i = -1;
                igTextView2.setTextColor(-1);
                lb5.A03.setEnabled(true);
            }
            lb5.A04.setColorFilter(i);
            lb5.A07.setTextColor(i);
        }
    }

    public static final void A02(C64963Ll2 ll2, boolean z) {
        AnonymousClass8CA r1;
        if (z) {
            r1 = AnonymousClass8CA.WEB_URL;
        } else {
            r1 = AnonymousClass8CA.NONE;
        }
        27r A012 = 27p.A01(ll2.A06);
        String A002 = AnonymousClass000.A00(1552);
        String valueOf = String.valueOf(r1.A00);
        C3499482o r2 = ll2.A08.A02;
        String A042 = r2.A04();
        2AL.A01(r2.A03());
        A012.A1x(A002, valueOf, A042, r2.A01().A01);
    }

    public final Set Acf() {
        return this.A0C;
    }

    public final /* synthetic */ boolean CII() {
        return false;
    }

    public final void E0h() {
        27p.A01(this.A06).A22(AnonymousClass7TE.A1I(DbS.A0j(AnonymousClass8CA.WEB_URL.A00)), this.A08.A02.A01().A01);
        if (!AnonymousClass7TF.A1V(this.A01)) {
            View inflate = this.A0B.inflate();
            0qQ.A0A(inflate);
            IgTextView A0a = DbT.A0a(inflate, R.id.link_sticker_list_done_button);
            LB5 lb5 = new LB5(inflate, inflate.requireViewById(R.id.link_sticker_list_cancel_button), inflate.requireViewById(R.id.link_sticker_custom_cta_row), inflate.requireViewById(R.id.link_sticker_custom_cta_edit_container), DbU.A0F(inflate, R.id.link_sticker_custom_cta_row_icon), (IgEditText) inflate.requireViewById(R.id.link_sticker_custom_cta_edit_text), (IgEditText) inflate.requireViewById(R.id.link_sticker_list_web_url_edit_text), A0a, DbT.A0a(inflate, R.id.link_sticker_custom_cta_row_title), DbT.A0a(inflate, R.id.link_sticker_list_url_entry_description));
            this.A01 = lb5;
            this.A0C.add(lb5.A01);
            IgTextView igTextView = lb5.A09;
            Context context = this.A04;
            String A16 = AnonymousClass7TE.A16(context, 2131969732);
            String A0c = DbY.A0c(context, A16, 2131965080);
            C60015JdO jdO = new C60015JdO(context, new L06(this));
            SpannableStringBuilder A0C2 = DbS.A0C(A0c);
            AnonymousClass7AV.A05(A0C2, jdO, A16);
            DbX.A1G(igTextView, A0C2);
            igTextView.setHighlightColor(0);
            LY0.A00(lb5.A03, 12, lb5);
            LY0.A00(lb5.A08, 13, this);
            LY0.A00(lb5.A00, 14, this);
        }
        A01(this);
        LB5 lb52 = this.A01;
        if (lb52 != null) {
            lb52.A03.setVisibility(0);
            lb52.A02.setVisibility(8);
            IgEditText igEditText = lb52.A06;
            igEditText.requestFocus();
            LWP.A00(igEditText, this, 2);
            0nA.A0Q(igEditText);
        }
    }

    public final void close() {
        LB5 lb5 = this.A01;
        if (lb5 != null) {
            lb5.A06.setText("");
            lb5.A06.clearFocus();
            IgEditText igEditText = lb5.A05;
            igEditText.setText("");
            igEditText.clearFocus();
            0nA.A0N(lb5.A01);
        }
        AnonymousClass1O8 r0 = this.A00;
        if (r0 != null) {
            r0.A00();
        }
        this.A00 = null;
    }

    public final String getModuleName() {
        return AnonymousClass000.A00(1552);
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return false;
    }
}
