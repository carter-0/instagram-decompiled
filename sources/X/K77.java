package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.mediakit.config.MediaKitInfoSheetConfig;

public class K77 extends AnonymousClass4DH implements MXF {
    public static final String __redex_internal_original_name = "MediaKitInfoSheetFragment";
    public LinearLayout A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public RecyclerView A04;
    public IgSimpleImageView A05;
    public MediaKitInfoSheetConfig A06;
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(MML.A00(this, 30));

    public String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005a, code lost:
        if (r1.A05 != null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r8, android.os.Bundle r9) {
        /*
            r7 = this;
            r0 = 0
            X.0qQ.A0B(r8, r0)
            super.onViewCreated(r8, r9)
            r0 = 2131436423(0x7f0b2387, float:1.8494716E38)
            android.widget.TextView r0 = X.DbU.A0G(r8, r0)
            r7.A03 = r0
            r0 = 2131436425(0x7f0b2389, float:1.849472E38)
            com.instagram.common.ui.base.IgSimpleImageView r0 = X.JTP.A0T(r8, r0)
            r7.A05 = r0
            r0 = 2131436431(0x7f0b238f, float:1.8494732E38)
            androidx.recyclerview.widget.RecyclerView r0 = X.DbT.A0I(r8, r0)
            r7.A04 = r0
            r0 = 2131436422(0x7f0b2386, float:1.8494714E38)
            android.widget.TextView r0 = X.DbU.A0G(r8, r0)
            r7.A01 = r0
            r0 = 2131436426(0x7f0b238a, float:1.8494722E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.A00 = r0
            r0 = 2131436427(0x7f0b238b, float:1.8494724E38)
            android.widget.TextView r0 = X.DbU.A0G(r8, r0)
            r7.A02 = r0
            r0 = 2131436424(0x7f0b2388, float:1.8494718E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r8, r0)
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r1 = r7.A00()
            java.lang.Integer r0 = r1.A06
            if (r0 != 0) goto L_0x005c
            java.lang.Integer r0 = r1.A04
            if (r0 != 0) goto L_0x005c
            java.lang.Integer r0 = r1.A03
            if (r0 != 0) goto L_0x005c
            java.lang.Integer r1 = r1.A05
            r0 = 8
            if (r1 == 0) goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r7.A03
            java.lang.String r6 = "infoHeaderTitle"
            if (r2 == 0) goto L_0x012e
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r1 = r0.A06
            r3 = 0
            r0 = 8
            if (r1 == 0) goto L_0x0072
            r0 = 0
        L_0x0072:
            r2.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r7.A05
            java.lang.String r5 = "infoImage"
            if (r2 == 0) goto L_0x0138
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r1 = r0.A04
            r0 = 8
            if (r1 == 0) goto L_0x0086
            r0 = 0
        L_0x0086:
            r2.setVisibility(r0)
            android.widget.TextView r2 = r7.A01
            java.lang.String r4 = "infoHeaderDescription"
            if (r2 == 0) goto L_0x0133
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r1 = r0.A03
            r0 = 8
            if (r1 == 0) goto L_0x009a
            r0 = 0
        L_0x009a:
            r2.setVisibility(r0)
            android.widget.LinearLayout r1 = r7.A00
            if (r1 != 0) goto L_0x00ab
            java.lang.String r3 = "infoHeaderInfoView"
        L_0x00a3:
            X.0qQ.A0F(r3)
        L_0x00a6:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00ab:
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A05
            if (r0 != 0) goto L_0x00b5
            r3 = 8
        L_0x00b5:
            r1.setVisibility(r3)
            androidx.recyclerview.widget.RecyclerView r2 = r7.A04
            java.lang.String r3 = "infoRv"
            if (r2 == 0) goto L_0x00a3
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.util.ArrayList r1 = r0.A0C
            X.Jkc r0 = new X.Jkc
            r0.<init>(r1)
            r2.setAdapter(r0)
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A02
            if (r0 == 0) goto L_0x00df
            int r1 = r0.intValue()
            androidx.recyclerview.widget.RecyclerView r0 = r7.A04
            if (r0 == 0) goto L_0x00a3
            X.C64128LPc.A02(r0, r1)
        L_0x00df:
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A06
            if (r0 == 0) goto L_0x00f2
            int r1 = r0.intValue()
            android.widget.TextView r0 = r7.A03
            if (r0 == 0) goto L_0x012e
            r0.setText(r1)
        L_0x00f2:
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x0109
            int r2 = r0.intValue()
            com.instagram.common.ui.base.IgSimpleImageView r1 = r7.A05
            if (r1 == 0) goto L_0x0138
            android.content.Context r0 = r7.requireContext()
            X.DbU.A13(r0, r1, r2)
        L_0x0109:
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A03
            if (r0 == 0) goto L_0x011c
            int r1 = r0.intValue()
            android.widget.TextView r0 = r7.A01
            if (r0 == 0) goto L_0x0133
            r0.setText(r1)
        L_0x011c:
            com.instagram.mediakit.config.MediaKitInfoSheetConfig r0 = r7.A00()
            java.lang.Integer r0 = r0.A05
            if (r0 == 0) goto L_0x0140
            int r1 = r0.intValue()
            android.widget.TextView r0 = r7.A02
            if (r0 != 0) goto L_0x013d
            java.lang.String r6 = "infoHeaderInfoText"
        L_0x012e:
            X.0qQ.A0F(r6)
            goto L_0x00a6
        L_0x0133:
            X.0qQ.A0F(r4)
            goto L_0x00a6
        L_0x0138:
            X.0qQ.A0F(r5)
            goto L_0x00a6
        L_0x013d:
            r0.setText(r1)
        L_0x0140:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K77.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final MediaKitInfoSheetConfig A00() {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig = this.A06;
        if (mediaKitInfoSheetConfig != null) {
            return mediaKitInfoSheetConfig;
        }
        0qQ.A0F("mediaKitInfoSheetConfig");
        throw AnonymousClass00P.createAndThrow();
    }

    public final LDW BO3() {
        return (LDW) this.A08.getValue();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public void onCreate(Bundle bundle) {
        MediaKitInfoSheetConfig mediaKitInfoSheetConfig;
        int A022 = AnonymousClass0fD.A02(301325726);
        K77.super.onCreate(bundle);
        if (this instanceof KUF) {
            mediaKitInfoSheetConfig = MediaKitInfoSheetConfig.A0E;
        } else {
            Parcelable parcelable = requireArguments().getParcelable("mk_info_sheet_config");
            if (parcelable != null) {
                mediaKitInfoSheetConfig = (MediaKitInfoSheetConfig) parcelable;
            } else {
                IllegalStateException A0z = AnonymousClass7TE.A0z("MediaKitInfoSheetConfig expected but was null");
                AnonymousClass0fD.A09(836732209, A022);
                throw A0z;
            }
        }
        0qQ.A0B(mediaKitInfoSheetConfig, 0);
        this.A06 = mediaKitInfoSheetConfig;
        AnonymousClass0fD.A09(-1643027817, A022);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1279329042);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_info_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1724931617, A022);
        return inflate;
    }
}
