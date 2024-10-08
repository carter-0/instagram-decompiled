package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.6Ot  reason: invalid class name and case insensitive filesystem */
public final class C307086Ot {
    public float A00;
    public float A01;
    public float A02;
    public ImageView A03;
    public TextView A04;
    public C307106Ov A05;
    public final int A06;
    public final C252063oV A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 11));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9L1(this, 12));

    public final ImageView A00() {
        ImageView imageView = this.A03;
        if (imageView != null) {
            return imageView;
        }
        0qQ.A0F("swipeUpGuidanceChevron");
        throw AnonymousClass00P.createAndThrow();
    }

    public final TextView A01() {
        TextView textView = this.A04;
        if (textView != null) {
            return textView;
        }
        0qQ.A0F("swipeUpGuidanceText");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void A02() {
        A03(1.0f);
        if (this.A03 != null) {
            A00().setAlpha(0.0f);
        }
        float f = this.A00;
        if (this.A03 != null) {
            A00().setTranslationY(f);
        }
        if (this.A04 != null) {
            A01().setAlpha(0.0f);
        }
        float f2 = this.A02;
        if (this.A04 != null) {
            A01().setTranslationY(f2);
        }
    }

    public final void A03(float f) {
        C252063oV r1 = this.A07;
        if (r1.CVM()) {
            r1.getView().setAlpha(f);
        }
    }

    public C307086Ot(UserSession userSession, C252063oV r6) {
        this.A07 = r6;
        this.A05 = C307096Ou.A00((Context) null, userSession, (C255773uh) null);
        this.A06 = (int) (((float) 182.A00(0Tu.A05, userSession, 37162479406547178L)) * 1000.0f);
        r6.EeU(new C307116Ow(this));
    }
}
