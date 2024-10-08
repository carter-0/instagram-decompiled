package X;

import com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController;

/* renamed from: X.KNc  reason: case insensitive filesystem */
public final class C61813KNc extends C61383K5b {
    public static final String __redex_internal_original_name = "ReselectCoverPhotoPickerFragment";
    public ClipsCoverPhotoPickerController A00;
    public 1Xj A01;
    public C60250Ji7 A02;
    public C60128Jg9 A03;
    public String A04 = "";
    public C60123Jg4 A05;
    public C60134JgF A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);

    public final String getModuleName() {
        return "reselect_cover_photo_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: X.K5b} */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.2YM] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r29) {
        /*
            r28 = this;
            r0 = -1060222650(0xffffffffc0ce4946, float:-6.4464445)
            int r1 = X.AnonymousClass0fD.A02(r0)
            r10 = r28
            r0 = r29
            X.C61813KNc.super.onCreate(r0)
            android.os.Bundle r5 = r10.mArguments
            if (r5 == 0) goto L_0x0155
            r0 = 211(0xd3, float:2.96E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r2 = r5.getString(r0)
            if (r2 != 0) goto L_0x0020
            java.lang.String r2 = ""
        L_0x0020:
            X.0eM r3 = r10.A07
            X.1E8 r4 = X.DbX.A0d(r3)
            r0 = 212(0xd4, float:2.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r5.getString(r0)
            X.1Xj r0 = r4.A02(r0)
            if (r0 != 0) goto L_0x0046
            X.0wb r3 = X.0wb.A01
            java.lang.String r2 = "reselect_cover_photo_fragment"
            java.lang.String r0 = "null media object"
            r3.Ew0(r2, r0)
            r0 = 455961951(0x1b2d6d5f, float:1.4345564E-22)
        L_0x0042:
            X.AnonymousClass0fD.A09(r0, r1)
            return
        L_0x0046:
            r10.A01 = r0
            java.lang.String r8 = "media"
            r15 = 0
            long r5 = r0.A1B()
            int r4 = (int) r5
            com.instagram.common.session.UserSession r24 = X.AnonymousClass7TE.A0l(r3)
            X.1Xj r6 = r10.A01
            if (r6 == 0) goto L_0x0134
            android.content.Context r23 = r10.requireContext()
            android.content.res.Resources r0 = X.DbV.A05(r10)
            android.util.DisplayMetrics r7 = r0.getDisplayMetrics()
            X.0qQ.A07(r7)
            android.graphics.RectF r0 = X.0nA.A01
            int r0 = r7.widthPixels
            float r5 = (float) r0
            int r0 = r7.heightPixels
            float r0 = (float) r0
            float r5 = r5 / r0
            r19 = 1
            X.M0v r22 = new X.M0v
            r25 = r6
            r26 = r2
            r27 = r5
            r22.<init>(r23, r24, r25, r26, r27)
            X.2YN r5 = X.DbW.A0F(r10)
            java.lang.Class<X.Jg9> r0 = X.C60128Jg9.class
            X.2YL r0 = r5.A00(r0)
            X.Jg9 r0 = (X.C60128Jg9) r0
            r10.A03 = r0
            androidx.fragment.app.FragmentActivity r5 = r10.requireActivity()
            r0 = 177(0xb1, float:2.48E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r5, r0)
            X.1Xj r0 = r10.A01
            if (r0 == 0) goto L_0x0134
            float r24 = r0.A0l()
            X.LA8 r23 = X.LKM.A01(r2, r15, r4)
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r3)
            r18 = 0
            r0 = 5
            X.0qQ.A0B(r2, r0)
            X.La1 r0 = new X.La1
            r20 = r0
            r21 = r2
            r25 = r18
            r26 = r4
            r20.<init>(r21, r22, r23, r24, r25, r26)
            X.2YN r2 = X.JTO.A0L(r0, r5)
            java.lang.Class<X.Ji7> r0 = X.C60250Ji7.class
            X.2YL r0 = r2.A00(r0)
            X.Ji7 r0 = (X.C60250Ji7) r0
            r10.A02 = r0
            java.lang.String r8 = "videoScrubbingViewModel"
            if (r0 == 0) goto L_0x0134
            X.2Fk r4 = r0.A07
            r0 = 27
            X.J6f r2 = new X.J6f
            r2.<init>(r10, r0)
            r0 = 13
            X.C64321LZw.A00(r10, r4, r2, r0)
            X.2YN r2 = X.DbW.A0F(r10)
            java.lang.Class<X.JgF> r0 = X.C60134JgF.class
            X.2YL r5 = r2.A00(r0)
            X.JgF r5 = (X.C60134JgF) r5
            r10.A06 = r5
            java.lang.String r4 = "galleryCoverPhotoPickerViewModel"
            if (r5 == 0) goto L_0x013c
            X.Ji7 r0 = r10.A02
            if (r0 == 0) goto L_0x0134
            X.Lpe r2 = new X.Lpe
            r2.<init>(r0)
            X.2Fj r0 = r5.A00
            r0.A0B(r2)
            X.JgF r0 = r10.A06
            if (r0 == 0) goto L_0x013c
            X.0r6 r4 = r0.A02
            r2 = 42
            X.ImP r0 = new X.ImP
            r0.<init>(r10, r15, r2)
            X.JTS.A10(r10, r0, r4)
            androidx.fragment.app.FragmentActivity r2 = r10.requireActivity()
            X.KBG r0 = new X.KBG
            r0.<init>()
            X.2YN r2 = X.JTO.A0L(r0, r2)
            java.lang.Class<X.Jg4> r0 = X.C60123Jg4.class
            X.2YL r0 = r2.A00(r0)
            X.Jg4 r0 = (X.C60123Jg4) r0
            r10.A05 = r0
            android.content.Context r9 = r10.requireContext()
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r3)
            X.Ji7 r0 = r10.A02
            if (r0 == 0) goto L_0x0134
            X.Jg4 r14 = r10.A05
            if (r14 != 0) goto L_0x0140
            java.lang.String r8 = "textEditingViewModel"
        L_0x0134:
            X.0qQ.A0F(r8)
        L_0x0137:
            X.00P r2 = X.AnonymousClass00P.createAndThrow()
            throw r2
        L_0x013c:
            X.0qQ.A0F(r4)
            goto L_0x0137
        L_0x0140:
            com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController r8 = new com.instagram.creation.sharesheet.coverphoto.ClipsCoverPhotoPickerController
            r11 = r10
            r13 = r10
            r17 = r15
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r10.A00 = r8
            r10.registerLifecycleListener(r8)
            r0 = -638029506(0xffffffffd9f8713e, float:-8.7412882E15)
            goto L_0x0042
        L_0x0155:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0y()
            r0 = 846283482(0x327142da, float:1.4043247E-8)
            X.AnonymousClass0fD.A09(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61813KNc.onCreate(android.os.Bundle):void");
    }
}
