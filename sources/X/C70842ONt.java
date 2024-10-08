package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.List;

/* renamed from: X.ONt  reason: case insensitive filesystem */
public final class C70842ONt {
    public final AnonymousClass2Ep A00;
    public final C68161N3b A01;
    public final Integer A02;

    public C70842ONt(AnonymousClass2Ep r2, C68161N3b n3b, Integer num) {
        0qQ.A0B(num, 2);
        this.A01 = n3b;
        this.A02 = num;
        this.A00 = r2;
    }

    public final String A00() {
        int intValue = this.A01.A04.intValue();
        if (intValue == 4 || intValue == 0) {
            return "direct_v2_message";
        }
        if (intValue == 1) {
            return AnonymousClass000.A00(590);
        }
        if (intValue == 2 || intValue == 3) {
            return "direct_v2_delete_item";
        }
        throw AnonymousClass7TE.A1K();
    }

    public final String A01() {
        String str;
        AnonymousClass2Ep r0;
        String str2;
        Uri.Builder path = new Uri.Builder().path("direct_v2");
        C68161N3b n3b = this.A01;
        C74249Prd prd = n3b.A02;
        if (!(prd instanceof PDI) && !N8Y.A00(0, prd) && !N8Y.A00(1, prd) && ((r0 = this.A00) == null || r0.C6a() != 29)) {
            int intValue = n3b.A04.intValue();
            if (intValue == 2 || intValue == 3) {
                str2 = "dx";
            } else {
                str2 = "x";
            }
            path.appendQueryParameter(str2, n3b.A07);
        }
        int intValue2 = n3b.A04.intValue();
        if (intValue2 == 2 || intValue2 == 3) {
            str = "did";
        } else {
            str = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }
        return DbT.A10(DbV.A08(path, str, n3b.A0A));
    }

    public final String A02() {
        Integer num;
        AnonymousClass2Ep r0 = this.A00;
        if (r0 != null && r0.C6a() == 29 && ((num = this.A01.A04) == AnonymousClass05K.A00 || num == AnonymousClass05K.A01)) {
            return "direct_v2_broadcast_chat_new_message";
        }
        C68161N3b n3b = this.A01;
        Integer num2 = n3b.A04;
        if (num2 == AnonymousClass05K.A0C || num2 == AnonymousClass05K.A0N) {
            return "direct_v2_delete_item";
        }
        C74249Prd prd = n3b.A02;
        if (prd instanceof N8W) {
            int intValue = ((N8W) prd).A00.intValue();
            if (intValue == 0 || intValue == 4) {
                return "direct_v2_text";
            }
            if (intValue == 1) {
                return "direct_v2_generic";
            }
            if (intValue != 2) {
                if (intValue == 3) {
                    return "direct_v2_gift_text";
                }
                throw AnonymousClass7TE.A1K();
            }
        } else if (N8Y.A00(0, prd) || N8Y.A00(1, prd)) {
            return "direct_v2_user_reaction";
        } else {
            if (!(prd instanceof PDI)) {
                if (N8Z.A00(0, prd)) {
                    List list = (List) ((N8Z) prd).A01;
                    if (list.size() == 1) {
                        switch (((C69310NjB) list.get(0)).ordinal()) {
                            case 0:
                            case 1:
                                break;
                            case 2:
                            case 3:
                                return "direct_v2_raven";
                            case 4:
                                return "direct_v2_gif";
                            case 5:
                                return "direct_v2_sticker";
                            case 6:
                                return "direct_v2_voice_message";
                            default:
                                throw AnonymousClass7TE.A1K();
                        }
                    }
                    return "direct_v2_media";
                } else if (prd instanceof N8X) {
                    N8X n8x = (N8X) prd;
                    switch (n8x.A03.ordinal()) {
                        case 0:
                            int ordinal = n8x.A02.ordinal();
                            if (ordinal == 3) {
                                return "direct_v2_reel_share";
                            }
                            if (ordinal == 0) {
                                return "direct_v2_story_share";
                            }
                            if (ordinal == 2) {
                                return "direct_v2_reel_reaction";
                            }
                            if (ordinal == 1) {
                                return "direct_v2_reel_mention";
                            }
                            return null;
                        case 1:
                            return "direct_v2_clips_share";
                        case 2:
                            return "direct_v2_media_share";
                        case 3:
                            return "direct_v2_profile_share";
                        case 4:
                            return "direct_v2_location_share";
                        case 5:
                            return "direct_v2_ar_effect_share";
                        case 6:
                            return "direct_v2_note_reply";
                        default:
                            throw AnonymousClass7TE.A1K();
                    }
                } else if (N8Z.A00(1, prd)) {
                    int ordinal2 = ((C272074k3) ((N8Z) prd).A01).ordinal();
                    if (ordinal2 == 8) {
                        return "direct_raven_screenshot";
                    }
                    if (ordinal2 == 9) {
                        return "direct_raven_replayed";
                    }
                    return null;
                } else if (N8Y.A00(2, prd)) {
                    return "direct_v2_default";
                } else {
                    throw AnonymousClass7TE.A1K();
                }
            }
        }
        return "direct_v2_like";
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007b, code lost:
        if (r0 == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r2 = r5.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A03() {
        /*
            r5 = this;
            X.2Ep r0 = r5.A00
            r3 = 4
            r4 = 0
            if (r0 == 0) goto L_0x003f
            int r1 = r0.C6a()
            r0 = 29
            if (r1 != r0) goto L_0x003f
            X.N3b r2 = r5.A01
            java.lang.Integer r1 = r2.A04
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x001a
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x003f
        L_0x001a:
            r4 = 852(0x354, float:1.194E-42)
        L_0x001c:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = r2.A0A
            r3.append(r0)
            r1 = 95
            r3.append(r1)
            java.lang.String r0 = r2.A07
            r3.append(r0)
            r3.append(r1)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r0 = r2.A09
            java.lang.String r0 = X.AnonymousClass7TF.A0l(r0, r3)
            return r0
        L_0x003f:
            X.N3b r2 = r5.A01
            java.lang.Integer r0 = r2.A04
            int r1 = r0.intValue()
            if (r1 == r3) goto L_0x005b
            if (r1 == r4) goto L_0x007e
            r0 = 1
            if (r1 == r0) goto L_0x007e
            r0 = 2
            if (r1 == r0) goto L_0x0059
            r0 = 3
            if (r1 == r0) goto L_0x0059
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0059:
            r4 = 2
            goto L_0x001c
        L_0x005b:
            java.lang.String r1 = r5.A02()
            java.lang.String r0 = "direct_raven_replayed"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x006a
            r4 = 24
            goto L_0x001c
        L_0x006a:
            java.lang.String r0 = "direct_raven_screenshot"
            boolean r0 = X.0qQ.A0K(r1, r0)
            r4 = 25
            goto L_0x007b
        L_0x0073:
            java.lang.String r0 = "direct_v2_generic"
            boolean r0 = r1.equals(r0)
            r4 = 28
        L_0x007b:
            if (r0 != 0) goto L_0x001c
            goto L_0x008b
        L_0x007e:
            java.lang.String r1 = r5.A02()
            if (r1 == 0) goto L_0x008b
            int r0 = r1.hashCode()
            switch(r0) {
                case -2099745750: goto L_0x00b3;
                case -1349301866: goto L_0x00bc;
                case -863379312: goto L_0x00c5;
                case -672464592: goto L_0x008d;
                case -669710185: goto L_0x00ce;
                case -570464548: goto L_0x00d7;
                case -446750353: goto L_0x00e0;
                case -444918457: goto L_0x00e9;
                case -420332607: goto L_0x00f2;
                case 323144738: goto L_0x00fb;
                case 446723834: goto L_0x0105;
                case 498533133: goto L_0x010f;
                case 653022696: goto L_0x0119;
                case 659030007: goto L_0x0123;
                case 663545635: goto L_0x012d;
                case 713969956: goto L_0x0137;
                case 714204858: goto L_0x0141;
                case 826222930: goto L_0x0149;
                case 946725162: goto L_0x0073;
                case 1574018455: goto L_0x00a1;
                case 1973781842: goto L_0x00aa;
                default: goto L_0x008b;
            }
        L_0x008b:
            r4 = -1
            goto L_0x001c
        L_0x008d:
            java.lang.String r0 = "direct_v2_user_reaction"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.Integer r1 = r5.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4 = 40
            if (r1 != r0) goto L_0x001c
            r4 = 8001(0x1f41, float:1.1212E-41)
            goto L_0x001c
        L_0x00a1:
            java.lang.String r0 = "direct_v2_media_share"
            boolean r0 = r1.equals(r0)
            r4 = 34
            goto L_0x007b
        L_0x00aa:
            java.lang.String r0 = "direct_v2_ar_effect_share"
            boolean r0 = r1.equals(r0)
            r4 = 853(0x355, float:1.195E-42)
            goto L_0x007b
        L_0x00b3:
            java.lang.String r0 = "direct_v2_note_reply"
            boolean r0 = r1.equals(r0)
            r4 = 862(0x35e, float:1.208E-42)
            goto L_0x007b
        L_0x00bc:
            java.lang.String r0 = "direct_v2_clips_share"
            boolean r0 = r1.equals(r0)
            r4 = 896(0x380, float:1.256E-42)
            goto L_0x007b
        L_0x00c5:
            java.lang.String r0 = "direct_v2_sticker"
            boolean r0 = r1.equals(r0)
            r4 = 873(0x369, float:1.223E-42)
            goto L_0x007b
        L_0x00ce:
            java.lang.String r0 = "direct_v2_gif"
            boolean r0 = r1.equals(r0)
            r4 = 872(0x368, float:1.222E-42)
            goto L_0x007b
        L_0x00d7:
            java.lang.String r0 = "direct_v2_profile_share"
            boolean r0 = r1.equals(r0)
            r4 = 863(0x35f, float:1.21E-42)
            goto L_0x007b
        L_0x00e0:
            java.lang.String r0 = "direct_v2_gift_text"
            boolean r0 = r1.equals(r0)
            r4 = 963(0x3c3, float:1.35E-42)
            goto L_0x007b
        L_0x00e9:
            java.lang.String r0 = "direct_v2_reel_share"
            boolean r0 = r1.equals(r0)
            r4 = 1002(0x3ea, float:1.404E-42)
            goto L_0x007b
        L_0x00f2:
            java.lang.String r0 = "direct_v2_reel_reaction"
            boolean r0 = r1.equals(r0)
            r4 = 135(0x87, float:1.89E-43)
            goto L_0x007b
        L_0x00fb:
            java.lang.String r0 = "direct_v2_location_share"
            boolean r0 = r1.equals(r0)
            r4 = 861(0x35d, float:1.207E-42)
            goto L_0x007b
        L_0x0105:
            java.lang.String r0 = "direct_v2_delete_item"
            boolean r0 = r1.equals(r0)
            r4 = 205(0xcd, float:2.87E-43)
            goto L_0x007b
        L_0x010f:
            java.lang.String r0 = "direct_v2_voice_message"
            boolean r0 = r1.equals(r0)
            r4 = 867(0x363, float:1.215E-42)
            goto L_0x007b
        L_0x0119:
            java.lang.String r0 = "direct_v2_story_share"
            boolean r0 = r1.equals(r0)
            r4 = 866(0x362, float:1.214E-42)
            goto L_0x007b
        L_0x0123:
            java.lang.String r0 = "direct_v2_media"
            boolean r0 = r1.equals(r0)
            r4 = 33
            goto L_0x007b
        L_0x012d:
            java.lang.String r0 = "direct_v2_raven"
            boolean r0 = r1.equals(r0)
            r4 = 37
            goto L_0x007b
        L_0x0137:
            java.lang.String r0 = "direct_v2_like"
            boolean r0 = r1.equals(r0)
            r4 = 31
            goto L_0x007b
        L_0x0141:
            java.lang.String r0 = "direct_v2_text"
            boolean r0 = r1.equals(r0)
            goto L_0x007b
        L_0x0149:
            java.lang.String r0 = "direct_v2_reel_mention"
            boolean r0 = r1.equals(r0)
            r4 = 38
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70842ONt.A03():java.lang.String");
    }
}
