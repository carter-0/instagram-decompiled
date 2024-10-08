package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.UlK  reason: case insensitive filesystem */
public final class C15949UlK extends C16081Uo8 {
    public C17446VVz A00;
    public final Context A01;
    public final View.OnClickListener A02;
    public final 0hq A03;
    public final C19388WXf A04 = new C19388WXf(this, 1);
    public final C267664bz A05;
    public final AnonymousClass0iw A06;
    public final 0wc A07;
    public final UserSession A08;
    public final C18586Vud A09;
    public final C232682uF A0A;
    public final C17996VjY A0B;
    public final C230152p2 A0C = new C19383WXa(this, 0);
    public final C230132oy A0D;
    public final C18755Vzq A0E;
    public final C17354VSh A0F;
    public final UmI A0G;
    public final VO8 A0H;
    public final C17775Vfm A0I;
    public final 2bv A0J;
    public final C230882qT A0K;
    public final AnonymousClass32A A0L;
    public final int A0M;
    public final RectF A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;

    public static 0xF A00(C15949UlK ulK) {
        0xF r2 = new 0xF();
        0xF.A00(r2, ulK.A0P, C273654mx.A00(277));
        0xF.A00(r2, ulK.A0Q, "entry_trigger");
        String str = ulK.A0O;
        if (str != null) {
            0xF.A00(r2, str, "format");
        }
        String str2 = ulK.A0R;
        if (str2 != null) {
            0xF.A00(r2, str2, C273654mx.A00(161));
        }
        return r2;
    }

    public static void A01(C15949UlK ulK) {
        if (!(!AnonymousClass06S.A01(ulK.A03))) {
            C51970G9q.A12(ulK.A00.getActivity());
        }
    }

    public final void A03(Hashtag hashtag, boolean z) {
        C17775Vfm vfm = this.A0I;
        if (vfm.A00() != null) {
            C18023Vjz vjz = new C18023Vjz(hashtag);
            Integer valueOf = Integer.valueOf(z ? 1 : 0);
            vjz.A08 = valueOf;
            vjz.A09 = valueOf;
            Hashtag A002 = vjz.A00();
            C16742V3z A003 = vfm.A00();
            0qQ.A0B(A002, 0);
            A003.A01 = A002;
        }
    }

    public final void onScroll(C238133Ar r7, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int A032 = AnonymousClass0fD.A03(633695091);
        if (!AnonymousClass06S.A01(this.A03)) {
            i6 = -1118459655;
        } else {
            C17446VVz vVz = this.A00;
            if (vVz != null) {
                View view = vVz.A00;
                RectF rectF = this.A0N;
                0nA.A0L(rectF, view);
                int i7 = (rectF.bottom > ((float) this.A0M) ? 1 : (rectF.bottom == ((float) this.A0M) ? 0 : -1));
                C18755Vzq vzq = this.A0E;
                if (i7 <= 0) {
                    vzq.A06.Epx(vzq, false, C18755Vzq.A07[0]);
                    C17996VjY vjY = this.A0B;
                    vjY.A00 = C322496vv.Closed;
                    C15381Ube.A03(vjY.A04.A00);
                } else {
                    AnonymousClass7TF.A1J(vzq, vzq.A06, C18755Vzq.A07, 0, true);
                }
            }
            i6 = 1201133407;
        }
        AnonymousClass0fD.A0A(i6, A032);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15949UlK(android.view.View.OnClickListener r12, androidx.fragment.app.Fragment r13, X.0hq r14, X.C267664bz r15, X.C227762js r16, X.C231302rO r17, X.AnonymousClass0iw r18, com.instagram.common.session.UserSession r19, X.C18586Vud r20, X.C232682uF r21, X.C17996VjY r22, X.C18755Vzq r23, X.UmI r24, X.VO8 r25, X.C17775Vfm r26, X.AnonymousClass4DV r27, X.2bv r28, X.C230882qT r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, java.lang.String r33) {
        /*
            r11 = this;
            X.3BQ r10 = X.AnonymousClass3BQ.HASHTAG_FEED
            r7 = r21
            r8 = r19
            r6 = r17
            r5 = r16
            r9 = r27
            r3 = r11
            r4 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1 = 1
            X.WXf r0 = new X.WXf
            r0.<init>(r11, r1)
            r11.A04 = r0
            r1 = 0
            X.WXa r0 = new X.WXa
            r0.<init>(r11, r1)
            r11.A0C = r0
            r11.A08 = r8
            r0 = r18
            r11.A06 = r0
            X.0wc r0 = X.AnonymousClass0kN.A01(r7, r8)
            r11.A07 = r0
            android.content.Context r0 = r13.requireContext()
            r11.A01 = r0
            r11.A03 = r14
            r11.A0A = r7
            r0 = r26
            r11.A0I = r0
            r0 = r20
            r11.A09 = r0
            android.content.Context r2 = r13.requireContext()
            X.0gy r1 = X.AnonymousClass07i.A00(r13)
            X.2oy r0 = new X.2oy
            r0.<init>(r2, r1, r7, r8)
            r11.A0D = r0
            r0 = r28
            r11.A0J = r0
            r0 = r29
            r11.A0K = r0
            r0 = r22
            r11.A0B = r0
            r0 = r23
            r11.A0E = r0
            android.content.Context r2 = r13.requireContext()
            X.Vh9 r1 = r11.A04
            X.VSh r0 = new X.VSh
            r0.<init>(r2, r1)
            r11.A0F = r0
            X.328 r1 = new X.328
            r1.<init>(r13)
            X.32A r0 = new X.32A
            r0.<init>(r7, r8, r1)
            r11.A0L = r0
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r0.toString()
            r0 = r24
            r11.A0G = r0
            r0 = r25
            r11.A0H = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.A0N = r0
            androidx.fragment.app.Fragment r0 = r11.A00
            androidx.fragment.app.FragmentActivity r0 = r0.requireActivity()
            int r0 = X.2db.A01(r0)
            r11.A0M = r0
            r0 = r30
            r11.A0P = r0
            r0 = r31
            r11.A0Q = r0
            r0 = r32
            r11.A0R = r0
            r0 = r33
            r11.A0O = r0
            r11.A05 = r15
            r11.A02 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15949UlK.<init>(android.view.View$OnClickListener, androidx.fragment.app.Fragment, X.0hq, X.4bz, X.2js, X.2rO, X.0iw, com.instagram.common.session.UserSession, X.Vud, X.2uF, X.VjY, X.Vzq, X.UmI, X.VO8, X.Vfm, X.4DV, X.2bv, X.2qT, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
