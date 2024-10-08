package X;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Base64;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.7Kj  reason: invalid class name and case insensitive filesystem */
public final class C329827Kj {
    public int A00;
    public ViewGroup A01;
    public IgImageView A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final LruCache A06;
    public final ViewStub A07;
    public final UserSession A08;
    public final String A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B = AnonymousClass0eN.A01(new C73903Ple(this, 30));
    public final AnonymousClass0eM A0C = AnonymousClass0eN.A01(new C73903Ple(this, 31));
    public final AnonymousClass0eM A0D = AnonymousClass0eN.A01(new C73903Ple(this, 32));
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H = AnonymousClass0eN.A01(TVS.A00);
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public volatile String A0K;

    public C329827Kj(Activity activity, ViewStub viewStub, UserSession userSession) {
        0qQ.A0B(viewStub, 3);
        this.A08 = userSession;
        this.A05 = activity;
        this.A07 = viewStub;
        this.A09 = 182.A04(0Tu.A06, userSession, 36887781888885515L);
        this.A0A = AnonymousClass0eN.A01(new C73903Ple(this, 29));
        this.A0I = AnonymousClass0eN.A01(new C73903Ple(this, 36));
        this.A0E = AnonymousClass0eN.A01(new C73903Ple(this, 33));
        this.A0F = AnonymousClass0eN.A01(new C73903Ple(this, 34));
        this.A0J = AnonymousClass0eN.A01(new C73903Ple(this, 37));
        this.A0G = AnonymousClass0eN.A01(new C73903Ple(this, 35));
        this.A0K = "";
        this.A00 = 2SP.A01.A05(Integer.MAX_VALUE);
        this.A06 = new LruCache(20);
    }

    public static final void A03(C329827Kj r3, DirectThreadKey directThreadKey, String str) {
        try {
            String substring = str.substring(00l.A04(str, ',', 0) + 1);
            0qQ.A07(substring);
            byte[] decode = Base64.decode(substring, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            IgImageView igImageView = r3.A02;
            if (igImageView != null) {
                igImageView.post(new C66038M8x(decodeByteArray, r3, directThreadKey));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0174, code lost:
        if (((java.lang.Boolean) r6.A0C.getValue()).booleanValue() != false) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.C329827Kj r6, com.instagram.model.direct.DirectThreadKey r7, java.lang.String r8) {
        /*
            com.instagram.common.session.UserSession r3 = r6.A08
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326914994157645(0x810f230003384d, double:3.036625546826432E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x00a9
            r2 = 0
            if (r7 == 0) goto L_0x00a6
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r0 = X.00k.A0N(r0)
        L_0x001a:
            java.lang.String r5 = r6.A09
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0043
            X.0eM r3 = r6.A0G
            java.lang.Object r1 = r3.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            boolean r0 = X.00p.A0k(r8, r1, r0)
            if (r0 == 0) goto L_0x00de
            java.lang.Object r0 = r3.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = X.00l.A0F(r0, r8)
            java.lang.CharSequence r0 = X.00l.A0B(r0)
            java.lang.String r8 = r0.toString()
        L_0x0043:
            X.0eM r0 = r6.A0J
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r4 = r0.iterator()
        L_0x004f:
            boolean r0 = r4.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r1 = r4.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x004f
        L_0x0063:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00de
            int r3 = r8.length()
            int r0 = r1.length()
            int r3 = r3 - r0
            r0 = 8
            if (r3 < r0) goto L_0x00de
            if (r7 == 0) goto L_0x00a2
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r0 = X.00k.A0N(r0)
        L_0x007e:
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 == 0) goto L_0x0093
            X.0eM r0 = r6.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00de
        L_0x0092:
            return r1
        L_0x0093:
            X.0eM r0 = r6.A0D
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00de
            return r1
        L_0x00a2:
            r0 = r2
            goto L_0x007e
        L_0x00a4:
            r1 = r2
            goto L_0x0063
        L_0x00a6:
            r0 = r2
            goto L_0x001a
        L_0x00a9:
            int r4 = r8.length()
            X.0eM r1 = r6.A0F
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            int r0 = r0 + 8
            r3 = 1
            if (r4 < r0) goto L_0x00df
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x00df
            X.0eM r0 = r6.A0D
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00df
        L_0x00d8:
            java.lang.Object r2 = r1.getValue()
        L_0x00dc:
            java.lang.String r2 = (java.lang.String) r2
        L_0x00de:
            return r2
        L_0x00df:
            X.0eM r1 = r6.A0E
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            int r0 = r0 + 8
            if (r4 < r0) goto L_0x010a
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x010a
            X.0eM r0 = r6.A0D
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x010a
            goto L_0x00d8
        L_0x010a:
            r1 = 0
            if (r7 == 0) goto L_0x0177
            java.util.List r0 = r7.A02
            if (r0 == 0) goto L_0x0177
            java.lang.Object r2 = X.00k.A0N(r0)
        L_0x0115:
            java.lang.String r0 = r6.A09
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0092
            X.0eM r2 = r6.A0I
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            int r0 = r0 + 8
            if (r4 < r0) goto L_0x014c
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x014c
            X.0eM r0 = r6.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x014c
        L_0x0147:
            java.lang.Object r2 = r2.getValue()
            goto L_0x00dc
        L_0x014c:
            X.0eM r2 = r6.A0A
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            int r0 = r0 + 8
            if (r4 < r0) goto L_0x0092
            java.lang.Object r0 = r2.getValue()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = X.00p.A0k(r8, r0, r3)
            if (r0 == 0) goto L_0x0092
            X.0eM r0 = r6.A0C
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0092
            goto L_0x0147
        L_0x0177:
            r2 = r1
            goto L_0x0115
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C329827Kj.A00(X.7Kj, com.instagram.model.direct.DirectThreadKey, java.lang.String):java.lang.String");
    }

    public static final void A01(C329827Kj r4) {
        IgImageView igImageView;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (Build.VERSION.SDK_INT >= 31) {
            IgImageView igImageView2 = r4.A02;
            if (igImageView2 != null) {
                igImageView2.post(new PWM(r4));
                return;
            }
            return;
        }
        if (!r4.A04 && (igImageView = r4.A02) != null) {
            Drawable drawable = igImageView.getDrawable();
            if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
                igImageView.setBitmapAndImageRenderer(bitmap, (C226642hc) null);
            } else {
                return;
            }
        }
        IgImageView igImageView3 = r4.A02;
        if (igImageView3 != null) {
            igImageView3.setImageRendererAndReset(AnonymousClass75B.A00);
            r4.A04 = true;
        }
    }

    public static final void A02(C329827Kj r3) {
        int i = Build.VERSION.SDK_INT;
        IgImageView igImageView = r3.A02;
        if (i < 31) {
            if (igImageView != null) {
                igImageView.A09();
            }
            IgImageView igImageView2 = r3.A02;
            if (igImageView2 != null) {
                igImageView2.setImageRendererAndReset((C226642hc) null);
            }
            r3.A04 = false;
        } else if (igImageView != null) {
            igImageView.post(new PWN(r3));
        }
    }

    public final void A04() {
        ViewGroup viewGroup = this.A01;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        View findViewById = this.A05.findViewById(R.id.message_list_refresh_container);
        if (findViewById != null) {
            findViewById.animate().alpha(1.0f).start();
        }
    }
}
