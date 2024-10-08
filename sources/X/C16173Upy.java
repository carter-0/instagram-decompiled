package X;

import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Upy  reason: case insensitive filesystem */
public final class C16173Upy extends AnonymousClass6MD {
    public CharSequence A00;
    public final int A01;
    public final int A02;
    public final UserSession A03;
    public final IgTextView A04;
    public final 0rN A05;
    public final AnonymousClass6M9 A06;
    public final AnonymousClass6M6 A07;
    public final AnonymousClass6MA A08;
    public final C252063oV A09;
    public final C255773uh A0A;
    public final AnonymousClass6LR A0B;
    public final AnonymousClass6M8 A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16173Upy(UserSession userSession, C252063oV r8, C255773uh r9, AnonymousClass6M9 r10, AnonymousClass6M8 r11, AnonymousClass6M6 r12, AnonymousClass6MA r13) {
        super(r12, AnonymousClass6ME.A03);
        int A002;
        int A022 = DbW.A02(1, r8, r12);
        this.A09 = r8;
        this.A07 = r12;
        this.A0C = r11;
        this.A0A = r9;
        this.A03 = userSession;
        this.A06 = r10;
        this.A08 = r13;
        IgTextView view = r8.getView();
        this.A04 = view;
        AnonymousClass6LR A0H = r9.A0H();
        if (A0H != null) {
            this.A0B = A0H;
            String str = A0H.A06;
            if (str != null) {
                this.A00 = str;
                1P7.A02(userSession);
                int A0C2 = 0nH.A0C(A0H.A07, -16777216);
                this.A02 = A0C2;
                if (1P7.A02(userSession)) {
                    A002 = W1z.A00(A0H);
                } else {
                    A002 = AnonymousClass6MG.A00(A0H);
                }
                this.A01 = A002;
                0qQ.A0B(view, 0);
                view.setMovementMethod(AnonymousClass6LK.A00);
                view.setClickable(false);
                view.setLongClickable(false);
                view.setMaxLines(A022);
                view.setTextAlignment(r11.A03);
                AnonymousClass6MI.A07(view, r11.A01);
                AnonymousClass6MI.A06(view, 26.0f);
                view.setTextColor(A0C2);
                0rN A052 = AnonymousClass6MI.A05(C297785sK.A05(r9), view, AnonymousClass6MI.A00(view, A06()));
                this.A05 = A052;
                this.A01 = AnonymousClass6MI.A02(A052, this.A00, view.getMaxLines());
                return;
            }
            throw DbW.A0c("StoryAdHeadline text should not be null for ad ", r9.A0U(userSession));
        }
        throw DbW.A0c("StoryAdHeadline model should not be null for ad ", r9.A0U(userSession));
    }

    public final void A07(AnonymousClass6MH r8) {
        SpannableStringBuilder A012;
        boolean z = r8.A04;
        C252063oV r1 = this.A09;
        if (z) {
            r1.setVisibility(8);
            return;
        }
        r1.setVisibility(0);
        IgTextView igTextView = this.A04;
        igTextView.setTranslationY((float) r8.A03);
        0rN r6 = this.A05;
        if (r6.A00(this.A00).getLineCount() > igTextView.getMaxLines()) {
            this.A00 = AnonymousClass6MI.A04(new SpannableString(this.A07.A0L), r6, this.A00, igTextView.getMaxLines());
        }
        UserSession userSession = this.A03;
        boolean A022 = 1P7.A02(userSession);
        CharSequence charSequence = this.A00;
        int i = this.A02;
        AnonymousClass6M9 r0 = this.A06;
        if (A022) {
            A012 = W1z.A01(userSession, r0, charSequence, i);
        } else {
            A012 = AnonymousClass6MG.A01(userSession, r0, charSequence, i);
            0qQ.A07(A012);
        }
        this.A00 = A012;
        AnonymousClass6MI.A08(igTextView, r6, A012, this.A01);
        this.A08.A01(C273654mx.A00(297), this.A00.toString());
    }
}
