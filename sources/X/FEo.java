package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;
import com.instagram.user.model.User;
import java.util.List;

public final class FEo {
    public ComposerAutoCompleteTextView A00;
    public final Context A01;
    public final JVH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final C51868G5f A05;

    public FEo(Context context, JVH jvh, AnonymousClass0iw r4, UserSession userSession, C51868G5f g5f) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A04 = userSession;
        this.A03 = r4;
        this.A02 = jvh;
        this.A05 = g5f;
    }

    public static final void A00(FEo fEo) {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = fEo.A00;
        if (composerAutoCompleteTextView != null) {
            String A12 = DbV.A12(AnonymousClass7TF.A0f(composerAutoCompleteTextView));
            if (A12 != null && A12.length() != 0) {
                C51868G5f g5f = fEo.A05;
                if (g5f != null) {
                    ComposerAutoCompleteTextView composerAutoCompleteTextView2 = fEo.A00;
                    if (composerAutoCompleteTextView2 != null) {
                        g5f.Dj9(DbV.A12(AnonymousClass7TF.A0f(composerAutoCompleteTextView2)));
                    }
                }
                ComposerAutoCompleteTextView composerAutoCompleteTextView3 = fEo.A00;
                if (composerAutoCompleteTextView3 != null) {
                    DbS.A1C(composerAutoCompleteTextView3);
                    fEo.A02();
                    A01(fEo);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("composerEditTextView");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(FEo fEo) {
        2Dm A002 = 1bJ.A00(fEo.A04);
        User user = (User) fEo.A02.A04;
        List A1I = AnonymousClass7TE.A1I(new PendingRecipient(user));
        AnonymousClass3U9 BYg = A002.BYg((CreatorBroadcastThreadInfo) null, (String) null, (String) null, A1I);
        DirectShareTarget directShareTarget = new DirectShareTarget(C66662MaV.A00(BYg.C6C(), A1I), BYg.C6f(), A1I, true);
        C310336ap A0a = DbS.A0a();
        A0a.A0B(C310356ar.CIRCULAR);
        A0a.A06();
        A0a.A0L = true;
        A0a.A09 = user.Bh3();
        Context context = fEo.A01;
        A0a.A0D = DbY.A0b(context, user, 2131960309);
        DbW.A0q(context, A0a, 2131960699);
        FdJ.A00(A0a, directShareTarget, fEo, 5);
        DbY.A1N(A0a);
    }

    public final void A02() {
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A00;
        if (composerAutoCompleteTextView == null) {
            0qQ.A0F("composerEditTextView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            0nA.A0N(composerAutoCompleteTextView);
        }
    }
}
