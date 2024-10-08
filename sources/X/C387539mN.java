package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.List;

/* renamed from: X.9mN  reason: invalid class name and case insensitive filesystem */
public final class C387539mN extends AA8 implements AnonymousClass1MK {
    public Bitmap A00;
    public Drawable A01;
    public C317876nz A02;
    public List A03 = AnonymousClass7TE.A1C();
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Context A07;
    public final UserSession A08;
    public final C3510387i A09;
    public final TargetViewSizeProvider A0A;
    public final AnonymousClass87H A0B;
    public final C39778A8x A0C;
    public final C39890ADo A0D;

    public static final void A03(C387539mN r9, List list, int i) {
        C387539mN r7 = r9;
        AnonymousClass87H r5 = r9.A0B;
        Drawable drawable = r9.A01;
        C39890ADo aDo = r9.A0D;
        aDo.A0N = false;
        r5.A0C(drawable, new C310416b1(aDo), true);
        List list2 = list;
        int size = list.size();
        int i2 = i;
        if (i == size) {
            C3509386y r2 = r5.A00;
            r2.A06();
            r7.A06 = false;
            List list3 = r7.A03;
            r2.A01.A00();
            A00(r7);
            r5.A0G(r2.A01.A01.A08(), list3);
            return;
        }
        1Xj r8 = (1Xj) list2.get(i);
        if (r8.A5v()) {
            C290815g0 A002 = C59730JVo.A00(r7.A07, r7.A08, r8, "CanvasEndOfYearController");
            A002.A00 = new C385869jf(i, 2, r8, r7, list2);
            1ES.A03(A002);
            return;
        }
        AnonymousClass57C r6 = AnonymousClass57C.CREATE_MODE_USER_SEARCH;
        C310416b1 A022 = C39906AIv.A02(r7.A07, r7.A0A, r8);
        C3509386y r1 = r5.A00;
        r1.A01.A00();
        C347017w8 A0O = r1.A01.A03.A0O(r6, r8, A022);
        Drawable drawable2 = r7.A01;
        aDo.A0N = false;
        AnonymousClass87H.A01(drawable2, r5, aDo, false);
        A0O.A9D(new AZ4(A0O, r7, r8, list2, i2, 2));
    }

    public final void CyF(C226952iF r6, AnonymousClass3LX r7) {
        boolean A1U = AnonymousClass7TF.A1U(0, r6, r7);
        Object C3s = r6.C3s();
        if (C3s == null) {
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (C3s.equals(0)) {
            AnonymousClass87H r3 = this.A0B;
            if (r3.A0L(this)) {
                r3.A07();
                Bitmap bitmap = r7.A01;
                if (bitmap != null) {
                    this.A00 = C394369xy.A00(bitmap, this.A0A);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(this.A07.getResources(), this.A00);
                    this.A01 = bitmapDrawable;
                    C39890ADo aDo = this.A0D;
                    aDo.A0N = A1U;
                    AnonymousClass87H.A01(bitmapDrawable, r3, aDo, A1U);
                    A01(this);
                    return;
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
    }

    public final void DJx(C226952iF r1, C254673sr r2) {
    }

    public final void DK4(C226952iF r1, int i) {
    }

    public static final void A00(C387539mN r39) {
        C387539mN r2 = r39;
        C317876nz r3 = r2.A02;
        if (r3 != null) {
            C347017w8 A012 = C347017w8.A01(r2.A07, r2.A08, r3);
            r2.A0B.A0B(A012, AnonymousClass57C.CREATE_MODE_DIAL_SELECTION, r3, new C310416b1((AnonymousClass8BH) new AnonymousClass8BG(0.5f, 0.9f), (AnonymousClass8DA) null, (C3510487j) null, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, -1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -2, false, false, true, true, false, false, true, true, true, true, true, true, false, false), false, false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r0 = r4.A0C;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C387539mN r4) {
        /*
            android.graphics.drawable.Drawable r0 = r4.A01
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.A05
            if (r0 != 0) goto L_0x0034
            X.A8x r0 = r4.A0C
            java.lang.String r1 = r0.A01
            if (r1 == 0) goto L_0x0034
            com.instagram.reels.store.ReelStore r0 = r0.A03
            com.instagram.model.reels.Reel r0 = r0.A0M(r1)
            if (r0 == 0) goto L_0x0034
            java.util.List r3 = r0.A0K()
            X.0qQ.A07(r3)
            java.util.Set r2 = r0.A0Q()
            X.0qQ.A07(r2)
            r1 = 4
            X.ArV r0 = new X.ArV
            r0.<init>((java.lang.Object) r3, (int) r1)
            java.util.List r1 = X.00k.A0g(r2, r0)
            if (r1 == 0) goto L_0x0034
            r0 = 0
            A03(r4, r1, r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C387539mN.A01(X.9mN):void");
    }

    public static final void A02(C387539mN r6) {
        C39778A8x a8x = r6.A0C;
        String str = a8x.A02;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        C379669Uv.A01(new C385479j0(r6, 7), r6.A08, str);
        String str3 = a8x.A00;
        if (str3 != null) {
            str2 = str3;
        }
        r6.A00 = null;
        1OO A0J = 1NK.A00().A0J(new SimpleImageUrl(str2), (String) null);
        A0J.A02(r6);
        A0J.A08 = 0;
        A0J.A01();
    }

    public C387539mN(Context context, UserSession userSession, C3510387i r5, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass87H r7) {
        AnonymousClass7TG.A1O(r7, r5);
        0qQ.A0B(userSession, 4);
        0qQ.A0B(targetViewSizeProvider, 6);
        this.A0B = r7;
        this.A09 = r5;
        this.A07 = context;
        this.A08 = userSession;
        this.A0A = targetViewSizeProvider;
        C39890ADo aDo = new C39890ADo();
        aDo.A0R = false;
        this.A0D = aDo;
        this.A0C = (C39778A8x) userSession.A01(C39778A8x.class, new C66300MMj(userSession, 9));
    }
}
