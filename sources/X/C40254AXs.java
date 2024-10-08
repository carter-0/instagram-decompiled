package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.ui.widget.interactive.InteractiveDrawableContainer;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.List;

/* renamed from: X.AXs  reason: case insensitive filesystem */
public final class C40254AXs implements AnonymousClass1MK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C40254AXs(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A03 = obj4;
        this.A01 = obj;
        this.A05 = obj2;
        this.A04 = obj3;
        this.A02 = obj5;
    }

    public final void CyF(C226952iF r17, AnonymousClass3LX r18) {
        Number number;
        AnonymousClass3LX r1 = r18;
        if (this.A00 != 0) {
            C226952iF r0 = r17;
            AnonymousClass7TG.A1N(r0, r1);
            AbstractMap abstractMap = (AbstractMap) this.A01;
            C317966o8 r9 = (C317966o8) this.A04;
            0sP r8 = (0sP) this.A03;
            C62320sa r7 = (C62320sa) this.A02;
            Bitmap bitmap = r1.A01;
            if (bitmap != null) {
                Object C3s = r0.C3s();
                if (C3s instanceof Integer) {
                    number = (Number) C3s;
                } else {
                    number = null;
                }
                int i = 0;
                abstractMap.put(Integer.valueOf(AnonymousClass7TG.A0A(number)), bitmap);
                ImmutableList A022 = r9.A02();
                if (A022 != null && abstractMap.size() == A022.size()) {
                    List<Bitmap> A0a = 00k.A0a(abstractMap.values());
                    Bitmap bitmap2 = (Bitmap) 00k.A0J(A0a);
                    if (bitmap2 != null) {
                        int width = bitmap2.getWidth();
                        int height = bitmap2.getHeight();
                        Bitmap.Config config = bitmap2.getConfig();
                        0qQ.A0A(config);
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                        0qQ.A07(createBitmap);
                        Canvas canvas = new Canvas(createBitmap);
                        for (Bitmap drawBitmap : A0a) {
                            canvas.drawBitmap(drawBitmap, 0.0f, 0.0f, (Paint) null);
                        }
                        ImmutableList A023 = r9.A02();
                        if (A023 != null) {
                            i = A023.hashCode();
                        }
                        C63228KtZ.A00(createBitmap, r7, r8, i);
                        return;
                    }
                } else {
                    return;
                }
            }
            r7.invoke();
            return;
        }
        0qQ.A0B(r1, 1);
        Bitmap bitmap3 = r1.A01;
        if (bitmap3 != null) {
            Context context = (Context) this.A01;
            UserSession userSession = (UserSession) this.A05;
            User user = ((C3498582c) this.A03).A00;
            String A0e = AnonymousClass7TF.A0e(context.getResources(), AnonymousClass0t1.A01.A01(userSession).getUsername(), 2131974283);
            0qQ.A07(A0e);
            AnonymousClass8DV r92 = new AnonymousClass8DV(context.getResources(), bitmap3);
            r92.A02(0nA.A04(context, 12));
            C386059jz r72 = new C386059jz(context, r92, (Drawable) null, userSession, (C3498482b) null, user, "", A0e);
            AnonymousClass81W r12 = ((NineSixteenLayoutConfigImpl) ((TargetViewSizeProvider) this.A04)).A0K;
            C39890ADo A002 = C394869yp.A00(0.56f, (float) r12.getWidth(), (float) r12.getHeight(), 0.7f, false);
            A002.A0R = true;
            ((InteractiveDrawableContainer) this.A02).A0K(r72, new C310416b1(A002), false, false, false);
        }
    }

    public final void DJx(C226952iF r2, C254673sr r3) {
        if (this.A00 != 0) {
            ((C62320sa) this.A02).invoke();
        }
    }

    public final void DK4(C226952iF r1, int i) {
    }
}
