package X;

import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.model.keyword.KeywordRecommendations;
import org.webrtc.EglBase14Impl;

/* renamed from: X.5ov  reason: invalid class name and case insensitive filesystem */
public final class C295795ov {
    public C295805ow A00;
    public C298725tv A01;
    public C298715tu A02;
    public C295825oy A03;
    public C298765tz A04;
    public C298745tx A05;
    public C298795u2 A06;
    public C298805u4 A07;
    public C298775u0 A08;
    public C298755ty A09;
    public 1Xj A0A;
    public 1Xj A0B;
    public AnonymousClass3UH A0C;
    public C298785u1 A0D;
    public KeywordRecommendations A0E;
    public Object A0F;
    public C17674Vc5 A0G;

    public C295795ov(C295805ow r2, C295825oy r3, C298795u2 r4, 1Xj r5) {
        this.A02 = null;
        this.A0A = null;
        this.A0C = null;
        this.A01 = null;
        this.A05 = null;
        this.A09 = null;
        this.A04 = null;
        this.A08 = null;
        this.A03 = r3;
        this.A0D = null;
        this.A0B = r5;
        this.A06 = r4;
        this.A0E = null;
        this.A07 = null;
        this.A00 = r2;
    }

    public final String A00() {
        1Xj r0;
        switch (this.A00.ordinal()) {
            case 1:
                r0 = this.A0A;
                break;
            case 2:
                C298715tu r02 = this.A02;
                0qQ.A0A(r02);
                return r02.A01;
            case 8:
                AnonymousClass3UH r03 = this.A0C;
                0qQ.A0A(r03);
                return r03.getId();
            case 15:
                C17674Vc5 vc5 = this.A0G;
                0qQ.A0A(vc5);
                return vc5.A04;
            case 17:
                C298745tx r04 = this.A05;
                0qQ.A0A(r04);
                String id = r04.A00.getId();
                if (id != null) {
                    return id;
                }
                throw new IllegalStateException("Required value was null.");
            case EglBase14Impl.EGLExt_SDK_VERSION:
                C298755ty r05 = this.A09;
                0qQ.A0A(r05);
                return r05.A02;
            case 20:
                C298765tz r06 = this.A04;
                0qQ.A0A(r06);
                return r06.A00;
            case 24:
                0qQ.A0A(this.A08);
                return "map_tile_with_pins";
            case 25:
                C295825oy r07 = this.A03;
                0qQ.A0A(r07);
                return r07.A0A;
            case 27:
                C298785u1 r08 = this.A0D;
                0qQ.A0A(r08);
                return r08.A07;
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                C298795u2 r09 = this.A06;
                0qQ.A0A(r09);
                return r09.A03;
            case 30:
                KeywordRecommendations keywordRecommendations = this.A0E;
                0qQ.A0A(keywordRecommendations);
                return keywordRecommendations.A00;
            case 32:
                r0 = this.A0B;
                break;
            default:
                return null;
        }
        0qQ.A0A(r0);
        return r0.getId();
    }

    public final void A01() {
        C295805ow r0;
        1Xj r1 = this.A02;
        if (r1 != null) {
            r0 = C295805ow.CHANNEL;
        } else {
            r1 = this.A0A;
            if (r1 != null) {
                r0 = C295805ow.MEDIA;
            } else {
                r1 = this.A0C;
                if (r1 != null) {
                    r0 = C295805ow.ACCOUNT_RECS_AS_NETEGO;
                } else {
                    C298725tv r12 = this.A01;
                    if (r12 != null) {
                        this.A00 = C295805ow.ACCOUNT_REC;
                        C17674Vc5 vc5 = new C17674Vc5(r12);
                        this.A0G = vc5;
                        this.A0F = vc5;
                        return;
                    }
                    r1 = this.A05;
                    if (r1 != null) {
                        r0 = C295805ow.IGTV_MEDIA;
                    } else {
                        r1 = this.A09;
                        if (r1 != null) {
                            r0 = C295805ow.SHOPPING;
                        } else {
                            r1 = this.A04;
                            if (r1 != null) {
                                r0 = C295805ow.DESTINATION_PIVOT;
                            } else {
                                r1 = this.A08;
                                if (r1 != null) {
                                    r0 = C295805ow.MEDIA_LOCATION_MAP;
                                } else {
                                    r1 = this.A03;
                                    if (r1 != null) {
                                        r0 = C295805ow.CLIPS;
                                    } else {
                                        r1 = this.A0D;
                                        if (r1 != null) {
                                            r0 = C295805ow.GUIDES;
                                        } else {
                                            r1 = this.A06;
                                            if (r1 != null) {
                                                r0 = C295805ow.INTEREST_KEYWORD_RECOMMENDATION;
                                            } else {
                                                r1 = this.A0E;
                                                if (r1 != null) {
                                                    r0 = C295805ow.INTEREST_KEYWORD_RECOMMENDATION_LIST;
                                                } else {
                                                    r1 = this.A0B;
                                                    if (r1 != null) {
                                                        r0 = C295805ow.AD;
                                                    } else {
                                                        r1 = this.A07;
                                                        if (r1 != null) {
                                                            r0 = C295805ow.TOPIC_TILE;
                                                        } else {
                                                            this.A00 = C295805ow.UNKNOWN;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        this.A00 = r0;
        this.A0F = r1;
    }

    public C295795ov() {
        this(C295805ow.UNKNOWN, (C295825oy) null, (C298795u2) null, (1Xj) null);
    }
}
