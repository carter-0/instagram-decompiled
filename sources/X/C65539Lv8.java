package X;

import android.content.Context;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;

/* renamed from: X.Lv8  reason: case insensitive filesystem */
public final class C65539Lv8 implements MU6 {
    public final Context A00;
    public final UserSession A01;

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r12) {
        String str;
        Object obj;
        Object obj2;
        Object obj3;
        String str2;
        String str3;
        String str4;
        AnonymousClass3Q2 r5 = lp8.A0D;
        MediaUploadMetadata mediaUploadMetadata = r5.A13;
        String str5 = null;
        if (mediaUploadMetadata.A03 != null) {
            String str6 = mediaUploadMetadata.A0A;
            if (str6 == null || str6.length() == 0) {
                int ordinal = r5.A1G.ordinal();
                String str7 = "";
                if (ordinal == 1) {
                    ClipInfo clipInfo = (ClipInfo) 00k.A0J(r5.A4G);
                    if (!(clipInfo == null || (str3 = clipInfo.A0F) == null || clipInfo.A0O)) {
                        str7 = C59737JVv.A03(str3);
                    }
                } else if (ordinal == 0 && (str4 = r5.A3L) != null) {
                    str7 = C364678lo.A05(str4);
                }
                mediaUploadMetadata.A0A = str7;
            }
            if (0qQ.A0K(r5.A13.A03, "com.facebook.hammerhead.story_camera")) {
                r5.A13.A03 = "com.facebook.hammerhead";
            }
            MediaUploadMetadata mediaUploadMetadata2 = r5.A13;
            if (mediaUploadMetadata2.A05 == null) {
                C62948Kp0 A012 = C59737JVv.A01(this.A01, mediaUploadMetadata2.A03, 0sn.A00);
                if (A012 != null) {
                    str5 = A012.A02();
                }
                mediaUploadMetadata2.A05 = str5;
            }
            String str8 = r5.A13.A06;
            if ((str8 != null && 00l.A0d(str8, "com.facebook.stella", false)) || ((str2 = r5.A13.A06) != null && 00l.A0d(str2, "com.facebook.mwa.ai", false))) {
                r5.A0K = 110;
            }
            return C62012KVl.A00;
        }
        try {
            int ordinal2 = r5.A1G.ordinal();
            String str9 = "";
            if (ordinal2 == 1) {
                ClipInfo clipInfo2 = (ClipInfo) 00k.A0J(r5.A4G);
                if (clipInfo2 == null || (str = clipInfo2.A0F) == null || clipInfo2.A0O) {
                    return C62012KVl.A00;
                }
                C62948Kp0 A002 = C59737JVv.A00(this.A00, this.A01, str, false);
                MediaUploadMetadata mediaUploadMetadata3 = r5.A13;
                if (A002 != null) {
                    str9 = A002.A01();
                }
                mediaUploadMetadata3.A03 = str9;
                if (A002 instanceof C62157KbF) {
                    r5.A0f(C391429sz.A0W);
                }
                MediaUploadMetadata mediaUploadMetadata4 = r5.A13;
                if (mediaUploadMetadata4.A0A == null) {
                    mediaUploadMetadata4.A0A = C59737JVv.A03(str);
                }
                MediaUploadMetadata mediaUploadMetadata5 = r5.A13;
                if (mediaUploadMetadata5.A05 == null) {
                    if (A002 != null) {
                        str5 = A002.A02();
                    }
                    mediaUploadMetadata5.A05 = str5;
                }
                return C62013KVm.A00;
            } else if (ordinal2 != 0) {
                return C62012KVl.A00;
            } else {
                String str10 = r5.A3L;
                if (str10 == null) {
                    return C62012KVl.A00;
                }
                UserSession userSession = this.A01;
                HashMap hashMap = r5.A44;
                if (hashMap != null) {
                    obj = hashMap.get("maker_note");
                } else {
                    obj = null;
                }
                String str11 = (String) obj;
                if (hashMap != null) {
                    obj2 = hashMap.get("image_description");
                } else {
                    obj2 = null;
                }
                String str12 = (String) obj2;
                if (hashMap != null) {
                    obj3 = hashMap.get(AnonymousClass000.A00(1155));
                } else {
                    obj3 = null;
                }
                String[] strArr = {str11, str12, (String) obj3};
                0qQ.A0B(strArr, 0);
                C62948Kp0 A013 = C59737JVv.A01(userSession, str9, 03t.A0I(strArr));
                MediaUploadMetadata mediaUploadMetadata6 = r5.A13;
                if (A013 != null) {
                    str9 = A013.A01();
                }
                mediaUploadMetadata6.A03 = str9;
                if (A013 instanceof C62157KbF) {
                    r5.A0f(C391429sz.A0W);
                }
                MediaUploadMetadata mediaUploadMetadata7 = r5.A13;
                if (mediaUploadMetadata7.A0A == null) {
                    mediaUploadMetadata7.A0A = C364678lo.A05(str10);
                }
                MediaUploadMetadata mediaUploadMetadata8 = r5.A13;
                if (mediaUploadMetadata8.A05 == null) {
                    if (A013 != null) {
                        str5 = A013.A02();
                    }
                    mediaUploadMetadata8.A05 = str5;
                }
                return C62013KVm.A00;
            }
        } catch (Exception e) {
            0KC.A0F("PendingMediaAppAttributionStepException", "exception occurred when extracting metadata", e);
            return C62012KVl.A00;
        }
    }

    public final String getName() {
        return "PendingMediaAppAttribution";
    }

    public C65539Lv8(Context context, UserSession userSession) {
        this.A00 = context;
        this.A01 = userSession;
    }
}
