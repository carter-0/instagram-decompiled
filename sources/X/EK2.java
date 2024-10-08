package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class EK2 extends C49890FBq {
    public final Fragment A00;
    public final FragmentActivity A01;
    public final 0hq A02;
    public final AnonymousClass07i A03;
    public final C48145EZn A04;
    public final UserSession A05;
    public final AnonymousClass4DU A06;
    public final AnonymousClass3W1 A07;
    public final Runnable A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EK2(Fragment fragment, FragmentActivity fragmentActivity, 0hq r10, AnonymousClass07i r11, C48145EZn eZn, UserSession userSession, AnonymousClass4DU r14, AnonymousClass3W1 r15, 2FW r16, Object obj, Runnable runnable, String str, String str2, String str3) {
        super(r16, obj, "system_share_sheet", R.drawable.instagram_share_android_pano_outline_24, 182.A06(0Tu.A05, userSession, 36314859021798222L) ? 2131960051 : 2131960057);
        0qQ.A0B(r11, 8);
        this.A05 = userSession;
        this.A07 = r15;
        this.A00 = fragment;
        this.A01 = fragmentActivity;
        this.A02 = r10;
        this.A03 = r11;
        this.A06 = r14;
        this.A08 = runnable;
        this.A04 = eZn;
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
    }
}
