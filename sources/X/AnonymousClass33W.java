package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.33W  reason: invalid class name */
public final class AnonymousClass33W {
    public final Context A00;
    public final C229382nI A01;
    public final UserSession A02;
    public final AnonymousClass310 A03;
    public final AnonymousClass33Y A04;
    public final AnonymousClass33X A05;
    public final AnonymousClass33V A06;
    public final AnonymousClass2oE A07;
    public final AnonymousClass4DU A08;
    public final 0Pl A09;
    public final C231502rm A0A;
    public final 0rQ A0B;
    public final C249763kK A0C;
    public final Boolean A0D;
    public final String A0E;
    public final String A0F;
    public final ConcurrentMap A0G;
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 31));
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final SearchContext A0O;
    public final Integer A0P;

    public AnonymousClass33W(Context context, C229382nI r9, UserSession userSession, AnonymousClass310 r11, AnonymousClass33V r12, AnonymousClass2oE r13, AnonymousClass4DU r14, 0Pl r15, C231502rm r16, 0rQ r17, SearchContext searchContext, C249763kK r19, Boolean bool, Integer num, String str, String str2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(context, 1);
        0qQ.A0B(r15, 4);
        0qQ.A0B(userSession, 5);
        0qQ.A0B(r14, 6);
        C231502rm r5 = r16;
        0qQ.A0B(r5, 11);
        0rQ r6 = r17;
        0qQ.A0B(r6, 12);
        0qQ.A0B(r12, 20);
        this.A00 = context;
        this.A01 = r9;
        this.A03 = r11;
        this.A09 = r15;
        this.A02 = userSession;
        this.A08 = r14;
        this.A07 = r13;
        this.A0C = r19;
        this.A0L = z;
        this.A0M = z2;
        this.A0A = r5;
        this.A0B = r6;
        this.A0E = str;
        this.A0N = z3;
        this.A0P = num;
        this.A0D = bool;
        this.A0O = searchContext;
        this.A0F = str2;
        this.A06 = r12;
        this.A0K = 2eO.A00(context);
        17j r1 = new 17j();
        r1.A03(64);
        r1.A01();
        this.A0G = r1.A00();
        this.A05 = new AnonymousClass33X(userSession, r11, r14, r5, r6);
        this.A04 = (AnonymousClass33Y) userSession.A01(AnonymousClass33Y.class, new C58684Ivt(userSession, 37));
        this.A0J = AnonymousClass0eN.A01(new AnonymousClass9LP(this, 33));
        this.A0I = AnonymousClass0eN.A00(0eO.A04, new AnonymousClass9LP(this, 32));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (X.AnonymousClass3Y8.A02(r2, r13, r14) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (X.C262574Fa.A00(r11.A02, r13) == false) goto L_0x003a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass3YB A02(com.instagram.common.typedurl.ImageUrl r12, X.1Xj r13, X.AnonymousClass3W1 r14, java.lang.String r15) {
        /*
            r11 = this;
            r8 = 0
            r1 = 1
            X.0qQ.A0B(r14, r1)
            boolean r0 = r11.A0N
            if (r0 != 0) goto L_0x002a
            com.instagram.common.session.UserSession r2 = r11.A02
            boolean r0 = X.AnonymousClass3Y8.A01(r2, r13, r14)
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3Y8.A00(r2, r13)
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3Y8.A03(r2, r13, r14)
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3Y8.A04(r2, r13, r14)
            if (r0 != 0) goto L_0x002a
            boolean r0 = X.AnonymousClass3Y8.A02(r2, r13, r14)
            r6 = 0
            if (r0 == 0) goto L_0x002b
        L_0x002a:
            r6 = 1
        L_0x002b:
            boolean r0 = r13.A5D()
            if (r0 == 0) goto L_0x003a
            com.instagram.common.session.UserSession r0 = r11.A02
            boolean r0 = X.C262574Fa.A00(r0, r13)
            r7 = 1
            if (r0 != 0) goto L_0x003b
        L_0x003a:
            r7 = 0
        L_0x003b:
            r2 = 0
            java.lang.Integer r4 = X.AnonymousClass05K.A00
            java.lang.String r5 = ""
            com.instagram.search.common.analytics.SearchContext r3 = r11.A0O
            X.4g5 r0 = r13.A0b
            r10 = 0
            if (r0 == 0) goto L_0x0048
            r10 = 1
        L_0x0048:
            java.lang.Integer r0 = r11.A0P
            if (r0 != 0) goto L_0x005c
            com.instagram.common.session.UserSession r0 = r11.A02
            com.instagram.user.model.User r0 = r13.A2A(r0)
            if (r0 == 0) goto L_0x005d
            boolean r0 = r0.isVerified()
            if (r0 != r1) goto L_0x005d
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x005c:
            r4 = r0
        L_0x005d:
            if (r15 == 0) goto L_0x0060
            r5 = r15
        L_0x0060:
            X.3YB r0 = new X.3YB
            r1 = r12
            r9 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass33W.A02(com.instagram.common.typedurl.ImageUrl, X.1Xj, X.3W1, java.lang.String):X.3YB");
    }

    public final void A03(View view, C231592rv r5, Object obj, Object obj2) {
        0qQ.A0B(r5, 1);
        0qQ.A0B(obj, 2);
        0qQ.A0B(obj2, 3);
        if (!r5.A01 || !this.A0A.A0V) {
            this.A03.BRO().ECB(view, r5.ordinal(), obj, obj2);
        }
        if (r5 == C231592rv.FULL_HEIGHT_SINGLE_MEDIA || r5 == C231592rv.LITHO_HYBRID_FULL_HEIGHT_SINGLE_MEDIA) {
            AnonymousClass3WV BRO = this.A03.BRO();
            View requireViewById = view.requireViewById(R.id.media_content_location);
            0qQ.A07(requireViewById);
            BRO.ECB(requireViewById, C231592rv.MEDIA_CONTENT.ordinal(), obj, obj2);
        }
    }

    public static final C245693dK A00(AnonymousClass33W r82, 1Xj r83, AnonymousClass3W1 r84) {
        AnonymousClass33W r2 = r82;
        Object value = r2.A0J.getValue();
        1Xj r0 = r83;
        AnonymousClass3W1 r3 = r84;
        Object obj = value;
        AnonymousClass33W r7 = r2;
        AnonymousClass3W1 r8 = r3;
        1Xj r9 = r0;
        AnonymousClass9MR r4 = new AnonymousClass9MR(18, obj, r7, r8, r9);
        C377409Ls r42 = new C377409Ls(9, r0, r3);
        AnonymousClass9LP r43 = new AnonymousClass9LP(r0, 29);
        AnonymousClass9MR r44 = new AnonymousClass9MR(25, obj, r7, r8, r9);
        AnonymousClass9MQ r6 = new AnonymousClass9MQ(8, r0, r2, value, r3);
        AnonymousClass9LP r45 = new AnonymousClass9LP(r2, 30);
        0sP r62 = new AnonymousClass9MC(20, r2, r0, r3);
        AnonymousClass9ME r63 = new AnonymousClass9ME(2, r0, r2, value);
        AnonymousClass9MT r64 = new AnonymousClass9MT(7, r2, r3, r0, value);
        C377409Ls r85 = new C377409Ls(5, r0, value);
        AnonymousClass9MI r86 = new AnonymousClass9MI(44, (Object) r3, value, (Object) r0);
        AnonymousClass9MI r87 = new AnonymousClass9MI(45, (Object) r3, value, (Object) r0);
        AnonymousClass33W r19 = r2;
        AnonymousClass9MQ r16 = new AnonymousClass9MQ(4, r0, r19, value, r3);
        C377409Ls r88 = new C377409Ls(6, r0, value);
        0sL r89 = new C377449Lw(10, r0, r2);
        AnonymousClass9MR r162 = new AnonymousClass9MR(17, value, r19, r3, r0);
        0sP r810 = new AnonymousClass9M5(43, r2, r0);
        AnonymousClass9MQ r163 = new AnonymousClass9MQ(5, r0, r19, value, r3);
        AnonymousClass9MI r65 = new AnonymousClass9MI(46, (Object) r3, value, (Object) r0);
        Object obj2 = value;
        AnonymousClass3W1 r20 = r3;
        1Xj r21 = r0;
        AnonymousClass9MR r164 = new AnonymousClass9MR(19, obj2, r19, r20, r21);
        AnonymousClass9MR r165 = new AnonymousClass9MR(20, obj2, r19, r20, r21);
        C377409Ls r46 = new C377409Ls(7, r0, value);
        AnonymousClass9LP r47 = new AnonymousClass9LP(r2, 25);
        AnonymousClass33W r432 = r2;
        AnonymousClass9MQ r40 = new AnonymousClass9MQ(6, r0, r432, value, r3);
        AnonymousClass33W r72 = r2;
        AnonymousClass9MQ r48 = new AnonymousClass9MQ(7, r0, r72, value, r3);
        AnonymousClass9LP r49 = new AnonymousClass9LP(r0, 26);
        AnonymousClass9MI r410 = new AnonymousClass9MI(47, (Object) r3, (Object) r2, (Object) r0);
        AnonymousClass9MI r411 = new AnonymousClass9MI(48, value, (Object) r2, (Object) r0);
        C377409Ls r412 = new C377409Ls(8, r0, value);
        AnonymousClass9LP r413 = new AnonymousClass9LP(r2, 27);
        Object obj3 = value;
        AnonymousClass3W1 r811 = r3;
        1Xj r92 = r0;
        AnonymousClass9MR r414 = new AnonymousClass9MR(21, obj3, r72, r811, r92);
        AnonymousClass9MR r415 = new AnonymousClass9MR(22, obj3, r72, r811, r92);
        AnonymousClass9MT r79 = new AnonymousClass9MT(6, r2, r3, r83, value);
        AnonymousClass9LP r14 = new AnonymousClass9LP(r0, 28);
        AnonymousClass9MR r416 = new AnonymousClass9MR(23, obj3, r72, r811, r92);
        C377409Ls r13 = new C377409Ls(10, r0, r2);
        C377409Ls r12 = new C377409Ls(11, r0, r2);
        AnonymousClass9MI r10 = new AnonymousClass9MI(49, value, (Object) r2, (Object) r0);
        AnonymousClass9MR r402 = new AnonymousClass9MR(24, value, r432, r3, r0);
        0sL r93 = new C377449Lw(11, r0, r3);
        0sL r812 = new AnonymousClass9MG(6, r3, r2, r0);
        return new C245693dK(r4, r42, r43, r44, r45, r63, r85, r86, r87, r88, r162, r65, r164, r165, r46, r47, r49, r410, r411, r412, r413, r414, r415, r14, r416, r13, r12, r10, r402, new AnonymousClass9ME(0, r0, value, r3), new C377409Ls(12, r0, r2), new C377409Ls(13, r0, value), new AnonymousClass9ME(1, r0, value, r3), r6, r62, r16, r810, r163, r40, r48, new AnonymousClass9M5(44, value, r3), r64, r89, r79, r93, r812);
    }

    public static final AnonymousClass3YW A01(AnonymousClass33W r6, 1Xj r7, AnonymousClass3W1 r8) {
        return new AnonymousClass3YW(r6.A00, r6.A02, r7, r8, r6.A08.getModuleName(), true);
    }
}
