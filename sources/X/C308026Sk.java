package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: X.6Sk  reason: invalid class name and case insensitive filesystem */
public final class C308026Sk extends 2Th implements C251273mq {
    public static final C253183qL A0C = new C308036Sl();
    public static final C253183qL A0D = new C308046Sm();
    public static final C253183qL A0E = new C308056Sn();
    public static final C253183qL A0F = new C308066So();
    public int A00 = -1;
    public int A01;
    public int A02;
    public Drawable A03;
    public Drawable A04;
    public View.OnClickListener A05;
    public C276544tV A06;
    public C308076Sp A07;
    public boolean A08 = true;
    public boolean A09;
    public final long A0A;
    public final C307786Rm A0B;

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, java.lang.Object, X.4n3, X.5uY] */
    public final /* bridge */ /* synthetic */ Object ALg(Context context) {
        0qQ.A0B(context, 1);
        ? r1 = new C273704n3(context);
        r1.A00 = new C299095uZ(r1);
        return r1;
    }

    public final /* synthetic */ 2Ue D6k(int i) {
        return C246243eG.A00(this, i);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.6Sp, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.3qL, java.lang.Object] */
    public C308026Sk(C307786Rm r7, long j, boolean z) {
        super(AnonymousClass05K.A01);
        this.A0A = j;
        C244233ar[] r2 = {new C244233ar(A0C, this), new C244233ar(A0D, this), new C244233ar(A0F, this), new C244233ar(A0E, this)};
        int i = 0;
        do {
            A0D(r2[i]);
            i++;
        } while (i < 4);
        this.A02 = 0;
        this.A07 = new Object();
        this.A0B = r7;
        C244233ar[] r22 = {new C244233ar(new C308096Sr(this.A0A), this), new C244233ar(new Object(), this)};
        int i2 = 0;
        do {
            A0D(r22[i2]);
            i2++;
        } while (i2 < 2);
        if (!z) {
            A0D(new C244233ar(new AnonymousClass6OS(this), this));
        }
    }

    public final long A0H() {
        return this.A0A;
    }

    public final C251273mq A0I() {
        return this;
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
