package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.AAk  reason: case insensitive filesystem */
public abstract class C39813AAk {
    public static final AnonymousClass91c A00(Context context, UserSession userSession, C360728f3 r3, int i) {
        0qQ.A0B(context, 1);
        switch (r3.ordinal()) {
            case 0:
                return new C15921Ukl(context, i);
            case 1:
                return new C15919Ukj(context, i);
            case 2:
                return new C388639o9(context, i);
            case 3:
                return new C15922Ukm(context, i);
            case 4:
                return new C15920Ukk(context, i);
            case 5:
                return new C15923Ukn(context, userSession, i);
            case 6:
                return new C15916Ukg(context, i);
            case 7:
                return new C15918Uki(context, i);
            case 8:
                return new C388629o8(context, i);
            case 9:
                return new C15917Ukh(context, i);
            case 10:
                return new C15924Uko(context, i);
            case 11:
                return new C15925Ukp(context, i);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new C15926Ukq(context, i);
            default:
                throw AnonymousClass7TE.A0z(AnonymousClass7TG.A0m(r3, "No animated text drawable created for: ", AnonymousClass7TE.A1A()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        return new X.C388629o8(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0083, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        throw X.AnonymousClass7TE.A0z(X.002.A0R("No animated text drawable created for: ", r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008a, code lost:
        return new X.C15917Ukh(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ad, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b4, code lost:
        return new X.C15921Ukl(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00c2, code lost:
        return new X.C15916Ukg(r2, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00c9, code lost:
        if (r1.equals(r0) == false) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00d0, code lost:
        return new X.C15923Ukn(r2, r3, r5);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.AnonymousClass91c A01(android.content.Context r2, com.instagram.common.session.UserSession r3, X.C358868bb r4, int r5) {
        /*
            r0 = 1
            X.0qQ.A0B(r2, r0)
            java.lang.String r1 = r4.A09
            int r0 = r1.hashCode()
            switch(r0) {
                case -2004336740: goto L_0x00c3;
                case -1744775855: goto L_0x00b5;
                case -1726419343: goto L_0x00a7;
                case -1663019586: goto L_0x0099;
                case -1631834134: goto L_0x008b;
                case -1617422471: goto L_0x007d;
                case -1478538163: goto L_0x007a;
                case -988389614: goto L_0x0077;
                case -761073575: goto L_0x0074;
                case -555649727: goto L_0x0071;
                case -409434162: goto L_0x0063;
                case -394091697: goto L_0x0060;
                case -353089843: goto L_0x005d;
                case -346746060: goto L_0x005a;
                case -282676306: goto L_0x0057;
                case -281568951: goto L_0x0054;
                case -250076159: goto L_0x0051;
                case -148942121: goto L_0x0043;
                case -17506012: goto L_0x0035;
                case 3347760: goto L_0x0027;
                case 3357411: goto L_0x0024;
                case 42700686: goto L_0x0021;
                case 1443377805: goto L_0x001e;
                case 1738222382: goto L_0x001b;
                case 1838584197: goto L_0x0018;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.String r0 = "No animated text drawable created for: "
            java.lang.String r0 = X.002.A0R(r0, r1)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0018:
            java.lang.String r0 = "neon_v2"
            goto L_0x0045
        L_0x001b:
            java.lang.String r0 = "ig_deco"
            goto L_0x007f
        L_0x001e:
            java.lang.String r0 = "dynapuff"
            goto L_0x007f
        L_0x0021:
            java.lang.String r0 = "ig_poster"
            goto L_0x007f
        L_0x0024:
            java.lang.String r0 = "mono"
            goto L_0x007f
        L_0x0027:
            java.lang.String r0 = "meme"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.9o9 r0 = new X.9o9
            r0.<init>(r2, r5)
            return r0
        L_0x0035:
            java.lang.String r0 = "strong_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukm r0 = new X.Ukm
            r0.<init>(r2, r5)
            return r0
        L_0x0043:
            java.lang.String r0 = "ig_signature"
        L_0x0045:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.9o8 r0 = new X.9o8
            r0.<init>(r2, r5)
            return r0
        L_0x0051:
            java.lang.String r0 = "ig_squeeze"
            goto L_0x007f
        L_0x0054:
            java.lang.String r0 = "classic_v2"
            goto L_0x00a9
        L_0x0057:
            java.lang.String r0 = "ig_editor"
            goto L_0x007f
        L_0x005a:
            java.lang.String r0 = "alumni_sans"
            goto L_0x007f
        L_0x005d:
            java.lang.String r0 = "ig_bubble"
            goto L_0x007f
        L_0x0060:
            java.lang.String r0 = "poppins"
            goto L_0x007f
        L_0x0063:
            java.lang.String r0 = "typewriter_v2"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukj r0 = new X.Ukj
            r0.<init>(r2, r5)
            return r0
        L_0x0071:
            java.lang.String r0 = "modern_refreshed_v2"
            goto L_0x00c5
        L_0x0074:
            java.lang.String r0 = "hepta_slab"
            goto L_0x007f
        L_0x0077:
            java.lang.String r0 = "ig_literature"
            goto L_0x00b7
        L_0x007a:
            java.lang.String r0 = "halloween"
            goto L_0x007f
        L_0x007d:
            java.lang.String r0 = "caprasimo"
        L_0x007f:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukh r0 = new X.Ukh
            r0.<init>(r2, r5)
            return r0
        L_0x008b:
            java.lang.String r0 = "directional"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Uki r0 = new X.Uki
            r0.<init>(r2, r5)
            return r0
        L_0x0099:
            java.lang.String r0 = "elegant"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukk r0 = new X.Ukk
            r0.<init>(r2, r5)
            return r0
        L_0x00a7:
            java.lang.String r0 = "ig_classic"
        L_0x00a9:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukl r0 = new X.Ukl
            r0.<init>(r2, r5)
            return r0
        L_0x00b5:
            java.lang.String r0 = "literature"
        L_0x00b7:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukg r0 = new X.Ukg
            r0.<init>(r2, r5)
            return r0
        L_0x00c3:
            java.lang.String r0 = "modern_v2"
        L_0x00c5:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000d
            X.Ukn r0 = new X.Ukn
            r0.<init>(r2, r3, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39813AAk.A01(android.content.Context, com.instagram.common.session.UserSession, X.8bb, int):X.91c");
    }
}
