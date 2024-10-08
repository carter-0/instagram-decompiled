package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.user.model.User;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9jm  reason: invalid class name and case insensitive filesystem */
public final class C385939jm extends 2Cn {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C385939jm(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.A00 = i2;
        this.A02 = obj3;
        this.A05 = obj2;
        this.A04 = obj4;
        this.A03 = obj;
        this.A01 = i;
    }

    public final void onFail(Exception exc) {
        if (this.A00 != 0) {
            Exception exc2 = exc;
            0qQ.A0B(exc2, 0);
            String message = exc2.getMessage();
            if (message != null) {
                0kD.A07(AnonymousClass000.A00(2289), message, (Throwable) null);
            }
            C59689JTv.A01((Context) this.A03, "giphy_download_error_message", 2131963098, 0);
            C60306Jj5 jj5 = (C60306Jj5) this.A05;
            05G r2 = jj5.A06;
            Collection collection = (Collection) ((C361278fx) r2.getValue()).A01;
            if (collection != null) {
                ArrayList A1D = AnonymousClass7TE.A1D(collection);
                int i = this.A01;
                C60956JuE juE = (C60956JuE) A1D.get(i);
                Integer num = AnonymousClass05K.A00;
                String str = juE.A05;
                String str2 = juE.A07;
                String str3 = juE.A06;
                int i2 = juE.A00;
                C63879LAi lAi = juE.A01;
                C63879LAi lAi2 = juE.A02;
                C39723A6o a6o = juE.A03;
                0qQ.A0B(str, 0);
                AnonymousClass7TG.A1O(str2, str3);
                AnonymousClass7TG.A1R(lAi, lAi2);
                0qQ.A0B(a6o, 6);
                A1D.set(i, new C60956JuE(lAi, lAi2, a6o, num, str, str2, str3, i2));
                r2.Epw(new AnonymousClass8Y4(A1D));
            }
            L45 l45 = jj5.A04;
            String str4 = ((C61077JwF) jj5.A09.getValue()).A01;
            0qQ.A0B(str4, 0);
            l45.A00.remove(str4);
            return;
        }
        0kD.A01("CanvasShoutoutController", "Unable to create medium for reel item");
        C387549mO.A03((C387549mO) this.A02, (User) this.A05, (List) this.A04, this.A01 + 1);
    }

    public final void onFinish() {
        if (1 - this.A00 != 0) {
            C385939jm.super.onFinish();
        }
    }

    public final void onStart() {
        if (1 - this.A00 != 0) {
            C385939jm.super.onStart();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C349307zv r2 = (C349307zv) obj2;
            0qQ.A0B(r2, 0);
            if (r2.A07 == 0) {
                onFail(new Exception("Video has duration of 0 ms"));
                return;
            }
            C60956JuE juE = (C60956JuE) this.A02;
            r2.A0w = AnonymousClass7TE.A1I(new AnonymousClass9JM((Integer) null, AnonymousClass000.A00(618), juE.A05, juE.A07, juE.A06, juE.A01.A05.getUrl()));
            C352328Cx r4 = ((C60306Jj5) this.A05).A03;
            Object obj3 = this.A04;
            AnonymousClass7TE.A1Z(new MHJ((Object) r2, obj3, (Object) r4, (AnonymousClass4D7) null, 26), C318116oQ.A00(r4));
            return;
        }
        File file = (File) obj2;
        1Xj r3 = (1Xj) this.A03;
        int A09 = AnonymousClass7TG.A09(r3);
        0qQ.A0B(file, 0);
        Medium A032 = C282665Eg.A03(file, A09, 0);
        C387549mO r22 = (C387549mO) this.A02;
        User user = (User) this.A05;
        List list = (List) this.A04;
        int i = this.A01;
        if (r3.CeS()) {
            AnonymousClass87H r7 = r22.A0B;
            UserSession userSession = r22.A09;
            Context context = r22.A07;
            r7.A0C(C39808AAf.A00(context, userSession, user, C387549mO.A00(r22).A01), r22.A0G, true);
            User A012 = AnonymousClass0t1.A01.A01(userSession);
            String A2n = r3.A2n();
            0qQ.A0B(context, 1);
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
            int A0F = AnonymousClass7TE.A0F(resources);
            C369848vQ r13 = new C369848vQ(context, (Drawable) null, (0qm) null, A012, (String) null, A2n, A0F, A0F, dimensionPixelSize, dimensionPixelSize2, A0F, false);
            float A0l = r3.A0l();
            AnonymousClass81W r10 = ((NineSixteenLayoutConfigImpl) r22.A0A).A0K;
            C39890ADo A002 = C394869yp.A00(A0l, (float) r10.getWidth(), (float) r10.getHeight(), 0.5f, false);
            A002.A04 = 0.5f;
            AnonymousClass87H.A01(r13, r7, A002, false);
            C349307zv A052 = C39906AIv.A05(context, A032, userSession);
            Bitmap bitmap = r22.A01;
            bitmap.getClass();
            A052.A0N = bitmap;
            String id = r3.getId();
            id.getClass();
            C39740A7g a7g = new C39740A7g(r7.A03(A052, id), r3.getId());
            a7g.A00 = r22.A01;
            a7g.A04 = A052;
            r22.A04.add(a7g);
            C387549mO.A03(r22, user, list, i + 1);
            return;
        }
        Context context2 = r22.A07;
        User A2A = r3.A2A(r22.A09);
        A2A.getClass();
        String A2n2 = r3.A2n();
        AnonymousClass81W r5 = ((NineSixteenLayoutConfigImpl) r22.A0A).A0K;
        int width = r5.getWidth();
        int height = r5.getHeight();
        0qQ.A0B(context2, 1);
        C386049jy r9 = new C386049jy(context2, A032, A2A, A2n2, width, height, true);
        r9.A9D(new AZ6(i, 2, r22, r9, r3, user, list));
    }
}
