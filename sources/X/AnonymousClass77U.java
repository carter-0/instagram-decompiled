package X;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.77U  reason: invalid class name */
public final class AnonymousClass77U implements C332887Wv {
    public boolean A00 = true;
    public boolean A01;
    public View A02;
    public final Context A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9L0(this, 38));
    public final C62320sa A06;
    public final C249403jg A07 = new AnonymousClass77V(this);
    public final 02m A08;
    public final C62320sa A09;

    public AnonymousClass77U(Context context, 02m r5, C62320sa r6, C62320sa r7, C62320sa r8) {
        0qQ.A0B(r7, 3);
        0qQ.A0B(r8, 4);
        0qQ.A0B(r5, 5);
        this.A03 = context;
        this.A09 = r6;
        this.A06 = r8;
        this.A08 = r5;
        this.A04 = AnonymousClass0eN.A01(new AnonymousClass9L0(r7, 37));
    }

    private final void A02(C328007Db r7, boolean z) {
        this.A01 = false;
        this.A00 = z;
        AnonymousClass0eM r5 = this.A04;
        ((View) r5.getValue()).setVisibility(4);
        AnonymousClass0eM r3 = this.A05;
        ((Dialog) r3.getValue()).setContentView(R.layout.progress_dialog);
        ((AnonymousClass6ST) r3.getValue()).A00(this.A03.getString(2131965493));
        AnonymousClass0fN.A00((Dialog) r3.getValue());
        if (r7 != null) {
            View A012 = ((AnonymousClass74L) r7).A04.A01();
            0qQ.A07(A012);
            A012.setVisibility(0);
            this.A02 = A012;
        }
        ((RecyclerView) r5.getValue()).A15(this.A07);
        this.A08.markerStart(20126662);
    }

    public final void AUn(C328007Db r4, String str, boolean z) {
        A02((C328007Db) null, true);
        A01(this, str, 0, true);
    }

    public final void AUo(C328007Db r2, String str, boolean z) {
        A02(r2, z);
        A01(this, str, 0, false);
    }

    public static final void A00(AnonymousClass77U r3) {
        AnonymousClass0eM r2 = r3.A04;
        ((View) r2.getValue()).setVisibility(0);
        ((RecyclerView) r2.getValue()).A16(r3.A07);
        View view = r3.A02;
        if (view != null) {
            view.setVisibility(4);
        }
        ((Dialog) r3.A05.getValue()).hide();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass77U r6, java.lang.String r7, int r8, boolean r9) {
        /*
            boolean r0 = r6.A01
            r2 = 20126662(0x1331bc6, float:3.2897034E-38)
            if (r0 != 0) goto L_0x00ad
            r0 = 10
            if (r8 > r0) goto L_0x00ad
            X.0sa r0 = r6.A09
            java.lang.Object r3 = r0.invoke()
            X.7Zg r3 = (X.C333517Zg) r3
            if (r3 == 0) goto L_0x0085
            X.7ZY r1 = r3.BSN()
            if (r9 == 0) goto L_0x008b
            int r4 = r1.CME(r7)
        L_0x001f:
            r0 = -1
            if (r4 == r0) goto L_0x0098
            X.02m r3 = r6.A08
            java.lang.String r0 = "numOfPaginationsSoFar"
            r3.markerAnnotate(r2, r0, r8)
            X.2FW r1 = r1.BS5(r7)
            if (r1 == 0) goto L_0x003d
            X.Ekk r0 = X.C48822Ekk.$redex_init_class
            int r1 = r1.ordinal()
            r0 = 99
            if (r1 == r0) goto L_0x0088
            r0 = 98
            if (r1 == r0) goto L_0x0088
        L_0x003d:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
        L_0x003f:
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0086
            r1 = 1
        L_0x0046:
            java.lang.String r0 = "type"
            r3.markerAnnotate(r2, r0, r1)
            r0 = 2
            r3.markerEnd(r2, r0)
            A00(r6)
            X.0eM r5 = r6.A04
            java.lang.Object r0 = r5.getValue()
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 0
            X.Muo r3 = new X.Muo
            r3.<init>(r1, r0)
            r3.A00 = r4
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            X.3pI r2 = r0.A0D
            if (r2 == 0) goto L_0x0090
            boolean r0 = r6.A00
            if (r0 == 0) goto L_0x0082
            X.Mvd r1 = new X.Mvd
            r1.<init>(r6, r4)
            java.lang.Object r0 = r5.getValue()
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            r0.A15(r1)
        L_0x0082:
            r2.A0t(r3)
        L_0x0085:
            return
        L_0x0086:
            r1 = 0
            goto L_0x0046
        L_0x0088:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x003f
        L_0x008b:
            int r4 = r1.CMC(r7)
            goto L_0x001f
        L_0x0090:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0098:
            X.7S9 r1 = r3.AvL()
            boolean r0 = r1 instanceof X.AnonymousClass7S6
            if (r0 == 0) goto L_0x00b3
            X.7S6 r1 = (X.AnonymousClass7S6) r1
            if (r1 == 0) goto L_0x00b3
            X.PDw r0 = new X.PDw
            r0.<init>(r6, r7, r8, r9)
            r1.A0E(r0)
            return
        L_0x00ad:
            X.02m r1 = r6.A08
            r0 = 3
            r1.markerEnd(r2, r0)
        L_0x00b3:
            A00(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass77U.A01(X.77U, java.lang.String, int, boolean):void");
    }

    public final void EKV(String str) {
        int CMC;
        C333517Zg r0 = (C333517Zg) this.A09.invoke();
        if (r0 != null && (CMC = r0.BSN().CMC(str)) != -1) {
            AnonymousClass0eM r2 = this.A04;
            Context context = ((View) r2.getValue()).getContext();
            0qQ.A07(context);
            AnonymousClass52S r1 = new AnonymousClass52S(context);
            r1.A00 = CMC;
            C252553pI r02 = ((RecyclerView) r2.getValue()).A0D;
            if (r02 != null) {
                r02.A0t(r1);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void EKd(String str) {
        int CMC;
        C333517Zg r0 = (C333517Zg) this.A09.invoke();
        if (r0 != null && (CMC = r0.BSN().CMC(str)) != -1) {
            C252553pI r02 = ((RecyclerView) this.A04.getValue()).A0D;
            if (r02 != null) {
                r02.A1O(CMC);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }
}
