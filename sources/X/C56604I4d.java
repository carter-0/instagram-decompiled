package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.Fragment;
import com.meta.foa.cds.CdsBottomSheetTopSpan;
import com.meta.foa.cds.CdsOpenScreenConfig$BottomSheetMargins;
import com.meta.foa.session.FoaUserSession;

/* renamed from: X.I4d  reason: case insensitive filesystem */
public abstract class C56604I4d {
    public final Context A00;
    public final FoaUserSession A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A02, C58714IwN.A01(this, 47));
    public final 05G A03 = DbS.A10(new C56145HtX((Drawable) null, (2WX) null, (C56143HtV) null, new I1u(HNN.A0G, (HNN) null, HNO.A0W, (CharSequence) null, AnonymousClass05K.A00, "Close Bottom Sheet", J5X.A00), "", (CharSequence) null, AnonymousClass05K.A05, AnonymousClass05K.A0C, C51970G9q.A0J(), true, false, true));

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0025, code lost:
        r1 = (X.C56536I0l) r1.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(X.I4X r12, java.lang.String r13, X.0sP r14) {
        /*
            r11 = this;
            r5 = 0
            r2 = 1
            r6 = r12
            X.0qQ.A0B(r12, r2)
            X.0eM r1 = r11.A02
            java.lang.Object r0 = r1.getValue()
            X.I0l r0 = (X.C56536I0l) r0
            X.HtS r0 = r0.A00
            if (r0 == 0) goto L_0x0054
            X.01W r0 = r0.A04
            java.lang.Object r0 = r0.A0R()
            X.Hsw r0 = (X.C56109Hsw) r0
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = r0.A01
        L_0x001e:
            r8 = r13
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 != 0) goto L_0x0053
            java.lang.Object r1 = r1.getValue()
            X.I0l r1 = (X.C56536I0l) r1
            X.HtS r4 = r1.A00
            if (r4 == 0) goto L_0x0053
            java.lang.String r9 = r1.A01
            r0 = 4
            X.J6R r3 = X.J6R.A00(r1, r14, r0)
            r0 = 25
            X.Ivx r1 = X.C58688Ivx.A00(r12, r4, r0)
            r0 = 3
            X.J6R r0 = X.J6R.A00(r4, r3, r0)
            X.F3f r7 = X.C56467Hyz.A00(r13, r1, r0)
            r10 = 2
            X.IoT r3 = new X.IoT
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r4.A01(r3)
            X.0sP r0 = r4.A05
            X.C51968G9o.A1O(r0, r2)
        L_0x0053:
            return
        L_0x0054:
            r0 = 0
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56604I4d.A0E(X.I4X, java.lang.String, X.0sP):void");
    }

    public final void A0G(C56145HtX htX) {
        0qQ.A0B(htX, 0);
        this.A03.Epw(htX);
    }

    public C56604I4d(Context context, FoaUserSession foaUserSession) {
        this.A00 = context;
        this.A01 = foaUserSession;
    }

    public static Fragment A09(C56604I4d i4d) {
        return C56536I0l.A00((C56536I0l) i4d.A02.getValue()).A02.A00();
    }

    public static C56536I0l A0A(C56604I4d i4d) {
        return (C56536I0l) i4d.A02.getValue();
    }

    public final Fragment A0B() {
        return A09(this);
    }

    public final String A0C() {
        C56109Hsw hsw;
        C56140HtS htS = A0A(this).A00;
        if (htS == null || (hsw = (C56109Hsw) htS.A04.A0R()) == null) {
            return null;
        }
        return hsw.A01;
    }

    public final void A0D() {
        C56536I0l A0A = A0A(this);
        try {
            if (A0A.A01 != null) {
                A0A.A04.invoke();
            }
            C56140HtS htS = A0A.A00;
            if (htS != null) {
                htS.A01(C58708IwH.A01(htS, 10));
            }
            A0A.A01 = null;
        } catch (IllegalStateException unused) {
        } catch (Throwable th) {
            A0A.A00 = null;
            throw th;
        }
        A0A.A00 = null;
    }

    public final void A0F(I4X i4x, String str, 0sP r20) {
        C56536I0l A0A = A0A(this);
        if (A0A.A00 != null) {
            throw AnonymousClass7TE.A0z("Bottom sheet already launched! Use push to add new screen to bottom sheet or dismiss existing bottom sheet");
        }
        C55548HjU hjU = new C55548HjU(A0A);
        I4X i4x2 = i4x;
        int i = i4x2.A01;
        String str2 = str;
        C49719F3f A002 = C56467Hyz.A00(str2, C58688Ivx.A00(i4x2, A0A, 26), new C74189PqV((Object) i4x2, (Object) A0A, (Object) r20, str2, 48));
        Context context = A0A.A02;
        FoaUserSession foaUserSession = A0A.A03;
        C46626Di6 di6 = i4x2.A03;
        C46627Di7 di7 = C46627Di7.ENABLED;
        Integer num = i4x2.A04;
        EX5 ex5 = EX5.TOP_ROUNDED;
        CdsBottomSheetTopSpan.Dp dp = new CdsBottomSheetTopSpan.Dp(16);
        CdsOpenScreenConfig$BottomSheetMargins cdsOpenScreenConfig$BottomSheetMargins = new CdsOpenScreenConfig$BottomSheetMargins(0, 0, 0, 0);
        C49258Es1.A00(context, new FA0(i4x2.A02, dp, C46471DfZ.A0O, cdsOpenScreenConfig$BottomSheetMargins, ex5, C46471DfZ.A0R, di7, di6, hjU, num, Integer.valueOf(i), true), A002, foaUserSession, new Object());
    }

    public final void A0H(0sP r2) {
        C56140HtS htS = A0A(this).A00;
        if (htS != null) {
            htS.A02(r2);
        }
    }

    public final boolean A0I() {
        return AnonymousClass7TF.A1V(A0A(this).A00);
    }
}
