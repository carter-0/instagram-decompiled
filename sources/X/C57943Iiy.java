package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.Iiy  reason: case insensitive filesystem */
public final class C57943Iiy implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C334347b7 A02;
    public final /* synthetic */ UserSession A03;

    public C57943Iiy(Context context, FragmentActivity fragmentActivity, C334347b7 r3, UserSession userSession) {
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void run() {
        FragmentActivity fragmentActivity = this.A01;
        Context context = this.A00;
        0qQ.A0A(context);
        UserSession userSession = this.A03;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A02.A0B;
        AnonymousClass7TG.A1O(context, userSession);
        AnonymousClass5Gt A0f = AnonymousClass7TG.A0f(fragmentActivity, AnonymousClass7TF.A0d(context.getResources(), 2131956396));
        A0f.A03(composerAutoCompleteTextView);
        A0f.A02();
        A0f.A0A = false;
        A0f.A04 = new KSO(userSession, 1);
        DbU.A1T(A0f);
    }
}
