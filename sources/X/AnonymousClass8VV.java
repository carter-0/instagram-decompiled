package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.8VV  reason: invalid class name */
public final class AnonymousClass8VV extends 1P0 {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ AnonymousClass823 A01;
    public final /* synthetic */ AnonymousClass80R A02;

    public AnonymousClass8VV(Resources resources, AnonymousClass823 r2, AnonymousClass80R r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = resources;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C384589hZ r0;
        C317876nz r02;
        C317876nz r03;
        String str;
        int A03 = AnonymousClass0fD.A03(1091165068);
        AnonymousClass8VW r7 = (AnonymousClass8VW) obj;
        int A032 = AnonymousClass0fD.A03(-1232416218);
        if (!(r7 == null || (r0 = r7.A00) == null || (r02 = r0.A00) == null)) {
            String str2 = r02.A0Z;
            AnonymousClass80R r8 = this.A02;
            1Av A002 = 1Au.A00(r8.A0R);
            if (!str2.equals(A002.A84.CDM(A002, 1Av.A8a[265]))) {
                AnonymousClass823 r6 = this.A01;
                AnonymousClass8D9 r4 = r8.A1w;
                Resources resources = this.A00;
                C384589hZ r04 = r7.A00;
                if (r04 != null) {
                    r03 = r04.A00;
                } else {
                    r03 = null;
                }
                C40306AZv aZv = new C40306AZv(r03, r6, r4);
                C357318Xk A003 = r6.A00();
                C357328Xl r10 = C357328Xl.UNLOCKED_STICKER;
                A003.A05.put(r10, aZv);
                C357318Xk A004 = r6.A00();
                C384589hZ r05 = r7.A00;
                if (r05 != null) {
                    str = r05.A01;
                } else {
                    str = null;
                }
                A004.A02(new C339287jM((Drawable) null, (View.OnClickListener) null, (ImageUrl) null, (C66504MUi) null, r10, (AnonymousClass4Ke) null, (String) null, resources.getString(2131975955, new Object[]{str}), 1, 2131975496, 0, R.drawable.sticker_gradient_icon, R.dimen.abc_alert_dialog_button_dimen, false, false, true, false, false), 1000);
            }
        }
        AnonymousClass0fD.A0A(-198433856, A032);
        AnonymousClass0fD.A0A(-638849169, A03);
    }
}
