package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class NIV extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "AiStickerDetailsBottomSheetFragment";
    public C74327Pt3 A00;
    public C69332NjX A01 = C69332NjX.PREVIEW;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r12, android.os.Bundle r13) {
        /*
            r11 = this;
            r3 = 0
            X.0qQ.A0B(r12, r3)
            android.os.Bundle r2 = r11.requireArguments()
            super.onViewCreated(r12, r13)
            java.lang.String r1 = "AI_STICKER_IMAGE_URL"
            java.lang.String r8 = r2.getString(r1)
            r0 = 2131427928(0x7f0b0258, float:1.8477486E38)
            com.instagram.common.ui.widget.imageview.IgImageView r4 = X.DbX.A0b(r12, r0)
            if (r8 == 0) goto L_0x0111
            int r0 = r8.length()
            if (r0 == 0) goto L_0x0111
            java.lang.String r0 = r2.getString(r1)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.DbS.A0V(r0)
            java.lang.String r0 = ".webp"
            boolean r0 = X.00l.A0d(r8, r0, r3)
            if (r0 == 0) goto L_0x010c
            android.content.Context r5 = r11.requireContext()
            X.0eM r0 = r11.A02
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r0)
            java.lang.String r0 = "AI_STICKER_ID"
            java.lang.String r7 = r2.getString(r0)
            r9 = 124(0x7c, float:1.74E-43)
            r10 = r9
            X.NdJ r0 = X.C70013Nvr.A00(r5, r6, r7, r8, r9, r10)
            r4.setImageDrawable(r0)
        L_0x004a:
            r0 = 2131427927(0x7f0b0257, float:1.8477484E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r12, r0)
            X.NjX r0 = r11.A01
            X.NjX r4 = X.C69332NjX.PREVIEW
            r8 = 0
            if (r0 != r4) goto L_0x00f5
            X.0eM r9 = r11.A02
            X.0lg r6 = X.AnonymousClass7TF.A0L(r9, r3)
            X.0Tu r7 = X.0Tu.A05
            r0 = 2342160741568615910(0x208106c9001015e6, double:4.063663109570136E-152)
            boolean r0 = X.182.A06(r7, r6, r0)
            if (r0 == 0) goto L_0x00f5
            java.lang.String r0 = "AI_STICKER_PROMPT_TEXT"
            java.lang.String r6 = r2.getString(r0)
            r5.setText(r6)
            r5.setVisibility(r3)
            X.0lg r2 = X.AnonymousClass7TF.A0L(r9, r3)
            r0 = 36317732354987495(0x8106c9001115e7, double:3.030818408839709E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            if (r0 == 0) goto L_0x008e
            X.OkH r0 = new X.OkH
            r0.<init>(r11, r6)
            r5.setOnLongClickListener(r0)
        L_0x008e:
            X.0eM r7 = r11.A02
            X.0lg r2 = X.DbT.A0X(r7)
            X.0Tu r6 = X.0Tu.A05
            r0 = 36317732356429292(0x8106c9002715ec, double:3.0308184097515075E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 != 0) goto L_0x00b9
            r0 = 2131427929(0x7f0b0259, float:1.8477488E38)
            android.widget.TextView r5 = X.AnonymousClass7TG.A0R(r12, r0)
            X.NjX r2 = r11.A01
            android.content.Context r1 = r12.getContext()
            r0 = 2131958610(0x7f131b52, float:1.9553837E38)
            if (r2 != r4) goto L_0x00b6
            r0 = 2131958612(0x7f131b54, float:1.9553841E38)
        L_0x00b6:
            X.DbT.A18(r1, r5, r0)
        L_0x00b9:
            r0 = 2131427926(0x7f0b0256, float:1.8477482E38)
            android.view.View r5 = X.AnonymousClass7TF.A0F(r12, r0)
            X.61u r5 = (X.C3021461u) r5
            X.0lg r2 = X.AnonymousClass7TF.A0L(r7, r3)
            r0 = 36317732353873379(0x8106c9000015e3, double:3.030818408135138E-306)
            boolean r0 = X.182.A06(r6, r2, r0)
            if (r0 == 0) goto L_0x0117
            r0 = 38
            X.C71397Ojw.A00(r5, r0, r11)
            X.NjX r1 = r11.A01
            if (r1 != r4) goto L_0x00e9
            android.content.Context r1 = r12.getContext()
            r0 = 2131958613(0x7f131b55, float:1.9553843E38)
        L_0x00e1:
            java.lang.String r0 = r1.getString(r0)
            r5.setPrimaryActionText(r0)
        L_0x00e8:
            return
        L_0x00e9:
            X.NjX r0 = X.C69332NjX.NUX
            if (r1 != r0) goto L_0x00e8
            android.content.Context r1 = r12.getContext()
            r0 = 2131975560(0x7f135d88, float:1.9588216E38)
            goto L_0x00e1
        L_0x00f5:
            X.NjX r1 = r11.A01
            X.NjX r0 = X.C69332NjX.NUX
            if (r1 != r0) goto L_0x0109
            android.content.Context r1 = r12.getContext()
            r0 = 2131958611(0x7f131b53, float:1.955384E38)
            X.DbT.A18(r1, r5, r0)
        L_0x0105:
            r5.setVisibility(r8)
            goto L_0x008e
        L_0x0109:
            r8 = 8
            goto L_0x0105
        L_0x010c:
            r4.setUrl(r1, r11)
            goto L_0x004a
        L_0x0111:
            r0 = 0
            r4.setImageBitmap(r0)
            goto L_0x004a
        L_0x0117:
            r0 = 8
            r5.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NIV.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-767928556);
        0qQ.A0B(layoutInflater, 0);
        this.A01 = (C69332NjX) requireArguments().getSerializable("AI_STICKER_MODAL_TYPE");
        View inflate = layoutInflater.inflate(R.layout.ai_sticker_bottom_sheet_nux_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1947676931, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-605588355);
        super.onDestroy();
        this.A00 = null;
        AnonymousClass0fD.A09(-1195938240, A022);
    }
}
