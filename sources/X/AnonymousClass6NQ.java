package X;

import android.content.Context;
import android.util.SparseArray;
import com.instagram.android.R;
import java.util.Map;

/* renamed from: X.6NQ  reason: invalid class name */
public final class AnonymousClass6NQ implements 2IR {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ AnonymousClass6LP A02;
    public final /* synthetic */ AnonymousClass6NN A03;
    public final /* synthetic */ AnonymousClass6OI A04;
    public final /* synthetic */ C52504GVh A05;
    public final /* synthetic */ AnonymousClass6Q9 A06;
    public final /* synthetic */ C229392nJ A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ Map A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        AnonymousClass6OI r0 = this.A04;
        r0.A01.remove(this.A08);
        AnonymousClass6LP r1 = this.A02;
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        r1.A0C(message);
        String message2 = th.getMessage();
        if (message2 == null) {
            message2 = "";
        }
        r1.A0E(message2);
        String message3 = th.getMessage();
        if (message3 == null) {
            message3 = "";
        }
        r1.A0B(message3);
        this.A03.onFailure(th);
    }

    public AnonymousClass6NQ(Context context, SparseArray sparseArray, AnonymousClass6LP r3, AnonymousClass6NN r4, AnonymousClass6OI r5, C52504GVh gVh, AnonymousClass6Q9 r7, C229392nJ r8, String str, Map map, boolean z, boolean z2) {
        this.A02 = r3;
        this.A0A = z;
        this.A0B = z2;
        this.A04 = r5;
        this.A08 = str;
        this.A05 = gVh;
        this.A01 = sparseArray;
        this.A00 = context;
        this.A07 = r8;
        this.A09 = map;
        this.A03 = r4;
        this.A06 = r7;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C3034368u r8 = (C3034368u) obj;
        AnonymousClass6LP r3 = this.A02;
        if (r8 == null) {
            r3.A0B("result is null");
            r3.A0C("result is null");
        } else {
            r3.A0J(this.A0A);
        }
        if (!this.A0B) {
            AnonymousClass6OI r0 = this.A04;
            r0.A01.remove(this.A08);
        }
        r3.A04();
        try {
            C52504GVh gVh = this.A05;
            C3034368u r6 = gVh.A02;
            if (r8 != r6) {
                AnonymousClass6NS r02 = gVh.A01;
                if (r02 != null) {
                    r02.A05();
                }
                gVh.A01 = null;
                gVh.A02 = r8;
                r6 = r8;
            }
            if (gVh.A01 == null && r6 != null) {
                SparseArray clone = this.A01.clone();
                clone.put(R.id.showreel_config_provider, this.A06);
                clone.put(R.id.showreel_logger, r3);
                AnonymousClass6NR r1 = new AnonymousClass6NR(this.A00, r6, this.A07);
                r1.A01 = this.A09;
                r1.A00 = clone;
                AnonymousClass6NS A002 = r1.A00();
                gVh.A01 = A002;
                A002.A07(gVh.A03);
            }
            r3.A05();
            gVh.A03.getViewTreeObserver().addOnGlobalLayoutListener(new C306716Nf(r3, gVh, this.A0A));
            this.A03.onSuccess();
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            0wb.A06("IgShowreelCompositionComponentProvider#onBloksLayoutBinding", message, e);
            r3.A0D(message);
            r3.A0E(message);
            r3.A0B(message);
            this.A03.onFailure(e);
        }
    }
}
