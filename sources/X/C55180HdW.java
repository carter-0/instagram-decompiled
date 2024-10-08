package X;

import com.instagram.android.R;

/* renamed from: X.HdW  reason: case insensitive filesystem */
public abstract class C55180HdW {
    public static final void A00(I10 i10, String str, String str2, String str3, String str4, C62320sa r9) {
        AnonymousClass7TG.A1N(str, str2);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = str3;
        A0a.A02();
        A0a.A07(R.drawable.instagram_settings_outline_44);
        A0a.A0G = str4;
        A0a.A01 = 5000;
        A0a.A0A(new IVR(3, r9, i10));
        A0a.A0L = true;
        Dc2 A00 = A0a.A00();
        I10.A00(i10, AnonymousClass05K.A0j, 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L("original_value", str), AnonymousClass7TE.A1L("new_value", str2)}));
        DbX.A1S(A00);
    }
}
