package X;

import android.animation.LayoutTransition;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.discovery.mediamap.fragment.LocationListFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.UEn  reason: case insensitive filesystem */
public final class C14908UEn extends C249703kE implements AnonymousClass3N3, C20903X3u {
    public WUF A00;
    public C19265WRy A01;
    public final TextView A02;
    public final TextView A03;
    public final ShimmerFrameLayout A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final CircularImageView A07;
    public final C17896Vhn A08;
    public final C18062Vko A09;
    public final LocationListFragment A0A;
    public final GradientSpinner A0B;
    public final IgImageView[] A0C;
    public final View A0D;
    public final TextView A0E;
    public final C17626VbI A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14908UEn(ViewGroup viewGroup, AnonymousClass0iw r9, UserSession userSession, C17896Vhn vhn, C17626VbI vbI, C18062Vko vko, LocationListFragment locationListFragment) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        IgImageView[] igImageViewArr = new IgImageView[3];
        this.A0C = igImageViewArr;
        viewGroup.setLayoutTransition(new LayoutTransition());
        this.A06 = userSession;
        this.A05 = r9;
        this.A0A = locationListFragment;
        this.A09 = vko;
        this.A08 = vhn;
        this.A0F = vbI;
        this.A07 = DbU.A0X(viewGroup, R.id.location_list_item_image);
        this.A0B = (GradientSpinner) viewGroup.requireViewById(R.id.gradient_spinner);
        this.A0D = viewGroup.requireViewById(R.id.empty_location_glyph);
        this.A0E = DbU.A0G(viewGroup, R.id.location_list_item_title);
        this.A02 = DbU.A0G(viewGroup, R.id.location_list_item_category);
        this.A03 = DbU.A0G(viewGroup, R.id.location_list_item_info);
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) viewGroup.requireViewById(R.id.location_list_media_preview_shimmer);
        this.A04 = shimmerFrameLayout;
        AnonymousClass3O3 r4 = new AnonymousClass3O3();
        r4.A00.A0H = false;
        shimmerFrameLayout.A04(r4.A01());
        igImageViewArr[0] = viewGroup.requireViewById(R.id.image_1);
        igImageViewArr[1] = viewGroup.requireViewById(R.id.image_2);
        igImageViewArr[2] = viewGroup.requireViewById(R.id.image_3);
        WBG.A01(viewGroup, 21, this, locationListFragment);
    }

    /* JADX WARNING: type inference failed for: r0v15, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01b8, code lost:
        if (r14 != null) goto L_0x01ba;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02d6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.WUF r20, X.C19265WRy r21) {
        /*
            r19 = this;
            r10 = 0
            r12 = r20
            r11 = r21
            boolean r18 = X.AnonymousClass7TF.A1U(r10, r11, r12)
            r13 = r19
            r13.A00 = r12
            X.WRy r1 = r13.A01
            if (r1 == 0) goto L_0x0022
            X.Vko r0 = r13.A09
            java.lang.String r1 = r1.A01
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r1)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L_0x0022
            r0.remove(r13)
        L_0x0022:
            r13.A01 = r11
            java.lang.String r9 = r11.A01
            X.Vko r8 = r13.A09
            com.instagram.discovery.mediamap.model.MediaMapPin r7 = r8.A00(r9)
            X.Vhn r0 = r13.A08
            java.util.HashMap r0 = r0.A03
            java.lang.Object r3 = r0.get(r9)
            com.instagram.model.reels.Reel r3 = (com.instagram.model.reels.Reel) r3
            java.util.Map r0 = r8.A02
            java.lang.Object r0 = r0.get(r9)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            if (r0 == 0) goto L_0x017d
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r0.A06
            if (r0 == 0) goto L_0x017d
        L_0x0044:
            r1 = 0
            if (r3 == 0) goto L_0x017a
            com.instagram.common.typedurl.ImageUrl r0 = r3.A07()
        L_0x004b:
            r4 = 0
            r15 = 8
            if (r0 == 0) goto L_0x0160
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r13.A07
            com.instagram.common.typedurl.ImageUrl r2 = r3.A07()
        L_0x0056:
            X.0qQ.A0A(r2)
            X.0iw r0 = r13.A05
            r5.setUrl(r2, r0)
            android.view.View r0 = r13.A0D
            r0.setVisibility(r15)
        L_0x0063:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r2 = r13.A0B
            if (r3 != 0) goto L_0x0068
            r4 = 4
        L_0x0068:
            r2.setVisibility(r4)
            if (r3 == 0) goto L_0x007d
            r0 = 60
            X.WB8.A00(r2, r0, r13)
            com.instagram.common.session.UserSession r0 = r13.A06
            boolean r0 = r3.A16(r0)
            if (r0 == 0) goto L_0x015b
            r2.A04()
        L_0x007d:
            android.widget.TextView r2 = r13.A0E
            com.instagram.model.venue.LocationDict r0 = r7.A09
            com.instagram.model.venue.Venue r0 = X.C18231Vnv.A00(r0)
            com.instagram.model.venue.LocationDictIntf r0 = r0.A00
            java.lang.String r0 = r0.getName()
            r2.setText(r0)
            X.WRy r0 = r13.A01
            if (r0 == 0) goto L_0x02db
            java.lang.String r0 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r8.A00(r0)
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r2.A06
            if (r0 == 0) goto L_0x0146
            java.lang.String r4 = r0.A06
            if (r4 == 0) goto L_0x0146
            java.lang.String r0 = r2.A0C
            if (r0 == 0) goto L_0x0154
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r0 = " • "
            r3.append(r0)
            java.lang.String r0 = r2.A0C
            r3.append(r0)
            android.widget.TextView r2 = r13.A02
            java.lang.String r0 = r3.toString()
            r2.setText(r0)
        L_0x00bf:
            r2.setVisibility(r10)
        L_0x00c2:
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r7.A06
            if (r0 == 0) goto L_0x0221
            X.WRy r0 = r13.A01
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r2 = r8.A00(r0)
            com.instagram.model.venue.LocationDict r0 = r2.A09
            com.instagram.model.venue.Venue r3 = X.C18231Vnv.A00(r0)
            com.instagram.discovery.mediamap.model.LocationPageInformation r14 = r2.A06
            android.text.SpannableStringBuilder r6 = new android.text.SpannableStringBuilder
            r6.<init>()
            android.text.SpannableStringBuilder r5 = new android.text.SpannableStringBuilder
            r5.<init>()
            android.content.Context r4 = X.DbS.A07(r13)
            com.instagram.common.session.UserSession r0 = r13.A06
            java.lang.String r2 = "MEDIA_MAP"
            java.lang.String r3 = X.C18792W1y.A02(r4, r0, r3, r2)
            X.0qQ.A07(r3)
            int r2 = r3.length()
            if (r2 == 0) goto L_0x00fd
            r6.append(r3)
            r5.append(r3)
        L_0x00fd:
            if (r14 == 0) goto L_0x0101
            java.lang.Integer r1 = r14.A03
        L_0x0101:
            java.lang.String r3 = " • "
            if (r1 == 0) goto L_0x01b8
            java.lang.Integer r1 = r14.A03
            int r1 = X.JTP.A09(r1)
            if (r1 <= 0) goto L_0x01ba
            int r1 = r6.length()
            if (r1 <= 0) goto L_0x0119
            r6.append(r3)
            r5.append(r3)
        L_0x0119:
            java.lang.Integer r1 = r14.A03
            int r1 = X.JTP.A09(r1)
            android.text.SpannableString r1 = X.C18792W1y.A00(r4, r0, r1)
            r6.append(r1)
            java.lang.Integer r1 = r14.A03
            int r17 = X.JTP.A09(r1)
            java.lang.StringBuilder r16 = new java.lang.StringBuilder
            r16.<init>()
            java.util.Currency r0 = X.C18792W1y.A03(r0)
            java.lang.String r2 = r0.getSymbol()
            r1 = 0
        L_0x013a:
            r0 = r17
            if (r1 >= r0) goto L_0x01ab
            r0 = r16
            r0.append(r2)
            int r1 = r1 + 1
            goto L_0x013a
        L_0x0146:
            java.lang.String r4 = r2.A0C
            if (r4 != 0) goto L_0x0154
            android.widget.TextView r0 = r13.A02
            X.DbS.A1C(r0)
            r0.setVisibility(r15)
            goto L_0x00c2
        L_0x0154:
            android.widget.TextView r2 = r13.A02
            r2.setText(r4)
            goto L_0x00bf
        L_0x015b:
            r2.A02()
            goto L_0x007d
        L_0x0160:
            com.instagram.common.typedurl.ImageUrl r0 = r7.A00()
            if (r0 == 0) goto L_0x016e
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = r13.A07
            com.instagram.common.typedurl.ImageUrl r2 = r7.A00()
            goto L_0x0056
        L_0x016e:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r13.A07
            r0.setImageDrawable(r1)
            android.view.View r0 = r13.A0D
            r0.setVisibility(r10)
            goto L_0x0063
        L_0x017a:
            r0 = r1
            goto L_0x004b
        L_0x017d:
            X.VbI r2 = r13.A0F
            X.Vko r0 = r2.A05
            java.util.Map r0 = r0.A02
            java.lang.Object r0 = r0.get(r9)
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = (com.instagram.discovery.mediamap.model.MediaMapPin) r0
            if (r0 == 0) goto L_0x0191
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r0.A06
            if (r0 == 0) goto L_0x0191
            goto L_0x0044
        L_0x0191:
            java.util.Deque r1 = r2.A06
            boolean r0 = r1.contains(r9)
            if (r0 == 0) goto L_0x019c
            r1.removeFirstOccurrence(r9)
        L_0x019c:
            r1.addFirst(r9)
            android.os.Handler r2 = r2.A01
            r2.removeMessages(r10)
            r0 = 50
            r2.sendEmptyMessageDelayed(r10, r0)
            goto L_0x0044
        L_0x01ab:
            java.lang.String r0 = r16.toString()
            r5.append(r0)
            goto L_0x01ba
        L_0x01b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x01b8:
            if (r14 == 0) goto L_0x0210
        L_0x01ba:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r14.A01
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = r0.A01
            if (r0 == 0) goto L_0x0210
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0210
            int r2 = r6.length()
            if (r2 <= 0) goto L_0x01d4
            r6.append(r3)
            r5.append(r3)
        L_0x01d4:
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r14.A01
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A01
            r6.append(r0)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r14.A01
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A01
            r5.append(r0)
            java.lang.String r0 = " "
            r6.append(r0)
            r5.append(r0)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r14.A01
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A02
            r6.append(r0)
            com.instagram.location.surface.api.model.operationhours.LocationPageInfoPageOperationHourResponse r0 = r14.A01
            X.0qQ.A0A(r0)
            java.lang.String r0 = r0.A02
            r5.append(r0)
            int r1 = X.C51968G9o.A04(r4)
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            r0.<init>(r1)
            X.C66582MXn.A12(r6, r0, r2)
        L_0x0210:
            int r1 = r6.length()
            android.widget.TextView r0 = r13.A03
            if (r1 <= 0) goto L_0x0262
            r0.setVisibility(r10)
            r0.setText(r6)
            r0.setContentDescription(r5)
        L_0x0221:
            X.WRy r0 = r13.A01
            X.0qQ.A0A(r0)
            int r1 = r0.A00
            X.WRy r0 = r13.A01
            if (r0 == 0) goto L_0x02d6
            java.lang.String r0 = r0.A01
            com.instagram.discovery.mediamap.model.MediaMapPin r0 = r8.A00(r0)
            java.util.ArrayList r4 = r0.A0E
            if (r4 != 0) goto L_0x023d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.A0E = r4
        L_0x023d:
            r3 = 3
            int r14 = r1 * 3
            com.instagram.discovery.mediamap.model.LocationPageInformation r0 = r0.A06
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            r2 = 0
            if (r0 != 0) goto L_0x0266
            com.facebook.shimmer.ShimmerFrameLayout r1 = r13.A04
            r1.setVisibility(r10)
            r0 = r18
            r1.A06(r0)
            com.instagram.common.ui.widget.imageview.IgImageView[] r1 = r13.A0C
        L_0x0255:
            r0 = r1[r2]
            X.0qQ.A0A(r0)
            r0.A0B()
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0274
            goto L_0x0255
        L_0x0262:
            r0.setVisibility(r15)
            goto L_0x0221
        L_0x0266:
            int r1 = r4.size()
            com.facebook.shimmer.ShimmerFrameLayout r0 = r13.A04
            if (r1 >= r3) goto L_0x0298
            r0.setVisibility(r15)
            r0.A05()
        L_0x0274:
            android.view.View r2 = r13.itemView
            X.WRy r0 = r13.A01
            X.0qQ.A0A(r0)
            int r0 = r0.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.30a r1 = X.AnonymousClass30Y.A00(r11, r0, r9)
            X.WU1 r0 = r12.A04
            X.30Y r1 = X.DbU.A0a(r0, r1)
            X.2el r0 = r12.A01
            r0.A05(r2, r1)
            java.lang.String r0 = X.C18231Vnv.A01(r7)
            r8.A03(r13, r0)
            return
        L_0x0298:
            r0.setVisibility(r10)
            r0.A05()
            com.instagram.common.ui.widget.imageview.IgImageView[] r6 = r13.A0C
        L_0x02a0:
            r5 = r6[r2]
            java.lang.Object r10 = r4.get(r2)
            com.instagram.discovery.mediamap.model.MediaMapPinPreview r10 = (com.instagram.discovery.mediamap.model.MediaMapPinPreview) r10
            X.0qQ.A0A(r5)
            com.instagram.common.typedurl.ImageUrl r1 = r10.A00
            X.0qQ.A07(r1)
            X.0iw r0 = r13.A05
            r5.setUrl(r1, r0)
            r0 = 22
            X.WBG.A01(r5, r0, r13, r10)
            int r0 = r14 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r10.A01
            X.30a r1 = X.AnonymousClass30Y.A00(r10, r1, r0)
            X.WU2 r0 = r12.A05
            X.30Y r1 = X.DbU.A0a(r0, r1)
            X.2el r0 = r12.A01
            r0.A05(r5, r1)
            int r2 = r2 + 1
            if (r2 >= r3) goto L_0x0274
            goto L_0x02a0
        L_0x02d6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x02db:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14908UEn.A00(X.WUF, X.WRy):void");
    }

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A07);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A07;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A07);
    }

    public final GradientSpinner Bkt() {
        return this.A0B;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A07.setVisibility(4);
    }

    public final void DXG(MediaMapPin mediaMapPin) {
        WUF wuf;
        C19265WRy wRy = this.A01;
        if (wRy != null && (wuf = this.A00) != null) {
            0qQ.A0A(wuf);
            A00(wuf, wRy);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A07.setVisibility(0);
    }
}
