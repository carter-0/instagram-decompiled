package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EK3 extends C49890FBq {
    public final FragmentActivity A00;
    public final 0hq A01;
    public final AnonymousClass07i A02;
    public final C48145EZn A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final AnonymousClass3W1 A06;
    public final Long A07;
    public final Runnable A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EK3(FragmentActivity fragmentActivity, 0hq r9, AnonymousClass07i r10, C48145EZn eZn, UserSession userSession, AnonymousClass4DU r13, AnonymousClass3W1 r14, 2FW r15, Long l, Object obj, Runnable runnable, String str, String str2, String str3) {
        super(r15, obj, "user_sms", R.drawable.instagram_sms_pano_outline_24, 2131960053);
        0qQ.A0B(r10, 8);
        this.A04 = userSession;
        this.A05 = r13;
        this.A06 = r14;
        this.A00 = fragmentActivity;
        this.A01 = r9;
        this.A02 = r10;
        this.A08 = runnable;
        this.A03 = eZn;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A07 = l;
    }
}
