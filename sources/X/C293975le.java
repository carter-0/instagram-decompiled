package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.UpdatableButton;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.5le  reason: invalid class name and case insensitive filesystem */
public final class C293975le implements View.OnClickListener {
    public User A00;
    public Integer A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4D6 A05;
    public final UpdatableButton A06;

    public static final void A00(C293975le r10) {
        User user = r10.A00;
        if (user != null) {
            AnonymousClass4D6 r2 = r10.A05;
            C49868FAl fAl = C49274EsH.A00;
            UserSession userSession = r10.A04;
            AnonymousClass0iw r5 = r10.A03;
            Integer num = AnonymousClass05K.A0N;
            List singletonList = Collections.singletonList(user.getId());
            0qQ.A07(singletonList);
            1OC A012 = fAl.A01(r5, userSession, num, singletonList, new ArrayList());
            A012.A00 = new C47650EBk(r10, user);
            r2.schedule(A012);
            r10.A01 = AnonymousClass05K.A0C;
            A01(r10);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public static final void A01(C293975le r4) {
        UpdatableButton updatableButton;
        int i;
        UpdatableButton updatableButton2;
        Integer num = r4.A01;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue != 0) {
                if (intValue == 1) {
                    updatableButton = r4.A06;
                    updatableButton.setIsBlueButton(true);
                    updatableButton.setEnabled(true);
                } else if (intValue == 2) {
                    updatableButton2 = r4.A06;
                    updatableButton2.setIsBlueButton(false);
                    updatableButton2.setEnabled(false);
                    i = 2131956177;
                } else if (intValue == 3) {
                    updatableButton = r4.A06;
                    updatableButton.setIsBlueButton(true);
                    updatableButton.setEnabled(false);
                } else {
                    return;
                }
                i = 2131956176;
            } else {
                updatableButton2 = r4.A06;
                updatableButton2.setIsBlueButton(false);
                updatableButton2.setEnabled(true);
                i = 2131956177;
            }
            updatableButton.setText(i);
        }
    }

    public C293975le(Context context, AnonymousClass0iw r2, UserSession userSession, AnonymousClass4D6 r4, UpdatableButton updatableButton) {
        this.A02 = context;
        this.A03 = r2;
        this.A05 = r4;
        this.A04 = userSession;
        this.A06 = updatableButton;
        AnonymousClass0fU.A00(this, updatableButton);
    }

    public final void onClick(View view) {
        C358248ab r2;
        int A052 = AnonymousClass0fD.A05(44176275);
        Integer num = this.A01;
        if (num == AnonymousClass05K.A00) {
            User user = this.A00;
            if (user != null) {
                UpdatableButton updatableButton = this.A06;
                Context context = updatableButton.getContext();
                Resources resources = updatableButton.getResources();
                String username = user.getUsername();
                String string = resources.getString(2131956178, new Object[]{username});
                0qQ.A07(string);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                spannableStringBuilder.setSpan(new StyleSpan(1), 00l.A08(string, username, 0, false), 00l.A08(string, username, 0, false) + username.length(), 33);
                r2 = new C358248ab(context);
                r2.A0n(user.Bh3(), this.A03);
                r2.A0q(spannableStringBuilder);
                r2.A0I(new C49986FHv(this), 2131971974);
                r2.A05();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            if (num == AnonymousClass05K.A01) {
                if (this.A00 != null) {
                    UserSession userSession = this.A04;
                    if (1Au.A00(userSession).A01.getBoolean("has_seen_favorites_change_confirmation_dialog", false) || !AnonymousClass0t1.A01.A01(userSession).A1m()) {
                        A00(this);
                    } else {
                        Context context2 = this.A02;
                        C49985FHu fHu = new C49985FHu(this);
                        r2 = new C358248ab(context2);
                        r2.A09(2131956181);
                        r2.A08(2131956180);
                        r2.A04();
                        r2.A0E(fHu);
                        r2.A0C(fHu);
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            AnonymousClass0fD.A0C(-609182515, A052);
        }
        AnonymousClass0fN.A00(r2.A02());
        AnonymousClass0fD.A0C(-609182515, A052);
    }
}
