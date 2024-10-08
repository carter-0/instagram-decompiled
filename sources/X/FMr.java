package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.aistudio.model.UtmMetadata;
import com.instagram.common.session.UserSession;

public final class FMr implements View.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ UserSession A01;

    public FMr(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A01 = userSession;
        this.A00 = fragmentActivity;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(205243456);
        C49951FGg.A00(this.A00, (UtmMetadata) null, this.A01, AnonymousClass000.A00(804), (String) null);
        AnonymousClass0fD.A0C(1102974535, A05);
    }
}
