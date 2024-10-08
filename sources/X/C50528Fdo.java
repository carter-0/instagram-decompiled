package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Fdo  reason: case insensitive filesystem */
public final class C50528Fdo implements C13675Tek {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ ImageUrl A01;
    public final /* synthetic */ G78 A02;
    public final /* synthetic */ C46634DiE A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C50528Fdo(Fragment fragment, ImageUrl imageUrl, G78 g78, C46634DiE diE, String str, String str2, boolean z) {
        this.A00 = fragment;
        this.A05 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A06 = z;
        this.A03 = diE;
        this.A02 = g78;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0033: MOVE  (r1v2 com.instagram.base.activity.IgFragmentActivity) = (r1v0 com.instagram.base.activity.IgFragmentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final /* bridge */ /* synthetic */ void D5D(java.lang.Object r23) {
        /*
            r22 = this;
            r5 = r23
            X.FEn r5 = (X.C49914FEn) r5
            r0 = r22
            androidx.fragment.app.Fragment r8 = r0.A00
            java.lang.String r9 = r0.A05
            java.lang.String r11 = r0.A04
            com.instagram.common.typedurl.ImageUrl r7 = r0.A01
            boolean r4 = r0.A06
            X.DiE r3 = r0.A03
            X.G78 r6 = r0.A02
            r2 = 0
            int r0 = r11.length()
            if (r0 != 0) goto L_0x0021
            java.lang.String r0 = "Password is empty"
        L_0x001d:
            r6.D5C(r2, r0)
        L_0x0020:
            return
        L_0x0021:
            if (r5 == 0) goto L_0x0051
            androidx.fragment.app.FragmentActivity r1 = r8.getActivity()
            if (r1 == 0) goto L_0x0051
            r0 = 4
            X.FXb r2 = new X.FXb
            r2.<init>(r5, r0)
            boolean r0 = r1 instanceof com.instagram.base.activity.BaseFragmentActivity
            if (r0 == 0) goto L_0x003a
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            if (r1 == 0) goto L_0x003a
            r1.registerOnActivityResultListener(r2)
        L_0x003a:
            androidx.fragment.app.FragmentActivity r16 = r8.getActivity()
            X.Fdu r1 = new X.Fdu
            r1.<init>(r8, r2, r6)
            X.Sx9 r0 = r5.A00
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r7.getUrl()     // Catch:{ SecurityException -> 0x0020 }
            r10 = 0
            android.net.Uri r8 = X.0cp.A03(r0)     // Catch:{ SecurityException -> 0x0020 }
            goto L_0x0054
        L_0x0051:
            java.lang.String r0 = "SmartLock broker or Activity null"
            goto L_0x001d
        L_0x0054:
            com.google.android.gms.auth.api.credentials.Credential r7 = new com.google.android.gms.auth.api.credentials.Credential
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            X.Sx9 r0 = r5.A00
            r0.getClass()
            X.Fdn r15 = new X.Fdn
            r17 = r7
            r19 = r1
            r20 = r3
            r21 = r4
            r18 = r5
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r0.A00(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50528Fdo.D5D(java.lang.Object):void");
    }
}
