package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.IBf  reason: case insensitive filesystem */
public final class C56756IBf implements View.OnClickListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;

    public C56756IBf(UserSession userSession, Context context, FragmentActivity fragmentActivity) {
        this.A02 = userSession;
        this.A00 = context;
        this.A01 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1325681712);
        C52345GOp.A07(this.A02, this.A00, this.A01);
        AnonymousClass0fD.A0C(389273835, A05);
    }
}
