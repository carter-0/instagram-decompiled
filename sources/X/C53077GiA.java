package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.GiA  reason: case insensitive filesystem */
public final class C53077GiA extends 2Rw {
    public 1Xj A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final H0K A03;
    public final ArrayList A04 = AnonymousClass7TE.A1C();

    public C53077GiA(AnonymousClass0iw r2, UserSession userSession, H0K h0k) {
        0qQ.A0B(userSession, 2);
        this.A01 = r2;
        this.A02 = userSession;
        this.A03 = h0k;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        if (i == 1) {
            int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C54594HKd(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_default_item, false), this.A01, this.A02, this.A00);
        } else if (i == 2) {
            int i3 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C54595HKe(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_text_item, false), this.A01, this.A02, this.A00);
        } else if (i == 3) {
            int i4 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
            return new C54596HKf(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.creator_viewer_insights_recipe_sheet_audio_item, false), this.A01, this.A02, this.A00, this.A03);
        } else {
            throw DbW.A0a(AnonymousClass000.A00(2528), i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: X.HKd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: X.HKf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: X.HKe} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: X.HKf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v7, resolved type: X.HKf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v8, resolved type: X.HKf} */
    /* JADX WARNING: type inference failed for: r6v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r13, int r14) {
        /*
            r12 = this;
            X.Gig r13 = (X.C53108Gig) r13
            r5 = 0
            X.0qQ.A0B(r13, r5)
            java.util.ArrayList r3 = r12.A04
            boolean r0 = r13 instanceof X.C54595HKe
            if (r0 == 0) goto L_0x009c
            X.HKe r13 = (X.C54595HKe) r13
            X.0qQ.A0B(r3, r5)
            java.lang.Object r2 = X.00k.A0O(r3, r14)
            com.instagram.api.schemas.CreatorViewerSignalModel r2 = (com.instagram.api.schemas.CreatorViewerSignalModel) r2
            if (r2 == 0) goto L_0x009b
            com.instagram.api.schemas.CreatorViewerSignalDetails r0 = r2.Awl()
            com.instagram.api.schemas.CreatorViewerSignalReelsTextDetails r6 = r0.BlA()
            if (r6 == 0) goto L_0x009b
            com.instagram.common.ui.base.IgTextView r4 = r13.A04
            java.lang.String r0 = "Aa"
            r4.setText(r0)
            com.instagram.api.schemas.ClipsTextFormatType r0 = r6.C5D()
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0038
        L_0x0036:
            java.lang.String r0 = "classic_v2"
        L_0x0038:
            X.8bb r0 = X.C358878bc.A01(r0, r5, r5, r5, r5)
            X.8bh r1 = r0.A05
            if (r1 == 0) goto L_0x0051
            android.view.View r0 = r13.itemView
            android.content.Context r0 = X.AnonymousClass7TE.A0S(r0)
            X.0qq r0 = X.AnonymousClass0qo.A00(r0)
            android.graphics.Typeface r0 = X.AnonymousClass91U.A01(r0, r1)
            r4.setTypeface(r0)
        L_0x0051:
            com.instagram.common.ui.base.IgTextView r1 = r13.A03
            java.lang.String r0 = r2.getTitle()
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r2 = r13.A02
            com.instagram.api.schemas.FormattedString r0 = r6.C2X()
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x006a
        L_0x0068:
            java.lang.String r0 = ""
        L_0x006a:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r2.setText(r0)
            java.lang.CharSequence r0 = r2.getText()
            X.0qQ.A07(r0)
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0081
            r0 = 8
        L_0x0081:
            r2.setVisibility(r0)
            X.1Xj r2 = r13.A05
            if (r2 == 0) goto L_0x009b
            X.0iw r1 = r13.A00
            com.instagram.common.session.UserSession r0 = r13.A01
            X.C52086GEg.A0c(r1, r0, r2, r3, r14)
            android.view.View r2 = r13.itemView
            r1 = 10
        L_0x0093:
            X.IBj r0 = new X.IBj
            r0.<init>(r14, r1, r3, r13)
            X.AnonymousClass0fU.A00(r0, r2)
        L_0x009b:
            return
        L_0x009c:
            boolean r0 = r13 instanceof X.C54594HKd
            if (r0 == 0) goto L_0x015e
            X.HKd r13 = (X.C54594HKd) r13
            X.0qQ.A0B(r3, r5)
            java.lang.Object r4 = X.00k.A0O(r3, r14)
            com.instagram.api.schemas.CreatorViewerSignalModel r4 = (com.instagram.api.schemas.CreatorViewerSignalModel) r4
            if (r4 == 0) goto L_0x009b
            com.instagram.api.schemas.CreatorViewerSignalDetails r0 = r4.Awl()
            com.instagram.api.schemas.CreatorViewerSignalPlainDetails r9 = r0.Bcu()
            if (r9 == 0) goto L_0x009b
            java.lang.String r8 = r9.BE9()
            if (r8 == 0) goto L_0x0105
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r13.A04
            r0 = 33
            X.IwK r0 = X.C58711IwK.A00(r13, r0)
            X.0t0 r7 = X.AnonymousClass0eN.A01(r0)
            java.lang.Integer r0 = X.C14091Tpi.A05(r8)     // Catch:{ Exception -> 0x00e3 }
            if (r0 == 0) goto L_0x00dc
            android.content.Context r1 = X.DbS.A07(r13)     // Catch:{ Exception -> 0x00e3 }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x00e3 }
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0102
        L_0x00dc:
            java.lang.Object r0 = r7.getValue()     // Catch:{ Exception -> 0x00e3 }
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0     // Catch:{ Exception -> 0x00e3 }
            goto L_0x0102
        L_0x00e3:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Failed to get drawable resource id "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ". Exception "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r2, r0, r1)
            java.lang.String r1 = "RecipeSheetDefaultItemViewHolderKt"
            r0 = 0
            X.0kD.A07(r1, r2, r0)
            java.lang.Object r0 = r7.getValue()
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
        L_0x0102:
            r6.setImageDrawable(r0)
        L_0x0105:
            com.instagram.common.ui.base.IgTextView r2 = r13.A02
            com.instagram.api.schemas.FormattedString r0 = r9.C2X()
            if (r0 == 0) goto L_0x0113
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x0115
        L_0x0113:
            java.lang.String r0 = ""
        L_0x0115:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r2.setText(r0)
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165259(0x7f07004b, float:1.794473E38)
            float r1 = r1.getDimension(r0)
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r13.A04
            r0.setRadius(r1)
            r0.setStrokeEnabled(r5)
            com.instagram.common.ui.base.IgTextView r1 = r13.A03
            java.lang.String r0 = r4.getTitle()
            r1.setText(r0)
            java.lang.CharSequence r0 = r2.getText()
            X.0qQ.A07(r0)
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x014a
            r0 = 8
        L_0x014a:
            r2.setVisibility(r0)
            X.1Xj r2 = r13.A05
            if (r2 == 0) goto L_0x009b
            X.0iw r1 = r13.A00
            com.instagram.common.session.UserSession r0 = r13.A01
            X.C52086GEg.A0c(r1, r0, r2, r3, r14)
            android.view.View r2 = r13.itemView
            r1 = 9
            goto L_0x0093
        L_0x015e:
            X.HKf r13 = (X.C54596HKf) r13
            X.0qQ.A0B(r3, r5)
            java.lang.Object r6 = X.00k.A0O(r3, r14)
            com.instagram.api.schemas.CreatorViewerSignalModel r6 = (com.instagram.api.schemas.CreatorViewerSignalModel) r6
            if (r6 == 0) goto L_0x009b
            com.instagram.api.schemas.CreatorViewerSignalDetails r0 = r6.Awl()
            com.instagram.api.schemas.CreatorViewerSignalAudioDetails r2 = r0.Ada()
            if (r2 == 0) goto L_0x009b
            com.instagram.api.schemas.TrackOrOriginalSoundSchemaIntf r11 = r2.Adg()
            if (r11 == 0) goto L_0x0213
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r8 = r13.A08
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r8.setScaleType(r0)
            com.instagram.common.ui.base.IgTextView r1 = r13.A05
            com.instagram.api.schemas.FormattedString r0 = r2.C2X()
            if (r0 == 0) goto L_0x0190
            java.lang.String r0 = r0.getText()
            if (r0 != 0) goto L_0x0192
        L_0x0190:
            java.lang.String r0 = ""
        L_0x0192:
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            r1.setText(r0)
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            float r0 = r1.getDimension(r0)
            r8.setRadius(r0)
            com.instagram.api.schemas.TrackData r0 = r11.C92()
            r7 = 8
            if (r0 == 0) goto L_0x0259
            com.instagram.api.schemas.TrackData r4 = r11.C92()
            if (r4 == 0) goto L_0x0213
            com.instagram.common.typedurl.ImageUrl r0 = r4.Arq()
            if (r0 == 0) goto L_0x01c7
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.0iw r0 = r13.A02
            r8.setUrl(r1, r0)
        L_0x01c7:
            com.instagram.common.ui.base.IgTextView r9 = r13.A06
            java.lang.String r10 = r4.getDisplayArtist()
            java.lang.String r8 = ""
            if (r10 != 0) goto L_0x01d2
            r10 = r8
        L_0x01d2:
            java.lang.String r0 = r4.getTitle()
            if (r0 == 0) goto L_0x01d9
            r8 = r0
        L_0x01d9:
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            r2 = 1
            java.lang.String r0 = X.DbV.A0w(r1, r10, r8, r0)
            X.0qQ.A07(r0)
            r9.setText(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A04
            com.instagram.api.schemas.TrackMetadata r0 = r11.BSi()
            if (r0 == 0) goto L_0x0200
            java.lang.Boolean r0 = r0.Cde()
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r2)
            if (r0 == 0) goto L_0x0200
            r7 = 0
        L_0x0200:
            r1.setVisibility(r7)
            com.instagram.api.schemas.TrackMetadata r0 = r11.BSi()
            if (r0 == 0) goto L_0x020d
            boolean r5 = r0.isBookmarked()
        L_0x020d:
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = X.LT9.A03(r4, r5)
        L_0x0211:
            r13.A00 = r0
        L_0x0213:
            com.instagram.common.ui.base.IgTextView r1 = r13.A07
            java.lang.String r0 = r6.getTitle()
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r4 = r13.A05
            java.lang.CharSequence r0 = r4.getText()
            X.0qQ.A07(r0)
            int r1 = r0.length()
            r2 = 0
            r0 = 0
            if (r1 != 0) goto L_0x022f
            r0 = 8
        L_0x022f:
            r4.setVisibility(r0)
            android.view.ViewGroup r1 = r13.A01
            com.instagram.common.ui.base.IgTextView r0 = r13.A06
            java.lang.CharSequence r0 = r0.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0245
            r2 = 8
        L_0x0245:
            r1.setVisibility(r2)
            X.1Xj r2 = r13.A09
            if (r2 == 0) goto L_0x009b
            X.0iw r1 = r13.A02
            com.instagram.common.session.UserSession r0 = r13.A03
            X.C52086GEg.A0c(r1, r0, r2, r3, r14)
            android.view.View r2 = r13.itemView
            r1 = 8
            goto L_0x0093
        L_0x0259:
            com.instagram.api.schemas.OriginalSoundDataIntf r0 = r11.BZA()
            if (r0 == 0) goto L_0x0213
            com.instagram.api.schemas.OriginalSoundDataIntf r2 = r11.BZA()
            if (r2 == 0) goto L_0x0213
            com.instagram.user.model.User r0 = r2.BEv()
            com.instagram.common.typedurl.ImageUrl r0 = r0.Bh3()
            com.instagram.common.typedurl.SimpleImageUrl r1 = new com.instagram.common.typedurl.SimpleImageUrl
            r1.<init>(r0)
            X.0iw r0 = r13.A02
            r8.setUrl(r1, r0)
            com.instagram.common.ui.base.IgTextView r8 = r13.A06
            com.instagram.user.model.User r0 = r2.BEv()
            java.lang.String r5 = r0.getUsername()
            java.lang.String r4 = r2.getOriginalAudioTitle()
            android.view.View r0 = r13.itemView
            android.content.res.Resources r1 = X.DbU.A05(r0)
            r0 = 2131964456(0x7f133228, float:1.9565694E38)
            java.lang.String r0 = X.DbV.A0w(r1, r5, r4, r0)
            X.0qQ.A07(r0)
            r8.setText(r0)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r13.A04
            com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf r0 = r2.AqB()
            boolean r0 = r0.isTrendingInClips()
            if (r0 == 0) goto L_0x02a5
            r7 = 0
        L_0x02a5:
            r1.setVisibility(r7)
            com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf r0 = r2.AqB()
            boolean r1 = r0.isBookmarked()
            r0 = 0
            com.instagram.clips.model.metadata.AudioPageMetadata r0 = X.LT9.A01(r0, r2, r1)
            goto L_0x0211
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53077GiA.onBindViewHolder(X.3kE, int):void");
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-806301659);
        int size = this.A04.size();
        AnonymousClass0fD.A0A(125559602, A032);
        return size;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 == null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int getItemViewType(int r4) {
        /*
            r3 = this;
            r0 = -1699869895(0xffffffff9aae0b39, float:-7.1982844E-23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.util.ArrayList r0 = r3.A04
            java.lang.Object r0 = X.00k.A0O(r0, r4)
            com.instagram.api.schemas.CreatorViewerSignalModel r0 = (com.instagram.api.schemas.CreatorViewerSignalModel) r0
            if (r0 == 0) goto L_0x002c
            com.instagram.api.schemas.CreatorViewerSignalDetails r1 = r0.Awl()
            if (r1 == 0) goto L_0x002c
            com.instagram.api.schemas.CreatorViewerSignalAudioDetails r0 = r1.Ada()
            if (r0 == 0) goto L_0x0025
            r1 = 3
        L_0x001e:
            r0 = -1685941699(0xffffffff9b82923d, float:-2.16012E-22)
            X.AnonymousClass0fD.A0A(r0, r2)
            return r1
        L_0x0025:
            com.instagram.api.schemas.CreatorViewerSignalPlainDetails r0 = r1.Bcu()
            r1 = 1
            if (r0 != 0) goto L_0x001e
        L_0x002c:
            r1 = 2
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53077GiA.getItemViewType(int):int");
    }
}
