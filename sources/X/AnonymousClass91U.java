package X;

import android.graphics.Typeface;
import com.instagram.react.modules.base.IgReactQEModule;
import org.webrtc.EglBase14Impl;

/* renamed from: X.91U  reason: invalid class name */
public abstract class AnonymousClass91U {
    public static final float A00(C358928bh r2) {
        0qQ.A0B(r2, 0);
        int ordinal = r2.ordinal();
        if (ordinal == 5) {
            return 0.96f;
        }
        if (ordinal == 6) {
            return 0.58f;
        }
        if (ordinal == 7) {
            return 0.33f;
        }
        if (ordinal == 8) {
            return 0.46f;
        }
        if (ordinal == 4) {
            return 0.29f;
        }
        if (ordinal == 11) {
            return 0.38f;
        }
        switch (ordinal) {
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return 0.71f;
            case 19:
                return 0.33f;
            case 20:
                return 0.42f;
            case 21:
                return 0.38f;
            case 22:
                return 0.29f;
            case 23:
                return 0.88f;
            case 24:
                return 0.46f;
            case 25:
            case 26:
                return 1.0f;
            default:
                return 0.5f;
        }
    }

    public static final Typeface A01(AnonymousClass0qq r1, C358928bh r2) {
        0qm r0;
        0qQ.A0B(r1, 1);
        if (r2 != null) {
            switch (r2.ordinal()) {
                case 0:
                    r0 = 0qm.A0B;
                    break;
                case 1:
                    r0 = 0qm.A10;
                    break;
                case 2:
                    r0 = 0qm.A14;
                    break;
                case 4:
                    Typeface A02 = r1.A02(0qm.A0C);
                    if (A02 == null) {
                        return Typeface.MONOSPACE;
                    }
                    return A02;
                case 5:
                    Typeface A022 = r1.A02(0qm.A0c);
                    if (A022 == null) {
                        return Typeface.create(Typeface.SANS_SERIF, 3);
                    }
                    return A022;
                case 6:
                    r0 = 0qm.A0D;
                    break;
                case 7:
                    r0 = 0qm.A06;
                    break;
                case 8:
                    r0 = 0qm.A08;
                    break;
                case 9:
                case 20:
                    r0 = 0qm.A0g;
                    break;
                case 11:
                    r0 = 0qm.A0V;
                    break;
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                    r0 = 0qm.A0F;
                    break;
                case 13:
                    r0 = 0qm.A0o;
                    break;
                case 14:
                    r0 = 0qm.A09;
                    break;
                case 15:
                    r0 = 0qm.A05;
                    break;
                case 16:
                    r0 = 0qm.A0H;
                    break;
                case 17:
                    r0 = 0qm.A0N;
                    break;
                case EglBase14Impl.EGLExt_SDK_VERSION:
                    r0 = 0qm.A0P;
                    break;
                case 19:
                    r0 = 0qm.A0Z;
                    break;
                case 21:
                    r0 = 0qm.A0R;
                    break;
                case 22:
                    r0 = 0qm.A0Q;
                    break;
                case 23:
                    r0 = 0qm.A0S;
                    break;
                case 24:
                    r0 = 0qm.A0a;
                    break;
                case 25:
                    r0 = 0qm.A0O;
                    break;
                case 26:
                    r0 = 0qm.A0M;
                    break;
            }
        }
        r0 = 0qm.A0z;
        return r1.A02(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if (X.C358948bj.A05(r8) == false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(android.content.Context r7, android.text.Editable r8, X.C358868bb r9) {
        /*
            r6 = 0
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.lang.Class<X.91V> r5 = X.AnonymousClass91V.class
            java.lang.Object r2 = X.C263324Kh.A00(r8, r5)
            X.91V r2 = (X.AnonymousClass91V) r2
            boolean r4 = X.C358948bj.A06(r8)
            if (r4 != 0) goto L_0x001e
            boolean r0 = X.C358948bj.A05(r8)
            r3 = 1
            if (r0 != 0) goto L_0x001f
        L_0x001e:
            r3 = 0
        L_0x001f:
            if (r2 == 0) goto L_0x002c
            X.8bh r1 = r2.A02
            X.8bh r0 = r9.A05
            if (r1 != r0) goto L_0x002c
            r2.A01 = r4
            r2.A00 = r3
            return
        L_0x002c:
            java.lang.Class[] r0 = new java.lang.Class[]{r5}
            X.C263324Kh.A05(r8, r0)
            X.91V r2 = new X.91V
            r2.<init>(r7, r9)
            r2.A01 = r4
            r2.A00 = r3
            int r1 = r8.length()
            r0 = 65554(0x10012, float:9.1861E-41)
            r8.setSpan(r2, r6, r1, r0)
            X.33y r1 = X.C70572Rz.A00()
            r0 = -1
            r1.A8I(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass91U.A02(android.content.Context, android.text.Editable, X.8bb):void");
    }
}
