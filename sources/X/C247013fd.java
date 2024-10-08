package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.3fd  reason: invalid class name and case insensitive filesystem */
public abstract class C247013fd {
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r11 == X.AnonymousClass3TO.GONE) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass9IB r5, X.1Xj r6, X.AnonymousClass4DU r7, X.C246663ey r8, X.AnonymousClass3W1 r9, X.C231502rm r10, X.AnonymousClass3TO r11) {
        /*
            r0 = 1
            X.0qQ.A0B(r7, r0)
            r0 = 3
            X.0qQ.A0B(r9, r0)
            r0 = 4
            X.0qQ.A0B(r11, r0)
            r0 = 5
            X.0qQ.A0B(r5, r0)
            r3 = 1
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0020
            r1 = -2143693505(0xffffffff8039d53f, float:-5.311122E-39)
            java.lang.String r0 = "setupVideoView"
            X.0fS.A01(r0, r1)
        L_0x0020:
            boolean r2 = r10.A09     // Catch:{ all -> 0x005b }
            X.3TO r0 = X.AnonymousClass3TO.HIDDEN     // Catch:{ all -> 0x005b }
            if (r11 == r0) goto L_0x002f
            X.3TO r0 = X.AnonymousClass3TO.HIDDEN_IMMEDIATELY     // Catch:{ all -> 0x005b }
            if (r11 == r0) goto L_0x002f
            X.3TO r1 = X.AnonymousClass3TO.GONE     // Catch:{ all -> 0x005b }
            r0 = 1
            if (r11 != r1) goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r2 == 0) goto L_0x0034
            if (r0 == 0) goto L_0x003f
        L_0x0034:
            com.instagram.ui.mediaactions.MediaActionsView r1 = r8.A08     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x0053
            com.instagram.feed.widget.IgProgressImageView r0 = r8.A00()     // Catch:{ all -> 0x005b }
            X.AnonymousClass4Je.A00(r5, r9, r0, r1, r11)     // Catch:{ all -> 0x005b }
        L_0x003f:
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = r8.A01()     // Catch:{ all -> 0x005b }
            r0.setVideoSource(r6, r7)     // Catch:{ all -> 0x005b }
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0052
            r0 = 2028041536(0x78e17540, float:3.6582653E34)
            X.0fS.A00(r0)
        L_0x0052:
            return
        L_0x0053:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005b }
            r0.<init>(r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r1 = move-exception
            boolean r0 = com.facebook.systrace.Systrace.A0E(r3)
            if (r0 == 0) goto L_0x0068
            r0 = -905701728(0xffffffffca0416a0, float:-2164136.0)
            X.0fS.A00(r0)
        L_0x0068:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C247013fd.A02(X.9IB, X.1Xj, X.4DU, X.3ey, X.3W1, X.2rm, X.3TO):void");
    }

    /* JADX INFO: finally extract failed */
    public static final void A03(AnonymousClass9IP r8, 2WE r9, C246613et r10, AnonymousClass4Js r11, C245853da r12, 0sP r13) {
        0qQ.A0B(r12, 2);
        AnonymousClass4Js r7 = r11;
        0qQ.A0B(r11, 3);
        AnonymousClass9IP r4 = r8;
        0qQ.A0B(r8, 4);
        try {
            r9.A00 = 00R.A03("video_play_button", 127);
            r9.A02(new AnonymousClass9MT(14, r4, r10, r13, r7), new Object[]{r12});
            r9.A00 = null;
        } catch (Throwable th) {
            r9.A00 = null;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A04(2WE r10, UserSession userSession, AnonymousClass3W1 r12, C243043Xe r13, AnonymousClass9NR r14, String str, 0sP r16, boolean z) {
        AnonymousClass3W1 r4 = r12;
        0qQ.A0B(r12, 2);
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession, 4);
        String str2 = str;
        0qQ.A0B(str, 5);
        C243043Xe r5 = r13;
        0qQ.A0B(r13, 6);
        try {
            r10.A00 = 00R.A03("interactive_stickers", 127);
            r10.A02(new C278454wu(userSession2, r4, r5, r14, str2, r16, z), new Object[]{r14, r13});
            r10.A00 = null;
        } catch (Throwable th) {
            r10.A00 = null;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A05(2WE r8, C246873fN r9, C246613et r10, 0sP r11, boolean z, boolean z2) {
        C246613et r4 = r10;
        0qQ.A0B(r10, 1);
        C246873fN r3 = r9;
        0qQ.A0B(r9, 4);
        try {
            r8.A00 = 00R.A03("subtitles", 127);
            r8.A02(new C59123J7f(r3, r4, r11, z, z2), new Object[]{Boolean.valueOf(z)});
            r8.A00 = null;
        } catch (Throwable th) {
            r8.A00 = null;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A06(2WE r6, C246613et r7, C232722uK r8, 0sP r9) {
        AnonymousClass4Ki r2;
        0qQ.A0B(r7, 1);
        0qQ.A0B(r8, 2);
        try {
            r6.A00 = 00R.A03("audioIcon", 127);
            Boolean valueOf = Boolean.valueOf(r7.A0O);
            AnonymousClass3W1 r3 = r7.A0E;
            AnonymousClass4UR r0 = r3.A0s;
            if (r0 != null) {
                r2 = r0.A05;
                0qQ.A0A(r2);
            } else {
                r2 = AnonymousClass4Ki.STOPPED;
            }
            r6.A02(new AnonymousClass9MG(15, r9, r7, r8), new Object[]{valueOf, r2, Integer.valueOf(r3.A0O), r3.A0h});
            r6.A00 = null;
        } catch (Throwable th) {
            r6.A00 = null;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A07(2WE r8, C246993fb r9, C246773fD r10, AnonymousClass3W1 r11, 0sP r12) {
        C246773fD r7 = r10;
        0qQ.A0B(r10, 1);
        AnonymousClass3W1 r5 = r11;
        0qQ.A0B(r11, 3);
        try {
            r8.A00 = 00R.A03("watchAndBrowse", 127);
            r8.A02(new AnonymousClass9MT(15, r9, r5, r12, r7), new Object[]{r9});
            r8.A00 = null;
        } catch (Throwable th) {
            r8.A00 = null;
            throw th;
        }
    }

    public static final void A09(ImageUrl imageUrl, String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 2);
        if (imageUrl != null) {
            String url = imageUrl.getUrl();
            0qQ.A07(url);
            if (!00l.A0W(url)) {
                1OO A0J = 1NK.A00().A0J(imageUrl, str2);
                A0J.A0J = false;
                A0J.A08 = 002.A0R("main|", str);
                A0J.A01();
            }
        }
    }

    public static final void A0A(AnonymousClass4DU r11, C246953fX r12, C246613et r13, C246753fB r14, IgProgressImageView igProgressImageView, C62320sa r16, boolean z) {
        AnonymousClass4DU r4 = r11;
        0qQ.A0B(r11, 0);
        C246613et r0 = r13;
        0qQ.A0B(r13, 1);
        C246953fX r5 = r12;
        0qQ.A0B(r12, 2);
        C246753fB r6 = r14;
        0qQ.A0B(r14, 5);
        C62320sa r2 = r16;
        0qQ.A0B(r2, 6);
        C247783gu r3 = (C247783gu) r2.invoke();
        IgProgressImageView igProgressImageView2 = igProgressImageView;
        if (r3 == null) {
            C247803gw.A02(r13.A06, r4, r5, r6, r13.A0E, igProgressImageView2, r13.A0I, new C377259Ld(r13, 48), new C377259Ld(r13, 49), z);
            return;
        }
        igProgressImageView.setPostProcessor(r13.A06);
        igProgressImageView.setTag(R.id.key_media_id, r13.A0J);
        Bitmap bitmap = r3.A01;
        ImageUrl imageUrl = r3.A02;
        String str = r3.A03;
        igProgressImageView2.setTrackedBitmap(bitmap, imageUrl, str, r3.A00, r4);
        C246603es r32 = r0.A0A;
        0sP r22 = r32.A0M;
        String url = imageUrl.getUrl();
        0qQ.A07(url);
        0qQ.A0B(bitmap, 0);
        0qQ.A0B(str, 2);
        r22.invoke(new C240983Nk(bitmap, url, str, bitmap.getWidth(), bitmap.getHeight()));
        r32.A0N.invoke(igProgressImageView2);
        if (r0.A0L) {
            Context context = igProgressImageView2.getContext();
            0qQ.A07(context);
            if (C255983v2.A00(context)) {
                igProgressImageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A00(Context context, 2WE r9, C246613et r10, 0sP r11, boolean z) {
        try {
            r9.A00 = 00R.A03("primary_tag_indicator", 127);
            0sP r5 = r11;
            r9.A02(new AnonymousClass9MO(3, context, r5, r10, z), new Object[]{Boolean.valueOf(z)});
            r9.A00 = null;
        } catch (Throwable th) {
            r9.A00 = null;
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A08(2WE r4, CharSequence charSequence, 0sP r6) {
        0qQ.A0B(charSequence, 1);
        try {
            r4.A00 = 00R.A03("contentDescription", 127);
            r4.A02(new C377449Lw(18, charSequence, r6), new Object[]{charSequence});
            r4.A00 = null;
        } catch (Throwable th) {
            r4.A00 = null;
            throw th;
        }
    }

    public static final void A01(Context context, C246613et r8, IgProgressImageView igProgressImageView, AnonymousClass3V9 r10) {
        igProgressImageView.A06(R.id.listener_id_for_media_tag_indicator);
        C246603es r6 = r8.A0A;
        C262864Gh r3 = (C262864Gh) r6.A06.invoke();
        C262954Gq.A00((View.OnClickListener) r6.A0V.invoke(r10, true), r3, (C262744Fv) r6.A0a.invoke(context, (Object) null, true), (C262904Gl) r6.A0U.invoke(context, (Object) null), r10);
    }
}
