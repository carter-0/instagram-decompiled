package X;

import android.graphics.Path;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Jvl  reason: case insensitive filesystem */
public final class C61047Jvl extends AnonymousClass0T0 {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C61047Jvl(Path path, C354668Mx r3, C359018bq r4, int i) {
        this.A04 = 0;
        this.A00 = i;
        this.A02 = path;
        this.A03 = r4;
        this.A01 = r3;
    }

    public static boolean A00(int i, Object obj) {
        if (!(obj instanceof C61047Jvl) || ((C61047Jvl) obj).A04 != i) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        int i;
        C61047Jvl jvl;
        switch (this.A04) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!A00(0, obj)) {
                    return false;
                }
                C61047Jvl jvl2 = (C61047Jvl) obj;
                if (this.A00 != jvl2.A00 || !0qQ.A0K(this.A02, jvl2.A02) || !0qQ.A0K(this.A03, jvl2.A03) || this.A01 != jvl2.A01) {
                    return false;
                }
                return true;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (!A00(1, obj)) {
                    return false;
                }
                C61047Jvl jvl3 = (C61047Jvl) obj;
                if (this.A00 != jvl3.A00 || !0qQ.A0K(this.A03, jvl3.A03) || !0qQ.A0K(this.A02, jvl3.A02) || !0qQ.A0K(this.A01, jvl3.A01)) {
                    return false;
                }
                return true;
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!A00(2, obj)) {
                    return false;
                }
                jvl = (C61047Jvl) obj;
                if (!0qQ.A0K(this.A01, jvl.A01) || !0qQ.A0K(this.A02, jvl.A02) || !0qQ.A0K(this.A03, jvl.A03)) {
                    return false;
                }
            case 3:
                if (this != obj) {
                    i = 3;
                    break;
                } else {
                    return true;
                }
            default:
                if (this != obj) {
                    i = 4;
                    break;
                } else {
                    return true;
                }
        }
        if (!A00(i, obj)) {
            return false;
        }
        jvl = (C61047Jvl) obj;
        if (!0qQ.A0K(this.A01, jvl.A01) || !0qQ.A0K(this.A02, jvl.A02) || this.A03 != jvl.A03) {
            return false;
        }
        if (this.A00 != jvl.A00) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        r1 = X.AnonymousClass7TF.A07(r0, r1);
        r0 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001a, code lost:
        return r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0042, code lost:
        r0 = r2.A01.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r2 = this;
            int r0 = r2.A04
            switch(r0) {
                case 0: goto L_0x001b;
                case 1: goto L_0x0032;
                case 2: goto L_0x0049;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r2.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r2.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r2.A03
        L_0x0013:
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            int r0 = r2.A00
        L_0x0019:
            int r1 = r1 + r0
            return r1
        L_0x001b:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r2.A02
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r2.A03
            int r0 = X.AnonymousClass7TE.A0L(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            goto L_0x0042
        L_0x0032:
            int r0 = r2.A00
            int r1 = r0 * 31
            java.lang.Object r0 = r2.A03
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r2.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
        L_0x0042:
            java.lang.Object r0 = r2.A01
            int r0 = r0.hashCode()
            goto L_0x0019
        L_0x0049:
            java.lang.Object r0 = r2.A01
            int r1 = X.AnonymousClass7TE.A0K(r0)
            java.lang.Object r0 = r2.A02
            int r1 = X.AnonymousClass7TF.A07(r0, r1)
            java.lang.Object r0 = r2.A03
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61047Jvl.hashCode():int");
    }

    public C61047Jvl(View.OnClickListener onClickListener, CharSequence charSequence, CharSequence charSequence2) {
        this.A04 = 1;
        0qQ.A0B(charSequence2, 3);
        this.A00 = R.drawable.instagram_gen_ai_pano_outline_24;
        this.A03 = charSequence;
        this.A02 = charSequence2;
        this.A01 = onClickListener;
    }

    public C61047Jvl(C267324bN r2, C295365o2 r3, C52058GDe gDe, int i, int i2) {
        this.A04 = i2;
        0qQ.A0B(r3, 3);
        this.A01 = r2;
        this.A02 = gDe;
        this.A03 = r3;
        this.A00 = i;
    }

    public C61047Jvl() {
        this.A04 = 2;
        0sl r2 = 0sl.A00;
        int length = C16679UzF.values().length;
        this.A04 = 2;
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = r2;
        this.A03 = r2;
        this.A00 = length;
    }
}
