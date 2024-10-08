package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;

public final class K5S extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CutoutVideoStickerCreationFragment";
    public C64435Lbq A00;
    public C64965Ll4 A01;
    public C64962Ll1 A02;
    public Integer A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = DbS.A0I(new MMT(this, 11), new MMT(this, 10), new MJ9(9, (Object) null, this), DbS.A0z(C60088JfU.class));
    public final AnonymousClass0eM A06 = C227642jf.A02(this);

    public final String getModuleName() {
        return "cutout_video_sticker_creation";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: X.07g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: X.0iw} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r24, android.os.Bundle r25) {
        /*
            r23 = this;
            r4 = 0
            r12 = r24
            X.0qQ.A0B(r12, r4)
            r15 = r23
            r0 = r25
            super.onViewCreated(r12, r0)
            android.os.Bundle r1 = r15.mArguments
            r3 = 0
            if (r1 == 0) goto L_0x00eb
            java.lang.String r0 = "args_file_path"
            java.lang.String r9 = r1.getString(r0)
        L_0x0018:
            android.content.Context r1 = r15.requireContext()
            r0 = 2131099784(0x7f060088, float:1.781193E38)
            r1.getColor(r0)
            X.Lkv r2 = new X.Lkv
            r2.<init>(r15)
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto L_0x00e8
            java.lang.String r0 = "args_entry_point"
            java.lang.String r0 = r1.getString(r0)
        L_0x0031:
            java.lang.Integer r0 = X.C63130Kry.A00(r0)
            r15.A03 = r0
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto L_0x00e5
            java.lang.String r0 = "from_create_btn"
            boolean r0 = r1.getBoolean(r0)
        L_0x0041:
            r15.A04 = r0
            if (r0 == 0) goto L_0x0057
            android.content.Context r5 = r15.requireContext()
            android.content.Context r1 = r15.requireContext()
            r0 = 2130970254(0x7f04068e, float:1.7549213E38)
            int r0 = X.2Yu.A0H(r1, r0)
            X.DbT.A16(r5, r12, r0)
        L_0x0057:
            r0 = 2131431262(0x7f0b0f5e, float:1.8484248E38)
            android.view.View r13 = X.AnonymousClass7TF.A0G(r12, r0)
            android.view.ViewStub r13 = (android.view.ViewStub) r13
            r0 = 2131431259(0x7f0b0f5b, float:1.8484242E38)
            android.view.View r14 = X.AnonymousClass7TF.A0G(r12, r0)
            android.view.ViewStub r14 = (android.view.ViewStub) r14
            X.0eM r1 = r15.A06
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r1)
            X.Lku r6 = new X.Lku
            r6.<init>(r15)
            androidx.fragment.app.FragmentActivity r11 = r15.requireActivity()
            java.lang.Integer r20 = X.AnonymousClass05K.A01
            java.lang.Integer r0 = r15.A03
            java.lang.String r5 = "entryPoint"
            if (r0 == 0) goto L_0x00c9
            X.Ll4 r10 = new X.Ll4
            r16 = r15
            r17 = r15
            r19 = r6
            r21 = r0
            r22 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r15.A01 = r10
            com.instagram.common.session.UserSession r16 = X.AnonymousClass7TE.A0l(r1)
            r0 = 2131431264(0x7f0b0f60, float:1.8484252E38)
            android.view.View r8 = X.AnonymousClass7TF.A0G(r12, r0)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            java.lang.Integer r7 = r15.A03
            if (r7 == 0) goto L_0x00c9
            int r6 = r7.intValue()
            r0 = 6
            r5 = 3
            if (r6 == r0) goto L_0x00e2
            r0 = 5
            if (r6 == r0) goto L_0x00df
            if (r6 == r5) goto L_0x00df
            r17 = 0
        L_0x00b1:
            X.Ll1 r0 = new X.Ll1
            r11 = r0
            r13 = r8
            r14 = r15
            r18 = r2
            r19 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r15.A02 = r0
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()
            X.Ll4 r0 = r15.A01
            if (r0 != 0) goto L_0x00d1
            java.lang.String r5 = "photoStickerCreationController"
        L_0x00c9:
            X.0qQ.A0F(r5)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00d1:
            r7.add(r0)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            X.Ll1 r2 = r15.A02
            if (r2 != 0) goto L_0x00ee
            java.lang.String r5 = "videoStickerCreationController"
            goto L_0x00c9
        L_0x00df:
            X.80N r17 = X.AnonymousClass80N.A00
            goto L_0x00b1
        L_0x00e2:
            X.9QA r17 = X.AnonymousClass9QA.A00
            goto L_0x00b1
        L_0x00e5:
            r0 = 0
            goto L_0x0041
        L_0x00e8:
            r0 = r3
            goto L_0x0031
        L_0x00eb:
            r9 = r3
            goto L_0x0018
        L_0x00ee:
            X.Lkt r1 = new X.Lkt
            r1.<init>()
            X.Lbq r0 = new X.Lbq
            r0.<init>(r6, r1, r2, r7)
            r15.A00 = r0
            X.0eM r0 = r15.A05
            java.lang.Object r0 = r0.getValue()
            X.JfU r0 = (X.C60088JfU) r0
            X.0Ud r2 = r0.A01
            r1 = 14
            X.MGa r0 = new X.MGa
            r0.<init>(r15, r3, r1)
            X.JTS.A10(r15, r0, r2)
            if (r9 == 0) goto L_0x01a7
            java.io.File r0 = X.AnonymousClass7TE.A0t(r9)
            com.instagram.common.gallery.Medium r2 = X.C282665Eg.A03(r0, r5, r4)
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever
            r5.<init>()
            java.lang.String r0 = r2.A0X     // Catch:{ Exception -> 0x018e }
            r5.setDataSource(r0)     // Catch:{ Exception -> 0x018e }
            r0 = 18
            java.lang.String r0 = r5.extractMetadata(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0186
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0186
            int r1 = r0.intValue()     // Catch:{ Exception -> 0x018e }
        L_0x0134:
            r0 = 19
            java.lang.String r0 = r5.extractMetadata(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0184
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0184
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x018e }
        L_0x0146:
            r2.A0B = r1     // Catch:{ Exception -> 0x018e }
            r2.A04 = r0     // Catch:{ Exception -> 0x018e }
            r0 = 9
            java.lang.String r0 = r5.extractMetadata(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0182
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0182
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x018e }
        L_0x015c:
            r2.A03 = r0     // Catch:{ Exception -> 0x018e }
            r0 = 24
            java.lang.String r0 = r5.extractMetadata(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0180
            java.lang.Integer r0 = X.00y.A0l(r0)     // Catch:{ Exception -> 0x018e }
            if (r0 == 0) goto L_0x0180
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x018e }
        L_0x0170:
            r2.A07 = r0     // Catch:{ Exception -> 0x018e }
            X.Ll1 r1 = r15.A02     // Catch:{ Exception -> 0x018e }
            java.lang.String r0 = "videoStickerCreationController"
            if (r1 != 0) goto L_0x0188
            X.0qQ.A0F(r0)     // Catch:{ Exception -> 0x018e }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ Exception -> 0x018e }
            throw r0     // Catch:{ Exception -> 0x018e }
        L_0x0180:
            r0 = 0
            goto L_0x0170
        L_0x0182:
            r0 = 0
            goto L_0x015c
        L_0x0184:
            r0 = 0
            goto L_0x0146
        L_0x0186:
            r1 = 0
            goto L_0x0134
        L_0x0188:
            r1.A00 = r2     // Catch:{ Exception -> 0x018e }
            r1.E0h()     // Catch:{ Exception -> 0x018e }
            goto L_0x01a4
        L_0x018e:
            r4 = move-exception
            java.lang.String r2 = "CutoutVideoStickerCreationFragment"
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x019f }
            java.lang.String r0 = "setDataSource exception="
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)     // Catch:{ all -> 0x019f }
            X.0kD.A07(r2, r0, r3)     // Catch:{ all -> 0x019f }
            throw r4     // Catch:{ all -> 0x019f }
        L_0x019f:
            r0 = move-exception
            r5.release()
            throw r0
        L_0x01a4:
            r5.release()
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5S.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean onBackPressed() {
        C64435Lbq lbq = this.A00;
        if (lbq != null) {
            return lbq.A03();
        }
        0qQ.A0F("assetPickerModeController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1846753016);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_video_creation_fragment, viewGroup, false);
        AnonymousClass0fD.A09(332340948, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1496630595);
        super.onDestroyView();
        AnonymousClass0fD.A09(-451496787, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-597886879);
        super.onResume();
        JTU.A0p(this, 8);
        C317756nm.A03(requireActivity(), (Fragment) null, AnonymousClass7TE.A0l(this.A06), false, false);
        AnonymousClass0fD.A09(-1440855888, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(591432048);
        K5S.super.onStop();
        JTU.A0p(this, 0);
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A06), false, false);
        AnonymousClass0fD.A09(470018955, A022);
    }
}
