package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.direct.securityalert.data.SecurityAlertRepository;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.JfX  reason: case insensitive filesystem */
public final class C60091JfX extends C361478gI {
    public final SecurityAlertRepository A00;
    public final AnonymousClass0r6 A01;
    public final 05G A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60091JfX(FragmentActivity fragmentActivity, SecurityAlertRepository securityAlertRepository) {
        super(JTP.A0A(fragmentActivity));
        AnonymousClass7TG.A1O(fragmentActivity, securityAlertRepository);
        this.A00 = securityAlertRepository;
        02z A10 = DbS.A10(new C61084JwM((Integer) null, (List) null, (List) null, (DefaultConstructorMarker) null, 7, 34));
        this.A02 = A10;
        this.A01 = 10b.A03(A10);
    }
}
