package X;

import android.content.Context;
import android.os.Looper;
import android.view.TextureView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7kt  reason: invalid class name and case insensitive filesystem */
public abstract class C340217kt {
    public static final C340247kw A00 = new C340237kv();
    public static final C340227ku A01 = new C340227ku(Looper.getMainLooper());

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, X.7l1] */
    public static C340297l2 A01(Context context, C340167ko r12, C340147km r13, UserSession userSession, String str, int i) {
        TextureView textureView = new TextureView(context);
        C340277l0 A002 = C3495180r.A00(context);
        ? obj = new Object();
        obj.A01 = textureView;
        textureView.setOpaque(false);
        return new C340297l2(textureView, A002, r12, r13, (C3496781h) null, obj, userSession, str, i, false);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, X.7l1] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r1 == false) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C340297l2 A02(android.view.ViewStub r12, X.C340167ko r13, X.C340147km r14, X.C3496781h r15, com.instagram.common.session.UserSession r16, java.lang.String r17, int r18, boolean r19) {
        /*
            r0 = 1
            r10 = r18
            r11 = r19
            if (r10 != r0) goto L_0x0010
            boolean r1 = X.C3495280s.A03(r11)
            r0 = 2131628107(0x7f0e104b, float:1.8883497E38)
            if (r1 != 0) goto L_0x0013
        L_0x0010:
            r0 = 2131628108(0x7f0e104c, float:1.88835E38)
        L_0x0013:
            r12.setLayoutResource(r0)
            android.view.View r2 = r12.inflate()
            X.AnonymousClass8LZ.A00(r2)
            android.content.Context r0 = r12.getContext()
            X.7l0 r3 = X.C3495180r.A00(r0)
            r0 = 2131429488(0x7f0b0870, float:1.848065E38)
            android.view.View r1 = r2.requireViewById(r0)
            X.7l1 r7 = new X.7l1
            r7.<init>()
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x0055
            android.view.TextureView r1 = (android.view.TextureView) r1
            r7.A01 = r1
            r0 = 0
            r1.setOpaque(r0)
        L_0x003d:
            X.7l2 r1 = new X.7l2
            r4 = r13
            r5 = r14
            r6 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0 = 2131432974(0x7f0b160e, float:1.848772E38)
            android.view.View r0 = r2.requireViewById(r0)
            com.instagram.camera.capture.IgCameraFocusView r0 = (com.instagram.camera.capture.IgCameraFocusView) r0
            r1.A05 = r0
            return r1
        L_0x0055:
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x005e
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            r7.A00 = r1
            goto L_0x003d
        L_0x005e:
            java.lang.String r1 = "CameraView must be a TextureView or SurfaceView!"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340217kt.A02(android.view.ViewStub, X.7ko, X.7km, X.81h, com.instagram.common.session.UserSession, java.lang.String, int, boolean):X.7l2");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        if (X.182.A06(r2, r8, r0) != false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0039, code lost:
        if (X.0JW.A05(r1, "com.facebook.stella_debug") == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C340307l3 A00(android.content.Context r7, com.instagram.common.session.UserSession r8, java.lang.String r9) {
        /*
            int r0 = r9.hashCode()
            r4 = r7
            switch(r0) {
                case 1008452164: goto L_0x00a6;
                case 1040300701: goto L_0x0096;
                case 1554394706: goto L_0x0086;
                default: goto L_0x0008;
            }
        L_0x0008:
            X.0Tu r3 = X.0Tu.A05
            r0 = 2342155162406028219(0x208101b6000f03bb, double:4.058932452962855E-152)
            boolean r0 = X.182.A06(r3, r8, r0)
            r2 = 0
            if (r0 == 0) goto L_0x005e
            X.0qQ.A0B(r8, r2)
            r0 = 36330836300350253(0x8112b40013432d, double:3.03910539665247E-306)
            boolean r0 = X.182.A06(r3, r8, r0)
            if (r0 == 0) goto L_0x0046
            X.0qQ.A0B(r7, r2)
            java.lang.String r2 = "com.facebook.stella_debug"
            java.lang.String r0 = "com.facebook.stella"
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            boolean r0 = X.0JW.A05(r1, r0)
            if (r0 != 0) goto L_0x003b
            boolean r0 = X.0JW.A05(r1, r2)
            if (r0 == 0) goto L_0x005e
        L_0x003b:
            r1 = 0
            r5 = 3
            r0 = r7
            r2 = r1
            r3 = r8
            r4 = r9
            X.7l2 r3 = A01(r0, r1, r2, r3, r4, r5)
        L_0x0045:
            return r3
        L_0x0046:
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            if (r1 == 0) goto L_0x005e
            java.lang.String r0 = "com.facebook.stella"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x0055 }
            if (r0 == 0) goto L_0x0055
            goto L_0x003b
        L_0x0055:
            java.lang.String r0 = "com.facebook.stella_debug"
            android.content.pm.PackageInfo r0 = r1.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x005e }
            if (r0 == 0) goto L_0x005e
            goto L_0x003b
        L_0x005e:
            X.7l0 r6 = X.C3495180r.A00(r7)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            X.7rD r5 = X.C343977r7.A00(r8, r9, r0)
            X.7ku r0 = A01
            X.7mo r7 = new X.7mo
            r7.<init>(r5, r0)
            X.AXI r3 = new X.AXI
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.Vru r0 = X.C18447Vru.A02
            if (r0 == 0) goto L_0x0045
            X.7kw r1 = A00
            X.7lX r0 = r3.A06
            r0.A8q(r1)
            return r3
        L_0x0086:
            java.lang.String r0 = "live_with_guest"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312153192203194(0x8101b6000d03ba, double:3.027290123829432E-306)
            goto L_0x00b5
        L_0x0096:
            java.lang.String r0 = "live_with_join_flow"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312153192137657(0x8101b6000c03b9, double:3.027290123787986E-306)
            goto L_0x00b5
        L_0x00a6:
            java.lang.String r0 = "live_base"
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0008
            X.0Tu r2 = X.0Tu.A05
            r0 = 36312153191941047(0x8101b6000903b7, double:3.027290123663649E-306)
        L_0x00b5:
            boolean r0 = X.182.A06(r2, r8, r0)
            if (r0 != 0) goto L_0x003b
            goto L_0x0008
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340217kt.A00(android.content.Context, com.instagram.common.session.UserSession, java.lang.String):X.7l3");
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r7v0, types: [java.lang.Throwable, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(java.lang.Throwable r7) {
        /*
            java.lang.Throwable r6 = r7.getCause()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r4 = 0
        L_0x000a:
            r3 = r7
            r7 = r6
            if (r6 == 0) goto L_0x004e
            boolean r0 = X.2Ob.A00(r6, r3)
            if (r0 != 0) goto L_0x004e
            java.lang.StackTraceElement[] r2 = r6.getStackTrace()
            java.lang.String r0 = "\nLevel ["
            r5.append(r0)
            r5.append(r4)
            java.lang.String r0 = "]"
            r5.append(r0)
            java.lang.String r1 = "\n"
            r5.append(r1)
            java.lang.Throwable r0 = r3.getCause()
            r5.append(r0)
            r5.append(r1)
            java.lang.String r0 = android.text.TextUtils.join(r1, r2)
            r5.append(r0)
            java.lang.String r0 = "\n\n--------------------------------\n"
            r5.append(r0)
            int r4 = r4 + 1
            java.lang.Throwable r6 = r6.getCause()
            r0 = 5
            if (r4 != r0) goto L_0x000a
            java.lang.String r0 = "\n Warning: Reached maximum stack levels!"
            r5.append(r0)
        L_0x004e:
            java.lang.String r0 = r5.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C340217kt.A03(java.lang.Exception):java.lang.String");
    }
}
