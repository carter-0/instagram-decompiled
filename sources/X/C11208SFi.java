package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.wellbeing.selfiecaptcha.videoupload.IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1;

/* renamed from: X.SFi  reason: case insensitive filesystem */
public final class C11208SFi {
    public final Context A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final C10985S3v A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public static final void A00(UserSession userSession, C11208SFi sFi, Integer num) {
        1iA r6;
        C11208SFi sFi2 = sFi;
        boolean A1V = AnonymousClass7TF.A1V(sFi.A06);
        Integer num2 = AnonymousClass05K.A00;
        Integer num3 = num;
        boolean A1W = AnonymousClass7TF.A1W(num3, num2);
        String A0Z = JTQ.A0Z();
        String A022 = AnonymousClass6SR.A02();
        0qQ.A07(A022);
        if (A1W) {
            r6 = 1iA.A0I;
        } else {
            r6 = 1iA.A0J;
        }
        UserSession userSession2 = userSession;
        C12075SmU A0e = JTR.A0e(userSession);
        int i = 1164305889;
        if (A1W) {
            i = 655;
        }
        AnonymousClass19S A012 = AnonymousClass1HX.A01(i, 3);
        1Eo.A03(num2, 19B.A00, new IgSelfieCaptchaVideoUploader$uploadWithIgVideo$1(A0e, userSession2, r6, sFi2, num3, A0Z, A022, (AnonymousClass4D7) null, A1W, A1V), A012);
    }

    public C11208SFi(Context context, C10985S3v s3v, String str, String str2, String str3, String str4, String str5) {
        C51972G9s.A1C(str, str3);
        this.A00 = context;
        this.A03 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A04 = str5;
        this.A02 = s3v;
    }
}
