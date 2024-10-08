package X;

import android.net.Uri;
import com.instagram.brandedcontent.repository.BrandedContentApi;
import com.instagram.bugreporter.BugReportComposerFragment;

public final class MHC extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHC(Uri uri, BugReportComposerFragment bugReportComposerFragment, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A03 = 44;
        this.A02 = bugReportComposerFragment;
        this.A01 = uri;
        this.A00 = i;
    }

    public static GQC A00(Object obj, MHC mhc, int i, int i2, int i3) {
        GQC gqc = new GQC(C52518GVv.A03, 2SP.A01.A06(i, i2), 0);
        mhc.A01 = obj;
        mhc.A00 = i3;
        return gqc;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.MHC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.MHC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.MHC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.MHC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4, types: [X.MHC, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5, types: [X.MHC, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        return new X.MHC(r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        return new X.MHC(r2, r1, r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0133, code lost:
        r3 = new X.MHC(r1, r6, r0);
        r3.A01 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0171, code lost:
        return new X.MHC(r1, r2, r6, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass4D7 create(java.lang.Object r5, X.AnonymousClass4D7 r6) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0041;
                case 1: goto L_0x0046;
                case 2: goto L_0x004b;
                case 3: goto L_0x0050;
                case 4: goto L_0x0011;
                case 5: goto L_0x0055;
                case 6: goto L_0x005a;
                case 7: goto L_0x005f;
                case 8: goto L_0x0064;
                case 9: goto L_0x006a;
                case 10: goto L_0x0017;
                case 11: goto L_0x0070;
                case 12: goto L_0x007c;
                case 13: goto L_0x001e;
                case 14: goto L_0x0084;
                case 15: goto L_0x008c;
                case 16: goto L_0x0094;
                case 17: goto L_0x0025;
                case 18: goto L_0x009c;
                case 19: goto L_0x00a1;
                case 20: goto L_0x00a6;
                case 21: goto L_0x00b0;
                case 22: goto L_0x00b8;
                case 23: goto L_0x002c;
                case 24: goto L_0x00c0;
                case 25: goto L_0x00c8;
                case 26: goto L_0x00d0;
                case 27: goto L_0x00d8;
                case 28: goto L_0x00e0;
                case 29: goto L_0x00e5;
                case 30: goto L_0x00ed;
                case 31: goto L_0x00f4;
                case 32: goto L_0x00fb;
                case 33: goto L_0x0100;
                case 34: goto L_0x0107;
                case 35: goto L_0x010e;
                case 36: goto L_0x0115;
                case 37: goto L_0x011a;
                case 38: goto L_0x0121;
                case 39: goto L_0x0128;
                case 40: goto L_0x0033;
                case 41: goto L_0x012f;
                case 42: goto L_0x013b;
                case 43: goto L_0x0142;
                case 44: goto L_0x0149;
                case 45: goto L_0x003a;
                case 46: goto L_0x0159;
                case 47: goto L_0x015f;
                case 48: goto L_0x0166;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 49
        L_0x000b:
            X.MHC r3 = new X.MHC
            r3.<init>((java.lang.Object) r2, (java.lang.Object) r1, (X.AnonymousClass4D7) r6, (int) r0)
            return r3
        L_0x0011:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 4
            goto L_0x000b
        L_0x0017:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 10
            goto L_0x000b
        L_0x001e:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 13
            goto L_0x000b
        L_0x0025:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 17
            goto L_0x000b
        L_0x002c:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 23
            goto L_0x000b
        L_0x0033:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 40
            goto L_0x000b
        L_0x003a:
            java.lang.Object r2 = r4.A01
            java.lang.Object r1 = r4.A02
            r0 = 45
            goto L_0x000b
        L_0x0041:
            java.lang.Object r1 = r4.A02
            r0 = 0
            goto L_0x0133
        L_0x0046:
            java.lang.Object r1 = r4.A02
            r0 = 1
            goto L_0x0133
        L_0x004b:
            java.lang.Object r1 = r4.A02
            r0 = 2
            goto L_0x0133
        L_0x0050:
            java.lang.Object r1 = r4.A02
            r0 = 3
            goto L_0x0133
        L_0x0055:
            java.lang.Object r1 = r4.A02
            r0 = 5
            goto L_0x0133
        L_0x005a:
            java.lang.Object r1 = r4.A02
            r0 = 6
            goto L_0x0133
        L_0x005f:
            java.lang.Object r1 = r4.A02
            r0 = 7
            goto L_0x0133
        L_0x0064:
            java.lang.Object r1 = r4.A02
            r0 = 8
            goto L_0x0133
        L_0x006a:
            java.lang.Object r1 = r4.A02
            r0 = 9
            goto L_0x0133
        L_0x0070:
            java.lang.Object r0 = r4.A01
            X.0sP r0 = (X.0sP) r0
            X.MHC r3 = new X.MHC
            r3.<init>(r6, r0)
            r3.A02 = r5
            return r3
        L_0x007c:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 12
            goto L_0x016c
        L_0x0084:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 14
            goto L_0x016c
        L_0x008c:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 15
            goto L_0x016c
        L_0x0094:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 16
            goto L_0x016c
        L_0x009c:
            java.lang.Object r1 = r4.A02
            r0 = 18
            goto L_0x00aa
        L_0x00a1:
            java.lang.Object r1 = r4.A02
            r0 = 19
            goto L_0x00aa
        L_0x00a6:
            java.lang.Object r1 = r4.A02
            r0 = 20
        L_0x00aa:
            X.MHC r3 = new X.MHC
            r3.<init>(r1, r6, r0)
            return r3
        L_0x00b0:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 21
            goto L_0x016c
        L_0x00b8:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 22
            goto L_0x016c
        L_0x00c0:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 24
            goto L_0x016c
        L_0x00c8:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 25
            goto L_0x016c
        L_0x00d0:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 26
            goto L_0x016c
        L_0x00d8:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 27
            goto L_0x016c
        L_0x00e0:
            java.lang.Object r1 = r4.A02
            r0 = 28
            goto L_0x0133
        L_0x00e5:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 29
            goto L_0x016c
        L_0x00ed:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 30
            goto L_0x016c
        L_0x00f4:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 31
            goto L_0x016c
        L_0x00fb:
            java.lang.Object r1 = r4.A02
            r0 = 32
            goto L_0x0133
        L_0x0100:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 33
            goto L_0x016c
        L_0x0107:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 34
            goto L_0x016c
        L_0x010e:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 35
            goto L_0x016c
        L_0x0115:
            java.lang.Object r1 = r4.A02
            r0 = 36
            goto L_0x0133
        L_0x011a:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 37
            goto L_0x016c
        L_0x0121:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 38
            goto L_0x016c
        L_0x0128:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 39
            goto L_0x016c
        L_0x012f:
            java.lang.Object r1 = r4.A02
            r0 = 41
        L_0x0133:
            X.MHC r3 = new X.MHC
            r3.<init>(r1, r6, r0)
            r3.A01 = r5
            return r3
        L_0x013b:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 42
            goto L_0x016c
        L_0x0142:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 43
            goto L_0x016c
        L_0x0149:
            java.lang.Object r2 = r4.A02
            com.instagram.bugreporter.BugReportComposerFragment r2 = (com.instagram.bugreporter.BugReportComposerFragment) r2
            java.lang.Object r1 = r4.A01
            android.net.Uri r1 = (android.net.Uri) r1
            int r0 = r4.A00
            X.MHC r3 = new X.MHC
            r3.<init>((android.net.Uri) r1, (com.instagram.bugreporter.BugReportComposerFragment) r2, (X.AnonymousClass4D7) r6, (int) r0)
            return r3
        L_0x0159:
            r2 = 0
            java.lang.Object r1 = r4.A01
            r0 = 46
            goto L_0x016c
        L_0x015f:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 47
            goto L_0x016c
        L_0x0166:
            java.lang.Object r2 = r4.A02
            java.lang.Object r1 = r4.A01
            r0 = 48
        L_0x016c:
            X.MHC r3 = new X.MHC
            r3.<init>((java.lang.Object) r1, (java.lang.Object) r2, (X.AnonymousClass4D7) r6, (int) r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHC.create(java.lang.Object, X.4D7):X.4D7");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v43, resolved type: X.K8a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v77, resolved type: X.K8b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v98, resolved type: X.K8a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v99, resolved type: X.K8a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v100, resolved type: X.K8a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v101, resolved type: X.K8a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v102, resolved type: X.K8a} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:494:0x0a84 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:498:0x0aa2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:538:0x0b75 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            int r0 = r15.A03
            switch(r0) {
                case 0: goto L_0x0f02;
                case 1: goto L_0x0ecb;
                case 2: goto L_0x0e94;
                case 3: goto L_0x0e5d;
                case 4: goto L_0x0d6f;
                case 5: goto L_0x0d3b;
                case 6: goto L_0x0d04;
                case 7: goto L_0x0cd3;
                case 8: goto L_0x0ca0;
                case 9: goto L_0x0c6f;
                case 10: goto L_0x0c2d;
                case 11: goto L_0x0c05;
                case 12: goto L_0x0bc2;
                case 13: goto L_0x0b8f;
                case 14: goto L_0x0b23;
                case 15: goto L_0x0afc;
                case 16: goto L_0x0ad5;
                case 17: goto L_0x0aae;
                case 18: goto L_0x0a5b;
                case 19: goto L_0x0a08;
                case 20: goto L_0x09b5;
                case 21: goto L_0x0990;
                case 22: goto L_0x0957;
                case 23: goto L_0x090b;
                case 24: goto L_0x08dc;
                case 25: goto L_0x08a9;
                case 26: goto L_0x0dc7;
                case 27: goto L_0x0884;
                case 28: goto L_0x079b;
                case 29: goto L_0x075e;
                case 30: goto L_0x06e3;
                case 31: goto L_0x0677;
                case 32: goto L_0x055e;
                case 33: goto L_0x04f8;
                case 34: goto L_0x048d;
                case 35: goto L_0x040d;
                case 36: goto L_0x0346;
                case 37: goto L_0x02a5;
                case 38: goto L_0x0216;
                case 39: goto L_0x0189;
                case 40: goto L_0x0162;
                case 41: goto L_0x012c;
                case 42: goto L_0x0109;
                case 43: goto L_0x00e8;
                case 44: goto L_0x00d0;
                case 45: goto L_0x00af;
                case 46: goto L_0x0075;
                case 47: goto L_0x003c;
                case 48: goto L_0x0015;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0da5
            if (r0 == r4) goto L_0x0dbf
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0015:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            if (r0 == 0) goto L_0x0023
            if (r0 == r6) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0023:
            X.0eS.A00(r1)
            java.lang.Object r5 = r15.A02
            androidx.fragment.app.Fragment r5 = (androidx.fragment.app.Fragment) r5
            java.lang.Object r4 = r15.A01
            r3 = 0
            r1 = 47
            X.MHC r0 = new X.MHC
            r0.<init>((java.lang.Object) r4, (java.lang.Object) r5, (X.AnonymousClass4D7) r3, (int) r1)
            r15.A00 = r6
            java.lang.Object r0 = X.AnonymousClass3DM.A02(r5, r15, r0)
            goto L_0x0da2
        L_0x003c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 == r6) goto L_0x006d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x004a:
            X.0eS.A00(r1)
            java.lang.Object r5 = r15.A02
            X.K5y r5 = (X.C61403K5y) r5
            X.0eM r0 = r5.A0B
            java.lang.Object r0 = r0.getValue()
            X.Jiq r0 = (X.C60293Jiq) r0
            X.0Ud r4 = r0.A01
            java.lang.Object r3 = r15.A01
            r1 = 32
            X.MCn r0 = new X.MCn
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r5)
            r15.A00 = r6
            java.lang.Object r0 = r4.collect(r0, r15)
            if (r0 != r2) goto L_0x0070
            return r2
        L_0x006d:
            X.0eS.A00(r1)
        L_0x0070:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0075:
            int r3 = r15.A00
            r2 = 2
            r0 = 1
            if (r3 == 0) goto L_0x00a5
            if (r3 == r0) goto L_0x009b
            if (r3 != r2) goto L_0x0096
            X.0eS.A00(r1)
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = "autoLoadEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x008d:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0df8
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0096:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x009b:
            X.0eS.A00(r1)
            java.lang.String r0 = "repository"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00a5:
            X.0eS.A00(r1)
            java.lang.String r0 = "repository"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x00af:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x00bd
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00bd:
            X.0eS.A00(r1)
            java.lang.Object r1 = r15.A01
            com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1 r1 = (com.instagram.bugreporter.BugReportComposerFragment$onClickScreenshotThumbnail$1) r1
            java.lang.Object r0 = r15.A02
            android.net.Uri r0 = (android.net.Uri) r0
            r15.A00 = r3
            java.lang.Object r0 = r1.A00(r0, r15)
            goto L_0x0da2
        L_0x00d0:
            X.0eS.A00(r1)
            java.lang.Object r4 = r15.A02
            com.instagram.bugreporter.BugReportComposerFragment r4 = (com.instagram.bugreporter.BugReportComposerFragment) r4
            android.content.Context r3 = r4.requireContext()
            java.lang.Object r2 = r15.A01
            android.net.Uri r2 = (android.net.Uri) r2
            int r1 = r15.A00
            com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource r0 = com.meta.flytrap.attachment.model.BugReportAttachmentMediaSource.ANNOTATION
            com.meta.flytrap.attachment.model.BugReportAttachment r2 = com.instagram.bugreporter.BugReportComposerFragment.A01(r3, r2, r4, r0, r1)
            return r2
        L_0x00e8:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x00f6
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00f6:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.Jj4 r0 = (X.C60305Jj4) r0
            X.3ju r1 = r0.A0C
            java.lang.Object r0 = r15.A01
            r15.A00 = r3
            java.lang.Object r0 = r1.ELH(r0, r15)
            goto L_0x0da2
        L_0x0109:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x0117
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0117:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.Jj4 r0 = (X.C60305Jj4) r0
            com.instagram.brandedcontent.repository.BrandedContentSettingsRepository r1 = r0.A05
            java.lang.Object r0 = r15.A01
            java.util.List r0 = (java.util.List) r0
            r15.A00 = r3
            java.lang.Object r0 = r1.A01(r0, r15)
            goto L_0x0da2
        L_0x012c:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x013a
            if (r0 == r4) goto L_0x015a
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x013a:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r3 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r3
            X.0eM r0 = r3.A03
            java.lang.Object r0 = r0.getValue()
            com.instagram.brandedcontent.project.BrandedContentProjectRepository r0 = (com.instagram.brandedcontent.project.BrandedContentProjectRepository) r0
            X.0Ud r1 = r0.A03
            r0 = 19
            X.MCj r0 = X.C66119MCj.A00(r3, r0)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            if (r0 != r2) goto L_0x015d
            return r2
        L_0x015a:
            X.0eS.A00(r1)
        L_0x015d:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0162:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0170
            if (r0 == r5) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0170:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A01
            X.Jj4 r0 = (X.C60305Jj4) r0
            X.0r6 r4 = r0.A0D
            java.lang.Object r3 = r15.A02
            r1 = 7
            X.FxQ r0 = new X.FxQ
            r0.<init>(r3, r1)
            r15.A00 = r5
            java.lang.Object r0 = r4.collect(r0, r15)
            goto L_0x0da2
        L_0x0189:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r14 = 1
            if (r0 == 0) goto L_0x01e6
            if (r0 != r14) goto L_0x0211
            X.0eS.A00(r1)
        L_0x0195:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r0 = r15.A02
            X.K83 r0 = (X.K83) r0
            java.lang.Object r3 = r15.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0208
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.MWZ r2 = (X.MWZ) r2
            java.lang.String r1 = r3.getId()
            r8 = 0
            X.K83.A00(r0, r8, r1)
            X.4Cl r1 = r3.A03
            r1.EPZ(r8)
            X.Jxe r2 = (X.C61128Jxe) r2
            java.util.List r1 = r2.A01
            r0.A01 = r1
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r4 = r1.iterator()
        L_0x01c4:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0461
            com.instagram.user.model.User r10 = X.JTP.A0d(r4)
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            r13 = 0
            java.lang.Object[] r2 = new java.lang.Object[r13]
            r1 = 2131953089(0x7f1305c1, float:1.954264E38)
            X.GKO r7 = X.DbS.A0Q(r2, r1)
            r12 = 1784(0x6f8, float:2.5E-42)
            X.N5z r6 = new X.N5z
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r5.add(r6)
            goto L_0x01c4
        L_0x01e6:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.K83 r0 = (X.K83) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r3.<init>(r0)
            r1 = 0
            java.lang.Object r0 = r15.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            r15.A00 = r14
            java.lang.Object r1 = r3.A03(r1, r0, r15)
            if (r1 != r2) goto L_0x0195
            return r2
        L_0x0208:
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0468
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0211:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0216:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r13 = 1
            if (r0 == 0) goto L_0x0262
            if (r0 != r13) goto L_0x02a0
            X.0eS.A00(r1)
        L_0x0222:
            java.lang.Object r0 = r15.A02
            X.K83 r0 = (X.K83) r0
            java.lang.Object r3 = r15.A01
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0283
            java.util.List r1 = r0.A01
            java.util.ArrayList r1 = X.00k.A0U(r1)
            r1.remove(r3)
            r0.A01 = r1
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x023f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x028c
            com.instagram.user.model.User r9 = X.JTP.A0d(r3)
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            r12 = 0
            java.lang.Object[] r2 = new java.lang.Object[r12]
            r1 = 2131969279(0x7f1344ff, float:1.9575476E38)
            X.GKO r6 = X.DbS.A0Q(r2, r1)
            r7 = 0
            r11 = 1784(0x6f8, float:2.5E-42)
            X.N5z r5 = new X.N5z
            r8 = r7
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r4.add(r5)
            goto L_0x023f
        L_0x0262:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.K83 r0 = (X.K83) r0
            X.0eM r0 = r0.A02
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r1.<init>(r0)
            java.lang.Object r0 = r15.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            r15.A00 = r13
            java.lang.Object r1 = r1.A05(r0, r15)
            if (r1 != r2) goto L_0x0222
            return r2
        L_0x0283:
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0293
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x028c:
            r0.A0B(r4)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0293:
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0df8
            boolean r1 = r1 instanceof X.C297815sO
            if (r1 != 0) goto L_0x047d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x02a5:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            if (r0 == 0) goto L_0x02f3
            if (r0 != r6) goto L_0x0341
            X.0eS.A00(r1)
        L_0x02b1:
            java.lang.Object r3 = r15.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r0 = r15.A02
            X.K8b r0 = (X.C61447K8b) r0
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x02ea
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r2 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_PENDING
            X.4Cl r1 = r3.A03
            r1.EOm(r2)
            java.util.List r1 = r0.A01
            r1.add(r3)
            X.JTU.A19(r0)
            android.content.Context r4 = r0.requireContext()
            r3 = 0
            r2 = 2131973117(0x7f1353fd, float:1.958326E38)
            r1 = 0
            android.widget.Toast r1 = X.C59689JTv.A01(r4, r3, r2, r1)
            X.3Ih r1 = X.C41845B3m.A0d(r1)
        L_0x02dd:
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0df8
            boolean r1 = r1 instanceof X.C297815sO
            if (r1 != 0) goto L_0x047d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02ea:
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 != 0) goto L_0x02dd
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x02f3:
            X.0eS.A00(r1)
            java.lang.Object r8 = r15.A02
            X.UZ3 r8 = (X.UZ3) r8
            com.instagram.common.session.UserSession r1 = r8.A06()
            com.instagram.common.session.UserSession r0 = r8.A06()
            java.lang.String r7 = r0.A06
            java.lang.Object r5 = r15.A01
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r4 = r5.getId()
            X.0wc r1 = X.DbX.A0O(r8, r1)
            java.lang.String r0 = "ig_branded_content_brand_approval_request_sent"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.Long r1 = X.DbV.A0q(r7)
            java.lang.String r0 = "creator_ig_id"
            r3.A9F(r0, r1)
            java.lang.Long r1 = X.DbV.A0q(r4)
            java.lang.String r0 = "sponsor_ig_id"
            r3.A9F(r0, r1)
            r3.Cgf()
            com.instagram.common.session.UserSession r0 = r8.A06()
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = new com.instagram.brandedcontent.repository.BrandedContentApi
            r1.<init>(r0)
            java.lang.String r0 = r5.getId()
            r15.A00 = r6
            java.lang.Object r1 = r1.A07(r0, r15)
            if (r1 != r2) goto L_0x02b1
            return r2
        L_0x0341:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0346:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 2
            r9 = 1
            r5 = 0
            if (r0 == 0) goto L_0x038a
            if (r0 == r9) goto L_0x03b6
            if (r0 != r6) goto L_0x0408
            X.0eS.A00(r1)
        L_0x0356:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8b r3 = (X.C61447K8b) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x03ff
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K15 r0 = (X.K15) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0869
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r3.A00 = r0
            java.util.Iterator r2 = r0.iterator()
        L_0x0378:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x086d
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            X.4Cl r0 = r0.A03
            r0.EOm(r1)
            goto L_0x0378
        L_0x038a:
            X.0eS.A00(r1)
            java.lang.Object r8 = r15.A01
            X.4Cq r8 = (X.C262224Cq) r8
            java.lang.Object r7 = r15.A02
            r1 = 29
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r5, (int) r1)
            X.19B r4 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r4, r0, r8)
            r1 = 28
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r7, (X.AnonymousClass4D7) r5, (int) r1)
            X.2Q8 r4 = X.1Eo.A02(r4, r0, r8)
            r15.A01 = r4
            r15.A00 = r9
            java.lang.Object r1 = r3.A0E(r15)
            if (r1 != r2) goto L_0x03bd
            return r2
        L_0x03b6:
            java.lang.Object r4 = r15.A01
            X.2Q9 r4 = (X.AnonymousClass2Q9) r4
            X.0eS.A00(r1)
        L_0x03bd:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8b r3 = (X.C61447K8b) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x03eb
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K1J r0 = (X.K1J) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r3.A01 = r0
            java.util.Iterator r3 = r0.iterator()
        L_0x03d9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03f4
            com.instagram.user.model.User r0 = X.DbT.A0k(r3)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_PENDING
            X.4Cl r0 = r0.A03
            r0.EOm(r1)
            goto L_0x03d9
        L_0x03eb:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x03f4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03f4:
            r15.A01 = r5
            r15.A00 = r6
            java.lang.Object r1 = X.JTO.A10(r4, r15)
            if (r1 != r2) goto L_0x0356
            return r2
        L_0x03ff:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x086d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0408:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x040d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x044e
            if (r0 != r3) goto L_0x0488
            X.0eS.A00(r1)
        L_0x0419:
            java.lang.Object r3 = r15.A01
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3
            java.lang.Object r0 = r15.A02
            X.K8b r0 = (X.C61447K8b) r0
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x0445
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r2 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_CANCELLED_BY_CREATOR
            X.4Cl r1 = r3.A03
            r1.EOm(r2)
            java.util.List r1 = r0.A01
            r1.remove(r3)
            X.JTU.A19(r0)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0438:
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0df8
            boolean r1 = r1 instanceof X.C297815sO
            if (r1 != 0) goto L_0x047d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0445:
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 != 0) goto L_0x0438
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x044e:
            com.instagram.brandedcontent.repository.BrandedContentApi r1 = A01(r1, r15)
            java.lang.Object r0 = r15.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            r15.A00 = r3
            java.lang.Object r1 = r1.A05(r0, r15)
            if (r1 != r2) goto L_0x0419
            return r2
        L_0x0461:
            r0.A0B(r5)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0468:
            boolean r2 = r1 instanceof X.C239793Ih
            if (r2 != 0) goto L_0x0df8
            boolean r2 = r1 instanceof X.C297815sO
            if (r2 == 0) goto L_0x0483
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r2 = r1.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.String r1 = r3.getId()
            X.K83.A00(r0, r2, r1)
        L_0x047d:
            android.content.Context r1 = r0.requireContext()
            goto L_0x074d
        L_0x0483:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0488:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x048d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x04df
            if (r0 != r4) goto L_0x04f3
            X.0eS.A00(r1)
        L_0x0499:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r4 = r15.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x04d6
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.MWZ r2 = (X.MWZ) r2
            r1 = 0
            X.4Cl r0 = r4.A03
            r0.EPZ(r1)
            X.Jxe r2 = (X.C61128Jxe) r2
            java.util.List r1 = r2.A01
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.user.model.User>"
            X.0qQ.A0C(r1, r0)
            java.util.List r0 = X.0u4.A01(r1)
            r3.A01 = r0
            X.JTU.A19(r3)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x04c9:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0df8
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0749
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04d6:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x04c9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x04df:
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = A01(r1, r15)
            r1 = 0
            java.lang.Object r0 = r15.A01
            java.lang.String r0 = X.DbS.A0q(r0)
            r15.A00 = r4
            java.lang.Object r1 = r3.A03(r1, r0, r15)
            if (r1 != r2) goto L_0x0499
            return r2
        L_0x04f3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x04f8:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0544
            if (r0 != r4) goto L_0x0559
            X.0eS.A00(r1)
        L_0x0504:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            java.lang.Object r2 = r15.A01
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x053b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K16 r0 = (X.K16) r0
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.A00
            if (r1 == 0) goto L_0x0755
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_REJECTED_BY_BRAND
            if (r1 == r0) goto L_0x0522
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_DECLINED
            if (r1 != r0) goto L_0x052a
        L_0x0522:
            java.util.List r0 = r3.A02
            r0.remove(r2)
            X.JTU.A19(r3)
        L_0x052a:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x052e:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0df8
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0749
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x053b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x052e
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0544:
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = A01(r1, r15)
            java.lang.Object r0 = r15.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_REJECTED_BY_BRAND
            r15.A00 = r4
            java.lang.Object r1 = r3.A00(r0, r1, r15)
            if (r1 != r2) goto L_0x0504
            return r2
        L_0x0559:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x055e:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.user.model.User>"
            r6 = 0
            r5 = 2
            r10 = 1
            if (r0 == 0) goto L_0x05aa
            if (r0 == r10) goto L_0x05da
            if (r0 != r5) goto L_0x066d
            X.0eS.A00(r1)
        L_0x0570:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            boolean r0 = r1 instanceof X.C239793Ih
            r4 = 0
            if (r0 == 0) goto L_0x0621
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r1 = r1.A00
            X.K1J r1 = (X.K1J) r1
            java.util.List r0 = r1.A01
            X.0qQ.A0C(r0, r7)
            java.util.List r0 = X.0u4.A01(r0)
            r3.A02 = r0
            java.lang.String r0 = r1.A00
            r3.A00 = r0
            com.instagram.common.session.UserSession r6 = r3.A06()
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            java.util.List r0 = r3.A02
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x05a0:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x062a
            X.DbY.A1W(r2, r1)
            goto L_0x05a0
        L_0x05aa:
            X.0eS.A00(r1)
            java.lang.Object r9 = r15.A01
            X.4Cq r9 = (X.C262224Cq) r9
            java.lang.Object r8 = r15.A02
            X.K8c r8 = (X.C61448K8c) r8
            r8.A03 = r10
            r1 = 26
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r1)
            X.19B r4 = X.19B.A00
            X.2Q8 r3 = X.1Eo.A02(r4, r0, r9)
            r1 = 27
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r6, (int) r1)
            X.2Q8 r4 = X.1Eo.A02(r4, r0, r9)
            r15.A01 = r4
            r15.A00 = r10
            java.lang.Object r1 = r3.A0E(r15)
            if (r1 != r2) goto L_0x05e1
            return r2
        L_0x05da:
            java.lang.Object r4 = r15.A01
            X.2Q9 r4 = (X.AnonymousClass2Q9) r4
            X.0eS.A00(r1)
        L_0x05e1:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0618
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.MWZ r0 = (X.MWZ) r0
            X.Jxe r0 = (X.C61128Jxe) r0
            java.util.List r0 = r0.A01
            X.0qQ.A0C(r0, r7)
            java.util.List r0 = X.0u4.A01(r0)
            r3.A01 = r0
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0602:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x060d
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0672
            X.DbX.A1H(r3)
        L_0x060d:
            r15.A01 = r6
            r15.A00 = r5
            java.lang.Object r1 = X.JTO.A10(r4, r15)
            if (r1 != r2) goto L_0x0570
            return r2
        L_0x0618:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0602
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0621:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0647
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x062a:
            java.lang.String r1 = r2.toString()
            java.lang.String r0 = "creator_ids"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r1 = r3.A00
            if (r1 != 0) goto L_0x063a
            java.lang.String r1 = ""
        L_0x063a:
            java.lang.String r0 = "cursor"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r0, r1, r2)
            X.JVF.A05(r3, r6, r5, r0)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x0647:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0652
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0668
            X.DbX.A1H(r3)
        L_0x0652:
            r3.A03 = r4
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A0A()
            X.JTO.A1X(r0)
            X.Trf r0 = r3.A09()
            r0.A04()
            X.UdQ r0 = r3.A08()
            goto L_0x087f
        L_0x0668:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x066d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0672:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0677:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x06ca
            if (r0 != r4) goto L_0x06de
            X.0eS.A00(r1)
        L_0x0683:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r4 = r15.A01
            com.instagram.user.model.User r4 = (com.instagram.user.model.User) r4
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x06c1
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            X.MWZ r2 = (X.MWZ) r2
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            X.4Cl r0 = r4.A03
            r0.EPZ(r1)
            X.Jxe r2 = (X.C61128Jxe) r2
            java.util.List r1 = r2.A01
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.MutableList<com.instagram.user.model.User>"
            X.0qQ.A0C(r1, r0)
            java.util.List r0 = X.0u4.A01(r1)
            r3.A01 = r0
            X.JTU.A19(r3)
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x06b4:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0df8
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0749
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x06c1:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x06b4
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x06ca:
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = A01(r1, r15)
            java.lang.Object r0 = r15.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            r0 = 0
            r15.A00 = r4
            java.lang.Object r1 = r3.A03(r1, r0, r15)
            if (r1 != r2) goto L_0x0683
            return r2
        L_0x06de:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x06e3:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0734
            if (r0 != r4) goto L_0x0759
            X.0eS.A00(r1)
        L_0x06ef:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8c r3 = (X.C61448K8c) r3
            java.lang.Object r2 = r15.A01
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x072b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K16 r0 = (X.K16) r0
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = r0.A00
            if (r1 == 0) goto L_0x0755
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            if (r1 != r0) goto L_0x0727
            java.util.List r0 = r3.A02
            r0.remove(r2)
            java.util.List r0 = r3.A01
            r0.add(r2)
            X.JTU.A19(r3)
        L_0x0716:
            X.3Ih r1 = X.C51967G9n.A0d()
        L_0x071a:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0df8
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0749
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0727:
            X.DbX.A1H(r3)
            goto L_0x0716
        L_0x072b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x071a
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0734:
            com.instagram.brandedcontent.repository.BrandedContentApi r3 = A01(r1, r15)
            java.lang.Object r0 = r15.A01
            java.lang.String r1 = X.DbS.A0q(r0)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r0 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            r15.A00 = r4
            java.lang.Object r1 = r3.A00(r0, r1, r15)
            if (r1 != r2) goto L_0x06ef
            return r2
        L_0x0749:
            android.content.Context r1 = r3.requireContext()
        L_0x074d:
            r0 = 2131972232(0x7f135088, float:1.9581466E38)
            X.C59689JTv.A07(r1, r0)
            goto L_0x0df8
        L_0x0755:
            java.lang.String r0 = "approvalRequestStatus"
            goto L_0x0e0b
        L_0x0759:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x075e:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x076c
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x076c:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            X.K8V r3 = (X.K8V) r3
            java.lang.Object r1 = r15.A01
            android.view.View r1 = (android.view.View) r1
            X.0qQ.A0A(r1)
            r0 = 2131432000(0x7f0b1240, float:1.8485745E38)
            X.JTS.A0y(r1, r0)
            r0 = 2131435641(0x7f0b2079, float:1.849313E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r1, r0)
            r0 = 0
            r1.setVisibility(r0)
            X.0eM r0 = r3.A04
            java.lang.Object r0 = r0.getValue()
            com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel r0 = (com.instagram.brandedcontent.disclosure.BrandedContentDisclosureMenuViewModel) r0
            r15.A00 = r4
            java.lang.Object r0 = r0.A09(r15)
            goto L_0x0da2
        L_0x079b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L_0x07d9
            if (r0 == r7) goto L_0x07f8
            if (r0 != r5) goto L_0x0864
            X.0eS.A00(r1)
        L_0x07ab:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8a r3 = (X.C61446K8a) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x085b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K1J r0 = (X.K1J) r0
            java.util.List r0 = r0.A01
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r3.A06 = r0
            java.util.Iterator r2 = r0.iterator()
        L_0x07c7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x086d
            com.instagram.user.model.User r0 = X.DbT.A0k(r2)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_PENDING
            X.4Cl r0 = r0.A03
            r0.EOm(r1)
            goto L_0x07c7
        L_0x07d9:
            X.0eS.A00(r1)
            java.lang.Object r6 = r15.A01
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.Object r3 = r15.A02
            r1 = 12
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r4, (int) r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r6)
            r15.A01 = r6
            r15.A00 = r7
            java.lang.Object r1 = r0.A0E(r15)
            if (r1 != r2) goto L_0x07fe
            return r2
        L_0x07f8:
            java.lang.Object r0 = r15.A01
            X.4Cq r6 = X.JTO.A1D(r0, r1)
        L_0x07fe:
            X.3Ii r1 = (X.C239803Ii) r1
            java.lang.Object r3 = r15.A02
            X.K8a r3 = (X.C61446K8a) r3
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0832
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.K15 r0 = (X.K15) r0
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0869
            java.util.List r0 = X.C51966G9m.A1J(r0)
            java.util.ArrayList r0 = X.00k.A0U(r0)
            r3.A05 = r0
            java.util.Iterator r7 = r0.iterator()
        L_0x0820:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x083b
            com.instagram.user.model.User r0 = X.DbT.A0k(r7)
            com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus r1 = com.instagram.api.schemas.BrandedContentBrandTaggingRequestApprovalStatus.REQUEST_ONCE_GRANTED
            X.4Cl r0 = r0.A03
            r0.EOm(r1)
            goto L_0x0820
        L_0x0832:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x083b
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x083b:
            java.lang.String r1 = r3.A03
            java.lang.String r0 = "live"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x086d
            r1 = 13
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r3, (X.AnonymousClass4D7) r4, (int) r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r6)
            r15.A01 = r4
            r15.A00 = r5
            java.lang.Object r1 = r0.A0E(r15)
            if (r1 != r2) goto L_0x07ab
            return r2
        L_0x085b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x086d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0864:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0869:
            java.lang.String r0 = "_whitelistedUsers"
            goto L_0x0e0b
        L_0x086d:
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r3.A0A()
            X.JTO.A1X(r0)
            X.Trf r0 = r3.A09()
            r0.A04()
            X.UdQ r0 = r3.A08()
        L_0x087f:
            r0.A00()
            goto L_0x0df8
        L_0x0884:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x0892
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0892:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.F3K r1 = X.Ky3.A00(r0)
            java.lang.Object r0 = r15.A01
            X.Fo9 r0 = (X.C51079Fo9) r0
            r15.A00 = r3
            java.lang.Object r0 = r1.A01(r0, r15)
            goto L_0x0da2
        L_0x08a9:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x08bb
            if (r0 != r5) goto L_0x08b6
            X.0eS.A00(r1)
            return r1
        L_0x08b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08bb:
            X.0eS.A00(r1)
            com.instagram.barcelonaig.getapp.GetAppFragment$Companion r4 = X.E24.A0A
            java.lang.Object r0 = r15.A02
            X.E24 r0 = (X.E24) r0
            X.0eM r0 = r0.A09
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r0)
            java.lang.Object r1 = r15.A01
            com.instagram.api.schemas.TextPostAppBottomSheetCTAType r0 = com.instagram.api.schemas.TextPostAppBottomSheetCTAType.APP_UNAVAILABLE_AND_PREREGISTER_OFF
            boolean r0 = X.AnonymousClass7TF.A1W(r1, r0)
            r15.A00 = r5
            java.lang.Object r1 = com.instagram.barcelonaig.getapp.GetAppFragment$Companion.A00(r4, r3, r15, r0)
            if (r1 != r2) goto L_0x08db
            return r2
        L_0x08db:
            return r1
        L_0x08dc:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x08ea
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x08ea:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.HkK r0 = (X.C55600HkK) r0
            X.Hpu r10 = r0.A00
            java.lang.Object r1 = r15.A01
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131953669(0x7f130805, float:1.9543816E38)
            java.lang.String r13 = X.AnonymousClass7TE.A16(r1, r0)
            r15.A00 = r3
            java.lang.String r14 = "limited_replies"
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            r12 = r11
            java.lang.Object r0 = r10.A00(r11, r12, r13, r14, r15)
            goto L_0x0da2
        L_0x090b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            if (r0 == 0) goto L_0x0919
            if (r0 == r6) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0919:
            X.0eS.A00(r1)
            java.lang.Object r7 = r15.A01
            androidx.compose.foundation.lazy.LazyListState r7 = (androidx.compose.foundation.lazy.LazyListState) r7
            r1 = 18
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r7, (int) r1)
            X.05E r5 = X.C3025664b.A02(r0)
            r1 = 19
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r7, (int) r1)
            X.05E r4 = X.C3025664b.A02(r0)
            r3 = 0
            java.lang.String r1 = "permalink:over_scroll_item:over_scroll_item"
            com.instagram.barcelona.permalink.ui.component.OverEndScrollKt$rememberOverEndScrollState$1$1$3 r0 = new com.instagram.barcelona.permalink.ui.component.OverEndScrollKt$rememberOverEndScrollState$1$1$3
            r0.<init>(r7, r1, r3)
            X.0pm r0 = X.AnonymousClass10H.A03(r0, r5, r4)
            X.0qC r3 = new X.0qC
            r3.<init>(r0)
            java.lang.Object r1 = r15.A02
            r0 = 11
            X.MCj r0 = X.C66119MCj.A00(r1, r0)
            r15.A00 = r6
            java.lang.Object r0 = r3.collect(r0, r15)
            goto L_0x0da2
        L_0x0957:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 1
            if (r0 == 0) goto L_0x0965
            if (r0 == r7) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0965:
            X.0eS.A00(r1)
            java.lang.Object r6 = r15.A02
            androidx.compose.foundation.lazy.LazyListState r6 = (androidx.compose.foundation.lazy.LazyListState) r6
            int r5 = r6.A00()
            int r4 = r6.A01()
            r1 = 16
            X.IwG r0 = new X.IwG
            r0.<init>((java.lang.Object) r6, (int) r1)
            X.05E r3 = X.C3025664b.A02(r0)
            java.lang.Object r1 = r15.A01
            X.0sa r1 = (X.C62320sa) r1
            X.MCT r0 = new X.MCT
            r0.<init>(r6, r1, r5, r4)
            r15.A00 = r7
            java.lang.Object r0 = r3.collect(r0, r15)
            goto L_0x0da2
        L_0x0990:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r3 = 1
            if (r0 == 0) goto L_0x099e
            if (r0 == r3) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x099e:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.0rm r0 = (X.0rm) r0
            java.lang.Object r1 = r0.A00
            if (r1 == 0) goto L_0x0df8
            java.lang.Object r0 = r15.A01
            X.3jv r0 = (X.C249523jv) r0
            r15.A00 = r3
            java.lang.Object r0 = r0.ELH(r1, r15)
            goto L_0x0da2
        L_0x09b5:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 1
            r6 = 2
            if (r0 == 0) goto L_0x09fd
            if (r0 == r7) goto L_0x09df
            if (r0 != r6) goto L_0x0a03
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x09c6:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A02
            java.lang.Float r3 = X.JTP.A0i()
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 700(0x2bc, float:9.81E-43)
            X.GQC r0 = A00(r5, r15, r1, r0, r7)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x09e4
            return r2
        L_0x09df:
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x09e4:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A02
            java.lang.Float r3 = X.JTP.A0h()
            r1 = 700(0x2bc, float:9.81E-43)
            r0 = 900(0x384, float:1.261E-42)
            X.GQC r0 = A00(r5, r15, r1, r0, r6)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x09c6
            return r2
        L_0x09fd:
            X.0eS.A00(r1)
            X.2SQ r5 = X.2SP.A00
            goto L_0x09c6
        L_0x0a03:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a08:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 1
            r6 = 2
            if (r0 == 0) goto L_0x0a50
            if (r0 == r7) goto L_0x0a32
            if (r0 != r6) goto L_0x0a56
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x0a19:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A01
            java.lang.Float r3 = X.JTP.A0i()
            r1 = 200(0xc8, float:2.8E-43)
            r0 = 400(0x190, float:5.6E-43)
            X.GQC r0 = A00(r5, r15, r1, r0, r7)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x0a37
            return r2
        L_0x0a32:
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x0a37:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A01
            java.lang.Float r3 = X.JTP.A0h()
            r1 = 400(0x190, float:5.6E-43)
            r0 = 600(0x258, float:8.41E-43)
            X.GQC r0 = A00(r5, r15, r1, r0, r6)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x0a19
            return r2
        L_0x0a50:
            X.0eS.A00(r1)
            X.2SQ r5 = X.2SP.A00
            goto L_0x0a19
        L_0x0a56:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0a5b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 1
            r6 = 2
            if (r0 == 0) goto L_0x0aa3
            if (r0 == r7) goto L_0x0a85
            if (r0 != r6) goto L_0x0aa9
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x0a6c:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A00
            java.lang.Float r3 = X.JTP.A0i()
            r1 = 400(0x190, float:5.6E-43)
            r0 = 600(0x258, float:8.41E-43)
            X.GQC r0 = A00(r5, r15, r1, r0, r7)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x0a8a
            return r2
        L_0x0a85:
            java.lang.Object r5 = r15.A01
            X.0eS.A00(r1)
        L_0x0a8a:
            java.lang.Object r0 = r15.A02
            X.HoB r0 = (X.C55828HoB) r0
            X.5b4 r4 = r0.A00
            java.lang.Float r3 = X.JTP.A0h()
            r1 = 600(0x258, float:8.41E-43)
            r0 = 800(0x320, float:1.121E-42)
            X.GQC r0 = A00(r5, r15, r1, r0, r6)
            java.lang.Object r0 = X.JTQ.A0V(r4, r0, r3, r15)
            if (r0 != r2) goto L_0x0a6c
            return r2
        L_0x0aa3:
            X.0eS.A00(r1)
            X.2SQ r5 = X.2SP.A00
            goto L_0x0a6c
        L_0x0aa9:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0aae:
            X.1Hj r2 = X.1Hj.A02
            int r3 = r15.A00
            r0 = 1
            if (r3 == 0) goto L_0x0abc
            if (r3 == r0) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0abc:
            X.0eS.A00(r1)
            java.lang.Object r5 = r15.A01
            java.lang.Object r4 = r15.A02
            X.4Cq r4 = (X.C262224Cq) r4
            r15.A00 = r0
            r3 = 0
            r1 = 25
            X.MGZ r0 = new X.MGZ
            r0.<init>(r5, r3, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r4)
            goto L_0x0da2
        L_0x0ad5:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0ae3
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ae3:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r3 = r0.A00
            java.lang.Float r1 = X.JTP.A0h()
            java.lang.Object r0 = r15.A01
            X.GQC r0 = (X.GQC) r0
            r15.A00 = r4
            java.lang.Object r0 = X.JTQ.A0V(r3, r0, r1, r15)
            goto L_0x0da2
        L_0x0afc:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0b0a
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b0a:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r3 = r0.A01
            java.lang.Float r1 = X.JTP.A0h()
            java.lang.Object r0 = r15.A01
            X.GQC r0 = (X.GQC) r0
            r15.A00 = r4
            java.lang.Object r0 = X.JTQ.A0V(r3, r0, r1, r15)
            goto L_0x0da2
        L_0x0b23:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 4
            r6 = 3
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0b3a
            if (r0 == r3) goto L_0x0b50
            if (r0 == r5) goto L_0x0b6a
            if (r0 == r6) goto L_0x0b76
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b3a:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r1 = r0.A04
            java.lang.Float r0 = X.JTP.A0i()
            r15.A00 = r3
            java.lang.Object r0 = r1.A05(r0, r15)
            if (r0 != r2) goto L_0x0b53
            return r2
        L_0x0b50:
            X.0eS.A00(r1)
        L_0x0b53:
            java.lang.Object r0 = r15.A02
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r3 = r0.A04
            java.lang.Float r1 = X.JTP.A0h()
            java.lang.Object r0 = r15.A01
            X.GQC r0 = (X.GQC) r0
            r15.A00 = r5
            java.lang.Object r0 = X.JTQ.A0V(r3, r0, r1, r15)
            if (r0 != r2) goto L_0x0b6d
            return r2
        L_0x0b6a:
            X.0eS.A00(r1)
        L_0x0b6d:
            r15.A00 = r6
            java.lang.Object r0 = X.C241603Pv.A00(r15)
            if (r0 != r2) goto L_0x0b79
            return r2
        L_0x0b76:
            X.0eS.A00(r1)
        L_0x0b79:
            java.lang.Object r0 = r15.A02
            X.HoP r0 = (X.C55842HoP) r0
            X.5b4 r3 = r0.A04
            java.lang.Float r1 = X.JTP.A0i()
            java.lang.Object r0 = r15.A01
            X.GQC r0 = (X.GQC) r0
            r15.A00 = r4
            java.lang.Object r0 = X.JTQ.A0V(r3, r0, r1, r15)
            goto L_0x0da2
        L_0x0b8f:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0b9d
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0b9d:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A01
            r1 = 20
            X.IwM r0 = new X.IwM
            r0.<init>(r3, r1)
            X.05E r1 = X.C3025664b.A02(r0)
            java.lang.Object r3 = r15.A02
            r0 = 5
            X.0ro r1 = X.C66191MHh.A00(r3, r1, r0)
            r0 = 10
            X.MCj r0 = X.C66119MCj.A00(r3, r0)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            goto L_0x0da2
        L_0x0bc2:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            r5 = 3
            if (r0 == 0) goto L_0x0bd1
            if (r0 == r6) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0bd1:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A02
            X.Hne r0 = (X.C55798Hne) r0
            X.Hpu r10 = r0.A01
            android.content.Context r4 = r0.A00
            java.lang.Object r0 = r15.A01
            com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility r0 = (com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility) r0
            int r3 = r0.ordinal()
            if (r3 == r5) goto L_0x0c01
            r1 = 4
            r0 = 2131953714(0x7f130832, float:1.9543907E38)
            if (r3 == r1) goto L_0x0bef
            r0 = 2131953716(0x7f130834, float:1.954391E38)
        L_0x0bef:
            java.lang.String r13 = X.AnonymousClass7TE.A16(r4, r0)
            java.lang.Integer r12 = X.AnonymousClass05K.A00
            r15.A00 = r6
            java.lang.String r14 = "quote_media_disabled"
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            java.lang.Object r0 = r10.A00(r11, r12, r13, r14, r15)
            goto L_0x0da2
        L_0x0c01:
            r0 = 2131953715(0x7f130833, float:1.9543909E38)
            goto L_0x0bef
        L_0x0c05:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 1
            if (r0 == 0) goto L_0x0c13
            if (r0 == r6) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c13:
            X.0eS.A00(r1)
            java.lang.Object r5 = r15.A02
            X.6FR r5 = (X.AnonymousClass6FR) r5
            java.lang.Object r4 = r15.A01
            X.0sP r4 = (X.0sP) r4
            r3 = 0
            r1 = 3
            X.GOH r0 = new X.GOH
            r0.<init>(r3, r4, r1)
            r15.A00 = r6
            java.lang.Object r0 = androidx.compose.foundation.gestures.ForEachGestureKt.A01(r5, r15, r0)
            goto L_0x0da2
        L_0x0c2d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r7 = 1
            if (r0 == 0) goto L_0x0c3b
            if (r0 == r7) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c3b:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A01
            X.K1h r0 = (X.C61294K1h) r0
            java.util.List r0 = r0.A08
            if (r0 == 0) goto L_0x0df8
            java.lang.Object r6 = r15.A02
            X.LBB r6 = (X.LBB) r6
            com.instagram.avatars.suggestions.AvatarStickerSuggestionRepository r5 = r6.A04
            java.util.concurrent.ConcurrentHashMap r4 = r5.A06
            r4.clear()
            java.util.Iterator r3 = r0.iterator()
        L_0x0c55:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0c65
            X.6o8 r1 = X.JTO.A0a(r3)
            java.lang.String r0 = r1.A0a
            r4.put(r0, r1)
            goto L_0x0c55
        L_0x0c65:
            java.lang.String r0 = r6.A00
            r15.A00 = r7
            java.lang.Object r0 = r5.A02(r0, r15)
            goto L_0x0da2
        L_0x0c6f:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0c7d
            if (r0 == r4) goto L_0x0c98
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0c7d:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            X.K4g r3 = (X.C61364K4g) r3
            X.Jir r0 = r3.A0B()
            X.05G r1 = r0.A0T
            r0 = 5
            X.MCj r0 = X.C66119MCj.A00(r3, r0)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            if (r0 != r2) goto L_0x0c9b
            return r2
        L_0x0c98:
            X.0eS.A00(r1)
        L_0x0c9b:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0ca0:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0cae
            if (r0 == r4) goto L_0x0ccb
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0cae:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            X.K4g r3 = (X.C61364K4g) r3
            X.0eM r0 = r3.A0R
            X.6i2 r0 = X.DbZ.A0O(r0)
            X.05G r1 = r0.A0A
            r0 = 4
            X.MCj r0 = X.C66119MCj.A00(r3, r0)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            if (r0 != r2) goto L_0x0cce
            return r2
        L_0x0ccb:
            X.0eS.A00(r1)
        L_0x0cce:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0cd3:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0ce1
            if (r0 == r4) goto L_0x0cfc
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ce1:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            X.K4g r3 = (X.C61364K4g) r3
            X.Jir r0 = r3.A0B()
            X.05G r1 = r0.A0S
            r0 = 3
            X.MCj r0 = X.C66119MCj.A00(r3, r0)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            if (r0 != r2) goto L_0x0cff
            return r2
        L_0x0cfc:
            X.0eS.A00(r1)
        L_0x0cff:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0d04:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0d15
            if (r0 == r3) goto L_0x0d23
            if (r0 == r4) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d15:
            X.0eS.A00(r1)
            r0 = 150(0x96, double:7.4E-322)
            r15.A00 = r3
            java.lang.Object r0 = X.C241603Pv.A01(r15, r0)
            if (r0 != r2) goto L_0x0d26
            return r2
        L_0x0d23:
            X.0eS.A00(r1)
        L_0x0d26:
            java.lang.Object r3 = r15.A02
            com.instagram.avatars.pokes.PokeReceiverView r3 = (com.instagram.avatars.pokes.PokeReceiverView) r3
            X.Dkt r0 = r3.A01
            if (r0 == 0) goto L_0x0df8
            X.0r6 r1 = r0.A03
            X.MCj r0 = X.C66119MCj.A00(r3, r4)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            goto L_0x0da2
        L_0x0d3b:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x0d49
            if (r0 == r4) goto L_0x0d67
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d49:
            X.0eS.A00(r1)
            java.lang.Object r3 = r15.A02
            X.K7m r3 = (X.C61437K7m) r3
            X.0eM r0 = r3.A0L
            java.lang.Object r0 = r0.getValue()
            X.JgS r0 = (X.C60147JgS) r0
            X.05G r1 = r0.A03
            X.MCj r0 = X.C66119MCj.A00(r3, r4)
            r15.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r15)
            if (r0 != r2) goto L_0x0d6a
            return r2
        L_0x0d67:
            X.0eS.A00(r1)
        L_0x0d6a:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0d6f:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0d81
            if (r0 == r5) goto L_0x0d7d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0d7d:
            X.0eS.A00(r1)
            goto L_0x0df8
        L_0x0d81:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A01
            X.LZb r0 = (X.C64301LZb) r0
            X.0r6 r4 = r0.A05
            java.lang.Object r3 = r15.A02
            r0 = 70
            X.MCh r1 = new X.MCh
            r1.<init>(r3, r0)
            r15.A00 = r5
            r0 = 0
            X.MCj r0 = X.C66119MCj.A00(r1, r0)
            java.lang.Object r0 = r4.collect(r0, r15)
            if (r0 == r2) goto L_0x0dbe
            X.0gF r0 = X.C60340gF.A00
        L_0x0da2:
            if (r0 != r2) goto L_0x0df8
            return r2
        L_0x0da5:
            X.0eS.A00(r1)
            java.lang.Object r0 = r15.A01
            X.Ji9 r0 = (X.C60252Ji9) r0
            X.0Ud r3 = r0.A05
            java.lang.Object r1 = r15.A02
            r0 = 24
            X.MCj r0 = X.C66119MCj.A00(r1, r0)
            r15.A00 = r4
            java.lang.Object r0 = r3.collect(r0, r15)
            if (r0 != r2) goto L_0x0dc2
        L_0x0dbe:
            return r2
        L_0x0dbf:
            X.0eS.A00(r1)
        L_0x0dc2:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0dc7:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0e3c
            if (r0 != r7) goto L_0x0e58
            X.0eS.A00(r1)
        L_0x0dd4:
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 != 0) goto L_0x0dfb
            if (r1 == 0) goto L_0x0dfb
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0e53
            java.lang.Object r0 = r15.A01
            X.61u r0 = (X.C3021461u) r0
            r0.setPrimaryActionIsLoading(r3)
            java.lang.Object r2 = r15.A02
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            android.content.Context r1 = r2.requireContext()
            r0 = 2131953621(0x7f1307d5, float:1.9543718E38)
            java.lang.String r0 = r2.getString(r0)
            X.C59689JTv.A03(r1, r0, r6, r3)
        L_0x0df8:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x0dfb:
            java.lang.Object r4 = r15.A02
            X.E24 r4 = (X.E24) r4
            boolean r0 = r4.A07
            r2 = r0 ^ 1
            r4.A07 = r2
            X.1Av r0 = r4.A01
            if (r0 != 0) goto L_0x0e13
            java.lang.String r0 = "userPrefs"
        L_0x0e0b:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0e13:
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            r0 = 108(0x6c, float:1.51E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            r1.E5T(r0, r2)
            r1.apply()
            java.lang.Object r2 = r15.A01
            X.61u r2 = (X.C3021461u) r2
            r2.setPrimaryActionIsLoading(r3)
            boolean r1 = r4.A07
            r0 = 2131953630(0x7f1307de, float:1.9543736E38)
            if (r1 == 0) goto L_0x0e34
            r0 = 2131953629(0x7f1307dd, float:1.9543734E38)
        L_0x0e34:
            java.lang.String r0 = r4.getString(r0)
            r2.setPrimaryActionText(r0)
            goto L_0x0df8
        L_0x0e3c:
            X.0eS.A00(r1)
            r3 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r5 = r15.A02
            r1 = 8
            X.MH8 r0 = new X.MH8
            r0.<init>((java.lang.Object) r5, (X.AnonymousClass4D7) r6, (int) r1)
            r15.A00 = r7
            java.lang.Object r1 = X.I3P.A01(r15, r0, r3)
            if (r1 != r2) goto L_0x0dd4
            return r2
        L_0x0e53:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0e58:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e5d:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0e6b
            if (r0 == r5) goto L_0x0e8c
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0e6b:
            X.0eS.A00(r1)
            java.lang.Object r4 = r15.A02
            X.K4W r4 = (X.K4W) r4
            X.0eM r0 = r4.A06
            java.lang.Object r0 = r0.getValue()
            X.Jhg r0 = (X.C60223Jhg) r0
            X.05G r3 = r0.A00
            r1 = 69
            X.MCh r0 = new X.MCh
            r0.<init>(r4, r1)
            r15.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r15)
            if (r0 != r2) goto L_0x0e8f
            return r2
        L_0x0e8c:
            X.0eS.A00(r1)
        L_0x0e8f:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0e94:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0ea2
            if (r0 == r5) goto L_0x0ec3
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ea2:
            X.0eS.A00(r1)
            java.lang.Object r4 = r15.A02
            X.K4W r4 = (X.K4W) r4
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r3 = r0.A01
            r1 = 68
            X.MCh r0 = new X.MCh
            r0.<init>(r4, r1)
            r15.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r15)
            if (r0 != r2) goto L_0x0ec6
            return r2
        L_0x0ec3:
            X.0eS.A00(r1)
        L_0x0ec6:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0ecb:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0ed9
            if (r0 == r5) goto L_0x0efa
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0ed9:
            X.0eS.A00(r1)
            java.lang.Object r4 = r15.A02
            X.K4W r4 = (X.K4W) r4
            X.0eM r0 = r4.A08
            java.lang.Object r0 = r0.getValue()
            X.JgC r0 = (X.C60131JgC) r0
            X.05G r3 = r0.A00
            r1 = 67
            X.MCh r0 = new X.MCh
            r0.<init>(r4, r1)
            r15.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r15)
            if (r0 != r2) goto L_0x0efd
            return r2
        L_0x0efa:
            X.0eS.A00(r1)
        L_0x0efd:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        L_0x0f02:
            X.1Hj r2 = X.1Hj.A02
            int r0 = r15.A00
            r5 = 1
            if (r0 == 0) goto L_0x0f10
            if (r0 == r5) goto L_0x0f31
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0f10:
            X.0eS.A00(r1)
            java.lang.Object r4 = r15.A02
            X.K4W r4 = (X.K4W) r4
            X.0eM r0 = r4.A07
            java.lang.Object r0 = r0.getValue()
            X.Jhm r0 = (X.C60229Jhm) r0
            X.05G r3 = r0.A03
            r1 = 64
            X.MCh r0 = new X.MCh
            r0.<init>(r4, r1)
            r15.A00 = r5
            java.lang.Object r0 = r3.collect(r0, r15)
            if (r0 != r2) goto L_0x0f34
            return r2
        L_0x0f31:
            X.0eS.A00(r1)
        L_0x0f34:
            X.MCr r0 = X.C51965G9l.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MHC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public static BrandedContentApi A01(Object obj, MHC mhc) {
        0eS.A00(obj);
        return new BrandedContentApi(((UZ3) mhc.A02).A06());
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MHC) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHC(Object obj, AnonymousClass4D7 r3, int i) {
        super(2, r3);
        this.A03 = i;
        this.A02 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHC(Object obj, Object obj2, AnonymousClass4D7 r4, int i) {
        super(2, r4);
        this.A03 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MHC(AnonymousClass4D7 r2, 0sP r3) {
        super(2, r2);
        this.A03 = 11;
        this.A01 = r3;
    }
}
