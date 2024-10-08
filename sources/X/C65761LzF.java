package X;

import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import java.util.HashMap;

/* renamed from: X.LzF  reason: case insensitive filesystem */
public final class C65761LzF implements X83 {
    public final int A00;
    public final Object A01;

    public C65761LzF(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, com.instagram.business.promote.model.AudienceGeoLocation] */
    public static AudienceGeoLocation A00(AudienceGeoLocation audienceGeoLocation, int i) {
        String str = audienceGeoLocation.A06;
        String str2 = audienceGeoLocation.A05;
        AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
        double d = audienceGeoLocation.A00;
        double d2 = audienceGeoLocation.A01;
        String str3 = audienceGeoLocation.A04;
        String str4 = audienceGeoLocation.A08;
        String str5 = audienceGeoLocation.A07;
        ? obj = new Object();
        obj.A06 = str;
        obj.A05 = str2;
        obj.A03 = adGeoLocationType;
        obj.A00 = d;
        obj.A01 = d2;
        obj.A02 = i;
        obj.A04 = str3;
        obj.A08 = str4;
        obj.A07 = str5;
        return obj;
    }

    public static void A01(C14724U4o u4o, Object obj, int i) {
        u4o.setOnSliderChangeListener(new C65761LzF(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        X.27r.A08(r2, r3, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0079, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0015, code lost:
        if (r3.A0J() == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        X.27r.A03(r1, X.C59725JVj.POST_CAPTURE, r3, "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_SLIDER", false, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        r0.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x011d, code lost:
        r0.EEp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0120, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void DAc() {
        /*
            r7 = this;
            int r0 = r7.A00
            switch(r0) {
                case 0: goto L_0x0020;
                case 1: goto L_0x0021;
                case 2: goto L_0x0121;
                case 3: goto L_0x0037;
                case 4: goto L_0x007a;
                case 5: goto L_0x0097;
                case 6: goto L_0x00b5;
                case 7: goto L_0x00ff;
                case 8: goto L_0x00d3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            X.LkY r0 = (X.C64933LkY) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.27r r3 = X.27p.A01(r0)
            X.28t r1 = X.28t.A06
        L_0x0011:
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0020
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            java.lang.String r4 = "FEED_COLOR_FILTER_STRENGTH_SINGLE_IN_CAROUSEL_SLIDER"
            r5 = 0
            r6 = r5
            X.27r.A03(r1, r2, r3, r4, r5, r6)
        L_0x0020:
            return
        L_0x0021:
            java.lang.Object r0 = r7.A01
            X.LkZ r0 = (X.C64934LkZ) r0
            com.instagram.common.session.UserSession r0 = r0.A07
            X.27r r3 = X.27p.A01(r0)
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0020
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 0
            java.lang.String r0 = "FEED_COLOR_FILTER_STRENGTH_ALL_CAROUSEL_SLIDER"
            goto L_0x0076
        L_0x0037:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.Object r2 = r7.A01
            X.Lkd r2 = (X.C64938Lkd) r2
            if (r0 == 0) goto L_0x0050
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0058
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r2.A02
            r0.getClass()
            X.JTT.A1M(r0)
        L_0x0050:
            X.8Kg r0 = r2.A01
            r0.getClass()
            r0.EEp()
        L_0x0058:
            com.instagram.creation.base.CreationSession r0 = r2.A09
            java.lang.String r0 = r0.A0C
            boolean r1 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.common.session.UserSession r0 = r2.A08
            X.27r r3 = X.27p.A01(r0)
            if (r1 == 0) goto L_0x006b
            X.28t r1 = X.28t.A05
            goto L_0x0011
        L_0x006b:
            X.4yP r0 = r3.A0J()
            if (r0 == 0) goto L_0x0020
            X.JVj r2 = X.C59725JVj.POST_CAPTURE
            r1 = 0
            java.lang.String r0 = "FEED_COLOR_FILTER_STRENGTH_SLIDER"
        L_0x0076:
            X.27r.A08(r2, r3, r0, r1)
            return
        L_0x007a:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.Object r1 = r7.A01
            X.Lke r1 = (X.C64939Lke) r1
            if (r0 == 0) goto L_0x0093
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0020
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A03
            r0.getClass()
            X.JTT.A1M(r0)
        L_0x0093:
            X.8Kg r0 = r1.A02
            goto L_0x011a
        L_0x0097:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.Object r1 = r7.A01
            X.Lka r1 = (X.C64935Lka) r1
            if (r0 == 0) goto L_0x00b2
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0020
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A03
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A03
            X.JTT.A1M(r0)
        L_0x00b2:
            X.8Kg r0 = r1.A02
            goto L_0x011a
        L_0x00b5:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.Object r1 = r7.A01
            X.Lkb r1 = (X.C64936Lkb) r1
            if (r0 == 0) goto L_0x00d0
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0020
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A03
            r0.getClass()
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A03
            X.JTT.A1M(r0)
        L_0x00d0:
            X.8Kg r0 = r1.A02
            goto L_0x011a
        L_0x00d3:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.String r2 = "Required value was null."
            java.lang.Object r1 = r7.A01
            X.Lkf r1 = (X.C64940Lkf) r1
            if (r0 != 0) goto L_0x00eb
            X.8Kg r0 = r1.A0F
            if (r0 != 0) goto L_0x011d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00eb:
            boolean r0 = r1.A0L
            if (r0 == 0) goto L_0x0020
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A0G
            if (r0 == 0) goto L_0x0148
            X.JTT.A1M(r0)
            X.8Kg r0 = r1.A0F
            if (r0 != 0) goto L_0x011d
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        L_0x00ff:
            int r1 = X.C63523KyY.A00
            r0 = 2
            boolean r0 = X.JTQ.A1P(r1, r0)
            java.lang.Object r1 = r7.A01
            X.Lkc r1 = (X.C64937Lkc) r1
            if (r0 == 0) goto L_0x0118
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0020
            com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r0 = r1.A04
            r0.getClass()
            X.JTT.A1M(r0)
        L_0x0118:
            X.8Kg r0 = r1.A03
        L_0x011a:
            r0.getClass()
        L_0x011d:
            r0.EEp()
            return
        L_0x0121:
            java.lang.Object r1 = r7.A01
            X.K6M r1 = (X.K6M) r1
            X.0eM r0 = r1.A06
            X.27r r2 = X.C51971G9r.A0g(r0)
            X.0eM r0 = r1.A03
            java.lang.Object r0 = r0.getValue()
            X.Jhu r0 = (X.C60237Jhu) r0
            com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore r0 = r0.A03
            X.0Ud r0 = r0.A0b
            r0.getValue()
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            X.28t r0 = r0.A0A
            java.lang.String r3 = "AUDIO_ENHANCE_SLIDER_ADJUST"
            r4 = 0
            r5 = r4
            X.27r.A03(r0, r1, r2, r3, r4, r5)
            return
        L_0x0148:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65761LzF.DAc():void");
    }

    public final /* synthetic */ void DAh() {
        FilterGroupModel filterGroupModel;
        switch (this.A00) {
            case 3:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64938Lkd lkd = (C64938Lkd) this.A01;
                    if (lkd.A03) {
                        filterGroupModel = lkd.A02;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64939Lke lke = (C64939Lke) this.A01;
                    if (lke.A04) {
                        filterGroupModel = lke.A03;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64935Lka lka = (C64935Lka) this.A01;
                    if (lka.A04) {
                        lka.A03.getClass();
                        filterGroupModel = lka.A03;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 6:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64936Lkb lkb = (C64936Lkb) this.A01;
                    if (lkb.A04) {
                        lkb.A03.getClass();
                        filterGroupModel = lkb.A03;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 7:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64937Lkc lkc = (C64937Lkc) this.A01;
                    if (lkc.A05) {
                        filterGroupModel = lkc.A04;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    C64940Lkf lkf = (C64940Lkf) this.A01;
                    if (lkf.A0L) {
                        filterGroupModel = lkf.A0G;
                        if (filterGroupModel == null) {
                            throw AnonymousClass7TE.A0y();
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        filterGroupModel.getClass();
        filterGroupModel.EWl(19, false);
    }

    public final void DaL(int i) {
        Object value;
        ULF ulf;
        AudienceGeoLocation audienceGeoLocation;
        AudienceGeoLocation audienceGeoLocation2;
        C353998Kg r0;
        switch (this.A00) {
            case 0:
                U92 u92 = (U92) ((VMV) this.A01).A00.A0D.getValue();
                int A0I = C51971G9r.A0I(W2x.A02, i);
                if (A0I != u92.A0A().A01) {
                    05G r2 = u92.A02.A04;
                    do {
                        value = r2.getValue();
                        ulf = (ULF) value;
                        AudienceGeoLocation audienceGeoLocation3 = u92.A0A().A02;
                        audienceGeoLocation = null;
                        if (audienceGeoLocation3 != null) {
                            audienceGeoLocation2 = A00(audienceGeoLocation3, A0I);
                        } else {
                            audienceGeoLocation2 = null;
                        }
                        AudienceGeoLocation audienceGeoLocation4 = u92.A0A().A03;
                        if (audienceGeoLocation4 != null) {
                            audienceGeoLocation = A00(audienceGeoLocation4, A0I);
                        }
                    } while (!r2.AIY(value, ULF.A00(audienceGeoLocation, audienceGeoLocation2, ulf.A05, ulf.A04, ulf.A00, A0I, ulf.A06)));
                    return;
                }
                return;
            case 1:
                C64934LkZ lkZ = (C64934LkZ) this.A01;
                lkZ.A01 = i;
                C64934LkZ.A00(lkZ, i);
                if (JTQ.A1P(C63523KyY.A00, 2)) {
                    r0 = lkZ.A03;
                    break;
                } else {
                    return;
                }
            case 2:
                ((C60237Jhu) ((K6M) this.A01).A03.getValue()).A00(((float) i) / 100.0f);
                return;
            case 3:
                C64938Lkd lkd = (C64938Lkd) this.A01;
                lkd.A00 = i;
                if (!lkd.A04) {
                    C64938Lkd.A00(lkd.A02, i);
                    if (JTQ.A1P(C63523KyY.A00, 2)) {
                        r0 = lkd.A01;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 4:
                C64939Lke lke = (C64939Lke) this.A01;
                lke.A00 = i;
                if (!lke.A05) {
                    C64939Lke.A01(lke, i);
                    if (JTQ.A1P(C63523KyY.A00, 2)) {
                        r0 = lke.A02;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 5:
                C64935Lka lka = (C64935Lka) this.A01;
                lka.A00 = i;
                C64935Lka.A00(lka, i);
                if (!lka.A05 && JTQ.A1P(C63523KyY.A00, 2)) {
                    r0 = lka.A02;
                    break;
                } else {
                    return;
                }
            case 6:
                C64936Lkb lkb = (C64936Lkb) this.A01;
                lkb.A00 = i;
                C64936Lkb.A00(lkb, i);
                if (!lkb.A05 && JTQ.A1P(C63523KyY.A00, 2)) {
                    r0 = lkb.A02;
                    break;
                } else {
                    return;
                }
            case 7:
                C64937Lkc lkc = (C64937Lkc) this.A01;
                lkc.A00 = i;
                if (!lkc.A06) {
                    C64937Lkc.A00(lkc, i);
                    if (JTQ.A1P(C63523KyY.A00, 2)) {
                        r0 = lkc.A03;
                        break;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                C64940Lkf lkf = (C64940Lkf) this.A01;
                if (lkf.A0J) {
                    lkf.A05 = i;
                } else {
                    lkf.A00 = i;
                }
                C64940Lkf.A00(lkf);
                if (!lkf.A0M && JTQ.A1P(C63523KyY.A00, 2)) {
                    r0 = lkf.A0F;
                    if (r0 == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
                break;
            default:
                C64933LkY lkY = (C64933LkY) this.A01;
                lkY.A00 = i;
                FilterGroupModel filterGroupModel = lkY.A02;
                if (filterGroupModel == null || !((FilterGroupModelImpl) filterGroupModel).A04) {
                    MXP mxp = lkY.A01;
                    mxp.getClass();
                    mxp.EWp(lkY.A00);
                    HashMap hashMap = lkY.A03;
                    VideoFilter B5q = lkY.A01.B5q();
                    B5q.getClass();
                    hashMap.put(Integer.valueOf(B5q.A0O), Integer.valueOf(lkY.A00));
                } else {
                    ColorFilter colorFilter = (ColorFilter) filterGroupModel.B5u(17);
                    if (colorFilter != null) {
                        colorFilter.A00 = ((float) i) / 100.0f;
                    }
                }
                MXP mxp2 = lkY.A01;
                mxp2.getClass();
                mxp2.CnC();
                return;
        }
        r0.getClass();
        r0.EEp();
    }
}
