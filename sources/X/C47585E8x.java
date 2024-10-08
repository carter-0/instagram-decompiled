package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.E8x  reason: case insensitive filesystem */
public final class C47585E8x extends C331047Ph implements C231272rL, AnonymousClass7Q7 {
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public EyV A03;
    public final int A04 = 6;
    public final List A05;
    public final List A06;
    public final Set A07;
    public final Set A08;
    public final int A09;
    public final int A0A;
    public final AnonymousClass2s2 A0B;
    public final C46450DfD A0C;
    public final C46448DfA A0D;
    public final C46448DfA A0E;
    public final C39695A5l A0F;
    public final C336947fR A0G;
    public final C46453DfH A0H;
    public final EAE A0I;
    public final C46454DfI A0J;
    public final C46432Det A0K;
    public final boolean A0L;

    /* JADX WARNING: type inference failed for: r0v8, types: [java.lang.Object, X.A5l] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.2s2, java.lang.Object] */
    public C47585E8x(Activity activity, Context context, AnonymousClass0iw r24, UserSession userSession, AnonymousClass32K r26, G88 g88, C46443Df5 df5, C51960G9g g9g, AnonymousClass32I r30, C47521E6h e6h, C46432Det det, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass2s2 r3;
        UserSession userSession2 = userSession;
        boolean A1Z = DbW.A1Z(userSession2);
        C46443Df5 df52 = df5;
        0qQ.A0B(df52, 13);
        this.A0A = i;
        this.A09 = 6;
        this.A0L = z2;
        C46432Det det2 = det;
        this.A0K = det2;
        this.A07 = AnonymousClass7TE.A1F();
        this.A05 = AnonymousClass7TE.A1C();
        this.A08 = AnonymousClass7TE.A1F();
        this.A06 = AnonymousClass7TE.A1C();
        Context context2 = context;
        AnonymousClass0iw r14 = r24;
        C46443Df5 df53 = df52;
        C46453DfH dfH = new C46453DfH(activity, context2, r14, userSession2, df53, g9g, det2, (String) null, z3);
        this.A0H = dfH;
        C46450DfD dfD = new C46450DfD(context2, r14, userSession2, r26, g88, 182.A06(0Tu.A05, userSession2, 36316035841986421L), A1Z, false);
        this.A0C = dfD;
        C336947fR r9 = new C336947fR(context2);
        this.A0G = r9;
        this.A0F = new Object();
        C46448DfA A002 = C46448DfA.A00(2131974681);
        this.A0E = A002;
        this.A0D = C46448DfA.A00(2131962602);
        C46454DfI dfI = new C46454DfI(context2, r30);
        this.A0J = dfI;
        EAE eae = new EAE(r14, e6h);
        this.A0I = eae;
        if (z4) {
            ? obj = new Object();
            obj.A03 = context2.getResources().getDimensionPixelSize(R.dimen.bottom_sheet_survey_thanks_vertical_margin);
            r3 = obj;
        } else {
            r3 = null;
        }
        this.A0B = r3;
        this.A00 = A1Z;
        dfH.A00 = z;
        A002.A02 = 0;
        A002.A0I = false;
        ArrayList A1C = AnonymousClass7TE.A1C();
        A1C.addAll(0sr.A1P(new C231632rz[]{r9, dfI, dfH, dfD, eae}));
        if (r3 != null) {
            A1C.add(r3);
        }
        A0A(A1C);
    }

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        if (this.A07.contains(str) || this.A08.contains(str)) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0C() {
        /*
            r8 = this;
            r8.A06()
            int r1 = r8.A04
            r0 = 1
            int r6 = r1 - r0
            boolean r0 = r8.A02
            r5 = 0
            if (r0 == 0) goto L_0x0047
            java.util.List r4 = r8.A05
            int r0 = r4.size()
            if (r0 <= r1) goto L_0x0047
            r7 = 1
            java.util.List r3 = r4.subList(r5, r6)
        L_0x001a:
            boolean r0 = X.AnonymousClass7TE.A1b(r3)
            if (r0 == 0) goto L_0x004c
            boolean r0 = r8.A0L
            if (r0 != 0) goto L_0x002d
            X.DfA r2 = r8.A0D
            X.A5l r1 = r8.A0F
            X.7fR r0 = r8.A0G
            r8.A09(r0, r2, r1)
        L_0x002d:
            java.util.Iterator r3 = r3.iterator()
        L_0x0031:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004c
            java.lang.Object r2 = r3.next()
            r0 = 0
            X.FAU r1 = new X.FAU
            r1.<init>(r0, r0, r5)
            X.DfH r0 = r8.A0H
            r8.A09(r0, r2, r1)
            goto L_0x0031
        L_0x0047:
            r7 = 0
            java.util.List r3 = r8.A05
            r4 = r3
            goto L_0x001a
        L_0x004c:
            boolean r0 = r8.A01
            if (r0 == 0) goto L_0x0083
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.DfV r1 = new X.DfV
            r1.<init>(r0)
            X.DfI r0 = r8.A0J
        L_0x0059:
            r8.A08(r0, r1)
        L_0x005c:
            java.util.List r4 = r8.A06
            boolean r0 = X.AnonymousClass7TE.A1b(r4)
            if (r0 == 0) goto L_0x00ba
            X.DfA r2 = r8.A0E
            X.A5l r1 = r8.A0F
            X.7fR r0 = r8.A0G
            r8.A09(r0, r2, r1)
            int r3 = r4.size()
        L_0x0071:
            if (r5 >= r3) goto L_0x00ab
            java.lang.Object r2 = r4.get(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            X.DfD r0 = r8.A0C
            r8.A09(r0, r2, r1)
            int r5 = r5 + 1
            goto L_0x0071
        L_0x0083:
            if (r7 == 0) goto L_0x005c
            X.EyV r1 = r8.A03
            if (r1 != 0) goto L_0x0090
            X.EyV r1 = new X.EyV
            r1.<init>()
            r8.A03 = r1
        L_0x0090:
            int r0 = r8.A09
            r1.A01 = r0
            int r0 = r8.A0A
            int r0 = r0 - r6
            r1.A00 = r0
            int r0 = r4.size()
            java.util.List r0 = r4.subList(r6, r0)
            X.0qQ.A0B(r0, r5)
            r1.A02 = r0
            X.EyV r1 = r8.A03
            X.EAE r0 = r8.A0I
            goto L_0x0059
        L_0x00ab:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            X.DfV r1 = new X.DfV
            r1.<init>(r0)
            r0 = 1
            r1.A02 = r0
            X.DfI r0 = r8.A0J
            r8.A08(r0, r1)
        L_0x00ba:
            X.2s2 r1 = r8.A0B
            if (r1 == 0) goto L_0x00c2
            r0 = 0
            r8.A08(r1, r0)
        L_0x00c2:
            r8.A07()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47585E8x.A0C():void");
    }
}
