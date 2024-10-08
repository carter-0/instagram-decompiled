package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.instagram.common.session.UserSession;

public abstract class AJA {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.UpU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: X.7w8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: X.7w8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: X.7w8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: X.7w8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: X.7w8} */
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Aee, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.Drawable A00(android.content.Context r5, com.instagram.common.session.UserSession r6, X.C314246ht r7, X.C317876nz r8) {
        /*
            r0 = 0
            r2 = r5
            X.0qQ.A0B(r5, r0)
            r4 = r8
            X.6oG r0 = r8.A00()
            int r0 = r0.ordinal()
            r5 = 0
            r3 = r6
            switch(r0) {
                case 20: goto L_0x001c;
                case 30: goto L_0x001c;
                case 36: goto L_0x001c;
                case 43: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 59: goto L_0x003a;
                case 60: goto L_0x001c;
                case 62: goto L_0x001c;
                case 64: goto L_0x001c;
                case 68: goto L_0x001c;
                case 70: goto L_0x001c;
                case 71: goto L_0x001c;
                case 73: goto L_0x001c;
                case 85: goto L_0x001c;
                case 87: goto L_0x001c;
                case 97: goto L_0x001d;
                case 104: goto L_0x0048;
                case 105: goto L_0x001c;
                case 107: goto L_0x001c;
                default: goto L_0x0013;
            }
        L_0x0013:
            r0 = r2
            r1 = r5
            r2 = r5
            X.7w8 r5 = X.C347017w8.A00(r0, r1, r2, r3, r4, r5)
        L_0x001a:
            android.graphics.drawable.Drawable r5 = (android.graphics.drawable.Drawable) r5
        L_0x001c:
            return r5
        L_0x001d:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r0 = r0.A01(r6)
            com.instagram.api.schemas.SubscriptionStickerDict r1 = new com.instagram.api.schemas.SubscriptionStickerDict
            r1.<init>(r0, r5, r5, r5)
            X.Aee r0 = new X.Aee
            r0.<init>()
            r0.A00 = r1
            X.UpU r5 = new X.UpU
            r5.<init>(r2, r0)
            X.6M4 r0 = r5.A00
            r0.A01()
            goto L_0x001a
        L_0x003a:
            X.ADK r1 = X.C369468uo.A0F
            X.6nz r4 = X.C317876nz.A17
            long r7 = r7.AyD()
            r6 = r5
            X.7w8 r5 = r1.A01(r2, r3, r4, r5, r6, r7)
            goto L_0x001a
        L_0x0048:
            long r0 = r7.AyD()
            X.7w8 r5 = X.C378999Sa.A00(r2, r6, r8, r0)
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJA.A00(android.content.Context, com.instagram.common.session.UserSession, X.6ht, X.6nz):android.graphics.drawable.Drawable");
    }

    public static AIr A03(Context context, UserSession userSession, int i) {
        AIr aIr = new AIr(userSession, context);
        aIr.A08(i);
        int[] iArr = AnonymousClass6LW.A0D;
        0qQ.A0B(iArr, 0);
        aIr.A0D = iArr;
        return aIr;
    }

    public static AIr A04(Context context, UserSession userSession, int i) {
        AIr aIr = new AIr(userSession, context);
        aIr.A08(i);
        int[] iArr = AnonymousClass6LW.A0G;
        0qQ.A0B(iArr, 0);
        aIr.A0D = iArr;
        return aIr;
    }

    public static AIr A05(Context context, UserSession userSession, int i) {
        AIr aIr = new AIr(userSession, context);
        aIr.A08(i);
        int[] iArr = AnonymousClass6LW.A02;
        0qQ.A0B(iArr, 0);
        aIr.A0D = iArr;
        return aIr;
    }

    public static AIr A06(Context context, UserSession userSession, int i) {
        AIr aIr = new AIr(userSession, context);
        aIr.A08(i);
        int[] iArr = AnonymousClass6LW.A0E;
        0qQ.A0B(iArr, 0);
        aIr.A0D = iArr;
        return aIr;
    }

    public static AIr A07(Context context, UserSession userSession, int i) {
        AIr aIr = new AIr(userSession, context);
        aIr.A08(i);
        int[] iArr = AnonymousClass6LW.A06;
        0qQ.A0B(iArr, 0);
        aIr.A0D = iArr;
        return aIr;
    }

    public static C306386Ly A08(AIr aIr, int i) {
        aIr.A09(i);
        return aIr.A04();
    }

    public static C306386Ly A09(AIr aIr, int i, int i2) {
        aIr.A06(i);
        aIr.A09(i2);
        return aIr.A05();
    }

    public static final void A0A(Drawable drawable, boolean z) {
        Drawable mutate = drawable.mutate();
        int i = 127;
        if (z) {
            i = 255;
        }
        mutate.setAlpha(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.UjJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: X.9Wh} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: X.9Wg} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v46, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v47, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v48, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v49, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v50, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v51, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v52, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v66, resolved type: X.9Wl} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0436, code lost:
        if (r5.A00() == X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0061, code lost:
        if (r5.A00() == X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x074a, code lost:
        return new X.A66(r2, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r14, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        r0 = 2131968497;
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x007a, code lost:
        return new X.A66(r13, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r14, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x07df, code lost:
        return new X.A66(r2, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r14, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x086b, code lost:
        return new X.A66(r2, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r14, r0));
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.A66 A01(android.content.Context r15, com.instagram.common.session.UserSession r16, X.C279284yO r17, X.C314246ht r18, X.C317876nz r19) {
        /*
            r1 = 0
            r14 = r15
            X.0qQ.A0B(r15, r1)
            r15 = r16
            r0 = r17
            boolean r0 = X.C346897vw.A02(r15, r0)
            r2 = r18
            r5 = r19
            if (r0 == 0) goto L_0x0018
            X.A66 r3 = A02(r14, r15, r2, r5)
            return r3
        L_0x0018:
            r0 = 1
            android.content.res.Resources r9 = r14.getResources()
            X.0Tu r7 = X.0Tu.A05
            r3 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            boolean r4 = X.182.A06(r7, r15, r3)
            r3 = 2131238286(0x7f081d8e, float:1.8092846E38)
            if (r4 == 0) goto L_0x0030
            r3 = 2131237949(0x7f081c3d, float:1.8092163E38)
        L_0x0030:
            r4 = 2131165504(0x7f070140, float:1.7945227E38)
            int r8 = r9.getDimensionPixelSize(r4)
            int r6 = X.AnonymousClass7TE.A0E(r9)
            int r19 = X.AnonymousClass7TE.A0C(r9)
            int r4 = X.AnonymousClass8XF.A01(r14)
            X.6oG r9 = r5.A00()
            int r10 = r9.ordinal()
            r9 = 0
            switch(r10) {
                case 2: goto L_0x007b;
                case 3: goto L_0x009b;
                case 4: goto L_0x004f;
                case 5: goto L_0x004f;
                case 6: goto L_0x004f;
                case 7: goto L_0x064a;
                case 8: goto L_0x00b5;
                case 9: goto L_0x064a;
                case 10: goto L_0x0697;
                case 11: goto L_0x0131;
                case 12: goto L_0x004f;
                case 13: goto L_0x004f;
                case 14: goto L_0x004f;
                case 15: goto L_0x0152;
                case 16: goto L_0x06c1;
                case 17: goto L_0x017c;
                case 18: goto L_0x004f;
                case 19: goto L_0x06e5;
                case 20: goto L_0x0713;
                case 21: goto L_0x074b;
                case 22: goto L_0x004f;
                case 23: goto L_0x004f;
                case 24: goto L_0x004f;
                case 25: goto L_0x004f;
                case 26: goto L_0x004f;
                case 27: goto L_0x004f;
                case 28: goto L_0x004f;
                case 29: goto L_0x004f;
                case 30: goto L_0x0186;
                case 31: goto L_0x004f;
                case 32: goto L_0x004f;
                case 33: goto L_0x01c3;
                case 34: goto L_0x004f;
                case 35: goto L_0x004f;
                case 36: goto L_0x01de;
                case 37: goto L_0x004f;
                case 38: goto L_0x077e;
                case 39: goto L_0x07aa;
                case 40: goto L_0x004f;
                case 41: goto L_0x004f;
                case 42: goto L_0x004f;
                case 43: goto L_0x01ea;
                case 44: goto L_0x004f;
                case 45: goto L_0x0200;
                case 46: goto L_0x0216;
                case 47: goto L_0x0232;
                case 48: goto L_0x023b;
                case 49: goto L_0x07ce;
                case 50: goto L_0x0298;
                case 51: goto L_0x02b4;
                case 52: goto L_0x004f;
                case 53: goto L_0x02d0;
                case 54: goto L_0x02f2;
                case 55: goto L_0x06a5;
                case 56: goto L_0x07e0;
                case 57: goto L_0x004f;
                case 58: goto L_0x004f;
                case 59: goto L_0x0306;
                case 60: goto L_0x0323;
                case 61: goto L_0x004f;
                case 62: goto L_0x0357;
                case 63: goto L_0x03ef;
                case 64: goto L_0x06f9;
                case 65: goto L_0x004f;
                case 66: goto L_0x0403;
                case 67: goto L_0x004f;
                case 68: goto L_0x004f;
                case 69: goto L_0x0424;
                case 70: goto L_0x043a;
                case 71: goto L_0x0448;
                case 72: goto L_0x0464;
                case 73: goto L_0x049e;
                case 74: goto L_0x004f;
                case 75: goto L_0x004f;
                case 76: goto L_0x0152;
                case 77: goto L_0x004f;
                case 78: goto L_0x06c1;
                case 79: goto L_0x004f;
                case 80: goto L_0x004f;
                case 81: goto L_0x07fb;
                case 82: goto L_0x080d;
                case 83: goto L_0x004f;
                case 84: goto L_0x04b9;
                case 85: goto L_0x04dc;
                case 86: goto L_0x004f;
                case 87: goto L_0x04f8;
                case 88: goto L_0x004f;
                case 89: goto L_0x004f;
                case 90: goto L_0x0820;
                case 91: goto L_0x0520;
                case 92: goto L_0x0546;
                case 93: goto L_0x0561;
                case 94: goto L_0x0832;
                case 95: goto L_0x004f;
                case 96: goto L_0x0587;
                case 97: goto L_0x05a2;
                case 98: goto L_0x004f;
                case 99: goto L_0x004f;
                case 100: goto L_0x05bd;
                case 101: goto L_0x004f;
                case 102: goto L_0x004f;
                case 103: goto L_0x05c7;
                case 104: goto L_0x06d4;
                case 105: goto L_0x05f5;
                case 106: goto L_0x0614;
                case 107: goto L_0x062f;
                case 108: goto L_0x0848;
                case 109: goto L_0x004f;
                case 110: goto L_0x086c;
                default: goto L_0x004f;
            }
        L_0x004f:
            X.7w8 r13 = X.C347017w8.A01(r14, r15, r5)
            X.6oG r1 = r5.A00()
            X.6oG r0 = X.C318046oG.SUPPORT_SMB_BUSINESS_PROFILE_STICKER
            if (r1 == r0) goto L_0x0063
            X.6oG r1 = r5.A00()
            X.6oG r0 = X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER
            if (r1 != r0) goto L_0x006d
        L_0x0063:
            X.0qQ.A0A(r13)
        L_0x0066:
            boolean r0 = r2.CXD()
            A0A(r13, r0)
        L_0x006d:
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
        L_0x0070:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r13, r0, r1)
            return r3
        L_0x007b:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0L
            r1.A0A(r0)
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            r1.A06(r0)
            r0 = 2131952655(0x7f13040f, float:1.9541759E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            r1.A05 = r0
            X.6Ly r13 = r1.A04()
            r0 = 2131952654(0x7f13040e, float:1.9541757E38)
            goto L_0x0070
        L_0x009b:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0F
            r1.A0A(r0)
            r0 = 2131238671(0x7f081f0f, float:1.8093627E38)
            r1.A06(r0)
            r0 = 2131952951(0x7f130537, float:1.954236E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131971057(0x7f134bf1, float:1.9579083E38)
            goto L_0x0070
        L_0x00b5:
            r2 = 0
            java.util.List r1 = r5.A0O
            java.lang.Object r6 = X.00k.A0J(r1)
            X.6o8 r6 = (X.C317966o8) r6
            if (r6 == 0) goto L_0x012f
            java.lang.Integer r4 = r6.A04()
        L_0x00c4:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r4 != r1) goto L_0x00dc
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0H
            java.lang.String r0 = r0.getUrl()
            X.0qQ.A07(r0)
            X.JdA r13 = new X.JdA
            r13.<init>(r14, r15, r0)
        L_0x00d6:
            android.graphics.drawable.Drawable r13 = (android.graphics.drawable.Drawable) r13
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            goto L_0x0070
        L_0x00dc:
            if (r6 == 0) goto L_0x00e0
            java.lang.String r2 = r6.A0S
        L_0x00e0:
            r1 = 2682(0xa7a, float:3.758E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00fb
            X.Jcm r13 = new X.Jcm
            com.instagram.common.typedurl.ImageUrl r0 = r6.A0H
            java.lang.String r0 = r0.getUrl()
            X.0qQ.A07(r0)
            r13.<init>(r14, r15, r0, r3)
            goto L_0x00d6
        L_0x00fb:
            java.util.List r1 = r5.A0O
            int r1 = r1.size()
            if (r1 <= r0) goto L_0x0129
            java.util.List r0 = r5.A0O
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x010d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0123
            java.lang.Object r0 = r1.next()
            X.6o8 r0 = (X.C317966o8) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0H
            java.lang.String r0 = r0.getUrl()
            r2.add(r0)
            goto L_0x010d
        L_0x0123:
            X.Jd9 r13 = new X.Jd9
            r13.<init>(r14, r15, r2, r3)
            goto L_0x00d6
        L_0x0129:
            X.Jcl r13 = new X.Jcl
            r13.<init>(r14, r15, r3)
            goto L_0x00d6
        L_0x012f:
            r4 = r2
            goto L_0x00c4
        L_0x0131:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0C
            r1.A0A(r0)
            r0 = 2131238661(0x7f081f05, float:1.8093607E38)
            r1.A06(r0)
            r0 = 2131953782(0x7f130876, float:1.9544045E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            r1.A05 = r0
            X.6Ly r13 = r1.A04()
            r0 = 2131953781(0x7f130875, float:1.9544043E38)
            goto L_0x0070
        L_0x0152:
            X.AIr r2 = X.AIr.A01(r14, r15)
            int[] r1 = X.AnonymousClass6LW.A09
            r2.A0A(r1)
            r1 = 2131238039(0x7f081c97, float:1.8092345E38)
            r2.A06(r1)
            r1 = 2131165184(0x7f070000, float:1.7944578E38)
            r2.A07(r1)
            r2.A06 = r0
            r0 = 2131970900(0x7f134b54, float:1.9578764E38)
            r2.A09(r0)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            r2.A00 = r0
            X.6Ly r13 = r2.A04()
            r0 = 2131970899(0x7f134b53, float:1.9578762E38)
            goto L_0x0070
        L_0x017c:
            X.9We r13 = new X.9We
            r13.<init>(r14, r15)
            r0 = 2131956789(0x7f131435, float:1.9550144E38)
            goto L_0x0070
        L_0x0186:
            java.util.List r0 = r5.A0O
            java.lang.Object r5 = X.00k.A0I(r0)
            X.6o8 r5 = (X.C317966o8) r5
            X.AIr r4 = X.AIr.A01(r14, r15)
            com.instagram.common.typedurl.ImageUrl r0 = r5.A0H
            java.lang.String r3 = r0.getUrl()
            X.0qQ.A07(r3)
            r2 = 2131165218(0x7f070022, float:1.7944647E38)
            X.Diw r0 = new X.Diw
            r0.<init>(r14, r3, r2)
            r4.A02 = r0
            r4.A08 = r1
            r0 = 2130970209(0x7f040661, float:1.7549122E38)
            r4.A08(r0)
            java.lang.String r0 = r5.A0U
            if (r0 == 0) goto L_0x01c0
            java.lang.String r0 = X.AnonymousClass7TG.A0o(r0)
        L_0x01b5:
            r4.A05 = r0
            X.6Ly r13 = r4.A04()
            r13.invalidateSelf()
            goto L_0x006d
        L_0x01c0:
            java.lang.String r0 = ""
            goto L_0x01b5
        L_0x01c3:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A05
            r1.A0A(r0)
            r0 = 2131237350(0x7f0819e6, float:1.8090948E38)
            r1.A06(r0)
            r0 = 2131962855(0x7f132be7, float:1.9562447E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131962854(0x7f132be6, float:1.9562445E38)
            goto L_0x0070
        L_0x01de:
            r0 = 2131237379(0x7f081a03, float:1.8091007E38)
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r0)
            r0 = 2131962968(0x7f132c58, float:1.9562676E38)
            goto L_0x0070
        L_0x01ea:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131963296(0x7f132da0, float:1.9563341E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131963297(0x7f132da1, float:1.9563343E38)
            goto L_0x0070
        L_0x0200:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            r1.A06(r0)
            r0 = 2131964151(0x7f1330f7, float:1.9565076E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131964142(0x7f1330ee, float:1.9565057E38)
            goto L_0x0070
        L_0x0216:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            r1.A06(r0)
            r0 = 2131964148(0x7f1330f4, float:1.956507E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131964147(0x7f1330f3, float:1.9565067E38)
            goto L_0x0070
        L_0x0232:
            r0 = 2131240001(0x7f082441, float:1.8096325E38)
            android.graphics.drawable.Drawable r13 = r14.getDrawable(r0)
            goto L_0x006d
        L_0x023b:
            java.util.List r1 = r5.A0O
            java.util.Iterator r4 = r1.iterator()
        L_0x0241:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0271
            java.lang.Object r3 = r4.next()
            X.6o8 r3 = (X.C317966o8) r3
            java.lang.String r2 = r3.A0S
            r1 = 766(0x2fe, float:1.073E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x026f
            java.lang.String r2 = r3.A0S
            java.lang.String r1 = "internal_sticker_vibrant"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x026f
            java.lang.String r2 = r3.A0S
            java.lang.String r1 = "internal_sticker_subtle"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0241
        L_0x026f:
            r9 = 1
            goto L_0x0241
        L_0x0271:
            X.AIr r2 = X.AIr.A01(r14, r15)
            if (r9 == 0) goto L_0x0295
            int[] r1 = X.AnonymousClass6LW.A0H
        L_0x0279:
            r2.A0A(r1)
            r1 = 2131231452(0x7f0802dc, float:1.8078985E38)
            if (r9 == 0) goto L_0x0284
            r1 = 2131237710(0x7f081b4e, float:1.8091678E38)
        L_0x0284:
            r2.A06(r1)
            r2.A06 = r0
            r0 = 2131964450(0x7f133222, float:1.9565682E38)
            X.6Ly r13 = A08(r2, r0)
            r0 = 2131964451(0x7f133223, float:1.9565684E38)
            goto L_0x0070
        L_0x0295:
            int[] r1 = X.AnonymousClass6LW.A0B
            goto L_0x0279
        L_0x0298:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970176(0x7f040640, float:1.7549055E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131238059(0x7f081cab, float:1.8092386E38)
            r1.A06(r0)
            r0 = 2131964525(0x7f13326d, float:1.9565834E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131964524(0x7f13326c, float:1.9565832E38)
            goto L_0x0070
        L_0x02b4:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131238045(0x7f081c9d, float:1.8092358E38)
            r1.A06(r0)
            r0 = 2131964546(0x7f133282, float:1.9565877E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131964545(0x7f133281, float:1.9565875E38)
            goto L_0x0070
        L_0x02d0:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A08
            r1.A0A(r0)
            r0 = 2131238495(0x7f081e5f, float:1.809327E38)
            r1.A06(r0)
            r0 = 2131965078(0x7f133496, float:1.9566956E38)
            X.6Ly r13 = A08(r1, r0)
            boolean r0 = r2.CWK()
            A0A(r13, r0)
            r0 = 2131965077(0x7f133495, float:1.9566954E38)
            goto L_0x0070
        L_0x02f2:
            r0 = 2131238318(0x7f081dae, float:1.8092911E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131965749(0x7f133735, float:1.9568317E38)
            X.9WZ r13 = new X.9WZ
            r13.<init>(r14, r15, r1, r0)
            r0 = 2131952423(0x7f130327, float:1.9541288E38)
            goto L_0x0070
        L_0x0306:
            long r18 = r2.AyD()
            boolean r0 = X.ADK.A00(r18)
            if (r0 == 0) goto L_0x0320
            java.lang.String r15 = "on_this_day_sticker_tray"
        L_0x0312:
            r16 = 0
            X.8uo r13 = new X.8uo
            r17 = r16
            r13.<init>(r14, r15, r16, r17, r18)
            r0 = 2131965992(0x7f133828, float:1.956881E38)
            goto L_0x0070
        L_0x0320:
            java.lang.String r15 = "date_sticker_tray"
            goto L_0x0312
        L_0x0323:
            int[] r0 = X.AnonymousClass91M.A02
            r0 = 36323028048554742(0x810b9a00002af6, double:3.0341674267756826E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r7, r15, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0345
            X.9Wf r13 = new X.9Wf
            r13.<init>(r14, r15, r4)
        L_0x0339:
            boolean r0 = r2.CXD()
            A0A(r13, r0)
            r0 = 2131966139(0x7f1338bb, float:1.9569108E38)
            goto L_0x0070
        L_0x0345:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131966140(0x7f1338bc, float:1.956911E38)
            X.6Ly r13 = A08(r1, r0)
            goto L_0x0339
        L_0x0357:
            boolean r2 = r2.CXt()
            r3 = 2131100621(0x7f0603cd, float:1.7813629E38)
            r14.getColor(r3)
            r3 = 2131100622(0x7f0603ce, float:1.781363E38)
            r14.getColor(r3)
            r3 = 2131100623(0x7f0603cf, float:1.7813633E38)
            r14.getColor(r3)
            r3 = 2131100624(0x7f0603d0, float:1.7813635E38)
            r14.getColor(r3)
            X.AIr r4 = X.AIr.A01(r14, r15)
            r6 = 2130970194(0x7f040652, float:1.7549091E38)
            X.AIr.A03(r14, r4, r6)
            r4.A08 = r1
            r3 = 2131967822(0x7f133f4e, float:1.9572521E38)
            r4.A09(r3)
            android.content.res.Resources r5 = r14.getResources()
            r3 = 2131165204(0x7f070014, float:1.7944619E38)
            int r5 = r5.getDimensionPixelSize(r3)
            r3 = 1061158912(0x3f400000, float:0.75)
            X.6KL r5 = X.AnonymousClass6KK.A00(r3, r5, r1)
            int r3 = X.AnonymousClass7TF.A03(r14, r6)
            int r1 = X.AnonymousClass7TF.A03(r14, r6)
            int[] r11 = new int[]{r3, r1}
            android.graphics.Paint r3 = r5.A0A
            int r1 = r5.A08
            float r8 = (float) r1
            int r1 = r5.getIntrinsicWidth()
            float r9 = (float) r1
            android.graphics.Shader$TileMode r13 = android.graphics.Shader.TileMode.CLAMP
            r7 = 0
            r12 = 0
            android.graphics.LinearGradient r6 = new android.graphics.LinearGradient
            r10 = r7
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            r3.setShader(r6)
            r5.A04 = r12
            r5.invalidateSelf()
            r5.A05 = r2
            r5.invalidateSelf()
            r4.A02 = r5
            r1 = 2131165213(0x7f07001d, float:1.7944637E38)
            r4.A07(r1)
            r4.A07 = r2
            X.6Ly r13 = r4.A04()
            r1 = 127(0x7f, float:1.78E-43)
            if (r2 == 0) goto L_0x03d7
            r1 = 255(0xff, float:3.57E-43)
        L_0x03d7:
            r13.setAlpha(r1)
            boolean r1 = r13 instanceof X.C389979qX
            if (r1 == 0) goto L_0x03ea
            r2 = r13
            X.9qX r2 = (X.C389979qX) r2
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x03ea
            r2.A00 = r0
            r2.invalidateSelf()
        L_0x03ea:
            r0 = 2131967811(0x7f133f43, float:1.9572499E38)
            goto L_0x0070
        L_0x03ef:
            r0 = 2131238572(0x7f081eac, float:1.8093426E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131967847(0x7f133f67, float:1.9572572E38)
            X.9WZ r13 = new X.9WZ
            r13.<init>(r14, r15, r1, r0)
            r0 = 2131974334(0x7f1358be, float:1.958573E38)
            goto L_0x0070
        L_0x0403:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A01
            r1.A0A(r0)
            r0 = 2131237868(0x7f081bec, float:1.8091999E38)
            r1.A06(r0)
            r0 = 2131968680(0x7f1342a8, float:1.9574261E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            r1.A05 = r0
            X.6Ly r13 = r1.A04()
            r0 = 2131968677(0x7f1342a5, float:1.9574255E38)
            goto L_0x0070
        L_0x0424:
            X.7w8 r13 = X.C347017w8.A01(r14, r15, r5)
            X.6oG r1 = r5.A00()
            X.6oG r0 = X.C318046oG.SUPPORT_SMB_BUSINESS_PROFILE_STICKER
            if (r1 == r0) goto L_0x0066
            X.6oG r1 = r5.A00()
            X.6oG r0 = X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER
            if (r1 != r0) goto L_0x006d
            goto L_0x0066
        L_0x043a:
            X.4DH r0 = r2.BZy()
            X.Jd5 r13 = new X.Jd5
            r13.<init>(r14, r0, r15)
            r0 = 2131969534(0x7f1345fe, float:1.9575994E38)
            goto L_0x0070
        L_0x0448:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970229(0x7f040675, float:1.7549162E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131239520(0x7f082260, float:1.809535E38)
            r1.A06(r0)
            r0 = 2131969570(0x7f134622, float:1.9576067E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131969571(0x7f134623, float:1.9576069E38)
            goto L_0x0070
        L_0x0464:
            X.0Tu r2 = X.0Tu.A06
            r0 = 36313218343438147(0x8102ae00030743, double:3.027963729759436E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 != 0) goto L_0x0498
            r0 = 36313218343307074(0x8102ae00010742, double:3.027963729676545E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 != 0) goto L_0x0498
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131239520(0x7f082260, float:1.809535E38)
            r1.A06(r0)
            r0 = 2131969555(0x7f134613, float:1.9576036E38)
            X.6Ly r13 = A08(r1, r0)
        L_0x0493:
            r0 = 2131969554(0x7f134612, float:1.9576034E38)
            goto L_0x0070
        L_0x0498:
            X.9Wi r13 = new X.9Wi
            r13.<init>(r14, r15)
            goto L_0x0493
        L_0x049e:
            java.lang.String r15 = "product_item_text_sticker_vibrant"
            X.9q7 r13 = new X.9q7
            r19 = r0
            r17 = r8
            r18 = r0
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19)
            boolean r0 = r2.CZu(r1)
            A0A(r13, r0)
            r0 = 2131969844(0x7f134734, float:1.9576622E38)
            goto L_0x0070
        L_0x04b9:
            X.AIr r2 = X.AIr.A01(r14, r15)
            int[] r1 = X.AnonymousClass6LW.A0H
            r2.A0A(r1)
            r2.A06 = r0
            r0 = 2131238720(0x7f081f40, float:1.8093727E38)
            r2.A06(r0)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            r2.A07(r0)
            r0 = 2131972282(0x7f1350ba, float:1.9581567E38)
            X.6Ly r13 = A08(r2, r0)
            r0 = 2131972281(0x7f1350b9, float:1.9581565E38)
            goto L_0x0070
        L_0x04dc:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            r1.A06(r0)
            r0 = 2131099910(0x7f060106, float:1.7812187E38)
            r1.A08(r0)
            r0 = 2131972896(0x7f135320, float:1.9582813E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131972890(0x7f13531a, float:1.95828E38)
            goto L_0x0070
        L_0x04f8:
            java.lang.String r15 = "product_item_text_sticker_vibrant"
            X.9Wl r13 = new X.9Wl
            r17 = r8
            r18 = r0
            r16 = r4
            r13.<init>(r14, r15, r16, r17, r18)
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131973831(0x7f1356c7, float:1.9584709E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = -1
            r13.A05(r1, r0)
            boolean r0 = r2.Cc2()
            A0A(r13, r0)
            r0 = 2131973832(0x7f1356c8, float:1.958471E38)
            goto L_0x0070
        L_0x0520:
            X.AIr r2 = X.AIr.A01(r14, r15)
            int[] r1 = X.AnonymousClass6LW.A0K
            r2.A0A(r1)
            r1 = 2131238930(0x7f082012, float:1.8094153E38)
            r2.A06(r1)
            r1 = 2131974042(0x7f13579a, float:1.9585137E38)
            r2.A09(r1)
            r1 = 2131165288(0x7f070068, float:1.7944789E38)
            r2.A07(r1)
            r2.A06 = r0
            X.6Ly r13 = r2.A04()
            r0 = 2131974043(0x7f13579b, float:1.9585139E38)
            goto L_0x0070
        L_0x0546:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A05
            r1.A0A(r0)
            r0 = 2131238129(0x7f081cf1, float:1.8092528E38)
            r1.A06(r0)
            r0 = 2131974045(0x7f13579d, float:1.9585143E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131974046(0x7f13579e, float:1.9585145E38)
            goto L_0x0070
        L_0x0561:
            X.AIr r2 = X.AIr.A01(r14, r15)
            int[] r1 = X.AnonymousClass6LW.A0F
            r2.A0A(r1)
            r1 = 2131238327(0x7f081db7, float:1.809293E38)
            r2.A06(r1)
            r1 = 2131974047(0x7f13579f, float:1.9585147E38)
            r2.A09(r1)
            r1 = 2131165288(0x7f070068, float:1.7944789E38)
            r2.A07(r1)
            r2.A06 = r0
            X.6Ly r13 = r2.A04()
            r0 = 2131974048(0x7f1357a0, float:1.958515E38)
            goto L_0x0070
        L_0x0587:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0L
            r1.A0A(r0)
            r0 = 2131238189(0x7f081d2d, float:1.809265E38)
            r1.A06(r0)
            r0 = 2131974612(0x7f1359d4, float:1.9586293E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131974611(0x7f1359d3, float:1.958629E38)
            goto L_0x0070
        L_0x05a2:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0L
            r1.A0A(r0)
            r0 = 2131238182(0x7f081d26, float:1.8092635E38)
            r1.A06(r0)
            r0 = 2131974645(0x7f1359f5, float:1.958636E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131974644(0x7f1359f4, float:1.9586358E38)
            goto L_0x0070
        L_0x05bd:
            X.9ps r13 = new X.9ps
            r13.<init>(r14)
            r0 = 2131974808(0x7f135a98, float:1.958669E38)
            goto L_0x0070
        L_0x05c7:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int r0 = X.AnonymousClass7TE.A0A(r14)
            int[] r0 = new int[]{r0}
            r1.A0A(r0)
            r0 = 2131975199(0x7f135c1f, float:1.9587484E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            r1.A05 = r0
            r0 = 2131100790(0x7f060476, float:1.7813971E38)
            int r0 = r14.getColor(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A03 = r0
            X.6Ly r13 = r1.A04()
            r0 = 2131975198(0x7f135c1e, float:1.9587482E38)
            goto L_0x0070
        L_0x05f5:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2131238504(0x7f081e68, float:1.8093289E38)
            r1.A06(r0)
            r0 = 2131952306(0x7f1302b2, float:1.9541051E38)
            r1.A09(r0)
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            X.AIr.A03(r14, r1, r0)
            X.6Ly r13 = r1.A04()
            r0 = 2131975943(0x7f135f07, float:1.9588993E38)
            goto L_0x0070
        L_0x0614:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0I
            r1.A0A(r0)
            r0 = 2131238016(0x7f081c80, float:1.8092299E38)
            r1.A06(r0)
            r0 = 2131976030(0x7f135f5e, float:1.958917E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131976024(0x7f135f58, float:1.9589157E38)
            goto L_0x0070
        L_0x062f:
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0J
            r1.A0A(r0)
            r0 = 2131237958(0x7f081c46, float:1.8092181E38)
            r1.A06(r0)
            r0 = 2131976264(0x7f136048, float:1.9589644E38)
            X.6Ly r13 = A08(r1, r0)
            r0 = 2131976262(0x7f136046, float:1.958964E38)
            goto L_0x0070
        L_0x064a:
            java.util.List r0 = r5.A0O
            java.lang.Object r3 = X.00k.A0J(r0)
            X.6o8 r3 = (X.C317966o8) r3
            if (r3 != 0) goto L_0x065d
            r1 = 0
            java.lang.String r0 = ""
            X.A66 r3 = new X.A66
            r3.<init>(r1, r1, r0)
            return r3
        L_0x065d:
            java.lang.String r4 = r3.A0M
            X.6oG r2 = r5.A00()
            X.6oG r0 = X.C318046oG.AVATAR_ANIMATED
            if (r2 != r0) goto L_0x068f
            boolean r0 = X.C63282KuR.A00(r15)
            if (r0 == 0) goto L_0x068f
            boolean r0 = X.C63282KuR.A00(r15)
            android.graphics.drawable.Drawable r1 = X.C320996tP.A00(r14, r15, r3, r1, r0)
        L_0x0675:
            if (r4 == 0) goto L_0x0684
            int r0 = r4.length()
            if (r0 <= 0) goto L_0x0684
        L_0x067d:
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r1, r0, r4)
            return r3
        L_0x0684:
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            java.lang.String r4 = r14.getString(r0)
            X.0qQ.A0A(r4)
            goto L_0x067d
        L_0x068f:
            X.7w8 r1 = X.C347017w8.A01(r14, r15, r5)
            X.0qQ.A0A(r1)
            goto L_0x0675
        L_0x0697:
            X.9WV r2 = new X.9WV
            r2.<init>(r15, r14)
            r1 = 0
            java.lang.String r0 = ""
            X.A66 r3 = new X.A66
            r3.<init>(r2, r1, r0)
            return r3
        L_0x06a5:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131237953(0x7f081c41, float:1.809217E38)
            r1.A06(r0)
            r0 = 2131965749(0x7f133735, float:1.9568317E38)
            X.6Ly r2 = A08(r1, r0)
            r0 = 2131953559(0x7f130797, float:1.9543592E38)
            goto L_0x0861
        L_0x06c1:
            X.9Wg r2 = new X.9Wg
            r2.<init>(r14, r15)
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x06cf
            r2.A00 = r0
            r2.invalidateSelf()
        L_0x06cf:
            r0 = 2131971057(0x7f134bf1, float:1.9579083E38)
            goto L_0x0861
        L_0x06d4:
            long r0 = r2.AyD()
            X.7w8 r0 = X.C378999Sa.A00(r14, r15, r5, r0)
            android.graphics.drawable.Drawable r2 = r0.A04()
            r0 = 2131975391(0x7f135cdf, float:1.9587873E38)
            goto L_0x07d5
        L_0x06e5:
            X.6tY r6 = X.C353578Ie.A00(r15)
            android.content.res.Resources$Theme r2 = r14.getTheme()
            r3 = 0
            r1 = r14
            r4 = r15
            X.7w8 r2 = X.C347017w8.A00(r1, r2, r3, r4, r5, r6)
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            goto L_0x07d5
        L_0x06f9:
            com.instagram.api.schemas.TrackDataImpl r0 = r5.A02
            if (r0 == 0) goto L_0x070e
            X.JVX r1 = new X.JVX
            r1.<init>(r0)
            boolean r0 = r2.CXt()
            X.9Wu r2 = X.C394529yG.A00(r14, r1, r0)
            r0 = 2131967811(0x7f133f43, float:1.9572499E38)
            goto L_0x0740
        L_0x070e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0713:
            android.content.res.Resources r1 = r14.getResources()
            r0 = 2131165232(0x7f070030, float:1.7944675E38)
            int r3 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r0 = r14.getResources()
            int r1 = X.AnonymousClass7TE.A0H(r0)
            r0 = 2131237721(0x7f081b59, float:1.80917E38)
            android.graphics.drawable.Drawable r0 = r14.getDrawable(r0)
            X.2gs r0 = (X.C226472gs) r0
            X.0qQ.A07(r0)
            r0.EFK()
            r0.E2p()
            X.9Wc r2 = new X.9Wc
            r2.<init>(r14, r0, r3, r1)
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
        L_0x0740:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r2, r0, r1)
            return r3
        L_0x074b:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2131237856(0x7f081be0, float:1.8091974E38)
            r1.A06(r0)
            int r0 = X.AnonymousClass7TE.A07(r14)
            r1.A08(r0)
            com.instagram.api.schemas.StoryPromptTappableData r0 = r5.A01
            if (r0 == 0) goto L_0x0768
            com.instagram.api.schemas.ElectionAddYoursInfoDict r0 = r0.A01
            if (r0 == 0) goto L_0x0768
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x076f
        L_0x0768:
            r0 = 2131961559(0x7f1326d7, float:1.9559818E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
        L_0x076f:
            java.lang.String r0 = X.AnonymousClass7TF.A0k(r0)
            r1.A05 = r0
            X.6Ly r2 = r1.A04()
            r0 = 2131961558(0x7f1326d6, float:1.9559816E38)
            goto L_0x0861
        L_0x077e:
            r4 = 0
            java.util.List r0 = r5.A0O
            java.lang.Object r0 = X.00k.A0J(r0)
            X.6o8 r0 = (X.C317966o8) r0
            if (r0 == 0) goto L_0x07a8
            java.lang.String r2 = r0.A0g
        L_0x078b:
            X.A66 r3 = new X.A66
            X.7w8 r1 = X.C347017w8.A01(r14, r15, r5)
            if (r2 == 0) goto L_0x079d
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x079d
        L_0x0799:
            r3.<init>(r1, r4, r2)
            return r3
        L_0x079d:
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            java.lang.String r2 = r14.getString(r0)
            X.0qQ.A0A(r2)
            goto L_0x0799
        L_0x07a8:
            r2 = r4
            goto L_0x078b
        L_0x07aa:
            int r16 = X.AnonymousClass8XF.A01(r14)
            float r0 = (float) r8
            r1 = 1067869798(0x3fa66666, float:1.3)
            int r17 = X.AnonymousClass7TE.A06(r0, r1)
            float r0 = (float) r6
            int r18 = X.AnonymousClass7TE.A06(r0, r1)
            X.9Wt r13 = new X.9Wt
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r0 = 2131963072(0x7f132cc0, float:1.9562887E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r13, r0, r1)
            return r3
        L_0x07ce:
            X.7w8 r2 = X.C347017w8.A01(r14, r15, r5)
            r0 = 2131963518(0x7f132e7e, float:1.9563792E38)
        L_0x07d5:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r2, r0, r1)
            return r3
        L_0x07e0:
            X.AIr r1 = X.AIr.A01(r14, r15)
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            X.AIr.A03(r14, r1, r0)
            r0 = 2131238607(0x7f081ecf, float:1.8093497E38)
            r1.A06(r0)
            r0 = 2131965796(0x7f133764, float:1.9568412E38)
            X.6Ly r2 = A08(r1, r0)
            r0 = 2131972364(0x7f13510c, float:1.9581733E38)
            goto L_0x0861
        L_0x07fb:
            X.9Wh r2 = new X.9Wh
            r2.<init>(r14, r15)
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x0809
            r2.A00 = r0
            r2.invalidateSelf()
        L_0x0809:
            r0 = 2131971251(0x7f134cb3, float:1.9579476E38)
            goto L_0x0861
        L_0x080d:
            r2 = 0
            X.UpZ r1 = new X.UpZ
            r1.<init>(r14, r2, r0, r0)
            r0 = 2131971321(0x7f134cf9, float:1.9579618E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            X.A66 r3 = new X.A66
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0820:
            X.UjJ r2 = new X.UjJ
            r2.<init>(r15, r14, r1)
            boolean r1 = r2.A00
            if (r1 != 0) goto L_0x082e
            r2.A00 = r0
            r2.invalidateSelf()
        L_0x082e:
            r0 = 2131974005(0x7f135775, float:1.9585062E38)
            goto L_0x0861
        L_0x0832:
            r0 = 2131974569(0x7f1359a9, float:1.9586206E38)
            r2 = 0
            X.9WZ r1 = new X.9WZ
            r1.<init>(r14, r15, r2, r0)
            r0 = 2131974334(0x7f1358be, float:1.958573E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r0)
            X.A66 r3 = new X.A66
            r3.<init>(r1, r2, r0)
            return r3
        L_0x0848:
            r2 = 2131976726(0x7f136216, float:1.959058E38)
            X.AIr r1 = X.AIr.A01(r14, r15)
            int[] r0 = X.AnonymousClass6LW.A0A
            r1.A0A(r0)
            r0 = 2131239011(0x7f082063, float:1.8094317E38)
            r1.A06(r0)
            X.6Ly r2 = A08(r1, r2)
            r0 = 2131976725(0x7f136215, float:1.9590579E38)
        L_0x0861:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r0)
            r0 = 0
            X.A66 r3 = new X.A66
            r3.<init>(r2, r0, r1)
            return r3
        L_0x086c:
            r0 = 2130970342(0x7f0406e6, float:1.7549391E38)
            int r3 = X.2Yu.A0H(r14, r0)
            X.AIr r2 = X.AIr.A01(r14, r15)
            r2.A08(r3)
            r0 = 2131237902(0x7f081c0e, float:1.8092068E38)
            r2.A06(r0)
            r1 = 2131976870(0x7f1362a6, float:1.9590873E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r14, r1)
            r2.A05 = r0
            X.6Ly r2 = r2.A04()
            java.lang.String r1 = X.AnonymousClass7TE.A16(r14, r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            X.A66 r3 = new X.A66
            r3.<init>(r2, r0, r1)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJA.A01(android.content.Context, com.instagram.common.session.UserSession, X.4yO, X.6ht, X.6nz):X.A66");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: X.9Wk} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: X.UjJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v114, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v115, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: X.6Ly} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v257, resolved type: X.6Ly} */
    /* JADX WARNING: type inference failed for: r10v0, types: [boolean] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004c, code lost:
        return new X.A66(r0, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r13, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0494, code lost:
        r4 = X.2Yu.A0H(r13, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0074, code lost:
        r4.A09(r0);
        r0 = X.C346897vw.A00(r4.A0I);
        r6 = r4.A0H;
        r8 = (int) (((double) X.AnonymousClass7TE.A0F(r6)) * r0);
        r9 = (int) (((double) X.AnonymousClass7TE.A0G(r6)) * r0);
        r11 = (int) (((double) X.AnonymousClass7TE.A0F(r6)) * r0);
        r0 = X.AIr.A02(r4, r0, (float) r9, (float) r11);
        r6 = X.AnonymousClass7TE.A0W();
        r0.A0b.getTextBounds(r0.A0F.toString(), 0, r0.A0F.length(), r6);
        r5 = r0.A0F;
        X.0qQ.A07(r5);
        r2 = r4.A0G;
        r7 = X.AnonymousClass7TE.A08(r2);
        r4 = r2.getColor(com.instagram.android.R.color.action_bar_semi_transparent_white);
        r6 = new X.C379489Uc(r7, r8, r9, r10, r11, r11 - r6.bottom);
        r6.A02 = r4;
        r6.A00 = 28.0f;
        r6.A01 = 8.0f;
        X.AnonymousClass7TG.A18(r5, r6, -1);
        r0 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0547, code lost:
        r1 = X.AnonymousClass7TE.A16(r13, r0);
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x05c1, code lost:
        r1 = X.AnonymousClass7TE.A16(r13, r0);
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x05ce, code lost:
        return new X.A66(r4, java.lang.Integer.valueOf(r5), r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x066d, code lost:
        return new X.A66(r1, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r13, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x07e6, code lost:
        r3 = X.AnonymousClass7TE.A16(r13, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x07f3, code lost:
        return new X.A66(r1, java.lang.Integer.valueOf(r4), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0111, code lost:
        if (r2.A00() == X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x08dd, code lost:
        return new X.A66(r1, (java.lang.Integer) null, X.AnonymousClass7TE.A16(r13, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0970, code lost:
        r1 = X.AnonymousClass7TE.A16(r13, r0);
        r0 = java.lang.Integer.valueOf(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x097d, code lost:
        return new X.A66(r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r2.A00() == X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        r1 = 2131968497;
        r0 = r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.A66 A02(android.content.Context r15, com.instagram.common.session.UserSession r16, X.C314246ht r17, X.C317876nz r18) {
        /*
            r5 = 0
            r13 = r15
            r3 = r16
            boolean r10 = X.AnonymousClass7TF.A1U(r5, r15, r3)
            r6 = r17
            r2 = r18
            X.AnonymousClass7TG.A1Q(r2, r6)
            boolean r4 = X.C346897vw.A01(r3)
            X.6oG r0 = r2.A00()
            int r1 = r0.ordinal()
            java.lang.String r0 = ""
            r15 = 0
            r7 = 0
            switch(r1) {
                case 2: goto L_0x014e;
                case 3: goto L_0x016d;
                case 4: goto L_0x0022;
                case 5: goto L_0x0022;
                case 6: goto L_0x0022;
                case 7: goto L_0x0022;
                case 8: goto L_0x0197;
                case 9: goto L_0x0022;
                case 10: goto L_0x021f;
                case 11: goto L_0x0240;
                case 12: goto L_0x0022;
                case 13: goto L_0x0022;
                case 14: goto L_0x0022;
                case 15: goto L_0x026e;
                case 16: goto L_0x02b6;
                case 17: goto L_0x02d5;
                case 18: goto L_0x0022;
                case 19: goto L_0x0115;
                case 20: goto L_0x02f4;
                case 21: goto L_0x034d;
                case 22: goto L_0x0022;
                case 23: goto L_0x0022;
                case 24: goto L_0x0022;
                case 25: goto L_0x0022;
                case 26: goto L_0x0022;
                case 27: goto L_0x004d;
                case 28: goto L_0x0022;
                case 29: goto L_0x0061;
                case 30: goto L_0x037f;
                case 31: goto L_0x0022;
                case 32: goto L_0x0022;
                case 33: goto L_0x03be;
                case 34: goto L_0x0022;
                case 35: goto L_0x0022;
                case 36: goto L_0x03dd;
                case 37: goto L_0x0022;
                case 38: goto L_0x03fc;
                case 39: goto L_0x0423;
                case 40: goto L_0x0022;
                case 41: goto L_0x0022;
                case 42: goto L_0x0022;
                case 43: goto L_0x0443;
                case 44: goto L_0x0022;
                case 45: goto L_0x0467;
                case 46: goto L_0x04a8;
                case 47: goto L_0x00da;
                case 48: goto L_0x04c4;
                case 49: goto L_0x0540;
                case 50: goto L_0x054e;
                case 51: goto L_0x056d;
                case 52: goto L_0x0022;
                case 53: goto L_0x0290;
                case 54: goto L_0x058c;
                case 55: goto L_0x05a7;
                case 56: goto L_0x032e;
                case 57: goto L_0x0022;
                case 58: goto L_0x0022;
                case 59: goto L_0x00e3;
                case 60: goto L_0x05cf;
                case 61: goto L_0x0022;
                case 62: goto L_0x05fd;
                case 63: goto L_0x0620;
                case 64: goto L_0x0650;
                case 65: goto L_0x0022;
                case 66: goto L_0x0673;
                case 67: goto L_0x0022;
                case 68: goto L_0x06a1;
                case 69: goto L_0x00ff;
                case 70: goto L_0x06cb;
                case 71: goto L_0x06ea;
                case 72: goto L_0x0709;
                case 73: goto L_0x0728;
                case 74: goto L_0x0022;
                case 75: goto L_0x0022;
                case 76: goto L_0x026e;
                case 77: goto L_0x0022;
                case 78: goto L_0x02b6;
                case 79: goto L_0x0022;
                case 80: goto L_0x0022;
                case 81: goto L_0x074e;
                case 82: goto L_0x076c;
                case 83: goto L_0x0022;
                case 84: goto L_0x0776;
                case 85: goto L_0x07a3;
                case 86: goto L_0x0022;
                case 87: goto L_0x07c2;
                case 88: goto L_0x0022;
                case 89: goto L_0x0022;
                case 90: goto L_0x0313;
                case 91: goto L_0x07f4;
                case 92: goto L_0x0821;
                case 93: goto L_0x0840;
                case 94: goto L_0x086d;
                case 95: goto L_0x0022;
                case 96: goto L_0x0892;
                case 97: goto L_0x08ad;
                case 98: goto L_0x0022;
                case 99: goto L_0x0022;
                case 100: goto L_0x08cc;
                case 101: goto L_0x0022;
                case 102: goto L_0x0022;
                case 103: goto L_0x0128;
                case 104: goto L_0x0640;
                case 105: goto L_0x08de;
                case 106: goto L_0x08fc;
                case 107: goto L_0x0917;
                case 108: goto L_0x0935;
                case 109: goto L_0x0022;
                case 110: goto L_0x0953;
                default: goto L_0x0022;
            }
        L_0x0022:
            X.7w8 r0 = X.C347017w8.A01(r13, r3, r2)
            X.6oG r3 = r2.A00()
            X.6oG r1 = X.C318046oG.SUPPORT_SMB_BUSINESS_PROFILE_STICKER
            if (r3 == r1) goto L_0x0036
            X.6oG r2 = r2.A00()
            X.6oG r1 = X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER
            if (r2 != r1) goto L_0x0040
        L_0x0036:
            X.0qQ.A0A(r0)
        L_0x0039:
            boolean r1 = r6.CXD()
            A0A(r0, r1)
        L_0x0040:
            r1 = 2131968497(0x7f1341f1, float:1.957389E38)
        L_0x0043:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r13, r1)
            X.A66 r2 = new X.A66
            r2.<init>(r0, r15, r1)
            return r2
        L_0x004d:
            X.AIr r4 = X.AIr.A01(r13, r3)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            r4.A08(r0)
            r0 = 2131238637(0x7f081eed, float:1.8093558E38)
            r4.A06(r0)
            r0 = 2131974548(0x7f135994, float:1.9586163E38)
            goto L_0x0074
        L_0x0061:
            X.AIr r4 = X.AIr.A01(r13, r3)
            r0 = 2131100036(0x7f060184, float:1.7812442E38)
            r4.A08(r0)
            r0 = 2131238899(0x7f081ff3, float:1.809409E38)
            r4.A06(r0)
            r0 = 2131974570(0x7f1359aa, float:1.9586208E38)
        L_0x0074:
            r4.A09(r0)
            com.instagram.common.session.UserSession r0 = r4.A0I
            double r0 = X.C346897vw.A00(r0)
            android.content.res.Resources r6 = r4.A0H
            int r2 = X.AnonymousClass7TE.A0F(r6)
            double r2 = (double) r2
            double r2 = r2 * r0
            int r8 = (int) r2
            int r2 = X.AnonymousClass7TE.A0G(r6)
            double r2 = (double) r2
            double r2 = r2 * r0
            int r9 = (int) r2
            int r2 = X.AnonymousClass7TE.A0F(r6)
            double r2 = (double) r2
            double r2 = r2 * r0
            int r11 = (int) r2
            float r3 = (float) r9
            float r2 = (float) r11
            X.6Ly r0 = X.AIr.A02(r4, r0, r3, r2)
            android.graphics.Rect r6 = X.AnonymousClass7TE.A0W()
            android.text.TextPaint r3 = r0.A0b
            android.text.Spannable r1 = r0.A0F
            java.lang.String r2 = r1.toString()
            android.text.Spannable r1 = r0.A0F
            int r1 = r1.length()
            r3.getTextBounds(r2, r5, r1, r6)
            int r1 = r6.bottom
            int r12 = r11 - r1
            android.text.Spannable r5 = r0.A0F
            X.0qQ.A07(r5)
            android.content.Context r2 = r4.A0G
            int r7 = X.AnonymousClass7TE.A08(r2)
            r1 = 2131099669(0x7f060015, float:1.7811698E38)
            int r4 = r2.getColor(r1)
            r3 = -1
            r2 = 1105199104(0x41e00000, float:28.0)
            r1 = 1090519040(0x41000000, float:8.0)
            X.9Uc r6 = new X.9Uc
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6.A02 = r4
            r6.A00 = r2
            r6.A01 = r1
            X.AnonymousClass7TG.A18(r5, r6, r3)
            goto L_0x0040
        L_0x00da:
            r0 = 2131240001(0x7f082441, float:1.8096325E38)
            android.graphics.drawable.Drawable r0 = r13.getDrawable(r0)
            goto L_0x0040
        L_0x00e3:
            long r5 = r6.AyD()
            boolean r0 = X.ADK.A00(r5)
            if (r0 == 0) goto L_0x00fc
            java.lang.String r2 = "on_this_day_sticker_tray"
        L_0x00ef:
            X.8uo r0 = new X.8uo
            r1 = r13
            r3 = r15
            r4 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r1 = 2131965992(0x7f133828, float:1.956881E38)
            goto L_0x0043
        L_0x00fc:
            java.lang.String r2 = "date_sticker_tray"
            goto L_0x00ef
        L_0x00ff:
            X.7w8 r0 = X.C347017w8.A01(r13, r3, r2)
            X.6oG r3 = r2.A00()
            X.6oG r1 = X.C318046oG.SUPPORT_SMB_BUSINESS_PROFILE_STICKER
            if (r3 == r1) goto L_0x0039
            X.6oG r2 = r2.A00()
            X.6oG r1 = X.C318046oG.SUPPORT_DIVERSITY_BUSINESS_PROFILE_STICKER
            if (r2 != r1) goto L_0x0040
            goto L_0x0039
        L_0x0115:
            X.6tY r18 = X.C353578Ie.A00(r3)
            android.content.res.Resources$Theme r14 = r13.getTheme()
            r17 = r2
            X.7w8 r3 = X.C347017w8.A00(r13, r14, r15, r16, r17, r18)
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            goto L_0x0547
        L_0x0128:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = X.AIr.A01(r13, r3)
            r1.A08(r6)
            r0 = 2131238898(0x7f081ff2, float:1.8094088E38)
            r1.A06(r0)
            r0 = 2131975200(0x7f135c20, float:1.9587486E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            r1.A05 = r0
            X.6Ly r3 = r1.A05()
            r0 = 2131975198(0x7f135c1e, float:1.9587482E38)
            goto L_0x0970
        L_0x014e:
            r2 = 2131952647(0x7f130407, float:1.9541743E38)
            if (r4 == 0) goto L_0x0156
            r2 = 2131952655(0x7f13040f, float:1.9541759E38)
        L_0x0156:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238319(0x7f081daf, float:1.8092913E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131952654(0x7f13040e, float:1.9541757E38)
            goto L_0x0970
        L_0x016d:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = X.AIr.A01(r13, r3)
            r1.A08(r6)
            int[] r0 = X.AnonymousClass6LW.A0F
            X.0qQ.A0B(r0, r5)
            r1.A0D = r0
            r0 = 2131238671(0x7f081f0f, float:1.8093627E38)
            r1.A06(r0)
            r0 = 2131952951(0x7f130537, float:1.954236E38)
            r1.A09(r0)
            X.6Ly r3 = r1.A05()
            r0 = 2131971057(0x7f134bf1, float:1.9579083E38)
            goto L_0x0970
        L_0x0197:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            r7 = 2131238288(0x7f081d90, float:1.809285E38)
            if (r0 == 0) goto L_0x01aa
            r7 = 2131237952(0x7f081c40, float:1.8092169E38)
        L_0x01aa:
            r6 = 2131953495(0x7f130757, float:1.9543463E38)
            if (r4 == 0) goto L_0x01b2
            r6 = 2131953522(0x7f130772, float:1.9543517E38)
        L_0x01b2:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r1 = X.2Yu.A0H(r13, r0)
            java.util.List r0 = r2.A0O
            int r0 = r0.size()
            X.AIr r4 = X.AIr.A01(r13, r3)
            if (r0 <= r10) goto L_0x01ef
            java.util.List r0 = r2.A0O
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x01cf:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x01e5
            java.lang.Object r0 = r1.next()
            X.6o8 r0 = (X.C317966o8) r0
            com.instagram.common.typedurl.ImageUrl r0 = r0.A0H
            java.lang.String r0 = r0.getUrl()
            r2.add(r0)
            goto L_0x01cf
        L_0x01e5:
            X.Div r0 = new X.Div
            r0.<init>(r13, r3, r2, r7)
            r4.A02 = r0
            r4.A07 = r10
            goto L_0x01fc
        L_0x01ef:
            r4.A08(r1)
            int[] r0 = X.AnonymousClass6LW.A0D
            X.0qQ.A0B(r0, r5)
            r4.A0D = r0
            r4.A06(r7)
        L_0x01fc:
            r4.A09(r6)
            X.6Ly r1 = r4.A05()
            boolean r0 = r1 instanceof X.C389979qX
            if (r0 == 0) goto L_0x0213
            r2 = r1
            X.9qX r2 = (X.C389979qX) r2
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0213
            r2.A00 = r10
            r2.invalidateSelf()
        L_0x0213:
            r0 = 2131953506(0x7f130762, float:1.9543485E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r13, r0)
            r0 = 2130970194(0x7f040652, float:1.7549091E38)
            goto L_0x0494
        L_0x021f:
            r5 = 2131953756(0x7f13085c, float:1.9543992E38)
            if (r4 == 0) goto L_0x0227
            r5 = 2131953755(0x7f13085b, float:1.954399E38)
        L_0x0227:
            int r4 = X.AnonymousClass7TE.A07(r13)
            X.AIr r2 = A06(r13, r3, r4)
            r1 = 2131238134(0x7f081cf6, float:1.8092538E38)
            X.6Ly r3 = A09(r2, r1, r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            X.A66 r2 = new X.A66
            r2.<init>(r3, r1, r0)
            return r2
        L_0x0240:
            r0 = 2131953782(0x7f130876, float:1.9544045E38)
            if (r4 == 0) goto L_0x0248
            r0 = 2131953783(0x7f130877, float:1.9544047E38)
        L_0x0248:
            java.lang.String r2 = r13.getString(r0)
            X.0qQ.A0A(r2)
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r6)
            r0 = 2131238662(0x7f081f06, float:1.809361E38)
            r1.A06(r0)
            X.0qQ.A0B(r2, r5)
            r1.A05 = r2
            X.6Ly r3 = r1.A05()
            r0 = 2131953781(0x7f130875, float:1.9544043E38)
            goto L_0x0970
        L_0x026e:
            int r6 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r6)
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            r1.A06(r0)
            r0 = 2131970900(0x7f134b54, float:1.9578764E38)
            if (r4 == 0) goto L_0x0284
            r0 = 2131952442(0x7f13033a, float:1.9541327E38)
        L_0x0284:
            r1.A09(r0)
            X.6Ly r3 = r1.A05()
            r0 = 2131970899(0x7f134b53, float:1.9578762E38)
            goto L_0x0970
        L_0x0290:
            r2 = 2131965078(0x7f133496, float:1.9566956E38)
            if (r4 == 0) goto L_0x0298
            r2 = 2131965079(0x7f133497, float:1.9566958E38)
        L_0x0298:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r4)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            X.6Ly r1 = A09(r1, r0, r2)
            boolean r0 = r6.CWK()
            A0A(r1, r0)
            r0 = 2131965077(0x7f133495, float:1.9566954E38)
            goto L_0x07e6
        L_0x02b6:
            r2 = 2131971058(0x7f134bf2, float:1.9579085E38)
            if (r4 == 0) goto L_0x02be
            r2 = 2131971062(0x7f134bf6, float:1.9579093E38)
        L_0x02be:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r4)
            r0 = 2131238671(0x7f081f0f, float:1.8093627E38)
            X.6Ly r1 = A09(r1, r0, r2)
            r0 = 2131971057(0x7f134bf1, float:1.9579083E38)
            goto L_0x07e6
        L_0x02d5:
            r2 = 2131956790(0x7f131436, float:1.9550146E38)
            if (r4 == 0) goto L_0x02dd
            r2 = 2131956791(0x7f131437, float:1.9550148E38)
        L_0x02dd:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238132(0x7f081cf4, float:1.8092534E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131956789(0x7f131435, float:1.9550144E38)
            goto L_0x0970
        L_0x02f4:
            r2 = 2131957330(0x7f131652, float:1.955124E38)
            if (r4 == 0) goto L_0x02fc
            r2 = 2131957331(0x7f131653, float:1.9551243E38)
        L_0x02fc:
            r0 = 2130970179(0x7f040643, float:1.754906E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r6)
            r0 = 2131238743(0x7f081f57, float:1.8093773E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            goto L_0x0970
        L_0x0313:
            X.UjJ r4 = new X.UjJ
            r4.<init>(r3, r13, r10)
            boolean r0 = r4.A00
            if (r0 != 0) goto L_0x0321
            r4.A00 = r10
            r4.invalidateSelf()
        L_0x0321:
            r0 = 2131974005(0x7f135775, float:1.9585062E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r13, r0)
            int r5 = X.AnonymousClass7TE.A07(r13)
            goto L_0x05c5
        L_0x032e:
            r2 = 2131965796(0x7f133764, float:1.9568412E38)
            if (r4 == 0) goto L_0x0336
            r2 = 2131965790(0x7f13375e, float:1.95684E38)
        L_0x0336:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r5 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r5)
            r0 = 2131238608(0x7f081ed0, float:1.80935E38)
            X.6Ly r4 = A09(r1, r0, r2)
            r0 = 2131972364(0x7f13510c, float:1.9581733E38)
            goto L_0x05c1
        L_0x034d:
            com.instagram.api.schemas.StoryPromptTappableData r0 = r2.A01
            if (r0 == 0) goto L_0x0359
            com.instagram.api.schemas.ElectionAddYoursInfoDict r0 = r0.A01
            if (r0 == 0) goto L_0x0359
            java.lang.String r2 = r0.A01
            if (r2 != 0) goto L_0x0360
        L_0x0359:
            r0 = 2131961559(0x7f1326d7, float:1.9559818E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r13, r0)
        L_0x0360:
            int r5 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r5)
            r0 = 2131237856(0x7f081be0, float:1.8091974E38)
            r1.A06(r0)
            if (r4 != 0) goto L_0x0374
            java.lang.String r2 = X.AnonymousClass7TF.A0k(r2)
        L_0x0374:
            r1.A05 = r2
            X.6Ly r4 = r1.A05()
            r0 = 2131961558(0x7f1326d6, float:1.9559816E38)
            goto L_0x05c1
        L_0x037f:
            java.util.List r1 = r2.A0O
            java.lang.Object r6 = X.00k.A0I(r1)
            X.6o8 r6 = (X.C317966o8) r6
            X.AIr r4 = X.AIr.A01(r13, r3)
            com.instagram.common.typedurl.ImageUrl r1 = r6.A0H
            java.lang.String r3 = r1.getUrl()
            X.0qQ.A07(r3)
            r2 = 2131165203(0x7f070013, float:1.7944616E38)
            X.Diw r1 = new X.Diw
            r1.<init>(r13, r3, r2)
            r4.A02 = r1
            r4.A08 = r5
            java.lang.String r1 = r6.A0U
            if (r1 == 0) goto L_0x03a8
            java.lang.String r0 = X.AnonymousClass7TG.A0o(r1)
        L_0x03a8:
            r4.A05 = r0
            X.6Ly r1 = r4.A05()
            r1.invalidateSelf()
            X.A66 r2 = new X.A66
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            r2.<init>(r1, r15, r0)
            return r2
        L_0x03be:
            r2 = 2131962855(0x7f132be7, float:1.9562447E38)
            if (r4 == 0) goto L_0x03c6
            r2 = 2131960990(0x7f13249e, float:1.9558664E38)
        L_0x03c6:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r6)
            r0 = 2131238222(0x7f081d4e, float:1.8092717E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131962854(0x7f132be6, float:1.9562445E38)
            goto L_0x0970
        L_0x03dd:
            r2 = 2131969420(0x7f13458c, float:1.9575762E38)
            if (r4 == 0) goto L_0x03e5
            r2 = 2131969419(0x7f13458b, float:1.957576E38)
        L_0x03e5:
            r0 = 2130970179(0x7f040643, float:1.754906E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r4)
            r0 = 2131238638(0x7f081eee, float:1.809356E38)
            X.6Ly r1 = A09(r1, r0, r2)
            r0 = 2131962968(0x7f132c58, float:1.9562676E38)
            goto L_0x07e6
        L_0x03fc:
            java.util.List r0 = r2.A0O
            java.lang.Object r0 = X.00k.A0J(r0)
            X.6o8 r0 = (X.C317966o8) r0
            if (r0 == 0) goto L_0x0408
            java.lang.String r15 = r0.A0g
        L_0x0408:
            X.7w8 r1 = X.C347017w8.A01(r13, r3, r2)
            if (r15 == 0) goto L_0x041b
            int r0 = r15.length()
            if (r0 <= 0) goto L_0x041b
        L_0x0414:
            r0 = 0
            X.A66 r2 = new X.A66
            r2.<init>(r1, r0, r15)
            return r2
        L_0x041b:
            r0 = 2131968497(0x7f1341f1, float:1.957389E38)
            java.lang.String r15 = X.AnonymousClass7TE.A16(r13, r0)
            goto L_0x0414
        L_0x0423:
            r0 = 2130970179(0x7f040643, float:1.754906E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r6)
            r0 = 2131238766(0x7f081f6e, float:1.809382E38)
            r1.A06(r0)
            r0 = 2131963073(0x7f132cc1, float:1.956289E38)
            r1.A09(r0)
            X.6Ly r3 = r1.A05()
            r0 = 2131963072(0x7f132cc0, float:1.9562887E38)
            goto L_0x0970
        L_0x0443:
            r2 = 2131963299(0x7f132da3, float:1.9563347E38)
            if (r4 == 0) goto L_0x044b
            r2 = 2131963298(0x7f132da2, float:1.9563345E38)
        L_0x044b:
            int r6 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238347(0x7f081dcb, float:1.809297E38)
            r1.A06(r0)
            r1.A09(r2)
            r1.A09 = r10
            X.6Ly r3 = r1.A05()
            r0 = 2131963297(0x7f132da1, float:1.9563343E38)
            goto L_0x0970
        L_0x0467:
            r7 = 2131964150(0x7f1330f6, float:1.9565074E38)
            if (r4 == 0) goto L_0x046f
            r7 = 2131964151(0x7f1330f7, float:1.9565076E38)
        L_0x046f:
            X.0Tu r6 = X.0Tu.A05
            r0 = 36327258594818361(0x810f7300353939, double:3.036842841267838E-306)
            boolean r0 = X.182.A06(r6, r3, r0)
            if (r0 == 0) goto L_0x049a
            X.9Wk r1 = new X.9Wk
            r1.<init>(r13, r3, r2, r4)
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x048a
            r1.A00 = r10
            r1.invalidateSelf()
        L_0x048a:
            r0 = 2131964142(0x7f1330ee, float:1.9565057E38)
            java.lang.String r3 = X.AnonymousClass7TE.A16(r13, r0)
            r0 = 2130970169(0x7f040639, float:1.754904E38)
        L_0x0494:
            int r4 = X.2Yu.A0H(r13, r0)
            goto L_0x07ea
        L_0x049a:
            X.AIr r1 = X.AIr.A01(r13, r3)
            r1.A08 = r5
            r0 = 2131238406(0x7f081e06, float:1.809309E38)
            X.6Ly r1 = A09(r1, r0, r7)
            goto L_0x048a
        L_0x04a8:
            r2 = 2131964149(0x7f1330f5, float:1.9565071E38)
            if (r4 == 0) goto L_0x04b0
            r2 = 2131964148(0x7f1330f4, float:1.956507E38)
        L_0x04b0:
            int r6 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r6)
            r0 = 2131238319(0x7f081daf, float:1.8092913E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131964147(0x7f1330f3, float:1.9565067E38)
            goto L_0x0970
        L_0x04c4:
            java.util.List r0 = r2.A0O
            java.util.Iterator r6 = r0.iterator()
        L_0x04ca:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x04fa
            java.lang.Object r2 = r6.next()
            X.6o8 r2 = (X.C317966o8) r2
            java.lang.String r1 = r2.A0S
            r0 = 766(0x2fe, float:1.073E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x04f8
            java.lang.String r1 = r2.A0S
            java.lang.String r0 = "internal_sticker_vibrant"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x04f8
            java.lang.String r1 = r2.A0S
            java.lang.String r0 = "internal_sticker_subtle"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x04ca
        L_0x04f8:
            r7 = 1
            goto L_0x04ca
        L_0x04fa:
            r2 = 2131964450(0x7f133222, float:1.9565682E38)
            if (r4 == 0) goto L_0x0502
            r2 = 2131964452(0x7f133224, float:1.9565686E38)
        L_0x0502:
            X.AIr r1 = X.AIr.A01(r13, r3)
            if (r7 == 0) goto L_0x0532
            int r0 = X.AnonymousClass7TE.A07(r13)
            r1.A08(r0)
            int[] r0 = X.AnonymousClass6LW.A0E
            X.0qQ.A0B(r0, r5)
            r1.A0D = r0
            r0 = 2131237710(0x7f081b4e, float:1.8091678E38)
        L_0x0519:
            r1.A06(r0)
            r1.A06 = r10
            r1.A09(r2)
            X.6Ly r1 = r1.A05()
            X.A66 r2 = new X.A66
            r0 = 2131964451(0x7f133223, float:1.9565684E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            r2.<init>(r1, r15, r0)
            return r2
        L_0x0532:
            int[] r0 = X.AnonymousClass6LW.A0B
            r1.A0A(r0)
            X.0qQ.A0B(r0, r5)
            r1.A0D = r0
            r0 = 2131231452(0x7f0802dc, float:1.8078985E38)
            goto L_0x0519
        L_0x0540:
            X.7w8 r3 = X.C347017w8.A01(r13, r3, r2)
            r0 = 2131963518(0x7f132e7e, float:1.9563792E38)
        L_0x0547:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r13, r0)
            r0 = 0
            goto L_0x0978
        L_0x054e:
            r2 = 2131964525(0x7f13326d, float:1.9565834E38)
            if (r4 == 0) goto L_0x0556
            r2 = 2131964526(0x7f13326e, float:1.9565836E38)
        L_0x0556:
            r0 = 2130970176(0x7f040640, float:1.7549055E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238059(0x7f081cab, float:1.8092386E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131964524(0x7f13326c, float:1.9565832E38)
            goto L_0x0970
        L_0x056d:
            r2 = 2131964546(0x7f133282, float:1.9565877E38)
            if (r4 == 0) goto L_0x0575
            r2 = 2131954777(0x7f130c59, float:1.9546063E38)
        L_0x0575:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r6)
            r0 = 2131238045(0x7f081c9d, float:1.8092358E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131964545(0x7f133281, float:1.9565875E38)
            goto L_0x0970
        L_0x058c:
            r2 = 2131952425(0x7f130329, float:1.9541292E38)
            if (r4 == 0) goto L_0x0594
            r2 = 2131952424(0x7f130328, float:1.954129E38)
        L_0x0594:
            int r5 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r5)
            r0 = 2131237954(0x7f081c42, float:1.8092173E38)
            X.6Ly r4 = A09(r1, r0, r2)
            r0 = 2131952423(0x7f130327, float:1.9541288E38)
            goto L_0x05c1
        L_0x05a7:
            r2 = 2131965749(0x7f133735, float:1.9568317E38)
            if (r4 == 0) goto L_0x05af
            r2 = 2131965741(0x7f13372d, float:1.95683E38)
        L_0x05af:
            int r5 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r5)
            r0 = 2131237954(0x7f081c42, float:1.8092173E38)
            X.6Ly r4 = A09(r1, r0, r2)
            r0 = 2131953559(0x7f130797, float:1.9543592E38)
        L_0x05c1:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r13, r0)
        L_0x05c5:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            X.A66 r2 = new X.A66
            r2.<init>(r4, r0, r1)
            return r2
        L_0x05cf:
            r2 = 2131966142(0x7f1338be, float:1.9569114E38)
            if (r4 == 0) goto L_0x05d7
            r2 = 2131966141(0x7f1338bd, float:1.9569112E38)
        L_0x05d7:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r4)
            r0 = 2131237898(0x7f081c0a, float:1.809206E38)
            r1.A06(r0)
            r1.A09(r2)
            r1.A09 = r10
            X.6Ly r1 = r1.A05()
            boolean r0 = r6.CXD()
            A0A(r1, r0)
            r0 = 2131966139(0x7f1338bb, float:1.9569108E38)
            goto L_0x07e6
        L_0x05fd:
            r2 = 2131967822(0x7f133f4e, float:1.9572521E38)
            if (r4 == 0) goto L_0x0605
            r2 = 2131967889(0x7f133f91, float:1.9572657E38)
        L_0x0605:
            int r4 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r4)
            r0 = 2131238581(0x7f081eb5, float:1.8093445E38)
            X.6Ly r1 = A09(r1, r0, r2)
            boolean r0 = r6.CXt()
            A0A(r1, r0)
            r0 = 2131967811(0x7f133f43, float:1.9572499E38)
            goto L_0x07e6
        L_0x0620:
            int r6 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r6)
            r0 = 2131238572(0x7f081eac, float:1.8093426E38)
            r1.A06(r0)
            r0 = 2131967848(0x7f133f68, float:1.9572574E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            r1.A05 = r0
            X.6Ly r3 = r1.A05()
            r0 = 2131967846(0x7f133f66, float:1.957257E38)
            goto L_0x0970
        L_0x0640:
            long r0 = r6.AyD()
            X.7w8 r0 = X.C378999Sa.A00(r13, r3, r2, r0)
            android.graphics.drawable.Drawable r1 = r0.A04()
            r0 = 2131975391(0x7f135cdf, float:1.9587873E38)
            goto L_0x0664
        L_0x0650:
            com.instagram.api.schemas.TrackDataImpl r0 = r2.A02
            if (r0 == 0) goto L_0x066e
            X.JVX r1 = new X.JVX
            r1.<init>(r0)
            boolean r0 = r6.CXt()
            X.9Wu r1 = X.C394529yG.A00(r13, r1, r0)
            r0 = 2131967811(0x7f133f43, float:1.9572499E38)
        L_0x0664:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            X.A66 r2 = new X.A66
            r2.<init>(r1, r15, r0)
            return r2
        L_0x066e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0673:
            r0 = 2131968680(0x7f1342a8, float:1.9574261E38)
            if (r4 == 0) goto L_0x067b
            r0 = 2131968681(0x7f1342a9, float:1.9574263E38)
        L_0x067b:
            java.lang.String r2 = r13.getString(r0)
            X.0qQ.A0A(r2)
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r6)
            r0 = 2131237869(0x7f081bed, float:1.8092E38)
            r1.A06(r0)
            X.0qQ.A0B(r2, r5)
            r1.A05 = r2
            X.6Ly r3 = r1.A05()
            r0 = 2131968677(0x7f1342a5, float:1.9574255E38)
            goto L_0x0970
        L_0x06a1:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = X.AIr.A01(r13, r3)
            r0 = 2131238627(0x7f081ee3, float:1.8093538E38)
            r1.A06(r0)
            r1.A08(r6)
            int[] r0 = X.AnonymousClass6LW.A0D
            X.0qQ.A0B(r0, r5)
            r1.A0D = r0
            r0 = 2131969456(0x7f1345b0, float:1.9575835E38)
            r1.A09(r0)
            X.6Ly r3 = r1.A05()
            r0 = 2131969455(0x7f1345af, float:1.9575833E38)
            goto L_0x0970
        L_0x06cb:
            r2 = 2131969538(0x7f134602, float:1.9576002E38)
            if (r4 == 0) goto L_0x06d3
            r2 = 2131969537(0x7f134601, float:1.9576E38)
        L_0x06d3:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r6)
            r0 = 2131238313(0x7f081da9, float:1.8092901E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131969534(0x7f1345fe, float:1.9575994E38)
            goto L_0x0970
        L_0x06ea:
            r2 = 2131969570(0x7f134622, float:1.9576067E38)
            if (r4 == 0) goto L_0x06f2
            r2 = 2131969548(0x7f13460c, float:1.9576022E38)
        L_0x06f2:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238660(0x7f081f04, float:1.8093605E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131969571(0x7f134623, float:1.9576069E38)
            goto L_0x0970
        L_0x0709:
            r2 = 2131969555(0x7f134613, float:1.9576036E38)
            if (r4 == 0) goto L_0x0711
            r2 = 2131969548(0x7f13460c, float:1.9576022E38)
        L_0x0711:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238660(0x7f081f04, float:1.8093605E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131969554(0x7f134612, float:1.9576034E38)
            goto L_0x0970
        L_0x0728:
            r2 = 2131969843(0x7f134733, float:1.957662E38)
            if (r4 == 0) goto L_0x0730
            r2 = 2131969862(0x7f134746, float:1.9576659E38)
        L_0x0730:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r4)
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            X.6Ly r1 = A09(r1, r0, r2)
            boolean r0 = r6.CZu(r5)
            A0A(r1, r0)
            r0 = 2131969844(0x7f134734, float:1.9576622E38)
            goto L_0x07e6
        L_0x074e:
            r2 = 2131971252(0x7f134cb4, float:1.9579478E38)
            if (r4 == 0) goto L_0x0756
            r2 = 2131971253(0x7f134cb5, float:1.957948E38)
        L_0x0756:
            r0 = 2130970179(0x7f040643, float:1.754906E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r4)
            r0 = 2131238110(0x7f081cde, float:1.809249E38)
            X.6Ly r1 = A09(r1, r0, r2)
            r0 = 2131971251(0x7f134cb3, float:1.9579476E38)
            goto L_0x07e6
        L_0x076c:
            X.UpZ r1 = new X.UpZ
            r1.<init>(r13, r15, r10, r10)
            r0 = 2131971321(0x7f134cf9, float:1.9579618E38)
            goto L_0x08d4
        L_0x0776:
            r2 = 2131972282(0x7f1350ba, float:1.9581567E38)
            if (r4 == 0) goto L_0x077e
            r2 = 2131972283(0x7f1350bb, float:1.958157E38)
        L_0x077e:
            r0 = 2130970196(0x7f040654, float:1.7549095E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r6)
            r0 = 2131238720(0x7f081f40, float:1.8093727E38)
            r1.A06(r0)
            r1.A09(r2)
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            r1.A07(r0)
            r1.A06 = r10
            X.6Ly r3 = r1.A05()
            r0 = 2131972281(0x7f1350b9, float:1.9581565E38)
            goto L_0x0970
        L_0x07a3:
            r2 = 2131972896(0x7f135320, float:1.9582813E38)
            if (r4 == 0) goto L_0x07ab
            r2 = 2131972895(0x7f13531f, float:1.958281E38)
        L_0x07ab:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r6)
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131972890(0x7f13531a, float:1.95828E38)
            goto L_0x0970
        L_0x07c2:
            r2 = 2131973831(0x7f1356c7, float:1.9584709E38)
            if (r4 == 0) goto L_0x07ca
            r2 = 2131973839(0x7f1356cf, float:1.9584725E38)
        L_0x07ca:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r4 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r4)
            r0 = 2131238789(0x7f081f85, float:1.8093867E38)
            X.6Ly r1 = A09(r1, r0, r2)
            boolean r0 = r6.Cc2()
            A0A(r1, r0)
            r0 = 2131973832(0x7f1356c8, float:1.958471E38)
        L_0x07e6:
            java.lang.String r3 = X.AnonymousClass7TE.A16(r13, r0)
        L_0x07ea:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.A66 r2 = new X.A66
            r2.<init>(r1, r0, r3)
            return r2
        L_0x07f4:
            r2 = 2131974042(0x7f13579a, float:1.9585137E38)
            if (r4 == 0) goto L_0x07fc
            r2 = 2131974044(0x7f13579c, float:1.958514E38)
        L_0x07fc:
            r0 = 2130970196(0x7f040654, float:1.7549095E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r6)
            r0 = 2131238930(0x7f082012, float:1.8094153E38)
            r1.A06(r0)
            r1.A09(r2)
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            r1.A07(r0)
            r1.A06 = r10
            X.6Ly r3 = r1.A05()
            r0 = 2131974043(0x7f13579b, float:1.9585139E38)
            goto L_0x0970
        L_0x0821:
            r2 = 2131974045(0x7f13579d, float:1.9585143E38)
            if (r4 == 0) goto L_0x0829
            r2 = 2131963064(0x7f132cb8, float:1.956287E38)
        L_0x0829:
            r0 = 2130970169(0x7f040639, float:1.754904E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A05(r13, r3, r6)
            r0 = 2131238129(0x7f081cf1, float:1.8092528E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131974046(0x7f13579e, float:1.9585145E38)
            goto L_0x0970
        L_0x0840:
            r2 = 2131974047(0x7f13579f, float:1.9585147E38)
            if (r4 == 0) goto L_0x0848
            r2 = 2131974049(0x7f1357a1, float:1.9585151E38)
        L_0x0848:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238327(0x7f081db7, float:1.809293E38)
            r1.A06(r0)
            r1.A09(r2)
            r0 = 2131165288(0x7f070068, float:1.7944789E38)
            r1.A07(r0)
            r1.A06 = r10
            X.6Ly r3 = r1.A05()
            r0 = 2131974048(0x7f1357a0, float:1.958515E38)
            goto L_0x0970
        L_0x086d:
            r0 = 2130970193(0x7f040651, float:1.754909E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A03(r13, r3, r6)
            r0 = 2131238877(0x7f081fdd, float:1.8094045E38)
            r1.A06(r0)
            r0 = 2131974569(0x7f1359a9, float:1.9586206E38)
            if (r4 == 0) goto L_0x0886
            r0 = 2131974335(0x7f1358bf, float:1.9585731E38)
        L_0x0886:
            r1.A09(r0)
            X.6Ly r3 = r1.A05()
            r0 = 2131974334(0x7f1358be, float:1.958573E38)
            goto L_0x0970
        L_0x0892:
            r2 = 2131974612(0x7f1359d4, float:1.9586293E38)
            if (r4 == 0) goto L_0x089a
            r2 = 2131974613(0x7f1359d5, float:1.9586295E38)
        L_0x089a:
            r6 = 2131099928(0x7f060118, float:1.7812223E38)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238189(0x7f081d2d, float:1.809265E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131974611(0x7f1359d3, float:1.958629E38)
            goto L_0x0970
        L_0x08ad:
            r2 = 2131974645(0x7f1359f5, float:1.958636E38)
            if (r4 == 0) goto L_0x08b5
            r2 = 2131974646(0x7f1359f6, float:1.9586362E38)
        L_0x08b5:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238182(0x7f081d26, float:1.8092635E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131974644(0x7f1359f4, float:1.9586358E38)
            goto L_0x0970
        L_0x08cc:
            X.9ps r1 = new X.9ps
            r1.<init>(r13)
            r0 = 2131974808(0x7f135a98, float:1.958669E38)
        L_0x08d4:
            java.lang.String r0 = X.AnonymousClass7TE.A16(r13, r0)
            X.A66 r2 = new X.A66
            r2.<init>(r1, r15, r0)
            return r2
        L_0x08de:
            r2 = 2131952306(0x7f1302b2, float:1.9541051E38)
            if (r4 == 0) goto L_0x08e6
            r2 = 2131965510(0x7f133646, float:1.9567832E38)
        L_0x08e6:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131238506(0x7f081e6a, float:1.8093293E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131975943(0x7f135f07, float:1.9588993E38)
            goto L_0x0970
        L_0x08fc:
            r2 = 2131976030(0x7f135f5e, float:1.958917E38)
            if (r4 == 0) goto L_0x0904
            r2 = 2131961771(0x7f1327ab, float:1.9560248E38)
        L_0x0904:
            int r6 = X.AnonymousClass7TE.A07(r13)
            X.AIr r1 = A06(r13, r3, r6)
            r0 = 2131238018(0x7f081c82, float:1.8092303E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131976024(0x7f135f58, float:1.9589157E38)
            goto L_0x0970
        L_0x0917:
            r2 = 2131976264(0x7f136048, float:1.9589644E38)
            if (r4 == 0) goto L_0x091f
            r2 = 2131976265(0x7f136049, float:1.9589646E38)
        L_0x091f:
            r0 = 2130970190(0x7f04064e, float:1.7549083E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131237958(0x7f081c46, float:1.8092181E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131976262(0x7f136046, float:1.958964E38)
            goto L_0x0970
        L_0x0935:
            r2 = 2131976726(0x7f136216, float:1.959058E38)
            if (r4 == 0) goto L_0x093d
            r2 = 2131976727(0x7f136217, float:1.9590583E38)
        L_0x093d:
            r0 = 2130970195(0x7f040653, float:1.7549093E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A04(r13, r3, r6)
            r0 = 2131239011(0x7f082063, float:1.8094317E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131976725(0x7f136215, float:1.9590579E38)
            goto L_0x0970
        L_0x0953:
            r2 = 2131976870(0x7f1362a6, float:1.9590873E38)
            if (r4 == 0) goto L_0x095b
            r2 = 2131976873(0x7f1362a9, float:1.9590879E38)
        L_0x095b:
            r0 = 2130970342(0x7f0406e6, float:1.7549391E38)
            int r6 = X.2Yu.A0H(r13, r0)
            X.AIr r1 = A07(r13, r3, r6)
            r0 = 2131237902(0x7f081c0e, float:1.8092068E38)
            X.6Ly r3 = A09(r1, r0, r2)
            r0 = 2131976871(0x7f1362a7, float:1.9590875E38)
        L_0x0970:
            java.lang.String r1 = X.AnonymousClass7TE.A16(r13, r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x0978:
            X.A66 r2 = new X.A66
            r2.<init>(r3, r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AJA.A02(android.content.Context, com.instagram.common.session.UserSession, X.6ht, X.6nz):X.A66");
    }
}
