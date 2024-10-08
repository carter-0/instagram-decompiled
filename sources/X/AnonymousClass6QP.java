package X;

import android.content.Context;
import android.graphics.Rect;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.6QP  reason: invalid class name */
public final class AnonymousClass6QP extends 2Th implements C251273mq {
    public static final AnonymousClass6QR A0B = new AnonymousClass6QR();
    public static final AnonymousClass6QS A0C = new AnonymousClass6QS();
    public static final AnonymousClass6QQ A0D = new AnonymousClass6QQ();
    public Rect A00;
    public C226732hl A01;
    public final ContextChain A02;
    public final AnonymousClass6QN A03;
    public final AnonymousClass579 A04;
    public final 1U1 A05;
    public final C226662he A06;
    public final Object A07;
    public final boolean A08;
    public final long A09;
    public final C251273mq A0A = this;

    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 0);
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setImageDrawable(C226722hk.A00().ALv());
        return imageView;
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    public AnonymousClass6QP(ContextChain contextChain, AnonymousClass6QN r4, AnonymousClass579 r5, 1U1 r6, C226662he r7, Object obj, long j, boolean z) {
        super(AnonymousClass05K.A01);
        this.A09 = j;
        this.A06 = r7;
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = z;
        this.A07 = obj;
        this.A02 = contextChain;
        A0D(new C244233ar(A0C, this));
        A0D(new C244233ar(A0D, this));
        A0C(new C244233ar(A0B, this));
    }

    public static final boolean A00(AnonymousClass6QP r2, AnonymousClass6QP r3) {
        if (!0qQ.A0K(r2.A06, r3.A06) || !0qQ.A0K(r2.A05, r3.A05) || r2.A08 != r3.A08 || !0qQ.A0K(r2.A04, r3.A04) || !0qQ.A0K(r2.A03, r3.A03)) {
            return true;
        }
        return false;
    }

    public final long A0H() {
        return this.A09;
    }

    public final C251273mq A0I() {
        return this.A0A;
    }

    public final /* synthetic */ boolean AFh() {
        return false;
    }

    public final /* synthetic */ 2Sd Bdg() {
        return C243983aS.A00;
    }

    public final /* synthetic */ int E2z() {
        return 3;
    }

    public final /* synthetic */ Object Bdd() {
        return getClass();
    }
}
