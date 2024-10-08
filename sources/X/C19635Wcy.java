package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Wcy  reason: case insensitive filesystem */
public final class C19635Wcy implements X54 {
    public final long A00;
    public final Fragment A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final C17909Vi0 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public C19635Wcy(Fragment fragment, UserSession userSession, AnonymousClass4DU r11, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z) {
        0qQ.A0B(fragment, 1);
        this.A01 = fragment;
        this.A03 = r11;
        this.A02 = userSession;
        this.A08 = str;
        this.A06 = str4;
        this.A07 = str5;
        this.A09 = str6;
        this.A00 = j;
        this.A0A = z;
        this.A04 = new C17909Vi0(userSession, r11, str, str2, str3, (String) null);
        this.A05 = str7;
    }

    public final void D1a(String str, String str2, String str3, int i, int i2) {
        String str4 = str2;
        String str5 = str3;
        C51973G9u.A1E(str, str4, str5);
        C17909Vi0 vi0 = this.A04;
        String str6 = this.A06;
        Long valueOf = Long.valueOf(this.A00);
        String str7 = this.A05;
        vi0.A00(valueOf, str4, str6, str7, i, i2);
        C249713kF r2 = C249713kF.A00;
        FragmentActivity activity = this.A01.getActivity();
        0qQ.A0A(activity);
        r2.A16(activity, this.A02, Boolean.valueOf(this.A0A), valueOf, this.A03.getModuleName(), str4, this.A08, str6, this.A07, str5, (String) null, this.A09, str7, false, false, false);
    }
}
