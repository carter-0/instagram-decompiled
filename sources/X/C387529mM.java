package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9mM  reason: invalid class name and case insensitive filesystem */
public final class C387529mM extends AA8 implements AnonymousClass1MK {
    public int A00;
    public Bitmap A01;
    public Drawable A02;
    public Drawable A03;
    public List A04 = 0sn.A00;
    public final Context A05;
    public final View A06;
    public final UserSession A07;
    public final AnonymousClass87H A08;
    public final TargetViewSizeProvider A09;
    public final C310416b1 A0A;
    public final C310416b1 A0B;

    public C387529mM(Context context, View view, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r42) {
        View view2 = view;
        UserSession userSession2 = userSession;
        AnonymousClass87H r2 = r42;
        AnonymousClass7TG.A0w(1, r2, userSession2, view2);
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        0qQ.A0B(targetViewSizeProvider2, 5);
        this.A08 = r2;
        this.A05 = context;
        this.A07 = userSession2;
        this.A06 = view2;
        this.A09 = targetViewSizeProvider2;
        Integer num = AnonymousClass05K.A00;
        this.A0A = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, true, false, false, true, false, false, false, true, true, true, true, true, false, false);
        this.A0B = new C310416b1((AnonymousClass8BH) null, (AnonymousClass8DA) null, (C3510487j) null, num, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, 0, false, false, false, true, false, false, false, true, true, true, true, true, false, false);
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void A0L() {
        DUJ duj = (DUJ) this.A04.get(this.A00);
        this.A01 = null;
        1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(duj.BGL()), (String) null);
        A0J.A02(this);
        A0J.A08 = Integer.valueOf(this.A00);
        A0J.A01();
        27p.A01(this.A07).A0v(C391599tL.TEMPLATES, duj.C4Z());
    }

    public final void DK4(C226952iF r5, int i) {
        AnonymousClass87H r3 = this.A08;
        if (r3.A0L(this)) {
            Drawable drawable = this.A03;
            if (drawable == null) {
                drawable = C394019xP.A00(this.A05, 0.65f);
                this.A03 = drawable;
            }
            r3.A0C(drawable, this.A0B, true);
        }
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        boolean A1Z = AnonymousClass7TG.A1Z(r6, r7);
        Object C3s = r6.C3s();
        if (C3s == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (C3s.equals(Integer.valueOf(this.A00))) {
            AnonymousClass87H r3 = this.A08;
            if (!r3.A0L(this)) {
                r3.A08(this.A03);
                return;
            }
            Bitmap bitmap = r7.A01;
            if (bitmap != null) {
                this.A01 = C394369xy.A00(bitmap, this.A09);
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A05.getResources(), this.A01);
                this.A02 = bitmapDrawable;
                r3.A0C(bitmapDrawable, this.A0A, A1Z);
                return;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }
}
