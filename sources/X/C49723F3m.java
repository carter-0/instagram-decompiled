package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import org.webrtc.CameraCapturer;

/* renamed from: X.F3m  reason: case insensitive filesystem */
public abstract class C49723F3m {
    public final int A00;
    public final int A01;
    public final int A02;
    public final 1Xj A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final Drawable A00(Context context) {
        if (this instanceof ER8) {
            0qQ.A0B(context, 0);
            if (!((ER8) this).A03) {
                return null;
            }
            Drawable A002 = C14091Tpi.A00(context, XDU.A3r, GOg.SIZE_24, C52337GOf.OUTLINE);
            DbX.A11(context, A002, 2Yu.A0H(context, R.attr.igds_color_primary_icon));
            return A002;
        } else if (this instanceof ER7) {
            0qQ.A0B(context, 0);
            if (!((ER7) this).A02) {
                return null;
            }
            Drawable A003 = C14091Tpi.A00(context, XDU.A3r, GOg.SIZE_16, C52337GOf.OUTLINE);
            DbX.A11(context, A003, 2Yu.A0H(context, R.attr.igds_color_primary_icon));
            return A003;
        } else {
            0qQ.A0B(context, 0);
            Drawable A004 = C14091Tpi.A00(context, XDU.A3s, GOg.SIZE_24, C52337GOf.FILLED);
            DbX.A11(context, A004, R.color.igds_facebook_blue);
            return A004;
        }
    }

    public final CharSequence A01(Resources resources) {
        if (!(this instanceof ER8) || !((ER8) this).A02) {
            return null;
        }
        return resources.getText(2131975896);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (X.182.A06(r2, r3, 36329865636495720L) != false) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.CharSequence A02(android.content.res.Resources r5) {
        /*
            r4 = this;
            boolean r0 = r4 instanceof X.ER8
            if (r0 == 0) goto L_0x0034
            r0 = r4
            X.ER8 r0 = (X.ER8) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.1Xj r0 = r0.A03
            boolean r0 = X.C338007hG.A00(r3, r0)
            if (r0 == 0) goto L_0x0053
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163864009253784(0x208109a000072398, double:4.066310674361847E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0053
            r0 = 36329865636495720(0x8111d200004168, double:3.038491544922314E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 2131975899(0x7f135edb, float:1.9588903E38)
            if (r1 == 0) goto L_0x002f
        L_0x002c:
            r0 = 2131975898(0x7f135eda, float:1.9588901E38)
        L_0x002f:
            java.lang.CharSequence r0 = r5.getText(r0)
            return r0
        L_0x0034:
            boolean r0 = r4 instanceof X.ER7
            if (r0 == 0) goto L_0x0053
            r0 = r4
            X.ER7 r0 = (X.ER7) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.1Xj r0 = r0.A03
            boolean r0 = X.C338007hG.A00(r3, r0)
            if (r0 == 0) goto L_0x0053
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342163864009319321(0x208109a000082399, double:4.0663106744174165E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0053
            goto L_0x002c
        L_0x0053:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49723F3m.A02(android.content.res.Resources):java.lang.CharSequence");
    }

    public final String A03(Resources resources, CharSequence charSequence) {
        String A0e;
        int i;
        Object[] objArr;
        Resources resources2 = resources;
        CharSequence charSequence2 = charSequence;
        if (this instanceof ER6) {
            ER6 er6 = (ER6) this;
            0qQ.A0B(resources, 0);
            return C46342Dck.A00.A04(resources2, charSequence2, er6.A02, er6.A01, er6.A00);
        }
        if (this instanceof ER5) {
            0qQ.A0B(resources, 0);
            A0e = AnonymousClass7TF.A0e(resources, charSequence, 2131973484);
        } else if (this instanceof ER4) {
            0qQ.A0B(resources, 0);
            A0e = AnonymousClass7TF.A0e(resources, charSequence, 2131973488);
        } else if (this instanceof ER8) {
            ER8 er8 = (ER8) this;
            0qQ.A0B(resources, 0);
            int i2 = er8.A02;
            String A0e2 = DbY.A0e(resources, C253673rC.A04(resources, Integer.valueOf(i2), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.unified_feedback_reactions_from_fb, i2);
            int i3 = er8.A01;
            String A0e3 = DbY.A0e(resources, C253673rC.A04(resources, Integer.valueOf(i3), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.unified_feedback_plays_from_fb, i3);
            boolean z = er8.A01;
            if (i2 <= 0) {
                int i4 = 2131975895;
                if (z) {
                    i4 = 2131975894;
                }
                objArr = new Object[]{A0e3};
            } else if (i3 > 0) {
                i = 2131975893;
                if (z) {
                    i = 2131975892;
                }
                objArr = new Object[]{A0e2, A0e3};
            } else {
                int i5 = 2131975895;
                if (z) {
                    i5 = 2131975894;
                }
                objArr = new Object[]{A0e2};
            }
            String string = resources.getString(i, objArr);
            0qQ.A0A(string);
            return string;
        } else {
            ER7 er7 = (ER7) this;
            0qQ.A0B(resources, 0);
            int i6 = 2131975895;
            if (er7.A01) {
                i6 = 2131975894;
            }
            int i7 = er7.A00;
            A0e = AnonymousClass7TF.A0e(resources, DbV.A0v(resources, C253673rC.A04(resources, Integer.valueOf(i7), CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false), R.plurals.unified_feedback_comments_from_fb, i7), i6);
        }
        0qQ.A07(A0e);
        return A0e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        if (r3.A0C.getClipsMetadata() == null) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C49723F3m(X.1Xj r3) {
        /*
            r2 = this;
            r2.<init>()
            r2.A03 = r3
            java.lang.String r0 = r3.A2n()
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = ""
        L_0x000d:
            r2.A04 = r0
            int r0 = r3.A0t()
            r2.A02 = r0
            int r0 = r3.A0u()
            r2.A01 = r0
            X.1Xy r0 = r3.A0C
            java.lang.Integer r0 = r0.B47()
            int r0 = X.AnonymousClass7TG.A0A(r0)
            r2.A00 = r0
            boolean r0 = r3.A5G()
            if (r0 == 0) goto L_0x0036
            X.1Xy r0 = r3.A0C
            X.1sQ r1 = r0.getClipsMetadata()
            r0 = 1
            if (r1 != 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r2.A06 = r0
            boolean r0 = r3.A5T()
            r2.A05 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49723F3m.<init>(X.1Xj):void");
    }
}
