package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;

public final class FIF implements DialogInterface.OnClickListener {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0lg A01;

    public FIF(FragmentActivity fragmentActivity, 0lg r2) {
        this.A01 = r2;
        this.A00 = fragmentActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        0lg r4 = this.A01;
        1NY A0a = AnonymousClass7TG.A0a(r4);
        A0a.A0A("security_checkup/start/");
        1OC A0S = DbU.A0S(A0a, DwC.class, C49814F8b.class);
        IgFragmentActivity igFragmentActivity = this.A00;
        0hq A0F = DbT.A0F(igFragmentActivity);
        0qQ.A0C(igFragmentActivity, Pxd.A00(9));
        IgFragmentActivity igFragmentActivity2 = igFragmentActivity;
        AnonymousClass7TG.A1U(A0F, igFragmentActivity2, r4);
        1P0 h4j = new H4J(A0F);
        h4j.A00 = A0F;
        h4j.A01 = igFragmentActivity2;
        h4j.A02 = r4;
        A0S.A00 = h4j;
        1ES.A03(A0S);
    }
}
