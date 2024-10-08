package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.io.IOException;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.O0h  reason: case insensitive filesystem */
public abstract class C70277O0h {
    public static C70826OMy parseFromJson(16F r8) {
        Throwable A0z;
        Integer num;
        String str;
        0qQ.A0B(r8, 0);
        try {
            C70826OMy oMy = new C70826OMy();
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            while (r8.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r8);
                if ("hcm_type".equals(A17)) {
                    String A1Q = r8.A1Q();
                    0qQ.A0B(A1Q, 0);
                    Integer[] A00 = AnonymousClass05K.A00(8);
                    int length = A00.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            num = A00[i];
                            switch (num.intValue()) {
                                case 1:
                                    str = MediaStreamTrack.AUDIO_TRACK_KIND;
                                    break;
                                case 2:
                                    str = "meta_ai";
                                    break;
                                case 3:
                                    str = "places";
                                    break;
                                case 4:
                                    str = "reels_trends";
                                    break;
                                case 5:
                                    str = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
                                    break;
                                case 6:
                                    str = "threads";
                                    break;
                                case 7:
                                    str = "unknown";
                                    break;
                                default:
                                    str = "account";
                                    break;
                            }
                            if (!str.equals(A1Q)) {
                                i++;
                            }
                        } else {
                            num = AnonymousClass05K.A15;
                        }
                    }
                    oMy.A02 = num;
                } else {
                    ArrayList arrayList = null;
                    if ("header".equals(A17)) {
                        String A0l = AnonymousClass7TG.A0l(r8);
                        0qQ.A0B(A0l, 0);
                        oMy.A03 = A0l;
                    } else if ("subheader".equals(A17)) {
                        oMy.A06 = AnonymousClass7TG.A0l(r8);
                    } else if ("subtext".equals(A17)) {
                        oMy.A07 = AnonymousClass7TG.A0l(r8);
                    } else if ("thumbnail".equals(A17)) {
                        oMy.A01 = C70276O0g.parseFromJson(r8);
                    } else if ("metadata".equals(A17)) {
                        C70791OLm parseFromJson = C70275O0f.parseFromJson(r8);
                        0qQ.A0B(parseFromJson, 0);
                        oMy.A00 = parseFromJson;
                    } else if ("preview_images".equals(A17)) {
                        if (r8.A11() == 16L.A0C) {
                            arrayList = AnonymousClass7TE.A1C();
                            while (r8.A1J() != 16L.A08) {
                                1Xj A002 = 1Xj.A00(r8);
                                if (A002 != null) {
                                    arrayList.add(A002);
                                }
                            }
                        }
                        oMy.A08 = arrayList;
                    } else if ("query".equals(A17)) {
                        String A0l2 = AnonymousClass7TG.A0l(r8);
                        0qQ.A0B(A0l2, 0);
                        oMy.A05 = A0l2;
                    }
                }
                r8.A0z();
            }
            switch (oMy.A01().intValue()) {
                case 0:
                    if (oMy.A00().A00 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                case 1:
                    C70791OLm A003 = oMy.A00();
                    if (A003.A01 == null && A003.A04 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                    break;
                case 2:
                case 7:
                    return oMy;
                case 3:
                    if (oMy.A00().A02 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                case 4:
                    if (oMy.A00().A07 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                case 5:
                    if (oMy.A00().A06 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                case 6:
                    if (oMy.A08 == null) {
                        A0z = AnonymousClass7TE.A0z("Required value was null.");
                        break;
                    } else {
                        return oMy;
                    }
                default:
                    A0z = AnonymousClass7TE.A1K();
                    break;
            }
            throw A0z;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
