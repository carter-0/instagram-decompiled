package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EK4 extends C49890FBq {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final 0hq A02;
    public final AnonymousClass07i A03;
    public final C48145EZn A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass3W1 A07;
    public final Long A08;
    public final Runnable A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EK4(Fragment fragment, FragmentActivity fragmentActivity, 0hq r10, AnonymousClass07i r11, C48145EZn eZn, UserSession userSession, AnonymousClass4DU r14, AnonymousClass3W1 r15, 2FW r16, Long l, Object obj, Runnable runnable, String str, String str2, String str3) {
        super(r16, obj, "copy_link", R.drawable.instagram_link_pano_outline_24, 2131960043);
        0qQ.A0B(r11, 9);
        this.A05 = userSession;
        this.A06 = r14;
        this.A07 = r15;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
        this.A02 = r10;
        this.A03 = r11;
        this.A09 = runnable;
        this.A04 = eZn;
        this.A0B = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A08 = l;
    }
}
