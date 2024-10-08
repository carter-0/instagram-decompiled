package X;

import android.content.Context;
import com.instagram.api.schemas.AttributionUser;
import com.instagram.feed.media.CameraToolInfoIntf;
import com.instagram.feed.media.CreativeConfig;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.feed.media.EffectPreview;
import com.instagram.feed.media.EffectPreviewIntf;
import com.instagram.model.shopping.EffectThumbnailImageDictIntf;
import com.instagram.model.shopping.ProductItemWithARIntf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5Nt  reason: invalid class name and case insensitive filesystem */
public abstract class C284745Nt {
    public static final CreativeConfig A01(CreativeConfigIntf creativeConfigIntf, String str, boolean z) {
        ArrayList arrayList;
        0qQ.A0B(creativeConfigIntf, 0);
        List<EffectPreviewIntf> B02 = creativeConfigIntf.B02();
        if (B02 != null) {
            arrayList = new ArrayList(0Yv.A1E(B02, 10));
            for (EffectPreviewIntf effectPreviewIntf : B02) {
                if (0qQ.A0K(str, effectPreviewIntf.getId())) {
                    effectPreviewIntf = DDx.A01(effectPreviewIntf, z);
                }
                arrayList.add(effectPreviewIntf);
            }
        } else {
            arrayList = null;
        }
        AttributionUser AdD = creativeConfigIntf.AdD();
        List Ajq = creativeConfigIntf.Ajq();
        String captureType = creativeConfigIntf.getCaptureType();
        List AsN = creativeConfigIntf.AsN();
        String Ayr = creativeConfigIntf.Ayr();
        String Ays = creativeConfigIntf.Ays();
        creativeConfigIntf.B02();
        return C44733Ck1.A00(AdD, creativeConfigIntf.B0A(), creativeConfigIntf.B0B(), captureType, Ayr, Ays, creativeConfigIntf.B30(), creativeConfigIntf.B3W(), creativeConfigIntf.getFailureReason(), creativeConfigIntf.B7Y(), creativeConfigIntf.Bbn(), Ajq, AsN, arrayList, creativeConfigIntf.B92());
    }

    public static final boolean A08(Context context, CreativeConfigIntf creativeConfigIntf) {
        AttributionUser attributionUser;
        String str;
        StringBuilder sb;
        String captureType;
        String str2;
        EffectThumbnailImageDictIntf C6y;
        String B3W;
        if (creativeConfigIntf.AdD() == null && creativeConfigIntf.B0A() == null) {
            str = "CreativeConfig";
            sb = new StringBuilder();
            str2 = "Attribution invalid due to missing top level attribution user and effect preview for effect ID: ";
        } else {
            EffectPreviewIntf B0A = creativeConfigIntf.B0A();
            if ((B0A == null || (attributionUser = B0A.AdD()) == null) && (attributionUser = creativeConfigIntf.AdD()) == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user for effect ID: ";
            } else if (attributionUser.getUsername() == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user name for effect ID: ";
            } else if (attributionUser.getInstagramUserId() == null) {
                str = "CreativeConfig";
                sb = new StringBuilder();
                str2 = "Attribution invalid due to missing attribution user ID for effect ID: ";
            } else {
                if ((!A0B(creativeConfigIntf, C306106Ku.HANDS_FREE) || (B3W = creativeConfigIntf.B3W()) == null || B3W.length() == 0) && ((!A0B(creativeConfigIntf, C306106Ku.DUAL) || !C3495180r.A01(context)) && !A0B(creativeConfigIntf, C306106Ku.BOOMERANG, C306106Ku.LAYOUT))) {
                    String B3W2 = creativeConfigIntf.B3W();
                    if (B3W2 == null || B3W2.length() == 0) {
                        str = "CreativeConfig";
                        sb = new StringBuilder();
                        sb.append("Attribution invalid due to missing effect ID. Capture Type: ");
                        captureType = creativeConfigIntf.getCaptureType();
                        sb.append(captureType);
                        0wb.A03(str, sb.toString());
                        return false;
                    } else if (creativeConfigIntf.B0A() == null) {
                        str = "CreativeConfig";
                        sb = new StringBuilder();
                        str2 = "Effect invalid due to missing effect name for effect ID: ";
                    } else {
                        EffectPreviewIntf B0A2 = creativeConfigIntf.B0A();
                        if (B0A2 == null || (C6y = B0A2.C6y()) == null || C6y.CCI() == null) {
                            str = "CreativeConfig";
                            sb = new StringBuilder();
                            str2 = "Attribution invalid due to missing thumbnail image for effect ID: ";
                        }
                    }
                }
                return true;
            }
        }
        sb.append(str2);
        captureType = creativeConfigIntf.B3W();
        sb.append(captureType);
        0wb.A03(str, sb.toString());
        return false;
    }

    public static final boolean A0B(CreativeConfigIntf creativeConfigIntf, C306106Ku... r7) {
        for (C306106Ku r0 : r7) {
            if (0qQ.A0K(r0.A00, creativeConfigIntf.getCaptureType())) {
                return true;
            }
        }
        return false;
    }

    public static final C306106Ku A03(CreativeConfigIntf creativeConfigIntf) {
        return C306106Ku.A01.A00(creativeConfigIntf.getCaptureType());
    }

    public static final List A07(Context context, CreativeConfigIntf creativeConfigIntf) {
        HashSet hashSet = new HashSet();
        List<String> Ajq = creativeConfigIntf.Ajq();
        if (Ajq != null) {
            ArrayList arrayList = new ArrayList();
            for (String A00 : Ajq) {
                GNW A002 = GNJ.A00(context, A00);
                if (A002 != null) {
                    arrayList.add(A002);
                }
            }
            hashSet.addAll(00k.A0j(arrayList));
        }
        List<CameraToolInfoIntf> AsN = creativeConfigIntf.AsN();
        if (AsN != null) {
            ArrayList arrayList2 = new ArrayList();
            for (CameraToolInfoIntf Ajp : AsN) {
                GNW A003 = GNJ.A00(context, Ajp.Ajp().A00);
                if (A003 != null) {
                    arrayList2.add(A003);
                }
            }
            hashSet.addAll(00k.A0k(arrayList2));
        }
        return 00k.A0a(hashSet);
    }

    public static final boolean A0A(CreativeConfigIntf creativeConfigIntf) {
        return A0B(creativeConfigIntf, C306106Ku.SUPERZOOM, C306106Ku.SUPERZOOM_V3, C306106Ku.FOCUS);
    }

    public static final C347087wF A00(CreativeConfigIntf creativeConfigIntf) {
        if (A03(creativeConfigIntf) != C306106Ku.LAYOUT) {
            return null;
        }
        C347087wF r0 = C347087wF.A0I;
        String B7Y = creativeConfigIntf.B7Y();
        if (B7Y == null) {
            return null;
        }
        for (C347087wF r4 : C347087wF.values()) {
            if (0qQ.A0K(r4.A05, B7Y)) {
                return r4;
            }
        }
        return C347087wF.A0I;
    }

    public static final CreativeConfig A02(CreativeConfigIntf creativeConfigIntf, boolean z) {
        EffectPreview effectPreview;
        AttributionUser AdD = creativeConfigIntf.AdD();
        List Ajq = creativeConfigIntf.Ajq();
        String captureType = creativeConfigIntf.getCaptureType();
        List AsN = creativeConfigIntf.AsN();
        String Ayr = creativeConfigIntf.Ayr();
        String Ays = creativeConfigIntf.Ays();
        List B02 = creativeConfigIntf.B02();
        creativeConfigIntf.B0A();
        ProductItemWithARIntf B0B = creativeConfigIntf.B0B();
        String B30 = creativeConfigIntf.B30();
        String B3W = creativeConfigIntf.B3W();
        String failureReason = creativeConfigIntf.getFailureReason();
        String B7Y = creativeConfigIntf.B7Y();
        List B92 = creativeConfigIntf.B92();
        String Bbn = creativeConfigIntf.Bbn();
        EffectPreviewIntf B0A = creativeConfigIntf.B0A();
        if (B0A != null) {
            effectPreview = DDx.A01(B0A, z);
        } else {
            effectPreview = null;
        }
        return C44733Ck1.A00(AdD, effectPreview, B0B, captureType, Ayr, Ays, B30, B3W, failureReason, B7Y, Bbn, Ajq, AsN, B02, B92);
    }

    public static final C62622Kit A04(CreativeConfigIntf creativeConfigIntf) {
        String Awu;
        EffectPreviewIntf B0A = creativeConfigIntf.B0A();
        if (B0A == null || (Awu = B0A.Awu()) == null) {
            return null;
        }
        return C62622Kit.valueOf(Awu);
    }

    public static final String A05(CreativeConfigIntf creativeConfigIntf) {
        AttributionUser attributionUser;
        EffectPreviewIntf B0A = creativeConfigIntf.B0A();
        if ((B0A == null || (attributionUser = B0A.AdD()) == null) && (attributionUser = creativeConfigIntf.AdD()) == null) {
            return null;
        }
        return attributionUser.getInstagramUserId();
    }

    public static final String A06(CreativeConfigIntf creativeConfigIntf) {
        AttributionUser attributionUser;
        EffectPreviewIntf B0A = creativeConfigIntf.B0A();
        if ((B0A == null || (attributionUser = B0A.AdD()) == null) && (attributionUser = creativeConfigIntf.AdD()) == null) {
            return null;
        }
        return attributionUser.getUsername();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r2.isEmpty() != false) goto L_0x0030;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A09(com.instagram.feed.media.CreativeConfigIntf r2) {
        /*
            java.util.List r0 = r2.B92()
            if (r0 == 0) goto L_0x0030
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r0.iterator()
        L_0x000f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0029
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.GenAIToolInfoDictIntf r0 = (com.instagram.api.schemas.GenAIToolInfoDictIntf) r0
            com.instagram.api.schemas.CameraTool r0 = r0.C8A()
            X.JZd r0 = X.C59808JZc.A00(r0)
            if (r0 == 0) goto L_0x000f
            r2.add(r0)
            goto L_0x000f
        L_0x0029:
            boolean r1 = r2.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0030:
            r0 = 1
        L_0x0031:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C284745Nt.A09(com.instagram.feed.media.CreativeConfigIntf):boolean");
    }
}
