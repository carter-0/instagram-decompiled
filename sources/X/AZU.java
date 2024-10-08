package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.Editable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

public final class AZU implements C252213ok {
    public int A00;
    public View A01;
    public View A02;
    public Medium A03;
    public Medium A04;
    public IgEditText A05;
    public IgEditText A06;
    public IgSimpleImageView A07;
    public IgSimpleImageView A08;
    public IgSimpleImageView A09;
    public IgSimpleImageView A0A;
    public IgTextView A0B;
    public C39869ACq A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final View.OnFocusChangeListener A0I;
    public final UserSession A0J;
    public final AnonymousClass80U A0K;
    public final AnonymousClass8ME A0L;
    public final AnonymousClass87F A0M;
    public final String A0N;
    public final List A0O = AnonymousClass7TE.A1C();
    public final AnonymousClass0eM A0P;
    public final AnonymousClass0eM A0Q;
    public final AnonymousClass0eM A0R;
    public final Resources A0S;
    public final AnonymousClass8Z3 A0T;

    public AZU(View view, UserSession userSession, AnonymousClass3E6 r9, AnonymousClass80U r10, AnonymousClass8ME r11, String str) {
        0qQ.A0B(str, 5);
        this.A0L = r11;
        this.A0K = r10;
        this.A0N = str;
        this.A0J = userSession;
        Context context = view.getContext();
        this.A0H = context;
        Resources resources = context.getResources();
        this.A0S = resources;
        this.A0G = resources.getDimensionPixelSize(R.dimen.before_and_after_media_card_width);
        this.A0F = resources.getDimensionPixelSize(R.dimen.before_and_after_media_card_height);
        this.A0Q = AnonymousClass1YB.A00(new C66300MMj(view, 6));
        this.A0P = AnonymousClass1YB.A00(new C66300MMj(view, 5));
        this.A0R = AnonymousClass1YB.A00(new C66300MMj(view, 7));
        C19731WeY weY = new C19731WeY(this, 0);
        this.A0T = weY;
        AnonymousClass87F r2 = new AnonymousClass87F(context, r9, weY);
        AnonymousClass8Z5 r1 = r2.A03;
        r1.A03 = true;
        r1.A06 = true;
        r1.A00 = r2.A00;
        r1.A05 = true;
        this.A0M = r2;
        this.A0I = new LYL(0, r9, this);
    }

    public static final void A01(IgEditText igEditText, int i) {
        igEditText.setText((CharSequence) null);
        igEditText.setHint(igEditText.getContext().getString(i));
        if (igEditText.hasFocus()) {
            igEditText.clearFocus();
        }
    }

    public static final void A02(AZU azu) {
        String str;
        List list = azu.A0O;
        if (!list.isEmpty()) {
            C381789cK r3 = (C381789cK) 00k.A0O(list, AnonymousClass7TG.A0G(list, azu.A00));
            IgEditText igEditText = azu.A06;
            String str2 = null;
            if (igEditText != null) {
                igEditText.getText().clear();
                if (r3 != null) {
                    str = r3.A00;
                } else {
                    str = null;
                }
                igEditText.setHint(str);
            }
            IgEditText igEditText2 = azu.A05;
            if (igEditText2 != null) {
                igEditText2.getText().clear();
                if (r3 != null) {
                    str2 = r3.A01;
                }
                igEditText2.setHint(str2);
            }
            azu.A00++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r2.A03 == null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.AZU r2, com.instagram.ui.text.fittingtextview.FittingTextView r3) {
        /*
            com.instagram.common.gallery.Medium r0 = r2.A04
            if (r0 == 0) goto L_0x0009
            com.instagram.common.gallery.Medium r1 = r2.A03
            r0 = 1
            if (r1 != 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r3.setEnabled(r0)
            X.0eM r0 = r2.A0Q
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            boolean r0 = r3.isEnabled()
            X.C18708VyZ.A01(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AZU.A03(X.AZU, com.instagram.ui.text.fittingtextview.FittingTextView):void");
    }

    public final void DMr(int i, boolean z) {
        IgSimpleImageView igSimpleImageView = this.A0A;
        if (igSimpleImageView != null) {
            C294975nL A002 = C294975nL.A00(igSimpleImageView);
            A002.A0G();
            A002.A0K(((float) i) * -1.0f);
            A002.A0H();
        }
    }

    public static final String A00(IgEditText igEditText) {
        Object hint;
        Editable text = igEditText.getText();
        if (text == null || text.length() == 0) {
            hint = igEditText.getHint();
            if (hint == null) {
                hint = "";
            }
        } else {
            hint = igEditText.getText();
        }
        return hint.toString();
    }
}
